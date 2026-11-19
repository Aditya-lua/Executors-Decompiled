/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cb2dc
 */

/* WARNING: Type propagation algorithm not settling */

ulong do_ssl3_write(SSL *param_1,int param_2,uchar *param_3,long param_4,ulong param_5,int param_6,
                   long *param_7)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  bool bVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  ulong uVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulong uVar13;
  uchar *puVar14;
  long *plVar15;
  undefined1 *puVar16;
  stack_st_OCSP_RESPID *psVar17;
  stack_st_OCSP_RESPID **ppsVar18;
  ulong uVar19;
  int iVar20;
  ulong uVar21;
  int iVar22;
  int *piVar23;
  undefined8 *puVar24;
  ulong uVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  int *local_11c0;
  X509_EXTENSIONS *local_1198;
  int local_1190;
  undefined1 local_1188;
  undefined7 uStack_1187;
  ulong local_1180;
  long local_1178;
  ulong local_1170;
  undefined8 local_1168 [320];
  undefined1 auStack_768 [1800];
  
  local_1170 = 0;
  if (param_5 == 0) {
    local_1198 = (X509_EXTENSIONS *)0x0;
    uVar13 = param_1[4].options;
  }
  else {
    uVar13 = 0;
    local_1198 = (X509_EXTENSIONS *)0x0;
    if (param_5 < 4) {
LAB_009cb374:
      lVar26 = param_5 - uVar13;
      plVar15 = (long *)(param_4 + uVar13 * 8);
      do {
        lVar26 = lVar26 + -1;
        local_1198 = (X509_EXTENSIONS *)((long)&(local_1198->stack).num + *plVar15);
        plVar15 = plVar15 + 1;
      } while (lVar26 != 0);
    }
    else {
      uVar13 = param_5 & 0xfffffffffffffffc;
      plVar15 = (long *)(param_4 + 0x10);
      lVar26 = 0;
      lVar27 = 0;
      lVar28 = 0;
      lVar29 = 0;
      uVar25 = uVar13;
      do {
        plVar1 = plVar15 + -2;
        plVar2 = plVar15 + -1;
        plVar3 = plVar15 + 1;
        lVar30 = *plVar15;
        uVar25 = uVar25 - 4;
        plVar15 = plVar15 + 4;
        lVar26 = *plVar1 + lVar26;
        lVar27 = *plVar2 + lVar27;
        lVar28 = lVar30 + lVar28;
        lVar29 = *plVar3 + lVar29;
      } while (uVar25 != 0);
      local_1198 = (X509_EXTENSIONS *)(lVar28 + lVar26 + lVar29 + lVar27);
      if (uVar13 != param_5) goto LAB_009cb374;
    }
    uVar13 = param_1[4].options;
  }
  if ((uVar13 != 0) && (*(long *)(param_1[4].sid_ctx + uVar13 * 0x30 + 0xcc) != 0))
  goto LAB_009cb3c8;
  if (*(int *)((long)&param_1->client_CA + 4) != 0) {
    uVar5 = (*param_1->method->ssl_dispatch_alert)(param_1);
    if ((int)uVar5 < 1) {
      return (ulong)uVar5;
    }
    uVar13 = param_1[4].options;
  }
  if ((uVar13 < param_5) && (iVar6 = ssl3_setup_write_buffer(param_1,param_5,0), iVar6 == 0)) {
    return 0xffffffff;
  }
  if ((param_6 == 0) && (local_1198 == (X509_EXTENSIONS *)0x0)) {
    return 0;
  }
  lVar26._0_4_ = param_1[3].sid_ctx_length;
  lVar26._4_1_ = param_1[3].sid_ctx[0];
  lVar26._5_1_ = param_1[3].sid_ctx[1];
  lVar26._6_1_ = param_1[3].sid_ctx[2];
  lVar26._7_1_ = param_1[3].sid_ctx[3];
  if (((lVar26 == 0) || (param_1[3].packet == (uchar *)0x0)) ||
     (lVar26 = EVP_MD_CTX_get0_md(param_1[3].s3), lVar26 == 0)) {
    local_1190 = 0;
    bVar4 = param_1[3].packet == (uchar *)0x0;
  }
  else {
    EVP_MD_CTX_get0_md(param_1[3].s3);
    local_1190 = EVP_MD_get_size();
    if (local_1190 < 0) {
      ERR_new();
      uVar11 = 0x2e3;
      goto LAB_009cb63c;
    }
    bVar4 = false;
  }
  uVar13 = 0;
  if ((!bVar4 && param_6 == 0) && (uVar13 = 0, *(int *)&param_1->field_0x184 == 0)) {
    if (param_2 == 0x17) {
      uVar13 = 0;
      if (param_1->debug != 0) {
        local_1168[0] = 0;
        iVar6 = do_ssl3_write(param_1,0x17,param_3,local_1168,1,1,&local_1170);
        if (iVar6 < 1) {
          return 0xffffffff;
        }
        uVar13 = local_1170;
        if (0x55 < local_1170) {
          ERR_new();
          uVar11 = 0x304;
          goto LAB_009cb63c;
        }
      }
    }
    else {
      uVar13 = 0;
    }
    *(undefined4 *)&param_1->field_0x184 = 1;
  }
  if (param_6 == 0) {
    if (uVar13 != 0) {
      iVar6 = WPACKET_init_static_len
                        (auStack_768,param_1[4].tlsext_hostname,
                         *(undefined8 *)&param_1[4].tlsext_status_expected,0);
      if ((iVar6 == 0) ||
         (iVar6 = WPACKET_allocate_bytes
                            (auStack_768,(long)&((param_1[4].tlsext_ocsp_ids)->stack).num + uVar13,0
                            ), iVar6 == 0)) {
        ERR_new();
        uVar11 = 0x333;
        goto LAB_009cb63c;
      }
      goto LAB_009cb59c;
    }
    uVar25 = 0;
    if (param_5 != 0) {
      ppsVar18 = &param_1[4].tlsext_ocsp_ids;
      puVar16 = auStack_768;
      do {
        psVar17 = (stack_st_OCSP_RESPID *)((ulong)~((int)ppsVar18[-3] + 4U) & 7);
        *ppsVar18 = psVar17;
        iVar6 = WPACKET_init_static_len(puVar16,ppsVar18[-3],ppsVar18[-1],0);
        if ((iVar6 == 0) || (iVar6 = WPACKET_allocate_bytes(puVar16,psVar17,0), iVar6 == 0)) {
          ERR_new();
          uVar11 = 0x344;
          goto LAB_009cbf60;
        }
        uVar25 = uVar25 + 1;
        puVar16 = puVar16 + 0x38;
        ppsVar18 = ppsVar18 + 6;
      } while (uVar25 < param_5);
    }
  }
  else {
    psVar17 = (stack_st_OCSP_RESPID *)((ulong)~((int)param_1[4].tlsext_hostname + 1U) & 7);
    param_1[4].tlsext_ocsp_ids = psVar17;
    iVar6 = WPACKET_init_static_len
                      (auStack_768,param_1[4].tlsext_hostname,
                       *(undefined8 *)&param_1[4].tlsext_status_expected,0);
    if ((iVar6 == 0) || (iVar6 = WPACKET_allocate_bytes(auStack_768,psVar17,0), iVar6 == 0)) {
      ERR_new();
      uVar11 = 0x328;
LAB_009cb63c:
      ERR_set_debug("ssl/record/rec_layer_s3.c",uVar11,"do_ssl3_write");
      ossl_statem_fatal(param_1,0x50,0xc0103,0);
      return 0xffffffff;
    }
LAB_009cb59c:
    uVar25 = 1;
  }
  if (param_1[3].packet == (uchar *)0x0) {
LAB_009cb708:
    iVar6 = 0;
LAB_009cb70c:
    memset(local_1168,0,0xa00);
    if (param_5 == 0) {
      local_1198 = (X509_EXTENSIONS *)0x0;
    }
    else {
      uVar19 = 0;
      local_1198 = (X509_EXTENSIONS *)0x0;
      puVar16 = auStack_768;
      piVar23 = (int *)local_1168;
      do {
        local_11c0 = (int *)((long)&param_1->s2 + 4);
        local_1180 = 0;
        iVar8 = 0x303;
        if (param_1->version != 0x304) {
          iVar8 = param_1->version;
        }
        if (((((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0) ||
              (iVar20 = param_1->method->version, iVar20 < 0x304)) || (iVar20 == 0x10000)) &&
            ((3 < *(int *)((long)&param_1->s3 + 4) - 1U && (*(int *)&param_1[3].read_hash != 1))))
           || ((param_1[3].packet == (uchar *)0x0 ||
               ((iVar20 = 0x17, param_2 == 0x15 && (*local_11c0 == 2)))))) {
          iVar20 = param_2;
        }
        piVar23[1] = iVar20;
        iVar7 = SSL_get_state(param_1);
        iVar22 = iVar8;
        if ((((iVar7 == 0xc) && (*(int *)&param_1[4].expand == 0)) &&
            (uVar5 = SSL_version(param_1), (uVar5 & 0xffffff00) == 0x300)) &&
           ((iVar7 = SSL_version(param_1), 0x301 < iVar7 &&
            (iVar22 = 0x301, *(int *)&param_1[3].read_hash != 0)))) {
          iVar22 = iVar8;
        }
        *piVar23 = iVar22;
        lVar26 = *(long *)(param_4 + uVar19 * 8);
        if (param_1[3].init_msg != (void *)0x0) {
          lVar26 = lVar26 + 0x400;
        }
        iVar8 = WPACKET_put_bytes__(puVar16,iVar20,1);
        if ((((iVar8 == 0) || (iVar8 = WPACKET_put_bytes__(puVar16,iVar22,2), iVar8 == 0)) ||
            ((iVar8 = WPACKET_start_sub_packet_len__(puVar16,2), iVar8 == 0 ||
             ((0 < iVar6 && (iVar8 = WPACKET_allocate_bytes(puVar16,(long)iVar6,0), iVar8 == 0))))))
           || ((lVar26 != 0 &&
               (iVar8 = WPACKET_reserve_bytes(puVar16,lVar26,&local_1180), iVar8 == 0)))) {
          ERR_new();
          uVar11 = 0x396;
          goto LAB_009cbf60;
        }
        *(ulong *)(piVar23 + 8) = local_1180;
        lVar26 = *(long *)(param_4 + uVar19 * 8);
        *(long *)(piVar23 + 2) = lVar26;
        *(uchar **)(piVar23 + 10) = param_3 + (long)local_1198;
        if (param_1[3].init_msg == (void *)0x0) {
          iVar8 = WPACKET_memcpy(puVar16,param_3 + (long)local_1198,lVar26);
          if (iVar8 == 0) {
            ERR_new();
            uVar11 = 0x3b1;
            goto LAB_009cbf60;
          }
          *(undefined8 *)(piVar23 + 10) = *(undefined8 *)(piVar23 + 8);
        }
        else {
          iVar8 = ssl3_do_compress(param_1,piVar23);
          if ((iVar8 == 0) ||
             (iVar8 = WPACKET_allocate_bytes(puVar16,*(undefined8 *)(piVar23 + 2),0), iVar8 == 0)) {
            ERR_new();
            ERR_set_debug("ssl/record/rec_layer_s3.c",0x3a9,"do_ssl3_write");
            uVar11 = 0x8d;
            goto LAB_009cbf70;
          }
        }
        if (((((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
              (iVar8 = param_1->method->version, 0x303 < iVar8)) && (iVar8 != 0x10000)) ||
            ((*(int *)((long)&param_1->s3 + 4) - 1U < 4 || (*(int *)&param_1[3].read_hash == 1))))
           && ((param_1[3].packet != (uchar *)0x0 && ((param_2 != 0x15 || (*local_11c0 != 2)))))) {
          iVar8 = WPACKET_put_bytes__(puVar16,(long)param_2,1);
          if (iVar8 == 0) {
            ERR_new();
            uVar11 = 0x3c0;
            goto LAB_009cbf60;
          }
          *(long *)(piVar23 + 2) = *(long *)(piVar23 + 2) + 1;
          uVar9 = ssl_get_max_send_fragment(param_1);
          uVar21 = *(ulong *)(piVar23 + 2);
          if (uVar21 < (uVar9 & 0xffffffff)) {
            if (param_1[10].tls_session_secret_cb_arg == (code *)0x0) {
              puVar14 = param_1[10].next_proto_negotiated;
              if (puVar14 != (uchar *)0x0) {
                if (((ulong)(puVar14 + -1) & (ulong)puVar14) == 0) {
                  uVar10 = (ulong)(puVar14 + -1) & uVar21;
                }
                else {
                  uVar10 = 0;
                  if (puVar14 != (uchar *)0x0) {
                    uVar10 = uVar21 / (ulong)puVar14;
                  }
                  uVar10 = uVar21 - uVar10 * (long)puVar14;
                }
                if (uVar10 != 0) {
                  uVar10 = (long)puVar14 - uVar10;
                  goto joined_r0x009cba5c;
                }
              }
            }
            else {
              uVar10 = (*param_1[10].tls_session_secret_cb_arg)
                                 (param_1,param_2,uVar21,param_1[10].initial_ctx);
joined_r0x009cba5c:
              if (uVar10 != 0) {
                uVar21 = (uVar9 & 0xffffffff) - uVar21;
                if (uVar10 <= uVar21) {
                  uVar21 = uVar10;
                }
                iVar8 = WPACKET_memset(puVar16,0,uVar21);
                if (iVar8 == 0) {
                  ERR_new();
                  uVar11 = 0x3e2;
                  goto LAB_009cbf60;
                }
                *(ulong *)(piVar23 + 2) = *(long *)(piVar23 + 2) + uVar21;
              }
            }
          }
        }
        if (((local_1190 != 0) && (((uint)*(undefined8 *)&param_1->hit >> 10 & 1) == 0)) &&
           ((iVar8 = WPACKET_allocate_bytes(puVar16,(long)local_1190,&local_1188), iVar8 == 0 ||
            (iVar8 = (**(code **)(param_1->method->get_timeout + 8))
                               (param_1,piVar23,CONCAT71(uStack_1187,local_1188),1), iVar8 == 0))))
        {
          ERR_new();
          uVar11 = 0x3f5;
          goto LAB_009cbf60;
        }
        iVar8 = WPACKET_reserve_bytes(puVar16,(long)(0x50 - local_1190),0);
        if ((iVar8 == 0) || (iVar8 = WPACKET_get_length(puVar16,&local_1178), iVar8 == 0)) {
          ERR_new();
          uVar11 = 0x409;
          goto LAB_009cbf60;
        }
        local_1198 = (X509_EXTENSIONS *)((long)&(local_1198->stack).num + lVar26);
        lVar26 = WPACKET_get_curr(puVar16);
        uVar19 = uVar19 + 1;
        puVar16 = puVar16 + 0x38;
        *(long *)(piVar23 + 2) = local_1178;
        *(long *)(piVar23 + 8) = lVar26 - local_1178;
        *(long *)(piVar23 + 10) = lVar26 - local_1178;
        piVar23 = piVar23 + 0x14;
      } while (uVar19 < param_5);
    }
    if (*(int *)((long)&param_1->s2 + 4) == 2) {
      iVar6 = tls13_enc(param_1,local_1168,param_5,1,0,(long)local_1190);
      if (0 < iVar6) goto LAB_009cbbc4;
      iVar6 = ossl_statem_in_error(param_1);
      if (iVar6 != 0) goto LAB_009cbf7c;
      ERR_new();
      uVar11 = 0x41c;
    }
    else {
      iVar6 = (**(code **)param_1->method->get_timeout)
                        (param_1,local_1168,param_5,1,0,(long)local_1190);
      if (0 < iVar6) {
LAB_009cbbc4:
        if (param_5 != 0) {
          uVar19 = 0;
          puVar16 = auStack_768;
          puVar24 = local_1168;
          lVar27 = (long)local_1190;
          lVar26 = 0xcc8;
          do {
            iVar6 = WPACKET_get_length(puVar16,&local_1180);
            if ((iVar6 == 0) || (uVar21 = puVar24[1], (0x50 - lVar27) + local_1180 < uVar21)) {
LAB_009cbe48:
              ERR_new();
              uVar11 = 0x440;
              goto LAB_009cbf60;
            }
            if ((uVar21 < local_1180) ||
               ((uVar21 - local_1180 != 0 &&
                (iVar6 = WPACKET_allocate_bytes(puVar16,uVar21 - local_1180,0), iVar6 == 0))))
            goto LAB_009cbe48;
            if ((local_1190 != 0) && (((uint)*(undefined8 *)&param_1->hit >> 10 & 1) != 0)) {
              iVar6 = WPACKET_allocate_bytes(puVar16,lVar27,&local_1188);
              if ((iVar6 == 0) ||
                 (iVar6 = (**(code **)(param_1->method->get_timeout + 8))
                                    (param_1,puVar24,CONCAT71(uStack_1187,local_1188),1), iVar6 == 0
                 )) {
                ERR_new();
                uVar11 = 0x448;
                goto LAB_009cbf60;
              }
              puVar24[1] = puVar24[1] + lVar27;
            }
            iVar6 = WPACKET_get_length(puVar16,&local_1178);
            if ((iVar6 == 0) || (iVar6 = WPACKET_close(puVar16), iVar6 == 0)) {
              ERR_new();
              uVar11 = 0x450;
              goto LAB_009cbf60;
            }
            if (param_1[1].tlsext_ocsp_resp != (uchar *)0x0) {
              lVar28 = WPACKET_get_curr(puVar16);
              uVar11._0_4_ = param_1[1].tlsext_ocsp_resplen;
              uVar11._4_4_ = param_1[1].tlsext_ticket_expected;
              (*(code *)param_1[1].tlsext_ocsp_resp)
                        (1,*(undefined4 *)puVar24,0x100,(lVar28 - local_1178) + -5,5,param_1,uVar11)
              ;
              if (((((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
                    (iVar6 = param_1->method->version, 0x303 < iVar6)) && (iVar6 != 0x10000)) ||
                  ((*(int *)((long)&param_1->s3 + 4) - 1U < 4 ||
                   (*(int *)&param_1[3].read_hash == 1)))) && (param_1[3].packet != (uchar *)0x0)) {
                local_1188 = (undefined1)param_2;
                uVar12._0_4_ = param_1[1].tlsext_ocsp_resplen;
                uVar12._4_4_ = param_1[1].tlsext_ticket_expected;
                (*(code *)param_1[1].tlsext_ocsp_resp)
                          (1,*(undefined4 *)puVar24,0x101,&local_1188,1,param_1,uVar12);
              }
            }
            iVar6 = WPACKET_finish(puVar16);
            if (iVar6 == 0) {
              ERR_new();
              uVar11 = 0x464;
              goto LAB_009cbf60;
            }
            lVar28 = puVar24[1] + 5;
            puVar24[1] = lVar28;
            if (param_6 != 0) {
              if (uVar19 == 0) {
                *param_7 = lVar28;
                return 1;
              }
              ERR_new();
              uVar11 = 0x472;
              goto LAB_009cbf60;
            }
            uVar19 = uVar19 + 1;
            *(int *)((long)puVar24 + 4) = param_2;
            puVar16 = puVar16 + 0x38;
            puVar24 = puVar24 + 10;
            *(ulong *)(param_1->sid_ctx + lVar26 + -0x10c) = uVar13 + lVar28;
            lVar26 = lVar26 + 0x30;
          } while (uVar19 < param_5);
        }
        *(X509_EXTENSIONS **)&param_1[10].tlsext_status_expected = local_1198;
        param_1[10].tlsext_ocsp_resp = param_3;
        *(int *)&param_1[10].tlsext_ocsp_ids = param_2;
        param_1[10].tlsext_ocsp_exts = local_1198;
LAB_009cb3c8:
        uVar13 = ssl3_write_pending(param_1,param_2,param_3,local_1198,param_7);
        return uVar13;
      }
      iVar6 = ossl_statem_in_error(param_1);
      if (iVar6 != 0) goto LAB_009cbf7c;
      ERR_new();
      uVar11 = 0x425;
    }
LAB_009cbf60:
    ERR_set_debug("ssl/record/rec_layer_s3.c",uVar11,"do_ssl3_write");
    uVar11 = 0xc0103;
  }
  else {
    iVar6 = 0;
    uVar5 = *(uint *)(param_1->method->get_timeout + 0x60);
    if (((uVar5 & 1) == 0) ||
       (((((uVar5 >> 3 & 1) == 0 && (iVar8 = param_1->method->version, 0x303 < iVar8)) &&
         (iVar6 = 0, iVar8 != 0x10000)) ||
        ((iVar6 = 0, *(int *)((long)&param_1->s3 + 4) - 1U < 4 ||
         (iVar6 = 0, *(int *)&param_1[3].read_hash == 1)))))) goto LAB_009cb70c;
    EVP_CIPHER_CTX_get0_cipher();
    iVar6 = EVP_CIPHER_get_mode();
    if (iVar6 - 6U < 2) {
      iVar6 = 8;
      goto LAB_009cb70c;
    }
    if (iVar6 != 2) goto LAB_009cb708;
    iVar8 = EVP_CIPHER_CTX_get_iv_length(param_1[3].packet);
    if (-1 < iVar8) {
      iVar6 = 0;
      if (1 < iVar8) {
        iVar6 = iVar8;
      }
      goto LAB_009cb70c;
    }
    ERR_new();
    ERR_set_debug("ssl/record/rec_layer_s3.c",0x351,"do_ssl3_write");
    uVar11 = 0x112;
  }
LAB_009cbf70:
  ossl_statem_fatal(param_1,0x50,uVar11,0);
LAB_009cbf7c:
  if (uVar25 == 0) {
    return 0xffffffff;
  }
  puVar16 = auStack_768;
  do {
    WPACKET_cleanup(puVar16);
    uVar25 = uVar25 - 1;
    puVar16 = puVar16 + 0x38;
  } while (uVar25 != 0);
  return 0xffffffff;
}

