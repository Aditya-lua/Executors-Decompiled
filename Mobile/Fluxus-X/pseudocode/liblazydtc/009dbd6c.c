/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009dbd6c
 */

ulong tls_construct_client_hello(SSL *param_1,uchar *param_2)

{
  bool bVar1;
  bool bVar2;
  KSSL_CTX **ppKVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  ulong uVar9;
  stack_st_SSL_CIPHER *psVar10;
  SSL_CIPHER *cipher;
  undefined8 uVar11;
  char *pcVar12;
  int *piVar13;
  undefined4 *puVar14;
  SSL_SESSION **__src;
  _func_3152 *__n;
  ulong uVar15;
  long local_68;
  
  puVar14 = *(undefined4 **)&param_1[3].sid_ctx_length;
  iVar6 = ssl_set_client_hello_version();
  if (iVar6 == 0) {
    if ((((puVar14 == (undefined4 *)0x0) ||
         (iVar6 = ssl_version_supported(param_1,*puVar14,0), iVar6 == 0)) ||
        (iVar6 = SSL_SESSION_is_resumable(puVar14), iVar6 == 0)) &&
       ((*(int *)&param_1[3].read_hash == 0 &&
        (uVar9 = ssl_get_new_session(param_1,0), (int)uVar9 == 0)))) {
      return uVar9;
    }
    ppKVar3 = &param_1->kssl_ctx;
    if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) {
      if (*(int *)&param_1[3].read_hash == 0) goto LAB_009dbe44;
LAB_009dbe64:
      iVar6 = WPACKET_put_bytes__(param_2,(long)*(int *)&param_1[3].field_0x1fc,2);
      if ((iVar6 == 0) || (iVar6 = WPACKET_memcpy(param_2,ppKVar3,0x20), iVar6 == 0)) {
        ERR_new();
        pcVar12 = "tls_construct_client_hello";
        uVar11 = 0x49e;
      }
      else {
        piVar13 = *(int **)&param_1[3].sid_ctx_length;
        __src = (SSL_SESSION **)(piVar13 + 0x96);
        if ((param_1->new_session == 0) && (*piVar13 != 0x304)) {
          __n = *(_func_3152 **)(piVar13 + 0x94);
          if (param_1->version == 0x304) {
            param_1[3].info_callback = __n;
            memcpy(&param_1[3].session,__src,(size_t)__n);
          }
        }
        else if (param_1->version == 0x304) {
          __n = (_func_3152 *)0x0;
          if ((*(byte *)((long)&param_1[3].tlsext_debug_cb + 2) >> 4 & 1) != 0) {
            __n = (_func_3152 *)0x20;
            __src = &param_1[3].session;
            param_1[3].info_callback = (_func_3152 *)0x20;
            if (*(int *)&param_1[3].read_hash == 0) {
              __n = (_func_3152 *)0x20;
              iVar6 = RAND_bytes_ex(**(undefined8 **)&param_1[3].ex_data.dummy,__src,0x20,0);
              if (iVar6 < 1) {
                ERR_new();
                pcVar12 = "tls_construct_client_hello";
                uVar11 = 0x4ad;
                goto LAB_009dc044;
              }
            }
          }
        }
        else {
          __n = (_func_3152 *)0x0;
        }
        iVar6 = WPACKET_start_sub_packet_len__(param_2,1);
        if ((iVar6 == 0) ||
           (((__n != (_func_3152 *)0x0 && (iVar6 = WPACKET_memcpy(param_2,__src,__n), iVar6 == 0))
            || (iVar6 = WPACKET_close(param_2), iVar6 == 0)))) {
          ERR_new();
          pcVar12 = "tls_construct_client_hello";
          uVar11 = 0x4bf;
        }
        else {
          if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0) {
            uVar9 = *(ulong *)&param_1[1].tlsext_ocsp_exts[8].stack;
            if ((0xff < uVar9) ||
               (iVar6 = WPACKET_sub_memcpy__(param_2,param_1[1].tlsext_ocsp_exts,uVar9,1),
               iVar6 == 0)) {
              ERR_new();
              pcVar12 = "tls_construct_client_hello";
              uVar11 = 0x4c8;
              goto LAB_009dc044;
            }
          }
          iVar6 = WPACKET_start_sub_packet_len__(param_2,2);
          if (iVar6 == 0) {
            ERR_new();
            pcVar12 = "tls_construct_client_hello";
            uVar11 = 0x4cf;
          }
          else {
            psVar10 = SSL_get_ciphers(param_1);
            iVar6 = *(int *)&param_1[4].expand;
            iVar7 = ssl_set_client_disabled(param_1);
            if (iVar7 == 0) {
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0xe61,"ssl_cipher_list_to_bytes");
              iVar6 = 0xbf;
              goto LAB_009dc058;
            }
            if (psVar10 != (stack_st_SSL_CIPHER *)0x0) {
              uVar9 = 0xfffc;
              if (iVar6 != 0) {
                uVar9 = 0xfffe;
              }
              if (((ulong)param_1[3].tlsext_debug_arg & 0x80) != 0) {
                uVar9 = uVar9 - 2;
              }
              iVar7 = OPENSSL_sk_num(psVar10);
              pcVar12 = "No ciphers enabled for max supported SSL/TLS version";
              if (0 < iVar7) {
                uVar15 = 0;
                bVar2 = false;
                iVar7 = 1;
                do {
                  cipher = (SSL_CIPHER *)OPENSSL_sk_value(psVar10,iVar7 + -1);
                  iVar8 = ssl_cipher_disabled(param_1,cipher,0x10001,0);
                  if (iVar8 == 0) {
                    iVar8 = (*param_1->method->put_cipher_by_char)(cipher,param_2);
                    if (iVar8 == 0) {
                      ERR_new();
                      pcVar12 = "ssl_cipher_list_to_bytes";
                      uVar11 = 0xe88;
                      goto LAB_009dc044;
                    }
                    if (!bVar2) {
                      if (((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0) {
                        bVar2 = false;
                        if (*(int *)&param_1[1].generate_session_id <= (int)cipher->algorithm_mac) {
                          bVar2 = *(int *)((long)&cipher->algorithm_enc + 4) <=
                                  *(int *)&param_1[1].generate_session_id;
                        }
                      }
                      else {
                        iVar4 = (int)cipher->algorithm_ssl;
                        iVar8 = 0xff00;
                        if (iVar4 != 0x100) {
                          iVar8 = iVar4;
                        }
                        iVar4 = 0xff00;
                        if (*(int *)&param_1[1].generate_session_id != 0x100) {
                          iVar4 = *(int *)&param_1[1].generate_session_id;
                        }
                        bVar2 = false;
                        if (iVar8 <= iVar4) {
                          iVar5 = *(int *)((long)&cipher->algorithm_mac + 4);
                          iVar8 = 0xff00;
                          if (iVar5 != 0x100) {
                            iVar8 = iVar5;
                          }
                          bVar2 = iVar4 <= iVar8;
                        }
                      }
                    }
                    uVar15 = local_68 + uVar15;
                  }
                  iVar8 = OPENSSL_sk_num(psVar10);
                } while ((uVar15 < uVar9) && (bVar1 = iVar7 < iVar8, iVar7 = iVar7 + 1, bVar1));
                if ((bVar2) && (uVar15 != 0)) {
                  if ((iVar6 == 0) &&
                     (iVar6 = (*param_1->method->put_cipher_by_char)
                                        ((SSL_CIPHER *)&DAT_00cc8568,param_2), iVar6 == 0)) {
                    ERR_new();
                    pcVar12 = "ssl_cipher_list_to_bytes";
                    uVar11 = 0xead;
                  }
                  else if ((*(char *)&param_1[3].tlsext_debug_arg < '\0') &&
                          (iVar6 = (*param_1->method->put_cipher_by_char)
                                             ((SSL_CIPHER *)&DAT_00cc85b8,param_2), iVar6 == 0)) {
                    ERR_new();
                    pcVar12 = "ssl_cipher_list_to_bytes";
                    uVar11 = 0xeb6;
                  }
                  else {
                    iVar6 = WPACKET_close(param_2);
                    if (iVar6 == 0) {
                      ERR_new();
                      pcVar12 = "tls_construct_client_hello";
                      uVar11 = 0x4d8;
                    }
                    else {
                      iVar6 = WPACKET_start_sub_packet_len__(param_2,1);
                      if (iVar6 == 0) {
                        ERR_new();
                        pcVar12 = "tls_construct_client_hello";
                        uVar11 = 0x4de;
                      }
                      else {
                        iVar6 = ssl_allow_compression(param_1);
                        if ((((iVar6 != 0) &&
                             (*(long *)(*(long *)&param_1[3].ex_data.dummy + 0x118) != 0)) &&
                            ((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) != 0 ||
                             (*(int *)&param_1[1].generate_session_id < 0x304)))) &&
                           (iVar6 = OPENSSL_sk_num(), 0 < iVar6)) {
                          iVar7 = 0;
                          do {
                            piVar13 = (int *)OPENSSL_sk_value(*(undefined8 *)
                                                               (*(long *)&param_1[3].ex_data.dummy +
                                                               0x118),iVar7);
                            iVar8 = WPACKET_put_bytes__(param_2,(long)*piVar13,1);
                            if (iVar8 == 0) {
                              ERR_new();
                              pcVar12 = "tls_construct_client_hello";
                              uVar11 = 0x4e9;
                              goto LAB_009dc044;
                            }
                            iVar7 = iVar7 + 1;
                          } while (iVar7 < iVar6);
                        }
                        iVar6 = WPACKET_put_bytes__(param_2,0,1);
                        if ((iVar6 != 0) && (iVar6 = WPACKET_close(param_2), iVar6 != 0)) {
                          iVar6 = tls_construct_extensions(param_1,param_2,0x80,0,0);
                          return (ulong)(iVar6 != 0);
                        }
                        ERR_new();
                        pcVar12 = "tls_construct_client_hello";
                        uVar11 = 0x4f1;
                      }
                    }
                  }
                  goto LAB_009dc044;
                }
                pcVar12 = (char *)0x0;
                if (!bVar2) {
                  pcVar12 = "No ciphers enabled for max supported SSL/TLS version";
                }
              }
              ERR_new();
              ERR_set_debug("ssl/statem/statem_clnt.c",0xea2,"ssl_cipher_list_to_bytes");
              iVar6 = 0xb5;
              goto LAB_009dc05c;
            }
            ERR_new();
            pcVar12 = "ssl_cipher_list_to_bytes";
            uVar11 = 0xe66;
          }
        }
      }
    }
    else {
      uVar9 = 0;
      do {
        if (*(char *)((long)ppKVar3 + uVar9) != '\0') goto LAB_009dbe64;
        uVar9 = uVar9 + 1;
      } while (uVar9 < 0x20);
LAB_009dbe44:
      iVar6 = ssl_fill_hello_random(param_1,0,ppKVar3,0x20,0);
      if (0 < iVar6) goto LAB_009dbe64;
      ERR_new();
      pcVar12 = "tls_construct_client_hello";
      uVar11 = 0x477;
    }
LAB_009dc044:
    ERR_set_debug("ssl/statem/statem_clnt.c",uVar11,pcVar12);
    iVar6 = 0xc0103;
  }
  else {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_clnt.c",0x453,"tls_construct_client_hello");
  }
LAB_009dc058:
  pcVar12 = (char *)0x0;
LAB_009dc05c:
  ossl_statem_fatal(param_1,0x50,iVar6,pcVar12);
  return 0;
}

