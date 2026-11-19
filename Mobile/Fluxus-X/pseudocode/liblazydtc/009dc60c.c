/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dc60c
 */

undefined8 tls_construct_client_key_exchange(int *param_1,undefined8 param_2)

{
  uint uVar1;
  undefined4 uVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  char *pcVar6;
  long lVar7;
  uchar *puVar8;
  EVP_PKEY_CTX *pEVar9;
  EVP_PKEY *pkey;
  EVP_MD_CTX *ctx;
  EVP_MD *type;
  undefined8 uVar10;
  size_t sVar11;
  undefined8 uVar12;
  code *pcVar13;
  ulong len;
  uchar *local_368 [64];
  uchar *local_168 [32];
  uint uStack_64;
  size_t local_58;
  
  uVar1 = *(uint *)(*(long *)(param_1 + 0xb8) + 0x1c);
  if ((uVar1 & 0x1c8) == 0) {
LAB_009dc8f0:
    if ((uVar1 & 0x41) != 0) {
      local_368[0] = (uchar *)0x0;
      if (*(long *)(*(long *)(param_1 + 0x246) + 0x2b8) == 0) {
        ERR_new();
        pcVar6 = "tls_construct_cke_rsa";
        uVar10 = 0xb16;
      }
      else {
        uVar10 = X509_get0_pubkey();
        iVar4 = EVP_PKEY_is_a(uVar10,&DAT_002db996);
        if (iVar4 != 0) {
          puVar8 = CRYPTO_malloc(0x30,"ssl/statem/statem_clnt.c",0xb21);
          if (puVar8 == (uchar *)0x0) {
            ERR_new();
            pcVar6 = "tls_construct_cke_rsa";
            uVar10 = 0xb23;
            goto LAB_009dcc20;
          }
          *puVar8 = (uchar)((uint)param_1[0x283] >> 8);
          puVar8[1] = (uchar)param_1[0x283];
          iVar4 = RAND_bytes_ex(**(undefined8 **)(param_1 + 0x26a),puVar8 + 2,0x2e,0);
          if (iVar4 < 1) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0xb2a,"tls_construct_cke_rsa");
            uVar2 = 0xc0100;
LAB_009dd05c:
            ossl_statem_fatal(param_1,0x50,uVar2,0);
LAB_009dd068:
            pEVar9 = (EVP_PKEY_CTX *)0x0;
          }
          else {
            if ((0x300 < *param_1) &&
               (iVar4 = WPACKET_start_sub_packet_len__(param_2,2), iVar4 == 0)) {
              ERR_new();
              uVar10 = 0xb30;
LAB_009dd04c:
              ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,"tls_construct_cke_rsa");
              uVar2 = 0xc0103;
              goto LAB_009dd05c;
            }
            pEVar9 = (EVP_PKEY_CTX *)
                     EVP_PKEY_CTX_new_from_pkey
                               (**(undefined8 **)(param_1 + 0x26a),uVar10,
                                (*(undefined8 **)(param_1 + 0x26a))[0x88]);
            if (((pEVar9 != (EVP_PKEY_CTX *)0x0) &&
                (iVar4 = EVP_PKEY_encrypt_init(pEVar9), 0 < iVar4)) &&
               (iVar4 = EVP_PKEY_encrypt(pEVar9,(uchar *)0x0,(size_t *)local_168,puVar8,0x30),
               0 < iVar4)) {
              iVar4 = WPACKET_allocate_bytes(param_2,local_168[0],local_368);
              if ((iVar4 == 0) ||
                 (iVar4 = EVP_PKEY_encrypt(pEVar9,local_368[0],(size_t *)local_168,puVar8,0x30),
                 iVar4 < 1)) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_clnt.c",0xb3c,"tls_construct_cke_rsa");
                uVar10 = 0x77;
                goto LAB_009dccf4;
              }
              EVP_PKEY_CTX_free(pEVar9);
              if ((0x300 < *param_1) && (iVar4 = WPACKET_close(param_2), iVar4 == 0)) {
                ERR_new();
                uVar10 = 0xb44;
                goto LAB_009dd04c;
              }
              iVar4 = ssl_log_rsa_client_key_exchange(param_1,local_368[0],local_168[0],puVar8,0x30)
              ;
              if (iVar4 != 0) {
                *(uchar **)(param_1 + 0xd8) = puVar8;
                uVar10 = 0x30;
                goto LAB_009dca54;
              }
              goto LAB_009dd068;
            }
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0xb37,"tls_construct_cke_rsa");
            uVar10 = 0x80006;
LAB_009dccf4:
            ossl_statem_fatal(param_1,0x50,uVar10,0);
          }
          CRYPTO_clear_free(puVar8,0x30,"ssl/statem/statem_clnt.c",0xb53);
          EVP_PKEY_CTX_free(pEVar9);
          goto LAB_009dd2b0;
        }
        ERR_new();
        pcVar6 = "tls_construct_cke_rsa";
        uVar10 = 0xb1c;
      }
