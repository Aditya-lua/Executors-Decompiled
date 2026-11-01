
undefined8 FUN_001159b0(long param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  bool bVar5;
  uint uVar6;
  undefined8 in_x6;
  undefined8 uVar7;
  uint in_w9;
  int in_w10;
  uint in_w11;
  long in_x12;
  long lVar8;
  float *unaff_x19;
  uint unaff_w20;
  uint unaff_w21;
  uint unaff_w22;
  long unaff_x23;
  undefined8 uVar9;
  char *unaff_x25;
  int unaff_w26;
  float *unaff_x27;
  int unaff_w28;
  float fVar10;
  float fVar11;
  float fVar12;
  float fVar13;
  float fVar14;
  float fVar15;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  float unaff_s15;
  float fVar16;
  int iStack0000000000000010;
  int iStack0000000000000014;
  undefined8 in_stack_00000020;
  int in_stack_00000028;
  undefined8 in_stack_00000030;
  uint *in_stack_00000038;
  
  lVar8 = in_x12 + 2;
  do {
    in_w11 = (in_w9 + in_w11 * 10) - 0x30;
    in_w9 = (uint)*(byte *)(param_1 + lVar8);
    lVar8 = lVar8 + 1;
  } while (in_w9 - 0x30 < 10);
  uVar6 = -in_w11;
  if (in_w10 != 0x2d) {
    uVar6 = in_w11;
  }
  uVar4 = 3;
  if (uVar6 < 100) {
    uVar4 = uVar6;
  }
  if ((in_w9 == 0x45) || (in_w9 == 0x65)) {
code_r0x00115c48:
    if (in_stack_00000028 - 1U < 100) {
      iStack0000000000000010 = 1;
    }
    fVar16 = -1.0;
    if (0.0 <= unaff_s9) {
      fVar16 = 1.0;
    }
    fVar12 = unaff_s9 / 100.0;
    if (iStack0000000000000010 == 1) {
      fVar12 = fVar16 / unaff_s15;
    }
  }
  else {
    if (in_w9 == 0x67) {
      if (0x7ffffffd < uVar4 - 1) goto code_r0x00115c48;
    }
    else if (0 < (int)uVar4 == (in_w9 == 0x47 && uVar4 == 0x7fffffff)) goto code_r0x00115c48;
    fVar12 = unaff_s9 / 100.0;
    if (iStack0000000000000010 != 0) {
      fVar12 = (unaff_s9 / 100.0) / 10.0;
    }
  }
  fVar16 = fVar12 * 10.0;
  if (param_2 == 0) {
    fVar16 = fVar12;
  }
  fVar16 = *(float *)(&UNK_00001e28 + unaff_x23) + fVar16;
  *(float *)(&UNK_00001e28 + unaff_x23) = fVar16;
  *unaff_x25 = '\x01';
  if ((*(int *)(unaff_x23 + 0xadc) == iStack0000000000000014) &&
     (*(char *)(unaff_x23 + 0xc) == '\0')) {
    func_0x000c24fc();
  }
  else if (*unaff_x25 != '\0') {
    if (unaff_w20 == unaff_w21) {
      fVar12 = 0.0;
LAB_00115f1c:
      if ((0.0 < fVar12) || (0.0 <= fVar16)) {
        fVar10 = fVar16 + fVar12;
        fVar15 = 1.0;
        if (fVar10 <= 1.0) {
          fVar15 = fVar10;
        }
        fVar13 = 0.0;
        if (0.0 <= fVar10) {
          fVar13 = fVar15;
        }
        uVar6 = unaff_w20;
        if (((unaff_w20 == unaff_w21) || (fVar13 <= 0.0)) || (uVar6 = unaff_w21, 1.0 <= fVar13)) {
LAB_00116034:
          if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
            uVar6 = func_0x0012a52c(in_x6,in_stack_00000020._4_4_);
          }
        }
        else {
          if ((unaff_w22 >> 5 & 1) != 0) {
            fVar15 = unaff_s8;
            if (unaff_s8 <= (float)unaff_w20) {
              fVar15 = (float)unaff_w20;
            }
            fVar10 = unaff_s8;
            if (unaff_s8 <= (float)unaff_w21) {
              fVar10 = (float)unaff_w21;
            }
            fVar11 = fVar15;
            if (unaff_w20 <= unaff_w21) {
              fVar11 = fVar10;
              fVar10 = fVar15;
            }
            fVar15 = 1.0 - fVar13;
            if (unaff_w20 <= unaff_w21) {
              fVar15 = fVar13;
            }
            fVar15 = (float)_powf(fVar11 / fVar10,fVar15);
            fVar10 = fVar10 * fVar15;
LAB_00116030:
            uVar6 = (uint)fVar10;
            goto LAB_00116034;
          }
          if (unaff_w26 == 8) {
            fVar10 = (float)unaff_w20 + fVar13 * (float)in_stack_00000030._4_4_;
            goto LAB_00116030;
          }
          if (1.0 <= fVar13) {
            uVar6 = 0;
          }
          else {
            fVar15 = -0.5;
            if (unaff_w20 <= unaff_w21) {
              fVar15 = 0.5;
            }
            uVar6 = (int)(fVar15 + fVar13 * (float)(int)in_stack_00000030._4_4_) + unaff_w20;
          }
        }
        fVar15 = 0.0;
        if (unaff_w20 != unaff_w21) {
          if (unaff_w20 < unaff_w21) {
            uVar4 = unaff_w21;
            uVar1 = unaff_w20;
          }
          else {
            uVar4 = unaff_w20;
            uVar1 = unaff_w21;
          }
          uVar2 = uVar6;
          if (uVar4 <= uVar6) {
            uVar2 = uVar4;
          }
          uVar3 = uVar1;
          if (uVar1 <= uVar6) {
            uVar3 = uVar2;
          }
          if ((unaff_w22 >> 5 & 1) == 0) {
            fVar15 = (float)(int)(uVar3 - unaff_w20) / (float)(int)in_stack_00000030._4_4_;
          }
          else {
            fVar15 = unaff_s8;
            if (unaff_s8 <= (float)uVar1) {
              fVar15 = (float)uVar1;
            }
            fVar10 = unaff_s8;
            if (unaff_s8 <= (float)uVar4) {
              fVar10 = (float)uVar4;
            }
            fVar14 = (float)uVar3;
            fVar11 = 0.0;
            if ((fVar15 < fVar14) && (fVar11 = 1.0, fVar14 < fVar10)) {
              fVar11 = (float)_logf(fVar14 / fVar15);
              fVar15 = (float)_logf(fVar10 / fVar15);
              fVar11 = fVar11 / fVar15;
            }
            fVar15 = 1.0 - fVar11;
            if (unaff_w20 <= unaff_w21) {
              fVar15 = fVar11;
            }
          }
        }
        fVar15 = fVar15 - fVar12;
        bVar5 = fVar15 < fVar16;
        if (fVar16 <= 0.0) {
          bVar5 = fVar15 >= fVar16;
        }
        if (!bVar5) {
          fVar15 = fVar16;
        }
        *(float *)(&UNK_00001e28 + unaff_x23) = *(float *)(&UNK_00001e28 + unaff_x23) - fVar15;
        *unaff_x25 = '\0';
        if ((*(uint *)(unaff_x23 + 0x948) & 0x80) != 0 || (unaff_w22 & 0x200000) != 0)
        goto joined_r0x001162d8;
        uVar6 = unaff_w20;
        if (((unaff_w20 == unaff_w21) || (fVar13 <= 0.0)) || (uVar6 = unaff_w21, 1.0 <= fVar13)) {
LAB_00116298:
          if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
            uVar6 = func_0x0012a52c(in_x6,in_stack_00000020._4_4_);
          }
        }
        else {
          if ((unaff_w22 >> 5 & 1) != 0) {
            fVar16 = unaff_s8;
            if (unaff_s8 <= (float)unaff_w20) {
              fVar16 = (float)unaff_w20;
            }
            fVar12 = unaff_s8;
            if (unaff_s8 <= (float)unaff_w21) {
              fVar12 = (float)unaff_w21;
            }
            fVar15 = fVar16;
            if (unaff_w20 <= unaff_w21) {
              fVar15 = fVar12;
              fVar12 = fVar16;
            }
            fVar16 = 1.0 - fVar13;
            if (unaff_w20 <= unaff_w21) {
              fVar16 = fVar13;
            }
            fVar16 = (float)_powf(fVar15 / fVar12,fVar16);
            fVar12 = fVar12 * fVar16;
LAB_00116294:
            uVar6 = (uint)fVar12;
            goto LAB_00116298;
          }
          if (unaff_w26 == 8) {
            fVar12 = (float)unaff_w20 + fVar13 * (float)in_stack_00000030._4_4_;
            goto LAB_00116294;
          }
          if (1.0 <= fVar13) {
            uVar6 = 0;
          }
          else {
            fVar16 = -0.5;
            if (unaff_w20 <= unaff_w21) {
              fVar16 = 0.5;
            }
            uVar6 = (int)(fVar16 + fVar13 * (float)(int)in_stack_00000030._4_4_) + unaff_w20;
          }
        }
        if (*in_stack_00000038 != uVar6) {
          *in_stack_00000038 = uVar6;
          uVar9 = 1;
          goto joined_r0x00116328;
        }
        goto joined_r0x001162d8;
      }
    }
    else {
      uVar4 = *in_stack_00000038;
      uVar6 = unaff_w20;
      if (unaff_w21 <= unaff_w20) {
        uVar6 = unaff_w21;
      }
      uVar1 = unaff_w20;
      if (unaff_w20 <= unaff_w21) {
        uVar1 = unaff_w21;
      }
      uVar2 = uVar4;
      if (uVar1 <= uVar4) {
        uVar2 = uVar1;
      }
      uVar3 = uVar6;
      if (uVar6 <= uVar4) {
        uVar3 = uVar2;
      }
      if ((unaff_w22 >> 5 & 1) == 0) {
        fVar12 = (float)(int)(uVar3 - unaff_w20) / (float)(int)in_stack_00000030._4_4_;
      }
      else {
        fVar12 = unaff_s8;
        if (unaff_s8 <= (float)uVar6) {
          fVar12 = (float)uVar6;
        }
        fVar15 = unaff_s8;
        if (unaff_s8 <= (float)uVar1) {
          fVar15 = (float)uVar1;
        }
        fVar13 = (float)uVar3;
        fVar10 = 0.0;
        if ((fVar12 < fVar13) && (fVar10 = 1.0, fVar13 < fVar15)) {
          fVar10 = (float)_logf(fVar13 / fVar12);
          fVar12 = (float)_logf(fVar15 / fVar12);
          fVar10 = fVar10 / fVar12;
        }
        fVar12 = 1.0 - fVar10;
        if (unaff_w20 <= unaff_w21) {
          fVar12 = fVar10;
        }
      }
      if ((fVar12 < 1.0) || (fVar16 <= 0.0)) goto LAB_00115f1c;
    }
    uVar9 = 0;
    *(undefined4 *)(&UNK_00001e28 + unaff_x23) = 0;
    *unaff_x25 = '\0';
    goto joined_r0x00116328;
  }
