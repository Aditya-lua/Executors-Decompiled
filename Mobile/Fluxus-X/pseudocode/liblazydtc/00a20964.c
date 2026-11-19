/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a20964
 */

void DSA_free(DSA *r)

{
  DSA *pDVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  code *pcVar6;
  
  if (r == (DSA *)0x0) {
    return;
  }
  pDVar1 = r + 1;
  do {
    iVar2 = pDVar1->pad;
    iVar5 = iVar2 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(pDVar1,0x10);
    if (bVar4) {
      pDVar1->pad = iVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < iVar2) {
    return;
  }
  if ((r[1].p != (BIGNUM *)0x0) && (pcVar6 = *(code **)&r[1].p[2].top, pcVar6 != (code *)0x0)) {
    (*pcVar6)(r);
  }
  ENGINE_finish((ENGINE *)r[1].q);
  CRYPTO_free_ex_data(7,r,(CRYPTO_EX_DATA *)&r[1].version);
  CRYPTO_THREAD_lock_free(r[1].g);
  ossl_ffc_params_cleanup(&r->version);
  BN_clear_free((BIGNUM *)(r->ex_data).sk);
  BN_clear_free(*(BIGNUM **)&(r->ex_data).dummy);
  CRYPTO_free(r);
  return;
}

