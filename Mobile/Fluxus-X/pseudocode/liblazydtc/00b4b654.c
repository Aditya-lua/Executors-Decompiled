/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4b654
 */

undefined8 ossl_DER_w_bn(undefined8 param_1,undefined4 param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined4 local_24;
  
  if (param_3 == 0) {
    uVar2 = 0;
  }
  else {
    iVar1 = BN_is_negative(param_3);
    uVar2 = 0;
    if (iVar1 == 0) {
      iVar1 = BN_is_zero(param_3);
      if (iVar1 == 0) {
        uVar2 = FUN_00b4b500(param_1,param_2,&LAB_00b4b6ec,param_3);
        return uVar2;
      }
      local_24 = 0;
      uVar2 = FUN_00b4b500(param_1,param_2,&LAB_00b4b618,&local_24);
    }
  }
  return uVar2;
}

