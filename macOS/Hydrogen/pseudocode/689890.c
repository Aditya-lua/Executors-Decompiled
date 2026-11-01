
void FUN_00689890(undefined8 *param_1,long param_2)

{
  code *pcVar1;
  long lVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long lVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 unaff_x24;
  long unaff_x25;
  undefined8 *puVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
code_r0x00689890:
  puVar4 = param_1;
  do {
    do {
      puVar9 = puVar4 + 1;
      *puVar4 = *unaff_x20;
      puVar4 = puVar9;
      unaff_x20 = unaff_x20 + 1;
    } while (puVar9 != unaff_x23);
    do {
      do {
        *unaff_x19 = param_2;
        unaff_x19[1] = (long)param_1;
        unaff_x19[2] = (long)unaff_x23;
        unaff_x19[3] = param_2 + unaff_x22;
        if (unaff_x21 != (undefined8 *)0x0) {
          __ZdlPv(unaff_x21);
          unaff_x23 = (undefined8 *)unaff_x19[2];
        }
        while( true ) {
          do {
            *unaff_x23 = unaff_x24;
            unaff_x23 = (undefined8 *)(unaff_x19[2] + 8);
            unaff_x19[2] = (long)unaff_x23;
            unaff_x25 = unaff_x25 + -1;
            if (unaff_x25 == 0) {
              return;
            }
            puVar9 = (undefined8 *)unaff_x19[1];
            unaff_x20 = puVar9 + 1;
            unaff_x24 = *puVar9;
            unaff_x19[1] = (long)unaff_x20;
          } while (unaff_x23 != (undefined8 *)unaff_x19[3]);
          unaff_x21 = (undefined8 *)*unaff_x19;
          if (unaff_x20 < unaff_x21 || (long)unaff_x20 - (long)unaff_x21 == 0) break;
          lVar2 = (long)unaff_x20 - (long)unaff_x21 >> 3;
          lVar6 = lVar2 + 2;
          if (-2 < lVar2) {
            lVar6 = lVar2 + 1;
          }
          lVar2 = (long)unaff_x23 - (long)unaff_x20;
          if (lVar2 != 0) {
            _memmove(unaff_x20 + -(lVar6 >> 1),unaff_x20,lVar2);
            unaff_x23 = (undefined8 *)unaff_x19[1];
          }
          puVar4 = unaff_x23 + -(lVar6 >> 1);
          unaff_x23 = (undefined8 *)((long)(unaff_x20 + -(lVar6 >> 1)) + lVar2);
          unaff_x19[1] = (long)puVar4;
          unaff_x19[2] = (long)unaff_x23;
        }
        uVar3 = (long)unaff_x23 - (long)unaff_x21 >> 2;
        if ((long)unaff_x23 - (long)unaff_x21 == 0) {
          uVar3 = 1;
        }
        if (uVar3 >> 0x3d != 0) {
          func_0x00017514();
          func_0x00017514();
                    /* WARNING: Does not return */
          pcVar1 = (code *)SoftwareBreakpoint(1,0x68a048);
          (*pcVar1)();
        }
        unaff_x22 = uVar3 << 3;
        param_2 = __Znwm(unaff_x22);
        param_1 = (undefined8 *)(param_2 + (uVar3 >> 2) * 8);
        uVar8 = (long)unaff_x23 - (long)unaff_x20;
        unaff_x23 = param_1;
      } while (uVar8 == 0);
      unaff_x23 = (undefined8 *)((long)param_1 + (uVar8 & 0xfffffffffffffff8));
      if (uVar8 - 8 < 0x38) goto code_r0x00689890;
      lVar6 = (uVar3 >> 2) * 8;
      puVar4 = param_1;
      if ((ulong)((lVar6 + param_2) - (long)unaff_x20) < 0x40) break;
      uVar3 = (uVar8 - 8 >> 3) + 1;
      uVar5 = uVar3 & 0x3ffffffffffffff8;
      puVar4 = param_1 + uVar5;
      unaff_x20 = unaff_x20 + uVar5;
      puVar7 = (undefined8 *)(param_2 + lVar6 + 0x20);
      puVar9 = puVar9 + 5;
      uVar8 = uVar5;
      do {
        uVar10 = puVar9[-4];
        uVar12 = puVar9[-1];
        uVar11 = puVar9[-2];
        uVar14 = puVar9[1];
        uVar13 = *puVar9;
        uVar16 = puVar9[3];
        uVar15 = puVar9[2];
        puVar7[-3] = puVar9[-3];
        puVar7[-4] = uVar10;
        puVar7[-1] = uVar12;
        puVar7[-2] = uVar11;
        puVar7[1] = uVar14;
        *puVar7 = uVar13;
        puVar7[3] = uVar16;
        puVar7[2] = uVar15;
        uVar8 = uVar8 - 8;
        puVar7 = puVar7 + 8;
        puVar9 = puVar9 + 8;
      } while (uVar8 != 0);
    } while (uVar3 == uVar5);
  } while( true );
}

