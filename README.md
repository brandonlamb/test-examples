# Example Tests

## Prerequisites

### Installed Software

* Virtual Machine [click here](https://www.virtualbox.org/wiki/Downloads)
  * Virtual Machine Extensions [click here](http://download.virtualbox.org/virtualbox/5.1.22/Oracle_VM_VirtualBox_Extension_Pack-5.1.22-115126.vbox-extpack)
* Docker Toolbox [click here](https://www.docker.com/products/docker-toolbox)
* Maven [click here](http://maven.apache.org)
* IDE of your choice
  * IntelliJ Idea
  * NetBeans
  * Eclipse
  
## Running the example

1. Fork the repository
1. Open the terminal
1. Start the docker toolbox
1. Run the following command:
  * ```> mvn clean test```



## Useful commands

List Images

```> docker images```

```> docker info```

```> docker ps```

Remove all images:

```> docker rmi $(docker images -q)```

Remove all non-running containers

docker container prune 

docker run -i -t 4a53e3274903 /bin/bash