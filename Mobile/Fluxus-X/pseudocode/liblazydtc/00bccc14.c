/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccc14
 */

/* std::__ndk1::mutex::~mutex() */

int __thiscall std::__ndk1::mutex::~mutex(mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bccc20 to 00bccc23 has its CatchHandler @ 00bccc30 */
  iVar1 = pthread_mutex_destroy((pthread_mutex_t *)this);
  return iVar1;
}

