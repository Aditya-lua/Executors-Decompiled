/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa54e0
 */

bool CRYPTO_THREAD_cleanup_local(pthread_key_t *param_1)

{
  int iVar1;
  
  iVar1 = pthread_key_delete(*param_1);
  return iVar1 == 0;
}

