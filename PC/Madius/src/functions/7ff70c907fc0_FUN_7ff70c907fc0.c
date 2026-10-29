/* 7ff70c907fc0 FUN_7ff70c907fc0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c907fc0(void)

{
  short *psVar1;
  code *pcVar2;
  undefined4 *puVar3;
  longlong lVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  ushort uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined1 auVar13 [12];
  ulonglong uVar14;
  longlong lVar15;
  bool bVar16;
  char cVar17;
  byte bVar18;
  undefined4 uVar19;
  uint uVar20;
  longlong lVar21;
  longlong lVar22;
  undefined4 *puVar23;
  short sVar24;
  int iVar25;
  int iVar26;
  longlong lVar27;
  uint *puVar28;
  longlong lVar29;
  bool bVar30;
  undefined *puVar31;
  char *pcVar32;
  uint *puVar33;
  longlong lVar34;
  undefined8 *puVar35;
  int iVar36;
  uint uVar37;
  longlong lVar38;
  longlong lVar39;
  ulonglong uVar40;
  float *pfVar41;
  byte bVar42;
  float *pfVar43;
  int *piVar44;
  bool bVar45;
  float fVar46;
  float fVar47;
  float fVar48;
  float fVar49;
  float fVar50;
  float fVar51;
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined4 unaff_XMM6_Da;
  float fVar54;
  undefined1 auVar55 [16];
  undefined8 in_stack_ffffffffffffff78;
  undefined8 uStack_80;
  undefined4 uStack_78;
  
  lVar15 = _DAT_7ff70cc1a3c0;
  uVar20 = (uint)((ulonglong)in_stack_ffffffffffffff78 >> 0x20);
  puVar3 = *(undefined4 **)(_DAT_7ff70cc1a3c0 + 0x2278);
  if (puVar3 != (undefined4 *)0x0) {
    if (*(char *)((longlong)puVar3 + 0x237) == '\0') {
      FUN_7ff70c905570(puVar3);
    }
    uVar20 = puVar3[1];
    lVar29 = *(longlong *)(puVar3 + 0x62);
    lVar4 = *(longlong *)(puVar3 + 0x60);
    lVar27 = *(longlong *)(puVar3 + 4);
    if (*(char *)(puVar3 + 0x8e) == '\x01') {
      FUN_7ff70c908ca0(puVar3);
    }
    if (((((uVar20 & 0x20) != 0) && (*(short *)((longlong)puVar3 + 0x20a) != -1)) &&
        (cVar17 = FUN_7ff70c835180(), cVar17 == '\0')) &&
       (cVar17 = FUN_7ff70c847830(1), cVar17 != '\0')) {
      iVar25 = (int)*(short *)((longlong)puVar3 + 0x20a);
      lVar34 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278);
      if (iVar25 == -1) {
        iVar25 = *(int *)(lVar34 + 0x74);
      }
      if ((*(byte *)(lVar34 + 4) & 7) != 0) {
        *(undefined1 *)(lVar34 + 0x23c) = 1;
        iVar26 = 0xffff;
        if (iVar25 != *(int *)(lVar34 + 0x6c)) {
          iVar26 = iVar25;
        }
        *(short *)(lVar34 + 0x224) = (short)iVar26;
        *(undefined2 *)(lVar34 + 0x7a) = *(undefined2 *)(lVar34 + 0x78);
        uVar19 = FUN_7ff70c802f50(&UNK_7ff70cb8066f,0);
        FUN_7ff70c84eb40(uVar19,0);
      }
    }
    if ((longlong)*(short *)(puVar3 + 0x1e) == 0) {
      piVar44 = puVar3 + 0x6a;
    }
    else {
      piVar44 = (int *)(*(longlong *)(puVar3 + 0x72) + (longlong)*(short *)(puVar3 + 0x1e) * 0x18 +
                       -0x18);
    }
    *(undefined8 *)(lVar29 + 0x148) = *(undefined8 *)(lVar27 + 0x60);
    *(undefined8 *)(lVar29 + 0x140) = *(undefined8 *)(lVar27 + 0x68);
    *(undefined8 *)(lVar29 + 0x130) = *(undefined8 *)(lVar27 + 0x70);
    fVar54 = (float)puVar3[0x20];
    if (lVar29 == lVar4) {
      if ((uVar20 & 0x20000) == 0) {
        auVar52 = blendvps(ZEXT416((uint)fVar54),ZEXT416((uint)puVar3[0x3f]),
                           ZEXT416(-(uint)(fVar54 <= (float)puVar3[0x3f])));
        puVar3[0x43] = auVar52._0_4_;
        puVar3[0x3f] = auVar52._0_4_;
      }
    }
    else {
      *(float *)(lVar29 + 0x134) = fVar54;
    }
    fVar49 = (float)puVar3[0x3f];
    auVar52 = blendvps(ZEXT416((uint)fVar49),ZEXT416((uint)puVar3[0x47]),
                       ZEXT416(-(uint)(fVar49 <= (float)puVar3[0x47])));
    puVar3[0x47] = auVar52._0_4_;
    piVar44[1] = (int)(fVar49 - (float)puVar3[0x3d]);
    if ((puVar3[1] & 0x1000000) != 0) {
      fVar49 = *(float *)(*(longlong *)(puVar3 + 0x62) + 0x130);
      auVar52 = ZEXT416((uint)fVar49);
      if ((longlong)*(short *)((longlong)puVar3 + 0x21e) != -1) {
        fVar50 = 0.0;
        if ((puVar3[1] & 0x400) != 0) {
          fVar50 = _DAT_7ff70cb1ba2c;
        }
        fVar50 = (*(float *)(*(longlong *)(puVar3 + 6) + 0x3c +
                            (longlong)*(short *)((longlong)puVar3 + 0x21e) * 0x74) +
                  (float)puVar3[0x30] + (float)puVar3[0x2f]) - fVar50;
        auVar52 = blendvps(ZEXT416((uint)fVar50),auVar52,ZEXT416(-(uint)(fVar50 <= fVar49)));
      }
      if (*(short *)((longlong)puVar3 + 0x212) != -1) {
        auVar52 = blendvps(ZEXT416((uint)puVar3[0x38]),auVar52,
                           ZEXT416(-(uint)((float)puVar3[0x38] <= auVar52._0_4_)));
      }
      *(float *)(*(longlong *)(puVar3 + 0x62) + 0x130) =
           auVar52._0_4_ + *(float *)(*(longlong *)(puVar3 + 4) + 8);
    }
    if ((uVar20 & 0x100000) == 0) {
      FUN_7ff70c7b8130(*(undefined8 *)(lVar29 + 0x2c8));
    }
    lVar34 = *(longlong *)(lVar29 + 0x2c8);
    puVar23 = (undefined4 *)
              (*(longlong *)(lVar34 + 0xa8) + -0x10 + (longlong)*(int *)(lVar34 + 0xa0) * 0x10);
    uVar19 = puVar23[1];
    uVar11 = puVar23[2];
    uVar12 = puVar23[3];
    *(undefined4 *)(lVar29 + 0x260) = *puVar23;
    *(undefined4 *)(lVar29 + 0x264) = uVar19;
    *(undefined4 *)(lVar29 + 0x268) = uVar11;
    *(undefined4 *)(lVar29 + 0x26c) = uVar12;
    if ((uVar20 & 0x780) != 0) {
      FUN_7ff70c9094d0(puVar3);
      lVar34 = *(longlong *)(lVar29 + 0x2c8);
    }
    uVar5 = *(undefined8 *)(puVar3 + 0x68);
    FUN_7ff70c7c6750(uVar5,lVar34);
    if ((*(byte *)((longlong)puVar3 + 6) & 0x10) == 0) {
      FUN_7ff70c909a10(puVar3);
    }
    FUN_7ff70c7b6530(uVar5,*(undefined8 *)(lVar29 + 0x2c8));
    if ((longlong)(int)puVar3[0x1b] < 1) {
      auVar52 = ZEXT816(0);
      fVar50 = 0.0;
      fVar49 = 0.0;
    }
    else {
      lVar34 = 0x50;
      uVar40 = 0;
      fVar49 = 0.0;
      fVar50 = 0.0;
      auVar52 = ZEXT816(0);
      do {
        if ((*(uint *)(*(longlong *)(puVar3 + 0x14) + (uVar40 >> 5 & 0x7ffffff) * 4) >>
             ((uint)uVar40 & 0x1f) & 1) != 0) {
          lVar22 = *(longlong *)(puVar3 + 6);
          uVar20 = *(uint *)(lVar22 + -0x50 + lVar34);
          if ((uVar20 & 0x30) == 0x10) {
            auVar53 = ZEXT416(*(uint *)(lVar22 + -0x40 + lVar34));
            if ((uVar20 & 0x10) == 0) goto LAB_7ff70c908338;
LAB_7ff70c9083ef:
            fVar49 = fVar49 + auVar53._0_4_;
          }
          else {
            fVar48 = *(float *)(lVar22 + -8 + lVar34);
            fVar51 = *(float *)(lVar22 + -0x18 + lVar34);
            fVar46 = *(float *)(lVar22 + -0xc + lVar34);
            auVar53 = blendvps(ZEXT416((uint)fVar48),ZEXT416((uint)fVar46),
                               ZEXT416(-(uint)(fVar48 <= fVar46)));
            auVar53._0_4_ = auVar53._0_4_ - fVar51;
            if ((uVar20 & 0x2000) == 0) {
              fVar51 = *(float *)(lVar22 + lVar34) - fVar51;
              auVar53 = blendvps(ZEXT416((uint)fVar51),auVar53,
                                 ZEXT416(-(uint)(fVar51 <= auVar53._0_4_)));
            }
            if (((uVar20 & 0x10) != 0) &&
               (fVar48 = *(float *)(lVar22 + -0x30 + lVar34), 0.0 < fVar48)) {
              if ((*(byte *)(puVar3 + 1) & 1) == 0) {
                auVar53 = ZEXT416((uint)fVar48);
              }
              if ((uVar20 & 0x20) != 0) {
                auVar53 = ZEXT416((uint)fVar48);
              }
            }
            auVar53 = blendvps(ZEXT416((uint)puVar3[0x2e]),auVar53,
                               ZEXT416(-(uint)((float)puVar3[0x2e] <= auVar53._0_4_)));
            if ((uVar20 & 0x10) != 0) goto LAB_7ff70c9083ef;
LAB_7ff70c908338:
            fVar50 = fVar50 + auVar53._0_4_;
          }
          if ((~uVar20 & 0x28) == 0) {
            auVar55._4_12_ = auVar53._4_12_;
            auVar55._0_4_ =
                 auVar53._0_4_ / (*(float *)(lVar22 + -0x34 + lVar34) / (float)puVar3[0x36]);
            auVar6._4_4_ = auVar53._4_4_;
            auVar6._0_4_ = -(uint)(auVar55._0_4_ <= auVar52._0_4_);
            auVar6._8_4_ = auVar53._8_4_;
            auVar6._12_4_ = auVar53._12_4_;
            auVar52 = blendvps(auVar55,auVar52,auVar6);
          }
        }
        uVar40 = uVar40 + 1;
        lVar34 = lVar34 + 0x74;
      } while ((longlong)(int)puVar3[0x1b] != uVar40);
    }
    auVar7._4_4_ = auVar52._4_4_;
    auVar7._0_4_ = -(uint)(auVar52._0_4_ <= fVar50);
    auVar7._8_4_ = auVar52._8_4_;
    auVar7._12_4_ = auVar52._12_4_;
    auVar52 = blendvps(auVar52,ZEXT416((uint)fVar50),auVar7);
    puVar3[0x35] = auVar52._0_4_ +
                   (float)(int)*(short *)((longlong)puVar3 + 0x202) *
                   ((float)puVar3[0x30] + (float)puVar3[0x30]) +
                   (float)(*(short *)((longlong)puVar3 + 0x202) + -1) *
                   ((float)puVar3[0x31] + (float)puVar3[0x32]) +
                   (float)puVar3[0x2f] + (float)puVar3[0x2f] + fVar49;
    if ((lVar29 == lVar4) || ((puVar3[1] & 0x1000000) != 0)) {
      if ((((longlong)*(short *)(puVar3 + 0x85) != -1) &&
          (((*(short *)((longlong)puVar3 + 0x212) == -1 && (*(char *)(lVar29 + 200) == '\x01')) &&
           (*(short *)((longlong)puVar3 + 0x7a) == *(short *)(puVar3 + 0x1e))))) &&
         ((fVar49 = *(float *)(*(longlong *)(puVar3 + 6) + 0xc +
                              (longlong)*(short *)(puVar3 + 0x85) * 0x74),
          fVar49 < (float)puVar3[0x48] ||
          ((float)puVar3[0x4a] <= fVar49 && fVar49 != (float)puVar3[0x4a])))) {
        FUN_7ff70c84c6e0(lVar29);
      }
    }
    else {
      *(undefined4 *)(lVar29 + 0x98) = 0;
    }
    if (((longlong)*(short *)((longlong)puVar3 + 0x212) != -1) &&
       (*(short *)(puVar3 + 0x1e) == *(short *)((longlong)puVar3 + 0x7a))) {
      puVar3[0x37] = (float)(int)(((((float)(int)(*(float *)(lVar15 + 0x1140) * _DAT_7ff70cb1bae4) +
                                    (*(float *)(lVar15 + 0xe0) - *(float *)(lVar15 + 0x14cc))) -
                                   *(float *)(*(longlong *)(puVar3 + 6) + 8 +
                                             (longlong)*(short *)((longlong)puVar3 + 0x212) * 0x74))
                                  - (float)puVar3[0x31]) -
                                 ((float)puVar3[0x30] + (float)puVar3[0x30]));
    }
    if (*(int *)(lVar15 + 0x14b8) == 0) {
      bVar18 = 0;
    }
    else {
      bVar18 = *(byte *)((longlong)puVar3 + 0x245) ^ 1;
    }
    *(byte *)((longlong)puVar3 + 0x246) = bVar18;
    if (*(int *)(*(longlong *)(lVar29 + 0x110) + -4 + (longlong)*(int *)(lVar29 + 0x108) * 4) ==
        *piVar44) {
      if (*(int *)(lVar27 + 0x80) <= *(int *)(lVar4 + 0x1f0)) goto LAB_7ff70c908610;
LAB_7ff70c908722:
      FUN_7ff70c80af70(&UNK_7ff70cb903b2);
      sVar24 = *(short *)(puVar3 + 0x1e);
    }
    else {
      FUN_7ff70c80af70(&UNK_7ff70cb905cd);
      if (*(int *)(lVar4 + 0x1f0) < *(int *)(lVar27 + 0x80)) goto LAB_7ff70c908722;
LAB_7ff70c908610:
      sVar24 = *(short *)(puVar3 + 0x1e);
    }
    if (0 < sVar24) {
      FUN_7ff70c844300();
    }
    FUN_7ff70c844300();
    fVar49 = *(float *)(lVar4 + 0x130);
    fVar50 = *(float *)(lVar4 + 0x134);
    uVar5 = *(undefined8 *)(lVar27 + 0x48);
    *(undefined8 *)(lVar29 + 0x240) = *(undefined8 *)(lVar27 + 0x40);
    *(undefined8 *)(lVar29 + 0x248) = uVar5;
    uVar5 = *(undefined8 *)(lVar27 + 0x58);
    *(undefined8 *)(lVar29 + 0x250) = *(undefined8 *)(lVar27 + 0x50);
    *(undefined8 *)(lVar29 + 600) = uVar5;
    *(undefined1 *)(lVar29 + 0xd1) = *(undefined1 *)((longlong)puVar3 + 0x24a);
    *(undefined8 *)(lVar4 + 0x118) = *(undefined8 *)(puVar3 + 0x3c);
    *(undefined4 *)(lVar4 + 0x1e8) = *(undefined4 *)(lVar27 + 0x7c);
    *(undefined4 *)(lVar4 + 0x1f0) = *(undefined4 *)(lVar27 + 0x80);
    *(undefined4 *)(lVar4 + 0x160) = *(undefined4 *)(lVar27 + 0x78);
    if (lVar29 == lVar4) {
      *(int *)(*(longlong *)(puVar3 + 0x62) + 0x1a0) =
           *(int *)(*(longlong *)(puVar3 + 0x62) + 0x1a0) + -1;
      uStack_80 = CONCAT44((float)((ulonglong)*(undefined8 *)(puVar3 + 0x3e) >> 0x20) -
                           (float)((ulonglong)*(undefined8 *)(puVar3 + 0x3c) >> 0x20),
                           (float)*(undefined8 *)(puVar3 + 0x3e) -
                           (float)*(undefined8 *)(puVar3 + 0x3c));
      FUN_7ff70c8375f0(&uStack_80);
      FUN_7ff70c837800(puVar3 + 0x3c,0,0);
      uVar20 = puVar3[1];
      if ((uVar20 & 0x10000) != 0) goto LAB_7ff70c90879a;
LAB_7ff70c9086e1:
      fVar48 = 0.0;
      if (*(float *)(lVar27 + 0x20) <= 0.0) {
        if ((uVar20 & 0x2000000) != 0) {
          fVar48 = *(float *)(lVar29 + 0xc0);
        }
        fVar48 = (float)puVar3[0x3c] + (float)puVar3[0x35] +
                 *(float *)(*(longlong *)(puVar3 + 4) + 8) + fVar48;
        fVar51 = fVar48 - *(float *)(lVar27 + 0x20);
        auVar52 = blendvps(ZEXT416((uint)fVar51),ZEXT416((uint)*(float *)(lVar4 + 0x138)),
                           ZEXT416(-(uint)(fVar51 <= *(float *)(lVar4 + 0x138))));
        *(int *)(lVar4 + 0x138) = auVar52._0_4_;
        auVar52 = ZEXT416((uint)puVar3[0x3e]);
        if (fVar48 <= (float)puVar3[0x3e]) {
          auVar52 = ZEXT416((uint)fVar48);
        }
      }
      else {
        auVar52 = ZEXT416((uint)puVar3[0x3e]);
      }
    }
    else {
      uVar10 = (ushort)*(undefined4 *)(lVar29 + 0x174);
      *(ushort *)(lVar29 + 0x174) =
           uVar10 | (ushort)(1 << (*(byte *)((longlong)puVar3 + 0x236) & 0x1f));
      *(undefined8 *)(lVar15 + 0x2278) = 0;
      FUN_7ff70c836f00();
      *(undefined4 **)(lVar15 + 0x2278) = puVar3;
      *(ushort *)(lVar29 + 0x174) = uVar10;
      uVar20 = puVar3[1];
      if ((uVar20 & 0x10000) == 0) goto LAB_7ff70c9086e1;
LAB_7ff70c90879a:
      auVar52 = ZEXT416((uint)((float)puVar3[0x3c] + (float)puVar3[0x35]));
    }
    auVar8._4_4_ = 0;
    auVar8._0_4_ = -(uint)(auVar52._0_4_ <= fVar49);
    auVar8._8_4_ = auVar52._8_4_;
    auVar8._12_4_ = auVar52._12_4_;
    auVar52 = blendvps(auVar52,ZEXT416((uint)fVar49),auVar8);
    *(int *)(lVar4 + 0x130) = auVar52._0_4_;
    fVar49 = 0.0;
    if (*(float *)(lVar27 + 0x24) <= 0.0) {
      if ((*(byte *)((longlong)puVar3 + 7) & 1) != 0) {
        fVar49 = *(float *)(lVar29 + 0xc4);
      }
      fVar54 = fVar54 + fVar49;
      fVar49 = fVar54 - *(float *)(lVar27 + 0x24);
      auVar52 = blendvps(ZEXT416((uint)fVar49),ZEXT416((uint)*(float *)(lVar4 + 0x13c)),
                         ZEXT416(-(uint)(fVar49 <= *(float *)(lVar4 + 0x13c))));
      *(int *)(lVar4 + 0x13c) = auVar52._0_4_;
      auVar52 = ZEXT416((uint)puVar3[0x3f]);
      if (fVar54 <= (float)puVar3[0x3f]) {
        auVar52 = ZEXT416((uint)fVar54);
      }
    }
    else {
      auVar52 = ZEXT416((uint)puVar3[0x3f]);
    }
    auVar9._4_4_ = 0;
    auVar9._0_4_ = -(uint)(auVar52._0_4_ <= fVar50);
    auVar9._8_4_ = auVar52._8_4_;
    auVar9._12_4_ = auVar52._12_4_;
    auVar52 = blendvps(auVar52,ZEXT416((uint)fVar50),auVar9);
    *(int *)(lVar4 + 0x134) = auVar52._0_4_;
    if ((*(char *)((longlong)puVar3 + 0x23f) == '\x01') &&
       (*(undefined1 *)((longlong)puVar3 + 0x23f) = 0, lVar29 = _DAT_7ff70cc1a3c0,
       (*(byte *)(puVar3 + 1) & 0x10) == 0)) {
      lVar27 = (longlong)(int)puVar3[0x19];
      if (lVar27 == -1) {
LAB_7ff70c9088f3:
        lVar27 = _DAT_7ff70cc1a3c0;
        uVar19 = *puVar3;
        uVar20 = puVar3[0x1b];
        lVar34 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x26a8);
        iVar36 = uVar20 * 0x10 + 0x18;
        iVar26 = iVar36 + *(int *)(_DAT_7ff70cc1a3c0 + 0x26a8);
        iVar25 = *(int *)(_DAT_7ff70cc1a3c0 + 0x26ac);
        if (iVar25 < iVar26) {
          if (iVar25 == 0) {
            iVar25 = 8;
          }
          else {
            iVar25 = iVar25 / 2 + iVar25;
          }
          if (iVar25 <= iVar26) {
            iVar25 = iVar26;
          }
          lVar22 = FUN_7ff70c802100((longlong)iVar25);
          if (*(longlong *)(lVar27 + 0x26b0) != 0) {
            FUN_7ff70cb12b60(lVar22,*(longlong *)(lVar27 + 0x26b0),
                             (longlong)*(int *)(lVar27 + 0x26a8));
            FUN_7ff70c802510(*(undefined8 *)(lVar27 + 0x26b0));
          }
          *(longlong *)(lVar27 + 0x26b0) = lVar22;
          *(int *)(lVar27 + 0x26ac) = iVar25;
        }
        else {
          lVar22 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x26b0);
        }
        *(int *)(lVar27 + 0x26a8) = iVar26;
        *(int *)(lVar22 + lVar34) = iVar36;
        lVar22 = *(longlong *)(lVar27 + 0x26b0);
        lVar27 = lVar22 + lVar34;
        puVar23 = (undefined4 *)(lVar22 + lVar34 + 4);
        puVar35 = (undefined8 *)(lVar22 + 4 + lVar34);
        *puVar35 = 0;
        puVar35[1] = 0;
        *(undefined4 *)(lVar22 + 0x14 + lVar34) = 0;
        if (0 < (int)uVar20) {
          puVar35 = (undefined8 *)(lVar27 + 0x18);
          if (uVar20 != 1) {
            uVar37 = uVar20 & 0x7ffffffe;
            do {
              *puVar35 = 0;
              *(undefined4 *)(puVar35 + 1) = 0xffffffff;
              *(undefined2 *)((longlong)puVar35 + 0xc) = 0xffff;
              *(byte *)((longlong)puVar35 + 0xe) = *(byte *)((longlong)puVar35 + 0xe) & 0xe0 | 0xc;
              puVar35[2] = 0;
              *(undefined4 *)(puVar35 + 3) = 0xffffffff;
              *(undefined2 *)((longlong)puVar35 + 0x1c) = 0xffff;
              *(byte *)((longlong)puVar35 + 0x1e) = *(byte *)((longlong)puVar35 + 0x1e) & 0xe0 | 0xc
              ;
              puVar35 = puVar35 + 4;
              uVar37 = uVar37 - 2;
            } while (uVar37 != 0);
            if ((uVar20 & 1) == 0) goto LAB_7ff70c908a73;
          }
          *puVar35 = 0;
          *(undefined4 *)(puVar35 + 1) = 0xffffffff;
          *(undefined2 *)((longlong)puVar35 + 0xc) = 0xffff;
          *(byte *)((longlong)puVar35 + 0xe) = *(byte *)((longlong)puVar35 + 0xe) & 0xe0 | 0xc;
        }
LAB_7ff70c908a73:
        *(undefined4 *)(lVar27 + 4) = uVar19;
        *(short *)(lVar27 + 0x10) = (short)uVar20;
        *(short *)(lVar27 + 0x12) = (short)uVar20;
        *(undefined1 *)(lVar27 + 0x14) = 1;
        puVar3[0x19] = (int)puVar23 - *(int *)(lVar29 + 0x26b0);
        iVar25 = puVar3[0x1b];
      }
      else {
        puVar23 = (undefined4 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x26b0) + lVar27);
        iVar25 = puVar3[0x1b];
        if (*(short *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x26b0) + 0xe + lVar27) < iVar25) {
          *puVar23 = 0;
          goto LAB_7ff70c9088f3;
        }
      }
      *(short *)(puVar23 + 3) = (short)iVar25;
      puVar28 = *(uint **)(puVar3 + 6);
      puVar23[1] = 0;
      uVar19 = 0;
      if (0 < (int)puVar3[0x1b]) {
        pfVar41 = (float *)(puVar23 + 5);
        iVar25 = 0;
        bVar16 = false;
        do {
          bVar30 = bVar16;
          if ((*puVar28 & 8) == 0) {
            pfVar43 = (float *)(puVar28 + 4);
          }
          else {
            pfVar43 = (float *)(puVar28 + 7);
          }
          fVar54 = *pfVar43;
          *pfVar41 = fVar54;
          *(short *)(pfVar41 + 2) = (short)iVar25;
          *(undefined2 *)((longlong)pfVar41 + 10) = *(undefined2 *)((longlong)puVar28 + 0x56);
          *(undefined2 *)(pfVar41 + 3) = *(undefined2 *)((longlong)puVar28 + 0x5e);
          bVar42 = *(byte *)((longlong)puVar28 + 0x71) & 3;
          bVar18 = *(byte *)((longlong)pfVar41 + 0xe);
          *(byte *)((longlong)pfVar41 + 0xe) = bVar18 & 0xfc | bVar42;
          bVar18 = bVar18 & 0xf0 | bVar42 | *(byte *)((longlong)puVar28 + 0x67) << 2;
          *(byte *)((longlong)pfVar41 + 0xe) = bVar18;
          *(byte *)((longlong)pfVar41 + 0xe) = bVar18 & 0xe7 | (byte)*puVar28 * '\x02' & 0x10;
          bVar45 = (*puVar28 & 8) == 0;
          if ((fVar54 != (float)puVar28[8]) || (NAN(fVar54) || NAN((float)puVar28[8]))) {
            *(byte *)(puVar23 + 1) = *(byte *)(puVar23 + 1) | 1;
          }
          if (iVar25 != *(short *)((longlong)puVar28 + 0x56)) {
            *(byte *)(puVar23 + 1) = *(byte *)(puVar23 + 1) | 2;
          }
          if (*(short *)((longlong)puVar28 + 0x5e) != -1) {
            *(byte *)(puVar23 + 1) = *(byte *)(puVar23 + 1) | 8;
          }
          if ((*puVar28 >> 1 & 1) == (uint)*(byte *)((longlong)puVar28 + 0x67)) {
            *(byte *)(puVar23 + 1) = *(byte *)(puVar23 + 1) | 4;
          }
          iVar25 = iVar25 + 1;
          puVar28 = puVar28 + 0x1d;
          pfVar41 = pfVar41 + 4;
          bVar16 = (bool)(bVar30 | bVar45);
        } while (iVar25 < (int)puVar3[0x1b]);
        puVar23[1] = puVar23[1] & puVar3[1];
        if (bVar30 || bVar45) {
          uVar19 = puVar3[0x39];
        }
      }
      puVar23[2] = uVar19;
      FUN_7ff70c8582b0();
    }
    *(undefined1 *)((longlong)puVar3 + 0x239) = 0;
    iVar25 = *(int *)(lVar15 + 0x2284);
    *(int *)(lVar15 + 0x2284) = iVar25 + -1;
    if (1 < (longlong)iVar25) {
      lVar29 = (longlong)iVar25 * 0x88 + *(longlong *)(lVar15 + 0x2290);
      piVar44 = (int *)(lVar29 + -0x110);
      if (piVar44 != (int *)0x0) {
        lVar27 = (longlong)*piVar44 * 0x250 + *(longlong *)(lVar15 + 0x22a0);
        *(longlong *)(lVar15 + 0x2278) = lVar27;
        iVar25 = -1;
        if (*(longlong *)(lVar15 + 0x22a0) != 0) {
          *(int **)(lVar27 + 0x10) = piVar44;
          *(longlong *)(*(longlong *)(lVar15 + 0x2278) + 0x1a0) = lVar29 + -0xe8;
          if (*(longlong *)(lVar15 + 0x2278) != 0) {
            iVar25 = (int)((ulonglong)
                           (*(longlong *)(lVar15 + 0x2278) - *(longlong *)(lVar15 + 0x22a0)) >> 4) *
                     -0x6eb3e453;
          }
        }
        goto LAB_7ff70c908c6a;
      }
    }
    *(undefined8 *)(lVar15 + 0x2278) = 0;
    iVar25 = -1;
LAB_7ff70c908c6a:
    *(int *)(lVar4 + 0x1d0) = iVar25;
    uVar40 = FUN_7ff70c854720();
    return uVar40;
  }
  lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uStack_78 = unaff_XMM6_Da;
  if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
      if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
        *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
        goto LAB_7ff70c80aff6;
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                       *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
      bVar18 = *(byte *)(lVar15 + 0x27b4);
    }
    else {
LAB_7ff70c80aff6:
      bVar18 = *(byte *)(lVar15 + 0x27b4);
    }
    if ((bVar18 & 1) == 0) {
      *(int *)(lVar15 + 0x27e0) = *(int *)(lVar15 + 0x27e0) + 1;
      *(undefined1 *)(lVar15 + 0x2788) = 0;
      cVar17 = *(char *)(lVar15 + 0x7f);
      lVar4 = _DAT_7ff70cc1a3c0;
    }
    else {
      if (lVar29 == 0) {
        puVar31 = &UNK_7ff70cb8a129;
      }
      else {
        puVar31 = *(undefined **)(lVar29 + 8);
      }
      FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar31,&UNK_7ff70cb90499);
      *(undefined1 *)(lVar15 + 0x2788) = 0;
      cVar17 = *(char *)(lVar15 + 0x7f);
      lVar4 = _DAT_7ff70cc1a3c0;
    }
  }
  else {
    *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
    cVar17 = *(char *)(lVar15 + 0x7f);
    lVar4 = _DAT_7ff70cc1a3c0;
  }
  _DAT_7ff70cc1a3c0 = lVar4;
  if (cVar17 != '\x01') {
    pcVar2 = *(code **)(lVar15 + 0x2770);
    goto joined_r0x7ff70c80b41a;
  }
  if (*(char *)(lVar15 + 0x1398) == '\x01') {
    pcVar32 = "Tooltip_Error";
    uVar37 = 0xffffffff;
    do {
      cVar17 = pcVar32[-2];
      if (cVar17 == '#') {
        if ((pcVar32[-1] == '#') && (*pcVar32 == '#')) {
          uVar37 = 0xffffffff;
        }
      }
      else if (cVar17 == '\0') goto LAB_7ff70c80b0c7;
      uVar37 = crc32(uVar37,cVar17);
      pcVar32 = pcVar32 + 1;
    } while( true );
  }
  goto LAB_7ff70c80b40a;
LAB_7ff70c80b0c7:
  puVar28 = *(uint **)(lVar4 + 0x1428);
  puVar33 = puVar28 + (longlong)*(int *)(lVar4 + 0x1420) * 4;
  uVar40 = (longlong)*(int *)(lVar4 + 0x1420);
  while (uVar14 = uVar40, uVar14 != 0) {
    uVar40 = uVar14 >> 1;
    if (puVar28[uVar40 * 4] < ~uVar37) {
      puVar28 = puVar28 + uVar40 * 4 + 4;
      uVar40 = ~uVar40 + uVar14;
    }
  }
  if ((((puVar28 == puVar33) || (*puVar28 != ~uVar37)) || (*(longlong *)(puVar28 + 2) == 0)) ||
     (*(char *)(lVar4 + 0xfc) == '\0')) {
    fVar54 = *(float *)(lVar4 + 0xd94);
    fVar49 = *(float *)(lVar4 + 0xd98);
    fVar50 = *(float *)(lVar4 + 0xd9c);
    fVar48 = *(float *)(lVar4 + 0xda0);
    auVar13 = *(undefined1 (*) [12])(lVar4 + 0xd94);
    uVar19 = *(undefined4 *)(lVar4 + 0xda0);
    iVar25 = *(int *)(lVar4 + 0x1ef0);
    if (iVar25 == *(int *)(lVar4 + 0x1ef4)) {
      if (iVar25 == 0) {
        iVar26 = 8;
      }
      else {
        iVar26 = iVar25 / 2 + iVar25;
      }
      iVar36 = iVar25 + 1;
      if (iVar25 + 1 < iVar26) {
        iVar36 = iVar26;
      }
      lVar27 = (*_DAT_7ff70cbe9460)((longlong)iVar36 * 0x14,_DAT_7ff70cc1a3d0);
      lVar34 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar44 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar22 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar22 * 8) == *piVar44) {
          sVar24 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar22 * 8) + 1;
        }
        else {
          iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
          lVar22 = (longlong)iVar25;
          *(int *)(lVar34 + 0x2874 + lVar22 * 8) = *piVar44;
          *(undefined4 *)(lVar34 + 0x2878 + lVar22 * 8) = 0;
          sVar24 = 1;
        }
        *(short *)(lVar34 + 0x2878 + lVar22 * 8) = sVar24;
        *(int *)(lVar34 + 0x2868) = *(int *)(lVar34 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar4 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar27,*(longlong *)(lVar4 + 0x1ef8),
                         (longlong)*(int *)(lVar4 + 0x1ef0) * 0x14);
        lVar22 = _DAT_7ff70cc1a3c0;
        lVar34 = *(longlong *)(lVar4 + 0x1ef8);
        if ((lVar34 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar44 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar39 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar39 * 8) == *piVar44) {
            sVar24 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar39 * 8) + 1;
          }
          else {
            iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
            lVar39 = (longlong)iVar25;
            *(int *)(lVar22 + 0x2874 + lVar39 * 8) = *piVar44;
            *(undefined4 *)(lVar22 + 0x2878 + lVar39 * 8) = 0;
            sVar24 = 1;
          }
          *(short *)(lVar22 + 0x287a + lVar39 * 8) = sVar24;
          *(int *)(lVar22 + 0x286c) = *(int *)(lVar22 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar34,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar4 + 0x1ef8) = lVar27;
      *(int *)(lVar4 + 0x1ef4) = iVar36;
      iVar25 = *(int *)(lVar4 + 0x1ef0);
    }
    else {
      lVar27 = *(longlong *)(lVar4 + 0x1ef8);
    }
    *(undefined4 *)(lVar27 + (longlong)iVar25 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar27 + 4 + (longlong)iVar25 * 0x14);
    *puVar3 = auVar13._0_4_;
    puVar3[1] = auVar13._4_4_;
    puVar3[2] = auVar13._8_4_;
    puVar3[3] = uVar19;
    *(int *)(lVar4 + 0x1ef0) = *(int *)(lVar4 + 0x1ef0) + 1;
    if (*(int *)(lVar4 + 0x1eec) != 4) {
      fVar51 = (_UNK_7ff70cb1d634 - fVar49) * _UNK_7ff70cb1d644;
      fVar46 = (_UNK_7ff70cb1d638 - fVar50) * _UNK_7ff70cb1d648;
      fVar47 = (_UNK_7ff70cb1d63c - fVar48) * _UNK_7ff70cb1d64c;
      *(float *)(lVar4 + 0xd94) = (_DAT_7ff70cb1d630 - fVar54) * _DAT_7ff70cb1d640 + fVar54;
      *(float *)(lVar4 + 0xd98) = fVar51 + fVar49;
      *(float *)(lVar4 + 0xd9c) = fVar46 + fVar50;
      *(float *)(lVar4 + 0xda0) = fVar47 + fVar48;
    }
  }
  else {
    cVar17 = *(char *)(*(longlong *)(puVar28 + 2) + 0xcd);
    fVar54 = *(float *)(lVar4 + 0xd94);
    fVar49 = *(float *)(lVar4 + 0xd98);
    fVar50 = *(float *)(lVar4 + 0xd9c);
    fVar48 = *(float *)(lVar4 + 0xda0);
    auVar13 = *(undefined1 (*) [12])(lVar4 + 0xd94);
    uVar19 = *(undefined4 *)(lVar4 + 0xda0);
    iVar25 = *(int *)(lVar4 + 0x1ef0);
    if (iVar25 == *(int *)(lVar4 + 0x1ef4)) {
      if (iVar25 == 0) {
        iVar26 = 8;
      }
      else {
        iVar26 = iVar25 / 2 + iVar25;
      }
      iVar36 = iVar25 + 1;
      if (iVar25 + 1 < iVar26) {
        iVar36 = iVar26;
      }
      lVar27 = (*_DAT_7ff70cbe9460)((longlong)iVar36 * 0x14,_DAT_7ff70cc1a3d0);
      lVar34 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar44 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar22 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar22 * 8) == *piVar44) {
          sVar24 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar22 * 8) + 1;
        }
        else {
          iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
          lVar22 = (longlong)iVar25;
          *(int *)(lVar34 + 0x2874 + lVar22 * 8) = *piVar44;
          *(undefined4 *)(lVar34 + 0x2878 + lVar22 * 8) = 0;
          sVar24 = 1;
        }
        *(short *)(lVar34 + 0x2878 + lVar22 * 8) = sVar24;
        *(int *)(lVar34 + 0x2868) = *(int *)(lVar34 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar4 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar27,*(longlong *)(lVar4 + 0x1ef8),
                         (longlong)*(int *)(lVar4 + 0x1ef0) * 0x14);
        lVar22 = _DAT_7ff70cc1a3c0;
        lVar34 = *(longlong *)(lVar4 + 0x1ef8);
        if ((lVar34 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar44 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar39 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar39 * 8) == *piVar44) {
            sVar24 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar39 * 8) + 1;
          }
          else {
            iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
            lVar39 = (longlong)iVar25;
            *(int *)(lVar22 + 0x2874 + lVar39 * 8) = *piVar44;
            *(undefined4 *)(lVar22 + 0x2878 + lVar39 * 8) = 0;
            sVar24 = 1;
          }
          *(short *)(lVar22 + 0x287a + lVar39 * 8) = sVar24;
          *(int *)(lVar22 + 0x286c) = *(int *)(lVar22 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar34,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar4 + 0x1ef8) = lVar27;
      *(int *)(lVar4 + 0x1ef4) = iVar36;
      iVar25 = *(int *)(lVar4 + 0x1ef0);
    }
    else {
      lVar27 = *(longlong *)(lVar4 + 0x1ef8);
    }
    *(undefined4 *)(lVar27 + (longlong)iVar25 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar27 + 4 + (longlong)iVar25 * 0x14);
    *puVar3 = auVar13._0_4_;
    puVar3[1] = auVar13._4_4_;
    puVar3[2] = auVar13._8_4_;
    puVar3[3] = uVar19;
    *(int *)(lVar4 + 0x1ef0) = *(int *)(lVar4 + 0x1ef0) + 1;
    if (*(int *)(lVar4 + 0x1eec) != 4) {
      fVar51 = (_UNK_7ff70cb1d634 - fVar49) * _UNK_7ff70cb1d644;
      fVar46 = (_UNK_7ff70cb1d638 - fVar50) * _UNK_7ff70cb1d648;
      fVar47 = (_UNK_7ff70cb1d63c - fVar48) * _UNK_7ff70cb1d64c;
      *(float *)(lVar4 + 0xd94) = (_DAT_7ff70cb1d630 - fVar54) * _DAT_7ff70cb1d640 + fVar54;
      *(float *)(lVar4 + 0xd98) = fVar51 + fVar49;
      *(float *)(lVar4 + 0xd9c) = fVar46 + fVar50;
      *(float *)(lVar4 + 0xda0) = fVar47 + fVar48;
    }
    lVar27 = _DAT_7ff70cc1a3c0;
    if (cVar17 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar27 + 0x1e80) = *(undefined8 *)(lVar4 + 0x2780);
      *(undefined8 *)(lVar27 + 0x1e88) = 0;
      *(undefined4 *)(lVar27 + 0x1e74) = 1;
    }
  }
  cVar17 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  FUN_7ff70c80a7b0(1);
  if (cVar17 != '\0') {
    if (*(short *)(*(longlong *)(lVar4 + 0x1440) + 0xda) == 1) {
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar39 = _DAT_7ff70cc1a3c0;
      lVar27 = *(longlong *)(lVar4 + 0x1440);
      lVar34 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar25 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar22 = *(longlong *)(lVar34 + -8 + (longlong)iVar25 * 8);
      if (((lVar22 != lVar27) && (1 < iVar25)) && (*(longlong *)(lVar22 + 0x3c0) != lVar27)) {
        uVar40 = (ulonglong)(iVar25 - 1);
        iVar25 = 1;
        do {
          uVar37 = (int)uVar40 - 1;
          uVar40 = (ulonglong)uVar37;
          if (*(longlong *)(lVar34 + uVar40 * 8) == lVar27) {
            FUN_7ff70cb12b70(lVar34 + uVar40 * 8,lVar34 + uVar40 * 8 + 8,(longlong)iVar25 << 3);
            *(longlong *)
             (*(longlong *)(lVar39 + 0x13e8) + -8 + (longlong)*(int *)(lVar39 + 0x13e0) * 8) =
                 lVar27;
            lVar27 = *(longlong *)(lVar4 + 0x1440);
            break;
          }
          iVar25 = iVar25 + 1;
        } while (0 < (int)uVar37);
      }
      lVar22 = _DAT_7ff70cc1a3c0;
      lVar34 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar34 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar27)
      {
        iVar26 = (int)*(short *)(lVar27 + 0xe2);
        lVar21 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar25 = (int)lVar21;
        lVar39 = lVar21;
        if (iVar25 - iVar26 != 0 && iVar26 <= iVar25) {
          lVar38 = (longlong)iVar26;
          lVar39 = (longlong)iVar25;
          lVar34 = lVar38;
          if ((iVar25 - iVar26 & 1U) != 0) {
            lVar34 = lVar38 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar38 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar38 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar22 + 0x13f8) + lVar38 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar39 + -1 != lVar38) {
            do {
              *(undefined8 *)(*(longlong *)(lVar22 + 0x13f8) + lVar34 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar22 + 0x13f8) + 8 + lVar34 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar22 + 0x13f8) + lVar34 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar22 + 0x13f8) + 8 + lVar34 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar22 + 0x13f8) + 0x10 + lVar34 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar22 + 0x13f8) + 8 + lVar34 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar34 = lVar34 + 2;
            } while (lVar39 != lVar34);
          }
          lVar34 = *(longlong *)(lVar22 + 0x13f8);
        }
        *(longlong *)(lVar34 + lVar39 * 8) = lVar27;
        *(short *)(lVar27 + 0xe2) = (short)lVar21;
      }
      *(undefined8 *)(lVar4 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      iVar25 = *(int *)(lVar15 + 0x278c);
    }
    else {
      iVar25 = *(int *)(lVar15 + 0x278c);
    }
    if (iVar25 < 0x14) {
      if (lVar29 == 0) {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb90499);
      }
      else {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar29 + 8),&UNK_7ff70cb90499);
        lVar4 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar29 + 0xd5) != '\x01') || (*(char *)(lVar29 + 0xcd) == '\x01')) {
          lVar27 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
          lVar34 = *(longlong *)(lVar27 + 0x50);
          if (lVar34 == 0) {
            lVar34 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar22 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar44 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar39 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar39 * 8) == *piVar44) {
                sVar24 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar39 * 8) + 1;
              }
              else {
                iVar25 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar25;
                lVar39 = (longlong)iVar25;
                *(int *)(lVar22 + 0x2874 + lVar39 * 8) = *piVar44;
                *(undefined4 *)(lVar22 + 0x2878 + lVar39 * 8) = 0;
                sVar24 = 1;
              }
              *(short *)(lVar22 + 0x2878 + lVar39 * 8) = sVar24;
              *(int *)(lVar22 + 0x2868) = *(int *)(lVar22 + 0x2868) + 1;
            }
            FUN_7ff70c7b5780(lVar34,lVar4 + 0x1148);
            *(undefined **)(lVar34 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar27 + 0x50) = lVar34;
          }
          if (*(int *)(lVar27 + 0x44) != *(int *)(lVar4 + 5000)) {
            FUN_7ff70c7b6160(lVar34);
            FUN_7ff70c7b8300(lVar34,&stack0xffffffffffffff98);
            FUN_7ff70c7b7c50(lVar34,lVar27 + 8,&stack0xffffffffffffffb0,0);
            *(undefined4 *)(lVar27 + 0x44) = *(undefined4 *)(lVar4 + 5000);
          }
          uStack_78 = 0x3f800000;
          uStack_80 = (ulonglong)uStack_80._4_4_ << 0x20;
          FUN_7ff70c7bd870(lVar34,lVar29 + 0x28,&stack0xffffffffffffff98,0xff0000ff,
                           (ulonglong)uVar20 << 0x20);
          iVar25 = *(int *)(lVar15 + 0x278c);
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar25 = *(int *)(lVar15 + 0x278c);
    }
joined_r0x7ff70c80b695:
    if (iVar25 == 0x14) {
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  *(int *)(lVar15 + 0x278c) = *(int *)(lVar15 + 0x278c) + 1;
  pcVar2 = *(code **)(lVar15 + 0x2770);
joined_r0x7ff70c80b41a:
  if (pcVar2 != (code *)0x0) {
    (*pcVar2)(lVar15,*(undefined8 *)(lVar15 + 0x2778),&UNK_7ff70cb90499);
  }
  return (ulonglong)*(byte *)(lVar15 + 0x7d);
}


