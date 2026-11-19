/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009de9b0
 */

undefined8 tls_process_key_exchange(long param_1,long *param_2)

{
  uchar *puVar1;
  uchar *puVar2;
  byte *pbVar3;
  byte *pbVar4;
  uint uVar5;
  ulong uVar6;
  uint uVar7;
  uint uVar8;
  byte bVar9;
  char cVar10;
  undefined1 uVar11;
  undefined1 uVar12;
  uchar uVar13;
  uchar uVar14;
  uchar uVar15;
  uchar uVar16;
  byte bVar17;
  byte bVar18;
  char cVar19;
  char cVar20;
  ushort uVar21;
  ulong uVar22;
  int iVar23;
  undefined4 uVar24;
  void *ptr;
  BIGNUM *pBVar25;
  BIGNUM *a;
  BIGNUM *a_00;
  long lVar26;
  EVP_PKEY_CTX *ctx;
  long lVar27;
  undefined8 uVar28;
  char *pcVar29;
  undefined8 uVar30;
  ulong uVar31;
  ulong uVar32;
  undefined1 *puVar33;
  long lVar34;
  bool bVar35;
  long lVar36;
  void *local_78;
  undefined8 local_70;
  EVP_PKEY *local_68;
  
  local_70 = 0;
  lVar27 = *param_2;
  uVar6 = param_2[1];
  uVar7 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x1c);
  EVP_PKEY_free(*(EVP_PKEY **)(param_1 + 0x4b0));
  *(undefined8 *)(param_1 + 0x4b0) = 0;
  if ((uVar7 & 0x1c8) == 0) goto LAB_009deb40;
  uVar31 = param_2[1] - 2;
  if ((ulong)param_2[1] < 2) {
LAB_009dea24:
    ERR_new();
    pcVar29 = "tls_process_ske_psk_preamble";
    uVar28 = 0x79d;
LAB_009dea3c:
    ERR_set_debug("ssl/statem/statem_clnt.c",uVar28,pcVar29);
    uVar28 = 0x32;
    uVar30 = 0x9f;
LAB_009dea48:
    ossl_statem_fatal(param_1,uVar28,uVar30,0);
  }
  else {
    puVar33 = (undefined1 *)*param_2;
    uVar32 = (ulong)CONCAT11(*puVar33,puVar33[1]);
    if (uVar31 < uVar32) goto LAB_009dea24;
    *param_2 = (long)(puVar33 + 2 + uVar32);
    param_2[1] = uVar31 - uVar32;
    if (0x100 < uVar32) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0x7a8,"tls_process_ske_psk_preamble");
      uVar28 = 0x28;
      uVar30 = 0x92;
      goto LAB_009dea48;
    }
    lVar36 = *(long *)(param_1 + 0x918);
    ptr = *(void **)(lVar36 + 0x2a0);
    if (uVar32 == 0) {
      CRYPTO_free(ptr);
      *(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2a0) = 0;
    }
    else {
      CRYPTO_free(ptr);
      lVar34 = CRYPTO_strndup(puVar33 + 2,uVar32,"include/internal/packet.h",0x1e6);
      *(long *)(lVar36 + 0x2a0) = lVar34;
      if (lVar34 == 0) {
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0x7b1,"tls_process_ske_psk_preamble");
        uVar28 = 0x50;
        uVar30 = 0xc0103;
        goto LAB_009dea48;
      }
    }
