/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e9bfc
 */

undefined8 tls_process_client_key_exchange(uint *param_1,long *param_2)

{
  uint uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  undefined4 uVar4;
  bool bVar5;
  uint uVar6;
  int iVar7;
  int iVar8;
  long lVar9;
  uchar *out;
  EVP_PKEY_CTX *pEVar10;
  EVP_PKEY *to;
  BIGNUM *a;
  ASN1_VALUE *val;
  undefined8 uVar11;
  char *pcVar12;
  undefined8 uVar13;
  undefined1 *puVar14;
  ulong uVar15;
  EVP_PKEY *pEVar16;
  byte *pbVar17;
  uchar *puVar18;
  ulong uVar19;
  size_t *psVar20;
  long lVar21;
  size_t local_280;
  size_t sStack_278;
  size_t sStack_270;
  size_t sStack_268;
  size_t local_260;
  size_t local_258;
  size_t sStack_250;
  size_t sStack_248;
  size_t sStack_240;
  size_t local_238;
  size_t local_230 [54];
  size_t local_80;
  size_t sStack_78;
  size_t sStack_70;
  size_t sStack_68;
  size_t local_60;
  uchar *local_58;
  
  uVar1 = *(uint *)(*(long *)(param_1 + 0xb8) + 0x1c);
  if ((uVar1 & 0x1c8) == 0) {
LAB_009e9dd4:
    if ((uVar1 >> 3 & 1) == 0) {
      if ((uVar1 & 0x41) == 0) {
        if ((uVar1 & 0x102) == 0) {
          if ((uVar1 & 0x84) == 0) {
            if ((uVar1 >> 5 & 1) != 0) {
              uVar15 = param_2[1] - 2;
              if (1 < (ulong)param_2[1]) {
                puVar14 = (undefined1 *)*param_2;
                uVar2 = *puVar14;
                uVar3 = puVar14[1];
                puVar18 = puVar14 + 2;
                *param_2 = (long)puVar18;
                param_2[1] = uVar15;
                uVar19 = (ulong)(uint)CONCAT11(uVar2,uVar3);
                if (uVar19 <= uVar15) {
                  *param_2 = (long)(puVar18 + uVar19);
                  param_2[1] = uVar15 - uVar19;
                  a = BN_bin2bn(puVar18,(uint)CONCAT11(uVar2,uVar3),(BIGNUM *)0x0);
                  *(BIGNUM **)(param_1 + 0x306) = a;
                  if (a == (BIGNUM *)0x0) {
                    ERR_new();
                    ERR_set_debug("ssl/statem/statem_srvr.c",0xc01,"tls_process_cke_srp");
                    uVar11 = 0x50;
                    uVar13 = 0x80003;
                  }
                  else {
                    iVar7 = BN_ucmp(a,*(BIGNUM **)(param_1 + 0x2fe));
                    if ((iVar7 < 0) &&
                       (iVar7 = BN_is_zero(*(undefined8 *)(param_1 + 0x306)), iVar7 == 0)) {
                      CRYPTO_free(*(void **)(*(long *)(param_1 + 0x246) + 0x370));
                      pcVar12 = CRYPTO_strdup(*(char **)(param_1 + 0x2fc),"ssl/statem/statem_srvr.c"
                                              ,0xc09);
                      *(char **)(*(long *)(param_1 + 0x246) + 0x370) = pcVar12;
                      if (pcVar12 == (char *)0x0) {
                        ERR_new();
                        pcVar12 = "tls_process_cke_srp";
                        uVar11 = 0xc0b;
                        goto LAB_009ea1b0;
                      }
                      iVar7 = srp_generate_server_master_secret(param_1);
                      goto joined_r0x009ea088;
                    }
                    ERR_new();
                    ERR_set_debug("ssl/statem/statem_srvr.c",0xc05,"tls_process_cke_srp");
                    uVar11 = 0x2f;
                    uVar13 = 0x173;
                  }
                  goto LAB_009e9f80;
                }
              }
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0xbfd,"tls_process_cke_srp");
              uVar11 = 0x32;
              uVar13 = 0x15b;
              goto LAB_009e9f80;
            }
            if ((uVar1 >> 4 & 1) == 0) {
              if ((uVar1 >> 9 & 1) == 0) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_srvr.c",0xd07,"tls_process_client_key_exchange");
                uVar11 = 0x50;
                uVar13 = 0xf9;
                goto LAB_009e9f80;
              }
              local_58 = (uchar *)0x20;
              iVar7 = ossl_gost18_cke_cipher_nid(param_1);
              if (iVar7 == 0) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_srvr.c",0xc90,"tls_process_cke_gost18");
                uVar4 = 0xc0103;
                goto LAB_009ea814;
              }
              iVar8 = ossl_gost_ukm(param_1,&local_80);
              if (iVar8 < 1) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_srvr.c",0xc95,"tls_process_cke_gost18");
                uVar11 = 0xc0103;
LAB_009ea880:
                ossl_statem_fatal(param_1,0x50,uVar11,0);
                pEVar10 = (EVP_PKEY_CTX *)0x0;
LAB_009eaa28:
                bVar5 = false;
              }
              else {
                lVar9 = *(long *)(*(long *)(param_1 + 0x226) + 0x118);
                if ((lVar9 == 0) &&
                   (lVar9 = *(long *)(*(long *)(param_1 + 0x226) + 0xf0), lVar9 == 0)) {
                  ERR_new();
                  ERR_set_debug("ssl/statem/statem_srvr.c",0xc9e,"tls_process_cke_gost18");
                  uVar11 = 0xec;
                  goto LAB_009ea880;
                }
                pEVar10 = (EVP_PKEY_CTX *)
                          EVP_PKEY_CTX_new_from_pkey
                                    (**(undefined8 **)(param_1 + 0x26a),lVar9,
                                     (*(undefined8 **)(param_1 + 0x26a))[0x88]);
                if (pEVar10 == (EVP_PKEY_CTX *)0x0) {
                  ERR_new();
                  ERR_set_debug("ssl/statem/statem_srvr.c",0xca4,"tls_process_cke_gost18");
                  uVar13 = 0xc0100;
                  uVar11 = 0x50;
LAB_009eaa1c:
                  ossl_statem_fatal(param_1,uVar11,uVar13,0);
                  goto LAB_009eaa28;
                }
                iVar8 = EVP_PKEY_decrypt_init(pEVar10);
                if (iVar8 < 1) {
                  ERR_new();
                  ERR_set_debug("ssl/statem/statem_srvr.c",0xca8,"tls_process_cke_gost18");
                  uVar11 = 0x50;
                  uVar13 = 0xc0103;
                  goto LAB_009eaa1c;
                }
                iVar8 = EVP_PKEY_CTX_ctrl(pEVar10,-1,0x400,8,0x20,&local_80);
                if (iVar8 < 1) {
                  ERR_new();
                  uVar11 = 0xcaf;
LAB_009eaa10:
                  ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,"tls_process_cke_gost18");
                  uVar11 = 0x50;
                  uVar13 = 0x112;
                  goto LAB_009eaa1c;
                }
                iVar7 = EVP_PKEY_CTX_ctrl(pEVar10,-1,0x400,0xc,iVar7,(void *)0x0);
                if (iVar7 < 1) {
                  ERR_new();
                  uVar11 = 0xcb5;
                  goto LAB_009eaa10;
                }
                iVar7 = EVP_PKEY_decrypt(pEVar10,(uchar *)&local_280,(size_t *)&local_58,
                                         (uchar *)*param_2,param_2[1]);
                if (iVar7 < 1) {
                  ERR_new();
                  ERR_set_debug("ssl/statem/statem_srvr.c",0xcbc,"tls_process_cke_gost18");
                  uVar11 = 0x32;
                  uVar13 = 0x93;
                  goto LAB_009eaa1c;
                }
                iVar7 = ssl_generate_master_secret(param_1,&local_280,0x20,0);
                bVar5 = iVar7 != 0;
              }
              EVP_PKEY_CTX_free(pEVar10);
              if (bVar5) {
                return 2;
              }
              goto LAB_009e9f8c;
            }
            local_280 = 0x20;
            if ((*(uint *)(*(long *)(param_1 + 0xb8) + 0x20) >> 7 & 1) == 0) {
              lVar9 = 0;
              if ((*(uint *)(*(long *)(param_1 + 0xb8) + 0x20) >> 5 & 1) != 0) {
                lVar21 = *(long *)(param_1 + 0x226);
LAB_009ea618:
                lVar9 = *(long *)(lVar21 + 200);
              }
            }
            else {
              lVar21 = *(long *)(param_1 + 0x226);
              lVar9 = *(long *)(lVar21 + 0x118);
              if ((lVar9 == 0) && (lVar9 = *(long *)(lVar21 + 0xf0), lVar9 == 0)) goto LAB_009ea618;
            }
            pEVar10 = (EVP_PKEY_CTX *)
                      EVP_PKEY_CTX_new_from_pkey
                                (**(undefined8 **)(param_1 + 0x26a),lVar9,
                                 (*(undefined8 **)(param_1 + 0x26a))[0x88]);
            if (pEVar10 == (EVP_PKEY_CTX *)0x0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0xc3c,"tls_process_cke_gost");
              uVar4 = 0xc0100;
LAB_009ea814:
              ossl_statem_fatal(param_1,0x50,uVar4,0);
              goto LAB_009e9f8c;
            }
            iVar7 = EVP_PKEY_decrypt_init(pEVar10);
            if (iVar7 < 1) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0xc40,"tls_process_cke_gost");
              ossl_statem_fatal(param_1,0x50,0xc0103,0);
              val = (ASN1_VALUE *)0x0;
