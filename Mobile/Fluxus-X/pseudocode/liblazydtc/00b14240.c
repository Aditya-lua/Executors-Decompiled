/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b14240
 */

undefined8 X509_VERIFY_PARAM_set1_ip(long param_1,char *param_2,size_t param_3)

{
  void *__dest;
  undefined8 uVar1;
  
  if ((param_3 < 0x11) && ((1L << (param_3 & 0x3f) & 0x10011U) != 0)) {
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
    CRYPTO_free(*(void **)(param_1 + 0x60));
    uVar1 = 1;
    *(void **)(param_1 + 0x60) = __dest;
    *(size_t *)(param_1 + 0x68) = param_3;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/x509/x509_vpm.c",0x1d4,"X509_VERIFY_PARAM_set1_ip");
    ERR_set_error(0xb,0x80106,0);
    uVar1 = 0;
  }
  return uVar1;
}

