/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab6180
 */

int PEM_ASN1_write(undefined1 *i2d,char *name,FILE *fp,void *x,EVP_CIPHER *enc,uchar *kstr,int klen,
                  undefined1 *callback,void *u)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x12e,"PEM_ASN1_write");
    ERR_set_error(9,0x80007,0);
    iVar1 = 0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,fp);
    iVar1 = PEM_ASN1_write_bio(i2d,name,bp,x,enc,kstr,klen,callback,u);
    BIO_free(bp);
  }
  return iVar1;
}

