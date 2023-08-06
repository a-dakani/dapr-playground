# Use the official Node.js image as the base image
FROM node:14

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json (or yarn.lock) into the container
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application code into the container
COPY . .

# Expose the port your Node.js server will listen on (make sure it matches the server's listening port)
EXPOSE 3000

# Command to start your Node.js Express server
CMD ["npm", "start"]