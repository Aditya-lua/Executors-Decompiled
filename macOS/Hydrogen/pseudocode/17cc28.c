
void FUN_0017cc28(long *param_1)

{
  undefined8 uVar1;
  long in_x9;
  undefined8 *unaff_x19;
  long *unaff_x20;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  
  while( true ) {
    uVar1 = unaff_x23;
    if (in_x9 != 0) {
      uVar1 = unaff_x22;
    }
    func_0x00187bd4(param_1,uVar1,8);
    if ((long *)*unaff_x20 == (long *)0x0) break;
    param_1 = unaff_x20;
    in_x9 = in_x9 + 1;
    unaff_x20 = (long *)*unaff_x20;
  }
  uVar1 = 0x380;
  if (in_x9 + 1 != 0) {
    uVar1 = 0x3e0;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}

