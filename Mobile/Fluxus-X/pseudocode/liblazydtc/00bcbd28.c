/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbd28
 */

/* std::__ndk1::condition_variable::__do_timed_wait(std::__ndk1::unique_lock<std::__ndk1::mutex>&,
   std::__ndk1::chrono::time_point<std::__ndk1::chrono::system_clock,
   std::__ndk1::chrono::duration<long long, std::__ndk1::ratio<1l, 1000000000l> > >) */

void __thiscall
std::__ndk1::condition_variable::__do_timed_wait
          (condition_variable *this,undefined8 *param_1,long param_3)

{
  int iVar1;
  char *pcVar2;
  timespec local_20;
  
  if (*(char *)(param_1 + 1) == '\x01') {
    if (0x59682f000000e940 < param_3) {
      param_3 = 0x59682f000000e941;
    }
    local_20.tv_sec = param_3 / 1000000000;
    local_20.tv_nsec = param_3 % 1000000000;
                    /* try { // try from 00bcbd88 to 00bcbdc7 has its CatchHandler @ 00bcbdc8 */
    iVar1 = pthread_cond_timedwait((pthread_cond_t *)this,(pthread_mutex_t *)*param_1,&local_20);
    if ((iVar1 == 0) || (iVar1 == 0x6e)) {
      return;
    }
    pcVar2 = "condition_variable timed_wait failed";
  }
  else {
    pcVar2 = "condition_variable::timed wait: mutex not locked";
    iVar1 = 1;
  }
                    /* WARNING: Subroutine does not return */
  __throw_system_error(iVar1,pcVar2);
}

