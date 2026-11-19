/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a280
 */

void X509_STORE_unlock(long param_1)

{
  CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x98));
  return;
}

