/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bddb8
 */

/* WARNING: Type propagation algorithm not settling */

int SSL_CTX_add_session(SSL_CTX *s,SSL_SESSION *c)

{
  uchar *puVar1;
  long *plVar2;
  int *piVar3;
  _func_3090 **pp_Var4;
  byte bVar5;
  char cVar6;
  bool bVar7;
  int iVar8;
  SSL_SESSION *ses;
  time_t tVar9;
  long lVar10;
  uint uVar11;
  long lVar12;
  undefined1 *puVar13;
  undefined1 *puVar14;
  SSL_SESSION *ses_00;
  
  puVar1 = c[1].sid_ctx + 0xc;
  do {
    cVar6 = '\x01';
    bVar7 = (bool)ExclusiveMonitorPass(puVar1,0x10);
    if (bVar7) {
      *(int *)puVar1 = *(int *)puVar1 + 1;
      cVar6 = ExclusiveMonitorsStatus();
    }
  } while (cVar6 != '\0');
  iVar8 = CRYPTO_THREAD_write_lock(*(undefined8 *)(s[1].sid_ctx + 0x10));
  if (iVar8 == 0) {
    SSL_SESSION_free(c);
    return 0;
  }
  ses = (SSL_SESSION *)OPENSSL_LH_insert(s->session_cache_head,c);
  if ((ses == (SSL_SESSION *)0x0) || (ses == c)) {
    if (ses == (SSL_SESSION *)0x0) {
      lVar12 = OPENSSL_LH_retrieve(s->session_cache_head,c);
      ses_00 = c;
      if (lVar12 != 0) {
        ses_00 = ses;
      }
      bVar5 = *(byte *)((long)&s->new_session_cb + 1);
    }
    else {
      bVar5 = *(byte *)((long)&s->new_session_cb + 1);
      ses_00 = ses;
    }
  }
  else {
    puVar13 = *(undefined1 **)(ses[1].krb5_client_princ + 0x40);
    if ((puVar13 != (undefined1 *)0x0) &&
       (puVar14 = *(undefined1 **)(ses[1].krb5_client_princ + 0x38), puVar14 != (undefined1 *)0x0))
    {
      plVar2 = &s->session_timeout;
      puVar1 = ses[1].krb5_client_princ + 0x38;
      piVar3 = &s->session_cache_mode;
      if ((long *)puVar13 == plVar2) {
        if ((int *)puVar14 == piVar3) {
          *(undefined8 *)piVar3 = 0;
          s->session_timeout = 0;
        }
        else {
          *plVar2 = (long)puVar14;
          *(long **)(puVar14 + 0x328) = plVar2;
        }
      }
      else if ((int *)puVar14 == piVar3) {
        *(undefined1 **)piVar3 = puVar13;
        *(int **)(puVar13 + 800) = piVar3;
      }
      else {
        *(undefined1 **)(puVar13 + 800) = puVar14;
        *(undefined1 **)(*(long *)puVar1 + 0x328) = puVar13;
      }
      ses[1].krb5_client_princ[0xa8] = '\0';
      ses[1].krb5_client_princ[0xa9] = '\0';
      ses[1].krb5_client_princ[0xaa] = '\0';
      ses[1].krb5_client_princ[0xab] = '\0';
      ses[1].krb5_client_princ[0xac] = '\0';
      ses[1].krb5_client_princ[0xad] = '\0';
      ses[1].krb5_client_princ[0xae] = '\0';
      ses[1].krb5_client_princ[0xaf] = '\0';
      puVar1[0] = '\0';
      puVar1[1] = '\0';
      puVar1[2] = '\0';
      puVar1[3] = '\0';
      puVar1[4] = '\0';
      puVar1[5] = '\0';
      puVar1[6] = '\0';
      puVar1[7] = '\0';
      ses[1].krb5_client_princ[0x40] = '\0';
      ses[1].krb5_client_princ[0x41] = '\0';
      ses[1].krb5_client_princ[0x42] = '\0';
      ses[1].krb5_client_princ[0x43] = '\0';
      ses[1].krb5_client_princ[0x44] = '\0';
      ses[1].krb5_client_princ[0x45] = '\0';
      ses[1].krb5_client_princ[0x46] = '\0';
      ses[1].krb5_client_princ[0x47] = '\0';
    }
    SSL_SESSION_free(ses);
    ses_00 = (SSL_SESSION *)0x0;
    bVar5 = *(byte *)((long)&s->new_session_cb + 1);
  }
  if ((bVar5 >> 2 & 1) != 0) {
    tVar9 = time((time_t *)0x0);
    lVar12 = *(long *)(c[1].sid_ctx + 0x14);
    *(time_t *)(c[1].sid_ctx + 0x1c) = tVar9;
    if (lVar12 < 0) {
      lVar12 = 0;
      c[1].sid_ctx[0x14] = '\0';
      c[1].sid_ctx[0x15] = '\0';
      c[1].sid_ctx[0x16] = '\0';
      c[1].sid_ctx[0x17] = '\0';
      c[1].sid_ctx[0x18] = '\0';
      c[1].sid_ctx[0x19] = '\0';
      c[1].sid_ctx[0x1a] = '\0';
      c[1].sid_ctx[0x1b] = '\0';
    }
    uVar11 = (uint)((ulong)lVar12 >> 0x3f);
    if (tVar9 < 1) {
      uVar11 = 0;
    }
    *(long *)c[1].krb5_client_princ = lVar12 + tVar9;
    *(uint *)(c[1].krb5_client_princ + 8) = uVar11;
  }
  if (ses_00 == (SSL_SESSION *)0x0) {
    lVar12 = SSL_CTX_ctrl(s,0x2b,0,(void *)0x0);
    if (0 < lVar12) {
      lVar12 = SSL_CTX_ctrl(s,0x14,0,(void *)0x0);
      lVar10 = SSL_CTX_ctrl(s,0x2b,0,(void *)0x0);
      if (lVar10 <= lVar12) {
        pp_Var4 = &s->app_verify_callback;
        do {
          iVar8 = FUN_009be2fc(s,s->session_timeout,0);
          if (iVar8 == 0) break;
          do {
            cVar6 = '\x01';
            bVar7 = (bool)ExclusiveMonitorPass(pp_Var4,0x10);
            if (bVar7) {
              *(int *)pp_Var4 = *(int *)pp_Var4 + 1;
              cVar6 = ExclusiveMonitorsStatus();
            }
          } while (cVar6 != '\0');
          lVar12 = SSL_CTX_ctrl(s,0x14,0,(void *)0x0);
          lVar10 = SSL_CTX_ctrl(s,0x2b,0,(void *)0x0);
        } while (lVar10 <= lVar12);
      }
    }
    FUN_009be424(s,c);
    iVar8 = 1;
  }
  else {
    FUN_009be424(s,c);
    SSL_SESSION_free(ses_00);
    iVar8 = 0;
  }
  CRYPTO_THREAD_unlock(*(undefined8 *)(s[1].sid_ctx + 0x10));
  return iVar8;
}

