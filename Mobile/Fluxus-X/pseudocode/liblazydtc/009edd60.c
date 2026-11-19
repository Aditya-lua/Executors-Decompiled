/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009edd60
 */

int ASN1_mbstring_copy(ASN1_STRING **out,uchar *in,int len,int inform,ulong mask)

{
  int iVar1;
  
  iVar1 = ASN1_mbstring_ncopy(out,in,len,inform,mask,0,0);
  return iVar1;
}

