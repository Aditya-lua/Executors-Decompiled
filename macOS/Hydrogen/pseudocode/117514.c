
undefined8 FUN_00117514(float param_1,double param_2,double param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  bool bVar4;
  ulong uVar5;
  char in_NG;
  char in_OV;
  undefined8 in_x6;
  ulong uVar6;
  undefined8 uVar7;
  float *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  uint unaff_w22;
  long unaff_x23;
  undefined8 uVar8;
  int unaff_w26;
  float *unaff_x27;
  undefined1 *unaff_x28;
  float fVar9;
  double dVar10;
  double dVar11;
  float fVar12;
  double dVar13;
  float fVar14;
  float fVar15;
  float unaff_s8;
  double unaff_d9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  float unaff_s15;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  ulong in_stack_00000040;
  ulong *in_stack_00000048;
  
  if ((in_NG != in_OV) && (param_1 = 1.0, param_2 < param_3)) {
    dVar10 = (double)_log(param_2 / unaff_d9);
    dVar11 = (double)_log(param_3 / unaff_d9);
    param_1 = (float)(dVar10 / dVar11);
  }
  fVar9 = 1.0 - param_1;
  if (unaff_x20 <= unaff_x21) {
    fVar9 = param_1;
  }
  if (((1.0 <= fVar9) && (0.0 < unaff_s15)) || ((fVar9 <= 0.0 && (unaff_s15 < 0.0)))) {
    uVar8 = 0;
    *(undefined4 *)(&UNK_00001e28 + unaff_x23) = 0;
    *unaff_x28 = 0;
    goto joined_r0x00117990;
  }
  fVar14 = unaff_s15 + fVar9;
  fVar12 = 1.0;
  if (fVar14 <= 1.0) {
    fVar12 = fVar14;
  }
  fVar15 = 0.0;
  if (0.0 <= fVar14) {
    fVar15 = fVar12;
  }
  uVar6 = unaff_x20;
  if (((unaff_x20 == unaff_x21) || (fVar15 <= 0.0)) || (uVar6 = unaff_x21, 1.0 <= fVar15)) {
LAB_001176d0:
    if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
      uVar6 = func_0x0012ac3c(in_x6,in_stack_00000030._4_4_);
    }
  }
  else {
    if ((unaff_w22 >> 5 & 1) != 0) {
      dVar10 = (double)unaff_s8;
      dVar11 = dVar10;
      if (dVar10 <= (double)unaff_x20) {
        dVar11 = (double)unaff_x20;
      }
      if (dVar10 <= (double)unaff_x21) {
        dVar10 = (double)unaff_x21;
      }
      dVar13 = dVar11;
      if (unaff_x20 <= unaff_x21) {
        dVar13 = dVar10;
        dVar10 = dVar11;
      }
      fVar12 = 1.0 - fVar15;
      if (unaff_x20 <= unaff_x21) {
        fVar12 = fVar15;
      }
      dVar11 = (double)_pow(dVar13 / dVar10,(double)fVar12);
      uVar6 = (ulong)(dVar10 * dVar11);
      goto LAB_001176d0;
    }
    if (unaff_w26 == 8) {
      uVar6 = (ulong)((float)unaff_x20 + fVar15 * (float)in_stack_00000040);
      goto LAB_001176d0;
    }
    if (1.0 <= fVar15) {
      uVar6 = 0;
    }
    else {
      fVar12 = -0.5;
      if (unaff_x20 <= unaff_x21) {
        fVar12 = 0.5;
      }
      uVar6 = (long)(fVar12 + fVar15 * (float)(long)in_stack_00000040) + unaff_x20;
    }
  }
  fVar12 = 0.0;
  if (unaff_x20 != unaff_x21) {
    if (unaff_x20 < unaff_x21) {
      uVar1 = unaff_x21;
      uVar5 = unaff_x20;
    }
    else {
      uVar1 = unaff_x20;
      uVar5 = unaff_x21;
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
      fVar12 = (float)((double)(long)(uVar3 - unaff_x20) / (double)(long)in_stack_00000040);
    }
    else {
      dVar11 = (double)unaff_s8;
      dVar10 = dVar11;
      if (dVar11 <= (double)uVar5) {
        dVar10 = (double)uVar5;
      }
      if (dVar11 <= (double)uVar1) {
        dVar11 = (double)uVar1;
      }
      dVar13 = (double)uVar3;
      fVar14 = 0.0;
      if ((dVar10 < dVar13) && (fVar14 = 1.0, dVar13 < dVar11)) {
        dVar13 = (double)_log(dVar13 / dVar10);
        dVar10 = (double)_log(dVar11 / dVar10);
        fVar14 = (float)(dVar13 / dVar10);
      }
      fVar12 = 1.0 - fVar14;
      if (unaff_x20 <= unaff_x21) {
        fVar12 = fVar14;
      }
    }
  }
  fVar12 = fVar12 - fVar9;
  bVar4 = fVar12 < unaff_s15;
  if (unaff_s15 <= 0.0) {
    bVar4 = fVar12 >= unaff_s15;
  }
  if (!bVar4) {
    fVar12 = unaff_s15;
  }
  *(float *)(&UNK_00001e28 + unaff_x23) = *(float *)(&UNK_00001e28 + unaff_x23) - fVar12;
  *unaff_x28 = 0;
  if ((*(uint *)(unaff_x23 + 0x948) & 0x80) == 0 && (unaff_w22 & 0x200000) == 0) {
    uVar6 = unaff_x20;
    if (((unaff_x20 == unaff_x21) || (fVar15 <= 0.0)) || (uVar6 = unaff_x21, 1.0 <= fVar15)) {
code_r0x00117950:
      if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
        uVar6 = func_0x0012ac3c(in_x6,in_stack_00000030._4_4_);
      }
    }
    else {
      if ((unaff_w22 >> 5 & 1) != 0) {
        dVar10 = (double)unaff_s8;
        dVar11 = dVar10;
        if (dVar10 <= (double)unaff_x20) {
          dVar11 = (double)unaff_x20;
        }
        if (dVar10 <= (double)unaff_x21) {
          dVar10 = (double)unaff_x21;
        }
        dVar13 = dVar11;
        if (unaff_x20 <= unaff_x21) {
          dVar13 = dVar10;
          dVar10 = dVar11;
        }
        fVar9 = 1.0 - fVar15;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = fVar15;
        }
        dVar11 = (double)_pow(dVar13 / dVar10,(double)fVar9);
        uVar6 = (ulong)(dVar10 * dVar11);
        goto code_r0x00117950;
      }
      if (unaff_w26 == 8) {
        uVar6 = (ulong)((float)unaff_x20 + fVar15 * (float)in_stack_00000040);
        goto code_r0x00117950;
      }
      if (1.0 <= fVar15) {
        uVar6 = 0;
      }
      else {
        fVar9 = -0.5;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = 0.5;
        }
        uVar6 = (long)(fVar9 + fVar15 * (float)(long)in_stack_00000040) + unaff_x20;
      }
    }
    if (*in_stack_00000048 != uVar6) {
      *in_stack_00000048 = uVar6;
      uVar8 = 1;
      goto joined_r0x00117990;
    }
  }
  uVar8 = 0;
