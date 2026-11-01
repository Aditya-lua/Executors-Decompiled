
void FUN_0068aedc(void)

{
  undefined8 *puVar1;
  ulong uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  ulong uVar9;
  long *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 *puVar10;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  do {
    if (unaff_x25 >> 0x3d != 0) {
      func_0x00017514();
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x68b0e8);
      (*pcVar3)();
    }
    puVar4 = (undefined8 *)__Znwm(unaff_x25 << 3);
    uVar8 = unaff_x25 + 3 >> 2;
    puVar1 = puVar4 + uVar8;
    uVar2 = (long)unaff_x23 - (long)unaff_x21;
    unaff_x23 = puVar1;
    if (uVar2 != 0) {
      unaff_x23 = (undefined8 *)((long)puVar1 + (uVar2 & 0xfffffffffffffff8));
      puVar6 = puVar1;
      puVar10 = unaff_x21;
      if ((0x37 < uVar2 - 8) && (0x3f < (long)puVar4 + (uVar8 * 8 - (long)unaff_x21))) {
        uVar2 = (uVar2 - 8 >> 3) + 1;
        uVar9 = uVar2 & 0x3ffffffffffffff8;
        puVar6 = puVar4 + uVar8 + 4;
        puVar10 = unaff_x21 + 4;
        uVar8 = uVar9;
        do {
          uVar11 = puVar10[-4];
          uVar13 = puVar10[-1];
          uVar12 = puVar10[-2];
          uVar15 = puVar10[1];
          uVar14 = *puVar10;
          uVar17 = puVar10[3];
          uVar16 = puVar10[2];
          puVar6[-3] = puVar10[-3];
          puVar6[-4] = uVar11;
          puVar6[-1] = uVar13;
          puVar6[-2] = uVar12;
          puVar6[1] = uVar15;
          *puVar6 = uVar14;
          puVar6[3] = uVar17;
          puVar6[2] = uVar16;
          uVar8 = uVar8 - 8;
          puVar6 = puVar6 + 8;
          puVar10 = puVar10 + 8;
        } while (uVar8 != 0);
        puVar6 = puVar1 + uVar9;
        puVar10 = unaff_x21 + uVar9;
        if (uVar2 == uVar9) goto LAB_0068af98;
      }
      do {
        puVar7 = puVar6 + 1;
        *puVar6 = *puVar10;
        puVar6 = puVar7;
        puVar10 = puVar10 + 1;
      } while (puVar7 != unaff_x23);
    }
LAB_0068af98:
    puVar6 = puVar4 + unaff_x25;
    __ZdlPv(unaff_x21);
    unaff_x21 = puVar1;
    while( true ) {
      do {
        unaff_x24 = unaff_x24 + -1;
        unaff_x21 = unaff_x21 + -1;
        *unaff_x21 = *unaff_x24;
        if (unaff_x24 == (undefined8 *)unaff_x19[1]) {
          lVar5 = *unaff_x19;
          *unaff_x19 = (long)puVar4;
          unaff_x19[1] = (long)unaff_x21;
          unaff_x19[2] = (long)unaff_x23;
          unaff_x19[3] = (long)puVar6;
          if (lVar5 == 0) {
            return;
          }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR___ZdlPv_009b01b8)();
          return;
        }
      } while (unaff_x21 != puVar4);
      if (puVar6 <= unaff_x23) break;
      lVar5 = (long)puVar6 - (long)unaff_x23 >> 3;
      uVar2 = lVar5 + 2;
      if (-2 < lVar5) {
        uVar2 = lVar5 + 1;
      }
      puVar1 = unaff_x23 + (uVar2 >> 1);
      puVar10 = (undefined8 *)((long)puVar1 - ((long)unaff_x23 - (long)unaff_x21));
      puVar4 = unaff_x21;
      if ((long)unaff_x23 - (long)unaff_x21 == 0) {
        unaff_x21 = puVar10;
        unaff_x23 = puVar1;
      }
      else {
        _memmove(puVar10,unaff_x21,(long)unaff_x23 - (long)unaff_x21);
        unaff_x21 = puVar10;
        unaff_x23 = puVar1;
      }
    }
    unaff_x25 = (long)puVar6 - (long)unaff_x21 >> 2;
    if ((long)puVar6 - (long)unaff_x21 == 0) {
      unaff_x25 = 1;
    }
  } while( true );
}

