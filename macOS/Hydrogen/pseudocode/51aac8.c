
undefined8 FUN_0051aac8(long param_1,long param_2,uint param_3)

{
  byte in_w9;
  byte in_w10;
  long unaff_x19;
  long unaff_x20;
  
  *(byte *)(param_1 + 1) = in_w10 & 0xc0 | (byte)(param_3 >> 0xc) & 0x3f;
  *(byte *)(param_1 + 2) = (byte)(param_3 >> 6) & 0x3f | 0x80;
  *(byte *)(param_1 + 3) = in_w9 & 0xc0 | (byte)param_3 & 0x3f;
  *(long *)(param_2 + 0x10) = unaff_x20 + unaff_x19;
  return 0;
}

