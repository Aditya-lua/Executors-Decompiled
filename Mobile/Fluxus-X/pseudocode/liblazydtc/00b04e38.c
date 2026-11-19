/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b04e38
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

SXNET * SXNET_new(void)

{
  SXNET *pSVar1;
  
  pSVar1 = (SXNET *)ASN1_item_new((ASN1_ITEM *)&DAT_00c80fc8);
  return pSVar1;
}

