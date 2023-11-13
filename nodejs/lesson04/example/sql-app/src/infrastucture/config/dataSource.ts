import "reflect-metadata";
import { DataSource } from "typeorm";
import { UserEntity } from "../entities/user.entity";

export const AppDataSource = new DataSource({
    type: "mysql",
    host: "sql12.freemysqlhosting.net",
    port: 3306,
    username: "sql12660640",
    password: "KBfWSwzZ95",
    database: "sql12660640",
    synchronize: true,
    logging: false,
    entities: [UserEntity],
    subscribers: [],
    migrations: [],
});