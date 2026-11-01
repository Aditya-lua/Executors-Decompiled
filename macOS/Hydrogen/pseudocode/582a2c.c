
void FUN_00582a2c(void)

{
  undefined8 uVar1;
  long *plVar2;
  undefined8 *unaff_x19;
  long *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  
  while (plVar2 = (long *)*unaff_x20, plVar2 != (long *)0x0) {
    uVar1 = unaff_x22;
    if (unaff_x23 != 0) {
      uVar1 = unaff_x21;
    }
    func_0x00187bd4(unaff_x20,uVar1,8);
    unaff_x20 = plVar2;
    unaff_x23 = unaff_x23 + 1;
  }
  uVar1 = 0x170;
  if (unaff_x23 != 0) {
    uVar1 = 0x1d0;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}

