
void FUN_005a5f08(void)

{
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  
  while( true ) {
    unaff_x23[5] = in_stack_00000098;
    unaff_x23[4] = in_stack_00000090;
    unaff_x23[7] = in_stack_000000a8;
    unaff_x23[6] = in_stack_000000a0;
    unaff_x22 = unaff_x22 + -0x40;
    if ((unaff_x25 == unaff_x24) || (unaff_x22 == 0)) break;
    func_0x005a5b10(&uStack0000000000000070,unaff_x21);
    unaff_x24 = unaff_x24 + 1;
    unaff_x21 = unaff_x21 + 0x40;
    unaff_x23[9] = in_stack_00000078;
    unaff_x23[8] = uStack0000000000000070;
    unaff_x23[0xb] = in_stack_00000088;
    unaff_x23[10] = in_stack_00000080;
    unaff_x23 = unaff_x23 + 8;
  }
  unaff_x19[2] = in_stack_00000008;
  unaff_x19[1] = in_stack_00000000;
  unaff_x19[3] = unaff_x25;
  unaff_x19[4] = unaff_x20;
  *unaff_x19 = 2;
  return;
}

