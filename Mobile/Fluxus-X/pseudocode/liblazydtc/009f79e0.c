/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f79e0
 */

ASN1_BIT_STRING * d2i_ASN1_BIT_STRING(ASN1_BIT_STRING **a,uchar **in,long len)

{
  ASN1_BIT_STRING *pAVar1;
  
  pAVar1 = (ASN1_BIT_STRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58bf0);
  return pAVar1;
}

