/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a278
 */

void X509_STORE_lock(long param_1)

{
  CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x98));
  return;
}

