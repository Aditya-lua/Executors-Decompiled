/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a833e8
 */

char * OpenSSL_version(undefined4 param_1)

{
  char *pcVar1;
  long lVar2;
  
  pcVar1 = "OpenSSL 3.0.14 4 Jun 2024";
  switch(param_1) {
  case 0:
    break;
  case 1:
    return 
    "compiler: /home/z/my-project/build/android-ndk-r18b/toolchains/llvm/prebuilt/linux-x86_64/bin/clang --target=aarch64-linux-android --sysroot=/home/z/my-project/build/android-ndk-r18b/sysroot -D__ANDROID_API__=21 -fPIC -pthread  -target aarch64-linux-android -gcc-toolchain /home/z/my-project/build/android-ndk-r18b/toolchains/aarch64-linux-android-4.9/prebuilt/linux-x86_64 --sysroot=/home/z/my-project/build/android-ndk-r18b/platforms/android-21/arch-arm64 -fPIC -O2 -DNDEBUG -fPIC -O2 -DOPENSSL_USE_NODELETE -DOPENSSL_PIC -D__ANDROID_API__=21 -isystem /home/z/my-project/build/android-ndk-r18b/sysroot/usr/include/aarch64-linux-android -isystem /home/z/my-project/build/android-ndk-r18b/sysroot/usr/include -DOPENSSL_BUILDING_OPENSSL -DNDEBUG -D__ANDROID_API__=21 -DNDEBUG"
    ;
  case 2:
    return "built on: Sun Aug 23 14:41:47 2026 UTC";
  case 3:
    return "platform: android-arm64";
  case 4:
    return "OPENSSLDIR: \"/home/z/my-project/build/stage-arm64/etc/ssl\"";
  case 5:
    return "ENGINESDIR: \"/home/z/my-project/build/stage-arm64/lib/engines-3\"";
  case 6:
  case 7:
    return "3.0.14";
  case 8:
    return "MODULESDIR: \"/home/z/my-project/build/stage-arm64/lib/ossl-modules\"";
  case 9:
    lVar2 = OPENSSL_info(0x3f0);
    pcVar1 = "CPUINFO: N/A";
    if (lVar2 != 0) {
      pcVar1 = &ossl_cpu_info_str;
    }
    return pcVar1;
  default:
    pcVar1 = "not available";
  }
  return pcVar1;
}

