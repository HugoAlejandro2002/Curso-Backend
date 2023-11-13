import { Request, Response, Router } from 'express';
import { UserService } from './../../app/services/user.service';
import { CreateUserDTO } from '../../app/dtos/create.user.dto';
import logger from '../../infrastucture/logger/logger';

export class UserController {
    public router: Router;
    private userService: UserService;

    constructor(userService: UserService) {
        this.userService = userService;
        this.router = Router();
        this.routes();
    }

    public async getUserById(req: Request, res: Response): Promise<void> {
        try {
            logger.info('Accediendo a getUserById');
            const { id } = req.params;
            const userDto = await this.userService.getUserById(id);
            
            if (!userDto) {
                res.status(404).json({ message: 'User not found' });
                return;
            }

            res.json(userDto);
        } catch (error) {
            logger.error(`Error en getUserById: ${error.message}`);
            res.status(500).json({ message: 'Internal Server Error' });
        }
    }

    public async createUser(req: Request, res: Response): Promise<Response> {
        try {
            logger.info('Accediendo a createUser');
            const userDto: CreateUserDTO = req.body;
            const user = await this.userService.createUser(userDto);
            return res.status(201).json(user);
        } catch (error) {
            logger.error(`Error en createUser: ${error.message}`);
            return res.status(400).json({ message: error.message });
        }
    }

    public routes() {
        this.router.get('/:id', this.getUserById.bind(this));
        this.router.post('/', this.createUser.bind(this));
    }
}
