
void FUN_004a9f5c(long param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 *in_x9;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  
  while (puVar2 = in_x9, puVar2 != (undefined8 *)0x0) {
    unaff_x23 = param_1 + 1;
    uVar1 = unaff_x22;
    if (param_1 != 0) {
      uVar1 = unaff_x21;
    }
    func_0x00187bd4(param_2,uVar1,8);
    param_2 = puVar2;
    param_1 = unaff_x23;
    unaff_x20 = puVar2;
    in_x9 = (undefined8 *)*puVar2;
  }
  uVar1 = 0x380;
  if (unaff_x23 != 0) {
    uVar1 = 0x3e0;
  }
  func_0x00187bd4(unaff_x20,uVar1,8);
  *unaff_x19 = 0;
  return;
}

