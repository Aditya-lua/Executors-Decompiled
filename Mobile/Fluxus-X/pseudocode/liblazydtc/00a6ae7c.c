/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6ae7c
 */

PBEPARAM * d2i_PBEPARAM(PBEPARAM **a,uchar **in,long len)

{
  PBEPARAM *pPVar1;
  
  pPVar1 = (PBEPARAM *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c5eb50);
  return pPVar1;
}

