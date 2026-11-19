/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52a48
 */

EVP_PKEY_ASN1_METHOD * ENGINE_pkey_asn1_find_str(ENGINE **pe,char *str,int len)

{
  ENGINE *pEVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  ENGINE *local_40;
  EVP_PKEY_ASN1_METHOD *local_38;
  char *local_30;
  int local_28;
  
  local_40 = (ENGINE *)0x0;
  local_38 = (EVP_PKEY_ASN1_METHOD *)0x0;
  local_30 = str;
  local_28 = len;
  iVar4 = CRYPTO_THREAD_run_once(&engine_lock_init,do_engine_lock_init_ossl_);
  if ((iVar4 == 0) || (do_engine_lock_init_ossl_ret_ == 0)) {
    ERR_new();
    ERR_set_debug("crypto/engine/tb_asnmth.c",199,"ENGINE_pkey_asn1_find_str");
    ERR_set_error(0x26,0xc0100,0);
  }
  else {
    iVar4 = CRYPTO_THREAD_write_lock(global_engine_lock);
    if (iVar4 != 0) {
      engine_table_doall(DAT_00d219c8,FUN_00a52b34,&local_40);
      if (local_40 != (ENGINE *)0x0) {
        pEVar1 = local_40 + 0x9c;
        do {
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(pEVar1,0x10);
          if (bVar3) {
            *(int *)pEVar1 = *(int *)pEVar1 + 1;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
      }
      *pe = local_40;
      CRYPTO_THREAD_unlock(global_engine_lock);
      return local_38;
    }
  }
  return (EVP_PKEY_ASN1_METHOD *)0x0;
}

