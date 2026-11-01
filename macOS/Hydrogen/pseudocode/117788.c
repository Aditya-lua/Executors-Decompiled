
undefined8
FUN_00117788(long param_1,double param_2,undefined1 param_3 [16],undefined1 param_4 [16],
            float param_5)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  bool bVar4;
  ulong uVar5;
  ulong uVar6;
  undefined8 in_x6;
  undefined8 uVar7;
  int in_w12;
  float *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  uint unaff_w22;
  long unaff_x23;
  int unaff_w24;
  undefined8 uVar8;
  int unaff_w26;
  float *unaff_x27;
  undefined1 *unaff_x28;
  float fVar9;
  double dVar10;
  float fVar11;
  double dVar12;
  double dVar13;
  float fVar14;
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
  
  fVar9 = (float)(param_2 / (double)param_1) - unaff_s9;
  bVar4 = fVar9 < unaff_s15;
  if (unaff_w24 == 0) {
    bVar4 = fVar9 >= unaff_s15;
  }
  if (!bVar4) {
    fVar9 = unaff_s15;
  }
  *(float *)(&UNK_00001e28 + unaff_x23) = *(float *)(&UNK_00001e28 + unaff_x23) - fVar9;
  *unaff_x28 = 0;
  if ((*(uint *)(unaff_x23 + 0x948) & 0x80) == 0 && (unaff_w22 & 0x200000) == 0) {
    uVar6 = unaff_x20;
    if (((unaff_x20 == unaff_x21) || (param_5 <= 0.0)) || (uVar6 = unaff_x21, 1.0 <= param_5)) {
LAB_00117950:
      if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
        uVar6 = func_0x0012ac3c(in_x6,in_stack_00000030._4_4_);
      }
    }
    else {
      if ((unaff_w22 >> 5 & 1) != 0) {
        dVar10 = (double)unaff_s8;
        dVar12 = dVar10;
        if (dVar10 <= (double)unaff_x20) {
          dVar12 = (double)unaff_x20;
        }
        if (dVar10 <= (double)unaff_x21) {
          dVar10 = (double)unaff_x21;
        }
        dVar13 = dVar12;
        if (unaff_x20 <= unaff_x21) {
          dVar13 = dVar10;
          dVar10 = dVar12;
        }
        fVar9 = 1.0 - param_5;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = param_5;
        }
        dVar12 = (double)_pow(dVar13 / dVar10,(double)fVar9);
        uVar6 = (ulong)(dVar10 * dVar12);
        goto LAB_00117950;
      }
      if (unaff_w26 == 8) {
        uVar6 = (ulong)((float)unaff_x20 + param_5 * (float)in_stack_00000040);
        goto LAB_00117950;
      }
      if (1.0 <= param_5) {
        uVar6 = 0;
      }
      else {
        fVar9 = -0.5;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = 0.5;
        }
        uVar6 = (long)(fVar9 + param_5 * (float)(long)in_stack_00000040) + unaff_x20;
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
        dVar12 = (double)unaff_s8;
        dVar10 = dVar12;
        if (dVar12 <= (double)uVar5) {
          dVar10 = (double)uVar5;
        }
        if (dVar12 <= (double)uVar1) {
          dVar12 = (double)uVar1;
        }
        dVar13 = (double)uVar3;
        fVar11 = 0.0;
        if ((dVar10 < dVar13) && (fVar11 = 1.0, dVar13 < dVar12)) {
          dVar13 = (double)_log(dVar13 / dVar10);
          dVar10 = (double)_log(dVar12 / dVar10);
          fVar11 = (float)(dVar13 / dVar10);
        }
        fVar9 = 1.0 - fVar11;
        if (unaff_x20 <= unaff_x21) {
          fVar9 = fVar11;
        }
      }
    }
    if (in_w12 != 0) {
      fVar9 = 1.0 - fVar9;
    }
    fVar9 = unaff_s13 + fVar9 * (unaff_s14 - unaff_s13);
    if (in_w12 == 0) {
      fVar14 = unaff_x19[1];
      fVar11 = unaff_x19[3];
      *unaff_x27 = fVar9 + unaff_s12 * 0.5;
      unaff_x27[1] = fVar14 + 2.0;
      unaff_x27[2] = fVar9 + unaff_s10 * 0.5;
      unaff_x27[3] = fVar11 + -2.0;
    }
    else {
      fVar11 = unaff_x19[2];
      *unaff_x27 = *unaff_x19 + 2.0;
      unaff_x27[1] = fVar9 + unaff_s12 * 0.5;
      unaff_x27[2] = fVar11 + -2.0;
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

