/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9d26c
 */

bool OSSL_PARAM_BLD_push_int32(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  
  lVar1 = FUN_00a9d5b4(param_1,param_2,4,4,1,0);
  if (lVar1 != 0) {
    *(undefined4 *)(lVar1 + 0x30) = param_3;
  }
  return lVar1 != 0;
}

