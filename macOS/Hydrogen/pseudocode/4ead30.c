
void FUN_004ead30(byte *param_1)

{
  undefined8 *unaff_x19;
  byte unaff_w20;
  
  *param_1 = unaff_w20 / 10 | 0x30;
  param_1[1] = unaff_w20 % 10 | 0x30;
  *unaff_x19 = 3;
  unaff_x19[1] = param_1;
  unaff_x19[2] = 2;
  return;
}

