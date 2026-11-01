
void FUN_00675618(void)

{
  undefined8 *puVar1;
  ulong uVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  ulong uVar10;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar11;
  undefined8 *unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  do {
    while( true ) {
      while( true ) {
        unaff_x24 = unaff_x24 + -1;
        puVar11 = unaff_x22 + -1;
        *puVar11 = *unaff_x24;
        if (unaff_x24 == (undefined8 *)unaff_x19[1]) {
          lVar4 = *unaff_x19;
          *unaff_x19 = (long)unaff_x20;
          unaff_x19[1] = (long)puVar11;
          unaff_x19[2] = (long)unaff_x23;
          unaff_x19[3] = (long)unaff_x25;
          if (lVar4 == 0) {
            return;
          }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR___ZdlPv_009b01b8)();
          return;
        }
        if (puVar11 == unaff_x20) break;
        unaff_x22 = puVar11;
      }
      if (unaff_x25 <= unaff_x23) break;
      lVar4 = (long)unaff_x25 - (long)unaff_x23 >> 3;
      uVar5 = lVar4 + 2;
      if (-2 < lVar4) {
        uVar5 = lVar4 + 1;
      }
      puVar1 = unaff_x23 + (uVar5 >> 1);
      unaff_x22 = (undefined8 *)((long)puVar1 - ((long)unaff_x23 - (long)puVar11));
      unaff_x20 = puVar11;
      if ((long)unaff_x23 - (long)puVar11 == 0) {
        unaff_x23 = puVar1;
      }
      else {
        _memmove(unaff_x22,puVar11,(long)unaff_x23 - (long)puVar11);
        unaff_x23 = puVar1;
      }
    }
    uVar5 = (long)unaff_x25 - (long)puVar11 >> 2;
    if ((long)unaff_x25 - (long)puVar11 == 0) {
      uVar5 = 1;
    }
    if (uVar5 >> 0x3d != 0) {
      func_0x00017514();
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x67575c);
      (*pcVar3)();
    }
    unaff_x20 = (undefined8 *)__Znwm(uVar5 << 3);
    uVar9 = uVar5 + 3 >> 2;
    puVar1 = unaff_x20 + uVar9;
    uVar2 = (long)unaff_x23 - (long)puVar11;
    unaff_x23 = puVar1;
    if (uVar2 != 0) {
      unaff_x23 = (undefined8 *)((long)puVar1 + (uVar2 & 0xfffffffffffffff8));
      puVar6 = puVar1;
      puVar8 = puVar11;
      if ((0x37 < uVar2 - 8) && (0x3f < (long)unaff_x20 + (uVar9 * 8 - (long)puVar11))) {
        uVar2 = (uVar2 - 8 >> 3) + 1;
        uVar10 = uVar2 & 0x3ffffffffffffff8;
        puVar6 = unaff_x20 + uVar9 + 4;
        puVar8 = unaff_x22 + 3;
        uVar9 = uVar10;
        do {
          uVar12 = puVar8[-4];
          uVar14 = puVar8[-1];
          uVar13 = puVar8[-2];
          uVar16 = puVar8[1];
          uVar15 = *puVar8;
          uVar18 = puVar8[3];
          uVar17 = puVar8[2];
          puVar6[-3] = puVar8[-3];
          puVar6[-4] = uVar12;
          puVar6[-1] = uVar14;
          puVar6[-2] = uVar13;
          puVar6[1] = uVar16;
          *puVar6 = uVar15;
          puVar6[3] = uVar18;
          puVar6[2] = uVar17;
          uVar9 = uVar9 - 8;
          puVar6 = puVar6 + 8;
          puVar8 = puVar8 + 8;
        } while (uVar9 != 0);
        puVar6 = puVar1 + uVar10;
        puVar8 = puVar11 + uVar10;
        if (uVar2 == uVar10) goto code_r0x0067560c;
      }
      do {
        puVar7 = puVar6 + 1;
        *puVar6 = *puVar8;
        puVar6 = puVar7;
        puVar8 = puVar8 + 1;
      } while (puVar7 != unaff_x23);
    }
code_r0x0067560c:
    unaff_x25 = unaff_x20 + uVar5;
    __ZdlPv(puVar11);
    unaff_x22 = puVar1;
  } while( true );
}

