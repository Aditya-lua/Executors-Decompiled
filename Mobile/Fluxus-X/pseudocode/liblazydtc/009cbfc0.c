/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cbfc0
 */

uint ssl3_read_bytes(SSL *param_1,uint param_2,int *param_3,void *param_4,uchar *param_5,
                    SSL *param_6,ulong *param_7)

{
  uchar *puVar1;
  bool bVar2;
  size_t sVar3;
  int *piVar4;
  int iVar5;
  char cVar6;
  byte bVar7;
  bool bVar8;
  int iVar9;
  SSL *pSVar10;
  int iVar11;
  uint uVar12;
  BIO *b;
  undefined8 uVar13;
  undefined8 uVar14;
  uchar *puVar15;
  long lVar16;
  size_t sVar17;
  _func_3153 *p_Var18;
  char *pcVar19;
  ulong uVar20;
  int *piVar21;
  _func_3153 *p_Var22;
  uint uVar23;
  uchar *puVar24;
  ulong uVar25;
  _func_3153 *local_78;
  
  iVar9 = (int)param_6;
  bVar8 = false;
  if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) {
    iVar11 = param_1->method->version;
    bVar8 = 0x303 < iVar11 && iVar11 != 0x10000;
  }
  puVar15 = param_5;
  if ((param_1[4].mode == 0) && (iVar11 = ssl3_setup_read_buffer(param_1), iVar11 == 0)) {
    return 0xffffffff;
  }
  if (((0x17 < param_2) || ((1 << (ulong)(param_2 & 0x1f) & 0xc00001U) == 0)) ||
     ((param_2 != 0x17 && (iVar9 != 0)))) {
    ERR_new();
    uVar13 = 0x51e;
LAB_009cc080:
    ERR_set_debug("ssl/record/rec_layer_s3.c",uVar13,"ssl3_read_bytes");
    uVar13 = 0x50;
LAB_009cc08c:
    uVar14 = 0xc0103;
LAB_009cc090:
    ossl_statem_fatal(param_1,uVar13,uVar14,0);
    return 0xffffffff;
  }
  if ((param_2 != 0x16) || (pcVar19 = param_1[10].tlsext_hostname, pcVar19 == (char *)0x0)) {
    iVar11 = ossl_statem_get_in_handshake(param_1);
    if ((iVar11 == 0) && (iVar11 = SSL_in_init(param_1), iVar11 != 0)) {
      uVar12 = (*param_1->handshake_func)(param_1);
      if ((int)uVar12 < 0) {
        return uVar12;
      }
      if (uVar12 == 0) {
        return 0xffffffff;
      }
    }
    local_78 = (_func_3153 *)0x0;
LAB_009cc16c:
    uVar20 = *(ulong *)&param_1[4].references;
    param_1->rwstate = 1;
    if (uVar20 != 0) goto LAB_009cc1a4;
    do {
      uVar12 = ssl3_get_record(param_1);
      if ((int)uVar12 < 1) {
        return uVar12;
      }
      uVar20 = *(ulong *)&param_1[4].references;
      if (uVar20 == 0) {
        ERR_new();
        uVar13 = 0x561;
        goto LAB_009cc080;
      }
LAB_009cc1a4:
      uVar25 = 0;
      lVar16 = 0x12e0;
      do {
        if (*(int *)(param_1->sid_ctx + lVar16 + -0x10c) == 0) break;
        uVar25 = uVar25 + 1;
        lVar16 = lVar16 + 0x50;
      } while (uVar25 < uVar20);
      if (uVar25 != uVar20) goto code_r0x009cc1cc;
      *(undefined8 *)&param_1[4].references = 0;
    } while( true );
  }
  if (param_5 == (uchar *)0x0) {
    puVar15 = (uchar *)0x0;
    pSVar10 = param_1;
  }
  else {
    puVar15 = (uchar *)0x0;
    do {
      if (pcVar19 == (char *)0x0) goto LAB_009cc6e4;
      *(uchar *)((long)param_4 + (long)puVar15) =
           *(uchar *)((long)&param_1[10].tlsext_debug_arg + (long)puVar15);
      puVar15 = puVar15 + 1;
      pcVar19 = param_1[10].tlsext_hostname + -1;
      param_1[10].tlsext_hostname = pcVar19;
    } while (param_5 != puVar15);
    if (pcVar19 == (char *)0x0) goto LAB_009cc6e4;
    pSVar10 = (SSL *)(puVar15 + (long)(param_1->sid_ctx + -0x10c));
  }
  uVar20 = 0;
  pcVar19 = (char *)0x0;
  do {
    lVar16 = uVar20 + 0xd4;
    uVar20 = uVar20 + 1;
    pcVar19[(long)(param_1->sid_ctx + 0x1bb4)] = pSVar10[10].sid_ctx[lVar16];
    pcVar19 = (char *)(uVar20 & 0xffffffff);
  } while (pcVar19 < param_1[10].tlsext_hostname);
