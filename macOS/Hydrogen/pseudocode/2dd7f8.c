
void FUN_002dd7f8(undefined8 param_1)

{
  undefined8 uVar1;
  undefined4 *unaff_x19;
  undefined4 unaff_w23;
  long unaff_x29;
  
  *unaff_x19 = unaff_w23;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  uVar1 = ___stack_chk_fail(param_1);
  _bzero(uVar1);
  return;
}

