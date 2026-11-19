/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9dc04
 */

undefined8
ossl_param_build_set_int(long param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4)

{
  undefined8 uVar1;
  long lVar2;
  
  if (param_1 != 0) {
    uVar1 = OSSL_PARAM_BLD_push_int(param_1,param_3,param_4);
    return uVar1;
  }
  lVar2 = OSSL_PARAM_locate(param_2,param_3);
  if (lVar2 == 0) {
    return 1;
  }
  uVar1 = OSSL_PARAM_set_int(lVar2,param_4);
  return uVar1;
}

