/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a655c4
 */

undefined8 evp_keymgmt_util_assign_pkey(long param_1,long param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  if ((((param_1 == 0) || (param_2 == 0)) || (param_3 == 0)) ||
     (iVar1 = EVP_PKEY_set_type_by_keymgmt(), iVar1 == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/keymgmt_lib.c",0x41,"evp_keymgmt_util_assign_pkey");
    ERR_set_error(6,0xc0103,0);
    uVar2 = 0;
  }
  else {
    *(long *)(param_1 + 0x68) = param_3;
    evp_keymgmt_util_cache_keyinfo(param_1);
    uVar2 = 1;
  }
  return uVar2;
}

