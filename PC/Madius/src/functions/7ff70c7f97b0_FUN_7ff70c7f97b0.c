/* 7ff70c7f97b0 FUN_7ff70c7f97b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

float * FUN_7ff70c7f97b0(undefined8 *param_1,float *param_2,float param_3,float param_4,
                        float param_5,char *param_6,char *param_7,undefined8 *param_8)

{
  uint uVar1;
  longlong lVar2;
  longlong lVar3;
  longlong lVar4;
  code *pcVar5;
  undefined1 auVar6 [16];
  char cVar7;
  float fVar8;
  int iVar9;
  longlong lVar10;
  undefined8 *puVar11;
  char *pcVar12;
  uint *puVar13;
  float *pfVar14;
  ulonglong uVar15;
  uint uVar16;
  uint *puVar17;
  longlong lVar18;
  char *pcVar19;
  uint *puVar20;
  uint *puVar21;
  float fVar22;
  float fVar23;
  float fVar24;
  undefined1 auVar25 [16];
  undefined1 auStack_f8 [32];
  float fStack_d8;
  uint uStack_d0;
  float fStack_cc;
  float fStack_c8;
  float fStack_c4;
  ulonglong uStack_c0;
  
  uStack_c0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_f8;
  if (param_7 == (char *)0x0) {
    lVar10 = FUN_7ff70cb12e80(param_6);
    param_7 = param_6 + lVar10;
  }
  puVar13 = (uint *)*param_1;
  fVar23 = (float)(int)(_DAT_7ff70cb1ba70 + param_3);
  fVar24 = *(float *)((longlong)param_1 + 0x14);
  if (puVar13 != (uint *)0x0) {
    if (((float)puVar13[5] == fVar23) && (!NAN((float)puVar13[5]) && !NAN(fVar23))) {
      if (((float)puVar13[6] == fVar24) && (!NAN((float)puVar13[6]) && !NAN(fVar24)))
      goto LAB_7ff70c7f98d6;
    }
  }
  lVar10 = param_1[1];
  lVar2 = *(longlong *)(lVar10 + 0x2b0);
  fStack_cc = *(float *)(param_1 + 3);
  fStack_c8 = fVar23;
  fStack_c4 = fVar24;
  fVar8 = (float)FUN_7ff70c802e60(&fStack_cc,0xc,0);
  puVar11 = (undefined8 *)FUN_7ff70c805430(*(longlong *)(lVar10 + 0x2b0) + 0xd8,fVar8,0);
  puVar13 = (uint *)*puVar11;
  if ((uint *)*puVar11 != (uint *)0x0) goto LAB_7ff70c7f98c8;
  if (((*(byte *)(param_1 + 2) & 8) == 0) && (*(char *)(lVar10 + 0x50) != '\x01')) {
LAB_7ff70c7f9cf3:
    fStack_d8 = fVar8;
    puVar13 = (uint *)FUN_7ff70c7e7790(lVar10,param_1,fVar23,fVar24);
    *puVar11 = puVar13;
    if (puVar13 == (uint *)0x0) {
LAB_7ff70c7f9d1d:
      puVar13 = (uint *)0x0;
      goto LAB_7ff70c7f98d6;
    }
  }
  else {
    uVar1 = *(uint *)(*(longlong *)(lVar10 + 0x2b0) + 0xc0);
    if ((int)uVar1 < 1) {
LAB_7ff70c7f9ceb:
      if (*(char *)(lVar10 + 0x50) == '\0') goto LAB_7ff70c7f9cf3;
      goto LAB_7ff70c7f9d1d;
    }
    lVar3 = *(longlong *)(*(longlong *)(lVar10 + 0x2b0) + 0xd0);
    uVar16 = 0;
    puVar13 = (uint *)0x0;
    puVar21 = (uint *)0x0;
    do {
      lVar4 = *(longlong *)(lVar3 + (ulonglong)(uVar16 >> 5) * 8);
      lVar18 = (ulonglong)(uVar16 & 0x1f) * 0x68;
      puVar20 = puVar21;
      if ((*(undefined8 **)(lVar4 + 0x58 + lVar18) == param_1) &&
         (puVar17 = (uint *)(lVar4 + lVar18), (*(byte *)((longlong)puVar17 + 0x4f) & 4) == 0)) {
        if (((float)puVar17[6] == fVar24) && (!NAN((float)puVar17[6]) && !NAN(fVar24))) {
          fVar22 = (float)puVar17[5];
          if ((fVar23 < fVar22) && ((puVar13 == (uint *)0x0 || (fVar22 < (float)puVar13[5])))) {
            puVar13 = puVar17;
          }
          if (((fVar22 < fVar23) && (puVar20 = puVar17, puVar21 != (uint *)0x0)) &&
             (fVar22 < (float)puVar21[5] || fVar22 == (float)puVar21[5])) {
            puVar20 = puVar21;
          }
        }
      }
      uVar16 = uVar16 + 1;
      puVar21 = puVar20;
    } while (uVar1 != uVar16);
    if (puVar13 == (uint *)0x0) {
      puVar13 = puVar20;
      if (puVar20 == (uint *)0x0) {
        uVar16 = 0;
        puVar13 = (uint *)0x0;
        puVar21 = (uint *)0x0;
        do {
          lVar4 = *(longlong *)(lVar3 + (ulonglong)(uVar16 >> 5) * 8);
          lVar18 = (ulonglong)(uVar16 & 0x1f) * 0x68;
          puVar20 = puVar21;
          if ((*(undefined8 **)(lVar4 + 0x58 + lVar18) == param_1) &&
             (puVar17 = (uint *)(lVar4 + lVar18), (*(byte *)((longlong)puVar17 + 0x4f) & 4) == 0)) {
            fVar22 = (float)puVar17[5];
            if ((fVar23 < fVar22) && ((puVar13 == (uint *)0x0 || (fVar22 < (float)puVar13[5])))) {
              puVar13 = puVar17;
            }
            if (((fVar22 < fVar23) && (puVar20 = puVar17, puVar21 != (uint *)0x0)) &&
               (fVar22 < (float)puVar21[5] || fVar22 == (float)puVar21[5])) {
              puVar20 = puVar21;
            }
          }
          uVar16 = uVar16 + 1;
          puVar21 = puVar20;
        } while (uVar1 != uVar16);
        if (puVar13 != (uint *)0x0) goto LAB_7ff70c7f9c14;
        puVar13 = puVar20;
        if (puVar20 == (uint *)0x0) goto LAB_7ff70c7f9ceb;
      }
    }
    else {
LAB_7ff70c7f9c14:
      if ((puVar20 != (uint *)0x0) &&
         (((float)puVar13[5] < fVar23 + fVar23 || ((float)puVar20[5] <= _DAT_7ff70cb1ba70 * fVar23))
         )) {
        puVar13 = puVar20;
      }
    }
  }
LAB_7ff70c7f98c8:
  puVar13[0x14] = *(uint *)(lVar2 + 0xa4);
  *param_1 = puVar13;
LAB_7ff70c7f98d6:
  fVar24 = (float)puVar13[5];
  param_2[0] = 0.0;
  fVar23 = _DAT_7ff70cb1c640;
  param_2[1] = 0.0;
  auVar25 = ZEXT816(0);
  if (param_6 < param_7) {
    pcVar12 = (char *)0x0;
    do {
      fVar8 = auVar25._0_4_;
      if (param_5 <= 0.0) {
LAB_7ff70c7f9965:
        uStack_d0 = (uint)*param_6;
        uVar15 = (ulonglong)uStack_d0;
        if (*param_6 < '\0') {
          iVar9 = FUN_7ff70c7ff3d0(&uStack_d0,param_6,param_7);
          pcVar19 = param_6 + iVar9;
          uVar15 = (ulonglong)uStack_d0;
          if (uStack_d0 < 0x20) goto LAB_7ff70c7f999f;
LAB_7ff70c7f99b1:
          if ((*puVar13 <= (uint)uVar15) ||
             (fVar22 = *(float *)(*(longlong *)(puVar13 + 2) + uVar15 * 4), fVar22 < 0.0)) {
            if (fVar23 <= (float)puVar13[5]) {
              fStack_cc = 0.0;
              lVar10 = FUN_7ff70c7f86d0(puVar13,uVar15,&fStack_cc);
              pfVar14 = (float *)(lVar10 + 4);
              if (lVar10 == 0) {
                pfVar14 = &fStack_cc;
              }
            }
            else {
              lVar10 = FUN_7ff70c7f86d0(puVar13,uVar15,0);
              pfVar14 = (float *)(lVar10 + 4);
              if (lVar10 == 0) {
                pfVar14 = (float *)(puVar13 + 4);
              }
            }
            fVar22 = *pfVar14;
          }
          fVar8 = fVar22 * (param_3 / fVar24) + fVar8;
          if (param_4 <= fVar8) break;
        }
        else {
          pcVar19 = param_6 + 1;
          if (0x1f < uStack_d0) goto LAB_7ff70c7f99b1;
LAB_7ff70c7f999f:
          if ((int)uVar15 == 0xd) goto LAB_7ff70c7f9941;
          if ((int)uVar15 != 10) goto LAB_7ff70c7f99b1;
          auVar6._4_4_ = 0;
          auVar6._0_4_ = -(uint)(fVar8 <= *param_2);
          auVar6._8_4_ = auVar25._8_4_;
          auVar6._12_4_ = auVar25._12_4_;
          auVar25 = blendvps(auVar25,ZEXT416((uint)*param_2),auVar6);
          *param_2 = auVar25._0_4_;
          param_2[1] = param_2[1] + param_3;
          fVar8 = 0.0;
        }
        auVar25 = ZEXT416((uint)fVar8);
      }
      else {
        if (pcVar12 == (char *)0x0) {
          fStack_d8 = param_5 - fVar8;
          pcVar12 = (char *)FUN_7ff70c7f9270(param_1,param_3,param_6,param_7);
        }
        if (param_6 < pcVar12) goto LAB_7ff70c7f9965;
        if (*param_2 <= fVar8 && fVar8 != *param_2) {
          *param_2 = fVar8;
        }
        param_2[1] = param_2[1] + param_3;
        do {
          cVar7 = *param_6;
          if ((cVar7 != ' ') && (cVar7 != '\t')) goto LAB_7ff70c7f9aa5;
          param_6 = param_6 + 1;
        } while (param_6 != param_7);
        cVar7 = *param_7;
        param_6 = param_7;
LAB_7ff70c7f9aa5:
        pcVar19 = param_6 + (cVar7 == '\n');
        auVar25 = ZEXT816(0);
        pcVar12 = (char *)0x0;
      }
LAB_7ff70c7f9941:
      param_6 = pcVar19;
    } while (pcVar19 < param_7);
  }
  fVar24 = auVar25._0_4_;
  if (*param_2 <= fVar24 && fVar24 != *param_2) {
    *param_2 = fVar24;
  }
  fVar23 = param_2[1];
  if ((0.0 < fVar24) || ((fVar23 == 0.0 && (!NAN(fVar23))))) {
    param_2[1] = param_3 + fVar23;
  }
  if (param_8 != (undefined8 *)0x0) {
    *param_8 = param_6;
  }
  if (_DAT_7ff70cbebd80 != (uStack_c0 ^ (ulonglong)auStack_f8)) {
    FUN_7ff70caa97e0(uStack_c0 ^ (ulonglong)auStack_f8);
    pcVar5 = (code *)swi(3);
    pfVar14 = (float *)(*pcVar5)();
    return pfVar14;
  }
  return param_2;
}


