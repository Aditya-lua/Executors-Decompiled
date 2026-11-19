/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccdb8
 */

/* std::__ndk1::recursive_mutex::try_lock() */

bool __thiscall std::__ndk1::recursive_mutex::try_lock(recursive_mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bccdc4 to 00bccdc7 has its CatchHandler @ 00bccddc */
  iVar1 = pthread_mutex_trylock((pthread_mutex_t *)this);
  return iVar1 == 0;
}

