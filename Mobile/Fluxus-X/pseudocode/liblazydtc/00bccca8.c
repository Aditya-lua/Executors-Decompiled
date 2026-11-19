/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccca8
 */

/* std::__ndk1::recursive_mutex::recursive_mutex() */

void __thiscall std::__ndk1::recursive_mutex::recursive_mutex(recursive_mutex *this)

{
  int iVar1;
  int local_2c;
  pthread_mutexattr_t apStack_28 [2];
  
  local_2c = pthread_mutexattr_init(apStack_28);
  if (local_2c == 0) {
    local_2c = pthread_mutexattr_settype(apStack_28,1);
    if (local_2c == 0) {
      local_2c = pthread_mutex_init((pthread_mutex_t *)this,apStack_28);
      iVar1 = pthread_mutexattr_destroy(apStack_28);
      if (local_2c == 0) {
        if (iVar1 == 0) {
          return;
        }
        pthread_mutex_destroy((pthread_mutex_t *)this);
        local_2c = iVar1;
      }
    }
    else {
      pthread_mutexattr_destroy(apStack_28);
    }
  }
                    /* WARNING: Subroutine does not return */
  __throw_system_error(local_2c,"recursive_mutex constructor failed");
}

