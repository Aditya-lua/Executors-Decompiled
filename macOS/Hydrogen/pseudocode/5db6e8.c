
undefined8 FUN_005db6e8(long param_1)

{
  undefined8 uVar1;
  long in_x9;
  char *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x29;
  char in_wzr;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined *in_stack_00000040;
  
  *(long *)(unaff_x29 + -0x30) = param_1;
  *(long *)(unaff_x29 + -0x28) = param_1 + in_x9 * 0x108;
  func_0x005d2d40(unaff_x29 + -0x48,unaff_x29 + -0x30,&UNK_008b639c,2);
  uStack0000000000000038 = unaff_x21 + 0xc0;
  in_stack_00000040 =
       &__ZN58__LT_ast__local__RcLocal_u20_as_u20_core__fmt__Display_GT_3fmt17h099d73c3b4845c4bE;
  uStack0000000000000008 = &UNK_009f3188;
  in_stack_00000010 = 6;
  in_stack_00000018 = &uStack0000000000000038;
  in_stack_00000020 = 5;
  in_stack_00000028 = 0;
  uVar1 = func_0x0046849c(*unaff_x20,unaff_x20[1],&uStack0000000000000008);
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x40),*(long *)(unaff_x29 + -0x48),1);
  }
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  return uVar1;
}

