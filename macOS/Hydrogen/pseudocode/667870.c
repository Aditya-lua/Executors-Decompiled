
void FUN_00667870(undefined1 param_1 [16])

{
  long lVar1;
  uint uVar2;
  bool bVar3;
  ulong uVar4;
  code *pcVar5;
  bool bVar6;
  undefined1 uVar7;
  int iVar8;
  int iVar9;
  undefined8 uVar10;
  undefined4 *puVar11;
  int *piVar12;
  ulong uVar13;
  char *pcVar14;
  long lVar15;
  ulong uVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  undefined8 *puVar20;
  undefined8 *puVar21;
  long unaff_x19;
  long lVar22;
  undefined8 *unaff_x20;
  undefined4 *puVar23;
  undefined4 *puVar24;
  int *piVar25;
  int *piVar26;
  ulong *puVar27;
  long *plVar28;
  long *plVar29;
  long unaff_x22;
  uint *puVar30;
  long unaff_x23;
  long *plVar31;
  int *piVar32;
  ulong unaff_x25;
  undefined4 *puVar33;
  long lVar34;
  undefined2 unaff_w26;
  int *piVar35;
  undefined8 unaff_x27;
  long unaff_x28;
  undefined4 *puVar36;
  long unaff_x29;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 unaff_d8;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  ulong uStack0000000000000030;
  long in_stack_00000038;
  ulong uStack0000000000000040;
  long *in_stack_00000048;
  undefined8 uStack0000000000000060;
  long in_stack_00000068;
  undefined8 in_stack_00000070;
  long *in_stack_00000078;
  long *in_stack_00000080;
  long *in_stack_00000090;
  long *in_stack_00000098;
  long *in_stack_000000a8;
  long *in_stack_000000b0;
  undefined8 uStack00000000000000c0;
  ulong uStack00000000000000c8;
  ulong in_stack_000000d0;
  ulong in_stack_000000d8;
  ulong in_stack_000000e0;
  ulong in_stack_000000e8;
  undefined1 uStack00000000000000f0;
  undefined1 uStack00000000000000f8;
  
  uVar37 = param_1._8_8_;
  uVar10 = param_1._0_8_;
  do {
    *(undefined8 *)(unaff_x25 + 0x68) = uVar37;
    *(undefined8 *)(unaff_x25 + 0x60) = uVar10;
    uStack00000000000000c8 = unaff_x25 + 0x70;
    while( true ) {
      *(undefined8 *)(unaff_x29 + -0xa8) = unaff_x27;
      lVar22 = *(long *)(unaff_x29 + -0x88);
      uVar13 = *(ulong *)(unaff_x29 + -0x98);
      if (*(ulong *)(unaff_x29 + -0x90) <= *(ulong *)(unaff_x29 + -0x98)) {
        uVar13 = *(ulong *)(unaff_x29 + -0x90);
      }
      if (lVar22 != 0) {
        if (uVar13 != 0) {
          do {
            *(undefined8 *)(lVar22 + -8 + uVar13 * 8) = 0;
            uVar13 = uVar13 - 1;
          } while (uVar13 != 0);
        }
        func_0x00611644();
      }
      *(long *)(unaff_x29 + -0xd8) = unaff_x22 + 0x10;
      lVar22 = *(long *)(unaff_x29 + -0xb8);
      uVar13 = *(ulong *)(unaff_x29 + -200);
      if (*(ulong *)(unaff_x29 + -0xc0) <= *(ulong *)(unaff_x29 + -200)) {
        uVar13 = *(ulong *)(unaff_x29 + -0xc0);
      }
      if (lVar22 != 0) {
        if (uVar13 != 0) {
          do {
            *(undefined8 *)(lVar22 + -8 + uVar13 * 8) = 0;
            uVar13 = uVar13 - 1;
          } while (uVar13 != 0);
        }
        func_0x00611644();
      }
      func_0x006210f8(uStack00000000000000c0 + unaff_x19 * unaff_x28);
      unaff_x23 = unaff_x23 + 0x30;
      unaff_x19 = unaff_x19 + 1;
      if (unaff_x19 == in_stack_00000038) {
        if (in_stack_00000008._4_4_ != 0) {
          iVar9 = 0;
          uStack0000000000000040 = 0;
          uStack0000000000000030 = 0;
          goto code_r0x00667950;
        }
        uStack0000000000000040 = 0;
        goto code_r0x0066827c;
      }
      uVar7 = (**(code **)(*in_stack_00000048 + 0x30))();
      func_0x005fe0b4(unaff_x29 + -0xd8,unaff_x23);
      func_0x00604ce4();
      func_0x005fe0b4();
      *(undefined8 *)(unaff_x29 + -0x78) = unaff_d8;
      *(undefined4 *)(unaff_x29 + -0x70) = 0;
      *(undefined1 *)(unaff_x29 + -0x6c) = uVar7;
      *(undefined2 *)(unaff_x29 + -0x6b) = unaff_w26;
      *(undefined1 *)(unaff_x29 + -0x69) = 0;
      func_0x006075d4();
      unaff_x25 = uStack00000000000000c8;
      if (uStack00000000000000c8 < in_stack_000000d0) break;
      uStack00000000000000c8 = func_0x0064add4(&uStack00000000000000c0,unaff_x29 + -0xd8);
    }
    func_0x005fe0b4(uStack00000000000000c8,unaff_x29 + -0xd8);
    func_0x005fe0b4(unaff_x25 + 0x30);
    uVar37 = unaff_x20[1];
    uVar10 = *unaff_x20;
  } while( true );
code_r0x00667950:
  lVar22 = 0;
  bVar3 = false;
  bVar6 = false;
LAB_00667984:
  do {
    if ((*(char *)(uStack00000000000000c0 + lVar22 * 0x70 + 0x6f) == '\0') &&
       (iVar9 == *(int *)(uStack00000000000000c0 + lVar22 * 0x70 + 100))) {
      if (!bVar3) {
        if (uStack0000000000000040 < in_stack_000000e8) {
          func_0x00669e50(uStack0000000000000040,&uStack00000000000000f8);
          uStack0000000000000040 = uStack0000000000000040 + 0x90;
LAB_00667b0c:
          in_stack_000000e0 = uStack0000000000000040;
          goto LAB_00667b14;
        }
        lVar34 = (long)(uStack0000000000000040 - uStack0000000000000030) >> 4;
        uVar13 = lVar34 * -0x71c71c71c71c71c7 + 1;
        if (0x1c71c71c71c71c7 < uVar13) {
          func_0x00017f90();
          goto code_r0x00668808;
        }
        lVar15 = (long)(in_stack_000000e8 - uStack0000000000000030) >> 4;
        uVar19 = lVar15 * 0x1c71c71c71c71c72;
        if (uVar19 <= uVar13) {
          uVar19 = uVar13;
        }
        if (0xe38e38e38e38e2 < (ulong)(lVar15 * -0x71c71c71c71c71c7)) {
          uVar19 = 0x1c71c71c71c71c7;
        }
        if (uVar19 == 0) {
          lVar15 = 0;
LAB_00667a6c:
          lVar17 = lVar15 + lVar34 * 0x10;
          func_0x00669e50(lVar17,&uStack00000000000000f8);
          uVar16 = in_stack_000000e0;
          uVar13 = in_stack_000000d8;
          uStack0000000000000040 = lVar17 + 0x90;
          lVar34 = 0;
          while( true ) {
            uVar4 = in_stack_000000d8;
            uVar18 = uVar16 + lVar34;
            if (uVar18 == uVar13) break;
            func_0x005fe0b4(lVar17 + lVar34 + -0x90,uVar18 - 0x90);
            lVar1 = uVar16 + lVar34;
            func_0x005fe0b4(lVar17 + lVar34 + -0x60,lVar1 + -0x60);
            func_0x005fe0b4(lVar17 + lVar34 + -0x30,lVar1 + -0x30);
            lVar34 = lVar34 + -0x90;
          }
          in_stack_000000d8 = lVar17 + lVar34;
          in_stack_000000e8 = lVar15 + uVar19 * 0x90;
          uVar19 = uStack0000000000000040;
          for (uVar13 = in_stack_000000e0; in_stack_000000e0 = uVar19, uVar13 != uVar4;
              uVar13 = uVar13 - 0x90) {
            *(undefined **)(uVar13 - 0x30) = &UNK_009f5d60;
            lVar34 = *(long *)(uVar13 - 0x10);
            uVar19 = *(ulong *)(uVar13 - 0x20);
            if (*(ulong *)(uVar13 - 0x18) <= *(ulong *)(uVar13 - 0x20)) {
              uVar19 = *(ulong *)(uVar13 - 0x18);
            }
            if (lVar34 != 0) {
              if (uVar19 != 0) {
                do {
                  *(undefined8 *)(lVar34 + -8 + uVar19 * 8) = 0;
                  uVar19 = uVar19 - 1;
                } while (uVar19 != 0);
              }
              func_0x00611644();
            }
            *(undefined **)(uVar13 - 0x60) = &UNK_009f5d60;
            lVar34 = *(long *)(uVar13 - 0x40);
            uVar19 = *(ulong *)(uVar13 - 0x50);
            if (*(ulong *)(uVar13 - 0x48) <= *(ulong *)(uVar13 - 0x50)) {
              uVar19 = *(ulong *)(uVar13 - 0x48);
            }
            if (lVar34 != 0) {
              if (uVar19 != 0) {
                do {
                  *(undefined8 *)(lVar34 + -8 + uVar19 * 8) = 0;
                  uVar19 = uVar19 - 1;
                } while (uVar19 != 0);
              }
              func_0x00611644();
            }
            *(undefined **)(uVar13 - 0x90) = &UNK_009f5d60;
            lVar34 = *(long *)(uVar13 - 0x70);
            uVar19 = *(ulong *)(uVar13 - 0x80);
            if (*(ulong *)(uVar13 - 0x78) <= *(ulong *)(uVar13 - 0x80)) {
              uVar19 = *(ulong *)(uVar13 - 0x78);
            }
            if (lVar34 != 0) {
              if (uVar19 != 0) {
                do {
                  *(undefined8 *)(lVar34 + -8 + uVar19 * 8) = 0;
                  uVar19 = uVar19 - 1;
                } while (uVar19 != 0);
              }
              func_0x00611644();
            }
            uVar19 = in_stack_000000e0;
          }
          if (uVar4 != 0) {
            __ZdlPv(uVar4);
          }
          goto LAB_00667b0c;
        }
        if (uVar19 < 0x1c71c71c71c71c8) {
          lVar15 = __Znwm(uVar19 * 0x90);
          goto LAB_00667a6c;
        }
LAB_006687f4:
        func_0x00017514();
        goto code_r0x00668808;
      }
LAB_00667b14:
      plVar31 = in_stack_00000078 + lVar22 * 3;
      puVar24 = (undefined4 *)(uStack00000000000000c0 + lVar22 * 0x70 + 0x68);
      plVar29 = plVar31 + 1;
      puVar23 = (undefined4 *)*plVar29;
      puVar11 = (undefined4 *)plVar31[2];
      if (puVar23 < puVar11) {
        puVar36 = puVar23 + 1;
        *puVar23 = *puVar24;
      }
      else {
        puVar33 = (undefined4 *)*plVar31;
        lVar34 = (long)puVar23 - (long)puVar33 >> 2;
        uVar13 = lVar34 + 1;
        if (uVar13 >> 0x3e != 0) {
          func_0x00017f90(plVar31);
          goto code_r0x00668808;
        }
        uVar16 = (long)puVar11 - (long)puVar33;
        uVar19 = (long)uVar16 >> 1;
        if (uVar19 <= uVar13) {
          uVar19 = uVar13;
        }
        if (0x7ffffffffffffffb < uVar16) {
          uVar19 = 0x3fffffffffffffff;
        }
        if (uVar19 == 0) {
          lVar15 = 0;
          puVar11 = (undefined4 *)(lVar34 * 4);
          *puVar11 = *puVar24;
        }
        else {
          if (uVar19 >> 0x3e != 0) goto LAB_006687f4;
          lVar15 = __Znwm(uVar19 << 2);
          puVar11 = (undefined4 *)(lVar15 + lVar34 * 4);
          *puVar11 = *puVar24;
        }
        puVar36 = puVar11 + 1;
        if (puVar23 != puVar33) {
          uVar13 = (long)puVar23 + (-4 - (long)puVar33);
          puVar24 = puVar23;
          if ((0x3b < uVar13) &&
             (0x3f < (ulong)((long)puVar23 - (lVar15 + ((long)puVar23 - (long)puVar33))))) {
            uVar13 = (uVar13 >> 2) + 1;
            uVar18 = uVar13 & 0x7ffffffffffffff0;
            puVar24 = puVar23 + -uVar18;
            puVar11 = puVar11 + -uVar18;
            puVar21 = (undefined8 *)(puVar23 + -8);
            puVar20 = (undefined8 *)(lVar15 + lVar34 * 4 + -0x20);
            uVar16 = uVar18;
            do {
              uVar38 = *puVar21;
              uVar37 = puVar21[3];
              uVar10 = puVar21[2];
              uVar42 = puVar21[-3];
              uVar41 = puVar21[-4];
              uVar40 = puVar21[-1];
              uVar39 = puVar21[-2];
              puVar20[1] = puVar21[1];
              *puVar20 = uVar38;
              puVar20[3] = uVar37;
              puVar20[2] = uVar10;
              puVar20[-3] = uVar42;
              puVar20[-4] = uVar41;
              puVar20[-1] = uVar40;
              puVar20[-2] = uVar39;
              puVar21 = puVar21 + -8;
              puVar20 = puVar20 + -8;
              uVar16 = uVar16 - 0x10;
            } while (uVar16 != 0);
            if (uVar13 == uVar18) goto LAB_00667d08;
          }
          do {
            puVar24 = puVar24 + -1;
            puVar11 = puVar11 + -1;
            *puVar11 = *puVar24;
          } while (puVar24 != puVar33);
        }
LAB_00667d08:
        *plVar31 = (long)puVar11;
        *plVar29 = (long)puVar36;
        plVar31[2] = lVar15 + uVar19 * 4;
        if (puVar33 != (undefined4 *)0x0) {
          __ZdlPv(puVar33);
        }
      }
      *plVar29 = (long)puVar36;
      plVar31 = in_stack_000000a8 + lVar22 * 3;
      uStack0000000000000030 = in_stack_000000d8;
      iVar8 = (int)(in_stack_000000e0 - in_stack_000000d8 >> 4) * 0x38e38e39 + -1;
      plVar29 = plVar31 + 1;
      piVar25 = (int *)*plVar29;
      piVar12 = (int *)plVar31[2];
      uStack0000000000000040 = in_stack_000000e0;
      if (piVar25 < piVar12) {
        piVar32 = piVar25 + 1;
        *piVar25 = iVar8;
      }
      else {
        piVar35 = (int *)*plVar31;
        lVar34 = (long)piVar25 - (long)piVar35 >> 2;
        uVar13 = lVar34 + 1;
        if (uVar13 >> 0x3e != 0) {
          func_0x00017f90(plVar31);
          goto code_r0x00668808;
        }
        uVar16 = (long)piVar12 - (long)piVar35;
        uVar19 = (long)uVar16 >> 1;
        if (uVar19 <= uVar13) {
          uVar19 = uVar13;
        }
        if (0x7ffffffffffffffb < uVar16) {
          uVar19 = 0x3fffffffffffffff;
        }
        if (uVar19 == 0) {
          lVar15 = 0;
          piVar12 = (int *)(lVar34 * 4);
          *piVar12 = iVar8;
        }
        else {
          if (uVar19 >> 0x3e != 0) {
            func_0x00017514();
            goto code_r0x00668808;
          }
          lVar15 = __Znwm(uVar19 << 2);
          piVar12 = (int *)(lVar15 + lVar34 * 4);
          *piVar12 = iVar8;
        }
        piVar32 = piVar12 + 1;
        if (piVar25 != piVar35) {
          uVar13 = (long)piVar25 + (-4 - (long)piVar35);
          piVar26 = piVar25;
          if ((0x3b < uVar13) &&
             (0x3f < (ulong)((long)piVar25 - (lVar15 + ((long)piVar25 - (long)piVar35))))) {
            uVar13 = (uVar13 >> 2) + 1;
            uVar18 = uVar13 & 0x7ffffffffffffff0;
            piVar26 = piVar25 + -uVar18;
            piVar12 = piVar12 + -uVar18;
            piVar25 = piVar25 + -8;
            puVar21 = (undefined8 *)(lVar15 + lVar34 * 4 + -0x20);
            uVar16 = uVar18;
            do {
              uVar38 = *(undefined8 *)piVar25;
              uVar37 = *(undefined8 *)(piVar25 + 6);
              uVar10 = *(undefined8 *)(piVar25 + 4);
              uVar42 = *(undefined8 *)(piVar25 + -6);
              uVar41 = *(undefined8 *)(piVar25 + -8);
              uVar40 = *(undefined8 *)(piVar25 + -2);
              uVar39 = *(undefined8 *)(piVar25 + -4);
              puVar21[1] = *(undefined8 *)(piVar25 + 2);
              *puVar21 = uVar38;
              puVar21[3] = uVar37;
              puVar21[2] = uVar10;
              puVar21[-3] = uVar42;
              puVar21[-4] = uVar41;
              puVar21[-1] = uVar40;
              puVar21[-2] = uVar39;
              piVar25 = piVar25 + -0x10;
              puVar21 = puVar21 + -8;
              uVar16 = uVar16 - 0x10;
            } while (uVar16 != 0);
            if (uVar13 == uVar18) goto LAB_00667ea8;
          }
          do {
            piVar26 = piVar26 + -1;
            piVar12 = piVar12 + -1;
            *piVar12 = *piVar26;
          } while (piVar26 != piVar35);
        }
LAB_00667ea8:
        *plVar31 = (long)piVar12;
        *plVar29 = (long)piVar32;
        plVar31[2] = lVar15 + uVar19 * 4;
        if (piVar35 != (int *)0x0) {
          __ZdlPv(piVar35);
        }
      }
      lVar34 = uStack00000000000000c0;
      *plVar29 = (long)piVar32;
      plVar31 = in_stack_00000090 + lVar22 * 3;
      puVar27 = (ulong *)(plVar31 + 1);
      uVar13 = *puVar27;
      if (uVar13 == plVar31[2] * 0x40) {
        if ((long)(uVar13 + 1) < 0) {
          func_0x00017f90(plVar31);
code_r0x00668808:
                    /* WARNING: Does not return */
          pcVar5 = (code *)SoftwareBreakpoint(1,0x66880c);
          (*pcVar5)();
        }
        uVar16 = plVar31[2] * 0x80;
        uVar19 = (uVar13 & 0xffffffffffffffc0) + 0x40;
        if (uVar16 <= uVar19) {
          uVar16 = uVar19;
        }
        uVar19 = 0x7fffffffffffffff;
        if (uVar13 < 0x3fffffffffffffff) {
          uVar19 = uVar16;
        }
        func_0x0008184c(plVar31,uVar19);
        uVar13 = *puVar27;
      }
      lVar15 = uStack00000000000000c0;
      *puVar27 = uVar13 + 1;
      lVar17 = *plVar31;
      uVar19 = uVar13 >> 6;
      uVar13 = 1L << (uVar13 & 0x3f);
      if (*(char *)(lVar34 + lVar22 * 0x70 + 0x6d) == '\0') {
        uVar13 = *(ulong *)(lVar17 + uVar19 * 8) & (uVar13 ^ 0xffffffffffffffff);
      }
      else {
        uVar13 = *(ulong *)(lVar17 + uVar19 * 8) | uVar13;
      }
      *(ulong *)(lVar17 + uVar19 * 8) = uVar13;
      lVar34 = uStack00000000000000c0 + lVar22 * 0x70;
      iVar8 = func_0x005fe094(lVar34);
      pcVar14 = (char *)(lVar15 + lVar22 * 0x70 + 0x6e);
      if (*pcVar14 == '\0') {
        uVar13 = (ulong)*(uint *)(lVar15 + lVar22 * 0x70 + 0x60);
      }
      else {
        uVar13 = 0;
      }
      *pcVar14 = '\0';
      uVar19 = func_0x005ffe3c(lVar34,uVar13);
      if ((uVar19 & 1) == 0) {
        lVar17 = 0;
        uVar2 = (uint)uVar13;
        if ((uint)uVar13 <= (uint)(iVar8 * 0x40)) {
          uVar2 = iVar8 * 0x40;
        }
        do {
          if ((uVar13 - uVar2) + lVar17 == 0) {
            bVar3 = true;
            *(undefined1 *)(lVar15 + lVar22 * 0x70 + 0x6f) = 1;
            if (!bVar6) goto code_r0x00667960;
            goto code_r0x00668084;
          }
          iVar8 = func_0x005ffe3c(lVar34,uVar13 + lVar17 + 1);
          lVar17 = lVar17 + 1;
        } while (iVar8 == 0);
        uVar13 = uVar13 + lVar17;
      }
      func_0x006078e0(lVar34,uVar13);
      lVar17 = lVar15 + lVar22 * 0x70;
      puVar30 = (uint *)(lVar17 + 0x60);
      *(int *)(lVar17 + 100) = *(int *)(lVar17 + 100) + (int)uVar13;
      iVar8 = func_0x00609cf4(lVar34,1L << ((ulong)*puVar30 & 0x3f));
      lVar17 = lVar15 + lVar22 * 0x70;
      piVar12 = (int *)(lVar17 + 0x68);
      *piVar12 = iVar8;
      if ((*(char *)(lVar17 + 0x6c) == '\0') ||
         (iVar8 = func_0x005ffe3c(lVar34,*puVar30), iVar8 == 0)) {
        *(undefined1 *)(lVar15 + lVar22 * 0x70 + 0x6d) = 0;
        bVar3 = true;
      }
      else {
        lVar15 = lVar15 + lVar22 * 0x70;
        bVar3 = true;
        *(undefined1 *)(lVar15 + 0x6d) = 1;
        *piVar12 = (1 << (ulong)(*puVar30 & 0x1f)) - *piVar12;
        func_0x00603158(lVar34,lVar15 + 0x30);
      }
    }
    if (bVar6) {
code_r0x00668084:
      bVar6 = true;
      lVar22 = lVar22 + 1;
      if (lVar22 == in_stack_00000038) break;
      goto LAB_00667984;
    }
code_r0x00667960:
    bVar6 = *(char *)(uStack00000000000000c0 + lVar22 * 0x70 + 0x6f) == '\0';
    lVar22 = lVar22 + 1;
  } while (lVar22 != in_stack_00000038);
  if (!bVar6) {
code_r0x0066827c:
    uVar13 = in_stack_000000d8;
    func_0x006692d4(in_stack_00000048[2],in_stack_000000d8,uStack0000000000000040);
    if (uStack0000000000000040 != uVar13) {
      uVar19 = 1;
      uVar16 = 0;
      uStack0000000000000040 = uVar13;
      do {
        uVar18 = uVar19;
        uVar13 = func_0x005ffc7c(uStack0000000000000040 + uVar16 * 0x90 + 0x60);
        uStack0000000000000040 = in_stack_000000d8;
        if ((uVar13 & 1) == 0) {
          lVar34 = in_stack_000000d8 + uVar16 * 0x90;
          lVar22 = lVar34 + 0x30;
          lVar34 = lVar34 + 0x60;
          uVar10 = (**(code **)(*(long *)in_stack_00000048[2] + 0x80))
                             ((long *)in_stack_00000048[2],lVar22,lVar34);
          func_0x005ffccc(lVar22,uVar10);
          uVar10 = (**(code **)(*(long *)in_stack_00000048[2] + 0x90))
                             ((long *)in_stack_00000048[2],lVar34);
          func_0x005ffccc(lVar34,uVar10);
          lVar15 = uStack0000000000000040 + uVar16 * 0x90;
          uVar10 = (**(code **)(*(long *)in_stack_00000048[2] + 0x80))
                             ((long *)in_stack_00000048[2],lVar15,lVar34);
          func_0x005ffccc(lVar15,uVar10);
          uVar10 = (**(code **)(*(long *)in_stack_00000048[2] + 0x80))
                             ((long *)in_stack_00000048[2],lVar22,lVar34);
          func_0x005ffccc(lVar22,uVar10);
        }
        uVar19 = (ulong)((int)uVar18 + 1);
        uVar16 = uVar18;
      } while (uVar18 < (ulong)(((long)(in_stack_000000e0 - uStack0000000000000040) >> 4) *
                               -0x71c71c71c71c71c7));
    }
    uStack0000000000000060 = 0;
    in_stack_00000068 = 0;
    in_stack_00000070 = 0;
    if (in_stack_00000008._4_4_ != 0) {
      lVar22 = 0;
      do {
        func_0x00669608(&uStack0000000000000060,
                        (in_stack_000000a8 + lVar22 * 3)[1] - in_stack_000000a8[lVar22 * 3] >> 2);
        lVar34 = in_stack_000000a8[lVar22 * 3];
        if ((in_stack_000000a8 + lVar22 * 3)[1] != lVar34) {
          uVar13 = 0;
          do {
            uVar2 = *(uint *)(lVar34 + uVar13 * 4);
            lVar15 = uStack0000000000000040 + (ulong)uVar2 * 0x90;
            iVar9 = func_0x005ffc7c(lVar15 + 0x60);
            lVar34 = uStack0000000000000060 + uVar13 * 0xa0;
            if (iVar9 == 0) {
              *(undefined1 *)(lVar34 + 0x68) = 0;
              func_0x005ffccc(lVar34 + 8,lVar15);
              if ((*(ulong *)(in_stack_00000090[lVar22 * 3] + (uVar13 >> 3 & 0x1ffffffffffffff8)) >>
                   (uVar13 & 0x3f) & 1) == 0) {
                lVar34 = uStack0000000000000040 + (ulong)uVar2 * 0x90 + 0x30;
              }
              else {
                lVar34 = (**(code **)(*(long *)in_stack_00000048[2] + 0x28))
                                   ((long *)in_stack_00000048[2],
                                    uStack0000000000000040 + (ulong)uVar2 * 0x90 + 0x30);
              }
              func_0x005ffccc(uStack0000000000000060 + uVar13 * 0xa0 + 0x38,lVar34);
            }
            else {
              *(undefined1 *)(lVar34 + 0x68) = 1;
            }
            func_0x005fe318(unaff_x29 + -0xd8,0,0,
                            *(undefined4 *)(in_stack_00000078[lVar22 * 3] + uVar13 * 4));
            func_0x005ffccc(uStack0000000000000060 + uVar13 * 0xa0 + 0x70,unaff_x29 + -0xd8);
            *(undefined **)(unaff_x29 + -0xd8) = &UNK_009f5d60;
            lVar34 = *(long *)(unaff_x29 + -0xb8);
            uVar19 = *(ulong *)(unaff_x29 + -200);
            if (*(ulong *)(unaff_x29 + -0xc0) <= *(ulong *)(unaff_x29 + -200)) {
              uVar19 = *(ulong *)(unaff_x29 + -0xc0);
            }
            if (lVar34 != 0) {
              if (uVar19 != 0) {
                do {
                  *(undefined8 *)(lVar34 + -8 + uVar19 * 8) = 0;
                  uVar19 = uVar19 - 1;
                } while (uVar19 != 0);
              }
              func_0x00611644();
            }
            uVar13 = (ulong)((int)uVar13 + 1);
            lVar34 = in_stack_000000a8[lVar22 * 3];
          } while (uVar13 < (ulong)((in_stack_000000a8 + lVar22 * 3)[1] - lVar34 >> 2));
        }
        func_0x00633274(unaff_x29 + -0xd8,in_stack_00000048,uStack0000000000000060,in_stack_00000068
                       );
        func_0x005ffccc(in_stack_00000010 + lVar22 * 0x70 + 8,unaff_x29 + -0xd0);
        func_0x005ffccc(in_stack_00000010 + lVar22 * 0x70 + 0x38,unaff_x29 + -0xa0);
        *(undefined1 *)(in_stack_00000010 + lVar22 * 0x70 + 0x68) =
             *(undefined1 *)(unaff_x29 + -0x70);
        *(undefined **)(unaff_x29 + -0xd8) = &UNK_00a09a40;
        *(undefined **)(unaff_x29 + -0xa0) = &UNK_009f5d60;
        lVar34 = *(long *)(unaff_x29 + -0x80);
        uVar13 = *(ulong *)(unaff_x29 + -0x90);
        if (*(ulong *)(unaff_x29 + -0x88) <= *(ulong *)(unaff_x29 + -0x90)) {
          uVar13 = *(ulong *)(unaff_x29 + -0x88);
        }
        if (lVar34 != 0) {
          if (uVar13 != 0) {
            do {
              *(undefined8 *)(lVar34 + -8 + uVar13 * 8) = 0;
              uVar13 = uVar13 - 1;
            } while (uVar13 != 0);
          }
          func_0x00611644();
        }
        *(undefined **)(unaff_x29 + -0xd0) = &UNK_009f5d60;
        lVar34 = *(long *)(unaff_x29 + -0xb0);
        uVar13 = *(ulong *)(unaff_x29 + -0xc0);
        if (*(ulong *)(unaff_x29 + -0xb8) <= *(ulong *)(unaff_x29 + -0xc0)) {
          uVar13 = *(ulong *)(unaff_x29 + -0xb8);
        }
        if (lVar34 != 0) {
          if (uVar13 != 0) {
            do {
              *(undefined8 *)(lVar34 + -8 + uVar13 * 8) = 0;
              uVar13 = uVar13 - 1;
            } while (uVar13 != 0);
          }
          func_0x00611644();
        }
        lVar34 = uStack0000000000000060;
        lVar22 = lVar22 + 1;
      } while (lVar22 != in_stack_00000038);
      lVar22 = in_stack_00000068;
      if (uStack0000000000000060 != 0) {
        for (; lVar22 != lVar34; lVar22 = lVar22 + -0xa0) {
          *(undefined **)(lVar22 + -0x30) = &UNK_009f5d60;
          lVar15 = *(long *)(lVar22 + -0x10);
          uVar13 = *(ulong *)(lVar22 + -0x20);
          if (*(ulong *)(lVar22 + -0x18) <= *(ulong *)(lVar22 + -0x20)) {
            uVar13 = *(ulong *)(lVar22 + -0x18);
          }
          if (lVar15 != 0) {
            if (uVar13 != 0) {
              do {
                *(undefined8 *)(lVar15 + -8 + uVar13 * 8) = 0;
                uVar13 = uVar13 - 1;
              } while (uVar13 != 0);
            }
            func_0x00611644();
          }
          func_0x0064f6d0(lVar22 + -0xa0);
        }
        in_stack_00000068 = lVar34;
        __ZdlPv(uStack0000000000000060);
      }
    }
    plVar31 = in_stack_00000078;
    if (in_stack_00000078 != (long *)0x0) {
      if (in_stack_00000080 != in_stack_00000078) {
        plVar29 = in_stack_00000080;
        do {
          plVar28 = plVar29 + -3;
          if (*plVar28 != 0) {
            plVar29[-2] = *plVar28;
            __ZdlPv();
          }
          plVar29 = plVar28;
        } while (plVar28 != plVar31);
      }
      in_stack_00000080 = plVar31;
      __ZdlPv(in_stack_00000078);
    }
    plVar29 = in_stack_00000090;
    plVar31 = in_stack_00000098;
    if (in_stack_00000090 != (long *)0x0) {
      while (plVar31 != plVar29) {
        plVar31 = plVar31 + -3;
        if (*plVar31 != 0) {
          __ZdlPv();
        }
      }
      in_stack_00000098 = plVar29;
      __ZdlPv(in_stack_00000090);
    }
    plVar31 = in_stack_000000a8;
    if (in_stack_000000a8 != (long *)0x0) {
      if (in_stack_000000b0 != in_stack_000000a8) {
        plVar29 = in_stack_000000b0;
        do {
          plVar28 = plVar29 + -3;
          if (*plVar28 != 0) {
            plVar29[-2] = *plVar28;
            __ZdlPv();
          }
          plVar29 = plVar28;
        } while (plVar28 != plVar31);
      }
      in_stack_000000b0 = plVar31;
      __ZdlPv(in_stack_000000a8);
    }
    if (uStack00000000000000c0 != 0) {
      func_0x0064b344(&uStack00000000000000c0);
      __ZdlPv(uStack00000000000000c0);
    }
    uVar19 = in_stack_000000d8;
    uVar13 = in_stack_000000e0;
    if (in_stack_000000d8 != 0) {
      for (; uVar13 != uVar19; uVar13 = func_0x00669d7c(uVar13 - 0x90)) {
      }
      __ZdlPv(in_stack_000000d8);
    }
    func_0x0066a1ec(&uStack00000000000000f0);
    return;
  }
  func_0x00669084(&uStack00000000000000f0);
  iVar9 = iVar9 + 1;
  goto code_r0x00667950;
}

