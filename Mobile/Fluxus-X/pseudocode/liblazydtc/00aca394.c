/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca394
 */

undefined8 FUN_00aca394(undefined8 param_1,int param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = RAND_get0_primary(0);
  if ((param_2 < 1) || (lVar1 == 0)) {
    return 0;
  }
  uVar2 = EVP_RAND_reseed(lVar1,0,0,0,param_1,(long)param_2);
  return uVar2;
}

