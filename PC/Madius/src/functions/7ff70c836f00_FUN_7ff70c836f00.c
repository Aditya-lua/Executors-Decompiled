/* 7ff70c836f00 FUN_7ff70c836f00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c836f00(void)

{
  undefined4 *puVar1;
  undefined1 *puVar2;
  float fVar3;
  undefined8 uVar4;
  undefined4 uVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  code *pcVar9;
  undefined1 auVar10 [16];
  longlong lVar11;
  longlong lVar12;
  uint uVar13;
  int iVar14;
  float fVar15;
  float fVar16;
  float fVar35;
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined8 uVar36;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  float fVar45;
  undefined1 auVar44 [15];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  float fVar50;
  float fVar51;
  float fVar54;
  undefined1 auVar52 [16];
  undefined4 uVar55;
  undefined1 auVar53 [16];
  undefined1 auStack_c8 [32];
  undefined4 uStack_a8;
  undefined4 uStack_a0;
  undefined4 uStack_98;
  float fStack_88;
  float fStack_84;
  float fStack_80;
  float fStack_7c;
  undefined1 auStack_78 [8];
  undefined8 uStack_70;
  ulonglong uStack_60;
  
  lVar11 = _DAT_7ff70cc1a3c0;
  uStack_60 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_c8;
  lVar6 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  uVar5 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1394);
  *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1394) = *(undefined4 *)(lVar6 + 0x10);
  if (*(short *)(lVar6 + 0xda) != 1) {
    FUN_7ff70c833070();
    lVar7 = _DAT_7ff70cc1a3c0;
    uVar55 = *(undefined4 *)(lVar6 + 0x1e4);
    puVar1 = (undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1de0);
    uVar4 = *(undefined8 *)(lVar6 + 0x28);
    uVar36 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar6 + 0x30) >> 0x20) +
                      (float)((ulonglong)uVar4 >> 0x20),
                      (float)*(undefined8 *)(lVar6 + 0x30) + (float)uVar4);
    *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x1e20) = *(undefined4 *)(lVar6 + 0x90);
    *(undefined4 *)(lVar7 + 0x1e24) = *puVar1;
    *(undefined4 *)(lVar7 + 0x1e28) = uVar55;
    *(undefined8 *)(lVar7 + 0x1e3c) = uVar4;
    *(undefined8 *)(lVar7 + 0x1e44) = uVar36;
    *(undefined8 *)(lVar7 + 0x1e2c) = uVar4;
    *(undefined8 *)(lVar7 + 0x1e34) = uVar36;
    goto LAB_7ff70c83759c;
  }
  auVar49._8_8_ = 0;
  auVar49._0_8_ = *(ulonglong *)(lVar6 + 0x30);
  auVar17 = ZEXT216(CONCAT11(*(undefined1 *)(lVar6 + 0x435),*(undefined1 *)(lVar6 + 0x435))) &
            _DAT_7ff70cb1d8d0;
  auVar44 = SUB1615((undefined1  [16])0x0,1);
  auVar52[0] = -(auVar17[0] == '\0');
  auVar52[1] = -(auVar17[1] == '\0');
  auVar52[2] = 0xff;
  auVar52[3] = 0xff;
  auVar52[4] = 0xff;
  auVar52[5] = 0xff;
  auVar52[6] = 0xff;
  auVar52[7] = 0xff;
  auVar52[8] = -(auVar17[8] == '\0');
  auVar52[9] = -(auVar44[8] == auVar17[9]);
  auVar52[10] = -(auVar44[9] == auVar17[10]);
  auVar52[0xb] = -(auVar44[10] == auVar17[0xb]);
  auVar52[0xc] = -(auVar44[0xb] == auVar17[0xc]);
  auVar52[0xd] = -(auVar44[0xc] == auVar17[0xd]);
  auVar52[0xe] = -(auVar44[0xd] == auVar17[0xe]);
  auVar52[0xf] = -(auVar44[0xe] == auVar17[0xf]);
  auVar17 = pmovsxbd(auVar17,auVar52);
  auVar52 = maxps(_DAT_7ff70cb1d8c0,auVar49);
  auVar17 = blendvps(auVar52,auVar49,auVar17);
  FUN_7ff70c833070();
  lVar12 = _DAT_7ff70cc1a3c0;
  lVar7 = *(longlong *)(lVar11 + 0x1440);
  fVar50 = *(float *)(lVar7 + 0x118);
  fVar51 = *(float *)(lVar7 + 0x11c);
  fVar54 = auVar17._4_4_;
  uVar55 = auVar17._12_4_;
  fVar15 = auVar17._0_4_ + fVar50;
  fVar35 = fVar54 + fVar51;
  lVar8 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(lVar8 + 0xd1) == '\0') {
    fVar3 = *(float *)(lVar8 + 0x11c + (ulonglong)*(byte *)(lVar8 + 0x158) * 8);
    auVar18._4_4_ = fVar54;
    auVar18._0_4_ = fVar54;
    auVar18._8_4_ = uVar55;
    auVar18._12_4_ = uVar55;
    auVar19._4_12_ = auVar18._4_12_;
    fVar16 = fVar54 + (*(float *)(lVar8 + 0x11c) - fVar3);
    auVar19._0_4_ = -(uint)(fVar16 <= *(float *)(lVar8 + 0x144));
    auVar49 = blendvps(ZEXT416((uint)(fVar16 + 0.0)),ZEXT416((uint)*(float *)(lVar8 + 0x144)),
                       auVar19);
    auVar53._0_4_ = auVar17._0_4_ + *(float *)(lVar8 + 0x118);
    auVar53._4_12_ = auVar17._4_12_;
    *(float *)(lVar8 + 0x120) = auVar53._0_4_;
    *(float *)(lVar8 + 0x124) = fVar3;
    *(float *)(lVar8 + 0x118) =
         (float)(int)(*(float *)(lVar8 + 0x28) + *(float *)(lVar8 + 0x15c) +
                     *(float *)(lVar8 + 0x160));
    auVar39._0_4_ = (float)(int)(auVar49._0_4_ + fVar3 + *(float *)(lVar12 + 0xca0));
    auVar39._4_4_ = (float)(int)auVar49._4_4_;
    auVar39._8_4_ = (float)(int)auVar49._8_4_;
    auVar39._12_4_ = (float)(int)auVar49._12_4_;
    *(float *)(lVar8 + 0x11c) = auVar39._0_4_;
    auVar17._4_4_ = fVar54;
    auVar17._0_4_ = auVar53._0_4_;
    auVar17._12_4_ = uVar55;
    auVar20._4_12_ = auVar17._4_12_;
    auVar20._0_4_ = -(uint)(auVar53._0_4_ <= *(float *)(lVar8 + 0x130));
    auVar17 = blendvps(auVar53,ZEXT416((uint)*(float *)(lVar8 + 0x130)),auVar20);
    *(int *)(lVar8 + 0x130) = auVar17._0_4_;
    auVar40._4_12_ = auVar39._4_12_;
    auVar40._0_4_ = auVar39._0_4_ - *(float *)(lVar12 + 0xca0);
    auVar21._4_4_ = auVar39._4_4_;
    auVar21._0_4_ = auVar40._0_4_;
    auVar21._8_4_ = auVar39._8_4_;
    auVar21._12_4_ = auVar39._12_4_;
    auVar22._4_12_ = auVar21._4_12_;
    auVar22._0_4_ = -(uint)(auVar40._0_4_ <= *(float *)(lVar8 + 0x134));
    auVar17 = blendvps(auVar40,ZEXT416((uint)*(float *)(lVar8 + 0x134)),auVar22);
    *(int *)(lVar8 + 0x134) = auVar17._0_4_;
    *(float *)(lVar8 + 0x14c) = auVar49._0_4_;
    *(undefined4 *)(lVar8 + 0x144) = 0;
    fVar54 = *(float *)(lVar8 + 0x150);
    if (*(float *)(lVar8 + 0x150) <= _DAT_7ff70cb1bae8) {
      fVar54 = _DAT_7ff70cb1bae8;
    }
    *(float *)(lVar8 + 0x154) = fVar54;
    *(undefined4 *)(lVar8 + 0x150) = 0;
    *(undefined2 *)(lVar8 + 0x158) = 0;
    if ((*(int *)(lVar8 + 0x1d4) == 0) &&
       (lVar8 = *(longlong *)(lVar12 + 0x1440), *(char *)(lVar8 + 0xd1) == '\0')) {
      *(float *)(lVar8 + 0x118) = *(float *)(lVar12 + 0xc9c) + *(float *)(lVar8 + 0x120);
      *(undefined4 *)(lVar8 + 0x11c) = *(undefined4 *)(lVar8 + 0x124);
      *(undefined8 *)(lVar8 + 0x140) = *(undefined8 *)(lVar8 + 0x148);
      *(undefined4 *)(lVar8 + 0x150) = *(undefined4 *)(lVar8 + 0x154);
      *(undefined1 *)(lVar8 + 0x158) = 1;
    }
  }
  uVar13 = *(uint *)(lVar6 + 0x18);
  fStack_88 = fVar50;
  fStack_84 = fVar51;
  fStack_80 = fVar15;
  fStack_7c = fVar35;
  if (*(short *)(lVar6 + 0x174) == 0) {
    if ((*(byte *)(lVar6 + 0x17a) & (uVar13 & 0x100) == 0) != 0) goto LAB_7ff70c8371f8;
    FUN_7ff70c837800(&fStack_88,*(undefined4 *)(lVar6 + 0x90),0,2);
    if ((uVar13 & 0x100) != 0) goto LAB_7ff70c8373ad;
  }
  else if ((uVar13 & 0x100) == 0) {
LAB_7ff70c8371f8:
    uVar55 = *(undefined4 *)(lVar6 + 0x90);
    FUN_7ff70c837800(&fStack_88,uVar55,0,0);
    if ((((*(int *)(lVar6 + 0x90) == *(int *)(_DAT_7ff70cc1a3c0 + 0x1f94)) &&
         (*(char *)(_DAT_7ff70cc1a3c0 + 0x1f90) == '\x01')) &&
        ((*(int *)(lVar6 + 0x90) != *(int *)(_DAT_7ff70cc1a3c0 + 0x1e20) ||
         ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e24) & 2) == 0)))) &&
       (lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440), *(char *)(lVar7 + 0x179) == '\0')) {
      uStack_a8 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc94);
      auStack_78._4_4_ = fStack_84;
      auStack_78._0_4_ = fStack_88;
      uStack_70._4_4_ = fStack_7c;
      uStack_70._0_4_ = fStack_80;
      puVar2 = auStack_78 + 8;
      auVar17 = *(undefined1 (*) [16])(lVar7 + 0x260);
      fVar54 = auVar17._0_4_;
      fVar3 = auVar17._12_4_;
      fVar16 = auVar17._4_4_;
      fVar45 = auVar17._8_4_;
      auVar46._4_4_ = -(uint)(fVar16 <= fStack_84);
      auVar46._0_4_ = -(uint)(fVar54 <= fStack_88);
      auVar46._8_4_ = -(uint)(fVar45 <= fStack_80);
      auVar46._12_4_ = -(uint)(fVar3 <= fStack_7c);
      auVar23._4_4_ = -(uint)(fStack_84 < fVar16);
      auVar23._0_4_ = -(uint)(fStack_88 < fVar54);
      auVar23._8_4_ = -(uint)(fStack_80 < fVar45);
      auVar23._12_4_ = -(uint)(fStack_7c < fVar3);
      auVar49 = blendps(auVar23,auVar46,3);
      auVar17 = blendvps(auVar17,_auStack_78,auVar49);
      auStack_78._0_4_ = auVar17._0_4_ + _DAT_7ff70cb1d660;
      auStack_78._4_4_ = auVar17._4_4_ + _UNK_7ff70cb1d664;
      uStack_70._0_4_ = auVar17._8_4_ + _UNK_7ff70cb1d668;
      uStack_70._4_4_ = auVar17._12_4_ + _UNK_7ff70cb1d66c;
      auVar24._4_4_ = -(uint)(uStack_70._4_4_ <= fVar3);
      auVar24._0_4_ = -(uint)((float)uStack_70 <= fVar45);
      auVar24._8_4_ = -(uint)(fVar54 <= (float)auStack_78._0_4_);
      auVar24._12_4_ = -(uint)(fVar16 <= (float)auStack_78._4_4_);
      iVar14 = movmskps(uVar55,auVar24);
      if (iVar14 == 0xf) {
        auVar17 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
        auVar28._0_4_ = auVar17._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b4);
        auVar28._4_4_ = auVar17._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b8);
        auVar28._8_4_ = auVar17._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10bc);
        auVar28._12_4_ = auVar17._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10c0);
        auVar17 = minps(_DAT_7ff70cb1b2a0,auVar28);
        auVar29._4_4_ = -(uint)(auVar28._4_4_ < 0.0);
        auVar29._0_4_ = -(uint)(auVar28._0_4_ < 0.0);
        auVar29._8_4_ = -(uint)(auVar28._8_4_ < 0.0);
        auVar29._12_4_ = -(uint)(auVar28._12_4_ < 0.0);
        auVar42._0_4_ = auVar17._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
        auVar42._4_4_ = auVar17._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
        auVar42._8_4_ = auVar17._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
        auVar42._12_4_ = auVar17._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
        auVar17 = blendvps(auVar42,_DAT_7ff70cb1b5a0,auVar29);
        auVar30._0_4_ = (int)auVar17._0_4_;
        auVar30._4_4_ = (int)auVar17._4_4_;
        auVar30._8_4_ = (int)auVar17._8_4_;
        auVar30._12_4_ = (int)auVar17._12_4_;
        auVar17 = pmulld(auVar30,_DAT_7ff70cb1d5e0);
        auVar38._0_8_ = auVar17._8_8_;
        auVar38._8_4_ = auVar17._8_4_;
        auVar38._12_4_ = auVar17._12_4_;
        uStack_98 = 0x40000000;
        uStack_a0 = 0;
        FUN_7ff70c7bd870(*(undefined8 *)(lVar7 + 0x2c8),auStack_78,puVar2,
                         SUB164(auVar38 | auVar17,4) | SUB164(auVar38 | auVar17,0));
      }
      else {
        FUN_7ff70c7b7c50(*(undefined8 *)(lVar7 + 0x2c8),auStack_78,puVar2,0);
        auVar17 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
        auVar25._0_4_ = auVar17._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b4);
        auVar25._4_4_ = auVar17._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b8);
        auVar25._8_4_ = auVar17._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10bc);
        auVar25._12_4_ = auVar17._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10c0);
        auVar17 = minps(_DAT_7ff70cb1b2a0,auVar25);
        auVar26._4_4_ = -(uint)(auVar25._4_4_ < 0.0);
        auVar26._0_4_ = -(uint)(auVar25._0_4_ < 0.0);
        auVar26._8_4_ = -(uint)(auVar25._8_4_ < 0.0);
        auVar26._12_4_ = -(uint)(auVar25._12_4_ < 0.0);
        auVar41._0_4_ = auVar17._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
        auVar41._4_4_ = auVar17._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
        auVar41._8_4_ = auVar17._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
        auVar41._12_4_ = auVar17._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
        auVar17 = blendvps(auVar41,_DAT_7ff70cb1b5a0,auVar26);
        auVar27._0_4_ = (int)auVar17._0_4_;
        auVar27._4_4_ = (int)auVar17._4_4_;
        auVar27._8_4_ = (int)auVar17._8_4_;
        auVar27._12_4_ = (int)auVar17._12_4_;
        auVar17 = pmulld(auVar27,_DAT_7ff70cb1d5e0);
        auVar37._0_8_ = auVar17._8_8_;
        auVar37._8_4_ = auVar17._8_4_;
        auVar37._12_4_ = auVar17._12_4_;
        uStack_98 = 0x40000000;
        uStack_a0 = 0;
        FUN_7ff70c7bd870(*(undefined8 *)(lVar7 + 0x2c8),auStack_78,puVar2,
                         SUB164(auVar37 | auVar17,4) | SUB164(auVar37 | auVar17,0));
        FUN_7ff70c7b8130(*(undefined8 *)(lVar7 + 0x2c8));
      }
    }
    if ((*(short *)(lVar6 + 0x174) == 0) && (lVar6 == *(longlong *)(lVar11 + 0x1f98))) {
      if (((*(int *)(lVar11 + 0x1f94) == *(int *)(_DAT_7ff70cc1a3c0 + 0x1f94)) &&
          (*(char *)(_DAT_7ff70cc1a3c0 + 0x1f90) == '\x01')) &&
         (((*(int *)(lVar11 + 0x1f94) != *(int *)(_DAT_7ff70cc1a3c0 + 0x1e20) ||
           ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1e24) & 2) == 0)) &&
          (lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440), *(char *)(lVar7 + 0x179) == '\0')))) {
        fVar50 = fVar50 + _DAT_7ff70cb1d8e0;
        fVar51 = fVar51 + _UNK_7ff70cb1d8e4;
        fVar15 = fVar15 + _UNK_7ff70cb1d8e8;
        fVar35 = fVar35 + _UNK_7ff70cb1d8ec;
        uStack_a8 = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc94);
        auVar17 = *(undefined1 (*) [16])(lVar7 + 0x260);
        auVar47._4_4_ = -(uint)(auVar17._4_4_ <= fVar51);
        auVar47._0_4_ = -(uint)(auVar17._0_4_ <= fVar50);
        auVar47._8_4_ = -(uint)(auVar17._8_4_ <= fVar15);
        auVar47._12_4_ = -(uint)(auVar17._12_4_ <= fVar35);
        auVar31._4_4_ = -(uint)(fVar51 < auVar17._4_4_);
        auVar31._0_4_ = -(uint)(fVar50 < auVar17._0_4_);
        auVar31._8_4_ = -(uint)(fVar15 < auVar17._8_4_);
        auVar31._12_4_ = -(uint)(fVar35 < auVar17._12_4_);
        auVar49 = blendps(auVar31,auVar47,3);
        auVar10._4_4_ = fVar51;
        auVar10._0_4_ = fVar50;
        auVar10._8_4_ = fVar15;
        auVar10._12_4_ = fVar35;
        _auStack_78 = blendvps(auVar17,auVar10,auVar49);
        auVar17 = insertps(_DAT_7ff70cb1d610,*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0xc4c),0x30);
        auVar32._0_4_ = auVar17._0_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b4);
        auVar32._4_4_ = auVar17._4_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10b8);
        auVar32._8_4_ = auVar17._8_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10bc);
        auVar32._12_4_ = auVar17._12_4_ * *(float *)(_DAT_7ff70cc1a3c0 + 0x10c0);
        auVar17 = minps(_DAT_7ff70cb1b2a0,auVar32);
        auVar33._4_4_ = -(uint)(auVar32._4_4_ < 0.0);
        auVar33._0_4_ = -(uint)(auVar32._0_4_ < 0.0);
        auVar33._8_4_ = -(uint)(auVar32._8_4_ < 0.0);
        auVar33._12_4_ = -(uint)(auVar32._12_4_ < 0.0);
        auVar48._0_4_ = auVar17._0_4_ * _DAT_7ff70cb1d5d0 + (float)DAT_7ff70cb1b5a0;
        auVar48._4_4_ = auVar17._4_4_ * _UNK_7ff70cb1d5d4 + DAT_7ff70cb1b5a0._4_4_;
        auVar48._8_4_ = auVar17._8_4_ * _UNK_7ff70cb1d5d8 + DAT_7ff70cb1b5a0._8_4_;
        auVar48._12_4_ = auVar17._12_4_ * _UNK_7ff70cb1d5dc + DAT_7ff70cb1b5a0._12_4_;
        auVar17 = blendvps(auVar48,_DAT_7ff70cb1b5a0,auVar33);
        auVar34._0_4_ = (int)auVar17._0_4_;
        auVar34._4_4_ = (int)auVar17._4_4_;
        auVar34._8_4_ = (int)auVar17._8_4_;
        auVar34._12_4_ = (int)auVar17._12_4_;
        auVar17 = pmulld(auVar34,_DAT_7ff70cb1d5e0);
        auVar43._0_8_ = auVar17._8_8_;
        auVar43._8_4_ = auVar17._8_4_;
        auVar43._12_4_ = auVar17._12_4_;
        uStack_98 = 0x40000000;
        uStack_a0 = 0;
        FUN_7ff70c7bd870(*(undefined8 *)(lVar7 + 0x2c8),auStack_78,auStack_78 + 8,
                         SUB164(auVar43 | auVar17,4) | SUB164(auVar43 | auVar17,0));
      }
    }
  }
  else {
    FUN_7ff70c837800(&fStack_88,*(undefined4 *)(lVar6 + 0x90),0,2);
LAB_7ff70c8373ad:
    *(ushort *)(lVar7 + 0x176) = *(ushort *)(lVar7 + 0x176) | *(ushort *)(lVar6 + 0x176);
  }
  uVar13 = *(uint *)(lVar11 + 0x1e28);
  if (*(longlong *)(lVar11 + 0x1448) == lVar6) {
    uVar13 = uVar13 | 0x80;
    *(uint *)(lVar11 + 0x1e28) = uVar13;
  }
  *(uint *)(lVar6 + 0x1e4) = uVar13;
LAB_7ff70c83759c:
  *(undefined4 *)(lVar11 + 0x1394) = uVar5;
  *(undefined4 *)(lVar11 + 0x2758) = 0xff7fffff;
  if (_DAT_7ff70cbebd80 == (uStack_60 ^ (ulonglong)auStack_c8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_60 ^ (ulonglong)auStack_c8);
  pcVar9 = (code *)swi(3);
  (*pcVar9)();
  return;
}


