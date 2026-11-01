
/* WARNING: Removing unreachable block (ram,0x0042561c) */

ulong FUN_004255c8(void)

{
  undefined1 *puVar1;
  long lVar2;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  ulong uVar3;
  ulong unaff_x19;
  ulong *unaff_x20;
  undefined8 uVar4;
  ulong unaff_x22;
  ulong uVar5;
  ulong unaff_x23;
  uint uVar6;
  undefined1 auVar7 [16];
  undefined4 uStack0000000000000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000040;
  undefined2 uStack0000000000000078;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined1 **ppuStack_70;
  undefined8 uStack_68;
  ulong uStack_60;
  undefined8 uStack_58;
  ulong *puStack_50;
  long lStack_48;
  undefined1 *puStack_40;
  undefined8 uStack_38;
  ulong uStack_30;
  undefined1 auStack_6 [6];
  
  uStack0000000000000078 = 0x200;
  func_0x004248f4(&uStack0000000000000008,&uStack0000000000000040);
  uVar6 = uStack0000000000000008 & 0xff;
  if ((unaff_x19 == 0) || (uVar6 != 9)) goto LAB_004256a4;
  uVar5 = (in_stack_00000010 + in_stack_00000018) - unaff_x23;
  uVar4 = extraout_x1;
  if ((uVar5 != 0 && uVar5 != unaff_x22) && (unaff_x22 <= uVar5)) {
    func_0x00434438();
    uVar4 = extraout_x1_00;
  }
  if (uVar5 <= unaff_x22) {
    unaff_x20[2] = uVar5;
    unaff_x22 = uVar5;
  }
  uVar5 = unaff_x19 + 1;
  uVar3 = *unaff_x20;
  if (uVar5 <= uVar3 - unaff_x22) {
joined_r0x00425664:
    if (uVar3 == unaff_x22) {
      func_0x007a0000();
      unaff_x23 = unaff_x20[1];
      unaff_x22 = unaff_x20[2];
    }
    *(undefined1 *)(unaff_x23 + unaff_x22) = 0x2e;
    uVar5 = unaff_x22 + 1;
    unaff_x20[2] = uVar5;
    if (*unaff_x20 - uVar5 < unaff_x19) {
      func_0x007a0000();
      uVar5 = unaff_x20[2];
    }
    _memcpy(unaff_x20[1] + uVar5);
    unaff_x20[2] = uVar5 + unaff_x19;
LAB_004256a4:
    return (ulong)(uVar6 == 9);
  }
  if ((CARRY8(unaff_x22,uVar5)) || (uVar5 = unaff_x22 + uVar5, (long)uVar5 < 0)) {
    func_0x007a1f00(0,uVar4,&UNK_009daad0);
  }
  else {
    if (uVar3 != 0) {
      uStack0000000000000040 = unaff_x23;
    }
    func_0x0079a108(&uStack0000000000000008,1,uVar5,&uStack0000000000000040);
    if (uStack0000000000000008 != 1) {
      *unaff_x20 = uVar5;
      unaff_x20[1] = in_stack_00000010;
      unaff_x23 = in_stack_00000010;
      uVar3 = uVar5;
      goto joined_r0x00425664;
    }
  }
  auVar7 = func_0x007a1f00(in_stack_00000010,in_stack_00000018,&UNK_009daad0);
  lStack_48 = auVar7._8_8_;
  puStack_50 = auVar7._0_8_;
  puVar1 = auStack_6 + -10;
  uStack_30 = unaff_x22;
  if (lStack_48 < 0) {
    uVar4 = 0;
    puStack_50 = unaff_x20;
  }
  else {
    if (lStack_48 == 0) {
      uVar5 = 1;
LAB_004257c4:
      _memcpy(uVar5,puStack_50,lStack_48);
      return uVar5;
    }
    uVar4 = 1;
    uVar5 = func_0x00187bd0(lStack_48,1);
    if (uVar5 != 0) goto LAB_004257c4;
  }
  auVar7 = func_0x007a1f00(uVar4,lStack_48,&UNK_009d90d8);
  lVar2 = auVar7._8_8_;
  uStack_38 = 0x425804;
  uStack_60 = unaff_x22;
  uStack_58 = uVar4;
  puStack_40 = puVar1;
  if (lVar2 < 0) {
    uVar4 = 0;
LAB_00425878:
    lVar2 = func_0x007a1f00(uVar4,lVar2,&UNK_009d90d8);
    uStack_68 = 0x42588c;
    uStack_80 = *(undefined8 *)(lVar2 + 8);
    uStack_78 = *(undefined8 *)(lVar2 + 0x10);
    ppuStack_70 = &puStack_40;
    uVar5 = func_0x0046d710(&uStack_80);
    return uVar5;
  }
  if (lVar2 == 0) {
    uVar5 = 1;
  }
  else {
    uVar4 = 1;
    uVar5 = func_0x00187bd0(lVar2,1);
    if (uVar5 == 0) goto LAB_00425878;
  }
  _memcpy(uVar5,auVar7._0_8_,lVar2);
  return uVar5;
}

