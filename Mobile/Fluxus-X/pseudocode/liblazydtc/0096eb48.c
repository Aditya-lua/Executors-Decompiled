/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096eb48
 */

int FUN_0096eb48(undefined8 param_1,long param_2,undefined8 *param_3,undefined8 param_4)

{
  long *plVar1;
  undefined *puVar2;
  ulong **ppuVar3;
  ulong uVar4;
  size_t sVar5;
  byte bVar6;
  long lVar7;
  bool bVar8;
  int iVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  int iVar12;
  uint uVar13;
  int iVar14;
  long lVar15;
  long lVar16;
  BIO_METHOD *pBVar17;
  BIO *pBVar18;
  X509 *pXVar19;
  ulong uVar20;
  X509_NAME *pXVar21;
  BIO *out;
  ASN1_TIME *pAVar22;
  long lVar23;
  stack_st_X509 *psVar24;
  undefined8 uVar25;
  undefined *puVar26;
  OCSP_RESPONSE *resp;
  char *pcVar27;
  OCSP_BASICRESP *bs;
  X509_STORE *st;
  X509 *issuer;
  X509_PUBKEY *pXVar28;
  ulong *puVar29;
  EVP_MD *dgst;
  OCSP_CERTID *id;
  char *pcVar30;
  undefined8 *puVar31;
  SSL *ssl;
  ulong uVar32;
  int local_abc;
  long local_a80;
  ASN1_OBJECT *local_a78;
  ASN1_GENERALIZEDTIME *local_a70;
  int local_a68;
  uint local_a64;
  char acStack_a60 [2048];
  char local_260 [256];
  ASN1_GENERALIZEDTIME *apAStack_160 [10];
  ulong *local_110 [10];
  ulong *local_c0 [10];
  long local_70;
  
  lVar7 = tpidr_el0;
  local_70 = *(long *)(lVar7 + 0x28);
  lVar15 = FUN_009685e4();
  lVar16 = FUN_009685c0(param_1);
  memset(local_260,0,0x100);
  pBVar17 = BIO_s_mem();
  pBVar18 = BIO_new(pBVar17);
  if (pBVar18 == (BIO *)0x0) {
    pcVar27 = local_260;
    uVar20 = ERR_get_error();
    local_260[0] = '\0';
    uVar25 = OpenSSL_version(6);
    uVar32 = 0x100;
    uVar13 = curl_msnprintf(local_260,0x100,"%s/%s","OpenSSL",uVar25);
    if (uVar13 < 0xfe) {
      lVar15 = (long)(int)uVar13;
      (pcVar27 + lVar15)[0] = ':';
      (pcVar27 + lVar15)[1] = ' ';
      pcVar27 = local_260 + lVar15 + 2;
      *pcVar27 = '\0';
      uVar32 = 0xfe - lVar15;
    }
    ERR_error_string_n(uVar20,pcVar27,uVar32);
    if (*pcVar27 == '\0') {
      uVar4 = 8;
      if (uVar20 != 0) {
        uVar4 = 0xd;
      }
      if (uVar4 < uVar32) {
        pcVar30 = "No error";
        if (uVar20 != 0) {
          pcVar30 = "Unknown error";
        }
        strcpy(pcVar27,pcVar30);
      }
    }
    FUN_00904b80(param_2,"BIO_new return NULL, OpenSSL error %s",pcVar27);
    local_abc = 0x1b;
    goto LAB_0096f870;
  }
  bVar6 = *(byte *)(lVar16 + 0x79);
  if ((*(byte *)(param_2 + 0x5f0) & 1) != 0) {
    FUN_0096b528(param_2,param_3[1]);
  }
  pXVar19 = (X509 *)SSL_get1_peer_certificate(param_3[1]);
  param_3[2] = pXVar19;
  if (pXVar19 == (X509 *)0x0) {
    BIO_free(pBVar18);
    if ((bVar6 & 3) == 0) {
      local_abc = 0;
    }
    else {
      FUN_00904b80(param_2,"SSL: could not get peer certificate");
      local_abc = 0x3c;
    }
    goto LAB_0096f870;
  }
  plVar1 = param_3 + 2;
  if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
     ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
    uVar20 = FUN_00968c14(param_1);
    pcVar27 = "Proxy";
    if ((uVar20 & 1) == 0) {
      pcVar27 = "Server";
    }
    FUN_00904c98(param_2,"%s certificate:",pcVar27);
    pXVar19 = (X509 *)*plVar1;
  }
  pXVar21 = X509_get_subject_name(pXVar19);
  pBVar17 = BIO_s_mem();
  out = BIO_new(pBVar17);
  if (out == (BIO *)0x0) {
    bVar8 = true;
  }
  else {
    iVar9 = X509_NAME_print_ex(out,pXVar21,0,0x30000);
    BIO_ctrl(out,0x73,0,local_c0);
    sVar5 = *local_c0[0];
    if (0x7fe < sVar5) {
      sVar5 = 0x7ff;
    }
    memcpy(acStack_a60,(void *)local_c0[0][1],sVar5);
    acStack_a60[sVar5] = '\0';
    BIO_free(out);
    bVar8 = iVar9 == 0;
  }
  if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
     ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
    pcVar27 = acStack_a60;
    if (bVar8) {
      pcVar27 = "[NONE]";
    }
    FUN_00904c98(param_2," subject: %s",pcVar27);
  }
  pAVar22 = (ASN1_TIME *)X509_get0_notBefore(*plVar1);
  ASN1_TIME_print(pBVar18,pAVar22);
  lVar23 = BIO_ctrl(pBVar18,3,0,&local_a80);
  if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
     ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
    FUN_00904c98(param_2," start date: %.*s",lVar23,local_a80);
  }
  BIO_ctrl(pBVar18,1,0,(void *)0x0);
  pAVar22 = (ASN1_TIME *)X509_get0_notAfter(*plVar1);
  ASN1_TIME_print(pBVar18,pAVar22);
  lVar23 = BIO_ctrl(pBVar18,3,0,&local_a80);
  if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
     ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
    FUN_00904c98(param_2," expire date: %.*s",lVar23,local_a80);
  }
  BIO_ctrl(pBVar18,1,0,(void *)0x0);
  BIO_free(pBVar18);
  if ((*(byte *)(lVar16 + 0x79) >> 1 & 1) == 0) {
LAB_0096ef14:
    pXVar21 = X509_get_issuer_name((X509 *)*plVar1);
    pBVar17 = BIO_s_mem();
    pBVar18 = BIO_new(pBVar17);
    if (pBVar18 == (BIO *)0x0) {
LAB_0096f034:
      if ((bVar6 & 3) != 0) {
        FUN_00904b80(param_2,"SSL: could not get X509-issuer name");
      }
LAB_0096f04c:
      local_abc = 0x3c;
    }
    else {
      iVar9 = X509_NAME_print_ex(pBVar18,pXVar21,0,0x30000);
      BIO_ctrl(pBVar18,0x73,0,local_c0);
      sVar5 = *local_c0[0];
      if (0x7fe < sVar5) {
        sVar5 = 0x7ff;
      }
      memcpy(acStack_a60,(void *)local_c0[0][1],sVar5);
      acStack_a60[sVar5] = '\0';
      BIO_free(pBVar18);
      if (iVar9 == 0) goto LAB_0096f034;
      if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
        FUN_00904c98(param_2," issuer: %s",acStack_a60);
      }
      puVar31 = *(undefined8 **)(lVar16 + 0x50);
      if (*(long *)(lVar16 + 0x10) != 0) {
        if (puVar31 != (undefined8 *)0x0) goto LAB_0096f288;
        pBVar17 = BIO_s_file();
        pBVar18 = BIO_new(pBVar17);
        if (pBVar18 == (BIO *)0x0) {
          pcVar27 = local_260;
          uVar20 = ERR_get_error();
          local_260[0] = '\0';
          uVar25 = OpenSSL_version(6);
          uVar32 = 0x100;
          uVar13 = curl_msnprintf(local_260,0x100,"%s/%s","OpenSSL",uVar25);
          if (uVar13 < 0xfe) {
            lVar15 = (long)(int)uVar13;
            (pcVar27 + lVar15)[0] = ':';
            (pcVar27 + lVar15)[1] = ' ';
            pcVar27 = local_260 + lVar15 + 2;
            *pcVar27 = '\0';
            uVar32 = 0xfe - lVar15;
          }
          ERR_error_string_n(uVar20,pcVar27,uVar32);
          if (*pcVar27 == '\0') {
            uVar4 = 8;
            if (uVar20 != 0) {
              uVar4 = 0xd;
            }
            if (uVar4 < uVar32) {
              pcVar30 = "No error";
              if (uVar20 != 0) {
                pcVar30 = "Unknown error";
              }
              strcpy(pcVar27,pcVar30);
            }
          }
          pcVar30 = "BIO_new return NULL, OpenSSL error %s";
          goto LAB_0096f5ac;
        }
        lVar23 = BIO_ctrl(pBVar18,0x6c,3,*(void **)(lVar16 + 0x10));
        if (0 < (int)lVar23) goto LAB_0096f29c;
        if ((bVar6 & 3) != 0) {
          FUN_00904b80(param_2,"SSL: Unable to open issuer cert (%s)",*(undefined8 *)(lVar16 + 0x10)
                      );
        }
        BIO_free(pBVar18);
LAB_0096f3dc:
        X509_free((X509 *)*plVar1);
        *plVar1 = 0;
        local_abc = 0x53;
        goto LAB_0096f870;
      }
      if (puVar31 != (undefined8 *)0x0) {
LAB_0096f288:
        pBVar18 = BIO_new_mem_buf((void *)*puVar31,*(int *)(puVar31 + 1));
        if (pBVar18 == (BIO *)0x0) {
          pcVar27 = local_260;
          uVar20 = ERR_get_error();
          local_260[0] = '\0';
          uVar25 = OpenSSL_version(6);
          uVar32 = 0x100;
          uVar13 = curl_msnprintf(local_260,0x100,"%s/%s","OpenSSL",uVar25);
          if (uVar13 < 0xfe) {
            lVar15 = (long)(int)uVar13;
            (pcVar27 + lVar15)[0] = ':';
            (pcVar27 + lVar15)[1] = ' ';
            pcVar27 = local_260 + lVar15 + 2;
            *pcVar27 = '\0';
            uVar32 = 0xfe - lVar15;
          }
          ERR_error_string_n(uVar20,pcVar27,uVar32);
          if (*pcVar27 == '\0') {
            uVar4 = 8;
            if (uVar20 != 0) {
              uVar4 = 0xd;
            }
            if (uVar4 < uVar32) {
              pcVar30 = "No error";
              if (uVar20 != 0) {
                pcVar30 = "Unknown error";
              }
              strcpy(pcVar27,pcVar30);
            }
          }
          pcVar30 = "BIO_new_mem_buf NULL, OpenSSL error %s";
LAB_0096f5ac:
          FUN_00904b80(param_2,pcVar30,pcVar27);
          X509_free((X509 *)*plVar1);
          *plVar1 = 0;
          local_abc = 0x1b;
          goto LAB_0096f870;
        }
LAB_0096f29c:
        pXVar19 = PEM_read_bio_X509(pBVar18,(X509 **)0x0,(undefined1 *)0x0,(void *)0x0);
        if (pXVar19 == (X509 *)0x0) {
          if ((bVar6 & 3) != 0) {
            FUN_00904b80(param_2,"SSL: Unable to read issuer cert (%s)",
                         *(undefined8 *)(lVar16 + 0x10));
          }
          BIO_free(pBVar18);
          pXVar19 = (X509 *)0x0;
        }
        else {
          iVar9 = X509_check_issued(pXVar19,(X509 *)*plVar1);
          if (iVar9 == 0) {
            if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_2," SSL certificate issuer check ok (%s)",
                           *(undefined8 *)(lVar16 + 0x10));
            }
            BIO_free(pBVar18);
            X509_free(pXVar19);
            goto LAB_0096f450;
          }
          if ((bVar6 & 3) != 0) {
            FUN_00904b80(param_2,"SSL: Certificate issuer check failed (%s)",
                         *(undefined8 *)(lVar16 + 0x10));
          }
          BIO_free(pBVar18);
        }
        X509_free(pXVar19);
        goto LAB_0096f3dc;
      }
