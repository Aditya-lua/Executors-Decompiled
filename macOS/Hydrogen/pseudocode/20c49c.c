
void FUN_0020c49c(void)

{
  long lVar1;
  long *unaff_x19;
  ulong unaff_x20;
  long unaff_x22;
  long unaff_x24;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  
  _memcpy();
  in_stack_00000028 = unaff_x24 + unaff_x22;
  if ((ulong)(uStack0000000000000018 - in_stack_00000028) < unaff_x20) {
    func_0x0079b61c(&uStack0000000000000018,in_stack_00000028);
  }
  lVar1 = in_stack_00000028;
  _memcpy(in_stack_00000020 + in_stack_00000028,in_stack_00000008);
  unaff_x19[2] = lVar1 + unaff_x20;
  unaff_x19[1] = in_stack_00000020;
  *unaff_x19 = uStack0000000000000018;
  return;
}

