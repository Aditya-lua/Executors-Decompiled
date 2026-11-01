
void FUN_0068a350(void)

{
  undefined8 *puVar1;
  ulong uVar2;
  code *pcVar3;
  undefined1 in_ZR;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar11;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  undefined8 *puVar12;
  long unaff_x26;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  do {
    if (!(bool)in_ZR) {
      _memmove(unaff_x21,unaff_x20,unaff_x22);
      unaff_x23 = (undefined8 *)unaff_x19[1];
    }
    puVar12 = unaff_x23 + -unaff_x26;
    unaff_x23 = (undefined8 *)((long)unaff_x21 + unaff_x22);
    unaff_x19[1] = (long)puVar12;
    unaff_x19[2] = (long)unaff_x23;
    while( true ) {
      do {
        *unaff_x23 = unaff_x24;
        unaff_x23 = (undefined8 *)(unaff_x19[2] + 8);
        unaff_x19[2] = (long)unaff_x23;
        unaff_x25 = unaff_x25 + -1;
        if (unaff_x25 == 0) {
          return;
        }
        puVar12 = (undefined8 *)unaff_x19[1];
        unaff_x20 = puVar12 + 1;
        unaff_x24 = *puVar12;
        unaff_x19[1] = (long)unaff_x20;
      } while (unaff_x23 != (undefined8 *)unaff_x19[3]);
      puVar11 = (undefined8 *)*unaff_x19;
      if (puVar11 <= unaff_x20 && (long)unaff_x20 - (long)puVar11 != 0) break;
      uVar6 = (long)unaff_x23 - (long)puVar11 >> 2;
      if ((long)unaff_x23 - (long)puVar11 == 0) {
        uVar6 = 1;
      }
      if (uVar6 >> 0x3d != 0) {
        func_0x00017514();
        func_0x00017514();
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x68ab6c);
        (*pcVar3)();
      }
      lVar4 = __Znwm(uVar6 * 8);
      puVar1 = (undefined8 *)(lVar4 + (uVar6 >> 2) * 8);
      uVar2 = (long)unaff_x23 - (long)unaff_x20;
      unaff_x23 = puVar1;
      if (uVar2 != 0) {
        unaff_x23 = (undefined8 *)((long)puVar1 + (uVar2 & 0xfffffffffffffff8));
        if (uVar2 - 8 < 0x38) {
          puVar7 = puVar1;
        }
        else {
          lVar5 = (uVar6 >> 2) * 8;
          puVar7 = puVar1;
          if (0x3f < (ulong)((lVar5 + lVar4) - (long)unaff_x20)) {
            uVar2 = (uVar2 - 8 >> 3) + 1;
            uVar8 = uVar2 & 0x3ffffffffffffff8;
            puVar7 = puVar1 + uVar8;
            unaff_x20 = unaff_x20 + uVar8;
            puVar9 = (undefined8 *)(lVar4 + lVar5 + 0x20);
            puVar12 = puVar12 + 5;
            uVar10 = uVar8;
            do {
              uVar13 = puVar12[-4];
              uVar15 = puVar12[-1];
              uVar14 = puVar12[-2];
              uVar17 = puVar12[1];
              uVar16 = *puVar12;
              uVar19 = puVar12[3];
              uVar18 = puVar12[2];
              puVar9[-3] = puVar12[-3];
              puVar9[-4] = uVar13;
              puVar9[-1] = uVar15;
              puVar9[-2] = uVar14;
              puVar9[1] = uVar17;
              *puVar9 = uVar16;
              puVar9[3] = uVar19;
              puVar9[2] = uVar18;
              uVar10 = uVar10 - 8;
              puVar9 = puVar9 + 8;
              puVar12 = puVar12 + 8;
            } while (uVar10 != 0);
            if (uVar2 == uVar8) goto LAB_0068a42c;
          }
        }
        do {
          puVar12 = puVar7 + 1;
          *puVar7 = *unaff_x20;
          puVar7 = puVar12;
          unaff_x20 = unaff_x20 + 1;
        } while (puVar12 != unaff_x23);
      }
LAB_0068a42c:
      *unaff_x19 = lVar4;
      unaff_x19[1] = (long)puVar1;
      unaff_x19[2] = (long)unaff_x23;
      unaff_x19[3] = lVar4 + uVar6 * 8;
      if (puVar11 != (undefined8 *)0x0) {
        __ZdlPv(puVar11);
        unaff_x23 = (undefined8 *)unaff_x19[2];
      }
    }
    lVar5 = (long)unaff_x20 - (long)puVar11 >> 3;
    lVar4 = lVar5 + 2;
    if (-2 < lVar5) {
      lVar4 = lVar5 + 1;
    }
    unaff_x26 = lVar4 >> 1;
    unaff_x21 = unaff_x20 + -unaff_x26;
    unaff_x22 = (long)unaff_x23 - (long)unaff_x20;
    in_ZR = unaff_x22 == 0;
  } while( true );
}

