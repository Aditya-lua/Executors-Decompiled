/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aea5b8
 */

char * OSSL_STORE_INFO_get1_NAME(int *param_1)

{
  char *pcVar1;
  undefined8 uVar2;
  
  if (*param_1 == 1) {
    pcVar1 = CRYPTO_strdup(*(char **)(param_1 + 2),"crypto/store/store_lib.c",0x28a);
    if (pcVar1 != (char *)0x0) {
      return pcVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x28d,"OSSL_STORE_INFO_get1_NAME");
    uVar2 = 0xc0100;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/store/store_lib.c",0x290,"OSSL_STORE_INFO_get1_NAME");
    uVar2 = 0x67;
  }
  ERR_set_error(0x2c,uVar2,0);
  return (char *)0x0;
}

