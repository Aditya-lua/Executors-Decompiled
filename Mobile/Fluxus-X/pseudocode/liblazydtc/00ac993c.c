/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac993c
 */

void EVP_RAND_CTX_free(long *param_1)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  long lVar6;
  long *plVar7;
  undefined8 *ptr;
  
  if (param_1 != (long *)0x0) {
    do {
      plVar7 = param_1 + 3;
      do {
        lVar6 = *plVar7;
        iVar4 = (int)lVar6 + -1;
        cVar2 = '\x01';
        bVar3 = (bool)ExclusiveMonitorPass(plVar7,0x10);
        if (bVar3) {
          *(int *)plVar7 = iVar4;
          cVar2 = ExclusiveMonitorsStatus();
        }
      } while (cVar2 != '\0');
      if (iVar4 == 0) {
        DataMemoryBarrier(2,1);
      }
      else if (1 < (int)lVar6) {
        return;
      }
      plVar7 = (long *)param_1[2];
      (**(code **)(*param_1 + 0x40))(param_1[1]);
      ptr = (undefined8 *)*param_1;
      param_1[1] = 0;
      if (ptr != (undefined8 *)0x0) {
        piVar1 = (int *)(ptr + 4);
        do {
          iVar4 = *piVar1;
          iVar5 = iVar4 + -1;
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar3) {
            *piVar1 = iVar5;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
        if (iVar5 == 0) {
          DataMemoryBarrier(2,1);
        }
        else if (1 < iVar4) goto LAB_00ac99fc;
        CRYPTO_free((void *)ptr[2]);
        ossl_provider_free(*ptr);
        CRYPTO_THREAD_lock_free(ptr[5]);
        CRYPTO_free(ptr);
      }
LAB_00ac99fc:
      CRYPTO_THREAD_lock_free(param_1[4]);
      CRYPTO_free(param_1);
      param_1 = plVar7;
    } while (plVar7 != (long *)0x0);
  }
  return;
}

