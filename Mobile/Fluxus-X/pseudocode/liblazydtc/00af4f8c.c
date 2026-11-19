/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af4f8c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

GENERAL_NAMES * GENERAL_NAMES_new(void)

{
  ASN1_VALUE *pAVar1;
  
  pAVar1 = ASN1_item_new((ASN1_ITEM *)&DAT_00c7e330);
  return (GENERAL_NAMES *)pAVar1;
}

