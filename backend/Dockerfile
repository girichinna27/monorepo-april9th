FROM python:3.9-slim

WORKDIR /app

# Create libs directory
RUN mkdir -p /app/libs

# Copy JARs for use in the application
COPY api-lib/target/api-lib-2.0.0.jar /app/libs/
COPY core-utils/target/core-utils-1.5.0.jar /app/libs/

# Copy application files
COPY app.py requirements.txt ./

# Install dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Command to run
CMD ["python", "app.py"]
