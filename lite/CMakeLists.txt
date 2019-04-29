cmake_minimum_required(VERSION 3.4.1)

include_directories(src/main/cpp/include)

find_library(
        log-lib
        log)



add_library(protobuf STATIC IMPORTED)
set_target_properties(protobuf PROPERTIES IMPORTED_LOCATION ${CMAKE_SOURCE_DIR}/libs/${ANDROID_ABI}/libprotobuf.a)

add_library( # Specifies the name of the library.
             lite-lib

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/native-lib.cpp
             src/main/cpp/test.pb.cc
        )

target_link_libraries(
        lite-lib
        protobuf

        ${log-lib})