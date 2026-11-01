
undefined8 FUN_007682fc(int param_1)

{
  byte in_w8;
  long unaff_x19;
  
  *(byte *)(unaff_x19 + 0x271) = in_w8;
  if (param_1 == -1) {
    *(byte *)(unaff_x19 + 0x271) = in_w8 | 8;
    return 0xb;
  }
  return 0;
}

