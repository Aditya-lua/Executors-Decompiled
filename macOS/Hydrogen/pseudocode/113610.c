
undefined8 FUN_00113610(void)

{
  byte bVar1;
  int in_w8;
  byte *pbVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  byte *pbVar6;
  long lVar7;
  double *unaff_x19;
  uint unaff_w21;
  byte *unaff_x24;
  int unaff_w25;
  char *unaff_x26;
  float fVar8;
  double dVar9;
  float fVar10;
  double dVar11;
  double unaff_d8;
  double unaff_d9;
  double dVar12;
  float unaff_s13;
  
  if (in_w8 != 0) {
    unaff_x26[3] = '\0';
    unaff_x26[4] = '\0';
    unaff_x26[5] = '\0';
    unaff_x26[6] = '\0';
    *unaff_x26 = '\0';
    return 0;
  }
  if (unaff_s13 == 0.0) {
    if (*unaff_x26 == '\0') {
      return 0;
    }
  }
  else {
    *(float *)(unaff_x26 + 3) = unaff_s13 + *(float *)(unaff_x26 + 3);
    *unaff_x26 = '\x01';
  }
  dVar12 = *unaff_x19;
  if ((unaff_w21 >> 5 & 1) == 0) {
    dVar12 = dVar12 + (double)*(float *)(unaff_x26 + 3);
    fVar10 = 0.0;
    goto joined_r0x001137e4;
  }
  fVar10 = 1.0;
  if (unaff_w25 == 8) {
    bVar1 = *unaff_x24;
    if (bVar1 != 0) {
      do {
        if ((bVar1 == 0x25) && (unaff_x24[1] != 0x25)) goto LAB_001136f4;
        if (bVar1 == 0x25) {
          unaff_x24 = unaff_x24 + 1;
        }
        unaff_x24 = unaff_x24 + 1;
        bVar1 = *unaff_x24;
      } while (bVar1 != 0);
    }
    uVar4 = 3;
    goto code_r0x00113778;
  }
LAB_0011377c:
  _powf(0x3dcccccd,fVar10);
  fVar10 = (float)func_0x0012b324(dVar12);
  dVar12 = (double)func_0x0012b548(fVar10 + *(float *)(unaff_x26 + 3));
joined_r0x001137e4:
  if ((unaff_w25 == 8) && ((unaff_w21 >> 6 & 1) == 0)) {
    dVar12 = (double)func_0x0012b770(dVar12);
  }
  *unaff_x26 = '\0';
  if ((unaff_w21 >> 5 & 1) == 0) {
    dVar9 = *unaff_x19;
    *(float *)(unaff_x26 + 3) = *(float *)(unaff_x26 + 3) - (float)(dVar12 - dVar9);
    dVar11 = 0.0;
    if (dVar12 != 0.0) {
      dVar11 = dVar12;
    }
  }
  else {
    fVar8 = (float)func_0x0012b324(dVar12);
    *(float *)(unaff_x26 + 3) = *(float *)(unaff_x26 + 3) - (fVar8 - fVar10);
    dVar9 = *unaff_x19;
    dVar11 = 0.0;
    if (dVar12 != 0.0) {
      dVar11 = dVar12;
    }
  }
  if ((unaff_d9 < unaff_d8) && (dVar9 != dVar11)) {
    if ((dVar11 < unaff_d9) || (((unaff_w25 != 8 && (dVar9 < dVar11)) && (unaff_s13 < 0.0)))) {
      dVar11 = unaff_d9;
    }
    if ((unaff_d8 < dVar11) || (((unaff_w25 != 8 && (dVar11 < dVar9)) && (0.0 < unaff_s13)))) {
      dVar11 = unaff_d8;
    }
  }
  if (dVar9 == dVar11) {
    return 0;
  }
  *unaff_x19 = dVar11;
  return 1;
LAB_001136f4:
  do {
    pbVar2 = unaff_x24;
    unaff_x24 = pbVar2 + 1;
    bVar1 = *unaff_x24;
    uVar3 = (uint)bVar1;
  } while (bVar1 - 0x30 < 10);
  if (bVar1 == 0x2e) {
    pbVar6 = pbVar2 + 2;
    bVar1 = *pbVar6;
    if (bVar1 == 0x2d) {
      pbVar6 = pbVar2 + 3;
    }
    pbVar2 = pbVar6;
    if (*pbVar6 == 0x2b) {
      pbVar2 = pbVar6 + 1;
    }
    uVar3 = (uint)*pbVar2;
    if (*pbVar2 - 0x30 < 10) {
      uVar5 = 0;
      lVar7 = (ulong)(bVar1 == 0x2d) + (ulong)(*pbVar6 == 0x2b) + 2;
      do {
        uVar5 = (uVar3 + uVar5 * 10) - 0x30;
        uVar3 = (uint)unaff_x24[lVar7];
        lVar7 = lVar7 + 1;
      } while (uVar3 - 0x30 < 10);
    }
    else {
      uVar5 = 0;
    }
    uVar4 = -uVar5;
    if (bVar1 != 0x2d) {
      uVar4 = uVar5;
    }
    uVar5 = 3;
    if (uVar4 < 100) {
      uVar5 = uVar4;
    }
  }
  else {
    uVar5 = 0x7fffffff;
  }
  uVar4 = 0xffffffff;
  if ((uVar3 != 0x45) && (uVar3 != 0x65)) {
    if (uVar3 == 0x67) {
      uVar4 = uVar5;
      if (uVar5 == 0x7fffffff) goto code_r0x00113a08;
    }
    else if ((uVar3 == 0x47) && (uVar5 == 0x7fffffff)) {
code_r0x00113a08:
      uVar4 = 0xffffffff;
    }
    else {
      uVar4 = 3;
      if (uVar5 != 0x7fffffff) {
        uVar4 = uVar5;
      }
    }
  }
code_r0x00113778:
  fVar10 = (float)(int)uVar4;
  goto LAB_0011377c;
}

