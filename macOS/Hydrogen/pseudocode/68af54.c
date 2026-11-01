
void FUN_0068af54(undefined8 *param_1)

{
  undefined8 *puVar1;
  code *pcVar2;
  long lVar3;
  long in_x9;
  undefined8 *puVar4;
  ulong uVar5;
  ulong in_x10;
  ulong in_x11;
  long in_x12;
  undefined8 *puVar6;
  ulong uVar7;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *puVar8;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  do {
    puVar4 = (undefined8 *)((long)unaff_x20 + in_x12 + 0x20);
    puVar6 = unaff_x21 + 4;
    uVar7 = in_x11;
    do {
      uVar9 = puVar6[-4];
      uVar11 = puVar6[-1];
      uVar10 = puVar6[-2];
      uVar13 = puVar6[1];
      uVar12 = *puVar6;
      uVar15 = puVar6[3];
      uVar14 = puVar6[2];
      puVar4[-3] = puVar6[-3];
      puVar4[-4] = uVar9;
      puVar4[-1] = uVar11;
      puVar4[-2] = uVar10;
      puVar4[1] = uVar13;
      *puVar4 = uVar12;
      puVar4[3] = uVar15;
      puVar4[2] = uVar14;
      uVar7 = uVar7 - 8;
      puVar4 = puVar4 + 8;
      puVar6 = puVar6 + 8;
    } while (uVar7 != 0);
    puVar4 = (undefined8 *)((long)unaff_x21 + in_x9);
    if (in_x10 == in_x11) goto LAB_0068af98;
    do {
      do {
        puVar6 = param_1 + 1;
        *param_1 = *puVar4;
        param_1 = puVar6;
        puVar4 = puVar4 + 1;
      } while (puVar6 != unaff_x23);
LAB_0068af98:
      do {
        puVar6 = unaff_x20 + unaff_x25;
        __ZdlPv(unaff_x21);
        puVar4 = unaff_x22;
        while( true ) {
          do {
            unaff_x24 = unaff_x24 + -1;
            puVar4 = puVar4 + -1;
            *puVar4 = *unaff_x24;
            if (unaff_x24 == (undefined8 *)unaff_x19[1]) {
              lVar3 = *unaff_x19;
              *unaff_x19 = (long)unaff_x20;
              unaff_x19[1] = (long)puVar4;
              unaff_x19[2] = (long)unaff_x23;
              unaff_x19[3] = (long)puVar6;
              if (lVar3 == 0) {
                return;
              }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
              (*(code *)PTR___ZdlPv_009b01b8)();
              return;
            }
          } while (puVar4 != unaff_x20);
          if (puVar6 <= unaff_x23) break;
          lVar3 = (long)puVar6 - (long)unaff_x23 >> 3;
          uVar7 = lVar3 + 2;
          if (-2 < lVar3) {
            uVar7 = lVar3 + 1;
          }
          puVar1 = unaff_x23 + (uVar7 >> 1);
          puVar8 = (undefined8 *)((long)puVar1 - ((long)unaff_x23 - (long)puVar4));
          unaff_x20 = puVar4;
          if ((long)unaff_x23 - (long)puVar4 == 0) {
            puVar4 = puVar8;
            unaff_x23 = puVar1;
          }
          else {
            _memmove(puVar8,puVar4,(long)unaff_x23 - (long)puVar4);
            puVar4 = puVar8;
            unaff_x23 = puVar1;
          }
        }
        unaff_x25 = (long)puVar6 - (long)puVar4 >> 2;
        if ((long)puVar6 - (long)puVar4 == 0) {
          unaff_x25 = 1;
        }
        if (unaff_x25 >> 0x3d != 0) {
          func_0x00017514();
                    /* WARNING: Does not return */
          pcVar2 = (code *)SoftwareBreakpoint(1,0x68b0e8);
          (*pcVar2)();
        }
        unaff_x20 = (undefined8 *)__Znwm(unaff_x25 << 3);
        uVar5 = unaff_x25 + 3 >> 2;
        param_1 = unaff_x20 + uVar5;
        uVar7 = (long)unaff_x23 - (long)puVar4;
        unaff_x21 = puVar4;
        unaff_x22 = param_1;
        unaff_x23 = param_1;
      } while (uVar7 == 0);
      unaff_x23 = (undefined8 *)((long)param_1 + (uVar7 & 0xfffffffffffffff8));
    } while ((uVar7 - 8 < 0x38) ||
            (in_x12 = uVar5 * 8, (ulong)((long)unaff_x20 + (in_x12 - (long)puVar4)) < 0x40));
    in_x10 = (uVar7 - 8 >> 3) + 1;
    in_x11 = in_x10 & 0x3ffffffffffffff8;
    in_x9 = in_x11 * 8;
    param_1 = param_1 + in_x11;
  } while( true );
}

