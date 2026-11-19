/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009da4c8
 */

char * FUN_009da4c8(SSL *param_1,int param_2,undefined8 param_3,int *param_4,uchar *param_5,
                   uint param_6)

{
  undefined1 *puVar1;
  code *pcVar2;
  code *pcVar3;
  long lVar4;
  code *pcVar5;
  code *pcVar6;
  bool bVar7;
  uint uVar8;
  int iVar9;
  undefined4 uVar10;
  undefined4 *puVar11;
  BIO *pBVar12;
  undefined8 uVar13;
  char *hint;
  undefined8 uVar14;
  undefined1 *puVar15;
  _func_3153 *p_Var16;
  char *pcVar17;
  BIO *pBVar18;
  dtls1_state_st *str;
  SSL_METHOD **ppSVar19;
  int *piVar20;
  _func_3153 *p_Var21;
  int *local_b8;
  undefined8 local_b0;
  code *pcStack_a8;
  code *local_78;
  int local_64;
  
  if (param_1->state == 1) {
    return (char *)0xffffffff;
  }
  ERR_clear_error();
  puVar11 = (undefined4 *)__errno();
  *puVar11 = 0;
  p_Var16 = param_1[3].psk_client_callback;
  if (p_Var16 == (_func_3153 *)0x0) {
    p_Var16 = *(_func_3153 **)(*(long *)&param_1[3].ex_data.dummy + 0x120);
  }
  iVar9 = param_1->init_off;
  *(int *)((long)&param_1->packet + 4) = *(int *)((long)&param_1->packet + 4) + 1;
  if (iVar9 == 0) {
LAB_009da548:
    if ((*(byte *)((long)&param_1->hit + 1) >> 3 & 1) == 0) {
      uVar8 = SSL_clear(param_1);
      puVar11 = (undefined4 *)(ulong)uVar8;
      if (uVar8 == 0) {
        return (char *)0xffffffff;
      }
    }
LAB_009da55c:
    iVar9 = param_1->state;
  }
  else {
    if (*(int *)((long)&param_1->init_msg + 4) != 0) goto LAB_009da55c;
    iVar9 = param_1->state;
    if (iVar9 == 0) goto LAB_009da548;
  }
  if (iVar9 == 0) {
    *(undefined4 *)((long)&param_1->init_msg + 4) = 0;
    param_1->init_num = 0;
  }
  else if (iVar9 != 4) goto LAB_009da580;
  param_1->server = param_2;
  if ((p_Var16 != (_func_3153 *)0x0) &&
     ((((param_1->tlsext_opaque_prf_input == (void *)0x0 || (param_1[1].wbio == (BIO *)0x0)) ||
       (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0)) ||
      ((iVar9 = param_1->method->version, iVar9 < 0x304 || (iVar9 == 0x10000)))))) {
    uVar8 = (*p_Var16)(param_1,(char *)0x10,(char *)0x1,(uint)param_4,param_5,param_6);
    puVar11 = (undefined4 *)(ulong)uVar8;
  }
  uVar8 = param_1->version;
  param_4 = (int *)(ulong)uVar8;
  if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) {
    if ((uVar8 & 0xffffff00) == 0x300) {
LAB_009da69c:
      param_5 = (uchar *)0x0;
      iVar9 = ssl_security(param_1,9,0);
      if (iVar9 == 0) {
        ERR_new();
        uVar13 = 0x181;
      }
      else {
        if (param_1->d1 == (dtls1_state_st *)0x0) {
          str = (dtls1_state_st *)BUF_MEM_new();
          if (str == (dtls1_state_st *)0x0) {
            ERR_new();
            uVar13 = 0x187;
          }
          else {
            iVar9 = BUF_MEM_grow((BUF_MEM *)str,0x4000);
            if (iVar9 != 0) {
              param_1->d1 = str;
              goto LAB_009da6c0;
            }
            ERR_new();
            uVar13 = 0x18b;
          }
          ERR_set_debug("ssl/statem/statem.c",uVar13,"state_machine");
          uVar8 = 0;
          pcVar17 = (char *)0xffffffff;
          ossl_statem_fatal(param_1,0xffffffff,0xc0103);
          goto LAB_009daf48;
        }
LAB_009da6c0:
        iVar9 = ssl3_setup_buffers(param_1);
        if (iVar9 == 0) {
          ERR_new();
          uVar13 = 0x193;
        }
        else {
          param_1->msg_callback = (_func_3150 *)0x0;
          (param_1->ex_data).dummy = 0;
          iVar9 = ssl_init_wbio_buffer(param_1);
          if (iVar9 != 0) {
            if (((*(int *)((long)&param_1->init_msg + 4) == 0) && (param_1->state == 0)) ||
               (*(int *)&param_1[4].expand != 0)) {
              iVar9 = tls_setup_handshake(param_1);
              uVar8 = (uint)param_4;
              if (iVar9 == 0) goto switchD_009dac14_caseD_3;
              if ((param_1->tlsext_opaque_prf_input == (void *)0x0) ||
                 (param_1[1].wbio == (BIO *)0x0)) {
                *(undefined4 *)&param_1->packet = 1;
              }
            }
            iVar9 = 3;
            param_1->state = 3;
            param_1->rstate = 0;
LAB_009da580:
            local_b8 = (int *)((long)&param_1->init_msg + 4);
            piVar20 = &param_1->server;
            ppSVar19 = &param_1->method;
LAB_009da8a4:
            uVar8 = (uint)param_4;
            if (iVar9 == 2) {
              local_78 = (code *)0x0;
              p_Var21 = param_1[3].psk_client_callback;
              if (p_Var21 == (_func_3153 *)0x0) {
                p_Var21 = *(_func_3153 **)(*(long *)&param_1[3].ex_data.dummy + 0x120);
              }
              pcVar3 = ossl_statem_client_max_message_size;
              pcVar5 = ossl_statem_client_process_message;
              pcVar2 = ossl_statem_client_read_transition;
              pcVar6 = ossl_statem_client_post_process_message;
              if (param_1->server != 0) {
                pcVar3 = ossl_statem_server_max_message_size;
                pcVar5 = ossl_statem_server_process_message;
                pcVar2 = ossl_statem_server_read_transition;
                pcVar6 = ossl_statem_server_post_process_message;
              }
              if (*(int *)&param_1->packet != 0) {
                param_1[3].tlsext_status_expected = 1;
                *(undefined4 *)&param_1->packet = 0;
              }
switchD_009dac14_default:
              do {
                iVar9 = *(int *)((long)&param_1->init_buf + 4);
                if (iVar9 == 2) goto LAB_009dabec;
                if (iVar9 != 1) {
                  if (iVar9 != 0) {
                    ERR_new();
                    uVar13 = 699;
                    goto LAB_009dae40;
                  }
                  if (((byte)(*ppSVar19)->get_timeout[0x60] >> 3 & 1) == 0) {
                    iVar9 = tls_get_message_header(param_1,&local_64);
                    uVar8 = (uint)param_4;
                  }
                  else {
                    iVar9 = dtls_get_message(param_1,&local_64);
                    uVar8 = (uint)param_4;
                  }
                  if (iVar9 == 0) goto switchD_009dac14_caseD_3;
                  if (p_Var21 != (_func_3153 *)0x0) {
                    if (*piVar20 == 0) {
                      pcVar17 = (char *)0x1001;
                    }
                    else {
                      pcVar17 = (char *)0x2001;
                    }
                    (*p_Var21)(param_1,pcVar17,(char *)0x1,(uint)param_4,param_5,param_6);
                  }
                  iVar9 = (*pcVar2)(param_1,local_64);
                  uVar8 = (uint)param_4;
                  if (iVar9 == 0) goto switchD_009dac14_caseD_3;
                  pBVar18 = param_1[1].bbio;
                  pBVar12 = (BIO *)(*pcVar3)(param_1);
                  if (pBVar12 < pBVar18) {
                    ERR_new();
                    ERR_set_debug("ssl/statem/statem.c",0x263,"read_state_machine");
                    uVar13 = 0x2f;
                    uVar14 = 0x98;
                    goto LAB_009dae50;
                  }
                  if ((((byte)(*ppSVar19)->get_timeout[0x60] >> 3 & 1) == 0) &&
                     (param_1[1].bbio != (BIO *)0x0)) {
                    lVar4 = *(long *)&param_1->read_ahead;
                    pcVar17 = *(char **)(param_1->d1->cookie + 4);
                    puVar1 = (undefined1 *)((long)&(param_1[1].bbio)->method + 4);
                    iVar9 = BUF_MEM_grow_clean((BUF_MEM *)param_1->d1,(long)(int)puVar1);
                    if ((iVar9 == 0) ||
                       (puVar15 = (undefined1 *)(lVar4 - (long)pcVar17), puVar1 < puVar15)) {
                      ERR_new();
                      ERR_set_debug("ssl/statem/statem.c",0x26c,"read_state_machine");
                      uVar13 = 0x80007;
                      goto LAB_009daf2c;
                    }
                    *(undefined1 **)&param_1->read_ahead =
                         puVar15 + *(long *)(param_1->d1->cookie + 4);
                  }
                  *(undefined4 *)((long)&param_1->init_buf + 4) = 1;
                }
                if (((byte)(*ppSVar19)->get_timeout[0x60] >> 3 & 1) == 0) {
                  iVar9 = tls_get_message_body(param_1,&local_78);
                  uVar8 = (uint)param_4;
                }
                else {
                  iVar9 = dtls_get_message_body(param_1,&local_78);
                  uVar8 = (uint)param_4;
                }
                if (iVar9 == 0) goto switchD_009dac14_caseD_3;
                param_1[3].tlsext_status_expected = 0;
                if ((long)local_78 < 0) {
                  ERR_new();
                  uVar13 = 0x284;
LAB_009dae40:
                  ERR_set_debug("ssl/statem/statem.c",uVar13,"read_state_machine");
                  uVar13 = 0x50;
                  uVar14 = 0xc0103;
                  goto LAB_009dae50;
                }
                local_b0 = *(undefined8 *)&param_1->read_ahead;
                pcStack_a8 = local_78;
                iVar9 = (*pcVar5)(param_1,&local_b0);
                uVar8 = (uint)param_4;
                param_1->msg_callback = (_func_3150 *)0x0;
                if (iVar9 == 2) {
                  *(undefined8 *)((long)&param_1->init_buf + 4) = 0x300000002;
                  goto switchD_009dac14_default;
                }
                if (iVar9 == 1) goto switchD_009dac14_caseD_1;
                if (iVar9 == 0) {
                  if ((param_1->init_off == 0) || (param_1->state != 1)) {
                    ERR_new();
                    uVar13 = 0x28e;
                    goto LAB_009daed8;
                  }
                  goto switchD_009dac14_caseD_3;
                }
                *(undefined4 *)((long)&param_1->init_buf + 4) = 0;
              } while( true );
            }
            if (iVar9 == 3) {
              p_Var21 = param_1[3].psk_client_callback;
              if (p_Var21 == (_func_3153 *)0x0) {
                p_Var21 = *(_func_3153 **)(*(long *)&param_1[3].ex_data.dummy + 0x120);
              }
              bVar7 = *piVar20 != 0;
              pcVar3 = ossl_statem_client_pre_work;
              pcVar5 = ossl_statem_client_write_transition;
              if (bVar7) {
                pcVar3 = ossl_statem_server_pre_work;
                pcVar5 = ossl_statem_server_write_transition;
              }
              pcVar2 = ossl_statem_client_post_work;
              if (bVar7) {
                pcVar2 = ossl_statem_server_post_work;
              }
              pcVar6 = ossl_statem_client_construct_message;
              if (bVar7) {
                pcVar6 = ossl_statem_server_construct_message;
              }
switchD_009dab08_default:
              switch(param_1->rstate) {
              case 0:
                if (p_Var21 != (_func_3153 *)0x0) {
                  if (*piVar20 == 0) {
                    pcVar17 = (char *)0x1001;
                  }
                  else {
                    pcVar17 = (char *)0x2001;
                  }
                  (*p_Var21)(param_1,pcVar17,(char *)0x1,(uint)param_4,param_5,param_6);
                }
                iVar9 = (*pcVar5)(param_1);
                uVar8 = (uint)param_4;
                if (iVar9 == 1) {
                  *(undefined8 *)&param_1->rstate = 0x300000001;
                }
                else {
                  if (iVar9 == 0) {
                    if ((param_1->init_off == 0) || (param_1->state != 1)) {
                      ERR_new();
                      uVar13 = 0x32e;
                      goto LAB_009db10c;
                    }
                    goto switchD_009dab08_caseD_3;
                  }
                  if (iVar9 == 2) {
                    iVar9 = 2;
                    param_1->state = 2;
                    *(undefined4 *)((long)&param_1->init_buf + 4) = 0;
                    goto LAB_009da8a4;
                  }
                }
                goto switchD_009dab08_default;
              case 1:
                uVar10 = (*pcVar3)(param_1,*(undefined4 *)&param_1->init_buf);
                uVar8 = (uint)param_4;
                *(undefined4 *)&param_1->init_buf = uVar10;
                switch(uVar10) {
                case 0:
                  if ((param_1->init_off == 0) || (param_1->state != 1)) {
                    ERR_new();
                    uVar13 = 0x336;
                    goto LAB_009db10c;
                  }
                  goto switchD_009dab08_caseD_3;
                case 1:
                  goto switchD_009dab08_caseD_1;
                case 2:
                  param_1->rstate = 2;
                  break;
                case 3:
                case 4:
                case 5:
                  goto switchD_009dab08_caseD_3;
                }
                param_4 = &local_64;
                iVar9 = (*pcVar6)(param_1,&local_b0,&local_78);
                uVar8 = (uint)param_4;
                if (iVar9 == 0) goto switchD_009dab08_caseD_3;
                if (local_64 == -1) {
LAB_009daa00:
                  *(undefined8 *)&param_1->rstate = 0x300000003;
                  goto switchD_009dab08_default;
                }
                iVar9 = WPACKET_init(&local_b0,param_1->d1);
                if ((iVar9 == 0) ||
                   (iVar9 = (**(code **)(param_1->method->get_timeout + 0x68))
                                      (param_1,&local_b0,local_64), iVar9 == 0)) {
                  WPACKET_cleanup(&local_b0);
                  ERR_new();
                  uVar13 = 0x351;
                }
                else {
                  if (local_78 != (code *)0x0) {
                    iVar9 = (*local_78)(param_1,&local_b0);
                    uVar8 = (uint)param_4;
                    if (iVar9 < 1) {
                      WPACKET_cleanup(&local_b0);
                      if ((param_1->init_off == 0) || (param_1->state != 1)) {
                        ERR_new();
                        uVar13 = 0x35a;
                        goto LAB_009db10c;
                      }
                      goto switchD_009dab08_caseD_3;
                    }
                    if (iVar9 == 2) {
                      WPACKET_cleanup(&local_b0);
                      goto LAB_009daa00;
                    }
                  }
                  iVar9 = (**(code **)(param_1->method->get_timeout + 0x70))
                                    (param_1,&local_b0,local_64);
                  if ((iVar9 != 0) && (iVar9 = WPACKET_finish(&local_b0), iVar9 != 0))
                  goto switchD_009da930_caseD_2;
                  WPACKET_cleanup(&local_b0);
                  ERR_new();
                  uVar13 = 0x36a;
                }
                break;
              case 2:
switchD_009da930_caseD_2:
                if ((((byte)(*ppSVar19)->get_timeout[0x60] >> 3 & 1) != 0) &&
                   (*(int *)&param_1->s2 != 0)) {
                  dtls1_start_timer(param_1);
                }
                if ((*local_b8 == 0x23) || (*local_b8 == 0x10)) {
                  if (((byte)(*ppSVar19)->get_timeout[0x60] >> 3 & 1) == 0) {
                    iVar9 = ssl3_do_write(param_1,0x14);
                    uVar8 = (uint)param_4;
                  }
                  else {
                    iVar9 = dtls1_do_write(param_1,0x14);
                    uVar8 = (uint)param_4;
                  }
                }
                else {
                  iVar9 = (**(code **)(param_1->method->get_timeout + 0x78))(param_1);
                  uVar8 = (uint)param_4;
                }
                if (0 < iVar9) {
                  uVar10 = 3;
                  *(undefined8 *)&param_1->rstate = 0x300000003;
                  goto LAB_009daae0;
                }
                goto switchD_009dab08_caseD_3;
              case 3:
                uVar10 = *(undefined4 *)&param_1->init_buf;
                goto LAB_009daae0;
              default:
                ERR_new();
                uVar13 = 0x390;
              }
              ERR_set_debug("ssl/statem/statem.c",uVar13,"write_state_machine");
              uVar13 = 0xc0103;
              goto LAB_009daf2c;
            }
            if (iVar9 == 4) {
              str = (dtls1_state_st *)0x0;
              pcVar17 = (char *)0x1;
              goto LAB_009daf48;
            }
            if ((iVar9 != 1) || (param_1->init_off == 0)) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem.c",0x1cf,"state_machine");
              uVar8 = 0;
              ossl_statem_fatal(param_1,0x50,0x100);
            }
            ERR_new();
            ERR_set_debug("ssl/statem/statem.c",0x1d0,"state_machine");
            ERR_set_error(0x14,0xc0101,0);
            goto switchD_009dac14_caseD_3;
          }
          ERR_new();
          uVar13 = 0x1a5;
        }
      }
    }
    else {
      ERR_new(puVar11);
      uVar13 = 0x17b;
    }
  }
  else {
    if (((uVar8 & 0xff00) == 0xfe00) || ((param_2 == 0 && ((uVar8 & 0xff00) == 0x100))))
    goto LAB_009da69c;
    ERR_new(puVar11);
    uVar13 = 0x176;
  }
  ERR_set_debug("ssl/statem/statem.c",uVar13,"state_machine");
  uVar8 = 0;
  pcVar17 = (char *)0xffffffff;
  ossl_statem_fatal(param_1,0xffffffff,0xc0103);
  str = (dtls1_state_st *)0x0;
