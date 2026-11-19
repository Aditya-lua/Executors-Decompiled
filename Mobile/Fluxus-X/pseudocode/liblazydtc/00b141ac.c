/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b141ac
 */

undefined8 X509_VERIFY_PARAM_set1_email(long param_1,char *param_2,size_t param_3)

{
  void *__dest;
  
  if (param_2 == (char *)0x0) {
    param_3 = 0;
    __dest = (void *)0x0;
  }
  else {
    if (param_3 == 0) {
      param_3 = strlen(param_2);
    }
    __dest = CRYPTO_malloc((int)param_3 + 1,"crypto/x509/x509_vpm.c",0xf7);
    if (__dest == (void *)0x0) {
      return 0;
    }
    memcpy(__dest,param_2,param_3);
    *(undefined1 *)((long)__dest + param_3) = 0;
  }
  CRYPTO_free(*(void **)(param_1 + 0x50));
  *(void **)(param_1 + 0x50) = __dest;
  *(size_t *)(param_1 + 0x58) = param_3;
  return 1;
}

