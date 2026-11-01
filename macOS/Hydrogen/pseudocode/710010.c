
void FUN_00710010(undefined1 param_1 [16])

{
  undefined8 *unaff_x19;
  undefined8 uVar1;
  undefined8 uVar2;
  long in_stack_00000008;
  long in_stack_00000030;
  char in_stack_00000050;
  undefined1 uStack0000000000000080;
  undefined8 in_stack_00000498;
  undefined8 in_stack_000004a0;
  undefined8 in_stack_000004a8;
  undefined8 in_stack_000004b0;
  
  uVar2 = param_1._8_8_;
  uVar1 = param_1._0_8_;
  unaff_x19[5] = uVar2;
  unaff_x19[4] = uVar1;
  unaff_x19[7] = uVar2;
  unaff_x19[6] = uVar1;
  unaff_x19[1] = uVar2;
  *unaff_x19 = uVar1;
  unaff_x19[3] = uVar2;
  unaff_x19[2] = uVar1;
  func_0x006d073c();
  unaff_x19[8] = 0;
  unaff_x19[9] = 0;
  unaff_x19[10] = 0;
  unaff_x19[0xb] = in_stack_00000498;
  unaff_x19[0xd] = in_stack_000004a8;
  unaff_x19[0xc] = in_stack_000004a0;
  unaff_x19[0xe] = in_stack_000004b0;
  ___cxa_end_catch();
  func_0x007253a4(&uStack0000000000000080);
  if (in_stack_00000050 != '\0') {
    if (in_stack_00000030 != 0) {
      __ZdlPv();
    }
    if (in_stack_00000008 != 0) {
      __ZdlPv();
    }
  }
  return;
}

