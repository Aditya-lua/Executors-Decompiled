
void FUN_0068a858(ulong param_1)

{
  ulong uVar1;
  code *pcVar2;
  undefined1 in_ZR;
  long lVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong in_x10;
  ulong uVar8;
  ulong uVar9;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar10;
  ulong unaff_x25;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  long in_stack_00000000;
  
  do {
    puVar10 = unaff_x21;
    if (!(bool)in_ZR) {
      puVar10 = (undefined8 *)((long)unaff_x21 + (param_1 & 0xfffffffffffffff8));
      puVar4 = unaff_x21;
      puVar5 = unaff_x20;
      if ((0x37 < param_1 - 8) && (0x3f < (long)unaff_x22 + (in_x10 * 8 - (long)unaff_x20))) {
        uVar1 = (param_1 - 8 >> 3) + 1;
        uVar8 = uVar1 & 0x3ffffffffffffff8;
        puVar4 = unaff_x22 + in_x10 + 4;
        puVar5 = unaff_x20 + 4;
        uVar9 = uVar8;
        do {
          uVar11 = puVar5[-4];
          uVar13 = puVar5[-1];
          uVar12 = puVar5[-2];
          uVar15 = puVar5[1];
          uVar14 = *puVar5;
          uVar17 = puVar5[3];
          uVar16 = puVar5[2];
          puVar4[-3] = puVar5[-3];
          puVar4[-4] = uVar11;
          puVar4[-1] = uVar13;
          puVar4[-2] = uVar12;
          puVar4[1] = uVar15;
          *puVar4 = uVar14;
          puVar4[3] = uVar17;
          puVar4[2] = uVar16;
          uVar9 = uVar9 - 8;
          puVar4 = puVar4 + 8;
          puVar5 = puVar5 + 8;
        } while (uVar9 != 0);
        puVar4 = unaff_x21 + uVar8;
        puVar5 = unaff_x20 + uVar8;
        if (uVar1 == uVar8) goto LAB_0068a8f0;
      }
      do {
        puVar7 = puVar4 + 1;
        *puVar4 = *puVar5;
        puVar4 = puVar7;
        puVar5 = puVar5 + 1;
      } while (puVar7 != puVar10);
    }
LAB_0068a8f0:
    puVar4 = unaff_x22 + unaff_x25;
    if (unaff_x20 != (undefined8 *)0x0) {
      __ZdlPv(unaff_x20);
    }
    while( true ) {
      do {
        unaff_x23 = unaff_x23 + -1;
        unaff_x21 = unaff_x21 + -1;
        *unaff_x21 = *unaff_x23;
        if (unaff_x23 == (undefined8 *)unaff_x19[1]) {
          lVar3 = *unaff_x19;
          *unaff_x19 = (long)unaff_x22;
          unaff_x19[1] = (long)unaff_x21;
          unaff_x19[2] = (long)puVar10;
          unaff_x19[3] = (long)puVar4;
          unaff_x19[4] = unaff_x19[4] - in_stack_00000000;
          if (lVar3 == 0) {
            return;
          }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR___ZdlPv_009b01b8)();
          return;
        }
      } while (unaff_x21 != unaff_x22);
      if (puVar4 <= puVar10) break;
      lVar6 = (long)puVar4 - (long)puVar10 >> 3;
      lVar3 = lVar6 + 2;
      if (-2 < lVar6) {
        lVar3 = lVar6 + 1;
      }
      unaff_x21 = unaff_x22 + (lVar3 >> 1);
      puVar5 = unaff_x22;
      if ((long)puVar10 - (long)unaff_x22 != 0) {
        _memmove(unaff_x21,unaff_x22,(long)puVar10 - (long)unaff_x22);
        puVar5 = puVar10;
      }
      puVar10 = puVar5 + (lVar3 >> 1);
    }
    unaff_x25 = (long)puVar4 - (long)unaff_x22 >> 2;
    if ((long)puVar4 - (long)unaff_x22 == 0) {
      unaff_x25 = 1;
    }
    if (unaff_x25 >> 0x3d != 0) {
      func_0x00017514();
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x68ab6c);
      (*pcVar2)();
    }
    puVar4 = (undefined8 *)__Znwm(unaff_x25 << 3);
    in_x10 = unaff_x25 + 3 >> 2;
    unaff_x21 = puVar4 + in_x10;
    param_1 = (long)puVar10 - (long)unaff_x22;
    in_ZR = param_1 == 0;
    unaff_x20 = unaff_x22;
    unaff_x22 = puVar4;
  } while( true );
}

