/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbc98
 */

/* std::__ndk1::condition_variable::notify_one() */

int __thiscall std::__ndk1::condition_variable::notify_one(condition_variable *this)

{
  int iVar1;
  
                    /* try { // try from 00bcbca4 to 00bcbca7 has its CatchHandler @ 00bcbcb4 */
  iVar1 = pthread_cond_signal((pthread_cond_t *)this);
  return iVar1;
}

