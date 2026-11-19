/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca3ec
 */

void FUN_00aca3ec(undefined8 param_1,int param_2)

{
  long lVar1;
  
  lVar1 = RAND_get0_public(0);
  if (lVar1 == 0) {
    return;
  }
  EVP_RAND_generate(lVar1,param_1,(long)param_2,0,0,0,0);
  return;
}

