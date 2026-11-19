/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ab238
 */

bool FUN_008ab238(long param_1,uint param_2)

{
  bool bVar1;
  int iVar2;
  long *plVar3;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      plVar3 = (long *)FUN_008aea7c();
    }
    else {
      plVar3 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    plVar3 = (long *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
    if (*(long **)(param_1 + 0x68) <= plVar3) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008ab2e8 to 008ab2eb has its CatchHandler @ 008ab300 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      plVar3 = (long *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  if (*(int *)((long)plVar3 + 0xc) == 7) {
    bVar1 = *(char *)(*plVar3 + 6) != '\0';
  }
  else {
    bVar1 = false;
  }
  return bVar1;
}

