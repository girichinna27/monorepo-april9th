# Use Alpine Linux as the base image
FROM alpine:latest

# Set the working directory
WORKDIR /app

# Copy application files (if any)
COPY . /app

# Install essential packages (optional)
RUN apk add --no-cache bash curl

# Define the default command
CMD ["sh"]
