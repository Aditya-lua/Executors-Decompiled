
void FUN_000dee64(void)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  uint unaff_w20;
  int iVar6;
  long unaff_x25;
  uint uVar7;
  float fVar8;
  float fVar9;
  float fVar10;
  float fVar11;
  float fVar12;
  float unaff_s8;
  float unaff_s9;
  undefined4 unaff_s10;
  float fVar13;
  float fVar14;
  undefined4 uStack0000000000000040;
  float fStack0000000000000044;
  
  while (uVar7 = unaff_w20 + 0x100, uVar7 < 0x10000) {
    if (((uVar7 & 0xfff) == 0) && (iVar3 = func_0x00105fe8(), iVar3 != 0)) {
      unaff_w20 = unaff_w20 + 0x1000;
    }
    else {
      iVar3 = 0;
      iVar6 = 0;
      do {
        lVar4 = func_0x00105fac();
        if (lVar4 != 0) {
          iVar6 = iVar6 + 1;
        }
        iVar3 = iVar3 + 1;
      } while (iVar3 != 0x100);
      unaff_w20 = uVar7;
      if ((iVar6 != 0) && (iVar3 = func_0x001227f4(uVar7,"U+%04X..U+%04X (%d %s)"), iVar3 != 0)) {
        uVar7 = 0;
        lVar4 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
        fVar13 = *(float *)(lVar4 + 0x110);
        fVar14 = *(float *)(lVar4 + 0x114);
        do {
          uStack0000000000000040 = fVar13 + unaff_s9 * (float)(uVar7 & 0xf);
          fStack0000000000000044 = fVar14 + unaff_s9 * (float)(uVar7 >> 4);
          fVar8 = unaff_s8 + uStack0000000000000040;
          fVar10 = unaff_s8 + fStack0000000000000044;
          lVar4 = func_0x00105fac();
          func_0x000f3af4(0,0x3f800000);
          if (lVar4 != 0) {
            func_0x00106784(unaff_s8);
            lVar4 = *(long *)(unaff_x25 + 0x4c0);
            lVar5 = *(long *)(lVar4 + 0x4000);
            fVar11 = uStack0000000000000040;
            if (uStack0000000000000040 < *(float *)(lVar5 + 0x248)) {
              fVar11 = *(float *)(lVar5 + 0x248);
            }
            fVar9 = *(float *)(lVar4 + 0xe40);
            if (fVar11 - *(float *)(&UNK_0000394c + lVar4) <= fVar9) {
              if (*(float *)(lVar5 + 0x254) <= fVar10) {
                fVar10 = *(float *)(lVar5 + 0x254);
              }
              if (*(float *)(lVar5 + 0x250) <= fVar8) {
                fVar8 = *(float *)(lVar5 + 0x250);
              }
              fVar11 = fStack0000000000000044;
              if (fStack0000000000000044 < *(float *)(lVar5 + 0x24c)) {
                fVar11 = *(float *)(lVar5 + 0x24c);
              }
              fVar12 = *(float *)(lVar4 + 0xe44);
              fVar8 = *(float *)(&UNK_0000394c + lVar4) + fVar8;
              fVar10 = fVar10 + *(float *)(&UNK_00003950 + lVar4);
              bVar1 = false;
              if ((fVar11 - *(float *)(&UNK_00003950 + lVar4) <= fVar12) &&
                 (bVar1 = false, !NAN(fVar9) && !NAN(fVar8))) {
                bVar1 = fVar9 < fVar8;
              }
              bVar2 = false;
              if ((bVar1) && (bVar2 = false, !NAN(fVar12) && !NAN(fVar10))) {
                bVar2 = fVar12 < fVar10;
              }
              if (bVar2) {
                func_0x000d8e98(0,0);
                func_0x0010adc0("Codepoint: U+%04X");
                func_0x0010df50();
                func_0x0010adc0("Visible: %d");
                func_0x0010adc0("AdvanceX: %.1f");
                func_0x0010adc0("Pos: (%.2f,%.2f)->(%.2f,%.2f)");
                func_0x0010adc0("UV: (%.3f,%.3f)->(%.3f,%.3f)");
                func_0x000cea90();
              }
            }
          }
          uVar7 = uVar7 + 1;
        } while (uVar7 != 0x100);
        uStack0000000000000040 = (float)unaff_s10;
        func_0x0010dbfc(&uStack0000000000000040);
        func_0x00123710();
      }
    }
  }
  func_0x00123710();
  func_0x00123710();
  return;
}

