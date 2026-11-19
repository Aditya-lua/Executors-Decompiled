/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa5504
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int CRYPTO_THREAD_compare_id(pthread_t __thread1,pthread_t __thread2)

{
  int iVar1;
  
  iVar1 = pthread_equal(__thread1,__thread2);
  return iVar1;
}

