
void FUN_006c7f4c(long param_1)

{
  bool in_ZR;
  bool in_CY;
  long in_x10;
  undefined4 in_w11;
  undefined4 in_w12;
  undefined8 *unaff_x19;
  ulong uVar1;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  if (!in_CY || in_ZR) {
    in_w11 = in_w12;
  }
  *(undefined4 *)(unaff_x19 + 0x91) = in_w11;
  if (in_x10 != param_1) {
    uVar1 = 0;
    do {
      func_0x006c6028();
      uVar1 = uVar1 + 1;
    } while (uVar1 < (ulong)(in_stack_00000030 - in_stack_00000028 >> 3));
  }
  func_0x006b1ccc(*unaff_x19,0x31);
  if (in_stack_00000028 != 0) {
    __ZdlPv();
  }
  *(undefined4 *)(in_stack_00000040 + 0x484) = in_stack_00000048;
  return;
}

