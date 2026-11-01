
void FUN_000dec30(long param_1)

{
  ushort uVar1;
  byte bVar2;
  bool bVar3;
  bool bVar4;
  int iVar5;
  ulong uVar6;
  short sVar7;
  long lVar8;
  long unaff_x19;
  uint uVar9;
  undefined8 uVar10;
  long lVar11;
  int iVar12;
  long unaff_x25;
  undefined4 uVar13;
  uint uVar14;
  float fVar15;
  float fVar16;
  float fVar17;
  float fVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  float fVar22;
  float fVar23;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  
  func_0x0010adc0(param_1 + 0xea4);
  uVar1 = *(ushort *)(unaff_x19 + 0x54);
  bVar2 = (byte)uVar1;
  if (uVar1 < 0x80) {
    lVar8 = 1;
    uStack0000000000000048._3_1_ = bVar2;
  }
  else if (uVar1 < 0x800) {
    uStack0000000000000048._3_1_ = (char)(uVar1 >> 6) - 0x40;
    uStack0000000000000048._4_1_ = bVar2 & 0x3f | 0x80;
    lVar8 = 2;
  }
  else {
    uStack0000000000000048._3_1_ = (byte)(uVar1 >> 0xc) | 0xe0;
    uStack0000000000000048._4_1_ = (byte)(uVar1 >> 6) & 0x3f | 0x80;
    uStack0000000000000048._5_1_ = bVar2 & 0x3f | 0x80;
    lVar8 = 3;
  }
  *(undefined1 *)((long)&uStack0000000000000048 + lVar8 + 3) = 0;
  func_0x0010adc0("Ellipsis character: \'%s\' (U+%04X)");
  func_0x0010adc0("Texture Area: about %d px ~%dx%d px");
  sVar7 = *(short *)(unaff_x19 + 0x50);
  if ((0 < sVar7) && (lVar8 = *(long *)(unaff_x19 + 0x48), lVar8 != 0)) {
    lVar11 = 0;
    while( true ) {
      if (lVar8 != 0) {
        func_0x0010b3a8("Input %d: \'%s\', Oversample: (%d,%d), PixelSnapH: %d, Offset: (%.1f,%.1f)"
                       );
        sVar7 = *(short *)(unaff_x19 + 0x50);
      }
      lVar11 = lVar11 + 1;
      if (sVar7 <= lVar11) break;
      lVar8 = *(long *)(unaff_x19 + 0x48);
    }
  }
  uVar6 = func_0x001226d4("Glyphs","Glyphs (%d)");
  if ((uVar6 & 1) != 0) {
    uVar9 = 0;
    lVar8 = *(long *)(unaff_x25 + 0x4c0);
    lVar11 = *(long *)(lVar8 + 0x4000);
    *(undefined1 *)(lVar11 + 0xc0) = 1;
    uVar10 = *(undefined8 *)(lVar11 + 0x2a8);
    fVar20 = *(float *)(unaff_x19 + 0x14);
    fVar21 = fVar20 + *(float *)(&UNK_00003938 + lVar8);
    do {
      if (((uVar9 & 0xfff) == 0) && (iVar5 = func_0x00105fe8(), iVar5 != 0)) {
        uVar9 = uVar9 + 0xf00;
      }
      else {
        iVar5 = 0;
        iVar12 = 0;
        do {
          lVar8 = func_0x00105fac();
          if (lVar8 != 0) {
            iVar12 = iVar12 + 1;
          }
          iVar5 = iVar5 + 1;
        } while (iVar5 != 0x100);
        if ((iVar12 != 0) && (iVar5 = func_0x001227f4(uVar9,"U+%04X..U+%04X (%d %s)"), iVar5 != 0))
        {
          uVar14 = 0;
          lVar8 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
          fVar22 = *(float *)(lVar8 + 0x110);
          fVar23 = *(float *)(lVar8 + 0x114);
          do {
            uStack0000000000000040._0_4_ = fVar22 + fVar21 * (float)(uVar14 & 0xf);
            uStack0000000000000040._4_4_ = fVar23 + fVar21 * (float)(uVar14 >> 4);
            uStack0000000000000038._0_4_ = fVar20 + (float)uStack0000000000000040;
            uStack0000000000000038._4_4_ = fVar20 + uStack0000000000000040._4_4_;
            lVar8 = func_0x00105fac();
            uVar13 = 0x32ffffff;
            if (lVar8 != 0) {
              uVar13 = 0x64ffffff;
            }
            func_0x000f3af4(0,0x3f800000,uVar10,&uStack0000000000000040,&uStack0000000000000038,
                            uVar13,0);
            if (lVar8 != 0) {
              func_0x00106784(fVar20);
              lVar8 = *(long *)(unaff_x25 + 0x4c0);
              lVar11 = *(long *)(lVar8 + 0x4000);
              fVar17 = (float)uStack0000000000000040;
              if ((float)uStack0000000000000040 < *(float *)(lVar11 + 0x248)) {
                fVar17 = *(float *)(lVar11 + 0x248);
              }
              fVar15 = *(float *)(lVar8 + 0xe40);
              if (fVar17 - *(float *)(&UNK_0000394c + lVar8) <= fVar15) {
                fVar17 = uStack0000000000000038._4_4_;
                if (*(float *)(lVar11 + 0x254) <= uStack0000000000000038._4_4_) {
                  fVar17 = *(float *)(lVar11 + 0x254);
                }
                fVar16 = (float)uStack0000000000000038;
                if (*(float *)(lVar11 + 0x250) <= (float)uStack0000000000000038) {
                  fVar16 = *(float *)(lVar11 + 0x250);
                }
                fVar18 = uStack0000000000000040._4_4_;
                if (uStack0000000000000040._4_4_ < *(float *)(lVar11 + 0x24c)) {
                  fVar18 = *(float *)(lVar11 + 0x24c);
                }
                fVar19 = *(float *)(lVar8 + 0xe44);
                fVar16 = *(float *)(&UNK_0000394c + lVar8) + fVar16;
                fVar17 = fVar17 + *(float *)(&UNK_00003950 + lVar8);
                bVar3 = false;
                if ((fVar18 - *(float *)(&UNK_00003950 + lVar8) <= fVar19) &&
                   (bVar3 = false, !NAN(fVar15) && !NAN(fVar16))) {
                  bVar3 = fVar15 < fVar16;
                }
                bVar4 = false;
                if ((bVar3) && (bVar4 = false, !NAN(fVar19) && !NAN(fVar17))) {
                  bVar4 = fVar19 < fVar17;
                }
                if (bVar4) {
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
            uVar14 = uVar14 + 1;
          } while (uVar14 != 0x100);
          uStack0000000000000040._0_4_ = fVar21 * 16.0;
          uStack0000000000000040._4_4_ = fVar21 * 16.0;
          func_0x0010dbfc(&uStack0000000000000040);
          func_0x00123710();
        }
      }
      uVar9 = uVar9 + 0x100;
    } while (uVar9 < 0x10000);
    func_0x00123710();
  }
  func_0x00123710();
  return;
}