LAB_009cc6e4:
  if (param_3 != (int *)0x0) {
    *param_3 = 0x16;
  }
  *param_7 = (ulong)puVar15;
  return 1;
code_r0x009cc1cc:
  pcVar19 = param_1[10].tlsext_hostname;
  uVar12 = *(uint *)(param_1[6].sid_ctx + uVar25 * 0x50 + 0x180);
  if (pcVar19 == (char *)0x0) {
LAB_009cc208:
    if (uVar12 != 0x15) goto LAB_009cc228;
    bVar2 = true;
LAB_009cc21c:
    if ((param_1->ex_data).dummy != 0) {
      ERR_new();
      ERR_set_debug("ssl/record/rec_layer_s3.c",0x587,"ssl3_read_bytes");
      uVar13 = 10;
      uVar14 = 0x91;
      goto LAB_009cc090;
    }
  }
  else {
    if (uVar12 != 0x16) {
      if (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) &&
          (iVar11 = param_1->method->version, 0x303 < iVar11)) && (iVar11 != 0x10000)) {
        ERR_new();
        ERR_set_debug("ssl/record/rec_layer_s3.c",0x575,"ssl3_read_bytes");
        uVar13 = 10;
        uVar14 = 0x125;
        goto LAB_009cc090;
      }
      goto LAB_009cc208;
    }
