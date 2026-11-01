
void FUN_00566140(undefined1 param_1 [16],undefined1 param_2 [16])

{
  undefined8 *unaff_x19;
  undefined8 unaff_x21;
  long unaff_x22;
  
  *(long *)(unaff_x22 + 0x28) = param_1._8_8_;
  *(long *)(unaff_x22 + 0x20) = param_1._0_8_;
  *(long *)(unaff_x22 + 0x38) = param_2._8_8_;
  *(long *)(unaff_x22 + 0x30) = param_2._0_8_;
  unaff_x19[2] = unaff_x22;
  *unaff_x19 = 7;
  unaff_x19[1] = unaff_x21;
  return;
}

