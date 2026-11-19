/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcce50
 */

/* std::__ndk1::timed_mutex::lock() */

ulong __thiscall std::__ndk1::timed_mutex::lock(timed_mutex *this)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  pthread_mutex_t *local_30;
  byte local_28;
  
  local_28 = 1;
  local_30 = (pthread_mutex_t *)this;
  iVar1 = pthread_mutex_lock((pthread_mutex_t *)this);
  if (iVar1 != 0) {
                    /* WARNING: Subroutine does not return */
    __throw_system_error(iVar1,"mutex lock failed");
  }
  if (((byte)this[0x58] & 1) == 0) {
    this[0x58] = (timed_mutex)0x1;
  }
  else {
    do {
      uVar3 = condition_variable::wait((condition_variable *)(this + 0x28),(unique_lock *)&local_30)
      ;
    } while (((byte)this[0x58] & 1) != 0);
    this[0x58] = (timed_mutex)0x1;
    if ((local_28 & 1) == 0) {
      return uVar3;
    }
  }
                    /* try { // try from 00bcceb8 to 00bccebb has its CatchHandler @ 00bccedc */
  uVar2 = pthread_mutex_unlock(local_30);
  return (ulong)uVar2;
}

