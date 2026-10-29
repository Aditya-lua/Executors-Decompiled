/* 7ff70c853660 FUN_7ff70c853660 */

/* WARNING: Removing unreachable block (ram,0x7ff70c853a78) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

float * FUN_7ff70c853660(float *param_1,float *param_2,undefined8 *param_3,uint *param_4,
                        ulonglong *param_5,float *param_6,uint param_7)

{
  ulonglong uVar1;
  uint uVar2;
  code *pcVar3;
  undefined1 auVar4 [16];
  bool bVar5;
  float *pfVar6;
  uint uVar7;
  uint *puVar8;
  bool bVar9;
  bool bVar10;
  bool bVar11;
  bool bVar12;
  float fVar13;
  float fVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  float fVar17;
  float fVar20;
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  float fVar21;
  float fVar23;
  undefined1 auVar22 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  float fVar26;
  float fVar27;
  float fVar28;
  float fVar29;
  float fVar30;
  float fVar31;
  undefined1 auStack_108 [40];
  ulonglong uStack_e0;
  
  uStack_e0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_108;
  fVar21 = *(float *)((longlong)param_5 + 0xc);
  fVar23 = *(float *)(param_5 + 1);
  fVar26 = (float)*param_3;
  fVar27 = (float)((ulonglong)*param_3 >> 0x20);
  fVar28 = *param_2;
  fVar29 = param_2[1];
  uVar1 = *param_5;
  auVar19._8_8_ = 0;
  auVar19._0_8_ = uVar1;
  fVar20 = (float)(uVar1 >> 0x20);
  fVar17 = fVar21 - fVar27;
  if (fVar29 <= fVar21 - fVar27) {
    fVar17 = fVar29;
  }
  auVar24._4_4_ = fVar20;
  auVar24._0_4_ = fVar20;
  auVar24._8_8_ = 0;
  auVar24 = blendvps(ZEXT416((uint)fVar17),auVar24,ZEXT416(-(uint)(fVar29 < fVar20)));
  fVar29 = fVar23 - fVar26;
  if (fVar28 <= fVar23 - fVar26) {
    fVar29 = fVar28;
  }
  fVar17 = (float)uVar1;
  auVar22 = blendvps(ZEXT416((uint)fVar29),auVar19,ZEXT416(-(uint)(fVar28 < fVar17)));
  if (param_7 == 1) {
    uVar2 = *param_4;
    fVar13 = (float)((ulonglong)*(undefined8 *)(param_6 + 1) >> 0x20) - fVar26;
    fVar14 = (float)*(undefined8 *)(param_6 + 1) - fVar27;
    fVar28 = param_6[3];
    fVar29 = *param_6;
    puVar8 = param_4;
    if (uVar2 == 0xffffffff) {
      puVar8 = (uint *)&UNK_7ff70cb1ce20;
    }
    uVar7 = *puVar8;
    param_1[0] = 0.0;
    param_1[1] = 0.0;
    fVar30 = fVar14;
    fVar31 = fVar13;
    switch(uVar7) {
    case 0:
      *param_1 = fVar13;
      param_1[1] = fVar28;
      fVar30 = fVar28;
      break;
    case 1:
      *param_1 = fVar29;
      param_1[1] = fVar14;
      fVar31 = fVar29;
      break;
    case 2:
      *(ulonglong *)param_1 = CONCAT44(fVar14,fVar13);
      break;
    case 3:
      *param_1 = fVar29;
      param_1[1] = fVar28;
      fVar30 = fVar28;
      fVar31 = fVar29;
      break;
    default:
      fVar31 = 0.0;
      fVar30 = 0.0;
      if (fVar17 <= 0.0) goto code_r0x7ff70c853802;
      goto LAB_7ff70c853826;
    }
    if (fVar31 < fVar17) {
LAB_7ff70c853826:
      uVar7 = *(uint *)(&UNK_7ff70cb1ce20 + (ulonglong)(uVar2 == 0xffffffff) * 4);
      if (uVar7 != uVar2) {
        param_1[0] = 0.0;
        param_1[1] = 0.0;
        if (uVar7 < 4) {
          fVar30 = fVar29;
          switch(uVar2 == 0xffffffff) {
          case false:
            *param_1 = fVar29;
            param_1[1] = fVar28;
            fVar31 = fVar28;
            break;
          case true:
            *param_1 = fVar29;
            param_1[1] = fVar14;
            fVar31 = fVar14;
          }
        }
        else {
          fVar30 = 0.0;
          fVar31 = 0.0;
        }
        if (((fVar17 <= fVar30) && (fVar20 <= fVar31)) &&
           ((fVar30 + fVar26 <= fVar23 && (fVar31 + fVar27 <= fVar21)))) goto LAB_7ff70c85381e;
      }
      uVar7 = *(uint *)(&UNK_7ff70cb1ce24 + (ulonglong)(uVar2 == 0xffffffff) * 4);
      if (uVar7 != uVar2) {
        param_1[0] = 0.0;
        param_1[1] = 0.0;
        if (uVar7 < 4) {
          switch(uVar2 == 0xffffffff) {
          case false:
            *param_1 = fVar29;
            param_1[1] = fVar14;
            fVar30 = fVar14;
            break;
          case true:
            *param_1 = fVar13;
            param_1[1] = fVar28;
            fVar29 = fVar13;
            fVar30 = fVar28;
          }
        }
        else {
          fVar29 = 0.0;
          fVar30 = 0.0;
        }
        if (((fVar17 <= fVar29) && (fVar20 <= fVar30)) &&
           ((fVar29 + fVar26 <= fVar23 && (fVar30 + fVar27 <= fVar21)))) goto LAB_7ff70c85381e;
      }
      uVar7 = *(uint *)(&UNK_7ff70cb1ce28 + (ulonglong)(uVar2 == 0xffffffff) * 4);
      if (uVar7 != uVar2) {
        param_1[0] = 0.0;
        param_1[1] = 0.0;
        if (uVar7 < 4) {
          fVar29 = fVar13;
          switch(uVar2 == 0xffffffff) {
          case false:
            *param_1 = fVar13;
            param_1[1] = fVar28;
            break;
          case true:
            *(ulonglong *)param_1 = CONCAT44(fVar14,fVar13);
            fVar28 = fVar14;
          }
        }
        else {
          fVar29 = 0.0;
          fVar28 = 0.0;
        }
        if ((((fVar17 <= fVar29) && (fVar20 <= fVar28)) && (fVar29 + fVar26 <= fVar23)) &&
           (fVar28 + fVar27 <= fVar21)) goto LAB_7ff70c85381e;
      }
      if ((((uVar2 == 0xffffffff) || (uVar2 == 2)) ||
          ((*(ulonglong *)param_1 = CONCAT44(fVar14,fVar13), fVar13 < fVar17 ||
           ((fVar14 < fVar20 || (fVar23 < fVar26 + fVar13)))))) ||
         (uVar7 = 2, fVar21 < fVar27 + fVar14)) goto LAB_7ff70c853875;
    }
    else {
code_r0x7ff70c853802:
      if (((fVar30 < fVar20) || (fVar23 < fVar31 + fVar26)) || (fVar21 < fVar30 + fVar27))
      goto LAB_7ff70c853826;
    }
LAB_7ff70c85381e:
    *param_4 = uVar7;
    goto LAB_7ff70c853c89;
  }
LAB_7ff70c853875:
  if ((param_7 & 0xfffffffd) != 0) {
LAB_7ff70c853a7d:
    *param_4 = 0xffffffff;
    if (param_7 == 2) {
      *(ulonglong *)param_1 =
           CONCAT44((float)((ulonglong)*(undefined8 *)param_2 >> 0x20) + _UNK_7ff70cb1d684,
                    (float)*(undefined8 *)param_2 + _DAT_7ff70cb1d680);
    }
    else {
      uVar1 = *param_5;
      auVar18._8_8_ = 0;
      auVar18._0_8_ = uVar1;
      fVar21 = (float)*param_3;
      auVar15._0_4_ = (float)*(undefined8 *)param_2 + fVar21;
      fVar23 = (float)((ulonglong)*param_3 >> 0x20);
      auVar15._4_4_ = (float)((ulonglong)*(undefined8 *)param_2 >> 0x20) + fVar23;
      auVar15._8_8_ = 0;
      auVar22._8_8_ = 0;
      auVar22._0_8_ = param_5[1];
      auVar19 = minps(auVar15,auVar22);
      auVar16._0_4_ = auVar19._0_4_ - fVar21;
      auVar16._4_4_ = auVar19._4_4_ - fVar23;
      auVar16._8_4_ = auVar19._8_4_ - 0.0;
      auVar16._12_4_ = auVar19._12_4_ - 0.0;
      auVar25._4_4_ = -(uint)((float)(uVar1 >> 0x20) <= auVar16._4_4_);
      auVar25._0_4_ = -(uint)((float)uVar1 <= auVar16._0_4_);
      auVar25._8_4_ = -(uint)(0.0 <= auVar16._8_4_);
      auVar25._12_4_ = -(uint)(0.0 <= auVar16._12_4_);
      auVar19 = blendvps(auVar18,auVar16,auVar25);
      *(longlong *)param_1 = auVar19._0_8_;
    }
    goto LAB_7ff70c853c89;
  }
  uVar2 = *param_4;
  bVar9 = uVar2 != 0xffffffff;
  fVar28 = *param_6;
  puVar8 = (uint *)&UNK_7ff70cb1ce30;
  if (bVar9) {
    puVar8 = param_4;
  }
  uVar7 = *puVar8;
  bVar10 = uVar7 == 0;
  fVar29 = fVar28;
  if (!bVar10) {
    fVar29 = fVar23;
  }
  fVar13 = param_6[2];
  bVar11 = uVar7 == 1;
  fVar14 = fVar13;
  if (!bVar11) {
    fVar14 = fVar17;
  }
  fVar30 = param_6[1];
  fVar31 = param_6[3];
  auVar25 = auVar24;
  if (fVar29 - fVar14 < fVar26 && uVar7 < 2) {
LAB_7ff70c85393f:
    bVar12 = uVar2 == 0xffffffff;
    uVar7 = *(uint *)(&UNK_7ff70cb1ce30 + (ulonglong)bVar12 * 4);
    if (uVar7 != uVar2) {
      fVar29 = fVar13;
      if (uVar2 == 0xffffffff) {
        fVar29 = fVar17;
      }
      if (uVar2 != 0xffffffff && fVar23 - fVar29 < fVar26) goto LAB_7ff70c8539b5;
      fVar29 = fVar20;
      if (uVar2 == 0xffffffff) {
        fVar29 = fVar31;
      }
      if (fVar21 - fVar29 < fVar27 && uVar2 == 0xffffffff) goto LAB_7ff70c8539b5;
      bVar11 = bVar9;
      bVar9 = false;
      goto LAB_7ff70c853c4a;
    }
LAB_7ff70c8539b5:
    uVar7 = *(uint *)(&UNK_7ff70cb1ce34 + (ulonglong)(uVar2 == 0xffffffff) * 4);
    if (uVar7 != uVar2) {
      fVar29 = fVar21;
      fVar14 = fVar31;
      if (uVar2 == 0xffffffff) {
        fVar29 = fVar30;
        fVar14 = fVar20;
      }
      if (fVar27 <= fVar29 - fVar14) {
        bVar10 = false;
        bVar11 = false;
        bVar5 = uVar2 == 0xffffffff;
        bVar12 = bVar9;
        goto LAB_7ff70c853b70;
      }
    }
    uVar7 = *(uint *)(&UNK_7ff70cb1ce30 + (ulonglong)(uVar2 != 0xffffffff ^ 3) * 4);
    if (uVar7 != uVar2) {
      if (uVar2 == 0xffffffff) {
        fVar23 = fVar28;
      }
      if (fVar26 <= fVar23 - fVar17 || uVar2 != 0xffffffff) {
        bVar10 = uVar2 == 0xffffffff;
        fVar23 = fVar30;
        if (bVar10) {
          fVar23 = fVar21;
        }
        if (fVar27 <= fVar23 - fVar20 || bVar10) {
          bVar12 = false;
          bVar11 = false;
          if (bVar10) goto LAB_7ff70c853b79;
          goto LAB_7ff70c853c4a;
        }
      }
    }
    if (((uVar2 == 0xffffffff) || (uVar2 == 0)) || (fVar28 - fVar17 < fVar26))
    goto LAB_7ff70c853a7d;
    uVar7 = 0;
LAB_7ff70c853b79:
    auVar22 = ZEXT416((uint)(fVar28 - fVar26));
  }
  else {
    fVar29 = fVar30;
    if (uVar7 != 2) {
      fVar29 = fVar21;
    }
    fVar14 = fVar31;
    if (uVar7 != 3) {
      fVar14 = fVar20;
    }
    bVar5 = uVar7 == 2;
    bVar12 = uVar7 == 3;
    if (fVar29 - fVar14 < fVar27 && (uVar7 & 0xfffffffe) == 2) goto LAB_7ff70c85393f;
LAB_7ff70c853b70:
    bVar9 = bVar5;
    if (bVar10) goto LAB_7ff70c853b79;
LAB_7ff70c853c4a:
    if (bVar11) {
      auVar22 = ZEXT416((uint)fVar13);
    }
    else if (bVar9) {
      auVar25 = ZEXT416((uint)(fVar30 - fVar27));
    }
    else {
      auVar25 = ZEXT416((uint)fVar31);
      if (!bVar12) {
        auVar25 = auVar24;
      }
    }
  }
  auVar24 = insertps(auVar22,auVar25,0x10);
  auVar4._4_4_ = -(uint)(fVar20 <= auVar24._4_4_);
  auVar4._0_4_ = -(uint)(fVar17 <= auVar24._0_4_);
  auVar4._8_4_ = -(uint)(0.0 <= auVar24._8_4_);
  auVar4._12_4_ = -(uint)(0.0 <= auVar24._12_4_);
  auVar19 = blendvps(auVar19,auVar24,auVar4);
  *(longlong *)param_1 = auVar19._0_8_;
  *param_4 = uVar7;
LAB_7ff70c853c89:
  if (_DAT_7ff70cbebd80 != (uStack_e0 ^ (ulonglong)auStack_108)) {
    FUN_7ff70caa97e0(uStack_e0 ^ (ulonglong)auStack_108);
    pcVar3 = (code *)swi(3);
    pfVar6 = (float *)(*pcVar3)();
    return pfVar6;
  }
  return param_1;
}


