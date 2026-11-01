
void FUN_001bdae8(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 extraout_x1;
  undefined8 extraout_x1_00;
  undefined8 extraout_x1_01;
  long *plVar2;
  long lVar3;
  undefined8 extraout_x8;
  undefined8 extraout_x8_00;
  undefined8 extraout_x9;
  undefined8 extraout_x9_00;
  undefined8 extraout_x10;
  undefined8 extraout_x10_00;
  long lVar4;
  long unaff_x20;
  undefined1 auVar5 [16];
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  long *plStack_40;
  long lStack_38;
  
  func_0x007a28bc(param_1);
  func_0x007a28b0(extraout_x10,extraout_x1,&UNK_009c9a78);
  func_0x007a28bc(extraout_x10_00,extraout_x9,&UNK_009c9a78);
  func_0x007a28b0(extraout_x9_00,extraout_x1_00,&UNK_009c9a78);
  func_0x007a28bc(0xffffffffffffffff,extraout_x8,&UNK_009c9a78);
  uVar1 = func_0x007a28b0(extraout_x8_00,extraout_x1_01,&UNK_009c9a78);
  if (unaff_x20 != 0) {
    func_0x00187bd4();
  }
  auVar5 = __Unwind_Resume(uVar1);
  plVar2 = auVar5._8_8_;
  lStack_38 = plVar2[2];
  lVar3 = lStack_38;
  if ((ulong)(*plVar2 - lStack_38) < 2) {
    func_0x0079b61c(plVar2,lStack_38,2,1,1);
    lVar3 = plVar2[2];
  }
  *(undefined2 *)(plVar2[1] + lVar3) = 0xffff;
  plVar2[2] = lVar3 + 2;
  uStack_58 = 0x1616161616161616;
  uStack_60 = 0x1616161616161616;
  uStack_48 = 0x1616161616161616;
  uStack_50 = 0x1616161616161616;
  lVar3 = *(long *)(auVar5._0_8_ + 0x10);
  plStack_40 = plVar2;
  if (lVar3 != 0) {
    lVar4 = *(long *)(auVar5._0_8_ + 8);
    lVar3 = lVar3 * 0x70;
    do {
      func_0x001bcaa8(lVar4,plVar2);
      lVar4 = lVar4 + 0x70;
      lVar3 = lVar3 + -0x70;
    } while (lVar3 != 0);
  }
  func_0x0024031c(&uStack_60);
  return;
}

