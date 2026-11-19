/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2e658
 */

void EC_KEY_free(EC_KEY *key)

{
  EC_KEY *pEVar1;
  int iVar2;
  char cVar3;
  bool bVar4;
  int iVar5;
  code *pcVar6;
  
  if (key == (EC_KEY *)0x0) {
    return;
  }
  pEVar1 = key + 0x38;
  do {
    iVar2 = *(int *)pEVar1;
    iVar5 = iVar2 + -1;
    cVar3 = '\x01';
    bVar4 = (bool)ExclusiveMonitorPass(pEVar1,0x10);
    if (bVar4) {
      *(int *)pEVar1 = iVar5;
      cVar3 = ExclusiveMonitorsStatus();
    }
  } while (cVar3 != '\0');
  if (iVar5 == 0) {
    DataMemoryBarrier(2,1);
  }
  else if (1 < iVar2) {
    return;
  }
  if ((*(long *)key != 0) && (pcVar6 = *(code **)(*(long *)key + 0x18), pcVar6 != (code *)0x0)) {
    (*pcVar6)(key);
  }
  ENGINE_finish(*(ENGINE **)(key + 8));
  if ((*(long **)(key + 0x18) != (long *)0x0) &&
     (pcVar6 = *(code **)(**(long **)(key + 0x18) + 0x168), pcVar6 != (code *)0x0)) {
    (*pcVar6)(key);
  }
  CRYPTO_free_ex_data(8,key,(CRYPTO_EX_DATA *)(key + 0x40));
  CRYPTO_THREAD_lock_free(*(undefined8 *)(key + 0x50));
  EC_GROUP_free(*(EC_GROUP **)(key + 0x18));
  EC_POINT_free(*(EC_POINT **)(key + 0x20));
  BN_clear_free(*(BIGNUM **)(key + 0x28));
  CRYPTO_free(*(void **)(key + 0x60));
  CRYPTO_clear_free(key,0x70,"crypto/ec/ec_key.c",0x66);
  return;
}

