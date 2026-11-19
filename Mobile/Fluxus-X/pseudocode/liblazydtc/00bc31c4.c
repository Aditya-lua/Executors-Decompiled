/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc31c4
 */

/* std::__ndk1::__sp_mut::lock() */

int __thiscall std::__ndk1::__sp_mut::lock(__sp_mut *this)

{
  int iVar1;
  
                    /* try { // try from 00bc31d4 to 00bc31d7 has its CatchHandler @ 00bc31e4 */
  iVar1 = pthread_mutex_lock(*(pthread_mutex_t **)this);
  return iVar1;
}

