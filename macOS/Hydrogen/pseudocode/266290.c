
void FUN_00266290(void)

{
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x22;
  ulong unaff_x23;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined1 uStack0000000000000047;
  undefined1 uStack0000000000000050;
  
  uStack0000000000000047 = 0;
  uStack0000000000000050 = 0x12;
  func_0x00262c20(&uStack0000000000000008);
  if (uStack0000000000000008 == unaff_x22) {
    if (in_stack_00000010 < unaff_x23) {
      *unaff_x19 = unaff_x22 + -0x22;
    }
    else if (unaff_x20 < unaff_x23) {
      *unaff_x19 = unaff_x22 + -0x27;
      unaff_x19[1] = unaff_x20;
      unaff_x19[2] = unaff_x23;
    }
    else if (in_stack_00000010 < unaff_x20) {
      *unaff_x19 = -0x7ffffffffffffffd;
      unaff_x19[1] = unaff_x20;
      unaff_x19[2] = in_stack_00000010;
    }
    else {
      *unaff_x19 = unaff_x22;
    }
  }
  else {
    unaff_x19[3] = in_stack_00000020;
    unaff_x19[2] = in_stack_00000018;
    unaff_x19[5] = in_stack_00000030;
    unaff_x19[4] = in_stack_00000028;
    unaff_x19[6] = in_stack_00000038;
    *unaff_x19 = uStack0000000000000008;
    unaff_x19[1] = in_stack_00000010;
  }
  return;
}

