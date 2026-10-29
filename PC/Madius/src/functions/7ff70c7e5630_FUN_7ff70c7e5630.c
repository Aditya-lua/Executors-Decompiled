/* 7ff70c7e5630 FUN_7ff70c7e5630 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c7e5630(longlong *param_1,float param_2,undefined8 param_3)

{
  float fVar1;
  uint uVar2;
  longlong lVar3;
  longlong lVar4;
  longlong lVar5;
  code *pcVar6;
  undefined4 uVar7;
  longlong *plVar8;
  longlong lVar9;
  longlong lVar10;
  longlong lVar11;
  uint uVar12;
  longlong lVar13;
  longlong lVar14;
  undefined4 in_XMM2_Dc;
  undefined4 in_XMM2_Dd;
  float fVar15;
  float fVar16;
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auStack_88 [32];
  undefined4 uStack_68;
  undefined4 uStack_5c;
  float fStack_58;
  float fStack_54;
  ulonglong uStack_50;
  
  auVar17._8_4_ = in_XMM2_Dc;
  auVar17._0_8_ = param_3;
  auVar17._12_4_ = in_XMM2_Dd;
  uStack_50 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  lVar11 = *param_1;
  fVar15 = (float)(int)(param_2 + _DAT_7ff70cb1ba70);
  auVar18._4_4_ = (int)((ulonglong)param_3 >> 0x20);
  auVar18._0_4_ = -(uint)((float)param_3 < 0.0);
  auVar18._8_4_ = in_XMM2_Dc;
  auVar18._12_4_ = in_XMM2_Dd;
  auVar18 = blendvps(auVar17,ZEXT416(*(uint *)((longlong)param_1 + 0x14)),auVar18);
  fVar16 = auVar18._0_4_;
  if (lVar11 != 0) {
    if ((*(float *)(lVar11 + 0x14) == fVar15) && (!NAN(*(float *)(lVar11 + 0x14)) && !NAN(fVar15)))
    {
      if ((*(float *)(lVar11 + 0x18) == fVar16) && (!NAN(*(float *)(lVar11 + 0x18)) && !NAN(fVar16))
         ) goto LAB_7ff70c7e56fe;
    }
  }
  lVar3 = param_1[1];
  lVar4 = *(longlong *)(lVar3 + 0x2b0);
  uStack_5c = (undefined4)param_1[3];
  fStack_58 = fVar15;
  fStack_54 = fVar16;
  uVar7 = FUN_7ff70c802e60(&uStack_5c,0xc,0);
  plVar8 = (longlong *)FUN_7ff70c805430(*(longlong *)(lVar3 + 0x2b0) + 0xd8,uVar7,0);
  lVar11 = *plVar8;
  if (*plVar8 != 0) goto LAB_7ff70c7e56f1;
  if (((*(byte *)(param_1 + 2) & 8) == 0) && (*(char *)(lVar3 + 0x50) != '\x01')) {
LAB_7ff70c7e58be:
    uStack_68 = uVar7;
    lVar11 = FUN_7ff70c7e7790(lVar3,param_1,fVar15,fVar16);
    *plVar8 = lVar11;
    if (lVar11 == 0) {
LAB_7ff70c7e58df:
      lVar11 = 0;
      goto LAB_7ff70c7e56fe;
    }
  }
  else {
    uVar2 = *(uint *)(*(longlong *)(lVar3 + 0x2b0) + 0xc0);
    if ((int)uVar2 < 1) {
LAB_7ff70c7e58b8:
      if (*(char *)(lVar3 + 0x50) == '\0') goto LAB_7ff70c7e58be;
      goto LAB_7ff70c7e58df;
    }
    lVar5 = *(longlong *)(*(longlong *)(lVar3 + 0x2b0) + 0xd0);
    uVar12 = 0;
    lVar11 = 0;
    lVar10 = 0;
    do {
      lVar13 = *(longlong *)(lVar5 + (ulonglong)(uVar12 >> 5) * 8);
      lVar14 = (ulonglong)(uVar12 & 0x1f) * 0x68;
      lVar9 = lVar10;
      if ((*(longlong **)(lVar13 + 0x58 + lVar14) == param_1) &&
         (lVar13 = lVar13 + lVar14, (*(byte *)(lVar13 + 0x4f) & 4) == 0)) {
        if ((*(float *)(lVar13 + 0x18) == fVar16) &&
           (!NAN(*(float *)(lVar13 + 0x18)) && !NAN(fVar16))) {
          fVar1 = *(float *)(lVar13 + 0x14);
          if ((fVar15 < fVar1) && ((lVar11 == 0 || (fVar1 < *(float *)(lVar11 + 0x14))))) {
            lVar11 = lVar13;
          }
          if (((fVar1 < fVar15) && (lVar9 = lVar13, lVar10 != 0)) &&
             (fVar1 < *(float *)(lVar10 + 0x14) || fVar1 == *(float *)(lVar10 + 0x14))) {
            lVar9 = lVar10;
          }
        }
      }
      uVar12 = uVar12 + 1;
      lVar10 = lVar9;
    } while (uVar2 != uVar12);
    if (lVar11 == 0) {
      lVar11 = lVar9;
      if (lVar9 == 0) {
        uVar12 = 0;
        lVar11 = 0;
        lVar10 = 0;
        do {
          lVar13 = *(longlong *)(lVar5 + (ulonglong)(uVar12 >> 5) * 8);
          lVar14 = (ulonglong)(uVar12 & 0x1f) * 0x68;
          lVar9 = lVar10;
          if ((*(longlong **)(lVar13 + 0x58 + lVar14) == param_1) &&
             (lVar13 = lVar13 + lVar14, (*(byte *)(lVar13 + 0x4f) & 4) == 0)) {
            fVar1 = *(float *)(lVar13 + 0x14);
            if ((fVar15 < fVar1) && ((lVar11 == 0 || (fVar1 < *(float *)(lVar11 + 0x14))))) {
              lVar11 = lVar13;
            }
            if (((fVar1 < fVar15) && (lVar9 = lVar13, lVar10 != 0)) &&
               (fVar1 < *(float *)(lVar10 + 0x14) || fVar1 == *(float *)(lVar10 + 0x14))) {
              lVar9 = lVar10;
            }
          }
          uVar12 = uVar12 + 1;
          lVar10 = lVar9;
        } while (uVar2 != uVar12);
        if (lVar11 != 0) goto LAB_7ff70c7e57e0;
        lVar11 = lVar9;
        if (lVar9 == 0) goto LAB_7ff70c7e58b8;
      }
    }
    else {
LAB_7ff70c7e57e0:
      if ((lVar9 != 0) &&
         ((*(float *)(lVar11 + 0x14) < fVar15 + fVar15 ||
          (*(float *)(lVar9 + 0x14) <= _DAT_7ff70cb1ba70 * fVar15)))) {
        lVar11 = lVar9;
      }
    }
  }
LAB_7ff70c7e56f1:
  *(undefined4 *)(lVar11 + 0x50) = *(undefined4 *)(lVar4 + 0xa4);
  *param_1 = lVar11;
LAB_7ff70c7e56fe:
  if (_DAT_7ff70cbebd80 != (uStack_50 ^ (ulonglong)auStack_88)) {
    FUN_7ff70caa97e0(uStack_50 ^ (ulonglong)auStack_88);
    pcVar6 = (code *)swi(3);
    lVar11 = (*pcVar6)();
    return lVar11;
  }
  return lVar11;
}


