/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a71088
 */

undefined8 FUN_00a71088(int param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  uVar2 = FUN_00a70a34();
  if ((int)uVar2 < 1) {
    return uVar2;
  }
  if (*(int *)(param_3 + 8) != 2) {
    return 0;
  }
  if (param_1 == 4) {
    if (*(char **)(param_3 + 0x20) == (char *)0x0) {
      return 0;
    }
    iVar1 = atoi(*(char **)(param_3 + 0x20));
    ossl_ffc_uid_to_dh_named_group(iVar1);
    lVar3 = ossl_ffc_named_group_get_name();
    *(long *)(param_3 + 0x20) = lVar3;
    if (lVar3 == 0) {
      ERR_new();
      uVar2 = 0x419;
LAB_00a7115c:
      ERR_set_debug("crypto/evp/ctrl_params_translate.c",uVar2,"fix_dh_nid5114");
      ERR_set_error(6,0xde,0);
      return 0;
    }
  }
  else {
    if (param_1 != 1) goto LAB_00a71128;
    ossl_ffc_uid_to_dh_named_group(*(undefined4 *)(param_3 + 0x1c));
    lVar3 = ossl_ffc_named_group_get_name();
    *(long *)(param_3 + 0x20) = lVar3;
    if (lVar3 == 0) {
      ERR_new();
      uVar2 = 0x40d;
      goto LAB_00a7115c;
    }
  }
  *(undefined4 *)(param_3 + 0x1c) = 0;
LAB_00a71128:
  uVar2 = FUN_00a6fd84(param_1,param_2,param_3);
  return uVar2;
}

