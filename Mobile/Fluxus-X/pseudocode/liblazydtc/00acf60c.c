/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acf60c
 */

undefined8
ossl_rsa_pss_params_30_fromdata(long param_1,int *param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  ulong local_68;
  
  if (param_1 == 0) {
    return 0;
  }
  lVar3 = OSSL_PARAM_locate_const(param_3,"properties");
  lVar4 = OSSL_PARAM_locate_const(param_3,"digest");
  lVar5 = OSSL_PARAM_locate_const(param_3,&DAT_002ae5ea);
  lVar6 = OSSL_PARAM_locate_const(param_3,"mgf1-digest");
  lVar7 = OSSL_PARAM_locate_const(param_3,"saltlen");
  if (lVar3 == 0) {
    uVar10 = 0;
    if (*param_2 == 0) goto LAB_00acf6fc;
joined_r0x00acf728:
    if (lVar5 != 0) {
      uVar1 = ossl_rsa_pss_params_30_maskgenalg(0);
      local_68 = 0;
      if (*(int *)(lVar5 + 8) == 4) {
        uVar11 = *(ulong *)(lVar5 + 0x10);
        local_68 = uVar11;
      }
      else {
        iVar2 = OSSL_PARAM_get_utf8_ptr(lVar5,&local_68);
        if (iVar2 == 0) {
          return 0;
        }
        uVar11 = *(ulong *)(lVar5 + 0x10);
      }
      uVar8 = ossl_rsa_mgf_nid2name(uVar1);
      iVar2 = OPENSSL_strcasecmp(uVar11,uVar8);
      if (iVar2 != 0) {
        return 0;
      }
    }
    if (lVar4 == 0) {
      lVar3 = 0;
joined_r0x00acf78c:
      if (lVar6 == 0) {
        lVar9 = 0;
joined_r0x00acf83c:
        if ((lVar7 == 0) ||
           ((iVar2 = OSSL_PARAM_get_int(lVar7,&local_68), iVar2 != 0 &&
            (iVar2 = ossl_rsa_pss_params_30_set_saltlen(param_1,local_68 & 0xffffffff), iVar2 != 0))
           )) goto LAB_00acf860;
      }
      else {
        local_68 = 0;
        if (*(int *)(lVar6 + 8) == 4) {
          local_68 = *(ulong *)(lVar6 + 0x10);
        }
        else {
          iVar2 = OSSL_PARAM_get_utf8_ptr(lVar5,&local_68);
          if (iVar2 == 0) goto LAB_00acf86c;
        }
        lVar9 = EVP_MD_fetch(param_4,local_68,uVar10);
        if (lVar9 != 0) {
          uVar1 = ossl_rsa_oaeppss_md2nid(lVar9);
          iVar2 = ossl_rsa_pss_params_30_set_maskgenhashalg(param_1,uVar1);
          if (iVar2 != 0) goto joined_r0x00acf83c;
        }
      }
    }
    else {
      local_68 = 0;
      if (*(int *)(lVar4 + 8) == 4) {
        local_68 = *(ulong *)(lVar4 + 0x10);
LAB_00acf7b0:
        lVar3 = EVP_MD_fetch(param_4,local_68,uVar10);
        if (lVar3 != 0) {
          uVar1 = ossl_rsa_oaeppss_md2nid(lVar3);
          iVar2 = ossl_rsa_pss_params_30_set_hashalg(param_1,uVar1);
          if (iVar2 != 0) goto joined_r0x00acf78c;
        }
      }
      else {
        iVar2 = OSSL_PARAM_get_utf8_ptr(lVar5,&local_68);
        if (iVar2 != 0) goto LAB_00acf7b0;
        lVar3 = 0;
      }
LAB_00acf86c:
      lVar9 = 0;
    }
    uVar10 = 0;
  }
  else {
    uVar10 = 0;
    if (*(int *)(lVar3 + 8) == 4) {
      uVar10 = *(undefined8 *)(lVar3 + 0x10);
    }
    if (*param_2 != 0) goto joined_r0x00acf728;
LAB_00acf6fc:
    if (((lVar4 != 0) || (lVar5 != 0)) || (lVar6 != 0)) {
LAB_00acf714:
      iVar2 = ossl_rsa_pss_params_30_set_defaults(param_1);
      if (iVar2 == 0) {
        return 0;
      }
      *param_2 = 1;
      goto joined_r0x00acf728;
    }
    lVar9 = 0;
    lVar3 = 0;
    if (lVar7 != 0) goto LAB_00acf714;
LAB_00acf860:
    uVar10 = 1;
  }
  EVP_MD_free(lVar3);
  EVP_MD_free(lVar9);
  return uVar10;
}

