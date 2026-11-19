/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6a5dc
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

PBKDF2PARAM * PBKDF2PARAM_new(void)

{
  PBKDF2PARAM *pPVar1;
  
  pPVar1 = (PBKDF2PARAM *)ASN1_item_new((ASN1_ITEM *)&DAT_00c5ea28);
  return pPVar1;
}

