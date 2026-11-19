/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd9a0
 */

undefined8 ssl_get_new_session(SSL *param_1,int param_2)

{
  long lVar1;
  int iVar2;
  SSL_SESSION *ses;
  long lVar3;
  long lVar4;
  
  ses = SSL_SESSION_new();
  if (ses == (SSL_SESSION *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/ssl_sess.c",0x1c3,"ssl_get_new_session");
    ossl_statem_fatal(param_1,0x50,0xc0100,0);
    return 0;
  }
  lVar3 = *(long *)(*(long *)&param_1[4].mac_flags + 0x58);
  if (lVar3 == 0) {
    lVar3 = SSL_get_default_timeout(param_1);
  }
  lVar4 = *(long *)(ses[1].sid_ctx + 0x1c);
  lVar1 = 0;
  if (-1 < lVar3) {
    lVar1 = lVar3;
  }
  *(long *)(ses[1].sid_ctx + 0x14) = lVar1;
  *(long *)ses[1].krb5_client_princ = lVar4 + lVar1;
  ses[1].krb5_client_princ[8] = '\0';
  ses[1].krb5_client_princ[9] = '\0';
  ses[1].krb5_client_princ[10] = '\0';
  ses[1].krb5_client_princ[0xb] = '\0';
  SSL_SESSION_free(*(SSL_SESSION **)&param_1[3].sid_ctx_length);
  param_1[3].sid_ctx_length = 0;
  param_1[3].sid_ctx[0] = '\0';
  param_1[3].sid_ctx[1] = '\0';
  param_1[3].sid_ctx[2] = '\0';
  param_1[3].sid_ctx[3] = '\0';
  if ((param_2 == 0) ||
     (((((byte)param_1->method->get_timeout[0x60] >> 3 & 1) == 0 &&
       (iVar2 = param_1->method->version, 0x303 < iVar2)) && (iVar2 != 0x10000)))) {
    ses->tlsext_tick_lifetime_hint = 0;
  }
  else {
    iVar2 = ssl_generate_session_id(param_1,ses);
    if (iVar2 == 0) goto LAB_009bdac0;
  }
  if (param_1[3].expand < (COMP_CTX *)0x21) {
    memcpy(ses[1].master_key + 0x14,&param_1[3].enc_write_ctx,(size_t)param_1[3].expand);
    *(COMP_CTX **)(ses[1].master_key + 0xc) = param_1[3].expand;
    iVar2 = param_1->version;
    *(SSL_SESSION **)&param_1[3].sid_ctx_length = ses;
    ses[1].sid_ctx[4] = '\0';
    ses[1].sid_ctx[5] = '\0';
    ses[1].sid_ctx[6] = '\0';
    ses[1].sid_ctx[7] = '\0';
    ses[1].sid_ctx[8] = '\0';
    ses[1].sid_ctx[9] = '\0';
    ses[1].sid_ctx[10] = '\0';
    ses[1].sid_ctx[0xb] = '\0';
    ses->ssl_version = iVar2;
    if ((*(byte *)((long)&param_1->hit + 1) >> 1 & 1) != 0) {
      *(uint *)(ses[1].krb5_client_princ + 0xa0) = *(uint *)(ses[1].krb5_client_princ + 0xa0) | 1;
    }
    return 1;
  }
  ERR_new();
  ERR_set_debug("ssl/ssl_sess.c",0x1e3,"ssl_get_new_session");
  ossl_statem_fatal(param_1,0x50,0xc0103,0);
LAB_009bdac0:
  SSL_SESSION_free(ses);
  return 0;
}

