/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7aa0
 */

ASN1_IA5STRING * d2i_ASN1_IA5STRING(ASN1_IA5STRING **a,uchar **in,long len)

{
  ASN1_IA5STRING *pAVar1;
  
  pAVar1 = (ASN1_IA5STRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58cd0);
  return pAVar1;
}

