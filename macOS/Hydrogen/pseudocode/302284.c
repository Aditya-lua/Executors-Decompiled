
undefined8 FUN_00302284(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  uint uVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *unaff_x19;
  long *unaff_x20;
  
  _memcpy(*unaff_x19,*unaff_x20,param_1 << 3);
  *(int *)(unaff_x19 + 1) = (int)unaff_x20[1];
  *(int *)(unaff_x19 + 2) = (int)unaff_x20[2];
  *(undefined4 *)(unaff_x19 + 5) = 0;
  *(undefined4 *)(unaff_x19 + 4) = 0;
  uVar4 = *(uint *)(unaff_x20 + 1);
  uVar6 = (ulong)uVar4;
  uVar5 = uVar4 & (int)uVar4 >> 0x1f;
  lVar8 = uVar6 * 8;
  do {
    lVar8 = lVar8 + -8;
    uVar10 = (uint)uVar6;
    uVar6 = (ulong)(uVar10 - 1);
    if ((int)uVar10 < 1) {
      if (-1 < (int)uVar4) {
        *(undefined4 *)(unaff_x19 + 6) = 0;
        *(undefined4 *)((long)unaff_x19 + 0x34) = 0;
        return 1;
      }
      lVar9 = *unaff_x20;
      goto LAB_00302318;
    }
    lVar9 = *unaff_x20;
  } while (*(long *)(lVar9 + lVar8) == 0);
  uVar5 = uVar10;
LAB_00302318:
  uVar7 = *(ulong *)(lVar9 + (long)(int)(uVar5 - 1) * 8);
  uVar11 = uVar7 >> 0x20;
  uVar6 = uVar11;
  if (uVar11 == 0) {
    uVar6 = uVar7;
  }
  uVar12 = uVar6 >> 0x10;
  uVar1 = uVar12;
  if (uVar12 == 0) {
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
  uVar5 = (uint)(uVar7 != 0) | (uVar5 - 1) * 0x40 | (uint)(uVar11 != 0) << 5 |
          (uint)(uVar12 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar6) << 2 |
          (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar5 = uVar5 + 1;
  }
  *(uint *)(unaff_x19 + 6) = uVar5;
  *(undefined4 *)((long)unaff_x19 + 0x34) = 0;
  return 1;
}

