
void FUN_0071937c(void)

{
  undefined8 uVar1;
  int in_w8;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long unaff_x19;
  ulong unaff_x20;
  
  if (in_w8 != 0) {
    uVar1 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x14);
    func_0x007096a4();
    lVar2 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar2 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (unaff_x20 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar4 = 0;
        uVar6 = unaff_x20 >> 4 ^ unaff_x20 >> 9;
        do {
          uVar6 = uVar6 & lVar2 - 1U;
          uVar7 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar6 * 0x10);
          if (uVar7 == unaff_x20) goto LAB_00719408;
          uVar4 = uVar4 + 1;
          uVar6 = uVar4 + uVar6;
        } while (uVar7 != *(ulong *)(unaff_x19 + 0x430) && uVar4 <= lVar2 - 1U);
      }
      func_0x006db93c();
      lVar2 = *(long *)(unaff_x19 + 0x420);
    }
LAB_00719408:
    lVar3 = *(long *)(unaff_x19 + 0x418);
    uVar4 = (unaff_x20 >> 4 ^ unaff_x20 >> 9) & lVar2 - 1U;
    uVar6 = *(ulong *)(lVar3 + uVar4 * 0x10);
    if (uVar6 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar5 = 1;
      do {
        if (uVar6 == unaff_x20) goto LAB_00719468;
        uVar4 = uVar4 + lVar5 & lVar2 - 1U;
        uVar6 = *(ulong *)(lVar3 + uVar4 * 0x10);
        lVar5 = lVar5 + 1;
      } while (uVar6 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar3 + uVar4 * 0x10) = unaff_x20;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_00719468:
    *(undefined8 *)(lVar3 + uVar4 * 0x10 + 8) = uVar1;
  }
  return;
}

