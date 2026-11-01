
void FUN_000decc8(undefined8 param_1)

{
  bool bVar1;
  bool bVar2;
  int iVar3;
  ulong uVar4;
  uint *puVar5;
  short sVar6;
  double in_x9;
  long lVar7;
  long unaff_x19;
  double dVar8;
  long lVar9;
  undefined8 uVar10;
  long lVar11;
  uint uVar12;
  double dVar13;
  long unaff_x25;
  undefined4 uVar14;
  float fVar15;
  float fVar16;
  float fVar17;
  float fVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  float fVar22;
  float fVar23;
  double dStack0000000000000000;
  double dStack0000000000000008;
  double dStack0000000000000010;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  
  dStack0000000000000000 = (double)param_1;
  dStack0000000000000008 = in_x9;
  dStack0000000000000010 = in_x9;
  func_0x0010adc0("Texture Area: about %d px ~%dx%d px");
  sVar6 = *(short *)(unaff_x19 + 0x50);
  if ((0 < sVar6) && (lVar7 = *(long *)(unaff_x19 + 0x48), lVar7 != 0)) {
    lVar9 = 0;
    lVar11 = 0;
    while( true ) {
      if (lVar7 != 0) {
        dStack0000000000000008 = (double)(lVar7 + lVar9 + 0x5a);
        dStack0000000000000010 = (double)(ulong)*(uint *)(lVar7 + lVar9 + 0x18);
        dStack0000000000000000 = (double)lVar11;
        func_0x0010b3a8("Input %d: \'%s\', Oversample: (%d,%d), PixelSnapH: %d, Offset: (%.1f,%.1f)"
                       );
        sVar6 = *(short *)(unaff_x19 + 0x50);
      }
      lVar11 = lVar11 + 1;
      if (sVar6 <= lVar11) break;
      lVar7 = *(long *)(unaff_x19 + 0x48);
      lVar9 = lVar9 + 0x90;
    }
  }
  dStack0000000000000000 = (double)(ulong)*(uint *)(unaff_x19 + 0x28);
  uVar4 = func_0x001226d4("Glyphs","Glyphs (%d)");
  if ((uVar4 & 1) != 0) {
    dVar8 = 0.0;
    lVar7 = *(long *)(unaff_x25 + 0x4c0);
    lVar11 = *(long *)(lVar7 + 0x4000);
    *(undefined1 *)(lVar11 + 0xc0) = 1;
    uVar10 = *(undefined8 *)(lVar11 + 0x2a8);
    fVar20 = *(float *)(unaff_x19 + 0x14);
    fVar21 = fVar20 + *(float *)(&UNK_00003938 + lVar7);
    do {
      if ((((ulong)dVar8 & 0xfff) == 0) && (iVar3 = func_0x00105fe8(), iVar3 != 0)) {
        dVar8 = (double)(ulong)(SUB84(dVar8,0) + 0xf00);
      }
      else {
        iVar3 = 0;
        dVar13 = 0.0;
        do {
          lVar7 = func_0x00105fac();
          uVar12 = SUB84(dVar13,0);
          if (lVar7 != 0) {
            uVar12 = uVar12 + 1;
          }
          dVar13 = (double)(ulong)uVar12;
          iVar3 = iVar3 + 1;
        } while (iVar3 != 0x100);
        if (uVar12 != 0) {
          dStack0000000000000008 = (double)(ulong)(SUB84(dVar8,0) + 0xff);
          dStack0000000000000000 = dVar8;
          dStack0000000000000010 = dVar13;
          iVar3 = func_0x001227f4(dVar8,"U+%04X..U+%04X (%d %s)");
          if (iVar3 != 0) {
            uVar12 = 0;
            lVar7 = *(long *)(*(long *)(unaff_x25 + 0x4c0) + 0x4000);
            fVar22 = *(float *)(lVar7 + 0x110);
            fVar23 = *(float *)(lVar7 + 0x114);
            do {
              uStack0000000000000040._0_4_ = fVar22 + fVar21 * (float)(uVar12 & 0xf);
              uStack0000000000000040._4_4_ = fVar23 + fVar21 * (float)(uVar12 >> 4);
              uStack0000000000000038._0_4_ = fVar20 + (float)uStack0000000000000040;
              uStack0000000000000038._4_4_ = fVar20 + uStack0000000000000040._4_4_;
              puVar5 = (uint *)func_0x00105fac();
              uVar14 = 0x32ffffff;
              if (puVar5 != (uint *)0x0) {
                uVar14 = 0x64ffffff;
              }
              func_0x000f3af4(0,0x3f800000,uVar10,&uStack0000000000000040,&uStack0000000000000038,
                              uVar14,0);
              if (puVar5 != (uint *)0x0) {
                func_0x00106784(fVar20);
                lVar7 = *(long *)(unaff_x25 + 0x4c0);
                lVar11 = *(long *)(lVar7 + 0x4000);
                fVar17 = (float)uStack0000000000000040;
                if ((float)uStack0000000000000040 < *(float *)(lVar11 + 0x248)) {
                  fVar17 = *(float *)(lVar11 + 0x248);
                }
                fVar15 = *(float *)(lVar7 + 0xe40);
                if (fVar17 - *(float *)(&UNK_0000394c + lVar7) <= fVar15) {
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
                  fVar19 = *(float *)(lVar7 + 0xe44);
                  fVar16 = *(float *)(&UNK_0000394c + lVar7) + fVar16;
                  fVar17 = fVar17 + *(float *)(&UNK_00003950 + lVar7);
                  bVar1 = false;
                  if ((fVar18 - *(float *)(&UNK_00003950 + lVar7) <= fVar19) &&
                     (bVar1 = false, !NAN(fVar15) && !NAN(fVar16))) {
                    bVar1 = fVar15 < fVar16;
                  }
                  bVar2 = false;
                  if ((bVar1) && (bVar2 = false, !NAN(fVar19) && !NAN(fVar17))) {
                    bVar2 = fVar19 < fVar17;
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
                    dStack0000000000000008 = (double)(float)puVar5[3];
                    dStack0000000000000010 = (double)(float)puVar5[4];
                    func_0x0010adc0("Pos: (%.2f,%.2f)->(%.2f,%.2f)");
                    dStack0000000000000000 = (double)(float)puVar5[6];
                    dStack0000000000000008 = (double)(float)puVar5[7];
                    dStack0000000000000010 = (double)(float)puVar5[8];
                    func_0x0010adc0("UV: (%.3f,%.3f)->(%.3f,%.3f)");
                    func_0x000cea90();
                  }
                }
              }
              uVar12 = uVar12 + 1;
            } while (uVar12 != 0x100);
            uStack0000000000000040._0_4_ = fVar21 * 16.0;
            uStack0000000000000040._4_4_ = fVar21 * 16.0;
            func_0x0010dbfc(&uStack0000000000000040);
            func_0x00123710();
          }
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

