
ulong FUN_005c8dc8(ulong param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  bool in_ZR;
  long lVar4;
  uint uVar5;
  long lVar6;
  long unaff_x19;
  long unaff_x20;
  long lVar7;
  
  if (in_ZR) {
    uVar2 = *(ulong *)(unaff_x20 + 0x28);
    uVar3 = *(ulong *)(unaff_x19 + 0x28);
    uVar1 = uVar3;
    if (uVar2 <= uVar3) {
      uVar1 = uVar2;
    }
    lVar7 = uVar1 + 1;
    lVar4 = *(long *)(unaff_x19 + 0x20);
    lVar6 = *(long *)(unaff_x20 + 0x20);
    do {
      lVar7 = lVar7 + -1;
      if (lVar7 == 0) {
        uVar5 = (uint)(uVar3 < uVar2);
        if (uVar2 < uVar3) {
          uVar5 = 0xffffffff;
        }
        return (ulong)uVar5;
      }
      param_1 = func_0x005c8a14(lVar6,lVar4);
      lVar4 = lVar4 + 0x30;
      lVar6 = lVar6 + 0x30;
    } while ((param_1 & 0xff) == 0);
  }
  return param_1;
}

