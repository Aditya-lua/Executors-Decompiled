
undefined8
FUN_00117108(float param_1,double param_2,double param_3,double param_4,undefined1 param_5 [16],
            float param_6)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  bool bVar5;
  bool bVar6;
  ulong uVar7;
  undefined8 in_x6;
  undefined8 uVar8;
  int in_w12;
  float *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  uint unaff_w22;
  long unaff_x23;
  undefined8 uVar9;
  int unaff_w26;
  float *unaff_x27;
  float fVar10;
  float fVar11;
  double dVar12;
  double dVar13;
  double dVar14;
  float fVar15;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  float unaff_s15;
  undefined8 in_stack_00000030;
  ulong in_stack_00000040;
  ulong *in_stack_00000048;
  
  if ((param_3 < param_2) && (param_1 = 1.0, param_2 < param_4)) {
    dVar12 = (double)_log(param_2 / param_3);
    dVar13 = (double)_log(param_4 / param_3);
    param_6 = 0.0;
    param_1 = (float)(dVar12 / dVar13);
  }
  fVar10 = 1.0 - param_1;
  if (unaff_x20 <= unaff_x21) {
    fVar10 = param_1;
  }
  if (in_w12 != 0) {
    fVar10 = 1.0 - fVar10;
  }
  fVar10 = unaff_s13 + fVar10 * (unaff_s14 - unaff_s13);
  fVar15 = fVar10 + unaff_s12 * 0.5 + -1.0;
  bVar5 = true;
  bVar6 = false;
  if (unaff_s9 <= fVar10 + unaff_s10 * 0.5 + 1.0) {
    bVar5 = false;
    bVar6 = true;
    if (!NAN(unaff_s9) && !NAN(fVar15)) {
      bVar5 = unaff_s9 < fVar15;
      bVar6 = false;
    }
  }
  fVar10 = unaff_s9 - fVar10;
  if (bVar5 != bVar6 || unaff_w26 != 8) {
    fVar10 = param_6;
  }
  *(float *)(&UNK_00001e24 + unaff_x23) = fVar10;
  fVar10 = 0.0;
  if (0.0 < unaff_s15) {
    fVar11 = ((unaff_s9 - *(float *)(&UNK_00001e24 + unaff_x23)) - unaff_s13) / unaff_s15;
    fVar15 = 1.0;
    if (fVar11 <= 1.0) {
      fVar15 = fVar11;
    }
    fVar10 = 0.0;
    if (0.0 <= fVar11) {
      fVar10 = fVar15;
    }
  }
  if (in_w12 != 0) {
    fVar10 = 1.0 - fVar10;
  }
  if ((*(uint *)(unaff_x23 + 0x948) & 0x80) == 0 && (unaff_w22 & 0x200000) == 0) {
    uVar7 = unaff_x20;
    if (((unaff_x20 == unaff_x21) || (fVar10 <= 0.0)) || (uVar7 = unaff_x21, 1.0 <= fVar10)) {
LAB_00117950:
      if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
        uVar7 = func_0x0012ac3c(in_x6,in_stack_00000030._4_4_);
      }
    }
    else {
      if ((unaff_w22 >> 5 & 1) != 0) {
        dVar12 = (double)unaff_s8;
        dVar13 = dVar12;
        if (dVar12 <= (double)unaff_x20) {
          dVar13 = (double)unaff_x20;
        }
        if (dVar12 <= (double)unaff_x21) {
          dVar12 = (double)unaff_x21;
        }
        dVar14 = dVar13;
        if (unaff_x20 <= unaff_x21) {
          dVar14 = dVar12;
          dVar12 = dVar13;
        }
        fVar15 = 1.0 - fVar10;
        if (unaff_x20 <= unaff_x21) {
          fVar15 = fVar10;
        }
        dVar13 = (double)_pow(dVar14 / dVar12,(double)fVar15);
        uVar7 = (ulong)(dVar12 * dVar13);
        goto LAB_00117950;
      }
      if (unaff_w26 == 8) {
        uVar7 = (ulong)((float)unaff_x20 + fVar10 * (float)in_stack_00000040);
        goto LAB_00117950;
      }
      if (1.0 <= fVar10) {
        uVar7 = 0;
      }
      else {
        fVar15 = -0.5;
        if (unaff_x20 <= unaff_x21) {
          fVar15 = 0.5;
        }
        uVar7 = (long)(fVar15 + fVar10 * (float)(long)in_stack_00000040) + unaff_x20;
      }
    }
    if (*in_stack_00000048 != uVar7) {
      *in_stack_00000048 = uVar7;
      uVar9 = 1;
      goto joined_r0x00117990;
    }
  }
  uVar9 = 0;
joined_r0x00117990:
  if (1.0 <= unaff_s11) {
    fVar10 = 0.0;
    if (unaff_x20 != unaff_x21) {
      uVar7 = *in_stack_00000048;
      if (unaff_x20 < unaff_x21) {
        uVar1 = unaff_x21;
        uVar4 = unaff_x20;
      }
      else {
        uVar1 = unaff_x20;
        uVar4 = unaff_x21;
      }
      uVar2 = uVar7;
      if (uVar1 <= uVar7) {
        uVar2 = uVar1;
      }
      uVar3 = uVar4;
      if (uVar4 <= uVar7) {
        uVar3 = uVar2;
      }
      if ((unaff_w22 >> 5 & 1) == 0) {
        fVar10 = (float)((double)(long)(uVar3 - unaff_x20) / (double)(long)in_stack_00000040);
      }
      else {
        dVar13 = (double)unaff_s8;
        dVar12 = dVar13;
        if (dVar13 <= (double)uVar4) {
          dVar12 = (double)uVar4;
        }
        if (dVar13 <= (double)uVar1) {
          dVar13 = (double)uVar1;
        }
        dVar14 = (double)uVar3;
        fVar15 = 0.0;
        if ((dVar12 < dVar14) && (fVar15 = 1.0, dVar14 < dVar13)) {
          dVar14 = (double)_log(dVar14 / dVar12);
          dVar12 = (double)_log(dVar13 / dVar12);
          fVar15 = (float)(dVar14 / dVar12);
        }
        fVar10 = 1.0 - fVar15;
        if (unaff_x20 <= unaff_x21) {
          fVar10 = fVar15;
        }
      }
    }
    if (in_w12 != 0) {
      fVar10 = 1.0 - fVar10;
    }
    fVar10 = unaff_s13 + fVar10 * (unaff_s14 - unaff_s13);
    if (in_w12 == 0) {
      fVar11 = unaff_x19[1];
      fVar15 = unaff_x19[3];
      *unaff_x27 = fVar10 + unaff_s12 * 0.5;
      unaff_x27[1] = fVar11 + 2.0;
      unaff_x27[2] = fVar10 + unaff_s10 * 0.5;
      unaff_x27[3] = fVar15 + -2.0;
    }
    else {
      fVar15 = unaff_x19[2];
      *unaff_x27 = *unaff_x19 + 2.0;
      unaff_x27[1] = fVar10 + unaff_s12 * 0.5;
      unaff_x27[2] = fVar15 + -2.0;
      unaff_x27[3] = fVar10 + unaff_s10 * 0.5;
    }
  }
  else {
    uVar8 = *(undefined8 *)unaff_x19;
    *(undefined8 *)unaff_x27 = uVar8;
    *(undefined8 *)(unaff_x27 + 2) = uVar8;
  }
  return uVar9;
}

