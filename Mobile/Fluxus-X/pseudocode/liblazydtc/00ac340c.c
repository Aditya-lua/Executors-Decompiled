/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac340c
 */

undefined8 ossl_pkcs7_ctx_propagate(long param_1,long param_2)

{
  char *pcVar1;
  
  *(undefined8 *)(param_2 + 0x28) = *(undefined8 *)(param_1 + 0x28);
  pcVar1 = *(char **)(param_1 + 0x30);
  if (*(void **)(param_2 + 0x30) != (void *)0x0) {
    CRYPTO_free(*(void **)(param_2 + 0x30));
    *(undefined8 *)(param_2 + 0x30) = 0;
  }
  if (pcVar1 != (char *)0x0) {
    pcVar1 = CRYPTO_strdup(pcVar1,"crypto/pkcs7/pk7_lib.c",0x1ec);
    *(char **)(param_2 + 0x30) = pcVar1;
    if (pcVar1 == (char *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/pkcs7/pk7_lib.c",0x1ee,"ossl_pkcs7_set1_propq");
      ERR_set_error(0x39,0xc0100,0);
      return 0;
    }
  }
  ossl_pkcs7_resolve_libctx(param_2);
  return 1;
}

