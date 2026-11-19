/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ab7b0
 */

bool FUN_008ab7b0(long param_1,uint param_2)

{
  bool bVar1;
  int iVar2;
  int *piVar3;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      piVar3 = (int *)FUN_008aea7c();
      iVar2 = piVar3[3];
      if (iVar2 == 0) {
        return false;
      }
      goto LAB_008ab820;
    }
    piVar3 = (int *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
  }
  else {
    piVar3 = (int *)(*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10 + -0x10);
    if (*(int **)(param_1 + 0x68) <= piVar3) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008ab874 to 008ab877 has its CatchHandler @ 008ab88c */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      piVar3 = (int *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
      iVar2 = *(int *)((long)&QWORD_007f2ef9 + DAT_00d1f1d8 + 3);
      if (iVar2 == 0) {
        return false;
      }
      goto LAB_008ab820;
    }
  }
  iVar2 = piVar3[3];
  if (iVar2 == 0) {
    return false;
  }
LAB_008ab820:
  if (iVar2 == 1) {
    bVar1 = *piVar3 != 0;
  }
  else {
    bVar1 = true;
  }
  return bVar1;
}

