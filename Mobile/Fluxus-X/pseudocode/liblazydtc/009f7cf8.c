/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7cf8
 */

ASN1_STRING * d2i_DIRECTORYSTRING(ASN1_STRING **a,uchar **in,long len)

{
  ASN1_STRING *pAVar1;
  
  pAVar1 = (ASN1_STRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58fa8);
  return pAVar1;
}

