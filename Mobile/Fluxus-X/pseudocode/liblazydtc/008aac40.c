/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aac40
 */

void FUN_008aac40(long param_1,uint param_2)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  
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
                    /* try { // try from 008aad24 to 008aad27 has its CatchHandler @ 008aad3c */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      puVar2 = (undefined8 *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  puVar3 = *(undefined8 **)(param_1 + 0x68);
  if (puVar2 < puVar3) {
    do {
      puVar4 = puVar3 + -2;
      puVar3[1] = puVar3[-1];
      *puVar3 = puVar3[-2];
      puVar3 = puVar4;
    } while (puVar2 < puVar4);
    puVar3 = *(undefined8 **)(param_1 + 0x68);
  }
  uVar5 = *puVar3;
  puVar2[1] = puVar3[1];
  *puVar2 = uVar5;
  return;
}

