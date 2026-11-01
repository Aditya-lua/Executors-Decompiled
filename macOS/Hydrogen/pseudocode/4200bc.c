
void FUN_004200bc(void)

{
  undefined8 *unaff_x19;
  uint in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  
  if ((in_stack_00000000 & 1) == 0) {
    uStack0000000000000030 = in_stack_00000018;
    uStack0000000000000028 = in_stack_00000010;
    uStack0000000000000020 = in_stack_00000008;
    func_0x0041fc04();
  }
  else {
    *unaff_x19 = 0;
    unaff_x19[1] = in_stack_00000008;
  }
  return;
}

