/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af914c
 */

ASIdOrRange * d2i_ASIdOrRange(ASIdOrRange **a,uchar **in,long len)

{
  ASIdOrRange *pAVar1;
  
  pAVar1 = (ASIdOrRange *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7eb88);
  return pAVar1;
}

