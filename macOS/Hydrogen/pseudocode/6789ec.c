
void FUN_006789ec(void)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  undefined1 auVar9 [12];
  
  func_0x0062a89c();
  auVar9 = __Unwind_Resume();
  uVar3 = auVar9._8_4_;
  lVar2 = auVar9._0_8_;
  lVar5 = *(long *)(lVar2 + 0x10);
  if (lVar5 != 0) {
    lVar4 = *(long *)(lVar2 + 0x18);
    uVar1 = uVar3 & 0x3f;
    if (uVar1 != 0) {
      uVar6 = 0;
      do {
        uVar7 = *(ulong *)(lVar4 + -8 + lVar5 * 8);
        uVar8 = uVar7 >> uVar1 | uVar6;
        uVar6 = uVar7 << ((ulong)(0x40 - uVar1) & 0x3f);
        *(ulong *)(lVar4 + -8 + lVar5 * 8) = uVar8;
        lVar5 = lVar5 + -1;
      } while (lVar5 != 0);
    }
    if (0x3f < uVar3) {
      uVar6 = (ulong)(uVar3 >> 6);
      if (*(ulong *)(lVar2 + 0x10) == uVar6) {
        uVar7 = 0;
        uVar8 = uVar6;
      }
      else {
        uVar7 = 0;
        do {
          *(undefined8 *)(lVar4 + uVar7 * 8) = *(undefined8 *)(lVar4 + uVar6 * 8 + uVar7 * 8);
          uVar7 = uVar7 + 1;
          uVar8 = *(ulong *)(lVar2 + 0x10);
        } while (uVar7 < uVar8 - uVar6);
      }
      for (; uVar7 < uVar8; uVar7 = uVar7 + 1) {
        *(undefined8 *)(lVar4 + uVar7 * 8) = 0;
        uVar8 = *(ulong *)(lVar2 + 0x10);
      }
    }
  }
  return;
}

