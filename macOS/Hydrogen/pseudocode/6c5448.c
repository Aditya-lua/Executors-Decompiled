
void FUN_006c5448(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  code *pcVar3;
  long lVar4;
  ulong in_x9;
  undefined8 *puVar5;
  long in_x10;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  undefined8 *unaff_x23;
  undefined8 *puVar11;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  if (in_x10 != 0) {
    func_0x00017f90();
LAB_006c5940:
    func_0x00017514();
    func_0x00017f90();
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x6c5958);
    (*pcVar3)();
  }
  uVar6 = param_1 - (long)unaff_x20 >> 2;
  if (uVar6 <= in_x9) {
    uVar6 = in_x9;
  }
  if (0x7ffffffffffffff7 < (ulong)(param_1 - (long)unaff_x20)) {
    uVar6 = 0x1fffffffffffffff;
  }
  if (uVar6 == 0) {
    lVar4 = 0;
    puVar5 = (undefined8 *)(unaff_x24 * 8);
    lVar1 = 0;
    *puVar5 = unaff_x21;
  }
  else {
    if (uVar6 >> 0x3d != 0) goto LAB_006c5940;
    lVar4 = __Znwm(uVar6 << 3);
    puVar5 = (undefined8 *)(lVar4 + unaff_x24 * 8);
    lVar1 = lVar4 + uVar6 * 8;
    *puVar5 = unaff_x21;
  }
  puVar2 = puVar5 + 1;
  if ((long)unaff_x23 - (long)unaff_x20 != 0) {
    uVar6 = ((long)unaff_x23 - (long)unaff_x20) - 8;
    puVar11 = unaff_x23;
    if ((0x57 < uVar6) && (0x3f < (ulong)((long)unaff_x23 + (-unaff_x25 - lVar4)))) {
      uVar6 = (uVar6 >> 3) + 1;
      uVar7 = uVar6 & 0x3ffffffffffffff8;
      puVar11 = unaff_x23 + -uVar7;
      puVar5 = puVar5 + -uVar7;
      puVar8 = unaff_x23 + -4;
      puVar9 = (undefined8 *)(lVar4 + unaff_x24 * 8 + -0x20);
      uVar10 = uVar7;
      do {
        uVar14 = *puVar8;
        uVar13 = puVar8[3];
        uVar12 = puVar8[2];
        uVar18 = puVar8[-3];
        uVar17 = puVar8[-4];
        uVar16 = puVar8[-1];
        uVar15 = puVar8[-2];
        puVar9[1] = puVar8[1];
        *puVar9 = uVar14;
        puVar9[3] = uVar13;
        puVar9[2] = uVar12;
        puVar9[-3] = uVar18;
        puVar9[-4] = uVar17;
        puVar9[-1] = uVar16;
        puVar9[-2] = uVar15;
        puVar8 = puVar8 + -8;
        puVar9 = puVar9 + -8;
        uVar10 = uVar10 - 8;
      } while (uVar10 != 0);
      if (uVar6 == uVar7) goto LAB_006c5690;
    }
    do {
      puVar11 = puVar11 + -1;
      puVar5 = puVar5 + -1;
      *puVar5 = *puVar11;
    } while (puVar11 != unaff_x20);
  }
LAB_006c5690:
  *unaff_x19 = (long)puVar5;
  unaff_x19[1] = (long)puVar2;
  unaff_x19[2] = lVar1;
  if (unaff_x20 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  unaff_x19[1] = (long)puVar2;
  return;
}

