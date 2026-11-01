
void FUN_007156f4(void)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x19;
  undefined8 unaff_x21;
  ulong unaff_x22;
  
  lVar1 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar1 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (unaff_x22 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar3 = 0;
      uVar5 = unaff_x22 >> 4 ^ unaff_x22 >> 9;
      do {
        uVar5 = uVar5 & lVar1 - 1U;
        uVar6 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar5 * 0x10);
        if (uVar6 == unaff_x22) goto LAB_00715760;
        uVar3 = uVar3 + 1;
        uVar5 = uVar3 + uVar5;
      } while (uVar6 != *(ulong *)(unaff_x19 + 0x430) && uVar3 <= lVar1 - 1U);
    }
    func_0x006db93c();
    lVar1 = *(long *)(unaff_x19 + 0x420);
  }
LAB_00715760:
  lVar2 = *(long *)(unaff_x19 + 0x418);
  uVar3 = (unaff_x22 >> 4 ^ unaff_x22 >> 9) & lVar1 - 1U;
  uVar5 = *(ulong *)(lVar2 + uVar3 * 0x10);
  if (uVar5 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar4 = 1;
    do {
      if (uVar5 == unaff_x22) goto code_r0x007157c0;
      uVar3 = uVar3 + lVar4 & lVar1 - 1U;
      uVar5 = *(ulong *)(lVar2 + uVar3 * 0x10);
      lVar4 = lVar4 + 1;
    } while (uVar5 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar2 + uVar3 * 0x10) = unaff_x22;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x007157c0:
  *(undefined8 *)(lVar2 + uVar3 * 0x10 + 8) = unaff_x21;
  return;
}

