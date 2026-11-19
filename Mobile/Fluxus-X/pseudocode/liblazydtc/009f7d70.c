/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7d70
 */

ASN1_SEQUENCE_ANY * d2i_ASN1_SEQUENCE_ANY(ASN1_SEQUENCE_ANY **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c590c0);
  return (ASN1_SEQUENCE_ANY *)pAVar1;
}

