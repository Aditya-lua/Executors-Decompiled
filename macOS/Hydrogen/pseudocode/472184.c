
void FUN_00472184(ulong param_1)

{
  bool in_ZR;
  int in_w8;
  int iVar1;
  double dVar2;
  long in_x9;
  long in_x10;
  uint in_w11;
  long in_x12;
  undefined1 *unaff_x19;
  int unaff_w21;
  ulong uVar3;
  int unaff_w26;
  double dVar4;
  byte in_stack_0000030c;
  
  if (in_ZR && in_x12 == in_x9) {
    if (((in_stack_0000030c & 1) != 0) || ((in_w8 != 0 && ((*(byte *)(in_x10 + -1) & 1) != 0))))
    goto LAB_004721ac;
  }
  else if (4 < in_w11) {
LAB_004721ac:
    param_1 = param_1 + 1;
  }
  if (param_1 >> 0x35 != 0) {
    func_0x0045d7d8();
    param_1 = func_0x0045d50c();
    if (0x7fe < unaff_w21 + 0x400) {
      param_1 = 0;
      uVar3 = 0x7ff;
      goto LAB_00471fb0;
    }
    unaff_w21 = unaff_w21 + 1;
  }
  iVar1 = 0x3fe;
  if (param_1 >> 0x34 != 0) {
    iVar1 = 0x3ff;
  }
  uVar3 = (ulong)(uint)(iVar1 + unaff_w21);
  param_1 = param_1 & 0xfffffffffffff;
LAB_00471fb0:
  dVar2 = (double)(param_1 | uVar3 << 0x34);
  dVar4 = -dVar2;
  if (unaff_w26 != 0x2d) {
    dVar4 = dVar2;
  }
  *(double *)(unaff_x19 + 8) = dVar4;
  *unaff_x19 = 0;
  return;
}

