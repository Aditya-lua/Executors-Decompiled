
long FUN_006b2fc0(void)

{
  long lVar1;
  undefined4 *puVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  undefined4 *puVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  undefined4 *puVar11;
  undefined4 uVar12;
  undefined4 *puVar13;
  undefined4 *puVar14;
  long lVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  
  func_0x00017f90();
  lVar3 = func_0x00017514();
  lVar4 = func_0x006b0ff8();
  puVar2 = *(undefined4 **)(lVar3 + 0x1e0);
  uVar12 = (undefined4)lVar4;
  if (puVar2 < *(undefined4 **)(lVar3 + 0x1e8)) {
    puVar14 = puVar2 + 1;
    *puVar2 = uVar12;
    goto LAB_006b3124;
  }
  puVar11 = *(undefined4 **)(lVar3 + 0x1d8);
  lVar15 = (long)puVar2 - (long)puVar11 >> 2;
  uVar7 = lVar15 + 1;
  if (uVar7 >> 0x3e != 0) {
    func_0x00017f90();
LAB_006b3144:
    lVar4 = func_0x00017514();
    return *(long *)(lVar4 + 0x20);
  }
  uVar5 = (long)*(undefined4 **)(lVar3 + 0x1e8) - (long)puVar11;
  uVar8 = (long)uVar5 >> 1;
  if (uVar8 <= uVar7) {
    uVar8 = uVar7;
  }
  if (0x7ffffffffffffffb < uVar5) {
    uVar8 = 0x3fffffffffffffff;
  }
  if (uVar8 == 0) {
    lVar4 = 0;
    puVar6 = (undefined4 *)(lVar15 * 4);
    lVar1 = 0;
    *puVar6 = uVar12;
  }
  else {
    if (uVar8 >> 0x3e != 0) goto LAB_006b3144;
    lVar4 = __Znwm(uVar8 << 2);
    puVar6 = (undefined4 *)(lVar4 + lVar15 * 4);
    lVar1 = lVar4 + uVar8 * 4;
    *puVar6 = uVar12;
  }
  puVar14 = puVar6 + 1;
  if ((long)puVar2 - (long)puVar11 != 0) {
    uVar7 = ((long)puVar2 - (long)puVar11) - 4;
    puVar13 = puVar2;
    if ((0x3b < uVar7) && (0x3f < (ulong)((long)puVar2 + (-((long)puVar2 - (long)puVar11) - lVar4)))
       ) {
      uVar7 = (uVar7 >> 2) + 1;
      uVar5 = uVar7 & 0x7ffffffffffffff0;
      puVar13 = puVar2 + -uVar5;
      puVar6 = puVar6 + -uVar5;
      puVar9 = (undefined8 *)(puVar2 + -8);
      puVar10 = (undefined8 *)(lVar4 + lVar15 * 4 + -0x20);
      uVar8 = uVar5;
      do {
        uVar18 = *puVar9;
        uVar17 = puVar9[3];
        uVar16 = puVar9[2];
        uVar22 = puVar9[-3];
        uVar21 = puVar9[-4];
        uVar20 = puVar9[-1];
        uVar19 = puVar9[-2];
        puVar10[1] = puVar9[1];
        *puVar10 = uVar18;
        puVar10[3] = uVar17;
        puVar10[2] = uVar16;
        puVar10[-3] = uVar22;
        puVar10[-4] = uVar21;
        puVar10[-1] = uVar20;
        puVar10[-2] = uVar19;
        puVar9 = puVar9 + -8;
        puVar10 = puVar10 + -8;
        uVar8 = uVar8 - 0x10;
      } while (uVar8 != 0);
      if (uVar7 == uVar5) goto LAB_006b3110;
    }
    do {
      puVar13 = puVar13 + -1;
      puVar6 = puVar6 + -1;
      *puVar6 = *puVar13;
    } while (puVar13 != puVar11);
  }
LAB_006b3110:
  *(undefined4 **)(lVar3 + 0x1d8) = puVar6;
  *(undefined4 **)(lVar3 + 0x1e0) = puVar14;
  *(long *)(lVar3 + 0x1e8) = lVar1;
  if (puVar11 != (undefined4 *)0x0) {
    lVar4 = __ZdlPv(puVar11);
  }
LAB_006b3124:
  *(undefined4 **)(lVar3 + 0x1e0) = puVar14;
  return lVar4;
}

