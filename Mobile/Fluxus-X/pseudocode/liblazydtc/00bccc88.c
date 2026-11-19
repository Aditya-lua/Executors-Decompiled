/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccc88
 */

/* std::__ndk1::mutex::unlock() */

int __thiscall std::__ndk1::mutex::unlock(mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bccc94 to 00bccc97 has its CatchHandler @ 00bccca4 */
  iVar1 = pthread_mutex_unlock((pthread_mutex_t *)this);
  return iVar1;
}

