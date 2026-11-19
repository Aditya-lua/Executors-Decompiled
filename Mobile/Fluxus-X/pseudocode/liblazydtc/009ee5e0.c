/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ee5e0
 */

ASN1_TIME * d2i_ASN1_TIME(ASN1_TIME **a,uchar **in,long len)

{
  ASN1_TIME *pAVar1;
  
  pAVar1 = (ASN1_TIME *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58910);
  return pAVar1;
}

