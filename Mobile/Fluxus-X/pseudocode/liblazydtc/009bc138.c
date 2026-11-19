/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bc138
 */

int SSL_CTX_use_PrivateKey_ASN1(int pk,SSL_CTX *ctx,uchar *d,long len)

{
  int iVar1;
  EVP_PKEY *pkey;
  uchar *local_28;
  
  local_28 = d;
  pkey = (EVP_PKEY *)d2i_PrivateKey_ex(pk,0,&local_28,len,ctx->method,ctx[1].tlsext_ticket_key_cb);
  if (pkey == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x194,"SSL_CTX_use_PrivateKey_ASN1");
    ERR_set_error(0x14,0x8000d,0);
    iVar1 = 0;
  }
  else {
    iVar1 = FUN_009bb8c0(*(undefined8 *)ctx->sid_ctx,pkey);
    EVP_PKEY_free(pkey);
  }
  return iVar1;
}

