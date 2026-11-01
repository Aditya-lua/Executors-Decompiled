
void FUN_000c3374(long param_1)

{
  uint uVar1;
  ulong in_x9;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  
  lVar2 = 0;
  uVar3 = in_x9;
  do {
    uVar1 = (int)uVar3 - 1;
    uVar3 = (ulong)uVar1;
    if (*(long *)(param_1 + uVar3 * 8) == unaff_x19) {
      uVar1 = 1 - (int)lVar2;
      _memmove(param_1 + uVar3 * 8,param_1 + (in_x9 & 0xffffffff) * 8 + lVar2 * 8,
               -(ulong)(uVar1 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar1 << 3);
      *(long *)(*(long *)(&UNK_00003fa8 + unaff_x20) + (long)*(int *)(&UNK_00003fa0 + unaff_x20) * 8
               + -8) = unaff_x19;
      return;
    }
    lVar2 = lVar2 + -1;
  } while (0 < (int)uVar1);
  return;
}

