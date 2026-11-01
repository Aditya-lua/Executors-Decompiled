
void FUN_002439fc(ulong *param_1)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  long *plVar6;
  ulong uVar7;
  long lVar8;
  ulong unaff_x21;
  ulong uVar9;
  ulong uVar10;
  
  uVar2 = param_1[1];
  uVar3 = param_1[2];
  uVar7 = *param_1;
  uVar10 = 0;
  if (uVar7 <= uVar3) {
    uVar10 = uVar7;
  }
  lVar8 = uVar3 - uVar10;
  uVar9 = uVar7 - lVar8;
  lVar1 = 0;
  if (uVar9 <= unaff_x21) {
    lVar1 = unaff_x21 - uVar9;
  }
  if (unaff_x21 <= uVar9) {
    uVar7 = lVar8 + unaff_x21;
  }
  if (uVar7 - lVar8 != 0) {
    lVar4 = uVar3 * 8 + uVar10 * -8;
    lVar8 = 1 - (uVar7 - lVar8);
    do {
      lVar5 = **(long **)(uVar2 + lVar4);
      **(long **)(uVar2 + lVar4) = lVar5 + -1;
      LORelease();
      if (lVar5 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9a18(uVar2 + lVar4);
      }
      lVar4 = lVar4 + 8;
      lVar8 = lVar8 + 1;
    } while (lVar8 != 1);
  }
  if (uVar9 < unaff_x21) {
    lVar8 = 0;
    uVar10 = uVar2;
    do {
      plVar6 = *(long **)(uVar2 + lVar8 * 8);
      lVar4 = *plVar6;
      *plVar6 = lVar4 + -1;
      LORelease();
      if (lVar4 == 1) {
        DataMemoryBarrier(2,1);
        func_0x001f9a18(uVar10);
      }
      lVar8 = lVar8 + 1;
      uVar10 = uVar10 + 8;
    } while (lVar1 != lVar8);
  }
  return;
}

