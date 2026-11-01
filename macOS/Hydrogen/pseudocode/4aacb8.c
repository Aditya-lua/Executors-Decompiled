
void FUN_004aacb8(void)

{
  undefined8 uVar1;
  uint unaff_w20;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x24;
  uint unaff_w25;
  
  for (; unaff_w25 < (unaff_w20 & 0xff); unaff_w20 = unaff_w20 - 1) {
    uVar1 = func_0x00486da8();
    *(undefined8 *)(unaff_x24 + unaff_x22 * 8) = uVar1;
    unaff_x22 = unaff_x22 + 1;
  }
  uVar1 = func_0x00486da8();
  *(undefined8 *)(unaff_x24 + unaff_x22 * 8) = uVar1;
  *unaff_x21 = unaff_x22 + 1;
  return;
}

