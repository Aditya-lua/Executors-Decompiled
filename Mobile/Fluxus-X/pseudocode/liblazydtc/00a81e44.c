/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81e44
 */

void ossl_algorithm_do_all
               (undefined8 param_1,uint param_2,long param_3,undefined8 param_4,undefined8 param_5,
               undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9)

{
  undefined8 uVar1;
  long lVar2;
  long lVar3;
  undefined8 local_70;
  ulong local_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  
  local_68 = (ulong)param_2;
  uStack_38 = param_9;
  local_70 = param_1;
  local_60 = param_4;
  uStack_58 = param_5;
  local_50 = param_6;
  uStack_48 = param_7;
  local_40 = param_8;
  if (param_3 == 0) {
    ossl_provider_doall_activated(param_1,FUN_00a81ee0,&local_70);
  }
  else {
    uVar1 = ossl_provider_libctx(param_3);
    lVar2 = ossl_lib_ctx_get_concrete(param_1);
    lVar3 = ossl_lib_ctx_get_concrete(uVar1);
    if (lVar2 == lVar3) {
      local_70 = uVar1;
      FUN_00a81ee0(param_3,&local_70);
    }
  }
  return;
}

