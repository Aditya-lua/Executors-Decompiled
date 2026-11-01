
void FUN_00715750(long param_1)

{
  undefined1 in_ZR;
  long lVar1;
  ulong in_x9;
  ulong uVar2;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  long lVar3;
  ulong in_x13;
  ulong uVar4;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x21;
  ulong unaff_x22;
  
  while (!(bool)in_ZR && in_x10 <= in_x11) {
    uVar2 = *(ulong *)(in_x12 + (in_x13 & in_x11) * 0x10);
    if (uVar2 == unaff_x22) goto code_r0x00715760;
    in_x10 = in_x10 + 1;
    in_x13 = in_x10 + (in_x13 & in_x11);
    in_ZR = uVar2 == in_x9;
  }
  func_0x006db93c();
  param_1 = *(long *)(unaff_x19 + 0x420);
code_r0x00715760:
  lVar1 = *(long *)(unaff_x19 + 0x418);
  uVar2 = (unaff_x20 ^ unaff_x22 >> 9) & param_1 - 1U;
  uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
  if (uVar4 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar3 = 1;
    do {
      if (uVar4 == unaff_x22) goto LAB_007157c0;
      uVar2 = uVar2 + lVar3 & param_1 - 1U;
      uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
      lVar3 = lVar3 + 1;
    } while (uVar4 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar1 + uVar2 * 0x10) = unaff_x22;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_007157c0:
  *(undefined8 *)(lVar1 + uVar2 * 0x10 + 8) = unaff_x21;
  return;
}