LAB_009cc228:
    if (*(long *)(param_1[6].sid_ctx + uVar25 * 0x50 + 0x184) != 0) {
      *(undefined4 *)((long)&param_1[10].tlsext_ecpointformatlist + 4) = 0;
    }
    bVar2 = false;
    if (uVar12 != 0x16) goto LAB_009cc21c;
  }
  if (((uint)param_1->shutdown >> 1 & 1) != 0) {
    puVar15 = param_1[6].sid_ctx + uVar25 * 0x50 + 0x184;
    puVar15[0] = '\0';
    puVar15[1] = '\0';
    puVar15[2] = '\0';
    puVar15[3] = '\0';
    puVar15[4] = '\0';
    puVar15[5] = '\0';
    puVar15[6] = '\0';
    puVar15[7] = '\0';
    param_1->rwstate = 1;
    return 0;
  }
  puVar24 = param_1[6].sid_ctx + uVar25 * 0x50 + 0x180;
  if ((uVar12 == param_2) ||
     (!bVar8 && (param_3 != (int *)0x0 && (param_2 == 0x16 && uVar12 == 0x14)))) {
    iVar11 = SSL_in_init(param_1);
    if ((param_2 == 0x17) &&
       ((iVar11 != 0 &&
        (lVar16._0_4_ = param_1[3].server, lVar16._4_4_ = param_1[3].new_session, lVar16 == 0)))) {
      ERR_new();
      ERR_set_debug("ssl/record/rec_layer_s3.c",0x5a4,"ssl3_read_bytes");
      uVar13 = 10;
      uVar14 = 100;
      goto LAB_009cc090;
    }
    if (((param_2 != 0x16) || (*(int *)puVar24 != 0x14)) ||
       (param_1[10].tlsext_hostname == (char *)0x0)) {
      if (param_3 != (int *)0x0) {
        *param_3 = *(int *)puVar24;
      }
      if (param_5 == (uchar *)0x0) {
        if (*(long *)(param_1[6].sid_ctx + uVar25 * 0x50 + 0x184) == 0) {
          puVar15 = param_1[7].sid_ctx + uVar25 * 0x50 + -0xfc;
          puVar15[0] = '\x01';
          puVar15[1] = '\0';
          puVar15[2] = '\0';
          puVar15[3] = '\0';
          return 0;
        }
        return 0;
      }
      puVar24 = (uchar *)0x0;
      piVar21 = (int *)(param_1[6].sid_ctx + uVar25 * 0x50 + 0x17c);
      do {
        sVar3 = *(ulong *)(piVar21 + 2);
        if ((ulong)((long)param_5 - (long)puVar24) <= *(ulong *)(piVar21 + 2)) {
          sVar3 = (long)param_5 - (long)puVar24;
        }
        memcpy(param_4,(void *)(*(long *)(piVar21 + 8) + *(long *)(piVar21 + 6)),sVar3);
        param_4 = (void *)((long)param_4 + sVar3);
        if (iVar9 == 0) {
          if ((*(byte *)&param_1[3].tlsext_debug_cb >> 1 & 1) != 0) {
            OPENSSL_cleanse((void *)(*(long *)(piVar21 + 8) + *(long *)(piVar21 + 6)),sVar3);
          }
          sVar17 = *(long *)(piVar21 + 2) - sVar3;
          *(size_t *)(piVar21 + 2) = sVar17;
          *(size_t *)(piVar21 + 6) = *(long *)(piVar21 + 6) + sVar3;
          if (sVar17 == 0) {
            *(undefined4 *)((long)&param_1[4].client_CA + 4) = 0xf0;
            puVar1 = (uchar *)(piVar21 + 6);
            puVar1[0] = '\0';
            puVar1[1] = '\0';
            puVar1[2] = '\0';
            puVar1[3] = '\0';
            puVar1[4] = '\0';
            puVar1[5] = '\0';
            puVar1[6] = '\0';
            puVar1[7] = '\0';
            goto LAB_009cc50c;
          }
        }
        else {
          sVar17 = *(size_t *)(piVar21 + 2);
          if (sVar17 == 0) {
LAB_009cc50c:
            piVar21[0xe] = 1;
          }
        }
        uVar12 = (uint)(sVar17 == 0 || iVar9 != 0 && sVar3 == sVar17);
        puVar24 = puVar24 + sVar3;
        piVar4 = piVar21 + 0x14;
        if (uVar12 == 0) {
          piVar4 = piVar21;
        }
        uVar25 = uVar25 + uVar12;
      } while (((puVar24 < param_5) && (param_2 == 0x17)) && (piVar21 = piVar4, uVar25 < uVar20));
      if (puVar24 != (uchar *)0x0) {
        if (((uVar25 == uVar20) && (iVar9 == 0)) &&
           (((*(byte *)&param_1[3].tlsext_debug_arg >> 4 & 1) != 0 &&
            (param_1[4].tlsext_debug_cb == (_func_3155 *)0x0)))) {
          ssl3_release_read_buffer(param_1);
        }
        *param_7 = (ulong)puVar24;
        return 1;
      }
      goto LAB_009cc16c;
    }
    ERR_new();
    uVar13 = 0x5ab;
    goto LAB_009cc7ec;
  }
  iVar11 = *(int *)(param_1[6].sid_ctx + uVar25 * 0x50 + 0x17c);
  if (iVar11 == 2) {
    ERR_new();
    uVar13 = 0x5f9;
    goto LAB_009cc080;
  }
  iVar5 = param_1->method->version;
  if ((iVar5 == 0x10000) && (!(bool)(bVar2 & param_1->server == 0))) {
    param_1->version = iVar11;
    ERR_new();
    ERR_set_debug("ssl/record/rec_layer_s3.c",0x606,"ssl3_read_bytes");
    uVar13 = 10;
    uVar14 = 0xf4;
    goto LAB_009cc090;
  }
  if (bVar2) {
    lVar16 = *(long *)(param_1[6].sid_ctx + uVar25 * 0x50 + 0x184);
    if (((lVar16 < 1) || (lVar16 == 1)) || (lVar16 != 2)) {
      ERR_new();
      ERR_set_debug("ssl/record/rec_layer_s3.c",0x619,"ssl3_read_bytes");
      uVar13 = 10;
      uVar14 = 0xcd;
      goto LAB_009cc090;
    }
    pcVar19 = (char *)(*(long *)(param_1[6].sid_ctx + uVar25 * 0x50 + 0x19c) +
                      *(long *)(param_1[6].sid_ctx + uVar25 * 0x50 + 0x194));
    cVar6 = *pcVar19;
    bVar7 = pcVar19[1];
    if ((code *)param_1[1].tlsext_ocsp_resp != (code *)0x0) {
      puVar15 = (uchar *)0x2;
      param_6 = param_1;
      (*(code *)param_1[1].tlsext_ocsp_resp)(0,param_1->version,0x15);
    }
    p_Var22 = param_1[3].psk_client_callback;
    uVar12 = (uint)bVar7;
    if (p_Var22 == (_func_3153 *)0x0) {
      p_Var18 = *(_func_3153 **)(*(long *)&param_1[3].ex_data.dummy + 0x120);
      p_Var22 = local_78;
      if (p_Var18 != (_func_3153 *)0x0) {
        p_Var22 = p_Var18;
      }
      if (p_Var22 == (_func_3153 *)0x0) {
        local_78 = (_func_3153 *)0x0;
        goto LAB_009cc600;
      }
    }
    (*p_Var22)(param_1,(char *)0x4004,(char *)(ulong)CONCAT11(cVar6,bVar7),(uint)pcVar19,puVar15,
               (uint)param_6);
    local_78 = p_Var22;
LAB_009cc600:
    uVar23 = (uint)bVar7;
    bVar2 = (bool)(bVar8 & uVar23 == 0x5a);
    if ((cVar6 == '\x01') || (bVar2)) {
      *(uint *)&(param_1->ex_data).field_0xc = uVar23;
      puVar24 = param_1[7].sid_ctx + uVar25 * 0x50 + -0xfc;
      puVar24[0] = '\x01';
      puVar24[1] = '\0';
      puVar24[2] = '\0';
      puVar24[3] = '\0';
      iVar11 = *(int *)((long)&param_1[10].tlsext_ecpointformatlist + 4) + 1;
      *(int *)((long)&param_1[10].tlsext_ecpointformatlist + 4) = iVar11;
      if (iVar11 == 5) {
        ERR_new();
        ERR_set_debug("ssl/record/rec_layer_s3.c",0x633,"ssl3_read_bytes");
        uVar13 = 10;
        uVar14 = 0x199;
        goto LAB_009cc090;
      }
    }
    if (!bVar2) {
      if (((bool)(bVar8 | cVar6 == '\x01')) && (uVar12 == 0)) {
        param_1->shutdown = param_1->shutdown | 2;
        return (uint)bVar7;
      }
      if (!(bool)(cVar6 != '\x02' & (bVar8 ^ 1U))) {
        param_1->rwstate = 1;
        *(uint *)&param_1->client_CA = uVar12;
        ERR_new();
        ERR_set_debug("ssl/record/rec_layer_s3.c",0x645,"ssl3_read_bytes");
        ossl_statem_fatal(param_1,0xffffffff,uVar23 + 1000,"SSL alert number %d",uVar23);
        param_1->shutdown = param_1->shutdown | 2;
        puVar15 = param_1[7].sid_ctx + uVar25 * 0x50 + -0xfc;
        puVar15[0] = '\x01';
        puVar15[1] = '\0';
        puVar15[2] = '\0';
        puVar15[3] = '\0';
        SSL_CTX_remove_session
                  (*(SSL_CTX **)&param_1[4].mac_flags,*(SSL_SESSION **)&param_1[3].sid_ctx_length);
        return 0;
      }
      if (uVar12 == 100) {
        ERR_new();
        ERR_set_debug("ssl/record/rec_layer_s3.c",0x655,"ssl3_read_bytes");
        uVar13 = 0x28;
        uVar14 = 0x153;
        goto LAB_009cc090;
      }
      if (cVar6 != '\x01') {
        ERR_new();
        ERR_set_debug("ssl/record/rec_layer_s3.c",0x65c,"ssl3_read_bytes");
        uVar13 = 0x2f;
        uVar14 = 0xf6;
        goto LAB_009cc090;
      }
    }
    goto LAB_009cc16c;
  }
  if ((param_1->shutdown & 1U) == 0) {
    if (uVar12 == 0x16) goto LAB_009cc300;
  }
  else {
    if (uVar12 != 0x16) {
      puVar15 = param_1[6].sid_ctx + uVar25 * 0x50 + 0x184;
      puVar15[0] = '\0';
      puVar15[1] = '\0';
      puVar15[2] = '\0';
      puVar15[3] = '\0';
      puVar15[4] = '\0';
      puVar15[5] = '\0';
      puVar15[6] = '\0';
      puVar15[7] = '\0';
      puVar15 = param_1[7].sid_ctx + uVar25 * 0x50 + -0xfc;
      puVar15[0] = '\x01';
      puVar15[1] = '\0';
      puVar15[2] = '\0';
      puVar15[3] = '\0';
      ERR_new();
      ERR_set_debug("ssl/record/rec_layer_s3.c",0x683,"ssl3_read_bytes");
      ossl_statem_fatal(param_1,0xffffffff,0x123,0);
      return 0xffffffff;
    }
    if (((iVar5 < 0x304) || (iVar5 == 0x10000)) ||
       ((*(uint *)(param_1->method->get_timeout + 0x60) >> 3 & 1) != 0)) {
      puVar24 = param_1[6].sid_ctx + uVar25 * 0x50 + 0x184;
      puVar24[0] = '\0';
      puVar24[1] = '\0';
      puVar24[2] = '\0';
      puVar24[3] = '\0';
      puVar24[4] = '\0';
      puVar24[5] = '\0';
      puVar24[6] = '\0';
      puVar24[7] = '\0';
      puVar24 = param_1[7].sid_ctx + uVar25 * 0x50 + -0xfc;
      puVar24[0] = '\x01';
      puVar24[1] = '\0';
      puVar24[2] = '\0';
      puVar24[3] = '\0';
      if ((*(byte *)&param_1[3].tlsext_debug_arg >> 2 & 1) != 0) goto LAB_009cc16c;
      goto LAB_009cc858;
    }
LAB_009cc300:
    piVar21 = &param_1[4].ex_data.dummy;
    sVar3 = *(ulong *)(piVar21 + uVar25 * 0x14 + 0x196);
    if (4U - (long)pcVar19 <= *(ulong *)(piVar21 + uVar25 * 0x14 + 0x196)) {
      sVar3 = 4U - (long)pcVar19;
    }
    memcpy((char *)((long)piVar21 + (long)pcVar19) + 0x1068,
           (void *)(*(long *)(piVar21 + uVar25 * 0x14 + 0x19c) +
                   *(long *)(piVar21 + uVar25 * 0x14 + 0x19a)),sVar3);
    lVar16 = *(long *)(piVar21 + uVar25 * 0x14 + 0x196);
    *(size_t *)(piVar21 + uVar25 * 0x14 + 0x19a) =
         *(long *)(piVar21 + uVar25 * 0x14 + 0x19a) + sVar3;
    *(size_t *)(piVar21 + uVar25 * 0x14 + 0x196) = lVar16 - sVar3;
    pcVar19 = param_1[10].tlsext_hostname + sVar3;
    param_1[10].tlsext_hostname = pcVar19;
    if (lVar16 - sVar3 == 0) {
      puVar1 = param_1[7].sid_ctx + uVar25 * 0x50 + -0xfc;
      puVar1[0] = '\x01';
      puVar1[1] = '\0';
      puVar1[2] = '\0';
      puVar1[3] = '\0';
    }
    if (pcVar19 < (char *)0x4) goto LAB_009cc16c;
    uVar12 = *(uint *)puVar24;
  }
  if (uVar12 != 0x14) {
    if ((char *)0x3 < pcVar19) {
      iVar11 = ossl_statem_get_in_handshake(param_1);
      if (iVar11 == 0) {
        iVar11 = *(int *)((long)&param_1->s3 + 4);
        ossl_statem_set_in_init(param_1,1);
        uVar12 = (*param_1->handshake_func)(param_1);
        if ((int)uVar12 < 0) {
          return uVar12;
        }
        if (iVar11 == 0xb) {
          return 0xffffffff;
        }
        if (uVar12 == 0) {
          return 0xffffffff;
        }
        if (((*(byte *)&param_1[3].tlsext_debug_arg >> 2 & 1) != 0) ||
           (param_1[4].tlsext_debug_cb != (_func_3155 *)0x0)) goto LAB_009cc16c;
LAB_009cc858:
        param_1->rwstate = 3;
        b = SSL_get_rbio(param_1);
        BIO_clear_flags(b,0xf);
        BIO_set_flags(b,9);
        return 0xffffffff;
      }
      uVar12 = *(uint *)puVar24;
    }
    if (uVar12 == 0x17) {
      iVar11 = ossl_statem_app_data_allowed(param_1);
      if (iVar11 != 0) {
        *(undefined4 *)&param_1->mode = 2;
        return 0xffffffff;
      }
      iVar11 = ossl_statem_skip_early_data(param_1);
      if (iVar11 != 0) {
        iVar11 = early_data_count_ok(param_1,*(undefined8 *)
                                              (param_1[6].sid_ctx + uVar25 * 0x50 + 0x184),0x68,0);
        if (iVar11 == 0) {
          return 0xffffffff;
        }
        puVar24 = param_1[7].sid_ctx + uVar25 * 0x50 + -0xfc;
        puVar24[0] = '\x01';
        puVar24[1] = '\0';
        puVar24[2] = '\0';
        puVar24[3] = '\0';
        goto LAB_009cc16c;
      }
      ERR_new();
      uVar13 = 0x70a;
    }
    else {
      if (uVar12 - 0x14 < 3) {
        ERR_new();
        ERR_set_debug("ssl/record/rec_layer_s3.c",0x6eb,"ssl3_read_bytes");
        uVar13 = 10;
        goto LAB_009cc08c;
      }
      ERR_new();
      uVar13 = 0x6e1;
    }
    ERR_set_debug("ssl/record/rec_layer_s3.c",uVar13,"ssl3_read_bytes");
    uVar13 = 10;
    uVar14 = 0xf5;
    goto LAB_009cc090;
  }
  ERR_new();
  uVar13 = 0x6a5;
LAB_009cc7ec:
  ERR_set_debug("ssl/record/rec_layer_s3.c",uVar13,"ssl3_read_bytes");
  uVar13 = 10;
  uVar14 = 0x85;
  goto LAB_009cc090;
}

