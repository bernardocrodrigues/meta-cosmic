
.. image:: https://static.wixstatic.com/media/7afe00_c2973638efb646159e16b380c23dfe52~mv2.jpg/v1/fill/w_1423,h_229/banner.jpg

.. image:: https://img.shields.io/github/v/release/bernardocrodrigues/meta-cosmic?include_prereleases 
.. image:: https://img.shields.io/github/license/bernardocrodrigues/meta-cosmic 
.. image:: https://img.shields.io/github/issues/bernardocrodrigues/meta-cosmic
.. image:: https://readthedocs.org/projects/meta-cosmic/badge/?version=latest

**CosmicOS** is a lightweight Linux Distribution that ships a customized sandbox tuned for distributed computing and cloud applications. 


------------

**Download the latest release:** `v0.2.0 <https://github.com/bernardocrodrigues/meta-cosmic/releases/download/0.1.0/CosmicOS-0.1.0-raspberrypi3.rootfs.rpi-sdimg.tar.gz>`_  

Taking influence on `CoreOS <https://coreos.com>`_, CosmicOS tries to implement the concept of "Container Linux" but this time on embedded devices, such as the Raspberry Pi. Seting up a cluster of Pis is cheaper than doing the same with server grade systems after all. 

The ideia behind CosmicOS came from the lack of something that could help me study and prototype distributed applications with ease. Therefore, the goal here is mainly educational but feel free to try CosmicOS however you'd like.

Containerized applications on embedded devices are also becoming a trend thanks to the benefits of fast time-to-market, high decoupling and reproductibility.

Its features
======================

- **Docker Container Engine** - CosmicOS ships with the world most popular container runtime with all its tools.
- **Lightweight** - Core elements take only 400mb of storage. Aprox. 80% of that is thanks to Docker and Python.
- **Yocto compatible** - CosmicOS is built completely from source using the latest branch (warrior) of the `Yocto framework <https://www.yoctoproject.org>`_. Clone, customize and build it yourself.
- **Python** - Native Python 2 & 3 support.

Supported devices
==================
CosmicOS is scripted within Yocto, so you could potentially build it to any target discribed in as a Yocto BSPs. However, the only targets currently being tested are:

- Raspberry Pi 3

If you manage to build it for something else, please let me know and I'll mention it here.

Build it
=========

Building and customizing CosmicOS is really easy thanks to the Yocto framework. Check the build guides for more information about it.

.. toctree::
   :glob:

   build

Contributing
============

.. toctree::
   :glob:

   contrib
   coc
   changelog