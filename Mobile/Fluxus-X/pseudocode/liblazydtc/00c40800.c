/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40800
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

GENERAL_NAMES * GENERAL_NAMES_new(void)

{
  GENERAL_NAMES *pGVar1;
  
  pGVar1 = GENERAL_NAMES_new();
  return pGVar1;
}

