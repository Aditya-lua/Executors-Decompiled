
long FUN_0064c3dc(void)

{
  long lVar1;
  long extraout_x1;
  long lVar2;
  long *unaff_x19;
  long unaff_x21;
  long unaff_x24;
  long unaff_x25;
  long lVar3;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  
  lVar1 = __Znwm(unaff_x25 * 0x60);
  in_stack_00000020 = lVar1 + unaff_x24 * 0x60;
  in_stack_00000030 = lVar1 + unaff_x25 * 0x60;
  uStack0000000000000018 = lVar1;
  in_stack_00000028 = in_stack_00000020;
  func_0x005fe0b4(in_stack_00000020);
  func_0x005fe0b4(lVar1 + unaff_x24 * 0x60 + 0x30,unaff_x21 + 0x30);
  in_stack_00000028 = in_stack_00000028 + 0x60;
  func_0x0064bf4c();
  lVar1 = in_stack_00000028;
  lVar2 = unaff_x19[2];
  lVar3 = unaff_x19[1];
  uStack0000000000000018 = *unaff_x19;
  *unaff_x19 = extraout_x1;
  unaff_x19[2] = in_stack_00000030;
  unaff_x19[1] = in_stack_00000028;
  in_stack_00000020 = uStack0000000000000018;
  in_stack_00000028 = lVar3;
  in_stack_00000030 = lVar2;
  func_0x0064c1b0(&uStack0000000000000018,uStack0000000000000018);
  if (uStack0000000000000018 != 0) {
    __ZdlPv();
  }
  return lVar1;
}

