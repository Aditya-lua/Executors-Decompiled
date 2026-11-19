/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bbbc8
 */

int SSL_CTX_use_certificate(SSL_CTX *ctx,X509 *x)

{
  int iVar1;
  
  if (x == (X509 *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0xd7,"SSL_CTX_use_certificate");
    iVar1 = 0xc0102;
  }
  else {
    iVar1 = ssl_security_cert(0,ctx,x,0,1);
    if (iVar1 == 1) {
      iVar1 = FUN_009bb40c(*(undefined8 *)ctx->sid_ctx,x);
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0xdd,"SSL_CTX_use_certificate");
  }
  ERR_set_error(0x14,iVar1,0);
  return 0;
}

