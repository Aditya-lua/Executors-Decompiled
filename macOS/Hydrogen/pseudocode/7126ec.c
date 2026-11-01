
void FUN_007126ec(long param_1,long *param_2)

{
  long lVar1;
  ulong in_x9;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  
  if (unaff_x20 != in_x9) {
    uVar2 = 0;
    uVar4 = unaff_x22 ^ unaff_x20 >> 9;
    do {
      uVar4 = uVar4 & param_1 - 1U;
      uVar5 = *(ulong *)(*param_2 + uVar4 * 0x10);
      if (uVar5 == unaff_x20) goto LAB_00712734;
      uVar2 = uVar2 + 1;
      uVar4 = uVar2 + uVar4;
    } while (uVar5 != in_x9 && uVar2 <= param_1 - 1U);
  }
  func_0x006db93c();
  param_1 = *(long *)(unaff_x19 + 0x420);
LAB_00712734:
  lVar1 = *(long *)(unaff_x19 + 0x418);
  uVar2 = (unaff_x22 ^ unaff_x20 >> 9) & param_1 - 1U;
  uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
  if (uVar4 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar3 = 1;
    do {
      if (uVar4 == unaff_x20) goto LAB_00712794;
      uVar2 = uVar2 + lVar3 & param_1 - 1U;
      uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
      lVar3 = lVar3 + 1;
    } while (uVar4 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar1 + uVar2 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00712794:
  *(undefined8 *)(lVar1 + uVar2 * 0x10 + 8) = unaff_x21;
  return;
}

