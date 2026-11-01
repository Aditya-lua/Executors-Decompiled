
ulong FUN_006f4a48(long param_1,long param_2)

{
  char *pcVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  long in_x9;
  ulong uVar6;
  undefined8 *in_x11;
  int in_w12;
  int in_w13;
  long unaff_x29;
  undefined8 uVar7;
  undefined8 uVar8;
  
  *(undefined4 *)(param_2 + 2) = 0x30303030;
  *(undefined1 *)(param_2 + 1) = 0x2e;
  *(undefined1 *)(param_2 + 6) = 0x30;
  puVar2 = (undefined8 *)(param_2 + 2 + (ulong)(uint)-in_w12);
  uVar8 = in_x11[1];
  uVar7 = *in_x11;
  *(undefined1 *)(puVar2 + 2) = *(undefined1 *)(in_x11 + 2);
  puVar2[1] = uVar8;
  *puVar2 = uVar7;
  uVar4 = in_x9 + in_w13 + param_1 + (ulong)(uint)-in_w12 + 3;
  do {
    pcVar1 = (char *)(uVar4 - 2);
    uVar4 = uVar4 - 1;
  } while (*pcVar1 == '0');
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -8)) {
    return uVar4;
  }
  uVar4 = ___stack_chk_fail();
  iVar5 = -1;
  if (0xff < (uint)uVar4) {
    uVar6 = uVar4;
    do {
      iVar5 = iVar5 + 8;
      uVar4 = uVar6 >> 8 & 0xffffff;
      uVar3 = uVar6 & 0xffff0000;
      uVar6 = uVar4;
    } while (uVar3 != 0);
  }
  return (ulong)(iVar5 + (uint)(byte)(&UNK_008c81d2)[uVar4 & 0xffffffff]);
}

