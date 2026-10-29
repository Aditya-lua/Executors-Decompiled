/* 7ff70c846f80 FUN_7ff70c846f80 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c846f80(uint param_1,byte param_2,int param_3)

{
  longlong lVar1;
  float fVar2;
  float fVar3;
  code *pcVar4;
  bool bVar5;
  uint uVar6;
  double dVar7;
  uint uVar8;
  longlong lVar9;
  ulonglong uVar10;
  bool bVar11;
  bool bVar12;
  float fVar13;
  float fVar14;
  float fVar15;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auStack_38 [40];
  ulonglong uStack_10;
  
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  bVar11 = (param_1 & 0xf000) != 0;
  bVar12 = POPCOUNT(param_1) == 1;
  uVar8 = param_1;
  if (bVar12 && bVar11) {
    uVar6 = 0;
    for (; (uVar8 & 1) == 0; uVar8 = uVar8 >> 1 | 0x80000000) {
      uVar6 = uVar6 + 1;
    }
    uVar8 = uVar6 + 0x28b;
    if ((uVar6 & 0x1c) != 0xc) {
      uVar8 = param_1;
    }
  }
  if ((*(char *)(_DAT_7ff70cc1a3c0 + -0x1efc + (longlong)(int)uVar8 * 0x10) == '\x01') &&
     (fVar2 = *(float *)((longlong)(int)uVar8 * 0x10 + _DAT_7ff70cc1a3c0 + -0x1ef8), 0.0 <= fVar2))
  {
    bVar5 = fVar2 == 0.0;
    uVar10 = 0;
    if ((param_2 == 0) || ((fVar2 == 0.0 && (!NAN(fVar2))))) goto LAB_7ff70c84713a;
    fVar13 = *(float *)(_DAT_7ff70cc1a3c0 + 0x74);
    if ((param_2 & 0xe) == 8) {
      fVar13 = fVar13 * _DAT_7ff70cb1d960;
      fVar14 = *(float *)(_DAT_7ff70cc1a3c0 + 0x78) * _DAT_7ff70cb1d964;
    }
    else if ((param_2 & 0xe) == 4) {
      fVar13 = fVar13 * _DAT_7ff70cb1d960;
      fVar14 = *(float *)(_DAT_7ff70cc1a3c0 + 0x78) * _DAT_7ff70cb1d86c;
    }
    else {
      fVar14 = *(float *)(_DAT_7ff70cc1a3c0 + 0x78);
    }
    if (fVar13 < fVar2) {
      uVar8 = param_1;
      if (bVar12 && bVar11) {
        uVar6 = 0;
        for (; (uVar8 & 1) == 0; uVar8 = uVar8 >> 1 | 0x80000000) {
          uVar6 = uVar6 + 1;
        }
        uVar8 = uVar6 + 0x28b;
        if ((uVar6 & 0x1c) != 0xc) {
          uVar8 = param_1;
        }
      }
      if (*(char *)(_DAT_7ff70cc1a3c0 + -0x1efc + (longlong)(int)uVar8 * 0x10) == '\x01') {
        lVar9 = (longlong)(int)uVar8 * 0x10 + _DAT_7ff70cc1a3c0;
        fVar3 = *(float *)(lVar9 + -0x1ef8);
        uVar10 = CONCAT71((int7)((ulonglong)lVar9 >> 8),1);
        bVar5 = true;
        if ((fVar3 != 0.0) || (NAN(fVar3))) {
          fVar15 = fVar3 - *(float *)(_DAT_7ff70cc1a3c0 + 0x20);
          if (fVar3 <= fVar15) goto LAB_7ff70c84725e;
          if (fVar14 <= 0.0) {
            bVar5 = fVar13 <= fVar3 && fVar15 < fVar13;
            uVar10 = (ulonglong)-(uint)bVar5;
          }
          else {
            auVar16 = insertps(ZEXT416((uint)fVar3),ZEXT416((uint)fVar15),0x10);
            auVar17._0_4_ = auVar16._0_4_ - fVar13;
            auVar17._4_4_ = auVar16._4_4_ - fVar13;
            auVar17._8_4_ = auVar16._8_4_ - 0.0;
            auVar17._12_4_ = auVar16._12_4_ - 0.0;
            auVar16._4_4_ = fVar14;
            auVar16._0_4_ = fVar14;
            auVar16._8_8_ = 0;
            auVar16 = divps(auVar17,auVar16);
            bVar5 = ((int)((uint)(fVar15 < fVar13) << 0x1f) >> 0x1f | (int)auVar16._4_4_) <
                    ((int)((uint)(fVar3 < fVar13) << 0x1f) >> 0x1f | (int)auVar16._0_4_);
            uVar10 = (ulonglong)-(uint)bVar5;
          }
        }
        if (((param_2 & 0xf0) != 0) && (bVar5)) {
          dVar7 = (*(double *)(_DAT_7ff70cc1a3c0 + 0x1380) - (double)fVar2) + _DAT_7ff70cb1d968;
          uVar10 = CONCAT71((int7)(uVar10 >> 8),1);
          bVar5 = true;
          if (((param_2 & 0x20) != 0) && (dVar7 < *(double *)(_DAT_7ff70cc1a3c0 + 0x1508))) {
            uVar10 = 0;
            bVar5 = false;
          }
          if (((param_2 & 0x40) != 0) && (dVar7 < *(double *)(_DAT_7ff70cc1a3c0 + 0x1510))) {
            uVar10 = 0;
            bVar5 = false;
          }
          if (((char)param_2 < '\0') && (dVar7 < *(double *)(_DAT_7ff70cc1a3c0 + 0x1518)))
          goto LAB_7ff70c84725e;
        }
LAB_7ff70c84713a:
        if (bVar5) {
          if (0x9a < param_1 - 0x200) {
            lVar9 = CONCAT71((int7)(uVar10 >> 8),1);
            if (POPCOUNT(param_1) != 1) goto LAB_7ff70c847260;
            uVar8 = 0;
            for (uVar6 = param_1; (uVar6 & 1) == 0; uVar6 = uVar6 >> 1 | 0x80000000) {
              uVar8 = uVar8 + 1;
            }
            if ((uVar8 & 0x1c) != 0xc) goto LAB_7ff70c847260;
          }
          if ((((*(char *)(_DAT_7ff70cc1a3c0 + 0x1dd4) != '\x01') || (0x77 < param_1 - 0x200)) ||
              (param_3 == 0)) || (param_3 == *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4))) {
            uVar8 = param_1;
            if (bVar12 && bVar11) {
              uVar6 = 0;
              for (; (uVar8 & 1) == 0; uVar8 = uVar8 >> 1 | 0x80000000) {
                uVar6 = uVar6 + 1;
              }
              uVar8 = uVar6 + 0x28b;
              if ((uVar6 & 0x1c) != 0xc) {
                uVar8 = param_1;
              }
            }
            lVar9 = (longlong)(int)uVar8 * 3;
            lVar1 = _DAT_7ff70cc1a3c0 + (longlong)(int)uVar8 * 0xc;
            if (param_3 == 0) {
              lVar9 = CONCAT71((int7)((ulonglong)lVar9 >> 8),*(char *)(lVar1 + -0x2c4) == '\0');
            }
            else if ((*(int *)(lVar1 + -0x2cc) == param_3) ||
                    ((lVar9 = 0, *(int *)(lVar1 + -0x2cc) == -1 &&
                     (*(char *)(lVar1 + -0x2c4) == '\0')))) {
              lVar9 = CONCAT71((int7)((ulonglong)lVar9 >> 8),1);
            }
            goto LAB_7ff70c847260;
          }
        }
      }
    }
  }
LAB_7ff70c84725e:
  lVar9 = 0;
LAB_7ff70c847260:
  if (_DAT_7ff70cbebd80 == (uStack_10 ^ (ulonglong)auStack_38)) {
    return lVar9;
  }
  FUN_7ff70caa97e0(uStack_10 ^ (ulonglong)auStack_38);
  pcVar4 = (code *)swi(3);
  lVar9 = (*pcVar4)();
  return lVar9;
}


