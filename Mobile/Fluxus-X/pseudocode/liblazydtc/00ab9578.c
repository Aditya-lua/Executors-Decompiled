/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab9578
 */

EVP_PKEY * d2i_PKCS8PrivateKey_fp(FILE *fp,EVP_PKEY **x,undefined1 *cb,void *u)

{
  BIO *bp;
  EVP_PKEY *pEVar1;
  
  bp = BIO_new_fp(fp,0);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_pk8.c",0x103,"d2i_PKCS8PrivateKey_fp");
    ERR_set_error(9,0x80007,0);
    pEVar1 = (EVP_PKEY *)0x0;
  }
  else {
    pEVar1 = d2i_PKCS8PrivateKey_bio(bp,x,cb,u);
    BIO_free(bp);
  }
  return pEVar1;
}

