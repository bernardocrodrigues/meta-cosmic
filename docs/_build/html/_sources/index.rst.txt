
.. image:: https://static.wixstatic.com/media/7afe00_c2973638efb646159e16b380c23dfe52~mv2.jpg/v1/fill/w_1423,h_229/banner.jpg

.. image:: https://img.shields.io/github/v/release/bernardocrodrigues/meta-cosmic 
.. image:: https://img.shields.io/github/license/bernardocrodrigues/meta-cosmic 
.. image:: https://img.shields.io/github/downloads/bernardocrodrigues/meta-cosmic/total
.. image:: https://img.shields.io/github/issues/bernardocrodrigues/meta-cosmic
.. image:: https://readthedocs.org/projects/meta-cosmic/badge/?version=latest

------------


What it is
===========

**CosmicOS** is a lightweight Linux Distribution that ships a customized sandbox tuned for distributed computing and cloud applications. 

Taking influence on `CoreOS <https://coreos.com>`_, CosmicOS tries to implement the concept of "Container Linux" in a acessible way by targeting embedded devices, such as the Raspberry Pi. Seting up a cluster of Pis is cheaper than doing the same with Intels or AMDs after all.

Containerized applications on embedded devices are also becoming a trend thanks to the benefits of fast time-to-market, high decoupling and reproductibility.



Its features
======================

- **Yocto compatible** - CosmicOS is built completely from source using the latest branch (warrior) of the `Yocto framework <https://www.yoctoproject.org>`_. Clone, customize and build it yourself.
- **Based on the Angstrom Distribution** - Supporting everything from toasters to servers.
- **Lightweight** - Core elements take only 400mb of storage and 80mb of RAM.
- **Docker Container Engine** - CosmicOS ships with the world most popular container runtime.
- **Python** - Native Python support.

Supported devices
==================
CosmicOS is scripted within Yocto, so you could potentially build it to any target discribed in Yocto's BSPs. However, the only targets currently being tested are:

- Raspberry Pi 3

If you manage to build it for something else, please let me know and I'll mention it here.

Try it
=======

1. Download the latest release

Build it
=========

Building and customizing CosmicOS is really easy thanks to the Yocto framework. Check the build guides for more information about it.

.. toctree::
   :glob:

   build
   changelog

Contributing
============

.. toctree::
   :glob:

   contrib
   coc