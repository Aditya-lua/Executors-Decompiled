/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7a70
 */

ASN1_T61STRING * d2i_ASN1_T61STRING(ASN1_T61STRING **a,uchar **in,long len)

{
  ASN1_T61STRING *pAVar1;
  
  pAVar1 = (ASN1_T61STRING *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58c98);
  return pAVar1;
}

