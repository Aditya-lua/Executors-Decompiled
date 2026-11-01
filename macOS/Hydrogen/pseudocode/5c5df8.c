
ulong FUN_005c5df8(long param_1,ulong param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  uint uVar2;
  ulong unaff_x19;
  long lVar3;
  
  if (param_2 <= param_4) {
    param_4 = param_2;
  }
  lVar3 = param_4 + 1;
  do {
    lVar3 = lVar3 + -1;
    if (lVar3 == 0) {
      uVar2 = (uint)(unaff_x19 < param_2);
      if (param_2 < unaff_x19) {
        uVar2 = 0xffffffff;
      }
      return (ulong)uVar2;
    }
    uVar1 = func_0x005c8a14(param_1,param_3);
    param_1 = param_1 + 0x30;
    param_3 = param_3 + 0x30;
  } while ((uVar1 & 0xff) == 0);
  return uVar1;
}

