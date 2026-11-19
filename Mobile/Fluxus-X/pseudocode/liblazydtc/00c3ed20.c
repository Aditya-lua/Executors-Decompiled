/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ed20
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_rwlock_destroy(pthread_rwlock_t *__rwlock)

{
  int iVar1;
  
  iVar1 = pthread_rwlock_destroy(__rwlock);
  return iVar1;
}

