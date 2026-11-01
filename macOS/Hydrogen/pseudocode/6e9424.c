
undefined8 FUN_006e9424(undefined8 param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  
  uVar3 = func_0x006e6c78(param_1,1);
  uVar4 = func_0x006e6bc0(param_1,2);
  uVar2 = 0;
  if (uVar4 < 0x20) {
    uVar2 = uVar3 << (ulong)(uVar4 & 0x1f);
  }
  uVar1 = 0;
  if (0xffffffe0 < uVar4) {
    uVar1 = uVar3 >> (ulong)(-uVar4 & 0x1f);
  }
  if ((uVar4 & 0x80000000) != 0) {
    uVar2 = uVar1;
  }
  func_0x006e3894(param_1,uVar2);
  return 1;
}

