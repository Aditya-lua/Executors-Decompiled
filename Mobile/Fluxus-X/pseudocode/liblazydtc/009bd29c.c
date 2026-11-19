/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd29c
 */

SSL_SESSION * SSL_get1_session(SSL *ssl)

{
  uchar *puVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  SSL_SESSION *pSVar5;
  
  iVar4 = CRYPTO_THREAD_read_lock(*(undefined8 *)&ssl[10].next_proto_negotiated_len);
  if (iVar4 == 0) {
    pSVar5 = (SSL_SESSION *)0x0;
  }
  else {
    pSVar5 = *(SSL_SESSION **)&ssl[3].sid_ctx_length;
    if (pSVar5 != (SSL_SESSION *)0x0) {
      puVar1 = pSVar5[1].sid_ctx + 0xc;
      do {
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(puVar1,0x10);
        if (bVar3) {
          *(int *)puVar1 = *(int *)puVar1 + 1;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
    }
    CRYPTO_THREAD_unlock(*(undefined8 *)&ssl[10].next_proto_negotiated_len);
  }
  return pSVar5;
}

