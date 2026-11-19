/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af91c4
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASIdentifiers * ASIdentifiers_new(void)

{
  ASIdentifiers *pAVar1;
  
  pAVar1 = (ASIdentifiers *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7ebf8);
  return pAVar1;
}

