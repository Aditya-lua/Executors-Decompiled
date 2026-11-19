/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ab318
 */

void FUN_008ab318(long param_1,uint param_2)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  undefined1 auStack_38 [16];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      uVar4 = FUN_008aea7c();
    }
    else {
      uVar4 = *(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10;
    }
  }
  else {
    uVar4 = (*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10;
    if (*(ulong *)(param_1 + 0x68) <= uVar4) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar3 != 0)) {
                    /* try { // try from 008ab3f0 to 008ab3f3 has its CatchHandler @ 008ab410 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      uVar4 = (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
    }
  }
  if (*(int *)(uVar4 + 0xc) == 3) {
    bVar2 = true;
  }
  else {
    lVar5 = FUN_008cacb4(uVar4,auStack_38);
    bVar2 = lVar5 != 0;
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(bVar2);
  }
  return;
}

