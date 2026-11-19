/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2118
 */

int ASN1_parse_dump(BIO *bp,uchar *pp,long len,int indent,int dump)

{
  int iVar1;
  uchar *local_18;
  
  local_18 = pp;
  iVar1 = FUN_009f15d0((int)bp,&local_18,len,0,0,indent,dump);
  return iVar1;
}

