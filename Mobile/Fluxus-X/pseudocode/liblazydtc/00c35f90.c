/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c35f90
 */

int PEM_read_bio(BIO *bp,char **name,char **header,uchar **data,long *len)

{
  int iVar1;
  
  iVar1 = PEM_read_bio(bp,name,header,data,len);
  return iVar1;
}

