
undefined8 FUN_006dd6a8(long param_1)

{
  bool in_CY;
  long lVar1;
  long in_x9;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong unaff_x19;
  long *unaff_x20;
  undefined4 unaff_w21;
  
  if (in_CY) {
    if ((in_x9 != 0) && (unaff_x20[3] != unaff_x19)) {
      uVar2 = 0;
      uVar4 = unaff_x19 >> 4 ^ unaff_x19 >> 9;
      do {
        uVar4 = uVar4 & param_1 - 1U;
        uVar5 = *(ulong *)(*unaff_x20 + uVar4 * 0x10);
        if (uVar5 == unaff_x19) goto LAB_006dd704;
        uVar2 = uVar2 + 1;
        uVar4 = uVar2 + uVar4;
      } while (uVar5 != unaff_x20[3] && uVar2 <= param_1 - 1U);
    }
    func_0x006d3810();
    param_1 = unaff_x20[1];
  }
LAB_006dd704:
  lVar1 = *unaff_x20;
  uVar2 = (unaff_x19 >> 4 ^ unaff_x19 >> 9) & param_1 - 1U;
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