joined_r0x00117990:
  if (1.0 <= unaff_s11) {
    fVar9 = 0.0;
    if (unaff_x20 != unaff_x21) {
      uVar6 = *in_stack_00000048;
      if (unaff_x20 < unaff_x21) {
        uVar1 = unaff_x21;
        uVar5 = unaff_x20;
      }
      else {
        uVar1 = unaff_x20;
        uVar5 = unaff_x21;
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
        fVar9 = (float)((double)(long)(uVar3 - unaff_x20) / (double)(long)in_stack_00000040);
      }
      else {
        dVar11 = (double)unaff_s8;
        dVar10 = dVar11;
        if (dVar11 <= (double)uVar5) {
          dVar10 = (double)uVar5;
        }
        if (dVar11 <= (double)uVar1) {
          dVar11 = (double)uVar1;
        }
        dVar13 = (double)uVar3;
        fVar12 = 0.0;
        if ((dVar10 < dVar13) && (fVar12 = 1.0, dVar13 < dVar11)) {
          dVar13 = (double)_log(dVar13 / dVar10);
          dVar10 = (double)_log(dVar11 / dVar10);
          fVar12 = (float)(dVar13 / dVar10);
        }
        fVar9 = 1.0 - fVar12;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = fVar12;
        }
      }
    }
    if (in_stack_00000020._4_4_ != 0) {
      fVar9 = 1.0 - fVar9;
    }
    fVar9 = unaff_s13 + fVar9 * (unaff_s14 - unaff_s13);
    if (in_stack_00000020._4_4_ == 0) {
      fVar14 = unaff_x19[1];
      fVar12 = unaff_x19[3];
      *unaff_x27 = fVar9 + unaff_s12 * 0.5;
      unaff_x27[1] = fVar14 + 2.0;
      unaff_x27[2] = fVar9 + unaff_s10 * 0.5;
      unaff_x27[3] = fVar12 + -2.0;
    }
    else {
      fVar12 = unaff_x19[2];
      *unaff_x27 = *unaff_x19 + 2.0;
      unaff_x27[1] = fVar9 + unaff_s12 * 0.5;
      unaff_x27[2] = fVar12 + -2.0;
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

