/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b1998
 */

int SSL_clear(SSL *s)

{
  int iVar1;
  void *ptr;
  dtls1_state_st *a;
  undefined8 uVar2;
  SSL_METHOD *pSVar3;
  _func_3055 *p_Var4;
  
  if (s->method == (SSL_METHOD *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x24b,"SSL_clear");
    uVar2 = 0xbc;
  }
  else {
    iVar1 = ssl_clear_bad_session();
    if (iVar1 != 0) {
      SSL_SESSION_free(*(SSL_SESSION **)&s[3].sid_ctx_length);
      s[3].sid_ctx_length = 0;
      s[3].sid_ctx[0] = '\0';
      s[3].sid_ctx[1] = '\0';
      s[3].sid_ctx[2] = '\0';
      s[3].sid_ctx[3] = '\0';
    }
    SSL_SESSION_free(*(SSL_SESSION **)(s[3].sid_ctx + 4));
    ptr = *(void **)(s[3].sid_ctx + 0xc);
    s[3].sid_ctx[4] = '\0';
    s[3].sid_ctx[5] = '\0';
    s[3].sid_ctx[6] = '\0';
    s[3].sid_ctx[7] = '\0';
    s[3].sid_ctx[8] = '\0';
    s[3].sid_ctx[9] = '\0';
    s[3].sid_ctx[10] = '\0';
    s[3].sid_ctx[0xb] = '\0';
    CRYPTO_free(ptr);
    *(undefined4 *)&s[3].read_hash = 0;
    s[10].srtp_profile = (SRTP_PROTECTION_PROFILE *)0x0;
    *(undefined4 *)&s[3].psk_server_callback = 0;
    *(undefined4 *)&s[1].tlsext_ecpointformatlist_length = 0;
    s->shutdown = 0;
    s[3].sid_ctx[0x14] = '\0';
    s[3].sid_ctx[0x15] = '\0';
    s[3].sid_ctx[0x16] = '\0';
    s[3].sid_ctx[0x17] = '\0';
    s[3].sid_ctx[0x18] = '\0';
    s[3].sid_ctx[0x19] = '\0';
    s[3].sid_ctx[0x1a] = '\0';
    s[3].sid_ctx[0x1b] = '\0';
    s[3].sid_ctx[0xc] = '\0';
    s[3].sid_ctx[0xd] = '\0';
    s[3].sid_ctx[0xe] = '\0';
    s[3].sid_ctx[0xf] = '\0';
    s[3].sid_ctx[0x10] = '\0';
    s[3].sid_ctx[0x11] = '\0';
    s[3].sid_ctx[0x12] = '\0';
    s[3].sid_ctx[0x13] = '\0';
    if (*(int *)&s[4].expand == 0) {
      ossl_statem_clear(s);
      a = s->d1;
      iVar1 = s->method->version;
      s->rwstate = 1;
      s->version = iVar1;
      *(int *)&s[3].field_0x1fc = iVar1;
      BUF_MEM_free((BUF_MEM *)a);
      s->d1 = (dtls1_state_st *)0x0;
      FUN_009b1b60(s);
      uVar2._0_4_ = s[4].sid_ctx_length;
      uVar2._4_1_ = s[4].sid_ctx[0];
      uVar2._5_1_ = s[4].sid_ctx[1];
      uVar2._6_1_ = s[4].sid_ctx[2];
      uVar2._7_1_ = s[4].sid_ctx[3];
      s[3].tlsext_status_expected = 0;
      *(undefined4 *)((long)&s[4].expand + 4) = 0xffffffff;
      EVP_MD_CTX_free(uVar2);
      s[4].sid_ctx_length = 0;
      s[4].sid_ctx[0] = '\0';
      s[4].sid_ctx[1] = '\0';
      s[4].sid_ctx[2] = '\0';
      s[4].sid_ctx[3] = '\0';
      *(undefined8 *)((long)&s[1].tls_session_ticket_ext_cb + 4) = 0xffffffffffffffff;
      X509_free((X509 *)s[1].tlsext_session_ticket);
      s[1].tlsext_session_ticket = (TLS_SESSION_TICKET_EXT *)0x0;
      s[1].tlsext_opaque_prf_input_len = 0;
      X509_VERIFY_PARAM_move_peername(s[1].tlsext_ecpointformatlist,0);
      CRYPTO_free(s[0xb].wbio);
      s[0xb].bbio = (BIO *)0x0;
      s[0xb].wbio = (BIO *)0x0;
      pSVar3 = s->method;
      if (pSVar3 == *(SSL_METHOD **)(*(long *)&s[3].ex_data.dummy + 8)) {
        p_Var4 = pSVar3->ssl_free;
      }
      else {
        (*pSVar3->ssl_accept)(s);
        pSVar3 = *(SSL_METHOD **)(*(long *)&s[3].ex_data.dummy + 8);
        s->method = pSVar3;
        p_Var4 = (_func_3055 *)pSVar3->ssl_clear;
      }
      iVar1 = (*p_Var4)(s);
      if (iVar1 == 0) {
        return 0;
      }
      RECORD_LAYER_clear(&s[4].ex_data.dummy);
      return 1;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0x260,"SSL_clear");
    uVar2 = 0xc0103;
  }
  ERR_set_error(0x14,uVar2,0);
  return 0;
}

