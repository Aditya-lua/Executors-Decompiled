/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ed47c
 */

int X509_NAME_print_ex_fp(FILE *fp,X509_NAME *nm,int indent,ulong flags)

{
  int iVar1;
  BIO *bp;
  
  if (flags != 0) {
    iVar1 = FUN_009ed088(&LAB_009ed508,fp,nm,indent,flags);
    return iVar1;
  }
  bp = BIO_new_fp(fp,0);
  if (bp == (BIO *)0x0) {
    iVar1 = -1;
  }
  else {
    iVar1 = X509_NAME_print(bp,nm,indent);
    BIO_free(bp);
  }
  return iVar1;
}

