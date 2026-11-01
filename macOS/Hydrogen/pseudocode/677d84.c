
void FUN_00677d84(void)

{
  long lVar1;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  if ((unaff_x20 == 0) || (unaff_x22 == 0)) {
    if (unaff_x20 == 0) goto code_r0x00677ed8;
  }
  else {
    _memcpy();
  }
  if (unaff_x23 != 0) {
    lVar1 = unaff_x23;
    do {
      *(undefined8 *)(unaff_x20 + -8 + lVar1 * 8) = 0;
      lVar1 = lVar1 + -1;
    } while (lVar1 != 0);
  }
  func_0x00611644();
code_r0x00677ed8:
  *(undefined8 *)(unaff_x19 + 0x10) = unaff_x21;
  *(long *)(unaff_x19 + 0x18) = unaff_x22;
  *(undefined8 *)(unaff_x19 + 8) = 0x1fffffffffffffff;
  *(undefined8 *)(unaff_x22 + unaff_x23 * 8) = 1;
  return;
}

