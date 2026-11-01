
void FUN_00036444(ulong param_1)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong in_x9;
  undefined8 *puVar7;
  ulong in_x10;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar12;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar13;
  undefined8 *unaff_x24;
  ulong unaff_x27;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  do {
    puVar5 = (undefined8 *)((long)unaff_x23 + in_x10);
    puVar12 = unaff_x20;
    puVar13 = unaff_x24;
    if ((in_x9 - 8 < 0x38) || ((long)unaff_x22 + (param_1 * 8 - (long)unaff_x21) < 0x40)) {
      puVar6 = unaff_x23;
      puVar7 = unaff_x21;
LAB_00036470:
      do {
        puVar9 = puVar6 + 1;
        *puVar6 = *puVar7;
        puVar6 = puVar9;
        puVar7 = puVar7 + 1;
      } while (puVar9 != puVar5);
    }
    else {
      uVar1 = (in_x9 - 8 >> 3) + 1;
      uVar8 = uVar1 & 0x3ffffffffffffff8;
      puVar6 = unaff_x23 + uVar8;
      puVar7 = unaff_x21 + uVar8;
      puVar9 = unaff_x22 + param_1 + 4;
      puVar10 = unaff_x21 + 4;
      uVar11 = uVar8;
      do {
        uVar14 = puVar10[-4];
        uVar16 = puVar10[-1];
        uVar15 = puVar10[-2];
        uVar18 = puVar10[1];
        uVar17 = *puVar10;
        uVar20 = puVar10[3];
        uVar19 = puVar10[2];
        puVar9[-3] = puVar10[-3];
        puVar9[-4] = uVar14;
        puVar9[-1] = uVar16;
        puVar9[-2] = uVar15;
        puVar9[1] = uVar18;
        *puVar9 = uVar17;
        puVar9[3] = uVar20;
        puVar9[2] = uVar19;
        uVar11 = uVar11 - 8;
        puVar9 = puVar9 + 8;
        puVar10 = puVar10 + 8;
      } while (uVar11 != 0);
      if (uVar1 != uVar8) goto LAB_00036470;
    }
    do {
      unaff_x20 = unaff_x22;
      puVar6 = unaff_x20 + unaff_x27;
      unaff_x21 = unaff_x23;
      if (puVar12 != (undefined8 *)0x0) {
        __ZdlPv(puVar12);
      }
      while( true ) {
        while( true ) {
          unaff_x24 = puVar13 + 1;
          puVar12 = puVar5 + 1;
          *puVar5 = *puVar13;
          if (unaff_x24 == (undefined8 *)unaff_x19[2]) {
            lVar3 = *unaff_x19;
            *unaff_x19 = (long)unaff_x20;
            unaff_x19[1] = (long)unaff_x21;
            unaff_x19[2] = (long)puVar12;
            unaff_x19[3] = (long)puVar6;
            if ((long)puVar12 - (long)unaff_x21 == 8) {
              unaff_x19[4] = 0x15;
            }
            else {
              unaff_x19[4] = unaff_x19[4] + 0x2a;
            }
            if (lVar3 == 0) {
              return;
            }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)PTR___ZdlPv_009b01b8)();
            return;
          }
          puVar13 = unaff_x24;
          if (puVar12 == puVar6) break;
          puVar5 = puVar12;
        }
        if (unaff_x21 < unaff_x20 || (long)unaff_x21 - (long)unaff_x20 == 0) break;
        lVar4 = (long)unaff_x21 - (long)unaff_x20 >> 3;
        lVar3 = lVar4 + 2;
        if (-2 < lVar4) {
          lVar3 = lVar4 + 1;
        }
        puVar6 = unaff_x21 + -(lVar3 >> 1);
        lVar4 = (long)puVar12 - (long)unaff_x21;
        puVar5 = puVar12;
        if (lVar4 != 0) {
          _memmove(puVar6,unaff_x21,lVar4);
          puVar5 = unaff_x21;
        }
        unaff_x21 = puVar5 + -(lVar3 >> 1);
        puVar5 = (undefined8 *)((long)puVar6 + lVar4);
        puVar6 = puVar12;
      }
      unaff_x27 = (long)puVar12 - (long)unaff_x20 >> 2;
      if ((long)puVar12 - (long)unaff_x20 == 0) {
        unaff_x27 = 1;
      }
      if (unaff_x27 >> 0x3d != 0) {
        func_0x00017514();
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x3651c);
        (*pcVar2)();
      }
      unaff_x22 = (undefined8 *)__Znwm(unaff_x27 << 3);
      param_1 = unaff_x27 >> 2;
      unaff_x23 = unaff_x22 + param_1;
      in_x9 = (long)puVar12 - (long)unaff_x21;
      puVar12 = unaff_x20;
      puVar5 = unaff_x23;
    } while (in_x9 == 0);
    in_x10 = in_x9 & 0xfffffffffffffff8;
  } while( true );
}

