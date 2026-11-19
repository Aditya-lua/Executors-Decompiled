/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af9164
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASIdOrRange * ASIdOrRange_new(void)

{
  ASIdOrRange *pAVar1;
  
  pAVar1 = (ASIdOrRange *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7eb88);
  return pAVar1;
}

