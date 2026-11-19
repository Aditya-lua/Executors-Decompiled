/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5dddc
 */

void evp_generic_do_all(undefined8 param_1,undefined4 param_2,undefined8 param_3,undefined8 param_4,
                       undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  undefined8 uVar1;
  undefined4 local_90 [2];
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78 [4];
  long local_58;
  
  local_58 = 0;
  local_78[0] = param_1;
  FUN_00a5d3a4(local_78,0,param_2,0,0,0,param_5,param_6,param_7);
  local_90[0] = param_2;
  local_88 = param_3;
  uStack_80 = param_4;
  if (local_58 != 0) {
    ossl_method_store_do_all(local_58,&LAB_00a5de98,local_90);
  }
  uVar1 = ossl_lib_ctx_get_data(param_1,0,&DAT_00c5d6b8);
  ossl_method_store_do_all(uVar1,&LAB_00a5de98,local_90);
  if (local_58 != 0) {
    ossl_method_store_free();
  }
  return;
}

