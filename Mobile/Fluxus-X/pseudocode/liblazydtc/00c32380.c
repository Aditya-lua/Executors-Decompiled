/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32380
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ENGINE * ENGINE_get_first(void)

{
  ENGINE *pEVar1;
  
  pEVar1 = ENGINE_get_first();
  return pEVar1;
}

