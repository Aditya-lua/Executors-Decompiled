
ulong FUN_0036f2c8(void)

{
  int iVar1;
  uint uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  ulong uVar5;
  uint in_w8;
  undefined1 auVar6 [16];
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  
  if (in_w8 < 0x3e4) {
    return (ulong)*(uint *)(&UNK_009cf110 + (ulong)in_w8 * 0x28);
  }
  auVar6 = _abort();
  uVar2 = *auVar6._8_8_ - 1;
  if (0x3e3 < uVar2) {
    uVar4 = _abort();
    uVar5 = func_0x00283ac4();
    if (uVar5 >> 0x1f == 0) {
      uStack_40 = 0;
      uStack_58 = 0;
      uStack_60 = 0;
      uStack_48 = 0;
      uStack_50 = 0;
      uStack_48 = func_0x00283abc(uVar4);
      uVar3 = func_0x00283ac4(uVar4);
      uStack_50 = CONCAT44(uVar3,(undefined4)uStack_50);
      uVar5 = func_0x0036f210(&uStack_60);
      return uVar5;
    }
    return 0;
  }
  iVar1 = *(int *)(auVar6._0_8_ + 0x14);
  if (iVar1 < *(int *)(&UNK_009cf114 + (ulong)uVar2 * 0x28)) {
    return 0xffffffff;
  }
  if (*(int *)(&UNK_009cf114 + (ulong)uVar2 * 0x28) < iVar1) {
    return 1;
  }
  if (iVar1 == 0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x007b3820. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar5 = (*(code *)PTR__memcmp_00a250b0)
                    (*(undefined8 *)(auVar6._0_8_ + 0x18),
                     *(undefined8 *)(&UNK_009cf118 + (ulong)uVar2 * 0x28));
  return uVar5;
}

