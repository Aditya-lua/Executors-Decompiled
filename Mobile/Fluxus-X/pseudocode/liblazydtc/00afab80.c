/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afab80
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BASIC_CONSTRAINTS * BASIC_CONSTRAINTS_new(void)

{
  BASIC_CONSTRAINTS *pBVar1;
  
  pBVar1 = (BASIC_CONSTRAINTS *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7ee40);
  return pBVar1;
}

