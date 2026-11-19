/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af911c
 */

ASRange * d2i_ASRange(ASRange **a,uchar **in,long len)

{
  ASRange *pAVar1;
  
  pAVar1 = (ASRange *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7eb50);
  return pAVar1;
}

