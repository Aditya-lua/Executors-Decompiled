
void FUN_007190bc(long param_1,long *param_2)

{
  long *plVar1;
  long lVar2;
  ulong in_x9;
  ulong in_x10;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x21;
  ulong unaff_x27;
  long unaff_x29;
  
  uVar4 = unaff_x21 ^ unaff_x27 >> 9;
  do {
    uVar4 = uVar4 & param_1 - 1U;
    uVar5 = *(ulong *)(*param_2 + uVar4 * 0x10);
    if (uVar5 == unaff_x27) goto LAB_007190f8;
    in_x10 = in_x10 + 1;
    uVar4 = in_x10 + uVar4;
  } while (uVar5 != in_x9 && in_x10 <= param_1 - 1U);
  func_0x006db93c();
  param_1 = *(long *)(unaff_x19 + 0x420);
LAB_007190f8:
  lVar2 = *(long *)(unaff_x19 + 0x418);
  uVar4 = param_1 - 1U & (unaff_x21 ^ unaff_x27 >> 9);
  uVar5 = *(ulong *)(lVar2 + uVar4 * 0x10);
  if (uVar5 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar3 = 1;
    do {
      if (uVar5 == unaff_x27) goto LAB_00719158;
      uVar4 = uVar4 + lVar3 & param_1 - 1U;
      uVar5 = *(ulong *)(lVar2 + uVar4 * 0x10);
      lVar3 = lVar3 + 1;
    } while (uVar5 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar2 + uVar4 * 0x10) = unaff_x27;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00719158:
  *(undefined8 *)(lVar2 + uVar4 * 0x10 + 8) = unaff_x20;
  plVar1 = *(long **)(unaff_x29 + -0xb8);
  lVar2 = *plVar1 + *(long *)(unaff_x29 + -0xb0) * 0x28;
  if (lVar2 != plVar1[1]) {
    plVar1[1] = lVar2;
  }
  return;
}

