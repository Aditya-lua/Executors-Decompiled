
undefined4 FUN_00430a14(long param_1)

{
  uint uVar1;
  ulong uVar2;
  byte bVar3;
  byte *pbVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x26;
  long unaff_x28;
  ulong in_stack_00000008;
  
  if (param_1 == 0) {
    uVar6 = 1;
  }
  else {
    uVar5 = 0;
    uVar6 = 0;
    pbVar4 = (byte *)(unaff_x28 + unaff_x26 + param_1 + -1);
    do {
      bVar3 = *pbVar4;
      uVar5 = ((ulong)bVar3 & 0x7f) << (uVar6 & 0x3f) | uVar5;
      uVar1 = (int)uVar6 + 7;
      uVar6 = (ulong)uVar1;
      pbVar4 = pbVar4 + 1;
    } while ((char)bVar3 < '\0');
    uVar2 = 0;
    if (0x3f < bVar3 && uVar1 < 0x40) {
      uVar2 = -1L << (uVar6 & 0x3f);
    }
    uVar6 = 2;
    if ((long)(uVar5 | uVar2) < 1) {
      uVar6 = 3;
    }
    if ((uVar5 | uVar2) == 0) {
      uVar6 = 1;
    }
  }
  if ((in_stack_00000008 & 0x100000000) != 0) {
    return *(undefined4 *)(&UNK_00888198 + uVar6 * 4);
  }
  if (uVar6 < 3) {
    if (1 < uVar6 - 1) {
      return 8;
    }
  }
  else {
    if (uVar6 != 3) {
      return 2;
    }
    if ((in_stack_00000008._4_4_ >> 3 & 1) != 0) {
      return 8;
    }
  }
  __Unwind_SetGR();
  __Unwind_SetGR();
  __Unwind_SetIP();
  return 7;
}

