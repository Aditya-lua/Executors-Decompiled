/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7b320
 */

void mbedtls_ms_time(void)

{
  long lVar1;
  int iVar2;
  time_t tVar3;
  long lVar4;
  timespec local_38;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  iVar2 = clock_gettime(7,&local_38);
  if (iVar2 == 0) {
    lVar4 = local_38.tv_nsec / 1000000 + local_38.tv_sec * 1000;
  }
  else {
    tVar3 = time((time_t *)0x0);
    lVar4 = tVar3 * 1000;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar4);
  }
  return;
}

