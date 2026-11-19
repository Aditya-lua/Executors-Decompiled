/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4f38
 */

GENERAL_NAME * d2i_GENERAL_NAME(GENERAL_NAME **a,uchar **in,long len)

{
  GENERAL_NAME *pGVar1;
  
  pGVar1 = (GENERAL_NAME *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c7e2f8);
  return pGVar1;
}

