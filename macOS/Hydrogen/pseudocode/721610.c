
ulong FUN_00721610(void)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long unaff_x19;
  undefined8 unaff_x20;
  long unaff_x23;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = *(undefined8 *)(unaff_x23 + 0x14);
  uVar1 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x30);
  func_0x0070697c();
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    lVar2 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar2 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar1 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar4 = 0;
        uVar6 = uVar1 >> 4 ^ uVar1 >> 9;
        do {
          uVar6 = uVar6 & lVar2 - 1U;
          uVar7 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar6 * 0x10);
          if (uVar7 == uVar1) goto LAB_007216ac;
          uVar4 = uVar4 + 1;
          uVar6 = uVar4 + uVar6;
        } while (uVar7 != *(ulong *)(unaff_x19 + 0x430) && uVar4 <= lVar2 - 1U);
      }
      func_0x006db93c();
      lVar2 = *(long *)(unaff_x19 + 0x420);
    }
LAB_007216ac:
    lVar3 = *(long *)(unaff_x19 + 0x418);
    uVar4 = (uVar1 >> 4 ^ uVar1 >> 9) & lVar2 - 1U;
    uVar6 = *(ulong *)(lVar3 + uVar4 * 0x10);
    if (uVar6 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar5 = 1;
      do {
        if (uVar6 == uVar1) goto LAB_0072170c;
        uVar4 = uVar4 + lVar5 & lVar2 - 1U;
        uVar6 = *(ulong *)(lVar3 + uVar4 * 0x10);
        lVar5 = lVar5 + 1;
      } while (uVar6 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar3 + uVar4 * 0x10) = uVar1;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
LAB_0072170c:
    *(undefined8 *)(lVar3 + uVar4 * 0x10 + 8) = unaff_x20;
  }
  return uVar1;
}

