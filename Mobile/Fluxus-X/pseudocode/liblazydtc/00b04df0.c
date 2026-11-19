/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04df0
 */

SXNETID * d2i_SXNETID(SXNETID **a,uchar **in,long len)

{
  SXNETID *pSVar1;
  
  pSVar1 = (SXNETID *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c80f90);
  return pSVar1;
}

