
void FUN_00466710(void)

{
  short sVar1;
  char in_NG;
  char in_OV;
  undefined8 uVar2;
  short in_w8;
  short unaff_w19;
  undefined8 unaff_x20;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  long unaff_x29;
  undefined1 auVar3 [16];
  
  if (in_NG == in_OV) {
    in_w8 = -unaff_w19;
  }
  func_0x004607dc(unaff_x29 + -0xe0,unaff_x29 + -0x60);
  if (*(long *)(unaff_x29 + -0xe0) == 0) {
    func_0x0045f3e4(unaff_x29 + -0x80,unaff_x29 + -0x60);
    sVar1 = *(short *)(unaff_x29 + -0x70);
  }
  else {
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0xd8);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xe0);
    *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0xd0);
    sVar1 = *(short *)(unaff_x29 + -0x70);
  }
  if (in_w8 < sVar1) {
    auVar3 = func_0x00460f28(*(undefined8 *)(unaff_x29 + -0x80),*(undefined8 *)(unaff_x29 + -0x78));
  }
  else {
    *(undefined2 *)(unaff_x29 + -0xe0) = 2;
    if (unaff_w19 == 0) {
      uVar2 = 1;
      *(undefined **)(unaff_x29 + -0xd8) = &UNK_008934ef;
      *(undefined8 *)(unaff_x29 + -0xd0) = 1;
    }
    else {
      uVar2 = 2;
      *(undefined **)(unaff_x29 + -0xd8) = &UNK_008934bd;
      *(undefined8 *)(unaff_x29 + -0xd0) = 2;
      *(undefined2 *)(unaff_x29 + -200) = 0;
      *(undefined8 *)(unaff_x29 + -0xc0) = unaff_x20;
    }
    auVar3._8_8_ = uVar2;
    auVar3._0_8_ = unaff_x29 + -0xe0;
  }
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x23;
  *(undefined8 *)(unaff_x29 + -0x78) = unaff_x22;
  *(undefined1 (*) [16])(unaff_x29 + -0x70) = auVar3;
  func_0x00468db8();
  return;
}

