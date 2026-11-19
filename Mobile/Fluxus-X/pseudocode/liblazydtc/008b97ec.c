/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b97ec
 */

undefined1  [16] FUN_008b97ec(void)

{
  long lVar1;
  int iVar2;
  undefined1 auVar3 [16];
  timespec local_38;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1fb60 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1fb60), iVar2 != 0)) {
    DAT_00d1fb58 = 1e-09;
    __cxa_guard_release(&DAT_00d1fb60);
  }
  iVar2 = clock_gettime(1,&local_38);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar2);
  }
  auVar3._0_8_ = ((double)local_38.tv_nsec + (double)local_38.tv_sec * 1000000000.0) * DAT_00d1fb58;
  auVar3._8_8_ = 0;
  return auVar3;
}

