/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc6b8
 */

DIST_POINT * d2i_DIST_POINT(DIST_POINT **a,uchar **in,long len)

{
  DIST_POINT *pDVar1;
  
  pDVar1 = (DIST_POINT *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7f820);
  return pDVar1;
}

