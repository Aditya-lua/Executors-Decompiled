/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af9134
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASRange * ASRange_new(void)

{
  ASRange *pAVar1;
  
  pAVar1 = (ASRange *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7eb50);
  return pAVar1;
}

