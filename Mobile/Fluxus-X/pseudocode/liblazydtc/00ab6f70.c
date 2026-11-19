/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab6f70
 */

int PEM_read(FILE *fp,char **name,char **header,uchar **data,long *len)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/pem/pem_lib.c",0x2a6,"PEM_read");
    ERR_set_error(9,0x80007,0);
    iVar1 = 0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,fp);
    iVar1 = PEM_read_bio_ex(bp,name,header,data,len,2);
    BIO_free(bp);
  }
  return iVar1;
}

