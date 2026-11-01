
void FUN_0020082c(undefined1 param_1 [16])

{
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long lStack0000000000000020;
  long lStack0000000000000028;
  long lStack0000000000000030;
  long in_stack_00000070;
  
  lStack0000000000000028 = param_1._8_8_;
  lStack0000000000000020 = param_1._0_8_;
  lStack0000000000000030 = in_stack_00000070;
  if (unaff_x20 == 2) {
    unaff_x19[2] = in_stack_00000008;
    unaff_x19[1] = in_stack_00000000;
    unaff_x19[4] = in_stack_00000018;
    unaff_x19[3] = in_stack_00000010;
    unaff_x19[6] = lStack0000000000000028;
    unaff_x19[5] = lStack0000000000000020;
    unaff_x19[7] = in_stack_00000070;
  }
  else {
    _memcpy(unaff_x19 + 8,unaff_x21 + 0x40,1000);
    unaff_x19[2] = in_stack_00000008;
    unaff_x19[1] = in_stack_00000000;
    unaff_x19[4] = in_stack_00000018;
    unaff_x19[3] = in_stack_00000010;
    unaff_x19[6] = lStack0000000000000028;
    unaff_x19[5] = lStack0000000000000020;
    unaff_x19[7] = lStack0000000000000030;
    *(undefined2 *)(unaff_x19 + 0x85) = 0;
  }
  *unaff_x19 = unaff_x20;
  return;
}

