
void FUN_00722564(long param_1,long *param_2)

{
  long lVar1;
  ulong in_x9;
  ulong in_x10;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  long unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  
  uVar3 = unaff_x22 ^ unaff_x21 >> 9;
  do {
    uVar3 = uVar3 & param_1 - 1U;
    uVar4 = *(ulong *)(*param_2 + uVar3 * 0x10);
    if (uVar4 == unaff_x21) goto LAB_007225a0;
    in_x10 = in_x10 + 1;
    uVar3 = in_x10 + uVar3;
  } while (uVar4 != in_x9 && in_x10 <= param_1 - 1U);
  func_0x006db93c();
  param_1 = *(long *)(unaff_x19 + 0x420);
LAB_007225a0:
  lVar1 = *(long *)(unaff_x19 + 0x418);
  uVar3 = (unaff_x22 ^ unaff_x21 >> 9) & param_1 - 1U;
  uVar4 = *(ulong *)(lVar1 + uVar3 * 0x10);
  if (uVar4 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar2 = 1;
    do {
      if (uVar4 == unaff_x21) goto LAB_00722600;
      uVar3 = uVar3 + lVar2 & param_1 - 1U;
      uVar4 = *(ulong *)(lVar1 + uVar3 * 0x10);
      lVar2 = lVar2 + 1;
    } while (uVar4 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar1 + uVar3 * 0x10) = unaff_x21;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00722600:
  *(undefined8 *)(lVar1 + uVar3 * 0x10 + 8) = unaff_x20;
  return;
}

