/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b00
 */

ASN1_UTCTIME * d2i_ASN1_UTCTIME(ASN1_UTCTIME **a,uchar **in,long len)

{
  ASN1_UTCTIME *pAVar1;
  
  pAVar1 = (ASN1_UTCTIME *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58d40);
  return pAVar1;
}

