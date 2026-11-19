/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6ae94
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PBEPARAM * PBEPARAM_new(void)

{
  PBEPARAM *pPVar1;
  
  pPVar1 = (PBEPARAM *)ASN1_item_new((ASN1_ITEM *)&DAT_00c5eb50);
  return pPVar1;
}

