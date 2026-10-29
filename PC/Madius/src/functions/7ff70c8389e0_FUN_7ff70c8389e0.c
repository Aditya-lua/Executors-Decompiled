/* 7ff70c8389e0 FUN_7ff70c8389e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c8389e0(undefined8 *param_1,longlong param_2)

{
  uint uVar1;
  float fVar2;
  float fVar3;
  ulonglong uVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  longlong lVar14;
  uint uVar15;
  undefined8 *puVar16;
  char cVar17;
  code *pcVar18;
  byte bVar19;
  byte bVar20;
  float fVar21;
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  float fVar29;
  undefined1 auVar30 [16];
  float fVar31;
  undefined1 auVar32 [12];
  undefined1 auVar33 [16];
  undefined4 uVar35;
  undefined1 auVar34 [16];
  float fVar36;
  float fVar37;
  float fVar38;
  float fVar39;
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auStack_c8 [40];
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined4 uStack_88;
  undefined4 uStack_84;
  ulonglong uStack_80;
  
  lVar14 = _DAT_7ff70cc1a3c0;
  uStack_80 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  if ((((*(char *)(param_2 + 0xcf) == '\x01') && (*(char *)(param_2 + 0xe4) < '\x01')) &&
      (*(char *)(param_2 + 0xe5) < '\x01')) ||
     (((*(char *)(param_2 + 0xd4) == '\x01' && (*(char *)(param_2 + 0xed) == '\0')) &&
      ('\0' < *(char *)(param_2 + 0xec))))) {
    auVar33._8_8_ = 0;
    auVar33._0_8_ = *(ulonglong *)(param_2 + 0x48);
  }
  else {
    uVar4 = *(ulonglong *)(param_2 + 0x50);
    auVar25._8_8_ = 0;
    auVar25._0_8_ = uVar4;
    if (((float)uVar4 != 0.0) || (NAN((float)uVar4))) {
      auVar32._8_4_ = 0;
      auVar32._0_8_ = uVar4;
    }
    else {
      auVar33 = blendvps(ZEXT416((uint)*(float *)(param_2 + 0x138)),
                         ZEXT416((uint)*(float *)(param_2 + 0x130)),
                         ZEXT416(-(uint)(*(float *)(param_2 + 0x138) <= *(float *)(param_2 + 0x130))
                                ));
      auVar32._4_8_ = 0;
      auVar32._0_4_ = (float)(longlong)(auVar33._0_4_ - *(float *)(param_2 + 0x128));
    }
    auVar40._12_4_ = 0;
    auVar40._0_12_ = auVar32;
    auVar33 = blendps(auVar40,auVar25,0xe);
    if ((float)(uVar4 >> 0x20) == 0.0) {
      auVar25 = blendvps(ZEXT416((uint)*(float *)(param_2 + 0x13c)),
                         ZEXT416((uint)*(float *)(param_2 + 0x134)),
                         ZEXT416(-(uint)(*(float *)(param_2 + 0x13c) <= *(float *)(param_2 + 0x134))
                                ));
      auVar33 = insertps(auVar33,ZEXT416((uint)(float)(longlong)
                                                      (auVar25._0_4_ - *(float *)(param_2 + 300))),
                         0x10);
    }
  }
  fVar36 = ((float)*(undefined8 *)(param_2 + 0x78) + (float)*(undefined8 *)(param_2 + 0x70)) -
           (float)*(undefined8 *)(param_2 + 0xc0);
  fVar37 = ((float)((ulonglong)*(undefined8 *)(param_2 + 0x78) >> 0x20) +
           (float)((ulonglong)*(undefined8 *)(param_2 + 0x70) >> 0x20)) -
           (float)((ulonglong)*(undefined8 *)(param_2 + 0xc0) >> 0x20);
  fVar38 = (float)*(undefined8 *)(param_2 + 0x58);
  fVar39 = (float)((ulonglong)*(undefined8 *)(param_2 + 0x58) >> 0x20);
  fVar38 = fVar38 + fVar38;
  fVar39 = fVar39 + fVar39;
  auVar27._0_4_ = auVar33._0_4_ + fVar38 + fVar36;
  auVar27._4_4_ = auVar33._4_4_ + fVar39 + fVar37;
  auVar27._8_4_ = auVar33._8_4_ + 0.0 + 0.0;
  auVar27._12_4_ = auVar33._12_4_ + 0.0 + 0.0;
  uVar15 = *(uint *)(param_2 + 0x14);
  if ((uVar15 & 0x5000000) == 0x1000000) {
    auVar28 = _DAT_7ff70cb1d4f0;
    if ((uVar15 & 0x2000000) == 0) {
      auVar40 = ZEXT416(_DAT_7ff70cb1bae4);
      uVar1 = _DAT_7ff70cb1bae4;
      if ((*(uint *)(param_2 + 0x18) & 4) != 0) {
        uVar1 = *(uint *)(_DAT_7ff70cc1a3c0 + 0xc68);
      }
      auVar25 = ZEXT416(uVar1);
      if ((*(uint *)(param_2 + 0x18) & 8) != 0) {
LAB_7ff70c838bb5:
        auVar40 = ZEXT416(*(uint *)(_DAT_7ff70cc1a3c0 + 0xc6c));
      }
      goto LAB_7ff70c838c1c;
    }
LAB_7ff70c838bc6:
    auVar24 = minps(auVar27,auVar28);
    if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e70) & 0x10) == 0) goto LAB_7ff70c838bd6;
LAB_7ff70c838efc:
    fVar36 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1eb4);
    fVar37 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1eb8);
    fVar38 = auVar24._4_4_;
    uVar35 = auVar24._12_4_;
    if ((fVar36 < 0.0) || (fVar39 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1ebc), fVar39 < 0.0)) {
      auVar33 = ZEXT416(*(uint *)(param_2 + 0x38));
      if (0.0 <= fVar37) goto LAB_7ff70c838f49;
LAB_7ff70c838f7c:
      auVar25 = ZEXT416(*(uint *)(param_2 + 0x3c));
      pcVar18 = *(code **)(_DAT_7ff70cc1a3c0 + 0x1ec8);
      if (pcVar18 != (code *)0x0) goto LAB_7ff70c838f8d;
LAB_7ff70c838f74:
      auVar26 = insertps(auVar33,auVar25,0x10);
    }
    else {
      fVar29 = auVar24._0_4_;
      if (fVar29 <= fVar39) {
        fVar39 = fVar29;
      }
      auVar9._4_4_ = fVar38;
      auVar9._0_4_ = -(uint)(fVar29 < fVar36);
      auVar9._8_4_ = auVar24._8_4_;
      auVar9._12_4_ = uVar35;
      auVar33 = blendvps(ZEXT416((uint)fVar39),ZEXT416((uint)fVar36),auVar9);
      if (fVar37 < 0.0) goto LAB_7ff70c838f7c;
LAB_7ff70c838f49:
      fVar36 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1ec0);
      if (fVar36 < 0.0) goto LAB_7ff70c838f7c;
      if (fVar38 <= fVar36) {
        fVar36 = fVar38;
      }
      auVar11._4_4_ = fVar38;
      auVar11._0_4_ = -(uint)(fVar38 < fVar37);
      auVar11._8_4_ = uVar35;
      auVar11._12_4_ = uVar35;
      auVar25 = blendvps(ZEXT416((uint)fVar36),ZEXT416((uint)fVar37),auVar11);
      pcVar18 = *(code **)(_DAT_7ff70cc1a3c0 + 0x1ec8);
      if (pcVar18 == (code *)0x0) goto LAB_7ff70c838f74;
LAB_7ff70c838f8d:
      uStack_a0 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1ed0);
      uStack_98 = *(undefined8 *)(param_2 + 0x28);
      uStack_90 = *(undefined8 *)(param_2 + 0x38);
      uStack_88 = auVar33._0_4_;
      uStack_84 = auVar25._0_4_;
      (*pcVar18)(&uStack_a0);
      auVar26._4_4_ = uStack_84;
      auVar26._0_4_ = uStack_88;
      auVar26._8_8_ = 0;
      uVar15 = *(uint *)(param_2 + 0x14);
    }
    auVar24._0_4_ = (float)(int)auVar26._0_4_;
    auVar24._4_4_ = (float)(int)auVar26._4_4_;
    auVar24._8_4_ = (float)(int)auVar26._8_4_;
    auVar24._12_4_ = (float)(int)auVar26._12_4_;
    if ((uVar15 & 0x5000000) != 0x1000000) goto LAB_7ff70c838fe9;
LAB_7ff70c838bea:
    auVar33 = ZEXT416(_DAT_7ff70cb1bae4);
    uVar15 = _DAT_7ff70cb1bae4;
    if ((*(uint *)(param_2 + 0x18) & 4) != 0) {
      uVar15 = *(uint *)(_DAT_7ff70cc1a3c0 + 0xc68);
    }
    auVar25 = ZEXT416(uVar15);
    if ((*(uint *)(param_2 + 0x18) & 8) == 0) goto LAB_7ff70c83900a;
  }
  else {
    fVar29 = (float)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd3c);
    fVar21 = (float)((ulonglong)*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0xd3c) >> 0x20);
    uVar5 = *(undefined8 *)(**(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88) + 0x28);
    auVar28._0_4_ = (float)uVar5 - (fVar29 + fVar29);
    auVar28._4_4_ = (float)((ulonglong)uVar5 >> 0x20) - (fVar21 + fVar21);
    auVar28._8_8_ = 0;
    if ((uVar15 & 0x2000000) != 0) goto LAB_7ff70c838bc6;
    if ((uVar15 & 0x40) == 0) {
      auVar25 = ZEXT416(*(uint *)(_DAT_7ff70cc1a3c0 + 0xc68));
      goto LAB_7ff70c838bb5;
    }
    auVar25 = ZEXT416(_DAT_7ff70cb1bae4);
    auVar40 = ZEXT416(_DAT_7ff70cb1bae4);
LAB_7ff70c838c1c:
    fVar29 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc5c) + _DAT_7ff70cb1bae8;
    fVar29 = (float)(~-(uint)(fVar29 <= 0.0) & (uint)fVar29) +
             *(float *)(param_2 + 0x68) + *(float *)(param_2 + 0x6c);
    auVar40 = blendvps(ZEXT416((uint)fVar29),auVar40,ZEXT416(-(uint)(fVar29 <= auVar40._0_4_)));
    auVar25 = insertps(auVar25,auVar40,0x10);
    auVar25 = minps(auVar25,auVar28);
    auVar40 = minps(auVar28,auVar27);
    auVar6._4_4_ = -(uint)(auVar27._4_4_ < auVar25._4_4_);
    auVar6._0_4_ = -(uint)(auVar27._0_4_ < auVar25._0_4_);
    auVar6._8_4_ = -(uint)(auVar27._8_4_ < auVar25._8_4_);
    auVar6._12_4_ = -(uint)(auVar27._12_4_ < auVar25._12_4_);
    auVar25 = blendvps(auVar40,auVar25,auVar6);
    if ((*(uint *)(param_2 + 0x18) & 0x2c) == 4) {
      auVar25 = insertps(auVar25,*(undefined4 *)(param_2 + 0x3c),0x10);
    }
    else if ((*(uint *)(param_2 + 0x18) & 0x1c) == 8) {
      auVar25 = blendps(auVar25,ZEXT416(*(uint *)(param_2 + 0x38)),1);
    }
    fVar21 = auVar25._4_4_;
    auVar41._4_4_ = fVar21;
    auVar41._0_4_ = fVar21;
    uVar35 = auVar25._12_4_;
    auVar41._8_4_ = uVar35;
    auVar41._12_4_ = uVar35;
    fVar29 = auVar25._0_4_;
    if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e70) & 0x10) == 0) {
      auVar23 = auVar25;
      if ((uVar15 & 0x5000000) != 0x1000000) goto LAB_7ff70c838cc5;
LAB_7ff70c838dcb:
      auVar40 = ZEXT416(_DAT_7ff70cb1bae4);
      uVar1 = _DAT_7ff70cb1bae4;
      if ((*(uint *)(param_2 + 0x18) & 4) != 0) {
        uVar1 = *(uint *)(_DAT_7ff70cc1a3c0 + 0xc68);
      }
      auVar27 = ZEXT416(uVar1);
      if ((*(uint *)(param_2 + 0x18) & 8) != 0) goto LAB_7ff70c838deb;
    }
    else {
      fVar31 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1eb4);
      fVar2 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1eb8);
      if ((fVar31 < 0.0) || (fVar3 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1ebc), fVar3 < 0.0)) {
        auVar40 = ZEXT416(*(uint *)(param_2 + 0x38));
        if (0.0 <= fVar2) goto LAB_7ff70c838d27;
LAB_7ff70c838d5e:
        auVar27 = ZEXT416(*(uint *)(param_2 + 0x3c));
        pcVar18 = *(code **)(_DAT_7ff70cc1a3c0 + 0x1ec8);
        if (pcVar18 != (code *)0x0) goto LAB_7ff70c838d6f;
LAB_7ff70c838d53:
        auVar22 = insertps(auVar40,auVar27,0x10);
      }
      else {
        if (fVar29 <= fVar3) {
          fVar3 = fVar29;
        }
        auVar12._4_4_ = fVar21;
        auVar12._0_4_ = -(uint)(fVar29 < fVar31);
        auVar12._8_4_ = auVar25._8_4_;
        auVar12._12_4_ = uVar35;
        auVar40 = blendvps(ZEXT416((uint)fVar3),ZEXT416((uint)fVar31),auVar12);
        if (fVar2 < 0.0) goto LAB_7ff70c838d5e;
LAB_7ff70c838d27:
        fVar31 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1ec0);
        if (fVar31 < 0.0) goto LAB_7ff70c838d5e;
        if (fVar21 <= fVar31) {
          fVar31 = fVar21;
        }
        auVar13._4_4_ = fVar21;
        auVar13._0_4_ = -(uint)(fVar21 < fVar2);
        auVar13._8_4_ = uVar35;
        auVar13._12_4_ = uVar35;
        auVar27 = blendvps(ZEXT416((uint)fVar31),ZEXT416((uint)fVar2),auVar13);
        pcVar18 = *(code **)(_DAT_7ff70cc1a3c0 + 0x1ec8);
        if (pcVar18 == (code *)0x0) goto LAB_7ff70c838d53;
LAB_7ff70c838d6f:
        uStack_a0 = *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1ed0);
        uStack_98 = *(undefined8 *)(param_2 + 0x28);
        uStack_90 = *(undefined8 *)(param_2 + 0x38);
        uStack_88 = auVar40._0_4_;
        uStack_84 = auVar27._0_4_;
        (*pcVar18)(&uStack_a0);
        auVar22._4_4_ = uStack_84;
        auVar22._0_4_ = uStack_88;
        auVar22._8_8_ = 0;
        uVar15 = *(uint *)(param_2 + 0x14);
      }
      auVar23._0_4_ = (float)(int)auVar22._0_4_;
      auVar23._4_4_ = (float)(int)auVar22._4_4_;
      auVar23._8_4_ = (float)(int)auVar22._8_4_;
      auVar23._12_4_ = (float)(int)auVar22._12_4_;
      if ((uVar15 & 0x5000000) == 0x1000000) goto LAB_7ff70c838dcb;
LAB_7ff70c838cc5:
      if ((uVar15 & 0x40) == 0) {
        auVar27 = ZEXT416(*(uint *)(_DAT_7ff70cc1a3c0 + 0xc68));
LAB_7ff70c838deb:
        auVar40 = ZEXT416(*(uint *)(_DAT_7ff70cc1a3c0 + 0xc6c));
      }
      else {
        auVar27 = ZEXT416(_DAT_7ff70cb1bae4);
        auVar40 = ZEXT416(_DAT_7ff70cb1bae4);
      }
    }
    fVar31 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc5c) + _DAT_7ff70cb1bae8;
    fVar31 = (float)(~-(uint)(fVar31 <= 0.0) & (uint)fVar31) +
             *(float *)(param_2 + 0x68) + *(float *)(param_2 + 0x6c);
    auVar40 = blendvps(ZEXT416((uint)fVar31),auVar40,ZEXT416(-(uint)(fVar31 <= auVar40._0_4_)));
    fVar31 = auVar23._4_4_;
    auVar30._4_4_ = fVar31;
    auVar30._0_4_ = fVar31;
    auVar30._8_4_ = auVar23._12_4_;
    auVar30._12_4_ = auVar23._12_4_;
    auVar7._4_4_ = auVar40._4_4_;
    auVar7._0_4_ = -(uint)(auVar40._0_4_ <= fVar31);
    auVar7._8_4_ = auVar40._8_4_;
    auVar7._12_4_ = auVar40._12_4_;
    auVar28 = blendvps(auVar40,auVar30,auVar7);
    auVar8._4_4_ = 0;
    auVar8._0_4_ = -(uint)(auVar27._0_4_ <= auVar23._0_4_);
    auVar8._8_4_ = auVar27._8_4_;
    auVar8._12_4_ = auVar27._12_4_;
    auVar40 = blendvps(auVar27,auVar23,auVar8);
    if (((uVar15 & 0x808) != 0x800) ||
       (cVar17 = '\x01', auVar33._0_4_ <= (auVar40._0_4_ - fVar38) - fVar36)) {
      cVar17 = (char)((uVar15 & 0xffff) >> 0xf);
    }
    if ((uVar15 & 8) == 0) {
      bVar19 = 1;
      if (auVar33._4_4_ <= (auVar28._0_4_ - fVar39) - fVar37) goto LAB_7ff70c838ec0;
      bVar20 = 1;
      if (cVar17 != '\0') goto LAB_7ff70c838ea6;
LAB_7ff70c838ecf:
      auVar24 = insertps(auVar25,auVar41,0x10);
    }
    else {
LAB_7ff70c838ec0:
      bVar19 = (byte)(uVar15 >> 0xe) & 1;
      bVar20 = bVar19;
      if (cVar17 == '\0') goto LAB_7ff70c838ecf;
LAB_7ff70c838ea6:
      auVar42._4_12_ = auVar41._4_12_;
      auVar42._0_4_ = fVar21 + *(float *)(lVar14 + 0xcc4);
      auVar24 = insertps(auVar25,auVar42,0x10);
      bVar20 = bVar19;
    }
    if (bVar20 != 0) {
      auVar34._4_12_ = auVar25._4_12_;
      auVar34._0_4_ = fVar29 + *(float *)(lVar14 + 0xcc4);
      auVar24 = blendps(auVar24,auVar34,1);
    }
    if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e70) & 0x10) != 0) goto LAB_7ff70c838efc;
LAB_7ff70c838bd6:
    if ((uVar15 & 0x5000000) == 0x1000000) goto LAB_7ff70c838bea;
LAB_7ff70c838fe9:
    if ((uVar15 & 0x40) != 0) {
      auVar25 = ZEXT416(_DAT_7ff70cb1bae4);
      auVar33 = ZEXT416(_DAT_7ff70cb1bae4);
      goto LAB_7ff70c83900a;
    }
    auVar25 = ZEXT416(*(uint *)(_DAT_7ff70cc1a3c0 + 0xc68));
  }
  auVar33 = ZEXT416(*(uint *)(_DAT_7ff70cc1a3c0 + 0xc6c));
LAB_7ff70c83900a:
  fVar36 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc5c) + _DAT_7ff70cb1bae8;
  fVar36 = (float)(~-(uint)(fVar36 <= 0.0) & (uint)fVar36) +
           *(float *)(param_2 + 0x68) + *(float *)(param_2 + 0x6c);
  auVar33 = blendvps(ZEXT416((uint)fVar36),auVar33,ZEXT416(-(uint)(fVar36 <= auVar33._0_4_)));
  auVar33 = insertps(auVar25,auVar33,0x10);
  auVar10._4_4_ = -(uint)(auVar33._4_4_ <= auVar24._4_4_);
  auVar10._0_4_ = -(uint)(auVar33._0_4_ <= auVar24._0_4_);
  auVar10._8_4_ = -(uint)(auVar33._8_4_ <= auVar24._8_4_);
  auVar10._12_4_ = -(uint)(auVar33._12_4_ <= auVar24._12_4_);
  auVar33 = blendvps(auVar33,auVar24,auVar10);
  *param_1 = auVar33._0_8_;
  if (_DAT_7ff70cbebd80 == (uStack_80 ^ (ulonglong)auStack_c8)) {
    return param_1;
  }
  FUN_7ff70caa97e0(uStack_80 ^ (ulonglong)auStack_c8);
  pcVar18 = (code *)swi(3);
  puVar16 = (undefined8 *)(*pcVar18)();
  return puVar16;
}


