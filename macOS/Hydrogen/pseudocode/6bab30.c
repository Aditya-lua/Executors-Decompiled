
void FUN_006bab30(undefined8 param_1,undefined1 param_2 [16])

{
  undefined8 in_x9;
  long unaff_x19;
  undefined8 *unaff_x21;
  undefined8 uVar1;
  
  uVar1 = *unaff_x21;
  *(undefined8 *)(unaff_x19 + 0x10) = unaff_x21[1];
  *(undefined8 *)(unaff_x19 + 8) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x18) = in_x9;
  unaff_x21[1] = param_2._8_8_;
  *unaff_x21 = param_2._0_8_;
  unaff_x21[2] = param_1;
  return;
}

