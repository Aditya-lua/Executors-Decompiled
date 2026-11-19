/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ef80
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ACCESS_DESCRIPTION * ACCESS_DESCRIPTION_new(void)

{
  ACCESS_DESCRIPTION *pAVar1;
  
  pAVar1 = ACCESS_DESCRIPTION_new();
  return pAVar1;
}

