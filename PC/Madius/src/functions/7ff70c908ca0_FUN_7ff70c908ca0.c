/* 7ff70c908ca0 FUN_7ff70c908ca0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c908ca0(longlong param_1)

{
  undefined8 *puVar1;
  float fVar2;
  float fVar3;
  undefined1 uVar4;
  short sVar5;
  short sVar6;
  longlong lVar7;
  code *pcVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined1 auVar11 [12];
  longlong lVar12;
  longlong lVar13;
  int iVar14;
  int iVar15;
  undefined4 *puVar16;
  longlong lVar17;
  int iVar18;
  undefined4 *puVar19;
  int iVar20;
  longlong lVar21;
  float fVar22;
  float fVar23;
  undefined8 uVar24;
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auStack_d8 [32];
  undefined4 uStack_b8;
  undefined4 uStack_b0;
  int iStack_a0;
  int iStack_9c;
  longlong lStack_98;
  undefined4 uStack_90;
  float fStack_8c;
  undefined1 auStack_88 [8];
  undefined8 uStack_80;
  ulonglong uStack_70;
  
  lVar13 = _DAT_7ff70cc1a3c0;
  uStack_70 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_d8;
  lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if ((longlong)*(int *)(param_1 + 0x74) != -1) {
    lVar17 = (longlong)*(int *)(param_1 + 0x74) * 0x74 + *(longlong *)(param_1 + 0x18);
    lVar21 = *(longlong *)(param_1 + 0x188);
    if (*(char *)(lVar21 + 0x159) == '\x01') {
      FUN_7ff70c83b0d0();
    }
    lVar12 = 0x4c;
    if ((*(byte *)(param_1 + 0x94) & 1) == 0) {
      lVar12 = (ulonglong)*(byte *)(param_1 + 0x243) * 4 + 0x44;
    }
    auVar25 = blendvps(ZEXT416((uint)*(float *)(lVar21 + 0x130)),
                       ZEXT416((uint)*(float *)(lVar17 + lVar12)),
                       ZEXT416(-(uint)(*(float *)(lVar21 + 0x130) <= *(float *)(lVar17 + lVar12))));
    *(int *)(lVar17 + lVar12) = auVar25._0_4_;
    if (*(char *)(lVar17 + 0x66) == '\x01') {
      fVar23 = *(float *)(lVar21 + 0x134) + *(float *)(param_1 + 0x88);
      auVar25 = blendvps(ZEXT416((uint)fVar23),ZEXT416((uint)*(float *)(param_1 + 0x80)),
                         ZEXT416(-(uint)(fVar23 <= *(float *)(param_1 + 0x80))));
      *(int *)(param_1 + 0x80) = auVar25._0_4_;
    }
    *(undefined4 *)(lVar17 + 0x40) = *(undefined4 *)(lVar21 + 0x1e8);
    auVar25 = blendvps(ZEXT416((uint)*(float *)(lVar21 + 0x154)),
                       ZEXT416((uint)*(float *)(param_1 + 0x8c)),
                       ZEXT416(-(uint)(*(float *)(lVar21 + 0x154) <= *(float *)(param_1 + 0x8c))));
    *(int *)(param_1 + 0x8c) = auVar25._0_4_;
    *(undefined4 *)(param_1 + 0x74) = 0xffffffff;
  }
  if (*(char *)(lVar13 + 0x2720) == '\x01') {
    FUN_7ff70c80c840(0,&UNK_7ff70cb7fb7f,0);
  }
  fVar23 = *(float *)(param_1 + 0x80);
  *(float *)(lVar7 + 0x11c) = fVar23;
  if ((longlong)*(short *)(param_1 + 0x78) == 0) {
    lVar21 = param_1 + 0x1a8;
  }
  else {
    lVar21 = *(longlong *)(param_1 + 0x1c8) + (longlong)*(short *)(param_1 + 0x78) * 0x18 + -0x18;
  }
  iVar20 = *(int *)(param_1 + 0x70);
  fVar2 = *(float *)(param_1 + 0x7c);
  iVar18 = (int)*(short *)(param_1 + 0x228);
  sVar5 = *(short *)(param_1 + 0x226);
  if (((*(uint *)(param_1 + 0x94) & 1) != 0) &&
     (iVar20 == 0 || (*(uint *)(param_1 + 0x94) & 0x10000) != 0)) {
    *(float *)(lVar21 + 8) = (fVar23 - fVar2) + *(float *)(lVar21 + 8);
  }
  iVar20 = iVar20 + 1;
  if ((*(float *)(param_1 + 0x124) <= fVar23) && (fVar2 <= *(float *)(param_1 + 300))) {
    if ((*(short *)(param_1 + 0x20a) != -1) &&
       (((fVar22 = *(float *)(lVar13 + 0xe4), fVar2 <= fVar22 && (fVar22 < fVar23)) &&
        (*(int *)(lVar21 + 0x14) < 0)))) {
      *(undefined4 *)(lVar21 + 0x14) = *(undefined4 *)(param_1 + 0x70);
    }
    iVar15 = *(int *)(param_1 + 0x9c);
    if ((iVar15 == 0x1000000) && (iVar15 = 0, (*(byte *)(param_1 + 4) & 0x40) != 0)) {
      iVar15 = FUN_7ff70c80a070(*(uint *)(param_1 + 0x98) & 1 | 0x30);
    }
    iVar14 = *(int *)(param_1 + 0xa0);
    iStack_a0 = 0;
    if (iVar14 == 0x1000000) {
      iVar14 = 0;
    }
    if ((0 < *(int *)(param_1 + 0x70)) && ((*(byte *)(param_1 + 4) & 0x80) != 0)) {
      iStack_a0 = *(int *)(param_1 + 0xa4 + (ulonglong)((*(byte *)(param_1 + 0x96) & 1) == 0) * 4);
    }
    sVar6 = *(short *)(param_1 + 0x22e);
    iStack_9c = iVar18;
    lStack_98 = lVar21;
    if ((-1 < sVar6 || iVar20 == iVar18) || (iStack_a0 != 0 || (iVar14 != 0 || iVar15 != 0))) {
      if ((*(byte *)(param_1 + 6) & 0x10) == 0) {
        lVar13 = *(longlong *)(lVar7 + 0x2c8);
        uVar24 = *(undefined8 *)(param_1 + 0x148);
        *(undefined8 *)(lVar13 + 0x60) = *(undefined8 *)(param_1 + 0x140);
        *(undefined8 *)(lVar13 + 0x68) = uVar24;
      }
      FUN_7ff70c7c6750(*(undefined8 *)(param_1 + 0x1a0),*(undefined8 *)(lVar7 + 0x2c8),0);
    }
    if (iVar14 != 0 || iVar15 != 0) {
      auVar25 = insertps(ZEXT416(*(uint *)(param_1 + 0x110)),ZEXT416((uint)fVar2),0x10);
      auVar27 = insertps(auVar25,*(undefined4 *)(param_1 + 0x118),0x20);
      auVar25 = *(undefined1 (*) [16])(param_1 + 0x130);
      auVar28 = insertps(auVar27,ZEXT416((uint)fVar23),0x30);
      auVar29._4_4_ = -(uint)(auVar25._4_4_ <= auVar28._4_4_);
      auVar29._0_4_ = -(uint)(auVar25._0_4_ <= auVar28._0_4_);
      auVar29._8_4_ = -(uint)(auVar25._8_4_ <= auVar28._8_4_);
      auVar29._12_4_ = -(uint)(auVar25._12_4_ <= auVar28._12_4_);
      auVar27._4_4_ = -(uint)(auVar28._4_4_ < auVar25._4_4_);
      auVar27._0_4_ = -(uint)(auVar28._0_4_ < auVar25._0_4_);
      auVar27._8_4_ = -(uint)(auVar28._8_4_ < auVar25._8_4_);
      auVar27._12_4_ = -(uint)(auVar28._12_4_ < auVar25._12_4_);
      auVar27 = blendps(auVar27,auVar29,3);
      _auStack_88 = blendvps(auVar25,auVar28,auVar27);
      if ((iVar15 != 0) && (auStack_88._4_4_ < auStack_88._12_4_)) {
        uStack_b0 = 0;
        uStack_b8 = 0;
        FUN_7ff70c7bd960(*(undefined8 *)(lVar7 + 0x2c8),auStack_88,auStack_88 + 8,iVar15);
      }
      if ((iVar14 != 0) && ((float)auStack_88._4_4_ < uStack_80._4_4_)) {
        uStack_b0 = 0;
        uStack_b8 = 0;
        FUN_7ff70c7bd960(*(undefined8 *)(lVar7 + 0x2c8),auStack_88,auStack_88 + 8,iVar14);
      }
    }
    if ((-1 < sVar6) && (-1 < (longlong)*(short *)(param_1 + 0x22e))) {
      puVar16 = *(undefined4 **)(param_1 + 0x38);
      puVar19 = puVar16 + (longlong)*(short *)(param_1 + 0x22e) * 2;
      do {
        lVar13 = *(longlong *)(param_1 + 0x18);
        lVar21 = (longlong)*(short *)(puVar16 + 1) * 0x74;
        fVar22 = *(float *)(lVar13 + 8 + lVar21);
        fVar3 = *(float *)(lVar13 + 0xc + lVar21);
        auVar25 = blendvps(ZEXT416((uint)*(float *)(param_1 + 0x110)),ZEXT416((uint)fVar22),
                           ZEXT416(-(uint)(*(float *)(param_1 + 0x110) <= fVar22)));
        if (*(float *)(param_1 + 0x118) <= fVar3) {
          fVar3 = *(float *)(param_1 + 0x118);
        }
        auVar28 = blendvps(ZEXT416((uint)*(float *)(param_1 + 0x134)),
                           ZEXT416((uint)*(float *)(param_1 + 0x7c)),
                           ZEXT416(-(uint)(*(float *)(param_1 + 0x134) <= *(float *)(param_1 + 0x7c)
                                          )));
        auVar29 = blendvps(ZEXT416((uint)*(float *)(param_1 + 0x130)),auVar25,
                           ZEXT416(-(uint)(*(float *)(param_1 + 0x130) <= auVar25._0_4_)));
        auVar27 = insertps(ZEXT416((uint)fVar3),*(undefined4 *)(param_1 + 0x80),0x10);
        auVar11._4_8_ = uStack_80;
        auVar11._0_4_ = auVar28._0_4_;
        auStack_88 = (undefined1  [8])(auVar11._0_8_ << 0x20);
        auVar25._8_8_ = 0;
        auVar25._0_8_ = *(ulonglong *)(param_1 + 0x138);
        auVar25 = minps(auVar27,auVar25);
        uVar24 = auVar25._0_8_;
        uStack_80 = uVar24;
        fVar22 = *(float *)(lVar13 + 0x24 + lVar21);
        auVar27 = blendvps(ZEXT416((uint)fVar22),auVar29,ZEXT416(-(uint)(fVar22 <= auVar29._0_4_)));
        auStack_88._0_4_ = auVar27._0_4_;
        fVar22 = *(float *)(lVar13 + 0xc + lVar21);
        if (fVar22 <= auVar25._0_4_) {
          auVar26._4_12_ = auVar25._4_12_;
          auVar26._0_4_ = fVar22;
          uVar24 = auVar26._0_8_;
        }
        uStack_80._0_4_ = (int)uVar24;
        uStack_80._4_4_ = auVar25._4_4_;
        if (auVar28._0_4_ < auVar25._4_4_) {
          uStack_b0 = 0;
          uStack_b8 = 0;
          FUN_7ff70c7bd960(*(undefined8 *)(lVar7 + 0x2c8),auStack_88,auStack_88 + 8,*puVar16);
        }
        puVar16 = puVar16 + 2;
      } while (puVar16 <= puVar19);
    }
    if (((iStack_a0 != 0) && (*(float *)(param_1 + 0x134) <= fVar2)) &&
       (fVar2 < *(float *)(param_1 + 0x13c))) {
      auStack_88._4_4_ = fVar2;
      auStack_88._0_4_ = *(undefined4 *)(param_1 + 0xb0);
      uStack_90 = *(undefined4 *)(param_1 + 0xac);
      uStack_b8 = 0x3f800000;
      fStack_8c = fVar2;
      FUN_7ff70c7bd6c0(*(undefined8 *)(lVar7 + 0x2c8),&uStack_90,auStack_88,iStack_a0);
    }
    lVar21 = lStack_98;
    iVar18 = iStack_9c;
    if (((iVar20 == iStack_9c) && (*(float *)(param_1 + 0x134) <= fVar23)) &&
       (fVar23 < *(float *)(param_1 + 0x13c))) {
      auStack_88._4_4_ = fVar23;
      auStack_88._0_4_ = *(undefined4 *)(param_1 + 0xb0);
      uStack_90 = *(undefined4 *)(param_1 + 0xac);
      uStack_b8 = 0x3f800000;
      fStack_8c = fVar23;
      FUN_7ff70c7bd6c0(*(undefined8 *)(lVar7 + 0x2c8),&uStack_90,auStack_88,
                       *(undefined4 *)(param_1 + 0xa4));
    }
  }
  if (iVar20 == sVar5) {
    if (0 < *(int *)(param_1 + 0x6c)) {
      uVar4 = *(undefined1 *)(param_1 + 0x236);
      lVar13 = 0x6e;
      lVar17 = 0;
      do {
        *(undefined1 *)(*(longlong *)(param_1 + 0x18) + lVar13) = uVar4;
        lVar17 = lVar17 + 1;
        lVar13 = lVar13 + 0x74;
      } while (lVar17 < *(int *)(param_1 + 0x6c));
    }
    fVar23 = *(float *)(param_1 + 0x80) + _DAT_7ff70cb1ba2c;
    auVar28 = blendvps(ZEXT416((uint)*(float *)(param_1 + 0x124)),ZEXT416((uint)fVar23),
                       ZEXT416(-(uint)(*(float *)(param_1 + 0x124) <= fVar23)));
    *(float *)(lVar21 + 0xc) = auVar28._0_4_ - *(float *)(param_1 + 0xf4);
    if (iVar20 == iVar18) {
      *(undefined1 *)(param_1 + 0x243) = 1;
      fVar23 = *(float *)(param_1 + 0x80);
      fVar2 = *(float *)(param_1 + 300);
      if (fVar2 <= auVar28._0_4_) {
        auVar28._4_12_ = auVar28._4_12_;
        auVar28._0_4_ = fVar2;
      }
      *(int *)(param_1 + 0x154) = auVar28._0_4_;
      *(int *)(param_1 + 0x134) = auVar28._0_4_;
      *(float *)(param_1 + 0x15c) = fVar2;
      *(float *)(param_1 + 0x13c) = fVar2;
      *(undefined2 *)(param_1 + 0x232) = *(undefined2 *)(param_1 + 0x234);
      fVar2 = *(float *)(param_1 + 0x7c);
      fVar22 = (fVar23 + *(float *)(param_1 + 0x114)) - *(float *)(param_1 + 0xf4);
      *(float *)(lVar7 + 0x11c) = fVar22;
      *(float *)(param_1 + 0x80) = fVar22;
      *(float *)(param_1 + 0x7c) = fVar22 - (fVar23 - fVar2);
      if (0 < *(int *)(param_1 + 0x6c)) {
        lVar13 = 100;
        lVar21 = 0;
        do {
          lVar17 = *(longlong *)(param_1 + 0x18);
          *(undefined2 *)(lVar17 + -4 + lVar13) = *(undefined2 *)(lVar17 + lVar13);
          *(undefined4 *)(lVar17 + -0x3c + lVar13) = *(undefined4 *)(param_1 + 0x154);
          lVar21 = lVar21 + 1;
          lVar13 = lVar13 + 0x74;
        } while (lVar21 < *(int *)(param_1 + 0x6c));
      }
      lVar13 = *(longlong *)(param_1 + 0x18);
      uVar24 = *(undefined8 *)(lVar13 + 0x24);
      uVar9 = *(undefined8 *)(lVar13 + 0x2c);
      uVar10 = *(undefined8 *)(lVar13 + 0x2c);
      *(undefined8 *)(lVar7 + 0x260) = *(undefined8 *)(lVar13 + 0x24);
      *(undefined8 *)(lVar7 + 0x268) = uVar10;
      lVar13 = *(longlong *)(lVar7 + 0x2c8);
      *(undefined8 *)(lVar13 + 0x60) = uVar24;
      *(undefined8 *)(lVar13 + 0x68) = uVar9;
      puVar1 = (undefined8 *)
               (*(longlong *)(*(longlong *)(lVar7 + 0x2c8) + 0xa8) + -0x10 +
               (longlong)*(int *)(*(longlong *)(lVar7 + 0x2c8) + 0xa0) * 0x10);
      *puVar1 = uVar24;
      puVar1[1] = uVar9;
      FUN_7ff70c7c6750(*(undefined8 *)(param_1 + 0x1a0),*(undefined8 *)(lVar7 + 0x2c8),
                       *(undefined2 *)(*(longlong *)(param_1 + 0x18) + 0x60));
    }
  }
  if ((*(byte *)(param_1 + 0x94) & 1) == 0) {
    *(int *)(param_1 + 0x98) = *(int *)(param_1 + 0x98) + 1;
  }
  *(undefined1 *)(param_1 + 0x238) = 0;
  if (_DAT_7ff70cbebd80 == (uStack_70 ^ (ulonglong)auStack_d8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_70 ^ (ulonglong)auStack_d8);
  pcVar8 = (code *)swi(3);
  (*pcVar8)();
  return;
}


