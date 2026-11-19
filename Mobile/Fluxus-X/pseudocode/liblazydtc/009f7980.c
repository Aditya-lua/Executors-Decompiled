/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f7980
 */

ASN1_INTEGER * d2i_ASN1_INTEGER(ASN1_INTEGER **a,uchar **in,long len)

{
  ASN1_INTEGER *pAVar1;
  
  pAVar1 = (ASN1_INTEGER *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c58b80);
  return pAVar1;
}

