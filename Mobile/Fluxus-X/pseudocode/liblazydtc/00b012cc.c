/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b012cc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PKEY_USAGE_PERIOD * PKEY_USAGE_PERIOD_new(void)

{
  PKEY_USAGE_PERIOD *pPVar1;
  
  pPVar1 = (PKEY_USAGE_PERIOD *)ASN1_item_new((ASN1_ITEM *)&DAT_00c80bb0);
  return pPVar1;
}

