/* 7ff70c849270 FUN_7ff70c849270 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c849270(undefined8 param_1,undefined8 param_2,undefined4 param_3)

{
  int *piVar1;
  float *pfVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  byte bVar5;
  char cVar6;
  longlong lVar7;
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  bool bVar12;
  longlong lVar13;
  longlong lVar14;
  longlong lVar15;
  undefined4 uVar16;
  longlong lVar17;
  uint uVar18;
  bool bVar19;
  int iVar20;
  int iVar21;
  float fVar22;
  float fVar23;
  float fVar24;
  float fVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  float fVar33;
  float fVar34;
  undefined1 auVar35 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 aauStack_78 [6] [16];
  undefined1 auVar36 [16];
  
  lVar13 = _DAT_7ff70cc1a3c0;
  lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  lVar17 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 8000) * 0x38 +
           *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f48);
  if ((*(char *)(lVar7 + 0x159) == '\x01') &&
     (((*(undefined1 *)(lVar7 + 0x159) = 0, *(float *)(lVar7 + 0x130) < *(float *)(lVar7 + 0x118) ||
       (*(float *)(lVar7 + 0x134) < *(float *)(lVar7 + 0x11c))) && (*(char *)(lVar7 + 0xd1) == '\0')
      ))) {
    FUN_7ff70c80af70(&UNK_7ff70cb8c7e7);
  }
  uVar3 = *(ulonglong *)(lVar7 + 0x130);
  auVar26._8_8_ = 0;
  auVar26._0_8_ = uVar3;
  uVar4 = *(ulonglong *)(lVar13 + 0x1e34);
  auVar29._8_8_ = 0;
  auVar29._0_8_ = uVar4;
  auVar30._4_4_ = -(uint)((float)(uVar4 >> 0x20) <= (float)(uVar3 >> 0x20));
  auVar30._0_4_ = -(uint)((float)uVar4 <= (float)uVar3);
  auVar30._8_4_ = 0xffffffff;
  auVar30._12_4_ = 0xffffffff;
  auVar30 = blendvps(auVar29,auVar26,auVar30);
  uVar3 = *(ulonglong *)(lVar17 + -0x34);
  fVar33 = (float)uVar3;
  fVar34 = (float)(uVar3 >> 0x20);
  auVar27._8_8_ = 0;
  auVar27._0_8_ = uVar3;
  auVar40._4_4_ = -(uint)(fVar34 <= auVar30._4_4_);
  auVar40._0_4_ = -(uint)(fVar33 <= auVar30._0_4_);
  auVar40._8_4_ = -(uint)(0.0 <= auVar30._8_4_);
  auVar40._12_4_ = -(uint)(0.0 <= auVar30._12_4_);
  auVar28 = blendvps(auVar27,auVar30,auVar40);
  fVar24 = auVar28._0_4_;
  fVar25 = auVar28._4_4_;
  aauStack_78[0]._8_4_ = fVar24;
  aauStack_78[0]._0_8_ = uVar3;
  aauStack_78[0]._12_4_ = fVar25;
  *(ulonglong *)(lVar7 + 0x118) = uVar3;
  *(undefined8 *)(lVar7 + 0x120) = *(undefined8 *)(lVar17 + -0x24);
  uVar4 = *(ulonglong *)(lVar17 + -0x2c);
  auVar31._8_8_ = 0;
  auVar31._0_8_ = uVar4;
  auVar8._4_4_ = -(uint)(fVar25 <= (float)(uVar4 >> 0x20));
  auVar8._0_4_ = -(uint)(fVar24 <= (float)uVar4);
  auVar8._8_4_ = -(uint)(auVar28._8_4_ <= 0.0);
  auVar8._12_4_ = -(uint)(auVar28._12_4_ <= 0.0);
  auVar30 = blendvps(auVar28,auVar31,auVar8);
  *(longlong *)(lVar7 + 0x130) = auVar30._0_8_;
  *(undefined4 *)(lVar7 + 0x15c) = *(undefined4 *)(lVar17 + -0x1c);
  *(undefined4 *)(lVar7 + 0x164) = *(undefined4 *)(lVar17 + -0x18);
  *(undefined8 *)(lVar7 + 0x140) = *(undefined8 *)(lVar17 + -0x14);
  *(undefined4 *)(lVar7 + 0x150) = *(undefined4 *)(lVar17 + -0xc);
  *(undefined1 *)(lVar7 + 0x158) = *(undefined1 *)(lVar17 + -2);
  if (*(char *)(lVar13 + 0x2720) == '\x01') {
    *(undefined4 *)(lVar13 + 0x2758) = 0xff7fffff;
  }
  if (*(char *)(lVar17 + -1) == '\0') {
    *(int *)(lVar13 + 8000) = *(int *)(lVar13 + 8000) + -1;
    return;
  }
  auVar32._4_4_ = fVar34;
  auVar32._0_4_ = fVar34;
  auVar32._8_8_ = 0;
  auVar30 = blendvps(ZEXT416((uint)*(float *)(lVar17 + -0xc)),
                     ZEXT416((uint)*(float *)(lVar7 + 0x154)),
                     ZEXT416(-(uint)(*(float *)(lVar17 + -0xc) <= *(float *)(lVar7 + 0x154))));
  *(int *)(lVar7 + 0x150) = auVar30._0_4_;
  lVar14 = _DAT_7ff70cc1a3c0;
  lVar15 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(lVar15 + 0xd1) == '\0') {
    fVar23 = *(float *)(lVar15 + 0x11c + (ulonglong)*(byte *)(lVar15 + 0x158) * 8);
    fVar22 = (*(float *)(lVar15 + 0x11c) - fVar23) + (fVar25 - fVar34);
    auVar40 = blendvps(ZEXT416((uint)(fVar22 + 0.0)),ZEXT416((uint)*(float *)(lVar15 + 0x144)),
                       ZEXT416(-(uint)(fVar22 <= *(float *)(lVar15 + 0x144))));
    auVar35._0_4_ = (fVar24 - fVar33) + *(float *)(lVar15 + 0x118);
    auVar35._4_12_ = auVar28._4_12_;
    *(float *)(lVar15 + 0x120) = auVar35._0_4_;
    *(float *)(lVar15 + 0x124) = fVar23;
    *(float *)(lVar15 + 0x118) =
         (float)(int)(*(float *)(lVar15 + 0x28) + *(float *)(lVar15 + 0x15c) +
                     *(float *)(lVar15 + 0x160));
    auVar38._0_4_ = (float)(int)(auVar40._0_4_ + fVar23 + *(float *)(lVar14 + 0xca0));
    auVar38._4_4_ = (float)(int)auVar40._4_4_;
    auVar38._8_4_ = (float)(int)auVar40._8_4_;
    auVar38._12_4_ = (float)(int)auVar40._12_4_;
    *(float *)(lVar15 + 0x11c) = auVar38._0_4_;
    auVar9._4_4_ = fVar25;
    auVar9._0_4_ = -(uint)(auVar35._0_4_ <= *(float *)(lVar15 + 0x130));
    auVar9._8_4_ = auVar28._8_4_;
    auVar9._12_4_ = auVar28._12_4_;
    auVar30 = blendvps(auVar35,ZEXT416((uint)*(float *)(lVar15 + 0x130)),auVar9);
    *(int *)(lVar15 + 0x130) = auVar30._0_4_;
    auVar39._4_12_ = auVar38._4_12_;
    auVar39._0_4_ = auVar38._0_4_ - *(float *)(lVar14 + 0xca0);
    auVar10._4_4_ = auVar38._4_4_;
    auVar10._0_4_ = -(uint)(auVar39._0_4_ <= *(float *)(lVar15 + 0x134));
    auVar10._8_4_ = auVar38._8_4_;
    auVar10._12_4_ = auVar38._12_4_;
    auVar30 = blendvps(auVar39,ZEXT416((uint)*(float *)(lVar15 + 0x134)),auVar10);
    *(int *)(lVar15 + 0x134) = auVar30._0_4_;
    *(float *)(lVar15 + 0x14c) = auVar40._0_4_;
    *(undefined4 *)(lVar15 + 0x144) = 0;
    fVar23 = *(float *)(lVar15 + 0x150);
    if (*(float *)(lVar15 + 0x150) <= _DAT_7ff70cb1bae8) {
      fVar23 = _DAT_7ff70cb1bae8;
    }
    *(float *)(lVar15 + 0x154) = fVar23;
    *(undefined4 *)(lVar15 + 0x150) = 0;
    *(undefined2 *)(lVar15 + 0x158) = 0;
    piVar1 = (int *)(lVar15 + 0x1d4);
    lVar15 = *(longlong *)(lVar14 + 0x1440);
    if ((*piVar1 == 0) && (*(char *)(lVar15 + 0xd1) == '\0')) {
      *(float *)(lVar15 + 0x118) = *(float *)(lVar14 + 0xc9c) + *(float *)(lVar15 + 0x120);
      *(undefined4 *)(lVar15 + 0x11c) = *(undefined4 *)(lVar15 + 0x124);
      *(undefined8 *)(lVar15 + 0x140) = *(undefined8 *)(lVar15 + 0x148);
      *(undefined4 *)(lVar15 + 0x150) = *(undefined4 *)(lVar15 + 0x154);
      *(undefined1 *)(lVar15 + 0x158) = 1;
      lVar15 = *(longlong *)(lVar14 + 0x1440);
    }
  }
  *(undefined4 *)(lVar14 + 0x1e20) = 0;
  *(ulonglong *)(lVar14 + 0x1e2c) = uVar3;
  *(undefined8 *)(lVar14 + 0x1e34) = aauStack_78[0]._8_8_;
  *(ulonglong *)(lVar14 + 0x1e3c) = uVar3;
  *(undefined8 *)(lVar14 + 0x1e44) = aauStack_78[0]._8_8_;
  *(uint *)(lVar14 + 0x1e24) = *(uint *)(lVar14 + 0x1de0) | *(uint *)(lVar14 + 0x1dec) | 1;
  *(undefined4 *)(lVar14 + 0x1e28) = 0;
  *(undefined4 *)(lVar14 + 0x1de8) = 0;
  *(undefined4 *)(lVar14 + 0x1dec) = 0;
  if (((fVar25 < *(float *)(lVar15 + 0x264) || fVar25 == *(float *)(lVar15 + 0x264)) ||
      (*(float *)(lVar15 + 0x26c) <= fVar34)) ||
     ((fVar24 < *(float *)(lVar15 + 0x260) || fVar24 == *(float *)(lVar15 + 0x260) ||
      (*(float *)(lVar15 + 0x268) <= fVar33)))) {
    uVar16 = 1;
    if (*(char *)(lVar14 + 0x14b2) != '\0') goto LAB_7ff70c849655;
  }
  else {
    *(undefined4 *)(lVar14 + 0x1e28) = 0x100;
    uVar16 = 0x101;
LAB_7ff70c849655:
    auVar11._8_8_ = 0;
    auVar11._0_8_ = uVar3;
    auVar30 = blendvps(ZEXT416((uint)*(float *)(lVar15 + 0x260)),auVar11,
                       ZEXT416(-(uint)(*(float *)(lVar15 + 0x260) <= fVar33)));
    if (auVar30._0_4_ - *(float *)(lVar14 + 0xcb4) <= *(float *)(lVar14 + 0xe0)) {
      uVar3 = *(ulonglong *)(lVar15 + 0x268);
      fVar23 = (float)(uVar3 >> 0x20);
      iVar20 = -(uint)(fVar24 < (float)uVar3);
      iVar21 = -(uint)(fVar25 < fVar23);
      auVar37._4_4_ = iVar21;
      auVar37._0_4_ = iVar20;
      auVar37._8_4_ = iVar21;
      auVar37._12_4_ = iVar21;
      auVar36._8_8_ = auVar37._8_8_;
      auVar36._4_4_ = iVar20;
      auVar36._0_4_ = iVar20;
      uVar18 = movmskpd(param_3,auVar36);
      if ((uVar18 & 1) == 0) {
        auVar28._8_8_ = 0;
        auVar28._0_8_ = uVar3;
      }
      fVar22 = fVar25;
      if ((uVar18 & 2) == 0) {
        fVar22 = fVar23;
      }
      auVar30 = blendvps(ZEXT416((uint)*(float *)(lVar15 + 0x264)),auVar32,
                         ZEXT416(-(uint)(*(float *)(lVar15 + 0x264) <= fVar34)));
      if (((auVar30._0_4_ - *(float *)(lVar14 + 0xcb8) <= *(float *)(lVar14 + 0xe4)) &&
          (*(float *)(lVar14 + 0xe0) < *(float *)(lVar14 + 0xcb4) + auVar28._0_4_)) &&
         (*(float *)(lVar14 + 0xe4) < fVar22 + *(float *)(lVar14 + 0xcb8))) {
        *(undefined4 *)(lVar14 + 0x1e28) = uVar16;
      }
    }
  }
  pfVar2 = (float *)(lVar13 + 0x1e2c);
  iVar20 = *(int *)(lVar13 + 0x14b4);
  if (*(int *)(lVar17 + -8) == iVar20) {
    if (*(char *)(lVar17 + -4) == '\0') {
      bVar5 = *(char *)(lVar13 + 0x14f1);
joined_r0x7ff70c84977d:
      if (bVar5 != 0) {
        iVar20 = *(int *)(lVar13 + 0x14e8);
        uVar18 = 0x60;
        bVar12 = false;
        goto LAB_7ff70c84978d;
      }
    }
LAB_7ff70c8497a9:
    uVar18 = 0x20;
    bVar12 = false;
    *pfVar2 = fVar33;
    *(float *)(lVar13 + 0x1e30) = fVar34;
    *(float *)(lVar13 + 0x1e34) = fVar24;
    *(float *)(lVar13 + 0x1e38) = fVar25;
    cVar6 = *(char *)(lVar17 + -3);
  }
  else {
    bVar19 = *(int *)(lVar13 + 0x14b8) == iVar20;
    if (*(char *)(lVar17 + -4) == '\0') {
      bVar5 = *(byte *)(lVar13 + 0x14f1);
      if (iVar20 != 0 && bVar19) {
        *(int *)(lVar13 + 0x1e20) = iVar20;
        uVar18 = (uint)bVar5 << 6 | 0x20;
        bVar12 = true;
        *pfVar2 = fVar33;
        *(float *)(lVar13 + 0x1e30) = fVar34;
        *(float *)(lVar13 + 0x1e34) = fVar24;
        *(float *)(lVar13 + 0x1e38) = fVar25;
        cVar6 = *(char *)(lVar17 + -3);
        goto joined_r0x7ff70c849777;
      }
      goto joined_r0x7ff70c84977d;
    }
    uVar18 = 0x20;
    bVar12 = true;
    if (iVar20 == 0 || !bVar19) goto LAB_7ff70c8497a9;
LAB_7ff70c84978d:
    *(int *)(lVar13 + 0x1e20) = iVar20;
    *pfVar2 = fVar33;
    *(float *)(lVar13 + 0x1e30) = fVar34;
    *(float *)(lVar13 + 0x1e34) = fVar24;
    *(float *)(lVar13 + 0x1e38) = fVar25;
    cVar6 = *(char *)(lVar17 + -3);
  }
joined_r0x7ff70c849777:
  if ((cVar6 == '\0') && (*(int *)(lVar13 + 0x149c) != 0)) {
    *(byte *)(lVar13 + 0x1e28) = *(byte *)(lVar13 + 0x1e28) | 0x80;
  }
  if ((bVar12) && (*(char *)(lVar13 + 0x14c5) == '\x01')) {
    *(byte *)(lVar13 + 0x1e28) = *(byte *)(lVar13 + 0x1e28) | 4;
  }
  *(uint *)(lVar13 + 0x1e28) = *(uint *)(lVar13 + 0x1e28) | uVar18;
  *(int *)(lVar13 + 8000) = *(int *)(lVar13 + 8000) + -1;
  if (*(char *)(lVar13 + 0x1ee8) == '\x01') {
    FUN_7ff70c7bd870(*(undefined8 *)(lVar7 + 0x2c8),aauStack_78,aauStack_78[0] + 8,0xffff00ff,0,0,
                     0x3f800000);
  }
  return;
}


