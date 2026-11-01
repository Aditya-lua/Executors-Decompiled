
void FUN_00580054(undefined8 param_1)

{
  undefined1 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  uStack0000000000000038 = 0;
  uStack0000000000000030 = param_1;
  func_0x0055af64(unaff_x29 + -0x68,&uStack0000000000000018,&UNK_009f02e0);
  func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,unaff_x29 + -0x80,
                  unaff_x29 + -0x68);
  func_0x0057c5c4();
  *unaff_x20 = 3;
  unaff_x21[1] = in_stack_00000020;
  *unaff_x21 = uStack0000000000000018;
  unaff_x21[3] = uStack0000000000000030;
  unaff_x21[2] = unaff_x21;
  unaff_x21[5] = in_stack_00000040;
  unaff_x21[4] = uStack0000000000000038;
  unaff_x21[6] = in_stack_00000048;
  *unaff_x19 = 1;
  return;
}

