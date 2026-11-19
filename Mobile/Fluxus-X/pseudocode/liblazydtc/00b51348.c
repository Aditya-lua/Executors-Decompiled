/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b51348
 */

void ossl_mac_key_free(undefined8 *param_1)

{
  int *piVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  
  if (param_1 == (undefined8 *)0x0) {
    return;
  }
  piVar1 = (int *)(param_1 + 2);
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
  else if (1 < iVar2) {
    return;
  }
  CRYPTO_secure_clear_free
            (param_1[3],param_1[4],"providers/implementations/keymgmt/mac_legacy_kmgmt.c",0x62);
  CRYPTO_free((void *)param_1[8]);
  ossl_prov_cipher_reset(param_1 + 5);
  CRYPTO_THREAD_lock_free(*param_1);
  CRYPTO_free(param_1);
  return;
}

