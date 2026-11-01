
void FUN_004b84ac(void)

{
  undefined8 uVar1;
  uint unaff_w20;
  long *unaff_x21;
  long unaff_x22;
  long lVar2;
  long unaff_x24;
  uint unaff_w25;
  
  do {
    lVar2 = unaff_x22;
    uVar1 = func_0x00486da8();
    unaff_w20 = unaff_w20 - 1;
    *(undefined8 *)(unaff_x24 + lVar2 * 8) = uVar1;
    unaff_x22 = lVar2 + 1;
  } while (unaff_w25 < (unaff_w20 & 0xff));
  uVar1 = func_0x00486da8();
  *(undefined8 *)(unaff_x24 + (lVar2 + 1) * 8) = uVar1;
  *unaff_x21 = lVar2 + 2;
  return;
}

