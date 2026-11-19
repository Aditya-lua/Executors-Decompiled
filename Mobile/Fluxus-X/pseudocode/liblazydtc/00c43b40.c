/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43b40
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_mutex_trylock(pthread_mutex_t *__mutex)

{
  int iVar1;
  
  iVar1 = pthread_mutex_trylock(__mutex);
  return iVar1;
}

