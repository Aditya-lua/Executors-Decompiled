/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b21d8
 */

void SSL_free(SSL *ssl)

{
  uint *puVar1;
  uint uVar2;
  char cVar3;
  bool bVar4;
  uint uVar5;
  BIO *pBVar6;
  _func_3150 *ptr;
  undefined8 uVar7;
  undefined8 uVar8;
  long lVar9;
  
  if (ssl == (SSL *)0x0) {
    return;
  }
  puVar1 = &ssl[3].max_send_fragment;
  do {
    uVar2 = *puVar1;
    uVar5 = uVar2 - 1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(puVar1,0x10);
    if (bVar4) {
      *puVar1 = uVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (uVar5 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < (int)uVar2) {
    return;
  }
  X509_VERIFY_PARAM_free((X509_VERIFY_PARAM *)ssl[1].tlsext_ecpointformatlist);
  OPENSSL_sk_pop_free(ssl[1].tlsext_ellipticcurvelist,FUN_009b98fc);
  ssl[1].tlsext_ellipticcurvelist = (uchar *)0x0;
  OPENSSL_sk_pop_free(ssl[1].tlsext_opaque_prf_input,X509_free);
  ssl[1].tlsext_opaque_prf_input = (void *)0x0;
  X509_free((X509 *)ssl[1].tlsext_session_ticket);
  ssl[1].tlsext_session_ticket = (TLS_SESSION_TICKET_EXT *)0x0;
  ssl[1].tlsext_opaque_prf_input_len = 0;
  *(undefined8 *)((long)&ssl[1].tls_session_ticket_ext_cb + 4) = 0xffffffffffffffff;
  CRYPTO_free_ex_data(0,ssl,(CRYPTO_EX_DATA *)&ssl[3].options);
  RECORD_LAYER_release(&ssl[4].ex_data.dummy);
  if (ssl->bbio != (BIO *)0x0) {
    pBVar6 = BIO_pop(ssl->wbio);
    ssl->wbio = pBVar6;
    BIO_free(ssl->bbio);
    ssl->bbio = (BIO *)0x0;
  }
  BIO_free_all(ssl->wbio);
  ssl->wbio = (BIO *)0x0;
  BIO_free_all(ssl->rbio);
  ssl->rbio = (BIO *)0x0;
  BUF_MEM_free((BUF_MEM *)ssl->d1);
  OPENSSL_sk_free(ssl[1].initial_ctx);
  OPENSSL_sk_free(ssl[1].next_proto_negotiated);
  OPENSSL_sk_free(*(undefined8 *)&ssl[1].next_proto_negotiated_len);
  OPENSSL_sk_free(ssl[1].tls_session_secret_cb_arg);
  lVar9._0_4_ = ssl[3].sid_ctx_length;
  lVar9._4_1_ = ssl[3].sid_ctx[0];
  lVar9._5_1_ = ssl[3].sid_ctx[1];
  lVar9._6_1_ = ssl[3].sid_ctx[2];
  lVar9._7_1_ = ssl[3].sid_ctx[3];
  if (lVar9 != 0) {
    ssl_clear_bad_session(ssl);
    SSL_SESSION_free(*(SSL_SESSION **)&ssl[3].sid_ctx_length);
  }
  SSL_SESSION_free(*(SSL_SESSION **)(ssl[3].sid_ctx + 4));
  CRYPTO_free(*(void **)(ssl[3].sid_ctx + 0xc));
  ssl_cert_free(ssl[3].d1);
  CRYPTO_free(ssl[0xb].wbio);
  CRYPTO_free((void *)ssl[3].tlsext_opaque_prf_input_len);
  SSL_CTX_free(*(SSL_CTX **)&ssl[4].mac_flags);
  CRYPTO_free(ssl[3].srtp_profile);
  CRYPTO_free(*(void **)&ssl[3].tlsext_hb_seq);
  CRYPTO_free(ssl[4].method);
  CRYPTO_free(ssl[4].wbio);
  OPENSSL_sk_pop_free(ssl[3].tls_session_secret_cb_arg,X509_EXTENSION_free);
  OPENSSL_sk_pop_free(ssl[3].tls_session_secret_cb,OCSP_RESPID_free);
  SCT_LIST_free(ssl[4].cipher_list);
  CRYPTO_free(ssl[3].tls_session_ticket_ext_cb);
  CRYPTO_free(ssl[3].initial_ctx);
  CRYPTO_free(*(void **)&ssl[4].state);
  CRYPTO_free(ssl[4].s2);
  ptr = (_func_3150 *)0x0;
  if (ssl[4].msg_callback != (_func_3150 *)0x0) {
    CRYPTO_free(*(void **)(ssl[4].msg_callback + 0x288));
    ptr = ssl[4].msg_callback;
  }
  CRYPTO_free(ptr);
  CRYPTO_free(ssl[4].write_hash);
  uVar7._0_4_ = ssl[4].sid_ctx_length;
  uVar7._4_1_ = ssl[4].sid_ctx[0];
  uVar7._5_1_ = ssl[4].sid_ctx[1];
  uVar7._6_1_ = ssl[4].sid_ctx[2];
  uVar7._7_1_ = ssl[4].sid_ctx[3];
  EVP_MD_CTX_free(uVar7);
  OPENSSL_sk_pop_free(ssl[3].max_cert_list,X509_NAME_free);
  uVar8._0_4_ = ssl[3].first_packet;
  uVar8._4_4_ = ssl[3].client_version;
  OPENSSL_sk_pop_free(uVar8,X509_NAME_free);
  OPENSSL_sk_pop_free(ssl[3].client_CA,X509_free);
  if (ssl->method != (SSL_METHOD *)0x0) {
    (*ssl->method->ssl_accept)(ssl);
  }
  FUN_009b1b60(ssl);
  SSL_CTX_free(*(SSL_CTX **)&ssl[3].ex_data.dummy);
  ASYNC_WAIT_CTX_free(ssl[10].tlsext_session_ticket);
  CRYPTO_free(ssl[4].init_msg);
  OPENSSL_sk_free(ssl[4].enc_read_ctx);
  CRYPTO_THREAD_lock_free(*(undefined8 *)&ssl[10].next_proto_negotiated_len);
  CRYPTO_free(ssl);
  return;
}

