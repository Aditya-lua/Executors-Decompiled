
bool FUN_00118260(float param_1)

{
  undefined8 uVar1;
  float *unaff_x19;
  float *unaff_x20;
  uint unaff_w22;
  int unaff_w27;
  float fVar2;
  float fVar3;
  float fVar4;
  float fVar5;
  float unaff_s11;
  float unaff_s13;
  float unaff_s14;
  float unaff_s15;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  float *in_stack_00000028;
  
  if ((unaff_w22 >> 6 & 1) == 0) {
    param_1 = (float)func_0x0012b1ac(in_stack_00000018);
  }
  fVar4 = *in_stack_00000028;
  if (fVar4 != param_1) {
    *in_stack_00000028 = param_1;
  }
  if (1.0 <= unaff_s15) {
    fVar2 = (float)func_0x0012adb4(*in_stack_00000028);
    if (unaff_w27 != 0) {
      fVar2 = 1.0 - fVar2;
    }
    fVar2 = unaff_s11 + fVar2 * (unaff_s13 - unaff_s11);
    if (unaff_w27 == 0) {
      fVar5 = unaff_x20[1];
      fVar3 = unaff_x20[3];
      *unaff_x19 = fVar2 + in_stack_00000020._4_4_ * 0.5;
      unaff_x19[1] = fVar5 + 2.0;
      unaff_x19[2] = fVar2 + unaff_s14 * 0.5;
      unaff_x19[3] = fVar3 + -2.0;
    }
    else {
      fVar3 = unaff_x20[2];
      *unaff_x19 = *unaff_x20 + 2.0;
      unaff_x19[1] = fVar2 + in_stack_00000020._4_4_ * 0.5;
      unaff_x19[2] = fVar3 + -2.0;
      unaff_x19[3] = fVar2 + unaff_s14 * 0.5;
    }
  }
  else {
    uVar1 = *(undefined8 *)unaff_x20;
    *(undefined8 *)unaff_x19 = uVar1;
    *(undefined8 *)(unaff_x19 + 2) = uVar1;
  }
  return fVar4 != param_1;
}

