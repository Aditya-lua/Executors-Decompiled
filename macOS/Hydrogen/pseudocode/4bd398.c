
void FUN_004bd398(undefined1 param_1 [16],undefined1 param_2 [16])

{
  undefined1 uVar1;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  
  unaff_x22[1] = param_1._8_8_;
  *unaff_x22 = param_1._0_8_;
  unaff_x22[3] = param_2._8_8_;
  unaff_x22[2] = param_2._0_8_;
  unaff_x22[5] = in_stack_00000078;
  unaff_x22[4] = in_stack_00000070;
  unaff_x22[7] = in_stack_00000088;
  unaff_x22[6] = in_stack_00000080;
  uVar1 = *(undefined1 *)(unaff_x20 + 0x18);
  unaff_x19[2] = unaff_x22;
  *(undefined1 *)(unaff_x19 + 3) = uVar1;
  *unaff_x19 = 9;
  unaff_x19[1] = unaff_x21;
  return;
}

