/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a741fc
 */

undefined8 FUN_00a741fc(long param_1,undefined4 param_2,undefined4 param_3)

{
  long lVar1;
  undefined8 uVar2;
  long local_28;
  
  local_28 = *(long *)(param_1 + 0x20);
  if (local_28 == 0) {
    uVar2 = 0xffffffff;
  }
  else {
    lVar1 = evp_pkey_export_to_provider
                      (*(undefined8 *)(param_1 + 0x88),*(undefined8 *)(param_1 + 8),&local_28,
                       *(undefined8 *)(param_1 + 0x10));
    if (lVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/pmeth_check.c",0x28,"try_provided_check");
      ERR_set_error(6,0x86,0);
      uVar2 = 0;
    }
    else {
      uVar2 = evp_keymgmt_validate(local_28,lVar1,param_2,param_3);
    }
  }
  return uVar2;
}

