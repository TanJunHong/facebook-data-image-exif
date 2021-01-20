# facebook-data-image-exif

Instructions can be found [here](https://addshore.com/2020/04/add-exif-data-back-to-facebook-images-0-10/)

Downloads can be found on [the releases page!](https://github.com/addshore/facebook-data-image-exif/releases)

**Old blog posts**

This tool (in a PHP form) was [originally created in 2016](https://addshore.com/2016/09/add-exif-data-back-to-facebook-images/).

It was [converted to Java in 2018](https://addshore.com/2019/02/add-exif-data-back-to-facebook-images-0-1/)

And then most recently updated [in 2020](https://addshore.com/2020/04/add-exif-data-back-to-facebook-images-0-10/)

## Building

You need JDK 11

```sh
sudo apt-get install openjdk-11-jdk
```

And to use it:

```sh
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/ mvn clean package
```