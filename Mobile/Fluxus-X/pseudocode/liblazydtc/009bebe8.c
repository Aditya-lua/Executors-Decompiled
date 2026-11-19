/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bebe8
 */

void SSL_CTX_flush_sessions(SSL_CTX *ctx,long tm)

{
  int *piVar1;
  uchar *puVar2;
  int iVar3;
  long lVar4;
  undefined8 uVar5;
  undefined1 *puVar6;
  undefined1 *puVar7;
  SSL_SESSION *ses;
  long *plVar8;
  
  iVar3 = CRYPTO_THREAD_write_lock(*(undefined8 *)(ctx[1].sid_ctx + 0x10));
  if (iVar3 == 0) {
    return;
  }
  lVar4 = OPENSSL_sk_new_null();
  uVar5 = OPENSSL_LH_get_down_load(ctx->session_cache_head);
  OPENSSL_LH_set_down_load(ctx->session_cache_head,0);
  plVar8 = &ctx->session_timeout;
  ses = (SSL_SESSION *)*plVar8;
  if (ses != (SSL_SESSION *)0x0) {
    piVar1 = &ctx->session_cache_mode;
    do {
      while( true ) {
        if ((tm != 0) &&
           ((*(int *)(ses[1].krb5_client_princ + 8) != 0 ||
            (tm <= *(long *)ses[1].krb5_client_princ)))) goto LAB_009bed1c;
        OPENSSL_LH_delete(ctx->session_cache_head,ses);
        puVar6 = *(undefined1 **)(ses[1].krb5_client_princ + 0x40);
        if ((puVar6 != (undefined1 *)0x0) &&
           (puVar7 = *(undefined1 **)(ses[1].krb5_client_princ + 0x38), puVar7 != (undefined1 *)0x0)
           ) {
          puVar2 = ses[1].krb5_client_princ + 0x38;
          if ((long *)puVar6 == plVar8) {
            if ((int *)puVar7 == piVar1) {
              *(undefined8 *)piVar1 = 0;
              ctx->session_timeout = 0;
            }
            else {
              *plVar8 = (long)puVar7;
              *(long **)(puVar7 + 0x328) = plVar8;
            }
          }
          else if ((int *)puVar7 == piVar1) {
            *(undefined1 **)piVar1 = puVar6;
            *(int **)(puVar6 + 800) = piVar1;
          }
          else {
            *(undefined1 **)(puVar6 + 800) = puVar7;
            *(undefined1 **)(*(long *)puVar2 + 0x328) = puVar6;
          }
          ses[1].krb5_client_princ[0xa8] = '\0';
          ses[1].krb5_client_princ[0xa9] = '\0';
          ses[1].krb5_client_princ[0xaa] = '\0';
          ses[1].krb5_client_princ[0xab] = '\0';
          ses[1].krb5_client_princ[0xac] = '\0';
          ses[1].krb5_client_princ[0xad] = '\0';
          ses[1].krb5_client_princ[0xae] = '\0';
          ses[1].krb5_client_princ[0xaf] = '\0';
          puVar2[0] = '\0';
          puVar2[1] = '\0';
          puVar2[2] = '\0';
          puVar2[3] = '\0';
          puVar2[4] = '\0';
          puVar2[5] = '\0';
          puVar2[6] = '\0';
          puVar2[7] = '\0';
          ses[1].krb5_client_princ[0x40] = '\0';
          ses[1].krb5_client_princ[0x41] = '\0';
          ses[1].krb5_client_princ[0x42] = '\0';
          ses[1].krb5_client_princ[0x43] = '\0';
          ses[1].krb5_client_princ[0x44] = '\0';
          ses[1].krb5_client_princ[0x45] = '\0';
          ses[1].krb5_client_princ[0x46] = '\0';
          ses[1].krb5_client_princ[0x47] = '\0';
        }
        ses[1].session_id[0x10] = '\x01';
        ses[1].session_id[0x11] = '\0';
        ses[1].session_id[0x12] = '\0';
        ses[1].session_id[0x13] = '\0';
        if (*(code **)&ctx->stats != (code *)0x0) {
          (**(code **)&ctx->stats)(ctx,ses);
        }
        if ((lVar4 == 0) || (iVar3 = OPENSSL_sk_push(lVar4,ses), iVar3 == 0)) break;
        ses = (SSL_SESSION *)*plVar8;
        if (ses == (SSL_SESSION *)0x0) goto LAB_009bed1c;
      }
      SSL_SESSION_free(ses);
      ses = (SSL_SESSION *)*plVar8;
    } while (ses != (SSL_SESSION *)0x0);
  }
LAB_009bed1c:
  OPENSSL_LH_set_down_load(ctx->session_cache_head,uVar5);
  CRYPTO_THREAD_unlock(*(undefined8 *)(ctx[1].sid_ctx + 0x10));
  OPENSSL_sk_pop_free(lVar4,SSL_SESSION_free);
  return;
}