LAB_009deb40:
    if ((uVar7 & 0x48) == 0) {
      if ((uVar7 >> 5 & 1) == 0) {
        if ((uVar7 & 0x102) == 0) {
          if ((uVar7 & 0x84) == 0) {
            if (uVar7 != 0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0x8ab,"tls_process_key_exchange");
              uVar28 = 10;
              uVar30 = 0xf4;
              goto LAB_009dea48;
            }
            goto LAB_009deb4c;
          }
          lVar36 = param_2[1];
          if (lVar36 != 0) {
            pcVar29 = (char *)*param_2;
            cVar10 = *pcVar29;
            *param_2 = (long)(pcVar29 + 1);
            param_2[1] = lVar36 - 1U;
            if (1 < lVar36 - 1U) {
              cVar19 = pcVar29[1];
              cVar20 = pcVar29[2];
              *param_2 = (long)(pcVar29 + 3);
              param_2[1] = lVar36 + -3;
              if (cVar10 == '\x03') {
                uVar5 = (uint)CONCAT11(cVar19,cVar20);
                iVar23 = tls1_check_group_id(param_1,uVar5,1);
                if (iVar23 != 0) {
                  lVar36 = ssl_generate_param_group(param_1,uVar5);
                  *(long *)(param_1 + 0x4b0) = lVar36;
                  if (lVar36 == 0) {
                    ERR_new();
                    ERR_set_debug("ssl/statem/statem_clnt.c",0x863,"tls_process_ske_ecdhe");
                    uVar28 = 0x50;
                    uVar30 = 0x13a;
                    goto LAB_009dea48;
                  }
                  if (param_2[1] != 0) {
                    uVar32 = param_2[1] - 1;
                    uVar31 = (ulong)*(byte *)*param_2;
                    if (uVar32 < uVar31) goto LAB_009dee08;
                    *param_2 = (long)((byte *)*param_2 + uVar31 + 1);
                    param_2[1] = uVar32 - uVar31;
                    iVar23 = EVP_PKEY_set1_encoded_public_key(*(undefined8 *)(param_1 + 0x4b0));
                    if (iVar23 < 1) {
                      ERR_new();
                      ERR_set_debug("ssl/statem/statem_clnt.c",0x86f,"tls_process_ske_ecdhe");
                      uVar28 = 0x2f;
                      uVar30 = 0x132;
                      goto LAB_009dea48;
                    }
                    uVar8 = *(uint *)(*(long *)(param_1 + 0x2e0) + 0x20);
                    if (((uVar8 >> 3 & 1) != 0) || (lVar36 = 0, (uVar8 & 1) != 0)) {
                      lVar36 = X509_get0_pubkey(*(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2b8))
                      ;
                    }
                    *(uint *)(*(long *)(param_1 + 0x918) + 0x308) = uVar5;
                    goto joined_r0x009df0a8;
                  }
LAB_009dee08:
                  ERR_new();
                  pcVar29 = "tls_process_ske_ecdhe";
                  uVar28 = 0x868;
                  goto LAB_009dea3c;
                }
              }
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0x85d,"tls_process_ske_ecdhe");
              uVar28 = 0x2f;
              uVar30 = 0x17a;
              goto LAB_009dea48;
            }
          }
          ERR_new();
          pcVar29 = "tls_process_ske_ecdhe";
          uVar28 = 0x854;
LAB_009ded68:
          ERR_set_debug("ssl/statem/statem_clnt.c",uVar28,pcVar29);
          uVar28 = 0x32;
          uVar30 = 0xa0;
          goto LAB_009dea48;
        }
        local_68 = (EVP_PKEY *)0x0;
        uVar31 = param_2[1] - 2;
        if (1 < (ulong)param_2[1]) {
          puVar33 = (undefined1 *)*param_2;
          uVar11 = *puVar33;
          uVar12 = puVar33[1];
          uVar32 = (ulong)CONCAT11(uVar11,uVar12);
          uVar22 = uVar31 - uVar32;
          if (uVar32 <= uVar31) {
            puVar1 = puVar33 + 2 + uVar32;
            *param_2 = (long)puVar1;
            param_2[1] = uVar22;
            if (1 < uVar22) {
              uVar13 = *puVar1;
              uVar14 = puVar1[1];
              uVar31 = (ulong)CONCAT11(uVar13,uVar14);
              uVar32 = (uVar22 - 2) - uVar31;
              if (uVar31 <= uVar22 - 2) {
                puVar2 = puVar1 + 2 + uVar31;
                *param_2 = (long)puVar2;
                param_2[1] = uVar32;
                if (1 < uVar32) {
                  uVar15 = *puVar2;
                  uVar16 = puVar2[1];
                  uVar31 = (ulong)CONCAT11(uVar15,uVar16);
                  if (uVar31 <= uVar32 - 2) {
                    *param_2 = (long)(puVar2 + 2 + uVar31);
                    param_2[1] = (uVar32 - 2) - uVar31;
                    pBVar25 = BN_bin2bn(puVar33 + 2,(uint)CONCAT11(uVar11,uVar12),(BIGNUM *)0x0);
                    a = BN_bin2bn(puVar1 + 2,(uint)CONCAT11(uVar13,uVar14),(BIGNUM *)0x0);
                    a_00 = BN_bin2bn(puVar2 + 2,(uint)CONCAT11(uVar15,uVar16),(BIGNUM *)0x0);
                    if (((pBVar25 == (BIGNUM *)0x0) || (a == (BIGNUM *)0x0)) ||
                       (a_00 == (BIGNUM *)0x0)) {
                      ERR_new();
                      ERR_set_debug("ssl/statem/statem_clnt.c",0x800,"tls_process_ske_dhe");
                      ossl_statem_fatal(param_1,0x50,0x80003,0);
                      lVar34 = 0;
LAB_009df16c:
                      lVar36 = 0;
                      ctx = (EVP_PKEY_CTX *)0x0;
                      lVar26 = 0;
                      bVar35 = true;
                    }
                    else {
                      lVar34 = OSSL_PARAM_BLD_new();
                      if (((lVar34 == 0) ||
                          (iVar23 = OSSL_PARAM_BLD_push_BN(lVar34,&DAT_002a38e7,pBVar25),
                          iVar23 == 0)) ||
                         ((iVar23 = OSSL_PARAM_BLD_push_BN(lVar34,&DAT_002d92e5,a), iVar23 == 0 ||
                          ((iVar23 = OSSL_PARAM_BLD_push_BN(lVar34,&DAT_002ad463,a_00), iVar23 == 0
                           || (lVar26 = OSSL_PARAM_BLD_to_param(lVar34), lVar26 == 0)))))) {
                        ERR_new();
                        ERR_set_debug("ssl/statem/statem_clnt.c",0x80b,"tls_process_ske_dhe");
                        ossl_statem_fatal(param_1,0x50,0xc0103,0);
                        goto LAB_009df16c;
                      }
                      ctx = (EVP_PKEY_CTX *)
                            EVP_PKEY_CTX_new_from_name
                                      (**(undefined8 **)(param_1 + 0x9a8),&DAT_002a3a5a,
                                       (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
                      if (ctx == (EVP_PKEY_CTX *)0x0) {
                        ERR_new();
                        ERR_set_debug("ssl/statem/statem_clnt.c",0x811,"tls_process_ske_dhe");
                        uVar28 = 0x50;
                        uVar30 = 0xc0103;
LAB_009df404:
                        ossl_statem_fatal(param_1,uVar28,uVar30,0);
                        lVar36 = 0;
                        bVar35 = true;
                      }
                      else {
                        iVar23 = EVP_PKEY_fromdata_init(ctx);
                        if ((iVar23 < 1) ||
                           (iVar23 = EVP_PKEY_fromdata(ctx,&local_68,0x87,lVar26), iVar23 < 1)) {
                          ERR_new();
                          ERR_set_debug("ssl/statem/statem_clnt.c",0x816,"tls_process_ske_dhe");
                          uVar28 = 0x50;
LAB_009df400:
                          uVar30 = 0x66;
                          goto LAB_009df404;
                        }
                        EVP_PKEY_CTX_free(ctx);
                        ctx = (EVP_PKEY_CTX *)
                              EVP_PKEY_CTX_new_from_pkey
                                        (**(undefined8 **)(param_1 + 0x9a8),local_68,
                                         (*(undefined8 **)(param_1 + 0x9a8))[0x88]);
                        if (((ctx == (EVP_PKEY_CTX *)0x0) ||
                            (iVar23 = EVP_PKEY_param_check_quick(ctx), iVar23 != 1)) ||
                           (iVar23 = EVP_PKEY_public_check(ctx), iVar23 != 1)) {
                          ERR_new();
                          ERR_set_debug("ssl/statem/statem_clnt.c",0x825,"tls_process_ske_dhe");
                          uVar28 = 0x2f;
                          goto LAB_009df400;
                        }
                        uVar24 = EVP_PKEY_get_security_bits(local_68);
                        iVar23 = ssl_security(param_1,0x40007,uVar24,0,local_68);
                        if (iVar23 == 0) {
                          ERR_new();
                          ERR_set_debug("ssl/statem/statem_clnt.c",0x82c,"tls_process_ske_dhe");
                          uVar28 = 0x28;
                          uVar30 = 0x18a;
                          goto LAB_009df404;
                        }
                        *(EVP_PKEY **)(param_1 + 0x4b0) = local_68;
                        local_68 = (EVP_PKEY *)0x0;
                        if ((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x20) & 3) == 0) {
                          lVar36 = 0;
                        }
                        else {
                          lVar36 = X509_get0_pubkey(*(undefined8 *)
                                                     (*(long *)(param_1 + 0x918) + 0x2b8));
                        }
                        bVar35 = false;
                      }
                    }
                    OSSL_PARAM_BLD_free(lVar34);
                    OSSL_PARAM_free(lVar26);
                    EVP_PKEY_free(local_68);
                    EVP_PKEY_CTX_free(ctx);
                    BN_free(pBVar25);
                    BN_free(a);
                    BN_free(a_00);
                    lVar34 = 0;
                    if (bVar35) goto LAB_009dea58;
joined_r0x009df0a8:
                    if (lVar36 == 0) goto LAB_009deb4c;
                    local_68 = (EVP_PKEY *)0x0;
                    uVar32 = param_2[1];
                    uVar31 = uVar6 - uVar32;
                    if (((long)uVar31 < 0) || (uVar6 < uVar31)) {
                      ERR_new();
                      ERR_set_debug("ssl/statem/statem_clnt.c",0x8be,"tls_process_key_exchange");
                      uVar28 = 0x32;
                      uVar30 = 0xc0103;
                    }
                    else {
                      if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 1 & 1) == 0
                         ) {
                        iVar23 = tls1_set_peer_legacy_sigalg(param_1,lVar36);
                        if (iVar23 == 0) {
                          ERR_new();
                          ERR_set_debug("ssl/statem/statem_clnt.c",0x8cf,"tls_process_key_exchange")
                          ;
                          uVar28 = 0x50;
                          uVar30 = 0x14d;
                          goto LAB_009dea48;
                        }
                      }
                      else {
                        if (uVar32 < 2) {
                          ERR_new();
                          pcVar29 = "tls_process_key_exchange";
                          uVar28 = 0x8c6;
                          goto LAB_009ded68;
                        }
                        uVar21 = *(ushort *)*param_2;
                        *param_2 = (long)((ushort *)*param_2 + 1);
                        param_2[1] = uVar32 - 2;
                        iVar23 = tls12_check_peer_sigalg(param_1,uVar21 >> 8 | uVar21 << 8,lVar36);
                        if (iVar23 < 1) goto LAB_009dea54;
                      }
                      iVar23 = tls1_lookup_md(*(undefined8 *)(param_1 + 0x9a8),
                                              *(undefined8 *)(param_1 + 0x3b0),&local_68);
                      if (iVar23 != 0) {
                        uVar6 = param_2[1] - 2;
                        if (1 < (ulong)param_2[1]) {
                          puVar33 = (undefined1 *)*param_2;
                          uVar32 = (ulong)CONCAT11(*puVar33,puVar33[1]);
                          lVar34 = uVar6 - uVar32;
                          if (uVar32 <= uVar6) {
                            *param_2 = (long)(puVar33 + 2 + uVar32);
                            param_2[1] = lVar34;
                            if (lVar34 == 0) {
                              lVar34 = EVP_MD_CTX_new();
                              if (lVar34 == 0) {
                                ERR_new();
                                ERR_set_debug("ssl/statem/statem_clnt.c",0x8e4,
                                              "tls_process_key_exchange");
                                uVar24 = 0xc0100;
LAB_009df5a4:
                                uVar28 = 0x50;
                              }
                              else {
                                if (local_68 == (EVP_PKEY *)0x0) {
                                  uVar28 = 0;
                                }
                                else {
                                  uVar28 = EVP_MD_get0_name();
                                }
                                iVar23 = EVP_DigestVerifyInit_ex
                                                   (lVar34,&local_70,uVar28,
                                                    **(undefined8 **)(param_1 + 0x9a8),
                                                    (*(undefined8 **)(param_1 + 0x9a8))[0x88],lVar36
                                                    ,0);
                                if (iVar23 < 1) {
                                  ERR_new();
                                  uVar28 = 0x8ec;
LAB_009df594:
                                  ERR_set_debug("ssl/statem/statem_clnt.c",uVar28,
                                                "tls_process_key_exchange");
                                  uVar24 = 0x80006;
                                  goto LAB_009df5a4;
                                }
                                if (((*(long *)(param_1 + 0x3b0) != 0) &&
                                    (*(int *)(*(long *)(param_1 + 0x3b0) + 0x14) == 0x390)) &&
                                   ((iVar23 = EVP_PKEY_CTX_set_rsa_padding(local_70,6), iVar23 < 1
                                    || (iVar23 = EVP_PKEY_CTX_set_rsa_pss_saltlen
                                                           (local_70,0xffffffff), iVar23 < 1)))) {
                                  ERR_new();
                                  uVar28 = 0x8f3;
                                  goto LAB_009df594;
                                }
                                lVar27 = construct_key_exchange_tbs(param_1,&local_78,lVar27,uVar31)
                                ;
                                if (lVar27 == 0) goto LAB_009dea58;
                                iVar23 = EVP_DigestVerify(lVar34,puVar33 + 2,uVar32,local_78,lVar27)
                                ;
                                CRYPTO_free(local_78);
                                if (0 < iVar23) {
                                  EVP_MD_CTX_free(lVar34);
                                  return 3;
                                }
                                ERR_new();
                                ERR_set_debug("ssl/statem/statem_clnt.c",0x902,
                                              "tls_process_key_exchange");
                                uVar28 = 0x33;
                                uVar24 = 0x7b;
                              }
                              ossl_statem_fatal(param_1,uVar28,uVar24,0);
                              goto LAB_009dea58;
                            }
                          }
                        }
                        ERR_new();
                        pcVar29 = "tls_process_key_exchange";
                        uVar28 = 0x8de;
                        goto LAB_009dea3c;
                      }
                      ERR_new();
                      ERR_set_debug("ssl/statem/statem_clnt.c",0x8d5,"tls_process_key_exchange");
                      uVar28 = 0x50;
                      uVar30 = 0x129;
                    }
                    goto LAB_009dea48;
                  }
                }
              }
            }
          }
        }
        ERR_new();
        pcVar29 = "tls_process_ske_dhe";
        uVar28 = 0x7f6;
      }
      else {
        uVar31 = param_2[1] - 2;
        if (1 < (ulong)param_2[1]) {
          puVar33 = (undefined1 *)*param_2;
          uVar11 = *puVar33;
          uVar12 = puVar33[1];
          uVar32 = (ulong)CONCAT11(uVar11,uVar12);
          uVar22 = uVar31 - uVar32;
          if (uVar32 <= uVar31) {
            puVar1 = puVar33 + 2 + uVar32;
            *param_2 = (long)puVar1;
            param_2[1] = uVar22;
            if (1 < uVar22) {
              uVar13 = *puVar1;
              uVar14 = puVar1[1];
              uVar31 = (ulong)CONCAT11(uVar13,uVar14);
              lVar36 = (uVar22 - 2) - uVar31;
              if (uVar31 <= uVar22 - 2) {
                pbVar3 = puVar1 + 2 + uVar31;
                *param_2 = (long)pbVar3;
                param_2[1] = lVar36;
                if (lVar36 != 0) {
                  bVar9 = *pbVar3;
                  uVar32 = (ulong)bVar9;
                  uVar31 = (lVar36 - 1U) - uVar32;
                  if (uVar32 <= lVar36 - 1U) {
                    pbVar4 = pbVar3 + 1 + uVar32;
                    *param_2 = (long)pbVar4;
                    param_2[1] = uVar31;
                    if (1 < uVar31) {
                      bVar17 = *pbVar4;
                      bVar18 = pbVar4[1];
                      uVar32 = (ulong)CONCAT11(bVar17,bVar18);
                      if (uVar32 <= uVar31 - 2) {
                        *param_2 = (long)(pbVar4 + 2 + uVar32);
                        param_2[1] = (uVar31 - 2) - uVar32;
                        pBVar25 = BN_bin2bn(puVar33 + 2,(uint)CONCAT11(uVar11,uVar12),(BIGNUM *)0x0)
                        ;
                        *(BIGNUM **)(param_1 + 0xbf8) = pBVar25;
                        if (pBVar25 == (BIGNUM *)0x0) {
LAB_009df1b4:
                          ERR_new();
                          ERR_set_debug("ssl/statem/statem_clnt.c",0x7d5,"tls_process_ske_srp");
                          uVar28 = 0x50;
                          uVar30 = 0x80003;
                          goto LAB_009dea48;
                        }
                        pBVar25 = BN_bin2bn(puVar1 + 2,(uint)CONCAT11(uVar13,uVar14),(BIGNUM *)0x0);
                        *(BIGNUM **)(param_1 + 0xc00) = pBVar25;
                        if (pBVar25 == (BIGNUM *)0x0) goto LAB_009df1b4;
                        pBVar25 = BN_bin2bn(pbVar3 + 1,(uint)bVar9,(BIGNUM *)0x0);
                        *(BIGNUM **)(param_1 + 0xc08) = pBVar25;
                        if (pBVar25 == (BIGNUM *)0x0) goto LAB_009df1b4;
                        pBVar25 = BN_bin2bn(pbVar4 + 2,(uint)CONCAT11(bVar17,bVar18),(BIGNUM *)0x0);
                        *(BIGNUM **)(param_1 + 0xc10) = pBVar25;
                        if (pBVar25 == (BIGNUM *)0x0) goto LAB_009df1b4;
                        iVar23 = srp_verify_server_param(param_1);
                        if (iVar23 != 0) {
                          if ((*(byte *)(*(long *)(param_1 + 0x2e0) + 0x20) & 3) != 0) {
                            lVar36 = X509_get0_pubkey(*(undefined8 *)
                                                       (*(long *)(param_1 + 0x918) + 0x2b8));
                            goto joined_r0x009df0a8;
                          }
                          goto LAB_009deb4c;
                        }
                        goto LAB_009dea54;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        ERR_new();
        pcVar29 = "tls_process_ske_srp";
        uVar28 = 0x7c5;
      }
      goto LAB_009dea3c;
    }
LAB_009deb4c:
    if (((uVar7 & 0x1c8) != 0) || ((*(uint *)(*(long *)(param_1 + 0x2e0) + 0x20) & 0x44) != 0)) {
      if (param_2[1] == 0) {
        return 3;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0x914,"tls_process_key_exchange");
      uVar28 = 0x32;
      uVar30 = 0x99;
      goto LAB_009dea48;
    }
    iVar23 = ssl3_check_cert_and_algorithm(param_1);
    if (iVar23 != 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0x90d,"tls_process_key_exchange");
      uVar28 = 0x32;
      uVar30 = 0x186;
      goto LAB_009dea48;
    }
  }
LAB_009dea54:
  lVar34 = 0;
LAB_009dea58:
  EVP_MD_CTX_free(lVar34);
  return 0;
}

