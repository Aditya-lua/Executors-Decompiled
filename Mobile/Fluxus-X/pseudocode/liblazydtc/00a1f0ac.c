/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1f0ac
 */

void DH_free(DH *dh)

{
  DH *pDVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  code *pcVar6;
  
  if (dh == (DH *)0x0) {
    return;
  }
  pDVar1 = dh + 1;
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
  if ((dh[1].priv_key != (BIGNUM *)0x0) &&
     (pcVar6 = *(code **)&dh[1].priv_key[1].neg, pcVar6 != (code *)0x0)) {
    (*pcVar6)(dh);
  }
  ENGINE_finish((ENGINE *)dh[1].length);
  CRYPTO_free_ex_data(6,dh,(CRYPTO_EX_DATA *)&dh[1].p);
  CRYPTO_THREAD_lock_free(*(undefined8 *)&dh[1].flags);
  ossl_ffc_params_cleanup(&dh->p);
  BN_clear_free((BIGNUM *)(dh->ex_data).sk);
  BN_clear_free(*(BIGNUM **)&(dh->ex_data).dummy);
  CRYPTO_free(dh);
  return;
}

