/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3f1d0
 */

int PEM_write_bio(BIO *bp,char *name,char *hdr,uchar *data,long len)

{
  int iVar1;
  
  iVar1 = PEM_write_bio(bp,name,hdr,data,len);
  return iVar1;
}

