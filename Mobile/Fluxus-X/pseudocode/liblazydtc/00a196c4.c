/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a196c4
 */

undefined8 ossl_dh_key_todata(long param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  undefined8 uVar1;
  long local_38;
  long local_28;
  
  local_28 = 0;
  local_38 = 0;
  uVar1 = 0;
  if (((param_1 != 0) &&
      (((DH_get0_key(param_1,&local_38,&local_28), param_4 == 0 || (local_28 == 0)) ||
       (uVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002a3e83), (int)uVar1 != 0)))) &&
     ((local_38 == 0 ||
      (uVar1 = ossl_param_build_set_bn(param_2,param_3,&DAT_002ad463), (int)uVar1 != 0)))) {
    uVar1 = 1;
  }
  return uVar1;
}

