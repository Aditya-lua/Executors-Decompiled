
undefined8 FUN_00111e28(void)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  int iVar4;
  byte *pbVar5;
  byte *pbVar6;
  long lVar7;
  uint uVar8;
  undefined4 uVar9;
  uint uVar10;
  uint uVar11;
  byte *pbVar12;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  uint unaff_w23;
  char *unaff_x24;
  byte *unaff_x25;
  long lVar13;
  long *unaff_x26;
  int unaff_w27;
  char *unaff_x28;
  float fVar14;
  float fVar15;
  ulong uVar16;
  float unaff_s8;
  float fVar17;
  int iStack0000000000000004;
  undefined4 uStack0000000000000008;
  undefined4 uStack000000000000000c;
  
  fVar14 = 0.0;
  if ((*(uint *)(unaff_x24 + 0x18) & 0xfffffffe) == 2) {
    if (unaff_w22 == 8) {
      bVar2 = *unaff_x25;
      if (bVar2 != 0) {
        pbVar5 = unaff_x25;
        do {
          if ((bVar2 == 0x25) && (pbVar5[1] != 0x25)) goto LAB_00111e7c;
          if (bVar2 == 0x25) {
            pbVar5 = pbVar5 + 1;
          }
          pbVar5 = pbVar5 + 1;
          bVar2 = *pbVar5;
        } while (bVar2 != 0);
      }
      uVar10 = 3;
    }
    else {
      uVar10 = 0;
    }
    goto LAB_00111f10;
  }
  goto LAB_00111fc4;
LAB_001120dc:
  do {
    pbVar6 = pbVar5;
    pbVar5 = pbVar6 + 1;
    bVar2 = *pbVar5;
    uVar10 = (uint)bVar2;
  } while (bVar2 - 0x30 < 10);
  if (bVar2 == 0x2e) {
    pbVar12 = pbVar6 + 2;
    bVar2 = *pbVar12;
    if (bVar2 == 0x2d) {
      pbVar12 = pbVar6 + 3;
    }
    pbVar6 = pbVar12;
    if (*pbVar12 == 0x2b) {
      pbVar6 = pbVar12 + 1;
    }
    uVar10 = (uint)*pbVar6;
    if (*pbVar6 - 0x30 < 10) {
      uVar8 = 0;
      lVar7 = (ulong)(bVar2 == 0x2d) + (ulong)(*pbVar12 == 0x2b) + 2;
      do {
        uVar8 = (uVar10 + uVar8 * 10) - 0x30;
        uVar10 = (uint)pbVar5[lVar7];
        lVar7 = lVar7 + 1;
      } while (uVar10 - 0x30 < 10);
    }
    else {
      uVar8 = 0;
    }
    uVar11 = -uVar8;
    if (bVar2 != 0x2d) {
      uVar11 = uVar8;
    }
    uVar8 = 3;
    if (uVar11 < 100) {
      uVar8 = uVar11;
    }
  }
  else {
    uVar8 = 0x7fffffff;
  }
  uVar11 = 0xffffffff;
  if ((uVar10 != 0x45) && (uVar10 != 0x65)) {
    if (uVar10 == 0x67) {
      uVar11 = uVar8;
      if (uVar8 == 0x7fffffff) goto code_r0x001123d0;
    }
    else if ((uVar10 == 0x47) && (uVar8 == 0x7fffffff)) {
code_r0x001123d0:
      uVar11 = 0xffffffff;
    }
    else {
      uVar11 = 3;
      if (uVar8 != 0x7fffffff) {
        uVar11 = uVar8;
      }
    }
  }
  goto code_r0x00112160;
LAB_00111e7c:
  do {
    pbVar6 = pbVar5;
    pbVar5 = pbVar6 + 1;
    bVar2 = *pbVar5;
    uVar8 = (uint)bVar2;
  } while (bVar2 - 0x30 < 10);
  if (bVar2 == 0x2e) {
    pbVar12 = pbVar6 + 2;
    bVar2 = *pbVar12;
    if (bVar2 == 0x2d) {
      pbVar12 = pbVar6 + 3;
    }
    pbVar6 = pbVar12;
    if (*pbVar12 == 0x2b) {
      pbVar6 = pbVar12 + 1;
    }
    uVar8 = (uint)*pbVar6;
    if (*pbVar6 - 0x30 < 10) {
      uVar10 = 0;
      lVar13 = (ulong)(bVar2 == 0x2d) + (ulong)(*pbVar12 == 0x2b) + 2;
      do {
        uVar10 = (uVar8 + uVar10 * 10) - 0x30;
        uVar8 = (uint)pbVar5[lVar13];
        lVar13 = lVar13 + 1;
      } while (uVar8 - 0x30 < 10);
    }
    else {
      uVar10 = 0;
    }
    uVar1 = -uVar10;
    if (bVar2 != 0x2d) {
      uVar1 = uVar10;
    }
    uVar11 = 3;
    if (uVar1 < 100) {
      uVar11 = uVar1;
    }
  }
  else {
    uVar11 = 0x7fffffff;
  }
  uVar10 = 0xffffffff;
  if ((uVar8 != 0x45) && (uVar8 != 0x65)) {
    if (uVar8 == 0x67) {
      uVar10 = uVar11;
      if (uVar11 == 0x7fffffff) goto code_r0x00112350;
    }
    else if ((uVar8 == 0x47) && (uVar11 == 0x7fffffff)) {
code_r0x00112350:
      uVar10 = 0xffffffff;
    }
    else {
      uVar10 = 3;
      if (uVar11 != 0x7fffffff) {
        uVar10 = uVar11;
      }
    }
  }
