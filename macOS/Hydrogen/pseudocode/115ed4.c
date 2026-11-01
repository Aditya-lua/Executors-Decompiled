
undefined8 FUN_00115ed4(float param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  bool bVar4;
  uint uVar5;
  uint uVar6;
  undefined8 in_x6;
  undefined8 uVar7;
  uint unaff_w20;
  uint unaff_w21;
  float *unaff_x22;
  long unaff_x23;
  int unaff_w24;
  undefined8 uVar8;
  uint unaff_w25;
  int unaff_w26;
  float *unaff_x27;
  undefined1 *unaff_x28;
  float fVar9;
  float fVar10;
  float fVar11;
  float fVar12;
  float fVar13;
  float fVar14;
  float unaff_s8;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  float unaff_s15;
  undefined8 in_stack_00000020;
  float in_stack_00000028;
  undefined8 in_stack_00000030;
  uint *in_stack_00000038;
  
  fVar9 = 1.0 - in_stack_00000028 / param_1;
  if (unaff_w20 <= unaff_w25) {
    fVar9 = in_stack_00000028 / param_1;
  }
  if (((1.0 <= fVar9) && (0.0 < unaff_s15)) || ((fVar9 <= 0.0 && (unaff_s15 < 0.0)))) {
    uVar8 = 0;
    *(undefined4 *)(&UNK_00001e28 + unaff_x23) = 0;
    *unaff_x28 = 0;
    goto joined_r0x001162d8;
  }
  fVar13 = unaff_s15 + fVar9;
  fVar11 = 1.0;
  if (fVar13 <= 1.0) {
    fVar11 = fVar13;
  }
  fVar14 = 0.0;
  if (0.0 <= fVar13) {
    fVar14 = fVar11;
  }
  uVar6 = unaff_w20;
  if (((unaff_w20 == unaff_w25) || (fVar14 <= 0.0)) || (uVar6 = unaff_w25, 1.0 <= fVar14)) {
LAB_00116034:
    if ((unaff_w26 == 8) && ((unaff_w21 >> 6 & 1) == 0)) {
      uVar6 = func_0x0012a52c(in_x6,in_stack_00000020._4_4_);
    }
  }
  else {
    if ((unaff_w21 >> 5 & 1) != 0) {
      fVar11 = unaff_s8;
      if (unaff_s8 <= (float)unaff_w20) {
        fVar11 = (float)unaff_w20;
      }
      fVar13 = unaff_s8;
      if (unaff_s8 <= (float)unaff_w25) {
        fVar13 = (float)unaff_w25;
      }
      fVar10 = fVar11;
      if (unaff_w20 <= unaff_w25) {
        fVar10 = fVar13;
        fVar13 = fVar11;
      }
      fVar11 = 1.0 - fVar14;
      if (unaff_w20 <= unaff_w25) {
        fVar11 = fVar14;
      }
      fVar11 = (float)_powf(fVar10 / fVar13,fVar11);
      fVar13 = fVar13 * fVar11;
LAB_00116030:
      uVar6 = (uint)fVar13;
      goto LAB_00116034;
    }
    if (unaff_w26 == 8) {
      fVar13 = (float)unaff_w20 + fVar14 * (float)in_stack_00000030._4_4_;
      goto LAB_00116030;
    }
    if (1.0 <= fVar14) {
      uVar6 = 0;
    }
    else {
      fVar11 = -0.5;
      if (unaff_w20 <= unaff_w25) {
        fVar11 = 0.5;
      }
      uVar6 = (int)(fVar11 + fVar14 * (float)(int)in_stack_00000030._4_4_) + unaff_w20;
    }
  }
  fVar11 = 0.0;
  if (unaff_w20 != unaff_w25) {
    if (unaff_w20 < unaff_w25) {
      uVar1 = unaff_w25;
      uVar5 = unaff_w20;
    }
    else {
      uVar1 = unaff_w20;
      uVar5 = unaff_w25;
    }
    uVar2 = uVar6;
    if (uVar1 <= uVar6) {
      uVar2 = uVar1;
    }
    uVar3 = uVar5;
    if (uVar5 <= uVar6) {
      uVar3 = uVar2;
    }
    if ((unaff_w21 >> 5 & 1) == 0) {
      fVar11 = (float)(int)(uVar3 - unaff_w20) / (float)(int)in_stack_00000030._4_4_;
    }
    else {
      fVar11 = unaff_s8;
      if (unaff_s8 <= (float)uVar5) {
        fVar11 = (float)uVar5;
      }
      fVar13 = unaff_s8;
      if (unaff_s8 <= (float)uVar1) {
        fVar13 = (float)uVar1;
      }
      fVar12 = (float)uVar3;
      fVar10 = 0.0;
      if ((fVar11 < fVar12) && (fVar10 = 1.0, fVar12 < fVar13)) {
        fVar10 = (float)_logf(fVar12 / fVar11);
        fVar11 = (float)_logf(fVar13 / fVar11);
        fVar10 = fVar10 / fVar11;
      }
      fVar11 = 1.0 - fVar10;
      if (unaff_w20 <= unaff_w25) {
        fVar11 = fVar10;
      }
    }
  }
  fVar11 = fVar11 - fVar9;
  bVar4 = fVar11 < unaff_s15;
  if (unaff_s15 <= 0.0) {
    bVar4 = fVar11 >= unaff_s15;
  }
  if (!bVar4) {
    fVar11 = unaff_s15;
  }
  *(float *)(&UNK_00001e28 + unaff_x23) = *(float *)(&UNK_00001e28 + unaff_x23) - fVar11;
  *unaff_x28 = 0;
  if ((*(uint *)(unaff_x23 + 0x948) & 0x80) == 0 && (unaff_w21 & 0x200000) == 0) {
    uVar6 = unaff_w20;
    if (((unaff_w20 == unaff_w25) || (fVar14 <= 0.0)) || (uVar6 = unaff_w25, 1.0 <= fVar14)) {
LAB_00116298:
      if ((unaff_w26 == 8) && ((unaff_w21 >> 6 & 1) == 0)) {
        uVar6 = func_0x0012a52c(in_x6,in_stack_00000020._4_4_);
      }
    }
    else {
      if ((unaff_w21 >> 5 & 1) != 0) {
        fVar9 = unaff_s8;
        if (unaff_s8 <= (float)unaff_w20) {
          fVar9 = (float)unaff_w20;
        }
        fVar11 = unaff_s8;
        if (unaff_s8 <= (float)unaff_w25) {
          fVar11 = (float)unaff_w25;
        }
        fVar13 = fVar9;
        if (unaff_w20 <= unaff_w25) {
          fVar13 = fVar11;
          fVar11 = fVar9;
        }
        fVar9 = 1.0 - fVar14;
        if (unaff_w20 <= unaff_w25) {
          fVar9 = fVar14;
        }
        fVar9 = (float)_powf(fVar13 / fVar11,fVar9);
        fVar11 = fVar11 * fVar9;
LAB_00116294:
        uVar6 = (uint)fVar11;
        goto LAB_00116298;
      }
      if (unaff_w26 == 8) {
        fVar11 = (float)unaff_w20 + fVar14 * (float)in_stack_00000030._4_4_;
        goto LAB_00116294;
      }
      if (1.0 <= fVar14) {
        uVar6 = 0;
      }
      else {
        fVar9 = -0.5;
        if (unaff_w20 <= unaff_w25) {
          fVar9 = 0.5;
        }
        uVar6 = (int)(fVar9 + fVar14 * (float)(int)in_stack_00000030._4_4_) + unaff_w20;
      }
    }
    if (*in_stack_00000038 != uVar6) {
      *in_stack_00000038 = uVar6;
      uVar8 = 1;
      goto joined_r0x001162d8;
    }
  }
  uVar8 = 0;
joined_r0x001162d8:
  if (1.0 <= unaff_s11) {
    fVar9 = 0.0;
    if (unaff_w20 != unaff_w25) {
      uVar6 = *in_stack_00000038;
      if (unaff_w20 < unaff_w25) {
        uVar1 = unaff_w25;
        uVar5 = unaff_w20;
      }
      else {
        uVar1 = unaff_w20;
        uVar5 = unaff_w25;
      }
      uVar2 = uVar6;
      if (uVar1 <= uVar6) {
        uVar2 = uVar1;
      }
      uVar3 = uVar5;
      if (uVar5 <= uVar6) {
        uVar3 = uVar2;
      }
      if ((unaff_w21 >> 5 & 1) == 0) {
        fVar9 = (float)(int)(uVar3 - unaff_w20) / (float)(int)in_stack_00000030._4_4_;
      }
      else {
        fVar9 = unaff_s8;
        if (unaff_s8 <= (float)uVar5) {
          fVar9 = (float)uVar5;
        }
        if (unaff_s8 <= (float)uVar1) {
          unaff_s8 = (float)uVar1;
        }
        fVar13 = (float)uVar3;
        fVar11 = 0.0;
        if ((fVar9 < fVar13) && (fVar11 = 1.0, fVar13 < unaff_s8)) {
          fVar11 = (float)_logf(fVar13 / fVar9);
          fVar9 = (float)_logf(unaff_s8 / fVar9);
          fVar11 = fVar11 / fVar9;
        }
        fVar9 = 1.0 - fVar11;
        if (unaff_w20 <= unaff_w25) {
          fVar9 = fVar11;
        }
      }
    }
    if (unaff_w24 != 0) {
      fVar9 = 1.0 - fVar9;
    }
    fVar9 = unaff_s13 + fVar9 * (unaff_s14 - unaff_s13);
    if (unaff_w24 == 0) {
      fVar13 = unaff_x22[1];
      fVar11 = unaff_x22[3];
      *unaff_x27 = fVar9 + unaff_s12 * 0.5;
      unaff_x27[1] = fVar13 + 2.0;
      unaff_x27[2] = fVar9 + unaff_s10 * 0.5;
      unaff_x27[3] = fVar11 + -2.0;
    }
    else {
      fVar11 = unaff_x22[2];
      *unaff_x27 = *unaff_x22 + 2.0;
      unaff_x27[1] = fVar9 + unaff_s12 * 0.5;
      unaff_x27[2] = fVar11 + -2.0;
      unaff_x27[3] = fVar9 + unaff_s10 * 0.5;
    }
  }
  else {
    uVar7 = *(undefined8 *)unaff_x22;
    *(undefined8 *)unaff_x27 = uVar7;
    *(undefined8 *)(unaff_x27 + 2) = uVar7;
  }
  return uVar8;
}

