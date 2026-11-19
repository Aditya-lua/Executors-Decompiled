/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80d0c
 */

void FUN_00a80d0c(undefined8 *param_1)

{
  undefined8 *ptr;
  undefined8 *puVar1;
  
  if (param_1 != (undefined8 *)0x0) {
    ossl_ctx_thread_stop();
    ptr = (undefined8 *)param_1[0x37];
    while (ptr != (undefined8 *)0x0) {
      (*(code *)*ptr)(param_1);
      puVar1 = (undefined8 *)ptr[1];
      CRYPTO_free(ptr);
      ptr = puVar1;
    }
    CRYPTO_free_ex_data(0x10,(void *)0x0,(CRYPTO_EX_DATA *)(param_1 + 1));
    ossl_crypto_cleanup_all_ex_data_int(param_1);
    CRYPTO_THREAD_lock_free(param_1[0x20]);
    CRYPTO_THREAD_lock_free(param_1[0x21]);
    CRYPTO_THREAD_lock_free(param_1[0x22]);
    CRYPTO_THREAD_lock_free(param_1[0x23]);
    CRYPTO_THREAD_lock_free(param_1[0x24]);
    CRYPTO_THREAD_lock_free(param_1[0x25]);
    CRYPTO_THREAD_lock_free(param_1[0x26]);
    CRYPTO_THREAD_lock_free(param_1[0x27]);
    CRYPTO_THREAD_lock_free(param_1[0x28]);
    CRYPTO_THREAD_lock_free(param_1[0x29]);
    CRYPTO_THREAD_lock_free(param_1[0x2a]);
    CRYPTO_THREAD_lock_free(param_1[0x2b]);
    CRYPTO_THREAD_lock_free(param_1[0x2c]);
    CRYPTO_THREAD_lock_free(param_1[0x2d]);
    CRYPTO_THREAD_lock_free(param_1[0x2e]);
    CRYPTO_THREAD_lock_free(param_1[0x2f]);
    CRYPTO_THREAD_lock_free(param_1[0x30]);
    CRYPTO_THREAD_lock_free(param_1[0x31]);
    CRYPTO_THREAD_lock_free(param_1[0x32]);
    CRYPTO_THREAD_lock_free(param_1[0x33]);
    CRYPTO_THREAD_lock_free(*param_1);
    *param_1 = 0;
  }
  return;
}

