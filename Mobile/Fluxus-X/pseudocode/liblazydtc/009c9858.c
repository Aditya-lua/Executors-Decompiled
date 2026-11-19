/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c9858
 */

ulong dtls1_read_bytes(SSL *param_1,uint param_2,undefined4 *param_3,void *param_4,
                      stack_st_SRTP_PROTECTION_PROFILE *param_5,SSL *param_6,size_t *param_7)

{
  byte bVar1;
  char cVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  pitem *item;
  ulong uVar7;
  BIO *b;
  SSL_CTX *pSVar8;
  undefined8 uVar9;
  SSL_SESSION *c;
  undefined8 uVar10;
  char *pcVar11;
  stack_st_SRTP_PROTECTION_PROFILE *psVar12;
  long lVar13;
  stack_st_SRTP_PROTECTION_PROFILE *psVar14;
  _func_3153 *p_Var15;
  _func_3153 *p_Var16;
  _func_3153 *p_Var17;
  long *plVar18;
  _func_3155 *p_Var19;
  char local_b8 [88];
  
  iVar6 = (int)param_6;
  psVar12 = param_5;
  if ((param_1[4].mode != 0) || (iVar3 = ssl3_setup_buffers(param_1), iVar3 != 0)) {
    if (((param_2 < 0x18) && ((1 << (ulong)(param_2 & 0x1f) & 0xc00001U) != 0)) &&
       ((param_2 == 0x17 || (iVar6 == 0)))) {
      iVar3 = ossl_statem_get_in_handshake(param_1);
      if ((iVar3 == 0) && (iVar3 = SSL_in_init(param_1), iVar3 != 0)) {
        uVar4 = (*param_1->handshake_func)(param_1);
        if ((int)uVar4 < 0) {
          return (ulong)uVar4;
        }
        if (uVar4 == 0) {
          return 0xffffffff;
        }
      }
      p_Var16 = (_func_3153 *)0x0;
LAB_009c9980:
      do {
        while( true ) {
          do {
            param_1->rwstate = 1;
            iVar3 = SSL_is_init_finished(param_1);
            if (((iVar3 != 0) &&
                (param_1[6].srtp_profiles == (stack_st_SRTP_PROTECTION_PROFILE *)0x0)) &&
               (item = pqueue_pop(*(pqueue *)(param_1[10].tlsext_ellipticcurvelist_length + 0x50)),
               item != (pitem *)0x0)) {
              plVar18 = item->data;
              SSL3_BUFFER_release(&param_1[4].mode);
              lVar13 = *plVar18;
              *(long *)&param_1[10].max_send_fragment = plVar18[1];
              param_1[10].first_packet = (int)lVar13;
              param_1[10].client_version = (int)((ulong)lVar13 >> 0x20);
              p_Var19 = (_func_3155 *)plVar18[6];
              param_1[4].tlsext_debug_arg = (void *)plVar18[7];
              param_1[4].tlsext_debug_cb = p_Var19;
              lVar13 = plVar18[4];
              *(long *)&param_1[4].max_send_fragment = plVar18[5];
              param_1[4].first_packet = (int)lVar13;
              param_1[4].client_version = (int)((ulong)lVar13 >> 0x20);
              uVar7 = plVar18[2];
              param_1[4].max_cert_list = plVar18[3];
              param_1[4].mode = uVar7;
              memcpy(&param_1[6].next_proto_negotiated_len,plVar18 + 8,0x50);
              lVar13 = *plVar18;
              *(undefined2 *)((long)&param_1[10].tlsext_ticket_expected + 2) =
                   *(undefined2 *)(lVar13 + 9);
              *(undefined4 *)((long)&param_1[10].tlsext_ocsp_resplen + 2) =
                   *(undefined4 *)(lVar13 + 5);
              CRYPTO_free(item->data);
              pitem_free(item);
            }
            iVar3 = dtls1_handle_timeout(param_1);
          } while (0 < iVar3);
          uVar7 = ossl_statem_in_error(param_1);
          if ((int)uVar7 != 0) {
            return 0xffffffff;
          }
          if ((param_1[6].srtp_profiles != (stack_st_SRTP_PROTECTION_PROFILE *)0x0) &&
             (*(int *)((long)&param_1[4].client_CA + 4) != 0xf1)) break;
          *(undefined8 *)&param_1[4].references = 0;
          uVar7 = dtls1_get_record(param_1);
          if (0 < (int)uVar7) {
            *(undefined8 *)&param_1[4].references = 1;
            break;
          }
          uVar7 = dtls1_read_failed(param_1,uVar7 & 0xffffffff);
          if ((int)uVar7 < 1) {
            return uVar7;
          }
        }
        uVar4 = *(uint *)&param_1[6].field_0x28c;
        if ((uVar4 != 0x15) && (param_1[6].srtp_profiles != (stack_st_SRTP_PROTECTION_PROFILE *)0x0)
           ) {
          *(undefined4 *)((long)&param_1[10].tlsext_ecpointformatlist + 4) = 0;
        }
        if ((uVar4 != 0x16) && ((param_1->ex_data).dummy != 0)) {
          iVar3 = dtls1_buffer_record(param_1,param_1[10].tlsext_ellipticcurvelist_length + 0x48,
                                      &param_1[7].bbio);
          if (iVar3 < 0) {
            return 0xffffffff;
          }
          goto LAB_009c9978;
        }
        if (((uint)param_1->shutdown >> 1 & 1) != 0) {
          param_1[6].srtp_profiles = (stack_st_SRTP_PROTECTION_PROFILE *)0x0;
          *(undefined4 *)&param_1[7].rbio = 1;
          param_1->rwstate = 1;
          return 0;
        }
        if ((uVar4 == param_2) ||
           (((param_3 != (undefined4 *)0x0 && (param_2 == 0x16)) && (uVar4 == 0x14)))) {
          iVar3 = SSL_in_init(param_1);
          if (((param_2 != 0x17) || (iVar3 == 0)) ||
             (lVar13._0_4_ = param_1[3].server, lVar13._4_4_ = param_1[3].new_session, lVar13 != 0))
          {
            if (param_3 != (undefined4 *)0x0) {
              *param_3 = *(undefined4 *)&param_1[6].field_0x28c;
            }
            psVar12 = param_1[6].srtp_profiles;
            if (param_5 == (stack_st_SRTP_PROTECTION_PROFILE *)0x0) {
              if (psVar12 == (stack_st_SRTP_PROTECTION_PROFILE *)0x0) {
                *(undefined4 *)&param_1[7].rbio = 1;
                return 0;
              }
              return 0;
            }
            if (param_5 <= psVar12) {
              psVar12 = param_5;
            }
            memcpy(param_4,(void *)(*(long *)&param_1[6].tlsext_hb_seq +
                                   *(long *)&param_1[6].tlsext_heartbeat),(size_t)psVar12);
            if (iVar6 == 0) {
              if ((*(byte *)&param_1[3].tlsext_debug_cb >> 1 & 1) != 0) {
                OPENSSL_cleanse((void *)(*(long *)&param_1[6].tlsext_hb_seq +
                                        *(long *)&param_1[6].tlsext_heartbeat),(size_t)psVar12);
              }
              psVar14 = (stack_st_SRTP_PROTECTION_PROFILE *)
                        ((long)param_1[6].srtp_profiles - (long)psVar12);
              param_1[6].srtp_profiles = psVar14;
              *(long *)&param_1[6].tlsext_heartbeat =
                   (long)&(psVar12->stack).num + *(long *)&param_1[6].tlsext_heartbeat;
              if (psVar14 == (stack_st_SRTP_PROTECTION_PROFILE *)0x0) {
                param_1[6].tlsext_heartbeat = 0;
                param_1[6].tlsext_hb_pending = 0;
                *(undefined4 *)((long)&param_1[4].client_CA + 4) = 0xf0;
                *(undefined4 *)&param_1[7].rbio = 1;
              }
            }
            else if (param_1[6].srtp_profiles == (stack_st_SRTP_PROTECTION_PROFILE *)0x0) {
              *(undefined4 *)&param_1[7].rbio = 1;
            }
            *param_7 = (size_t)psVar12;
            return 1;
          }
          ERR_new();
          ERR_set_debug("ssl/record/rec_layer_d1.c",0x1ec,"dtls1_read_bytes");
          uVar9 = 10;
          uVar10 = 100;
          goto LAB_009c98fc;
        }
        if (uVar4 == 0x15) {
          psVar14 = param_1[6].srtp_profiles;
          if ((((long)psVar14 < 1) || (psVar14 == (stack_st_SRTP_PROTECTION_PROFILE *)0x1)) ||
             (psVar14 != (stack_st_SRTP_PROTECTION_PROFILE *)0x2)) {
            ERR_new();
            ERR_set_debug("ssl/record/rec_layer_d1.c",0x232,"dtls1_read_bytes");
            uVar9 = 10;
            uVar10 = 0xcd;
            goto LAB_009c98fc;
          }
          pcVar11 = (char *)(*(long *)&param_1[6].tlsext_hb_seq +
                            *(long *)&param_1[6].tlsext_heartbeat);
          cVar2 = *pcVar11;
          bVar1 = pcVar11[1];
          if ((code *)param_1[1].tlsext_ocsp_resp != (code *)0x0) {
            psVar12 = (stack_st_SRTP_PROTECTION_PROFILE *)0x2;
            param_6 = param_1;
            uVar7 = (*(code *)param_1[1].tlsext_ocsp_resp)(0,param_1->version,0x15);
          }
          p_Var17 = param_1[3].psk_client_callback;
          uVar4 = (uint)bVar1;
          if (p_Var17 == (_func_3153 *)0x0) {
            p_Var15 = *(_func_3153 **)(*(long *)&param_1[3].ex_data.dummy + 0x120);
            p_Var17 = p_Var16;
            if (p_Var15 != (_func_3153 *)0x0) {
              p_Var17 = p_Var15;
            }
            if (p_Var17 != (_func_3153 *)0x0) goto LAB_009c9c34;
          }
          else {
LAB_009c9c34:
            uVar5 = (*p_Var17)(param_1,(char *)0x4004,(char *)(ulong)CONCAT11(cVar2,bVar1),
                               (uint)pcVar11,(uchar *)psVar12,(uint)param_6);
            uVar7 = (ulong)uVar5;
          }
          if (cVar2 != '\x01') {
            if (cVar2 == '\x02') {
              param_1->rwstate = 1;
              *(uint *)&param_1->client_CA = uVar4;
              ERR_new(uVar7);
              ERR_set_debug("ssl/record/rec_layer_d1.c",0x265,"dtls1_read_bytes");
              ossl_statem_fatal(param_1,0xffffffff,uVar4 + 1000,"SSL alert number %d",uVar4);
              uVar4 = param_1->shutdown;
              pSVar8 = *(SSL_CTX **)&param_1[4].mac_flags;
              c = *(SSL_SESSION **)&param_1[3].sid_ctx_length;
              *(undefined4 *)&param_1[7].rbio = 1;
              param_1->shutdown = uVar4 | 2;
              SSL_CTX_remove_session(pSVar8,c);
              return 0;
            }
            ERR_new(uVar7);
            ERR_set_debug("ssl/record/rec_layer_d1.c",0x26d,"dtls1_read_bytes");
            uVar9 = 0x2f;
            uVar10 = 0xf6;
            goto LAB_009c98fc;
          }
          iVar3 = *(int *)((long)&param_1[10].tlsext_ecpointformatlist + 4);
          *(undefined4 *)&param_1[7].rbio = 1;
          iVar3 = iVar3 + 1;
          *(uint *)&(param_1->ex_data).field_0xc = uVar4;
          *(int *)((long)&param_1[10].tlsext_ecpointformatlist + 4) = iVar3;
          if (iVar3 == 5) {
            ERR_new(uVar7);
            ERR_set_debug("ssl/record/rec_layer_d1.c",0x24b,"dtls1_read_bytes");
            uVar9 = 10;
            uVar10 = 0x199;
            goto LAB_009c98fc;
          }
          p_Var16 = p_Var17;
          if (uVar4 == 0) {
            param_1->shutdown = param_1->shutdown | 2;
            return 0;
          }
          goto LAB_009c9980;
        }
        if ((param_1->shutdown & 1U) != 0) {
          param_1[6].srtp_profiles = (stack_st_SRTP_PROTECTION_PROFILE *)0x0;
          param_1->rwstate = 1;
          *(undefined4 *)&param_1[7].rbio = 1;
          return 0;
        }
        if (uVar4 != 0x14) {
          if (uVar4 == 0x16) {
            iVar3 = ossl_statem_get_in_handshake(param_1);
            if (iVar3 == 0) {
              if ((param_1[7].wbio !=
                   (BIO *)(ulong)*(ushort *)param_1[10].tlsext_ellipticcurvelist_length) ||
                 (param_1[6].srtp_profiles < (stack_st_SRTP_PROTECTION_PROFILE *)0xc))
              goto LAB_009c9978;
              uVar9._0_4_ = param_1[6].tlsext_hb_seq;
              uVar9._4_4_ = param_1[6].renegotiate;
              dtls1_get_message_header(uVar9,local_b8);
              if (local_b8[0] == '\x14') {
                iVar3 = dtls1_check_timeout_num();
                if (iVar3 < 0) {
                  return 0xffffffff;
                }
                iVar3 = dtls1_retransmit_buffered_messages(param_1);
                if ((iVar3 < 1) && (iVar3 = ossl_statem_in_error(param_1), iVar3 != 0)) {
                  return 0xffffffff;
                }
                bVar1 = *(byte *)&param_1[3].tlsext_debug_arg;
                param_1[6].srtp_profiles = (stack_st_SRTP_PROTECTION_PROFILE *)0x0;
                *(undefined4 *)&param_1[7].rbio = 1;
              }
              else {
                iVar3 = SSL_is_init_finished(param_1);
                if (iVar3 == 0) {
                  ERR_new();
                  uVar9 = 0x2c1;
                  goto LAB_009c98ec;
                }
                ossl_statem_set_in_init(param_1,1);
                uVar4 = (*param_1->handshake_func)(param_1);
                if ((int)uVar4 < 0) {
                  return (ulong)uVar4;
                }
                if (uVar4 == 0) {
                  return 0xffffffff;
                }
                bVar1 = *(byte *)&param_1[3].tlsext_debug_arg;
              }
              if (((bVar1 >> 2 & 1) == 0) && (param_1[4].tlsext_debug_cb == (_func_3155 *)0x0)) {
                param_1->rwstate = 3;
                b = SSL_get_rbio(param_1);
                BIO_clear_flags(b,0xf);
                BIO_set_flags(b,9);
                return 0xffffffff;
              }
              goto LAB_009c9980;
            }
            uVar4 = *(uint *)&param_1[6].field_0x28c;
          }
          if (uVar4 - 0x14 < 3) {
            ERR_new();
            ERR_set_debug("ssl/record/rec_layer_d1.c",0x2ef,"dtls1_read_bytes");
            uVar9 = 10;
            goto LAB_009c98f8;
          }
          if (uVar4 == 0x17) {
            if ((((int)param_1->mode != 0) && ((int)param_1->options != 0)) &&
               (iVar6 = ossl_statem_app_data_allowed(param_1), iVar6 != 0)) {
              *(undefined4 *)&param_1->mode = 2;
              return 0xffffffff;
            }
            ERR_new();
            uVar9 = 0x2ff;
          }
          else {
            ERR_new();
            uVar9 = 0x2e5;
          }
          ERR_set_debug("ssl/record/rec_layer_d1.c",uVar9,"dtls1_read_bytes");
          uVar9 = 10;
          uVar10 = 0xf5;
          goto LAB_009c98fc;
        }
LAB_009c9978:
        param_1[6].srtp_profiles = (stack_st_SRTP_PROTECTION_PROFILE *)0x0;
        *(undefined4 *)&param_1[7].rbio = 1;
      } while( true );
    }
    ERR_new();
    uVar9 = 0x16a;
LAB_009c98ec:
    ERR_set_debug("ssl/record/rec_layer_d1.c",uVar9,"dtls1_read_bytes");
    uVar9 = 0x50;
LAB_009c98f8:
    uVar10 = 0xc0103;
LAB_009c98fc:
    ossl_statem_fatal(param_1,uVar9,uVar10,0);
  }
  return 0xffffffff;
}

