/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afab68
 */

BASIC_CONSTRAINTS * d2i_BASIC_CONSTRAINTS(BASIC_CONSTRAINTS **a,uchar **in,long len)

{
  BASIC_CONSTRAINTS *pBVar1;
  
  pBVar1 = (BASIC_CONSTRAINTS *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7ee40);
  return pBVar1;
}

