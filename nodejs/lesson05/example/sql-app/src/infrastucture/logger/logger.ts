import winston from 'winston';

const myFormat = winston.format.printf(({ level, message, timestamp }) => {
    return `${level}:[${timestamp}] ${message}`;
});

const createLogger = (logLevel: string, filename: string): winston.Logger => {
    return winston.createLogger({
        level: logLevel,
        format: winston.format.combine(
            winston.format.timestamp({ format: "DD/MMM/YYYY:HH:mm:ss ZZ" }),
            myFormat
        ),
        transports: [
            new winston.transports.File({ filename, level: 'error' }),
            new winston.transports.Console(),
        ],
    });
};

const getLogger = (env: string): winston.Logger => {
    if (env === 'production') {
        return createLogger('info', 'combined.log');
    } else {
        return createLogger('debug', 'error.log');
    }
};

const logger = getLogger(process.env.NODE_ENV || 'development');

export default logger;
