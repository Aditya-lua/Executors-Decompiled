
void FUN_005354a0(undefined8 param_1,uint param_2)

{
  long unaff_x29;
  
  *(byte *)(unaff_x29 + -3) = (byte)(param_2 >> 6) & 0x3f | 0x80;
  *(byte *)(unaff_x29 + -2) = (byte)param_2 & 0x3f | 0x80;
  func_0x00535e1c(param_1,unaff_x29 + -4,3);
  return;
}

