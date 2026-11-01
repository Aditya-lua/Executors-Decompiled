
undefined8 FUN_00177b34(long param_1,long param_2,uint param_3)

{
  byte *pbVar1;
  byte bVar2;
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  
  pbVar1 = (byte *)(in_x9 + param_1);
  bVar2 = (byte)param_3;
  if (param_3 < 0x80) {
    *pbVar1 = bVar2;
  }
  else if (param_3 < 0x800) {
    *pbVar1 = (byte)(param_3 >> 6) | 0xc0;
    pbVar1[1] = bVar2 & 0x3f | 0x80;
  }
  else if (param_3 < 0x10000) {
    *pbVar1 = (byte)(param_3 >> 0xc) | 0xe0;
    pbVar1[1] = (byte)(param_3 >> 6) & 0x3f | 0x80;
    pbVar1[2] = bVar2 & 0x3f | 0x80;
  }
  else {
    *pbVar1 = (byte)(param_3 >> 0x12) | 0xf0;
    pbVar1[1] = (byte)(param_3 >> 0xc) & 0x3f | 0x80;
    pbVar1[2] = (byte)(param_3 >> 6) & 0x3f | 0x80;
    pbVar1[3] = bVar2 & 0x3f | 0x80;
  }
  *(long *)(param_2 + 0x10) = unaff_x20 + unaff_x19;
  return 0;
}

