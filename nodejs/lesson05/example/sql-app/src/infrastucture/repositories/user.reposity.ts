import { AppDataSource } from "../config/dataSource";
import { UserRepository } from './../../domain/interfaces/user.repository';
import { UserEntity } from './../entities/user.entity';
import { User } from './../../domain/models/User.model';
import logger from "../logger/logger";

export class UserRepositoryImpl implements UserRepository {
    async findById(id: string): Promise<User | null> {
        try {
            logger.debug(`Buscando usuario por ID: ${id}`);
            const userEntity = await AppDataSource.getRepository(UserEntity).findOneBy({ id });
            return userEntity ? new User(userEntity) : null;
        } catch (error) {
            logger.error(`Error en findById: ${error.message}`);
            throw error;
        }
    }

    async createUser(user: User): Promise<User> {
        try {
            logger.info('Creando nuevo usuario');
            const userEntity = AppDataSource.getRepository(UserEntity).create({
                username: user.username,
                email: user.email,
                passwordHash: user.passwordHash,
                createdAt: user.createdAt || new Date(),
                lastLogin: user.lastLogin || undefined,
                roleId: user.roleId
            });

            const userResponse = await AppDataSource.getRepository(UserEntity).save(userEntity);

            const createdUser = new User({
                id: userResponse.id,
                username: userResponse.username,
                email: userResponse.email,
                passwordHash: userResponse.passwordHash,
                createdAt: userResponse.createdAt,
                lastLogin: userResponse.lastLogin,
                roleId: userResponse.roleId
            });

            logger.debug(`Usuario creado: ${JSON.stringify(createdUser)}`);
            return createdUser;
        } catch (error) {
            logger.error(`Error en createUser: ${error.message}`);
            throw error; // Re-lanzar el error para que pueda ser manejado en la capa superior si es necesario.
        }
    }
}