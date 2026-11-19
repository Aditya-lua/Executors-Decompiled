/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6cec0
 */

undefined8 EVP_PKEY_get_raw_private_key(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  code *pcVar3;
  long *local_30;
  undefined8 uStack_28;
  undefined4 local_20;
  long local_18;
  
  local_18 = param_2;
  if (*(long *)(param_1 + 0x60) != 0) {
    local_30 = (long *)0x0;
    if (param_2 != 0) {
      local_30 = &local_18;
    }
    local_20 = 1;
    uStack_28 = param_3;
    uVar2 = evp_keymgmt_util_export(param_1,1,&LAB_00a6cfa8,&local_30);
    return uVar2;
  }
  if (*(long *)(param_1 + 8) == 0) {
    ERR_new();
    uVar2 = 0x235;
  }
  else {
    pcVar3 = *(code **)(*(long *)(param_1 + 8) + 0x108);
    if (pcVar3 != (code *)0x0) {
      iVar1 = (*pcVar3)();
      if (iVar1 != 0) {
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/evp/p_lib.c",0x23f,"EVP_PKEY_get_raw_private_key");
      uVar2 = 0xb6;
      goto LAB_00a6cf90;
    }
    ERR_new();
    uVar2 = 0x23a;
  }
  ERR_set_debug("crypto/evp/p_lib.c",uVar2,"EVP_PKEY_get_raw_private_key");
  uVar2 = 0x96;
LAB_00a6cf90:
  ERR_set_error(6,uVar2,0);
  return 0;
}

