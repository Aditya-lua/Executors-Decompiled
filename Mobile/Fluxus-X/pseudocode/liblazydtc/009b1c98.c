/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b1c98
 */

SSL * SSL_new(SSL_CTX *ctx)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  uint uVar4;
  int iVar5;
  SSL *s;
  long lVar6;
  dtls1_state_st *pdVar7;
  X509_VERIFY_PARAM *pXVar8;
  SRTP_PROTECTION_PROFILE *pSVar9;
  SSL_METHOD *pSVar10;
  void *__dest;
  long lVar11;
  undefined8 uVar12;
  COMP_CTX *pCVar13;
  uchar *puVar14;
  GEN_SESSION_CB pGVar15;
  EVP_CIPHER_CTX *pEVar16;
  stack_st_OCSP_RESPID *psVar17;
  _func_3091 *p_Var18;
  SSL_CTX *pSVar19;
  undefined1 *puVar20;
  undefined8 uVar21;
  
  if (ctx == (SSL_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x2b4,"SSL_new");
    uVar12 = 0xc3;
    goto LAB_009b20b4;
  }
  if (ctx->cipher_list == (stack_st_SSL_CIPHER *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x2b8,"SSL_new");
    uVar12 = 0xe4;
    goto LAB_009b20b4;
  }
  s = (SSL *)CRYPTO_zalloc(0x1db8,"ssl/ssl_lib.c",700);
  if (s != (SSL *)0x0) {
    s[3].max_send_fragment = 1;
    lVar6 = CRYPTO_THREAD_lock_new();
    *(long *)&s[10].next_proto_negotiated_len = lVar6;
    if (lVar6 == 0) {
      CRYPTO_free(s);
      s = (SSL *)0x0;
    }
    else {
      RECORD_LAYER_init(&s[4].ex_data.dummy,s);
      s[3].tlsext_debug_cb = *(_func_3155 **)&ctx->read_ahead;
      s[1].tls_session_secret_cb = *(tls_session_secret_cb_fn *)&ctx[1].verify_mode;
      *(undefined4 *)&s[3].tlsext_hostname = *(undefined4 *)&ctx->msg_callback_arg;
      s[3].tlsext_debug_arg = ctx->msg_callback;
      uVar4 = ctx->sid_ctx_length;
      s[3].servername_done = ctx->verify_mode;
      s[3].tlsext_status_type = uVar4;
      s[10].tls_session_ticket_ext_cb_arg = ctx[1].default_verify_callback;
      s[10].srtp_profiles = *(stack_st_SRTP_PROTECTION_PROFILE **)ctx[1].tlsext_tick_key_name;
      *(undefined4 *)((long)&s[4].enc_write_ctx + 4) =
           *(undefined4 *)(ctx[1].tlsext_tick_hmac_key + 8);
      lVar6 = OPENSSL_sk_dup(ctx->sessions);
      *(long *)&s[1].next_proto_negotiated_len = lVar6;
      if (lVar6 != 0) {
        pdVar7 = (dtls1_state_st *)ssl_cert_dup(*(undefined8 *)ctx->sid_ctx);
        s[3].d1 = pdVar7;
        if (pdVar7 != (dtls1_state_st *)0x0) {
          *(undefined4 *)&s[4].client_CA = *(undefined4 *)(ctx->sid_ctx + 8);
          uVar12 = *(undefined8 *)(ctx->sid_ctx + 0x18);
          puVar14 = *(uchar **)(ctx->sid_ctx + 0x10);
          s[1].tlsext_ocsp_resplen = (int)uVar12;
          s[1].tlsext_ticket_expected = (int)((ulong)uVar12 >> 0x20);
          s[1].tlsext_ocsp_resp = puVar14;
          s[3].error = *(int *)&ctx->default_verify_callback;
          s[4].ex_data.sk = *(stack_st_void **)(ctx[1].sid_ctx + 8);
          pGVar15 = ctx[1].generate_session_id;
          s[10].initial_ctx = (SSL_CTX *)ctx[1].param;
          s[10].tls_session_secret_cb_arg = pGVar15;
          s[10].next_proto_negotiated = *(uchar **)&ctx[1].quiet_shutdown;
          pCVar13 = (COMP_CTX *)ctx->generate_session_id;
          s[3].expand = pCVar13;
          if (pCVar13 < (COMP_CTX *)0x21) {
            pCVar13 = (COMP_CTX *)ctx->client_cert_engine;
            s[3].cert = (cert_st *)ctx->tlsext_servername_callback;
            s[3].compress = pCVar13;
            pEVar16 = (EVP_CIPHER_CTX *)ctx->param;
            s[3].write_hash = *(EVP_MD_CTX **)&ctx->quiet_shutdown;
            s[3].enc_write_ctx = pEVar16;
            s[3].kssl_ctx = ctx->tlsext_servername_arg;
            *(undefined8 *)(s[3].sid_ctx + 0x1c) = *(undefined8 *)ctx->tlsext_tick_key_name;
            pXVar8 = X509_VERIFY_PARAM_new();
            s[1].tlsext_ecpointformatlist = (uchar *)pXVar8;
            if (pXVar8 != (X509_VERIFY_PARAM *)0x0) {
              X509_VERIFY_PARAM_inherit
                        (pXVar8,*(X509_VERIFY_PARAM **)(ctx->tlsext_tick_key_name + 8));
              s->quiet_shutdown = *(int *)ctx->tlsext_tick_hmac_key;
              *(undefined1 *)((long)&s[4].d1 + 4) = *(undefined1 *)((long)&ctx[1].method + 4);
              psVar17 = (stack_st_OCSP_RESPID *)ctx->tlsext_ticket_key_cb;
              s[3].tlsext_ocsp_exts = (X509_EXTENSIONS *)ctx->tlsext_status_cb;
              s[3].tlsext_ocsp_ids = psVar17;
              puVar14 = ctx->tlsext_status_arg;
              s[3].tlsext_ocsp_resp = puVar14;
              if ((uchar *)0x1 < puVar14) {
                *(undefined4 *)&s[4].client_CA = 1;
              }
              if (ctx->tlsext_opaque_prf_input_callback != (_func_3100 *)0x0) {
                SSL_set_default_read_buffer_len(s);
              }
              piVar1 = (int *)((long)&ctx->app_verify_arg + 4);
              do {
                cVar2 = '\x01';
                bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
                if (bVar3) {
                  *piVar1 = *piVar1 + 1;
                  cVar2 = ExclusiveMonitorsStatus();
                }
              } while (cVar2 != '\0');
              *(SSL_CTX **)&s[3].ex_data.dummy = ctx;
              *(undefined4 *)&s[3].next_proto_negotiated_len = 0;
              s[3].tlsext_opaque_prf_input = (void *)0x0;
              s[3].tlsext_ellipticcurvelist = (uchar *)0x0;
              *(undefined4 *)&s[3].tlsext_session_ticket = *(undefined4 *)&ctx[1].method;
              *(undefined8 *)((long)&s[3].initial_ctx + 4) = 0;
              *(undefined8 *)((long)&s[3].tls_session_secret_cb_arg + 4) = 0;
              *(undefined8 *)((long)&s[3].tls_session_secret_cb + 4) = 0;
              *(undefined8 *)((long)&s[3].tls_session_ticket_ext_cb_arg + 4) = 0;
              *(undefined4 *)((long)&s[3].next_proto_negotiated + 4) = 0;
              do {
                cVar2 = '\x01';
                bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
                if (bVar3) {
                  *piVar1 = *piVar1 + 1;
                  cVar2 = ExclusiveMonitorsStatus();
                }
              } while (cVar2 != '\0');
              *(SSL_CTX **)&s[4].mac_flags = ctx;
              if (ctx[1].cipher_list_by_id != (stack_st_SSL_CIPHER *)0x0) {
                pSVar9 = (SRTP_PROTECTION_PROFILE *)
                         CRYPTO_memdup(ctx[1].cipher_list_by_id,ctx[1].cipher_list,"ssl/ssl_lib.c",
                                       0x315);
                s[3].srtp_profile = pSVar9;
                if (pSVar9 == (SRTP_PROTECTION_PROFILE *)0x0) {
                  s[3].srtp_profiles = (stack_st_SRTP_PROTECTION_PROFILE *)0x0;
                  goto LAB_009b2084;
                }
                s[3].srtp_profiles = (stack_st_SRTP_PROTECTION_PROFILE *)ctx[1].cipher_list;
              }
              if (ctx[1].sessions != (lhash_st_SSL_SESSION *)0x0) {
                pSVar10 = (SSL_METHOD *)
                          CRYPTO_memdup(ctx[1].sessions,(long)ctx[1].cert_store << 1,"ssl/ssl_lib.c"
                                        ,0x321);
                s[4].method = pSVar10;
                if (pSVar10 == (SSL_METHOD *)0x0) {
                  s[4].version = 0;
                  s[4].type = 0;
                  goto LAB_009b2084;
                }
                *(x509_store_st **)(s + 4) = ctx[1].cert_store;
              }
              lVar6 = *(long *)&s[3].ex_data.dummy;
              s[4].init_msg = (void *)0x0;
              if (*(long *)(lVar6 + 0x2a8) != 0) {
                __dest = CRYPTO_malloc((int)*(undefined8 *)(lVar6 + 0x2b0),"ssl/ssl_lib.c",0x32e);
                *(void **)&s[4].state = __dest;
                if (__dest == (void *)0x0) {
                  s[4].init_buf = (BUF_MEM *)0x0;
                  goto LAB_009b2084;
                }
                lVar6 = *(long *)&s[3].ex_data.dummy;
                memcpy(__dest,*(void **)(lVar6 + 0x2a8),*(size_t *)(lVar6 + 0x2b0));
                s[4].init_buf = *(BUF_MEM **)(*(long *)&s[3].ex_data.dummy + 0x2b0);
              }
              *(undefined8 *)&s[3].references = 0;
              s[3].client_CA = (stack_st_X509_NAME *)0x0;
              p_Var18 = ctx->client_cert_cb;
              s[10].tlsext_opaque_prf_input = ctx->app_gen_cookie_cb;
              s[10].tlsext_ellipticcurvelist = (uchar *)p_Var18;
              pSVar10 = (SSL_METHOD *)ctx->cipher_list;
              *(undefined4 *)((long)&s[4].expand + 4) = 0xffffffff;
              s->method = pSVar10;
              uVar21 = *(undefined8 *)ctx[1].tlsext_tick_hmac_key;
              uVar12 = *(undefined8 *)(ctx[1].tlsext_tick_key_name + 8);
              s[0xb].version = (int)uVar21;
              s[0xb].type = (int)((ulong)uVar21 >> 0x20);
              s[10].tlsext_hb_seq = (int)uVar12;
              s[10].renegotiate = (int)((ulong)uVar12 >> 0x20);
              iVar5 = (*pSVar10->ssl_clear)(s);
              if (iVar5 != 0) {
                s->server = (uint)(ctx->cipher_list[1].stack.data != (char **)ssl_undefined_function
                                  );
                iVar5 = SSL_clear(s);
                if ((iVar5 != 0) &&
                   (iVar5 = CRYPTO_new_ex_data(0,s,(CRYPTO_EX_DATA *)&s[3].options), iVar5 != 0)) {
                  pSVar19 = (SSL_CTX *)ctx[1].app_verify_callback;
                  *(void **)&s[3].debug = ctx[1].app_verify_arg;
                  s[3].ctx = pSVar19;
                  puVar20 = ctx[1].default_passwd_callback;
                  s[3].ex_data.sk = ctx[1].default_passwd_callback_userdata;
                  s[3].verify_result = (long)puVar20;
                  pSVar10 = *(SSL_METHOD **)ctx[1].tlsext_tick_aes_key;
                  s[0xb].rbio = *(BIO **)(ctx[1].tlsext_tick_aes_key + 8);
                  s[0xb].method = pSVar10;
                  s[10].tlsext_opaque_prf_input_len = 0;
                  lVar6 = *(long *)ctx->tlsext_tick_aes_key;
                  pXVar8 = *(X509_VERIFY_PARAM **)(ctx->tlsext_tick_aes_key + 8);
                  if (lVar6 == 0) {
LAB_009b210c:
                    *(long *)&s[4].hit = lVar6;
                    s[4].param = pXVar8;
                    return s;
                  }
                  iVar5 = SSL_CTX_has_client_custom_ext(*(undefined8 *)&s[3].ex_data.dummy,0x12);
                  if (iVar5 == 0) {
                    lVar11 = (*s->method->ssl_ctrl)(s,0x41,1,(void *)0x0);
                    if (lVar11 != 0) goto LAB_009b210c;
                  }
                  else {
                    ERR_new();
                    ERR_set_debug("ssl/ssl_lib.c",0x1439,"SSL_set_ct_validation_callback");
                    ERR_set_error(0x14,0xce,0);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
LAB_009b2084:
  SSL_free(s);
  ERR_new();
  ERR_set_debug("ssl/ssl_lib.c",0x364,"SSL_new");
  uVar12 = 0xc0100;
LAB_009b20b4:
  ERR_set_error(0x14,uVar12,0);
  return (SSL *)0x0;
}

