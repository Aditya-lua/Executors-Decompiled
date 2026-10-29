/* 7ff70c871030 FUN_7ff70c871030 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c871030(longlong param_1)

{
  float *pfVar1;
  float fVar2;
  longlong lVar3;
  code *pcVar4;
  longlong lVar5;
  uint uVar6;
  undefined8 uVar7;
  uint uVar8;
  bool bVar9;
  float fVar10;
  float fVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  float fVar15;
  undefined4 uVar16;
  float fVar17;
  undefined4 uVar18;
  undefined4 uVar19;
  float fVar20;
  float fVar21;
  undefined1 auVar22 [16];
  float fVar23;
  float fVar24;
  float fVar26;
  undefined1 auVar25 [16];
  undefined1 auVar27 [16];
  float fVar28;
  undefined1 auVar29 [16];
  float fVar30;
  undefined1 auStack_c8 [40];
  ulonglong uStack_a0;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_a0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  lVar3 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x1fa4) != *(int *)(lVar3 + 0x170)) {
LAB_7ff70c87121b:
    uVar7 = 0;
    goto LAB_7ff70c87121d;
  }
  fVar11 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1e3c);
  uVar16 = 0;
  uVar18 = 0;
  uVar19 = 0;
  fVar15 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1e40);
  fVar20 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1e44);
  fVar17 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1e48);
  uVar12 = 0;
  uVar13 = 0;
  uVar14 = 0;
  fVar21 = *(float *)(_DAT_7ff70cc1a3c0 + 0x2044);
  fVar24 = *(float *)(_DAT_7ff70cc1a3c0 + 0x2048);
  fVar26 = *(float *)(_DAT_7ff70cc1a3c0 + 0x204c);
  pfVar1 = (float *)(_DAT_7ff70cc1a3c0 + 0x2050);
  *(int *)(_DAT_7ff70cc1a3c0 + 0x2064) = *(int *)(_DAT_7ff70cc1a3c0 + 0x2064) + 1;
  if (*(longlong *)(lVar3 + 0x3b0) == *(longlong *)(lVar5 + 0x1f98)) {
    fVar23 = *(float *)(lVar3 + 0x26c);
    if ((((fVar23 <= fVar15) || (fVar28 = *(float *)(lVar3 + 0x264), fVar17 <= fVar28)) ||
        (fVar30 = *(float *)(lVar3 + 0x268), fVar30 <= fVar11)) ||
       (fVar10 = *(float *)(lVar3 + 0x260), fVar20 <= fVar10)) goto LAB_7ff70c87121b;
    fVar2 = fVar23;
    if (fVar15 <= fVar23) {
      fVar2 = fVar15;
    }
    auVar25 = blendvps(ZEXT416((uint)fVar2),ZEXT416((uint)fVar28),ZEXT416(-(uint)(fVar15 < fVar28)))
    ;
    fVar15 = fVar30;
    if (fVar11 <= fVar30) {
      fVar15 = fVar11;
    }
    auVar29 = blendvps(ZEXT416((uint)fVar15),ZEXT416((uint)fVar10),ZEXT416(-(uint)(fVar11 < fVar10))
                      );
    if (fVar17 <= fVar23) {
      fVar23 = fVar17;
    }
    auVar22 = blendvps(ZEXT416((uint)fVar23),ZEXT416((uint)fVar28),ZEXT416(-(uint)(fVar17 < fVar28))
                      );
    if (fVar20 <= fVar30) {
      fVar30 = fVar20;
    }
    fVar20 = fVar30;
    fVar17 = auVar22._0_4_;
    uVar12 = auVar22._4_4_;
    uVar13 = auVar22._8_4_;
    uVar14 = auVar22._12_4_;
    fVar15 = auVar25._0_4_;
    fVar11 = auVar29._0_4_;
    uVar16 = auVar29._4_4_;
    uVar18 = auVar29._8_4_;
    uVar19 = auVar29._12_4_;
    if (fVar20 < fVar21) goto LAB_7ff70c87110a;
LAB_7ff70c8711bb:
    auVar25 = ZEXT816(0);
    if (fVar26 < fVar11) {
      auVar29._4_4_ = uVar16;
      auVar29._0_4_ = fVar11;
      auVar29._8_4_ = uVar18;
      auVar29._12_4_ = uVar19;
      auVar25._4_12_ = auVar29._4_12_;
      auVar25._0_4_ = fVar11 - fVar26;
    }
  }
  else {
    if (fVar21 <= fVar20) goto LAB_7ff70c8711bb;
LAB_7ff70c87110a:
    auVar25 = ZEXT416((uint)(fVar20 - fVar21));
  }
  fVar28 = *pfVar1 - fVar24;
  fVar30 = fVar28 * _DAT_7ff70cb1c5dc + fVar24;
  fVar23 = (fVar17 - fVar15) * _DAT_7ff70cb1d86c + fVar15;
  if (fVar30 <= fVar23) {
    fVar28 = fVar28 * _DAT_7ff70cb1d86c + fVar24;
    fVar23 = (fVar17 - fVar15) * _DAT_7ff70cb1c5dc + fVar15;
    if (fVar28 < fVar23) {
      fVar23 = fVar23 - fVar28;
      goto LAB_7ff70c8712a0;
    }
    fVar23 = 0.0;
    uVar16 = 0;
    uVar18 = 0;
    uVar19 = 0;
    bVar9 = false;
  }
  else {
    fVar23 = fVar23 - fVar30;
LAB_7ff70c8712a0:
    bVar9 = fVar23 != 0.0;
    fVar28 = auVar25._0_4_;
    uVar16 = uVar12;
    uVar18 = uVar13;
    uVar19 = uVar14;
    if (((fVar28 != 0.0) || (NAN(fVar28))) && ((fVar23 != 0.0 || (NAN(fVar23))))) {
      auVar25._0_4_ =
           fVar28 / _DAT_7ff70cb1d8f0 +
           *(float *)(&UNK_7ff70cb1d8f8 + (ulonglong)(0.0 < fVar28) * 4);
      bVar9 = true;
    }
  }
  fVar20 = (fVar20 + fVar11) - (fVar21 + fVar26);
  fVar11 = (fVar17 + fVar15) - (fVar24 + *pfVar1);
  fVar21 = auVar25._0_4_;
  auVar25 = insertps(auVar25,ZEXT416((uint)fVar20),0x10);
  fVar24 = (float)(auVar25._0_4_ & _DAT_7ff70cb1bac0);
  fVar26 = (float)(auVar25._4_4_ & _UNK_7ff70cb1bac4);
  auVar27._4_4_ = uVar16;
  auVar27._0_4_ = fVar23;
  auVar27._8_4_ = uVar18;
  auVar27._12_4_ = uVar19;
  auVar22._4_4_ = uVar12;
  auVar22._0_4_ = fVar11;
  auVar22._8_4_ = uVar13;
  auVar22._12_4_ = uVar14;
  auVar25 = insertps(auVar27,auVar22,0x10);
  fVar28 = (float)(auVar25._0_4_ & _DAT_7ff70cb1bac0);
  fVar30 = (float)(auVar25._4_4_ & _UNK_7ff70cb1bac4);
  fVar15 = fVar28 + fVar24;
  fVar17 = fVar30 + fVar26;
  if (bVar9) {
LAB_7ff70c87137b:
    uVar6 = (uint)(0.0 < fVar21);
    if (fVar24 <= fVar28) {
      uVar6 = 0.0 < fVar23 | 2;
    }
    uVar8 = *(uint *)(lVar5 + 0x2038);
    fVar24 = *(float *)(param_1 + 0x24);
    fVar10 = fVar15;
    fVar11 = fVar23;
    fVar20 = fVar21;
    if (uVar6 != uVar8) goto LAB_7ff70c87143e;
LAB_7ff70c8713f7:
    if (fVar24 <= fVar15) {
      if ((fVar15 != fVar24) || (NAN(fVar15) || NAN(fVar24))) goto LAB_7ff70c87143e;
      fVar15 = *(float *)(param_1 + 0x28);
      if (fVar15 <= fVar17) {
        if ((fVar17 == fVar15) && (!NAN(fVar17) && !NAN(fVar15))) {
          if (uVar6 < 2) {
            fVar23 = fVar21;
          }
          if (fVar23 < 0.0) goto LAB_7ff70c87143a;
        }
        goto LAB_7ff70c87143e;
      }
      *(float *)(param_1 + 0x28) = fVar17;
LAB_7ff70c87143a:
      uVar7 = 1;
      goto LAB_7ff70c871440;
    }
    *(ulonglong *)(param_1 + 0x24) = CONCAT44(fVar17,fVar15);
  }
  else {
    fVar10 = 0.0;
    if ((fVar21 != 0.0) || (NAN(fVar21))) goto LAB_7ff70c87137b;
    if ((((fVar20 != 0.0) || (NAN(fVar20))) || (fVar11 != 0.0)) || (NAN(fVar11))) {
      uVar6 = 0.0 < fVar11 | 2;
      if (fVar30 < fVar26) {
        uVar6 = (uint)(0.0 < fVar20);
      }
      uVar8 = *(uint *)(lVar5 + 0x2038);
      fVar24 = *(float *)(param_1 + 0x24);
      fVar10 = fVar17;
      if (uVar6 != uVar8) goto LAB_7ff70c87143e;
      goto LAB_7ff70c8713f7;
    }
    bVar9 = *(uint *)(lVar5 + 0x1f94) <= *(uint *)(lVar5 + 0x1e20);
    uVar6 = (uint)bVar9;
    fVar20 = 0.0;
    fVar11 = 0.0;
    uVar8 = *(uint *)(lVar5 + 0x2038);
    fVar24 = *(float *)(param_1 + 0x24);
    if (bVar9 == uVar8) goto LAB_7ff70c8713f7;
LAB_7ff70c87143e:
    uVar7 = 0;
LAB_7ff70c871440:
    if (((((fVar24 != _DAT_7ff70cb1c5d8) || (NAN(fVar24) || NAN(_DAT_7ff70cb1c5d8))) ||
         (*(float *)(param_1 + 0x2c) <= fVar10)) ||
        ((*(int *)(lVar5 + 0x1fa4) != 1 ||
         ((*(byte *)(*(longlong *)(lVar5 + 0x1f98) + 0x17) & 0x10) != 0)))) ||
       (((((uVar8 != 0 || (0.0 <= fVar20)) && ((uVar8 != 1 || (fVar20 <= 0.0)))) &&
         ((uVar8 != 2 || (0.0 <= fVar11)))) && ((uVar8 != 3 || (fVar11 <= 0.0))))))
    goto LAB_7ff70c87121d;
    *(float *)(param_1 + 0x2c) = fVar10;
  }
  uVar7 = 1;
LAB_7ff70c87121d:
  if (_DAT_7ff70cbebd80 != (uStack_a0 ^ (ulonglong)auStack_c8)) {
    FUN_7ff70caa97e0(uStack_a0 ^ (ulonglong)auStack_c8);
    pcVar4 = (code *)swi(3);
    uVar7 = (*pcVar4)();
    return uVar7;
  }
  return uVar7;
}


