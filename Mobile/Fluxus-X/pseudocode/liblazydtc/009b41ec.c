/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b41ec
 */

int SSL_CTX_check_private_key(SSL_CTX *ctx)

{
  int iVar1;
  X509 *x509;
  EVP_PKEY *pkey;
  undefined8 uVar2;
  
  if (ctx != (SSL_CTX *)0x0) {
    x509 = *(X509 **)**(undefined8 **)ctx->sid_ctx;
    if (x509 != (X509 *)0x0) {
      pkey = (EVP_PKEY *)((undefined8 *)**(undefined8 **)ctx->sid_ctx)[1];
      if (pkey != (EVP_PKEY *)0x0) {
        iVar1 = X509_check_private_key(x509,pkey);
        return iVar1;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x689,"SSL_CTX_check_private_key");
      uVar2 = 0xbe;
      goto LAB_009b4264;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",0x685,"SSL_CTX_check_private_key");
  uVar2 = 0xb1;
LAB_009b4264:
  ERR_set_error(0x14,uVar2,0);
  return 0;
}

