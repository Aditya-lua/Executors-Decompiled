
void FUN_00466354(undefined8 param_1)

{
  undefined8 uVar1;
  undefined2 in_w8;
  short unaff_w19;
  undefined8 unaff_x20;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  long unaff_x29;
  
  *(undefined2 *)(unaff_x29 + -0xe0) = in_w8;
  if (unaff_w19 == 0) {
    uVar1 = 1;
    *(undefined **)(unaff_x29 + -0xd8) = &UNK_008934ef;
    *(undefined8 *)(unaff_x29 + -0xd0) = 1;
  }
  else {
    uVar1 = 2;
    *(undefined **)(unaff_x29 + -0xd8) = &UNK_008934bd;
    *(undefined8 *)(unaff_x29 + -0xd0) = 2;
    *(undefined2 *)(unaff_x29 + -200) = 0;
    *(undefined8 *)(unaff_x29 + -0xc0) = unaff_x20;
  }
  *(undefined8 *)(unaff_x29 + -0x80) = unaff_x23;
  *(undefined8 *)(unaff_x29 + -0x78) = unaff_x22;
  *(long *)(unaff_x29 + -0x70) = unaff_x29 + -0xe0;
  *(undefined8 *)(unaff_x29 + -0x68) = uVar1;
  func_0x00468db8(param_1,unaff_x29 + -0x80);
  return;
}

