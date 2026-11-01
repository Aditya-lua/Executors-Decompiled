
void FUN_0053e970(undefined8 param_1,undefined8 param_2)

{
  char in_NG;
  bool in_ZR;
  char in_OV;
  long in_x9;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  
  if (in_ZR || in_NG != in_OV) {
    if (in_x9 == 0) {
      uStack0000000000000040 = 0x8000000000000000;
      goto code_r0x0053ec34;
    }
LAB_0053ec2c:
    in_stack_00000050 = *(undefined8 *)(unaff_x20 + 0x18);
    in_stack_00000048 = *(undefined8 *)(unaff_x20 + 0x10);
    uStack0000000000000040 = param_1;
  }
  else {
    if ((in_x9 == 2) || (in_x9 != 3)) goto LAB_0053ec2c;
    func_0x005575a4(&uStack0000000000000040,param_2,&UNK_009ec3c0);
  }
  in_stack_00000020 = in_stack_00000048;
  in_stack_00000028 = in_stack_00000050;
code_r0x0053ec34:
  unaff_x19[3] = in_stack_00000028;
  unaff_x19[2] = in_stack_00000020;
  *unaff_x19 = 6;
  unaff_x19[1] = uStack0000000000000040;
  return;
}

