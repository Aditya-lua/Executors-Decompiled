/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b76c8
 */

SSL_CTX * SSL_set_SSL_CTX(SSL *ssl,SSL_CTX *ctx)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  dtls1_state_st *pdVar5;
  COMP_CTX *pCVar6;
  long lVar7;
  EVP_CIPHER_CTX *pEVar8;
  
  if (*(SSL_CTX **)&ssl[3].ex_data.dummy != ctx) {
    if (ctx == (SSL_CTX *)0x0) {
      ctx = *(SSL_CTX **)&ssl[4].mac_flags;
    }
    pdVar5 = (dtls1_state_st *)ssl_cert_dup(*(undefined8 *)ctx->sid_ctx);
    if (pdVar5 == (dtls1_state_st *)0x0) {
      return (SSL_CTX *)0x0;
    }
    iVar4 = custom_exts_copy_flags(pdVar5->rcvd_cookie + 0xd4,(ssl[3].d1)->rcvd_cookie + 0xd4);
    if (iVar4 == 0) {
      ssl_cert_free(pdVar5);
      return (SSL_CTX *)0x0;
    }
    ssl_cert_free(ssl[3].d1);
    pCVar6 = ssl[3].expand;
    ssl[3].d1 = pdVar5;
    if ((COMP_CTX *)0x20 < pCVar6) {
      return (SSL_CTX *)0x0;
    }
    lVar7 = *(long *)&ssl[3].ex_data.dummy;
    if ((lVar7 != 0) && (pCVar6 == *(COMP_CTX **)(lVar7 + 0x180))) {
      iVar4 = memcmp(&ssl[3].enc_write_ctx,(void *)(lVar7 + 0x188),(size_t)pCVar6);
      if (iVar4 == 0) {
        ssl[3].expand = (COMP_CTX *)ctx->generate_session_id;
        pCVar6 = (COMP_CTX *)ctx->client_cert_engine;
        ssl[3].cert = (cert_st *)ctx->tlsext_servername_callback;
        ssl[3].compress = pCVar6;
        pEVar8 = (EVP_CIPHER_CTX *)ctx->param;
        ssl[3].write_hash = *(EVP_MD_CTX **)&ctx->quiet_shutdown;
        ssl[3].enc_write_ctx = pEVar8;
      }
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
    SSL_CTX_free(*(SSL_CTX **)&ssl[3].ex_data.dummy);
    *(SSL_CTX **)&ssl[3].ex_data.dummy = ctx;
  }
  return ctx;
}

