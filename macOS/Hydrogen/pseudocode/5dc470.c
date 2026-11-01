
void FUN_005dc470(undefined1 param_1 [16],undefined1 param_2 [16],undefined8 *param_3)

{
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 uVar1;
  undefined8 in_stack_00000048;
  
  param_3[1] = param_1._8_8_;
  *param_3 = param_1._0_8_;
  param_3[3] = param_2._8_8_;
  param_3[2] = param_2._0_8_;
  param_3[4] = in_stack_00000048;
  uVar1 = *unaff_x19;
  unaff_x21[1] = unaff_x19[1];
  *unaff_x21 = uVar1;
  unaff_x21[2] = unaff_x19[2];
  uVar1 = *unaff_x20;
  unaff_x21[4] = unaff_x20[1];
  unaff_x21[3] = uVar1;
  unaff_x21[5] = unaff_x20[2];
  unaff_x21[6] = param_3;
  return;
}

