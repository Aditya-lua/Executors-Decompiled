
bool FUN_00111a00(float param_1,float param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  bool in_ZR;
  bool in_CY;
  ulong uVar5;
  uint uVar6;
  ulong unaff_x20;
  uint uVar7;
  ulong unaff_x21;
  uint unaff_w22;
  int unaff_w24;
  uint uVar8;
  undefined8 unaff_x25;
  uint *unaff_x26;
  undefined1 *unaff_x28;
  float fVar9;
  float fVar10;
  float fVar11;
  float fVar12;
  float fVar13;
  float unaff_s8;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  undefined4 in_stack_00000008;
  
  if (in_CY && !in_ZR) {
    param_1 = (float)_logf(param_2 / unaff_s11);
    fVar9 = (float)_logf(unaff_s12 / unaff_s11);
    param_1 = param_1 / fVar9;
  }
  uVar6 = (uint)unaff_x20;
  uVar7 = (uint)unaff_x21;
  fVar9 = 1.0 - param_1;
  if (uVar7 <= uVar6) {
    fVar9 = param_1;
  }
  fVar10 = *(float *)(unaff_x28 + 3) + fVar9;
  uVar5 = unaff_x21;
  if ((0.0 < fVar10) && (uVar5 = unaff_x20, fVar10 < 1.0)) {
    fVar11 = unaff_s8;
    if (unaff_s8 <= (float)(unaff_x21 & 0xffffffff)) {
      fVar11 = (float)(unaff_x21 & 0xffffffff);
    }
    fVar12 = unaff_s8;
    if (unaff_s8 <= (float)(unaff_x20 & 0xffffffff)) {
      fVar12 = (float)(unaff_x20 & 0xffffffff);
    }
    fVar13 = fVar11;
    if (uVar7 <= uVar6) {
      fVar13 = fVar12;
      fVar12 = fVar11;
    }
    fVar11 = 1.0 - fVar10;
    if (uVar7 <= uVar6) {
      fVar11 = fVar10;
    }
    fVar10 = (float)_powf(fVar13 / fVar12,fVar11);
    uVar5 = (ulong)(uint)(int)(fVar12 * fVar10);
  }
  if ((unaff_w24 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
    uVar5 = func_0x0012a52c(unaff_x25,in_stack_00000008,uVar5);
  }
  *unaff_x28 = 0;
  uVar8 = (uint)uVar5;
  if ((unaff_w22 >> 5 & 1) == 0) {
    uVar4 = *unaff_x26;
    *(float *)(unaff_x28 + 3) = *(float *)(unaff_x28 + 3) - (float)(int)(uVar8 - uVar4);
  }
  else {
    fVar10 = 0.0;
    if (uVar6 != uVar7) {
      uVar4 = uVar7;
      if (uVar6 <= uVar7) {
        uVar4 = uVar6;
      }
      uVar1 = uVar7;
      if (uVar7 <= uVar6) {
        uVar1 = uVar6;
      }
      uVar2 = uVar8;
      if (uVar1 <= uVar8) {
        uVar2 = uVar1;
      }
      uVar3 = uVar4;
      if (uVar4 <= uVar8) {
        uVar3 = uVar2;
      }
      fVar10 = unaff_s8;
      if (unaff_s8 <= (float)uVar4) {
        fVar10 = (float)uVar4;
      }
      if (unaff_s8 <= (float)uVar1) {
        unaff_s8 = (float)uVar1;
      }
      fVar12 = (float)uVar3;
      fVar11 = 0.0;
      if ((fVar10 < fVar12) && (fVar11 = 1.0, fVar12 < unaff_s8)) {
        fVar11 = (float)_logf(fVar12 / fVar10);
        fVar10 = (float)_logf(unaff_s8 / fVar10);
        fVar11 = fVar11 / fVar10;
      }
      fVar10 = 1.0 - fVar11;
      if (uVar7 <= uVar6) {
        fVar10 = fVar11;
      }
    }
    *(float *)(unaff_x28 + 3) = *(float *)(unaff_x28 + 3) - (fVar10 - fVar9);
    uVar4 = *unaff_x26;
  }
  if ((uVar7 < uVar6) && (uVar4 != uVar8)) {
    if ((uVar8 < uVar7) || (((unaff_w24 != 8 && (uVar4 < uVar8)) && (unaff_s10 < 0.0)))) {
      uVar5 = unaff_x21;
    }
    if ((uVar6 < (uint)uVar5) || (((unaff_w24 != 8 && ((uint)uVar5 < uVar4)) && (0.0 < unaff_s10))))
    {
      uVar5 = unaff_x20;
    }
  }
  uVar6 = (uint)uVar5;
  if (uVar4 != uVar6) {
    *unaff_x26 = uVar6;
  }
  return uVar4 != uVar6;
}

