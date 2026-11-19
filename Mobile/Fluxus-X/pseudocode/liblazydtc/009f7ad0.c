/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7ad0
 */

ASN1_GENERALSTRING * d2i_ASN1_GENERALSTRING(ASN1_GENERALSTRING **a,uchar **in,long len)

{
  ASN1_GENERALSTRING *pAVar1;
  
  pAVar1 = (ASN1_GENERALSTRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58d08);
  return pAVar1;
}

