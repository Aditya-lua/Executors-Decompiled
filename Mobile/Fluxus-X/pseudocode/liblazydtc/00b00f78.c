/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b00f78
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PROXY_POLICY * PROXY_POLICY_new(void)

{
  PROXY_POLICY *pPVar1;
  
  pPVar1 = (PROXY_POLICY *)ASN1_item_new((ASN1_ITEM *)&DAT_00c80948);
  return pPVar1;
}

