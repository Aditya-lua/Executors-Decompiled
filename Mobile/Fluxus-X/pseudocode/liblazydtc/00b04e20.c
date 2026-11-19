/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04e20
 */

SXNET * d2i_SXNET(SXNET **a,uchar **in,long len)

{
  SXNET *pSVar1;
  
  pSVar1 = (SXNET *)ASN1_item_d2i((ASN1_VALUE **)a,in,len,(ASN1_ITEM *)&DAT_00c80fc8);
  return pSVar1;
}

