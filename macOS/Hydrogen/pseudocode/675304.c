
void FUN_00675304(undefined8 *param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  code *pcVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  long *unaff_x19;
  undefined8 *puVar12;
  long unaff_x22;
  undefined8 *puVar13;
  long unaff_x23;
  undefined8 *puVar14;
  undefined8 *unaff_x24;
  undefined8 *unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  uVar4 = __Znwm(0xff0);
  puVar12 = param_1 + unaff_x27;
  puVar8 = (undefined8 *)((long)param_1 + unaff_x23);
  if (unaff_x27 == unaff_x22) {
    if (0 < unaff_x28) {
      uVar7 = unaff_x27 + 2;
      if (-2 < unaff_x27) {
        uVar7 = unaff_x27 + 1;
      }
      puVar12 = puVar12 + -(uVar7 >> 1);
      *puVar12 = uVar4;
      goto joined_r0x00675364;
    }
    uVar7 = unaff_x28 >> 2;
    if (unaff_x24 == unaff_x26) {
      uVar7 = 1;
    }
    if (uVar7 >> 0x3d != 0) {
      func_0x00017514();
code_r0x00675758:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x67575c);
      (*pcVar3)();
    }
    puVar6 = (undefined8 *)__Znwm(uVar7 << 3);
    puVar12 = puVar6 + (uVar7 >> 2);
    puVar8 = puVar6 + uVar7;
    __ZdlPv(param_1);
    puVar1 = (undefined8 *)unaff_x19[1];
    unaff_x24 = (undefined8 *)unaff_x19[2];
    puVar14 = puVar12 + 1;
    *puVar12 = uVar4;
    param_1 = puVar6;
    if (unaff_x24 != puVar1) goto LAB_006754f0;
  }
  else {
    *puVar12 = uVar4;
joined_r0x00675364:
    puVar14 = puVar12 + 1;
    puVar6 = param_1;
    if (unaff_x24 != unaff_x26) {
LAB_006754f0:
      do {
        if (puVar12 == puVar6) {
          if (puVar14 < puVar8) {
            lVar5 = (long)puVar8 - (long)puVar14 >> 3;
            uVar7 = lVar5 + 2;
            if (-2 < lVar5) {
              uVar7 = lVar5 + 1;
            }
            puVar1 = puVar14 + (uVar7 >> 1);
            puVar13 = (undefined8 *)((long)puVar1 - ((long)puVar14 - (long)puVar12));
            puVar6 = puVar12;
            if ((long)puVar14 - (long)puVar12 == 0) {
              puVar12 = puVar13;
              puVar14 = puVar1;
            }
            else {
              _memmove(puVar13,puVar12,(long)puVar14 - (long)puVar12);
              puVar12 = puVar13;
              puVar14 = puVar1;
            }
          }
          else {
            uVar7 = (long)puVar8 - (long)puVar12 >> 2;
            if ((long)puVar8 - (long)puVar12 == 0) {
              uVar7 = 1;
            }
            if (uVar7 >> 0x3d != 0) {
              func_0x00017514();
              goto code_r0x00675758;
            }
            puVar6 = (undefined8 *)__Znwm(uVar7 << 3);
            uVar10 = uVar7 + 3 >> 2;
            puVar1 = puVar6 + uVar10;
            uVar2 = (long)puVar14 - (long)puVar12;
            puVar14 = puVar1;
            if (uVar2 != 0) {
              puVar14 = (undefined8 *)((long)puVar1 + (uVar2 & 0xfffffffffffffff8));
              puVar8 = puVar1;
              puVar13 = puVar12;
              if ((0x37 < uVar2 - 8) && (0x3f < (long)puVar6 + (uVar10 * 8 - (long)puVar12))) {
                uVar2 = (uVar2 - 8 >> 3) + 1;
                uVar11 = uVar2 & 0x3ffffffffffffff8;
                puVar8 = puVar6 + uVar10 + 4;
                puVar13 = puVar12 + 4;
                uVar10 = uVar11;
                do {
                  uVar4 = puVar13[-4];
                  uVar16 = puVar13[-1];
                  uVar15 = puVar13[-2];
                  uVar18 = puVar13[1];
                  uVar17 = *puVar13;
                  uVar20 = puVar13[3];
                  uVar19 = puVar13[2];
                  puVar8[-3] = puVar13[-3];
                  puVar8[-4] = uVar4;
                  puVar8[-1] = uVar16;
                  puVar8[-2] = uVar15;
                  puVar8[1] = uVar18;
                  *puVar8 = uVar17;
                  puVar8[3] = uVar20;
                  puVar8[2] = uVar19;
                  uVar10 = uVar10 - 8;
                  puVar8 = puVar8 + 8;
                  puVar13 = puVar13 + 8;
                } while (uVar10 != 0);
                puVar8 = puVar1 + uVar11;
                puVar13 = puVar12 + uVar11;
                if (uVar2 == uVar11) goto code_r0x0067560c;
              }
              do {
                puVar9 = puVar8 + 1;
                *puVar8 = *puVar13;
                puVar8 = puVar9;
                puVar13 = puVar13 + 1;
              } while (puVar9 != puVar14);
            }
code_r0x0067560c:
            puVar8 = puVar6 + uVar7;
            __ZdlPv(puVar12);
            puVar12 = puVar1;
          }
        }
        unaff_x24 = unaff_x24 + -1;
        puVar12 = puVar12 + -1;
        *puVar12 = *unaff_x24;
      } while (unaff_x24 != (undefined8 *)unaff_x19[1]);
      goto code_r0x006754a4;
    }
  }
  puVar6 = param_1;
code_r0x006754a4:
  lVar5 = *unaff_x19;
  *unaff_x19 = (long)puVar6;
  unaff_x19[1] = (long)puVar12;
  unaff_x19[2] = (long)puVar14;
  unaff_x19[3] = (long)puVar8;
  if (lVar5 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

