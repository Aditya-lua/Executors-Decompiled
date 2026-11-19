/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9dd74
 */

undefined8
ossl_param_build_set_bn_pad
          (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,ulong param_5)

{
  undefined8 uVar1;
  long lVar2;
  
  if (param_1 != 0) {
    uVar1 = OSSL_PARAM_BLD_push_BN_pad(param_1,param_3,param_4,param_5);
    return uVar1;
  }
  lVar2 = OSSL_PARAM_locate(param_2,param_3);
  if (lVar2 == 0) {
    uVar1 = 1;
  }
  else {
    uVar1 = 0;
    if (param_5 <= *(ulong *)(lVar2 + 0x18)) {
      *(ulong *)(lVar2 + 0x18) = param_5;
      uVar1 = OSSL_PARAM_set_BN(lVar2,param_4);
      return uVar1;
    }
  }
  return uVar1;
}

