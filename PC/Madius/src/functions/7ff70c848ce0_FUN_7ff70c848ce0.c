/* 7ff70c848ce0 FUN_7ff70c848ce0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c848ce0(uint param_1,uint param_2,int param_3)

{
  longlong lVar1;
  float fVar2;
  float fVar3;
  code *pcVar4;
  uint uVar5;
  double dVar6;
  longlong lVar7;
  char cVar8;
  uint uVar9;
  uint uVar10;
  undefined8 uVar11;
  uint uVar12;
  bool bVar13;
  bool bVar14;
  bool bVar15;
  float fVar16;
  float fVar17;
  undefined1 auVar18 [12];
  float fVar19;
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auStack_48 [40];
  ulonglong uStack_20;
  
  uStack_20 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  uVar9 = param_2 | 0x800;
  if ((param_2 & 0x3c00) != 0) {
    uVar9 = param_2;
  }
  if (param_3 + 1U < 2) {
    param_3 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1ddc);
  }
  if (((*(byte *)(_DAT_7ff70cc1a3c0 + 0x1de1) & 4) == 0) &&
     (cVar8 = FUN_7ff70c845e60(param_1,uVar9), lVar7 = _DAT_7ff70cc1a3c0, cVar8 != '\0')) {
    uVar5 = uVar9 | 0x20;
    if ((uVar9 & 0xf1) != 1) {
      uVar5 = uVar9;
    }
    uVar12 = param_1 & 0xffff0fff;
    uVar9 = param_1;
    if (uVar12 - 0x20f < 8) {
      uVar9 = 0x1000;
      if ((uVar12 != 0x20f) && (uVar12 != 0x213)) {
        uVar12 = (param_1 & 0xffff0ffb) - 0x210;
        uVar9 = 0;
        if (uVar12 < 3) {
          uVar9 = *(uint *)(&UNK_7ff70cb1d3f4 + (ulonglong)uVar12 * 4);
        }
      }
      uVar9 = uVar9 | param_1;
    }
    uVar12 = uVar9 & 0xf000;
    if (*(uint *)(_DAT_7ff70cc1a3c0 + 0x100) == uVar12) {
      uVar10 = uVar9 & 0xffff0fff;
      if (((uVar9 & 0xffff0fff) == 0) && (uVar10 = uVar12, POPCOUNT(uVar12) == 1)) {
        uVar9 = 0;
        for (; (uVar10 & 1) == 0; uVar10 = uVar10 >> 1 | 0x80000000) {
          uVar9 = uVar9 + 1;
        }
        uVar10 = uVar9 + 0x28b;
        if ((uVar9 & 0x1c) != 0xc) {
          uVar10 = uVar12;
        }
      }
      bVar13 = (uVar10 & 0xf000) != 0;
      bVar14 = POPCOUNT(uVar10) == 1;
      uVar9 = uVar10;
      if (bVar14 && bVar13) {
        uVar12 = 0;
        for (; (uVar9 & 1) == 0; uVar9 = uVar9 >> 1 | 0x80000000) {
          uVar12 = uVar12 + 1;
        }
        uVar9 = uVar12 + 0x28b;
        if ((uVar12 & 0x1c) != 0xc) {
          uVar9 = uVar10;
        }
      }
      if ((*(char *)(_DAT_7ff70cc1a3c0 + -0x1efc + (longlong)(int)uVar9 * 0x10) == '\x01') &&
         (fVar2 = *(float *)((longlong)(int)uVar9 * 0x10 + _DAT_7ff70cc1a3c0 + -0x1ef8),
         0.0 <= fVar2)) {
        bVar15 = fVar2 == 0.0;
        if (((char)uVar5 == '\0') || ((fVar2 == 0.0 && (!NAN(fVar2))))) goto LAB_7ff70c848fa9;
        fVar16 = *(float *)(_DAT_7ff70cc1a3c0 + 0x74);
        if ((uVar5 & 0xe) == 8) {
          fVar16 = fVar16 * _DAT_7ff70cb1d960;
          auVar18._4_8_ = 0;
          auVar18._0_4_ = *(float *)(_DAT_7ff70cc1a3c0 + 0x78) * _DAT_7ff70cb1d964;
        }
        else if ((uVar5 & 0xe) == 4) {
          fVar16 = fVar16 * _DAT_7ff70cb1d960;
          auVar18._4_8_ = 0;
          auVar18._0_4_ = *(float *)(_DAT_7ff70cc1a3c0 + 0x78) * _DAT_7ff70cb1d86c;
        }
        else {
          auVar18._4_8_ = 0;
          auVar18._0_4_ = *(uint *)(_DAT_7ff70cc1a3c0 + 0x78);
        }
        if (fVar16 < fVar2) {
          uVar9 = uVar10;
          if (bVar14 && bVar13) {
            uVar12 = 0;
            for (; (uVar9 & 1) == 0; uVar9 = uVar9 >> 1 | 0x80000000) {
              uVar12 = uVar12 + 1;
            }
            uVar9 = uVar12 + 0x28b;
            if ((uVar12 & 0x1c) != 0xc) {
              uVar9 = uVar10;
            }
          }
          if (*(char *)(_DAT_7ff70cc1a3c0 + -0x1efc + (longlong)(int)uVar9 * 0x10) == '\x01') {
            fVar3 = *(float *)((longlong)(int)uVar9 * 0x10 + _DAT_7ff70cc1a3c0 + -0x1ef8);
            bVar15 = true;
            if ((fVar3 != 0.0) || (NAN(fVar3))) {
              fVar19 = fVar3 - *(float *)(_DAT_7ff70cc1a3c0 + 0x20);
              if (fVar3 <= fVar19) goto LAB_7ff70c84917c;
              fVar17 = auVar18._0_4_;
              if (fVar17 <= 0.0) {
                bVar15 = fVar16 <= fVar3 && fVar19 < fVar16;
              }
              else {
                auVar20 = insertps(ZEXT416((uint)fVar3),ZEXT416((uint)fVar19),0x10);
                auVar21._0_4_ = auVar20._0_4_ - fVar16;
                auVar21._4_4_ = auVar20._4_4_ - fVar16;
                auVar21._8_4_ = auVar20._8_4_ - 0.0;
                auVar21._12_4_ = auVar20._12_4_ - 0.0;
                auVar20._4_4_ = fVar17;
                auVar20._0_4_ = fVar17;
                auVar20._8_4_ = auVar18._8_4_;
                auVar20._12_4_ = auVar18._8_4_;
                auVar20 = divps(auVar21,auVar20);
                bVar15 = ((int)((uint)(fVar19 < fVar16) << 0x1f) >> 0x1f | (int)auVar20._4_4_) <
                         ((int)((uint)(fVar3 < fVar16) << 0x1f) >> 0x1f | (int)auVar20._0_4_);
              }
            }
            if (((uVar5 & 0xf0) != 0) && (bVar15)) {
              dVar6 = (*(double *)(_DAT_7ff70cc1a3c0 + 0x1380) - (double)fVar2) + _DAT_7ff70cb1d968;
              bVar15 = true;
              if (((uVar5 & 0x20) != 0) && (dVar6 < *(double *)(_DAT_7ff70cc1a3c0 + 0x1508))) {
                bVar15 = false;
              }
              if (((uVar5 & 0x40) != 0) && (dVar6 < *(double *)(_DAT_7ff70cc1a3c0 + 0x1510))) {
                bVar15 = false;
              }
              if (((char)uVar5 < '\0') && (dVar6 < *(double *)(_DAT_7ff70cc1a3c0 + 0x1518)))
              goto LAB_7ff70c84917c;
            }
LAB_7ff70c848fa9:
            if (bVar15) {
              if (uVar10 - 0x200 < 0x9b) {
LAB_7ff70c848fc3:
                if ((((*(char *)(_DAT_7ff70cc1a3c0 + 0x1dd4) == '\x01') && (uVar10 - 0x200 < 0x78))
                    && (param_3 != 0)) && (param_3 != *(int *)(_DAT_7ff70cc1a3c0 + 0x14b4)))
                goto LAB_7ff70c84917c;
                uVar9 = uVar10;
                if (bVar14 && bVar13) {
                  uVar5 = 0;
                  for (; (uVar9 & 1) == 0; uVar9 = uVar9 >> 1 | 0x80000000) {
                    uVar5 = uVar5 + 1;
                  }
                  uVar9 = uVar5 + 0x28b;
                  if ((uVar5 & 0x1c) != 0xc) {
                    uVar9 = uVar10;
                  }
                }
                lVar1 = _DAT_7ff70cc1a3c0 + (longlong)(int)uVar9 * 0xc;
                if (param_3 == 0) {
                  if (*(char *)(lVar1 + -0x2c4) != '\0') goto LAB_7ff70c84917c;
                }
                else if ((*(int *)(lVar1 + -0x2cc) != param_3) &&
                        ((uVar11 = 0, *(int *)(lVar1 + -0x2cc) != -1 ||
                         (*(char *)(lVar1 + -0x2c4) != '\0')))) goto LAB_7ff70c84917e;
              }
              else if (POPCOUNT(uVar10) == 1) {
                uVar9 = 0;
                for (uVar5 = uVar10; (uVar5 & 1) == 0; uVar5 = uVar5 >> 1 | 0x80000000) {
                  uVar9 = uVar9 + 1;
                }
                if ((uVar9 & 0x1c) == 0xc) goto LAB_7ff70c848fc3;
              }
              if ((param_1 & 0x1000) != 0) {
                *(int *)(_DAT_7ff70cc1a3c0 + 0x1c4c) = param_3;
                *(int *)(lVar7 + 0x1c48) = param_3;
                *(undefined2 *)(lVar7 + 0x1c50) = 0;
                lVar7 = _DAT_7ff70cc1a3c0;
              }
              if ((param_1 & 0x2000) != 0) {
                _DAT_7ff70cc1a3c0 = lVar7;
                *(int *)(lVar7 + 0x1c58) = param_3;
                *(int *)(lVar7 + 0x1c54) = param_3;
                *(undefined2 *)(lVar7 + 0x1c5c) = 0;
                lVar7 = _DAT_7ff70cc1a3c0;
              }
              if ((param_1 & 0x4000) != 0) {
                _DAT_7ff70cc1a3c0 = lVar7;
                *(int *)(lVar7 + 0x1c64) = param_3;
                *(int *)(lVar7 + 0x1c60) = param_3;
                *(undefined2 *)(lVar7 + 0x1c68) = 0;
                lVar7 = _DAT_7ff70cc1a3c0;
              }
              uVar11 = 1;
              _DAT_7ff70cc1a3c0 = lVar7;
              if ((short)param_1 < 0) {
                uVar11 = 1;
                *(int *)(lVar7 + 0x1c70) = param_3;
                *(int *)(lVar7 + 0x1c6c) = param_3;
                *(undefined2 *)(lVar7 + 0x1c74) = 0;
              }
              goto LAB_7ff70c84917e;
            }
          }
        }
      }
    }
  }
LAB_7ff70c84917c:
  uVar11 = 0;
LAB_7ff70c84917e:
  if (_DAT_7ff70cbebd80 != (uStack_20 ^ (ulonglong)auStack_48)) {
    FUN_7ff70caa97e0(uStack_20 ^ (ulonglong)auStack_48);
    pcVar4 = (code *)swi(3);
    uVar11 = (*pcVar4)();
    return uVar11;
  }
  return uVar11;
}


