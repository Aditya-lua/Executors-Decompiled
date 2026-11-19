/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009eac94
 */

/* WARNING: Removing unreachable block (ram,0x009ebba4) */
/* WARNING: Type propagation algorithm not settling */

undefined8 tls_post_process_client_hello(SSL *param_1,int param_2)

{
  uint uVar1;
  size_t len;
  bool bVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  stack_st_SSL_CIPHER *psVar7;
  _func_3149 *p_Var8;
  SSL_CIPHER *c;
  undefined8 uVar9;
  SSL_CTX *pSVar10;
  uchar *puVar11;
  ulong uVar12;
  undefined4 uVar13;
  code *pcVar14;
  SSL_METHOD *pSVar15;
  stack_st_void *psVar16;
  size_t sVar17;
  long lVar18;
  ulong uVar19;
  ulong uVar20;
  _func_3150 *p_Var21;
  void *pvVar22;
  X509_EXTENSIONS *__s2;
  uint *puVar23;
  uint *puVar24;
  _func_3154 *p_Var25;
  KSSL_CTX *pKVar26;
  int local_6c;
  long local_68;
  long local_60;
  void *local_58;
  undefined4 local_48;
  undefined4 local_44;
  
  if (param_2 == 3) {
    local_60 = 0;
    local_58 = (void *)0x0;
    local_48 = 0;
    local_44 = 0x50;
    lVar18 = *(long *)&param_1[3].ex_data.dummy;
    p_Var21 = param_1[4].msg_callback;
    pcVar14 = *(code **)(lVar18 + 0x208);
    if ((pcVar14 == (code *)0x0) ||
       (iVar3 = (*pcVar14)(param_1,&local_44,*(undefined8 *)(lVar18 + 0x210)), iVar3 == 1)) {
      p_Var25 = *(_func_3154 **)(p_Var21 + 0x18);
      param_1->ctx = *(SSL_CTX **)(p_Var21 + 0x20);
      param_1->psk_server_callback = p_Var25;
      pKVar26 = *(KSSL_CTX **)(p_Var21 + 8);
      param_1->psk_client_callback = *(_func_3153 **)(p_Var21 + 0x10);
      param_1->kssl_ctx = pKVar26;
      if (*(int *)p_Var21 != 0) {
        uVar4 = *(uint *)(p_Var21 + 4);
        if ((uVar4 == 2) || ((uVar4 & 0xff00) != 0x300)) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x661,"tls_early_post_process_client_hello");
          uVar13 = 0x46;
          iVar3 = 0xfc;
          goto LAB_009eaef0;
        }
        *(uint *)&param_1[3].field_0x1fc = uVar4;
      }
      pSVar15 = param_1->method;
      uVar4 = *(uint *)(pSVar15->get_timeout + 0x60);
      if ((uVar4 >> 3 & 1) == 0) {
        iVar3 = ssl_choose_server_version(param_1,p_Var21,&local_48);
        if (iVar3 == 0) {
          pSVar15 = param_1->method;
          uVar4 = *(uint *)(pSVar15->get_timeout + 0x60);
          goto LAB_009eae7c;
        }
LAB_009eae34:
        if ((param_1->tlsext_opaque_prf_input == (void *)0x0) || (param_1[1].wbio == (BIO *)0x0)) {
          iVar5 = *(int *)(p_Var21 + 4);
          *(int *)&param_1[3].field_0x1fc = iVar5;
          param_1->version = iVar5;
        }
        ERR_new();
        uVar9 = 0x679;
LAB_009eae68:
        ERR_set_debug("ssl/statem/statem_srvr.c",uVar9,"tls_early_post_process_client_hello");
        uVar13 = 0x46;
        goto LAB_009eaef0;
      }
      if (pSVar15->version != 0x1ffff) {
        iVar3 = 0xff00;
        if (*(int *)(p_Var21 + 4) != 0x100) {
          iVar3 = *(int *)(p_Var21 + 4);
        }
        iVar5 = 0xff00;
        if (param_1->version != 0x100) {
          iVar5 = param_1->version;
        }
        if (iVar5 < iVar3) {
          iVar3 = 0x18c;
          goto LAB_009eae34;
        }
      }
LAB_009eae7c:
      if ((uVar4 >> 3 & 1) == 0) {
        if ((0x303 < pSVar15->version) && (pSVar15->version != 0x10000)) {
          iVar3 = RECORD_LAYER_processed_read_pending(&param_1[4].ex_data.dummy);
          if (iVar3 != 0) {
            ERR_new();
            ERR_set_debug("ssl/statem/statem_srvr.c",0x67f,"tls_early_post_process_client_hello");
            uVar13 = 10;
            iVar3 = 0xb6;
            goto LAB_009eaef0;
          }
          if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0) goto LAB_009eb0b4;
        }
      }
      else {
LAB_009eb0b4:
        uVar4 = SSL_get_options(param_1);
        if ((uVar4 >> 0xd & 1) != 0) {
          pcVar14 = *(code **)(*(long *)&param_1[3].ex_data.dummy + 0xd8);
          if (pcVar14 == (code *)0x0) {
            __s2 = param_1[1].tlsext_ocsp_exts;
            if ((*(size_t *)&__s2[8].stack == *(size_t *)(p_Var21 + 0x50)) &&
               (iVar3 = memcmp(p_Var21 + 0x58,__s2,*(size_t *)&__s2[8].stack), iVar3 == 0))
            goto LAB_009eb0e4;
            ERR_new();
            uVar9 = 0x692;
          }
          else {
            iVar3 = (*pcVar14)(param_1,p_Var21 + 0x58,*(int *)(p_Var21 + 0x50));
            if (iVar3 != 0) {
              __s2 = param_1[1].tlsext_ocsp_exts;
LAB_009eb0e4:
              *(undefined4 *)&__s2[8].stack.data = 1;
              goto LAB_009eb0ec;
            }
            ERR_new();
            uVar9 = 0x68a;
          }
          ERR_set_debug("ssl/statem/statem_srvr.c",uVar9,"tls_early_post_process_client_hello");
          uVar13 = 0x28;
          iVar3 = 0x134;
          goto LAB_009eaef0;
        }
LAB_009eb0ec:
        if ((param_1->method->version == 0x1ffff) &&
           (iVar3 = ssl_choose_server_version(param_1,p_Var21,&local_48), iVar3 != 0)) {
          param_1->version = *(int *)&param_1[3].field_0x1fc;
          ERR_new();
          uVar9 = 0x69b;
          goto LAB_009eae68;
        }
      }
      *(undefined4 *)&param_1[1].tlsext_ecpointformatlist_length = 0;
      iVar3 = ssl_cache_cipherlist(param_1,p_Var21 + 0x158,*(int *)p_Var21);
      if ((iVar3 == 0) ||
         (iVar3 = bytes_to_cipher_list
                            (param_1,p_Var21 + 0x158,&local_58,&local_60,*(int *)p_Var21,1),
         iVar3 == 0)) goto LAB_009eaef8;
      param_1[1].max_send_fragment = 0;
      if ((local_60 != 0) && (iVar3 = OPENSSL_sk_num(), 0 < iVar3)) {
        iVar3 = 0;
        do {
          c = (SSL_CIPHER *)OPENSSL_sk_value(local_60,iVar3);
          uVar12 = SSL_CIPHER_get_id(c);
          if ((int)uVar12 == 0x30000ff) {
            if (*(int *)&param_1[4].expand != 0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0x6b4,"tls_early_post_process_client_hello");
              uVar13 = 0x28;
              iVar3 = 0x159;
              goto LAB_009eaef0;
            }
            param_1[1].max_send_fragment = 1;
          }
          else {
            uVar12 = SSL_CIPHER_get_id(c);
            if (((int)uVar12 == 0x3005600) &&
               (iVar5 = ssl_check_version_downgrade(param_1), iVar5 == 0)) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_srvr.c",0x6c2,"tls_early_post_process_client_hello");
              uVar13 = 0x56;
              iVar3 = 0x175;
              goto LAB_009eaef0;
            }
          }
          iVar3 = iVar3 + 1;
          iVar5 = OPENSSL_sk_num(local_60);
        } while (iVar3 < iVar5);
      }
      pvVar22 = local_58;
      if (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
          (iVar3 = param_1->method->version, 0x303 < iVar3)) && (iVar3 != 0x10000)) {
        psVar7 = SSL_get_ciphers(param_1);
        p_Var8 = (_func_3149 *)ssl3_choose_cipher(param_1,pvVar22,psVar7);
        if (p_Var8 == (_func_3149 *)0x0) {
          ERR_new();
          uVar9 = 0x6ce;
LAB_009eb608:
          ERR_set_debug("ssl/statem/statem_srvr.c",uVar9,"tls_early_post_process_client_hello");
          uVar13 = 0x28;
          iVar3 = 0xc1;
        }
        else {
          if ((*(int *)&param_1[3].read_hash != 1) ||
             ((param_1[1].handshake_func != (_func_3149 *)0x0 &&
              (*(int *)(param_1[1].handshake_func + 0x18) == *(int *)(p_Var8 + 0x18))))) {
            param_1[1].handshake_func = p_Var8;
            goto LAB_009eb270;
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x6d8,"tls_early_post_process_client_hello");
          uVar13 = 0x2f;
          iVar3 = 0xba;
        }
      }
      else {
LAB_009eb270:
        iVar3 = tls_parse_extension(param_1,0xd,0x80,*(undefined8 *)(p_Var21 + 0x288),0,0);
        if (iVar3 == 0) goto LAB_009eaef8;
        if ((*(int *)p_Var21 == 0) &&
           ((param_1->new_session == 0 || (((ulong)param_1[3].tlsext_debug_cb & 0x10000) == 0)))) {
          iVar3 = ssl_get_prev_session(param_1,p_Var21);
          if (iVar3 == -1) goto LAB_009eaef8;
          if (iVar3 != 1) goto LAB_009eb298;
          *(undefined4 *)&param_1[1].tlsext_ecpointformatlist_length = 1;
        }
        else {
LAB_009eb298:
          iVar3 = ssl_get_new_session(param_1,1);
          if (iVar3 == 0) goto LAB_009eaef8;
        }
        pSVar15 = param_1->method;
        uVar4 = *(uint *)(pSVar15->get_timeout + 0x60);
        if ((((uVar4 >> 3 & 1) == 0) && (0x303 < pSVar15->version)) && (pSVar15->version != 0x10000)
           ) {
          memcpy(&param_1[3].session,param_1[4].msg_callback + 0x30,
                 *(size_t *)(param_1[4].msg_callback + 0x28));
          param_1[3].info_callback = *(_func_3152 **)(param_1[4].msg_callback + 0x28);
          uVar4 = *(uint *)(pSVar15->get_timeout + 0x60);
        }
        if (((((uVar4 >> 3 & 1) == 0) && (0x303 < pSVar15->version)) &&
            (pSVar15->version != 0x10000)) || ((int)param_1[1].tlsext_ecpointformatlist_length == 0)
           ) {
LAB_009eb544:
          if (*(ulong *)(p_Var21 + 0x168) != 0) {
            uVar12 = 0;
            do {
              if (p_Var21[uVar12 + 0x170] == (_func_3150)0x0) {
                if ((((*(byte *)&param_1[3].tlsext_debug_cb >> 6 & 1) != 0) &&
                    (uVar12 = *(ulong *)(p_Var21 + 0x278), 3 < uVar12)) &&
                   ((uVar12 & 0xfffffffffffffffe) != 4)) {
                  lVar18 = *(long *)(p_Var21 + 0x270);
                  uVar20 = (ulong)CONCAT11(*(undefined1 *)(lVar18 + 4),*(undefined1 *)(lVar18 + 5));
                  len = (uVar12 - 6) - uVar20;
                  if ((uVar20 <= uVar12 - 6) &&
                     (CONCAT11(*(undefined1 *)(lVar18 + 2),*(undefined1 *)(lVar18 + 3)) == 0)) {
                    uVar4 = SSL_client_version(param_1);
                    if ((uVar4 & 0xffffff00) == 0x300) {
                      iVar3 = SSL_client_version(param_1);
                      sVar17 = 0x22;
                      if (iVar3 < 0x303) {
                        sVar17 = 0x12;
                      }
                    }
                    else {
                      sVar17 = 0x12;
                    }
                    bVar2 = false;
                    if (len == sVar17) {
                      iVar3 = CRYPTO_memcmp((void *)(lVar18 + uVar20 + 6),&DAT_0074dd2c,len);
                      bVar2 = iVar3 == 0;
                    }
                    param_1[1].field_0x1fc = bVar2;
                  }
                }
                iVar3 = tls_parse_all_extensions
                                  (param_1,0x80,*(undefined8 *)(p_Var21 + 0x288),0,0,1);
                if (iVar3 == 0) goto LAB_009eaef8;
                iVar3 = ssl_fill_hello_random(param_1,1,&param_1->verify_mode,0x20,local_48);
                if (iVar3 < 1) {
                  ERR_new();
                  uVar9 = 0x756;
                  goto LAB_009eb940;
                }
                if ((((((int)param_1[1].tlsext_ecpointformatlist_length == 0) &&
                      (0x300 < param_1->version)) &&
                     (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0)) &&
                    ((iVar3 = param_1->method->version, iVar3 < 0x304 || (iVar3 == 0x10000)))) &&
                   (*(code **)&param_1[4].server != (code *)0x0)) {
                  local_68 = 0;
                  local_6c = 0x200;
                  uVar9._0_4_ = param_1[4].quiet_shutdown;
                  uVar9._4_4_ = param_1[4].shutdown;
                  iVar3 = (**(code **)&param_1[4].server)
                                    (param_1,*(long *)&param_1[3].sid_ctx_length + 0x50,&local_6c,
                                     local_58,&local_68,uVar9);
                  pvVar22 = local_58;
                  if ((iVar3 != 0) && (0 < local_6c)) {
                    lVar18 = *(long *)&param_1[3].sid_ctx_length;
                    *(long *)(lVar18 + 8) = (long)local_6c;
                    *(undefined4 *)&param_1[1].tlsext_ecpointformatlist_length = 1;
                    param_1[1].tls_session_secret_cb_arg = local_58;
                    *(undefined8 *)(lVar18 + 0x2c8) = 0;
                    local_58 = (void *)0x0;
                    if (local_68 == 0) {
                      psVar7 = SSL_get_ciphers(param_1);
                      local_68 = ssl3_choose_cipher(param_1,pvVar22,psVar7);
                      if (local_68 == 0) {
                        ERR_new();
                        uVar9 = 0x779;
                        goto LAB_009eb608;
                      }
                      lVar18._0_4_ = param_1[3].sid_ctx_length;
                      lVar18._4_1_ = param_1[3].sid_ctx[0];
                      lVar18._5_1_ = param_1[3].sid_ctx[1];
                      lVar18._6_1_ = param_1[3].sid_ctx[2];
                      lVar18._7_1_ = param_1[3].sid_ctx[3];
                    }
                    *(long *)(lVar18 + 0x2f8) = local_68;
                    OPENSSL_sk_free(param_1[1].initial_ctx);
                    pSVar10 = (SSL_CTX *)OPENSSL_sk_dup(param_1[1].tls_session_secret_cb_arg);
                    param_1[1].initial_ctx = pSVar10;
                    OPENSSL_sk_free(param_1[1].next_proto_negotiated);
                    puVar11 = (uchar *)OPENSSL_sk_dup(param_1[1].tls_session_secret_cb_arg);
                    param_1[1].next_proto_negotiated = puVar11;
                  }
                }
                pSVar15 = param_1->method;
                *(undefined8 *)&param_1[1].read_ahead = 0;
                uVar4 = *(uint *)(pSVar15->get_timeout + 0x60);
                if ((((uVar4 >> 3 & 1) == 0) && (0x303 < pSVar15->version)) &&
                   (pSVar15->version != 0x10000)) {
                  puVar23 = (uint *)0x0;
                  if (*(long *)(p_Var21 + 0x168) == 1) goto LAB_009ebad4;
                  ERR_new();
                  ERR_set_debug("ssl/statem/statem_srvr.c",0x793,
                                "tls_early_post_process_client_hello");
                  uVar13 = 0x2f;
                  goto LAB_009ebaa8;
                }
                uVar1 = *(uint *)(*(long *)&param_1[3].sid_ctx_length + 0x2f4);
                if (uVar1 != 0) {
                  iVar3 = ssl_allow_compression(param_1);
                  if (iVar3 == 0) {
                    ERR_new();
                    ERR_set_debug("ssl/statem/statem_srvr.c",0x7a0,
                                  "tls_early_post_process_client_hello");
                    uVar13 = 0x28;
                    iVar3 = 0x154;
                    goto LAB_009eaef0;
                  }
                  iVar3 = OPENSSL_sk_num(*(undefined8 *)(*(long *)&param_1[3].ex_data.dummy + 0x118)
                                        );
                  if (0 < iVar3) {
                    iVar3 = 0;
                    goto LAB_009eb8e0;
                  }
                  puVar23 = (uint *)0x0;
                  puVar24 = *(uint **)&param_1[1].read_ahead;
                  goto joined_r0x009eb998;
                }
                if ((int)param_1[1].tlsext_ecpointformatlist_length != 0) {
                  puVar23 = (uint *)0x0;
                  goto joined_r0x009eb960;
                }
                iVar3 = ssl_allow_compression(param_1);
                if ((iVar3 == 0) || (*(long *)(*(long *)&param_1[3].ex_data.dummy + 0x118) == 0)) {
                  puVar23 = (uint *)0x0;
                  iVar3 = (int)param_1[1].tlsext_ecpointformatlist_length;
                  goto joined_r0x009ebac8;
                }
                iVar3 = OPENSSL_sk_num();
                if (iVar3 < 1) {
                  puVar23 = (uint *)0x0;
                }
                else {
                  iVar5 = 0;
                  do {
                    puVar23 = (uint *)OPENSSL_sk_value(*(undefined8 *)
                                                        (*(long *)&param_1[3].ex_data.dummy + 0x118)
                                                       ,iVar5);
                    if (*(ulong *)(p_Var21 + 0x168) != 0) {
                      uVar12 = 1;
                      uVar20 = 0;
                      do {
                        uVar19 = uVar12;
                        if (*puVar23 == (uint)(byte)p_Var21[uVar20 + 0x170]) {
                          *(uint **)&param_1[1].read_ahead = puVar23;
                          iVar3 = (int)param_1[1].tlsext_ecpointformatlist_length;
                          goto joined_r0x009ebac8;
                        }
                        uVar12 = (ulong)((int)uVar19 + 1);
                        uVar20 = uVar19;
                      } while (uVar19 < *(ulong *)(p_Var21 + 0x168));
                    }
                    iVar5 = iVar5 + 1;
                    puVar23 = (uint *)0x0;
                  } while (iVar5 < iVar3);
                }
                goto LAB_009ebad4;
              }
              uVar12 = uVar12 + 1;
            } while (uVar12 < *(ulong *)(p_Var21 + 0x168));
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x73e,"tls_early_post_process_client_hello");
          uVar13 = 0x32;
          iVar3 = 0xbb;
        }
        else {
          iVar3 = *(int *)(*(long *)(*(long *)&param_1[3].sid_ctx_length + 0x2f8) + 0x18);
          iVar5 = OPENSSL_sk_num(local_58);
          if (0 < iVar5) {
            iVar5 = 0;
            do {
              lVar18 = OPENSSL_sk_value(local_58,iVar5);
              if (*(int *)(lVar18 + 0x18) == iVar3) goto LAB_009eb544;
              iVar5 = iVar5 + 1;
              iVar6 = OPENSSL_sk_num(local_58);
            } while (iVar5 < iVar6);
          }
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x730,"tls_early_post_process_client_hello");
          uVar13 = 0x2f;
          iVar3 = 0xd7;
        }
      }
      goto LAB_009eaef0;
    }
    if (iVar3 != -1) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_srvr.c",0x64f,"tls_early_post_process_client_hello");
      iVar3 = 0xea;
      uVar13 = local_44;
      goto LAB_009eaef0;
    }
    param_1->rwstate = 7;
    iVar3 = -1;
    goto LAB_009ead08;
  }
  goto LAB_009ead14;
  while( true ) {
    iVar3 = iVar3 + 1;
    iVar5 = OPENSSL_sk_num(*(undefined8 *)(*(long *)&param_1[3].ex_data.dummy + 0x118));
    if (iVar5 <= iVar3) break;
LAB_009eb8e0:
    puVar23 = (uint *)OPENSSL_sk_value(*(undefined8 *)(*(long *)&param_1[3].ex_data.dummy + 0x118),
                                       iVar3);
    if (uVar1 == *puVar23) {
      *(uint **)&param_1[1].read_ahead = puVar23;
      puVar24 = puVar23;
      goto joined_r0x009eb998;
    }
  }
  puVar24 = *(uint **)&param_1[1].read_ahead;
