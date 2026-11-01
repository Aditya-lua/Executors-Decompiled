
void FUN_006df550(long param_1)

{
  undefined1 in_ZR;
  long lVar1;
  long in_x9;
  ulong uVar2;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  long lVar3;
  ulong in_x13;
  long lVar4;
  long unaff_x19;
  long *unaff_x20;
  undefined4 unaff_w21;
  ulong unaff_x22;
  
  while( true ) {
    in_x10 = in_x10 + 1;
    if ((bool)in_ZR || in_x11 < in_x10) break;
    in_x13 = in_x10 + in_x13 & in_x11;
    lVar1 = *(long *)(in_x12 + in_x13 * 0x10);
    if (lVar1 == unaff_x19) goto code_r0x006df56c;
    in_ZR = lVar1 == in_x9;
  }
  func_0x006d3810();
  param_1 = unaff_x20[1];
code_r0x006df56c:
  lVar1 = *unaff_x20;
  uVar2 = unaff_x22 & param_1 - 1U;
  lVar4 = *(long *)(lVar1 + uVar2 * 0x10);
  if (lVar4 != unaff_x20[3]) {
    lVar3 = 1;
    do {
      if (lVar4 == unaff_x19) goto LAB_006df5c8;
      uVar2 = uVar2 + lVar3 & param_1 - 1U;
      lVar4 = *(long *)(lVar1 + uVar2 * 0x10);
      lVar3 = lVar3 + 1;
    } while (lVar4 != unaff_x20[3]);
  }
  *(long *)(lVar1 + uVar2 * 0x10) = unaff_x19;
  unaff_x20[2] = unaff_x20[2] + 1;
LAB_006df5c8:
  *(undefined4 *)(lVar1 + uVar2 * 0x10 + 8) = unaff_w21;
  return;
}

