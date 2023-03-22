# High Level Vulnerabilities

This repository contains solutions to high level vulnerabilities in the WebGoat application. WebGoat is set up on Docker and Burp Suite is required to solve some of the tasks.

## Prerequisites

- Docker
- Burp Suite

## Setup

1. Clone this repository to your local machine

    ``` bash
    git clone https://github.com/JaWitold/high-level-vulnerabilities.git
    ```

2. Install Docker, Burp Suite
3. Run the following command in the terminal to start WebGoat on Docker:

    ``` bash
    docker run --name WebGoat -p 8081:8080 -p 9090:9090 -p 80:8888 -e TZ=Europe/Warsaw webgoat/goatandwolf:latest
    ```

4. Open a browser and navigate to <http://localhost:8081/WebGoat/>
5. Follow the instructions to complete the exercises and view the solutions in this repository.

## Solutions

The solutions for each exercise can be found in the corresponding folder. Each folder contains a README file with the vulnerability description and the steps to reproduce the vulnerability. It also includes a solution file with the steps to fix the vulnerability.

## Disclaimer

This repository is intended for educational purposes only. Do not use these techniques for illegal or unethical purposes. The author is not responsible for any harm caused by the misuse of this information.

### Author

Witold Karaś
