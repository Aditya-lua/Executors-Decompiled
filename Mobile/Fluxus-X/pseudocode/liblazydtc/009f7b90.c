/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b90
 */

ASN1_UNIVERSALSTRING * d2i_ASN1_UNIVERSALSTRING(ASN1_UNIVERSALSTRING **a,uchar **in,long len)

{
  ASN1_UNIVERSALSTRING *pAVar1;
  
  pAVar1 = (ASN1_UNIVERSALSTRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58de8)
  ;
  return pAVar1;
}

