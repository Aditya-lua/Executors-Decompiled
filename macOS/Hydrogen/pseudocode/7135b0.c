
void FUN_007135b0(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 unaff_x22;
  
  lVar1 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar1 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (unaff_x20 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar3 = 0;
      uVar5 = unaff_x20 >> 4 ^ unaff_x20 >> 9;
      do {
        uVar5 = uVar5 & lVar1 - 1U;
        uVar6 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar5 * 0x10);
        if (uVar6 == unaff_x20) goto LAB_0071361c;
        uVar3 = uVar3 + 1;
        uVar5 = uVar3 + uVar5;
      } while (uVar6 != *(ulong *)(unaff_x19 + 0x430) && uVar3 <= lVar1 - 1U);
    }
    func_0x006db93c();
    lVar1 = *(long *)(unaff_x19 + 0x420);
  }
LAB_0071361c:
  lVar2 = *(long *)(unaff_x19 + 0x418);
  uVar3 = (unaff_x20 >> 4 ^ unaff_x20 >> 9) & lVar1 - 1U;
  uVar5 = *(ulong *)(lVar2 + uVar3 * 0x10);
  if (uVar5 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar4 = 1;
    do {
      if (uVar5 == unaff_x20) goto LAB_0071367c;
      uVar3 = uVar3 + lVar4 & lVar1 - 1U;
      uVar5 = *(ulong *)(lVar2 + uVar3 * 0x10);
      lVar4 = lVar4 + 1;
    } while (uVar5 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar2 + uVar3 * 0x10) = unaff_x20;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_0071367c:
  *(undefined8 *)(lVar2 + uVar3 * 0x10 + 8) = unaff_x22;
  return;
}

