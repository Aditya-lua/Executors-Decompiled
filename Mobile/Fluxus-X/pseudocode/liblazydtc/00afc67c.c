/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc67c
 */

DIST_POINT_NAME * d2i_DIST_POINT_NAME(DIST_POINT_NAME **a,uchar **in,long len)

{
  DIST_POINT_NAME *pDVar1;
  
  pDVar1 = (DIST_POINT_NAME *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7f7b8);
  return pDVar1;
}

