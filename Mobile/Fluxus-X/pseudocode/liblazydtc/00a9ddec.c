/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9ddec
 */

ulong ossl_param_build_set_bn(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  
  if (param_1 != 0) {
    uVar2 = OSSL_PARAM_BLD_push_BN(param_1,param_3,param_4);
    return uVar2;
  }
  lVar3 = OSSL_PARAM_locate(param_2,param_3);
  if (lVar3 == 0) {
    uVar2 = 1;
  }
  else {
    iVar1 = OSSL_PARAM_set_BN(lVar3,param_4);
    uVar2 = (ulong)(0 < iVar1);
  }
  return uVar2;
}

