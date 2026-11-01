
void FUN_000df03c(char *param_1)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  uint uVar6;
  uint unaff_w20;
  int iVar7;
  long unaff_x25;
  uint unaff_w28;
  float fVar8;
  float fVar9;
  float fVar10;
  float fVar11;
  float fVar12;
  float unaff_s8;
  float unaff_s9;
  float unaff_s11;
  float unaff_s12;
  undefined8 uStack0000000000000040;
  
  do {
    func_0x0010adc0(param_1);
    func_0x0010df50();
    func_0x0010adc0("Visible: %d");
    func_0x0010adc0("AdvanceX: %.1f");
    func_0x0010adc0("Pos: (%.2f,%.2f)->(%.2f,%.2f)");
    func_0x0010adc0("UV: (%.3f,%.3f)->(%.3f,%.3f)");
    func_0x000cea90();
    do {
      do {
        do {
          unaff_w28 = unaff_w28 + 1;
          if (unaff_w28 == 0x100) {
            func_0x0010dbfc(&uStack0000000000000040);
            func_0x00123710();
            uVar6 = unaff_w20;
            do {
              while( true ) {
                unaff_w20 = uVar6 + 0x100;
                if (0xffff < unaff_w20) {
                  func_0x00123710();
                  func_0x00123710();
                  return;
                }
                if (((unaff_w20 & 0xfff) != 0) || (iVar3 = func_0x00105fe8(), iVar3 == 0)) break;
                uVar6 = uVar6 + 0x1000;
              }
              iVar3 = 0;
              iVar7 = 0;
              do {
                lVar4 = func_0x00105fac();
                if (lVar4 != 0) {
                  iVar7 = iVar7 + 1;
                }
                iVar3 = iVar3 + 1;
              } while (iVar3 != 0x100);
              uVar6 = unaff_w20;
            } while ((iVar7 == 0) ||
                    (iVar3 = func_0x001227f4(unaff_w20,"U+%04X..U+%04X (%d %s)"), iVar3 == 0));
            unaff_w28 = 0;
            lVar4 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
            unaff_s11 = *(float *)(lVar4 + 0x110);
            unaff_s12 = *(float *)(lVar4 + 0x114);
          }
          uStack0000000000000040._0_4_ = unaff_s11 + unaff_s9 * (float)(unaff_w28 & 0xf);
          uStack0000000000000040._4_4_ = unaff_s12 + unaff_s9 * (float)(unaff_w28 >> 4);
          fVar8 = unaff_s8 + (float)uStack0000000000000040;
          fVar10 = unaff_s8 + uStack0000000000000040._4_4_;
          lVar4 = func_0x00105fac();
          func_0x000f3af4(0,0x3f800000);
        } while (lVar4 == 0);
        func_0x00106784(unaff_s8);
        lVar4 = *(long *)(unaff_x25 + 0x4c0);
        lVar5 = *(long *)(lVar4 + 0x4000);
        fVar11 = (float)uStack0000000000000040;
        if ((float)uStack0000000000000040 < *(float *)(lVar5 + 0x248)) {
          fVar11 = *(float *)(lVar5 + 0x248);
        }
        fVar9 = *(float *)(lVar4 + 0xe40);
      } while (fVar9 < fVar11 - *(float *)(&UNK_0000394c + lVar4));
      if (*(float *)(lVar5 + 0x254) <= fVar10) {
        fVar10 = *(float *)(lVar5 + 0x254);
      }
      if (*(float *)(lVar5 + 0x250) <= fVar8) {
        fVar8 = *(float *)(lVar5 + 0x250);
      }
      fVar11 = uStack0000000000000040._4_4_;
      if (uStack0000000000000040._4_4_ < *(float *)(lVar5 + 0x24c)) {
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
    } while (!bVar2);
    func_0x000d8e98(0,0);
    param_1 = "Codepoint: U+%04X";
  } while( true );
}

