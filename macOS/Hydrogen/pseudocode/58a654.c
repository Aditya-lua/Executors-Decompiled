
void FUN_0058a654(void)

{
  ulong uVar1;
  undefined1 *unaff_x19;
  ulong *unaff_x21;
  long unaff_x29;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  ulong in_stack_00000030;
  ulong uStack0000000000000038;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  undefined1 uStack0000000000000050;
  
  uStack0000000000000038 = 0;
  func_0x0055af64(unaff_x29 + -0x68,&uStack0000000000000018,&UNK_009f09e0);
  func_0x005ce9d0(&uStack0000000000000018,&uStack0000000000000050,unaff_x29 + -0x80,
                  unaff_x29 + -0x68);
  uVar1 = *unaff_x21 ^ 0x8000000000000000;
  if (1 < uVar1) {
    uVar1 = 2;
  }
  if (uVar1 != 0) {
    if (uVar1 == 1) {
      func_0x00587bf4();
    }
    else {
      func_0x00587d08();
    }
  }
  unaff_x21[1] = in_stack_00000020;
  *unaff_x21 = uStack0000000000000018;
  unaff_x21[3] = in_stack_00000030;
  unaff_x21[2] = in_stack_00000028;
  unaff_x21[5] = in_stack_00000040;
  unaff_x21[4] = uStack0000000000000038;
  unaff_x21[6] = in_stack_00000048;
  *unaff_x19 = 1;
  return;
}

