/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0c960
 */

undefined8 CONF_modules_finish(void)

{
  int iVar1;
  undefined8 uVar2;
  long *ptr;
  long lVar3;
  
  iVar1 = CRYPTO_THREAD_run_once(&DAT_00d21940,FUN_00a0ccd0);
  uVar2 = 0;
  if ((((iVar1 != 0) && (DAT_00d21944 != 0)) && (uVar2 = 0, DAT_00d21928 != 0)) &&
     (uVar2 = CRYPTO_THREAD_write_lock(), (int)uVar2 != 0)) {
    iVar1 = OPENSSL_sk_num(DAT_00d21948);
    while (0 < iVar1) {
      ptr = (long *)OPENSSL_sk_pop(DAT_00d21948);
      if (ptr != (long *)0x0) {
        lVar3 = *ptr;
        if (*(code **)(lVar3 + 0x18) != (code *)0x0) {
          (**(code **)(lVar3 + 0x18))(ptr);
          lVar3 = *ptr;
        }
        *(int *)(lVar3 + 0x20) = *(int *)(lVar3 + 0x20) + -1;
        CRYPTO_free((void *)ptr[1]);
        CRYPTO_free((void *)ptr[2]);
        CRYPTO_free(ptr);
      }
      iVar1 = OPENSSL_sk_num(DAT_00d21948);
    }
    OPENSSL_sk_free(DAT_00d21948);
    DAT_00d21948 = 0;
    CRYPTO_THREAD_unlock(DAT_00d21928);
    uVar2 = 1;
  }
  return uVar2;
}

