/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65c8c
 */

long evp_keymgmt_util_fromdata(long param_1,long param_2,undefined4 param_3,undefined8 param_4)

{
  int iVar1;
  long lVar2;
  
  lVar2 = evp_keymgmt_newdata(param_2);
  if ((lVar2 != 0) && (iVar1 = evp_keymgmt_import(param_2,lVar2,param_3,param_4), iVar1 != 0)) {
    if ((param_1 != 0) &&
       ((param_2 != 0 && (iVar1 = EVP_PKEY_set_type_by_keymgmt(param_1,param_2), iVar1 != 0)))) {
      *(long *)(param_1 + 0x68) = lVar2;
      evp_keymgmt_util_cache_keyinfo(param_1);
      return lVar2;
    }
    ERR_new();
    ERR_set_debug("crypto/evp/keymgmt_lib.c",0x41,"evp_keymgmt_util_assign_pkey");
    ERR_set_error(6,0xc0103,0);
  }
  evp_keymgmt_freedata(param_2,lVar2);
  return 0;
}

