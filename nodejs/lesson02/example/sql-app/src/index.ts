import express, { Request, Response } from 'express';

const app = express();

const PORT = 3000;

app.get('/', (req: Request, res: Response) => {
    res.send('¡Hola Mundo cruel!!!');
});

app.listen(PORT, () => {
    console.log(`Servidor ejecutándose en http://localhost:${PORT}`);
});