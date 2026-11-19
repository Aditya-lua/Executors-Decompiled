/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a71f78
 */

undefined8 FUN_00a71f78(undefined4 param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  char *__s;
  EC_KEY *key;
  EC_GROUP *group;
  size_t sVar2;
  undefined8 uVar3;
  
  uVar3 = *(undefined8 *)(param_3 + 0x20);
  *(undefined8 *)(param_3 + 0x20) = 0;
  iVar1 = EVP_PKEY_get_base_id(uVar3);
  if (iVar1 == 0x198) {
    key = (EC_KEY *)EVP_PKEY_get0_EC_KEY(uVar3);
    group = EC_KEY_get0_group(key);
    if ((group != (EC_GROUP *)0x0) && (iVar1 = EC_GROUP_get_curve_name(group), iVar1 != 0)) {
      __s = (char *)OSSL_EC_curve_nid2name();
      *(char **)(param_3 + 0x20) = __s;
      goto joined_r0x00a71ffc;
    }
  }
  else {
    if (iVar1 != 0x1c) {
      ERR_new();
      ERR_set_debug("crypto/evp/ctrl_params_translate.c",0x60c,"get_payload_group_name");
      ERR_set_error(6,0xe0,0);
      return 0;
    }
    EVP_PKEY_get0_DH(uVar3);
    iVar1 = DH_get_nid();
    if (iVar1 != 0) {
      ossl_ffc_uid_to_dh_named_group();
      __s = (char *)ossl_ffc_named_group_get_name();
      *(char **)(param_3 + 0x20) = __s;
      goto joined_r0x00a71ffc;
    }
  }
  __s = *(char **)(param_3 + 0x20);
joined_r0x00a71ffc:
  if (__s == (char *)0x0) {
    return 1;
  }
  sVar2 = strlen(__s);
  *(int *)(param_3 + 0x1c) = (int)sVar2;
  uVar3 = FUN_00a6fd84(param_1,param_2,param_3);
  return uVar3;
}

