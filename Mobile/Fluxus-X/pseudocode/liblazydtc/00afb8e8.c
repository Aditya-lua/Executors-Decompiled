/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afb8e8
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

POLICYQUALINFO * POLICYQUALINFO_new(void)

{
  POLICYQUALINFO *pPVar1;
  
  pPVar1 = (POLICYQUALINFO *)ASN1_item_new((ASN1_ITEM *)&DAT_00c7efa0);
  return pPVar1;
}

