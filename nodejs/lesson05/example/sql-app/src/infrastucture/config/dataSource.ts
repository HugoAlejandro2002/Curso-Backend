import "reflect-metadata";
import { DataSource } from "typeorm";
import { UserEntity } from "../entities/user.entity";
import { db } from "./config";

export const AppDataSource = new DataSource({
    type: "mysql",
    host: db.host, 
    port: (process.env.DB_PORT || 3306) as number, 
    username: db.user, 
    password: db.pass, 
    database: db.database,
    synchronize: true,
    logging: false,
    entities: [UserEntity],
    subscribers: [],
    migrations: [],
});