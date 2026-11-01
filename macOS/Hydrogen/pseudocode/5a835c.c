
void FUN_005a835c(long *param_1,long *param_2)

{
  undefined8 uVar1;
  ushort uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  
  lVar4 = *param_2;
  lVar3 = param_2[1];
  uVar5 = param_2[2];
  if (uVar5 < *(ushort *)(lVar4 + 0x322)) {
    lVar6 = lVar4;
    lVar7 = lVar3;
  }
  else {
    do {
      lVar6 = *(long *)(lVar4 + 0x210);
      if (lVar6 == 0) {
        uVar1 = 0x328;
        if (lVar3 != 0) {
          uVar1 = 0x388;
        }
        func_0x00187bd4(lVar4,uVar1,8);
        *param_1 = 0;
        return;
      }
      lVar7 = lVar3 + 1;
      uVar2 = *(ushort *)(lVar4 + 800);
      uVar5 = (ulong)uVar2;
      uVar1 = 0x328;
      if (lVar3 != 0) {
        uVar1 = 0x388;
      }
      func_0x00187bd4(lVar4,uVar1,8);
      lVar4 = lVar6;
      lVar3 = lVar7;
    } while (*(ushort *)(lVar6 + 0x322) <= uVar2);
  }
  lVar4 = uVar5 + 1;
  if (lVar7 == 0) {
    lVar3 = lVar6;
  }
  else {
    lVar3 = lVar6 + lVar4 * 8;
    lVar4 = lVar7;
    do {
      lVar3 = *(long *)(lVar3 + 0x328);
      lVar4 = lVar4 + -1;
    } while (lVar4 != 0);
    lVar4 = 0;
  }
  *param_1 = lVar3;
  param_1[1] = 0;
  param_1[2] = lVar4;
  param_1[3] = lVar6;
  param_1[4] = lVar7;
  param_1[5] = uVar5;
  return;
}

