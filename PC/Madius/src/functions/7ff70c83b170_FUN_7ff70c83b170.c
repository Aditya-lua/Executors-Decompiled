/* 7ff70c83b170 FUN_7ff70c83b170 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c83b170(longlong param_1)

{
  int *piVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  ulonglong uVar4;
  byte bVar5;
  uint uVar6;
  longlong lVar7;
  longlong *plVar8;
  longlong lVar9;
  code *pcVar10;
  undefined8 uVar11;
  bool bVar12;
  float fVar13;
  longlong lVar14;
  char cVar15;
  uint uVar16;
  int iVar17;
  longlong lVar18;
  longlong lVar19;
  short sVar20;
  int iVar21;
  undefined4 uVar22;
  longlong lVar23;
  undefined *puVar24;
  longlong lVar25;
  ulonglong uVar26;
  bool bVar27;
  float fVar28;
  float fVar29;
  float fVar30;
  float fVar34;
  float fVar35;
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  float fVar41;
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  ulonglong uStack_d8;
  undefined8 uStack_d0;
  longlong lStack_c8;
  undefined8 auStack_c0 [5];
  undefined1 auVar31 [16];
  
  lVar14 = _DAT_7ff70cc1a3c0;
  lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278);
  while ((lVar7 != 0 && (*(longlong *)(lVar7 + 0x188) == *(longlong *)(lVar14 + 0x1440)))) {
    FUN_7ff70c80af70(&UNK_7ff70cb8f625);
    FUN_7ff70c907fc0();
    lVar7 = *(longlong *)(lVar14 + 0x2278);
  }
  lVar7 = *(longlong *)(lVar14 + 0x1440);
  plVar8 = *(longlong **)(lVar14 + 0x22e0);
  while ((plVar8 != (longlong *)0x0 && (*plVar8 == lVar7))) {
    FUN_7ff70c80af70(&UNK_7ff70cb8f537);
    FUN_7ff70c8a5ce0();
    plVar8 = *(longlong **)(lVar14 + 0x22e0);
  }
  lVar9 = *(longlong *)(lVar14 + 0x2398);
  while ((lVar9 != 0 && (**(longlong **)(lVar9 + 0x28) == lVar7))) {
    FUN_7ff70c80af70(&UNK_7ff70cb8f454);
    FUN_7ff70c8a0540();
    lVar9 = *(longlong *)(lVar14 + 0x2398);
  }
  if (*(char *)(lVar7 + 0x17b) == '\x01') {
    FUN_7ff70c80af70(&UNK_7ff70cb8f522);
    FUN_7ff70c8a35b0();
  }
  if ((int)*(short *)(param_1 + 4) < *(int *)(lVar7 + 0x1a0)) {
    do {
      FUN_7ff70c80af70(&UNK_7ff70cb8f55e);
      FUN_7ff70c89dd40();
    } while ((int)*(short *)(param_1 + 4) < *(int *)(lVar7 + 0x1a0));
  }
  fVar13 = _DAT_7ff70cb1bae8;
  if ((int)*(short *)(param_1 + 0xe) < *(int *)(lVar14 + 8000)) {
    do {
      FUN_7ff70c80af70(&UNK_7ff70cb8f54b);
      lVar18 = _DAT_7ff70cc1a3c0;
      lVar9 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      lVar25 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 8000) * 0x38 +
               *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f48);
      if ((*(char *)(lVar9 + 0x159) == '\x01') &&
         (((*(undefined1 *)(lVar9 + 0x159) = 0,
           *(float *)(lVar9 + 0x130) < *(float *)(lVar9 + 0x118) ||
           (*(float *)(lVar9 + 0x134) < *(float *)(lVar9 + 0x11c))) &&
          (*(char *)(lVar9 + 0xd1) == '\0')))) {
        FUN_7ff70c80af70(&UNK_7ff70cb8c7e7);
      }
      uVar26 = *(ulonglong *)(lVar9 + 0x130);
      auVar36._8_8_ = 0;
      auVar36._0_8_ = uVar26;
      uVar4 = *(ulonglong *)(lVar18 + 0x1e34);
      auVar38._8_8_ = 0;
      auVar38._0_8_ = uVar4;
      auVar39._4_4_ = -(uint)((float)(uVar4 >> 0x20) <= (float)(uVar26 >> 0x20));
      auVar39._0_4_ = -(uint)((float)uVar4 <= (float)uVar26);
      auVar39._8_4_ = 0xffffffff;
      auVar39._12_4_ = 0xffffffff;
      auVar39 = blendvps(auVar38,auVar36,auVar39);
      uStack_d8 = *(ulonglong *)(lVar25 + -0x34);
      auVar37._8_8_ = 0;
      auVar37._0_8_ = uStack_d8;
      fVar30 = (float)uStack_d8;
      fVar34 = (float)(uStack_d8 >> 0x20);
      auVar44._4_4_ = -(uint)(fVar34 <= auVar39._4_4_);
      auVar44._0_4_ = -(uint)(fVar30 <= auVar39._0_4_);
      auVar44._8_4_ = -(uint)(0.0 <= auVar39._8_4_);
      auVar44._12_4_ = -(uint)(0.0 <= auVar39._12_4_);
      auVar39 = blendvps(auVar37,auVar39,auVar44);
      uStack_d0 = auVar39._0_8_;
      *(undefined8 *)(lVar9 + 0x118) = *(undefined8 *)(lVar25 + -0x34);
      *(undefined8 *)(lVar9 + 0x120) = *(undefined8 *)(lVar25 + -0x24);
      uVar26 = *(ulonglong *)(lVar25 + -0x2c);
      auVar40._8_8_ = 0;
      auVar40._0_8_ = uVar26;
      fVar28 = auVar39._0_4_;
      fVar35 = auVar39._4_4_;
      auVar31._4_4_ = -(uint)(fVar35 <= (float)(uVar26 >> 0x20));
      auVar31._0_4_ = -(uint)(fVar28 <= (float)uVar26);
      auVar31._8_4_ = -(uint)(auVar39._8_4_ <= 0.0);
      auVar31._12_4_ = -(uint)(auVar39._12_4_ <= 0.0);
      auVar39 = blendvps(auVar39,auVar40,auVar31);
      *(longlong *)(lVar9 + 0x130) = auVar39._0_8_;
      *(undefined4 *)(lVar9 + 0x15c) = *(undefined4 *)(lVar25 + -0x1c);
      *(undefined4 *)(lVar9 + 0x164) = *(undefined4 *)(lVar25 + -0x18);
      *(undefined8 *)(lVar9 + 0x140) = *(undefined8 *)(lVar25 + -0x14);
      *(undefined4 *)(lVar9 + 0x150) = *(undefined4 *)(lVar25 + -0xc);
      *(undefined1 *)(lVar9 + 0x158) = *(undefined1 *)(lVar25 + -2);
      if (*(char *)(lVar18 + 0x2720) == '\x01') {
        *(undefined4 *)(lVar18 + 0x2758) = 0xff7fffff;
      }
      if (*(char *)(lVar25 + -1) == '\0') {
        *(int *)(lVar18 + 8000) = *(int *)(lVar18 + 8000) + -1;
      }
      else {
        auVar39 = blendvps(ZEXT416((uint)*(float *)(lVar25 + -0xc)),
                           ZEXT416((uint)*(float *)(lVar9 + 0x154)),
                           ZEXT416(-(uint)(*(float *)(lVar25 + -0xc) <= *(float *)(lVar9 + 0x154))))
        ;
        *(int *)(lVar9 + 0x150) = auVar39._0_4_;
        lVar23 = _DAT_7ff70cc1a3c0;
        lVar19 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
        if (*(char *)(lVar19 + 0xd1) == '\0') {
          fVar41 = *(float *)(lVar19 + 0x11c + (ulonglong)*(byte *)(lVar19 + 0x158) * 8);
          fVar29 = (*(float *)(lVar19 + 0x11c) - fVar41) + (fVar35 - fVar34);
          auVar44 = blendvps(ZEXT416((uint)(fVar29 + 0.0)),ZEXT416((uint)*(float *)(lVar19 + 0x144))
                             ,ZEXT416(-(uint)(fVar29 <= *(float *)(lVar19 + 0x144))));
          fVar29 = (fVar28 - fVar30) + *(float *)(lVar19 + 0x118);
          *(float *)(lVar19 + 0x120) = fVar29;
          *(float *)(lVar19 + 0x124) = fVar41;
          *(float *)(lVar19 + 0x118) =
               (float)(int)(*(float *)(lVar19 + 0x28) + *(float *)(lVar19 + 0x15c) +
                           *(float *)(lVar19 + 0x160));
          auVar42._0_4_ = (float)(int)(auVar44._0_4_ + fVar41 + *(float *)(lVar23 + 0xca0));
          auVar42._4_4_ = (float)(int)auVar44._4_4_;
          auVar42._8_4_ = (float)(int)auVar44._8_4_;
          auVar42._12_4_ = (float)(int)auVar44._12_4_;
          *(float *)(lVar19 + 0x11c) = auVar42._0_4_;
          auVar39 = blendvps(ZEXT416((uint)fVar29),ZEXT416((uint)*(float *)(lVar19 + 0x130)),
                             ZEXT416(-(uint)(fVar29 <= *(float *)(lVar19 + 0x130))));
          *(int *)(lVar19 + 0x130) = auVar39._0_4_;
          auVar43._4_12_ = auVar42._4_12_;
          auVar43._0_4_ = auVar42._0_4_ - *(float *)(lVar23 + 0xca0);
          auVar32._4_4_ = auVar42._4_4_;
          auVar32._0_4_ = auVar43._0_4_;
          auVar32._8_4_ = auVar42._8_4_;
          auVar32._12_4_ = auVar42._12_4_;
          auVar33._4_12_ = auVar32._4_12_;
          auVar33._0_4_ = -(uint)(auVar43._0_4_ <= *(float *)(lVar19 + 0x134));
          auVar39 = blendvps(auVar43,ZEXT416((uint)*(float *)(lVar19 + 0x134)),auVar33);
          *(int *)(lVar19 + 0x134) = auVar39._0_4_;
          *(float *)(lVar19 + 0x14c) = auVar44._0_4_;
          *(undefined4 *)(lVar19 + 0x144) = 0;
          fVar41 = *(float *)(lVar19 + 0x150);
          if (*(float *)(lVar19 + 0x150) <= fVar13) {
            fVar41 = fVar13;
          }
          *(float *)(lVar19 + 0x154) = fVar41;
          *(undefined4 *)(lVar19 + 0x150) = 0;
          *(undefined2 *)(lVar19 + 0x158) = 0;
          piVar1 = (int *)(lVar19 + 0x1d4);
          lVar19 = *(longlong *)(lVar23 + 0x1440);
          if ((*piVar1 == 0) && (*(char *)(lVar19 + 0xd1) == '\0')) {
            *(float *)(lVar19 + 0x118) = *(float *)(lVar23 + 0xc9c) + *(float *)(lVar19 + 0x120);
            *(undefined4 *)(lVar19 + 0x11c) = *(undefined4 *)(lVar19 + 0x124);
            *(undefined8 *)(lVar19 + 0x140) = *(undefined8 *)(lVar19 + 0x148);
            *(undefined4 *)(lVar19 + 0x150) = *(undefined4 *)(lVar19 + 0x154);
            *(undefined1 *)(lVar19 + 0x158) = 1;
            lVar19 = *(longlong *)(lVar23 + 0x1440);
          }
        }
        *(undefined4 *)(lVar23 + 0x1e20) = 0;
        *(ulonglong *)(lVar23 + 0x1e2c) = uStack_d8;
        *(undefined8 *)(lVar23 + 0x1e34) = uStack_d0;
        *(ulonglong *)(lVar23 + 0x1e3c) = uStack_d8;
        *(undefined8 *)(lVar23 + 0x1e44) = uStack_d0;
        *(uint *)(lVar23 + 0x1e24) = *(uint *)(lVar23 + 0x1de0) | *(uint *)(lVar23 + 0x1dec) | 1;
        *(undefined4 *)(lVar23 + 0x1e28) = 0;
        *(undefined4 *)(lVar23 + 0x1de8) = 0;
        *(undefined4 *)(lVar23 + 0x1dec) = 0;
        if (((fVar35 < *(float *)(lVar19 + 0x264) || fVar35 == *(float *)(lVar19 + 0x264)) ||
            (*(float *)(lVar19 + 0x26c) <= fVar34)) ||
           ((fVar28 < *(float *)(lVar19 + 0x260) || fVar28 == *(float *)(lVar19 + 0x260) ||
            (*(float *)(lVar19 + 0x268) <= fVar30)))) {
          uVar22 = 1;
          if (*(char *)(lVar23 + 0x14b2) != '\0') goto LAB_7ff70c83b732;
        }
        else {
          *(undefined4 *)(lVar23 + 0x1e28) = 0x100;
          uVar22 = 0x101;
LAB_7ff70c83b732:
          auVar39 = blendvps(ZEXT416((uint)*(float *)(lVar19 + 0x260)),ZEXT416((uint)fVar30),
                             ZEXT416(-(uint)(*(float *)(lVar19 + 0x260) <= fVar30)));
          if (auVar39._0_4_ - *(float *)(lVar23 + 0xcb4) <= *(float *)(lVar23 + 0xe0)) {
            auVar39 = blendvps(ZEXT416((uint)*(float *)(lVar19 + 0x264)),ZEXT416((uint)fVar34),
                               ZEXT416(-(uint)(*(float *)(lVar19 + 0x264) <= fVar34)));
            if (auVar39._0_4_ - *(float *)(lVar23 + 0xcb8) <= *(float *)(lVar23 + 0xe4)) {
              if (*(float *)(lVar19 + 0x268) <= fVar28) {
                fVar28 = *(float *)(lVar19 + 0x268);
              }
              if (*(float *)(lVar23 + 0xe0) < *(float *)(lVar23 + 0xcb4) + fVar28) {
                if (*(float *)(lVar19 + 0x26c) <= fVar35) {
                  fVar35 = *(float *)(lVar19 + 0x26c);
                }
                if (*(float *)(lVar23 + 0xe4) < fVar35 + *(float *)(lVar23 + 0xcb8)) {
                  *(undefined4 *)(lVar23 + 0x1e28) = uVar22;
                }
              }
            }
          }
        }
        iVar21 = *(int *)(lVar18 + 0x14b4);
        if (*(int *)(lVar25 + -8) == iVar21) {
          if ((*(char *)(lVar25 + -4) == '\0') && (*(char *)(lVar18 + 0x14f1) != '\0')) {
LAB_7ff70c83b842:
            iVar21 = *(int *)(lVar18 + 0x14e8);
            uVar16 = 0x60;
            bVar12 = false;
LAB_7ff70c83b850:
            *(int *)(lVar18 + 0x1e20) = iVar21;
          }
          else {
LAB_7ff70c83b815:
            uVar16 = 0x20;
            bVar12 = false;
          }
        }
        else {
          bVar27 = *(int *)(lVar18 + 0x14b8) != iVar21;
          if (*(char *)(lVar25 + -4) != '\0') {
            uVar16 = 0x20;
            bVar12 = true;
            if (iVar21 == 0 || bVar27) goto LAB_7ff70c83b815;
            goto LAB_7ff70c83b850;
          }
          if (iVar21 == 0 || bVar27) {
            if (*(byte *)(lVar18 + 0x14f1) != 0) goto LAB_7ff70c83b842;
            uVar16 = 0x20;
            bVar12 = false;
          }
          else {
            *(int *)(lVar18 + 0x1e20) = iVar21;
            uVar16 = (uint)*(byte *)(lVar18 + 0x14f1) << 6 | 0x20;
            bVar12 = true;
          }
        }
        *(ulonglong *)(lVar18 + 0x1e2c) = uStack_d8;
        *(undefined8 *)(lVar18 + 0x1e34) = uStack_d0;
        if ((*(char *)(lVar25 + -3) == '\0') && (*(int *)(lVar18 + 0x149c) != 0)) {
          *(byte *)(lVar18 + 0x1e28) = *(byte *)(lVar18 + 0x1e28) | 0x80;
        }
        if ((bVar12) && (*(char *)(lVar18 + 0x14c5) == '\x01')) {
          *(byte *)(lVar18 + 0x1e28) = *(byte *)(lVar18 + 0x1e28) | 4;
        }
        *(uint *)(lVar18 + 0x1e28) = *(uint *)(lVar18 + 0x1e28) | uVar16;
        *(int *)(lVar18 + 8000) = *(int *)(lVar18 + 8000) + -1;
        if (*(char *)(lVar18 + 0x1ee8) == '\x01') {
          FUN_7ff70c7bd870(*(undefined8 *)(lVar9 + 0x2c8),&uStack_d8,&uStack_d0,0xffff00ff,0,0,
                           0x3f800000);
        }
      }
    } while ((int)*(short *)(param_1 + 0xe) < *(int *)(lVar14 + 8000));
  }
  if ((int)*(short *)(param_1 + 2) < *(int *)(lVar7 + 0x108)) {
    do {
      while( true ) {
        FUN_7ff70c80af70(&UNK_7ff70cb8f6b4);
        iVar21 = *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x108);
        if (1 < iVar21) break;
        FUN_7ff70c80af70(&UNK_7ff70cb901a0);
        if (*(int *)(lVar7 + 0x108) <= (int)*(short *)(param_1 + 2)) goto LAB_7ff70c83b96d;
      }
      *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x108) = iVar21 + -1;
    } while ((int)*(short *)(param_1 + 2) < *(int *)(lVar7 + 0x108));
  }
LAB_7ff70c83b96d:
  if (*(short *)(param_1 + 0x14) < *(short *)(lVar14 + 0x25a0)) {
    do {
      FUN_7ff70c80af70(&UNK_7ff70cb8f691);
      lVar7 = _DAT_7ff70cc1a3c0;
      sVar20 = *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0);
      if ((*(byte *)(lVar14 + 0x1de1) & 4) == 0) {
        *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0) = sVar20 + -1;
        iVar21 = *(int *)(lVar7 + 0x1f30);
        *(int *)(lVar7 + 0x1f30) = iVar21 + -1;
        *(undefined4 *)(lVar7 + 0x1de0) =
             *(undefined4 *)(*(longlong *)(lVar7 + 0x1f38) + -8 + (longlong)iVar21 * 4);
        *(undefined4 *)(lVar7 + 0xc4c) =
             *(undefined4 *)
              (*(longlong *)(lVar7 + 0x1418) + -8 + (longlong)*(int *)(lVar7 + 0x1410) * 0x78);
        *(undefined1 *)
         (*(longlong *)(lVar14 + 0x1418) + -10 + (longlong)*(int *)(lVar14 + 0x1410) * 0x78) = 0;
      }
      else if (sVar20 < 1) {
        FUN_7ff70c80af70(&UNK_7ff70cb9017a);
      }
      else {
        *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0) = sVar20 + -1;
        iVar21 = *(int *)(lVar7 + 0x1f30);
        *(int *)(lVar7 + 0x1f30) = iVar21 + -1;
        uVar16 = *(uint *)(*(longlong *)(lVar7 + 0x1f38) + -8 + (longlong)iVar21 * 4);
        uVar6 = *(uint *)(lVar7 + 0x1de0);
        *(uint *)(lVar7 + 0x1de0) = uVar16;
        if (((uVar6 & 0x400) != 0) && ((uVar16 & 0x400) == 0)) {
          *(undefined4 *)(lVar7 + 0xc4c) = *(undefined4 *)(lVar7 + 0x259c);
        }
      }
    } while (*(short *)(param_1 + 0x14) < *(short *)(lVar14 + 0x25a0));
  }
  if ((int)*(short *)(param_1 + 6) < *(int *)(lVar14 + 0x1ef0)) {
    do {
      FUN_7ff70c80af70(&UNK_7ff70cb8f4f4);
      lVar7 = _DAT_7ff70cc1a3c0;
      iVar21 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1ef0);
      iVar17 = 1;
      if (iVar21 < 1) {
        lVar9 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
        if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
          if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
            if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
              *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
              goto LAB_7ff70c83bb20;
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                             *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
            bVar5 = *(byte *)(lVar7 + 0x27b4);
          }
          else {
LAB_7ff70c83bb20:
            bVar5 = *(byte *)(lVar7 + 0x27b4);
          }
          if ((bVar5 & 1) != 0) {
            puVar24 = &UNK_7ff70cb8a129;
            if (lVar9 != 0) {
              puVar24 = *(undefined **)(lVar9 + 8);
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar24,&UNK_7ff70cb9006f);
            *(undefined1 *)(lVar7 + 0x2788) = 0;
            cVar15 = *(char *)(lVar7 + 0x7f);
            goto joined_r0x7ff70c83bb5d;
          }
          *(int *)(lVar7 + 0x27e0) = *(int *)(lVar7 + 0x27e0) + 1;
          *(undefined1 *)(lVar7 + 0x2788) = 0;
          if (*(char *)(lVar7 + 0x7f) != '\x01') goto LAB_7ff70c83bc90;
LAB_7ff70c83bb63:
          if ((*(char *)(lVar7 + 0x1398) == '\x01') && (cVar15 = FUN_7ff70c849860(), cVar15 != '\0')
             ) {
            iVar21 = *(int *)(lVar7 + 0x278c);
            if (iVar21 < 0x14) {
              if (lVar9 == 0) {
                FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb9006f);
              }
              else {
                FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar9 + 8),&UNK_7ff70cb9006f);
                if ((*(char *)(lVar9 + 0xd5) != '\x01') || (*(char *)(lVar9 + 0xcd) == '\x01')) {
                  lVar18 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
                  lVar25 = *(longlong *)(lVar18 + 0x50);
                  lVar19 = _DAT_7ff70cc1a3c0;
                  if (lVar25 == 0) {
                    lStack_c8 = _DAT_7ff70cc1a3c0;
                    lVar25 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
                    lVar19 = _DAT_7ff70cc1a3c0;
                    if (_DAT_7ff70cc1a3c0 != 0) {
                      piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
                      lVar23 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
                      if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar23 * 8) == *piVar1) {
                        sVar20 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar23 * 8) + 1
                        ;
                      }
                      else {
                        iVar21 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                        *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar21;
                        lVar23 = (longlong)iVar21;
                        *(int *)(lVar19 + 0x2874 + lVar23 * 8) = *piVar1;
                        *(undefined4 *)(lVar19 + 0x2878 + lVar23 * 8) = 0;
                        sVar20 = 1;
                      }
                      *(short *)(lVar19 + 0x2878 + lVar23 * 8) = sVar20;
                      *(int *)(lVar19 + 0x2868) = *(int *)(lVar19 + 0x2868) + 1;
                    }
                    FUN_7ff70c7b5780(lVar25,lStack_c8 + 0x1148);
                    *(undefined **)(lVar25 + 0xd8) = &UNK_7ff70cb875f7;
                    *(longlong *)(lVar18 + 0x50) = lVar25;
                    lVar19 = lStack_c8;
                  }
                  if (*(int *)(lVar18 + 0x44) != *(int *)(lVar19 + 5000)) {
                    lStack_c8 = lVar25;
                    FUN_7ff70c7b6160(lVar25);
                    uStack_d8 = *(ulonglong *)(*(longlong *)(lVar19 + 0x40) + 0x28);
                    uStack_d0 = *(undefined8 *)(*(longlong *)(lVar19 + 0x40) + 0x30);
                    FUN_7ff70c7b8300(lStack_c8,&uStack_d8);
                    auStack_c0[0] =
                         CONCAT44((float)((ulonglong)*(undefined8 *)(lVar18 + 0x10) >> 0x20) +
                                  (float)((ulonglong)*(undefined8 *)(lVar18 + 8) >> 0x20),
                                  (float)*(undefined8 *)(lVar18 + 0x10) +
                                  (float)*(undefined8 *)(lVar18 + 8));
                    FUN_7ff70c7b7c50(lStack_c8,lVar18 + 8,auStack_c0,0);
                    *(undefined4 *)(lVar18 + 0x44) = *(undefined4 *)(lVar19 + 5000);
                    lVar25 = lStack_c8;
                  }
                  uStack_d8 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar9 + 0x30) >> 0x20) +
                                       (float)((ulonglong)*(undefined8 *)(lVar9 + 0x28) >> 0x20),
                                       (float)*(undefined8 *)(lVar9 + 0x30) +
                                       (float)*(undefined8 *)(lVar9 + 0x28));
                  FUN_7ff70c7bd870(lVar25,lVar9 + 0x28,&uStack_d8,0xff0000ff,0,0,0x3f800000);
                }
              }
              iVar21 = *(int *)(lVar7 + 0x278c);
            }
            if (iVar21 == 0x14) {
              FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
            }
            FUN_7ff70c84a8c0();
          }
          *(int *)(lVar7 + 0x278c) = *(int *)(lVar7 + 0x278c) + 1;
          pcVar10 = *(code **)(lVar7 + 0x2770);
        }
        else {
          *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
          cVar15 = *(char *)(lVar7 + 0x7f);
joined_r0x7ff70c83bb5d:
          if (cVar15 == '\x01') goto LAB_7ff70c83bb63;
LAB_7ff70c83bc90:
          pcVar10 = *(code **)(lVar7 + 0x2770);
        }
        if (pcVar10 != (code *)0x0) {
          (*pcVar10)(lVar7,*(undefined8 *)(lVar7 + 0x2778),&UNK_7ff70cb9006f);
        }
        iVar21 = *(int *)(lVar7 + 0x1ef0);
        iVar17 = iVar21;
        if (0 < iVar21) goto LAB_7ff70c83bcbc;
      }
      else {
LAB_7ff70c83bcbc:
        uVar16 = iVar17 + 1;
        do {
          puVar3 = (undefined8 *)(*(longlong *)(lVar7 + 0x1ef8) + -0x10 + (longlong)iVar21 * 0x14);
          uVar11 = puVar3[1];
          puVar2 = (undefined8 *)
                   (lVar7 + 0xd54 +
                   (longlong)
                   *(int *)(*(longlong *)(lVar7 + 0x1ef8) + -0x14 + (longlong)iVar21 * 0x14) * 0x10)
          ;
          *puVar2 = *puVar3;
          puVar2[1] = uVar11;
          iVar21 = *(int *)(lVar7 + 0x1ef0) + -1;
          *(int *)(lVar7 + 0x1ef0) = iVar21;
          uVar16 = uVar16 - 1;
        } while (1 < uVar16);
      }
    } while ((int)*(short *)(param_1 + 6) < *(int *)(lVar14 + 0x1ef0));
  }
  if ((int)*(short *)(param_1 + 0x10) < *(int *)(lVar14 + 0x1f30)) {
    do {
      while( true ) {
        FUN_7ff70c80af70(&UNK_7ff70cb8f59f);
        lVar7 = _DAT_7ff70cc1a3c0;
        if (1 < *(int *)(_DAT_7ff70cc1a3c0 + 0x1f30)) break;
        FUN_7ff70c80af70(&UNK_7ff70cb9010e);
        if (*(int *)(lVar14 + 0x1f30) <= (int)*(short *)(param_1 + 0x10)) goto LAB_7ff70c83bf13;
      }
      uVar16 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f30) - 1;
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1f30) = uVar16;
      *(undefined4 *)(lVar7 + 0x1de0) =
           *(undefined4 *)(*(longlong *)(lVar7 + 0x1f38) + -4 + (ulonglong)uVar16 * 4);
    } while ((int)*(short *)(param_1 + 0x10) < *(int *)(lVar14 + 0x1f30));
  }
LAB_7ff70c83bf13:
  if ((int)*(short *)(param_1 + 8) < *(int *)(lVar14 + 0x1f00)) {
    do {
      FUN_7ff70c80af70(&UNK_7ff70cb8f50c);
      lVar7 = _DAT_7ff70cc1a3c0;
      iVar21 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f00);
      iVar17 = 1;
      if (iVar21 < 1) {
        FUN_7ff70c80af70(&UNK_7ff70cb90097);
        iVar21 = *(int *)(lVar7 + 0x1f00);
        iVar17 = iVar21;
        if (0 < iVar21) goto LAB_7ff70c83bf94;
      }
      else {
LAB_7ff70c83bf94:
        iVar17 = iVar17 + 1;
        do {
          lVar9 = *(longlong *)(lVar7 + 0x1f08) + (longlong)iVar21 * 0xc;
          iVar21 = *(int *)(*(longlong *)(lVar7 + 0x1f08) + -0xc + (longlong)iVar21 * 0xc);
          uVar26 = (ulonglong)*(ushort *)(&UNK_7ff70cb1d062 + (longlong)iVar21 * 4);
          if ((0x26ffd379bU >> ((longlong)iVar21 & 0x3fU) & 1) == 0) {
            if ((1L << ((byte)iVar21 & 0x3f) & 0xd9002c864U) != 0) {
              *(undefined4 *)(lVar7 + 0xc40 + uVar26) = *(undefined4 *)(lVar9 + -8);
              *(undefined4 *)(lVar7 + 0xc44 + uVar26) = *(undefined4 *)(lVar9 + -4);
            }
          }
          else {
            *(undefined4 *)(lVar7 + 0xc40 + uVar26) = *(undefined4 *)(lVar9 + -8);
          }
          iVar21 = *(int *)(lVar7 + 0x1f00) + -1;
          *(int *)(lVar7 + 0x1f00) = iVar21;
          iVar17 = iVar17 + -1;
        } while (1 < iVar17);
      }
    } while ((int)*(short *)(param_1 + 8) < *(int *)(lVar14 + 0x1f00));
  }
  fVar35 = _DAT_7ff70cb1d620;
  fVar28 = _DAT_7ff70cb1ba70;
  fVar13 = _DAT_7ff70cb1ba2c;
  if ((int)*(short *)(param_1 + 10) < *(int *)(lVar14 + 0x1f10)) {
    do {
      while( true ) {
        FUN_7ff70c80af70(&UNK_7ff70cb8f3fd);
        lVar7 = _DAT_7ff70cc1a3c0;
        if ((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f10) < 1) break;
        lVar9 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f18);
        lVar18 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f10) * 0x10;
        fVar30 = *(float *)(lVar9 + -4 + lVar18);
        fVar34 = *(float *)(lVar9 + -8 + lVar18);
        lVar9 = *(longlong *)(lVar9 + -0x10 + lVar18);
        *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1120) = lVar9;
        *(float *)(lVar7 + 0x1134) = fVar34;
        lVar18 = *(longlong *)(lVar7 + 0x1440);
        *(float *)(lVar7 + 0xc40) = fVar34;
        if (((lVar18 == 0) || (*(char *)(lVar18 + 0xd1) != '\x01')) ||
           ((*(longlong *)(lVar7 + 0x2278) != 0 &&
            (*(int *)(*(longlong *)(lVar7 + 0x2278) + 0x74) == -1)))) {
          if (fVar30 <= 0.0) {
            fVar30 = 0.0;
          }
          if ((fVar30 == 0.0) && (!NAN(fVar30))) {
            fVar30 = fVar34 * *(float *)(lVar7 + 0xc44) * *(float *)(lVar7 + 0xc48);
            if (lVar18 != 0) {
              fVar30 = fVar30 * *(float *)(lVar18 + 0x2b8);
            }
            fVar30 = fVar30 * *(float *)(lVar7 + 0xbc0);
            if (lVar9 != 0) {
              fVar30 = fVar30 * *(float *)(lVar9 + 0x48);
            }
          }
          fVar34 = fVar13;
          if ((0 < (int)(fVar30 + fVar28)) &&
             (fVar30 = (float)(int)(fVar30 + fVar28), fVar34 = fVar35, fVar30 <= fVar35)) {
            fVar34 = fVar30;
          }
          if (lVar9 == 0) {
            *(float *)(lVar7 + 0x1130) = fVar34;
            *(undefined8 *)(lVar7 + 0x1128) = 0;
            fVar30 = 0.0;
          }
          else {
            lVar25 = lVar9;
            if ((*(byte *)(lVar7 + 0xc) & 0x10) != 0) {
              *(undefined4 *)(lVar9 + 0x14) = *(undefined4 *)(lVar7 + 0x113c);
              lVar25 = *(longlong *)(lVar7 + 0x1120);
            }
            *(float *)(lVar7 + 0x1130) = fVar34;
            if ((lVar18 == 0) || (lVar25 == 0)) {
              lVar19 = 0;
              *(undefined8 *)(lVar7 + 0x1128) = 0;
            }
            else {
              lVar19 = FUN_7ff70c7e5630();
              lVar25 = *(longlong *)(lVar7 + 0x1120);
              fVar34 = *(float *)(lVar7 + 0x1130);
              *(longlong *)(lVar7 + 0x1128) = lVar19;
            }
            fVar30 = 0.0;
            if ((lVar18 != 0) && (fVar30 = 0.0, lVar25 != 0)) {
              fVar30 = fVar34 / *(float *)(lVar19 + 0x14);
            }
          }
          *(float *)(lVar7 + 0x1138) = fVar30;
          *(float *)(lVar7 + 0x1168) = fVar34;
          *(float *)(lVar7 + 0x116c) = fVar30;
        }
        if (lVar9 != 0) {
          lVar18 = *(longlong *)(lVar9 + 8);
          *(longlong *)(lVar7 + 0x1158) = lVar18;
          *(longlong *)(lVar7 + 0x1160) = lVar9;
          FUN_7ff70c7e96c0(lVar18);
          if (*(longlong *)(lVar7 + 0x1440) != 0) {
            uStack_d8 = *(ulonglong *)(lVar18 + 0x28);
            uStack_d0 = *(undefined8 *)(lVar18 + 0x30);
            FUN_7ff70c7b8700(*(undefined8 *)(*(longlong *)(lVar7 + 0x1440) + 0x2c8),&uStack_d8);
          }
        }
        *(int *)(lVar7 + 0x1f10) = *(int *)(lVar7 + 0x1f10) + -1;
        if (*(int *)(lVar14 + 0x1f10) <= (int)*(short *)(param_1 + 10)) goto LAB_7ff70c83c294;
      }
      FUN_7ff70c80af70(&UNK_7ff70cb90024);
    } while ((int)*(short *)(param_1 + 10) < *(int *)(lVar14 + 0x1f10));
  }
LAB_7ff70c83c294:
  if ((int)*(short *)(param_1 + 0xc) < *(int *)(lVar14 + 0x1f20)) {
    do {
      while( true ) {
        FUN_7ff70c80af70(&UNK_7ff70cb8f5fd);
        lVar7 = _DAT_7ff70cc1a3c0;
        iVar21 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20);
        if (iVar21 <= *(short *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x27a8) + 0xc)) break;
        *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20) = iVar21 + -1;
        if (iVar21 + -1 == 0) {
          *(undefined4 *)(lVar7 + 0x1ddc) = 0;
          if (*(int *)(lVar14 + 0x1f20) <= (int)*(short *)(param_1 + 0xc)) {
            return;
          }
        }
        else {
          *(undefined4 *)(lVar7 + 0x1ddc) =
               *(undefined4 *)(*(longlong *)(lVar7 + 0x1f28) + -0x10 + (longlong)iVar21 * 8);
          if (*(int *)(lVar14 + 0x1f20) <= (int)*(short *)(param_1 + 0xc)) {
            return;
          }
        }
      }
      FUN_7ff70c80af70(&UNK_7ff70cb90134);
    } while ((int)*(short *)(param_1 + 0xc) < *(int *)(lVar14 + 0x1f20));
  }
  return;
}


