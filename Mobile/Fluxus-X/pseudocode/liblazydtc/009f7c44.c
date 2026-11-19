/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7c44
 */

ASN1_TYPE * d2i_ASN1_TYPE(ASN1_TYPE **a,uchar **in,long len)

{
  ASN1_TYPE *pAVar1;
  
  pAVar1 = (ASN1_TYPE *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58ec8);
  return pAVar1;
}

