
bool FUN_00116268(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  undefined8 in_x6;
  undefined8 uVar8;
  float *unaff_x19;
  uint unaff_w20;
  uint unaff_w21;
  uint unaff_w22;
  int unaff_w23;
  int unaff_w26;
  float *unaff_x27;
  float fVar9;
  float fVar10;
  float fVar11;
  float unaff_s8;
  float unaff_s9;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  uint *in_stack_00000038;
  
  fVar9 = (float)_powf();
  uVar7 = (uint)(unaff_s9 * fVar9);
  if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
    uVar7 = func_0x0012a52c(in_x6,in_stack_00000020._4_4_);
  }
  uVar5 = *in_stack_00000038;
  if (uVar5 != uVar7) {
    *in_stack_00000038 = uVar7;
  }
  if (1.0 <= unaff_s11) {
    fVar9 = 0.0;
    if (unaff_w20 != unaff_w21) {
      uVar4 = *in_stack_00000038;
      if (unaff_w20 < unaff_w21) {
        uVar1 = unaff_w21;
        uVar6 = unaff_w20;
      }
      else {
        uVar1 = unaff_w20;
        uVar6 = unaff_w21;
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
        fVar9 = (float)(int)(uVar3 - unaff_w20) / (float)in_stack_00000030._4_4_;
      }
      else {
        fVar9 = unaff_s8;
        if (unaff_s8 <= (float)uVar6) {
          fVar9 = (float)uVar6;
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
    if (unaff_w23 != 0) {
      fVar9 = 1.0 - fVar9;
    }
    fVar9 = unaff_s13 + fVar9 * (unaff_s14 - unaff_s13);
    if (unaff_w23 == 0) {
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
    uVar8 = *(undefined8 *)unaff_x19;
    *(undefined8 *)unaff_x27 = uVar8;
    *(undefined8 *)(unaff_x27 + 2) = uVar8;
  }
  return uVar5 != uVar7;
}

