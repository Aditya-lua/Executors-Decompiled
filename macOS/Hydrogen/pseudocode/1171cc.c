
undefined8 FUN_001171cc(float param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 in_x6;
  undefined8 uVar6;
  int in_w12;
  float *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  uint unaff_w22;
  long unaff_x23;
  undefined8 uVar7;
  int unaff_w26;
  float *unaff_x27;
  float fVar8;
  float fVar9;
  double dVar10;
  double dVar11;
  double dVar12;
  float fVar13;
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
  
  if (0.0 < unaff_s15) {
    fVar8 = ((unaff_s9 - *(float *)(&UNK_00001e24 + unaff_x23)) - unaff_s13) / unaff_s15;
    fVar9 = 1.0;
    if (fVar8 <= 1.0) {
      fVar9 = fVar8;
    }
    param_1 = 0.0;
    if (0.0 <= fVar8) {
      param_1 = fVar9;
    }
  }
  if (in_w12 != 0) {
    param_1 = 1.0 - param_1;
  }
  if ((*(uint *)(unaff_x23 + 0x948) & 0x80) == 0 && (unaff_w22 & 0x200000) == 0) {
    uVar5 = unaff_x20;
    if (((unaff_x20 == unaff_x21) || (param_1 <= 0.0)) || (uVar5 = unaff_x21, 1.0 <= param_1)) {
LAB_00117950:
      if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
        uVar5 = func_0x0012ac3c(in_x6,in_stack_00000030._4_4_);
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
        dVar12 = dVar11;
        if (unaff_x20 <= unaff_x21) {
          dVar12 = dVar10;
          dVar10 = dVar11;
        }
        fVar9 = 1.0 - param_1;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = param_1;
        }
        dVar11 = (double)_pow(dVar12 / dVar10,(double)fVar9);
        uVar5 = (ulong)(dVar10 * dVar11);
        goto LAB_00117950;
      }
      if (unaff_w26 == 8) {
        uVar5 = (ulong)((float)unaff_x20 + param_1 * (float)in_stack_00000040);
        goto LAB_00117950;
      }
      if (1.0 <= param_1) {
        uVar5 = 0;
      }
      else {
        fVar9 = -0.5;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = 0.5;
        }
        uVar5 = (long)(fVar9 + param_1 * (float)(long)in_stack_00000040) + unaff_x20;
      }
    }
    if (*in_stack_00000048 != uVar5) {
      *in_stack_00000048 = uVar5;
      uVar7 = 1;
      goto joined_r0x00117990;
    }
  }
  uVar7 = 0;
joined_r0x00117990:
  if (1.0 <= unaff_s11) {
    fVar9 = 0.0;
    if (unaff_x20 != unaff_x21) {
      uVar5 = *in_stack_00000048;
      if (unaff_x20 < unaff_x21) {
        uVar1 = unaff_x21;
        uVar4 = unaff_x20;
      }
      else {
        uVar1 = unaff_x20;
        uVar4 = unaff_x21;
      }
      uVar2 = uVar5;
      if (uVar1 <= uVar5) {
        uVar2 = uVar1;
      }
      uVar3 = uVar4;
      if (uVar4 <= uVar5) {
        uVar3 = uVar2;
      }
      if ((unaff_w22 >> 5 & 1) == 0) {
        fVar9 = (float)((double)(long)(uVar3 - unaff_x20) / (double)(long)in_stack_00000040);
      }
      else {
        dVar11 = (double)unaff_s8;
        dVar10 = dVar11;
        if (dVar11 <= (double)uVar4) {
          dVar10 = (double)uVar4;
        }
        if (dVar11 <= (double)uVar1) {
          dVar11 = (double)uVar1;
        }
        dVar12 = (double)uVar3;
        fVar8 = 0.0;
        if ((dVar10 < dVar12) && (fVar8 = 1.0, dVar12 < dVar11)) {
          dVar12 = (double)_log(dVar12 / dVar10);
          dVar10 = (double)_log(dVar11 / dVar10);
          fVar8 = (float)(dVar12 / dVar10);
        }
        fVar9 = 1.0 - fVar8;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = fVar8;
        }
      }
    }
    if (in_w12 != 0) {
      fVar9 = 1.0 - fVar9;
    }
    fVar9 = unaff_s13 + fVar9 * (unaff_s14 - unaff_s13);
    if (in_w12 == 0) {
      fVar13 = unaff_x19[1];
      fVar8 = unaff_x19[3];
      *unaff_x27 = fVar9 + unaff_s12 * 0.5;
      unaff_x27[1] = fVar13 + 2.0;
      unaff_x27[2] = fVar9 + unaff_s10 * 0.5;
      unaff_x27[3] = fVar8 + -2.0;
    }
    else {
      fVar8 = unaff_x19[2];
      *unaff_x27 = *unaff_x19 + 2.0;
      unaff_x27[1] = fVar9 + unaff_s12 * 0.5;
      unaff_x27[2] = fVar8 + -2.0;
      unaff_x27[3] = fVar9 + unaff_s10 * 0.5;
    }
  }
  else {
    uVar6 = *(undefined8 *)unaff_x19;
    *(undefined8 *)unaff_x27 = uVar6;
    *(undefined8 *)(unaff_x27 + 2) = uVar6;
  }
  return uVar7;
}

