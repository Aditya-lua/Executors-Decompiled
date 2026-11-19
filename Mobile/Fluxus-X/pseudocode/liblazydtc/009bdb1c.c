/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bdb1c
 */

void SSL_SESSION_free(SSL_SESSION *ses)

{
  uchar *puVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  
  if (ses == (SSL_SESSION *)0x0) {
    return;
  }
  puVar1 = ses[1].sid_ctx + 0xc;
  do {
    iVar2 = *(int *)puVar1;
    iVar5 = iVar2 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(puVar1,0x10);
    if (bVar4) {
      *(int *)puVar1 = iVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < iVar2) {
    return;
  }
  CRYPTO_free_ex_data(2,ses,(CRYPTO_EX_DATA *)(ses[1].krb5_client_princ + 0x28));
  OPENSSL_cleanse(ses->session_id + 8,0x200);
  OPENSSL_cleanse(ses + 1,0x20);
  X509_free(*(X509 **)(ses[1].session_id + 0x18));
  uVar6._0_4_ = ses[1].sid_ctx_length;
  uVar6._4_1_ = ses[1].sid_ctx[0];
  uVar6._5_1_ = ses[1].sid_ctx[1];
  uVar6._6_1_ = ses[1].sid_ctx[2];
  uVar6._7_1_ = ses[1].sid_ctx[3];
  OPENSSL_sk_pop_free(uVar6,X509_free);
  CRYPTO_free(*(void **)(ses[1].krb5_client_princ + 0x48));
  CRYPTO_free(*(void **)(ses[1].krb5_client_princ + 0x50));
  CRYPTO_free(*(void **)ses[1].session_id);
  CRYPTO_free(*(void **)(ses[1].session_id + 8));
  CRYPTO_free(*(void **)(ses[1].krb5_client_princ + 0x88));
  CRYPTO_free(*(void **)(ses[1].krb5_client_princ + 0x70));
  CRYPTO_free(*(void **)(ses[1].krb5_client_princ + 0x90));
  CRYPTO_THREAD_lock_free(*(undefined8 *)(ses[1].krb5_client_princ + 0xb0));
  CRYPTO_clear_free(ses,0x3a0,"ssl/ssl_sess.c",0x36b);
  return;
}

