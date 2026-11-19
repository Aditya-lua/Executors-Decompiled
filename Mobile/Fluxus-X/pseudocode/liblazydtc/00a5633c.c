/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5633c
 */

void EVP_ASYM_CIPHER_free(void *param_1)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  
  if (param_1 == (void *)0x0) {
    return;
  }
  piVar1 = (int *)((long)param_1 + 0x20);
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
  }
  else if (1 < iVar2) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 8));
  ossl_provider_free(*(undefined8 *)((long)param_1 + 0x18));
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x28));
  CRYPTO_free(param_1);
  return;
}

