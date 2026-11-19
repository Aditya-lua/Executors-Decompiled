/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1aeb4
 */

char * OSSL_HTTP_adapt_proxy(char *param_1,char *param_2,char *param_3,int param_4)

{
  size_t sVar1;
  char *pcVar2;
  
  if (param_1 == (char *)0x0) {
    pcVar2 = "http_proxy";
    if (param_4 != 0) {
      pcVar2 = "https_proxy";
    }
    param_1 = (char *)ossl_safe_getenv(pcVar2);
    if (param_1 == (char *)0x0) {
      pcVar2 = "HTTPS_PROXY";
      if (param_4 != 0) {
        pcVar2 = "HTTP_PROXY";
      }
      param_1 = (char *)ossl_safe_getenv(pcVar2);
      if (param_1 == (char *)0x0) {
        return (char *)0x0;
      }
    }
  }
  if (param_3 == (char *)0x0) {
LAB_00b1afd4:
    pcVar2 = (char *)0x0;
  }
  else {
    pcVar2 = (char *)0x0;
    if (*param_1 != '\0') {
      sVar1 = strlen(param_3);
      if (((param_2 != (char *)0x0) ||
          (param_2 = (char *)ossl_safe_getenv("no_proxy"), param_2 != (char *)0x0)) ||
         (param_2 = (char *)ossl_safe_getenv("NO_PROXY"), param_2 != (char *)0x0)) {
        for (pcVar2 = strstr(param_2,param_3); pcVar2 != (char *)0x0;
            pcVar2 = strstr(pcVar2 + 1,param_3)) {
          if ((((pcVar2 == param_2) || (pcVar2[-1] == ',')) || (pcVar2[-1] == ' ')) &&
             (((byte)pcVar2[sVar1] < 0x2d &&
              ((1L << ((ulong)(byte)pcVar2[sVar1] & 0x3f) & 0x100100000001U) != 0))))
          goto LAB_00b1afd4;
        }
      }
      pcVar2 = param_1;
    }
  }
  return pcVar2;
}

