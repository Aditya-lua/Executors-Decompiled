/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccdfc
 */

/* std::__ndk1::timed_mutex::~timed_mutex() */

void __thiscall std::__ndk1::timed_mutex::~timed_mutex(timed_mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bcce10 to 00bcce13 has its CatchHandler @ 00bcce4c */
  iVar1 = pthread_mutex_lock((pthread_mutex_t *)this);
  if (iVar1 != 0) {
                    /* try { // try from 00bcce3c to 00bcce47 has its CatchHandler @ 00bcce4c */
                    /* WARNING: Subroutine does not return */
    __throw_system_error(iVar1,"mutex lock failed");
  }
                    /* try { // try from 00bcce18 to 00bcce1f has its CatchHandler @ 00bcce48 */
  pthread_mutex_unlock((pthread_mutex_t *)this);
  condition_variable::~condition_variable((condition_variable *)(this + 0x28));
  mutex::~mutex((mutex *)this);
  return;
}

