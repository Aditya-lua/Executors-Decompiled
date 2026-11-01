
void FUN_00688f74(ulong param_1)

{
  ulong uVar1;
  code *pcVar2;
  long lVar3;
  undefined8 *puVar4;
  ulong in_x9;
  undefined8 *puVar5;
  ulong in_x10;
  ulong uVar6;
  ulong uVar7;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *puVar8;
  undefined8 *unaff_x22;
  undefined8 *puVar9;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
  do {
    puVar9 = (undefined8 *)((long)unaff_x22 + in_x9);
    puVar4 = unaff_x22;
    puVar5 = unaff_x21;
    if ((param_1 - 8 < 0x38) || ((long)unaff_x20 + (in_x10 * 8 - (long)unaff_x21) < 0x40)) {
LAB_00688ff0:
      do {
        puVar8 = puVar4 + 1;
        *puVar4 = *puVar5;
        puVar4 = puVar8;
        puVar5 = puVar5 + 1;
      } while (puVar8 != puVar9);
    }
    else {
      uVar1 = (param_1 - 8 >> 3) + 1;
      uVar6 = uVar1 & 0x3ffffffffffffff8;
      puVar4 = unaff_x20 + in_x10 + 4;
      puVar5 = unaff_x21 + 4;
      uVar7 = uVar6;
      do {
        uVar10 = puVar5[-4];
        uVar12 = puVar5[-1];
        uVar11 = puVar5[-2];
        uVar14 = puVar5[1];
        uVar13 = *puVar5;
        uVar16 = puVar5[3];
        uVar15 = puVar5[2];
        puVar4[-3] = puVar5[-3];
        puVar4[-4] = uVar10;
        puVar4[-1] = uVar12;
        puVar4[-2] = uVar11;
        puVar4[1] = uVar14;
        *puVar4 = uVar13;
        puVar4[3] = uVar16;
        puVar4[2] = uVar15;
        uVar7 = uVar7 - 8;
        puVar4 = puVar4 + 8;
        puVar5 = puVar5 + 8;
      } while (uVar7 != 0);
      puVar4 = unaff_x22 + uVar6;
      puVar5 = unaff_x21 + uVar6;
      if (uVar1 != uVar6) goto LAB_00688ff0;
    }
    do {
      puVar4 = unaff_x20 + unaff_x25;
      __ZdlPv(unaff_x21);
      unaff_x21 = unaff_x22;
      while( true ) {
        do {
          unaff_x24 = unaff_x24 + -1;
          unaff_x21 = unaff_x21 + -1;
          *unaff_x21 = *unaff_x24;
          if (unaff_x24 == (undefined8 *)unaff_x19[1]) {
            lVar3 = *unaff_x19;
            *unaff_x19 = (long)unaff_x20;
            unaff_x19[1] = (long)unaff_x21;
            unaff_x19[2] = (long)puVar9;
            unaff_x19[3] = (long)puVar4;
            if (lVar3 == 0) {
              return;
            }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
            (*(code *)PTR___ZdlPv_009b01b8)();
            return;
          }
        } while (unaff_x21 != unaff_x20);
        if (puVar4 <= puVar9) break;
        lVar3 = (long)puVar4 - (long)puVar9 >> 3;
        uVar1 = lVar3 + 2;
        if (-2 < lVar3) {
          uVar1 = lVar3 + 1;
        }
        puVar5 = puVar9 + (uVar1 >> 1);
        puVar8 = (undefined8 *)((long)puVar5 - ((long)puVar9 - (long)unaff_x21));
        unaff_x20 = unaff_x21;
        if ((long)puVar9 - (long)unaff_x21 == 0) {
          unaff_x21 = puVar8;
          puVar9 = puVar5;
        }
        else {
          _memmove(puVar8,unaff_x21,(long)puVar9 - (long)unaff_x21);
          unaff_x21 = puVar8;
          puVar9 = puVar5;
        }
      }
      unaff_x25 = (long)puVar4 - (long)unaff_x21 >> 2;
      if ((long)puVar4 - (long)unaff_x21 == 0) {
        unaff_x25 = 1;
      }
      if (unaff_x25 >> 0x3d != 0) {
        func_0x00017514();
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x689150);
        (*pcVar2)();
      }
      unaff_x20 = (undefined8 *)__Znwm(unaff_x25 << 3);
      in_x10 = unaff_x25 + 3 >> 2;
      unaff_x22 = unaff_x20 + in_x10;
      param_1 = (long)puVar9 - (long)unaff_x21;
      puVar9 = unaff_x22;
    } while (param_1 == 0);
    in_x9 = param_1 & 0xfffffffffffffff8;
  } while( true );
}

