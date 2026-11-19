/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b620c
 */

SSL_CTX * SSL_CTX_new_ex(SSL_METHOD *param_1,char *param_2,stack_st_SSL_CIPHER *param_3)

{
  int iVar1;
  uint uVar2;
  SSL_CTX *ptr;
  _func_3098 *p_Var3;
  long lVar4;
  ssl_session_st *psVar5;
  X509_STORE *pXVar6;
  undefined8 uVar7;
  X509_VERIFY_PARAM *pXVar8;
  stack_st_SSL_COMP *psVar9;
  char *pcVar10;
  _func_3094 *p_Var11;
  _func_3094 *p_Var12;
  cert_st *pcVar13;
  _func_3103 *p_Var14;
  undefined8 extraout_x1;
  ulong uVar15;
  lhash_st_SSL_SESSION *plVar16;
  undefined1 auVar17 [16];
  
  if (param_3 == (stack_st_SSL_CIPHER *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0xc9a,"SSL_CTX_new_ex");
    ERR_set_error(0x14,0xc4,0);
    return (SSL_CTX *)0x0;
  }
  iVar1 = OPENSSL_init_ssl(0x200000,0);
  if (iVar1 == 0) {
    return (SSL_CTX *)0x0;
  }
  iVar1 = SSL_get_ex_data_X509_STORE_CTX_idx();
  if (iVar1 < 0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0xca2,"SSL_CTX_new_ex");
    ERR_set_error(0x14,0x10d,0);
    ptr = (SSL_CTX *)0x0;
LAB_009b65ac:
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0xd61,"SSL_CTX_new_ex");
    uVar7 = 0xc0100;
  }
  else {
    ptr = (SSL_CTX *)CRYPTO_zalloc(0x650,"ssl/ssl_lib.c",0xca5);
    if (ptr == (SSL_CTX *)0x0) goto LAB_009b65ac;
    *(undefined4 *)((long)&ptr->app_verify_arg + 4) = 1;
    auVar17 = CRYPTO_THREAD_lock_new();
    *(long *)(ptr[1].sid_ctx + 0x10) = auVar17._0_8_;
    if (auVar17._0_8_ == 0) {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0xcad,"SSL_CTX_new_ex");
      ERR_set_error(0x14,0xc0100,0);
      CRYPTO_free(ptr);
      return (SSL_CTX *)0x0;
    }
    ptr->method = param_1;
    if (param_2 != (char *)0x0) {
      p_Var3 = (_func_3098 *)CRYPTO_strdup(param_2,"ssl/ssl_lib.c",0xcbc);
      auVar17._8_8_ = extraout_x1;
      auVar17._0_8_ = p_Var3;
      ptr[1].tlsext_ticket_key_cb = p_Var3;
      if (p_Var3 == (_func_3098 *)0x0) goto LAB_009b65ac;
    }
    ptr->cipher_list = param_3;
    *(undefined4 *)&ptr->msg_callback_arg = 0;
    *(undefined4 *)&ptr->new_session_cb = 2;
    ptr->msg_callback = (_func_3095 *)0x4;
    ptr->session_cache_tail = (ssl_session_st *)0x5000;
    uVar2 = (*param_3[5].stack.comp)(auVar17._0_8_,auVar17._8_8_);
    ptr->remove_session_cb = (_func_3088 *)(ulong)uVar2;
    ptr->verify_mode = 0x19000;
    ptr->sid_ctx_length = 0;
    *(undefined4 *)&ptr->default_verify_callback = 0;
    lVar4 = ssl_cert_new();
    *(long *)ptr->sid_ctx = lVar4;
    if (lVar4 == 0) goto LAB_009b65ac;
    psVar5 = (ssl_session_st *)OPENSSL_LH_new(&LAB_009b6674,&LAB_009b66c8);
    ptr->session_cache_head = psVar5;
    if (psVar5 == (ssl_session_st *)0x0) goto LAB_009b65ac;
    pXVar6 = X509_STORE_new();
    ptr->session_cache_size = (ulong)pXVar6;
    if (pXVar6 == (X509_STORE *)0x0) goto LAB_009b65ac;
    lVar4 = CTLOG_STORE_new_ex(param_1,param_2);
    *(long *)(ptr->tlsext_tick_hmac_key + 8) = lVar4;
    if (lVar4 == 0) goto LAB_009b65ac;
    iVar1 = ssl_load_ciphers(ptr);
    if (((iVar1 == 0) || (iVar1 = ssl_setup_sig_algs(ptr), iVar1 == 0)) ||
       (iVar1 = ssl_load_groups(ptr), iVar1 == 0)) goto LAB_009b65dc;
    uVar7 = OSSL_default_ciphersuites();
    iVar1 = SSL_CTX_set_ciphersuites(ptr,uVar7);
    if (iVar1 == 0) goto LAB_009b65ac;
    plVar16 = ptr->sessions;
    uVar7 = OSSL_default_cipher_list();
    lVar4 = ssl_create_cipher_list
                      (ptr,plVar16,&ptr->cipher_list_by_id,&ptr->cert_store,uVar7,
                       *(undefined8 *)ptr->sid_ctx);
    if ((lVar4 != 0) && (iVar1 = OPENSSL_sk_num(ptr->cipher_list_by_id), 0 < iVar1)) {
      pXVar8 = X509_VERIFY_PARAM_new();
      *(X509_VERIFY_PARAM **)(ptr->tlsext_tick_key_name + 8) = pXVar8;
      if (pXVar8 != (X509_VERIFY_PARAM *)0x0) {
        psVar9 = (stack_st_SSL_COMP *)tls_get_digest_from_engine(4);
        if (psVar9 == (stack_st_SSL_COMP *)0x0) {
          ERR_set_mark();
          pcVar10 = OBJ_nid2sn(4);
          psVar9 = (stack_st_SSL_COMP *)EVP_MD_fetch(param_1,pcVar10,param_2);
          ERR_pop_to_mark();
        }
        ptr->comp_methods = psVar9;
        p_Var11 = (_func_3094 *)tls_get_digest_from_engine(0x40);
        p_Var12 = p_Var11;
        if (p_Var11 == (_func_3094 *)0x0) {
          ERR_set_mark();
          pcVar10 = OBJ_nid2sn(0x40);
          p_Var12 = (_func_3094 *)EVP_MD_fetch(param_1,pcVar10,param_2);
          uVar2 = ERR_pop_to_mark();
          p_Var11 = (_func_3094 *)(ulong)uVar2;
        }
        ptr->info_callback = p_Var12;
        lVar4 = OPENSSL_sk_new_null(p_Var11);
        ptr->max_cert_list = lVar4;
        if (lVar4 != 0) {
          pcVar13 = (cert_st *)OPENSSL_sk_new_null();
          ptr->cert = pcVar13;
          if ((pcVar13 != (cert_st *)0x0) &&
             (iVar1 = CRYPTO_new_ex_data(1,ptr,(CRYPTO_EX_DATA *)&ptr->sha1), iVar1 != 0)) {
            p_Var14 = (_func_3103 *)CRYPTO_secure_zalloc(0x40,"ssl/ssl_lib.c",0xd05);
            ptr->next_protos_advertised_cb = p_Var14;
            if (p_Var14 != (_func_3103 *)0x0) {
              if ((*(byte *)(*(long *)&param_3[6].stack + 0x60) >> 3 & 1) == 0) {
                psVar9 = SSL_COMP_get_compression_methods();
                ptr->options = (ulong)psVar9;
              }
              ptr->tlsext_status_cb = (_func_3099 *)0x4000;
              ptr->tlsext_ticket_key_cb = (_func_3098 *)0x4000;
              iVar1 = RAND_bytes_ex(param_1,&ptr->wbuf_freelist,0x10,0);
              if (((iVar1 < 1) ||
                  (iVar1 = RAND_priv_bytes_ex(param_1,ptr->next_protos_advertised_cb,0x20,0),
                  iVar1 < 1)) ||
                 (iVar1 = RAND_priv_bytes_ex(param_1,ptr->next_protos_advertised_cb + 0x20,0x20,0),
                 iVar1 < 1)) {
                *(ulong *)&ptr->read_ahead = *(ulong *)&ptr->read_ahead | 0x4000;
              }
              iVar1 = RAND_priv_bytes_ex(param_1,&ptr[1].stats.sess_accept_renegotiate,0x20,0);
              if ((0 < iVar1) && (iVar1 = ssl_ctx_srp_ctx_init_intern(ptr), iVar1 != 0)) {
                uVar15 = *(ulong *)&ptr->read_ahead;
                *(undefined4 *)&ptr[1].method = 0xffffffff;
                *(ulong *)&ptr->read_ahead = uVar15 | 0x120000;
                ptr[1].default_verify_callback = (_func_3096 *)0x400000000000;
                ptr[1].tlsext_tick_key_name[0] = '\x02';
                ptr[1].tlsext_tick_key_name[1] = '\0';
                ptr[1].tlsext_tick_key_name[2] = '\0';
                ptr[1].tlsext_tick_key_name[3] = '\0';
                ptr[1].tlsext_tick_key_name[4] = '\0';
                ptr[1].tlsext_tick_key_name[5] = '\0';
                ptr[1].tlsext_tick_key_name[6] = '\0';
                ptr[1].tlsext_tick_key_name[7] = '\0';
                ssl_ctx_system_config(ptr);
                return ptr;
              }
            }
          }
        }
      }
      goto LAB_009b65ac;
    }
    ERR_new();
    ERR_set_debug("ssl/ssl_lib.c",0xced,"SSL_CTX_new_ex");
    uVar7 = 0xa1;
  }
  ERR_set_error(0x14,uVar7,0);
LAB_009b65dc:
  SSL_CTX_free(ptr);
  return (SSL_CTX *)0x0;
}

