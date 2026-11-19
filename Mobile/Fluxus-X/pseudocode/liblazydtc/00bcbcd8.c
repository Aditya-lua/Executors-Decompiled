/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcbcd8
 */

/* std::__ndk1::condition_variable::wait(std::__ndk1::unique_lock<std::__ndk1::mutex>&) */

void __thiscall std::__ndk1::condition_variable::wait(condition_variable *this,unique_lock *param_1)

{
  int iVar1;
  char *pcVar2;
  
  if (param_1[8] == (unique_lock)0x1) {
                    /* try { // try from 00bcbcf4 to 00bcbd23 has its CatchHandler @ 00bcbd24 */
    iVar1 = pthread_cond_wait((pthread_cond_t *)this,*(pthread_mutex_t **)param_1);
    if (iVar1 == 0) {
      return;
    }
    pcVar2 = "condition_variable wait failed";
  }
  else {
    pcVar2 = "condition_variable::wait: mutex not locked";
    iVar1 = 1;
  }
                    /* WARNING: Subroutine does not return */
  __throw_system_error(iVar1,pcVar2);
}

