
undefined8 FUN_0045c9b8(long param_1)

{
  undefined8 unaff_x19;
  undefined8 *unaff_x20;
  int in_stack_00000000;
  undefined8 in_stack_00000008;
  ulong uStack0000000000000020;
  
  uStack0000000000000020 = (ulong)(param_1 != 0);
  func_0x0079a108();
  if (in_stack_00000000 != 1) {
    *unaff_x20 = unaff_x19;
    unaff_x20[1] = in_stack_00000008;
    in_stack_00000008 = 0x8000000000000001;
  }
  return in_stack_00000008;
}

