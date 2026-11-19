/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941cb8
 */

void FUN_00941cb8(void)

{
  long lVar1;
  int iVar2;
  timespec local_48;
  timeval local_38;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  iVar2 = clock_gettime(4,&local_48);
  if ((iVar2 == 0) || (iVar2 = clock_gettime(1,&local_48), iVar2 == 0)) {
    local_38.tv_sec = local_48.tv_sec;
  }
  else {
    gettimeofday(&local_38,(__timezone_ptr_t)0x0);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_38.tv_sec);
  }
  return;
}

