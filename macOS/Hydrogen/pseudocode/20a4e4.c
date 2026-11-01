
undefined8 FUN_0020a4e4(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  long *plVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  undefined1 auVar16 [16];
  
  func_0x00187bd4();
  auVar16 = __Unwind_Resume();
  lVar3 = auVar16._8_8_;
  lVar1 = *(long *)(auVar16._0_8_ + 0x10);
  lVar2 = *(long *)(auVar16._0_8_ + 0x18);
  if (*(long *)(lVar1 + 0x10) != lVar2) {
    lVar5 = *(long *)(lVar1 + 8);
    plVar4 = (long *)(lVar5 + *(long *)(lVar1 + 0x10) * 0x40);
    plVar6 = *(long **)(lVar3 + 0x18);
    plVar7 = *(long **)(lVar3 + 8);
    do {
      if (plVar7 == plVar6) {
        return 0;
      }
      lVar8 = *plVar7;
      *(long **)(lVar3 + 8) = plVar7 + 8;
      if (lVar8 == -0x7fffffffffffffe8) {
        return 0;
      }
      lVar11 = plVar7[2];
      lVar10 = plVar7[1];
      lVar13 = plVar7[4];
      lVar12 = plVar7[3];
      lVar15 = plVar7[6];
      lVar14 = plVar7[5];
      lVar9 = plVar7[7];
      *plVar4 = lVar8;
      plVar4[2] = lVar11;
      plVar4[1] = lVar10;
      plVar4[4] = lVar13;
      plVar4[3] = lVar12;
      plVar4[6] = lVar15;
      plVar4[5] = lVar14;
      plVar4[7] = lVar9;
      *(long *)(lVar1 + 0x10) = *(long *)(lVar1 + 0x10) + 1;
      plVar4 = plVar4 + 8;
      plVar7 = plVar7 + 8;
    } while (plVar4 != (long *)(lVar5 + lVar2 * 0x40));
  }
  return 1;
}

