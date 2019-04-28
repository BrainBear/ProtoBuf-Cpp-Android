# Sets the minimum version of CMake required to build your native library.
# This ensures that a certain set of CMake features is available to
# your build.

cmake_minimum_required(VERSION 3.4.1)

# Specifies a library name, specifies whether the library is STATIC or
# SHARED, and provides relative paths to the source code. You can
# define multiple libraries by adding multiple add.library() commands,
# and CMake builds them for you. When you build your app, Gradle
# automatically packages shared libraries with your APK.

find_library(
        log-lib
        log)

add_library( # Specifies the name of the library.
             nano-lib

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/native-lib.cpp
             src/main/cpp/pb_common.c
             src/main/cpp/pb_decode.c
             src/main/cpp/pb_encode.c
             src/main/cpp/simple.pb.c

        )

target_link_libraries(
        nano-lib

        ${log-lib})