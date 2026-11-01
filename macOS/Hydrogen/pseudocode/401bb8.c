
void FUN_00401bb8(long param_1)

{
  undefined8 uVar1;
  undefined1 in_ZR;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  
  while( true ) {
    uVar1 = unaff_x23;
    if (!(bool)in_ZR) {
      uVar1 = unaff_x22;
    }
    func_0x00187bd4(param_1,uVar1,8);
    if (*(long *)(unaff_x20 + 0xb0) == 0) break;
    in_ZR = unaff_x21 == 0;
    param_1 = unaff_x20;
    unaff_x20 = *(long *)(unaff_x20 + 0xb0);
    unaff_x21 = unaff_x21 + 1;
  }
  uVar1 = 0x118;
  if (unaff_x21 != 0) {
    uVar1 = 0x178;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}

