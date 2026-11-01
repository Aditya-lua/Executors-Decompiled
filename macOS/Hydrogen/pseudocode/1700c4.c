
undefined * FUN_001700c4(undefined1 param_1 [16],undefined1 param_2 [16])

{
  undefined8 *unaff_x19;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  unaff_x19[0xd] = param_1._8_8_;
  unaff_x19[0xc] = param_1._0_8_;
  unaff_x19[0xf] = param_2._8_8_;
  unaff_x19[0xe] = param_2._0_8_;
  unaff_x19[1] = in_stack_00000008;
  *unaff_x19 = in_stack_00000000;
  unaff_x19[3] = in_stack_00000018;
  unaff_x19[2] = in_stack_00000010;
  unaff_x19[5] = in_stack_00000028;
  unaff_x19[4] = in_stack_00000020;
  unaff_x19[7] = in_stack_00000038;
  unaff_x19[6] = in_stack_00000030;
  return &UNK_00001b58;
}

