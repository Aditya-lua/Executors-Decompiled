/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb8ac
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

POLICYINFO * POLICYINFO_new(void)

{
  POLICYINFO *pPVar1;
  
  pPVar1 = (POLICYINFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7ef68);
  return pPVar1;
}

