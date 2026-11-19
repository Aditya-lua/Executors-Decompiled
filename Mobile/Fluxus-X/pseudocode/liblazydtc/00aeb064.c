/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeb064
 */

void OSSL_STORE_LOADER_free(void *param_1)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  
  if ((param_1 != (void *)0x0) && (lVar6 = *(long *)((long)param_1 + 0x60), lVar6 != 0)) {
    piVar1 = (int *)((long)param_1 + 0x80);
    do {
      iVar2 = *piVar1;
      iVar5 = iVar2 + -1;
      cVar3 = '\x01';
      bVar4 = (bool)ExclusiveMonitorPass(piVar1,0x10);
      if (bVar4) {
        *piVar1 = iVar5;
        cVar3 = ExclusiveMonitorsStatus();
      }
    } while (cVar3 != '\0');
    if (iVar5 == 0) {
      DataMemoryBarrier(2,1);
      lVar6 = *(long *)((long)param_1 + 0x60);
    }
    else if (1 < iVar2) {
      return;
    }
    ossl_provider_free(lVar6);
    CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x88));
  }
  CRYPTO_free(param_1);
  return;
}

