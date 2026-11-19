/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a65b14
 */

undefined8 evp_keymgmt_util_clear_operation_cache(long param_1,int param_2)

{
  undefined8 uVar1;
  
  if (param_1 != 0) {
    if (param_2 == 0) {
      OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x78),&LAB_00a65c4c);
      *(undefined8 *)(param_1 + 0x78) = 0;
    }
    else {
      if ((*(long *)(param_1 + 0x38) != 0) && (uVar1 = CRYPTO_THREAD_write_lock(), (int)uVar1 == 0))
      {
        return uVar1;
      }
      OPENSSL_sk_pop_free(*(undefined8 *)(param_1 + 0x78),&LAB_00a65c4c);
      *(undefined8 *)(param_1 + 0x78) = 0;
      if (*(long *)(param_1 + 0x38) != 0) {
        CRYPTO_THREAD_unlock();
      }
    }
  }
  return 1;
}

