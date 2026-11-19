/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2560
 */

/* std::__ndk1::chrono::steady_clock::now() */

long std::__ndk1::chrono::steady_clock::now(void)

{
  int iVar1;
  int *piVar2;
  timespec local_20;
  
                    /* try { // try from 00bc2570 to 00bc25b3 has its CatchHandler @ 00bc25b4 */
  iVar1 = clock_gettime(1,&local_20);
  if (iVar1 != 0) {
    piVar2 = (int *)__errno();
                    /* WARNING: Subroutine does not return */
    __throw_system_error(*piVar2,"clock_gettime(CLOCK_MONOTONIC) failed");
  }
  return local_20.tv_nsec + local_20.tv_sec * 1000000000;
}

