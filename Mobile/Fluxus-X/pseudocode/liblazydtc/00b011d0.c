/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b011d0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

POLICY_CONSTRAINTS * POLICY_CONSTRAINTS_new(void)

{
  POLICY_CONSTRAINTS *pPVar1;
  
  pPVar1 = (POLICY_CONSTRAINTS *)ASN1_item_new((ASN1_ITEM *)&DAT_00c80ac0);
  return pPVar1;
}

