
void FUN_00036394(void)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  ulong uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  do {
    while( true ) {
      while( true ) {
        puVar6 = unaff_x24 + 1;
        puVar9 = unaff_x25 + 1;
        *unaff_x25 = *unaff_x24;
        if (puVar6 == (undefined8 *)unaff_x19[2]) {
          lVar3 = *unaff_x19;
          *unaff_x19 = (long)unaff_x20;
          unaff_x19[1] = (long)unaff_x23;
          unaff_x19[2] = (long)puVar9;
          unaff_x19[3] = (long)unaff_x26;
          if ((long)puVar9 - (long)unaff_x23 == 8) {
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
        unaff_x24 = puVar6;
        if (puVar9 == unaff_x26) break;
        unaff_x25 = puVar9;
      }
      if (unaff_x23 < unaff_x20 || (long)unaff_x23 - (long)unaff_x20 == 0) break;
      lVar5 = (long)unaff_x23 - (long)unaff_x20 >> 3;
      lVar3 = lVar5 + 2;
      if (-2 < lVar5) {
        lVar3 = lVar5 + 1;
      }
      puVar4 = unaff_x23 + -(lVar3 >> 1);
      lVar5 = (long)puVar9 - (long)unaff_x23;
      puVar6 = puVar9;
      if (lVar5 != 0) {
        _memmove(puVar4,unaff_x23,lVar5);
        puVar6 = unaff_x23;
      }
      unaff_x23 = puVar6 + -(lVar3 >> 1);
      unaff_x25 = (undefined8 *)((long)puVar4 + lVar5);
      unaff_x26 = puVar9;
    }
    uVar7 = (long)puVar9 - (long)unaff_x20 >> 2;
    if ((long)puVar9 - (long)unaff_x20 == 0) {
      uVar7 = 1;
    }
    if (uVar7 >> 0x3d != 0) {
      func_0x00017514();
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x3651c);
      (*pcVar2)();
    }
    puVar4 = (undefined8 *)__Znwm(uVar7 << 3);
    uVar8 = uVar7 >> 2;
    puVar6 = puVar4 + uVar8;
    uVar1 = (long)puVar9 - (long)unaff_x23;
    unaff_x25 = puVar6;
    if (uVar1 != 0) {
      unaff_x25 = (undefined8 *)((long)puVar6 + (uVar1 & 0xfffffffffffffff8));
      if ((uVar1 - 8 < 0x38) || ((long)puVar4 + (uVar8 * 8 - (long)unaff_x23) < 0x40)) {
        puVar9 = puVar6;
        puVar10 = unaff_x23;
      }
      else {
        uVar1 = (uVar1 - 8 >> 3) + 1;
        uVar11 = uVar1 & 0x3ffffffffffffff8;
        puVar9 = puVar6 + uVar11;
        puVar10 = unaff_x23 + uVar11;
        puVar12 = puVar4 + uVar8 + 4;
        puVar13 = unaff_x23 + 4;
        uVar8 = uVar11;
        do {
          uVar14 = puVar13[-4];
          uVar16 = puVar13[-1];
          uVar15 = puVar13[-2];
          uVar18 = puVar13[1];
          uVar17 = *puVar13;
          uVar20 = puVar13[3];
          uVar19 = puVar13[2];
          puVar12[-3] = puVar13[-3];
          puVar12[-4] = uVar14;
          puVar12[-1] = uVar16;
          puVar12[-2] = uVar15;
          puVar12[1] = uVar18;
          *puVar12 = uVar17;
          puVar12[3] = uVar20;
          puVar12[2] = uVar19;
          uVar8 = uVar8 - 8;
          puVar12 = puVar12 + 8;
          puVar13 = puVar13 + 8;
        } while (uVar8 != 0);
        if (uVar1 == uVar11) goto LAB_00036480;
      }
      do {
        puVar12 = puVar9 + 1;
        *puVar9 = *puVar10;
        puVar9 = puVar12;
        puVar10 = puVar10 + 1;
      } while (puVar12 != unaff_x25);
    }
LAB_00036480:
    unaff_x26 = puVar4 + uVar7;
    if (unaff_x20 != (undefined8 *)0x0) {
      __ZdlPv(unaff_x20);
    }
    unaff_x20 = puVar4;
    unaff_x23 = puVar6;
  } while( true );
}

