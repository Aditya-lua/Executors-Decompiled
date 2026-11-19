/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ab528
 */

void FUN_008ab528(long param_1,uint param_2,undefined4 *param_3)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  undefined1 auStack_48 [16];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      puVar3 = (undefined8 *)FUN_008aea7c();
    }
    else {
      puVar3 = (undefined8 *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    puVar3 = (undefined8 *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
    if (*(undefined8 **)(param_1 + 0x68) <= puVar3) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008ab620 to 008ab623 has its CatchHandler @ 008ab640 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      puVar3 = (undefined8 *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  if ((*(int *)((long)puVar3 + 0xc) == 3) ||
     (puVar3 = (undefined8 *)FUN_008cacb4(puVar3,auStack_48), puVar3 != (undefined8 *)0x0)) {
    if (param_3 != (undefined4 *)0x0) {
      *param_3 = 1;
    }
    uVar4 = *puVar3;
  }
  else {
    uVar4 = 0;
    if (param_3 != (undefined4 *)0x0) {
      *param_3 = 0;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

