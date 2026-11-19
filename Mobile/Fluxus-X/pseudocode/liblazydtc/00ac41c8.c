/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac41c8
 */

void ossl_method_unlock_store(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x18));
  return;
}

