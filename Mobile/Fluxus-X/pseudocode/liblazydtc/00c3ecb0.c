/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ecb0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

pthread_t CRYPTO_THREAD_get_current_id(void)

{
  pthread_t pVar1;
  
  pVar1 = CRYPTO_THREAD_get_current_id();
  return pVar1;
}

