/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ab8a4
 */

long FUN_008ab8a4(long param_1,uint param_2,ulong *param_3)

{
  int iVar1;
  ulong uVar2;
  long *plVar3;
  
  uVar2 = (ulong)param_2;
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      plVar3 = (long *)FUN_008aea7c(param_1,uVar2);
    }
    else {
      plVar3 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    plVar3 = (long *)(*(long *)(param_1 + 0x70) + uVar2 * 0x10 + -0x10);
    if (*(long **)(param_1 + 0x68) <= plVar3) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008aba34 to 008aba37 has its CatchHandler @ 008aba84 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      plVar3 = (long *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  if (*(int *)((long)plVar3 + 0xc) != 5) {
    if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
      FUN_008b63a4(param_1,param_1,param_1 + 0x38);
    }
    iVar1 = FUN_008cad40(param_1,plVar3);
    if (iVar1 == 0) {
      if (param_3 == (ulong *)0x0) {
        return 0;
      }
      *param_3 = 0;
      return 0;
    }
    if (*(ulong *)(*(long *)(param_1 + 0x60) + 8) <= *(ulong *)(*(long *)(param_1 + 0x60) + 0x10)) {
      FUN_008b52c4(param_1,1);
    }
    if ((int)param_2 < 1) {
      if ((int)param_2 < -9999) {
        plVar3 = (long *)FUN_008aea7c(param_1,param_2);
      }
      else {
        plVar3 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
      }
    }
    else {
      plVar3 = (long *)(*(long *)(param_1 + 0x70) + uVar2 * 0x10 + -0x10);
      if (*(long **)(param_1 + 0x68) <= plVar3) {
        if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008aba68 to 008aba6b has its CatchHandler @ 008aba80 */
          DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
          __cxa_guard_release(&DAT_00d1f1e0);
        }
        plVar3 = (long *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
      }
    }
  }
  if (param_3 != (ulong *)0x0) {
    *param_3 = (ulong)*(uint *)(*plVar3 + 0x14);
  }
  return *plVar3 + 0x18;
}

