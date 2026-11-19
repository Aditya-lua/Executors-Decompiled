/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75578
 */

void EVP_PKEY_CTX_free(EVP_PKEY_CTX *ctx)

{
  code *pcVar1;
  
  if (ctx == (EVP_PKEY_CTX *)0x0) {
    return;
  }
  if ((*(long *)(ctx + 0x78) != 0) &&
     (pcVar1 = *(code **)(*(long *)(ctx + 0x78) + 0x18), pcVar1 != (code *)0x0)) {
    (*pcVar1)(ctx);
  }
  evp_pkey_ctx_free_old_ops(ctx);
  CRYPTO_free(*(void **)(ctx + 0x40));
  CRYPTO_free(*(void **)(ctx + 0x38));
  *(undefined8 *)(ctx + 0x38) = 0;
  *(undefined8 *)(ctx + 0x40) = 0;
  EVP_KEYMGMT_free(*(undefined8 *)(ctx + 0x20));
  CRYPTO_free(*(void **)(ctx + 0x10));
  EVP_PKEY_free(*(EVP_PKEY **)(ctx + 0x88));
  EVP_PKEY_free(*(EVP_PKEY **)(ctx + 0x90));
  ENGINE_finish(*(ENGINE **)(ctx + 0x80));
  BN_free(*(BIGNUM **)(ctx + 0xa8));
  CRYPTO_free(ctx);
  return;
}

