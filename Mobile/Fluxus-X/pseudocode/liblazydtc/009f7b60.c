/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7b60
 */

ASN1_VISIBLESTRING * d2i_ASN1_VISIBLESTRING(ASN1_VISIBLESTRING **a,uchar **in,long len)

{
  ASN1_VISIBLESTRING *pAVar1;
  
  pAVar1 = (ASN1_VISIBLESTRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58db0);
  return pAVar1;
}