joined_r0x009eb998:
  if (puVar24 == (uint *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x7ad,"tls_early_post_process_client_hello");
    uVar13 = 0x28;
LAB_009ebaa8:
    iVar3 = 0x155;
  }
  else {
    if (*(ulong *)(p_Var21 + 0x168) != 0) {
      uVar12 = 1;
      uVar20 = 0;
      do {
        uVar19 = uVar12;
        if (uVar1 == (byte)p_Var21[uVar20 + 0x170]) goto LAB_009ebad4;
        uVar12 = (ulong)((int)uVar19 + 1);
        uVar20 = uVar19;
      } while (uVar19 < *(ulong *)(p_Var21 + 0x168));
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x7b7,"tls_early_post_process_client_hello");
    uVar13 = 0x2f;
    iVar3 = 0x156;
  }
  goto LAB_009eaef0;
LAB_009ebad4:
  iVar3 = (int)param_1[1].tlsext_ecpointformatlist_length;
joined_r0x009ebac8:
  if (iVar3 == 0) {
LAB_009ebb00:
    OPENSSL_sk_free(param_1[1].tls_session_secret_cb_arg);
    param_1[1].tls_session_secret_cb_arg = local_58;
    if (local_58 == (void *)0x0) {
      ERR_new();
      uVar9 = 0x7e6;
LAB_009eb940:
      ERR_set_debug("ssl/statem/statem_srvr.c",uVar9,"tls_early_post_process_client_hello");
      uVar13 = 0x50;
      iVar3 = 0xc0103;
LAB_009eaef0:
      ossl_statem_fatal(param_1,uVar13,iVar3,0);
LAB_009eaef8:
      OPENSSL_sk_free(local_58);
      OPENSSL_sk_free(local_60);
      CRYPTO_free(*(void **)(p_Var21 + 0x288));
      CRYPTO_free(param_1[4].msg_callback);
      param_1[4].msg_callback = (_func_3150 *)0x0;
      return 0;
    }
    local_58 = (void *)0x0;
    if ((int)param_1[1].tlsext_ecpointformatlist_length == 0) {
      if (puVar23 == (uint *)0x0) {
        uVar4 = 0;
      }
      else {
        uVar4 = *puVar23;
      }
      *(uint *)(*(long *)&param_1[3].sid_ctx_length + 0x2f4) = uVar4;
      iVar3 = tls1_set_server_sigalgs(param_1);
      if (iVar3 == 0) goto LAB_009eaef8;
    }
  }
  else {
    pSVar15 = param_1->method;
    uVar4 = *(uint *)(pSVar15->get_timeout + 0x60);
joined_r0x009eb960:
    if ((((uVar4 >> 3 & 1) == 0) && (0x303 < pSVar15->version)) && (pSVar15->version != 0x10000))
    goto LAB_009ebb00;
  }
  OPENSSL_sk_free(local_58);
  OPENSSL_sk_free(local_60);
  CRYPTO_free(*(void **)(p_Var21 + 0x288));
  CRYPTO_free(param_1[4].msg_callback);
  param_1[4].msg_callback = (_func_3150 *)0x0;
  iVar3 = 1;
