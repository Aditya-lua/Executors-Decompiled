/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af5658
 */

AUTHORITY_INFO_ACCESS * d2i_AUTHORITY_INFO_ACCESS(AUTHORITY_INFO_ACCESS **a,uchar **in,long len)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e6a0);
  return (AUTHORITY_INFO_ACCESS *)pAVar1;
}

