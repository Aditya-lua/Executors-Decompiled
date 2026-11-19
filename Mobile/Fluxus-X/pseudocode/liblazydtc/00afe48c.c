/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afe48c
 */

EXTENDED_KEY_USAGE * d2i_EXTENDED_KEY_USAGE(EXTENDED_KEY_USAGE **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c80190);
  return (EXTENDED_KEY_USAGE *)pAVar1;
}

