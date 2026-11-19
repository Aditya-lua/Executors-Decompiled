/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5a430
 */

undefined8 EVP_CIPHER_CTX_reset(long *param_1)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  undefined8 uVar6;
  long lVar7;
  void *ptr;
  
  if (param_1 == (long *)0x0) {
    return 1;
  }
  lVar7 = *param_1;
  if (lVar7 != 0) {
    if (*(long *)(lVar7 + 0x78) != 0) {
      if (param_1[0x15] != 0) {
        if (*(code **)(lVar7 + 0xc0) != (code *)0x0) {
          (**(code **)(lVar7 + 0xc0))();
        }
        param_1[0x15] = 0;
      }
      ptr = (void *)param_1[0x16];
      if ((ptr != (void *)0x0) && (*(int *)((long)ptr + 0x18) == 0)) {
        piVar1 = (int *)((long)ptr + 0x80);
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
        else if (1 < iVar2) goto LAB_00a5a4e8;
        CRYPTO_free(*(void **)((long)ptr + 0x68));
        ossl_provider_free(*(undefined8 *)((long)ptr + 0x78));
        CRYPTO_THREAD_lock_free(*(undefined8 *)((long)ptr + 0x88));
        CRYPTO_free(ptr);
      }
      goto LAB_00a5a4e8;
    }
    if ((*(code **)(lVar7 + 0x30) != (code *)0x0) &&
       (uVar6 = (**(code **)(lVar7 + 0x30))(param_1), (int)uVar6 == 0)) {
      return uVar6;
    }
    if (((void *)param_1[0xf] != (void *)0x0) && (*(int *)(*param_1 + 0x38) != 0)) {
      OPENSSL_cleanse((void *)param_1[0xf],(long)*(int *)(*param_1 + 0x38));
    }
  }
  CRYPTO_free((void *)param_1[0xf]);
  ENGINE_finish((ENGINE *)param_1[1]);
LAB_00a5a4e8:
  memset(param_1,0,0xb8);
  *(undefined4 *)((long)param_1 + 0x6c) = 0xffffffff;
  return 1;
}

