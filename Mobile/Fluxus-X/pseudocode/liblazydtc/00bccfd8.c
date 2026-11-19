/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccfd8
 */

/* std::__ndk1::recursive_timed_mutex::~recursive_timed_mutex() */

void __thiscall
std::__ndk1::recursive_timed_mutex::~recursive_timed_mutex(recursive_timed_mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bccfec to 00bccfef has its CatchHandler @ 00bcd028 */
  iVar1 = pthread_mutex_lock((pthread_mutex_t *)this);
  if (iVar1 != 0) {
                    /* try { // try from 00bcd018 to 00bcd023 has its CatchHandler @ 00bcd028 */
                    /* WARNING: Subroutine does not return */
    __throw_system_error(iVar1,"mutex lock failed");
  }
                    /* try { // try from 00bccff4 to 00bccffb has its CatchHandler @ 00bcd024 */
  pthread_mutex_unlock((pthread_mutex_t *)this);
  condition_variable::~condition_variable((condition_variable *)(this + 0x28));
  mutex::~mutex((mutex *)this);
  return;
}

