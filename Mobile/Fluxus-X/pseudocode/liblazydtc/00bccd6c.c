/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccd6c
 */

/* std::__ndk1::recursive_mutex::lock() */

void __thiscall std::__ndk1::recursive_mutex::lock(recursive_mutex *this)

{
  int iVar1;
  
  iVar1 = pthread_mutex_lock((pthread_mutex_t *)this);
  if (iVar1 != 0) {
                    /* WARNING: Subroutine does not return */
    __throw_system_error(iVar1,"recursive_mutex lock failed");
  }
  return;
}

