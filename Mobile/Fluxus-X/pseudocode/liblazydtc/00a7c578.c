/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7c578
 */

undefined8 ossl_ffc_params_fromdata(long param_1,undefined8 param_2)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined4 local_5c;
  BIGNUM *local_58;
  BIGNUM *local_50;
  BIGNUM *local_48;
  BIGNUM *local_38;
  
  local_38 = (BIGNUM *)0x0;
  local_50 = (BIGNUM *)0x0;
  local_48 = (BIGNUM *)0x0;
  local_58 = (BIGNUM *)0x0;
  if (param_1 == 0) {
    return 0;
  }
  lVar2 = OSSL_PARAM_locate_const(param_2,"group");
  if ((lVar2 == 0) ||
     ((((*(int *)(lVar2 + 8) == 4 && (*(long *)(lVar2 + 0x10) != 0)) &&
       (lVar2 = ossl_ffc_name_to_dh_named_group(), lVar2 != 0)) &&
      (iVar1 = ossl_ffc_named_group_set(param_1,lVar2), iVar1 != 0)))) {
    lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002a38e7);
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002d92e5);
    lVar4 = OSSL_PARAM_locate_const(param_2,&DAT_002cf3b1);
    if ((((lVar2 == 0) || (iVar1 = OSSL_PARAM_get_BN(lVar2,&local_38), iVar1 != 0)) &&
        ((lVar4 == 0 || (iVar1 = OSSL_PARAM_get_BN(lVar4,&local_48), iVar1 != 0)))) &&
       ((lVar3 == 0 || (iVar1 = OSSL_PARAM_get_BN(lVar3,&local_50), iVar1 != 0)))) {
      lVar2 = OSSL_PARAM_locate_const(param_2,"gindex");
      if (lVar2 != 0) {
        iVar1 = OSSL_PARAM_get_int(lVar2,&local_5c);
        if (iVar1 == 0) goto LAB_00a7c838;
        *(undefined4 *)(param_1 + 0x38) = local_5c;
      }
      lVar2 = OSSL_PARAM_locate_const(param_2,"pcounter");
      if (lVar2 != 0) {
        iVar1 = OSSL_PARAM_get_int(lVar2,&local_5c);
        if (iVar1 == 0) goto LAB_00a7c838;
        *(undefined4 *)(param_1 + 0x30) = local_5c;
      }
      lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002d9a61);
      if ((lVar2 == 0) || (iVar1 = OSSL_PARAM_get_BN(lVar2,&local_58), iVar1 != 0)) {
        lVar2 = OSSL_PARAM_locate_const(param_2,"hindex");
        if (lVar2 != 0) {
          iVar1 = OSSL_PARAM_get_int(lVar2,&local_5c);
          if (iVar1 == 0) goto LAB_00a7c838;
          *(undefined4 *)(param_1 + 0x3c) = local_5c;
        }
        lVar2 = OSSL_PARAM_locate_const(param_2,&DAT_002bb864);
        if ((lVar2 == 0) ||
           ((*(int *)(lVar2 + 8) == 5 &&
            (iVar1 = ossl_ffc_params_set_seed
                               (param_1,*(undefined8 *)(lVar2 + 0x10),*(undefined8 *)(lVar2 + 0x18))
            , iVar1 != 0)))) {
          lVar2 = OSSL_PARAM_locate_const(param_2,"validate-pq");
          if (lVar2 != 0) {
            iVar1 = OSSL_PARAM_get_int(lVar2,&local_5c);
            if (iVar1 == 0) goto LAB_00a7c838;
            ossl_ffc_params_enable_flags(param_1,1,local_5c);
          }
          lVar2 = OSSL_PARAM_locate_const(param_2,"validate-g");
          if (lVar2 != 0) {
            iVar1 = OSSL_PARAM_get_int(lVar2,&local_5c);
            if (iVar1 == 0) goto LAB_00a7c838;
            ossl_ffc_params_enable_flags(param_1,2,local_5c);
          }
          lVar2 = OSSL_PARAM_locate_const(param_2,"validate-legacy");
          if (lVar2 != 0) {
            iVar1 = OSSL_PARAM_get_int(lVar2,&local_5c);
            if (iVar1 == 0) goto LAB_00a7c838;
            ossl_ffc_params_enable_flags(param_1,4,local_5c);
          }
          lVar2 = OSSL_PARAM_locate_const(param_2,"digest");
          if (lVar2 == 0) {
LAB_00a7c814:
            ossl_ffc_params_set0_pqg(param_1,local_38,local_48,local_50);
            ossl_ffc_params_set0_j(param_1,local_58);
            return 1;
          }
          if (*(int *)(lVar2 + 8) == 4) {
            lVar3 = OSSL_PARAM_locate_const(param_2,"properties");
            if (lVar3 == 0) {
              uVar5 = 0;
            }
            else {
              if (*(int *)(lVar3 + 8) != 4) goto LAB_00a7c838;
              uVar5 = *(undefined8 *)(lVar3 + 0x10);
            }
            iVar1 = ossl_ffc_set_digest(param_1,*(undefined8 *)(lVar2 + 0x10),uVar5);
            if (iVar1 != 0) goto LAB_00a7c814;
          }
        }
      }
    }
  }
LAB_00a7c838:
  BN_free(local_58);
  BN_free(local_38);
  BN_free(local_48);
  BN_free(local_50);
  return 0;
}

