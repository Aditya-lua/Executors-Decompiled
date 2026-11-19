/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ad3d0
 */

void FUN_008ad3d0(long param_1,uint param_2,int param_3)

{
  int iVar1;
  long *plVar2;
  
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
      if ((DAT_00d1f1e0 & 1) == 0) {
        iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0);
        if (iVar1 != 0) {
                    /* try { // try from 008ad47c to 008ad47f has its CatchHandler @ 008ad498 */
          DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
          __cxa_guard_release(&DAT_00d1f1e0);
        }
      }
      plVar2 = (long *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  *(bool *)(*plVar2 + 3) = param_3 != 0;
  return;
}

