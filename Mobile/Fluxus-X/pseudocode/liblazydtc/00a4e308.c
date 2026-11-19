/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e308
 */

int ossl_core_bio_free(int *param_1)

{
  char cVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  
  if (param_1 == (int *)0x0) {
LAB_00a4e374:
    iVar4 = 1;
  }
  else {
    do {
      iVar4 = *param_1;
      iVar3 = iVar4 + -1;
      cVar1 = '\x01';
      bVar2 = (bool)ExclusiveMonitorPass(param_1,0x10);
      if (bVar2) {
        *param_1 = iVar3;
        cVar1 = ExclusiveMonitorsStatus();
      }
    } while (cVar1 != '\0');
    if (iVar3 == 0) {
      DataMemoryBarrier(2,1);
    }
    else if (1 < iVar4) goto LAB_00a4e374;
    iVar4 = BIO_free(*(BIO **)(param_1 + 4));
    CRYPTO_THREAD_lock_free(*(undefined8 *)(param_1 + 2));
    CRYPTO_free(param_1);
  }
  return iVar4;
}

