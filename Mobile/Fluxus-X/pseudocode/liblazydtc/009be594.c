/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be594
 */

int SSL_set_session(SSL *to,SSL_SESSION *session)

{
  uchar *puVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  undefined8 uVar6;
  SSL_METHOD *method;
  long lVar7;
  
  lVar7._0_4_ = to[3].sid_ctx_length;
  lVar7._4_1_ = to[3].sid_ctx[0];
  lVar7._5_1_ = to[3].sid_ctx[1];
  lVar7._6_1_ = to[3].sid_ctx[2];
  lVar7._7_1_ = to[3].sid_ctx[3];
  if ((((lVar7 != 0) && ((to->shutdown & 1) == 0)) && (iVar4 = SSL_in_init(to), iVar4 == 0)) &&
     (iVar4 = SSL_in_before(to), iVar4 == 0)) {
    uVar6._0_4_ = to[3].sid_ctx_length;
    uVar6._4_1_ = to[3].sid_ctx[0];
    uVar6._5_1_ = to[3].sid_ctx[1];
    uVar6._6_1_ = to[3].sid_ctx[2];
    uVar6._7_1_ = to[3].sid_ctx[3];
    FUN_009be2fc(*(undefined8 *)&to[4].mac_flags,uVar6,1);
  }
  method = *(SSL_METHOD **)(*(long *)&to[3].ex_data.dummy + 8);
  if ((method == to->method) || (iVar5 = SSL_set_ssl_method(to,method), iVar4 = 0, iVar5 != 0)) {
    if (session != (SSL_SESSION *)0x0) {
      puVar1 = session[1].sid_ctx + 0xc;
      do {
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(puVar1,0x10);
        if (bVar3) {
          *(int *)puVar1 = *(int *)puVar1 + 1;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
      *(undefined8 *)&to[3].references = *(undefined8 *)(session[1].sid_ctx + 4);
    }
    SSL_SESSION_free(*(SSL_SESSION **)&to[3].sid_ctx_length);
    iVar4 = 1;
    *(SSL_SESSION **)&to[3].sid_ctx_length = session;
  }
  return iVar4;
}

