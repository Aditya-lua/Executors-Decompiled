
undefined8 FUN_004000dc(undefined8 param_1,uint param_2)

{
  byte *pbVar1;
  byte bVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  
  func_0x007a0000();
  pbVar1 = (byte *)(*(long *)(unaff_x21 + 8) + *(long *)(unaff_x21 + 0x10));
  bVar2 = (byte)param_2;
  if (param_2 < 0x80) {
    *pbVar1 = bVar2;
  }
  else if (param_2 < 0x800) {
    *pbVar1 = (byte)(param_2 >> 6) | 0xc0;
    pbVar1[1] = bVar2 & 0x3f | 0x80;
  }
  else if (param_2 < 0x10000) {
    *pbVar1 = (byte)(param_2 >> 0xc) | 0xe0;
    pbVar1[1] = (byte)(param_2 >> 6) & 0x3f | 0x80;
    pbVar1[2] = bVar2 & 0x3f | 0x80;
  }
  else {
    *pbVar1 = (byte)(param_2 >> 0x12) | 0xf0;
    pbVar1[1] = (byte)(param_2 >> 0xc) & 0x3f | 0x80;
    pbVar1[2] = (byte)(param_2 >> 6) & 0x3f | 0x80;
    pbVar1[3] = bVar2 & 0x3f | 0x80;
  }
  *(long *)(unaff_x21 + 0x10) = unaff_x20 + unaff_x19;
  return 0;
}