joined_r0x001162d8:
  uVar9 = 0;
joined_r0x00116328:
  if (1.0 <= unaff_s11) {
    fVar16 = 0.0;
    if (unaff_w20 != unaff_w21) {
      uVar6 = *in_stack_00000038;
      if (unaff_w20 < unaff_w21) {
        uVar4 = unaff_w21;
        uVar1 = unaff_w20;
      }
      else {
        uVar4 = unaff_w20;
        uVar1 = unaff_w21;
      }
      uVar2 = uVar6;
      if (uVar4 <= uVar6) {
        uVar2 = uVar4;
      }
      uVar3 = uVar1;
      if (uVar1 <= uVar6) {
        uVar3 = uVar2;
      }
      if ((unaff_w22 >> 5 & 1) == 0) {
        fVar16 = (float)(int)(uVar3 - unaff_w20) / (float)(int)in_stack_00000030._4_4_;
      }
      else {
        fVar16 = unaff_s8;
        if (unaff_s8 <= (float)uVar1) {
          fVar16 = (float)uVar1;
        }
        if (unaff_s8 <= (float)uVar4) {
          unaff_s8 = (float)uVar4;
        }
        fVar15 = (float)uVar3;
        fVar12 = 0.0;
        if ((fVar16 < fVar15) && (fVar12 = 1.0, fVar15 < unaff_s8)) {
          fVar12 = (float)_logf(fVar15 / fVar16);
          fVar16 = (float)_logf(unaff_s8 / fVar16);
          fVar12 = fVar12 / fVar16;
        }
        fVar16 = 1.0 - fVar12;
        if (unaff_w20 <= unaff_w21) {
          fVar16 = fVar12;
        }
      }
    }
    if (unaff_w28 != 0) {
      fVar16 = 1.0 - fVar16;
    }
    fVar16 = unaff_s13 + fVar16 * (unaff_s14 - unaff_s13);
    if (unaff_w28 == 0) {
      fVar15 = unaff_x19[1];
      fVar12 = unaff_x19[3];
      *unaff_x27 = fVar16 + unaff_s12 * 0.5;
      unaff_x27[1] = fVar15 + 2.0;
      unaff_x27[2] = fVar16 + unaff_s10 * 0.5;
      unaff_x27[3] = fVar12 + -2.0;
    }
    else {
      fVar12 = unaff_x19[2];
      *unaff_x27 = *unaff_x19 + 2.0;
      unaff_x27[1] = fVar16 + unaff_s12 * 0.5;
      unaff_x27[2] = fVar12 + -2.0;
      unaff_x27[3] = fVar16 + unaff_s10 * 0.5;
    }
  }
  else {
    uVar7 = *(undefined8 *)unaff_x19;
    *(undefined8 *)unaff_x27 = uVar7;
    *(undefined8 *)(unaff_x27 + 2) = uVar7;
  }
  return uVar9;
}

