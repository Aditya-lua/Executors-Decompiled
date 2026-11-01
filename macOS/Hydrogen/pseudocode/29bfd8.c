
uint FUN_0029bfd8(long *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  uint uVar5;
  uint uVar6;
  ulong in_x9;
  ulong uVar7;
  long lVar8;
  long lVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  
  uVar6 = (uint)in_x9;
  uVar5 = uVar6 & (int)uVar6 >> 0x1f;
  lVar8 = in_x9 * 8;
  do {
    lVar8 = lVar8 + -8;
    uVar10 = (uint)in_x9;
    in_x9 = (ulong)(uVar10 - 1);
    if ((int)uVar10 < 1) {
      if (-1 < (int)uVar6) {
        return 0;
      }
      lVar9 = *param_1;
      goto LAB_0029c018;
    }
    lVar9 = *param_1;
  } while (*(long *)(lVar9 + lVar8) == 0);
  uVar5 = uVar10;
LAB_0029c018:
  uVar7 = *(ulong *)(lVar9 + (long)(int)(uVar5 - 1) * 8);
  uVar11 = uVar7 >> 0x20;
  uVar2 = uVar11;
  if (uVar11 == 0) {
    uVar2 = uVar7;
  }
  uVar12 = uVar2 >> 0x10;
  uVar1 = uVar12;
  if (uVar12 == 0) {
    uVar1 = uVar2;
  }
  uVar2 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar2 = uVar1;
  }
  uVar3 = uVar2 >> 4;
  if (uVar2 < 0x10) {
    uVar3 = uVar2;
  }
  uVar4 = uVar3 >> 2;
  if (uVar3 < 4) {
    uVar4 = uVar3;
  }
  uVar5 = (uint)(uVar7 != 0) | (uVar5 - 1) * 0x40 | (uint)(uVar11 != 0) << 5 |
          (uint)(uVar12 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar2) << 2 |
          (uint)(3 < uVar3) << 1;
  if (1 < uVar4) {
    uVar5 = uVar5 + 1;
  }
  return uVar5 + 7 >> 3;
}

