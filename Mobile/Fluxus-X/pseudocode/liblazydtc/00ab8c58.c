/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab8c58
 */

int PEM_write_PrivateKey
              (FILE *fp,EVP_PKEY *x,EVP_CIPHER *enc,uchar *kstr,int klen,undefined1 *cb,void *u)

{
  int iVar1;
  BIO *a;
  undefined8 in_x7;
  
  a = BIO_new_fp(fp,0);
  if (a == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_pkey.c",0x1b4,"PEM_write_PrivateKey_ex");
    ERR_set_error(9,0x80007,0);
    iVar1 = 0;
  }
  else {
    iVar1 = PEM_write_bio_PrivateKey_ex(a,x,enc,kstr,klen,cb,u,in_x7,0);
    BIO_free(a);
  }
  return iVar1;
}

