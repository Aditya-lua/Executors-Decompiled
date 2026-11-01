
undefined8 FUN_0011645c(float param_1,float param_2,float param_3)

{
  char *pcVar1;
  uint uVar2;
  byte bVar3;
  bool bVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  long lVar8;
  int in_w8;
  uint uVar9;
  byte *pbVar10;
  byte *pbVar11;
  undefined8 uVar12;
  uint uVar13;
  undefined4 uVar14;
  uint uVar15;
  byte *pbVar16;
  float *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  uint unaff_w22;
  long unaff_x23;
  int *unaff_x24;
  ulong unaff_x25;
  undefined8 uVar17;
  int unaff_w26;
  int unaff_w27;
  long *unaff_x28;
  float *pfVar18;
  long unaff_x29;
  undefined4 uVar19;
  float fVar20;
  float fVar21;
  float fVar22;
  float fVar23;
  float fVar24;
  float fVar25;
  float unaff_s13;
  float fVar26;
  float fVar27;
  undefined8 in_stack_00000008;
  byte *in_stack_00000010;
  float fStack000000000000001c;
  long in_stack_00000028;
  long in_stack_00000030;
  int iStack000000000000003c;
  
  if (unaff_s13 <= param_3) {
    param_3 = unaff_s13;
  }
  fVar25 = unaff_s13 - param_3;
  fVar24 = 0.0;
  uVar19 = 0;
  iStack000000000000003c = in_w8;
  if ((unaff_w22 >> 5 & 1) != 0) {
    if (unaff_w27 == 8) {
      bVar3 = *in_stack_00000010;
      pbVar11 = in_stack_00000010;
      while (bVar3 != 0) {
        if ((bVar3 == 0x25) && (pbVar11[1] != 0x25)) goto LAB_001164cc;
        if (bVar3 == 0x25) {
          pbVar11 = pbVar11 + 1;
        }
        pbVar11 = pbVar11 + 1;
        bVar3 = *pbVar11;
      }
      uVar15 = 3;
    }
    else {
      uVar15 = 1;
    }
    goto LAB_00116550;
  }
  goto LAB_00116580;
LAB_00116780:
  do {
    pbVar10 = pbVar11;
    pbVar11 = pbVar10 + 1;
    bVar3 = *pbVar11;
    uVar15 = (uint)bVar3;
  } while (bVar3 - 0x30 < 10);
  if (bVar3 == 0x2e) {
    pbVar16 = pbVar10 + 2;
    bVar3 = *pbVar16;
    if (bVar3 == 0x2d) {
      pbVar16 = pbVar10 + 3;
    }
    pbVar10 = pbVar16;
    if (*pbVar16 == 0x2b) {
      pbVar10 = pbVar16 + 1;
    }
    uVar15 = (uint)*pbVar10;
    if (*pbVar10 - 0x30 < 10) {
      uVar13 = 0;
      lVar8 = (ulong)(bVar3 == 0x2d) + (ulong)(*pbVar16 == 0x2b) + 2;
      do {
        uVar13 = (uVar15 + uVar13 * 10) - 0x30;
        uVar15 = (uint)pbVar11[lVar8];
        lVar8 = lVar8 + 1;
      } while (uVar15 - 0x30 < 10);
    }
    else {
      uVar13 = 0;
    }
    uVar9 = -uVar13;
    if (bVar3 != 0x2d) {
      uVar9 = uVar13;
    }
    uVar13 = 3;
    if (uVar9 < 100) {
      uVar13 = uVar9;
    }
  }
  else {
    uVar13 = 0x7fffffff;
  }
  if ((uVar15 != 0x45) && (uVar15 != 0x65)) {
    if (uVar15 == 0x67) {
      if (uVar13 - 1 < 0x7ffffffe) goto LAB_001169c4;
      goto LAB_00116a00;
    }
    if (0 < (int)uVar13 == (uVar15 == 0x47 && uVar13 == 0x7fffffff)) goto LAB_00116a00;
    goto LAB_001169c4;
  }
  goto LAB_00116a00;
LAB_001164cc:
  do {
    pbVar10 = pbVar11;
    pbVar11 = pbVar10 + 1;
    bVar3 = *pbVar11;
    uVar13 = (uint)bVar3;
  } while (bVar3 - 0x30 < 10);
  if (bVar3 == 0x2e) {
    pbVar16 = pbVar10 + 2;
    bVar3 = *pbVar16;
    if (bVar3 == 0x2d) {
      pbVar16 = pbVar10 + 3;
    }
    pbVar10 = pbVar16;
    if (*pbVar16 == 0x2b) {
      pbVar10 = pbVar16 + 1;
    }
    uVar13 = (uint)*pbVar10;
    if (*pbVar10 - 0x30 < 10) {
      uVar15 = 0;
      lVar8 = (ulong)(bVar3 == 0x2d) + (ulong)(*pbVar16 == 0x2b) + 2;
      do {
        uVar15 = (uVar13 + uVar15 * 10) - 0x30;
        uVar13 = (uint)pbVar11[lVar8];
        lVar8 = lVar8 + 1;
      } while (uVar13 - 0x30 < 10);
    }
    else {
      uVar15 = 0;
    }
    uVar2 = -uVar15;
    if (bVar3 != 0x2d) {
      uVar2 = uVar15;
    }
    uVar9 = 3;
    if (uVar2 < 100) {
      uVar9 = uVar2;
    }
  }
  else {
    uVar9 = 0x7fffffff;
  }
  uVar15 = 0xffffffff;
  if ((uVar13 != 0x45) && (uVar13 != 0x65)) {
    if (uVar13 == 0x67) {
      uVar15 = uVar9;
      if (uVar9 == 0x7fffffff) goto code_r0x0011695c;
    }
    else if ((uVar13 == 0x47) && (uVar9 == 0x7fffffff)) {
code_r0x0011695c:
      uVar15 = 0xffffffff;
    }
    else {
      uVar15 = 3;
      if (uVar9 != 0x7fffffff) {
        uVar15 = uVar9;
      }
    }
  }
LAB_00116550:
  uVar19 = _powf(0x3dcccccd,(float)(int)uVar15);
  fVar24 = (*(float *)(&UNK_0000396c + unaff_x23) * 0.5) / fVar25;
LAB_00116580:
  pfVar18 = *(float **)(unaff_x29 + 0x10);
  fVar27 = param_2 + 2.0 + param_3 * 0.5;
  fStack000000000000001c = -param_3;
  fVar26 = (param_1 + -2.0) - param_3 * 0.5;
  if (*unaff_x24 != unaff_w26) goto LAB_00116804;
  if (unaff_x24[9] - 2U < 2) {
    pcVar1 = &UNK_00005e90 + unaff_x23;
    if ((char)unaff_x24[3] != '\0') {
      unaff_x24[0x78a] = 0;
      *pcVar1 = '\0';
    }
    if (iStack000000000000003c == 0) {
      fVar25 = (float)func_0x000db05c(0);
      if (fVar25 != 0.0) goto LAB_0011670c;
LAB_001165ec:
      fVar25 = (float)unaff_x24[0x78a];
      iVar6 = unaff_x24[0x2b7];
    }
    else {
      fVar25 = (float)func_0x000db05c(1);
      fVar25 = -fVar25;
      if (fVar25 == 0.0) goto LAB_001165ec;
LAB_0011670c:
      uVar14 = 0x281;
      if (unaff_x24[0x2c0] != 3) {
        uVar14 = 0x1000;
      }
      iVar6 = func_0x000d6518(uVar14);
      uVar14 = 0x282;
      if (unaff_x24[0x2c0] != 3) {
        uVar14 = 0x2000;
      }
      iVar7 = func_0x000d6518(uVar14);
      if (unaff_w27 == 8) {
        bVar3 = *in_stack_00000010;
        if (bVar3 != 0) {
          pbVar11 = in_stack_00000010;
          do {
            if ((bVar3 == 0x25) && (pbVar11[1] != 0x25)) goto LAB_00116780;
            if (bVar3 == 0x25) {
              pbVar11 = pbVar11 + 1;
            }
            pbVar11 = pbVar11 + 1;
            bVar3 = *pbVar11;
          } while (bVar3 != 0);
        }
LAB_001169c4:
        fVar20 = fVar25 / 100.0;
        if (iVar6 != 0) {
          fVar20 = (fVar25 / 100.0) / 10.0;
        }
      }
      else {
LAB_00116a00:
        if (in_stack_00000028 != in_stack_00000030 && unaff_x25 < 0x65) {
          iVar6 = 1;
        }
        fVar21 = -1.0;
        if (0.0 <= fVar25) {
          fVar21 = 1.0;
        }
        fVar20 = fVar25 / 100.0;
        if (iVar6 == 1) {
          fVar20 = fVar21 / in_stack_00000008._4_4_;
        }
      }
      fVar25 = fVar20 * 10.0;
      if (iVar7 == 0) {
        fVar25 = fVar20;
      }
      fVar25 = (float)unaff_x24[0x78a] + fVar25;
      unaff_x24[0x78a] = (int)fVar25;
      *pcVar1 = '\x01';
      iVar6 = unaff_x24[0x2b7];
    }
    if ((iVar6 == unaff_w26) && ((char)unaff_x24[3] == '\0')) {
      func_0x000c24fc();
      uVar17 = 0;
      goto code_r0x0011680c;
    }
    if (*pcVar1 != '\0') {
      fVar21 = (float)func_0x0012a6a4(uVar19,fVar24);
      if (((1.0 <= fVar21) && (0.0 < fVar25)) || ((fVar21 <= 0.0 && (fVar25 < 0.0)))) {
        uVar17 = 0;
        unaff_x24[0x78a] = 0;
        *pcVar1 = '\0';
        goto code_r0x0011680c;
      }
      fVar22 = fVar25 + fVar21;
      fVar23 = 1.0;
      if (fVar22 <= 1.0) {
        fVar23 = fVar22;
      }
      fVar20 = 0.0;
      if (0.0 <= fVar22) {
        fVar20 = fVar23;
      }
      func_0x0012a88c(fVar20,uVar19,fVar24);
      if ((unaff_w27 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
        func_0x0012aac4(in_stack_00000010);
      }
      fVar23 = (float)func_0x0012a6a4(uVar19,fVar24);
      fVar23 = fVar23 - fVar21;
      bVar4 = fVar23 < fVar25;
      if (fVar25 <= 0.0) {
        bVar4 = fVar23 >= fVar25;
      }
      if (!bVar4) {
        fVar23 = fVar25;
      }
      unaff_x24[0x78a] = (int)((float)unaff_x24[0x78a] - fVar23);
      *pcVar1 = '\0';
      if ((unaff_x24[0x252] & 0x80U) == 0 && (unaff_w22 & 0x200000) == 0) goto LAB_00116ba4;
    }
LAB_00116bec:
    uVar17 = 0;
  }
  else {
    if (unaff_x24[9] == 1) {
      if (*(char *)(unaff_x23 + 0xe48) != '\0') {
        fVar21 = *(float *)(unaff_x23 + unaff_x20 * 4 + 0xe40);
        if ((char)unaff_x24[3] != '\0') {
          fVar20 = (float)func_0x0012a6a4(uVar19,fVar24);
          if (iStack000000000000003c != 0) {
            fVar20 = 1.0 - fVar20;
          }
          fVar20 = fVar27 + fVar20 * (fVar26 - fVar27);
          fVar23 = fVar20 + fStack000000000000001c * 0.5 + -1.0;
          bVar4 = true;
          bVar5 = false;
          if (fVar21 <= fVar20 + param_3 * 0.5 + 1.0) {
            bVar4 = false;
            bVar5 = true;
            if (!NAN(fVar21) && !NAN(fVar23)) {
              bVar4 = fVar21 < fVar23;
              bVar5 = false;
            }
          }
          fVar20 = fVar21 - fVar20;
          if (bVar4 != bVar5 || unaff_w27 != 8) {
            fVar20 = 0.0;
          }
          unaff_x24[0x789] = (int)fVar20;
        }
        fVar20 = 0.0;
        if (0.0 < fVar25) {
          fVar25 = ((fVar21 - (float)unaff_x24[0x789]) - fVar27) / fVar25;
          fVar21 = 1.0;
          if (fVar25 <= 1.0) {
            fVar21 = fVar25;
          }
          fVar20 = 0.0;
          if (0.0 <= fVar25) {
            fVar20 = fVar21;
          }
        }
        if (iStack000000000000003c != 0) {
          fVar20 = 1.0 - fVar20;
        }
        if ((unaff_x24[0x252] & 0x80U) == 0 && (unaff_w22 & 0x200000) == 0) {
LAB_00116ba4:
          lVar8 = func_0x0012a88c(fVar20,uVar19,fVar24,unaff_x21,in_stack_00000028,in_stack_00000030
                                  ,unaff_w22 >> 5 & 1);
          if ((unaff_w27 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
            lVar8 = func_0x0012aac4(in_stack_00000010,unaff_x21);
          }
          if (*unaff_x28 != lVar8) {
            *unaff_x28 = lVar8;
            uVar17 = 1;
            goto code_r0x0011680c;
          }
        }
        goto LAB_00116bec;
      }
      func_0x000c24fc();
    }
LAB_00116804:
    uVar17 = 0;
  }
code_r0x0011680c:
  if (1.0 <= unaff_s13) {
    fVar25 = (float)func_0x0012a6a4(uVar19,fVar24,unaff_x21,*unaff_x28,in_stack_00000028,
                                    in_stack_00000030,unaff_w22 >> 5 & 1);
    if (iStack000000000000003c != 0) {
      fVar25 = 1.0 - fVar25;
    }
    fVar27 = fVar27 + fVar25 * (fVar26 - fVar27);
    if (iStack000000000000003c == 0) {
      fVar24 = unaff_x19[1];
      fVar25 = unaff_x19[3];
      *pfVar18 = fVar27 + fStack000000000000001c * 0.5;
      pfVar18[1] = fVar24 + 2.0;
      pfVar18[2] = fVar27 + param_3 * 0.5;
      pfVar18[3] = fVar25 + -2.0;
    }
    else {
      fVar25 = unaff_x19[2];
      *pfVar18 = *unaff_x19 + 2.0;
      pfVar18[1] = fVar27 + fStack000000000000001c * 0.5;
      pfVar18[2] = fVar25 + -2.0;
      pfVar18[3] = fVar27 + param_3 * 0.5;
    }
  }
  else {
    uVar12 = *(undefined8 *)unaff_x19;
    *(undefined8 *)pfVar18 = uVar12;
    *(undefined8 *)(pfVar18 + 2) = uVar12;
  }
  return uVar17;
}

