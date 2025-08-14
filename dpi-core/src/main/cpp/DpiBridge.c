#include <jni.h>
#include <stdint.h>
#include "dpi.h"          // from GoodByeDPI

JNIEXPORT jint JNICALL
Java_org_bypassgram_dpi_DpiBridge_init(JNIEnv* env, jobject thiz, jint mtu) {
    return dpi_init(mtu);
}

JNIEXPORT jint JNICALL
Java_org_bypassgram_dpi_DpiBridge_process(JNIEnv* env, jobject thiz,
                                          jbyteArray packet) {
    jbyte* buf = (*env)->GetByteArrayElements(env, packet, NULL);
    jint   len = (*env)->GetArrayLength(env, packet);
    int    res = dpi_process((uint8_t*)buf, len);
    (*env)->ReleaseByteArrayElements(env, packet, buf, 0);
    return res;
}
