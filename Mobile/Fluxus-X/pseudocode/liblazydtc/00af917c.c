/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af917c
 */

ASIdentifierChoice * d2i_ASIdentifierChoice(ASIdentifierChoice **a,uchar **in,long len)

{
  ASIdentifierChoice *pAVar1;
  
  pAVar1 = (ASIdentifierChoice *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7ebc0);
  return pAVar1;
}

