/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6a5a0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PBE2PARAM * PBE2PARAM_new(void)

{
  PBE2PARAM *pPVar1;
  
  pPVar1 = (PBE2PARAM *)ASN1_item_new((ASN1_ITEM *)&DAT_00c5e9f0);
  return pPVar1;
}

