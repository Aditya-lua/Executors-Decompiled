
undefined8 FUN_00113418(void)

{
  uint uVar1;
  byte bVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  byte *pbVar8;
  byte *pbVar9;
  uint uVar10;
  undefined4 uVar11;
  uint uVar12;
  uint uVar13;
  byte *pbVar14;
  long lVar15;
  double *unaff_x19;
  ulong unaff_x20;
  uint unaff_w21;
  byte *unaff_x24;
  int unaff_w25;
  char *unaff_x26;
  char *unaff_x27;
  int unaff_w28;
  float fVar16;
  float fVar17;
  double dVar18;
  double dVar19;
  double unaff_d8;
  double unaff_d9;
  float unaff_s10;
  double dVar20;
  double unaff_d12;
  float fVar21;
  
  fVar16 = 0.0;
  if ((*(uint *)(unaff_x27 + 0x18) & 0xfffffffe) == 2) {
    if (unaff_w25 == 8) {
      bVar2 = *unaff_x24;
      if (bVar2 != 0) {
        pbVar8 = unaff_x24;
        do {
          if ((bVar2 == 0x25) && (pbVar8[1] != 0x25)) goto LAB_0011346c;
          if (bVar2 == 0x25) {
            pbVar8 = pbVar8 + 1;
          }
          pbVar8 = pbVar8 + 1;
          bVar2 = *pbVar8;
        } while (bVar2 != 0);
      }
      uVar12 = 3;
    }
    else {
      uVar12 = 0;
    }
    goto LAB_00113518;
  }
  goto LAB_001135c0;
LAB_001136f4:
  do {
    pbVar9 = pbVar8;
    pbVar8 = pbVar9 + 1;
    bVar2 = *pbVar8;
    uVar12 = (uint)bVar2;
  } while (bVar2 - 0x30 < 10);
  if (bVar2 == 0x2e) {
    pbVar14 = pbVar9 + 2;
    bVar2 = *pbVar14;
    if (bVar2 == 0x2d) {
      pbVar14 = pbVar9 + 3;
    }
    pbVar9 = pbVar14;
    if (*pbVar14 == 0x2b) {
      pbVar9 = pbVar14 + 1;
    }
    uVar12 = (uint)*pbVar9;
    if (*pbVar9 - 0x30 < 10) {
      uVar10 = 0;
      lVar15 = (ulong)(bVar2 == 0x2d) + (ulong)(*pbVar14 == 0x2b) + 2;
      do {
        uVar10 = (uVar12 + uVar10 * 10) - 0x30;
        uVar12 = (uint)pbVar8[lVar15];
        lVar15 = lVar15 + 1;
      } while (uVar12 - 0x30 < 10);
    }
    else {
      uVar10 = 0;
    }
    uVar13 = -uVar10;
    if (bVar2 != 0x2d) {
      uVar13 = uVar10;
    }
    uVar10 = 3;
    if (uVar13 < 100) {
      uVar10 = uVar13;
    }
  }
  else {
    uVar10 = 0x7fffffff;
  }
  uVar13 = 0xffffffff;
  if ((uVar12 != 0x45) && (uVar12 != 0x65)) {
    if (uVar12 == 0x67) {
      uVar13 = uVar10;
      if (uVar10 == 0x7fffffff) goto code_r0x00113a08;
    }
    else if ((uVar12 == 0x47) && (uVar10 == 0x7fffffff)) {
code_r0x00113a08:
      uVar13 = 0xffffffff;
    }
    else {
      uVar13 = 3;
      if (uVar10 != 0x7fffffff) {
        uVar13 = uVar10;
      }
    }
  }
  goto code_r0x00113778;
LAB_0011346c:
  do {
    pbVar9 = pbVar8;
    pbVar8 = pbVar9 + 1;
    bVar2 = *pbVar8;
    uVar10 = (uint)bVar2;
  } while (bVar2 - 0x30 < 10);
  if (bVar2 == 0x2e) {
    pbVar14 = pbVar9 + 2;
    bVar2 = *pbVar14;
    if (bVar2 == 0x2d) {
      pbVar14 = pbVar9 + 3;
    }
    pbVar9 = pbVar14;
    if (*pbVar14 == 0x2b) {
      pbVar9 = pbVar14 + 1;
    }
    uVar10 = (uint)*pbVar9;
    if (*pbVar9 - 0x30 < 10) {
      uVar12 = 0;
      lVar15 = (ulong)(bVar2 == 0x2d) + (ulong)(*pbVar14 == 0x2b) + 2;
      do {
        uVar12 = (uVar10 + uVar12 * 10) - 0x30;
        uVar10 = (uint)pbVar8[lVar15];
        lVar15 = lVar15 + 1;
      } while (uVar10 - 0x30 < 10);
    }
    else {
      uVar12 = 0;
    }
    uVar1 = -uVar12;
    if (bVar2 != 0x2d) {
      uVar1 = uVar12;
    }
    uVar13 = 3;
    if (uVar1 < 100) {
      uVar13 = uVar1;
    }
  }
  else {
    uVar13 = 0x7fffffff;
  }
  uVar12 = 0xffffffff;
  if ((uVar10 != 0x45) && (uVar10 != 0x65)) {
    if (uVar10 == 0x67) {
      uVar12 = uVar13;
      if (uVar13 == 0x7fffffff) goto code_r0x00113988;
    }
    else if ((uVar10 == 0x47) && (uVar13 == 0x7fffffff)) {
code_r0x00113988:
      uVar12 = 0xffffffff;
    }
    else {
      uVar12 = 3;
      if (uVar13 != 0x7fffffff) {
        uVar12 = uVar13;
      }
    }
  }
LAB_00113518:
  uVar11 = 0x281;
  if (*(int *)(unaff_x27 + 0xaf4) != 3) {
    uVar11 = 0x1000;
  }
  iVar6 = func_0x000d6518(uVar11);
  uVar11 = 0x282;
  if (*(int *)(unaff_x27 + 0xaf4) != 3) {
    uVar11 = 0x2000;
  }
  iVar7 = func_0x000d6518(uVar11);
  fVar16 = 10.0;
  if (iVar7 == 0) {
    fVar16 = 1.0;
  }
  fVar21 = 1.0;
  if (iVar6 == 0) {
    fVar21 = fVar16;
  }
  fVar16 = (float)func_0x000db05c();
  if ((int)uVar12 < 0) {
    fVar17 = 1.1754944e-38;
  }
  else if (uVar12 < 10) {
    fVar17 = *(float *)(&UNK_00813378 + (ulong)uVar12 * 4);
  }
  else {
    fVar17 = (float)___exp10f((float)(int)-uVar12);
  }
  unaff_x20 = unaff_x20 & 0xffffffff;
  fVar16 = fVar16 * fVar21;
  if (unaff_s10 < fVar17) {
    unaff_s10 = fVar17;
  }
LAB_001135c0:
  fVar21 = fVar16 * unaff_s10;
  if (unaff_w28 != 0) {
    fVar21 = -(fVar16 * unaff_s10);
  }
  if ((unaff_w21 >> 5 & 1) != 0) {
    bVar3 = false;
    bVar4 = true;
    bVar5 = false;
    if (unaff_d12 < 3.4028234663852886e+38) {
      bVar3 = false;
      bVar4 = false;
      bVar5 = true;
      if (!NAN(unaff_d12)) {
        bVar3 = unaff_d12 < 9.999999974752427e-07;
        bVar4 = unaff_d12 == 9.999999974752427e-07;
        bVar5 = false;
      }
    }
    if (!bVar4 && bVar3 == bVar5) {
      fVar21 = fVar21 / (float)unaff_d12;
    }
  }
  if (unaff_d9 < unaff_d8) {
    if (((unaff_d8 <= *unaff_x19) && (0.0 < fVar21)) ||
       (*unaff_x27 != '\0' || fVar21 < 0.0 && *unaff_x19 <= unaff_d9)) goto LAB_00113654;
  }
  else if (*unaff_x27 != '\0') {
LAB_00113654:
    unaff_x26[3] = '\0';
    unaff_x26[4] = '\0';
    unaff_x26[5] = '\0';
    unaff_x26[6] = '\0';
    *unaff_x26 = '\0';
    return 0;
  }
  if (fVar21 == 0.0) {
    if (*unaff_x26 == '\0') {
      return 0;
    }
  }
  else {
    *(float *)(unaff_x26 + 3) = fVar21 + *(float *)(unaff_x26 + 3);
    *unaff_x26 = '\x01';
  }
  dVar20 = *unaff_x19;
  if ((unaff_w21 >> 5 & 1) == 0) {
    dVar20 = dVar20 + (double)*(float *)(unaff_x26 + 3);
    fVar16 = 0.0;
  }
  else {
    fVar16 = 1.0;
    if (unaff_w25 == 8) {
      bVar2 = *unaff_x24;
      if (bVar2 != 0) {
        pbVar8 = unaff_x24;
        do {
          if ((bVar2 == 0x25) && (pbVar8[1] != 0x25)) goto LAB_001136f4;
          if (bVar2 == 0x25) {
            pbVar8 = pbVar8 + 1;
          }
          pbVar8 = pbVar8 + 1;
          bVar2 = *pbVar8;
        } while (bVar2 != 0);
      }
      uVar13 = 3;
code_r0x00113778:
      fVar16 = (float)(int)uVar13;
    }
    _powf(0x3dcccccd,fVar16);
    fVar16 = (float)func_0x0012b324(dVar20,unaff_x20,1);
    dVar20 = (double)func_0x0012b548(fVar16 + *(float *)(unaff_x26 + 3),unaff_x20,1);
  }
  if ((unaff_w25 == 8) && ((unaff_w21 >> 6 & 1) == 0)) {
    dVar20 = (double)func_0x0012b770(dVar20,unaff_x24,unaff_x20);
  }
  *unaff_x26 = '\0';
  if ((unaff_w21 >> 5 & 1) == 0) {
    dVar18 = *unaff_x19;
    *(float *)(unaff_x26 + 3) = *(float *)(unaff_x26 + 3) - (float)(dVar20 - dVar18);
    dVar19 = 0.0;
    if (dVar20 != 0.0) {
      dVar19 = dVar20;
    }
  }
  else {
    fVar17 = (float)func_0x0012b324(dVar20,unaff_x20,1);
    *(float *)(unaff_x26 + 3) = *(float *)(unaff_x26 + 3) - (fVar17 - fVar16);
    dVar18 = *unaff_x19;
    dVar19 = 0.0;
    if (dVar20 != 0.0) {
      dVar19 = dVar20;
    }
  }
  if ((unaff_d9 < unaff_d8) && (dVar18 != dVar19)) {
    if ((dVar19 < unaff_d9) || (((unaff_w25 != 8 && (dVar18 < dVar19)) && (fVar21 < 0.0)))) {
      dVar19 = unaff_d9;
    }
    if ((unaff_d8 < dVar19) || (((unaff_w25 != 8 && (dVar19 < dVar18)) && (0.0 < fVar21)))) {
      dVar19 = unaff_d8;
    }
  }
  if (dVar18 == dVar19) {
    return 0;
  }
  *unaff_x19 = dVar19;
  return 1;
}

