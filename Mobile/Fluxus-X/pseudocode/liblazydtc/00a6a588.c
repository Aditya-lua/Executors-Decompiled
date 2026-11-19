/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6a588
 */

PBE2PARAM * d2i_PBE2PARAM(PBE2PARAM **a,uchar **in,long len)

{
  PBE2PARAM *pPVar1;
  
  pPVar1 = (PBE2PARAM *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c5e9f0);
  return pPVar1;
}

