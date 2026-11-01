
void FUN_007190ec(long param_1)

{
  long *plVar1;
  undefined1 in_ZR;
  undefined1 in_CY;
  long lVar2;
  ulong in_x9;
  ulong uVar3;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  long lVar4;
  ulong in_x13;
  ulong uVar5;
  long unaff_x19;
  undefined8 unaff_x20;
  ulong unaff_x21;
  ulong unaff_x27;
  long unaff_x29;
  
  while (!(bool)in_CY || (bool)in_ZR) {
    uVar3 = *(ulong *)(in_x12 + (in_x13 & in_x11) * 0x10);
    if (uVar3 == unaff_x27) goto code_r0x007190f8;
    in_x10 = in_x10 + 1;
    in_x13 = in_x10 + (in_x13 & in_x11);
    in_ZR = false;
    in_CY = true;
    if (uVar3 != in_x9) {
      in_CY = in_x11 <= in_x10;
      in_ZR = in_x10 == in_x11;
    }
  }
  func_0x006db93c();
  param_1 = *(long *)(unaff_x19 + 0x420);
code_r0x007190f8:
  lVar2 = *(long *)(unaff_x19 + 0x418);
  uVar3 = param_1 - 1U & (unaff_x21 ^ unaff_x27 >> 9);
  uVar5 = *(ulong *)(lVar2 + uVar3 * 0x10);
  if (uVar5 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar4 = 1;
    do {
      if (uVar5 == unaff_x27) goto LAB_00719158;
      uVar3 = uVar3 + lVar4 & param_1 - 1U;
      uVar5 = *(ulong *)(lVar2 + uVar3 * 0x10);
      lVar4 = lVar4 + 1;
    } while (uVar5 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar2 + uVar3 * 0x10) = unaff_x27;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00719158:
  *(undefined8 *)(lVar2 + uVar3 * 0x10 + 8) = unaff_x20;
  plVar1 = *(long **)(unaff_x29 + -0xb8);
  lVar2 = *plVar1 + *(long *)(unaff_x29 + -0xb0) * 0x28;
  if (lVar2 != plVar1[1]) {
    plVar1[1] = lVar2;
  }
  return;
}

