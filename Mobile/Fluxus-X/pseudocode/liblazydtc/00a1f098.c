/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f098
 */

DH * DH_new_method(ENGINE *engine)

{
  DH *pDVar1;
  
  pDVar1 = (DH *)FUN_00a1eea4(engine,0);
  return pDVar1;
}

