/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008abc64
 */

ulong FUN_008abc64(long param_1,uint param_2)

{
  int iVar1;
  long *plVar2;
  ulong uVar3;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      plVar2 = (long *)FUN_008aea7c();
    }
    else {
      plVar2 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    plVar2 = (long *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
    if (*(long **)(param_1 + 0x68) <= plVar2) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008abd48 to 008abd4b has its CatchHandler @ 008abd60 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      plVar2 = (long *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  iVar1 = *(int *)((long)plVar2 + 0xc);
  uVar3 = 0;
  if (iVar1 < 8) {
    if (iVar1 == 5) {
      uVar3 = (ulong)*(uint *)(*plVar2 + 0x14);
    }
    else if (iVar1 == 6) {
      uVar3 = FUN_008bcf64(*plVar2);
      return uVar3;
    }
  }
  else if ((iVar1 == 8) || (iVar1 == 10)) {
    uVar3 = (ulong)*(uint *)(*plVar2 + 4);
  }
  return uVar3;
}

