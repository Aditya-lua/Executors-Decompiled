/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b5f504
 */

undefined8 FUN_00b5f504(long param_1,undefined8 param_2)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  char *pcVar9;
  undefined1 auStack_110 [128];
  undefined1 auStack_90 [24];
  undefined1 auStack_78 [56];
  undefined8 local_38;
  
  if (param_1 == 0) {
    return 0;
  }
  lVar6 = OSSL_PARAM_locate(param_2,"algorithm-id");
  if (lVar6 != 0) {
    iVar2 = WPACKET_init_der(auStack_78,auStack_110,0x80);
    if (iVar2 == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/signature/rsa_sig.c",0xe9,
                    "rsa_generate_signature_aid");
      ERR_set_error(0x39,0xc0100,0);
      return 0;
    }
    if (*(int *)(param_1 + 0x68) == 6) {
      iVar2 = *(int *)(param_1 + 0xb0);
      if (iVar2 == -1) {
        iVar2 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x20));
      }
      else if (iVar2 + 3U < 2) {
        iVar3 = RSA_size(*(RSA **)(param_1 + 0x10));
        iVar4 = EVP_MD_get_size(*(undefined8 *)(param_1 + 0x20));
        uVar5 = RSA_bits(*(undefined8 *)(param_1 + 0x10));
        iVar2 = -3;
        if ((uVar5 & 7) != 1) {
          iVar2 = -2;
        }
        iVar2 = (iVar3 - iVar4) + iVar2;
      }
      if (iVar2 < 0) {
        ERR_new();
        pcVar9 = "rsa_pss_compute_saltlen";
        uVar8 = 0xd2;
LAB_00b5f794:
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",uVar8,pcVar9);
        ERR_set_error(0x39,0xc0103,0);
      }
      else {
        if (*(int *)(param_1 + 0xb4) <= iVar2) {
          iVar3 = ossl_rsa_pss_params_30_set_defaults(auStack_90);
          if ((((iVar3 != 0) &&
               (iVar3 = ossl_rsa_pss_params_30_set_hashalg
                                  (auStack_90,*(undefined4 *)(param_1 + 0x30)), iVar3 != 0)) &&
              (iVar3 = ossl_rsa_pss_params_30_set_maskgenhashalg
                                 (auStack_90,*(undefined4 *)(param_1 + 0x78)), iVar3 != 0)) &&
             ((iVar2 = ossl_rsa_pss_params_30_set_saltlen(auStack_90,iVar2), iVar2 != 0 &&
              (iVar2 = ossl_DER_w_algorithmIdentifier_RSA_PSS
                                 (auStack_78,0xffffffff,0x1000,auStack_90), iVar2 != 0))))
          goto LAB_00b5f580;
          ERR_new();
          pcVar9 = "rsa_generate_signature_aid";
          uVar8 = 0x108;
          goto LAB_00b5f794;
        }
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0xd5,"rsa_pss_compute_saltlen"
                     );
        ERR_set_error(0x39,0xac,"minimum salt length: %d, actual salt length: %d",
                      *(undefined4 *)(param_1 + 0xb4),iVar2);
      }
LAB_00b5f7ac:
      lVar7 = 0;
    }
    else {
      if (*(int *)(param_1 + 0x68) != 1) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x10d,
                      "rsa_generate_signature_aid");
        uVar1 = *(undefined4 *)(param_1 + 0x68);
        pcVar9 = "Algorithm ID generation - pad mode: %d";
LAB_00b5f680:
        ERR_set_error(0x39,0x8010c,pcVar9,uVar1);
        goto LAB_00b5f7ac;
      }
      iVar2 = ossl_DER_w_algorithmIdentifier_MDWithRSAEncryption
                        (auStack_78,0xffffffff,*(undefined4 *)(param_1 + 0x30));
      if (iVar2 < 1) {
        ERR_new();
        pcVar9 = "rsa_generate_signature_aid";
        if (iVar2 == 0) {
          uVar8 = 0xf5;
          goto LAB_00b5f794;
        }
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0xf8,
                      "rsa_generate_signature_aid");
        uVar1 = *(undefined4 *)(param_1 + 0x30);
        pcVar9 = "Algorithm ID generation - md NID: %d";
        goto LAB_00b5f680;
      }
LAB_00b5f580:
      iVar2 = WPACKET_finish(auStack_78);
      if (iVar2 == 0) goto LAB_00b5f7ac;
      WPACKET_get_total_written(auStack_78,&local_38);
      lVar7 = WPACKET_get_curr(auStack_78);
    }
    WPACKET_cleanup(auStack_78);
    if (lVar7 == 0) {
      return 0;
    }
    iVar2 = OSSL_PARAM_set_octet_string(lVar6,lVar7,local_38);
    if (iVar2 == 0) {
      return 0;
    }
  }
  lVar6 = OSSL_PARAM_locate(param_2,"pad-mode");
  if (lVar6 != 0) {
    if (*(int *)(lVar6 + 8) == 1) {
      iVar2 = OSSL_PARAM_set_int(lVar6,*(undefined4 *)(param_1 + 0x68));
    }
    else {
      if (*(int *)(lVar6 + 8) != 4) {
        return 0;
      }
      uVar5 = *(int *)(param_1 + 0x68) - 1;
      if ((5 < uVar5) || ((0x35U >> (ulong)(uVar5 & 0x1f) & 1) == 0)) {
        ERR_new();
        ERR_set_debug("providers/implementations/signature/rsa_sig.c",0x438,"rsa_get_ctx_params");
        ERR_set_error(0x39,0xc0103,0);
        goto LAB_00b5f85c;
      }
      iVar2 = OSSL_PARAM_set_utf8_string
                        (lVar6,(&PTR_s_pkcs1_00ca5a38)
                               [*(long *)(&DAT_0077c2d0 + (long)(int)uVar5 * 8) * 2]);
    }
    if (iVar2 == 0) {
      return 0;
    }
  }
LAB_00b5f85c:
  lVar6 = OSSL_PARAM_locate(param_2,"digest");
  if ((lVar6 != 0) && (iVar2 = OSSL_PARAM_set_utf8_string(lVar6,param_1 + 0x34), iVar2 == 0)) {
    return 0;
  }
  lVar6 = OSSL_PARAM_locate(param_2,"mgf1-digest");
  if ((lVar6 != 0) && (iVar2 = OSSL_PARAM_set_utf8_string(lVar6,param_1 + 0x7c), iVar2 == 0)) {
    return 0;
  }
  lVar6 = OSSL_PARAM_locate(param_2,"saltlen");
  if (lVar6 != 0) {
    if (*(int *)(lVar6 + 8) == 4) {
      if (*(uint *)(param_1 + 0xb0) < 0xfffffffd) {
        iVar2 = BIO_snprintf(*(char **)(lVar6 + 0x10),*(size_t *)(lVar6 + 0x18),"%d");
        if (0 < iVar2) {
          *(long *)(lVar6 + 0x20) = (long)iVar2;
          return 1;
        }
      }
      else {
        iVar2 = OSSL_PARAM_set_utf8_string
                          (lVar6,(&PTR_DAT_00ca5d50)[(int)(*(uint *)(param_1 + 0xb0) + 3)]);
        if (iVar2 != 0) {
          return 1;
        }
      }
      return 0;
    }
    if ((*(int *)(lVar6 + 8) == 1) &&
       (iVar2 = OSSL_PARAM_set_int(lVar6,*(undefined4 *)(param_1 + 0xb0)), iVar2 == 0)) {
      return 0;
    }
  }
  return 1;
}

