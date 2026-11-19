/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd02c
 */

/* std::__ndk1::recursive_timed_mutex::lock() */

ulong __thiscall std::__ndk1::recursive_timed_mutex::lock(recursive_timed_mutex *this)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  pthread_t pVar4;
  ulong uVar5;
  pthread_mutex_t *local_30;
  byte local_28;
  
  pVar4 = pthread_self();
  local_28 = 1;
  local_30 = (pthread_mutex_t *)this;
  iVar2 = pthread_mutex_lock((pthread_mutex_t *)this);
  if (iVar2 != 0) {
                    /* WARNING: Subroutine does not return */
    __throw_system_error(iVar2,"mutex lock failed");
  }
  lVar1 = *(long *)(this + 0x58);
  if (*(pthread_t *)(this + 0x60) == pVar4) {
    if (lVar1 == -1) {
                    /* try { // try from 00bcd0e0 to 00bcd0ef has its CatchHandler @ 00bcd0f0 */
                    /* WARNING: Subroutine does not return */
      __throw_system_error(0xb,"recursive_timed_mutex lock limit reached");
    }
    *(long *)(this + 0x58) = lVar1 + 1;
  }
  else if (lVar1 == 0) {
    *(undefined8 *)(this + 0x58) = 1;
    *(pthread_t *)(this + 0x60) = pVar4;
  }
  else {
    do {
      uVar5 = condition_variable::wait((condition_variable *)(this + 0x28),(unique_lock *)&local_30)
      ;
    } while (*(long *)(this + 0x58) != 0);
    *(undefined8 *)(this + 0x58) = 1;
    *(pthread_t *)(this + 0x60) = pVar4;
    if ((local_28 & 1) == 0) {
      return uVar5;
    }
  }
                    /* try { // try from 00bcd0bc to 00bcd0bf has its CatchHandler @ 00bcd104 */
  uVar3 = pthread_mutex_unlock(local_30);
  return (ulong)uVar3;
}

