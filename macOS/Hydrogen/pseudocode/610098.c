
void FUN_00610098(long param_1)

{
  undefined4 *puVar1;
  code *pcVar2;
  undefined4 *puVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  undefined4 *puVar7;
  undefined4 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined8 *unaff_x19;
  long lVar12;
  undefined4 unaff_w21;
  undefined4 *puVar13;
  long lVar14;
  long lVar15;
  undefined8 unaff_x25;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined4 *puStack0000000000000010;
  undefined4 *puStack0000000000000018;
  
  puStack0000000000000010 = (undefined4 *)0x0;
  puStack0000000000000018 = (undefined4 *)0x0;
  lVar14 = *(long *)(param_1 + 8);
  lVar15 = *(long *)(param_1 + 0x10) - lVar14;
  if (lVar15 == 0) {
    puVar3 = (undefined4 *)0x0;
    uVar5 = 0;
    lVar14 = 0;
    uVar6 = 1;
  }
  else {
    if (lVar15 < 0) {
      func_0x00017f90();
      goto LAB_006102b0;
    }
    puVar3 = (undefined4 *)__Znwm(lVar15);
    puVar1 = puVar3 + (lVar15 >> 2);
    puStack0000000000000018 = puVar1;
    _memcpy(puVar3,lVar14,lVar15);
    uVar5 = (long)puVar1 - (long)puVar3;
    lVar14 = (long)uVar5 >> 2;
    uVar6 = lVar14 + 1;
    puStack0000000000000010 = puVar1;
    if (uVar6 >> 0x3e != 0) {
      func_0x00017f90();
      goto LAB_006102b0;
    }
  }
  puVar1 = puStack0000000000000010;
  uVar9 = (long)uVar5 >> 1;
  if ((ulong)((long)uVar5 >> 1) <= uVar6) {
    uVar9 = uVar6;
  }
  if (0x7ffffffffffffffb < uVar5) {
    uVar9 = 0x3fffffffffffffff;
  }
  if (uVar9 == 0) {
    lVar4 = 0;
    puVar7 = (undefined4 *)(lVar14 * 4);
    puStack0000000000000018 = (undefined4 *)0x0;
    puVar13 = puVar7 + 1;
    *puVar7 = unaff_w21;
    lVar15 = (long)puStack0000000000000010 - (long)puVar3;
    if (lVar15 != 0) goto LAB_00610134;
LAB_00610190:
    lVar15 = 0;
  }
  else {
    if (uVar9 >> 0x3e != 0) {
      func_0x00017514();
      goto LAB_006102b0;
    }
    lVar4 = __Znwm(uVar9 << 2);
    puVar7 = (undefined4 *)(lVar4 + lVar14 * 4);
    puStack0000000000000018 = (undefined4 *)(lVar4 + uVar9 * 4);
    puVar13 = puVar7 + 1;
    *puVar7 = unaff_w21;
    lVar15 = (long)puVar1 - (long)puVar3;
    if (lVar15 == 0) goto LAB_00610190;
LAB_00610134:
    if (lVar15 - 4U < 0x3c) {
      lVar15 = 0;
      puVar8 = puVar1;
    }
    else {
      uVar6 = (lVar15 - 4U >> 2) + 1;
      uVar9 = uVar6 & 0x7ffffffffffffff0;
      puVar8 = puVar1 + -uVar9;
      lVar15 = -uVar9;
      puVar10 = (undefined8 *)(puVar1 + -8);
      puVar11 = (undefined8 *)(lVar4 + lVar14 * 4 + -0x20);
      uVar5 = uVar9;
      do {
        uVar18 = *puVar10;
        uVar17 = puVar10[3];
        uVar16 = puVar10[2];
        uVar22 = puVar10[-3];
        uVar21 = puVar10[-4];
        uVar20 = puVar10[-1];
        uVar19 = puVar10[-2];
        puVar11[1] = puVar10[1];
        *puVar11 = uVar18;
        puVar11[3] = uVar17;
        puVar11[2] = uVar16;
        puVar11[-3] = uVar22;
        puVar11[-4] = uVar21;
        puVar11[-1] = uVar20;
        puVar11[-2] = uVar19;
        puVar10 = puVar10 + -8;
        puVar11 = puVar11 + -8;
        uVar5 = uVar5 - 0x10;
      } while (uVar5 != 0);
      if (uVar6 == uVar9) goto LAB_00610208;
    }
    lVar12 = lVar15;
    do {
      puVar8 = puVar8 + -1;
      lVar15 = lVar12 + -1;
      *(undefined4 *)(lVar4 + lVar14 * 4 + -4 + lVar12 * 4) = *puVar8;
      lVar12 = lVar15;
    } while (puVar8 != puVar3);
  }
LAB_00610208:
  if (puVar3 != (undefined4 *)0x0) {
    __ZdlPv(puVar3);
  }
  *unaff_x19 = unaff_x25;
  unaff_x19[1] = 0;
  unaff_x19[2] = 0;
  unaff_x19[3] = 0;
  puStack0000000000000010 = puVar13;
  if (lVar15 != 1) {
    if (1 < lVar15) {
      func_0x00017f90(unaff_x19 + 1);
LAB_006102b0:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x6102b4);
      (*pcVar2)();
    }
    lVar12 = lVar15 * -4 + 4;
    lVar4 = __Znwm(lVar12);
    unaff_x19[1] = lVar4;
    lVar14 = lVar4 + (lVar12 >> 2) * 4;
    unaff_x19[3] = lVar14;
    _memcpy(lVar4,puVar7 + lVar15,lVar12);
    unaff_x19[2] = lVar14;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(puVar7 + lVar15);
  return;
}

