
void FUN_006c105c(long param_1)

{
  ulong *puVar1;
  byte bVar2;
  code *pcVar3;
  undefined8 uVar4;
  long lVar5;
  ulong *puVar6;
  ulong uVar7;
  long lVar8;
  long in_x9;
  undefined8 *puVar9;
  long in_x10;
  ulong uVar10;
  byte in_w11;
  ulong uVar11;
  ulong in_x12;
  ulong in_x13;
  undefined8 *puVar12;
  long in_x14;
  undefined8 *puVar13;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar14;
  ulong unaff_x21;
  long lVar15;
  undefined8 *puVar16;
  undefined8 *puVar17;
  long lVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  
code_r0x006c105c:
  if (param_1 != in_x10) {
    do {
      uVar10 = *(ulong *)(in_x9 + param_1 * 8);
      if (uVar10 != in_x12) {
        uVar11 = 0;
        uVar7 = uVar10 >> 4 ^ uVar10 >> 9;
        do {
          uVar7 = uVar7 & unaff_x20[0x12] - 1;
          puVar6 = (ulong *)(unaff_x20[0x11] + uVar7 * in_x14);
          if (*puVar6 == uVar10) goto code_r0x006c1020;
          if (*puVar6 == in_x12) break;
          uVar11 = uVar11 + 1;
          uVar7 = uVar11 + uVar7;
        } while (uVar11 <= unaff_x20[0x12] - 1);
      }
      puVar6 = (ulong *)0x0;
code_r0x006c1020:
      puVar1 = (ulong *)0x0;
      if (puVar6 != (ulong *)0x0) {
        puVar1 = puVar6 + 1;
      }
      if (*(byte *)((long)puVar1 + 2) != 0) goto code_r0x006c1044;
      param_1 = param_1 + 1;
      if (param_1 == in_x10) {
        if ((in_x13 & 1) != 0) break;
        goto code_r0x006c1084;
      }
    } while( true );
  }
  func_0x006b1ccc(*unaff_x20,0xb,in_w11,0,0);
code_r0x006c1084:
  if (cRam0000000000a33610 == '\0') {
    if ((unaff_x21 & 1) != 0) goto LAB_006c132c;
    uVar4 = func_0x006b2784(*unaff_x20);
    func_0x006b1f78(*unaff_x20,0x17,0,0);
    lVar15 = unaff_x20[0xa1];
    puVar12 = *(undefined8 **)(lVar15 + -0x10);
    if (puVar12 < *(undefined8 **)(lVar15 + -8)) goto LAB_006c1160;
    puVar14 = *(undefined8 **)(lVar15 + -0x18);
    lVar18 = (long)puVar12 - (long)puVar14 >> 3;
    uVar10 = lVar18 + 1;
    if (uVar10 >> 0x3d != 0) {
      func_0x00017f90();
      goto code_r0x006c1398;
    }
    uVar7 = (long)*(undefined8 **)(lVar15 + -8) - (long)puVar14;
    uVar11 = (long)uVar7 >> 2;
    if (uVar11 <= uVar10) {
      uVar11 = uVar10;
    }
    if (0x7ffffffffffffff7 < uVar7) {
      uVar11 = 0x1fffffffffffffff;
    }
    if (uVar11 == 0) {
      lVar5 = 0;
      puVar9 = (undefined8 *)(lVar18 * 8);
      lVar8 = 0;
      *puVar9 = uVar4;
    }
    else {
      if (uVar11 >> 0x3d != 0) {
        func_0x00017514();
        goto code_r0x006c1398;
      }
      lVar5 = __Znwm(uVar11 << 3);
      puVar9 = (undefined8 *)(lVar5 + lVar18 * 8);
      lVar8 = lVar5 + uVar11 * 8;
      *puVar9 = uVar4;
    }
    puVar17 = puVar9 + 1;
    if ((long)puVar12 - (long)puVar14 != 0) {
      uVar10 = ((long)puVar12 - (long)puVar14) - 8;
      puVar16 = puVar12;
      if ((0x57 < uVar10) &&
         (0x3f < (ulong)((long)puVar12 + (-((long)puVar12 - (long)puVar14) - lVar5)))) {
        uVar10 = (uVar10 >> 3) + 1;
        uVar7 = uVar10 & 0x3ffffffffffffff8;
        puVar16 = puVar12 + -uVar7;
        puVar9 = puVar9 + -uVar7;
        puVar12 = puVar12 + -4;
        puVar13 = (undefined8 *)(lVar5 + lVar18 * 8 + -0x20);
        uVar11 = uVar7;
        do {
          uVar20 = *puVar12;
          uVar19 = puVar12[3];
          uVar4 = puVar12[2];
          uVar24 = puVar12[-3];
          uVar23 = puVar12[-4];
          uVar22 = puVar12[-1];
          uVar21 = puVar12[-2];
          puVar13[1] = puVar12[1];
          *puVar13 = uVar20;
          puVar13[3] = uVar19;
          puVar13[2] = uVar4;
          puVar13[-3] = uVar24;
          puVar13[-4] = uVar23;
          puVar13[-1] = uVar22;
          puVar13[-2] = uVar21;
          puVar12 = puVar12 + -8;
          puVar13 = puVar13 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar10 == uVar7) goto LAB_006c1314;
      }
      do {
        puVar16 = puVar16 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar16;
      } while (puVar16 != puVar14);
    }
    goto LAB_006c1314;
  }
  uVar4 = func_0x006b2784(*unaff_x20);
  func_0x006b1f78(*unaff_x20,0x17,0,0);
  lVar15 = unaff_x20[0xa1];
  puVar12 = *(undefined8 **)(lVar15 + -0x10);
  if (puVar12 < *(undefined8 **)(lVar15 + -8)) {
LAB_006c1160:
    puVar17 = puVar12 + 1;
    *puVar12 = uVar4;
  }
  else {
    puVar14 = *(undefined8 **)(lVar15 + -0x18);
    lVar18 = (long)puVar12 - (long)puVar14 >> 3;
    uVar10 = lVar18 + 1;
    if (uVar10 >> 0x3d != 0) {
      func_0x00017f90();
code_r0x006c1398:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x6c139c);
      (*pcVar3)();
    }
    uVar7 = (long)*(undefined8 **)(lVar15 + -8) - (long)puVar14;
    uVar11 = (long)uVar7 >> 2;
    if (uVar11 <= uVar10) {
      uVar11 = uVar10;
    }
    if (0x7ffffffffffffff7 < uVar7) {
      uVar11 = 0x1fffffffffffffff;
    }
    if (uVar11 == 0) {
      lVar5 = 0;
      puVar9 = (undefined8 *)(lVar18 * 8);
      lVar8 = 0;
      *puVar9 = uVar4;
    }
    else {
      if (uVar11 >> 0x3d != 0) {
        func_0x00017514();
        goto code_r0x006c1398;
      }
      lVar5 = __Znwm(uVar11 << 3);
      puVar9 = (undefined8 *)(lVar5 + lVar18 * 8);
      lVar8 = lVar5 + uVar11 * 8;
      *puVar9 = uVar4;
    }
    puVar17 = puVar9 + 1;
    if ((long)puVar12 - (long)puVar14 != 0) {
      uVar10 = ((long)puVar12 - (long)puVar14) - 8;
      puVar16 = puVar12;
      if ((0x57 < uVar10) &&
         (0x3f < (ulong)((long)puVar12 + (-((long)puVar12 - (long)puVar14) - lVar5)))) {
        uVar10 = (uVar10 >> 3) + 1;
        uVar7 = uVar10 & 0x3ffffffffffffff8;
        puVar16 = puVar12 + -uVar7;
        puVar9 = puVar9 + -uVar7;
        puVar12 = puVar12 + -4;
        puVar13 = (undefined8 *)(lVar5 + lVar18 * 8 + -0x20);
        uVar11 = uVar7;
        do {
          uVar20 = *puVar12;
          uVar19 = puVar12[3];
          uVar4 = puVar12[2];
          uVar24 = puVar12[-3];
          uVar23 = puVar12[-4];
          uVar22 = puVar12[-1];
          uVar21 = puVar12[-2];
          puVar13[1] = puVar12[1];
          *puVar13 = uVar20;
          puVar13[3] = uVar19;
          puVar13[2] = uVar4;
          puVar13[-3] = uVar24;
          puVar13[-4] = uVar23;
          puVar13[-1] = uVar22;
          puVar13[-2] = uVar21;
          puVar12 = puVar12 + -8;
          puVar13 = puVar13 + -8;
          uVar11 = uVar11 - 8;
        } while (uVar11 != 0);
        if (uVar10 == uVar7) goto LAB_006c1314;
      }
      do {
        puVar16 = puVar16 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar16;
      } while (puVar16 != puVar14);
    }
LAB_006c1314:
    *(undefined8 **)(lVar15 + -0x18) = puVar9;
    *(undefined8 **)(lVar15 + -0x10) = puVar17;
    *(long *)(lVar15 + -8) = lVar8;
    if (puVar14 != (undefined8 *)0x0) {
      __ZdlPv(puVar14);
    }
  }
  *(undefined8 **)(lVar15 + -0x10) = puVar17;
LAB_006c132c:
  if (unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
code_r0x006c1044:
  bVar2 = (byte)*puVar1;
  if (in_w11 <= (byte)*puVar1) {
    bVar2 = in_w11;
  }
  in_w11 = bVar2;
  param_1 = param_1 + 1;
  in_x13 = 1;
  goto code_r0x006c105c;
}

