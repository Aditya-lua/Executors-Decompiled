/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bcd04
 */

void FUN_008bcd04(undefined8 param_1,long param_2,int param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  double local_58;
  undefined4 local_4c;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_3 - 1U < *(uint *)(param_2 + 8)) {
    lVar3 = *(long *)(param_2 + 0x20) + (long)(int)(param_3 - 1U) * 0x10;
  }
  else {
    lVar3 = FUN_008bb19c(param_2,param_3);
    if ((DAT_00d1f1e0 & 1) == 0) {
      iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
      if (iVar2 != 0) {
                    /* try { // try from 008bcdfc to 008bcdff has its CatchHandler @ 008bce20 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
    }
    if (lVar3 == (long)&DWORD_007f2ef0 + DAT_00d1f1d8) {
      local_58 = (double)param_3;
      local_4c = 3;
      lVar3 = FUN_008bc2bc(param_1,param_2,&local_58,param_3);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar3);
  }
  return;
}