LAB_009dcb58:
      ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,pcVar6);
      uVar10 = 0x50;
      uVar12 = 0xc0103;
LAB_009dcb68:
      ossl_statem_fatal(param_1,uVar10,uVar12,0);
      goto LAB_009dd2b0;
    }
    if ((uVar1 & 0x102) == 0) {
      if ((uVar1 & 0x84) == 0) {
        if ((uVar1 >> 4 & 1) == 0) {
          if ((uVar1 >> 9 & 1) == 0) {
            if ((uVar1 >> 5 & 1) == 0) {
              if ((uVar1 >> 3 & 1) != 0) {
                return 1;
              }
              ERR_new();
              pcVar6 = "tls_construct_client_key_exchange";
              uVar10 = 0xcf3;
            }
            else {
              local_368[0] = (uchar *)0x0;
              if (*(BIGNUM **)(param_1 + 0x306) != (BIGNUM *)0x0) {
                iVar4 = BN_num_bits(*(BIGNUM **)(param_1 + 0x306));
                uVar1 = iVar4 + 0xe;
                if (-1 < (int)(iVar4 + 7U)) {
                  uVar1 = iVar4 + 7U;
                }
                iVar4 = WPACKET_sub_allocate_bytes__
                                  (param_2,(long)((ulong)uVar1 << 0x20) >> 0x23,local_368,2);
                if (iVar4 != 0) {
                  BN_bn2bin(*(BIGNUM **)(param_1 + 0x306),local_368[0]);
                  CRYPTO_free(*(void **)(*(long *)(param_1 + 0x246) + 0x370));
                  pcVar6 = CRYPTO_strdup(*(char **)(param_1 + 0x2fc),"ssl/statem/statem_clnt.c",
                                         0xcc5);
                  *(char **)(*(long *)(param_1 + 0x246) + 0x370) = pcVar6;
                  if (pcVar6 != (char *)0x0) {
                    return 1;
                  }
                  ERR_new();
                  pcVar6 = "tls_construct_cke_srp";
                  uVar10 = 0xcc7;
                  goto LAB_009dcc20;
                }
              }
              ERR_new();
              pcVar6 = "tls_construct_cke_srp";
              uVar10 = 0xcbf;
            }
            goto LAB_009dcb58;
          }
          local_368[0] = (uchar *)0x0;
          if ((*(uint *)(*(long *)(param_1 + 0xb8) + 0x24) >> 0x16 & 1) == 0) {
            if ((*(uint *)(*(long *)(param_1 + 0xb8) + 0x24) >> 0x17 & 1) == 0) {
              ERR_new();
              pcVar6 = "tls_construct_cke_gost18";
              uVar10 = 0xc64;
              goto LAB_009dcb58;
            }
            iVar4 = 0x3f5;
          }
          else {
            iVar4 = 0x4a4;
          }
          iVar5 = ossl_gost_ukm(param_1,local_168);
          if (iVar5 < 1) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_clnt.c",0xc69,"tls_construct_cke_gost18");
            ossl_statem_fatal(param_1,0x50,0xc0103,0);
            pEVar9 = (EVP_PKEY_CTX *)0x0;
            puVar8 = (uchar *)0x0;
            uVar10 = 0;
          }
          else {
            puVar8 = CRYPTO_malloc(0x20,"ssl/statem/statem_clnt.c",0xc6f);
            if (puVar8 == (uchar *)0x0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0xc71,"tls_construct_cke_gost18");
              uVar12 = 0xc0100;
              uVar10 = 0x50;
LAB_009dd640:
              ossl_statem_fatal(param_1,uVar10,uVar12,0);
              pEVar9 = (EVP_PKEY_CTX *)0x0;
            }
            else {
              iVar5 = RAND_bytes_ex(**(undefined8 **)(param_1 + 0x26a),puVar8,0x20,0);
              if (iVar5 < 1) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_clnt.c",0xc76,"tls_construct_cke_gost18");
                uVar10 = 0x50;
                uVar12 = 0xc0103;
                goto LAB_009dd640;
              }
              if (*(long *)(*(long *)(param_1 + 0x246) + 0x2b8) == 0) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_clnt.c",0xc7e,"tls_construct_cke_gost18");
                uVar10 = 0x28;
                uVar12 = 0x14a;
                goto LAB_009dd640;
              }
              uVar12 = **(undefined8 **)(param_1 + 0x26a);
              uVar10 = X509_get0_pubkey();
              pEVar9 = (EVP_PKEY_CTX *)
                       EVP_PKEY_CTX_new_from_pkey
                                 (uVar12,uVar10,*(undefined8 *)(*(long *)(param_1 + 0x26a) + 0x440))
              ;
              if (pEVar9 == (EVP_PKEY_CTX *)0x0) {
                ERR_new();
                ERR_set_debug("ssl/statem/statem_clnt.c",0xc86,"tls_construct_cke_gost18");
                uVar10 = 0xc0100;
              }
              else {
                iVar5 = EVP_PKEY_encrypt_init(pEVar9);
                if (iVar5 < 1) {
                  ERR_new();
                  ERR_set_debug("ssl/statem/statem_clnt.c",0xc8b,"tls_construct_cke_gost18");
                  uVar10 = 0xc0103;
                }
                else {
                  iVar5 = EVP_PKEY_CTX_ctrl(pEVar9,-1,0x200,8,0x20,local_168);
                  if (iVar5 < 1) {
                    ERR_new();
                    uVar10 = 0xc92;
                  }
                  else {
                    iVar4 = EVP_PKEY_CTX_ctrl(pEVar9,-1,0x200,0xc,iVar4,(void *)0x0);
                    if (0 < iVar4) {
                      iVar4 = EVP_PKEY_encrypt(pEVar9,(uchar *)0x0,&local_58,puVar8,0x20);
                      if (iVar4 < 1) {
                        ERR_new();
                        uVar10 = 0xc9d;
                      }
                      else {
                        iVar4 = WPACKET_allocate_bytes(param_2,local_58,local_368);
                        if ((iVar4 != 0) &&
                           (iVar4 = EVP_PKEY_encrypt(pEVar9,local_368[0],&local_58,puVar8,0x20),
                           0 < iVar4)) {
                          EVP_PKEY_CTX_free(pEVar9);
                          *(uchar **)(param_1 + 0xd8) = puVar8;
                          goto LAB_009dd4dc;
                        }
                        ERR_new();
                        uVar10 = 0xca3;
                      }
                      ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,"tls_construct_cke_gost18");
                      uVar10 = 0x80006;
                      goto LAB_009dd754;
                    }
                    ERR_new();
                    uVar10 = 0xc98;
                  }
                  ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,"tls_construct_cke_gost18");
                  uVar10 = 0x112;
                }
              }
