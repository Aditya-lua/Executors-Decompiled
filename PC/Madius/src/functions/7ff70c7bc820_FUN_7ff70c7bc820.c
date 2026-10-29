/* 7ff70c7bc820 FUN_7ff70c7bc820 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7bc820(longlong param_1,float *param_2,float *param_3,float param_4,uint param_5)

{
  int iVar1;
  undefined8 uVar2;
  code *pcVar3;
  bool bVar4;
  float fVar5;
  ushort uVar6;
  uint uVar7;
  longlong lVar8;
  longlong lVar9;
  undefined8 *puVar10;
  byte bVar11;
  int iVar12;
  int iVar13;
  uint uVar14;
  ulonglong uVar15;
  uint uVar16;
  undefined1 *puVar17;
  ulonglong *puVar18;
  ulonglong unaff_RBP;
  undefined4 uVar19;
  int iVar20;
  uint uVar21;
  int iVar22;
  float fVar23;
  float fVar24;
  float fVar25;
  undefined1 auVar26 [16];
  float fVar27;
  float fVar28;
  float fVar29;
  undefined *apuStack_100 [2];
  ulonglong uStack_f0;
  undefined1 auStack_e8 [28];
  undefined4 uStack_cc;
  ulonglong uStack_c8;
  undefined4 uStack_bc;
  float *pfStack_b8;
  ulonglong uStack_b0;
  
  fVar24 = _DAT_7ff70cb1ba70;
  puVar18 = (ulonglong *)auStack_e8;
  uStack_b0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_e8;
  if (_DAT_7ff70cb1ba70 <= param_4) {
    uVar21 = param_5 | 0xf0;
    if ((param_5 & 0x1f0) != 0) {
      uVar21 = param_5;
    }
    uVar7 = ~uVar21;
    fVar27 = _DAT_7ff70cb1ba70;
    if ((uVar7 & 0xc0) != 0) {
      fVar27 = _DAT_7ff70cb1ba2c;
    }
    fVar25 = _DAT_7ff70cb1ba70;
    if ((uVar7 & 0x30) != 0) {
      fVar25 = fVar27;
    }
    fVar25 = fVar25 * (float)((uint)(*param_3 - *param_2) & _DAT_7ff70cb1bac0) + _DAT_7ff70cb1bae8;
    fVar27 = _DAT_7ff70cb1ba70;
    if ((uVar7 & 0xa0) != 0) {
      fVar27 = _DAT_7ff70cb1ba2c;
    }
    if (fVar25 <= param_4) {
      param_4 = fVar25;
    }
    fVar25 = _DAT_7ff70cb1ba70;
    if ((uVar7 & 0x50) != 0) {
      fVar25 = fVar27;
    }
    fVar27 = fVar25 * (float)((uint)(param_3[1] - param_2[1]) & _DAT_7ff70cb1bac0) +
             _DAT_7ff70cb1bae8;
    param_5 = uVar21;
    if (fVar27 <= param_4) {
      param_4 = fVar27;
    }
  }
  if ((param_4 < _DAT_7ff70cb1ba70) ||
     (uVar15 = (ulonglong)(param_5 & 0x1f0), (param_5 & 0x1f0) == 0x100)) {
    iVar13 = *(int *)(param_1 + 0x50);
    if (iVar13 == *(int *)(param_1 + 0x54)) {
      if (iVar13 == 0) {
        iVar12 = 8;
      }
      else {
        iVar12 = iVar13 / 2 + iVar13;
      }
      iVar22 = iVar13 + 1;
      if (iVar13 + 1 < iVar12) {
        iVar22 = iVar12;
      }
      uStack_f0 = 0x7ff70c7bcb38;
      lVar8 = FUN_7ff70c802100((longlong)iVar22 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        uStack_f0 = 0x7ff70c7bcb54;
        FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        uStack_f0 = 0x7ff70c7bcb5d;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar8;
      *(int *)(param_1 + 0x54) = iVar22;
      iVar13 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar8 = *(longlong *)(param_1 + 0x58);
    }
    *(undefined8 *)(lVar8 + (longlong)iVar13 * 8) = *(undefined8 *)param_2;
    iVar12 = *(int *)(param_1 + 0x50);
    iVar13 = iVar12 + 1;
    *(int *)(param_1 + 0x50) = iVar13;
    fVar24 = param_2[1];
    fVar27 = *param_3;
    if (iVar13 == *(int *)(param_1 + 0x54)) {
      iVar12 = iVar12 + 2;
      if (iVar13 == 0) {
        iVar13 = 8;
      }
      else {
        iVar13 = iVar13 / 2 + iVar13;
      }
      if (iVar12 < iVar13) {
        iVar12 = iVar13;
      }
      uStack_f0 = 0x7ff70c7bcbbb;
      lVar8 = FUN_7ff70c802100((longlong)iVar12 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        uStack_f0 = 0x7ff70c7bcbd7;
        FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        uStack_f0 = 0x7ff70c7bcbe0;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar8;
      *(int *)(param_1 + 0x54) = iVar12;
      iVar13 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar8 = *(longlong *)(param_1 + 0x58);
    }
    *(float *)(lVar8 + (longlong)iVar13 * 8) = fVar27;
    *(float *)(lVar8 + 4 + (longlong)iVar13 * 8) = fVar24;
    iVar12 = *(int *)(param_1 + 0x50);
    iVar13 = iVar12 + 1;
    *(int *)(param_1 + 0x50) = iVar13;
    if (iVar13 == *(int *)(param_1 + 0x54)) {
      iVar12 = iVar12 + 2;
      if (iVar13 == 0) {
        iVar13 = 8;
      }
      else {
        iVar13 = iVar13 / 2 + iVar13;
      }
      if (iVar12 < iVar13) {
        iVar12 = iVar13;
      }
      uStack_f0 = 0x7ff70c7bcc34;
      lVar8 = FUN_7ff70c802100((longlong)iVar12 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        uStack_f0 = 0x7ff70c7bcc50;
        FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        uStack_f0 = 0x7ff70c7bcc59;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar8;
      *(int *)(param_1 + 0x54) = iVar12;
      iVar13 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar8 = *(longlong *)(param_1 + 0x58);
    }
    *(undefined8 *)(lVar8 + (longlong)iVar13 * 8) = *(undefined8 *)param_3;
    iVar12 = *(int *)(param_1 + 0x50);
    iVar13 = iVar12 + 1;
    *(int *)(param_1 + 0x50) = iVar13;
    fVar24 = param_3[1];
    fVar27 = *param_2;
    if (iVar13 == *(int *)(param_1 + 0x54)) {
      iVar12 = iVar12 + 2;
      if (iVar13 == 0) {
        iVar13 = 8;
      }
      else {
        iVar13 = iVar13 / 2 + iVar13;
      }
      if (iVar12 < iVar13) {
        iVar12 = iVar13;
      }
      uStack_f0 = 0x7ff70c7bccb6;
      lVar8 = FUN_7ff70c802100((longlong)iVar12 << 3);
      if (*(longlong *)(param_1 + 0x58) != 0) {
        uStack_f0 = 0x7ff70c7bccd2;
        FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 0x58),(longlong)*(int *)(param_1 + 0x50) << 3
                        );
        uStack_f0 = 0x7ff70c7bccdb;
        FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
      }
      *(longlong *)(param_1 + 0x58) = lVar8;
      *(int *)(param_1 + 0x54) = iVar12;
      iVar13 = *(int *)(param_1 + 0x50);
    }
    else {
      lVar8 = *(longlong *)(param_1 + 0x58);
    }
    *(float *)(lVar8 + (longlong)iVar13 * 8) = fVar27;
    *(float *)(lVar8 + 4 + (longlong)iVar13 * 8) = fVar24;
    *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
  }
  else {
    fVar27 = param_4;
    if ((param_5 & 0x20) == 0) {
      fVar27 = 0.0;
    }
    fVar25 = param_4;
    if (-1 < (char)param_5) {
      fVar25 = 0.0;
    }
    fVar5 = param_4;
    if ((param_5 & 0x40) == 0) {
      fVar5 = 0.0;
    }
    bVar4 = (param_5 & 0x10) != 0;
    fVar29 = 0.0;
    if (bVar4) {
      fVar29 = param_4;
    }
    fVar28 = fVar29 + (float)*(undefined8 *)param_2;
    fVar29 = fVar29 + (float)((ulonglong)*(undefined8 *)param_2 >> 0x20);
    pfStack_b8 = param_2;
    if (bVar4) {
      lVar8 = *(longlong *)(param_1 + 0x38);
      if (0x3f < (uint)(int)(_DAT_7ff70cb1ba30 + param_4)) {
        fVar24 = *(float *)(lVar8 + 0x2c);
        if (param_4 <= *(float *)(lVar8 + 0x2c)) {
          fVar24 = param_4;
        }
        uStack_f0 = (ulonglong)&UNK_7ff70c7bca6a;
        func_0x7ff70d96f840(_DAT_7ff70cb1ba2c - fVar24 / param_4);
                    /* WARNING: Bad instruction - Truncating control flow here */
        halt_baddata();
      }
      bVar11 = *(byte *)(lVar8 + 500 + (ulonglong)(uint)(int)(_DAT_7ff70cb1ba30 + param_4));
      uVar19 = 0;
      uVar6 = 0x30 / bVar11;
      uVar15 = 0xc;
      if (uVar6 < 0xc) {
        uVar15 = (ulonglong)uVar6;
      }
      iVar13 = 1;
      unaff_RBP = uVar15;
      if (0x30 < bVar11) {
        unaff_RBP = 1;
      }
      uVar21 = (uint)unaff_RBP;
      if (uVar21 < 2) {
        iVar12 = 0xd;
      }
      else {
        bVar11 = (byte)unaff_RBP;
        if (0xcU % bVar11 == 0) {
          iVar12 = 0xc / bVar11 + 1;
          uVar19 = 0;
          iVar13 = (int)uVar15;
        }
        else {
          iVar12 = 0xc / bVar11 + 2;
          bVar11 = -((char)(bVar11 - 0xcU % bVar11) / '\x02');
          uVar15 = (ulonglong)bVar11;
          uVar19 = 1;
          iVar13 = (int)(char)bVar11 + uVar21;
        }
      }
      iVar22 = *(int *)(param_1 + 0x50);
      iVar12 = iVar12 + iVar22;
      iVar20 = *(int *)(param_1 + 0x54);
      if (iVar20 < iVar12) {
        if (iVar20 == 0) {
          iVar20 = 8;
        }
        else {
          iVar20 = iVar20 / 2 + iVar20;
        }
        if (iVar20 <= iVar12) {
          iVar20 = iVar12;
        }
        uVar15 = (longlong)iVar20 << 3;
        uStack_f0 = 0x7ff70c7bcda1;
        uStack_bc = uVar19;
        lVar9 = FUN_7ff70c802100();
        if (*(longlong *)(param_1 + 0x58) != 0) {
          uStack_f0 = 0x7ff70c7bcdbd;
          FUN_7ff70cb12b60(lVar9,*(longlong *)(param_1 + 0x58),
                           (longlong)*(int *)(param_1 + 0x50) << 3);
          uVar15 = *(ulonglong *)(param_1 + 0x58);
          uStack_f0 = 0x7ff70c7bcdc6;
          FUN_7ff70c802510();
        }
        *(longlong *)(param_1 + 0x58) = lVar9;
        *(int *)(param_1 + 0x54) = iVar20;
        lVar8 = *(longlong *)(param_1 + 0x38);
        uVar19 = uStack_bc;
      }
      else {
        lVar9 = *(longlong *)(param_1 + 0x58);
      }
      *(int *)(param_1 + 0x50) = iVar12;
      puVar10 = (undefined8 *)(lVar9 + (longlong)iVar22 * 8 + 8);
      *(ulonglong *)(lVar9 + (longlong)iVar22 * 8) =
           CONCAT44((float)((ulonglong)*(undefined8 *)(lVar8 + 0x130) >> 0x20) * param_4 + fVar29,
                    (float)*(undefined8 *)(lVar8 + 0x130) * param_4 + fVar28);
      if (iVar13 < 0xd) {
        uVar7 = iVar13 + 0x18;
        uVar15 = (ulonglong)uVar7;
        do {
          uVar16 = uVar7 - 0x30;
          if ((int)uVar7 < 0x30) {
            uVar16 = uVar7;
          }
          uVar2 = *(undefined8 *)(*(longlong *)(param_1 + 0x38) + 0x70 + (longlong)(int)uVar16 * 8);
          *puVar10 = CONCAT44((float)((ulonglong)uVar2 >> 0x20) * param_4 + fVar29,
                              (float)uVar2 * param_4 + fVar28);
          puVar10 = puVar10 + 1;
          uVar14 = (int)uVar15 + uVar21;
          uVar15 = (ulonglong)uVar14;
          uVar7 = uVar16 + uVar21;
        } while ((int)uVar14 < 0x25);
      }
      param_2 = pfStack_b8;
      if ((char)uVar19 != '\0') {
        uVar15 = *(ulonglong *)(param_1 + 0x38);
        *puVar10 = CONCAT44(fVar29 + param_4 * (float)((ulonglong)*(undefined8 *)(uVar15 + 400) >>
                                                      0x20),
                            fVar28 + param_4 * (float)*(undefined8 *)(uVar15 + 400));
      }
    }
    else {
      iVar13 = *(int *)(param_1 + 0x50);
      if (iVar13 == *(int *)(param_1 + 0x54)) {
        if (iVar13 == 0) {
          iVar12 = 8;
        }
        else {
          iVar12 = iVar13 / 2 + iVar13;
        }
        iVar22 = iVar13 + 1;
        if (iVar13 + 1 < iVar12) {
          iVar22 = iVar12;
        }
        uVar15 = (longlong)iVar22 << 3;
        uStack_f0 = 0x7ff70c7bcd0d;
        lVar8 = FUN_7ff70c802100();
        if (*(longlong *)(param_1 + 0x58) != 0) {
          uStack_f0 = 0x7ff70c7bcd29;
          FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 0x58),
                           (longlong)*(int *)(param_1 + 0x50) << 3);
          uVar15 = *(ulonglong *)(param_1 + 0x58);
          uStack_f0 = 0x7ff70c7bcd32;
          FUN_7ff70c802510();
        }
        *(longlong *)(param_1 + 0x58) = lVar8;
        *(int *)(param_1 + 0x54) = iVar22;
        iVar13 = *(int *)(param_1 + 0x50);
      }
      else {
        lVar8 = *(longlong *)(param_1 + 0x58);
      }
      *(ulonglong *)(lVar8 + (longlong)iVar13 * 8) = CONCAT44(fVar29,fVar28);
      *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
    }
    fVar29 = param_2[1];
    fVar28 = *param_3;
    if (fVar24 <= fVar27) {
      lVar8 = *(longlong *)(param_1 + 0x38);
      if ((uint)(int)(_DAT_7ff70cb1ba30 + fVar27) < 0x40) {
        puVar18 = (ulonglong *)auStack_e8;
        uVar7 = (uint)*(byte *)(lVar8 + 500 + (ulonglong)(uint)(int)(_DAT_7ff70cb1ba30 + fVar27));
      }
      else {
        fVar23 = *(float *)(lVar8 + 0x2c);
        if (fVar27 <= *(float *)(lVar8 + 0x2c)) {
          fVar23 = fVar27;
        }
        uStack_f0 = uVar15;
        fVar23 = (float)func_0x7ff70d5e169a(_DAT_7ff70cb1ba2c - fVar23 / fVar27);
        auVar26 = roundss(ZEXT816(0),ZEXT416((uint)(_DAT_7ff70cb1ba20 / fVar23)),10);
        uVar7 = ((int)auVar26._0_4_ - ((int)auVar26._0_4_ + 1 >> 0x1f)) + 1U & 0xfffffffe;
        uVar21 = 4;
        if (4 < (int)uVar7) {
          uVar21 = uVar7;
        }
        puVar18 = &uStack_f0;
        uVar7 = 0x200;
        if ((int)uVar21 < 0x200) {
          puVar18 = &uStack_f0;
          uVar7 = uVar21;
        }
      }
      uVar19 = 0;
      uVar6 = (ushort)(0x30 / (uVar7 & 0xffff));
      unaff_RBP = 0xc;
      if (uVar6 < 0xc) {
        unaff_RBP = (ulonglong)uVar6;
      }
      iVar13 = 1;
      iVar12 = (int)unaff_RBP;
      if (0x30 < uVar7) {
        unaff_RBP = 1;
      }
      uVar21 = (uint)unaff_RBP;
      if (uVar21 < 2) {
        iVar22 = 0xd;
      }
      else {
        bVar11 = (byte)unaff_RBP;
        if (0xcU % bVar11 == 0) {
          iVar22 = 0xc / bVar11 + 1;
          uVar19 = 0;
          iVar13 = iVar12;
        }
        else {
          iVar22 = 0xc / bVar11 + 2;
          uVar19 = 1;
          iVar13 = (int)(char)-((char)(bVar11 - 0xcU % bVar11) / '\x02') + uVar21;
        }
      }
      iVar12 = *(int *)(param_1 + 0x50);
      iVar22 = iVar22 + iVar12;
      iVar20 = *(int *)(param_1 + 0x54);
      if (iVar20 < iVar22) {
        *(undefined4 *)((longlong)puVar18 + 0x2c) = uVar19;
        if (iVar20 == 0) {
          iVar20 = 8;
        }
        else {
          iVar20 = iVar20 / 2 + iVar20;
        }
        if (iVar20 <= iVar22) {
          iVar20 = iVar22;
        }
        *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd059;
        lVar9 = FUN_7ff70c802100((longlong)iVar20 << 3);
        lVar8 = *(longlong *)(param_1 + 0x58);
        if (lVar8 != 0) {
          iVar1 = *(int *)(param_1 + 0x50);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd075;
          FUN_7ff70cb12b60(lVar9,lVar8,(longlong)iVar1 << 3);
          uVar2 = *(undefined8 *)(param_1 + 0x58);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd07e;
          FUN_7ff70c802510(uVar2);
        }
        *(longlong *)(param_1 + 0x58) = lVar9;
        *(int *)(param_1 + 0x54) = iVar20;
        lVar8 = *(longlong *)(param_1 + 0x38);
        uVar19 = *(undefined4 *)((longlong)puVar18 + 0x2c);
      }
      else {
        lVar9 = *(longlong *)(param_1 + 0x58);
      }
      *(int *)(param_1 + 0x50) = iVar22;
      puVar10 = (undefined8 *)(lVar9 + (longlong)iVar12 * 8 + 8);
      auVar26 = insertps(ZEXT416((uint)(fVar28 - fVar27)),ZEXT416((uint)(fVar29 + fVar27)),0x10);
      fVar29 = auVar26._0_4_;
      fVar28 = auVar26._4_4_;
      *(ulonglong *)(lVar9 + (longlong)iVar12 * 8) =
           CONCAT44((float)((ulonglong)*(undefined8 *)(lVar8 + 400) >> 0x20) * fVar27 + fVar28,
                    (float)*(undefined8 *)(lVar8 + 400) * fVar27 + fVar29);
      if (iVar13 < 0xd) {
        iVar13 = iVar13 + 0x24;
        param_2 = *(float **)((longlong)puVar18 + 0x30);
        iVar12 = iVar13;
        do {
          iVar22 = iVar13 + -0x30;
          if (iVar13 < 0x30) {
            iVar22 = iVar13;
          }
          uVar2 = *(undefined8 *)(*(longlong *)(param_1 + 0x38) + 0x70 + (longlong)iVar22 * 8);
          *puVar10 = CONCAT44((float)((ulonglong)uVar2 >> 0x20) * fVar27 + fVar28,
                              (float)uVar2 * fVar27 + fVar29);
          puVar10 = puVar10 + 1;
          iVar12 = iVar12 + uVar21;
          iVar13 = iVar22 + uVar21;
        } while (iVar12 < 0x31);
      }
      else {
        param_2 = *(float **)((longlong)puVar18 + 0x30);
      }
      if ((char)uVar19 != '\0') {
        uVar2 = *(undefined8 *)(*(longlong *)(param_1 + 0x38) + 0x70);
        *puVar10 = CONCAT44(fVar28 + fVar27 * (float)((ulonglong)uVar2 >> 0x20),
                            fVar29 + fVar27 * (float)uVar2);
      }
    }
    else {
      iVar13 = *(int *)(param_1 + 0x50);
      if (iVar13 == *(int *)(param_1 + 0x54)) {
        if (iVar13 == 0) {
          iVar12 = 8;
        }
        else {
          iVar12 = iVar13 / 2 + iVar13;
        }
        iVar22 = iVar13 + 1;
        if (iVar13 + 1 < iVar12) {
          iVar22 = iVar12;
        }
        uStack_f0 = 0x7ff70c7bcfc1;
        lVar8 = FUN_7ff70c802100((longlong)iVar22 << 3);
        if (*(longlong *)(param_1 + 0x58) != 0) {
          uStack_f0 = 0x7ff70c7bcfdd;
          FUN_7ff70cb12b60(lVar8,*(longlong *)(param_1 + 0x58),
                           (longlong)*(int *)(param_1 + 0x50) << 3);
          uStack_f0 = 0x7ff70c7bcfe6;
          FUN_7ff70c802510(*(undefined8 *)(param_1 + 0x58));
        }
        *(longlong *)(param_1 + 0x58) = lVar8;
        *(int *)(param_1 + 0x54) = iVar22;
        iVar13 = *(int *)(param_1 + 0x50);
      }
      else {
        lVar8 = *(longlong *)(param_1 + 0x58);
      }
      *(float *)(lVar8 + (longlong)iVar13 * 8) = fVar28 - fVar27;
      *(float *)(lVar8 + 4 + (longlong)iVar13 * 8) = fVar29 + fVar27;
      *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
      puVar18 = (ulonglong *)auStack_e8;
    }
    fVar27 = (float)*(undefined8 *)param_3 - fVar25;
    fVar29 = (float)((ulonglong)*(undefined8 *)param_3 >> 0x20) - fVar25;
    if (fVar24 <= fVar25) {
      lVar8 = *(longlong *)(param_1 + 0x38);
      if ((uint)(int)(_DAT_7ff70cb1ba30 + fVar25) < 0x40) {
        uVar7 = (uint)*(byte *)(lVar8 + 500 + (ulonglong)(uint)(int)(_DAT_7ff70cb1ba30 + fVar25));
      }
      else {
        fVar28 = *(float *)(lVar8 + 0x2c);
        if (fVar25 <= *(float *)(lVar8 + 0x2c)) {
          fVar28 = fVar25;
        }
        puVar17 = (undefined1 *)((longlong)puVar18 + -8);
        *(ulonglong *)((longlong)puVar18 + -8) = unaff_RBP;
        *(undefined8 *)((longlong)puVar18 + -0x10) = 0x7ff70c7bd1b3;
        fVar28 = (float)func_0x7ff70d94dc3c(_DAT_7ff70cb1ba2c - fVar28 / fVar25);
        auVar26 = roundss(ZEXT816(0),ZEXT416((uint)(_DAT_7ff70cb1ba20 / fVar28)),10);
        uVar7 = ((int)auVar26._0_4_ - ((int)auVar26._0_4_ + 1 >> 0x1f)) + 1U & 0xfffffffe;
        uVar21 = 4;
        if (4 < (int)uVar7) {
          uVar21 = uVar7;
        }
        puVar18 = (ulonglong *)((longlong)puVar18 + -8);
        uVar7 = 0x200;
        if ((int)uVar21 < 0x200) {
          puVar18 = (ulonglong *)puVar17;
          uVar7 = uVar21;
        }
      }
      uVar19 = 0;
      uVar21 = 0x30 / (uVar7 & 0xffff);
      uVar16 = 0xc;
      if ((ushort)uVar21 < 0xc) {
        uVar16 = uVar21;
      }
      uVar21 = 1;
      uVar14 = uVar16;
      if (0x30 < uVar7) {
        uVar14 = 1;
      }
      if (uVar14 < 2) {
        iVar13 = 0xd;
      }
      else {
        bVar11 = (byte)uVar14;
        if (0xcU % bVar11 == 0) {
          iVar13 = 0xc / bVar11 + 1;
          uVar19 = 0;
          uVar21 = uVar16;
        }
        else {
          iVar13 = 0xc / bVar11 + 2;
          uVar19 = 1;
          uVar21 = (int)(char)-((char)(bVar11 - 0xcU % bVar11) / '\x02') + uVar14;
        }
      }
      iVar12 = *(int *)(param_1 + 0x50);
      iVar13 = iVar13 + iVar12;
      iVar22 = *(int *)(param_1 + 0x54);
      if (iVar22 < iVar13) {
        *(undefined4 *)((longlong)puVar18 + 0x2c) = uVar19;
        if (iVar22 == 0) {
          iVar22 = 8;
        }
        else {
          iVar22 = iVar22 / 2 + iVar22;
        }
        if (iVar22 <= iVar13) {
          iVar22 = iVar13;
        }
        *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd302;
        lVar9 = FUN_7ff70c802100((longlong)iVar22 << 3);
        lVar8 = *(longlong *)(param_1 + 0x58);
        if (lVar8 != 0) {
          iVar20 = *(int *)(param_1 + 0x50);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd31e;
          FUN_7ff70cb12b60(lVar9,lVar8,(longlong)iVar20 << 3);
          uVar2 = *(undefined8 *)(param_1 + 0x58);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd327;
          FUN_7ff70c802510(uVar2);
        }
        *(longlong *)(param_1 + 0x58) = lVar9;
        *(int *)(param_1 + 0x54) = iVar22;
        lVar8 = *(longlong *)(param_1 + 0x38);
        uVar19 = *(undefined4 *)((longlong)puVar18 + 0x2c);
      }
      else {
        lVar9 = *(longlong *)(param_1 + 0x58);
      }
      *(int *)(param_1 + 0x50) = iVar13;
      puVar10 = (undefined8 *)(lVar9 + (longlong)iVar12 * 8 + 8);
      *(ulonglong *)(lVar9 + (longlong)iVar12 * 8) =
           CONCAT44((float)((ulonglong)*(undefined8 *)(lVar8 + 0x70) >> 0x20) * fVar25 + fVar29,
                    (float)*(undefined8 *)(lVar8 + 0x70) * fVar25 + fVar27);
      if ((int)uVar21 < 0xd) {
        param_2 = *(float **)((longlong)puVar18 + 0x30);
        uVar7 = uVar21;
        do {
          uVar16 = uVar21 - 0x30;
          if ((int)uVar21 < 0x30) {
            uVar16 = uVar21;
          }
          uVar2 = *(undefined8 *)(*(longlong *)(param_1 + 0x38) + 0x70 + (longlong)(int)uVar16 * 8);
          *puVar10 = CONCAT44((float)((ulonglong)uVar2 >> 0x20) * fVar25 + fVar29,
                              (float)uVar2 * fVar25 + fVar27);
          puVar10 = puVar10 + 1;
          uVar7 = uVar7 + uVar14;
          uVar21 = uVar16 + uVar14;
        } while ((int)uVar7 < 0xd);
      }
      else {
        param_2 = *(float **)((longlong)puVar18 + 0x30);
      }
      if ((char)uVar19 != '\0') {
        uVar2 = *(undefined8 *)(*(longlong *)(param_1 + 0x38) + 0xd0);
        *puVar10 = CONCAT44(fVar29 + fVar25 * (float)((ulonglong)uVar2 >> 0x20),
                            fVar27 + fVar25 * (float)uVar2);
      }
    }
    else {
      iVar13 = *(int *)(param_1 + 0x50);
      if (iVar13 == *(int *)(param_1 + 0x54)) {
        if (iVar13 == 0) {
          iVar12 = 8;
        }
        else {
          iVar12 = iVar13 / 2 + iVar13;
        }
        iVar22 = iVar13 + 1;
        if (iVar13 + 1 < iVar12) {
          iVar22 = iVar12;
        }
        *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd272;
        lVar8 = FUN_7ff70c802100((longlong)iVar22 << 3);
        lVar9 = *(longlong *)(param_1 + 0x58);
        if (lVar9 != 0) {
          iVar13 = *(int *)(param_1 + 0x50);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd28e;
          FUN_7ff70cb12b60(lVar8,lVar9,(longlong)iVar13 << 3);
          uVar2 = *(undefined8 *)(param_1 + 0x58);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd297;
          FUN_7ff70c802510(uVar2);
        }
        *(longlong *)(param_1 + 0x58) = lVar8;
        *(int *)(param_1 + 0x54) = iVar22;
        iVar13 = *(int *)(param_1 + 0x50);
      }
      else {
        lVar8 = *(longlong *)(param_1 + 0x58);
      }
      *(ulonglong *)(lVar8 + (longlong)iVar13 * 8) = CONCAT44(fVar29,fVar27);
      *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
    }
    fVar27 = param_3[1];
    fVar25 = *param_2;
    if (fVar24 <= fVar5) {
      lVar8 = *(longlong *)(param_1 + 0x38);
      if ((uint)(int)(_DAT_7ff70cb1ba30 + fVar5) < 0x40) {
        uVar7 = (uint)*(byte *)(lVar8 + 500 + (ulonglong)(uint)(int)(_DAT_7ff70cb1ba30 + fVar5));
      }
      else {
        fVar24 = *(float *)(lVar8 + 0x2c);
        if (fVar5 <= *(float *)(lVar8 + 0x2c)) {
          fVar24 = fVar5;
        }
        *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd44a;
        fVar24 = (float)func_0x7ff70d9a9669(_DAT_7ff70cb1ba2c - fVar24 / fVar5);
        in(0xf3);
        auVar26._4_4_ = _DAT_7ff70cb1ba24;
        auVar26._0_4_ = _DAT_7ff70cb1ba20 / fVar24;
        auVar26._8_4_ = _DAT_7ff70cb1ba28;
        auVar26._12_4_ = _DAT_7ff70cb1ba2c;
        auVar26 = roundss(ZEXT816(0),auVar26,10);
        uVar7 = ((int)auVar26._0_4_ - ((int)auVar26._0_4_ + 1 >> 0x1f)) + 1U & 0xfffffffe;
        uVar21 = 4;
        if (4 < (int)uVar7) {
          uVar21 = uVar7;
        }
        uVar7 = 0x200;
        if ((int)uVar21 < 0x200) {
          uVar7 = uVar21;
        }
      }
      bVar4 = false;
      uVar21 = 0x30 / (uVar7 & 0xffff);
      uVar16 = 0xc;
      if ((ushort)uVar21 < 0xc) {
        uVar16 = uVar21;
      }
      uVar14 = 1;
      uVar21 = uVar16;
      if (0x30 < uVar7) {
        uVar21 = 1;
      }
      if (uVar21 < 2) {
        iVar13 = 0xd;
      }
      else {
        bVar11 = (byte)uVar21;
        if (0xcU % bVar11 == 0) {
          iVar13 = 0xc / bVar11 + 1;
          bVar4 = false;
          uVar14 = uVar16;
        }
        else {
          iVar13 = 0xc / bVar11 + 2;
          bVar4 = true;
          uVar14 = (int)(char)-((char)(bVar11 - 0xcU % bVar11) / '\x02') + uVar21;
        }
      }
      iVar12 = *(int *)(param_1 + 0x50);
      iVar13 = iVar13 + iVar12;
      iVar22 = *(int *)(param_1 + 0x54);
      if (iVar22 < iVar13) {
        if (iVar22 == 0) {
          iVar22 = 8;
        }
        else {
          iVar22 = iVar22 / 2 + iVar22;
        }
        if (iVar22 <= iVar13) {
          iVar22 = iVar13;
        }
        *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd59e;
        lVar9 = FUN_7ff70c802100((longlong)iVar22 << 3);
        lVar8 = *(longlong *)(param_1 + 0x58);
        if (lVar8 != 0) {
          iVar20 = *(int *)(param_1 + 0x50);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd5ba;
          FUN_7ff70cb12b60(lVar9,lVar8,(longlong)iVar20 << 3);
          uVar2 = *(undefined8 *)(param_1 + 0x58);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd5c3;
          FUN_7ff70c802510(uVar2);
        }
        *(longlong *)(param_1 + 0x58) = lVar9;
        *(int *)(param_1 + 0x54) = iVar22;
        lVar8 = *(longlong *)(param_1 + 0x38);
      }
      else {
        lVar9 = *(longlong *)(param_1 + 0x58);
      }
      *(int *)(param_1 + 0x50) = iVar13;
      puVar10 = (undefined8 *)(lVar9 + (longlong)iVar12 * 8 + 8);
      auVar26 = insertps(ZEXT416((uint)(fVar25 + fVar5)),ZEXT416((uint)(fVar27 - fVar5)),0x10);
      fVar24 = auVar26._0_4_;
      fVar27 = auVar26._4_4_;
      *(ulonglong *)(lVar9 + (longlong)iVar12 * 8) =
           CONCAT44((float)((ulonglong)*(undefined8 *)(lVar8 + 0xd0) >> 0x20) * fVar5 + fVar27,
                    (float)*(undefined8 *)(lVar8 + 0xd0) * fVar5 + fVar24);
      if ((int)uVar14 < 0xd) {
        iVar12 = uVar14 + 0xc;
        iVar13 = iVar12;
        do {
          iVar22 = iVar12 + -0x30;
          if (iVar12 < 0x30) {
            iVar22 = iVar12;
          }
          uVar2 = *(undefined8 *)(*(longlong *)(param_1 + 0x38) + 0x70 + (longlong)iVar22 * 8);
          *puVar10 = CONCAT44((float)((ulonglong)uVar2 >> 0x20) * fVar5 + fVar27,
                              (float)uVar2 * fVar5 + fVar24);
          puVar10 = puVar10 + 1;
          iVar13 = iVar13 + uVar21;
          iVar12 = iVar22 + uVar21;
        } while (iVar13 < 0x19);
      }
      if (bVar4) {
        uVar2 = *(undefined8 *)(*(longlong *)(param_1 + 0x38) + 0x130);
        *puVar10 = CONCAT44(fVar27 + fVar5 * (float)((ulonglong)uVar2 >> 0x20),
                            fVar24 + fVar5 * (float)uVar2);
      }
    }
    else {
      iVar13 = *(int *)(param_1 + 0x50);
      if (iVar13 == *(int *)(param_1 + 0x54)) {
        if (iVar13 == 0) {
          iVar12 = 8;
        }
        else {
          iVar12 = iVar13 / 2 + iVar13;
        }
        iVar22 = iVar13 + 1;
        if (iVar13 + 1 < iVar12) {
          iVar22 = iVar12;
        }
        *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd50c;
        lVar8 = FUN_7ff70c802100((longlong)iVar22 << 3);
        lVar9 = *(longlong *)(param_1 + 0x58);
        if (lVar9 != 0) {
          iVar13 = *(int *)(param_1 + 0x50);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd528;
          FUN_7ff70cb12b60(lVar8,lVar9,(longlong)iVar13 << 3);
          uVar2 = *(undefined8 *)(param_1 + 0x58);
          *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd531;
          FUN_7ff70c802510(uVar2);
        }
        *(longlong *)(param_1 + 0x58) = lVar8;
        *(int *)(param_1 + 0x54) = iVar22;
        iVar13 = *(int *)(param_1 + 0x50);
      }
      else {
        lVar8 = *(longlong *)(param_1 + 0x58);
      }
      *(float *)(lVar8 + (longlong)iVar13 * 8) = fVar25 + fVar5;
      *(float *)(lVar8 + 4 + (longlong)iVar13 * 8) = fVar27 - fVar5;
      *(int *)(param_1 + 0x50) = *(int *)(param_1 + 0x50) + 1;
    }
  }
  if (_DAT_7ff70cbebd80 != (*(ulonglong *)((longlong)puVar18 + 0x38) ^ (ulonglong)puVar18)) {
    *(undefined8 *)((longlong)puVar18 + -8) = 0x7ff70c7bd6b9;
    FUN_7ff70caa97e0(*(ulonglong *)((longlong)puVar18 + 0x38) ^ (ulonglong)puVar18);
    pcVar3 = (code *)swi(3);
    (*pcVar3)();
    return;
  }
  return;
}


