/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c336d0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pthread_setname_np(pthread_t __target_thread,char *__name)

{
  int iVar1;
  
  iVar1 = pthread_setname_np(__target_thread,__name);
  return iVar1;
}

