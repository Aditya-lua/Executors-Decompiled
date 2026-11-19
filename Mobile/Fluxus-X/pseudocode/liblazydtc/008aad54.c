/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aad54
 */

void FUN_008aad54(long param_1,uint param_2)

{
  int iVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
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
                    /* try { // try from 008aaecc to 008aaecf has its CatchHandler @ 008aaeec */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      puVar2 = (undefined8 *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  if (param_2 == 0xffffd8ee) {
    *(undefined8 *)(param_1 + 0x78) = *(undefined8 *)(*(long *)(param_1 + 0x68) + -0x10);
  }
  else {
    if (param_2 == 0xffffd8ef) {
      iVar1 = *(int *)(*(long *)(param_1 + 0x68) + -4);
      lVar4 = *(long *)(*(long *)(param_1 + 0x68) + -0x10);
      lVar3 = **(long **)(*(long *)(param_1 + 0x50) + 8);
      *(long *)(lVar3 + 0x10) = lVar4;
      if ((iVar1 < 5) || ((*(byte *)(lVar3 + 2) >> 2 & 1) == 0)) goto LAB_008aae94;
    }
    else {
      uVar5 = *(undefined8 *)(*(long *)(param_1 + 0x68) + -0x10);
      puVar2[1] = *(undefined8 *)(*(long *)(param_1 + 0x68) + -8);
      *puVar2 = uVar5;
      if (((-0x2713 < (int)param_2) || (*(int *)(*(long *)(param_1 + 0x68) + -4) < 5)) ||
         ((*(byte *)(**(long **)(*(long *)(param_1 + 0x50) + 8) + 2) >> 2 & 1) == 0))
      goto LAB_008aae94;
      lVar4 = *(long *)(*(long *)(param_1 + 0x68) + -0x10);
    }
    if ((*(byte *)(lVar4 + 2) & 3) != 0) {
      FUN_008b6188(param_1);
    }
  }
LAB_008aae94:
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + -0x10;
  return;
}

