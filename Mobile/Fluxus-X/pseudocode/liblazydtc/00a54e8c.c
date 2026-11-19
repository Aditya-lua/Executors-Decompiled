/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54e8c
 */

long ERR_get_state(void)

{
  undefined4 uVar1;
  int iVar2;
  undefined4 *puVar3;
  long lVar4;
  
  puVar3 = (undefined4 *)__errno();
  uVar1 = *puVar3;
  iVar2 = OPENSSL_init_crypto(0x40000,0);
  if ((iVar2 != 0) && (iVar2 = CRYPTO_THREAD_run_once(&DAT_00d21b38,FUN_00a54cdc), iVar2 != 0)) {
    if (DAT_00d21b3c == 0) {
      return 0;
    }
    lVar4 = CRYPTO_THREAD_get_local(&DAT_00d21a1c);
    if (lVar4 != -1) {
      if (lVar4 != 0) {
LAB_00a542d0:
        *puVar3 = uVar1;
        return lVar4;
      }
      iVar2 = CRYPTO_THREAD_set_local(&DAT_00d21a1c,0xffffffffffffffff);
      if (iVar2 != 0) {
        lVar4 = CRYPTO_zalloc(0x388,"crypto/err/err.c",0x2b3);
        if (lVar4 == 0) {
          CRYPTO_THREAD_set_local(&DAT_00d21a1c,0);
          return 0;
        }
        iVar2 = ossl_init_thread_start(0,0,&LAB_00a54d10);
        if ((iVar2 != 0) && (iVar2 = CRYPTO_THREAD_set_local(&DAT_00d21a1c,lVar4), iVar2 != 0)) {
          OPENSSL_init_crypto(2,0);
          goto LAB_00a542d0;
        }
        FUN_00a54d5c(lVar4);
        CRYPTO_THREAD_set_local(&DAT_00d21a1c,0);
      }
    }
  }
  return 0;
}

