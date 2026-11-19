/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b30
 */

ASN1_GENERALIZEDTIME * d2i_ASN1_GENERALIZEDTIME(ASN1_GENERALIZEDTIME **a,uchar **in,long len)

{
  ASN1_GENERALIZEDTIME *pAVar1;
  
  pAVar1 = (ASN1_GENERALIZEDTIME *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58d78)
  ;
  return pAVar1;
}

