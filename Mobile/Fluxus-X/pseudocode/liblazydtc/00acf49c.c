/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acf49c
 */

ulong ossl_rsa_pss_params_30_todata(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  int iVar2;
  int iVar3;
  undefined4 uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  
  iVar1 = ossl_rsa_pss_params_30_is_unrestricted();
  if (iVar1 == 0) {
    iVar1 = ossl_rsa_pss_params_30_hashalg(param_1);
    iVar2 = ossl_rsa_pss_params_30_maskgenalg(param_1);
    iVar3 = ossl_rsa_pss_params_30_maskgenhashalg(param_1);
    uVar4 = ossl_rsa_pss_params_30_saltlen(param_1);
    iVar5 = ossl_rsa_pss_params_30_hashalg(0);
    iVar6 = ossl_rsa_pss_params_30_maskgenalg(0);
    iVar7 = ossl_rsa_pss_params_30_maskgenhashalg(0);
    lVar10 = 0;
    if (iVar1 != iVar5) {
      lVar10 = ossl_rsa_oaeppss_nid2name(iVar1);
    }
    lVar11 = 0;
    if (iVar2 != iVar6) {
      lVar11 = ossl_rsa_oaeppss_nid2name(iVar2);
    }
    lVar9 = 0;
    if (iVar3 != iVar7) {
      lVar9 = ossl_rsa_oaeppss_nid2name(iVar3);
    }
    if ((((lVar10 == 0) ||
         (uVar8 = ossl_param_build_set_utf8_string(param_2,param_3,"digest",lVar10), (int)uVar8 != 0
         )) && ((lVar11 == 0 ||
                (uVar8 = ossl_param_build_set_utf8_string(param_2,param_3,&DAT_002ae5ea,lVar11),
                (int)uVar8 != 0)))) &&
       ((lVar9 == 0 ||
        (uVar8 = ossl_param_build_set_utf8_string(param_2,param_3,"mgf1-digest",lVar9),
        (int)uVar8 != 0)))) {
      iVar1 = ossl_param_build_set_int(param_2,param_3,"saltlen",uVar4);
      uVar8 = (ulong)(iVar1 != 0);
    }
  }
  else {
    uVar8 = 1;
  }
  return uVar8;
}

