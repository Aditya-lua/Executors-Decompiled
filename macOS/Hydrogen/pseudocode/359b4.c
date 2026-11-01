
void FUN_000359b4(void)

{
  ulong uVar1;
  code *pcVar2;
  undefined8 *puVar3;
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
  ulong unaff_x22;
  undefined8 *puVar13;
  undefined8 *puVar14;
  undefined8 *unaff_x24;
  undefined8 *unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  if (unaff_x22 >> 0x3d != 0) {
    func_0x00017514();
LAB_00035e18:
    func_0x00017514();
code_r0x00035e1c:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x35e20);
    (*pcVar2)();
  }
  puVar3 = (undefined8 *)__Znwm(unaff_x22 * 8);
  uVar4 = __Znwm(0xfc0);
  puVar12 = puVar3 + unaff_x27;
  puVar8 = puVar3 + unaff_x22;
  if (unaff_x27 == unaff_x22) {
    if (0 < unaff_x28) {
      uVar7 = unaff_x27 + 2;
      if (-2 < (long)unaff_x27) {
        uVar7 = unaff_x27 + 1;
      }
      puVar12 = puVar12 + -(uVar7 >> 1);
      *puVar12 = uVar4;
      goto joined_r0x00035a28;
    }
    uVar7 = unaff_x28 >> 2;
    if (unaff_x24 == unaff_x26) {
      uVar7 = 1;
    }
    if (uVar7 >> 0x3d != 0) goto LAB_00035e18;
    puVar6 = (undefined8 *)__Znwm(uVar7 << 3);
    puVar12 = puVar6 + (uVar7 >> 2);
    puVar8 = puVar6 + uVar7;
    __ZdlPv(puVar3);
    puVar13 = (undefined8 *)unaff_x19[1];
    unaff_x24 = (undefined8 *)unaff_x19[2];
    puVar14 = puVar12 + 1;
    *puVar12 = uVar4;
    puVar3 = puVar6;
    if (unaff_x24 != puVar13) goto LAB_00035bb4;
  }
  else {
    *puVar12 = uVar4;
joined_r0x00035a28:
    puVar14 = puVar12 + 1;
    puVar6 = puVar3;
    if (unaff_x24 != unaff_x26) {
LAB_00035bb4:
      do {
        if (puVar12 == puVar6) {
          if (puVar14 < puVar8) {
            lVar5 = (long)puVar8 - (long)puVar14 >> 3;
            uVar7 = lVar5 + 2;
            if (-2 < lVar5) {
              uVar7 = lVar5 + 1;
            }
            puVar3 = puVar14 + (uVar7 >> 1);
            puVar13 = (undefined8 *)((long)puVar3 - ((long)puVar14 - (long)puVar12));
            puVar6 = puVar12;
            if ((long)puVar14 - (long)puVar12 == 0) {
              puVar12 = puVar13;
              puVar14 = puVar3;
            }
            else {
              _memmove(puVar13,puVar12,(long)puVar14 - (long)puVar12);
              puVar12 = puVar13;
              puVar14 = puVar3;
            }
          }
          else {
            uVar7 = (long)puVar8 - (long)puVar12 >> 2;
            if ((long)puVar8 - (long)puVar12 == 0) {
              uVar7 = 1;
            }
            if (uVar7 >> 0x3d != 0) {
              func_0x00017514();
              goto code_r0x00035e1c;
            }
            puVar6 = (undefined8 *)__Znwm(uVar7 << 3);
            uVar10 = uVar7 + 3 >> 2;
            puVar3 = puVar6 + uVar10;
            uVar1 = (long)puVar14 - (long)puVar12;
            puVar14 = puVar3;
            if (uVar1 != 0) {
              puVar14 = (undefined8 *)((long)puVar3 + (uVar1 & 0xfffffffffffffff8));
              puVar8 = puVar3;
              puVar13 = puVar12;
              if ((0x37 < uVar1 - 8) && (0x3f < (long)puVar6 + (uVar10 * 8 - (long)puVar12))) {
                uVar1 = (uVar1 - 8 >> 3) + 1;
                uVar11 = uVar1 & 0x3ffffffffffffff8;
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
                puVar8 = puVar3 + uVar11;
                puVar13 = puVar12 + uVar11;
                if (uVar1 == uVar11) goto LAB_00035cd0;
              }
              do {
                puVar9 = puVar8 + 1;
                *puVar8 = *puVar13;
                puVar8 = puVar9;
                puVar13 = puVar13 + 1;
              } while (puVar9 != puVar14);
            }
LAB_00035cd0:
            puVar8 = puVar6 + uVar7;
            __ZdlPv(puVar12);
            puVar12 = puVar3;
          }
        }
        unaff_x24 = unaff_x24 + -1;
        puVar12 = puVar12 + -1;
        *puVar12 = *unaff_x24;
      } while (unaff_x24 != (undefined8 *)unaff_x19[1]);
      goto LAB_00035b68;
    }
  }
  puVar6 = puVar3;
LAB_00035b68:
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

