/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5392c
 */

void CMAC_CTX_cleanup(CMAC_CTX *ctx)

{
  EVP_CIPHER_CTX_reset(*(undefined8 *)ctx);
  OPENSSL_cleanse(ctx + 0x48,0x20);
  OPENSSL_cleanse(ctx + 8,0x20);
  OPENSSL_cleanse(ctx + 0x28,0x20);
  OPENSSL_cleanse(ctx + 0x68,0x20);
  *(undefined4 *)(ctx + 0x88) = 0xffffffff;
  return;
}

