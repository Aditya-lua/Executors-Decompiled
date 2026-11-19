/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0c734
 */

void CONF_modules_unload(int all)

{
  int iVar1;
  long *ptr;
  
  iVar1 = FUN_00a0c850();
  if ((iVar1 == 0) || (iVar1 = CRYPTO_THREAD_write_lock(DAT_00d21928), iVar1 == 0)) {
    return;
  }
  iVar1 = OPENSSL_sk_num(DAT_00d21930);
  if (0 < iVar1) {
    iVar1 = iVar1 + 1;
    do {
      ptr = (long *)OPENSSL_sk_value(DAT_00d21930,iVar1 + -2);
      if ((int)ptr[4] < 1) {
        if ((all != 0) || (*ptr != 0)) goto LAB_00a0c7b0;
      }
      else if (all != 0) {
LAB_00a0c7b0:
        OPENSSL_sk_delete(DAT_00d21930,iVar1 + -2);
        DSO_free((DSO *)*ptr);
        CRYPTO_free((void *)ptr[1]);
        CRYPTO_free(ptr);
      }
      iVar1 = iVar1 + -1;
    } while (1 < iVar1);
  }
  iVar1 = OPENSSL_sk_num(DAT_00d21930);
  if (iVar1 == 0) {
    OPENSSL_sk_free(DAT_00d21930);
    DAT_00d21930 = 0;
  }
  CRYPTO_THREAD_unlock(DAT_00d21928);
  return;
}

