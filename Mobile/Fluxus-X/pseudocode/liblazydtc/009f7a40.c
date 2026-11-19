/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7a40
 */

ASN1_PRINTABLESTRING * d2i_ASN1_PRINTABLESTRING(ASN1_PRINTABLESTRING **a,uchar **in,long len)

{
  ASN1_PRINTABLESTRING *pAVar1;
  
  pAVar1 = (ASN1_PRINTABLESTRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58c60)
  ;
  return pAVar1;
}

