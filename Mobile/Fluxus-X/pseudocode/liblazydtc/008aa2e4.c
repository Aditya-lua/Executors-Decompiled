/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa2e4
 */

ulong FUN_008aa2e4(long param_1,uint param_2)

{
  ulong uVar1;
  int iVar2;
  ulong uVar3;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      uVar3 = FUN_008aea7c();
    }
    else {
      uVar3 = *(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10;
    }
  }
  else {
    uVar3 = (*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10;
    if (*(ulong *)(param_1 + 0x68) <= uVar3) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008aa3d8 to 008aa3db has its CatchHandler @ 008aa3f0 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      uVar3 = (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
    }
  }
  if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008aa3a4 to 008aa3a7 has its CatchHandler @ 008aa3f4 */
    DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1f1e0);
  }
  uVar1 = 0;
  if (uVar3 != (long)&DWORD_007f2ef0 + DAT_00d1f1d8) {
    uVar1 = uVar3;
  }
  return uVar1;
}

