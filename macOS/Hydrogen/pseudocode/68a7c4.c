
void FUN_0068a7c4(void)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x27;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  long in_stack_00000000;
  
  do {
    if (unaff_x23 == (undefined8 *)unaff_x19[1]) {
      lVar3 = *unaff_x19;
      *unaff_x19 = (long)unaff_x20;
      unaff_x19[1] = (long)unaff_x21;
      unaff_x19[2] = (long)unaff_x24;
      unaff_x19[3] = (long)unaff_x27;
      unaff_x19[4] = unaff_x19[4] - in_stack_00000000;
      if (lVar3 == 0) {
        return;
      }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR___ZdlPv_009b01b8)();
      return;
    }
    if (unaff_x21 == unaff_x20) {
      if (unaff_x24 < unaff_x27) {
        lVar5 = (long)unaff_x27 - (long)unaff_x24 >> 3;
        lVar3 = lVar5 + 2;
        if (-2 < lVar5) {
          lVar3 = lVar5 + 1;
        }
        unaff_x21 = unaff_x20 + (lVar3 >> 1);
        puVar4 = unaff_x20;
        if ((long)unaff_x24 - (long)unaff_x20 != 0) {
          _memmove(unaff_x21,unaff_x20,(long)unaff_x24 - (long)unaff_x20);
          puVar4 = unaff_x24;
        }
        unaff_x24 = puVar4 + (lVar3 >> 1);
        puVar4 = unaff_x20;
      }
      else {
        uVar6 = (long)unaff_x27 - (long)unaff_x20 >> 2;
        if ((long)unaff_x27 - (long)unaff_x20 == 0) {
          uVar6 = 1;
        }
        if (uVar6 >> 0x3d != 0) {
          func_0x00017514();
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x68ab6c);
          (*pcVar2)();
        }
        puVar4 = (undefined8 *)__Znwm(uVar6 << 3);
        uVar10 = uVar6 + 3 >> 2;
        unaff_x21 = puVar4 + uVar10;
        uVar1 = (long)unaff_x24 - (long)unaff_x20;
        unaff_x24 = unaff_x21;
        if (uVar1 != 0) {
          unaff_x24 = (undefined8 *)((long)unaff_x21 + (uVar1 & 0xfffffffffffffff8));
          puVar7 = unaff_x21;
          puVar9 = unaff_x20;
          if ((0x37 < uVar1 - 8) && (0x3f < (long)puVar4 + (uVar10 * 8 - (long)unaff_x20))) {
            uVar1 = (uVar1 - 8 >> 3) + 1;
            uVar11 = uVar1 & 0x3ffffffffffffff8;
            puVar7 = puVar4 + uVar10 + 4;
            puVar9 = unaff_x20 + 4;
            uVar10 = uVar11;
            do {
              uVar12 = puVar9[-4];
              uVar14 = puVar9[-1];
              uVar13 = puVar9[-2];
              uVar16 = puVar9[1];
              uVar15 = *puVar9;
              uVar18 = puVar9[3];
              uVar17 = puVar9[2];
              puVar7[-3] = puVar9[-3];
              puVar7[-4] = uVar12;
              puVar7[-1] = uVar14;
              puVar7[-2] = uVar13;
              puVar7[1] = uVar16;
              *puVar7 = uVar15;
              puVar7[3] = uVar18;
              puVar7[2] = uVar17;
              uVar10 = uVar10 - 8;
              puVar7 = puVar7 + 8;
              puVar9 = puVar9 + 8;
            } while (uVar10 != 0);
            puVar7 = unaff_x21 + uVar11;
            puVar9 = unaff_x20 + uVar11;
            if (uVar1 == uVar11) goto code_r0x0068a8f0;
          }
          do {
            puVar8 = puVar7 + 1;
            *puVar7 = *puVar9;
            puVar7 = puVar8;
            puVar9 = puVar9 + 1;
          } while (puVar8 != unaff_x24);
        }
code_r0x0068a8f0:
        unaff_x27 = puVar4 + uVar6;
        if (unaff_x20 != (undefined8 *)0x0) {
          __ZdlPv(unaff_x20);
        }
      }
      unaff_x20 = puVar4;
    }
    unaff_x23 = unaff_x23 + -1;
    unaff_x21 = unaff_x21 + -1;
    *unaff_x21 = *unaff_x23;
  } while( true );
}

