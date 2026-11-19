/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43ae0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_cond_timedwait(pthread_cond_t *__cond,pthread_mutex_t *__mutex,timespec *__abstime)

{
  int iVar1;
  
  iVar1 = pthread_cond_timedwait(__cond,__mutex,__abstime);
  return iVar1;
}

