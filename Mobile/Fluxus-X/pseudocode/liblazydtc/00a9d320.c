/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d320
 */

bool OSSL_PARAM_BLD_push_uint64(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  
  lVar1 = FUN_00a9d5b4(param_1,param_2,8,8,2,0);
  if (lVar1 != 0) {
    *(undefined8 *)(lVar1 + 0x30) = param_3;
  }
  return lVar1 != 0;
}

