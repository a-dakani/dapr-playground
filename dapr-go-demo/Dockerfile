# Use the official Go image as the base image
FROM golang:latest

# Set the working directory inside the container
WORKDIR /app

# Copy the Go source code and go.mod/go.sum into the container
COPY . ./

# Build the Go program inside the container
RUN go build -o app .

# Expose the port your Go program will listen on
EXPOSE 8080

# Command to run the Go program
CMD ["./app"]
