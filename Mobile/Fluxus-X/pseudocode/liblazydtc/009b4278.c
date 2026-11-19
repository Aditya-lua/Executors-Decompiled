/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4278
 */

int SSL_check_private_key(SSL *ctx)

{
  int iVar1;
  X509 *x509;
  EVP_PKEY *pkey;
  undefined8 uVar2;
  
  if (ctx == (SSL *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x694,"SSL_check_private_key");
    uVar2 = 0xc0102;
  }
  else {
    x509 = (X509 *)**(undefined8 **)ctx[3].d1;
    if (x509 == (X509 *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x698,"SSL_check_private_key");
      uVar2 = 0xb1;
    }
    else {
      pkey = (EVP_PKEY *)(*(undefined8 **)ctx[3].d1)[1];
      if (pkey != (EVP_PKEY *)0x0) {
        iVar1 = X509_check_private_key(x509,pkey);
        return iVar1;
      }
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x69c,"SSL_check_private_key");
      uVar2 = 0xbe;
    }
  }
  ERR_set_error(0x14,uVar2,0);
  return 0;
}

