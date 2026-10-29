/* 7ff70c89f2a0 FUN_7ff70c89f2a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c89f2a0(undefined1 (*param_1) [16],uint param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  undefined8 uVar3;
  code *pcVar4;
  float fVar5;
  longlong lVar6;
  longlong lVar7;
  undefined4 uVar8;
  int iVar9;
  float fVar10;
  float fVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  float fVar15;
  float fVar16;
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  float fVar20;
  ulonglong uVar21;
  float fVar23;
  float fVar24;
  undefined1 auStack_e8 [32];
  undefined4 uStack_c8;
  undefined4 uStack_c0;
  undefined4 uStack_b8;
  undefined1 auStack_a8 [16];
  ulonglong uStack_90;
  undefined1 auVar22 [16];
  
  lVar6 = _DAT_7ff70cc1a3c0;
  uStack_90 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_e8;
  lVar2 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2360) = 0;
  uVar21 = *(ulonglong *)(lVar6 + 0xe0);
  auVar12._8_8_ = 0;
  auVar12._0_8_ = uVar21;
  uVar1 = *(ulonglong *)*param_1;
  auVar17._8_8_ = 0;
  auVar17._0_8_ = *(ulonglong *)(*param_1 + 8);
  auVar18 = minps(auVar17,auVar12);
  auVar13._4_4_ = -(uint)((float)(uVar21 >> 0x20) < (float)(uVar1 >> 0x20));
  auVar13._0_4_ = -(uint)((float)uVar21 < (float)uVar1);
  auVar13._8_8_ = 0;
  auVar19._8_8_ = 0;
  auVar19._0_8_ = uVar1;
  auVar19 = blendvps(auVar18,auVar19,auVar13);
  *(ulonglong *)(lVar6 + 0x2348) =
       CONCAT44(auVar19._4_4_ - (float)((ulonglong)*(undefined8 *)(lVar2 + 0x128) >> 0x20),
                auVar19._0_4_ - (float)*(undefined8 *)(lVar2 + 0x128));
  uVar3 = *(undefined8 *)*(undefined1 (*) [16])(lVar6 + 0x2384);
  fVar20 = (float)uVar3;
  fVar23 = (float)((ulonglong)uVar3 >> 0x20);
  fVar10 = (float)*(undefined8 *)(lVar6 + 0x238c);
  fVar15 = (float)((ulonglong)*(undefined8 *)(lVar6 + 0x238c) >> 0x20);
  auVar19 = *param_1;
  auVar14._4_4_ = -(uint)(fVar23 < auVar19._4_4_);
  auVar14._0_4_ = -(uint)(fVar20 < auVar19._0_4_);
  auVar14._8_4_ = -(uint)(fVar10 < auVar19._8_4_);
  auVar14._12_4_ = -(uint)(fVar15 < auVar19._12_4_);
  auVar18._4_4_ = -(uint)(auVar19._4_4_ <= fVar23);
  auVar18._0_4_ = -(uint)(auVar19._0_4_ <= fVar20);
  auVar18._8_4_ = -(uint)(auVar19._8_4_ <= fVar10);
  auVar18._12_4_ = -(uint)(auVar19._12_4_ <= fVar15);
  auVar18 = blendps(auVar14,auVar18,3);
  auStack_a8 = blendvps(auVar19,*(undefined1 (*) [16])(lVar6 + 0x2384),auVar18);
  uVar3 = *(undefined8 *)(lVar2 + 0x2c8);
  uVar8 = FUN_7ff70c80a070(0x1c,_DAT_7ff70cb1d964);
  uStack_c0 = 0;
  uStack_c8 = 0;
  FUN_7ff70c7bd960(uVar3,auStack_a8,auStack_a8 + 8,uVar8);
  fVar20 = _DAT_7ff70cb1ba2c;
  uVar3 = *(undefined8 *)(lVar2 + 0x2c8);
  uVar8 = FUN_7ff70c80a070(0x36,_DAT_7ff70cb1ba2c);
  uStack_b8 = 0x3f800000;
  uStack_c0 = 0;
  uStack_c8 = 0;
  FUN_7ff70c7bd870(uVar3,auStack_a8,auStack_a8 + 8,uVar8);
  lVar7 = _DAT_7ff70cc1a3c0;
  if ((param_2 & 0x900) != 0x800) goto LAB_7ff70c89f6d9;
  fVar23 = *(float *)(lVar6 + 0x1130);
  fVar15 = *(float *)*param_1 + fVar23;
  fVar24 = *(float *)(*param_1 + 4) + fVar23;
  fVar10 = *(float *)(*param_1 + 8) - fVar23;
  fVar23 = *(float *)(*param_1 + 0xc) - fVar23;
  if ((((fVar15 <= *(float *)(lVar6 + 0xe0)) && (fVar24 <= *(float *)(lVar6 + 0xe4))) &&
      (*(float *)(lVar6 + 0xe0) < fVar10)) && (*(float *)(lVar6 + 0xe4) < fVar23))
  goto LAB_7ff70c89f6d9;
  fVar16 = *(float *)(_DAT_7ff70cc1a3c0 + 0xe0);
  if ((fVar10 < fVar16) || (fVar10 = fVar15, fVar16 < fVar15)) {
    fVar16 = fVar16 - fVar10;
    if (((fVar16 != 0.0) || (NAN(fVar16))) &&
       ((fVar10 = *(float *)(lVar2 + 0x98), 0.0 <= fVar16 || (0.0 <= fVar10)))) {
      auVar19 = ZEXT816(0);
      if (0.0 < fVar16) {
        if (*(float *)(lVar2 + 0xa0) <= fVar10) goto LAB_7ff70c89f58b;
        auVar19 = ZEXT416((uint)_DAT_7ff70cb1ba2c);
      }
      fVar15 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
      fVar11 = ((float)(_DAT_7ff70cb1bac0 & (uint)fVar16) - fVar15) /
               (_DAT_7ff70cb1c678 * fVar15 - fVar15);
      fVar5 = _DAT_7ff70cb1ba2c;
      if (fVar11 <= _DAT_7ff70cb1ba2c) {
        fVar5 = fVar11;
      }
      auVar18 = blendvps(ZEXT416((uint)(fVar5 * _DAT_7ff70cb1bae0 + _DAT_7ff70cb1ba2c)),
                         _DAT_7ff70cb1b2a0,ZEXT416(-(uint)(fVar11 < 0.0)));
      auVar19 = blendvps(auVar19,_DAT_7ff70cb1d540,ZEXT416(-(uint)(fVar16 < 0.0)));
      fVar15 = auVar19._0_4_ * fVar15 * _DAT_7ff70cb1d9a0 * auVar18._0_4_ *
               *(float *)(_DAT_7ff70cc1a3c0 + 0x20) + *(float *)(lVar6 + 0x2350);
      *(float *)(lVar6 + 0x2350) = fVar15;
      iVar9 = (int)fVar15 - (uint)(fVar15 < 0.0 && (float)(int)fVar15 != fVar15);
      if (iVar9 != 0) {
        fVar15 = (float)iVar9;
        FUN_7ff70c84c900(lVar2,fVar10 + fVar15);
        *(float *)(lVar6 + 0x2350) = *(float *)(lVar6 + 0x2350) - fVar15;
      }
    }
  }
LAB_7ff70c89f58b:
  fVar10 = *(float *)(lVar7 + 0xe4);
  if ((fVar23 < fVar10) || (fVar23 = fVar24, fVar10 < fVar24)) {
    fVar10 = fVar10 - fVar23;
    if (((fVar10 != 0.0) || (NAN(fVar10))) &&
       (((fVar23 = *(float *)(lVar2 + 0x9c), 0.0 <= fVar10 || (0.0 <= fVar23)) &&
        ((uVar21 = 0, fVar10 <= 0.0 ||
         (uVar21 = (ulonglong)(uint)fVar20, fVar23 < *(float *)(lVar2 + 0xa4))))))) {
      auVar22._8_8_ = 0;
      auVar22._0_8_ = uVar21;
      fVar15 = *(float *)(lVar7 + 0x1130);
      fVar16 = ((float)(_DAT_7ff70cb1bac0 & (uint)fVar10) - fVar15) /
               (_DAT_7ff70cb1c678 * fVar15 - fVar15);
      fVar24 = fVar20;
      if (fVar16 <= fVar20) {
        fVar24 = fVar16;
      }
      auVar18 = blendvps(ZEXT416((uint)(fVar24 * _DAT_7ff70cb1bae0 + fVar20)),_DAT_7ff70cb1b2a0,
                         ZEXT416(-(uint)(fVar16 < 0.0)));
      auVar19 = blendvps(auVar22,_DAT_7ff70cb1d540,ZEXT416(-(uint)(fVar10 < 0.0)));
      fVar20 = auVar19._0_4_ * fVar15 * _DAT_7ff70cb1d9a0 * auVar18._0_4_ * *(float *)(lVar7 + 0x20)
               + *(float *)(lVar6 + 0x2354);
      *(float *)(lVar6 + 0x2354) = fVar20;
      iVar9 = (int)fVar20 - (uint)(fVar20 < 0.0 && (float)(int)fVar20 != fVar20);
      if (iVar9 != 0) {
        fVar20 = (float)iVar9;
        FUN_7ff70c84c960(lVar2,fVar23 + fVar20);
        *(float *)(lVar6 + 0x2354) = *(float *)(lVar6 + 0x2354) - fVar20;
      }
    }
  }
LAB_7ff70c89f6d9:
  if (_DAT_7ff70cbebd80 == (uStack_90 ^ (ulonglong)auStack_e8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_90 ^ (ulonglong)auStack_e8);
  pcVar4 = (code *)swi(3);
  (*pcVar4)();
  return;
}


