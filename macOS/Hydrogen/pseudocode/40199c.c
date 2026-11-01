
void FUN_0040199c(void)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  
  while (lVar2 = *(long *)(unaff_x20 + 0x4d0), lVar2 != 0) {
    uVar1 = unaff_x23;
    if (unaff_x21 != 0) {
      uVar1 = unaff_x22;
    }
    func_0x00187bd4(unaff_x20,uVar1,8);
    unaff_x20 = lVar2;
    unaff_x21 = unaff_x21 + 1;
  }
  uVar1 = 0x538;
  if (unaff_x21 != 0) {
    uVar1 = 0x598;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}