LAB_009ea7c8:
              bVar5 = false;
            }
            else {
              pEVar16 = (EVP_PKEY *)
                        X509_get0_pubkey(*(undefined8 *)(*(long *)(param_1 + 0x246) + 0x2b8));
              if ((pEVar16 != (EVP_PKEY *)0x0) &&
                 (iVar7 = EVP_PKEY_derive_set_peer(pEVar10,pEVar16), iVar7 < 1)) {
                ERR_clear_error();
              }
              local_58 = (uchar *)*param_2;
              val = ASN1_item_d2i((ASN1_VALUE **)0x0,&local_58,param_2[1],(ASN1_ITEM *)&DAT_00c58888
                                 );
              if (((val == (ASN1_VALUE *)0x0) || (*(ASN1_TYPE **)val == (ASN1_TYPE *)0x0)) ||
                 (iVar7 = ASN1_TYPE_get(*(ASN1_TYPE **)val), iVar7 != 0x10)) {
                ERR_new();
                uVar11 = 0xc56;
LAB_009ea718:
                ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,"tls_process_cke_gost");
                uVar11 = 0x32;
LAB_009ea720:
                ossl_statem_fatal(param_1,uVar11,0x93,0);
                goto LAB_009ea7c8;
              }
              uVar15 = (long)local_58 - *param_2;
              lVar9 = param_2[1] - uVar15;
              if ((ulong)param_2[1] < uVar15) {
                ERR_new();
                uVar11 = 0xc5b;
LAB_009ea98c:
                ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,"tls_process_cke_gost");
                uVar11 = 0x50;
                goto LAB_009ea720;
              }
              *param_2 = *param_2 + uVar15;
              param_2[1] = lVar9;
              if (lVar9 != 0) {
                ERR_new();
                uVar11 = 0xc60;
                goto LAB_009ea98c;
              }
              iVar7 = EVP_PKEY_decrypt(pEVar10,(uchar *)&local_80,&local_280,
                                       *(uchar **)(*(int **)(*(long *)val + 8) + 2),
                                       (long)**(int **)(*(long *)val + 8));
              if (iVar7 < 1) {
                ERR_new();
                uVar11 = 0xc69;
                goto LAB_009ea718;
              }
              iVar7 = ssl_generate_master_secret(param_1,&local_80,0x20,0);
              if (iVar7 == 0) goto LAB_009ea7c8;
              iVar7 = EVP_PKEY_CTX_ctrl(pEVar10,-1,-1,2,2,(void *)0x0);
              bVar5 = true;
              if (0 < iVar7) {
                param_1[0x1d] = 1;
              }
            }
            EVP_PKEY_CTX_free(pEVar10);
            ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c58888);
            if (bVar5) {
              return 2;
            }
            goto LAB_009e9f8c;
          }
          if (param_2[1] == 0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xbc5,"tls_process_cke_ecdhe");
            uVar11 = 0x28;
            uVar13 = 0x137;
          }
          else {
            pEVar16 = *(EVP_PKEY **)(param_1 + 0xba);
            uVar15 = param_2[1] - 1;
            pbVar17 = (byte *)*param_2 + 1;
            uVar19 = (ulong)*(byte *)*param_2;
            *param_2 = (long)pbVar17;
            param_2[1] = uVar15;
            if (uVar19 <= uVar15) {
              *param_2 = (long)(pbVar17 + uVar19);
              param_2[1] = uVar15 - uVar19;
              if (uVar15 - uVar19 == 0) {
                if (pEVar16 != (EVP_PKEY *)0x0) {
                  to = EVP_PKEY_new();
                  if ((to != (EVP_PKEY *)0x0) &&
                     (iVar7 = EVP_PKEY_copy_parameters(to,pEVar16), 0 < iVar7)) {
                    iVar7 = EVP_PKEY_set1_encoded_public_key(to,pbVar17,uVar19);
                    if (iVar7 < 1) {
                      ERR_new();
                      ERR_set_debug("ssl/statem/statem_srvr.c",0xbe2,"tls_process_cke_ecdhe");
                      uVar11 = 0x80010;
                      goto LAB_009ea758;
                    }
                    goto LAB_009ea430;
                  }
                  ERR_new();
                  pcVar12 = "tls_process_cke_ecdhe";
                  uVar11 = 0xbdd;
                  goto LAB_009ea74c;
                }
                ERR_new();
                ERR_set_debug("ssl/statem/statem_srvr.c",0xbd7,"tls_process_cke_ecdhe");
                uVar11 = 0x50;
                uVar13 = 0x137;
                goto LAB_009ea3b4;
              }
            }
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xbd3,"tls_process_cke_ecdhe");
            uVar11 = 0x32;
            uVar13 = 0x9f;
          }
