/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1708c
 */

NETSCAPE_SPKI * d2i_NETSCAPE_SPKI(NETSCAPE_SPKI **a,uchar **in,long len)

{
  NETSCAPE_SPKI *pNVar1;
  
  pNVar1 = (NETSCAPE_SPKI *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c81e70);
  return pNVar1;
}

