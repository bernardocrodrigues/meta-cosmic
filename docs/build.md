
### Build Guide

1. Install the dependencies. 
   - [Docker](https://docs.docker.com/install/)
   - [Repo](https://source.android.com/setup/build/downloading)

2. Clone the build scripts.

```shell
git clone git@github.com:bernardocrodrigues/cosmic-utils.git cosmic
cd cosmic;
```

3. Run `setup` script. This will download all Yocto related source files and a Docker container in which you perform the build. All dependencies are preinstalled.

```shell
./setup
```

4. Run `enter_build_env` script. This will start a container, mount your home directory inside it and get you in a bash session. This way, your built files will persist even if the container is removed.

```
./enter_build_env
```

5. Start Yocto.  This will create a build folder and populate it with some config files.

```
cd src/yocto
source oe-init-build-env ../build
```

6. Substitute the files located in `build/conf/local.conf` and `build/conf/bblayers.conf` with the ones you cloned in step 1. Change the value of `HOST_CORE_COUNT` on `build/conf/local.conf` to the value that best suits your computer.
7. Build it!

```
bitbake cosmic-base-image
```
