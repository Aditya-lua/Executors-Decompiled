/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccd98
 */

/* std::__ndk1::recursive_mutex::unlock() */

int __thiscall std::__ndk1::recursive_mutex::unlock(recursive_mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bccda4 to 00bccda7 has its CatchHandler @ 00bccdb4 */
  iVar1 = pthread_mutex_unlock((pthread_mutex_t *)this);
  return iVar1;
}

