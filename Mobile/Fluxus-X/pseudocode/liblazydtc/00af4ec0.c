/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4ec0
 */

OTHERNAME * d2i_OTHERNAME(OTHERNAME **a,uchar **in,long len)

{
  OTHERNAME *pOVar1;
  
  pOVar1 = (OTHERNAME *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e288);
  return pOVar1;
}

