/* 7ff70c8a0540 FUN_7ff70c8a0540 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int * FUN_7ff70c8a0540(void)

{
  float fVar1;
  float fVar2;
  ulonglong uVar3;
  int iVar4;
  longlong lVar5;
  code *pcVar6;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  longlong lVar10;
  char cVar11;
  int iVar12;
  uint uVar13;
  undefined8 uVar14;
  longlong lVar15;
  int *piVar16;
  undefined *puVar17;
  longlong lVar18;
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  ulonglong uVar22;
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auStack_d8 [32];
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  uint uStack_a8;
  int iStack_a0;
  undefined8 uStack_98;
  undefined8 uStack_90;
  undefined1 auStack_88 [16];
  ulonglong uStack_70;
  
  lVar10 = _DAT_7ff70cc1a3c0;
  uStack_70 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_d8;
  piVar16 = *(int **)(_DAT_7ff70cc1a3c0 + 0x2398);
  lVar15 = *(longlong *)(piVar16 + 10);
  lVar5 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
  if (piVar16[0xc] != *(int *)(_DAT_7ff70cc1a3c0 + 0x1ddc)) {
    FUN_7ff70c80af70(&UNK_7ff70cb90443);
  }
  if ((*(byte *)((longlong)piVar16 + 0x35) & 0x10) == 0) {
    auStack_88._0_8_ = *(undefined8 *)(lVar5 + 0x230);
    auStack_88._8_8_ = *(ulonglong *)(lVar5 + 0x238);
    lVar18 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x2278);
    if (lVar18 != 0) {
      auStack_88._0_8_ = *(undefined8 *)(lVar18 + 0x160);
      auStack_88._8_8_ = *(ulonglong *)(lVar18 + 0x168);
    }
    auVar23._0_4_ = (float)auStack_88._0_8_ + (float)*(undefined8 *)(lVar5 + 0x80);
    auVar23._4_4_ =
         SUB84(auStack_88._0_8_,4) + (float)((ulonglong)*(undefined8 *)(lVar5 + 0x80) >> 0x20);
    auVar23._8_8_ = 0;
    auVar20._8_8_ = 0;
    auVar20._0_8_ = auStack_88._8_8_;
    auVar24 = minps(auVar23,auVar20);
    uVar22 = auVar24._0_8_;
    auStack_88._0_8_ = uVar22;
    cVar11 = *(char *)((longlong)piVar16 + 0x5a);
    uVar3 = auStack_88._8_8_;
  }
  else {
    uVar3 = *(ulonglong *)(lVar5 + 0x130);
    uVar22 = *(ulonglong *)(piVar16 + 0xe);
    auVar21._8_8_ = 0;
    auVar21._0_8_ = uVar22;
    auVar24._4_4_ = -(uint)((float)(uVar22 >> 0x20) <= (float)(uVar3 >> 0x20));
    auVar24._0_4_ = -(uint)((float)uVar22 <= (float)uVar3);
    auVar24._8_4_ = 0xffffffff;
    auVar24._12_4_ = 0xffffffff;
    auVar9._8_8_ = 0;
    auVar9._0_8_ = uVar3;
    auVar24 = blendvps(auVar21,auVar9,auVar24);
    auStack_88._8_4_ = auVar24._0_4_;
    auStack_88._0_8_ = uVar22;
    auStack_88._12_4_ = auVar24._4_4_;
    cVar11 = *(char *)((longlong)piVar16 + 0x5a);
    uVar3 = auVar24._0_8_;
  }
  if (cVar11 == '\x01') {
    if ((*(char *)((longlong)piVar16 + 0x21) != '\0') ||
       ((*(char *)((longlong)piVar16 + 0x5d) == '\0' && (*(longlong *)(piVar16 + 4) != -1)))) {
      if ((*(byte *)(lVar10 + 0x27b4) & 0x40) != 0) {
        FUN_7ff70c800cf0(&UNK_7ff70cb915fa);
      }
      *(undefined8 *)(lVar15 + 0x18) = 0xffffffffffffffff;
    }
    if (((char)piVar16[0x17] == '\0') && (*(longlong *)(lVar15 + 0x20) != -1)) {
      if ((*(byte *)(lVar10 + 0x27b4) & 0x40) != 0) {
        FUN_7ff70c800cf0(&UNK_7ff70cb915cc);
      }
      *(undefined8 *)(lVar15 + 0x20) = 0xffffffffffffffff;
      *(undefined1 *)(lVar15 + 0x15) = 0xff;
    }
    if (((((piVar16[0xd] & 0xc0U) != 0) && (piVar16[0x14] != 0)) &&
        (*(int *)(_DAT_7ff70cc1a3c0 + 0x2330) == piVar16[0x14])) &&
       (*(char *)(_DAT_7ff70cc1a3c0 + 0x2334) == '\x01')) {
      FUN_7ff70c89f2a0(auStack_88);
    }
  }
  if (*(char *)((longlong)piVar16 + 0x59) == '\0') {
    if (piVar16[1] < 0) {
      uVar14 = FUN_7ff70c802100(0);
      if (*(longlong *)(piVar16 + 2) != 0) {
        FUN_7ff70cb12b60(uVar14,*(longlong *)(piVar16 + 2),(longlong)*piVar16 * 0x18);
        FUN_7ff70c802510(*(undefined8 *)(piVar16 + 2));
      }
      *(undefined8 *)(piVar16 + 2) = uVar14;
      piVar16[1] = 0;
    }
    *piVar16 = 0;
    cVar11 = FUN_7ff70c83ccd0(0);
  }
  else {
    cVar11 = FUN_7ff70c83ccd0(0);
  }
  if (((((cVar11 != '\0') && (fVar1 = *(float *)(lVar10 + 0xe0), *(float *)(lVar5 + 0x220) <= fVar1)
        ) && ((fVar2 = *(float *)(lVar10 + 0xe4), *(float *)(lVar5 + 0x224) <= fVar2 &&
              ((fVar1 < *(float *)(lVar5 + 0x228) && (fVar2 < *(float *)(lVar5 + 0x22c))))))) &&
      ((uVar13 = piVar16[0xd], (uVar13 & 0x1000) == 0 ||
       (((((float)uVar22 <= fVar1 && ((float)(uVar22 >> 0x20) <= fVar2)) && (fVar1 < (float)uVar3))
        && (fVar2 < (float)(uVar3 >> 0x20))))))) &&
     ((*(int *)(lVar10 + 0x149c) == 0 && (*(int *)(lVar10 + 0x14b4) == 0)))) {
    if ((((uVar13 & 0xc0) != 0) &&
        ((*(char *)(lVar10 + 0x2334) == '\0' && (*(char *)(lVar10 + 0x2335) == '\0')))) &&
       (*(short *)(lVar10 + 0xb1a) == 1)) {
      FUN_7ff70c8a0a60(piVar16[0x14],0xffffffffffffffff);
      FUN_7ff70c819c70(lVar5,2);
      FUN_7ff70c818160(piVar16[0x14]);
      uVar13 = piVar16[0xd];
      if ((uVar13 & 0x1000) != 0) {
        uStack_98 = *(undefined8 *)(lVar10 + 0xe0);
        uStack_90 = uStack_98;
        FUN_7ff70c8544b0(0,0,piVar16[0xc],&uStack_98);
        uVar13 = piVar16[0xd];
      }
    }
    if (((((uVar13 & 0x400) != 0) && (cVar11 = FUN_7ff70c847830(0), cVar11 != '\0')) &&
        (cVar11 = FUN_7ff70c847d70(0,_DAT_7ff70cb1bae8), cVar11 == '\0')) &&
       (*(int *)(lVar10 + 0x100) == 0)) {
      FUN_7ff70c8a0440(piVar16,0);
    }
  }
  lVar15 = _DAT_7ff70cc1a3c0;
  if ((*(byte *)((longlong)piVar16 + 0x36) & 1) != 0) {
    *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
    FUN_7ff70c851b20(*(undefined8 *)(lVar15 + 0x1440),4);
  }
  uVar3 = *(ulonglong *)(piVar16 + 0x10);
  uVar22 = *(ulonglong *)(lVar5 + 0x130);
  auVar19._8_8_ = 0;
  auVar19._0_8_ = uVar22;
  auVar7._4_4_ = -(uint)((float)(uVar22 >> 0x20) <= (float)(uVar3 >> 0x20));
  auVar7._0_4_ = -(uint)((float)uVar22 <= (float)uVar3);
  auVar7._8_4_ = 0xffffffff;
  auVar7._12_4_ = 0xffffffff;
  auVar8._8_8_ = 0;
  auVar8._0_8_ = uVar3;
  auVar24 = blendvps(auVar19,auVar8,auVar7);
  *(longlong *)(lVar5 + 0x130) = auVar24._0_8_;
  FUN_7ff70c83ade0();
  lVar15 = _DAT_7ff70cc1a3c0;
  if (((*(byte *)(lVar10 + 0x27b4) & 0x40) != 0) && (iVar4 = *piVar16, (longlong)iVar4 != 0)) {
    lVar5 = *(longlong *)(piVar16 + 2);
    lVar18 = 0;
    do {
      iVar12 = *(int *)(lVar5 + lVar18);
      if (iVar12 == 1) {
        if ((*(byte *)(lVar15 + 0x27b4) & 0x40) != 0) {
          cVar11 = *(char *)(lVar5 + 4 + lVar18);
          puVar17 = &UNK_7ff70cb83c46;
          if (cVar11 != '\0') {
            puVar17 = &UNK_7ff70cb84f7c;
          }
          FUN_7ff70c800cf0(&UNK_7ff70cb91912,&UNK_7ff70cb815c6,cVar11,puVar17);
          iVar12 = *(int *)(lVar5 + lVar18);
          goto LAB_7ff70c8a0819;
        }
      }
      else {
LAB_7ff70c8a0819:
        if ((iVar12 == 2) && ((*(byte *)(lVar15 + 0x27b4) & 0x40) != 0)) {
          iStack_a0 = (int)*(char *)(lVar5 + 5 + lVar18);
          uStack_b8 = *(undefined8 *)(lVar5 + 8 + lVar18);
          uStack_b0 = *(undefined8 *)(lVar5 + 0x10 + lVar18);
          uStack_a8 = (uint)*(byte *)(lVar5 + 4 + lVar18);
          FUN_7ff70c800cf0(&UNK_7ff70cb919cb,&UNK_7ff70cb815c6);
        }
      }
      lVar18 = lVar18 + 0x18;
    } while ((longlong)iVar4 * 0x18 != lVar18);
  }
  piVar16[0xc] = 0;
  piVar16[0xd] = 0;
  iVar4 = *(int *)(lVar10 + 0x23a0);
  *(int *)(lVar10 + 0x23a0) = iVar4 + -1;
  if ((longlong)iVar4 < 2) {
    lVar15 = 0;
  }
  else {
    lVar15 = (longlong)iVar4 * 0x60 + *(longlong *)(lVar10 + 0x23b0) + -0xc0;
  }
  *(longlong *)(lVar10 + 0x2398) = lVar15;
  if (_DAT_7ff70cbebd80 == (uStack_70 ^ (ulonglong)auStack_d8)) {
    return piVar16;
  }
  FUN_7ff70caa97e0(uStack_70 ^ (ulonglong)auStack_d8);
  pcVar6 = (code *)swi(3);
  piVar16 = (int *)(*pcVar6)();
  return piVar16;
}


