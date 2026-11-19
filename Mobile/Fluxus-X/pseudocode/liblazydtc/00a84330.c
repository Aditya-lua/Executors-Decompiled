/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84330
 */

char * OPENSSL_info(undefined4 param_1)

{
  char *pcVar1;
  
  CRYPTO_THREAD_run_once(&DAT_00d21de8,&LAB_00a843e4);
  pcVar1 = "/home/z/my-project/build/stage-arm64/etc/ssl";
  switch(param_1) {
  case 0x3e9:
    break;
  case 0x3ea:
    pcVar1 = "/home/z/my-project/build/stage-arm64/lib/engines-3";
    break;
  case 0x3eb:
    pcVar1 = "/home/z/my-project/build/stage-arm64/lib/ossl-modules";
    break;
  case 0x3ec:
    pcVar1 = ".so";
    break;
  case 0x3ed:
    pcVar1 = "/";
    break;
  case 0x3ee:
    pcVar1 = ":";
    break;
  case 0x3ef:
    pcVar1 = DAT_00d21df0;
    break;
  case 0x3f0:
    if (ossl_cpu_info_str != '\0') {
      return &DAT_00d21d71;
    }
  default:
    pcVar1 = (char *)0x0;
  }
  return pcVar1;
}

