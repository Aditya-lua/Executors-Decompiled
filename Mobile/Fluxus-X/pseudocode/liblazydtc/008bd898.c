/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bd898
 */

long FUN_008bd898(undefined8 param_1,long param_2,double *param_3,uint param_4)

{
  long lVar1;
  long lVar2;
  int iVar3;
  uint uVar4;
  
  if (((((param_4 & 1) != 0) && (*(int *)((long)param_3 + 0xc) == 3)) &&
      (iVar3 = (int)*param_3, *param_3 == (double)iVar3)) &&
     (uVar4 = iVar3 - 1, uVar4 < *(uint *)(param_2 + 8))) {
    return *(long *)(param_2 + 0x20) + (long)(int)uVar4 * 0x10;
  }
  lVar1 = FUN_008bd784(param_2,param_3);
  if (*(int *)(lVar1 + 0xc) == 0) {
    if (((DAT_00d1fc90 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1fc90), iVar3 != 0)) {
                    /* try { // try from 008bda14 to 008bda17 has its CatchHandler @ 008bda38 */
      DAT_00d1fc88 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1fc90);
    }
    if (lVar1 != (long)&DWORD_007f3700 + DAT_00d1fc88) goto LAB_008bd97c;
  }
  uVar4 = *(uint *)(param_2 + 0xc);
  do {
    if ((int)uVar4 < 1) {
      lVar2 = 0;
      break;
    }
    uVar4 = uVar4 - 1;
    *(uint *)(param_2 + 0xc) = uVar4;
    lVar2 = *(long *)(param_2 + 0x28) + (ulong)uVar4 * 0x20;
  } while ((*(byte *)(lVar2 + 0x1c) & 0xf) != 0);
  lVar1 = FUN_008bda50(param_2,lVar1,lVar2);
LAB_008bd97c:
  *(double *)(lVar1 + 0x10) = *param_3;
  *(undefined4 *)(lVar1 + 0x18) = *(undefined4 *)(param_3 + 1);
  *(uint *)(lVar1 + 0x1c) =
       *(uint *)(lVar1 + 0x1c) & 0xfffffff0 | *(uint *)((long)param_3 + 0xc) & 0xf;
  if (((4 < *(int *)((long)param_3 + 0xc)) && ((*(byte *)(param_2 + 2) >> 2 & 1) != 0)) &&
     ((*(byte *)((long)*param_3 + 2) & 3) != 0)) {
    FUN_008b6370(param_1,param_2);
  }
  return lVar1;
}

