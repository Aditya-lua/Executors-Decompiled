/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008abe60
 */

undefined8 FUN_008abe60(long param_1,uint param_2)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      puVar2 = (undefined8 *)FUN_008aea7c();
    }
    else {
      puVar2 = (undefined8 *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    puVar2 = (undefined8 *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
    if (*(undefined8 **)(param_1 + 0x68) <= puVar2) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008abf04 to 008abf07 has its CatchHandler @ 008abf1c */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      puVar2 = (undefined8 *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  if (*(int *)((long)puVar2 + 0xc) == 9) {
    uVar3 = *puVar2;
  }
  else {
    uVar3 = 0;
  }
  return uVar3;
}

