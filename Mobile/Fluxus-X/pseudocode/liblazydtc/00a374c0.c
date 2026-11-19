/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a374c0
 */

int EC_KEY_print_fp(FILE *fp,EC_KEY *key,int off)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  if (bp == (BIO *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/eck_prn.c",0x2a,"EC_KEY_print_fp");
    ERR_set_error(0x10,0x80020,0);
    iVar1 = 0;
  }
  else {
    BIO_ctrl(bp,0x6a,0,fp);
    iVar1 = EC_KEY_print(bp,key,off);
    BIO_free(bp);
  }
  return iVar1;
}

