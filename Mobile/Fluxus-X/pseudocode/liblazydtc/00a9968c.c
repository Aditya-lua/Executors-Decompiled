/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9968c
 */

void FUN_00a9968c(long param_1)

{
  undefined8 *puVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  
  iVar2 = CRYPTO_THREAD_run_once(&DAT_00d220d8,&LAB_00a99894);
  puVar1 = DAT_00d220e0;
  if ((((DAT_00d220e0 == (undefined8 *)0x0) || (iVar2 == 0)) || (DAT_00d220dc == 0)) ||
     (iVar2 = CRYPTO_THREAD_write_lock(DAT_00d220e0[1]), iVar2 == 0)) {
    return;
  }
  iVar2 = OPENSSL_sk_num(*puVar1);
  if (0 < iVar2) {
    iVar2 = 0;
    do {
      lVar4 = OPENSSL_sk_value(*puVar1,iVar2);
      if (lVar4 == param_1) {
        OPENSSL_sk_delete(*puVar1,iVar2);
        break;
      }
      iVar2 = iVar2 + 1;
      iVar3 = OPENSSL_sk_num(*puVar1);
    } while (iVar2 < iVar3);
  }
  CRYPTO_THREAD_unlock(puVar1[1]);
  return;
}

