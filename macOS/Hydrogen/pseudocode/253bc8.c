
long * FUN_00253bc8(void)

{
  long *plVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  long *unaff_x19;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined *unaff_x22;
  long unaff_x23;
  ulong uVar13;
  undefined *unaff_x24;
  undefined8 uStack0000000000000010;
  undefined *puStack_40;
  undefined8 uStack_38;
  undefined *puStack_30;
  
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    unaff_x24 = unaff_x22 + 0x28;
    func_0x0016abd8(unaff_x22);
    unaff_x22 = unaff_x24;
  }
  if (*unaff_x19 != 0) {
    func_0x00187bd4();
  }
  lVar6 = *uStack0000000000000010;
  *uStack0000000000000010 = lVar6 + -1;
  LORelease();
  if (lVar6 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa1d4(&uStack0000000000000010);
  }
  __Unwind_Resume();
  func_0x007a2668();
  lVar6 = func_0x007a2668();
  if ((*(char *)(lVar6 + 0x332) == '\x01') && ((*(byte *)(lVar6 + 0x333) & 1) != 0)) {
    puStack_40 = &UNK_009ca6b8;
    uStack_38 = 1;
    puStack_30 = (undefined *)0x8;
    func_0x007a2420(&puStack_40,&UNK_009ca6c8);
    func_0x003f1b28();
    return (long *)((long)&MACH_HEADER.magic + 1);
  }
  plVar1 = (long *)(lVar6 + 0x340);
  plVar7 = plVar1;
  if (2 < *plVar1 - 2U) {
    uVar11 = *(ulong *)(lVar6 + 0x368);
    uVar9 = *(ulong *)(lVar6 + 0x350);
    uStack_38 = 0;
    puStack_40 = unaff_x24;
    puStack_30 = unaff_x22;
    if (uVar11 != 0) {
      lVar4 = *(long *)(lVar6 + 0x358);
      uVar5 = *(ulong *)(lVar6 + 0x360);
      uVar2 = 0;
      if (uVar9 <= uVar5) {
        uVar2 = uVar9;
      }
      lVar8 = uVar5 - uVar2;
      uVar13 = uVar9 - lVar8;
      lVar10 = 0;
      if (uVar13 <= uVar11) {
        lVar10 = uVar11 - uVar13;
      }
      uVar3 = uVar9;
      if (uVar11 <= uVar13) {
        uVar3 = lVar8 + uVar11;
      }
      lVar8 = uVar3 - lVar8;
      if (lVar8 != 0) {
        puVar12 = (undefined8 *)(uVar5 * 0x18 + uVar2 * -0x18 + lVar4 + 8);
        do {
          if (puVar12[-1] != 0) {
            plVar7 = (long *)func_0x00187bd4(*puVar12,puVar12[-1],1);
          }
          puVar12 = puVar12 + 3;
          lVar8 = lVar8 + -1;
        } while (lVar8 != 0);
      }
      if (uVar13 < uVar11) {
        puVar12 = (undefined8 *)(lVar4 + 8);
        do {
          if (puVar12[-1] != 0) {
            plVar7 = (long *)func_0x00187bd4(*puVar12,puVar12[-1],1);
          }
          puVar12 = puVar12 + 3;
          lVar10 = lVar10 + -1;
        } while (lVar10 != 0);
      }
    }
    if (uVar9 != 0) {
      plVar7 = (long *)func_0x00187bd4(*(undefined8 *)(lVar6 + 0x358),uVar9 * 0x18,8);
    }
  }
  *plVar1 = 4;
  return plVar7;
}

