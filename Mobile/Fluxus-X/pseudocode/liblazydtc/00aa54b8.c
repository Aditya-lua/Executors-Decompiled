/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa54b8
 */

void CRYPTO_THREAD_get_local(pthread_key_t *param_1)

{
  pthread_getspecific(*param_1);
  return;
}

