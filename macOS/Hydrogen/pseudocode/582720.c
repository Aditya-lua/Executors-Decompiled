
undefined8 FUN_00582720(long *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  undefined8 in_x9;
  undefined8 unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long *in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  
  uStack0000000000000008 = param_3;
  if (*param_1 == 0) {
    in_stack_00000018 = unaff_x21[1];
    uStack0000000000000010 = *unaff_x21;
    in_stack_00000020 = unaff_x21[2];
    in_stack_00000030 = 0;
    in_stack_00000038 = 0;
    in_stack_00000040 = in_x9;
  }
  else {
    func_0x0055f0a0(unaff_x29 + -0x40,*param_1,param_1[1]);
    if ((*(uint *)(unaff_x29 + -0x40) & 1) == 0) {
      in_stack_00000020 = *(long *)(unaff_x29 + -0x38);
      in_stack_00000030 = *(long *)(unaff_x29 + -0x28);
      goto LAB_005827b4;
    }
    in_stack_00000038 = *(undefined8 *)(unaff_x29 + -0x30);
    in_stack_00000030 = *(long *)(unaff_x29 + -0x38);
    in_stack_00000040 = *(undefined8 *)(unaff_x29 + -0x28);
    in_stack_00000018 = unaff_x21[1];
    uStack0000000000000010 = *unaff_x21;
    in_stack_00000020 = unaff_x21[2];
  }
  if (in_stack_00000018 != 2) {
    in_stack_00000028 = param_1;
    func_0x0057e490(unaff_x29 + -0x40,&uStack0000000000000010);
    return 0;
  }
LAB_005827b4:
  in_stack_00000020 = in_stack_00000020 + in_stack_00000030 * 8;
  uVar1 = *(undefined8 *)(in_stack_00000020 + 0x110);
  *(undefined8 *)(in_stack_00000020 + 0x110) = unaff_x19;
  return uVar1;
}

