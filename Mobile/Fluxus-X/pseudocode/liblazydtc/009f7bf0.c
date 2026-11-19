/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7bf0
 */

ASN1_NULL * d2i_ASN1_NULL(ASN1_NULL **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58e58);
  return (ASN1_NULL *)pAVar1;
}

