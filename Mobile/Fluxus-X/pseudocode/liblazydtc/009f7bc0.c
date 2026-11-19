/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7bc0
 */

ASN1_BMPSTRING * d2i_ASN1_BMPSTRING(ASN1_BMPSTRING **a,uchar **in,long len)

{
  ASN1_BMPSTRING *pAVar1;
  
  pAVar1 = (ASN1_BMPSTRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58e20);
  return pAVar1;
}

