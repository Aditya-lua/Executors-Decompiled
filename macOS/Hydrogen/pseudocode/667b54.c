
void FUN_00667b54(void)

{
  uint uVar1;
  code *pcVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  undefined4 *puVar6;
  int *piVar7;
  ulong uVar8;
  char *pcVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  long unaff_x19;
  undefined4 *puVar19;
  undefined4 *puVar20;
  int *piVar21;
  int *piVar22;
  ulong *puVar23;
  long *plVar24;
  long *plVar25;
  ulong unaff_x21;
  undefined *unaff_x22;
  uint *puVar26;
  long *plVar27;
  ulong unaff_x23;
  int *piVar28;
  undefined8 unaff_x24;
  undefined4 *puVar29;
  long lVar30;
  int *piVar31;
  ulong unaff_x27;
  undefined4 *puVar32;
  long unaff_x29;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000038;
  long in_stack_00000048;
  int in_stack_00000050;
  byte in_stack_00000058;
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
  ulong in_stack_000000d8;
  ulong in_stack_000000e0;
  ulong in_stack_000000e8;
  undefined1 uStack00000000000000f0;
  
  while( true ) {
    unaff_x21 = unaff_x21 - 0x90;
    if (unaff_x21 == unaff_x23) break;
code_r0x00667b60:
    *(undefined8 *)(unaff_x21 - 0x30) = unaff_x24;
    lVar30 = *(long *)(unaff_x21 - 0x10);
    uVar13 = *(ulong *)(unaff_x21 - 0x20);
    if (*(ulong *)(unaff_x21 - 0x18) <= *(ulong *)(unaff_x21 - 0x20)) {
      uVar13 = *(ulong *)(unaff_x21 - 0x18);
    }
    if (lVar30 != 0) {
      if (uVar13 != 0) {
        do {
          *(undefined8 *)(lVar30 + -8 + uVar13 * 8) = 0;
          uVar13 = uVar13 - 1;
        } while (uVar13 != 0);
      }
      func_0x00611644();
    }
    *(undefined **)(unaff_x21 - 0x60) = unaff_x22 + 0x10;
    lVar30 = *(long *)(unaff_x21 - 0x40);
    uVar13 = *(ulong *)(unaff_x21 - 0x50);
    if (*(ulong *)(unaff_x21 - 0x48) <= *(ulong *)(unaff_x21 - 0x50)) {
      uVar13 = *(ulong *)(unaff_x21 - 0x48);
    }
    if (lVar30 != 0) {
      if (uVar13 != 0) {
        do {
          *(undefined8 *)(lVar30 + -8 + uVar13 * 8) = 0;
          uVar13 = uVar13 - 1;
        } while (uVar13 != 0);
      }
      func_0x00611644();
    }
    *(undefined **)(unaff_x21 - 0x90) = unaff_x22 + 0x10;
    lVar30 = *(long *)(unaff_x21 - 0x70);
    uVar13 = *(ulong *)(unaff_x21 - 0x80);
    if (*(ulong *)(unaff_x21 - 0x78) <= *(ulong *)(unaff_x21 - 0x80)) {
      uVar13 = *(ulong *)(unaff_x21 - 0x78);
    }
    if (lVar30 != 0) {
      if (uVar13 != 0) {
        do {
          *(undefined8 *)(lVar30 + -8 + uVar13 * 8) = 0;
          uVar13 = uVar13 - 1;
        } while (uVar13 != 0);
      }
      func_0x00611644();
    }
  }
LAB_00667afc:
  if (unaff_x23 != 0) {
    __ZdlPv(unaff_x23);
  }
  do {
    in_stack_000000e0 = unaff_x27;
    do {
      plVar27 = in_stack_00000078 + unaff_x19 * 3;
      puVar20 = (undefined4 *)(uStack00000000000000c0 + unaff_x19 * 0x70 + 0x68);
      plVar25 = plVar27 + 1;
      puVar19 = (undefined4 *)*plVar25;
      puVar6 = (undefined4 *)plVar27[2];
      if (puVar19 < puVar6) {
        puVar32 = puVar19 + 1;
        *puVar19 = *puVar20;
      }
      else {
        puVar29 = (undefined4 *)*plVar27;
        lVar30 = (long)puVar19 - (long)puVar29 >> 2;
        uVar13 = lVar30 + 1;
        if (uVar13 >> 0x3e != 0) {
          func_0x00017f90(plVar27);
          goto code_r0x00668808;
        }
        uVar8 = (long)puVar6 - (long)puVar29;
        uVar14 = (long)uVar8 >> 1;
        if (uVar14 <= uVar13) {
          uVar14 = uVar13;
        }
        if (0x7ffffffffffffffb < uVar8) {
          uVar14 = 0x3fffffffffffffff;
        }
        if (uVar14 == 0) {
          lVar10 = 0;
          puVar6 = (undefined4 *)(lVar30 * 4);
          *puVar6 = *puVar20;
        }
        else {
          if (uVar14 >> 0x3e != 0) goto code_r0x006687f4;
          lVar10 = __Znwm(uVar14 << 2);
          puVar6 = (undefined4 *)(lVar10 + lVar30 * 4);
          *puVar6 = *puVar20;
        }
        puVar32 = puVar6 + 1;
        if (puVar19 != puVar29) {
          uVar13 = (long)puVar19 + (-4 - (long)puVar29);
          puVar20 = puVar19;
          if ((0x3b < uVar13) &&
             (0x3f < (ulong)((long)puVar19 - (lVar10 + ((long)puVar19 - (long)puVar29))))) {
            uVar13 = (uVar13 >> 2) + 1;
            uVar16 = uVar13 & 0x7ffffffffffffff0;
            puVar20 = puVar19 + -uVar16;
            puVar6 = puVar6 + -uVar16;
            puVar18 = (undefined8 *)(puVar19 + -8);
            puVar17 = (undefined8 *)(lVar10 + lVar30 * 4 + -0x20);
            uVar8 = uVar16;
            do {
              uVar34 = *puVar18;
              uVar33 = puVar18[3];
              uVar5 = puVar18[2];
              uVar38 = puVar18[-3];
              uVar37 = puVar18[-4];
              uVar36 = puVar18[-1];
              uVar35 = puVar18[-2];
              puVar17[1] = puVar18[1];
              *puVar17 = uVar34;
              puVar17[3] = uVar33;
              puVar17[2] = uVar5;
              puVar17[-3] = uVar38;
              puVar17[-4] = uVar37;
              puVar17[-1] = uVar36;
              puVar17[-2] = uVar35;
              puVar18 = puVar18 + -8;
              puVar17 = puVar17 + -8;
              uVar8 = uVar8 - 0x10;
            } while (uVar8 != 0);
            if (uVar13 == uVar16) goto code_r0x00667d08;
          }
          do {
            puVar20 = puVar20 + -1;
            puVar6 = puVar6 + -1;
            *puVar6 = *puVar20;
          } while (puVar20 != puVar29);
        }
code_r0x00667d08:
        *plVar27 = (long)puVar6;
        *plVar25 = (long)puVar32;
        plVar27[2] = lVar10 + uVar14 * 4;
        if (puVar29 != (undefined4 *)0x0) {
          __ZdlPv(puVar29);
        }
      }
      uVar14 = in_stack_000000e0;
      uVar13 = in_stack_000000d8;
      *plVar25 = (long)puVar32;
      plVar27 = in_stack_000000a8 + unaff_x19 * 3;
      iVar4 = in_stack_00000028._4_4_ +
              (int)(in_stack_000000e0 - in_stack_000000d8 >> 4) * 0x38e38e39;
      plVar25 = plVar27 + 1;
      piVar21 = (int *)*plVar25;
      piVar7 = (int *)plVar27[2];
      if (piVar21 < piVar7) {
        piVar28 = piVar21 + 1;
        *piVar21 = iVar4;
      }
      else {
        piVar31 = (int *)*plVar27;
        lVar30 = (long)piVar21 - (long)piVar31 >> 2;
        uVar8 = lVar30 + 1;
        if (uVar8 >> 0x3e != 0) {
          func_0x00017f90(plVar27);
          goto code_r0x00668808;
        }
        uVar11 = (long)piVar7 - (long)piVar31;
        uVar16 = (long)uVar11 >> 1;
        if (uVar16 <= uVar8) {
          uVar16 = uVar8;
        }
        if (0x7ffffffffffffffb < uVar11) {
          uVar16 = 0x3fffffffffffffff;
        }
        if (uVar16 == 0) {
          lVar10 = 0;
          piVar7 = (int *)(lVar30 * 4);
          *piVar7 = iVar4;
        }
        else {
          if (uVar16 >> 0x3e != 0) {
            func_0x00017514();
            goto code_r0x00668808;
          }
          lVar10 = __Znwm(uVar16 << 2);
          piVar7 = (int *)(lVar10 + lVar30 * 4);
          *piVar7 = iVar4;
        }
        piVar28 = piVar7 + 1;
        if (piVar21 != piVar31) {
          uVar8 = (long)piVar21 + (-4 - (long)piVar31);
          piVar22 = piVar21;
          if ((0x3b < uVar8) &&
             (0x3f < (ulong)((long)piVar21 - (lVar10 + ((long)piVar21 - (long)piVar31))))) {
            uVar8 = (uVar8 >> 2) + 1;
            uVar15 = uVar8 & 0x7ffffffffffffff0;
            piVar22 = piVar21 + -uVar15;
            piVar7 = piVar7 + -uVar15;
            piVar21 = piVar21 + -8;
            puVar18 = (undefined8 *)(lVar10 + lVar30 * 4 + -0x20);
            uVar11 = uVar15;
            do {
              uVar34 = *(undefined8 *)piVar21;
              uVar33 = *(undefined8 *)(piVar21 + 6);
              uVar5 = *(undefined8 *)(piVar21 + 4);
              uVar38 = *(undefined8 *)(piVar21 + -6);
              uVar37 = *(undefined8 *)(piVar21 + -8);
              uVar36 = *(undefined8 *)(piVar21 + -2);
              uVar35 = *(undefined8 *)(piVar21 + -4);
              puVar18[1] = *(undefined8 *)(piVar21 + 2);
              *puVar18 = uVar34;
              puVar18[3] = uVar33;
              puVar18[2] = uVar5;
              puVar18[-3] = uVar38;
              puVar18[-4] = uVar37;
              puVar18[-1] = uVar36;
              puVar18[-2] = uVar35;
              piVar21 = piVar21 + -0x10;
              puVar18 = puVar18 + -8;
              uVar11 = uVar11 - 0x10;
            } while (uVar11 != 0);
            if (uVar8 == uVar15) goto code_r0x00667ea8;
          }
          do {
            piVar22 = piVar22 + -1;
            piVar7 = piVar7 + -1;
            *piVar7 = *piVar22;
          } while (piVar22 != piVar31);
        }
code_r0x00667ea8:
        *plVar27 = (long)piVar7;
        *plVar25 = (long)piVar28;
        plVar27[2] = lVar10 + uVar16 * 4;
        if (piVar31 != (int *)0x0) {
          __ZdlPv(piVar31);
        }
      }
      lVar30 = uStack00000000000000c0;
      *plVar25 = (long)piVar28;
      plVar27 = in_stack_00000090 + unaff_x19 * 3;
      puVar23 = (ulong *)(plVar27 + 1);
      uVar8 = *puVar23;
      if (uVar8 == plVar27[2] * 0x40) {
        if ((long)(uVar8 + 1) < 0) {
          func_0x00017f90(plVar27);
          goto code_r0x00668808;
        }
        uVar11 = plVar27[2] * 0x80;
        uVar16 = (uVar8 & 0xffffffffffffffc0) + 0x40;
        if (uVar11 <= uVar16) {
          uVar11 = uVar16;
        }
        uVar16 = 0x7fffffffffffffff;
        if (uVar8 < 0x3fffffffffffffff) {
          uVar16 = uVar11;
        }
        func_0x0008184c(plVar27,uVar16);
        uVar8 = *puVar23;
      }
      lVar10 = uStack00000000000000c0;
      *puVar23 = uVar8 + 1;
      lVar12 = *plVar27;
      uVar16 = uVar8 >> 6;
      uVar8 = 1L << (uVar8 & 0x3f);
      if (*(char *)(lVar30 + unaff_x19 * 0x70 + 0x6d) == '\0') {
        uVar8 = *(ulong *)(lVar12 + uVar16 * 8) & (uVar8 ^ 0xffffffffffffffff);
      }
      else {
        uVar8 = *(ulong *)(lVar12 + uVar16 * 8) | uVar8;
      }
      *(ulong *)(lVar12 + uVar16 * 8) = uVar8;
      lVar30 = uStack00000000000000c0 + unaff_x19 * 0x70;
      iVar4 = func_0x005fe094(lVar30);
      pcVar9 = (char *)(lVar10 + unaff_x19 * 0x70 + 0x6e);
      if (*pcVar9 == '\0') {
        uVar8 = (ulong)*(uint *)(lVar10 + unaff_x19 * 0x70 + 0x60);
      }
      else {
        uVar8 = 0;
      }
      *pcVar9 = '\0';
      uVar16 = func_0x005ffe3c(lVar30,uVar8);
      if ((uVar16 & 1) == 0) {
        lVar12 = 0;
        uVar1 = (uint)uVar8;
        if ((uint)uVar8 <= (uint)(iVar4 * 0x40)) {
          uVar1 = iVar4 * 0x40;
        }
        do {
          if ((uVar8 - uVar1) + lVar12 == 0) {
            bVar3 = true;
            *(undefined1 *)(lVar10 + unaff_x19 * 0x70 + 0x6f) = 1;
            if ((in_stack_00000058 & 1) != 0) goto code_r0x00668084;
            goto code_r0x00667960;
          }
          iVar4 = func_0x005ffe3c(lVar30,uVar8 + lVar12 + 1);
          lVar12 = lVar12 + 1;
        } while (iVar4 == 0);
        uVar8 = uVar8 + lVar12;
      }
      func_0x006078e0(lVar30,uVar8);
      lVar12 = lVar10 + unaff_x19 * 0x70;
      puVar26 = (uint *)(lVar12 + 0x60);
      *(int *)(lVar12 + 100) = *(int *)(lVar12 + 100) + (int)uVar8;
      iVar4 = func_0x00609cf4(lVar30,1L << ((ulong)*puVar26 & 0x3f));
      lVar12 = lVar10 + unaff_x19 * 0x70;
      piVar7 = (int *)(lVar12 + 0x68);
      *piVar7 = iVar4;
      if ((*(char *)(lVar12 + 0x6c) == '\0') ||
         (iVar4 = func_0x005ffe3c(lVar30,*puVar26), iVar4 == 0)) {
        *(undefined1 *)(lVar10 + unaff_x19 * 0x70 + 0x6d) = 0;
        bVar3 = true;
      }
      else {
        lVar10 = lVar10 + unaff_x19 * 0x70;
        bVar3 = true;
        *(undefined1 *)(lVar10 + 0x6d) = 1;
        *piVar7 = (1 << (ulong)(*puVar26 & 0x1f)) - *piVar7;
        func_0x00603158(lVar30,lVar10 + 0x30);
      }
      do {
        if ((in_stack_00000058 & 1) == 0) {
code_r0x00667960:
          in_stack_00000058 = *(char *)(uStack00000000000000c0 + unaff_x19 * 0x70 + 0x6f) == '\0';
          uVar8 = in_stack_000000d8;
        }
        else {
code_r0x00668084:
          in_stack_00000058 = true;
          uVar8 = in_stack_000000d8;
        }
        unaff_x19 = unaff_x19 + 1;
        in_stack_000000d8 = uVar8;
        if (unaff_x19 == in_stack_00000038) {
          if (!(bool)in_stack_00000058) {
            func_0x006692d4(*(undefined8 *)(in_stack_00000048 + 0x10),uVar8,uVar14);
            if (uVar14 != uVar8) {
              uVar13 = 1;
              uVar16 = 0;
              uVar14 = uVar8;
              do {
                uVar8 = uVar13;
                uVar13 = func_0x005ffc7c(uVar14 + uVar16 * 0x90 + 0x60);
                uVar14 = in_stack_000000d8;
                if ((uVar13 & 1) == 0) {
                  lVar10 = in_stack_000000d8 + uVar16 * 0x90;
                  lVar30 = lVar10 + 0x30;
                  lVar10 = lVar10 + 0x60;
                  uVar5 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x80))
                                    (*(long **)(in_stack_00000048 + 0x10),lVar30,lVar10);
                  func_0x005ffccc(lVar30,uVar5);
                  uVar5 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x90))
                                    (*(long **)(in_stack_00000048 + 0x10),lVar10);
                  func_0x005ffccc(lVar10,uVar5);
                  lVar12 = uVar14 + uVar16 * 0x90;
                  uVar5 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x80))
                                    (*(long **)(in_stack_00000048 + 0x10),lVar12,lVar10);
                  func_0x005ffccc(lVar12,uVar5);
                  uVar5 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x80))
                                    (*(long **)(in_stack_00000048 + 0x10),lVar30,lVar10);
                  func_0x005ffccc(lVar30,uVar5);
                }
                uVar13 = (ulong)((int)uVar8 + 1);
                uVar16 = uVar8;
              } while (uVar8 < (ulong)(((long)(in_stack_000000e0 - uVar14) >> 4) *
                                      -0x71c71c71c71c71c7));
            }
            uStack0000000000000060 = 0;
            in_stack_00000068 = 0;
            in_stack_00000070 = 0;
            if (in_stack_00000008._4_4_ != 0) {
              lVar30 = 0;
              do {
                func_0x00669608(&uStack0000000000000060,
                                (in_stack_000000a8 + lVar30 * 3)[1] - in_stack_000000a8[lVar30 * 3]
                                >> 2);
                lVar10 = in_stack_000000a8[lVar30 * 3];
                if ((in_stack_000000a8 + lVar30 * 3)[1] != lVar10) {
                  uVar13 = 0;
                  do {
                    uVar1 = *(uint *)(lVar10 + uVar13 * 4);
                    lVar12 = uVar14 + (ulong)uVar1 * 0x90;
                    iVar4 = func_0x005ffc7c(lVar12 + 0x60);
                    lVar10 = uStack0000000000000060 + uVar13 * 0xa0;
                    if (iVar4 == 0) {
                      *(undefined1 *)(lVar10 + 0x68) = 0;
                      func_0x005ffccc(lVar10 + 8,lVar12);
                      if ((*(ulong *)(in_stack_00000090[lVar30 * 3] +
                                     (uVar13 >> 3 & 0x1ffffffffffffff8)) >> (uVar13 & 0x3f) & 1) ==
                          0) {
                        lVar10 = uVar14 + (ulong)uVar1 * 0x90 + 0x30;
                      }
                      else {
                        lVar10 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x28))
                                           (*(long **)(in_stack_00000048 + 0x10),
                                            uVar14 + (ulong)uVar1 * 0x90 + 0x30);
                      }
                      func_0x005ffccc(uStack0000000000000060 + uVar13 * 0xa0 + 0x38,lVar10);
                    }
                    else {
                      *(undefined1 *)(lVar10 + 0x68) = 1;
                    }
                    func_0x005fe318(unaff_x29 + -0xd8,0,0,
                                    *(undefined4 *)(in_stack_00000078[lVar30 * 3] + uVar13 * 4));
                    func_0x005ffccc(uStack0000000000000060 + uVar13 * 0xa0 + 0x70,unaff_x29 + -0xd8)
                    ;
                    *(undefined **)(unaff_x29 + -0xd8) = &UNK_009f5d60;
                    lVar10 = *(long *)(unaff_x29 + -0xb8);
                    uVar8 = *(ulong *)(unaff_x29 + -200);
                    if (*(ulong *)(unaff_x29 + -0xc0) <= *(ulong *)(unaff_x29 + -200)) {
                      uVar8 = *(ulong *)(unaff_x29 + -0xc0);
                    }
                    if (lVar10 != 0) {
                      if (uVar8 != 0) {
                        do {
                          *(undefined8 *)(lVar10 + -8 + uVar8 * 8) = 0;
                          uVar8 = uVar8 - 1;
                        } while (uVar8 != 0);
                      }
                      func_0x00611644();
                    }
                    uVar13 = (ulong)((int)uVar13 + 1);
                    lVar10 = in_stack_000000a8[lVar30 * 3];
                  } while (uVar13 < (ulong)((in_stack_000000a8 + lVar30 * 3)[1] - lVar10 >> 2));
                }
                func_0x00633274(unaff_x29 + -0xd8,in_stack_00000048,uStack0000000000000060,
                                in_stack_00000068);
                func_0x005ffccc(in_stack_00000010 + lVar30 * 0x70 + 8,unaff_x29 + -0xd0);
                func_0x005ffccc(in_stack_00000010 + lVar30 * 0x70 + 0x38,unaff_x29 + -0xa0);
                *(undefined1 *)(in_stack_00000010 + lVar30 * 0x70 + 0x68) =
                     *(undefined1 *)(unaff_x29 + -0x70);
                *(undefined **)(unaff_x29 + -0xd8) = &UNK_00a09a40;
                *(undefined **)(unaff_x29 + -0xa0) = &UNK_009f5d60;
                lVar10 = *(long *)(unaff_x29 + -0x80);
                uVar13 = *(ulong *)(unaff_x29 + -0x90);
                if (*(ulong *)(unaff_x29 + -0x88) <= *(ulong *)(unaff_x29 + -0x90)) {
                  uVar13 = *(ulong *)(unaff_x29 + -0x88);
                }
                if (lVar10 != 0) {
                  if (uVar13 != 0) {
                    do {
                      *(undefined8 *)(lVar10 + -8 + uVar13 * 8) = 0;
                      uVar13 = uVar13 - 1;
                    } while (uVar13 != 0);
                  }
                  func_0x00611644();
                }
                *(undefined **)(unaff_x29 + -0xd0) = &UNK_009f5d60;
                lVar10 = *(long *)(unaff_x29 + -0xb0);
                uVar13 = *(ulong *)(unaff_x29 + -0xc0);
                if (*(ulong *)(unaff_x29 + -0xb8) <= *(ulong *)(unaff_x29 + -0xc0)) {
                  uVar13 = *(ulong *)(unaff_x29 + -0xb8);
                }
                if (lVar10 != 0) {
                  if (uVar13 != 0) {
                    do {
                      *(undefined8 *)(lVar10 + -8 + uVar13 * 8) = 0;
                      uVar13 = uVar13 - 1;
                    } while (uVar13 != 0);
                  }
                  func_0x00611644();
                }
                lVar10 = uStack0000000000000060;
                lVar30 = lVar30 + 1;
              } while (lVar30 != in_stack_00000038);
              lVar30 = in_stack_00000068;
              if (uStack0000000000000060 != 0) {
                for (; lVar30 != lVar10; lVar30 = lVar30 + -0xa0) {
                  *(undefined **)(lVar30 + -0x30) = &UNK_009f5d60;
                  lVar12 = *(long *)(lVar30 + -0x10);
                  uVar13 = *(ulong *)(lVar30 + -0x20);
                  if (*(ulong *)(lVar30 + -0x18) <= *(ulong *)(lVar30 + -0x20)) {
                    uVar13 = *(ulong *)(lVar30 + -0x18);
                  }
                  if (lVar12 != 0) {
                    if (uVar13 != 0) {
                      do {
                        *(undefined8 *)(lVar12 + -8 + uVar13 * 8) = 0;
                        uVar13 = uVar13 - 1;
                      } while (uVar13 != 0);
                    }
                    func_0x00611644();
                  }
                  func_0x0064f6d0(lVar30 + -0xa0);
                }
                in_stack_00000068 = lVar10;
                __ZdlPv(uStack0000000000000060);
              }
            }
            plVar27 = in_stack_00000078;
            if (in_stack_00000078 != (long *)0x0) {
              if (in_stack_00000080 != in_stack_00000078) {
                plVar25 = in_stack_00000080;
                do {
                  plVar24 = plVar25 + -3;
                  if (*plVar24 != 0) {
                    plVar25[-2] = *plVar24;
                    __ZdlPv();
                  }
                  plVar25 = plVar24;
                } while (plVar24 != plVar27);
              }
              in_stack_00000080 = plVar27;
              __ZdlPv(in_stack_00000078);
            }
            plVar25 = in_stack_00000090;
            plVar27 = in_stack_00000098;
            if (in_stack_00000090 != (long *)0x0) {
              while (plVar27 != plVar25) {
                plVar27 = plVar27 + -3;
                if (*plVar27 != 0) {
                  __ZdlPv();
                }
              }
              in_stack_00000098 = plVar25;
              __ZdlPv(in_stack_00000090);
            }
            plVar27 = in_stack_000000a8;
            if (in_stack_000000a8 != (long *)0x0) {
              if (in_stack_000000b0 != in_stack_000000a8) {
                plVar25 = in_stack_000000b0;
                do {
                  plVar24 = plVar25 + -3;
                  if (*plVar24 != 0) {
                    plVar25[-2] = *plVar24;
                    __ZdlPv();
                  }
                  plVar25 = plVar24;
                } while (plVar24 != plVar27);
              }
              in_stack_000000b0 = plVar27;
              __ZdlPv(in_stack_000000a8);
            }
            if (uStack00000000000000c0 != 0) {
              func_0x0064b344(&uStack00000000000000c0);
              __ZdlPv(uStack00000000000000c0);
            }
            uVar14 = in_stack_000000d8;
            uVar13 = in_stack_000000e0;
            if (in_stack_000000d8 != 0) {
              for (; uVar13 != uVar14; uVar13 = func_0x00669d7c(uVar13 - 0x90)) {
              }
              __ZdlPv(in_stack_000000d8);
            }
            func_0x0066a1ec(&uStack00000000000000f0);
            return;
          }
          func_0x00669084(&uStack00000000000000f0);
          in_stack_00000050 = in_stack_00000050 + 1;
          unaff_x19 = 0;
          bVar3 = false;
          in_stack_00000058 = false;
        }
      } while ((*(char *)(uStack00000000000000c0 + unaff_x19 * 0x70 + 0x6f) != '\0') ||
              (in_stack_00000050 != *(int *)(uStack00000000000000c0 + unaff_x19 * 0x70 + 100)));
    } while (bVar3);
    if (in_stack_000000e8 <= uVar14) break;
    func_0x00669e50(uVar14,in_stack_00000020);
    unaff_x27 = uVar14 + 0x90;
  } while( true );
  lVar30 = (long)(uVar14 - uVar13) >> 4;
  uVar14 = lVar30 * -0x71c71c71c71c71c7 + 1;
  if (0x1c71c71c71c71c7 < uVar14) {
    func_0x00017f90();
code_r0x00668808:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x66880c);
    (*pcVar2)();
  }
  lVar10 = (long)(in_stack_000000e8 - uVar13) >> 4;
  uVar13 = lVar10 * 0x1c71c71c71c71c72;
  if (uVar13 <= uVar14) {
    uVar13 = uVar14;
  }
  if (0xe38e38e38e38e2 < (ulong)(lVar10 * -0x71c71c71c71c71c7)) {
    uVar13 = 0x1c71c71c71c71c7;
  }
  if (uVar13 == 0) {
    lVar10 = 0;
  }
  else {
    if (0x1c71c71c71c71c7 < uVar13) {
code_r0x006687f4:
      func_0x00017514();
      goto code_r0x00668808;
    }
    lVar10 = __Znwm(uVar13 * 0x90);
  }
  lVar12 = lVar10 + lVar30 * 0x10;
  func_0x00669e50(lVar12,in_stack_00000020);
  uVar8 = in_stack_000000e0;
  uVar14 = in_stack_000000d8;
  uVar13 = lVar10 + uVar13 * 0x90;
  unaff_x27 = lVar12 + 0x90;
  for (lVar30 = 0; uVar16 = uVar8 + lVar30, uVar16 != uVar14; lVar30 = lVar30 + -0x90) {
    func_0x005fe0b4(lVar12 + lVar30 + -0x90,uVar16 - 0x90);
    lVar10 = uVar8 + lVar30;
    func_0x005fe0b4(lVar12 + lVar30 + -0x60,lVar10 + -0x60);
    func_0x005fe0b4(lVar12 + lVar30 + -0x30,lVar10 + -0x30);
  }
  bVar3 = in_stack_000000e0 != in_stack_000000d8;
  unaff_x22 = &UNK_009f5d50;
  unaff_x21 = in_stack_000000e0;
  unaff_x23 = in_stack_000000d8;
  unaff_x24 = in_stack_00000018;
  in_stack_000000d8 = lVar12 + lVar30;
  in_stack_000000e0 = unaff_x27;
  in_stack_000000e8 = uVar13;
  if (bVar3) goto code_r0x00667b60;
  goto LAB_00667afc;
}

