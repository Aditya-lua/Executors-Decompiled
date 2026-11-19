/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b05700
 */

void * i2s_ASN1_UTF8STRING(undefined8 param_1,int *param_2)

{
  void *__dest;
  
  if ((param_2 == (int *)0x0) || (*param_2 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_utf8.c",0x23,"i2s_ASN1_UTF8STRING");
    ERR_set_error(0x22,0xc0102,0);
    return (void *)0x0;
  }
  __dest = CRYPTO_malloc(*param_2 + 1,"crypto/x509/v3_utf8.c",0x26);
  if (__dest == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/v3_utf8.c",0x27,"i2s_ASN1_UTF8STRING");
    ERR_set_error(0x22,0xc0100,0);
    return (void *)0x0;
  }
  memcpy(__dest,*(void **)(param_2 + 2),(long)*param_2);
  *(undefined1 *)((long)__dest + (long)*param_2) = 0;
  return __dest;
}

