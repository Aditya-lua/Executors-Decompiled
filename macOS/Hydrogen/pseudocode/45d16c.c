
undefined8 FUN_0045d16c(byte *param_1,long param_2,uint param_3)

{
  bool in_CY;
  long unaff_x19;
  long unaff_x20;
  
  if (in_CY) {
    *param_1 = (byte)(param_3 >> 0x12) | 0xf0;
    param_1[1] = (byte)(param_3 >> 0xc) & 0x3f | 0x80;
    param_1[2] = (byte)(param_3 >> 6) & 0x3f | 0x80;
    param_1[3] = (byte)param_3 & 0x3f | 0x80;
  }
  else {
    *param_1 = (byte)(param_3 >> 0xc) | 0xe0;
    param_1[1] = (byte)(param_3 >> 6) & 0x3f | 0x80;
    param_1[2] = (byte)param_3 & 0x3f | 0x80;
  }
  *(long *)(param_2 + 0x10) = unaff_x20 + unaff_x19;
  return 0;
}

