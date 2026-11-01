
undefined8 FUN_006dd6dc(long param_1)

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
  ulong unaff_x19;
  long *unaff_x20;
  undefined4 unaff_w21;
  ulong unaff_x22;
  
  while (in_x14 != unaff_x19) {
    in_x10 = in_x10 + 1;
    if (in_x14 == in_x9 || in_x11 < in_x10) {
      func_0x006d3810();
      param_1 = unaff_x20[1];
      break;
    }
    in_x13 = in_x10 + in_x13 & in_x11;
    in_x14 = *(ulong *)(in_x12 + in_x13 * 0x10);
  }
  lVar1 = *unaff_x20;
  uVar2 = (unaff_x22 ^ unaff_x19 >> 9) & param_1 - 1U;
  uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
  if (uVar4 != unaff_x20[3]) {
    lVar3 = 1;
    do {
      if (uVar4 == unaff_x19) goto LAB_006dd764;
      uVar2 = uVar2 + lVar3 & param_1 - 1U;
      uVar4 = *(ulong *)(lVar1 + uVar2 * 0x10);
      lVar3 = lVar3 + 1;
    } while (uVar4 != unaff_x20[3]);
  }
  *(ulong *)(lVar1 + uVar2 * 0x10) = unaff_x19;
  unaff_x20[2] = unaff_x20[2] + 1;
LAB_006dd764:
  *(undefined4 *)(lVar1 + uVar2 * 0x10 + 8) = unaff_w21;
  return 0;
}

