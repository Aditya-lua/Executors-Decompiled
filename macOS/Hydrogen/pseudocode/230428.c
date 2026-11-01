
undefined8 FUN_00230428(undefined8 *param_1,uint param_2)

{
  byte bVar1;
  byte bVar2;
  ulong uVar3;
  long *plVar4;
  long lVar5;
  undefined8 uStack0000000000000008;
  
  if (param_2 < 0x10000) {
    uStack0000000000000008._4_1_ = (byte)(param_2 >> 0xc) | 0xe0;
    bVar1 = (byte)(param_2 >> 6);
    uVar3 = 3;
    bVar2 = (byte)param_2;
  }
  else {
    uStack0000000000000008._4_1_ = (byte)(param_2 >> 0x12) | 0xf0;
    bVar1 = (byte)(param_2 >> 0xc);
    bVar2 = (byte)(param_2 >> 6);
    uStack0000000000000008._7_1_ = (byte)param_2 & 0x3f | 0x80;
    uVar3 = 4;
  }
  uStack0000000000000008._6_1_ = bVar2 & 0x3f | 0x80;
  uStack0000000000000008._5_1_ = bVar1 & 0x3f | 0x80;
  plVar4 = (long *)*param_1;
  lVar5 = plVar4[2];
  if ((ulong)(*plVar4 - lVar5) < uVar3) {
    func_0x0079b61c(plVar4,lVar5,uVar3,1,1);
    lVar5 = plVar4[2];
  }
  _memcpy(plVar4[1] + lVar5,(long)&uStack0000000000000008 + 4,uVar3);
  plVar4[2] = lVar5 + uVar3;
  return 0;
}

