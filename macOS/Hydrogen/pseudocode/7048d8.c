
void FUN_007048d8(undefined8 param_1)

{
  undefined8 in_x9;
  long unaff_x19;
  
  *(undefined8 *)(unaff_x19 + 8) = param_1;
  *(undefined8 *)(unaff_x19 + 0x10) = in_x9;
  *(short *)(unaff_x19 + 0x52) = *(short *)(unaff_x19 + 0x52) + -1;
  return;
}

