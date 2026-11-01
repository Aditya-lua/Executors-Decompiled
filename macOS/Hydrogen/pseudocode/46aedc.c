
void FUN_0046aedc(undefined8 param_1,undefined8 param_2,byte param_3)

{
  byte in_w9;
  long unaff_x29;
  
  *(byte *)(unaff_x29 + -4) = in_w9 | 0xc0;
  *(byte *)(unaff_x29 + -3) = param_3 & 0x3f | 0x80;
  func_0x00468ab4(param_1,unaff_x29 + -4,2);
  return;
}

