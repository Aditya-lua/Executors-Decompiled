
undefined1  [16] FUN_00430180(int param_1)

{
  long lVar1;
  undefined1 auVar2 [16];
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  ulong extraout_x1;
  ulong extraout_x1_00;
  ulong uVar6;
  undefined8 *unaff_x19;
  uint unaff_w20;
  long unaff_x22;
  long unaff_x29;
  undefined1 auVar7 [16];
  ulong in_stack_00000008;
  undefined1 uStack0000000000000054;
  undefined1 uStack0000000000000058;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined4 uStack_38;
  
  *(int *)(unaff_x29 + -0x54) = param_1;
  if (param_1 != 0) {
    *(undefined8 *)(unaff_x29 + -0x50) = 0;
    func_0x0079ffdc(0,unaff_x29 + -0x54,&UNK_0081a9a8,unaff_x29 + -0x50,&UNK_009db900);
    *(undefined8 *)(unaff_x29 + -0x50) = 0;
    func_0x0079ffdc(0,&uStack0000000000000054,&UNK_008884a8,unaff_x29 + -0x50,&UNK_009db930);
    *(undefined8 *)(unaff_x29 + -0x50) = 0;
    uVar3 = func_0x0079ffdc(0,&uStack0000000000000058,&UNK_0081a9a8,unaff_x29 + -0x50,&UNK_009db918)
    ;
    if (*(long *)(unaff_x22 + 8) != 0) {
      func_0x00187bd4();
    }
    func_0x00187bd4();
    uVar3 = __Unwind_Resume(uVar3);
    func_0x003f58cc();
    __Unwind_Resume(uVar3);
    puVar4 = (undefined8 *)func_0x007a2668();
    lVar5 = func_0x0042fcc4(0);
    uVar3 = *puVar4;
    lVar1 = puVar4[1];
    (**(code **)(lVar1 + 0x18))(uVar3);
    if (*(long *)(lVar1 + 8) != 0) {
      func_0x00187bd4(uVar3,*(long *)(lVar1 + 8),*(undefined8 *)(lVar1 + 0x10));
    }
    func_0x00187bd4(puVar4,0x10,8);
    lVar1 = lRam0000000000a3bff0;
    uVar6 = extraout_x1;
    if (lVar5 != 0) {
      uStack_48 = 0;
      uStack_40 = 0x20000;
      uStack_38 = 4;
      _sigaltstack(&uStack_48,0);
      _munmap(lVar5 - lVar1,lVar1 + 0x20000);
      uVar6 = extraout_x1_00;
    }
    auVar2._8_8_ = 0;
    auVar2._0_8_ = uVar6;
    return auVar2 << 0x40;
  }
  if (unaff_w20 == 0) {
    uVar3 = 0;
  }
  else {
    uVar3 = *unaff_x19;
    puVar4 = (undefined8 *)unaff_x19[1];
    if ((code *)*puVar4 != (code *)0x0) {
      (*(code *)*puVar4)(uVar3);
    }
    if (puVar4[1] != 0) {
      func_0x00187bd4(uVar3,puVar4[1],puVar4[2]);
    }
    func_0x00187bd4();
    in_stack_00000008 = (ulong)unaff_w20 << 0x20 | 2;
    uVar3 = 1;
  }
  auVar7._8_8_ = in_stack_00000008;
  auVar7._0_8_ = uVar3;
  return auVar7;
}