LAB_009dd754:
              ossl_statem_fatal(param_1,0x50,uVar10,0);
            }
            uVar10 = 0x20;
          }
          EVP_PKEY_CTX_free(pEVar9);
          CRYPTO_clear_free(puVar8,uVar10,"ssl/statem/statem_clnt.c",0xcaf);
          goto LAB_009dd2b0;
        }
        iVar4 = 0x329;
        if ((*(byte *)(*(long *)(param_1 + 0xb8) + 0x20) & 0x80) != 0) {
          iVar4 = 0x3d6;
        }
        if (*(long *)(*(long *)(param_1 + 0x246) + 0x2b8) == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0xbdb,"tls_construct_cke_gost");
          uVar10 = 0x28;
          uVar12 = 0x14a;
        }
        else {
          uVar12 = **(undefined8 **)(param_1 + 0x26a);
          uVar10 = X509_get0_pubkey();
          pEVar9 = (EVP_PKEY_CTX *)
                   EVP_PKEY_CTX_new_from_pkey
                             (uVar12,uVar10,*(undefined8 *)(*(long *)(param_1 + 0x26a) + 0x440));
          if (pEVar9 != (EVP_PKEY_CTX *)0x0) {
            puVar8 = CRYPTO_malloc(0x20,"ssl/statem/statem_clnt.c",0xbee);
            if (puVar8 == (uchar *)0x0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0xbf0,"tls_construct_cke_gost");
              uVar10 = 0xc0100;
LAB_009dd388:
              ossl_statem_fatal(param_1,0x50,uVar10,0);
              ctx = (EVP_MD_CTX *)0x0;
            }
            else {
              iVar5 = EVP_PKEY_encrypt_init(pEVar9);
              if ((iVar5 < 1) ||
                 (iVar5 = RAND_bytes_ex(**(undefined8 **)(param_1 + 0x26a),puVar8,0x20,0), iVar5 < 1
                 )) {
                ERR_new();
                uVar10 = 0xbf8;
LAB_009dd348:
                ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,"tls_construct_cke_gost");
                uVar10 = 0xc0103;
                goto LAB_009dd388;
              }
              ctx = (EVP_MD_CTX *)EVP_MD_CTX_new();
              if (ctx != (EVP_MD_CTX *)0x0) {
                pcVar6 = OBJ_nid2sn(iVar4);
                type = EVP_get_digestbyname(pcVar6);
                iVar4 = EVP_DigestInit(ctx,type);
                if ((((0 < iVar4) && (iVar4 = EVP_DigestUpdate(ctx,param_1 + 0x58,0x20), 0 < iVar4))
                    && (iVar4 = EVP_DigestUpdate(ctx,param_1 + 0x50,0x20), 0 < iVar4)) &&
                   (iVar4 = EVP_DigestFinal_ex(ctx,(uchar *)local_168,&uStack_64), 0 < iVar4)) {
                  EVP_MD_CTX_free(ctx);
                  iVar4 = EVP_PKEY_CTX_ctrl(pEVar9,-1,0x200,8,8,local_168);
                  if (iVar4 < 1) {
                    ERR_new();
                    uVar10 = 0xc0e;
                  }
                  else {
                    local_58 = 0xff;
                    iVar4 = EVP_PKEY_encrypt(pEVar9,(uchar *)local_368,&local_58,puVar8,0x20);
                    if (0 < iVar4) {
                      iVar4 = WPACKET_put_bytes__(param_2,0x30,1);
                      if (((iVar4 == 0) ||
                          ((0x7f < local_58 &&
                           (iVar4 = WPACKET_put_bytes__(param_2,0x81,1), iVar4 == 0)))) ||
                         (iVar4 = WPACKET_sub_memcpy__(param_2,local_368,local_58,1), iVar4 == 0)) {
                        ERR_new();
                        uVar10 = 0xc1e;
                        goto LAB_009dd348;
                      }
                      EVP_PKEY_CTX_free(pEVar9);
                      *(uchar **)(param_1 + 0xd8) = puVar8;
LAB_009dd4dc:
                      uVar10 = 0x20;
LAB_009dca54:
                      *(undefined8 *)(param_1 + 0xda) = uVar10;
                      return 1;
                    }
                    ERR_new();
                    uVar10 = 0xc17;
                  }
                  ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,"tls_construct_cke_gost");
                  uVar10 = 0x112;
                  goto LAB_009dd388;
                }
              }
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0xc07,"tls_construct_cke_gost");
              ossl_statem_fatal(param_1,0x50,0xc0103,0);
            }
            EVP_PKEY_CTX_free(pEVar9);
            CRYPTO_clear_free(puVar8,0x20,"ssl/statem/statem_clnt.c",0xc29);
            EVP_MD_CTX_free(ctx);
            goto LAB_009dd2b0;
          }
          ERR_new();
          pcVar6 = "tls_construct_cke_gost";
          uVar10 = 0xbe3;
