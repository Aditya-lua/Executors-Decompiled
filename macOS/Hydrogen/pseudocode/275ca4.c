
ulong FUN_00275ca4(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  long lVar5;
  ulong uVar6;
  long *plVar7;
  uint uVar8;
  ulong uVar9;
  long lVar10;
  uint uVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  
  lVar5 = func_0x00187bd0();
  if (lVar5 != 0) {
    uVar6 = func_0x0029ce18();
    *unaff_x19 = unaff_x20;
    unaff_x19[1] = lVar5;
    unaff_x19[2] = uVar6;
    return uVar6;
  }
  plVar7 = (long *)func_0x007a1f00(1);
  plVar7 = (long *)*plVar7;
  uVar4 = *(uint *)(plVar7 + 1);
  uVar6 = (ulong)uVar4;
  uVar8 = uVar4 & (int)uVar4 >> 0x1f;
  lVar5 = uVar6 * 8;
  do {
    lVar5 = lVar5 + -8;
    uVar11 = (uint)uVar6;
    uVar6 = (ulong)(uVar11 - 1);
    if ((int)uVar11 < 1) {
      if (-1 < (int)uVar4) {
        return 0;
      }
      lVar10 = *plVar7;
      goto code_r0x0029bf50;
    }
    lVar10 = *plVar7;
  } while (*(long *)(lVar10 + lVar5) == 0);
  uVar8 = uVar11;
code_r0x0029bf50:
  uVar9 = *(ulong *)(lVar10 + (long)(int)(uVar8 - 1) * 8);
  uVar12 = uVar9 >> 0x20;
  uVar6 = uVar12;
  if (uVar12 == 0) {
    uVar6 = uVar9;
  }
  uVar13 = uVar6 >> 0x10;
  uVar1 = uVar13;
  if (uVar13 == 0) {
    uVar1 = uVar6;
  }
  uVar6 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar6 = uVar1;
  }
  uVar2 = uVar6 >> 4;
  if (uVar6 < 0x10) {
    uVar2 = uVar6;
  }
  uVar3 = uVar2 >> 2;
  if (uVar2 < 4) {
    uVar3 = uVar2;
  }
  uVar8 = (uint)(uVar9 != 0) | (uVar8 - 1) * 0x40 | (uint)(uVar12 != 0) << 5 |
          (uint)(uVar13 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar6) << 2 |
          (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar8 = uVar8 + 1;
  }
  return (ulong)uVar8;
}

