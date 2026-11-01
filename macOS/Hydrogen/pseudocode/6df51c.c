
void FUN_006df51c(long param_1)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  long lVar5;
  long unaff_x19;
  long *unaff_x20;
  undefined4 unaff_w21;
  ulong unaff_x22;
  
  if (unaff_x20[3] != unaff_x19) {
    uVar1 = 0;
    uVar3 = unaff_x22;
    do {
      uVar3 = uVar3 & param_1 - 1U;
      lVar5 = *(long *)(*unaff_x20 + uVar3 * 0x10);
      if (lVar5 == unaff_x19) goto LAB_006df56c;
      uVar1 = uVar1 + 1;
      uVar3 = uVar1 + uVar3;
    } while (lVar5 != unaff_x20[3] && uVar1 <= param_1 - 1U);
  }
  func_0x006d3810();
  param_1 = unaff_x20[1];
LAB_006df56c:
  lVar5 = *unaff_x20;
  uVar1 = unaff_x22 & param_1 - 1U;
  lVar4 = *(long *)(lVar5 + uVar1 * 0x10);
  if (lVar4 != unaff_x20[3]) {
    lVar2 = 1;
    do {
      if (lVar4 == unaff_x19) goto LAB_006df5c8;
      uVar1 = uVar1 + lVar2 & param_1 - 1U;
      lVar4 = *(long *)(lVar5 + uVar1 * 0x10);
      lVar2 = lVar2 + 1;
    } while (lVar4 != unaff_x20[3]);
  }
  *(long *)(lVar5 + uVar1 * 0x10) = unaff_x19;
  unaff_x20[2] = unaff_x20[2] + 1;
LAB_006df5c8:
  *(undefined4 *)(lVar5 + uVar1 * 0x10 + 8) = unaff_w21;
  return;
}

