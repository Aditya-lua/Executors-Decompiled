/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc31e8
 */

/* std::__ndk1::__sp_mut::unlock() */

int __thiscall std::__ndk1::__sp_mut::unlock(__sp_mut *this)

{
  int iVar1;
  
                    /* try { // try from 00bc31f8 to 00bc31fb has its CatchHandler @ 00bc3208 */
  iVar1 = pthread_mutex_unlock(*(pthread_mutex_t **)this);
  return iVar1;
}

