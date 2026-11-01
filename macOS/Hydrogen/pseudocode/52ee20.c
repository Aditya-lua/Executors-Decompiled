
undefined8 FUN_0052ee20(ulong param_1,long *param_2,uint param_3)

{
  byte *pbVar1;
  ulong uVar2;
  byte bVar3;
  bool in_CY;
  ulong in_x9;
  long unaff_x19;
  
  uVar2 = 3;
  if (in_CY) {
    uVar2 = 4;
  }
  if (0x7ff < param_3) {
    in_x9 = uVar2;
  }
  if (0x7f < param_3) {
    param_1 = in_x9;
  }
  bVar3 = (byte)param_3;
  if ((ulong)(*param_2 - unaff_x19) < param_1) {
    func_0x007a5594();
    pbVar1 = (byte *)(param_2[1] + param_2[2]);
  }
  else {
    pbVar1 = (byte *)(param_2[1] + unaff_x19);
  }
  if (param_3 < 0x80) {
    *pbVar1 = bVar3;
  }
  else if (param_3 < 0x800) {
    *pbVar1 = (byte)(param_3 >> 6) | 0xc0;
    pbVar1[1] = bVar3 & 0x3f | 0x80;
  }
  else if (param_3 < 0x10000) {
    *pbVar1 = (byte)(param_3 >> 0xc) | 0xe0;
    pbVar1[1] = (byte)(param_3 >> 6) & 0x3f | 0x80;
    pbVar1[2] = bVar3 & 0x3f | 0x80;
  }
  else {
    *pbVar1 = (byte)(param_3 >> 0x12) | 0xf0;
    pbVar1[1] = (byte)(param_3 >> 0xc) & 0x3f | 0x80;
    pbVar1[2] = (byte)(param_3 >> 6) & 0x3f | 0x80;
    pbVar1[3] = bVar3 & 0x3f | 0x80;
  }
  param_2[2] = param_1 + unaff_x19;
  return 0;
}

