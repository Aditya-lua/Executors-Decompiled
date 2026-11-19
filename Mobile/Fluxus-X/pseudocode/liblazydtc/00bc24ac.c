/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc24ac
 */

/* std::__ndk1::chrono::system_clock::now() */

long std::__ndk1::chrono::system_clock::now(void)

{
  int iVar1;
  int *piVar2;
  timespec local_20;
  
                    /* try { // try from 00bc24bc to 00bc251f has its CatchHandler @ 00bc2520 */
  iVar1 = clock_gettime(0,&local_20);
  if (iVar1 != 0) {
    piVar2 = (int *)__errno();
                    /* WARNING: Subroutine does not return */
    __throw_system_error(*piVar2,"clock_gettime(CLOCK_REALTIME) failed");
  }
  return local_20.tv_nsec / 1000 + local_20.tv_sec * 1000000;
}

