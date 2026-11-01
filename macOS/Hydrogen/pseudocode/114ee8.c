
undefined8 FUN_00114ee8(void)

{
  char *pcVar1;
  uint uVar2;
  byte bVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  undefined4 in_w8;
  byte *pbVar8;
  byte *pbVar9;
  undefined8 uVar10;
  undefined4 uVar11;
  uint uVar12;
  uint uVar13;
  byte *pbVar14;
  long lVar15;
  float *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  uint unaff_w22;
  long unaff_x23;
  int *unaff_x24;
  uint unaff_w25;
  undefined8 uVar16;
  int unaff_w26;
  int unaff_w27;
  int *unaff_x28;
  float *pfVar17;
  long unaff_x29;
  undefined4 uVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  float fVar22;
  float fVar23;
  float fVar24;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  float fVar25;
  float unaff_s15;
  float fVar26;
  undefined8 in_stack_00000000;
  byte *in_stack_00000008;
  float fStack0000000000000014;
  undefined8 in_stack_00000020;
  int iStack0000000000000028;
  int iStack000000000000002c;
  
  uVar18 = _powf(in_w8);
  fVar24 = (*(float *)(&UNK_0000396c + unaff_x23) * 0.5) / unaff_s10;
  pfVar17 = *(float **)(unaff_x29 + 0x10);
  fVar26 = unaff_s15 + unaff_s14 * unaff_s12;
  fStack0000000000000014 = -unaff_s12;
  fVar25 = unaff_s11 - unaff_s14 * unaff_s12;
  if (*unaff_x24 != unaff_w26) goto code_r0x00115190;
  if (unaff_x24[9] - 2U < 2) {
    pcVar1 = &UNK_00005e90 + unaff_x23;
    if ((char)unaff_x24[3] != '\0') {
      unaff_x24[0x78a] = 0;
      *pcVar1 = '\0';
    }
    if (iStack000000000000002c == 0) {
      fVar19 = (float)func_0x000db05c(0);
    }
    else {
      fVar19 = (float)func_0x000db05c(1);
      fVar19 = -fVar19;
    }
    if (fVar19 != 0.0) {
      uVar11 = 0x281;
      if (unaff_x24[0x2c0] != 3) {
        uVar11 = 0x1000;
      }
      iVar7 = func_0x000d6518(uVar11);
      uVar11 = 0x282;
      if (unaff_x24[0x2c0] != 3) {
        uVar11 = 0x2000;
      }
      iVar6 = func_0x000d6518(uVar11);
      if (unaff_w27 == 8) {
        bVar3 = *in_stack_00000008;
        if (bVar3 != 0) {
          pbVar9 = in_stack_00000008;
          do {
            if ((bVar3 == 0x25) && (pbVar9[1] != 0x25)) goto code_r0x0011510c;
            if (bVar3 == 0x25) {
              pbVar9 = pbVar9 + 1;
            }
            pbVar9 = pbVar9 + 1;
            bVar3 = *pbVar9;
          } while (bVar3 != 0);
        }
        goto code_r0x00115350;
      }
      goto code_r0x0011538c;
    }
    fVar19 = (float)unaff_x24[0x78a];
    iVar7 = unaff_x24[0x2b7];
    goto joined_r0x001153f8;
  }
  if (unaff_x24[9] != 1) {
code_r0x00115190:
    uVar16 = 0;
    goto code_r0x00115198;
  }
  if (*(char *)(unaff_x23 + 0xe48) == '\0') {
    func_0x000c24fc();
    goto code_r0x00115190;
  }
  fVar19 = *(float *)(unaff_x23 + unaff_x20 * 4 + 0xe40);
  if ((char)unaff_x24[3] != '\0') {
    fVar21 = (float)func_0x0012a058(uVar18,fVar24);
    if (iStack000000000000002c != 0) {
      fVar21 = 1.0 - fVar21;
    }
    fVar21 = fVar26 + fVar21 * (fVar25 - fVar26);
    fVar23 = fVar21 + fStack0000000000000014 * 0.5 + -1.0;
    bVar4 = true;
    bVar5 = false;
    if (fVar19 <= fVar21 + unaff_s12 * 0.5 + 1.0) {
      bVar4 = false;
      bVar5 = true;
      if (!NAN(fVar19) && !NAN(fVar23)) {
        bVar4 = fVar19 < fVar23;
        bVar5 = false;
      }
    }
    fVar21 = fVar19 - fVar21;
    if (bVar4 != bVar5 || unaff_w27 != 8) {
      fVar21 = 0.0;
    }
    unaff_x24[0x789] = (int)fVar21;
  }
  fVar20 = 0.0;
  if (0.0 < unaff_s10) {
    fVar21 = ((fVar19 - (float)unaff_x24[0x789]) - fVar26) / unaff_s10;
    fVar19 = 1.0;
    if (fVar21 <= 1.0) {
      fVar19 = fVar21;
    }
    fVar20 = 0.0;
    if (0.0 <= fVar21) {
      fVar20 = fVar19;
    }
  }
  if (iStack000000000000002c != 0) {
    fVar20 = 1.0 - fVar20;
  }
  if ((unaff_x24[0x252] & 0x80U) == 0 && (unaff_w22 & 0x200000) == 0) goto code_r0x00115530;
  goto code_r0x00115578;
code_r0x0011510c:
  do {
    pbVar8 = pbVar9;
    pbVar9 = pbVar8 + 1;
    bVar3 = *pbVar9;
    uVar12 = (uint)bVar3;
  } while (bVar3 - 0x30 < 10);
  if (bVar3 == 0x2e) {
    pbVar14 = pbVar8 + 2;
    bVar3 = *pbVar14;
    if (bVar3 == 0x2d) {
      pbVar14 = pbVar8 + 3;
    }
    pbVar8 = pbVar14;
    if (*pbVar14 == 0x2b) {
      pbVar8 = pbVar14 + 1;
    }
    uVar12 = (uint)*pbVar8;
    if (*pbVar8 - 0x30 < 10) {
      uVar13 = 0;
      lVar15 = (ulong)(bVar3 == 0x2d) + (ulong)(*pbVar14 == 0x2b) + 2;
      do {
        uVar13 = (uVar12 + uVar13 * 10) - 0x30;
        uVar12 = (uint)pbVar9[lVar15];
        lVar15 = lVar15 + 1;
      } while (uVar12 - 0x30 < 10);
    }
    else {
      uVar13 = 0;
    }
    uVar2 = -uVar13;
    if (bVar3 != 0x2d) {
      uVar2 = uVar13;
    }
    uVar13 = 3;
    if (uVar2 < 100) {
      uVar13 = uVar2;
    }
  }
  else {
    uVar13 = 0x7fffffff;
  }
  if ((uVar12 == 0x45) || (uVar12 == 0x65)) {
code_r0x0011538c:
    if (in_stack_00000020._4_4_ != iStack0000000000000028 && unaff_w25 < 0x65) {
      iVar7 = 1;
    }
    fVar23 = -1.0;
    if (0.0 <= fVar19) {
      fVar23 = 1.0;
    }
    fVar21 = fVar19 / 100.0;
    if (iVar7 == 1) {
      fVar21 = fVar23 / in_stack_00000000._4_4_;
    }
  }
  else {
    if (uVar12 != 0x67) {
      if (0 < (int)uVar13 != (uVar12 == 0x47 && uVar13 == 0x7fffffff)) goto code_r0x00115350;
      goto code_r0x0011538c;
    }
    if (0x7ffffffd < uVar13 - 1) goto code_r0x0011538c;
code_r0x00115350:
    fVar21 = fVar19 / 100.0;
    if (iVar7 != 0) {
      fVar21 = (fVar19 / 100.0) / 10.0;
    }
  }
  fVar19 = fVar21 * 10.0;
  if (iVar6 == 0) {
    fVar19 = fVar21;
  }
  fVar19 = (float)unaff_x24[0x78a] + fVar19;
  unaff_x24[0x78a] = (int)fVar19;
  *pcVar1 = '\x01';
  iVar7 = unaff_x24[0x2b7];
joined_r0x001153f8:
  if ((iVar7 == unaff_w26) && ((char)unaff_x24[3] == '\0')) {
    func_0x000c24fc();
    uVar16 = 0;
    goto code_r0x00115198;
  }
  if (*pcVar1 != '\0') {
    fVar21 = (float)func_0x0012a058(uVar18,fVar24);
    if (((1.0 <= fVar21) && (0.0 < fVar19)) || ((fVar21 <= 0.0 && (fVar19 < 0.0)))) {
      uVar16 = 0;
      unaff_x24[0x78a] = 0;
      *pcVar1 = '\0';
      goto code_r0x00115198;
    }
    fVar22 = fVar19 + fVar21;
    fVar23 = 1.0;
    if (fVar22 <= 1.0) {
      fVar23 = fVar22;
    }
    fVar20 = 0.0;
    if (0.0 <= fVar22) {
      fVar20 = fVar23;
    }
    func_0x0012a20c(fVar20,uVar18,fVar24);
    if ((unaff_w27 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
      func_0x0012a3b4(in_stack_00000008);
    }
    fVar23 = (float)func_0x0012a058(uVar18,fVar24);
    fVar23 = fVar23 - fVar21;
    bVar4 = fVar23 < fVar19;
    if (fVar19 <= 0.0) {
      bVar4 = fVar23 >= fVar19;
    }
    if (!bVar4) {
      fVar23 = fVar19;
    }
    unaff_x24[0x78a] = (int)((float)unaff_x24[0x78a] - fVar23);
    *pcVar1 = '\0';
    if ((unaff_x24[0x252] & 0x80U) == 0 && (unaff_w22 & 0x200000) == 0) {
code_r0x00115530:
      iVar7 = func_0x0012a20c(fVar20,uVar18,fVar24,unaff_x21,in_stack_00000020._4_4_,
                              iStack0000000000000028,unaff_w22 >> 5 & 1);
      if ((unaff_w27 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
        iVar7 = func_0x0012a3b4(in_stack_00000008,unaff_x21);
      }
      if (*unaff_x28 != iVar7) {
        *unaff_x28 = iVar7;
        uVar16 = 1;
        goto code_r0x00115198;
      }
    }
  }
code_r0x00115578:
  uVar16 = 0;
code_r0x00115198:
  if (1.0 <= unaff_s13) {
    fVar24 = (float)func_0x0012a058(uVar18,fVar24,unaff_x21,*unaff_x28,in_stack_00000020._4_4_,
                                    iStack0000000000000028,unaff_w22 >> 5 & 1);
    if (iStack000000000000002c != 0) {
      fVar24 = 1.0 - fVar24;
    }
    fVar26 = fVar26 + fVar24 * (fVar25 - fVar26);
    if (iStack000000000000002c == 0) {
      fVar25 = unaff_x19[1];
      fVar24 = unaff_x19[3];
      *pfVar17 = fVar26 + fStack0000000000000014 * 0.5;
      pfVar17[1] = fVar25 + 2.0;
      pfVar17[2] = fVar26 + unaff_s12 * 0.5;
      pfVar17[3] = fVar24 + -2.0;
    }
    else {
      fVar24 = unaff_x19[2];
      *pfVar17 = *unaff_x19 + 2.0;
      pfVar17[1] = fVar26 + fStack0000000000000014 * 0.5;
      pfVar17[2] = fVar24 + -2.0;
      pfVar17[3] = fVar26 + unaff_s12 * 0.5;
    }
  }
  else {
    uVar10 = *(undefined8 *)unaff_x19;
    *(undefined8 *)pfVar17 = uVar10;
    *(undefined8 *)(pfVar17 + 2) = uVar10;
  }
  return uVar16;
}