LAB_009ead08:
  if (iVar3 < 0) {
    return 3;
  }
  param_2 = (iVar3 >> 0x1f) + 4;
LAB_009ead14:
  if (param_2 != 5) {
    if (param_2 != 4) {
      return 1;
    }
    if ((int)param_1[1].tlsext_ecpointformatlist_length == 0) {
      pcVar14 = *(code **)((param_1[3].d1)->rcvd_cookie + 0xb4);
      if (pcVar14 != (code *)0x0) {
        iVar3 = (*pcVar14)(param_1,*(undefined8 *)((param_1[3].d1)->rcvd_cookie + 0xbc));
        if (iVar3 == 0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x89c,"tls_post_process_client_hello");
          uVar12 = 0x50;
          uVar13 = 0x179;
          goto LAB_009eb4a4;
        }
        if (iVar3 < 0) {
          param_1->rwstate = 4;
          return 4;
        }
        param_1->rwstate = 1;
      }
LAB_009eaf68:
      if (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0) ||
          (iVar3 = param_1->method->version, iVar3 < 0x304)) || (iVar3 == 0x10000)) {
        pvVar22 = param_1[1].tls_session_secret_cb_arg;
        psVar7 = SSL_get_ciphers(param_1);
        p_Var8 = (_func_3149 *)ssl3_choose_cipher(param_1,pvVar22,psVar7);
        if (p_Var8 == (_func_3149 *)0x0) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x8ad,"tls_post_process_client_hello");
          uVar12 = 0x28;
          uVar13 = 0xc1;
          goto LAB_009eb4a4;
        }
        param_1[1].handshake_func = p_Var8;
      }
      if ((int)param_1[1].tlsext_ecpointformatlist_length == 0) {
        uVar9 = tls_choose_sigalg(param_1,1);
        if ((int)uVar9 == 0) {
          return uVar9;
        }
        psVar16 = param_1[4].ex_data.sk;
        if (psVar16 == (stack_st_void *)0x0) {
          iVar3 = *(int *)(*(long *)&param_1[3].sid_ctx_length + 0x2b0);
        }
        else {
          iVar3 = (*(code *)psVar16)(param_1,(*(uint *)(param_1[1].handshake_func + 0x1c) & 6) != 0)
          ;
          *(int *)(*(long *)&param_1[3].sid_ctx_length + 0x2b0) = iVar3;
        }
        if (iVar3 != 0) {
          *(undefined4 *)&param_1[3].next_proto_negotiated_len = 0;
        }
      }
    }
    else {
      if (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
          (iVar3 = param_1->method->version, 0x303 < iVar3)) && (iVar3 != 0x10000))
      goto LAB_009eaf68;
      param_1[1].handshake_func = *(_func_3149 **)(*(long *)&param_1[3].sid_ctx_length + 0x2f8);
    }
    iVar3 = *(int *)&param_1[3].tlsext_session_ticket;
    *(undefined4 *)((long)&param_1[3].tls_session_ticket_ext_cb_arg + 4) = 0;
    if (((iVar3 != -1) && (lVar18 = *(long *)&param_1[3].ex_data.dummy, lVar18 != 0)) &&
       ((pcVar14 = *(code **)(lVar18 + 0x250), pcVar14 != (code *)0x0 &&
        (param_1[1].read_hash != (EVP_MD_CTX *)0x0)))) {
      *(EVP_MD_CTX **)param_1[3].d1 = param_1[1].read_hash;
      iVar3 = (*pcVar14)(param_1,*(undefined8 *)(lVar18 + 600));
      if (iVar3 == 0) {
        if (param_1[3].initial_ctx != (SSL_CTX *)0x0) {
          *(undefined4 *)((long)&param_1[3].tls_session_ticket_ext_cb_arg + 4) = 1;
        }
      }
      else {
        if (iVar3 != 3) {
          ERR_new();
          ERR_set_debug("ssl/statem/statem_srvr.c",0x82f,"tls_handle_status_request");
          uVar12 = 0x50;
          uVar13 = 0xe2;
          goto LAB_009eb4a4;
        }
        *(undefined4 *)((long)&param_1[3].tls_session_ticket_ext_cb_arg + 4) = 0;
      }
    }
    if ((((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0) ||
         (iVar3 = param_1->method->version, iVar3 < 0x304)) || (iVar3 == 0x10000)) &&
       (uVar9 = tls_handle_alpn(param_1), (int)uVar9 == 0)) {
      return uVar9;
    }
  }
  local_58 = (void *)CONCAT44(local_58._4_4_,0x70);
  if ((((byte)param_1[1].handshake_func[0x1c] >> 5 & 1) == 0) ||
     (*(long *)(param_1[4].sid_ctx + 0xc) == 0)) {
    return 1;
  }
  if (param_1[4].session == (SSL_SESSION *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x4ea,"ssl_check_srp_ext_ClientHello");
    uVar12 = 0x73;
    uVar13 = 0xdf;
  }
  else {
    iVar3 = ssl_srp_server_param_with_username_intern(param_1,&local_58);
    if (iVar3 < 0) {
      param_1->rwstate = 4;
      return 5;
    }
    if (iVar3 != 2) {
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_srvr.c",0x4f4,"ssl_check_srp_ext_ClientHello");
    uVar12 = (ulong)local_58 & 0xffffffff;
    uVar13 = 0xdf;
    if ((int)local_58 != 0x73) {
      uVar13 = 0xe2;
    }
  }
LAB_009eb4a4:
  ossl_statem_fatal(param_1,uVar12,uVar13,0);
  return 0;
}