LAB_009daf48:
  *(int *)((long)&param_1->packet + 4) = *(int *)((long)&param_1->packet + 4) + -1;
  BUF_MEM_free((BUF_MEM *)str);
  if (p_Var16 != (_func_3153 *)0x0) {
    if (param_2 == 0) {
      hint = (char *)0x1002;
    }
    else {
      hint = (char *)0x2002;
    }
    (*p_Var16)(param_1,hint,pcVar17,uVar8,param_5,param_6);
  }
  return pcVar17;
LAB_009dabec:
  uVar10 = (*pcVar6)(param_1,*(undefined4 *)&param_1->init_msg);
  uVar8 = (uint)param_4;
  *(undefined4 *)&param_1->init_msg = uVar10;
  switch(uVar10) {
  case 0:
    if ((param_1->init_off == 0) || (param_1->state != 1)) {
      ERR_new();
      uVar13 = 0x2a6;
LAB_009daed8:
      ERR_set_debug("ssl/statem/statem.c",uVar13,"read_state_machine");
      uVar13 = 0x50;
      uVar14 = 0x100;
LAB_009dae50:
      uVar8 = 0;
      ossl_statem_fatal(param_1,uVar13,uVar14);
    }
    goto switchD_009dac14_caseD_3;
  case 1:
    goto switchD_009dac14_caseD_1;
  case 2:
    *(undefined4 *)((long)&param_1->init_buf + 4) = 0;
    break;
  case 3:
  case 4:
  case 5:
    goto switchD_009dac14_caseD_3;
  }
  goto switchD_009dac14_default;
