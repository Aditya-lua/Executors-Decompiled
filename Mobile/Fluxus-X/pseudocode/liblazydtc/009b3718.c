/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b3718
 */

void SSL_CTX_free(SSL_CTX *param_1)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  long lVar8;
  void *ptr;
  ssl_session_st *psVar9;
  stack_st_SSL_COMP *psVar10;
  _func_3094 *p_Var11;
  long lVar12;
  ulong uVar13;
  
  if (param_1 == (SSL_CTX *)0x0) {
    return;
  }
  piVar1 = (int *)((long)&param_1->app_verify_arg + 4);
  do {
    iVar2 = *piVar1;
    iVar5 = iVar2 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
    if (bVar4) {
      *piVar1 = iVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < iVar2) {
    return;
  }
  X509_VERIFY_PARAM_free(*(X509_VERIFY_PARAM **)(param_1->tlsext_tick_key_name + 8));
  CRYPTO_free(*(void **)&param_1[1].read_ahead);
  *(undefined8 *)&param_1[1].read_ahead = 0;
  CRYPTO_free(param_1[1].msg_callback);
  psVar9 = param_1->session_cache_head;
  param_1[1].msg_callback = (_func_3095 *)0x0;
  *(undefined1 *)&param_1[1].msg_callback_arg = 0;
  if (psVar9 != (ssl_session_st *)0x0) {
    SSL_CTX_flush_sessions(param_1,0);
  }
  CRYPTO_free_ex_data(1,param_1,(CRYPTO_EX_DATA *)&param_1->sha1);
  OPENSSL_LH_free(param_1->session_cache_head);
  X509_STORE_free((X509_STORE *)param_1->session_cache_size);
  CTLOG_STORE_free(*(undefined8 *)(param_1->tlsext_tick_hmac_key + 8));
  OPENSSL_sk_free(param_1->cipher_list_by_id);
  OPENSSL_sk_free(param_1->cert_store);
  OPENSSL_sk_free(param_1->sessions);
  ssl_cert_free(*(undefined8 *)param_1->sid_ctx);
  OPENSSL_sk_pop_free(param_1->max_cert_list,X509_NAME_free);
  OPENSSL_sk_pop_free(param_1->cert,X509_NAME_free);
  OPENSSL_sk_pop_free(param_1->client_CA,X509_free);
  uVar6 = *(undefined8 *)param_1[1].sid_ctx;
  param_1->options = 0;
  OPENSSL_sk_free(uVar6);
  ssl_ctx_srp_ctx_free_intern(param_1);
  tls_engine_finish(param_1->tlsext_opaque_prf_input_callback_arg);
  CRYPTO_free(param_1[1].cipher_list_by_id);
  CRYPTO_free(param_1[1].sessions);
  CRYPTO_free((void *)param_1[1].session_cache_size);
  CRYPTO_free((void *)param_1[1].session_timeout);
  CRYPTO_secure_free(param_1->next_protos_advertised_cb,"ssl/ssl_lib.c",0xdb1);
  psVar10 = param_1->comp_methods;
  if ((psVar10 != (stack_st_SSL_COMP *)0x0) && (lVar7 = EVP_MD_get0_provider(psVar10), lVar7 != 0))
  {
    EVP_MD_free(psVar10);
  }
  p_Var11 = param_1->info_callback;
  if ((p_Var11 != (_func_3094 *)0x0) && (lVar7 = EVP_MD_get0_provider(p_Var11), lVar7 != 0)) {
    EVP_MD_free(p_Var11);
  }
  lVar7 = 0;
  do {
    lVar12 = *(long *)(param_1[1].tlsext_tick_aes_key + lVar7 + 0x50);
    if ((lVar12 != 0) && (lVar8 = EVP_CIPHER_get0_provider(lVar12), lVar8 != 0)) {
      EVP_CIPHER_free(lVar12);
    }
    lVar7 = lVar7 + 8;
  } while (lVar7 != 0xc0);
  lVar7 = 0;
  do {
    lVar12 = *(long *)(param_1[2].sid_ctx + lVar7 + -0xd8);
    if ((lVar12 != 0) && (lVar8 = EVP_MD_get0_provider(lVar12), lVar8 != 0)) {
      EVP_MD_free(lVar12);
    }
    lVar7 = lVar7 + 8;
  } while (lVar7 != 0x70);
  ptr = *(void **)(param_1[2].sid_ctx + 0x10);
  if (*(long *)(param_1[2].sid_ctx + 0x18) != 0) {
    lVar7 = 0;
    uVar13 = 0;
    do {
      CRYPTO_free(*(void **)((long)ptr + lVar7));
      CRYPTO_free(*(void **)(*(long *)(param_1[2].sid_ctx + 0x10) + lVar7 + 8));
      CRYPTO_free(*(void **)(*(long *)(param_1[2].sid_ctx + 0x10) + lVar7 + 0x10));
      ptr = *(void **)(param_1[2].sid_ctx + 0x10);
      uVar13 = uVar13 + 1;
      lVar7 = lVar7 + 0x38;
    } while (uVar13 < *(ulong *)(param_1[2].sid_ctx + 0x18));
  }
  CRYPTO_free(ptr);
  CRYPTO_free(*(void **)(param_1[2].sid_ctx + 8));
  CRYPTO_THREAD_lock_free(*(undefined8 *)(param_1[1].sid_ctx + 0x10));
  CRYPTO_free(param_1[1].tlsext_ticket_key_cb);
  CRYPTO_free(param_1);
  return;
}

