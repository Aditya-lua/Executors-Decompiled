/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4100
 */

void SSL_copy_session_id(SSL *to,SSL *from)

{
  ushort *puVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  SSL_SESSION *session;
  COMP_CTX *__n;
  SSL_METHOD *pSVar5;
  
  session = SSL_get_session(from);
  iVar4 = SSL_set_session(to,session);
  if (iVar4 != 0) {
    if (to->method != from->method) {
      (*to->method->ssl_accept)(to);
      pSVar5 = from->method;
      to->method = pSVar5;
      iVar4 = (*pSVar5->ssl_clear)(to);
      if (iVar4 == 0) {
        return;
      }
    }
    puVar1 = &(from[3].d1)->r_epoch;
    do {
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(puVar1,0x10);
      if (bVar3) {
        *(int *)puVar1 = *(int *)puVar1 + 1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    ssl_cert_free(to[3].d1);
    to[3].d1 = from[3].d1;
    if ((uint)from[3].expand < 0x21) {
      __n = (COMP_CTX *)((ulong)from[3].expand & 0xffffffff);
      to[3].expand = __n;
      memcpy(&to[3].enc_write_ctx,&from[3].enc_write_ctx,(size_t)__n);
    }
    else {
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x38a,"SSL_set_session_id_context");
      ERR_set_error(0x14,0x111,0);
    }
  }
  return;
}

