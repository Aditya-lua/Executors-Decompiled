/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af9194
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ASIdentifierChoice * ASIdentifierChoice_new(void)

{
  ASIdentifierChoice *pAVar1;
  
  pAVar1 = (ASIdentifierChoice *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7ebc0);
  return pAVar1;
}

