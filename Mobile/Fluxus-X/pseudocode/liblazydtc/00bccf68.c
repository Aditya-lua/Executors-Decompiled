/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccf68
 */

/* std::__ndk1::timed_mutex::unlock() */

int __thiscall std::__ndk1::timed_mutex::unlock(timed_mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bccf7c to 00bccf7f has its CatchHandler @ 00bccfb8 */
  iVar1 = pthread_mutex_lock((pthread_mutex_t *)this);
  if (iVar1 != 0) {
                    /* try { // try from 00bccfa8 to 00bccfb3 has its CatchHandler @ 00bccfb8 */
                    /* WARNING: Subroutine does not return */
    __throw_system_error(iVar1,"mutex lock failed");
  }
  this[0x58] = (timed_mutex)0x0;
  condition_variable::notify_one((condition_variable *)(this + 0x28));
                    /* try { // try from 00bccf90 to 00bccf97 has its CatchHandler @ 00bccfb4 */
  iVar1 = pthread_mutex_unlock((pthread_mutex_t *)this);
  return iVar1;
}

