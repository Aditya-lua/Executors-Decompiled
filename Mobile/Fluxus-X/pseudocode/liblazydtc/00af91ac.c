/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af91ac
 */

ASIdentifiers * d2i_ASIdentifiers(ASIdentifiers **a,uchar **in,long len)

{
  ASIdentifiers *pAVar1;
  
  pAVar1 = (ASIdentifiers *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7ebf8);
  return pAVar1;
}

