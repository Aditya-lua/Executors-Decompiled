/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b53990
 */

void CMAC_CTX_free(CMAC_CTX *ctx)

{
  if (ctx == (CMAC_CTX *)0x0) {
    return;
  }
  EVP_CIPHER_CTX_reset(*(undefined8 *)ctx);
  OPENSSL_cleanse(ctx + 0x48,0x20);
  OPENSSL_cleanse(ctx + 8,0x20);
  OPENSSL_cleanse(ctx + 0x28,0x20);
  OPENSSL_cleanse(ctx + 0x68,0x20);
  *(undefined4 *)(ctx + 0x88) = 0xffffffff;
  EVP_CIPHER_CTX_free(*(EVP_CIPHER_CTX **)ctx);
  CRYPTO_free(ctx);
  return;
}

