
void FUN_004aa8ec(void)

{
  undefined8 uVar1;
  uint unaff_w19;
  long *unaff_x21;
  long unaff_x22;
  uint unaff_w23;
  long unaff_x24;
  
  for (; unaff_x22 = unaff_x22 + 1, unaff_w23 != (unaff_w19 & 0xff); unaff_w19 = unaff_w19 + 1) {
    uVar1 = func_0x00486da8();
    *(undefined8 *)(unaff_x24 + unaff_x22 * 8) = uVar1;
  }
  *unaff_x21 = unaff_x22;
  return;
}