LAB_00111f10:
  uVar9 = 0x281;
  if (*(int *)(unaff_x24 + 0xaf4) != 3) {
    uVar9 = 0x1000;
  }
  iStack0000000000000004 = unaff_w27;
  iVar3 = func_0x000d6518(uVar9);
  uVar9 = 0x282;
  if (*(int *)(unaff_x24 + 0xaf4) != 3) {
    uVar9 = 0x2000;
  }
  iVar4 = func_0x000d6518(uVar9);
  fVar14 = 10.0;
  if (iVar4 == 0) {
    fVar14 = 1.0;
  }
  fVar17 = 1.0;
  if (iVar3 == 0) {
    fVar17 = fVar14;
  }
  fVar14 = (float)func_0x000db05c(uStack000000000000000c);
  if ((int)uVar10 < 0) {
    fVar15 = 1.1754944e-38;
  }
  else if (uVar10 < 10) {
    fVar15 = *(float *)(&UNK_00813378 + (ulong)uVar10 * 4);
  }
  else {
    fVar15 = (float)___exp10f((float)(int)-uVar10);
  }
  fVar14 = fVar14 * fVar17;
  unaff_w27 = iStack0000000000000004;
  if (unaff_s8 < fVar15) {
    unaff_s8 = fVar15;
  }
LAB_00111fc4:
  fVar17 = fVar14 * unaff_s8;
  if (unaff_w27 != 0) {
    fVar17 = -(fVar14 * unaff_s8);
  }
  if (((unaff_w23 >> 5 & 1) != 0) && (0 < unaff_x20 - unaff_x21)) {
    fVar17 = fVar17 / (float)(unaff_x20 - unaff_x21);
  }
  if (unaff_x21 < unaff_x20) {
    if (((unaff_x20 <= *unaff_x26) && (0.0 < fVar17)) ||
       (*unaff_x24 != '\0' || fVar17 < 0.0 && *unaff_x26 <= unaff_x21)) goto LAB_00112038;
  }
  else if (*unaff_x24 != '\0') {
LAB_00112038:
    unaff_x28[3] = '\0';
    unaff_x28[4] = '\0';
    unaff_x28[5] = '\0';
    unaff_x28[6] = '\0';
    *unaff_x28 = '\0';
    return 0;
  }
  if (fVar17 == 0.0) {
    if (*unaff_x28 == '\0') {
      return 0;
    }
  }
  else {
    *(float *)(unaff_x28 + 3) = fVar17 + *(float *)(unaff_x28 + 3);
    *unaff_x28 = '\x01';
  }
  lVar13 = *unaff_x26;
  if ((unaff_w23 >> 5 & 1) == 0) {
    lVar13 = lVar13 + (long)*(float *)(unaff_x28 + 3);
    uVar9 = 0;
    fVar14 = 0.0;
  }
  else {
    fVar14 = 1.0;
    if (unaff_w22 == 8) {
      bVar2 = *unaff_x25;
      if (bVar2 != 0) {
        pbVar5 = unaff_x25;
        do {
          if ((bVar2 == 0x25) && (pbVar5[1] != 0x25)) goto LAB_001120dc;
          if (bVar2 == 0x25) {
            pbVar5 = pbVar5 + 1;
          }
          pbVar5 = pbVar5 + 1;
          bVar2 = *pbVar5;
        } while (bVar2 != 0);
      }
      uVar11 = 3;
code_r0x00112160:
      fVar14 = (float)(int)uVar11;
    }
    uVar16 = _powf(0x3dcccccd,fVar14);
    uVar9 = (undefined4)uVar16;
    fVar14 = (float)func_0x0012a6a4(uVar16,0,uStack0000000000000008,lVar13);
    lVar13 = func_0x0012a88c(fVar14 + *(float *)(unaff_x28 + 3),uVar16 & 0xffffffff,0,
                             uStack0000000000000008);
  }
  if ((unaff_w22 == 8) && ((unaff_w23 >> 6 & 1) == 0)) {
    lVar13 = func_0x0012aac4(unaff_x25,uStack0000000000000008,lVar13);
  }
  *unaff_x28 = '\0';
  if ((unaff_w23 >> 5 & 1) == 0) {
    lVar7 = *unaff_x26;
    *(float *)(unaff_x28 + 3) = *(float *)(unaff_x28 + 3) - (float)(lVar13 - lVar7);
  }
  else {
    fVar15 = (float)func_0x0012a6a4(uVar9,0,uStack0000000000000008,lVar13);
    *(float *)(unaff_x28 + 3) = *(float *)(unaff_x28 + 3) - (fVar15 - fVar14);
    lVar7 = *unaff_x26;
  }
  if ((unaff_x21 < unaff_x20) && (lVar7 != lVar13)) {
    if ((lVar13 < unaff_x21) || (((unaff_w22 != 8 && (lVar7 < lVar13)) && (fVar17 < 0.0)))) {
      lVar13 = unaff_x21;
    }
    if ((unaff_x20 < lVar13) || (((unaff_w22 != 8 && (lVar13 < lVar7)) && (0.0 < fVar17)))) {
      lVar13 = unaff_x20;
    }
  }
  if (lVar7 == lVar13) {
    return 0;
  }
  *unaff_x26 = lVar13;
  return 1;
}

