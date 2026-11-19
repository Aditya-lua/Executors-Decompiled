/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccc60
 */

/* std::__ndk1::mutex::try_lock() */

bool __thiscall std::__ndk1::mutex::try_lock(mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bccc6c to 00bccc6f has its CatchHandler @ 00bccc84 */
  iVar1 = pthread_mutex_trylock((pthread_mutex_t *)this);
  return iVar1 == 0;
}

