/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb34c
 */

int SSL_use_certificate(SSL *ssl,X509 *x)

{
  int iVar1;
  
  if (x == (X509 *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x20,"SSL_use_certificate");
    iVar1 = 0xc0102;
  }
  else {
    iVar1 = ssl_security_cert(ssl,0,x,0,1);
    if (iVar1 == 1) {
      iVar1 = FUN_009bb40c(ssl[3].d1,x);
      return iVar1;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x26,"SSL_use_certificate");
  }
  ERR_set_error(0x14,iVar1,0);
  return 0;
}

