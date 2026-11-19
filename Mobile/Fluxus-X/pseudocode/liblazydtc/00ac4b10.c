/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac4b10
 */

undefined8 ossl_method_store_cache_flush_all(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_1 != 0) &&
     (uVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x10)), (int)uVar1 != 0)) {
    ossl_sa_doall(*(undefined8 *)(param_1 + 8),&LAB_00ac4b5c);
    *(undefined8 *)(param_1 + 0x20) = 0;
    CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x10));
    uVar1 = 1;
  }
  return uVar1;
}

