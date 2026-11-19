/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9790
 */

long * EVP_RAND_CTX_new(undefined8 *param_1,long *param_2)

{
  long *plVar1;
  int *piVar2;
  char cVar3;
  bool bVar4;
  long *ptr;
  long lVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  code *pcVar8;
  
  if (param_1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/evp_rand.c",0x151,"EVP_RAND_CTX_new");
    uVar7 = 0xda;
  }
  else {
    ptr = (long *)CRYPTO_zalloc(0x28,"crypto/evp/evp_rand.c",0x155);
    if (ptr != (long *)0x0) {
      lVar5 = CRYPTO_THREAD_lock_new();
      ptr[4] = lVar5;
      if (lVar5 != 0) {
        if (param_2 == (long *)0x0) {
          lVar5 = 0;
          uVar7 = 0;
        }
        else {
          plVar1 = param_2 + 3;
          do {
            cVar3 = '\x01';
            bVar4 = (bool)ExclusiveMonitorPass(plVar1,0x10);
            if (bVar4) {
              *(int *)plVar1 = (int)*plVar1 + 1;
              cVar3 = ExclusiveMonitorsStatus();
            }
          } while (cVar3 != '\0');
          lVar5 = param_2[1];
          uVar7 = *(undefined8 *)(*param_2 + 0x30);
        }
        pcVar8 = (code *)param_1[7];
        uVar6 = ossl_provider_ctx(*param_1);
        lVar5 = (*pcVar8)(uVar6,lVar5,uVar7);
        ptr[1] = lVar5;
        if (lVar5 == 0) {
          ERR_new();
          ERR_set_debug("crypto/evp/evp_rand.c",0x168,"EVP_RAND_CTX_new");
          ERR_set_error(6,0xc0100,0);
          (*(code *)param_1[8])(ptr[1]);
          CRYPTO_THREAD_lock_free(ptr[4]);
          CRYPTO_free(ptr);
          EVP_RAND_CTX_free(param_2);
          return (long *)0x0;
        }
        piVar2 = (int *)(param_1 + 4);
        do {
          cVar3 = '\x01';
          bVar4 = (bool)ExclusiveMonitorPass(piVar2,0x10);
          if (bVar4) {
            *piVar2 = *piVar2 + 1;
            cVar3 = ExclusiveMonitorsStatus();
          }
        } while (cVar3 != '\0');
        *ptr = (long)param_1;
        ptr[2] = (long)param_2;
        *(undefined4 *)(ptr + 3) = 1;
        return ptr;
      }
    }
    CRYPTO_free(ptr);
    ERR_new();
    ERR_set_debug("crypto/evp/evp_rand.c",0x158,"EVP_RAND_CTX_new");
    uVar7 = 0xc0100;
  }
  ERR_set_error(6,uVar7,0);
  return (long *)0x0;
}

