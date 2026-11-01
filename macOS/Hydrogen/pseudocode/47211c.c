
void FUN_0047211c(ulong param_1)

{
  byte bVar1;
  ulong uVar2;
  int iVar3;
  double dVar4;
  ulong in_x9;
  ulong uVar5;
  undefined1 *unaff_x19;
  int unaff_w21;
  long unaff_x22;
  int unaff_w26;
  double dVar6;
  byte in_stack_0000030c;
  
  uVar2 = 0;
  if ((int)param_1 != 0) {
    uVar5 = 0;
    do {
      uVar2 = uVar2 * 10;
      if (uVar5 < in_x9) {
        uVar2 = uVar2 + *(byte *)(unaff_x22 + uVar5);
      }
      uVar5 = uVar5 + 1;
    } while (param_1 != uVar5);
  }
  if (param_1 < in_x9) {
    bVar1 = *(byte *)(unaff_x22 + param_1);
    if (bVar1 == 5 && param_1 + 1 == in_x9) {
      if (((in_stack_0000030c & 1) != 0) ||
         (((int)param_1 != 0 && ((((byte *)(unaff_x22 + param_1))[-1] & 1) != 0))))
      goto LAB_004721ac;
    }
    else if (4 < bVar1) {
LAB_004721ac:
      uVar2 = uVar2 + 1;
    }
  }
  if (uVar2 >> 0x35 != 0) {
    func_0x0045d7d8();
    uVar2 = func_0x0045d50c();
    if (0x7fe < unaff_w21 + 0x400) {
      uVar2 = 0;
      uVar5 = 0x7ff;
      goto LAB_00471fb0;
    }
    unaff_w21 = unaff_w21 + 1;
  }
  iVar3 = 0x3fe;
  if (uVar2 >> 0x34 != 0) {
    iVar3 = 0x3ff;
  }
  uVar5 = (ulong)(uint)(iVar3 + unaff_w21);
  uVar2 = uVar2 & 0xfffffffffffff;
LAB_00471fb0:
  dVar4 = (double)(uVar2 | uVar5 << 0x34);
  dVar6 = -dVar4;
  if (unaff_w26 != 0x2d) {
    dVar6 = dVar4;
  }
  *(double *)(unaff_x19 + 8) = dVar6;
  *unaff_x19 = 0;
  return;
}

