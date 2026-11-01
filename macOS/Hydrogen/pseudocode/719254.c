
ulong FUN_00719254(void)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long unaff_x19;
  undefined8 uVar8;
  
  if (*(int *)(unaff_x19 + 0x80) == 0x119) {
    func_0x00710d48();
  }
  else {
    func_0x0072415c();
  }
  *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0x4a0) =
       *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0x4a0) + 1;
  uVar8 = *(undefined8 *)(unaff_x19 + 0x160);
  *(long *)(unaff_x19 + 0x160) = *(long *)(unaff_x19 + 0x150) - *(long *)(unaff_x19 + 0x148) >> 3;
  func_0x00718a2c();
  *(undefined8 *)(unaff_x19 + 0x160) = uVar8;
  *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0x4a0) =
       *(int *)(*(long *)(unaff_x19 + 0x1c0) + 0x4a0) + -1;
  uVar1 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x48);
  func_0x0070787c();
  if (*(char *)(unaff_x19 + 0x58) != '\0') {
    uVar8 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),0x14);
    func_0x007096a4();
    lVar2 = *(long *)(unaff_x19 + 0x420);
    if ((ulong)(lVar2 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
      if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar1 != *(ulong *)(unaff_x19 + 0x430))) {
        uVar4 = 0;
        uVar6 = uVar1 >> 4 ^ uVar1 >> 9;
        do {
          uVar6 = uVar6 & lVar2 - 1U;
          uVar7 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar6 * 0x10);
          if (uVar7 == uVar1) goto code_r0x00719408;
          uVar4 = uVar4 + 1;
          uVar6 = uVar4 + uVar6;
        } while (uVar7 != *(ulong *)(unaff_x19 + 0x430) && uVar4 <= lVar2 - 1U);
      }
      func_0x006db93c();
      lVar2 = *(long *)(unaff_x19 + 0x420);
    }
code_r0x00719408:
    lVar3 = *(long *)(unaff_x19 + 0x418);
    uVar4 = (uVar1 >> 4 ^ uVar1 >> 9) & lVar2 - 1U;
    uVar6 = *(ulong *)(lVar3 + uVar4 * 0x10);
    if (uVar6 != *(ulong *)(unaff_x19 + 0x430)) {
      lVar5 = 1;
      do {
        if (uVar6 == uVar1) goto code_r0x00719468;
        uVar4 = uVar4 + lVar5 & lVar2 - 1U;
        uVar6 = *(ulong *)(lVar3 + uVar4 * 0x10);
        lVar5 = lVar5 + 1;
      } while (uVar6 != *(ulong *)(unaff_x19 + 0x430));
    }
    *(ulong *)(lVar3 + uVar4 * 0x10) = uVar1;
    *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x00719468:
    *(undefined8 *)(lVar3 + uVar4 * 0x10 + 8) = uVar8;
  }
  return uVar1;
}

