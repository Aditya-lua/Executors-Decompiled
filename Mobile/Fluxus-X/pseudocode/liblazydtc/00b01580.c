/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b01580
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

POLICY_MAPPING * POLICY_MAPPING_new(void)

{
  POLICY_MAPPING *pPVar1;
  
  pPVar1 = (POLICY_MAPPING *)ASN1_item_new((ASN1_ITEM *)&DAT_00c80ca0);
  return pPVar1;
}

