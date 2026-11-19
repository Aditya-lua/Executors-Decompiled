/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb870
 */

int SSL_use_PrivateKey(SSL *ssl,EVP_PKEY *pkey)

{
  int iVar1;
  
  if (pkey == (EVP_PKEY *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_rsa.c",0x8f,"SSL_use_PrivateKey");
    ERR_set_error(0x14,0xc0102,0);
    return 0;
  }
  iVar1 = FUN_009bb8c0(ssl[3].d1);
  return iVar1;
}

