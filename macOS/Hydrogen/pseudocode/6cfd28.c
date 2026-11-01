
undefined8 FUN_006cfd28(long param_1)

{
  ulong *puVar1;
  long lVar2;
  ulong uVar3;
  ulong in_x9;
  undefined8 *puVar4;
  long in_x10;
  ulong uVar5;
  ulong in_x11;
  ulong uVar6;
  ulong uVar7;
  ulong in_x12;
  long in_x13;
  undefined8 *puVar8;
  long unaff_x19;
  undefined8 *puVar9;
  undefined8 *puVar10;
  long unaff_x22;
  undefined8 *puVar11;
  undefined8 *puVar12;
  long lVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  while (in_x13 != unaff_x22) {
    in_x9 = in_x9 + 1;
    if (in_x13 == param_1 || in_x11 < in_x9) {
      return 0;
    }
    in_x12 = in_x9 + in_x12 & in_x11;
    in_x13 = *(long *)(in_x10 + in_x12 * 0x20);
  }
  if (*(int *)(in_x10 + in_x12 * 0x20 + 8) == 0) {
    return 0;
  }
  puVar10 = *(undefined8 **)(unaff_x19 + 0x18);
  if (puVar10 < *(undefined8 **)(unaff_x19 + 0x20)) {
    puVar11 = puVar10 + 1;
    *puVar10 = *(undefined8 *)(unaff_x22 + 0x20);
    goto LAB_006cfe7c;
  }
  puVar1 = (ulong *)(unaff_x19 + 0x10);
  puVar12 = (undefined8 *)*puVar1;
  lVar13 = (long)puVar10 - (long)puVar12 >> 3;
  uVar5 = lVar13 + 1;
  if (uVar5 >> 0x3d != 0) {
    func_0x00017f90(puVar1);
LAB_006cfea4:
    func_0x00017514();
    return 0;
  }
  uVar3 = (long)*(undefined8 **)(unaff_x19 + 0x20) - (long)puVar12;
  uVar6 = (long)uVar3 >> 2;
  if (uVar6 <= uVar5) {
    uVar6 = uVar5;
  }
  if (0x7ffffffffffffff7 < uVar3) {
    uVar6 = 0x1fffffffffffffff;
  }
  if (uVar6 == 0) {
    lVar2 = 0;
  }
  else {
    if (uVar6 >> 0x3d != 0) goto LAB_006cfea4;
    lVar2 = __Znwm(uVar6 << 3);
  }
  puVar4 = (undefined8 *)(lVar2 + lVar13 * 8);
  puVar11 = puVar4 + 1;
  *puVar4 = *(undefined8 *)(unaff_x22 + 0x20);
  if ((long)puVar10 - (long)puVar12 != 0) {
    uVar5 = ((long)puVar10 - (long)puVar12) - 8;
    puVar9 = puVar10;
    if ((uVar5 < 0x58) ||
       ((ulong)((long)puVar10 - (((long)puVar10 - (long)puVar12) + lVar2)) < 0x40)) {
LAB_006cfe54:
      do {
        puVar9 = puVar9 + -1;
        puVar4 = puVar4 + -1;
        *puVar4 = *puVar9;
      } while (puVar9 != puVar12);
    }
    else {
      uVar5 = (uVar5 >> 3) + 1;
      uVar7 = uVar5 & 0x3ffffffffffffff8;
      puVar9 = puVar10 + -uVar7;
      puVar4 = puVar4 + -uVar7;
      puVar10 = puVar10 + -4;
      puVar8 = (undefined8 *)(lVar2 + lVar13 * 8 + -0x20);
      uVar3 = uVar7;
      do {
        uVar16 = *puVar10;
        uVar15 = puVar10[3];
        uVar14 = puVar10[2];
        uVar20 = puVar10[-3];
        uVar19 = puVar10[-4];
        uVar18 = puVar10[-1];
        uVar17 = puVar10[-2];
        puVar8[1] = puVar10[1];
        *puVar8 = uVar16;
        puVar8[3] = uVar15;
        puVar8[2] = uVar14;
        puVar8[-3] = uVar20;
        puVar8[-4] = uVar19;
        puVar8[-1] = uVar18;
        puVar8[-2] = uVar17;
        puVar10 = puVar10 + -8;
        puVar8 = puVar8 + -8;
        uVar3 = uVar3 - 8;
      } while (uVar3 != 0);
      if (uVar5 != uVar7) goto LAB_006cfe54;
    }
    puVar10 = (undefined8 *)*puVar1;
  }
  *(undefined8 **)(unaff_x19 + 0x10) = puVar4;
  *(undefined8 **)(unaff_x19 + 0x18) = puVar11;
  *(ulong *)(unaff_x19 + 0x20) = lVar2 + uVar6 * 8;
  if (puVar10 != (undefined8 *)0x0) {
    __ZdlPv(puVar10);
  }
LAB_006cfe7c:
  *(undefined8 **)(unaff_x19 + 0x18) = puVar11;
  return 0;
}

