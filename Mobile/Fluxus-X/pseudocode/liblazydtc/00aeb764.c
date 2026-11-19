/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeb764
 */

undefined8 FUN_00aeb764(long param_1,undefined8 param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 local_38;
  
  local_38 = 0;
  iVar1 = *(int *)(param_3 + 1);
  if (iVar1 == 0) {
    uVar2 = ossl_namemap_stored(*param_3);
    iVar1 = ossl_namemap_name2num(uVar2,param_3[2]);
  }
  if ((param_1 == 0) && (param_1 = ossl_lib_ctx_get_data(*param_3,0xf,&DAT_00c7deb8), param_1 == 0))
  {
    return 0;
  }
  iVar1 = ossl_method_store_fetch(param_1,iVar1,param_3[3],param_2,&local_38);
  uVar2 = 0;
  if (iVar1 != 0) {
    uVar2 = local_38;
  }
  return uVar2;
}

