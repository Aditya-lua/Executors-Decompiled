
undefined8 FUN_00115ea0(undefined1 param_1 [16],undefined1 param_2 [16],float param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  bool bVar4;
  uint uVar5;
  uint uVar6;
  undefined8 in_x6;
  undefined8 uVar7;
  int in_w12;
  float *unaff_x19;
  uint unaff_w20;
  uint unaff_w21;
  uint unaff_w22;
  long unaff_x23;
  undefined8 uVar8;
  undefined1 *unaff_x25;
  int unaff_w26;
  float *unaff_x27;
  float fVar9;
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
  float fStack0000000000000014;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  uint *in_stack_00000038;
  
  fStack0000000000000014 = param_3;
  fVar10 = (float)_logf();
  fVar11 = (float)_logf(fStack0000000000000014 / unaff_s9);
  fVar9 = 1.0 - fVar10 / fVar11;
  if (unaff_w20 <= unaff_w21) {
    fVar9 = fVar10 / fVar11;
  }
  fVar10 = (float)(uint)(0.0 < unaff_s15);
  if (((1.0 <= fVar9) && (0.0 < unaff_s15)) || ((fVar9 <= 0.0 && (unaff_s15 < 0.0)))) {
    uVar8 = 0;
    *(undefined4 *)(&UNK_00001e28 + unaff_x23) = 0;
    *unaff_x25 = 0;
    goto joined_r0x001162d8;
  }
  fVar12 = unaff_s15 + fVar9;
  fVar11 = 1.0;
  if (fVar12 <= 1.0) {
    fVar11 = fVar12;
  }
  fVar15 = 0.0;
  if (0.0 <= fVar12) {
    fVar15 = fVar11;
  }
  uVar6 = unaff_w20;
  if (((unaff_w20 == unaff_w21) || (fVar15 <= 0.0)) || (uVar6 = unaff_w21, 1.0 <= fVar15)) {
LAB_00116034:
    if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
      fStack0000000000000014 = (float)(uint)(0.0 < unaff_s15);
      uVar6 = func_0x0012a52c(in_x6,in_stack_00000020._4_4_);
      fVar10 = fStack0000000000000014;
    }
  }
  else {
    if ((unaff_w22 >> 5 & 1) != 0) {
      fVar11 = unaff_s8;
      if (unaff_s8 <= (float)unaff_w20) {
        fVar11 = (float)unaff_w20;
      }
      fVar12 = unaff_s8;
      if (unaff_s8 <= (float)unaff_w21) {
        fVar12 = (float)unaff_w21;
      }
      fVar13 = fVar11;
      if (unaff_w20 <= unaff_w21) {
        fVar13 = fVar12;
        fVar12 = fVar11;
      }
      fVar11 = 1.0 - fVar15;
      if (unaff_w20 <= unaff_w21) {
        fVar11 = fVar15;
      }
      fStack0000000000000014 = fVar15;
      fVar11 = (float)_powf(fVar13 / fVar12,fVar11);
      fVar12 = fVar12 * fVar11;
      fVar15 = fStack0000000000000014;
LAB_00116030:
      uVar6 = (uint)fVar12;
      goto LAB_00116034;
    }
    if (unaff_w26 == 8) {
      fVar12 = (float)unaff_w20 + fVar15 * (float)in_stack_00000030._4_4_;
      goto LAB_00116030;
    }
    if (1.0 <= fVar15) {
      uVar6 = 0;
    }
    else {
      fVar11 = -0.5;
      if (unaff_w20 <= unaff_w21) {
        fVar11 = 0.5;
      }
      uVar6 = (int)(fVar11 + fVar15 * (float)(int)in_stack_00000030._4_4_) + unaff_w20;
    }
  }
  fVar11 = 0.0;
  if (unaff_w20 != unaff_w21) {
    if (unaff_w20 < unaff_w21) {
      uVar1 = unaff_w21;
      uVar5 = unaff_w20;
    }
    else {
      uVar1 = unaff_w20;
      uVar5 = unaff_w21;
    }
    uVar2 = uVar6;
    if (uVar1 <= uVar6) {
      uVar2 = uVar1;
    }
    uVar3 = uVar5;
    if (uVar5 <= uVar6) {
      uVar3 = uVar2;
    }
    if ((unaff_w22 >> 5 & 1) == 0) {
      fVar11 = (float)(int)(uVar3 - unaff_w20) / (float)(int)in_stack_00000030._4_4_;
    }
    else {
      fVar11 = unaff_s8;
      if (unaff_s8 <= (float)uVar5) {
        fVar11 = (float)uVar5;
      }
      fVar12 = unaff_s8;
      if (unaff_s8 <= (float)uVar1) {
        fVar12 = (float)uVar1;
      }
      fVar14 = (float)uVar3;
      fVar13 = 0.0;
      if ((fVar11 < fVar14) && (fVar13 = 1.0, fVar14 < fVar12)) {
        fStack0000000000000014 = fVar15;
        fVar13 = (float)_logf(fVar14 / fVar11);
        fVar11 = (float)_logf(fVar12 / fVar11);
        fVar13 = fVar13 / fVar11;
        fVar15 = fStack0000000000000014;
      }
      fVar11 = 1.0 - fVar13;
      if (unaff_w20 <= unaff_w21) {
        fVar11 = fVar13;
      }
    }
  }
  fVar11 = fVar11 - fVar9;
  bVar4 = fVar11 < unaff_s15;
  if (fVar10 == 0.0) {
    bVar4 = fVar11 >= unaff_s15;
  }
  if (!bVar4) {
    fVar11 = unaff_s15;
  }
  *(float *)(&UNK_00001e28 + unaff_x23) = *(float *)(&UNK_00001e28 + unaff_x23) - fVar11;
  *unaff_x25 = 0;
  if ((*(uint *)(unaff_x23 + 0x948) & 0x80) == 0 && (unaff_w22 & 0x200000) == 0) {
    uVar6 = unaff_w20;
    if (((unaff_w20 == unaff_w21) || (fVar15 <= 0.0)) || (uVar6 = unaff_w21, 1.0 <= fVar15)) {
LAB_00116298:
      if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
        uVar6 = func_0x0012a52c(in_x6,in_stack_00000020._4_4_);
      }
    }
    else {
      if ((unaff_w22 >> 5 & 1) != 0) {
        fVar9 = unaff_s8;
        if (unaff_s8 <= (float)unaff_w20) {
          fVar9 = (float)unaff_w20;
        }
        fVar10 = unaff_s8;
        if (unaff_s8 <= (float)unaff_w21) {
          fVar10 = (float)unaff_w21;
        }
        fVar11 = fVar9;
        if (unaff_w20 <= unaff_w21) {
          fVar11 = fVar10;
          fVar10 = fVar9;
        }
        fVar9 = 1.0 - fVar15;
        if (unaff_w20 <= unaff_w21) {
          fVar9 = fVar15;
        }
        fVar9 = (float)_powf(fVar11 / fVar10,fVar9);
        fVar10 = fVar10 * fVar9;
LAB_00116294:
        uVar6 = (uint)fVar10;
        goto LAB_00116298;
      }
      if (unaff_w26 == 8) {
        fVar10 = (float)unaff_w20 + fVar15 * (float)in_stack_00000030._4_4_;
        goto LAB_00116294;
      }
      if (1.0 <= fVar15) {
        uVar6 = 0;
      }
      else {
        fVar9 = -0.5;
        if (unaff_w20 <= unaff_w21) {
          fVar9 = 0.5;
        }
        uVar6 = (int)(fVar9 + fVar15 * (float)(int)in_stack_00000030._4_4_) + unaff_w20;
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
    if (unaff_w20 != unaff_w21) {
      uVar6 = *in_stack_00000038;
      if (unaff_w20 < unaff_w21) {
        uVar1 = unaff_w21;
        uVar5 = unaff_w20;
      }
      else {
        uVar1 = unaff_w20;
        uVar5 = unaff_w21;
      }
      uVar2 = uVar6;
      if (uVar1 <= uVar6) {
        uVar2 = uVar1;
      }
      uVar3 = uVar5;
      if (uVar5 <= uVar6) {
        uVar3 = uVar2;
      }
      if ((unaff_w22 >> 5 & 1) == 0) {
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
        fVar11 = (float)uVar3;
        fVar10 = 0.0;
        if ((fVar9 < fVar11) && (fVar10 = 1.0, fVar11 < unaff_s8)) {
          fVar10 = (float)_logf(fVar11 / fVar9);
          fVar9 = (float)_logf(unaff_s8 / fVar9);
          fVar10 = fVar10 / fVar9;
        }
        fVar9 = 1.0 - fVar10;
        if (unaff_w20 <= unaff_w21) {
          fVar9 = fVar10;
        }
      }
    }
    if (in_w12 != 0) {
      fVar9 = 1.0 - fVar9;
    }
    fVar9 = unaff_s13 + fVar9 * (unaff_s14 - unaff_s13);
    if (in_w12 == 0) {
      fVar11 = unaff_x19[1];
      fVar10 = unaff_x19[3];
      *unaff_x27 = fVar9 + unaff_s12 * 0.5;
      unaff_x27[1] = fVar11 + 2.0;
      unaff_x27[2] = fVar9 + unaff_s10 * 0.5;
      unaff_x27[3] = fVar10 + -2.0;
    }
    else {
      fVar10 = unaff_x19[2];
      *unaff_x27 = *unaff_x19 + 2.0;
      unaff_x27[1] = fVar9 + unaff_s12 * 0.5;
      unaff_x27[2] = fVar10 + -2.0;
      unaff_x27[3] = fVar9 + unaff_s10 * 0.5;
    }
  }
  else {
    uVar7 = *(undefined8 *)unaff_x19;
    *(undefined8 *)unaff_x27 = uVar7;
    *(undefined8 *)(unaff_x27 + 2) = uVar7;
  }
  return uVar8;
}