LAB_009dcc20:
          ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,pcVar6);
          uVar12 = 0xc0100;
          uVar10 = 0x50;
        }
        goto LAB_009dcb68;
      }
      local_368[0] = (uchar *)0x0;
      lVar7 = *(long *)(param_1 + 300);
      if (lVar7 == 0) {
        ERR_new();
        pcVar6 = "tls_construct_cke_ecdhe";
        uVar10 = 0xba1;
        goto LAB_009dcb58;
      }
      pkey = (EVP_PKEY *)ssl_generate_pkey(param_1,lVar7);
      if (pkey != (EVP_PKEY *)0x0) {
        iVar4 = ssl_derive(param_1,pkey,lVar7,0);
        if (iVar4 == 0) goto LAB_009dd0cc;
        lVar7 = EVP_PKEY_get1_encoded_public_key(pkey,local_368);
        if (lVar7 == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0xbb4,"tls_construct_cke_ecdhe");
          uVar2 = 0x80010;
        }
        else {
          iVar4 = WPACKET_sub_memcpy__(param_2,local_368[0],lVar7,1);
          if (iVar4 != 0) {
            puVar8 = local_368[0];
            goto LAB_009dcbf4;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_clnt.c",0xbb9,"tls_construct_cke_ecdhe");
          uVar2 = 0xc0103;
        }
        ossl_statem_fatal(param_1,0x50,uVar2,0);
        puVar8 = local_368[0];
        goto LAB_009dd2a4;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xba7,"tls_construct_cke_ecdhe");
      ossl_statem_fatal(param_1,0x50,0xc0100,0);
      puVar8 = local_368[0];
