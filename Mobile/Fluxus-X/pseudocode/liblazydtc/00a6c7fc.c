/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6c7fc
 */

void EVP_PKEY_free(EVP_PKEY *pkey)

{
  stack_st_X509_ATTRIBUTE **ppsVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  long lVar6;
  undefined8 uVar7;
  
  if (pkey == (EVP_PKEY *)0x0) {
    return;
  }
  ppsVar1 = &pkey->attributes;
  do {
    iVar2 = *(int *)ppsVar1;
    iVar5 = iVar2 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(ppsVar1,0x10);
    if (bVar4) {
      *(int *)ppsVar1 = iVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < iVar2) {
    return;
  }
  evp_keymgmt_util_clear_operation_cache(pkey,1);
  evp_pkey_free_legacy(pkey);
  lVar6 = *(long *)&pkey[1].save_parameters;
  if (lVar6 != 0) {
    evp_keymgmt_freedata(lVar6,pkey[1].attributes);
    EVP_KEYMGMT_free(*(undefined8 *)&pkey[1].save_parameters);
    *(undefined8 *)&pkey[1].save_parameters = 0;
    pkey[1].attributes = (stack_st_X509_ATTRIBUTE *)0x0;
  }
  pkey->type = 0;
  CRYPTO_free_ex_data(0x11,pkey,(CRYPTO_EX_DATA *)&pkey[1].engine);
  uVar7._0_4_ = pkey[1].type;
  uVar7._4_4_ = pkey[1].save_type;
  CRYPTO_THREAD_lock_free(uVar7);
  OPENSSL_sk_pop_free(*(undefined8 *)&pkey[1].references,X509_ATTRIBUTE_free);
  CRYPTO_free(pkey);
  return;
}

