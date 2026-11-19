/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbcb8
 */

/* std::__ndk1::condition_variable::notify_all() */

int __thiscall std::__ndk1::condition_variable::notify_all(condition_variable *this)

{
  int iVar1;
  
                    /* try { // try from 00bcbcc4 to 00bcbcc7 has its CatchHandler @ 00bcbcd4 */
  iVar1 = pthread_cond_broadcast((pthread_cond_t *)this);
  return iVar1;
}

