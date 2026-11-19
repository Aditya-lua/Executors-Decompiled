/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20744
 */

DSA * DSA_new_method(ENGINE *engine)

{
  DSA *pDVar1;
  
  pDVar1 = (DSA *)FUN_00a2074c(engine,0);
  return pDVar1;
}

