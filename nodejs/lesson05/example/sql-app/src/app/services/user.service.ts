import { IUserEntity } from '../../domain/entities/IUserEntity';
import { User } from '../../domain/models/User.model';
import logger from '../../infrastucture/logger/logger';
import { CreateUserDTO } from '../dtos/create.user.dto';
import { UserDto } from '../dtos/user.dto';
import { UserRepository } from './../../domain/interfaces/user.repository';

export class UserService {
    constructor(private userRepository: UserRepository) { }

    async getUserById(id: string): Promise<UserDto | null> {
        try {
            logger.info(`Accediendo a getUserById con ID: ${id}`);
            const user = await this.userRepository.findById(id);

            if (!user) return null;

            const userResponse: UserDto = {
                id: user.id,
                username: user.username,
                email: user.email,
                lastLogin: user.lastLogin
            };
            return userResponse;
        } catch (error) {
            logger.error(`Error en getUserById: ${error.message}`);
            throw error;
        }
    }

    async createUser(userDto: CreateUserDTO): Promise<User> {
        try {
            logger.info(`Accediendo a createUser con DTO: ${JSON.stringify(userDto)}`);

            const userEntity: IUserEntity = {
                username: userDto.username,
                email: userDto.email,
                passwordHash: userDto.password,
                roleId: userDto.roleId,
                createdAt: new Date(),
                lastLogin: null,
            };

            const newUser = new User(userEntity);
            const createdUser = await this.userRepository.createUser(newUser);

            // if (debugMode) {
            //     logger.debug(`Usuario creado: ${JSON.stringify(createdUser)}`);
            // }

            return createdUser;
        } catch (error) {
            logger.error(`Error en createUser: ${error.message}`);
            throw error; // Re-lanzar el error para que pueda ser manejado en la capa superior si es necesario.
        }
    }
}