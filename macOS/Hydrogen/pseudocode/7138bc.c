
void FUN_007138bc(long param_1)

{
  long lVar1;
  ulong in_x9;
  ulong uVar2;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  long lVar3;
  ulong in_x13;
  ulong uVar4;
  ulong in_x14;
  long unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  undefined8 unaff_x22;
  
  do {
    in_x10 = in_x10 + 1;
    if (in_x14 == in_x9 || in_x11 < in_x10) {
      func_0x006db93c();
      param_1 = *(long *)(unaff_x19 + 0x420);
      break;
    }
    in_x13 = in_x10 + in_x13 & in_x11;
    in_x14 = *(ulong *)(in_x12 + in_x13 * 0x10);
  } while (in_x14 != unaff_x20);
  lVar1 = *(long *)(unaff_x19 + 0x418);
  uVar2 = (unaff_x21 ^ unaff_x20 >> 9) & param_1 - 1U;
  uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
  if (uVar4 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar3 = 1;
    do {
      if (uVar4 == unaff_x20) goto LAB_00713938;
      uVar2 = uVar2 + lVar3 & param_1 - 1U;
      uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
      lVar3 = lVar3 + 1;
    } while (uVar4 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar1 + uVar2 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00713938:
  *(undefined8 *)(lVar1 + uVar2 * 0x10 + 8) = unaff_x22;
  return;
}

