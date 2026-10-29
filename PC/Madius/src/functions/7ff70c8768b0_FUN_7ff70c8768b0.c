/* 7ff70c8768b0 FUN_7ff70c8768b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8768b0(undefined *param_1,undefined *param_2,ulonglong param_3)

{
  float fVar1;
  longlong lVar2;
  code *pcVar3;
  longlong lVar4;
  char cVar5;
  longlong lVar6;
  undefined *puVar7;
  int iVar8;
  int iVar9;
  float fVar10;
  undefined4 uVar11;
  float fVar12;
  float fVar13;
  float fVar14;
  undefined1 auVar15 [16];
  undefined1 auStack_e8 [32];
  undefined4 uStack_c8;
  float afStack_c0 [2];
  float fStack_b8;
  float fStack_b4;
  undefined8 uStack_b0;
  float fStack_a8;
  float fStack_a4;
  ulonglong uStack_a0;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_a0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_e8;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar2 = *(longlong *)(lVar4 + 0x1440);
  if (*(char *)(lVar2 + 0xd1) == '\0') {
    if (param_1 == param_2) {
      param_1 = &UNK_7ff70cb923a7;
      param_2 = &UNK_7ff70cb923a7;
    }
    if (param_2 == (undefined *)0x0) {
      lVar6 = FUN_7ff70cb12e80(param_1);
      param_2 = param_1 + lVar6;
    }
    fVar1 = *(float *)(lVar2 + 0x118);
    fVar12 = *(float *)(lVar2 + 0x11c) + *(float *)(lVar2 + 0x150);
    if (((longlong)param_2 - (longlong)param_1 < 0x7d1) ||
       (fVar14 = 0.0, 0.0 <= *(float *)(lVar2 + 0x1ec))) {
      uVar11 = 0;
      if (0.0 <= *(float *)(lVar2 + 0x1ec)) {
        uVar11 = FUN_7ff70c819230(lVar2 + 0x118);
      }
      uStack_c8 = uVar11;
      FUN_7ff70c80cf40(&fStack_a8,param_1,param_2,0);
      auVar15 = insertps(ZEXT416((uint)fVar1),ZEXT416((uint)fVar12),0x10);
      uStack_b0 = CONCAT44(auVar15._4_4_ + (float)((ulonglong)_fStack_a8 >> 0x20),
                           auVar15._0_4_ + (float)_fStack_a8);
      fStack_b8 = fVar1;
      fStack_b4 = fVar12;
      FUN_7ff70c8375f0(&fStack_a8);
      cVar5 = FUN_7ff70c837800(&fStack_b8,0,0,0);
      if (cVar5 != '\0') {
        FUN_7ff70c80ca80(CONCAT44(fStack_b4,fStack_b8),param_1,param_2,uVar11);
      }
    }
    else {
      fVar10 = (float)FUN_7ff70c84c080();
      fStack_a8 = 0.0;
      fStack_a4 = 0.0;
      fVar13 = fVar12;
      if ((*(char *)(lVar4 + 0x2720) == '\0') &&
         (iVar9 = (int)((*(float *)(lVar2 + 0x264) - fVar12) / fVar10), 0 < iVar9)) {
        iVar8 = 0;
        fVar14 = 0.0;
        if (param_1 < param_2) {
          if ((param_3 & 1) == 0) {
            iVar8 = 0;
            do {
              puVar7 = (undefined *)
                       FUN_7ff70cb12b40(param_1,10,(longlong)param_2 - (longlong)param_1);
              if (puVar7 == (undefined *)0x0) {
                puVar7 = param_2;
              }
              uStack_c8 = 0xbf800000;
              FUN_7ff70c80cf40(&fStack_b8,param_1,puVar7,0);
              auVar15 = blendvps(ZEXT416((uint)fStack_b8),ZEXT416((uint)fStack_a8),
                                 ZEXT416(-(uint)(fStack_b8 <= fStack_a8)));
              fStack_a8 = auVar15._0_4_;
              param_1 = puVar7 + 1;
              iVar8 = iVar8 + 1;
              fVar14 = fStack_a8;
            } while ((param_1 < param_2) && (iVar8 < iVar9));
          }
          else {
            iVar8 = 0;
            do {
              param_1 = (undefined *)
                        FUN_7ff70cb12b40(param_1,10,(longlong)param_2 - (longlong)param_1);
              if (param_1 == (undefined *)0x0) {
                param_1 = param_2;
              }
              param_1 = param_1 + 1;
              iVar8 = iVar8 + 1;
            } while ((param_1 < param_2) && (iVar8 < iVar9));
          }
        }
        fVar13 = (float)iVar8 * fVar10 + fVar12;
      }
      if (param_1 < param_2) {
        uStack_b0._4_4_ = fVar10 + fVar13;
        uStack_b0._0_4_ = _DAT_7ff70cb1c5d8 + fVar1;
        fStack_b8 = fVar1;
        fStack_b4 = fVar13;
        do {
          cVar5 = FUN_7ff70c819100(&fStack_b8,0);
          if (cVar5 != '\0') break;
          puVar7 = (undefined *)FUN_7ff70cb12b40(param_1,10,(longlong)param_2 - (longlong)param_1);
          if (puVar7 == (undefined *)0x0) {
            puVar7 = param_2;
          }
          uStack_c8 = 0xbf800000;
          FUN_7ff70c80cf40(afStack_c0,param_1,puVar7,0);
          auVar15 = blendvps(ZEXT416((uint)afStack_c0[0]),ZEXT416((uint)fStack_a8),
                             ZEXT416(-(uint)(afStack_c0[0] <= fStack_a8)));
          fStack_a8 = auVar15._0_4_;
          FUN_7ff70c80c6b0(CONCAT44(fVar13,fVar1),param_1,puVar7);
          param_1 = puVar7 + 1;
          fStack_b4 = fStack_b4 + fVar10;
          uStack_b0._4_4_ = uStack_b0._4_4_ + fVar10;
          fVar13 = fVar13 + fVar10;
        } while (param_1 < param_2);
        iVar9 = 0;
        if (param_1 < param_2) {
          if ((param_3 & 1) == 0) {
            iVar9 = 0;
            do {
              puVar7 = (undefined *)
                       FUN_7ff70cb12b40(param_1,10,(longlong)param_2 - (longlong)param_1);
              if (puVar7 == (undefined *)0x0) {
                puVar7 = param_2;
              }
              uStack_c8 = 0xbf800000;
              FUN_7ff70c80cf40(afStack_c0,param_1,puVar7,0);
              auVar15 = blendvps(ZEXT416((uint)afStack_c0[0]),ZEXT416((uint)fStack_a8),
                                 ZEXT416(-(uint)(afStack_c0[0] <= fStack_a8)));
              fStack_a8 = auVar15._0_4_;
              param_1 = puVar7 + 1;
              iVar9 = iVar9 + 1;
            } while (param_1 < param_2);
          }
          else {
            iVar9 = 0;
            do {
              param_1 = (undefined *)
                        FUN_7ff70cb12b40(param_1,10,(longlong)param_2 - (longlong)param_1);
              if (param_1 == (undefined *)0x0) {
                param_1 = param_2;
              }
              param_1 = param_1 + 1;
              iVar9 = iVar9 + 1;
            } while (param_1 < param_2);
          }
        }
        fVar13 = fVar13 + fVar10 * (float)iVar9;
        fVar14 = fStack_a8;
      }
      _fStack_a8 = CONCAT44(fVar13 - fVar12,fStack_a8);
      uStack_b0 = CONCAT44((fVar13 - fVar12) + fVar12,fVar14 + fVar1);
      fStack_b8 = fVar1;
      fStack_b4 = fVar12;
      FUN_7ff70c8375f0(&fStack_a8);
      FUN_7ff70c837800(&fStack_b8,0,0,0);
    }
  }
  if (_DAT_7ff70cbebd80 == (uStack_a0 ^ (ulonglong)auStack_e8)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_a0 ^ (ulonglong)auStack_e8);
  pcVar3 = (code *)swi(3);
  (*pcVar3)();
  return;
}