LAB_009ea3b4:
          ossl_statem_fatal(param_1,uVar11,uVar13,0);
          to = (EVP_PKEY *)0x0;
        }
        else {
          uVar15 = param_2[1] - 2;
          if ((ulong)param_2[1] < 2) {
LAB_009ea0bc:
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xb93,"tls_process_cke_dhe");
            uVar11 = 0x32;
            uVar13 = 0x94;
            goto LAB_009ea3b4;
          }
          puVar14 = (undefined1 *)*param_2;
          uVar2 = *puVar14;
          uVar3 = puVar14[1];
          puVar14 = puVar14 + 2;
          *param_2 = (long)puVar14;
          param_2[1] = uVar15;
          uVar19 = (ulong)CONCAT11(uVar2,uVar3);
          if (uVar15 != uVar19) goto LAB_009ea0bc;
          pEVar16 = *(EVP_PKEY **)(param_1 + 0xba);
          if (pEVar16 == (EVP_PKEY *)0x0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xb98,"tls_process_cke_dhe");
            uVar11 = 0x50;
LAB_009ea3b0:
            uVar13 = 0xab;
            goto LAB_009ea3b4;
          }
          if (uVar19 == 0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xb9d,"tls_process_cke_dhe");
            uVar11 = 0x32;
            goto LAB_009ea3b0;
          }
          *param_2 = (long)(puVar14 + uVar19);
          param_2[1] = 0;
          to = EVP_PKEY_new();
          if ((to == (EVP_PKEY *)0x0) || (iVar7 = EVP_PKEY_copy_parameters(to,pEVar16), iVar7 == 0))
          {
            ERR_new();
            pcVar12 = "tls_process_cke_dhe";
            uVar11 = 0xba7;
LAB_009ea74c:
            ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,pcVar12);
            uVar11 = 0x128;
