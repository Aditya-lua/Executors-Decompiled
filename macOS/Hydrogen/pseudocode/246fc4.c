
void FUN_00246fc4(long param_1)

{
  long lVar1;
  long *unaff_x19;
  long unaff_x21;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000050;
  
  if (param_1 == unaff_x21) {
    unaff_x19[2] = in_stack_00000048;
    unaff_x19[1] = in_stack_00000040;
    unaff_x19[3] = in_stack_00000050;
    *unaff_x19 = unaff_x21;
  }
  else {
    unaff_x19[1] = in_stack_00000010;
    *unaff_x19 = in_stack_00000008;
    unaff_x19[3] = in_stack_00000020;
    unaff_x19[2] = in_stack_00000018;
    unaff_x19[5] = in_stack_00000030;
    unaff_x19[4] = in_stack_00000028;
    unaff_x19[6] = in_stack_00000038;
    in_stack_00000050 = in_stack_00000050 + 1;
    lVar1 = in_stack_00000048;
    while (in_stack_00000050 = in_stack_00000050 + -1, in_stack_00000050 != 0) {
      func_0x001a08c4(lVar1);
      lVar1 = lVar1 + 0x98;
    }
    if (in_stack_00000040 != 0) {
      func_0x00187bd4(in_stack_00000048,in_stack_00000040 * 0x98,8);
    }
  }
  return;
}

