
uint thunk_FUN_0058a73c(void)

{
  undefined8 uVar1;
  uint uVar2;
  undefined8 *unaff_x21;
  undefined1 auVar3 [16];
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  unaff_x21[1] = in_stack_00000020;
  *unaff_x21 = in_stack_00000018;
  unaff_x21[3] = in_stack_00000030;
  unaff_x21[2] = in_stack_00000028;
  unaff_x21[5] = in_stack_00000040;
  unaff_x21[4] = in_stack_00000038;
  unaff_x21[6] = in_stack_00000048;
  uVar1 = __Unwind_Resume();
  func_0x005876a4(&uStack0000000000000050);
  __Unwind_Resume(uVar1);
  auVar3 = func_0x007a2668();
  uVar2 = (uint)(*auVar3._8_8_ < *auVar3._0_8_);
  if (*auVar3._0_8_ < *auVar3._8_8_) {
    uVar2 = 0xffffffff;
  }
  return uVar2;
}

