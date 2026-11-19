/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4f74
 */

GENERAL_NAMES * d2i_GENERAL_NAMES(GENERAL_NAMES **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e330);
  return (GENERAL_NAMES *)pAVar1;
}

