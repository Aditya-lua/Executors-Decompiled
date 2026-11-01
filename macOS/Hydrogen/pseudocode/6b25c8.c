
void FUN_006b25c8(undefined8 param_1)

{
  undefined4 *puVar1;
  long lVar2;
  ulong uVar3;
  undefined4 *in_x9;
  undefined4 *puVar4;
  long in_x10;
  ulong uVar5;
  long in_x11;
  ulong uVar6;
  ulong uVar7;
  undefined8 *in_x12;
  undefined8 *in_x13;
  undefined8 *puVar8;
  long lVar9;
  undefined8 *puVar10;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *puVar11;
  undefined4 *puVar12;
  undefined4 *unaff_x22;
  undefined4 *puVar13;
  undefined8 unaff_x23;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  lVar9 = in_x11;
  do {
    uVar16 = *in_x12;
    uVar15 = in_x12[3];
    uVar14 = in_x12[2];
    uVar20 = in_x12[-3];
    uVar19 = in_x12[-4];
    uVar18 = in_x12[-1];
    uVar17 = in_x12[-2];
    in_x13[1] = in_x12[1];
    *in_x13 = uVar16;
    in_x13[3] = uVar15;
    in_x13[2] = uVar14;
    in_x13[-3] = uVar20;
    in_x13[-4] = uVar19;
    in_x13[-1] = uVar18;
    in_x13[-2] = uVar17;
    in_x12 = in_x12 + -8;
    in_x13 = in_x13 + -8;
    lVar9 = lVar9 + -0x10;
  } while (lVar9 != 0);
  if (in_x10 != in_x11) {
    do {
      unaff_x22 = unaff_x22 + -1;
      in_x9 = in_x9 + -1;
      *in_x9 = *unaff_x22;
    } while (unaff_x22 != unaff_x20);
  }
  *(undefined4 **)(unaff_x19 + 0x28) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x30) = unaff_x23;
  *(undefined8 *)(unaff_x19 + 0x38) = param_1;
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x30) = unaff_x23;
  puVar1 = *(undefined4 **)(unaff_x19 + 0x48);
  if (puVar1 < *(undefined4 **)(unaff_x19 + 0x50)) {
    puVar13 = puVar1 + 1;
    *puVar1 = *(undefined4 *)(unaff_x19 + 0x1b8);
    goto LAB_006b2740;
  }
  puVar11 = *(undefined4 **)(unaff_x19 + 0x40);
  lVar9 = (long)puVar1 - (long)puVar11 >> 2;
  uVar5 = lVar9 + 1;
  if (uVar5 >> 0x3e != 0) {
LAB_006b2764:
    lVar9 = func_0x00017f90();
    *(long *)(lVar9 + 0x30) = *(long *)(lVar9 + 0x30) + -4;
    *(long *)(lVar9 + 0x48) = *(long *)(lVar9 + 0x48) + -4;
    return;
  }
  uVar3 = (long)*(undefined4 **)(unaff_x19 + 0x50) - (long)puVar11;
  uVar6 = (long)uVar3 >> 1;
  if (uVar6 <= uVar5) {
    uVar6 = uVar5;
  }
  if (0x7ffffffffffffffb < uVar3) {
    uVar6 = 0x3fffffffffffffff;
  }
  if (uVar6 == 0) {
    lVar2 = 0;
  }
  else {
    if (uVar6 >> 0x3e != 0) {
      func_0x00017514();
      func_0x00017f90();
      goto LAB_006b2764;
    }
    lVar2 = __Znwm(uVar6 << 2);
  }
  puVar4 = (undefined4 *)(lVar2 + lVar9 * 4);
  puVar13 = puVar4 + 1;
  *puVar4 = *(undefined4 *)(unaff_x19 + 0x1b8);
  if ((long)puVar1 - (long)puVar11 != 0) {
    uVar5 = ((long)puVar1 - (long)puVar11) - 4;
    puVar12 = puVar1;
    if ((0x3b < uVar5) && (0x3f < (ulong)((long)puVar1 + (-((long)puVar1 - (long)puVar11) - lVar2)))
       ) {
      uVar5 = (uVar5 >> 2) + 1;
      uVar7 = uVar5 & 0x7ffffffffffffff0;
      puVar12 = puVar1 + -uVar7;
      puVar4 = puVar4 + -uVar7;
      puVar8 = (undefined8 *)(puVar1 + -8);
      puVar10 = (undefined8 *)(lVar2 + lVar9 * 4 + -0x20);
      uVar3 = uVar7;
      do {
        uVar16 = *puVar8;
        uVar15 = puVar8[3];
        uVar14 = puVar8[2];
        uVar20 = puVar8[-3];
        uVar19 = puVar8[-4];
        uVar18 = puVar8[-1];
        uVar17 = puVar8[-2];
        puVar10[1] = puVar8[1];
        *puVar10 = uVar16;
        puVar10[3] = uVar15;
        puVar10[2] = uVar14;
        puVar10[-3] = uVar20;
        puVar10[-4] = uVar19;
        puVar10[-1] = uVar18;
        puVar10[-2] = uVar17;
        puVar8 = puVar8 + -8;
        puVar10 = puVar10 + -8;
        uVar3 = uVar3 - 0x10;
      } while (uVar3 != 0);
      if (uVar5 == uVar7) goto code_r0x006b272c;
    }
    do {
      puVar12 = puVar12 + -1;
      puVar4 = puVar4 + -1;
      *puVar4 = *puVar12;
    } while (puVar12 != puVar11);
  }
code_r0x006b272c:
  *(undefined4 **)(unaff_x19 + 0x40) = puVar4;
  *(undefined4 **)(unaff_x19 + 0x48) = puVar13;
  *(ulong *)(unaff_x19 + 0x50) = lVar2 + uVar6 * 4;
  if (puVar11 != (undefined4 *)0x0) {
    __ZdlPv(puVar11);
  }
LAB_006b2740:
  *(undefined4 **)(unaff_x19 + 0x48) = puVar13;
  return;
}

