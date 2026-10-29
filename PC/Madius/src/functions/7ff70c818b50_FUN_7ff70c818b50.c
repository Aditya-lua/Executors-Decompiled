/* 7ff70c818b50 FUN_7ff70c818b50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c818b50(undefined8 *param_1,undefined8 *param_2,char param_3)

{
  longlong lVar1;
  code *pcVar2;
  float fVar3;
  float fVar4;
  float fVar5;
  float fVar6;
  ulonglong uVar7;
  float fVar8;
  float fVar11;
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  float fVar12;
  float fVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  fVar12 = (float)*param_1;
  fVar13 = (float)((ulonglong)*param_1 >> 0x20);
  fVar11 = (float)((ulonglong)*param_2 >> 0x20);
  fVar8 = (float)*param_2;
  if (param_3 != '\0') {
    lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    fVar3 = *(float *)(lVar1 + 0x260);
    fVar4 = *(float *)(lVar1 + 0x264);
    fVar5 = *(float *)(lVar1 + 0x268);
    fVar6 = *(float *)(lVar1 + 0x26c);
    auVar14._4_4_ = fVar5;
    auVar14._0_4_ = fVar3;
    auVar14._8_4_ = fVar4;
    auVar14._12_4_ = fVar6;
    auVar9._4_4_ = -(uint)(fVar5 <= fVar8);
    auVar9._0_4_ = -(uint)(fVar3 <= fVar12);
    auVar9._8_4_ = -(uint)(fVar4 <= fVar13);
    auVar9._12_4_ = -(uint)(fVar6 <= fVar11);
    auVar10._4_4_ = -(uint)(fVar8 < fVar5);
    auVar10._0_4_ = -(uint)(fVar12 < fVar3);
    auVar10._8_4_ = -(uint)(fVar13 < fVar4);
    auVar10._12_4_ = -(uint)(fVar11 < fVar6);
    auVar10 = blendps(auVar9,auVar10,10);
    auVar15._4_4_ = fVar8;
    auVar15._0_4_ = fVar12;
    auVar15._8_4_ = fVar13;
    auVar15._12_4_ = fVar11;
    auVar15 = blendvps(auVar14,auVar15,auVar10);
    fVar12 = auVar15._0_4_;
    fVar8 = auVar15._4_4_;
    fVar13 = auVar15._8_4_;
    fVar11 = auVar15._12_4_;
  }
  if (fVar12 - *(float *)(_DAT_7ff70cc1a3c0 + 0xcb4) <= *(float *)(_DAT_7ff70cc1a3c0 + 0xe0)) {
    uVar7 = 0;
    if ((fVar13 - *(float *)(_DAT_7ff70cc1a3c0 + 0xcb8) <= *(float *)(_DAT_7ff70cc1a3c0 + 0xe4)) &&
       (*(float *)(_DAT_7ff70cc1a3c0 + 0xe0) < fVar8 + *(float *)(_DAT_7ff70cc1a3c0 + 0xcb4))) {
      uVar7 = (ulonglong)
              (*(float *)(_DAT_7ff70cc1a3c0 + 0xe4) < fVar11 + *(float *)(_DAT_7ff70cc1a3c0 + 0xcb8)
              );
    }
  }
  else {
    uVar7 = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_28)) {
    return uVar7;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
  pcVar2 = (code *)swi(3);
  uVar7 = (*pcVar2)();
  return uVar7;
}


