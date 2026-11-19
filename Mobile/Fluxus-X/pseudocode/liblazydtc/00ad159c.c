/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad159c
 */

void RSA_free(RSA *r)

{
  BN_BLINDING **ppBVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  code *pcVar6;
  
  if (r == (RSA *)0x0) {
    return;
  }
  ppBVar1 = &r->mt_blinding;
  do {
    iVar2 = *(int *)ppBVar1;
    iVar5 = iVar2 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(ppBVar1,0x10);
    if (bVar4) {
      *(int *)ppBVar1 = iVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < iVar2) {
    return;
  }
  if ((r->engine != (ENGINE *)0x0) && (pcVar6 = *(code **)(r->engine + 0x40), pcVar6 != (code *)0x0)
     ) {
    (*pcVar6)(r);
  }
  ENGINE_finish((ENGINE *)r->n);
  CRYPTO_free_ex_data(9,r,(CRYPTO_EX_DATA *)&r->bignum_data);
  CRYPTO_THREAD_lock_free(r[1].e);
  BN_free(r->e);
  BN_free(r->d);
  BN_clear_free(r->p);
  BN_clear_free(r->q);
  BN_clear_free(r->dmp1);
  BN_clear_free(r->dmq1);
  BN_clear_free(r->iqmp);
  BN_clear_free((BIGNUM *)(r->ex_data).sk);
  RSA_PSS_PARAMS_free((RSA_PSS_PARAMS *)r->_method_mod_p);
  OPENSSL_sk_pop_free(r->_method_mod_q,ossl_rsa_multip_info_free);
  BN_BLINDING_free((BN_BLINDING *)r[1].engine);
  BN_BLINDING_free((BN_BLINDING *)r[1].n);
  CRYPTO_free(r);
  return;
}

