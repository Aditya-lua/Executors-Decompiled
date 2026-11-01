
ulong FUN_00712b0c(void)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  ulong uVar8;
  long unaff_x19;
  long unaff_x29;
  undefined8 in_stack_00000040;
  
  uVar1 = func_0x00704c24();
  func_0x0070728c(uVar1,unaff_x29 + -200,in_stack_00000040);
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x28);
    func_0x007095b4(uVar2,*(undefined8 *)(unaff_x29 + -0x68));
    lVar3 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar3 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar1 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar5 = 0;
        uVar7 = uVar1 >> 4 ^ uVar1 >> 9;
        do {
          uVar7 = uVar7 & lVar3 - 1U;
          uVar8 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar7 * 0x10);
          if (uVar8 == uVar1) goto FUN_00712bcc;
          uVar5 = uVar5 + 1;
          uVar7 = uVar5 + uVar7;
        } while (uVar8 != *(ulong *)(unaff_x19 + 0x430) && uVar5 <= lVar3 - 1U);
      }
      func_0x006db93c();
      lVar3 = *(long *)(unaff_x19 + 0x420);
    }
FUN_00712bcc:
    lVar4 = *(long *)(unaff_x19 + 0x418);
    uVar5 = (uVar1 >> 4 ^ uVar1 >> 9) & lVar3 - 1U;
    uVar7 = *(ulong *)(lVar4 + uVar5 * 0x10);
    if (uVar7 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar6 = 1;
      do {
        if (uVar7 == uVar1) goto FUN_00712c2c;
        uVar5 = uVar5 + lVar6 & lVar3 - 1U;
        uVar7 = *(ulong *)(lVar4 + uVar5 * 0x10);
        lVar6 = lVar6 + 1;
      } while (uVar7 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar4 + uVar5 * 0x10) = uVar1;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
FUN_00712c2c:
    *(undefined8 *)(lVar4 + uVar5 * 0x10 + 8) = uVar2;
  }
  return uVar1;
}

