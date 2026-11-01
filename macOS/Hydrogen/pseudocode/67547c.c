
void FUN_0067547c(void)

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
  undefined8 *unaff_x21;
  undefined8 *puVar10;
  undefined8 *unaff_x23;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 *unaff_x25;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 in_stack_00000000;
  
  __ZdlPv();
  puVar1 = (undefined8 *)unaff_x19[1];
  puVar12 = (undefined8 *)unaff_x19[2];
  puVar11 = unaff_x21 + 1;
  *unaff_x21 = in_stack_00000000;
  if (puVar12 != puVar1) {
    do {
      if (unaff_x21 == unaff_x23) {
        if (puVar11 < unaff_x25) {
          lVar4 = (long)unaff_x25 - (long)puVar11 >> 3;
          uVar5 = lVar4 + 2;
          if (-2 < lVar4) {
            uVar5 = lVar4 + 1;
          }
          puVar1 = puVar11 + (uVar5 >> 1);
          puVar10 = (undefined8 *)((long)puVar1 - ((long)puVar11 - (long)unaff_x21));
          unaff_x23 = unaff_x21;
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
          uVar5 = (long)unaff_x25 - (long)unaff_x21 >> 2;
          if ((long)unaff_x25 - (long)unaff_x21 == 0) {
            uVar5 = 1;
          }
          if (uVar5 >> 0x3d != 0) {
            func_0x00017514();
                    /* WARNING: Does not return */
            pcVar3 = (code *)SoftwareBreakpoint(1,0x67575c);
            (*pcVar3)();
          }
          unaff_x23 = (undefined8 *)__Znwm(uVar5 << 3);
          uVar8 = uVar5 + 3 >> 2;
          puVar1 = unaff_x23 + uVar8;
          uVar2 = (long)puVar11 - (long)unaff_x21;
          puVar11 = puVar1;
          if (uVar2 != 0) {
            puVar11 = (undefined8 *)((long)puVar1 + (uVar2 & 0xfffffffffffffff8));
            puVar10 = puVar1;
            puVar7 = unaff_x21;
            if ((0x37 < uVar2 - 8) && (0x3f < (long)unaff_x23 + (uVar8 * 8 - (long)unaff_x21))) {
              uVar2 = (uVar2 - 8 >> 3) + 1;
              uVar9 = uVar2 & 0x3ffffffffffffff8;
              puVar10 = unaff_x23 + uVar8 + 4;
              puVar7 = unaff_x21 + 4;
              uVar8 = uVar9;
              do {
                uVar13 = puVar7[-4];
                uVar15 = puVar7[-1];
                uVar14 = puVar7[-2];
                uVar17 = puVar7[1];
                uVar16 = *puVar7;
                uVar19 = puVar7[3];
                uVar18 = puVar7[2];
                puVar10[-3] = puVar7[-3];
                puVar10[-4] = uVar13;
                puVar10[-1] = uVar15;
                puVar10[-2] = uVar14;
                puVar10[1] = uVar17;
                *puVar10 = uVar16;
                puVar10[3] = uVar19;
                puVar10[2] = uVar18;
                uVar8 = uVar8 - 8;
                puVar10 = puVar10 + 8;
                puVar7 = puVar7 + 8;
              } while (uVar8 != 0);
              puVar10 = puVar1 + uVar9;
              puVar7 = unaff_x21 + uVar9;
              if (uVar2 == uVar9) goto code_r0x0067560c;
            }
            do {
              puVar6 = puVar10 + 1;
              *puVar10 = *puVar7;
              puVar10 = puVar6;
              puVar7 = puVar7 + 1;
            } while (puVar6 != puVar11);
          }
code_r0x0067560c:
          unaff_x25 = unaff_x23 + uVar5;
          __ZdlPv(unaff_x21);
          unaff_x21 = puVar1;
        }
      }
      puVar12 = puVar12 + -1;
      unaff_x21 = unaff_x21 + -1;
      *unaff_x21 = *puVar12;
    } while (puVar12 != (undefined8 *)unaff_x19[1]);
  }
  lVar4 = *unaff_x19;
  *unaff_x19 = (long)unaff_x23;
  unaff_x19[1] = (long)unaff_x21;
  unaff_x19[2] = (long)puVar11;
  unaff_x19[3] = (long)unaff_x25;
  if (lVar4 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

