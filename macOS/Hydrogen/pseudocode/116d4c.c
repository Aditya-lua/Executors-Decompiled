
undefined8 FUN_00116d4c(long param_1)

{
  char *pcVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  byte bVar5;
  bool bVar6;
  bool bVar7;
  int iVar8;
  int iVar9;
  byte *in_x6;
  byte *pbVar10;
  byte *pbVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 uVar14;
  uint uVar15;
  undefined4 uVar16;
  int in_w10;
  uint uVar17;
  uint uVar18;
  byte *in_x11;
  byte *pbVar19;
  long lVar20;
  float *unaff_x19;
  int unaff_w20;
  ulong unaff_x21;
  int unaff_w23;
  long unaff_x24;
  undefined8 uVar21;
  ulong unaff_x25;
  uint unaff_w26;
  int unaff_w27;
  float *pfVar22;
  long unaff_x28;
  long unaff_x29;
  float fVar23;
  float fVar24;
  float fVar25;
  float fVar26;
  float fVar27;
  float fVar28;
  double dVar29;
  double dVar30;
  double dVar31;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float fVar32;
  float fVar33;
  float unaff_s14;
  float fVar34;
  float unaff_s15;
  int iStack0000000000000024;
  int *in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000038;
  ulong in_stack_00000040;
  ulong *in_stack_00000048;
  
  if (in_w10 == 0x2d) {
    in_x11 = in_x11 + 1;
  }
  pbVar11 = in_x11;
  if (*in_x11 == 0x2b) {
    pbVar11 = in_x11 + 1;
  }
  uVar15 = (uint)*pbVar11;
  if (*pbVar11 - 0x30 < 10) {
    uVar18 = 0;
    lVar20 = (ulong)(in_w10 == 0x2d) + (ulong)(*in_x11 == 0x2b) + 2;
    do {
      uVar18 = (uVar15 + uVar18 * 10) - 0x30;
      uVar15 = (uint)*(byte *)(param_1 + lVar20);
      lVar20 = lVar20 + 1;
    } while (uVar15 - 0x30 < 10);
  }
  else {
    uVar18 = 0;
  }
  uVar17 = -uVar18;
  if (in_w10 != 0x2d) {
    uVar17 = uVar18;
  }
  uVar18 = 3;
  if (uVar17 < 100) {
    uVar18 = uVar17;
  }
  uVar17 = 0xffffffff;
  if ((uVar15 != 0x45) && (uVar15 != 0x65)) {
    if (uVar15 == 0x67) {
      uVar17 = uVar18;
      if (uVar18 == 0x7fffffff) goto code_r0x001170dc;
    }
    else if ((uVar15 == 0x47) && (uVar18 == 0x7fffffff)) {
code_r0x001170dc:
      uVar17 = 0xffffffff;
    }
    else {
      uVar17 = 3;
      if (uVar18 != 0x7fffffff) {
        uVar17 = uVar18;
      }
    }
  }
  fVar23 = (float)_powf(0x3dcccccd,(float)(int)uVar17);
  pfVar22 = *(float **)(unaff_x29 + 0x10);
  fVar33 = unaff_s12 + unaff_s9 * unaff_s10;
  fVar32 = -unaff_s10;
  fVar34 = unaff_s14 - unaff_s9 * unaff_s10;
  if (*in_stack_00000028 != unaff_w23) goto joined_r0x001175c8;
  if (in_stack_00000028[9] - 2U < 2) {
    pcVar1 = &UNK_00005e90 + unaff_x28;
    if ((char)in_stack_00000028[3] != '\0') {
      in_stack_00000028[0x78a] = 0;
      *pcVar1 = '\0';
    }
    iStack0000000000000024 = unaff_w27;
    if (unaff_w27 == 0) {
      fVar24 = (float)func_0x000db05c(0);
    }
    else {
      fVar24 = (float)func_0x000db05c(1);
      fVar24 = -fVar24;
    }
    if (fVar24 != 0.0) {
      uVar16 = 0x281;
      if (in_stack_00000028[0x2c0] != 3) {
        uVar16 = 0x1000;
      }
      iVar8 = func_0x000d6518(uVar16);
      uVar16 = 0x282;
      if (in_stack_00000028[0x2c0] != 3) {
        uVar16 = 0x2000;
      }
      iVar9 = func_0x000d6518(uVar16);
      if (unaff_w20 == 8) {
        bVar5 = *in_x6;
        if (bVar5 != 0) {
          pbVar11 = in_x6;
          do {
            if ((bVar5 == 0x25) && (pbVar11[1] != 0x25)) goto code_r0x00116fcc;
            if (bVar5 == 0x25) {
              pbVar11 = pbVar11 + 1;
            }
            pbVar11 = pbVar11 + 1;
            bVar5 = *pbVar11;
          } while (bVar5 != 0);
        }
        goto code_r0x00117284;
      }
      goto code_r0x001172c4;
    }
    fVar24 = (float)in_stack_00000028[0x78a];
    iVar8 = in_stack_00000028[0x2b7];
    unaff_w27 = iStack0000000000000024;
    goto joined_r0x0011732c;
  }
  if (in_stack_00000028[9] != 1) goto joined_r0x001175c8;
  if (*(char *)(unaff_x28 + 0xe48) == '\0') {
    func_0x000c24fc();
    uVar21 = 0;
    goto joined_r0x001175c8;
  }
  fVar24 = *(float *)(unaff_x28 + unaff_x24 * 4 + 0xe40);
  if ((char)in_stack_00000028[3] != '\0') {
    fVar25 = 0.0;
    if (unaff_x25 != unaff_x21) {
      uVar13 = *in_stack_00000048;
      if (unaff_x25 < unaff_x21) {
        uVar12 = unaff_x21;
        uVar2 = unaff_x25;
      }
      else {
        uVar12 = unaff_x25;
        uVar2 = unaff_x21;
      }
      uVar3 = uVar13;
      if (uVar12 <= uVar13) {
        uVar3 = uVar12;
      }
      uVar4 = uVar2;
      if (uVar2 <= uVar13) {
        uVar4 = uVar3;
      }
      if ((unaff_w26 >> 5 & 1) == 0) {
        fVar25 = (float)((double)(long)(uVar4 - unaff_x25) / (double)(long)in_stack_00000040);
      }
      else {
        dVar30 = (double)fVar23;
        dVar29 = dVar30;
        if (dVar30 <= (double)uVar2) {
          dVar29 = (double)uVar2;
        }
        if (dVar30 <= (double)uVar12) {
          dVar30 = (double)uVar12;
        }
        dVar31 = (double)uVar4;
        fVar28 = 0.0;
        if ((dVar29 < dVar31) && (fVar28 = 1.0, dVar31 < dVar30)) {
          dVar31 = (double)_log(dVar31 / dVar29);
          dVar29 = (double)_log(dVar30 / dVar29);
          fVar28 = (float)(dVar31 / dVar29);
        }
        fVar25 = 1.0 - fVar28;
        if (unaff_x25 <= unaff_x21) {
          fVar25 = fVar28;
        }
      }
    }
    if (unaff_w27 != 0) {
      fVar25 = 1.0 - fVar25;
    }
    fVar25 = fVar33 + fVar25 * (fVar34 - fVar33);
    fVar28 = fVar25 + fVar32 * 0.5 + -1.0;
    bVar6 = true;
    bVar7 = false;
    if (fVar24 <= fVar25 + unaff_s10 * 0.5 + 1.0) {
      bVar6 = false;
      bVar7 = true;
      if (!NAN(fVar24) && !NAN(fVar28)) {
        bVar6 = fVar24 < fVar28;
        bVar7 = false;
      }
    }
    fVar25 = fVar24 - fVar25;
    if (bVar6 != bVar7 || unaff_w20 != 8) {
      fVar25 = 0.0;
    }
    in_stack_00000028[0x789] = (int)fVar25;
  }
  fVar26 = 0.0;
  if (0.0 < unaff_s11 - unaff_s10) {
    fVar25 = ((fVar24 - (float)in_stack_00000028[0x789]) - fVar33) / (unaff_s11 - unaff_s10);
    fVar24 = 1.0;
    if (fVar25 <= 1.0) {
      fVar24 = fVar25;
    }
    fVar26 = 0.0;
    if (0.0 <= fVar25) {
      fVar26 = fVar24;
    }
  }
  if (unaff_w27 != 0) {
    fVar26 = 1.0 - fVar26;
  }
  if ((in_stack_00000028[0x252] & 0x80U) != 0 || (unaff_w26 & 0x200000) != 0)
  goto joined_r0x001175c8;
LAB_00117894:
  uVar13 = unaff_x25;
  if (((unaff_x25 == unaff_x21) || (fVar26 <= 0.0)) || (uVar13 = unaff_x21, 1.0 <= fVar26)) {
LAB_00117950:
    if ((unaff_w20 == 8) && ((unaff_w26 >> 6 & 1) == 0)) {
      uVar13 = func_0x0012ac3c(in_x6,in_stack_00000030._4_4_);
    }
  }
  else {
    if ((unaff_w26 >> 5 & 1) != 0) {
      dVar29 = (double)fVar23;
      dVar30 = dVar29;
      if (dVar29 <= (double)unaff_x25) {
        dVar30 = (double)unaff_x25;
      }
      if (dVar29 <= (double)unaff_x21) {
        dVar29 = (double)unaff_x21;
      }
      dVar31 = dVar30;
      if (unaff_x25 <= unaff_x21) {
        dVar31 = dVar29;
        dVar29 = dVar30;
      }
      fVar24 = 1.0 - fVar26;
      if (unaff_x25 <= unaff_x21) {
        fVar24 = fVar26;
      }
      dVar30 = (double)_pow(dVar31 / dVar29,(double)fVar24);
      uVar13 = (ulong)(dVar29 * dVar30);
      goto LAB_00117950;
    }
    if (unaff_w20 == 8) {
      uVar13 = (ulong)((float)unaff_x25 + fVar26 * (float)in_stack_00000040);
      goto LAB_00117950;
    }
    if (1.0 <= fVar26) {
      uVar13 = 0;
    }
    else {
      fVar24 = -0.5;
      if (unaff_x25 <= unaff_x21) {
        fVar24 = 0.5;
      }
      uVar13 = (long)(fVar24 + fVar26 * (float)(long)in_stack_00000040) + unaff_x25;
    }
  }
  if (*in_stack_00000048 != uVar13) {
    *in_stack_00000048 = uVar13;
    uVar21 = 1;
    goto joined_r0x001175c8;
  }
  goto joined_r0x001175c8;
code_r0x00116fcc:
  do {
    pbVar10 = pbVar11;
    pbVar11 = pbVar10 + 1;
    bVar5 = *pbVar11;
    uVar15 = (uint)bVar5;
  } while (bVar5 - 0x30 < 10);
  if (bVar5 == 0x2e) {
    pbVar19 = pbVar10 + 2;
    bVar5 = *pbVar19;
    if (bVar5 == 0x2d) {
      pbVar19 = pbVar10 + 3;
    }
    pbVar10 = pbVar19;
    if (*pbVar19 == 0x2b) {
      pbVar10 = pbVar19 + 1;
    }
    uVar15 = (uint)*pbVar10;
    if (*pbVar10 - 0x30 < 10) {
      uVar18 = 0;
      lVar20 = (ulong)(bVar5 == 0x2d) + (ulong)(*pbVar19 == 0x2b) + 2;
      do {
        uVar18 = (uVar15 + uVar18 * 10) - 0x30;
        uVar15 = (uint)pbVar11[lVar20];
        lVar20 = lVar20 + 1;
      } while (uVar15 - 0x30 < 10);
    }
    else {
      uVar18 = 0;
    }
    uVar17 = -uVar18;
    if (bVar5 != 0x2d) {
      uVar17 = uVar18;
    }
    uVar18 = 3;
    if (uVar17 < 100) {
      uVar18 = uVar17;
    }
  }
  else {
    uVar18 = 0x7fffffff;
  }
  if ((uVar15 == 0x45) || (uVar15 == 0x65)) {
code_r0x001172c4:
    if (in_stack_00000038 - 1U < 100) {
      iVar8 = 1;
    }
    fVar28 = -1.0;
    if (0.0 <= fVar24) {
      fVar28 = 1.0;
    }
    fVar25 = fVar24 / 100.0;
    if (iVar8 == 1) {
      fVar25 = fVar28 / unaff_s15;
    }
  }
  else {
    if (uVar15 != 0x67) {
      if (0 < (int)uVar18 != (uVar15 == 0x47 && uVar18 == 0x7fffffff)) goto code_r0x00117284;
      goto code_r0x001172c4;
    }
    if (0x7ffffffd < uVar18 - 1) goto code_r0x001172c4;
code_r0x00117284:
    fVar25 = fVar24 / 100.0;
    if (iVar8 != 0) {
      fVar25 = (fVar24 / 100.0) / 10.0;
    }
  }
  fVar24 = fVar25 * 10.0;
  if (iVar9 == 0) {
    fVar24 = fVar25;
  }
  fVar24 = (float)in_stack_00000028[0x78a] + fVar24;
  in_stack_00000028[0x78a] = (int)fVar24;
  *pcVar1 = '\x01';
  iVar8 = in_stack_00000028[0x2b7];
  unaff_w27 = iStack0000000000000024;
joined_r0x0011732c:
  if ((iVar8 == unaff_w23) && ((char)in_stack_00000028[3] == '\0')) {
    iStack0000000000000024 = unaff_w27;
    func_0x000c24fc();
    unaff_w27 = iStack0000000000000024;
  }
  else if (*pcVar1 != '\0') {
    if (unaff_x25 == unaff_x21) {
      fVar25 = 0.0;
code_r0x001175a4:
      if ((0.0 < fVar25) || (0.0 <= fVar24)) {
        fVar27 = fVar24 + fVar25;
        fVar28 = 1.0;
        if (fVar27 <= 1.0) {
          fVar28 = fVar27;
        }
        fVar26 = 0.0;
        if (0.0 <= fVar27) {
          fVar26 = fVar28;
        }
        uVar13 = unaff_x25;
        if (((unaff_x25 == unaff_x21) || (fVar26 <= 0.0)) || (uVar13 = unaff_x21, 1.0 <= fVar26)) {
code_r0x001176d0:
          if ((unaff_w20 == 8) && ((unaff_w26 >> 6 & 1) == 0)) {
            uVar13 = func_0x0012ac3c(in_x6,in_stack_00000030._4_4_);
          }
        }
        else {
          if ((unaff_w26 >> 5 & 1) != 0) {
            dVar29 = (double)fVar23;
            dVar30 = dVar29;
            if (dVar29 <= (double)unaff_x25) {
              dVar30 = (double)unaff_x25;
            }
            if (dVar29 <= (double)unaff_x21) {
              dVar29 = (double)unaff_x21;
            }
            dVar31 = dVar30;
            if (unaff_x25 <= unaff_x21) {
              dVar31 = dVar29;
              dVar29 = dVar30;
            }
            fVar28 = 1.0 - fVar26;
            if (unaff_x25 <= unaff_x21) {
              fVar28 = fVar26;
            }
            dVar30 = (double)_pow(dVar31 / dVar29,(double)fVar28);
            uVar13 = (ulong)(dVar29 * dVar30);
            goto code_r0x001176d0;
          }
          if (unaff_w20 == 8) {
            uVar13 = (ulong)((float)unaff_x25 + fVar26 * (float)in_stack_00000040);
            goto code_r0x001176d0;
          }
          if (1.0 <= fVar26) {
            uVar13 = 0;
          }
          else {
            fVar28 = -0.5;
            if (unaff_x25 <= unaff_x21) {
              fVar28 = 0.5;
            }
            uVar13 = (long)(fVar28 + fVar26 * (float)(long)in_stack_00000040) + unaff_x25;
          }
        }
        fVar28 = 0.0;
        if (unaff_x25 != unaff_x21) {
          if (unaff_x25 < unaff_x21) {
            uVar12 = unaff_x21;
            uVar2 = unaff_x25;
          }
          else {
            uVar12 = unaff_x25;
            uVar2 = unaff_x21;
          }
          uVar3 = uVar13;
          if (uVar12 <= uVar13) {
            uVar3 = uVar12;
          }
          uVar4 = uVar2;
          if (uVar2 <= uVar13) {
            uVar4 = uVar3;
          }
          if ((unaff_w26 >> 5 & 1) == 0) {
            fVar28 = (float)((double)(long)(uVar4 - unaff_x25) / (double)(long)in_stack_00000040);
          }
          else {
            dVar30 = (double)fVar23;
            dVar29 = dVar30;
            if (dVar30 <= (double)uVar2) {
              dVar29 = (double)uVar2;
            }
            if (dVar30 <= (double)uVar12) {
              dVar30 = (double)uVar12;
            }
            dVar31 = (double)uVar4;
            fVar27 = 0.0;
            if ((dVar29 < dVar31) && (fVar27 = 1.0, dVar31 < dVar30)) {
              dVar31 = (double)_log(dVar31 / dVar29);
              dVar29 = (double)_log(dVar30 / dVar29);
              fVar27 = (float)(dVar31 / dVar29);
            }
            fVar28 = 1.0 - fVar27;
            if (unaff_x25 <= unaff_x21) {
              fVar28 = fVar27;
            }
          }
        }
        fVar28 = fVar28 - fVar25;
        bVar6 = fVar28 < fVar24;
        if (fVar24 <= 0.0) {
          bVar6 = fVar28 >= fVar24;
        }
        if (!bVar6) {
          fVar28 = fVar24;
        }
        in_stack_00000028[0x78a] = (int)((float)in_stack_00000028[0x78a] - fVar28);
        *pcVar1 = '\0';
        if ((in_stack_00000028[0x252] & 0x80U) == 0 && (unaff_w26 & 0x200000) == 0)
        goto LAB_00117894;
        goto joined_r0x001175c8;
      }
    }
    else {
      uVar12 = *in_stack_00000048;
      uVar13 = unaff_x25;
      if (unaff_x21 <= unaff_x25) {
        uVar13 = unaff_x21;
      }
      uVar2 = unaff_x25;
      if (unaff_x25 <= unaff_x21) {
        uVar2 = unaff_x21;
      }
      uVar3 = uVar12;
      if (uVar2 <= uVar12) {
        uVar3 = uVar2;
      }
      uVar4 = uVar13;
      if (uVar13 <= uVar12) {
        uVar4 = uVar3;
      }
      if ((unaff_w26 >> 5 & 1) == 0) {
        fVar25 = (float)((double)(long)(uVar4 - unaff_x25) / (double)(long)in_stack_00000040);
      }
      else {
        dVar29 = (double)fVar23;
        dVar30 = dVar29;
        if (dVar29 <= (double)uVar13) {
          dVar30 = (double)uVar13;
        }
        if (dVar29 <= (double)uVar2) {
          dVar29 = (double)uVar2;
        }
        dVar31 = (double)uVar4;
        fVar28 = 0.0;
        if ((dVar30 < dVar31) && (fVar28 = 1.0, dVar31 < dVar29)) {
          dVar31 = (double)_log(dVar31 / dVar30);
          dVar29 = (double)_log(dVar29 / dVar30);
          fVar28 = (float)(dVar31 / dVar29);
        }
        fVar25 = 1.0 - fVar28;
        if (unaff_x25 <= unaff_x21) {
          fVar25 = fVar28;
        }
      }
      if ((fVar25 < 1.0) || (fVar24 <= 0.0)) goto code_r0x001175a4;
    }
    in_stack_00000028[0x78a] = 0;
    *pcVar1 = '\0';
  }
joined_r0x001175c8:
  uVar21 = 0;
joined_r0x001175c8:
  if (unaff_s11 < 1.0) {
    uVar14 = *(undefined8 *)unaff_x19;
    *(undefined8 *)pfVar22 = uVar14;
    *(undefined8 *)(pfVar22 + 2) = uVar14;
  }
  else {
    fVar24 = 0.0;
    if (unaff_x25 != unaff_x21) {
      uVar13 = *in_stack_00000048;
      if (unaff_x25 < unaff_x21) {
        uVar12 = unaff_x21;
        uVar2 = unaff_x25;
      }
      else {
        uVar12 = unaff_x25;
        uVar2 = unaff_x21;
      }
      uVar3 = uVar13;
      if (uVar12 <= uVar13) {
        uVar3 = uVar12;
      }
      uVar4 = uVar2;
      if (uVar2 <= uVar13) {
        uVar4 = uVar3;
      }
      if ((unaff_w26 >> 5 & 1) == 0) {
        fVar24 = (float)((double)(long)(uVar4 - unaff_x25) / (double)(long)in_stack_00000040);
      }
      else {
        dVar30 = (double)fVar23;
        dVar29 = dVar30;
        if (dVar30 <= (double)uVar2) {
          dVar29 = (double)uVar2;
        }
        if (dVar30 <= (double)uVar12) {
          dVar30 = (double)uVar12;
        }
        dVar31 = (double)uVar4;
        fVar23 = 0.0;
        if ((dVar29 < dVar31) && (fVar23 = 1.0, dVar31 < dVar30)) {
          dVar31 = (double)_log(dVar31 / dVar29);
          dVar29 = (double)_log(dVar30 / dVar29);
          fVar23 = (float)(dVar31 / dVar29);
        }
        fVar24 = 1.0 - fVar23;
        if (unaff_x25 <= unaff_x21) {
          fVar24 = fVar23;
        }
      }
    }
    if (unaff_w27 != 0) {
      fVar24 = 1.0 - fVar24;
    }
    fVar33 = fVar33 + fVar24 * (fVar34 - fVar33);
    if (unaff_w27 == 0) {
      fVar34 = unaff_x19[1];
      fVar23 = unaff_x19[3];
      *pfVar22 = fVar33 + fVar32 * 0.5;
      pfVar22[1] = fVar34 + 2.0;
      pfVar22[2] = fVar33 + unaff_s10 * 0.5;
      pfVar22[3] = fVar23 + -2.0;
    }
    else {
      fVar23 = unaff_x19[2];
      *pfVar22 = *unaff_x19 + 2.0;
      pfVar22[1] = fVar33 + fVar32 * 0.5;
      pfVar22[2] = fVar23 + -2.0;
      pfVar22[3] = fVar33 + unaff_s10 * 0.5;
    }
  }
  return uVar21;
}

