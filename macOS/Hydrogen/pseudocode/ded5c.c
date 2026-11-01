
void FUN_000ded5c(double param_1)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  uint *puVar5;
  long lVar6;
  long lVar7;
  long unaff_x19;
  double dVar8;
  undefined8 uVar9;
  int iVar10;
  long unaff_x25;
  undefined4 uVar11;
  uint uVar12;
  float fVar13;
  float fVar14;
  float fVar15;
  float fVar16;
  float fVar17;
  float fVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  double dStack0000000000000000;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  dStack0000000000000000 = param_1;
  uVar4 = func_0x001226d4("Glyphs","Glyphs (%d)");
  if ((uVar4 & 1) != 0) {
    dVar8 = 0.0;
    lVar6 = *(long *)(unaff_x25 + 0x4c0);
    lVar7 = *(long *)(lVar6 + 0x4000);
    *(undefined1 *)(lVar7 + 0xc0) = 1;
    uVar9 = *(undefined8 *)(lVar7 + 0x2a8);
    fVar18 = *(float *)(unaff_x19 + 0x14);
    fVar19 = fVar18 + *(float *)(&UNK_00003938 + lVar6);
    do {
      if ((((ulong)dVar8 & 0xfff) == 0) && (iVar3 = func_0x00105fe8(), iVar3 != 0)) {
        dVar8 = (double)(ulong)(SUB84(dVar8,0) + 0xf00);
      }
      else {
        iVar3 = 0;
        iVar10 = 0;
        do {
          lVar6 = func_0x00105fac();
          if (lVar6 != 0) {
            iVar10 = iVar10 + 1;
          }
          iVar3 = iVar3 + 1;
        } while (iVar3 != 0x100);
        if ((iVar10 != 0) &&
           (dStack0000000000000000 = dVar8, iVar3 = func_0x001227f4(dVar8,"U+%04X..U+%04X (%d %s)"),
           iVar3 != 0)) {
          uVar12 = 0;
          lVar6 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
          fVar20 = *(float *)(lVar6 + 0x110);
          fVar21 = *(float *)(lVar6 + 0x114);
          do {
            uStack0000000000000040._0_4_ = fVar20 + fVar19 * (float)(uVar12 & 0xf);
            uStack0000000000000040._4_4_ = fVar21 + fVar19 * (float)(uVar12 >> 4);
            uStack0000000000000038._0_4_ = fVar18 + (float)uStack0000000000000040;
            uStack0000000000000038._4_4_ = fVar18 + uStack0000000000000040._4_4_;
            puVar5 = (uint *)func_0x00105fac();
            uVar11 = 0x32ffffff;
            if (puVar5 != (uint *)0x0) {
              uVar11 = 0x64ffffff;
            }
            func_0x000f3af4(0,0x3f800000,uVar9,&uStack0000000000000040,&uStack0000000000000038,
                            uVar11,0);
            if (puVar5 != (uint *)0x0) {
              func_0x00106784(fVar18);
              lVar6 = *(long *)(unaff_x25 + 0x4c0);
              lVar7 = *(long *)(lVar6 + 0x4000);
              fVar15 = (float)uStack0000000000000040;
              if ((float)uStack0000000000000040 < *(float *)(lVar7 + 0x248)) {
                fVar15 = *(float *)(lVar7 + 0x248);
              }
              fVar13 = *(float *)(lVar6 + 0xe40);
              if (fVar15 - *(float *)(&UNK_0000394c + lVar6) <= fVar13) {
                fVar15 = uStack0000000000000038._4_4_;
                if (*(float *)(lVar7 + 0x254) <= uStack0000000000000038._4_4_) {
                  fVar15 = *(float *)(lVar7 + 0x254);
                }
                fVar14 = (float)uStack0000000000000038;
                if (*(float *)(lVar7 + 0x250) <= (float)uStack0000000000000038) {
                  fVar14 = *(float *)(lVar7 + 0x250);
                }
                fVar16 = uStack0000000000000040._4_4_;
                if (uStack0000000000000040._4_4_ < *(float *)(lVar7 + 0x24c)) {
                  fVar16 = *(float *)(lVar7 + 0x24c);
                }
                fVar17 = *(float *)(lVar6 + 0xe44);
                fVar14 = *(float *)(&UNK_0000394c + lVar6) + fVar14;
                fVar15 = fVar15 + *(float *)(&UNK_00003950 + lVar6);
                bVar1 = false;
                if ((fVar16 - *(float *)(&UNK_00003950 + lVar6) <= fVar17) &&
                   (bVar1 = false, !NAN(fVar13) && !NAN(fVar14))) {
                  bVar1 = fVar13 < fVar14;
                }
                bVar2 = false;
                if ((bVar1) && (bVar2 = false, !NAN(fVar17) && !NAN(fVar15))) {
                  bVar2 = fVar17 < fVar15;
                }
                if (bVar2) {
                  func_0x000d8e98(0,0);
                  dStack0000000000000000 = (double)(ulong)(*puVar5 >> 2);
                  func_0x0010adc0("Codepoint: U+%04X");
                  func_0x0010df50();
                  dStack0000000000000000 = (double)(ulong)(*puVar5 >> 1 & 1);
                  func_0x0010adc0("Visible: %d");
                  dStack0000000000000000 = (double)(float)puVar5[1];
                  func_0x0010adc0("AdvanceX: %.1f");
                  dStack0000000000000000 = (double)(float)puVar5[2];
                  func_0x0010adc0("Pos: (%.2f,%.2f)->(%.2f,%.2f)");
                  dStack0000000000000000 = (double)(float)puVar5[6];
                  func_0x0010adc0("UV: (%.3f,%.3f)->(%.3f,%.3f)");
                  func_0x000cea90();
                }
              }
            }
            uVar12 = uVar12 + 1;
          } while (uVar12 != 0x100);
          uStack0000000000000040._0_4_ = fVar19 * 16.0;
          uStack0000000000000040._4_4_ = fVar19 * 16.0;
          func_0x0010dbfc(&uStack0000000000000040);
          func_0x00123710();
        }
      }
      uVar12 = SUB84(dVar8,0) + 0x100;
      dVar8 = (double)(ulong)uVar12;
    } while (uVar12 < 0x10000);
    func_0x00123710();
  }
  func_0x00123710();
  return;
}

