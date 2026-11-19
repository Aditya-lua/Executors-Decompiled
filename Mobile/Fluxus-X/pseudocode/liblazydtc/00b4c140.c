/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4c140
 */

DH * FUN_00b4c140(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  DH *dh;
  long *plVar3;
  long lVar4;
  BN_GENCB *cb;
  
  iVar1 = ossl_prov_is_running();
  if (param_1 == (undefined8 *)0x0) {
    return (DH *)0x0;
  }
  if (iVar1 == 0) {
    return (DH *)0x0;
  }
  iVar1 = *(int *)((long)param_1 + 0x14);
  if (iVar1 != 0) {
    *(undefined4 *)((long)param_1 + 0x3c) = 3;
    if (param_1[1] != 0) goto LAB_00b4c1e0;
LAB_00b4c188:
    if (iVar1 == 0) {
      iVar1 = ossl_dh_get_named_group_uid_from_size(*(undefined4 *)(param_1 + 3));
      *(int *)((long)param_1 + 0x14) = iVar1;
      if (iVar1 == 0) {
        return (DH *)0x0;
      }
    }
    dh = (DH *)ossl_dh_new_by_nid_ex(*param_1,iVar1);
    if (dh == (DH *)0x0) {
      return (DH *)0x0;
    }
    plVar3 = (long *)ossl_dh_get0_params(dh);
    iVar1 = 0;
    cb = (BN_GENCB *)0x0;
    goto LAB_00b4c314;
  }
  if ((*(int *)((long)param_1 + 0x3c) == 3) && (param_1[1] == 0)) goto LAB_00b4c188;
LAB_00b4c1e0:
  dh = (DH *)ossl_dh_new_ex(*param_1);
  if (dh == (DH *)0x0) {
    return (DH *)0x0;
  }
  plVar3 = (long *)ossl_dh_get0_params(dh);
  if (((param_1[1] == 0) || (iVar1 = ossl_ffc_params_copy(plVar3), iVar1 != 0)) &&
     (iVar1 = ossl_ffc_params_set_seed(plVar3,param_1[5],param_1[6]), iVar1 != 0)) {
    if (*(int *)(param_1 + 7) == -1) {
      if (*(int *)(param_1 + 9) != 0) {
        ossl_ffc_params_set_h(plVar3);
      }
LAB_00b4c264:
      lVar4 = param_1[10];
    }
    else {
      ossl_ffc_params_set_gindex(plVar3);
      if (*(int *)((long)param_1 + 0x44) == -1) goto LAB_00b4c264;
      ossl_ffc_params_set_pcounter(plVar3);
      lVar4 = param_1[10];
    }
    if ((lVar4 != 0) && (iVar1 = ossl_ffc_set_digest(plVar3,lVar4,param_1[0xb]), iVar1 == 0))
    goto LAB_00b4c2b4;
    param_1[0xc] = param_2;
    param_1[0xd] = param_3;
    cb = (BN_GENCB *)BN_GENCB_new();
    if (cb != (BN_GENCB *)0x0) {
      BN_GENCB_set(cb,FUN_00b4d004,param_1);
    }
    if ((*(byte *)(param_1 + 2) >> 2 & 1) == 0) {
      iVar1 = 0;
LAB_00b4c314:
      if ((*(byte *)(param_1 + 2) & 3) == 0) {
LAB_00b4c36c:
        DH_clear_flags(dh,0xf000);
        DH_set_flags(dh,*(undefined4 *)(param_1 + 0xe));
        goto LAB_00b4c390;
      }
      if ((*plVar3 != 0) && (plVar3[2] != 0)) {
        if (0 < *(int *)((long)param_1 + 0x4c)) {
          DH_set_length(dh);
        }
        ossl_ffc_params_enable_flags(plVar3,4,*(int *)((long)param_1 + 0x3c) == 1);
        iVar2 = DH_generate_key(dh);
        if (0 < iVar2) goto LAB_00b4c36c;
      }
      if (0 < iVar1) goto LAB_00b4c390;
    }
    else {
      if (*(int *)((long)param_1 + 0x3c) == 0) {
        iVar1 = DH_generate_parameters_ex(dh,*(int *)(param_1 + 3),*(int *)(param_1 + 8),cb);
      }
      else {
        iVar1 = ossl_dh_generate_ffc_parameters
                          (dh,*(int *)((long)param_1 + 0x3c),*(int *)(param_1 + 3),
                           *(undefined4 *)(param_1 + 4),cb);
      }
      if (0 < iVar1) goto LAB_00b4c314;
    }
  }
  else {
LAB_00b4c2b4:
    cb = (BN_GENCB *)0x0;
  }
  DH_free(dh);
  dh = (DH *)0x0;
LAB_00b4c390:
  BN_GENCB_free(cb);
  return dh;
}

