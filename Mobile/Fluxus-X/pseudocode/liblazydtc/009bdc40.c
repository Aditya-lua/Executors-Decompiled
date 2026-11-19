/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bdc40
 */

SSL_SESSION * lookup_sess_in_cache(int *param_1,void *param_2,ulong param_3)

{
  uchar *puVar1;
  int *piVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  SSL_SESSION *pSVar6;
  long lVar7;
  int local_3e0 [148];
  ulong local_190;
  undefined1 auStack_188 [328];
  
  lVar7 = *(long *)(param_1 + 0x2e2);
  if ((*(byte *)(lVar7 + 0x51) & 1) == 0) {
    local_3e0[0] = *param_1;
    if (0x20 < param_3) {
      return (SSL_SESSION *)0x0;
    }
    memcpy(auStack_188,param_2,param_3);
    local_190 = param_3;
    iVar5 = CRYPTO_THREAD_read_lock(*(undefined8 *)(lVar7 + 0x3c8));
    if (iVar5 == 0) {
      return (SSL_SESSION *)0x0;
    }
    pSVar6 = (SSL_SESSION *)
             OPENSSL_LH_retrieve(*(undefined8 *)(*(long *)(param_1 + 0x2e2) + 0x30),local_3e0);
    if (pSVar6 != (SSL_SESSION *)0x0) {
      puVar1 = pSVar6[1].sid_ctx + 0xc;
      do {
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(puVar1,0x10);
        if (bVar4) {
          *(int *)puVar1 = *(int *)puVar1 + 1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      CRYPTO_THREAD_unlock(*(undefined8 *)(*(long *)(param_1 + 0x2e2) + 0x3c8));
      return pSVar6;
    }
    CRYPTO_THREAD_unlock(*(undefined8 *)(*(long *)(param_1 + 0x2e2) + 0x3c8));
    piVar2 = (int *)(*(long *)(param_1 + 0x2e2) + 0x90);
    do {
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(piVar2,0x10);
      if (bVar4) {
        *piVar2 = *piVar2 + 1;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    lVar7 = *(long *)(param_1 + 0x2e2);
  }
  if (*(code **)(lVar7 + 0x70) != (code *)0x0) {
    local_3e0[0] = 1;
    pSVar6 = (SSL_SESSION *)
             (**(code **)(lVar7 + 0x70))(param_1,param_2,param_3 & 0xffffffff,local_3e0);
    if (pSVar6 == (SSL_SESSION *)0x0) {
      return (SSL_SESSION *)0x0;
    }
    if (*(int *)(pSVar6[1].session_id + 0x10) == 0) {
      piVar2 = (int *)(*(long *)(param_1 + 0x2e2) + 0xa0);
      do {
        cVar3 = '\x01';
        bVar4 = (bool)ExclusiveMonitorPass(piVar2,0x10);
        if (bVar4) {
          *piVar2 = *piVar2 + 1;
          cVar3 = ExclusiveMonitorsStatus();
        }
      } while (cVar3 != '\0');
      if (local_3e0[0] != 0) {
        puVar1 = pSVar6[1].sid_ctx + 0xc;
        do {
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(puVar1,0x10);
          if (bVar4) {
            *(int *)puVar1 = *(int *)puVar1 + 1;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
      }
      if ((*(byte *)((long)&(*(SSL_CTX **)(param_1 + 0x2e2))->new_session_cb + 1) >> 1 & 1) == 0) {
        SSL_CTX_add_session(*(SSL_CTX **)(param_1 + 0x2e2),pSVar6);
        return pSVar6;
      }
      return pSVar6;
    }
    if (local_3e0[0] == 0) {
      SSL_SESSION_free(pSVar6);
    }
  }
  return (SSL_SESSION *)0x0;
}

