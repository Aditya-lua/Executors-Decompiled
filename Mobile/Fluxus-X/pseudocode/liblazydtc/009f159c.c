/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f159c
 */

int ASN1_parse(BIO *bp,uchar *pp,long len,int indent)

{
  int iVar1;
  uchar *local_18;
  
  local_18 = pp;
  iVar1 = FUN_009f15d0((int)bp,&local_18,len,0,0,indent,0);
  return iVar1;
}

