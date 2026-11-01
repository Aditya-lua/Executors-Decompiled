
bool FUN_001178fc(double param_1,double param_2,undefined1 param_3 [16],float param_4)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 in_x6;
  ulong uVar6;
  ulong uVar7;
  undefined8 uVar8;
  int in_w12;
  float *unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  uint unaff_w22;
  int unaff_w26;
  float *unaff_x27;
  float fVar9;
  double dVar10;
  float fVar11;
  double dVar12;
  double dVar13;
  float fVar14;
  float unaff_s8;
  float unaff_s10;
  float unaff_s11;
  float unaff_s12;
  float unaff_s13;
  float unaff_s14;
  undefined8 in_stack_00000030;
  long in_stack_00000040;
  ulong *in_stack_00000048;
  
  dVar10 = param_1;
  if (unaff_x20 <= unaff_x21) {
    dVar10 = param_2;
    param_2 = param_1;
  }
  fVar9 = 1.0 - param_4;
  if (unaff_x20 <= unaff_x21) {
    fVar9 = param_4;
  }
  dVar10 = (double)_pow(dVar10 / param_2,(double)fVar9);
  uVar5 = (ulong)(param_2 * dVar10);
  if ((unaff_w26 == 8) && ((unaff_w22 >> 6 & 1) == 0)) {
    uVar5 = func_0x0012ac3c(in_x6,in_stack_00000030._4_4_);
  }
  uVar7 = *in_stack_00000048;
  if (uVar7 != uVar5) {
    *in_stack_00000048 = uVar5;
  }
  if (1.0 <= unaff_s11) {
    fVar9 = 0.0;
    if (unaff_x20 != unaff_x21) {
      uVar6 = *in_stack_00000048;
      if (unaff_x20 < unaff_x21) {
        uVar1 = unaff_x21;
        uVar4 = unaff_x20;
      }
      else {
        uVar1 = unaff_x20;
        uVar4 = unaff_x21;
      }
      uVar2 = uVar6;
      if (uVar1 <= uVar6) {
        uVar2 = uVar1;
      }
      uVar3 = uVar4;
      if (uVar4 <= uVar6) {
        uVar3 = uVar2;
      }
      if ((unaff_w22 >> 5 & 1) == 0) {
        fVar9 = (float)((double)(long)(uVar3 - unaff_x20) / (double)in_stack_00000040);
      }
      else {
        dVar12 = (double)unaff_s8;
        dVar10 = dVar12;
        if (dVar12 <= (double)uVar4) {
          dVar10 = (double)uVar4;
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
    uVar8 = *(undefined8 *)unaff_x19;
    *(undefined8 *)unaff_x27 = uVar8;
    *(undefined8 *)(unaff_x27 + 2) = uVar8;
  }
  return uVar7 != uVar5;
}

