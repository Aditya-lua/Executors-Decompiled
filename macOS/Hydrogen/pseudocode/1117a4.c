
undefined8 FUN_001117a4(void)

{
  uint uVar1;
  byte bVar2;
  ulong uVar3;
  byte *pbVar4;
  byte *pbVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  byte *pbVar9;
  long lVar10;
  uint unaff_w19;
  uint uVar11;
  ulong unaff_x20;
  uint uVar12;
  ulong unaff_x21;
  uint unaff_w22;
  char *unaff_x23;
  uint *unaff_x24;
  int unaff_w25;
  uint uVar13;
  int unaff_w27;
  byte *unaff_x28;
  float fVar14;
  float fVar15;
  float fVar16;
  float fVar17;
  float fVar18;
  float fVar19;
  float fVar20;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  char *in_stack_00000000;
  undefined4 in_stack_00000008;
  
  if ((int)unaff_w19 < 0) {
    fVar14 = 1.1754944e-38;
  }
  else if (unaff_w19 < 10) {
    fVar14 = *(float *)(&UNK_00813378 + (ulong)unaff_w19 * 4);
  }
  else {
    fVar14 = (float)___exp10f((float)(int)-unaff_w19);
  }
  if (unaff_s8 < fVar14) {
    unaff_s8 = fVar14;
  }
  fVar14 = unaff_s9 * unaff_s10 * unaff_s8;
  if (unaff_w27 != 0) {
    fVar14 = -(unaff_s9 * unaff_s10 * unaff_s8);
  }
  uVar12 = (uint)unaff_x21;
  uVar11 = (uint)unaff_x20;
  if ((uVar11 - uVar12 != 0) && ((unaff_w22 >> 5 & 1) != 0)) {
    fVar14 = fVar14 / (float)(uVar11 - uVar12);
  }
  if (uVar12 < uVar11) {
    if (((uVar11 <= *unaff_x24) && (0.0 < fVar14)) ||
       (*unaff_x23 != '\0' || fVar14 < 0.0 && *unaff_x24 <= uVar12)) goto LAB_00111868;
  }
  else if (*unaff_x23 != '\0') {
LAB_00111868:
    in_stack_00000000[3] = '\0';
    in_stack_00000000[4] = '\0';
    in_stack_00000000[5] = '\0';
    in_stack_00000000[6] = '\0';
    *in_stack_00000000 = '\0';
    return 0;
  }
  if (fVar14 == 0.0) {
    if (*in_stack_00000000 == '\0') {
      return 0;
    }
  }
  else {
    *(float *)(in_stack_00000000 + 3) = fVar14 + *(float *)(in_stack_00000000 + 3);
    *in_stack_00000000 = '\x01';
  }
  uVar13 = *unaff_x24;
  uVar3 = unaff_x21;
  if ((unaff_w22 >> 5 & 1) == 0) {
    fVar18 = 0.0;
    fVar17 = 0.0;
    uVar3 = (ulong)(uVar13 + (int)*(float *)(in_stack_00000000 + 3));
    goto joined_r0x00111c2c;
  }
  fVar18 = 1.0;
  if (unaff_w25 == 8) {
    bVar2 = *unaff_x28;
    if (bVar2 != 0) {
      pbVar5 = unaff_x28;
      do {
        if ((bVar2 == 0x25) && (pbVar5[1] != 0x25)) goto LAB_0011190c;
        if (bVar2 == 0x25) {
          pbVar5 = pbVar5 + 1;
        }
        pbVar5 = pbVar5 + 1;
        bVar2 = *pbVar5;
      } while (bVar2 != 0);
    }
    uVar7 = 3;
    goto code_r0x00111990;
  }
  goto LAB_00111994;
LAB_0011190c:
  do {
    pbVar4 = pbVar5;
    pbVar5 = pbVar4 + 1;
    bVar2 = *pbVar5;
    uVar6 = (uint)bVar2;
  } while (bVar2 - 0x30 < 10);
  if (bVar2 == 0x2e) {
    pbVar9 = pbVar4 + 2;
    bVar2 = *pbVar9;
    if (bVar2 == 0x2d) {
      pbVar9 = pbVar4 + 3;
    }
    pbVar4 = pbVar9;
    if (*pbVar9 == 0x2b) {
      pbVar4 = pbVar9 + 1;
    }
    uVar6 = (uint)*pbVar4;
    if (*pbVar4 - 0x30 < 10) {
      uVar8 = 0;
      lVar10 = (ulong)(bVar2 == 0x2d) + (ulong)(*pbVar9 == 0x2b) + 2;
      do {
        uVar8 = (uVar6 + uVar8 * 10) - 0x30;
        uVar6 = (uint)pbVar5[lVar10];
        lVar10 = lVar10 + 1;
      } while (uVar6 - 0x30 < 10);
    }
    else {
      uVar8 = 0;
    }
    uVar7 = -uVar8;
    if (bVar2 != 0x2d) {
      uVar7 = uVar8;
    }
    uVar8 = 3;
    if (uVar7 < 100) {
      uVar8 = uVar7;
    }
  }
  else {
    uVar8 = 0x7fffffff;
  }
  uVar7 = 0xffffffff;
  if ((uVar6 != 0x45) && (uVar6 != 0x65)) {
    if (uVar6 == 0x67) {
      uVar7 = uVar8;
      if (uVar8 == 0x7fffffff) goto code_r0x00111d14;
    }
    else if ((uVar6 == 0x47) && (uVar8 == 0x7fffffff)) {
code_r0x00111d14:
      uVar7 = 0xffffffff;
    }
    else {
      uVar7 = 3;
      if (uVar8 != 0x7fffffff) {
        uVar7 = uVar8;
      }
    }
  }
code_r0x00111990:
  fVar18 = (float)(int)uVar7;
LAB_00111994:
  fVar17 = (float)_powf(0x3dcccccd,fVar18);
  fVar18 = 0.0;
  if (uVar11 != uVar12) {
    uVar6 = uVar12;
    if (uVar11 <= uVar12) {
      uVar6 = uVar11;
    }
    uVar8 = uVar12;
    if (uVar12 <= uVar11) {
      uVar8 = uVar11;
    }
    uVar7 = uVar13;
    if (uVar8 <= uVar13) {
      uVar7 = uVar8;
    }
    uVar1 = uVar6;
    if (uVar6 <= uVar13) {
      uVar1 = uVar7;
    }
    fVar18 = fVar17;
    if (fVar17 <= (float)uVar6) {
      fVar18 = (float)uVar6;
    }
    fVar15 = fVar17;
    if (fVar17 <= (float)uVar8) {
      fVar15 = (float)uVar8;
    }
    fVar19 = (float)uVar1;
    fVar16 = 0.0;
    if ((fVar18 < fVar19) && (fVar16 = 1.0, fVar19 < fVar15)) {
      fVar16 = (float)_logf(fVar19 / fVar18);
      fVar18 = (float)_logf(fVar15 / fVar18);
      fVar16 = fVar16 / fVar18;
    }
    fVar18 = 1.0 - fVar16;
    if (uVar12 <= uVar11) {
      fVar18 = fVar16;
    }
    fVar15 = *(float *)(in_stack_00000000 + 3) + fVar18;
    if ((0.0 < fVar15) && (uVar3 = unaff_x20, fVar15 < 1.0)) {
      fVar16 = fVar17;
      if (fVar17 <= (float)(unaff_x21 & 0xffffffff)) {
        fVar16 = (float)(unaff_x21 & 0xffffffff);
      }
      fVar19 = fVar17;
      if (fVar17 <= (float)(unaff_x20 & 0xffffffff)) {
        fVar19 = (float)(unaff_x20 & 0xffffffff);
      }
      fVar20 = fVar16;
      if (uVar12 <= uVar11) {
        fVar20 = fVar19;
        fVar19 = fVar16;
      }
      fVar16 = 1.0 - fVar15;
      if (uVar12 <= uVar11) {
        fVar16 = fVar15;
      }
      fVar15 = (float)_powf(fVar20 / fVar19,fVar16);
      uVar3 = (ulong)(uint)(int)(fVar19 * fVar15);
    }
  }
joined_r0x00111c2c:
  if ((unaff_w25 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
    uVar3 = func_0x0012a52c(unaff_x28,in_stack_00000008,uVar3);
  }
  *in_stack_00000000 = '\0';
  uVar13 = (uint)uVar3;
  if ((unaff_w22 >> 5 & 1) == 0) {
    uVar6 = *unaff_x24;
    *(float *)(in_stack_00000000 + 3) =
         *(float *)(in_stack_00000000 + 3) - (float)(int)(uVar13 - uVar6);
  }
  else {
    fVar15 = 0.0;
    if (uVar11 != uVar12) {
      uVar6 = uVar12;
      if (uVar11 <= uVar12) {
        uVar6 = uVar11;
      }
      uVar8 = uVar12;
      if (uVar12 <= uVar11) {
        uVar8 = uVar11;
      }
      uVar7 = uVar13;
      if (uVar8 <= uVar13) {
        uVar7 = uVar8;
      }
      uVar1 = uVar6;
      if (uVar6 <= uVar13) {
        uVar1 = uVar7;
      }
      fVar15 = fVar17;
      if (fVar17 <= (float)uVar6) {
        fVar15 = (float)uVar6;
      }
      if (fVar17 <= (float)uVar8) {
        fVar17 = (float)uVar8;
      }
      fVar19 = (float)uVar1;
      fVar16 = 0.0;
      if ((fVar15 < fVar19) && (fVar16 = 1.0, fVar19 < fVar17)) {
        fVar16 = (float)_logf(fVar19 / fVar15);
        fVar17 = (float)_logf(fVar17 / fVar15);
        fVar16 = fVar16 / fVar17;
      }
      fVar15 = 1.0 - fVar16;
      if (uVar12 <= uVar11) {
        fVar15 = fVar16;
      }
    }
    *(float *)(in_stack_00000000 + 3) = *(float *)(in_stack_00000000 + 3) - (fVar15 - fVar18);
    uVar6 = *unaff_x24;
  }
  if ((uVar12 < uVar11) && (uVar6 != uVar13)) {
    if ((uVar13 < uVar12) || (((unaff_w25 != 8 && (uVar6 < uVar13)) && (fVar14 < 0.0)))) {
      uVar3 = unaff_x21;
    }
    if ((uVar11 < (uint)uVar3) || (((unaff_w25 != 8 && ((uint)uVar3 < uVar6)) && (0.0 < fVar14)))) {
      uVar3 = unaff_x20;
    }
  }
  if (uVar6 == (uint)uVar3) {
    return 0;
  }
  *unaff_x24 = (uint)uVar3;
  return 1;
}

