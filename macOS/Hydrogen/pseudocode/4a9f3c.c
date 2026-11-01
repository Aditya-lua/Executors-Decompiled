
void FUN_004a9f3c(long param_1,long *param_2)

{
  undefined8 uVar1;
  undefined8 *unaff_x19;
  long *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  
  while( true ) {
    uVar1 = unaff_x22;
    if (param_1 != 0) {
      uVar1 = unaff_x21;
    }
    func_0x00187bd4(param_2,uVar1,8);
    if ((long *)*unaff_x20 == (long *)0x0) break;
    param_2 = unaff_x20;
    param_1 = param_1 + 1;
    unaff_x20 = (long *)*unaff_x20;
  }
  uVar1 = 0x380;
  if (param_1 + 1 != 0) {
    uVar1 = 0x3e0;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}

