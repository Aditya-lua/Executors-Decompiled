/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd2ec
 */

/* std::__ndk1::this_thread::sleep_for(std::__ndk1::chrono::duration<long long,
   std::__ndk1::ratio<1l, 1000000000l> > const&) */

void std::__ndk1::this_thread::sleep_for(duration *param_1)

{
  int iVar1;
  int *piVar2;
  timespec local_20;
  
  local_20.tv_nsec = *(long *)param_1;
  if (0 < local_20.tv_nsec) {
    local_20.tv_sec = (ulong)local_20.tv_nsec / 1000000000;
    local_20.tv_nsec = (ulong)local_20.tv_nsec % 1000000000;
    do {
      iVar1 = nanosleep(&local_20,&local_20);
      if (iVar1 != -1) {
        return;
      }
      piVar2 = (int *)__errno();
    } while (*piVar2 == 4);
  }
  return;
}

