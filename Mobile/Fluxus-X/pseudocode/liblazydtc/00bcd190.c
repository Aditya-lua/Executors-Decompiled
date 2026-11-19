/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd190
 */

/* std::__ndk1::recursive_timed_mutex::unlock() */

ulong __thiscall std::__ndk1::recursive_timed_mutex::unlock(recursive_timed_mutex *this)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  long lVar4;
  
                    /* try { // try from 00bcd1a4 to 00bcd1a7 has its CatchHandler @ 00bcd208 */
  iVar1 = pthread_mutex_lock((pthread_mutex_t *)this);
  if (iVar1 != 0) {
                    /* try { // try from 00bcd1f4 to 00bcd1ff has its CatchHandler @ 00bcd208 */
                    /* WARNING: Subroutine does not return */
    __throw_system_error(iVar1,"mutex lock failed");
  }
  lVar4 = *(long *)(this + 0x58);
  *(long *)(this + 0x58) = lVar4 + -1;
  if (lVar4 + -1 == 0) {
    *(undefined8 *)(this + 0x60) = 0;
                    /* try { // try from 00bcd1d8 to 00bcd1df has its CatchHandler @ 00bcd200 */
    pthread_mutex_unlock((pthread_mutex_t *)this);
    uVar3 = condition_variable::notify_one((condition_variable *)(this + 0x28));
    return uVar3;
  }
                    /* try { // try from 00bcd1bc to 00bcd1c3 has its CatchHandler @ 00bcd204 */
  uVar2 = pthread_mutex_unlock((pthread_mutex_t *)this);
  return (ulong)uVar2;
}

