/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65f24
 */

undefined8 evp_keymgmt_util_copy(long param_1,long param_2,undefined4 param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  long local_58;
  long local_50;
  undefined4 local_48;
  
  if (param_2 == 0) {
    return 0;
  }
  if (*(long *)(param_2 + 0x68) == 0) {
    return 0;
  }
  lVar2 = *(long *)(param_2 + 0x60);
  lVar6 = *(long *)(param_1 + 0x60);
  lVar5 = *(long *)(param_1 + 0x68);
  lVar3 = lVar2;
  if ((((lVar6 == 0) || (lVar3 = lVar6, lVar6 == lVar2)) && (lVar6 = lVar3, lVar5 == 0)) &&
     (*(long *)(lVar2 + 0xd8) != 0)) {
    lVar3 = evp_keymgmt_dup(lVar2,*(long *)(param_2 + 0x68),param_3);
    if (lVar3 == 0) {
      return 0;
    }
    lVar5 = *(long *)(param_1 + 0x60);
    lVar2 = lVar3;
  }
  else {
    uVar4 = EVP_KEYMGMT_get0_name();
    iVar1 = EVP_KEYMGMT_is_a(lVar6,uVar4);
    if (iVar1 == 0) {
      ERR_new();
      ERR_set_debug("crypto/evp/keymgmt_lib.c",0x1ed,"evp_keymgmt_util_copy");
      ERR_set_error(6,0x65,0);
      return 0;
    }
    local_58 = lVar6;
    local_50 = lVar5;
    local_48 = param_3;
    uVar4 = evp_keymgmt_export(*(undefined8 *)(param_2 + 0x60),*(undefined8 *)(param_2 + 0x68),
                               param_3,evp_keymgmt_util_try_import,&local_58);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    lVar3 = local_50;
    lVar2 = local_50;
    if (lVar5 != 0) {
      lVar3 = 0;
      lVar2 = lVar5;
    }
    lVar5 = *(long *)(param_1 + 0x60);
  }
  if ((lVar5 == 0) && (iVar1 = EVP_PKEY_set_type_by_keymgmt(param_1,lVar6), iVar1 == 0)) {
    evp_keymgmt_freedata(lVar6,lVar3);
    return 0;
  }
  *(long *)(param_1 + 0x68) = lVar2;
  evp_keymgmt_util_cache_keyinfo(param_1);
  return 1;
}

