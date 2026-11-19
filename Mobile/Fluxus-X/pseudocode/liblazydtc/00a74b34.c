/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74b34
 */

undefined8 EVP_PKEY_fromdata_settable(undefined4 *param_1,undefined4 param_2)

{
  undefined8 uVar1;
  
  if (param_1 != (undefined4 *)0x0) {
    if (*(long *)(param_1 + 6) != 0) {
      evp_pkey_ctx_free_old_ops(param_1);
      if (*(long *)(param_1 + 8) != 0) {
        *param_1 = 0;
        uVar1 = evp_keymgmt_import_types(*(long *)(param_1 + 8),param_2);
        return uVar1;
      }
    }
    *param_1 = 0;
  }
  ERR_new();
  ERR_set_debug("crypto/evp/pmeth_gn.c",0x162,"fromdata_init");
  ERR_set_error(6,0x96,0);
  return 0;
}

