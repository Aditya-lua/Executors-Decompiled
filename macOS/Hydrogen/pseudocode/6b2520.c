
void FUN_006b2520(long param_1)

{
  long lVar1;
  ulong uVar2;
  ulong in_x9;
  undefined4 *puVar3;
  undefined4 *puVar4;
  ulong in_x10;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *puVar10;
  undefined4 unaff_w21;
  undefined4 *puVar11;
  undefined4 *unaff_x22;
  undefined4 *puVar12;
  long lVar13;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  uVar5 = param_1 - (long)unaff_x20 >> 1;
  if (uVar5 <= in_x9) {
    uVar5 = in_x9;
  }
  if (in_x10 <= (ulong)(param_1 - (long)unaff_x20)) {
    uVar5 = 0x3fffffffffffffff;
  }
  if (uVar5 != 0) {
    if (uVar5 >> 0x3e == 0) {
      lVar1 = __Znwm(uVar5 << 2);
      puVar3 = (undefined4 *)(lVar1 + unaff_x25 * 4);
      lVar13 = lVar1 + uVar5 * 4;
      *puVar3 = unaff_w21;
      goto joined_r0x006b2564;
    }
LAB_006b275c:
    func_0x00017514();
    func_0x00017f90();
LAB_006b2764:
    lVar13 = func_0x00017f90();
    *(long *)(lVar13 + 0x30) = *(long *)(lVar13 + 0x30) + -4;
    *(long *)(lVar13 + 0x48) = *(long *)(lVar13 + 0x48) + -4;
    return;
  }
  lVar1 = 0;
  puVar3 = (undefined4 *)(unaff_x25 * 4);
  lVar13 = 0;
  *puVar3 = unaff_w21;
joined_r0x006b2564:
  puVar12 = puVar3 + 1;
  if (unaff_x24 - (long)unaff_x20 != 0) {
    uVar5 = (unaff_x24 - (long)unaff_x20) - 4;
    if ((0x3b < uVar5) && (0x3f < (ulong)((unaff_x24 - lVar1) - unaff_x26))) {
      uVar5 = (uVar5 >> 2) + 1;
      uVar2 = uVar5 & 0x7ffffffffffffff0;
      unaff_x22 = (undefined4 *)(unaff_x24 + uVar2 * -4);
      puVar3 = puVar3 + -uVar2;
      puVar8 = (undefined8 *)(unaff_x24 + -0x20);
      puVar9 = (undefined8 *)(lVar1 + unaff_x25 * 4 + -0x20);
      uVar6 = uVar2;
      do {
        uVar16 = *puVar8;
        uVar15 = puVar8[3];
        uVar14 = puVar8[2];
        uVar20 = puVar8[-3];
        uVar19 = puVar8[-4];
        uVar18 = puVar8[-1];
        uVar17 = puVar8[-2];
        puVar9[1] = puVar8[1];
        *puVar9 = uVar16;
        puVar9[3] = uVar15;
        puVar9[2] = uVar14;
        puVar9[-3] = uVar20;
        puVar9[-4] = uVar19;
        puVar9[-1] = uVar18;
        puVar9[-2] = uVar17;
        puVar8 = puVar8 + -8;
        puVar9 = puVar9 + -8;
        uVar6 = uVar6 - 0x10;
      } while (uVar6 != 0);
      if (uVar5 == uVar2) goto LAB_006b2604;
    }
    do {
      unaff_x22 = unaff_x22 + -1;
      puVar3 = puVar3 + -1;
      *puVar3 = *unaff_x22;
    } while (unaff_x22 != unaff_x20);
  }
LAB_006b2604:
  *(undefined4 **)(unaff_x19 + 0x28) = puVar3;
  *(undefined4 **)(unaff_x19 + 0x30) = puVar12;
  *(long *)(unaff_x19 + 0x38) = lVar13;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined4 **)(unaff_x19 + 0x30) = puVar12;
  puVar3 = *(undefined4 **)(unaff_x19 + 0x48);
  if (puVar3 < *(undefined4 **)(unaff_x19 + 0x50)) {
    puVar12 = puVar3 + 1;
    *puVar3 = *(undefined4 *)(unaff_x19 + 0x1b8);
    goto LAB_006b2740;
  }
  puVar10 = *(undefined4 **)(unaff_x19 + 0x40);
  lVar13 = (long)puVar3 - (long)puVar10 >> 2;
  uVar5 = lVar13 + 1;
  if (uVar5 >> 0x3e != 0) goto LAB_006b2764;
  uVar2 = (long)*(undefined4 **)(unaff_x19 + 0x50) - (long)puVar10;
  uVar6 = (long)uVar2 >> 1;
  if (uVar6 <= uVar5) {
    uVar6 = uVar5;
  }
  if (0x7ffffffffffffffb < uVar2) {
    uVar6 = 0x3fffffffffffffff;
  }
  if (uVar6 == 0) {
    lVar1 = 0;
  }
  else {
    if (uVar6 >> 0x3e != 0) goto LAB_006b275c;
    lVar1 = __Znwm(uVar6 << 2);
  }
  puVar4 = (undefined4 *)(lVar1 + lVar13 * 4);
  puVar12 = puVar4 + 1;
  *puVar4 = *(undefined4 *)(unaff_x19 + 0x1b8);
  if ((long)puVar3 - (long)puVar10 != 0) {
    uVar5 = ((long)puVar3 - (long)puVar10) - 4;
    puVar11 = puVar3;
    if ((0x3b < uVar5) && (0x3f < (ulong)((long)puVar3 + (-((long)puVar3 - (long)puVar10) - lVar1)))
       ) {
      uVar5 = (uVar5 >> 2) + 1;
      uVar7 = uVar5 & 0x7ffffffffffffff0;
      puVar11 = puVar3 + -uVar7;
      puVar4 = puVar4 + -uVar7;
      puVar8 = (undefined8 *)(puVar3 + -8);
      puVar9 = (undefined8 *)(lVar1 + lVar13 * 4 + -0x20);
      uVar2 = uVar7;
      do {
        uVar16 = *puVar8;
        uVar15 = puVar8[3];
        uVar14 = puVar8[2];
        uVar20 = puVar8[-3];
        uVar19 = puVar8[-4];
        uVar18 = puVar8[-1];
        uVar17 = puVar8[-2];
        puVar9[1] = puVar8[1];
        *puVar9 = uVar16;
        puVar9[3] = uVar15;
        puVar9[2] = uVar14;
        puVar9[-3] = uVar20;
        puVar9[-4] = uVar19;
        puVar9[-1] = uVar18;
        puVar9[-2] = uVar17;
        puVar8 = puVar8 + -8;
        puVar9 = puVar9 + -8;
        uVar2 = uVar2 - 0x10;
      } while (uVar2 != 0);
      if (uVar5 == uVar7) goto code_r0x006b272c;
    }
    do {
      puVar11 = puVar11 + -1;
      puVar4 = puVar4 + -1;
      *puVar4 = *puVar11;
    } while (puVar11 != puVar10);
  }
code_r0x006b272c:
  *(undefined4 **)(unaff_x19 + 0x40) = puVar4;
  *(undefined4 **)(unaff_x19 + 0x48) = puVar12;
  *(ulong *)(unaff_x19 + 0x50) = lVar1 + uVar6 * 4;
  if (puVar10 != (undefined4 *)0x0) {
    __ZdlPv(puVar10);
  }
LAB_006b2740:
  *(undefined4 **)(unaff_x19 + 0x48) = puVar12;
  return;
}

