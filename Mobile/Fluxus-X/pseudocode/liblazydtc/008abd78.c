/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008abd78
 */

long FUN_008abd78(long param_1,uint param_2)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      plVar2 = (long *)FUN_008aea7c();
    }
    else {
      plVar2 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    plVar2 = (long *)(*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10 + -0x10);
    if (*(long **)(param_1 + 0x68) <= plVar2) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008abe30 to 008abe33 has its CatchHandler @ 008abe48 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      plVar2 = (long *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  if (*(int *)((long)plVar2 + 0xc) == 2) {
    lVar3 = *plVar2;
  }
  else if (*(int *)((long)plVar2 + 0xc) == 8) {
    lVar3 = *plVar2 + 0x10;
  }
  else {
    lVar3 = 0;
  }
  return lVar3;
}

