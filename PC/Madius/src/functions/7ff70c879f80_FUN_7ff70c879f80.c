/* 7ff70c879f80 FUN_7ff70c879f80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c879f80(undefined8 *param_1,ulonglong param_2,int param_3,longlong *param_4,
                          longlong param_5,longlong param_6,undefined4 param_7)

{
  longlong lVar1;
  code *pcVar2;
  longlong lVar3;
  byte bVar4;
  char cVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  ulonglong uVar8;
  ushort uVar9;
  longlong lVar10;
  ushort uVar11;
  longlong lVar12;
  longlong lVar13;
  float fVar14;
  float fVar15;
  float fVar20;
  undefined1 auVar16 [16];
  float fVar21;
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  int iVar22;
  float fVar23;
  int iVar25;
  int iVar26;
  int iVar27;
  undefined1 auVar24 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  float fVar31;
  undefined1 auVar32 [16];
  float fVar33;
  float fVar34;
  float fVar35;
  undefined4 unaff_XMM12_Db;
  undefined4 unaff_XMM12_Dc;
  undefined4 unaff_XMM12_Dd;
  undefined1 auStack_148 [32];
  undefined4 uStack_128;
  undefined4 uStack_120;
  int iStack_10c;
  undefined8 *puStack_108;
  undefined8 uStack_100;
  float fStack_f8;
  float fStack_f4;
  byte bStack_ea;
  byte bStack_e9;
  undefined1 auStack_e8 [8];
  float fStack_e0;
  float fStack_dc;
  ulonglong uStack_d0;
  
  lVar3 = _DAT_7ff70cc1a3c0;
  uStack_d0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_148;
  lVar1 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (*(char *)(lVar1 + 0xd1) != '\0') {
LAB_7ff70c87a001:
    uVar8 = 0;
    goto LAB_7ff70c87a4a6;
  }
  fVar14 = (float)param_1[1] - (float)*param_1;
  fVar20 = (float)((ulonglong)param_1[1] >> 0x20) - (float)((ulonglong)*param_1 >> 0x20);
  uVar8 = 0;
  if ((fVar14 <= 0.0) || (fVar20 <= 0.0)) goto LAB_7ff70c87a4a6;
  fVar23 = _DAT_7ff70cb1ba2c;
  if ((param_3 == 1) && (fVar20 < fVar14)) {
    fVar33 = fVar14 + fVar14;
    if (fVar14 + fVar14 <= _DAT_7ff70cb1ba2c) {
      fVar33 = _DAT_7ff70cb1ba2c;
    }
    if (fVar20 / fVar33 <= _DAT_7ff70cb1ba2c) {
      fVar23 = fVar20 / fVar33;
    }
    if (fVar23 <= 0.0) goto LAB_7ff70c87a001;
  }
  iVar22 = (int)((fVar14 + _DAT_7ff70cb1e8f0) * _DAT_7ff70cb1ba80);
  iVar25 = (int)((fVar20 + _UNK_7ff70cb1e8f4) * _UNK_7ff70cb1ba84);
  iVar26 = (int)((_UNK_7ff70cb1e8f8 + 0.0) * _UNK_7ff70cb1ba88);
  iVar27 = (int)((_UNK_7ff70cb1e8fc + 0.0) * _UNK_7ff70cb1ba8c);
  auVar29._0_4_ = -(uint)(_DAT_7ff70cb1e900 < iVar22);
  auVar29._4_4_ = -(uint)(_UNK_7ff70cb1e904 < iVar25);
  auVar29._8_4_ = -(uint)(_UNK_7ff70cb1e908 < iVar26);
  auVar29._12_4_ = -(uint)(_UNK_7ff70cb1e90c < iVar27);
  auVar28._0_4_ = (uint)(float)iVar22 ^ _DAT_7ff70cb1ba60;
  auVar28._4_4_ = (uint)(float)iVar25 ^ _UNK_7ff70cb1ba64;
  auVar28._8_4_ = (uint)(float)iVar26 ^ _UNK_7ff70cb1ba68;
  auVar28._12_4_ = (uint)(float)iVar27 ^ _UNK_7ff70cb1ba6c;
  auVar29 = blendvps(auVar28,_DAT_7ff70cb1da80,auVar29);
  auVar16._4_4_ = iVar25;
  auVar16._0_4_ = iVar22;
  auVar16._8_4_ = iVar26;
  auVar16._12_4_ = iVar27;
  auVar29 = blendvps(auVar29,_DAT_7ff70cb1e910,auVar16);
  auStack_e8._0_4_ = (undefined4)*param_1;
  auStack_e8._4_4_ = (undefined4)((ulonglong)*param_1 >> 0x20);
  fStack_e0 = (float)param_1[1];
  fStack_dc = (float)((ulonglong)param_1[1] >> 0x20);
  fVar14 = auVar29._0_4_;
  auVar30._0_4_ = (float)auStack_e8._0_4_ - fVar14;
  fVar20 = auVar29._4_4_;
  auVar30._4_4_ = (float)auStack_e8._4_4_ - fVar20;
  auVar30._8_4_ = fStack_e0 - fVar14;
  auVar30._12_4_ = fStack_dc - fVar20;
  auVar24._4_4_ = (float)auStack_e8._4_4_ + fVar20;
  auVar24._0_4_ = (float)auStack_e8._0_4_ + fVar14;
  fVar14 = fStack_e0 + fVar14;
  fVar20 = fStack_dc + fVar20;
  auVar24._8_4_ = fVar14;
  auVar24._12_4_ = fVar20;
  _auStack_e8 = blendps(auVar24,auVar30,3);
  lVar12 = param_6 - param_5;
  if (lVar12 == 0 || param_6 < param_5) {
    param_6 = param_5;
  }
  if (param_6 < 2) {
    param_6 = 1;
  }
  fVar21 = fVar20 - auVar30._4_4_;
  fVar33 = fVar14 - auVar30._0_4_;
  fVar34 = fVar14 - auVar30._8_4_;
  if (param_3 != 0) {
    fVar33 = fVar21;
    fVar34 = fVar20 - auVar30._12_4_;
  }
  puStack_108 = param_1 + 1;
  uStack_100 = CONCAT44(fVar21,fVar14 - auVar30._0_4_);
  lVar13 = (longlong)param_3;
  fVar35 = (float)param_5;
  fVar14 = *(float *)((longlong)&uStack_100 + lVar13 * 4);
  if (*(float *)(_DAT_7ff70cc1a3c0 + 0xccc) <= fVar14) {
    fVar14 = *(float *)(_DAT_7ff70cc1a3c0 + 0xccc);
  }
  auVar17._4_4_ = unaff_XMM12_Db;
  auVar17._0_4_ = fVar35;
  auVar17._8_4_ = unaff_XMM12_Dc;
  auVar17._12_4_ = unaff_XMM12_Dd;
  auVar18._4_12_ = auVar17._4_12_;
  fVar15 = (fVar35 / (float)param_6) * fVar33;
  auVar32._4_4_ = fVar21;
  auVar32._0_4_ = fVar33;
  auVar32._8_4_ = fVar34;
  auVar32._12_4_ = fVar20 - auVar30._12_4_;
  if (fVar15 <= fVar33) {
    auVar32._0_4_ = fVar15;
  }
  auVar18._0_4_ = -(uint)(fVar15 < fVar14);
  auVar29 = blendvps(auVar32,ZEXT416((uint)fVar14),auVar18);
  bStack_e9 = 0;
  bStack_ea = 0;
  iStack_10c = param_3;
  FUN_7ff70c837800(auVar18._0_8_,param_2,0,2);
  uStack_128 = 0x40000;
  FUN_7ff70c8782e0(auStack_e8,param_2 & 0xffffffff,&bStack_ea,&bStack_e9);
  bVar4 = bStack_e9;
  fVar14 = _DAT_7ff70cb1ba2c;
  lVar10 = 1;
  if (1 < lVar12) {
    lVar10 = lVar12;
  }
  fVar21 = (float)lVar10;
  fVar15 = (float)*param_4 / fVar21;
  fVar20 = _DAT_7ff70cb1ba2c;
  if (fVar15 <= _DAT_7ff70cb1ba2c) {
    fVar20 = fVar15;
  }
  fVar31 = auVar29._0_4_;
  auVar29 = insertps(ZEXT416((uint)((float)(~-(uint)(fVar15 < 0.0) & (uint)fVar20) *
                                   (fVar33 - fVar31))),auVar29,0x10);
  auVar19._4_4_ = fVar33;
  auVar19._0_4_ = fVar33;
  auVar19._8_4_ = fVar34;
  auVar19._12_4_ = fVar34;
  auVar29 = divps(auVar29,auVar19);
  fVar20 = auVar29._0_4_;
  fVar34 = auVar29._4_4_;
  uVar8 = (ulonglong)bStack_e9;
  if ((-(_DAT_7ff70cb1ba2c <= fVar23 && fVar34 < _DAT_7ff70cb1ba2c) & bStack_e9) == 1) {
    fVar15 = (*(float *)(lVar3 + 0xe0 + lVar13 * 4) - *(float *)(auStack_e8 + lVar13 * 4)) / fVar33;
    fVar23 = _DAT_7ff70cb1ba2c;
    if (fVar15 <= _DAT_7ff70cb1ba2c) {
      fVar23 = fVar15;
    }
    fVar23 = (float)(~-(uint)(fVar15 < 0.0) & (uint)fVar23);
    uVar11 = 0xffff;
    if (fVar20 <= fVar23) {
      uVar11 = (ushort)(fVar34 + fVar20 < fVar23);
    }
    if (*(char *)(lVar3 + 0x14c0) == '\0') {
      if (*(short *)(lVar3 + 0x2582) == 0) goto LAB_7ff70c87a322;
LAB_7ff70c87a2be:
      cVar5 = FUN_7ff70c847630(0,1,0);
      if (cVar5 == '\0') {
        lVar12 = *param_4;
      }
      else {
        lVar12 = *param_4;
        if (uVar11 == *(ushort *)(lVar3 + 0x2582)) {
          if ((short)*(ushort *)(lVar3 + 0x2582) < 1) {
            fVar35 = (float)((uint)fVar35 ^ _DAT_7ff70cb1ba60);
          }
          lVar13 = lVar12 + (longlong)fVar35;
          if (lVar13 < lVar10) {
            lVar10 = lVar13;
          }
          lVar12 = 0;
          if (-1 < lVar13) {
            lVar12 = lVar10;
          }
          *param_4 = lVar12;
        }
      }
    }
    else {
      uVar9 = 0;
      if ((*(char *)(lVar3 + 0x61) != '\0') && (*(char *)(lVar3 + 0xfd) == '\0')) {
        uVar9 = uVar11;
      }
      *(ushort *)(lVar3 + 0x2582) = uVar9;
      fVar15 = 0.0;
      if ((uVar11 == 0) && (*(char *)(lVar3 + 0xfd) == '\0')) {
        fVar15 = fVar34 * _DAT_7ff70cb1bb40 + (fVar23 - fVar20);
      }
      *(float *)(lVar3 + 0x2584) = fVar15;
      if (uVar9 != 0) goto LAB_7ff70c87a2be;
LAB_7ff70c87a322:
      fVar23 = (_DAT_7ff70cb1bb40 * fVar34 + (fVar23 - *(float *)(lVar3 + 0x2584))) /
               (fVar14 - fVar34);
      fVar20 = fVar14;
      if (fVar23 <= fVar14) {
        fVar20 = fVar23;
      }
      lVar12 = (longlong)((float)(~-(uint)(fVar23 < 0.0) & (uint)fVar20) * fVar21);
      *param_4 = lVar12;
    }
    fVar21 = (float)lVar12 / fVar21;
    if (fVar21 <= fVar14) {
      fVar14 = fVar21;
    }
    fVar20 = ((fVar33 - fVar31) * (float)(~-(uint)(fVar21 < 0.0) & (uint)fVar14)) / fVar33;
  }
  uVar6 = FUN_7ff70c80a070(0xe);
  iVar22 = 0x11;
  if (bVar4 == 0) {
    iVar22 = bStack_ea + 0xf;
  }
  uVar7 = FUN_7ff70c80a070(iVar22);
  uStack_128 = *(undefined4 *)(lVar1 + 0x60);
  uStack_120 = param_7;
  FUN_7ff70c7bd960(*(undefined8 *)(lVar1 + 0x2c8),param_1,puStack_108,uVar6);
  if (iStack_10c == 0) {
    fVar14 = fVar20 * (fStack_e0 - (float)auStack_e8._0_4_) + (float)auStack_e8._0_4_;
    fStack_f8 = fVar31 + fVar14;
    fVar20 = (float)auStack_e8._4_4_;
    fStack_f4 = fStack_dc;
  }
  else {
    fVar20 = fVar20 * (fStack_dc - (float)auStack_e8._4_4_) + (float)auStack_e8._4_4_;
    fStack_f4 = fVar31 + fVar20;
    fVar14 = (float)auStack_e8._0_4_;
    fStack_f8 = fStack_e0;
  }
  uStack_100 = CONCAT44(fVar20,fVar14);
  uStack_128 = *(undefined4 *)(lVar3 + 0xcc8);
  uStack_120 = 0;
  FUN_7ff70c7bd960(*(undefined8 *)(lVar1 + 0x2c8),&uStack_100,&fStack_f8,uVar7);
LAB_7ff70c87a4a6:
  if (_DAT_7ff70cbebd80 == (uStack_d0 ^ (ulonglong)auStack_148)) {
    return uVar8;
  }
  FUN_7ff70caa97e0(uStack_d0 ^ (ulonglong)auStack_148);
  pcVar2 = (code *)swi(3);
  uVar8 = (*pcVar2)();
  return uVar8;
}


