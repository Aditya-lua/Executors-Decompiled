
void FUN_0016cff4(undefined8 param_1)

{
  long *plVar1;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x23;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  
  _uStack0000000000000030 = param_1;
  while (func_0x001739f8(&uStack0000000000000048,&uStack0000000000000030),
        uStack0000000000000048 != -0x7fffffffffffffff) {
    if (unaff_x20 == in_stack_00000000) {
      func_0x0079a190();
      unaff_x21 = in_stack_00000008;
    }
    plVar1 = (long *)(unaff_x21 + unaff_x23);
    plVar1[2] = in_stack_00000058;
    plVar1[1] = in_stack_00000050;
    *plVar1 = uStack0000000000000048;
    unaff_x20 = unaff_x20 + 1;
    unaff_x23 = unaff_x23 + 0x18;
    in_stack_00000010 = unaff_x20;
  }
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[2] = in_stack_00000010;
  return;
}

