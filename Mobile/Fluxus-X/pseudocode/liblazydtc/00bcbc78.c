/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbc78
 */

/* std::__ndk1::condition_variable::~condition_variable() */

int __thiscall std::__ndk1::condition_variable::~condition_variable(condition_variable *this)

{
  int iVar1;
  
                    /* try { // try from 00bcbc84 to 00bcbc87 has its CatchHandler @ 00bcbc94 */
  iVar1 = pthread_cond_destroy((pthread_cond_t *)this);
  return iVar1;
}

