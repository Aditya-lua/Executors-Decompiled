/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afc724
 */

ISSUING_DIST_POINT * d2i_ISSUING_DIST_POINT(ISSUING_DIST_POINT **a,uchar **in,long len)

{
  ISSUING_DIST_POINT *pIVar1;
  
  pIVar1 = (ISSUING_DIST_POINT *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7f890);
  return pIVar1;
}

