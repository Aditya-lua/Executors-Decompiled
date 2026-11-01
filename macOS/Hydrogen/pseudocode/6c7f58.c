
void FUN_006c7f58(void)

{
  bool in_ZR;
  undefined8 *unaff_x19;
  ulong uVar1;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000040;
  undefined4 in_stack_00000048;
  
  if (!in_ZR) {
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