LAB_009ea758:
            ossl_statem_fatal(param_1,0x50,uVar11,0);
          }
          else {
            iVar7 = EVP_PKEY_set1_encoded_public_key(to,puVar14,uVar19);
            if (iVar7 == 0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0xbac,"tls_process_cke_dhe");
              uVar11 = 0xc0103;
              goto LAB_009ea758;
            }
LAB_009ea430:
            iVar7 = ssl_derive(param_1,pEVar16,to,1);
            if (iVar7 != 0) {
              EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 0xba));
              param_1[0xba] = 0;
              param_1[0xbb] = 0;
              EVP_PKEY_free(to);
              return 2;
            }
          }
        }
        EVP_PKEY_free(to);
        goto LAB_009e9f8c;
      }
      lVar9 = *(long *)(*(long *)(param_1 + 0x226) + 0x28);
      if (lVar9 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_srvr.c",0xb35,"tls_process_cke_rsa");
        uVar11 = 0x50;
        uVar13 = 0xa8;
        goto LAB_009e9f80;
      }
      if ((*param_1 | 0x200) == 0x300) {
        puVar18 = (uchar *)*param_2;
        uVar15 = param_2[1];
LAB_009e9e04:
        local_58 = (uchar *)0x30;
        out = CRYPTO_malloc(0x30,"ssl/statem/statem_srvr.c",0xb45);
        if (out != (uchar *)0x0) {
          pEVar10 = (EVP_PKEY_CTX *)
                    EVP_PKEY_CTX_new_from_pkey
                              (**(undefined8 **)(param_1 + 0x26a),lVar9,
                               (*(undefined8 **)(param_1 + 0x26a))[0x88]);
          if (pEVar10 == (EVP_PKEY_CTX *)0x0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xb4d,"tls_process_cke_rsa");
            ossl_statem_fatal(param_1,0x50,0xc0100,0);
            CRYPTO_free(out);
            EVP_PKEY_CTX_free((EVP_PKEY_CTX *)0x0);
            goto LAB_009e9f8c;
          }
          iVar7 = EVP_PKEY_decrypt_init(pEVar10);
          if ((iVar7 < 1) || (iVar7 = EVP_PKEY_CTX_set_rsa_padding(pEVar10,7), iVar7 < 1)) {
            ERR_new();
            uVar11 = 0xb5e;
          }
          else {
            psVar20 = &local_258;
            OSSL_PARAM_construct_uint(&local_80,"tls-client-version",param_1 + 0x283);
            local_260 = local_60;
            sStack_278 = sStack_78;
            local_280 = local_80;
            sStack_268 = sStack_68;
            sStack_270 = sStack_70;
            if (*(char *)((long)param_1 + 0x9ea) < '\0') {
              psVar20 = local_230;
              OSSL_PARAM_construct_uint(&local_80,"tls-negotiated-version",param_1);
              local_238 = local_60;
              sStack_250 = sStack_78;
              local_258 = local_80;
              sStack_240 = sStack_68;
              sStack_248 = sStack_70;
            }
            OSSL_PARAM_construct_end(&local_80);
            psVar20[4] = local_60;
            psVar20[1] = sStack_78;
            *psVar20 = local_80;
            psVar20[3] = sStack_68;
            psVar20[2] = sStack_70;
            iVar7 = EVP_PKEY_CTX_set_params(pEVar10,&local_280);
            if ((iVar7 == 0) ||
               (iVar7 = EVP_PKEY_decrypt(pEVar10,out,(size_t *)&local_58,puVar18,uVar15), iVar7 < 1)
               ) {
              ERR_new();
              uVar11 = 0xb6e;
            }
            else {
              if (local_58 == (uchar *)0x30) {
                iVar7 = ssl_generate_master_secret(param_1,out,0x30,0);
                CRYPTO_free(out);
                EVP_PKEY_CTX_free(pEVar10);
                goto joined_r0x009ea088;
              }
              OPENSSL_cleanse(out,0x30);
              ERR_new();
              uVar11 = 0xb78;
            }
          }
          ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,"tls_process_cke_rsa");
          ossl_statem_fatal(param_1,0x33,0x93,0);
          CRYPTO_free(out);
          EVP_PKEY_CTX_free(pEVar10);
          goto LAB_009e9f8c;
        }
        ERR_new();
        pcVar12 = "tls_process_cke_rsa";
        uVar11 = 0xb47;
