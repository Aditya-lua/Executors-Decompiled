
void FUN_006897c8(undefined8 *param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  code *pcVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long *unaff_x19;
  undefined8 *puVar11;
  undefined8 *unaff_x21;
  undefined8 *puVar12;
  long unaff_x22;
  undefined8 *puVar13;
  undefined8 unaff_x24;
  long unaff_x25;
  undefined8 *puVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  
  do {
    puVar13 = (undefined8 *)((long)unaff_x21 + unaff_x22);
    unaff_x19[1] = (long)param_1;
    unaff_x19[2] = (long)puVar13;
    while( true ) {
      do {
        *puVar13 = unaff_x24;
        puVar13 = (undefined8 *)(unaff_x19[2] + 8);
        unaff_x19[2] = (long)puVar13;
        unaff_x25 = unaff_x25 + -1;
        if (unaff_x25 == 0) {
          return;
        }
        puVar14 = (undefined8 *)unaff_x19[1];
        puVar11 = puVar14 + 1;
        unaff_x24 = *puVar14;
        unaff_x19[1] = (long)puVar11;
      } while (puVar13 != (undefined8 *)unaff_x19[3]);
      puVar12 = (undefined8 *)*unaff_x19;
      if (puVar12 <= puVar11 && (long)puVar11 - (long)puVar12 != 0) break;
      uVar6 = (long)puVar13 - (long)puVar12 >> 2;
      if ((long)puVar13 - (long)puVar12 == 0) {
        uVar6 = 1;
      }
      if (uVar6 >> 0x3d != 0) {
        func_0x00017514();
        func_0x00017514();
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x68a048);
        (*pcVar3)();
      }
      lVar4 = __Znwm(uVar6 * 8);
      puVar1 = (undefined8 *)(lVar4 + (uVar6 >> 2) * 8);
      uVar2 = (long)puVar13 - (long)puVar11;
      puVar13 = puVar1;
      if (uVar2 != 0) {
        puVar13 = (undefined8 *)((long)puVar1 + (uVar2 & 0xfffffffffffffff8));
        if (uVar2 - 8 < 0x38) {
          puVar7 = puVar1;
        }
        else {
          lVar5 = (uVar6 >> 2) * 8;
          puVar7 = puVar1;
          if (0x3f < (ulong)((lVar5 + lVar4) - (long)puVar11)) {
            uVar2 = (uVar2 - 8 >> 3) + 1;
            uVar8 = uVar2 & 0x3ffffffffffffff8;
            puVar7 = puVar1 + uVar8;
            puVar11 = puVar11 + uVar8;
            puVar9 = (undefined8 *)(lVar4 + lVar5 + 0x20);
            puVar14 = puVar14 + 5;
            uVar10 = uVar8;
            do {
              uVar15 = puVar14[-4];
              uVar17 = puVar14[-1];
              uVar16 = puVar14[-2];
              uVar19 = puVar14[1];
              uVar18 = *puVar14;
              uVar21 = puVar14[3];
              uVar20 = puVar14[2];
              puVar9[-3] = puVar14[-3];
              puVar9[-4] = uVar15;
              puVar9[-1] = uVar17;
              puVar9[-2] = uVar16;
              puVar9[1] = uVar19;
              *puVar9 = uVar18;
              puVar9[3] = uVar21;
              puVar9[2] = uVar20;
              uVar10 = uVar10 - 8;
              puVar9 = puVar9 + 8;
              puVar14 = puVar14 + 8;
            } while (uVar10 != 0);
            if (uVar2 == uVar8) goto LAB_00689908;
          }
        }
        do {
          puVar14 = puVar7 + 1;
          *puVar7 = *puVar11;
          puVar7 = puVar14;
          puVar11 = puVar11 + 1;
        } while (puVar14 != puVar13);
      }
LAB_00689908:
      *unaff_x19 = lVar4;
      unaff_x19[1] = (long)puVar1;
      unaff_x19[2] = (long)puVar13;
      unaff_x19[3] = lVar4 + uVar6 * 8;
      if (puVar12 != (undefined8 *)0x0) {
        __ZdlPv(puVar12);
        puVar13 = (undefined8 *)unaff_x19[2];
      }
    }
    lVar5 = (long)puVar11 - (long)puVar12 >> 3;
    lVar4 = lVar5 + 2;
    if (-2 < lVar5) {
      lVar4 = lVar5 + 1;
    }
    unaff_x21 = puVar11 + -(lVar4 >> 1);
    unaff_x22 = (long)puVar13 - (long)puVar11;
    if (unaff_x22 != 0) {
      _memmove(unaff_x21,puVar11,unaff_x22);
      puVar13 = (undefined8 *)unaff_x19[1];
    }
    param_1 = puVar13 + -(lVar4 >> 1);
  } while( true );
}

