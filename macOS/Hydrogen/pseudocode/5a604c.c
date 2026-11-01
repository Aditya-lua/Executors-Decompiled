
void FUN_005a604c(void)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  
  while( true ) {
    unaff_x21 = unaff_x21 + 0x40;
    puVar1 = (undefined8 *)(unaff_x20 + unaff_x26);
    puVar1[1] = in_stack_00000078;
    *puVar1 = uStack0000000000000070;
    puVar1[3] = in_stack_00000088;
    puVar1[2] = in_stack_00000080;
    puVar1[5] = in_stack_00000098;
    puVar1[4] = in_stack_00000090;
    puVar1[7] = in_stack_000000a8;
    puVar1[6] = in_stack_000000a0;
    unaff_x26 = unaff_x26 + 0x40;
    if ((unaff_x25 == unaff_x24) || (unaff_x23 == unaff_x26)) break;
    func_0x005a5b10(&uStack0000000000000070,unaff_x21);
    unaff_x24 = unaff_x24 + 1;
  }
  unaff_x19[3] = in_stack_00000068;
  unaff_x19[2] = in_stack_00000060;
  unaff_x19[4] = unaff_x25;
  unaff_x19[5] = unaff_x20;
  unaff_x19[6] = unaff_x25;
  unaff_x19[7] = unaff_x22;
  *unaff_x19 = 0xb;
  unaff_x19[1] = in_stack_00000058;
  return;
}

