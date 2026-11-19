/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74c6c
 */

undefined8 EVP_PKEY_export(int *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  undefined8 local_20;
  undefined8 uStack_18;
  
  if (param_1 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_gn.c",0x1ba,"EVP_PKEY_export");
    ERR_set_error(6,0xc0102,0);
    uVar1 = 0;
  }
  else {
    if ((*param_1 == 0) || (*(long *)(param_1 + 0x18) != 0)) {
      uVar1 = evp_keymgmt_util_export();
      return uVar1;
    }
    local_20 = param_3;
    uStack_18 = param_4;
    uVar1 = (**(code **)(*(long *)(param_1 + 2) + 0x120))(param_1,&local_20,&LAB_00a74d2c,0,0);
  }
  return uVar1;
}

