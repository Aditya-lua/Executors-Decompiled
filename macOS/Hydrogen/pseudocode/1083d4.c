
ulong FUN_001083d4(void)

{
  int iVar1;
  byte bVar2;
  bool bVar3;
  ulong uVar4;
  long *plVar5;
  uint in_w8;
  long lVar6;
  int in_w9;
  uint uVar7;
  uint uVar8;
  int iVar9;
  int iVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  long unaff_x19;
  uint unaff_w20;
  long unaff_x21;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  long lStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  _uStack0000000000000008 = 0;
  if ((int)in_w8 <= in_w9) {
    _uStack0000000000000008 = unaff_x19 + unaff_x21;
  }
  lStack0000000000000010 = 0;
  if ((int)in_w8 <= in_w9) {
    lStack0000000000000010 = (ulong)in_w8 << 0x20;
  }
  func_0x00108128(&uStack0000000000000008,0x13,1,(long)&uStack0000000000000018 + 4);
  if (uStack0000000000000018._4_4_ == 0) {
    uVar4 = 0;
    lVar6 = 0;
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
      return 0;
    }
    goto LAB_00108578;
  }
  uVar8 = uStack0000000000000018._4_4_ + (int)unaff_x21;
  uVar13 = unaff_w20;
  if ((int)uVar8 <= (int)unaff_w20 && -1 < (int)uVar8) {
    uVar13 = uVar8;
  }
  if ((int)uVar13 < (int)unaff_w20) {
    uVar8 = uVar13 + 1;
    uVar11 = (uint)*(byte *)(unaff_x19 + (int)uVar13) << 8;
  }
  else {
    uVar11 = 0;
    uVar8 = uVar13;
  }
  if ((int)uVar8 < (int)unaff_w20) {
    lVar6 = (long)(int)uVar8;
    uVar8 = uVar8 + 1;
    uVar11 = *(byte *)(unaff_x19 + lVar6) | uVar11;
  }
  if (uVar11 != 0) {
    uVar7 = unaff_w20;
    if ((int)uVar8 < (int)unaff_w20) {
      bVar2 = *(byte *)(unaff_x19 + (int)uVar8);
      uVar12 = (uint)bVar2;
      uVar8 = uVar8 + 1 + bVar2 * uVar11;
      if ((int)uVar8 <= (int)unaff_w20 && -1 < (int)uVar8) {
        uVar7 = uVar8;
      }
      if (bVar2 == 0) goto LAB_00108524;
      uVar8 = 0;
      do {
        while ((int)unaff_w20 <= (int)uVar7) {
          uVar8 = uVar8 << 8;
          uVar12 = uVar12 - 1;
          if (uVar12 == 0) goto LAB_00108504;
        }
        lVar6 = (long)(int)uVar7;
        uVar7 = uVar7 + 1;
        uVar8 = uVar8 << 8 | (uint)*(byte *)(unaff_x19 + lVar6);
        uVar12 = uVar12 - 1;
      } while (uVar12 != 0);
LAB_00108504:
      iVar10 = uVar8 - 1;
    }
    else {
      if ((int)uVar8 <= (int)unaff_w20 && -1 < (int)uVar8) {
        uVar7 = uVar8;
      }
LAB_00108524:
      iVar10 = -1;
    }
    uVar7 = iVar10 + uVar7;
    uVar8 = unaff_w20;
    if ((int)uVar7 <= (int)unaff_w20 && -1 < (int)uVar7) {
      uVar8 = uVar7;
    }
  }
  bVar3 = -1 < (int)(uVar8 - uVar13 | uVar13);
  uVar4 = 0;
  if (bVar3 && (int)uVar8 <= (int)unaff_w20) {
    uVar4 = unaff_x19 + (ulong)uVar13;
  }
  lVar6 = 0;
  if (bVar3 && (int)uVar8 <= (int)unaff_w20) {
    lVar6 = (ulong)(uVar8 - uVar13) << 0x20;
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return uVar4;
  }
LAB_00108578:
  plVar5 = (long *)___stack_chk_fail(uVar4,lVar6);
  iVar10 = (int)plVar5[1];
  iVar1 = *(int *)((long)plVar5 + 0xc);
  if (iVar1 <= iVar10) {
    return 0;
  }
  lVar6 = *plVar5;
  uVar4 = (long)iVar10 + 1;
  iVar9 = (int)uVar4;
  *(int *)(plVar5 + 1) = iVar9;
  bVar2 = *(byte *)(lVar6 + iVar10);
  uVar8 = (uint)bVar2;
  if ((byte)(bVar2 - 0x20) < 0xd7) {
    return (ulong)(uVar8 - 0x8b);
  }
  if ((byte)(bVar2 + 9) < 4) {
    if (iVar9 < iVar1) {
      *(int *)(plVar5 + 1) = iVar10 + 2;
      return (ulong)(uVar8 * 0x100 + (*(byte *)(lVar6 + uVar4) - 0xf694));
    }
    return (ulong)(uVar8 * 0x100 - 0xf694);
  }
  if ((uVar8 + 5 & 0xff) < 4) {
    if (iVar9 < iVar1) {
      *(int *)(plVar5 + 1) = iVar10 + 2;
      return (ulong)(0xfa94 - CONCAT11(bVar2,*(undefined1 *)(lVar6 + uVar4)));
    }
    return (ulong)(uVar8 * -0x100 + 0xfa94);
  }
  if (uVar8 == 0x1d) {
    if (iVar9 < iVar1) {
      *(uint *)(plVar5 + 1) = iVar10 + 2U;
      uVar8 = (uint)*(byte *)(lVar6 + uVar4) << 8;
      uVar4 = (ulong)(iVar10 + 2U);
    }
    else {
      uVar8 = 0;
    }
    iVar10 = (int)uVar4;
    if (iVar10 < iVar1) {
      *(int *)(plVar5 + 1) = iVar10 + 1;
      uVar13 = (uint)*(byte *)(lVar6 + iVar10);
      iVar10 = iVar10 + 1;
    }
    else {
      uVar13 = 0;
    }
    if (iVar10 < iVar1) {
      *(int *)(plVar5 + 1) = iVar10 + 1;
      uVar11 = (uint)*(byte *)(lVar6 + iVar10) << 8;
      iVar10 = iVar10 + 1;
    }
    else {
      uVar11 = 0;
    }
    uVar11 = uVar11 | (uVar8 | uVar13) << 0x10;
  }
  else {
    if (uVar8 != 0x1c) {
      return 0;
    }
    if (iVar9 < iVar1) {
      *(uint *)(plVar5 + 1) = iVar10 + 2U;
      uVar11 = (uint)*(byte *)(lVar6 + uVar4) << 8;
      uVar4 = (ulong)(iVar10 + 2U);
    }
    else {
      uVar11 = 0;
    }
    iVar10 = (int)uVar4;
  }
  if (iVar10 < iVar1) {
    *(int *)(plVar5 + 1) = iVar10 + 1;
    return (ulong)(uVar11 | *(byte *)(lVar6 + iVar10));
  }
  return (ulong)uVar11;
}

