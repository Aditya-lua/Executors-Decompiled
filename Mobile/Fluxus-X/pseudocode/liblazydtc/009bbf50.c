/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bbf50
 */

int SSL_CTX_use_PrivateKey(SSL_CTX *ctx,EVP_PKEY *pkey)

{
  int iVar1;
  
  if (pkey == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x15c,"SSL_CTX_use_PrivateKey");
    ERR_set_error(0x14,0xc0102,0);
    return 0;
  }
  iVar1 = FUN_009bb8c0(*(undefined8 *)ctx->sid_ctx);
  return iVar1;
}

