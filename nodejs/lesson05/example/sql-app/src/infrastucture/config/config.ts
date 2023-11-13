import dotenv from 'dotenv';
dotenv.config();

export const env = {
    envPort: process.env.ENV_PORT || 3000,
    env: process.env.ENV || 'develop',
};

export const db = {
    host: process.env.DB_HOST || 'sql12.freemysqlhosting.net',
    user: process.env.DB_USER || 'sql12660640',
    database: process.env.DB_NAME || 'sql12660640',
    pass: process.env.DB_PASS || 'KBfWSwzZ95',
    port: process.env.DB_PORT || 3306,
}