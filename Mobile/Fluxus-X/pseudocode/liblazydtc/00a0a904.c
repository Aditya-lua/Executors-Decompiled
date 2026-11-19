/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0a904
 */

int BN_print_fp(FILE *fp,BIGNUM *a)

{
  int iVar1;
  BIO_METHOD *type;
  BIO *bp;
  
  type = BIO_s_file();
  bp = BIO_new(type);
  iVar1 = 0;
  if (bp != (BIO *)0x0) {
    BIO_ctrl(bp,0x6a,0,fp);
    iVar1 = BN_print(bp,a);
    BIO_free(bp);
  }
  return iVar1;
}