switchD_009dac14_caseD_1:
  if (((byte)(*ppSVar19)->get_timeout[0x60] >> 3 & 1) != 0) {
    dtls1_stop_timer(param_1);
  }
  iVar9 = 3;
  param_1->state = 3;
  param_1->rstate = 0;
  goto LAB_009da8a4;
LAB_009daae0:
  uVar10 = (*pcVar2)(param_1,uVar10);
  uVar8 = (uint)param_4;
  *(undefined4 *)&param_1->init_buf = uVar10;
  switch(uVar10) {
  case 0:
    if ((param_1->init_off != 0) && (param_1->state == 1)) goto switchD_009dab08_caseD_3;
    ERR_new();
    uVar13 = 0x37f;
LAB_009db10c:
    ERR_set_debug("ssl/statem/statem.c",uVar13,"write_state_machine");
    uVar13 = 0x100;
LAB_009daf2c:
    uVar8 = 0;
    ossl_statem_fatal(param_1,0x50,uVar13);
    goto switchD_009dab08_caseD_3;
  case 1:
    goto switchD_009dab08_caseD_1;
  case 2:
    param_1->rstate = 0;
    break;
  case 3:
  case 4:
  case 5:
    goto switchD_009dab08_caseD_3;
  }
  goto switchD_009dab08_default;
switchD_009dab08_caseD_1:
  iVar9 = 4;
  param_1->state = 4;
  goto LAB_009da8a4;
switchD_009dab08_caseD_3:
switchD_009dac14_caseD_3:
  str = (dtls1_state_st *)0x0;
  pcVar17 = (char *)0xffffffff;
  goto LAB_009daf48;
}