LAB_009dcd74:
      CRYPTO_free(puVar8);
      pkey = (EVP_PKEY *)0x0;
    }
    else {
      local_368[0] = (uchar *)0x0;
      local_168[0] = (uchar *)0x0;
      lVar7 = *(long *)(param_1 + 300);
      if (lVar7 == 0) {
        ERR_new();
        uVar10 = 0xb64;
LAB_009dcd4c:
        ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,"tls_construct_cke_dhe");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
        puVar8 = local_168[0];
        goto LAB_009dcd74;
      }
      pkey = (EVP_PKEY *)ssl_generate_pkey(param_1,lVar7);
      if (pkey == (EVP_PKEY *)0x0) {
        ERR_new();
        uVar10 = 0xb6a;
        goto LAB_009dcd4c;
      }
      iVar4 = ssl_derive(param_1,pkey,lVar7,0);
      if (iVar4 == 0) {
LAB_009dd0cc:
        puVar8 = (uchar *)0x0;
LAB_009dd2a4:
        CRYPTO_free(puVar8);
      }
      else {
        lVar7 = EVP_PKEY_get1_encoded_public_key(pkey,local_168);
        if (lVar7 != 0) {
          iVar4 = EVP_PKEY_get_size(pkey);
          sVar11 = iVar4 - lVar7;
          if (sVar11 == 0) {
LAB_009dcaf8:
            iVar4 = WPACKET_sub_memcpy__(param_2,local_168[0],lVar7,2);
            if (iVar4 != 0) {
              puVar8 = local_168[0];
LAB_009dcbf4:
              CRYPTO_free(puVar8);
              EVP_PKEY_free(pkey);
              return 1;
            }
            ERR_new();
            uVar10 = 0xb8d;
          }
          else {
            iVar4 = WPACKET_sub_allocate_bytes__(param_2,sVar11,local_368,2);
            if (iVar4 != 0) {
              memset(local_368[0],0,sVar11);
              goto LAB_009dcaf8;
            }
            ERR_new();
            uVar10 = 0xb86;
          }
          ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,"tls_construct_cke_dhe");
          ossl_statem_fatal(param_1,0x50,0xc0103,0);
          puVar8 = local_168[0];
          goto LAB_009dd2a4;
        }
        ERR_new();
        ERR_set_debug("ssl/statem/statem_clnt.c",0xb78,"tls_construct_cke_dhe");
        ossl_statem_fatal(param_1,0x50,0xc0103,0);
      }
    }
    EVP_PKEY_free(pkey);
    goto LAB_009dd2b0;
  }
  pcVar13 = *(code **)(param_1 + 0x262);
  if (pcVar13 == (code *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0xacd,"tls_construct_cke_psk_preamble");
    uVar10 = 0x50;
    uVar12 = 0xe0;
LAB_009dc7c8:
    ossl_statem_fatal(param_1,uVar10,uVar12,0);
    OPENSSL_cleanse(local_368,0);
    OPENSSL_cleanse(local_168,0x101);
    uVar10 = 0;
LAB_009dc7f8:
    CRYPTO_clear_free(0,uVar10,"ssl/statem/statem_clnt.c",0xaff);
    pcVar6 = (char *)0x0;
    sVar11 = 0;
  }
  else {
    memset(local_168,0,0x101);
    uVar3 = (*pcVar13)(param_1,*(undefined8 *)(*(long *)(param_1 + 0x246) + 0x2a0),local_168,0x100,
                       local_368,0x200);
    if (0x200 < uVar3) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xad8,"tls_construct_cke_psk_preamble");
      ossl_statem_fatal(param_1,0x28,0xc0103,0);
      OPENSSL_cleanse(local_368,0x200);
      OPENSSL_cleanse(local_168,0x101);
      uVar10 = 0x200;
      goto LAB_009dc7f8;
    }
    len = (ulong)uVar3;
    if (uVar3 == 0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xadc,"tls_construct_cke_psk_preamble");
      uVar10 = 0x28;
      uVar12 = 0xdf;
      goto LAB_009dc7c8;
    }
    sVar11 = strlen((char *)local_168);
    if (sVar11 < 0x101) {
      lVar7 = CRYPTO_memdup(local_368,len,"ssl/statem/statem_clnt.c",0xae6);
      pcVar6 = CRYPTO_strdup((char *)local_168,"ssl/statem/statem_clnt.c",0xae7);
      if ((lVar7 != 0) && (pcVar6 != (char *)0x0)) {
        CRYPTO_free(*(void **)(param_1 + 0xdc));
        *(long *)(param_1 + 0xdc) = lVar7;
        *(ulong *)(param_1 + 0xde) = len;
        CRYPTO_free(*(void **)(*(long *)(param_1 + 0x246) + 0x2a8));
        *(char **)(*(long *)(param_1 + 0x246) + 0x2a8) = pcVar6;
        iVar4 = WPACKET_sub_memcpy__(param_2,local_168,sVar11,2);
        if (iVar4 != 0) {
          OPENSSL_cleanse(local_368,len);
          OPENSSL_cleanse(local_168,0x101);
          CRYPTO_clear_free(0,len,"ssl/statem/statem_clnt.c",0xaff);
          CRYPTO_clear_free(0,sVar11,"ssl/statem/statem_clnt.c",0xb00);
          goto LAB_009dc8f0;
        }
        ERR_new();
        uVar10 = 0xaf6;
        goto LAB_009dc748;
      }
      ERR_new();
      ERR_set_debug("ssl/statem/statem_clnt.c",0xae9,"tls_construct_cke_psk_preamble");
      ossl_statem_fatal(param_1,0x50,0xc0100,0);
      OPENSSL_cleanse(local_368,len);
      OPENSSL_cleanse(local_168,0x101);
      CRYPTO_clear_free(lVar7,len,"ssl/statem/statem_clnt.c",0xaff);
    }
    else {
      ERR_new();
      uVar10 = 0xae2;
LAB_009dc748:
      ERR_set_debug("ssl/statem/statem_clnt.c",uVar10,"tls_construct_cke_psk_preamble");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      OPENSSL_cleanse(local_368,len);
      OPENSSL_cleanse(local_168,0x101);
      CRYPTO_clear_free(0,len,"ssl/statem/statem_clnt.c",0xaff);
      pcVar6 = (char *)0x0;
    }
  }
  CRYPTO_clear_free(pcVar6,sVar11,"ssl/statem/statem_clnt.c",0xb00);
LAB_009dd2b0:
  CRYPTO_clear_free(*(undefined8 *)(param_1 + 0xd8),*(undefined8 *)(param_1 + 0xda),
                    "ssl/statem/statem_clnt.c",0xcf9);
  param_1[0xda] = 0;
  param_1[0xdb] = 0;
  param_1[0xd8] = 0;
  param_1[0xd9] = 0;
  CRYPTO_clear_free(*(undefined8 *)(param_1 + 0xdc),*(undefined8 *)(param_1 + 0xde),
                    "ssl/statem/statem_clnt.c",0xcfd);
  param_1[0xde] = 0;
  param_1[0xdf] = 0;
  param_1[0xdc] = 0;
  param_1[0xdd] = 0;
  return 0;
}

