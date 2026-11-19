/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccd4c
 */

/* std::__ndk1::recursive_mutex::~recursive_mutex() */

int __thiscall std::__ndk1::recursive_mutex::~recursive_mutex(recursive_mutex *this)

{
  int iVar1;
  
                    /* try { // try from 00bccd58 to 00bccd5b has its CatchHandler @ 00bccd68 */
  iVar1 = pthread_mutex_destroy((pthread_mutex_t *)this);
  return iVar1;
}

