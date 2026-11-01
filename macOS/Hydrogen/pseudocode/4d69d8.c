
void FUN_004d69d8(long param_1)

{
  undefined8 *unaff_x19;
  dword unaff_w20;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  dword *in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  
  func_0x005e32c0(unaff_x29 + -0x40,param_1 + 1);
  uStack0000000000000008 = 0;
  in_stack_00000010 = &MACH_HEADER.cputype;
  in_stack_00000028 = in_stack_00000068;
  in_stack_00000020 = in_stack_00000060;
  in_stack_00000038 = in_stack_00000078;
  in_stack_00000030 = in_stack_00000070;
  in_stack_00000048 = *(undefined8 *)(unaff_x29 + -0x38);
  in_stack_00000040 = *(undefined8 *)(unaff_x29 + -0x40);
  in_stack_00000058 = *(undefined8 *)(unaff_x29 + -0x28);
  in_stack_00000050 = *(undefined8 *)(unaff_x29 + -0x30);
  in_stack_00000018 = 0;
  func_0x005bcf2c(&uStack0000000000000008,&UNK_009e6ea0);
  *in_stack_00000010 = unaff_w20;
  unaff_x19[5] = in_stack_00000030;
  unaff_x19[4] = in_stack_00000028;
  unaff_x19[7] = in_stack_00000040;
  unaff_x19[6] = in_stack_00000038;
  unaff_x19[9] = in_stack_00000050;
  unaff_x19[8] = in_stack_00000048;
  unaff_x19[10] = in_stack_00000058;
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = uStack0000000000000008;
  unaff_x19[3] = in_stack_00000020;
  unaff_x19[2] = 1;
  return;
}

