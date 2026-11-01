
undefined8 FUN_004bd9f0(long *param_1,uint param_2)

{
  byte *pbVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  long lVar5;
  
  lVar5 = param_1[2];
  uVar2 = 3;
  if (0xffff < param_2) {
    uVar2 = 4;
  }
  uVar3 = 2;
  if (0x7ff < param_2) {
    uVar3 = uVar2;
  }
  uVar2 = 1;
  if (0x7f < param_2) {
    uVar2 = uVar3;
  }
  bVar4 = (byte)param_2;
  if ((ulong)(*param_1 - lVar5) < uVar2) {
    func_0x007a535c(param_1,lVar5,uVar2,1,1);
    pbVar1 = (byte *)(param_1[1] + param_1[2]);
  }
  else {
    pbVar1 = (byte *)(param_1[1] + lVar5);
  }
  if (param_2 < 0x80) {
    *pbVar1 = bVar4;
  }
  else if (param_2 < 0x800) {
    *pbVar1 = (byte)(param_2 >> 6) | 0xc0;
    pbVar1[1] = bVar4 & 0x3f | 0x80;
  }
  else if (param_2 < 0x10000) {
    *pbVar1 = (byte)(param_2 >> 0xc) | 0xe0;
    pbVar1[1] = (byte)(param_2 >> 6) & 0x3f | 0x80;
    pbVar1[2] = bVar4 & 0x3f | 0x80;
  }
  else {
    *pbVar1 = (byte)(param_2 >> 0x12) | 0xf0;
    pbVar1[1] = (byte)(param_2 >> 0xc) & 0x3f | 0x80;
    pbVar1[2] = (byte)(param_2 >> 6) & 0x3f | 0x80;
    pbVar1[3] = bVar4 & 0x3f | 0x80;
  }
  param_1[2] = uVar2 + lVar5;
  return 0;
}

