/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ad70c
 */

void FUN_008ad70c(long param_1,uint param_2)

{
  int iVar1;
  ulong uVar2;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      uVar2 = FUN_008aea7c(param_1);
    }
    else {
      uVar2 = *(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10;
    }
  }
  else {
    uVar2 = (*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10;
    if (*(ulong *)(param_1 + 0x68) <= uVar2) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008ad7c8 to 008ad7cb has its CatchHandler @ 008ad7e8 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      uVar2 = (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
    }
  }
  FUN_008cb374(param_1,uVar2,*(long *)(param_1 + 0x68) + -0x20,*(long *)(param_1 + 0x68) + -0x10);
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + -0x20;
  return;
}

