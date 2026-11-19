/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5ffd4
 */

ulong FUN_00b5ffd4(undefined8 *param_1,RSA *param_2,undefined8 param_3,undefined4 param_4)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  int iVar5;
  uint uVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  long lVar10;
  undefined8 uVar11;
  char *pcVar12;
  
  iVar1 = ossl_prov_is_running();
  if (param_1 == (undefined8 *)0x0) {
    return 0;
  }
  if (iVar1 == 0) {
    return 0;
  }
  if (param_2 == (RSA *)0x0) {
    param_2 = (RSA *)param_1[2];
    if (param_2 != (RSA *)0x0) goto LAB_00b60048;
    ERR_new(0);
    ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x18b,"rsa_signverify_init");
    uVar8 = 0x39;
    uVar11 = 0x72;
LAB_00b600fc:
    pcVar12 = (char *)0x0;
LAB_00b60100:
    ERR_set_error(uVar8,uVar11,pcVar12);
    uVar7 = 0;
  }
  else {
    uVar7 = ossl_rsa_check_key(*param_1,param_2,param_4);
    if ((int)uVar7 == 0) {
      return uVar7;
    }
    iVar1 = RSA_up_ref(param_2);
    if (iVar1 == 0) {
      return 0;
    }
    RSA_free((RSA *)param_1[2]);
    param_1[2] = param_2;
LAB_00b60048:
    *(undefined4 *)(param_1 + 3) = param_4;
    param_1[0x16] = 0xfffffffffffffffe;
    iVar1 = RSA_test_flags(param_2,0xf000);
    if (iVar1 == 0x1000) {
      *(undefined4 *)(param_1 + 0xd) = 6;
      uVar8 = ossl_rsa_get0_pss_params_30(param_1[2]);
      iVar1 = ossl_rsa_pss_params_30_is_unrestricted();
      if (iVar1 == 0) {
        uVar2 = ossl_rsa_pss_params_30_hashalg(uVar8);
        uVar3 = ossl_rsa_pss_params_30_maskgenhashalg(uVar8);
        iVar1 = ossl_rsa_pss_params_30_saltlen(uVar8);
        lVar9 = ossl_rsa_oaeppss_nid2name(uVar2);
        lVar10 = ossl_rsa_oaeppss_nid2name(uVar3);
        if (lVar9 == 0) {
          ERR_new();
          ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x1b5,"rsa_signverify_init")
          ;
          pcVar12 = "PSS restrictions lack hash algorithm";
        }
        else if (lVar10 == 0) {
          ERR_new();
          ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x1ba,"rsa_signverify_init")
          ;
          pcVar12 = "PSS restrictions lack MGF1 hash algorithm";
        }
        else {
          uVar7 = OPENSSL_strlcpy((long)param_1 + 0x34,lVar9,0x32);
          if (uVar7 < 0x32) {
            uVar7 = OPENSSL_strlcpy((long)param_1 + 0x7c,lVar10,0x32);
            if (uVar7 < 0x32) {
              *(int *)(param_1 + 0x16) = iVar1;
              uVar7 = FUN_00b602e8(param_1,lVar10,param_1[1]);
              if ((int)uVar7 == 0) {
                return uVar7;
              }
              uVar7 = FUN_00b60444(param_1,lVar9,param_1[1]);
              if ((int)uVar7 == 0) {
                return uVar7;
              }
              if (*(int *)(param_1 + 0xd) == 6) {
                iVar4 = RSA_size((RSA *)param_1[2]);
                iVar5 = EVP_MD_get_size(param_1[4]);
                uVar6 = RSA_bits(param_1[2]);
                if ((iVar1 < 0) || ((int)((iVar4 - iVar5) - (uint)((uVar6 & 7) == 1)) < iVar1)) {
                  ERR_new();
                  ERR_set_debug("providers/implementations/signature/rsa_sig.c",0xa5,
                                "rsa_check_parameters");
                  uVar8 = 0x39;
                  uVar11 = 0x70;
                  goto LAB_00b600fc;
                }
                *(int *)((long)param_1 + 0xb4) = iVar1;
              }
              goto LAB_00b60098;
            }
            ERR_new();
            ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x1c9,
                          "rsa_signverify_init");
            pcVar12 = "MGF1 hash algorithm name too long";
          }
          else {
            ERR_new();
            ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x1c2,
                          "rsa_signverify_init");
            pcVar12 = "hash algorithm name too long";
          }
        }
        uVar8 = 0x39;
        uVar11 = 0x7a;
        goto LAB_00b60100;
      }
    }
    else {
      if (iVar1 != 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x1d9,"rsa_signverify_init");
        uVar8 = 4;
        uVar11 = 0xb2;
        goto LAB_00b600fc;
      }
      *(undefined4 *)(param_1 + 0xd) = 1;
    }
LAB_00b60098:
    iVar1 = FUN_00b5f984(param_1,param_3);
    uVar7 = (ulong)(iVar1 != 0);
  }
  return uVar7;
}

