/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aec300
 */

ulong ossl_store_handle_load_result(undefined8 param_1,long *param_2)

{
  int iVar1;
  ulong uVar2;
  bool bVar3;
  int iVar4;
  uint uVar5;
  ulong uVar6;
  undefined8 uVar7;
  long lVar8;
  ulong uVar9;
  char *pcVar10;
  char *ptr;
  PKCS12 *p12;
  X509 *pXVar11;
  X509_CRL *a;
  undefined8 uVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  X509 *pXVar16;
  X509_SIG *a_00;
  PKCS8_PRIV_KEY_INFO *a_01;
  code *pcVar17;
  undefined8 uVar18;
  X509 **pass;
  uchar *len;
  uchar *puVar19;
  long lVar20;
  uint local_530 [2];
  long local_528;
  undefined8 uStack_520;
  char *local_518;
  uchar *local_510;
  uchar *local_508;
  long local_500;
  undefined8 uStack_4f8;
  char *local_4f0;
  int local_4e4;
  uchar *local_4e0;
  undefined4 local_4d8;
  char *local_4d0;
  undefined8 local_4c8;
  undefined8 uStack_4c0;
  stack_st_X509 *local_490;
  X509 *local_488;
  EVP_PKEY *local_480;
  uchar *local_478;
  X509 *local_470;
  ulong local_468;
  undefined4 local_460;
  
  lVar20 = param_2[1];
  uVar6 = OSSL_STORE_LOADER_get0_provider(*(undefined8 *)(lVar20 + 8));
  uVar7 = ossl_provider_libctx();
  uVar18 = *(undefined8 *)(lVar20 + 0x30);
  memset(local_530,0,0x48);
  lVar8 = OSSL_PARAM_locate_const(param_1,&DAT_002cecd9);
  if ((lVar8 != 0) && (uVar9 = OSSL_PARAM_get_int(lVar8,local_530), (int)uVar9 == 0)) {
    return uVar9;
  }
  lVar8 = OSSL_PARAM_locate_const(param_1,"data-type");
  if ((lVar8 != 0) && (uVar9 = OSSL_PARAM_get_utf8_string_ptr(lVar8,&local_528), (int)uVar9 == 0)) {
    return uVar9;
  }
  lVar8 = OSSL_PARAM_locate_const(param_1,&DAT_002d167a);
  if (((lVar8 != 0) &&
      (iVar4 = OSSL_PARAM_get_octet_string_ptr(lVar8,&local_510,&local_508), iVar4 == 0)) &&
     (uVar9 = OSSL_PARAM_get_utf8_string_ptr(lVar8,&local_518), (int)uVar9 == 0)) {
    return uVar9;
  }
  lVar8 = OSSL_PARAM_locate_const(param_1,"data-structure");
  if ((lVar8 != 0) && (uVar9 = OSSL_PARAM_get_utf8_string_ptr(lVar8,&uStack_520), (int)uVar9 == 0))
  {
    return uVar9;
  }
  lVar8 = OSSL_PARAM_locate_const(param_1,"reference");
  if ((lVar8 != 0) &&
     (uVar9 = OSSL_PARAM_get_octet_string_ptr(lVar8,&local_500,&uStack_4f8), (int)uVar9 == 0)) {
    return uVar9;
  }
  lVar8 = OSSL_PARAM_locate_const(param_1,&DAT_002b649c);
  if ((lVar8 != 0) && (uVar9 = OSSL_PARAM_get_utf8_string_ptr(lVar8,&local_4f0), (int)uVar9 == 0)) {
    return uVar9;
  }
  ERR_set_mark();
  if ((*param_2 == 0) && (local_530[0] == 1)) {
    if (local_518 != (char *)0x0) {
      pcVar10 = CRYPTO_strdup(local_518,"crypto/store/store_result.c",0xa6);
      if (pcVar10 == (char *)0x0) {
        ptr = (char *)0x0;
      }
      else {
        if (local_4f0 == (char *)0x0) {
          ptr = (char *)0x0;
        }
        else {
          ptr = CRYPTO_strdup(local_4f0,"crypto/store/store_result.c",0xa8);
          if (ptr == (char *)0x0) goto LAB_00aec718;
        }
        lVar8 = OSSL_STORE_INFO_new_NAME(pcVar10);
        *param_2 = lVar8;
        if (lVar8 != 0) {
          OSSL_STORE_INFO_set0_NAME_description(lVar8,ptr);
          goto LAB_00aec4c8;
        }
      }
LAB_00aec718:
      CRYPTO_free(pcVar10);
      CRYPTO_free(ptr);
    }
    goto LAB_00aecb84;
  }
LAB_00aec4c8:
  ERR_pop_to_mark();
  ERR_set_mark();
  if (*param_2 == 0) {
    if (local_530[0] == 0) {
LAB_00aec7e0:
      if (local_510 == (uchar *)0x0) {
LAB_00aecd70:
        lVar8 = *param_2;
        pXVar16 = (X509 *)0x0;
      }
      else {
        local_4e0 = local_510;
        local_478 = local_508;
        local_470 = (X509 *)0x0;
        uVar5 = *(uint *)(lVar20 + 0x28);
        if ((uVar5 < 5) && ((0x1dU >> (ulong)(uVar5 & 0x1f) & 1) != 0)) {
          uVar12 = OSSL_DECODER_CTX_new_for_pkey
                             (&local_470,0,uStack_520,local_528,
                              *(undefined4 *)(&DAT_00777210 + (long)(int)uVar5 * 4),uVar7,uVar18);
          OSSL_DECODER_CTX_set_passphrase_cb(uVar12,ossl_pw_passphrase_callback_dec,lVar20 + 0x48);
          OSSL_DECODER_from_data(uVar12,&local_4e0,&local_478);
          OSSL_DECODER_CTX_free(uVar12);
        }
        len = local_508;
        pXVar16 = local_470;
        if (local_470 == (X509 *)0x0) {
          uVar5 = *(uint *)(lVar20 + 0x28);
          if ((uVar5 == 3) || (uVar5 == 0)) {
            local_4e0 = local_510;
            pXVar16 = (X509 *)d2i_PUBKEY_ex(0,&local_4e0,local_508,uVar7,uVar18);
            if (pXVar16 == (X509 *)0x0) {
              uVar5 = *(uint *)(lVar20 + 0x28);
              goto LAB_00aecbb0;
            }
            local_530[0] = 2;
            pcVar17 = OSSL_STORE_INFO_new_PUBKEY;
          }
          else {
LAB_00aecbb0:
            if ((uVar5 | 4) != 4) goto LAB_00aecd70;
            local_478 = (uchar *)0x0;
            local_4e0 = local_510;
            a_00 = d2i_X509_SIG((X509_SIG **)0x0,&local_4e0,(long)len);
            puVar19 = local_510;
            if (a_00 != (X509_SIG *)0x0) {
              local_480 = (EVP_PKEY *)0x0;
              iVar4 = ossl_pw_passphrase_callback_dec(&local_470,0x400,&local_480,0,lVar20 + 0x48);
              if (iVar4 == 0) {
                ERR_new();
                ERR_set_debug("crypto/store/store_result.c",0x155,"try_key_value_legacy");
                ERR_set_error(0x2c,0x73,0);
              }
              else {
                local_490 = (stack_st_X509 *)0x0;
                local_488 = (X509 *)0x0;
                local_4e4 = 0;
                X509_SIG_get0(a_00,&local_488,&local_490);
                PKCS12_pbe_crypt((X509_ALGOR *)local_488,(char *)&local_470,(int)local_480,
                                 (uchar *)(local_490->stack).data,(local_490->stack).num,&local_478,
                                 &local_4e4,0);
                len = (uchar *)(long)local_4e4;
                puVar19 = local_478;
              }
              X509_SIG_free(a_00);
            }
            if (puVar19 == (uchar *)0x0) {
LAB_00aecd44:
              pcVar17 = (code *)0x0;
              pXVar16 = (X509 *)0x0;
            }
            else {
              local_4e0 = puVar19;
              a_01 = d2i_PKCS8_PRIV_KEY_INFO((PKCS8_PRIV_KEY_INFO **)0x0,&local_4e0,(long)len);
              if (a_01 == (PKCS8_PRIV_KEY_INFO *)0x0) goto LAB_00aecd44;
              pXVar16 = (X509 *)EVP_PKCS82PKEY_ex(a_01,uVar7,uVar18);
              PKCS8_PRIV_KEY_INFO_free(a_01);
              pcVar17 = (code *)0x0;
              if (pXVar16 != (X509 *)0x0) {
                pcVar17 = OSSL_STORE_INFO_new_PKEY;
              }
            }
            CRYPTO_free(local_478);
            if (pXVar16 == (X509 *)0x0) goto LAB_00aecd70;
            local_530[0] = 2;
            if (pcVar17 == (code *)0x0) goto LAB_00aec87c;
          }
        }
        else {
LAB_00aec87c:
          local_530[0] = 2;
          iVar4 = evp_keymgmt_util_has(pXVar16,1);
          if (iVar4 == 0) {
            iVar4 = evp_keymgmt_util_has(pXVar16,2);
            pcVar17 = OSSL_STORE_INFO_new_PARAMS;
            if (iVar4 != 0) {
              pcVar17 = OSSL_STORE_INFO_new_PUBKEY;
            }
          }
          else {
            pcVar17 = OSSL_STORE_INFO_new_PKEY;
          }
        }
        lVar8 = (*pcVar17)(pXVar16);
        *param_2 = lVar8;
      }
      if (lVar8 == 0) {
        EVP_PKEY_free((EVP_PKEY *)pXVar16);
      }
      goto LAB_00aec4d8;
    }
    if (local_530[0] != 2) goto LAB_00aec4d8;
    if (local_500 == 0) goto LAB_00aec7e0;
    if (local_528 != 0) {
      pXVar11 = (X509 *)EVP_KEYMGMT_fetch(uVar7,local_528,uVar18);
      uVar5 = ERR_set_mark();
      uVar9 = (ulong)uVar5;
      if (pXVar11 != (X509 *)0x0) {
        iVar4 = 2;
        do {
          iVar1 = iVar4 + -1;
          if (iVar4 < 1) goto LAB_00aeca18;
          uVar9 = EVP_KEYMGMT_get0_provider(pXVar11);
          if (uVar9 == uVar6) {
            uVar9 = evp_keymgmt_load(pXVar11,local_500,uStack_4f8);
            uVar2 = uVar9;
            iVar4 = 0;
          }
          else {
            pcVar17 = *(code **)(*(long *)(lVar20 + 8) + 200);
            local_468 = 0;
            local_460 = 0x87;
            local_470 = pXVar11;
            if (pcVar17 == (code *)0x0) {
              local_468 = 0;
            }
            else {
              uVar9 = (*pcVar17)(*(undefined8 *)(lVar20 + 0x10),local_500,uStack_4f8,
                                 evp_keymgmt_util_try_import,&local_470);
            }
            bVar3 = 1 < iVar4;
            uVar2 = local_468;
            iVar4 = iVar1;
            if ((bVar3) && (local_468 == 0)) {
              EVP_KEYMGMT_free(pXVar11);
              pXVar11 = (X509 *)evp_keymgmt_fetch_from_prov(uVar6,local_528,uVar18);
              uVar9 = 0;
              if (pXVar11 == (X509 *)0x0) goto LAB_00aeca18;
              ERR_pop_to_mark();
              uVar5 = ERR_set_mark();
              uVar9 = (ulong)uVar5;
              uVar2 = 0;
            }
          }
        } while ((uVar2 == 0) && (pXVar11 != (X509 *)0x0));
        if (uVar2 != 0) {
          ERR_pop_to_mark();
          pXVar16 = (X509 *)evp_keymgmt_util_make_pkey(pXVar11,uVar2);
          EVP_KEYMGMT_free(pXVar11);
          if (pXVar16 == (X509 *)0x0) goto LAB_00aecb84;
          goto LAB_00aec87c;
        }
      }
LAB_00aeca18:
      ERR_clear_last_mark(uVar9);
      EVP_KEYMGMT_free(pXVar11);
    }
LAB_00aecb84:
    ERR_clear_last_mark();
    uVar6 = 0;
  }
  else {
LAB_00aec4d8:
    ERR_pop_to_mark();
    ERR_set_mark();
    if ((*param_2 == 0) && ((local_530[0] == 3 || (local_530[0] == 0)))) {
      local_470 = (X509 *)X509_new_ex(uVar7,uVar18);
      if (local_470 == (X509 *)0x0) goto LAB_00aecb84;
      if (local_528 == 0) {
        bVar3 = true;
      }
      else {
        iVar4 = OPENSSL_strcasecmp(local_528,"TRUSTED CERTIFICATE");
        bVar3 = iVar4 != 0;
      }
      pXVar16 = d2i_X509_AUX(&local_470,&local_510,(long)local_508);
      if ((pXVar16 != (X509 *)0x0) ||
         ((bVar3 && (pXVar16 = d2i_X509(&local_470,&local_510,(long)local_508),
                    pXVar16 != (X509 *)0x0)))) {
        if (local_470 != (X509 *)0x0) {
          local_530[0] = 3;
          lVar8 = OSSL_STORE_INFO_new_CERT();
          *param_2 = lVar8;
          if (lVar8 == 0) {
            X509_free(local_470);
          }
        }
      }
      else {
        X509_free(local_470);
        local_470 = (X509 *)0x0;
      }
    }
    ERR_pop_to_mark();
    ERR_set_mark();
    if ((*param_2 == 0) && ((local_530[0] | 4) == 4)) {
      a = d2i_X509_CRL((X509_CRL **)0x0,&local_510,(long)local_508);
      if (a == (X509_CRL *)0x0) {
LAB_00aeca00:
        lVar8 = *param_2;
        a = (X509_CRL *)0x0;
      }
      else {
        local_530[0] = 4;
        iVar4 = ossl_x509_crl_set0_libctx(a,uVar7,uVar18);
        if (iVar4 == 0) {
          X509_CRL_free(a);
          goto LAB_00aeca00;
        }
        lVar8 = OSSL_STORE_INFO_new_CRL(a);
        *param_2 = lVar8;
      }
      if (lVar8 == 0) {
        X509_CRL_free(a);
      }
    }
    ERR_pop_to_mark();
    ERR_set_mark();
    if ((*param_2 == 0) && (local_530[0] == 0)) {
      p12 = d2i_PKCS12((PKCS12 **)0x0,&local_510,(long)local_508);
      if (p12 == (PKCS12 *)0x0) {
        bVar3 = true;
      }
      else {
        local_488 = (X509 *)0x0;
        local_480 = (EVP_PKEY *)0x0;
        local_490 = (stack_st_X509 *)0x0;
        local_530[0] = 0xffffffff;
        iVar4 = PKCS12_mac_present();
        if (iVar4 == 0) {
          pass = (X509 **)0x0;
LAB_00aec8a4:
          iVar4 = PKCS12_parse(p12,(char *)pass,&local_480,&local_488,&local_490);
          if (iVar4 == 0) {
            bVar3 = false;
          }
          else {
            lVar8 = OPENSSL_sk_new_null();
            if (lVar8 == 0) {
LAB_00aec974:
              lVar13 = 0;
              lVar14 = 0;
              lVar15 = 0;
              bVar3 = true;
            }
            else {
              if (local_480 == (EVP_PKEY *)0x0) {
LAB_00aec8f4:
                if (local_488 != (X509 *)0x0) {
                  lVar14 = OSSL_STORE_INFO_new_CERT();
                  if (lVar14 != 0) {
                    local_488 = (X509 *)0x0;
                    iVar4 = OPENSSL_sk_push(lVar8,lVar14);
                    if (iVar4 != 0) goto LAB_00aec91c;
                  }
                  lVar13 = 0;
                  goto LAB_00aecab8;
                }
LAB_00aec91c:
                do {
                  iVar4 = OPENSSL_sk_num(local_490);
                  if (iVar4 < 1) goto LAB_00aec974;
                  OPENSSL_sk_value(local_490,0);
                  lVar15 = OSSL_STORE_INFO_new_CERT();
                } while (((lVar15 != 0) && (lVar13 = OPENSSL_sk_shift(local_490), lVar13 != 0)) &&
                        (iVar4 = OPENSSL_sk_push(lVar8,lVar15), iVar4 != 0));
                lVar13 = 0;
                lVar14 = 0;
              }
              else {
                lVar13 = OSSL_STORE_INFO_new_PKEY();
                if (lVar13 != 0) {
                  local_480 = (EVP_PKEY *)0x0;
                  iVar4 = OPENSSL_sk_push(lVar8,lVar13);
                  if (iVar4 != 0) goto LAB_00aec8f4;
                }
                lVar14 = 0;
LAB_00aecab8:
                lVar15 = 0;
              }
              bVar3 = false;
            }
            EVP_PKEY_free(local_480);
            X509_free(local_488);
            OPENSSL_sk_pop_free(local_490,X509_free);
            OSSL_STORE_INFO_free(lVar13);
            OSSL_STORE_INFO_free(lVar14);
            OSSL_STORE_INFO_free(lVar15);
            if (!bVar3) {
              OPENSSL_sk_pop_free(lVar8,OSSL_STORE_INFO_free);
              lVar8 = 0;
            }
            *(long *)(lVar20 + 0x40) = lVar8;
          }
        }
        else {
          iVar4 = PKCS12_verify_mac(p12,(char *)0x0,0);
          pass = (X509 **)0x0;
          if (iVar4 != 0) goto LAB_00aec8a4;
          pass = (X509 **)&DAT_002ab32c;
          iVar4 = PKCS12_verify_mac(p12,"",0);
          if (iVar4 != 0) goto LAB_00aec8a4;
          memset(&local_4e0,0,0x50);
          local_4e0 = "info";
          local_4d8 = 4;
          local_4d0 = s_PKCS12_import_pass_phrase_00cc93e8;
          uStack_4c0 = 0xffffffffffffffff;
          local_4c8 = 0x19;
          iVar4 = ossl_pw_get_passphrase(&local_470,0x400,&local_478,&local_4e0,0,lVar20 + 0x48);
          if (iVar4 == 0) {
            ERR_new();
            ERR_set_debug("crypto/store/store_result.c",0x23e,"try_pkcs12");
            uVar7 = 0x72;
            pcVar10 = (char *)0x0;
          }
          else {
            *(uchar *)((long)&local_470 + (long)local_478) = '\0';
            iVar4 = PKCS12_verify_mac(p12,(char *)&local_470,(int)local_478);
            if (iVar4 != 0) {
              pass = &local_470;
              goto LAB_00aec8a4;
            }
            ERR_new();
            ERR_set_debug("crypto/store/store_result.c",0x248,"try_pkcs12");
            pcVar10 = "empty password";
            if (local_478 != (uchar *)0x0) {
              pcVar10 = "maybe wrong password";
            }
            uVar7 = 0x71;
          }
          ERR_set_error(0x2c,uVar7,pcVar10);
          bVar3 = false;
        }
        OPENSSL_cleanse(&local_470,0x401);
        PKCS12_free(p12);
      }
      lVar8 = OPENSSL_sk_shift(*(undefined8 *)(lVar20 + 0x40));
      *param_2 = lVar8;
      if (!bVar3) goto LAB_00aecb84;
    }
    iVar4 = ERR_pop_to_mark();
    lVar8 = *param_2;
    if (lVar8 == 0) {
      ERR_new(iVar4);
      ERR_set_debug("crypto/store/store_result.c",0x97,"ossl_store_handle_load_result");
      ERR_set_error(0x2c,0x8010c,0);
      lVar8 = *param_2;
    }
    uVar6 = (ulong)(lVar8 != 0);
  }
  return uVar6;
}

