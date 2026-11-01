
undefined8 FUN_004eae34(byte *param_1,long param_2,uint param_3)

{
  byte bVar1;
  long unaff_x19;
  long unaff_x20;
  
  bVar1 = (byte)param_3;
  if (param_3 < 0x80) {
    *param_1 = bVar1;
  }
  else if (param_3 < 0x800) {
    *param_1 = (byte)(param_3 >> 6) | 0xc0;
    param_1[1] = bVar1 & 0x3f | 0x80;
  }
  else if (param_3 < 0x10000) {
    *param_1 = (byte)(param_3 >> 0xc) | 0xe0;
    param_1[1] = (byte)(param_3 >> 6) & 0x3f | 0x80;
    param_1[2] = bVar1 & 0x3f | 0x80;
  }
  else {
    *param_1 = (byte)(param_3 >> 0x12) | 0xf0;
    param_1[1] = (byte)(param_3 >> 0xc) & 0x3f | 0x80;
    param_1[2] = (byte)(param_3 >> 6) & 0x3f | 0x80;
    param_1[3] = bVar1 & 0x3f | 0x80;
  }
  *(long *)(param_2 + 0x10) = unaff_x20 + unaff_x19;
  return 0;
}

