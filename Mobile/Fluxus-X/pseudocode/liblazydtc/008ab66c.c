/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ab66c
 */

void FUN_008ab66c(long param_1,uint param_2,undefined4 *param_3)

{
  long lVar1;
  int iVar2;
  double *pdVar3;
  undefined4 uVar4;
  undefined1 auStack_48 [16];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      pdVar3 = (double *)FUN_008aea7c();
    }
    else {
      pdVar3 = (double *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    pdVar3 = (double *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
    if (*(double **)(param_1 + 0x68) <= pdVar3) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008ab764 to 008ab767 has its CatchHandler @ 008ab784 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      pdVar3 = (double *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  if ((*(int *)((long)pdVar3 + 0xc) == 3) ||
     (pdVar3 = (double *)FUN_008cacb4(pdVar3,auStack_48), pdVar3 != (double *)0x0)) {
    iVar2 = (int)*pdVar3;
    if (param_3 == (undefined4 *)0x0) goto LAB_008ab718;
    uVar4 = 1;
  }
  else {
    uVar4 = 0;
    iVar2 = 0;
    if (param_3 == (undefined4 *)0x0) goto LAB_008ab718;
  }
  *param_3 = uVar4;
LAB_008ab718:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar2);
  }
  return;
}

