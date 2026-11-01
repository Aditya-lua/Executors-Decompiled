
void FUN_00718284(undefined8 param_1)

{
  undefined8 uVar1;
  undefined4 in_w8;
  undefined4 unaff_w22;
  int unaff_w23;
  long unaff_x29;
  undefined1 uStack0000000000000030;
  undefined8 in_stack_00000060;
  
  if (unaff_w23 != 0) {
    in_w8 = unaff_w22;
  }
  uVar1 = func_0x00704c24(param_1,0x38);
  in_stack_00000060 =
       func_0x007058b4(uVar1,&uStack0000000000000030,in_w8,*(undefined8 *)(unaff_x29 + -0x60),
                       *(undefined8 *)(unaff_x29 + -0x58));
  func_0x00711dac();
  return;
}

