
void FUN_00401bc8(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  
  while (lVar2 = param_1, lVar2 != 0) {
    uVar1 = unaff_x23;
    if (unaff_x21 != 0) {
      uVar1 = unaff_x22;
    }
    func_0x00187bd4(unaff_x20,uVar1,8);
    unaff_x20 = lVar2;
    unaff_x21 = unaff_x21 + 1;
    param_1 = *(long *)(lVar2 + 0xb0);
  }
  uVar1 = 0x118;
  if (unaff_x21 != 0) {
    uVar1 = 0x178;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}

