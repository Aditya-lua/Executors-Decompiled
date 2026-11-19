/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad0c4c
 */

void BN_BLINDING_set_current_thread(long param_1)

{
  pthread_t pVar1;
  
  pVar1 = CRYPTO_THREAD_get_current_id();
  *(pthread_t *)(param_1 + 0x20) = pVar1;
  return;
}

