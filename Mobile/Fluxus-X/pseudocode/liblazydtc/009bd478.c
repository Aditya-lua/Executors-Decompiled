/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd478
 */

SSL_SESSION * FUN_009bd478(void *param_1,int param_2)

{
  uchar *puVar1;
  int iVar2;
  SSL_SESSION *ses;
  long lVar3;
  char *pcVar4;
  
  ses = CRYPTO_malloc(0x3a0,"ssl/ssl_sess.c",0xa3);
  if (ses != (SSL_SESSION *)0x0) {
    memcpy(ses,param_1,0x3a0);
    puVar1 = ses[1].session_id + 0x18;
    ses[1].krb5_client_princ[0x70] = '\0';
    ses[1].krb5_client_princ[0x71] = '\0';
    ses[1].krb5_client_princ[0x72] = '\0';
    ses[1].krb5_client_princ[0x73] = '\0';
    ses[1].krb5_client_princ[0x74] = '\0';
    ses[1].krb5_client_princ[0x75] = '\0';
    ses[1].krb5_client_princ[0x76] = '\0';
    ses[1].krb5_client_princ[0x77] = '\0';
    ses[1].krb5_client_princ[0xa8] = '\0';
    ses[1].krb5_client_princ[0xa9] = '\0';
    ses[1].krb5_client_princ[0xaa] = '\0';
    ses[1].krb5_client_princ[0xab] = '\0';
    ses[1].krb5_client_princ[0xac] = '\0';
    ses[1].krb5_client_princ[0xad] = '\0';
    ses[1].krb5_client_princ[0xae] = '\0';
    ses[1].krb5_client_princ[0xaf] = '\0';
    ses[1].session_id[8] = '\0';
    ses[1].session_id[9] = '\0';
    ses[1].session_id[10] = '\0';
    ses[1].session_id[0xb] = '\0';
    ses[1].session_id[0xc] = '\0';
    ses[1].session_id[0xd] = '\0';
    ses[1].session_id[0xe] = '\0';
    ses[1].session_id[0xf] = '\0';
    ses[1].session_id[0] = '\0';
    ses[1].session_id[1] = '\0';
    ses[1].session_id[2] = '\0';
    ses[1].session_id[3] = '\0';
    ses[1].session_id[4] = '\0';
    ses[1].session_id[5] = '\0';
    ses[1].session_id[6] = '\0';
    ses[1].session_id[7] = '\0';
    ses[1].sid_ctx_length = 0;
    ses[1].sid_ctx[0] = '\0';
    ses[1].sid_ctx[1] = '\0';
    ses[1].sid_ctx[2] = '\0';
    ses[1].sid_ctx[3] = '\0';
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
    ses[1].krb5_client_princ[0x38] = '\0';
    ses[1].krb5_client_princ[0x39] = '\0';
    ses[1].krb5_client_princ[0x3a] = '\0';
    ses[1].krb5_client_princ[0x3b] = '\0';
    ses[1].krb5_client_princ[0x3c] = '\0';
    ses[1].krb5_client_princ[0x3d] = '\0';
    ses[1].krb5_client_princ[0x3e] = '\0';
    ses[1].krb5_client_princ[0x3f] = '\0';
    ses[1].krb5_client_princ[0x50] = '\0';
    ses[1].krb5_client_princ[0x51] = '\0';
    ses[1].krb5_client_princ[0x52] = '\0';
    ses[1].krb5_client_princ[0x53] = '\0';
    ses[1].krb5_client_princ[0x54] = '\0';
    ses[1].krb5_client_princ[0x55] = '\0';
    ses[1].krb5_client_princ[0x56] = '\0';
    ses[1].krb5_client_princ[0x57] = '\0';
    ses[1].krb5_client_princ[0x48] = '\0';
    ses[1].krb5_client_princ[0x49] = '\0';
    ses[1].krb5_client_princ[0x4a] = '\0';
    ses[1].krb5_client_princ[0x4b] = '\0';
    ses[1].krb5_client_princ[0x4c] = '\0';
    ses[1].krb5_client_princ[0x4d] = '\0';
    ses[1].krb5_client_princ[0x4e] = '\0';
    ses[1].krb5_client_princ[0x4f] = '\0';
    ses[1].krb5_client_princ[0x30] = '\0';
    ses[1].krb5_client_princ[0x31] = '\0';
    ses[1].krb5_client_princ[0x32] = '\0';
    ses[1].krb5_client_princ[0x33] = '\0';
    ses[1].krb5_client_princ[0x34] = '\0';
    ses[1].krb5_client_princ[0x35] = '\0';
    ses[1].krb5_client_princ[0x36] = '\0';
    ses[1].krb5_client_princ[0x37] = '\0';
    ses[1].krb5_client_princ[0x28] = '\0';
    ses[1].krb5_client_princ[0x29] = '\0';
    ses[1].krb5_client_princ[0x2a] = '\0';
    ses[1].krb5_client_princ[0x2b] = '\0';
    ses[1].krb5_client_princ[0x2c] = '\0';
    ses[1].krb5_client_princ[0x2d] = '\0';
    ses[1].krb5_client_princ[0x2e] = '\0';
    ses[1].krb5_client_princ[0x2f] = '\0';
    ses[1].krb5_client_princ[0x90] = '\0';
    ses[1].krb5_client_princ[0x91] = '\0';
    ses[1].krb5_client_princ[0x92] = '\0';
    ses[1].krb5_client_princ[0x93] = '\0';
    ses[1].krb5_client_princ[0x94] = '\0';
    ses[1].krb5_client_princ[0x95] = '\0';
    ses[1].krb5_client_princ[0x96] = '\0';
    ses[1].krb5_client_princ[0x97] = '\0';
    ses[1].krb5_client_princ[0x88] = '\0';
    ses[1].krb5_client_princ[0x89] = '\0';
    ses[1].krb5_client_princ[0x8a] = '\0';
    ses[1].krb5_client_princ[0x8b] = '\0';
    ses[1].krb5_client_princ[0x8c] = '\0';
    ses[1].krb5_client_princ[0x8d] = '\0';
    ses[1].krb5_client_princ[0x8e] = '\0';
    ses[1].krb5_client_princ[0x8f] = '\0';
    ses[1].sid_ctx[0xc] = '\x01';
    ses[1].sid_ctx[0xd] = '\0';
    ses[1].sid_ctx[0xe] = '\0';
    ses[1].sid_ctx[0xf] = '\0';
    lVar3 = CRYPTO_THREAD_lock_new();
    *(long *)(ses[1].krb5_client_princ + 0xb0) = lVar3;
    if (lVar3 == 0) {
      CRYPTO_free(ses);
      ses = (SSL_SESSION *)0x0;
    }
    else {
      iVar2 = CRYPTO_new_ex_data(2,ses,(CRYPTO_EX_DATA *)(ses[1].krb5_client_princ + 0x28));
      if (iVar2 != 0) {
        if (*(long *)((long)param_1 + 0x2b8) != 0) {
          iVar2 = X509_up_ref();
          if (iVar2 == 0) goto LAB_009bd5f8;
          *(undefined8 *)puVar1 = *(undefined8 *)((long)param_1 + 0x2b8);
        }
        if (*(long *)((long)param_1 + 0x2c0) != 0) {
          lVar3 = X509_chain_up_ref();
          ses[1].sid_ctx_length = (int)lVar3;
          ses[1].sid_ctx[0] = (char)((ulong)lVar3 >> 0x20);
          ses[1].sid_ctx[1] = (char)((ulong)lVar3 >> 0x28);
          ses[1].sid_ctx[2] = (char)((ulong)lVar3 >> 0x30);
          ses[1].sid_ctx[3] = (char)((ulong)lVar3 >> 0x38);
          if (lVar3 == 0) goto LAB_009bd5f8;
        }
        if (*(char **)((long)param_1 + 0x2a0) != (char *)0x0) {
          pcVar4 = CRYPTO_strdup(*(char **)((long)param_1 + 0x2a0),"ssl/ssl_sess.c",0xda);
          *(char **)ses[1].session_id = pcVar4;
          if (pcVar4 == (char *)0x0) goto LAB_009bd5f8;
        }
        if (*(char **)((long)param_1 + 0x2a8) != (char *)0x0) {
          pcVar4 = CRYPTO_strdup(*(char **)((long)param_1 + 0x2a8),"ssl/ssl_sess.c",0xe0);
          *(char **)(ses[1].session_id + 8) = pcVar4;
          if (pcVar4 == (char *)0x0) goto LAB_009bd5f8;
        }
        iVar2 = CRYPTO_dup_ex_data(2,(CRYPTO_EX_DATA *)(ses[1].krb5_client_princ + 0x28),
                                   (CRYPTO_EX_DATA *)((long)param_1 + 0x310));
        if (iVar2 != 0) {
          if (*(char **)((long)param_1 + 0x330) != (char *)0x0) {
            pcVar4 = CRYPTO_strdup(*(char **)((long)param_1 + 0x330),"ssl/ssl_sess.c",0xed);
            *(char **)(ses[1].krb5_client_princ + 0x48) = pcVar4;
            if (pcVar4 == (char *)0x0) goto LAB_009bd5f8;
          }
          if ((param_2 == 0) || (*(long *)((long)param_1 + 0x338) == 0)) {
            ses[1].krb5_client_princ[0x60] = '\0';
            ses[1].krb5_client_princ[0x61] = '\0';
            ses[1].krb5_client_princ[0x62] = '\0';
            ses[1].krb5_client_princ[99] = '\0';
            ses[1].krb5_client_princ[100] = '\0';
            ses[1].krb5_client_princ[0x65] = '\0';
            ses[1].krb5_client_princ[0x66] = '\0';
            ses[1].krb5_client_princ[0x67] = '\0';
            ses[1].krb5_client_princ[0x58] = '\0';
            ses[1].krb5_client_princ[0x59] = '\0';
            ses[1].krb5_client_princ[0x5a] = '\0';
            ses[1].krb5_client_princ[0x5b] = '\0';
            ses[1].krb5_client_princ[0x5c] = '\0';
            ses[1].krb5_client_princ[0x5d] = '\0';
            ses[1].krb5_client_princ[0x5e] = '\0';
            ses[1].krb5_client_princ[0x5f] = '\0';
          }
          else {
            lVar3 = CRYPTO_memdup(*(long *)((long)param_1 + 0x338),
                                  *(undefined8 *)((long)param_1 + 0x340),"ssl/ssl_sess.c",0xf5);
            *(long *)(ses[1].krb5_client_princ + 0x50) = lVar3;
            if (lVar3 == 0) goto LAB_009bd5f8;
          }
          if (*(long *)((long)param_1 + 0x358) != 0) {
            lVar3 = CRYPTO_memdup(*(long *)((long)param_1 + 0x358),
                                  *(undefined8 *)((long)param_1 + 0x360),"ssl/ssl_sess.c",0xff);
            *(long *)(ses[1].krb5_client_princ + 0x70) = lVar3;
            if (lVar3 == 0) goto LAB_009bd5f8;
          }
          if (*(char **)((long)param_1 + 0x370) != (char *)0x0) {
            pcVar4 = CRYPTO_strdup(*(char **)((long)param_1 + 0x370),"ssl/ssl_sess.c",0x106);
            *(char **)(ses[1].krb5_client_princ + 0x88) = pcVar4;
            if (pcVar4 == (char *)0x0) goto LAB_009bd5f8;
          }
          if (*(long *)((long)param_1 + 0x378) == 0) {
            return ses;
          }
          lVar3 = CRYPTO_memdup(*(long *)((long)param_1 + 0x378),
                                *(undefined8 *)((long)param_1 + 0x380),"ssl/ssl_sess.c",0x10f);
          *(long *)(ses[1].krb5_client_princ + 0x90) = lVar3;
          if (lVar3 != 0) {
            return ses;
          }
        }
      }
    }
  }
LAB_009bd5f8:
  ERR_new();
  ERR_set_debug("ssl/ssl_sess.c",0x116,"ssl_session_dup_intern");
  ERR_set_error(0x14,0xc0100,0);
  SSL_SESSION_free(ses);
  return (SSL_SESSION *)0x0;
}

