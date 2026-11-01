
void FUN_0047216c(ulong param_1,ulong param_2)

{
  byte bVar1;
  int iVar2;
  double dVar3;
  ulong in_x9;
  undefined1 *unaff_x19;
  int unaff_w21;
  long unaff_x22;
  ulong uVar4;
  int unaff_w26;
  double dVar5;
  byte in_stack_0000030c;
  
  if (param_1 < in_x9) {
    bVar1 = *(byte *)(unaff_x22 + param_1);
    if (bVar1 == 5 && param_1 + 1 == in_x9) {
      if (((in_stack_0000030c & 1) != 0) ||
         (((int)param_1 != 0 && ((((byte *)(unaff_x22 + param_1))[-1] & 1) != 0))))
      goto LAB_004721ac;
    }
    else if (4 < bVar1) {
LAB_004721ac:
      param_2 = param_2 + 1;
    }
  }
  if (param_2 >> 0x35 != 0) {
    func_0x0045d7d8();
    param_2 = func_0x0045d50c();
    if (0x7fe < unaff_w21 + 0x400) {
      param_2 = 0;
      uVar4 = 0x7ff;
      goto LAB_00471fb0;
    }
    unaff_w21 = unaff_w21 + 1;
  }
  iVar2 = 0x3fe;
  if (param_2 >> 0x34 != 0) {
    iVar2 = 0x3ff;
  }
  uVar4 = (ulong)(uint)(iVar2 + unaff_w21);
  param_2 = param_2 & 0xfffffffffffff;
LAB_00471fb0:
  dVar3 = (double)(param_2 | uVar4 << 0x34);
  dVar5 = -dVar3;
  if (unaff_w26 != 0x2d) {
    dVar5 = dVar3;
  }
  *(double *)(unaff_x19 + 8) = dVar5;
  *unaff_x19 = 0;
  return;
}

