
void FUN_0059ecdc(undefined8 *param_1)

{
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar1;
  long unaff_x24;
  undefined8 *puStack0000000000000010;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  
  puStack0000000000000010 = param_1;
  if (unaff_x24 != 0) {
    lVar1 = 0;
    do {
      if (unaff_x20 == 0) break;
      func_0x005a5b10(&uStack0000000000000020,unaff_x21);
      lVar1 = lVar1 + 1;
      unaff_x21 = unaff_x21 + 0x40;
      param_1[1] = in_stack_00000028;
      *param_1 = uStack0000000000000020;
      param_1[3] = in_stack_00000038;
      param_1[2] = in_stack_00000030;
      param_1[5] = in_stack_00000048;
      param_1[4] = in_stack_00000040;
      param_1[7] = in_stack_00000058;
      param_1[6] = in_stack_00000050;
      unaff_x20 = unaff_x20 + -0x40;
      param_1 = param_1 + 8;
    } while (unaff_x24 != lVar1);
  }
  unaff_x19[1] = (long)puStack0000000000000010;
  *unaff_x19 = unaff_x24;
  unaff_x19[2] = unaff_x24;
  return;
}

