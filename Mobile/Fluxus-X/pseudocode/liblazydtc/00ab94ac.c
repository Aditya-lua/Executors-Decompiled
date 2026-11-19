/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab94ac
 */

int PEM_write_PKCS8PrivateKey
              (FILE *fp,EVP_PKEY *x,EVP_CIPHER *enc,char *kstr,int klen,undefined1 *cd,void *u)

{
  int iVar1;
  BIO *a;
  
  a = BIO_new_fp(fp,0);
  if (a == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_pk8.c",0xf4,"do_pk8pkey_fp");
    ERR_set_error(9,0x80007,0);
    iVar1 = 0;
  }
  else {
    iVar1 = FUN_00ab8d5c(a,x,0,0xffffffff,enc,kstr,klen,cd,u);
    BIO_free(a);
  }
  return iVar1;
}

