/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b24d78
 */

void * FUN_00b24d78(void *param_1)

{
  int iVar1;
  void *__dest;
  
  iVar1 = ossl_prov_is_running();
  if (iVar1 != 0) {
    __dest = CRYPTO_malloc(0x3b0,"providers/implementations/ciphers/cipher_aes_ocb.c",0x156);
    if (__dest == (void *)0x0) {
      ERR_new();
      ERR_set_debug("providers/implementations/ciphers/cipher_aes_ocb.c",0x158,"aes_ocb_dupctx");
      ERR_set_error(0x39,0xc0100,0);
      return (void *)0x0;
    }
    memcpy(__dest,param_1,0x3b0);
    iVar1 = CRYPTO_ocb128_copy_ctx
                      ((long)__dest + 0x2b0,(long)param_1 + 0x2b0,(long)__dest + 0xc0,
                       (long)__dest + 0x1b8);
    if (iVar1 != 0) {
      return __dest;
    }
    CRYPTO_free(__dest);
  }
  return (void *)0x0;
}

