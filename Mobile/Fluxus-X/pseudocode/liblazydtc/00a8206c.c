/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8206c
 */

long ossl_algorithm_get1_first_name(undefined8 *param_1)

{
  char *pcVar1;
  long lVar2;
  size_t sVar3;
  char *__s;
  
  __s = (char *)*param_1;
  if (__s != (char *)0x0) {
    pcVar1 = strchr(__s,0x3a);
    if (pcVar1 == (char *)0x0) {
      sVar3 = strlen(__s);
    }
    else {
      sVar3 = (long)pcVar1 - (long)__s;
    }
    lVar2 = CRYPTO_strndup(__s,sVar3,"crypto/core_algorithm.c",0xc3);
    if (lVar2 != 0) {
      return lVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/core_algorithm.c",0xc5,"ossl_algorithm_get1_first_name");
    ERR_set_error(6,0xc0100,0);
  }
  return 0;
}

