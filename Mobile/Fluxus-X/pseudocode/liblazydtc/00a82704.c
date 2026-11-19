/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82704
 */

undefined8 ossl_namemap_num2name(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  int iVar2;
  undefined8 local_20;
  undefined8 local_18;
  
  local_18 = 0;
  local_20 = param_3;
  iVar2 = ossl_namemap_doall_names(param_1,param_2,&LAB_00a8273c,&local_20);
  uVar1 = 0;
  if (iVar2 != 0) {
    uVar1 = local_18;
  }
  return uVar1;
}

