
void FUN_00472100(void)

{
  byte bVar1;
  ulong uVar2;
  int iVar3;
  double dVar4;
  ulong uVar5;
  ulong uVar6;
  undefined1 *unaff_x19;
  int unaff_w21;
  long unaff_x22;
  int unaff_w26;
  double dVar7;
  ulong in_stack_00000000;
  uint in_stack_00000308;
  byte in_stack_0000030c;
  
  func_0x0045d5c8();
  if ((in_stack_00000000 == 0) || (uVar5 = (ulong)in_stack_00000308, (int)in_stack_00000308 < 0)) {
    uVar2 = 0;
    uVar5 = (ulong)(unaff_w21 + 0x3fe);
    goto LAB_00471fb0;
  }
  if (in_stack_00000308 < 0x13) {
    uVar2 = 0;
    if (in_stack_00000308 != 0) {
      uVar6 = 0;
      do {
        uVar2 = uVar2 * 10;
        if (uVar6 < in_stack_00000000) {
          uVar2 = uVar2 + *(byte *)(unaff_x22 + uVar6);
        }
        uVar6 = uVar6 + 1;
      } while (uVar5 != uVar6);
    }
    if (uVar5 < in_stack_00000000) {
      bVar1 = *(byte *)(unaff_x22 + uVar5);
      if (bVar1 == 5 && uVar5 + 1 == in_stack_00000000) {
        if (((in_stack_0000030c & 1) != 0) ||
           ((in_stack_00000308 != 0 && ((((byte *)(unaff_x22 + uVar5))[-1] & 1) != 0))))
        goto LAB_004721ac;
      }
      else if (4 < bVar1) {
LAB_004721ac:
        uVar2 = uVar2 + 1;
      }
    }
    if (uVar2 >> 0x35 != 0) goto LAB_004721b8;
  }
  else {
LAB_004721b8:
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
  dVar7 = -dVar4;
  if (unaff_w26 != 0x2d) {
    dVar7 = dVar4;
  }
  *(double *)(unaff_x19 + 8) = dVar7;
  *unaff_x19 = 0;
  return;
}