LAB_009ea1b0:
        ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,pcVar12);
        uVar13 = 0xc0100;
        uVar11 = 0x50;
        goto LAB_009e9f80;
      }
      uVar19 = param_2[1] - 2;
      if (1 < (ulong)param_2[1]) {
        puVar14 = (undefined1 *)*param_2;
        uVar15 = (ulong)CONCAT11(*puVar14,puVar14[1]);
        lVar21 = uVar19 - uVar15;
        if (uVar15 <= uVar19) {
          puVar18 = puVar14 + 2;
          *param_2 = (long)(puVar18 + uVar15);
          param_2[1] = lVar21;
          if (lVar21 == 0) goto LAB_009e9e04;
        }
      }
      ERR_new();
      pcVar12 = "tls_process_cke_rsa";
      uVar11 = 0xb3f;
    }
    else {
      if (param_2[1] == 0) {
        iVar7 = ssl_generate_master_secret(param_1,0,0,0);
joined_r0x009ea088:
        if (iVar7 != 0) {
          return 2;
        }
        goto LAB_009e9f8c;
      }
      ERR_new();
      pcVar12 = "tls_process_client_key_exchange";
      uVar11 = 0xce0;
    }
LAB_009e9f74:
    ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,pcVar12);
    uVar11 = 0x32;
    uVar13 = 0x9f;
  }
  else {
    uVar15 = param_2[1] - 2;
    if ((ulong)param_2[1] < 2) {
LAB_009e9c58:
      ERR_new();
      pcVar12 = "tls_process_cke_psk_preamble";
      uVar11 = 0xaf6;
      goto LAB_009e9f74;
    }
    puVar14 = (undefined1 *)*param_2;
    uVar19 = (ulong)CONCAT11(*puVar14,puVar14[1]);
    if (uVar15 < uVar19) goto LAB_009e9c58;
    *param_2 = (long)(puVar14 + 2 + uVar19);
    param_2[1] = uVar15 - uVar19;
    if (uVar19 < 0x101) {
      if (*(long *)(param_1 + 0x264) == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_srvr.c",0xafe,"tls_process_cke_psk_preamble");
        uVar11 = 0x50;
        uVar13 = 0xe1;
      }
      else {
        lVar21 = *(long *)(param_1 + 0x246);
        CRYPTO_free(*(void **)(lVar21 + 0x2a8));
        lVar9 = CRYPTO_strndup(puVar14 + 2,uVar19,"include/internal/packet.h",0x1e6);
        *(long *)(lVar21 + 0x2a8) = lVar9;
        if (lVar9 == 0) {
          ERR_new();
          uVar11 = 0xb03;
        }
        else {
          uVar6 = (**(code **)(param_1 + 0x264))
                            (param_1,*(undefined8 *)(*(long *)(param_1 + 0x246) + 0x2a8),&local_280,
                             0x200);
          if (uVar6 < 0x201) {
            uVar15 = (ulong)uVar6;
            if (uVar6 != 0) {
              CRYPTO_free(*(void **)(param_1 + 0xdc));
              uVar11 = CRYPTO_memdup(&local_280,uVar15,"ssl/statem/statem_srvr.c",0xb16);
              *(undefined8 *)(param_1 + 0xdc) = uVar11;
              OPENSSL_cleanse(&local_280,uVar15);
              if (*(long *)(param_1 + 0xdc) != 0) {
                *(ulong *)(param_1 + 0xde) = uVar15;
                goto LAB_009e9dd4;
              }
              param_1[0xde] = 0;
              param_1[0xdf] = 0;
              ERR_new();
              pcVar12 = "tls_process_cke_psk_preamble";
              uVar11 = 0xb1b;
              goto LAB_009ea1b0;
            }
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0xb11,"tls_process_cke_psk_preamble");
            uVar11 = 0x73;
            uVar13 = 0xdf;
            goto LAB_009e9f80;
          }
          ERR_new();
          uVar11 = 0xb0b;
        }
        ERR_set_debug("ssl/statem/statem_srvr.c",uVar11,"tls_process_cke_psk_preamble");
        uVar11 = 0x50;
        uVar13 = 0xc0103;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0xafa,"tls_process_cke_psk_preamble");
      uVar11 = 0x32;
      uVar13 = 0x92;
    }
  }
LAB_009e9f80:
  ossl_statem_fatal(param_1,uVar11,uVar13,0);
LAB_009e9f8c:
  CRYPTO_clear_free(*(undefined8 *)(param_1 + 0xdc),*(undefined8 *)(param_1 + 0xde),
                    "ssl/statem/statem_srvr.c",0xd0e);
  param_1[0xde] = 0;
  param_1[0xdf] = 0;
  param_1[0xdc] = 0;
  param_1[0xdd] = 0;
  return 0;
}

