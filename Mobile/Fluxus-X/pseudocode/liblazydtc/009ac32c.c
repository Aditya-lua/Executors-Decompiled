/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ac32c
 */

void ssl_cert_free(void *param_1)

{
  int *piVar1;
  long lVar2;
  int iVar3;
  char cVar4;
  bool bVar5;
  int iVar6;
  long lVar7;
  
  if (param_1 == (void *)0x0) {
    return;
  }
  piVar1 = (int *)((long)param_1 + 0x208);
  do {
    iVar3 = *piVar1;
    iVar6 = iVar3 + -1;
    cVar4 = '\x01';
    bVar5 = (bool)ExclusiveMonitorPass(piVar1,0x10);
    if (bVar5) {
      *piVar1 = iVar6;
      cVar4 = ExclusiveMonitorsStatus();
    }
  } while (cVar4 != '\0');
  if (iVar6 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < iVar3) {
    return;
  }
  EVP_PKEY_free(*(EVP_PKEY **)((long)param_1 + 8));
  lVar7 = 0;
  do {
    X509_free(*(X509 **)((long)param_1 + lVar7 + 0x20));
    *(undefined8 *)((long)param_1 + lVar7 + 0x20) = 0;
    EVP_PKEY_free(*(EVP_PKEY **)((long)param_1 + lVar7 + 0x28));
    *(undefined8 *)((long)param_1 + lVar7 + 0x28) = 0;
    OPENSSL_sk_pop_free(*(undefined8 *)((long)param_1 + lVar7 + 0x30),X509_free);
    *(undefined8 *)((long)param_1 + lVar7 + 0x30) = 0;
    CRYPTO_free(*(void **)((long)param_1 + lVar7 + 0x38));
    lVar2 = lVar7 + 0x28;
    *(undefined8 *)((long)param_1 + lVar7 + 0x38) = 0;
    *(undefined8 *)((long)param_1 + lVar7 + 0x40) = 0;
    lVar7 = lVar2;
  } while (lVar2 != 0x168);
  CRYPTO_free(*(void **)((long)param_1 + 0x198));
  CRYPTO_free(*(void **)((long)param_1 + 0x1a8));
  CRYPTO_free(*(void **)((long)param_1 + 0x188));
  X509_STORE_free(*(X509_STORE **)((long)param_1 + 0x1d0));
  X509_STORE_free(*(X509_STORE **)((long)param_1 + 0x1c8));
  custom_exts_free((long)param_1 + 0x1d8);
  CRYPTO_free(*(void **)((long)param_1 + 0x200));
  CRYPTO_THREAD_lock_free(*(undefined8 *)((long)param_1 + 0x210));
  CRYPTO_free(param_1);
  return;
}

