/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74bb8
 */

undefined8 EVP_PKEY_todata(int *param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  undefined1 *local_20;
  long lStack_18;
  
  if (param_3 == 0) {
    uVar1 = 0;
  }
  else if (param_1 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_gn.c",0x1ba,"EVP_PKEY_export");
    ERR_set_error(6,0xc0102,0);
    uVar1 = 0;
  }
  else {
    if ((*param_1 == 0) || (*(long *)(param_1 + 0x18) != 0)) {
      uVar1 = evp_keymgmt_util_export(param_1,param_2,&LAB_00a74d00);
      return uVar1;
    }
    local_20 = &LAB_00a74d00;
    lStack_18 = param_3;
    uVar1 = (**(code **)(*(long *)(param_1 + 2) + 0x120))(param_1,&local_20,&LAB_00a74d2c,0,0);
  }
  return uVar1;
}

