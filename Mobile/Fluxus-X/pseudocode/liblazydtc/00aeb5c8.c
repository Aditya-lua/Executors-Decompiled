/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeb5c8
 */

void OSSL_STORE_LOADER_do_all_provided(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 local_60 [4];
  long local_40;
  
  local_40 = 0;
  local_60[0] = param_1;
  FUN_00aeb134(local_60,0,0,0);
  local_70 = param_2;
  uStack_68 = param_3;
  if (local_40 != 0) {
    ossl_method_store_do_all(local_40,&LAB_00aeb664,&local_70);
  }
  uVar1 = ossl_lib_ctx_get_data(param_1,0xf,&DAT_00c7deb8);
  ossl_method_store_do_all(uVar1,&LAB_00aeb664,&local_70);
  if (local_40 != 0) {
    ossl_method_store_free();
  }
  return;
}

