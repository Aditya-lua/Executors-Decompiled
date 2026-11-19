/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a604
 */

void X509_STORE_free(X509_STORE *v)

{
  X509_STORE *pXVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  int iVar5;
  void *ptr;
  code *pcVar6;
  stack_st_X509_LOOKUP *psVar7;
  
  if (v == (X509_STORE *)0x0) {
    return;
  }
  pXVar1 = v + 1;
  do {
    iVar4 = pXVar1->cache;
    iVar5 = iVar4 + -1;
    cVar2 = '\x01';
    bVar3 = (bool)ExclusiveMonitorPass(pXVar1,0x10);
    if (bVar3) {
      pXVar1->cache = iVar5;
      cVar2 = ExclusiveMonitorsStatus();
    }
  } while (cVar2 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < iVar4) {
    return;
  }
  psVar7 = v->get_cert_methods;
  iVar4 = OPENSSL_sk_num(psVar7);
  if (0 < iVar4) {
    iVar4 = 0;
    do {
      ptr = (void *)OPENSSL_sk_value(psVar7,iVar4);
      if ((*(long *)((long)ptr + 8) != 0) &&
         (pcVar6 = *(code **)(*(long *)((long)ptr + 8) + 0x20), pcVar6 != (code *)0x0)) {
        (*pcVar6)(ptr);
      }
      if (ptr != (void *)0x0) {
        if ((*(long *)((long)ptr + 8) != 0) &&
           (pcVar6 = *(code **)(*(long *)((long)ptr + 8) + 0x10), pcVar6 != (code *)0x0)) {
          (*pcVar6)(ptr);
        }
        CRYPTO_free(ptr);
      }
      iVar4 = iVar4 + 1;
      iVar5 = OPENSSL_sk_num(psVar7);
    } while (iVar4 < iVar5);
  }
  OPENSSL_sk_free(psVar7);
  OPENSSL_sk_pop_free(v->objs,X509_OBJECT_free);
  CRYPTO_free_ex_data(4,v,(CRYPTO_EX_DATA *)&(v->ex_data).dummy);
  X509_VERIFY_PARAM_free(v->param);
  CRYPTO_THREAD_lock_free(v[1].objs);
  CRYPTO_free(v);
  return;
}

