/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7a10
 */

ASN1_UTF8STRING * d2i_ASN1_UTF8STRING(ASN1_UTF8STRING **a,uchar **in,long len)

{
  ASN1_UTF8STRING *pAVar1;
  
  pAVar1 = (ASN1_UTF8STRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58c28);
  return pAVar1;
}

