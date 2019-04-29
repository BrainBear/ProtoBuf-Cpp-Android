//
// Created by canxiong lian on 2019-04-28.
//

#include <jni.h>
#include <string>
#include "log.h"
#include "test.pb.h"


extern "C" JNIEXPORT jstring JNICALL
Java_me_brainbear_lite_Lite_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";



    Test test;
    test.add_v1(1);
    test.add_v1(2);
    test.add_v1(3);
    test.add_v1(3);

    std::string str = test.SerializeAsString();

    Test test1;
    test1.ParseFromString(str);

    LOGI("%d", test1.v1(0));
    LOGI("%d", test1.v1(1));
    LOGI("%d", test1.v1(2));
    LOGI("%d", test1.v1(3));

    return env->NewStringUTF(hello.c_str());
}

