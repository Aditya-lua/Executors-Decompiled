
long FUN_0064c404(long param_1)

{
  long extraout_x1;
  long lVar1;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long lStack0000000000000030;
  
  lStack0000000000000030 = param_1;
  func_0x005fe0b4();
  func_0x005fe0b4(unaff_x23 + unaff_x24 * 0x60 + 0x30,unaff_x21 + 0x30);
  func_0x0064bf4c();
  lVar1 = unaff_x19[2];
  uStack0000000000000018 = *unaff_x19;
  *unaff_x19 = extraout_x1;
  unaff_x19[2] = lStack0000000000000030;
  unaff_x19[1] = unaff_x22 + 0x60;
  in_stack_00000020 = uStack0000000000000018;
  lStack0000000000000030 = lVar1;
  func_0x0064c1b0(&uStack0000000000000018,uStack0000000000000018);
  if (uStack0000000000000018 != 0) {
    __ZdlPv();
  }
  return unaff_x22 + 0x60;
}