LAB_0096f450:
      lVar23 = SSL_get_verify_result((SSL *)param_3[1]);
      *(long *)(lVar15 + 0x80) = lVar23;
      if (lVar23 != 0) {
        if ((*(byte *)(lVar16 + 0x79) & 1) == 0) {
          local_abc = 0;
          if ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) {
            if ((*(long *)(param_2 + 0x12a0) == 0) ||
               (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))) {
              pcVar27 = X509_verify_cert_error_string(lVar23);
              FUN_00904c98(param_2," SSL certificate verify result: %s (%ld), continuing anyway.",
                           pcVar27,lVar23);
            }
            goto LAB_0096f4ec;
          }
          goto LAB_0096f050;
        }
        if ((bVar6 & 3) != 0) {
          pcVar27 = X509_verify_cert_error_string(lVar23);
          FUN_00904b80(param_2,"SSL certificate verify result: %s (%ld)",pcVar27,lVar23);
        }
        goto LAB_0096f04c;
      }
      local_abc = 0;
      if ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) {
        if ((*(long *)(param_2 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))) {
          FUN_00904c98(param_2," SSL certificate verify ok.");
        }
LAB_0096f4ec:
        local_abc = 0;
      }
    }
LAB_0096f050:
    ssl = (SSL *)param_3[1];
    lVar15 = SSL_get_verify_result(ssl);
    if (lVar15 == 0) {
      psVar24 = (stack_st_X509 *)SSL_get0_verified_chain(ssl);
    }
    else {
      psVar24 = SSL_get_peer_cert_chain(ssl);
    }
    iVar9 = OPENSSL_sk_num();
    if (0 < iVar9) {
      iVar14 = 0;
      do {
        memset(local_c0,0,0x50);
        memset(local_110,0,0x50);
        local_a78 = (ASN1_OBJECT *)0x0;
        local_a70 = (ASN1_GENERALIZEDTIME *)0x0;
        uVar25 = OPENSSL_sk_value(psVar24,iVar14);
        X509_get0_signature(0,&local_a70,uVar25);
        X509_ALGOR_get0(&local_a78,(int *)0x0,(void **)0x0,(X509_ALGOR *)local_a70);
        OBJ_obj2txt((char *)local_c0,0x50,local_a78,0);
        uVar25 = X509_get0_pubkey(uVar25);
        uVar10 = EVP_PKEY_get_bits();
        uVar11 = EVP_PKEY_get_security_bits(uVar25);
        memset(apAStack_160,0,0x50);
        iVar12 = EVP_PKEY_get_group_name(uVar25,apAStack_160,0x50,0);
        curl_msnprintf(local_110,0x50,&DAT_002a5696,apAStack_160);
        puVar26 = (undefined *)EVP_PKEY_get0_type_name(uVar25);
        if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
           ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8)))))
        {
          puVar2 = &DAT_002a35cf;
          if (puVar26 != (undefined *)0x0) {
            puVar2 = puVar26;
          }
          ppuVar3 = (ulong **)&DAT_002ab32c;
          if (iVar12 != 0) {
            ppuVar3 = local_110;
          }
          FUN_00904c98(param_2,
                       "  Certificate level %d: Public key type %s%s (%d/%d Bits/secBits), signed using %s"
                       ,iVar14,puVar2,ppuVar3,uVar10,uVar11,local_c0);
        }
        iVar14 = iVar14 + 1;
      } while (iVar9 != iVar14);
    }
    if (((*(byte *)(lVar16 + 0x79) >> 2 & 1) != 0) &&
       ((*(byte *)((long)param_3 + 0x25) >> 1 & 1) == 0)) {
      lVar15 = SSL_ctrl((SSL *)param_3[1],0x46,0,local_c0);
      if (local_c0[0] == (ulong *)0x0) {
        FUN_00904b80(param_2,"No OCSP response received");
        resp = (OCSP_RESPONSE *)0x0;
        local_abc = 0x5b;
      }
      else {
        local_110[0] = local_c0[0];
        resp = d2i_OCSP_RESPONSE((OCSP_RESPONSE **)0x0,(uchar **)local_110,lVar15);
        if (resp == (OCSP_RESPONSE *)0x0) {
LAB_0096f6a8:
          FUN_00904b80(param_2,"Invalid OCSP response");
          local_abc = 0x5b;
        }
        else {
          iVar9 = OCSP_response_status(resp);
          if (iVar9 == 0) {
            bs = OCSP_response_get1_basic(resp);
            if (bs == (OCSP_BASICRESP *)0x0) goto LAB_0096f6a8;
            psVar24 = SSL_get_peer_cert_chain((SSL *)param_3[1]);
            if (psVar24 == (stack_st_X509 *)0x0) {
              pcVar27 = "Could not get peer certificate chain";
            }
            else {
              st = SSL_CTX_get_cert_store((SSL_CTX *)*param_3);
              iVar9 = OCSP_basic_verify(bs,psVar24,st,0);
              if (iVar9 < 1) {
                pcVar27 = "OCSP response verification failed";
              }
              else {
                pXVar19 = (X509 *)SSL_get1_peer_certificate(param_3[1]);
                if (pXVar19 == (X509 *)0x0) {
                  pcVar27 = "Error getting peer certificate";
                }
                else {
                  iVar9 = OPENSSL_sk_num(psVar24);
                  if (0 < iVar9) {
                    iVar9 = 0;
                    do {
                      issuer = (X509 *)OPENSSL_sk_value(psVar24,iVar9);
                      iVar14 = X509_check_issued(issuer,pXVar19);
                      if (iVar14 == 0) {
                        dgst = EVP_sha1();
                        id = OCSP_cert_to_id(dgst,pXVar19,issuer);
                        X509_free(pXVar19);
                        if (id == (OCSP_CERTID *)0x0) goto LAB_0096f69c;
                        iVar9 = OCSP_resp_find_status
                                          (bs,id,(int *)&local_a64,&local_a68,apAStack_160,
                                           &local_a70,(ASN1_GENERALIZEDTIME **)&local_a78);
                        OCSP_CERTID_free(id);
                        if (iVar9 != 1) {
                          pcVar27 = "Could not find certificate ID in OCSP response";
                          goto LAB_0096f6e0;
                        }
                        iVar9 = OCSP_check_validity(local_a70,(ASN1_GENERALIZEDTIME *)local_a78,300,
                                                    -1);
                        if (iVar9 == 0) {
                          pcVar27 = "OCSP response has expired";
                          goto LAB_0096f6e0;
                        }
                        if (((param_2 != 0) && ((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0)) &&
                           ((*(long *)(param_2 + 0x12a0) == 0 ||
                            (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))))) {
                          pcVar27 = OCSP_cert_status_str((long)(int)local_a64);
                          FUN_00904c98(param_2,"SSL certificate status: %s (%d)",pcVar27,local_a64);
                        }
                        local_abc = 0;
                        if (local_a64 == 0) goto LAB_0096f6ec;
                        if (local_a64 == 1) {
                          pcVar27 = OCSP_crl_reason_str((long)local_a68);
                          FUN_00904b80(param_2,"SSL certificate revocation reason: %s (%d)",pcVar27,
                                       local_a68);
                        }
                        goto LAB_0096f6e8;
                      }
                      iVar9 = iVar9 + 1;
                      iVar14 = OPENSSL_sk_num(psVar24);
                    } while (iVar9 < iVar14);
                  }
                  X509_free(pXVar19);
LAB_0096f69c:
                  pcVar27 = "Error computing OCSP ID";
                }
              }
            }
LAB_0096f6e0:
            FUN_00904b80(param_2,pcVar27);
LAB_0096f6e8:
            local_abc = 0x5b;
LAB_0096f6ec:
            OCSP_BASICRESP_free(bs);
          }
          else {
            pcVar27 = OCSP_response_status_str((long)iVar9);
            FUN_00904b80(param_2,"Invalid OCSP response status: %s (%d)",pcVar27,iVar9);
            local_abc = 0x5b;
          }
        }
      }
      OCSP_RESPONSE_free(resp);
      if (local_abc != 0) {
        uVar20 = FUN_00968c14(param_1);
        if ((uVar20 & 1) == 0) {
          local_c0[0] = (ulong *)0x0;
          FUN_00968398(param_2);
          uVar20 = FUN_009683d4(param_1,param_2,param_4,local_c0,0);
          if ((uVar20 & 1) == 0) {
            if (((*(byte *)(param_2 + 0xa85) >> 4 & 1) != 0) &&
               ((*(long *)(param_2 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_2 + 0x12a0) + 8))
                ))) {
              FUN_00904c98(param_2,"Remove session ID again from cache");
            }
            FUN_00968740(param_2,local_c0[0]);
          }
          FUN_009683b8(param_2);
        }
        goto LAB_0096f864;
      }
      local_abc = 0;
    }
    if ((bVar6 & 3) == 0) {
      local_abc = 0;
    }
    uVar20 = FUN_00968c14(param_1);
    lVar15 = 0x7d8;
    if ((uVar20 & 1) == 0) {
      lVar15 = 0x770;
    }
    lVar15 = *(long *)(param_2 + lVar15);
    local_a80 = lVar15;
    if ((local_abc == 0) && (lVar15 != 0)) {
      lVar16 = *plVar1;
      local_c0[0] = (ulong *)0x0;
      if (lVar16 == 0) {
LAB_0096f850:
        local_abc = 0x5a;
      }
      else {
        pXVar28 = (X509_PUBKEY *)X509_get_X509_PUBKEY(lVar16);
        iVar9 = i2d_X509_PUBKEY(pXVar28,(uchar **)0x0);
        if (iVar9 < 1) goto LAB_0096f850;
        lVar23 = (long)iVar9;
        puVar29 = (ulong *)(*(code *)PTR_malloc_00cc4670)(lVar23);
        local_c0[0] = puVar29;
        if (puVar29 == (ulong *)0x0) goto LAB_0096f850;
        pXVar28 = (X509_PUBKEY *)X509_get_X509_PUBKEY(lVar16);
        iVar14 = i2d_X509_PUBKEY(pXVar28,(uchar **)local_c0);
        local_abc = 0x5a;
        if ((iVar9 == iVar14) && (local_c0[0] != (ulong *)0x0)) {
          if ((long)local_c0[0] - (long)puVar29 == lVar23) {
            local_abc = FUN_009690dc(param_2,lVar15,puVar29,lVar23);
          }
          else {
            local_abc = 0x5a;
          }
        }
        (*(code *)PTR_free_00cc4678)(puVar29);
        if (local_abc == 0) goto LAB_0096f864;
      }
      FUN_00904b80(param_2,"SSL: public key does not match pinned public key");
    }
  }
  else {
    local_abc = FUN_0096d24c(param_2);
    if (local_abc == 0) goto LAB_0096ef14;
  }
LAB_0096f864:
  X509_free((X509 *)*plVar1);
  *plVar1 = 0;
LAB_0096f870:
  if (*(long *)(lVar7 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return local_abc;
}

