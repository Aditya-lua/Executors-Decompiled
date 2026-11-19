/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd3f0
 */

void FUN_00bcd3f0(pthread_key_t *param_1)

{
  int iVar1;
  
  iVar1 = pthread_key_create(param_1,(__destr_function *)&LAB_00bcd75c);
  if (iVar1 != 0) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__throw_system_error(iVar1,"__thread_specific_ptr construction failed");
  }
  return;
}

