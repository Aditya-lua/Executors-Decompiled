/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ab0e0
 */

undefined4 FUN_008ab0e0(long param_1,uint param_2)

{
  undefined4 uVar1;
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
                    /* try { // try from 008ab1e0 to 008ab1e3 has its CatchHandler @ 008ab1f8 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      uVar3 = (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
    }
  }
  if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008ab1ac to 008ab1af has its CatchHandler @ 008ab1fc */
    DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
    __cxa_guard_release(&DAT_00d1f1e0);
  }
  if (uVar3 == (long)&DWORD_007f2ef0 + DAT_00d1f1d8) {
    uVar1 = 0xffffffff;
  }
  else {
    uVar1 = *(undefined4 *)(uVar3 + 0xc);
  }
  return uVar1;
}

