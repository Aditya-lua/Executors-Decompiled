/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d3d4
 */

bool OSSL_PARAM_BLD_push_double(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  
  lVar1 = FUN_00a9d5b4(param_2,param_3,8,8,3,0);
  if (lVar1 != 0) {
    *(undefined8 *)(lVar1 + 0x30) = param_1;
  }
  return lVar1 != 0;
}

