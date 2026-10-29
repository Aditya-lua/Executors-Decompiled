/* 7ff70c84f430 FUN_7ff70c84f430 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c84f430(undefined8 *param_1)

{
  ulonglong uVar1;
  int iVar2;
  code *pcVar3;
  bool bVar4;
  undefined8 *puVar5;
  longlong lVar6;
  longlong lVar7;
  bool bVar8;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  float fVar22;
  float fVar23;
  float fVar24;
  float fVar25;
  float fVar26;
  float fVar27;
  float fVar28;
  float fVar29;
  float fVar30;
  undefined1 auStack_a8 [40];
  ulonglong uStack_80;
  
  uStack_80 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  iVar2 = *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4);
  if ((iVar2 == 0) || (*(char *)(_DAT_7ff70cc1a3c0 + 0x14c6) != '\x01')) {
    bVar8 = false;
    lVar6 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98);
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x1f90) == '\x01') goto LAB_7ff70c84f52b;
LAB_7ff70c84f4b3:
    bVar4 = true;
    if (bVar8) {
LAB_7ff70c84f4bb:
      bVar4 = false;
    }
  }
  else {
    bVar8 = iVar2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1e20);
    lVar6 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f98);
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0x1f90) != '\x01') goto LAB_7ff70c84f4b3;
LAB_7ff70c84f52b:
    bVar4 = true;
    if ((lVar6 != 0 & *(byte *)(_DAT_7ff70cc1a3c0 + 0x1f91)) != 0 || bVar8) goto LAB_7ff70c84f4bb;
  }
  if ((iVar2 == 0) || (*(char *)(_DAT_7ff70cc1a3c0 + 0x14c6) != '\x01')) {
    bVar8 = false;
  }
  else {
    bVar8 = iVar2 == *(int *)(_DAT_7ff70cc1a3c0 + 0x1e20);
  }
  if (bVar4) {
    puVar5 = (undefined8 *)(_DAT_7ff70cc1a3c0 + 0x2400);
    if (_DAT_7ff70cb1d744 <= *(float *)(_DAT_7ff70cc1a3c0 + 0xe4) &&
        _DAT_7ff70cb1d744 <= *(float *)(_DAT_7ff70cc1a3c0 + 0xe0)) {
      puVar5 = (undefined8 *)(_DAT_7ff70cc1a3c0 + 0xe0);
    }
    uVar9 = CONCAT44((float)((ulonglong)*puVar5 >> 0x20) + _UNK_7ff70cb1d984,
                     (float)*puVar5 + _DAT_7ff70cb1d980);
    goto LAB_7ff70c84fad2;
  }
  if (bVar8) {
    auVar19 = *(undefined1 (*) [16])(_DAT_7ff70cc1a3c0 + 0x1e3c);
    auVar10._4_4_ = (float)auVar19._12_4_;
    auVar10._0_4_ = (float)auVar19._0_4_;
    auVar10._8_4_ = (float)auVar19._8_4_;
    auVar10._12_4_ = (float)auVar19._12_4_;
    auVar13._8_8_ = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e44);
    auVar13._0_8_ = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1e44);
    auVar21 = auVar10;
    auVar14 = auVar13;
    auVar11 = auVar19;
    if (*(int *)(lVar6 + 0x288) != *(int *)(_DAT_7ff70cc1a3c0 + 5000)) {
LAB_7ff70c84f60b:
      fVar26 = *(float *)(lVar6 + 0xa8);
      if (fVar26 == _DAT_7ff70cb1c5d8) {
        if ((*(float *)(lVar6 + 0xac) == _DAT_7ff70cb1c5d8) &&
           (auVar10 = auVar21, auVar13 = auVar14, auVar19 = auVar11,
           !NAN(*(float *)(lVar6 + 0xac)) && !NAN(_DAT_7ff70cb1c5d8))) goto LAB_7ff70c84fa84;
      }
      fVar22 = (float)*(undefined8 *)(lVar6 + 0x98);
      fVar23 = (float)((ulonglong)*(undefined8 *)(lVar6 + 0x98) >> 0x20);
      fVar25 = *(float *)(lVar6 + 0x74) + *(float *)(lVar6 + 0x84) + *(float *)(lVar6 + 0x7c);
      fVar27 = *(float *)(lVar6 + 0x70) + *(float *)(lVar6 + 0x80) + *(float *)(lVar6 + 0x78);
      fVar24 = fVar23;
      if (*(char *)(lVar6 + 0xcf) == '\x01') {
        fVar28 = fVar22;
        if (fVar26 < _DAT_7ff70cb1c5d8) {
          fVar28 = *(float *)(lVar6 + 0xb0);
          fVar30 = *(float *)(lVar6 + 0xb8);
          if (0.0 < fVar30) {
            if (fVar26 <= fVar30) {
              fVar26 = fVar26 * fVar28 + 0.0;
            }
            else {
              fVar29 = (*(float *)(lVar6 + 0xa0) + *(float *)(lVar6 + 0x38)) - fVar27;
              if (fVar29 - fVar30 <= fVar26) {
                fVar26 = fVar26 + (fVar29 - fVar26) * fVar28;
              }
            }
          }
          fVar28 = fVar26 - fVar28 * (*(float *)(lVar6 + 0x38) - fVar27);
        }
        auVar19 = ZEXT416((uint)(float)(longlong)
                                       ((float)(-(uint)(0.0 <= fVar28) & (uint)fVar28) +
                                       _DAT_7ff70cb1ba70));
        fVar26 = *(float *)(lVar6 + 0xac);
        if (fVar26 < _DAT_7ff70cb1c5d8) {
          fVar24 = *(float *)(lVar6 + 0xb4);
          fVar27 = *(float *)(lVar6 + 0xbc);
joined_r0x7ff70c84f928:
          if (fVar27 <= 0.0) {
            fVar28 = *(float *)(lVar6 + 0x3c);
          }
          else {
            fVar28 = *(float *)(lVar6 + 0x3c);
            if (fVar26 <= fVar27) {
              fVar26 = fVar26 * fVar24 + 0.0;
            }
            else {
              fVar30 = (*(float *)(lVar6 + 0xa4) + fVar28) - fVar25;
              if (fVar30 - fVar27 <= fVar26) {
                fVar26 = fVar26 + (fVar30 - fVar26) * fVar24;
              }
            }
          }
          fVar24 = fVar26 - fVar24 * (fVar28 - fVar25);
        }
LAB_7ff70c84f94a:
        fVar26 = (float)(longlong)
                        ((float)(-(uint)(0.0 <= fVar24) & (uint)fVar24) + _DAT_7ff70cb1ba70);
      }
      else {
        if (*(char *)(lVar6 + 0xd1) != '\0') {
          fVar28 = fVar22;
          if (fVar26 < _DAT_7ff70cb1c5d8) {
            fVar28 = *(float *)(lVar6 + 0xb0);
            fVar30 = *(float *)(lVar6 + 0xb8);
            if (0.0 < fVar30) {
              if (fVar26 <= fVar30) {
                fVar26 = fVar26 * fVar28 + 0.0;
              }
              else {
                fVar29 = (*(float *)(lVar6 + 0xa0) + *(float *)(lVar6 + 0x38)) - fVar27;
                if (fVar29 - fVar30 <= fVar26) {
                  fVar26 = fVar26 + (fVar29 - fVar26) * fVar28;
                }
              }
            }
            fVar28 = fVar26 - fVar28 * (*(float *)(lVar6 + 0x38) - fVar27);
          }
          auVar19 = ZEXT416((uint)(float)(longlong)
                                         ((float)(-(uint)(0.0 <= fVar28) & (uint)fVar28) +
                                         _DAT_7ff70cb1ba70));
          fVar26 = *(float *)(lVar6 + 0xac);
          if (fVar26 < _DAT_7ff70cb1c5d8) {
            fVar24 = *(float *)(lVar6 + 0xb4);
            fVar27 = *(float *)(lVar6 + 0xbc);
            goto joined_r0x7ff70c84f928;
          }
          goto LAB_7ff70c84f94a;
        }
        fVar24 = fVar22;
        if (fVar26 < _DAT_7ff70cb1c5d8) {
          fVar24 = *(float *)(lVar6 + 0xb0);
          fVar28 = *(float *)(lVar6 + 0xb8);
          if (0.0 < fVar28) {
            if (fVar26 <= fVar28) {
              fVar26 = fVar26 * fVar24 + 0.0;
            }
            else {
              fVar30 = (*(float *)(lVar6 + 0xa0) + *(float *)(lVar6 + 0x38)) - fVar27;
              if (fVar30 - fVar28 <= fVar26) {
                fVar26 = fVar26 + (fVar30 - fVar26) * fVar24;
              }
            }
          }
          fVar24 = fVar26 - fVar24 * (*(float *)(lVar6 + 0x38) - fVar27);
        }
        fVar26 = (float)(longlong)
                        ((float)(-(uint)(0.0 <= fVar24) & (uint)fVar24) + _DAT_7ff70cb1ba70);
        if (*(float *)(lVar6 + 0xa0) <= fVar26) {
          fVar26 = *(float *)(lVar6 + 0xa0);
        }
        auVar19 = ZEXT416((uint)fVar26);
        fVar26 = *(float *)(lVar6 + 0xac);
        fVar24 = fVar23;
        if (fVar26 < _DAT_7ff70cb1c5d8) {
          fVar24 = *(float *)(lVar6 + 0xb4);
          fVar27 = *(float *)(lVar6 + 0xbc);
          if (fVar27 <= 0.0) {
            fVar28 = *(float *)(lVar6 + 0x3c);
          }
          else {
            fVar28 = *(float *)(lVar6 + 0x3c);
            if (fVar26 <= fVar27) {
              fVar26 = fVar26 * fVar24 + 0.0;
            }
            else {
              fVar30 = (*(float *)(lVar6 + 0xa4) + fVar28) - fVar25;
              if (fVar30 - fVar27 <= fVar26) {
                fVar26 = fVar26 + (fVar30 - fVar26) * fVar24;
              }
            }
          }
          fVar24 = fVar26 - fVar24 * (fVar28 - fVar25);
        }
        fVar26 = (float)(longlong)
                        ((float)(-(uint)(0.0 <= fVar24) & (uint)fVar24) + _DAT_7ff70cb1ba70);
        if (*(float *)(lVar6 + 0xa4) <= fVar26) {
          fVar26 = *(float *)(lVar6 + 0xa4);
        }
      }
      auVar19 = insertps(auVar19,ZEXT416((uint)fVar26),0x10);
      fVar22 = fVar22 - auVar19._0_4_;
      fVar23 = fVar23 - auVar19._4_4_;
      fVar26 = 0.0 - auVar19._8_4_;
      fVar24 = 0.0 - auVar19._12_4_;
      auVar19._0_4_ = auVar11._0_4_ + fVar22;
      auVar19._4_4_ = auVar11._4_4_ + fVar23;
      auVar19._8_4_ = auVar11._8_4_ + fVar26;
      auVar19._12_4_ = auVar11._12_4_ + fVar24;
      auVar10._0_4_ = auVar21._0_4_ + fVar22;
      auVar10._4_4_ = auVar21._4_4_ + fVar23;
      auVar10._8_4_ = auVar21._8_4_ + fVar26;
      auVar10._12_4_ = auVar21._12_4_ + fVar24;
      auVar13._0_4_ = auVar14._0_4_ + fVar22;
      auVar13._4_4_ = auVar14._4_4_ + fVar23;
      auVar13._8_4_ = auVar14._8_4_ + fVar26;
      auVar13._12_4_ = auVar14._12_4_ + fVar24;
    }
  }
  else {
    lVar7 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) * 0x10;
    fVar24 = (float)((ulonglong)*(undefined8 *)(lVar6 + 0x128) >> 0x20);
    fVar26 = (float)*(undefined8 *)(lVar6 + 0x128);
    auVar19 = insertps(ZEXT416(*(uint *)(lVar6 + 0x3f8 + lVar7)),
                       *(undefined4 *)(lVar6 + 0x404 + lVar7),0x10);
    auVar10._0_8_ = CONCAT44(auVar19._4_4_ + fVar24,auVar19._0_4_ + fVar26);
    auVar10._8_4_ = auVar19._8_4_ + 0.0;
    auVar10._12_4_ = auVar19._12_4_ + 0.0;
    auVar13 = blendps(ZEXT416((uint)(*(float *)(lVar6 + 0x400 + lVar7) + fVar26)),auVar10,0xe);
    auVar14._8_4_ = auVar10._8_4_;
    auVar14._0_8_ = auVar10._0_8_;
    auVar14._12_4_ = auVar10._12_4_;
    auVar21._4_4_ = fVar24;
    auVar21._0_4_ = fVar24 + *(float *)(lVar6 + 0x3fc + lVar7);
    auVar21._8_8_ = 0;
    auVar19 = insertps(auVar14,auVar21,0x10);
    auVar21 = auVar10;
    auVar14 = auVar13;
    auVar11 = auVar19;
    if (*(int *)(lVar6 + 0x288) != *(int *)(_DAT_7ff70cc1a3c0 + 5000)) goto LAB_7ff70c84f60b;
  }
LAB_7ff70c84fa84:
  auVar15._0_4_ = auVar13._0_4_ - auVar19._0_4_;
  auVar15._4_4_ = auVar13._4_4_ - auVar19._4_4_;
  auVar15._8_4_ = auVar13._8_4_ - auVar19._8_4_;
  auVar15._12_4_ = auVar13._12_4_ - auVar19._12_4_;
  auVar18._0_4_ = (float)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xc8c) * _DAT_7ff70cb1d970;
  auVar18._4_4_ =
       (float)((ulonglong)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xc8c) >> 0x20) * _UNK_7ff70cb1d974;
  auVar18._8_4_ = _UNK_7ff70cb1d978 * 0.0;
  auVar18._12_4_ = _UNK_7ff70cb1d97c * 0.0;
  auVar19 = minps(auVar18,auVar15);
  auVar16._0_4_ = auVar10._0_4_ + auVar19._0_4_;
  auVar16._4_4_ = auVar10._4_4_ + auVar19._4_4_;
  auVar16._8_4_ = auVar10._8_4_ + auVar19._8_4_;
  auVar16._12_4_ = auVar10._12_4_ + auVar19._12_4_;
  auVar11._0_4_ = auVar10._0_4_ - auVar19._0_4_;
  auVar11._4_4_ = auVar10._4_4_ - auVar19._4_4_;
  auVar11._8_4_ = auVar10._8_4_ - auVar19._8_4_;
  auVar11._12_4_ = auVar10._12_4_ - auVar19._12_4_;
  auVar19 = blendps(auVar11,auVar16,0xd);
  uVar1 = *(ulonglong *)(**(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 8);
  auVar17._8_8_ = 0;
  auVar17._0_8_ = uVar1;
  uVar9 = *(undefined8 *)(**(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 0x10);
  auVar20._0_4_ = (float)uVar9 + (float)uVar1;
  fVar26 = (float)(uVar1 >> 0x20);
  auVar20._4_4_ = (float)((ulonglong)uVar9 >> 0x20) + fVar26;
  auVar20._8_8_ = 0;
  auVar21 = minps(auVar20,auVar19);
  auVar12._4_4_ = -(uint)(auVar19._4_4_ < fVar26);
  auVar12._0_4_ = -(uint)(auVar19._0_4_ < (float)uVar1);
  auVar12._8_4_ = -(uint)(auVar19._8_4_ < 0.0);
  auVar12._12_4_ = -(uint)(auVar19._12_4_ < 0.0);
  auVar19 = blendvps(auVar21,auVar17,auVar12);
  uVar9 = CONCAT44((float)(int)auVar19._4_4_,(float)(int)auVar19._0_4_);
LAB_7ff70c84fad2:
  *param_1 = uVar9;
  if (_DAT_7ff70cbebd80 == (uStack_80 ^ (ulonglong)auStack_a8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_80 ^ (ulonglong)auStack_a8);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


