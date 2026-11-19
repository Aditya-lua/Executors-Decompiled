/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53eb8
 */

undefined8 ossl_err_load_ERR_strings(void)

{
  int iVar1;
  undefined8 uVar2;
  long *plVar3;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21a30,&LAB_00a53f8c);
  uVar2 = 0;
  if ((iVar1 != 0) && (DAT_00d21a34 != 0)) {
    iVar1 = CRYPTO_THREAD_write_lock(DAT_00d21a20);
    if (iVar1 != 0) {
      if (DAT_00cc8990 != 0) {
        plVar3 = &DAT_00cc8990;
        do {
          OPENSSL_LH_insert(DAT_00d21a28,plVar3);
          plVar3 = plVar3 + 2;
        } while (*plVar3 != 0);
      }
      CRYPTO_THREAD_unlock(DAT_00d21a20);
    }
    iVar1 = CRYPTO_THREAD_write_lock(DAT_00d21a20);
    if (iVar1 != 0) {
      if (DAT_00cc8c50 != 0) {
        plVar3 = &DAT_00cc8c50;
        do {
          OPENSSL_LH_insert(DAT_00d21a28,plVar3);
          plVar3 = plVar3 + 2;
        } while (*plVar3 != 0);
      }
      CRYPTO_THREAD_unlock(DAT_00d21a20);
    }
    uVar2 = 1;
  }
  return uVar2;
}

