/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26864
 */

int ASN1_OCTET_STRING_set(ASN1_STRING *str,void *data,int len)

{
  int iVar1;
  
  iVar1 = ASN1_STRING_set(str,data,len);
  return iVar1;
}

