
undefined8
FUN_00112420(float param_1,ulong param_2,ulong *param_3,ulong param_4,ulong param_5,
            undefined8 param_6,uint param_7)

{
  char *pcVar1;
  char *pcVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  byte bVar8;
  float fVar9;
  long lVar10;
  int iVar11;
  int iVar12;
  ulong uVar13;
  char cVar14;
  byte *pbVar15;
  byte *pbVar16;
  undefined4 uVar17;
  uint uVar18;
  uint uVar19;
  uint uVar20;
  uint uVar21;
  byte *pbVar22;
  long lVar23;
  ulong unaff_x20;
  ulong uVar24;
  byte *unaff_x25;
  float fVar25;
  float fVar26;
  double dVar27;
  double dVar28;
  float fVar29;
  double dVar30;
  double dVar31;
  uint uStack0000000000000008;
  uint uStack000000000000000c;
  
  lVar10 = lRam0000000000a334c0;
  pcVar1 = &UNK_00005e91 + lRam0000000000a334c0;
  pcVar2 = &UNK_00004070 + lRam0000000000a334c0;
  if (param_1 == 0.0 && param_4 < param_5) {
    param_1 = *(float *)(&UNK_00005e98 + lRam0000000000a334c0) * (float)(unaff_x20 - param_4);
  }
  uStack0000000000000008 = param_7 >> 0x14 & 1;
  uVar3 = (uint)param_2 & 0xfffffffe;
  uStack000000000000000c = param_7;
  if (((*(int *)(&UNK_00004088 + lRam0000000000a334c0) == 1) &&
      (iVar11 = func_0x000c36fc(0), iVar11 != 0)) &&
     (iVar11 = func_0x000d71fc(*(float *)(lVar10 + 0x6c) * 0.5,0), iVar11 != 0)) {
    fVar25 = *(float *)(lVar10 + (ulong)uStack0000000000000008 * 4 + 0xe8);
    if (*(char *)(lVar10 + 0xe5e) != '\0') {
      fVar25 = fVar25 * 0.01;
    }
    if (*(char *)(lVar10 + 0xe5d) != '\0') {
      fVar25 = fVar25 * 10.0;
    }
  }
  else {
    fVar25 = 0.0;
    if ((*(uint *)(&UNK_00004088 + lVar10) & 0xfffffffe) == 2) {
      if (uVar3 == 8) {
        bVar8 = *unaff_x25;
        if (bVar8 != 0) {
          pbVar16 = unaff_x25;
          do {
            if ((bVar8 == 0x25) && (pbVar16[1] != 0x25)) goto LAB_0011253c;
            if (bVar8 == 0x25) {
              pbVar16 = pbVar16 + 1;
            }
            pbVar16 = pbVar16 + 1;
            bVar8 = *pbVar16;
          } while (bVar8 != 0);
        }
        uVar20 = 3;
      }
      else {
        uVar20 = 0;
      }
      goto LAB_001125d0;
    }
  }
  goto LAB_0011268c;
LAB_001127b4:
  do {
    pbVar15 = pbVar16;
    pbVar16 = pbVar15 + 1;
    bVar8 = *pbVar16;
    uVar18 = (uint)bVar8;
  } while (bVar8 - 0x30 < 10);
  if (bVar8 == 0x2e) {
    pbVar22 = pbVar15 + 2;
    bVar8 = *pbVar22;
    if (bVar8 == 0x2d) {
      pbVar22 = pbVar15 + 3;
    }
    pbVar15 = pbVar22;
    if (*pbVar22 == 0x2b) {
      pbVar15 = pbVar22 + 1;
    }
    uVar18 = (uint)*pbVar15;
    if (*pbVar15 - 0x30 < 10) {
      uVar21 = 0;
      lVar23 = (ulong)(bVar8 == 0x2d) + (ulong)(*pbVar22 == 0x2b) + 2;
      do {
        uVar21 = (uVar18 + uVar21 * 10) - 0x30;
        uVar18 = (uint)pbVar16[lVar23];
        lVar23 = lVar23 + 1;
      } while (uVar18 - 0x30 < 10);
    }
    else {
      uVar21 = 0;
    }
    uVar19 = -uVar21;
    if (bVar8 != 0x2d) {
      uVar19 = uVar21;
    }
    uVar21 = 3;
    if (uVar19 < 100) {
      uVar21 = uVar19;
    }
  }
  else {
    uVar21 = 0x7fffffff;
  }
  uVar19 = 0xffffffff;
  if ((uVar18 != 0x45) && (uVar18 != 0x65)) {
    if (uVar18 == 0x67) {
      uVar19 = uVar21;
      if (uVar21 == 0x7fffffff) goto LAB_00112bf4;
    }
    else if ((uVar18 == 0x47) && (uVar21 == 0x7fffffff)) {
LAB_00112bf4:
      uVar19 = 0xffffffff;
    }
    else {
      uVar19 = 3;
      if (uVar21 != 0x7fffffff) {
        uVar19 = uVar21;
      }
    }
  }
  goto LAB_00112838;
LAB_0011253c:
  do {
    pbVar15 = pbVar16;
    pbVar16 = pbVar15 + 1;
    bVar8 = *pbVar16;
    uVar18 = (uint)bVar8;
  } while (bVar8 - 0x30 < 10);
  if (bVar8 == 0x2e) {
    pbVar22 = pbVar15 + 2;
    bVar8 = *pbVar22;
    if (bVar8 == 0x2d) {
      pbVar22 = pbVar15 + 3;
    }
    pbVar15 = pbVar22;
    if (*pbVar22 == 0x2b) {
      pbVar15 = pbVar22 + 1;
    }
    uVar18 = (uint)*pbVar15;
    if (*pbVar15 - 0x30 < 10) {
      uVar20 = 0;
      lVar23 = (ulong)(bVar8 == 0x2d) + (ulong)(*pbVar22 == 0x2b) + 2;
      do {
        uVar20 = (uVar18 + uVar20 * 10) - 0x30;
        uVar18 = (uint)pbVar16[lVar23];
        lVar23 = lVar23 + 1;
      } while (uVar18 - 0x30 < 10);
    }
    else {
      uVar20 = 0;
    }
    uVar19 = -uVar20;
    if (bVar8 != 0x2d) {
      uVar19 = uVar20;
    }
    uVar21 = 3;
    if (uVar19 < 100) {
      uVar21 = uVar19;
    }
  }
  else {
    uVar21 = 0x7fffffff;
  }
  uVar20 = 0xffffffff;
  if ((uVar18 != 0x45) && (uVar18 != 0x65)) {
    if (uVar18 == 0x67) {
      uVar20 = uVar21;
      if (uVar21 == 0x7fffffff) goto LAB_00112b74;
    }
    else if ((uVar18 == 0x47) && (uVar21 == 0x7fffffff)) {
LAB_00112b74:
      uVar20 = 0xffffffff;
    }
    else {
      uVar20 = 3;
      if (uVar21 != 0x7fffffff) {
        uVar20 = uVar21;
      }
    }
  }
LAB_001125d0:
  uVar17 = 0x281;
  if (*(int *)(&UNK_00004b64 + lVar10) != 3) {
    uVar17 = 0x1000;
  }
  iVar11 = func_0x000d6518(uVar17);
  uVar17 = 0x282;
  if (*(int *)(&UNK_00004b64 + lVar10) != 3) {
    uVar17 = 0x2000;
  }
  iVar12 = func_0x000d6518(uVar17);
  fVar25 = 10.0;
  if (iVar12 == 0) {
    fVar25 = 1.0;
  }
  fVar29 = 1.0;
  if (iVar11 == 0) {
    fVar29 = fVar25;
  }
  fVar25 = (float)func_0x000db05c(uStack0000000000000008);
  if ((int)uVar20 < 0) {
    fVar26 = 1.1754944e-38;
  }
  else if (uVar20 < 10) {
    fVar26 = *(float *)(&UNK_00813378 + (ulong)uVar20 * 4);
  }
  else {
    fVar26 = (float)___exp10f((float)(int)-uVar20);
  }
  param_2 = param_2 & 0xffffffff;
  fVar25 = fVar25 * fVar29;
  if (param_1 < fVar26) {
    param_1 = fVar26;
  }
LAB_0011268c:
  uVar20 = uStack000000000000000c;
  fVar29 = fVar25 * param_1;
  if ((param_7 & 0x100000) != 0) {
    fVar29 = -(fVar25 * param_1);
  }
  if (unaff_x20 - param_4 == 0) {
    cVar14 = *pcVar2;
    if (unaff_x20 <= param_4) goto LAB_001126c0;
LAB_001126e4:
    if (((unaff_x20 <= *param_3) && (0.0 < fVar29)) ||
       (cVar14 != '\0' || fVar29 < 0.0 && *param_3 <= param_4)) {
LAB_00112710:
      *(undefined4 *)(&UNK_00005e94 + lVar10) = 0;
      *pcVar1 = '\0';
      return 0;
    }
  }
  else {
    if ((uStack000000000000000c >> 5 & 1) != 0) {
      fVar29 = fVar29 / (float)(unaff_x20 - param_4);
    }
    cVar14 = *pcVar2;
    if (param_4 < unaff_x20) goto LAB_001126e4;
LAB_001126c0:
    if (cVar14 != '\0') goto LAB_00112710;
  }
  if (fVar29 == 0.0) {
    if (*pcVar1 == '\0') {
      return 0;
    }
  }
  else {
    *(float *)(&UNK_00005e94 + lVar10) = fVar29 + *(float *)(&UNK_00005e94 + lVar10);
    *pcVar1 = '\x01';
  }
  uVar24 = *param_3;
  uVar13 = param_4;
  if ((uStack000000000000000c >> 5 & 1) == 0) {
    uVar13 = uVar24 + (long)*(float *)(&UNK_00005e94 + lVar10);
    dVar31 = 0.0;
    dVar30 = 0.0;
    goto joined_r0x0011298c;
  }
  fVar25 = 1.0;
  if (uVar3 == 8) {
    bVar8 = *unaff_x25;
    if (bVar8 != 0) {
      pbVar16 = unaff_x25;
      do {
        if ((bVar8 == 0x25) && (pbVar16[1] != 0x25)) goto LAB_001127b4;
        if (bVar8 == 0x25) {
          pbVar16 = pbVar16 + 1;
        }
        pbVar16 = pbVar16 + 1;
        bVar8 = *pbVar16;
      } while (bVar8 != 0);
    }
    uVar19 = 3;
LAB_00112838:
    fVar25 = (float)(int)uVar19;
  }
  fVar25 = (float)_powf(0x3dcccccd,fVar25);
  if (unaff_x20 == param_4) {
    dVar31 = 0.0;
  }
  else {
    uVar5 = param_4;
    if (unaff_x20 <= param_4) {
      uVar5 = unaff_x20;
    }
    uVar6 = param_4;
    if (param_4 <= unaff_x20) {
      uVar6 = unaff_x20;
    }
    uVar7 = uVar24;
    if (uVar6 <= uVar24) {
      uVar7 = uVar6;
    }
    uVar4 = uVar5;
    if (uVar5 <= uVar24) {
      uVar4 = uVar7;
    }
    dVar30 = (double)fVar25;
    dVar31 = dVar30;
    if (dVar30 <= (double)uVar5) {
      dVar31 = (double)uVar5;
    }
    dVar27 = dVar30;
    if (dVar30 <= (double)uVar6) {
      dVar27 = (double)uVar6;
    }
    dVar28 = (double)uVar4;
    fVar26 = 0.0;
    if ((dVar31 < dVar28) && (fVar26 = 1.0, dVar28 < dVar27)) {
      dVar28 = (double)_log(dVar28 / dVar31);
      dVar31 = (double)_log(dVar27 / dVar31);
      fVar26 = (float)(dVar28 / dVar31);
    }
    fVar9 = 1.0 - fVar26;
    if (param_4 <= unaff_x20) {
      fVar9 = fVar26;
    }
    fVar26 = *(float *)(&UNK_00005e94 + lVar10) + fVar9;
    if (fVar26 <= 0.0) {
      dVar31 = (double)fVar9;
      goto joined_r0x0011298c;
    }
    if (fVar26 < 1.0) {
      dVar31 = dVar30;
      if (dVar30 <= (double)param_4) {
        dVar31 = (double)param_4;
      }
      dVar27 = dVar30;
      if (dVar30 <= (double)unaff_x20) {
        dVar27 = (double)unaff_x20;
      }
      dVar28 = dVar31;
      if (param_4 <= unaff_x20) {
        dVar28 = dVar27;
        dVar27 = dVar31;
      }
      fVar25 = 1.0 - fVar26;
      if (param_4 <= unaff_x20) {
        fVar25 = fVar26;
      }
      dVar28 = (double)_pow(dVar28 / dVar27,(double)fVar25);
      dVar31 = (double)fVar9;
      uVar13 = (long)(dVar27 * dVar28);
      goto joined_r0x0011298c;
    }
    dVar31 = (double)fVar9;
    uVar13 = unaff_x20;
  }
  dVar30 = (double)fVar25;
joined_r0x0011298c:
  if ((uVar3 == 8) && ((uVar20 >> 6 & 1) == 0)) {
    uVar13 = func_0x0012ac3c(unaff_x25,param_2,uVar13);
  }
  *pcVar1 = '\0';
  if ((uVar20 >> 5 & 1) == 0) {
    uVar24 = *param_3;
    *(float *)(&UNK_00005e94 + lVar10) =
         *(float *)(&UNK_00005e94 + lVar10) - (float)(long)(uVar13 - uVar24);
  }
  else {
    dVar27 = 0.0;
    if (unaff_x20 != param_4) {
      uVar24 = param_4;
      if (unaff_x20 <= param_4) {
        uVar24 = unaff_x20;
      }
      uVar5 = param_4;
      if (param_4 <= unaff_x20) {
        uVar5 = unaff_x20;
      }
      uVar6 = uVar13;
      if (uVar5 <= uVar13) {
        uVar6 = uVar5;
      }
      uVar7 = uVar24;
      if (uVar24 <= uVar13) {
        uVar7 = uVar6;
      }
      dVar27 = dVar30;
      if (dVar30 <= (double)uVar24) {
        dVar27 = (double)uVar24;
      }
      if (dVar30 <= (double)uVar5) {
        dVar30 = (double)uVar5;
      }
      dVar28 = (double)uVar7;
      fVar25 = 0.0;
      if ((dVar27 < dVar28) && (fVar25 = 1.0, dVar28 < dVar30)) {
        dVar28 = (double)_log(dVar28 / dVar27);
        dVar30 = (double)_log(dVar30 / dVar27);
        fVar25 = (float)(dVar28 / dVar30);
      }
      fVar26 = 1.0 - fVar25;
      if (param_4 <= unaff_x20) {
        fVar26 = fVar25;
      }
      dVar27 = (double)fVar26;
    }
    *(float *)(&UNK_00005e94 + lVar10) =
         *(float *)(&UNK_00005e94 + lVar10) - (float)(dVar27 - dVar31);
    uVar24 = *param_3;
  }
  if ((param_4 < unaff_x20) && (uVar24 != uVar13)) {
    if ((uVar13 < param_4) || (((uVar3 != 8 && (uVar24 < uVar13)) && (fVar29 < 0.0)))) {
      uVar13 = param_4;
    }
    if ((unaff_x20 < uVar13) || (((uVar3 != 8 && (uVar13 < uVar24)) && (0.0 < fVar29)))) {
      uVar13 = unaff_x20;
    }
  }
  if (uVar24 == uVar13) {
    return 0;
  }
  *param_3 = uVar13;
  return 1;
}

