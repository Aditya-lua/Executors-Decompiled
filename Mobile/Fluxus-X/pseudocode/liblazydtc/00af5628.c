/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5628
 */

ACCESS_DESCRIPTION * d2i_ACCESS_DESCRIPTION(ACCESS_DESCRIPTION **a,uchar **in,long len)

{
  ACCESS_DESCRIPTION *pAVar1;
  
  pAVar1 = (ACCESS_DESCRIPTION *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e668);
  return pAVar1;
}

