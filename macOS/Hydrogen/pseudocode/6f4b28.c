
ulong FUN_006f4b28(undefined4 *param_1)

{
  ulong uVar1;
  ulong uVar2;
  int iVar3;
  ulong in_x9;
  ulong uVar4;
  long in_x10;
  long unaff_x29;
  
  uVar2 = (long)param_1 + in_x9 + 3;
  *param_1 = *(undefined4 *)(in_x10 + 0x468 + (in_x9 ^ 1));
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -8)) {
    return uVar2;
  }
  uVar2 = ___stack_chk_fail(uVar2);
  iVar3 = -1;
  if (0xff < (uint)uVar2) {
    uVar4 = uVar2;
    do {
      iVar3 = iVar3 + 8;
      uVar2 = uVar4 >> 8 & 0xffffff;
      uVar1 = uVar4 & 0xffff0000;
      uVar4 = uVar2;
    } while (uVar1 != 0);
  }
  return (ulong)(iVar3 + (uint)(byte)(&UNK_008c81d2)[uVar2 & 0xffffffff]);
}

