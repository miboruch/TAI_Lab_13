export const config = {
  port: process.env.PORT || 3000,
  // databaseUrl: process.env.MONGODB_URI || 'mongodb+srv://miboruch:asdasd123@cluster0-34q83.mongodb.net/test?retryWrites=true&w=majority',
  databaseUrl: process.env.MONGODB_URI || 'mongodb://tai:taitai1@ds147180.mlab.com:47180/tai',
  JwtSecret: 'ajuwhqywekqwe12'
};
