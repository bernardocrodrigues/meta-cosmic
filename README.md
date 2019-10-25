![CosmicOS](https://static.wixstatic.com/media/7afe00_45d0a07e27244bdfa1264e725a69f0c1~mv2.jpg/v1/fill/w_1804,h_273/cosmic_banner.jpg)

### What it is.

CosmicOS is a lightweight Linux Operating System that brings a customized distributed computing applications and Cloud environments for the Raspberry Pi. 

That's it, use CosmicOS to power your 

### What are its features.

- **Yocto compatible -** CosmicOS is built completely from source using the latest branch (warrior) of the [Yocto framework](https://www.yoctoproject.org). Clone, customize and build it yourself.
- **Based on the [Angstrom Distribution]([http://www.angstrom-distribution.org](http://www.angstrom-distribution.org/)) -** supporting everything from toasters to servers.
- **Lightweight** - Core elements take only 250MB of storage and 30mb of RAM.
- **Docker Container Engine** - CosmicOS ships with  

### Build it.

1. Install the dependencies. 

```
#Install Repo
mkdir ~/.bin
PATH=~/.bin:$PATH
curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo
chmod a+x ~/bin/repo

#Install Docker
sudo apt install docker-ce
```

2. Clone the build scripts.

```shell
mkdir cosmic; cd cosmic;
git clone git@github.com:bernardocrodrigues/cosmic-utils.git
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
cd src/poky
source oe-init-build-env ../build
```

6. Substitute the files located in `build/conf/local.conf` and `build/conf/bblayers.conf` with the ones you cloned in step 1. Change the value of `HOST_CORE_COUNT` on `build/conf/local.conf` to the value that best suits your computer.
7. Build it!

```
bitbake cosmic-base-image
```

### Changelog

- **v0.1.0** 
  - Linux Kernel x
  - Docker Container Engine x
  - Glibc x
  - Yocto 2.7 Warrior x
  - Python 2 &