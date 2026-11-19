/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008acdb8
 */

undefined4 FUN_008acdb8(long param_1,uint param_2)

{
  int iVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 uVar4;
  
  if ((*(byte *)(param_1 + 2) >> 2 & 1) != 0) {
    FUN_008b63a4(param_1,param_1,param_1 + 0x38);
  }
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      puVar2 = (undefined8 *)FUN_008aea7c(param_1,param_2);
    }
    else {
      puVar2 = (undefined8 *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    puVar2 = (undefined8 *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
    if (*(undefined8 **)(param_1 + 0x68) <= puVar2) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar1 != 0)) {
                    /* try { // try from 008ace90 to 008ace93 has its CatchHandler @ 008acea8 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      puVar2 = (undefined8 *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  puVar2 = (undefined8 *)FUN_008bb604(*puVar2,*(long *)(param_1 + 0x68) + -0x10);
  lVar3 = *(long *)(param_1 + 0x68);
  uVar4 = *puVar2;
  *(undefined8 *)(lVar3 + -8) = puVar2[1];
  *(undefined8 *)(lVar3 + -0x10) = uVar4;
  return *(undefined4 *)(*(long *)(param_1 + 0x68) + -4);
}

