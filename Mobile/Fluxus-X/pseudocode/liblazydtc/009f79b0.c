/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f79b0
 */

ASN1_ENUMERATED * d2i_ASN1_ENUMERATED(ASN1_ENUMERATED **a,uchar **in,long len)

{
  ASN1_ENUMERATED *pAVar1;
  
  pAVar1 = (ASN1_ENUMERATED *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58bb8);
  return pAVar1;
}

