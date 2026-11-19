/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3ed30
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_rwlock_init(pthread_rwlock_t *__rwlock,pthread_rwlockattr_t *__attr)

{
  int iVar1;
  
  iVar1 = pthread_rwlock_init(__rwlock,__attr);
  return iVar1;
}

