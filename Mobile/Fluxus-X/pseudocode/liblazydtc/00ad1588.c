/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad1588
 */

RSA * RSA_new_method(ENGINE *engine)

{
  RSA *pRVar1;
  
  pRVar1 = (RSA *)FUN_00ad1338(engine,0);
  return pRVar1;
}

