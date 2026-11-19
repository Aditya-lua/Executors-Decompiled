/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c323a0
 */

ENGINE * ENGINE_get_next(ENGINE *e)

{
  ENGINE *pEVar1;
  
  pEVar1 = ENGINE_get_next(e);
  return pEVar1;
}

