/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bbe6c
 */

int SSL_CTX_use_certificate_ASN1(SSL_CTX *ctx,int len,uchar *d)

{
  undefined4 uVar1;
  int iVar2;
  X509 *pXVar3;
  X509 *local_30;
  uchar *local_28;
  
  local_28 = d;
  local_30 = (X509 *)X509_new_ex(ctx->method,ctx[1].tlsext_ticket_key_cb);
  if (local_30 == (X509 *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x14a,"SSL_CTX_use_certificate_ASN1");
    uVar1 = 0xc0100;
  }
  else {
    pXVar3 = d2i_X509(&local_30,&local_28,(long)len);
    if (pXVar3 != (X509 *)0x0) {
      iVar2 = SSL_CTX_use_certificate(ctx,local_30);
      X509_free(local_30);
      return iVar2;
    }
    X509_free(local_30);
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x150,"SSL_CTX_use_certificate_ASN1");
    uVar1 = 0x8000d;
  }
  ERR_set_error(0x14,uVar1,0);
  return 0;
}

