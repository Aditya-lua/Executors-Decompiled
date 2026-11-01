
void FUN_0068aca0(undefined8 param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  ulong uVar9;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 *puVar10;
  long unaff_x23;
  undefined8 *puVar11;
  undefined8 *unaff_x24;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  puVar6 = (undefined8 *)((long)unaff_x20 + unaff_x23);
  if (unaff_x27 == unaff_x22) {
    if (0 < unaff_x28) {
      uVar5 = unaff_x27 + 2;
      if (-2 < unaff_x27) {
        uVar5 = unaff_x27 + 1;
      }
      unaff_x21 = unaff_x21 + -(uVar5 >> 1);
      *unaff_x21 = param_1;
      goto joined_r0x0068acf0;
    }
    uVar5 = unaff_x28 >> 2;
    if (unaff_x24 == unaff_x26) {
      uVar5 = 1;
    }
    if (uVar5 >> 0x3d != 0) {
      func_0x00017514();
code_r0x0068b0e4:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x68b0e8);
      (*pcVar3)();
    }
    unaff_x20 = (undefined8 *)__Znwm(uVar5 << 3);
    unaff_x21 = unaff_x20 + (uVar5 >> 2);
    puVar6 = unaff_x20 + uVar5;
    __ZdlPv();
    puVar1 = (undefined8 *)unaff_x19[1];
    unaff_x24 = (undefined8 *)unaff_x19[2];
    puVar11 = unaff_x21 + 1;
    *unaff_x21 = param_1;
    if (unaff_x24 == puVar1) goto code_r0x0068ae30;
  }
  else {
    *unaff_x21 = param_1;
joined_r0x0068acf0:
    puVar11 = unaff_x21 + 1;
    if (unaff_x24 == unaff_x26) goto code_r0x0068ae30;
  }
  do {
    if (unaff_x21 == unaff_x20) {
      if (puVar11 < puVar6) {
        lVar4 = (long)puVar6 - (long)puVar11 >> 3;
        uVar5 = lVar4 + 2;
        if (-2 < lVar4) {
          uVar5 = lVar4 + 1;
        }
        puVar1 = puVar11 + (uVar5 >> 1);
        puVar10 = (undefined8 *)((long)puVar1 - ((long)puVar11 - (long)unaff_x21));
        unaff_x20 = unaff_x21;
        if ((long)puVar11 - (long)unaff_x21 == 0) {
          unaff_x21 = puVar10;
          puVar11 = puVar1;
        }
        else {
          _memmove(puVar10,unaff_x21,(long)puVar11 - (long)unaff_x21);
          unaff_x21 = puVar10;
          puVar11 = puVar1;
        }
      }
      else {
        uVar5 = (long)puVar6 - (long)unaff_x21 >> 2;
        if ((long)puVar6 - (long)unaff_x21 == 0) {
          uVar5 = 1;
        }
        if (uVar5 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x0068b0e4;
        }
        unaff_x20 = (undefined8 *)__Znwm(uVar5 << 3);
        uVar8 = uVar5 + 3 >> 2;
        puVar1 = unaff_x20 + uVar8;
        uVar2 = (long)puVar11 - (long)unaff_x21;
        puVar11 = puVar1;
        if (uVar2 != 0) {
          puVar11 = (undefined8 *)((long)puVar1 + (uVar2 & 0xfffffffffffffff8));
          puVar6 = puVar1;
          puVar10 = unaff_x21;
          if ((0x37 < uVar2 - 8) && (0x3f < (long)unaff_x20 + (uVar8 * 8 - (long)unaff_x21))) {
            uVar2 = (uVar2 - 8 >> 3) + 1;
            uVar9 = uVar2 & 0x3ffffffffffffff8;
            puVar6 = unaff_x20 + uVar8 + 4;
            puVar10 = unaff_x21 + 4;
            uVar8 = uVar9;
            do {
              uVar12 = puVar10[-4];
              uVar14 = puVar10[-1];
              uVar13 = puVar10[-2];
              uVar16 = puVar10[1];
              uVar15 = *puVar10;
              uVar18 = puVar10[3];
              uVar17 = puVar10[2];
              puVar6[-3] = puVar10[-3];
              puVar6[-4] = uVar12;
              puVar6[-1] = uVar14;
              puVar6[-2] = uVar13;
              puVar6[1] = uVar16;
              *puVar6 = uVar15;
              puVar6[3] = uVar18;
              puVar6[2] = uVar17;
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
          } while (puVar7 != puVar11);
        }
LAB_0068af98:
        puVar6 = unaff_x20 + uVar5;
        __ZdlPv(unaff_x21);
        unaff_x21 = puVar1;
      }
    }
    unaff_x24 = unaff_x24 + -1;
    unaff_x21 = unaff_x21 + -1;
    *unaff_x21 = *unaff_x24;
  } while (unaff_x24 != (undefined8 *)unaff_x19[1]);
code_r0x0068ae30:
  lVar4 = *unaff_x19;
  *unaff_x19 = (long)unaff_x20;
  unaff_x19[1] = (long)unaff_x21;
  unaff_x19[2] = (long)puVar11;
  unaff_x19[3] = (long)puVar6;
  if (lVar4 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

