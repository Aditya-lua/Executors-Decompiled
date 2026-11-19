/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b702c
 */

SSL * SSL_dup(SSL *ssl)

{
  uint *puVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int extraout_w0;
  int iVar5;
  SSL *s;
  dtls1_state_st *pdVar6;
  uchar *puVar7;
  undefined1 *puVar8;
  SSL_CTX *pSVar9;
  undefined8 uVar10;
  COMP_CTX *__n;
  _func_3058 **pp_Var11;
  long lVar12;
  KSSL_CTX *pKVar13;
  _func_3058 *p_Var14;
  long lVar15;
  SSL_METHOD *pSVar16;
  int iVar17;
  SSL_METHOD *pSVar18;
  
  iVar4 = SSL_in_init();
  if ((iVar4 == 0) || (iVar4 = SSL_in_before(ssl), iVar4 == 0)) {
    puVar1 = &ssl[3].max_send_fragment;
    do {
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(puVar1,0x10);
      if (bVar3) {
        *puVar1 = *puVar1 + 1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    return ssl;
  }
  s = SSL_new(*(SSL_CTX **)&ssl[3].ex_data.dummy);
  if (s == (SSL *)0x0) {
    return (SSL *)0x0;
  }
  lVar15._0_4_ = ssl[3].sid_ctx_length;
  lVar15._4_1_ = ssl[3].sid_ctx[0];
  lVar15._5_1_ = ssl[3].sid_ctx[1];
  lVar15._6_1_ = ssl[3].sid_ctx[2];
  lVar15._7_1_ = ssl[3].sid_ctx[3];
  if (lVar15 == 0) {
    pSVar16 = ssl->method;
    pSVar18 = s->method;
    if (pSVar18 != pSVar16) {
      p_Var14 = (_func_3058 *)s->handshake_func;
      if (pSVar18->version == pSVar16->version) {
        s->method = pSVar16;
        iVar4 = 1;
      }
      else {
        (*pSVar18->ssl_accept)(s);
        s->method = pSVar16;
        iVar4 = (*pSVar16->ssl_clear)(s);
      }
      if (p_Var14 == pSVar18->ssl_read) {
        pp_Var11 = &pSVar16->ssl_read;
LAB_009b7110:
        s->handshake_func = (_func_3149 *)*pp_Var11;
      }
      else if (p_Var14 == (_func_3058 *)pSVar18->ssl_connect) {
        pp_Var11 = (_func_3058 **)&pSVar16->ssl_connect;
        goto LAB_009b7110;
      }
      if (iVar4 == 0) goto LAB_009b7348;
    }
    if (ssl[3].d1 != (dtls1_state_st *)0x0) {
      ssl_cert_free(s[3].d1);
      pdVar6 = (dtls1_state_st *)ssl_cert_dup(ssl[3].d1);
      s[3].d1 = pdVar6;
      if (pdVar6 == (dtls1_state_st *)0x0) goto LAB_009b7348;
    }
    if ((uint)ssl[3].expand < 0x21) {
      __n = (COMP_CTX *)((ulong)ssl[3].expand & 0xffffffff);
      s[3].expand = __n;
      memcpy(&s[3].enc_write_ctx,&ssl[3].enc_write_ctx,(size_t)__n);
      goto LAB_009b7184;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x38a,"SSL_set_session_id_context");
    uVar10 = 0x111;
LAB_009b7340:
    ERR_set_error(0x14,uVar10,0);
  }
  else {
    SSL_copy_session_id(s,ssl);
    if (extraout_w0 == 0) goto LAB_009b7348;
LAB_009b7184:
    iVar4 = OPENSSL_sk_num(ssl[1].tlsext_ellipticcurvelist);
    if (0 < iVar4) {
      iVar4 = OPENSSL_sk_num(ssl[1].tlsext_ellipticcurvelist);
      OPENSSL_sk_pop_free(s[1].tlsext_ellipticcurvelist,FUN_009b98fc);
      s[1].tlsext_ellipticcurvelist = (uchar *)0x0;
      OPENSSL_sk_pop_free(s[1].tlsext_opaque_prf_input,X509_free);
      s[1].tlsext_opaque_prf_input = (void *)0x0;
      X509_free((X509 *)s[1].tlsext_session_ticket);
      s[1].tlsext_session_ticket = (TLS_SESSION_TICKET_EXT *)0x0;
      s[1].tlsext_opaque_prf_input_len = 0;
      *(undefined8 *)((long)&s[1].tls_session_ticket_ext_cb + 4) = 0xffffffffffffffff;
      lVar15 = *(long *)&s[3].ex_data.dummy;
      s[1].tls_session_secret_cb = ssl[1].tls_session_secret_cb;
      s[1].tlsext_ellipticcurvelist_length = lVar15 + 0x398;
      puVar7 = (uchar *)OPENSSL_sk_new_reserve(0,iVar4);
      s[1].tlsext_ellipticcurvelist = puVar7;
      if (puVar7 == (uchar *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/ssl_lib.c",0xcb,"ssl_dane_dup");
        uVar10 = 0xc0100;
        goto LAB_009b7340;
      }
      if (0 < iVar4) {
        iVar17 = 0;
        do {
          puVar8 = (undefined1 *)OPENSSL_sk_value(ssl[1].tlsext_ellipticcurvelist,iVar17);
          iVar5 = SSL_dane_tlsa_add(s,*puVar8,puVar8[1],puVar8[2],*(undefined8 *)(puVar8 + 8),
                                    *(undefined8 *)(puVar8 + 0x10));
          if (iVar5 < 1) goto LAB_009b7348;
          iVar17 = iVar17 + 1;
        } while (iVar17 < iVar4);
      }
    }
    s->version = ssl->version;
    s[3].tlsext_debug_cb = ssl[3].tlsext_debug_cb;
    *(undefined4 *)&s[3].tlsext_hostname = *(undefined4 *)&ssl[3].tlsext_hostname;
    s[3].tlsext_debug_arg = ssl[3].tlsext_debug_arg;
    lVar12._0_4_ = ssl[3].servername_done;
    lVar12._4_4_ = ssl[3].tlsext_status_type;
    if (-1 < lVar12) {
      s[3].servername_done = (undefined4)lVar12;
      s[3].tlsext_status_type = lVar12._4_4_;
    }
    *(undefined4 *)&s[4].client_CA = *(undefined4 *)&ssl[4].client_CA;
    iVar4 = ssl[1].tlsext_ticket_expected;
    puVar7 = ssl[1].tlsext_ocsp_resp;
    s[1].tlsext_ocsp_resplen = ssl[1].tlsext_ocsp_resplen;
    s[1].tlsext_ticket_expected = iVar4;
    s[1].tlsext_ocsp_resp = puVar7;
    pKVar13 = ssl[3].kssl_ctx;
    s[3].error = ssl[3].error;
    if (pKVar13 != (KSSL_CTX *)0x0) {
      s[3].kssl_ctx = pKVar13;
    }
    iVar4 = X509_VERIFY_PARAM_get_depth((X509_VERIFY_PARAM *)ssl[1].tlsext_ecpointformatlist);
    X509_VERIFY_PARAM_set_depth((X509_VERIFY_PARAM *)s[1].tlsext_ecpointformatlist,iVar4);
    *(undefined8 *)(s[3].sid_ctx + 0x1c) = *(undefined8 *)(ssl[3].sid_ctx + 0x1c);
    s[3].psk_client_callback = ssl[3].psk_client_callback;
    iVar4 = CRYPTO_dup_ex_data(0,(CRYPTO_EX_DATA *)&s[3].options,(CRYPTO_EX_DATA *)&ssl[3].options);
    if (iVar4 != 0) {
      s->server = ssl->server;
      if (ssl->handshake_func != (_func_3149 *)0x0) {
        if (ssl->server == 0) {
          s->server = 0;
          s->shutdown = 0;
          ossl_statem_clear(s);
          p_Var14 = s->method->ssl_read;
        }
        else {
          s->server = 1;
          s->shutdown = 0;
          ossl_statem_clear(s);
          p_Var14 = (_func_3058 *)s->method->ssl_connect;
        }
        s->handshake_func = (_func_3149 *)p_Var14;
        FUN_009b1b60(s);
      }
      s->shutdown = ssl->shutdown;
      *(int *)&s[1].tlsext_ecpointformatlist_length = (int)ssl[1].tlsext_ecpointformatlist_length;
      puVar7 = ssl[10].tlsext_ellipticcurvelist;
      s[10].tlsext_opaque_prf_input = ssl[10].tlsext_opaque_prf_input;
      s[10].tlsext_ellipticcurvelist = puVar7;
      X509_VERIFY_PARAM_inherit
                ((X509_VERIFY_PARAM *)s[1].tlsext_ecpointformatlist,
                 (X509_VERIFY_PARAM *)ssl[1].tlsext_ecpointformatlist);
      if (ssl[1].initial_ctx != (SSL_CTX *)0x0) {
        pSVar9 = (SSL_CTX *)OPENSSL_sk_dup();
        s[1].initial_ctx = pSVar9;
        if (pSVar9 == (SSL_CTX *)0x0) goto LAB_009b7348;
      }
      if (ssl[1].next_proto_negotiated != (uchar *)0x0) {
        puVar7 = (uchar *)OPENSSL_sk_dup();
        s[1].next_proto_negotiated = puVar7;
        if (puVar7 == (uchar *)0x0) goto LAB_009b7348;
      }
      iVar4 = FUN_009b741c(&s[3].max_cert_list,ssl[3].max_cert_list);
      if ((iVar4 != 0) &&
         (uVar10._0_4_ = ssl[3].first_packet, uVar10._4_4_ = ssl[3].client_version,
         iVar4 = FUN_009b741c(&s[3].first_packet,uVar10), iVar4 != 0)) {
        return s;
      }
    }
  }
LAB_009b7348:
  SSL_free(s);
  return (SSL *)0x0;
}

