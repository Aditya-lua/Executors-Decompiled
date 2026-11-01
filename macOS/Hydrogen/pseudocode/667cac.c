
void FUN_00667cac(undefined4 *param_1,long param_2)

{
  undefined4 *puVar1;
  long lVar2;
  uint uVar3;
  bool bVar4;
  code *pcVar5;
  int iVar6;
  undefined8 uVar7;
  int *piVar8;
  ulong uVar9;
  char *pcVar10;
  long lVar11;
  ulong in_x9;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  ulong uVar19;
  ulong in_x15;
  long unaff_x19;
  undefined4 *unaff_x20;
  int *piVar20;
  int *piVar21;
  ulong *puVar22;
  long *plVar23;
  long *plVar24;
  long *unaff_x21;
  uint *puVar25;
  long *unaff_x23;
  int *piVar26;
  long unaff_x24;
  undefined4 *unaff_x25;
  long *plVar27;
  long lVar28;
  long *unaff_x26;
  int *piVar29;
  undefined4 *unaff_x28;
  long unaff_x29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
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
  
code_r0x00667cac:
  uVar14 = in_x9 & 0x7ffffffffffffff0;
  param_1 = param_1 + -uVar14;
  puVar18 = (undefined8 *)(unaff_x20 + -8);
  puVar17 = (undefined8 *)(param_2 + unaff_x24 * 4 + -0x20);
  uVar19 = uVar14;
  do {
    uVar31 = *puVar18;
    uVar30 = puVar18[3];
    uVar7 = puVar18[2];
    uVar35 = puVar18[-3];
    uVar34 = puVar18[-4];
    uVar33 = puVar18[-1];
    uVar32 = puVar18[-2];
    puVar17[1] = puVar18[1];
    *puVar17 = uVar31;
    puVar17[3] = uVar30;
    puVar17[2] = uVar7;
    puVar17[-3] = uVar35;
    puVar17[-4] = uVar34;
    puVar17[-1] = uVar33;
    puVar17[-2] = uVar32;
    puVar18 = puVar18 + -8;
    puVar17 = puVar17 + -8;
    uVar19 = uVar19 - 0x10;
  } while (uVar19 != 0);
  unaff_x20 = unaff_x20 + -uVar14;
  if (in_x9 == uVar14) goto LAB_00667d08;
LAB_00667cf8:
  do {
    unaff_x20 = unaff_x20 + -1;
    param_1 = param_1 + -1;
    *param_1 = *unaff_x20;
  } while (unaff_x20 != unaff_x25);
LAB_00667d08:
  *unaff_x23 = (long)param_1;
  *unaff_x26 = (long)unaff_x28;
  *unaff_x21 = param_2 + in_x15 * 4;
  if (unaff_x25 != (undefined4 *)0x0) {
    __ZdlPv(unaff_x25);
  }
  do {
    uVar19 = in_stack_000000e0;
    uVar14 = in_stack_000000d8;
    *unaff_x26 = (long)unaff_x28;
    plVar27 = in_stack_000000a8 + unaff_x19 * 3;
    iVar6 = in_stack_00000028._4_4_ + (int)(in_stack_000000e0 - in_stack_000000d8 >> 4) * 0x38e38e39
    ;
    plVar24 = plVar27 + 1;
    piVar20 = (int *)*plVar24;
    piVar8 = (int *)plVar27[2];
    if (piVar20 < piVar8) {
      piVar26 = piVar20 + 1;
      *piVar20 = iVar6;
    }
    else {
      piVar29 = (int *)*plVar27;
      lVar28 = (long)piVar20 - (long)piVar29 >> 2;
      uVar9 = lVar28 + 1;
      if (uVar9 >> 0x3e != 0) {
        func_0x00017f90(plVar27);
        goto code_r0x00668808;
      }
      uVar12 = (long)piVar8 - (long)piVar29;
      uVar16 = (long)uVar12 >> 1;
      if (uVar16 <= uVar9) {
        uVar16 = uVar9;
      }
      if (0x7ffffffffffffffb < uVar12) {
        uVar16 = 0x3fffffffffffffff;
      }
      if (uVar16 == 0) {
        lVar11 = 0;
        piVar8 = (int *)(lVar28 * 4);
        *piVar8 = iVar6;
      }
      else {
        if (uVar16 >> 0x3e != 0) {
          func_0x00017514();
          goto code_r0x00668808;
        }
        lVar11 = __Znwm(uVar16 << 2);
        piVar8 = (int *)(lVar11 + lVar28 * 4);
        *piVar8 = iVar6;
      }
      piVar26 = piVar8 + 1;
      if (piVar20 != piVar29) {
        uVar9 = (long)piVar20 + (-4 - (long)piVar29);
        piVar21 = piVar20;
        if ((0x3b < uVar9) &&
           (0x3f < (ulong)((long)piVar20 - (lVar11 + ((long)piVar20 - (long)piVar29))))) {
          uVar9 = (uVar9 >> 2) + 1;
          uVar15 = uVar9 & 0x7ffffffffffffff0;
          piVar21 = piVar20 + -uVar15;
          piVar8 = piVar8 + -uVar15;
          piVar20 = piVar20 + -8;
          puVar18 = (undefined8 *)(lVar11 + lVar28 * 4 + -0x20);
          uVar12 = uVar15;
          do {
            uVar31 = *(undefined8 *)piVar20;
            uVar30 = *(undefined8 *)(piVar20 + 6);
            uVar7 = *(undefined8 *)(piVar20 + 4);
            uVar35 = *(undefined8 *)(piVar20 + -6);
            uVar34 = *(undefined8 *)(piVar20 + -8);
            uVar33 = *(undefined8 *)(piVar20 + -2);
            uVar32 = *(undefined8 *)(piVar20 + -4);
            puVar18[1] = *(undefined8 *)(piVar20 + 2);
            *puVar18 = uVar31;
            puVar18[3] = uVar30;
            puVar18[2] = uVar7;
            puVar18[-3] = uVar35;
            puVar18[-4] = uVar34;
            puVar18[-1] = uVar33;
            puVar18[-2] = uVar32;
            piVar20 = piVar20 + -0x10;
            puVar18 = puVar18 + -8;
            uVar12 = uVar12 - 0x10;
          } while (uVar12 != 0);
          if (uVar9 == uVar15) goto LAB_00667ea8;
        }
        do {
          piVar21 = piVar21 + -1;
          piVar8 = piVar8 + -1;
          *piVar8 = *piVar21;
        } while (piVar21 != piVar29);
      }
LAB_00667ea8:
      *plVar27 = (long)piVar8;
      *plVar24 = (long)piVar26;
      plVar27[2] = lVar11 + uVar16 * 4;
      if (piVar29 != (int *)0x0) {
        __ZdlPv(piVar29);
      }
    }
    lVar28 = uStack00000000000000c0;
    *plVar24 = (long)piVar26;
    plVar27 = in_stack_00000090 + unaff_x19 * 3;
    puVar22 = (ulong *)(plVar27 + 1);
    uVar9 = *puVar22;
    if (uVar9 == plVar27[2] * 0x40) {
      if ((long)(uVar9 + 1) < 0) {
        func_0x00017f90(plVar27);
        goto code_r0x00668808;
      }
      uVar12 = plVar27[2] * 0x80;
      uVar16 = (uVar9 & 0xffffffffffffffc0) + 0x40;
      if (uVar12 <= uVar16) {
        uVar12 = uVar16;
      }
      uVar16 = 0x7fffffffffffffff;
      if (uVar9 < 0x3fffffffffffffff) {
        uVar16 = uVar12;
      }
      func_0x0008184c(plVar27,uVar16);
      uVar9 = *puVar22;
    }
    lVar11 = uStack00000000000000c0;
    *puVar22 = uVar9 + 1;
    lVar13 = *plVar27;
    uVar16 = uVar9 >> 6;
    uVar9 = 1L << (uVar9 & 0x3f);
    if (*(char *)(lVar28 + unaff_x19 * 0x70 + 0x6d) == '\0') {
      uVar9 = *(ulong *)(lVar13 + uVar16 * 8) & (uVar9 ^ 0xffffffffffffffff);
    }
    else {
      uVar9 = *(ulong *)(lVar13 + uVar16 * 8) | uVar9;
    }
    *(ulong *)(lVar13 + uVar16 * 8) = uVar9;
    lVar28 = uStack00000000000000c0 + unaff_x19 * 0x70;
    iVar6 = func_0x005fe094(lVar28);
    pcVar10 = (char *)(lVar11 + unaff_x19 * 0x70 + 0x6e);
    if (*pcVar10 == '\0') {
      uVar9 = (ulong)*(uint *)(lVar11 + unaff_x19 * 0x70 + 0x60);
    }
    else {
      uVar9 = 0;
    }
    *pcVar10 = '\0';
    uVar16 = func_0x005ffe3c(lVar28,uVar9);
    if ((uVar16 & 1) == 0) {
      lVar13 = 0;
      uVar3 = (uint)uVar9;
      if ((uint)uVar9 <= (uint)(iVar6 * 0x40)) {
        uVar3 = iVar6 * 0x40;
      }
      do {
        if ((uVar9 - uVar3) + lVar13 == 0) {
          bVar4 = true;
          *(undefined1 *)(lVar11 + unaff_x19 * 0x70 + 0x6f) = 1;
          if ((in_stack_00000058 & 1) != 0) goto code_r0x00668084;
          goto code_r0x00667960;
        }
        iVar6 = func_0x005ffe3c(lVar28,uVar9 + lVar13 + 1);
        lVar13 = lVar13 + 1;
      } while (iVar6 == 0);
      uVar9 = uVar9 + lVar13;
    }
    func_0x006078e0(lVar28,uVar9);
    lVar13 = lVar11 + unaff_x19 * 0x70;
    puVar25 = (uint *)(lVar13 + 0x60);
    *(int *)(lVar13 + 100) = *(int *)(lVar13 + 100) + (int)uVar9;
    iVar6 = func_0x00609cf4(lVar28,1L << ((ulong)*puVar25 & 0x3f));
    lVar13 = lVar11 + unaff_x19 * 0x70;
    piVar8 = (int *)(lVar13 + 0x68);
    *piVar8 = iVar6;
    if ((*(char *)(lVar13 + 0x6c) == '\0') || (iVar6 = func_0x005ffe3c(lVar28,*puVar25), iVar6 == 0)
       ) {
      *(undefined1 *)(lVar11 + unaff_x19 * 0x70 + 0x6d) = 0;
      bVar4 = true;
    }
    else {
      lVar11 = lVar11 + unaff_x19 * 0x70;
      bVar4 = true;
      *(undefined1 *)(lVar11 + 0x6d) = 1;
      *piVar8 = (1 << (ulong)(*puVar25 & 0x1f)) - *piVar8;
      func_0x00603158(lVar28,lVar11 + 0x30);
    }
    do {
      if ((in_stack_00000058 & 1) == 0) {
code_r0x00667960:
        in_stack_00000058 = *(char *)(uStack00000000000000c0 + unaff_x19 * 0x70 + 0x6f) == '\0';
        uVar9 = in_stack_000000d8;
      }
      else {
code_r0x00668084:
        in_stack_00000058 = true;
        uVar9 = in_stack_000000d8;
      }
      unaff_x19 = unaff_x19 + 1;
      in_stack_000000d8 = uVar9;
      if (unaff_x19 == in_stack_00000038) {
        if (!(bool)in_stack_00000058) {
          func_0x006692d4(*(undefined8 *)(in_stack_00000048 + 0x10),uVar9,uVar19);
          if (uVar19 != uVar9) {
            uVar14 = 1;
            uVar16 = 0;
            uVar19 = uVar9;
            do {
              uVar9 = uVar14;
              uVar14 = func_0x005ffc7c(uVar19 + uVar16 * 0x90 + 0x60);
              uVar19 = in_stack_000000d8;
              if ((uVar14 & 1) == 0) {
                lVar11 = in_stack_000000d8 + uVar16 * 0x90;
                lVar28 = lVar11 + 0x30;
                lVar11 = lVar11 + 0x60;
                uVar7 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x80))
                                  (*(long **)(in_stack_00000048 + 0x10),lVar28,lVar11);
                func_0x005ffccc(lVar28,uVar7);
                uVar7 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x90))
                                  (*(long **)(in_stack_00000048 + 0x10),lVar11);
                func_0x005ffccc(lVar11,uVar7);
                lVar13 = uVar19 + uVar16 * 0x90;
                uVar7 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x80))
                                  (*(long **)(in_stack_00000048 + 0x10),lVar13,lVar11);
                func_0x005ffccc(lVar13,uVar7);
                uVar7 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x80))
                                  (*(long **)(in_stack_00000048 + 0x10),lVar28,lVar11);
                func_0x005ffccc(lVar28,uVar7);
              }
              uVar14 = (ulong)((int)uVar9 + 1);
              uVar16 = uVar9;
            } while (uVar9 < (ulong)(((long)(in_stack_000000e0 - uVar19) >> 4) * -0x71c71c71c71c71c7
                                    ));
          }
          uStack0000000000000060 = 0;
          in_stack_00000068 = 0;
          in_stack_00000070 = 0;
          if (in_stack_00000008._4_4_ != 0) {
            lVar28 = 0;
            do {
              func_0x00669608(&uStack0000000000000060,
                              (in_stack_000000a8 + lVar28 * 3)[1] - in_stack_000000a8[lVar28 * 3] >>
                              2);
              lVar11 = in_stack_000000a8[lVar28 * 3];
              if ((in_stack_000000a8 + lVar28 * 3)[1] != lVar11) {
                uVar14 = 0;
                do {
                  uVar3 = *(uint *)(lVar11 + uVar14 * 4);
                  lVar13 = uVar19 + (ulong)uVar3 * 0x90;
                  iVar6 = func_0x005ffc7c(lVar13 + 0x60);
                  lVar11 = uStack0000000000000060 + uVar14 * 0xa0;
                  if (iVar6 == 0) {
                    *(undefined1 *)(lVar11 + 0x68) = 0;
                    func_0x005ffccc(lVar11 + 8,lVar13);
                    if ((*(ulong *)(in_stack_00000090[lVar28 * 3] +
                                   (uVar14 >> 3 & 0x1ffffffffffffff8)) >> (uVar14 & 0x3f) & 1) == 0)
                    {
                      lVar11 = uVar19 + (ulong)uVar3 * 0x90 + 0x30;
                    }
                    else {
                      lVar11 = (**(code **)(**(long **)(in_stack_00000048 + 0x10) + 0x28))
                                         (*(long **)(in_stack_00000048 + 0x10),
                                          uVar19 + (ulong)uVar3 * 0x90 + 0x30);
                    }
                    func_0x005ffccc(uStack0000000000000060 + uVar14 * 0xa0 + 0x38,lVar11);
                  }
                  else {
                    *(undefined1 *)(lVar11 + 0x68) = 1;
                  }
                  func_0x005fe318(unaff_x29 + -0xd8,0,0,
                                  *(undefined4 *)(in_stack_00000078[lVar28 * 3] + uVar14 * 4));
                  func_0x005ffccc(uStack0000000000000060 + uVar14 * 0xa0 + 0x70,unaff_x29 + -0xd8);
                  *(undefined **)(unaff_x29 + -0xd8) = &UNK_009f5d60;
                  lVar11 = *(long *)(unaff_x29 + -0xb8);
                  uVar9 = *(ulong *)(unaff_x29 + -200);
                  if (*(ulong *)(unaff_x29 + -0xc0) <= *(ulong *)(unaff_x29 + -200)) {
                    uVar9 = *(ulong *)(unaff_x29 + -0xc0);
                  }
                  if (lVar11 != 0) {
                    if (uVar9 != 0) {
                      do {
                        *(undefined8 *)(lVar11 + -8 + uVar9 * 8) = 0;
                        uVar9 = uVar9 - 1;
                      } while (uVar9 != 0);
                    }
                    func_0x00611644();
                  }
                  uVar14 = (ulong)((int)uVar14 + 1);
                  lVar11 = in_stack_000000a8[lVar28 * 3];
                } while (uVar14 < (ulong)((in_stack_000000a8 + lVar28 * 3)[1] - lVar11 >> 2));
              }
              func_0x00633274(unaff_x29 + -0xd8,in_stack_00000048,uStack0000000000000060,
                              in_stack_00000068);
              func_0x005ffccc(in_stack_00000010 + lVar28 * 0x70 + 8,unaff_x29 + -0xd0);
              func_0x005ffccc(in_stack_00000010 + lVar28 * 0x70 + 0x38,unaff_x29 + -0xa0);
              *(undefined1 *)(in_stack_00000010 + lVar28 * 0x70 + 0x68) =
                   *(undefined1 *)(unaff_x29 + -0x70);
              *(undefined **)(unaff_x29 + -0xd8) = &UNK_00a09a40;
              *(undefined **)(unaff_x29 + -0xa0) = &UNK_009f5d60;
              lVar11 = *(long *)(unaff_x29 + -0x80);
              uVar14 = *(ulong *)(unaff_x29 + -0x90);
              if (*(ulong *)(unaff_x29 + -0x88) <= *(ulong *)(unaff_x29 + -0x90)) {
                uVar14 = *(ulong *)(unaff_x29 + -0x88);
              }
              if (lVar11 != 0) {
                if (uVar14 != 0) {
                  do {
                    *(undefined8 *)(lVar11 + -8 + uVar14 * 8) = 0;
                    uVar14 = uVar14 - 1;
                  } while (uVar14 != 0);
                }
                func_0x00611644();
              }
              *(undefined **)(unaff_x29 + -0xd0) = &UNK_009f5d60;
              lVar11 = *(long *)(unaff_x29 + -0xb0);
              uVar14 = *(ulong *)(unaff_x29 + -0xc0);
              if (*(ulong *)(unaff_x29 + -0xb8) <= *(ulong *)(unaff_x29 + -0xc0)) {
                uVar14 = *(ulong *)(unaff_x29 + -0xb8);
              }
              if (lVar11 != 0) {
                if (uVar14 != 0) {
                  do {
                    *(undefined8 *)(lVar11 + -8 + uVar14 * 8) = 0;
                    uVar14 = uVar14 - 1;
                  } while (uVar14 != 0);
                }
                func_0x00611644();
              }
              lVar11 = uStack0000000000000060;
              lVar28 = lVar28 + 1;
            } while (lVar28 != in_stack_00000038);
            lVar28 = in_stack_00000068;
            if (uStack0000000000000060 != 0) {
              for (; lVar28 != lVar11; lVar28 = lVar28 + -0xa0) {
                *(undefined **)(lVar28 + -0x30) = &UNK_009f5d60;
                lVar13 = *(long *)(lVar28 + -0x10);
                uVar19 = *(ulong *)(lVar28 + -0x20);
                if (*(ulong *)(lVar28 + -0x18) <= *(ulong *)(lVar28 + -0x20)) {
                  uVar19 = *(ulong *)(lVar28 + -0x18);
                }
                if (lVar13 != 0) {
                  if (uVar19 != 0) {
                    do {
                      *(undefined8 *)(lVar13 + -8 + uVar19 * 8) = 0;
                      uVar19 = uVar19 - 1;
                    } while (uVar19 != 0);
                  }
                  func_0x00611644();
                }
                func_0x0064f6d0(lVar28 + -0xa0);
              }
              in_stack_00000068 = lVar11;
              __ZdlPv(uStack0000000000000060);
            }
          }
          plVar27 = in_stack_00000078;
          if (in_stack_00000078 != (long *)0x0) {
            if (in_stack_00000080 != in_stack_00000078) {
              plVar24 = in_stack_00000080;
              do {
                plVar23 = plVar24 + -3;
                if (*plVar23 != 0) {
                  plVar24[-2] = *plVar23;
                  __ZdlPv();
                }
                plVar24 = plVar23;
              } while (plVar23 != plVar27);
            }
            in_stack_00000080 = plVar27;
            __ZdlPv(in_stack_00000078);
          }
          plVar24 = in_stack_00000090;
          plVar27 = in_stack_00000098;
          if (in_stack_00000090 != (long *)0x0) {
            while (plVar27 != plVar24) {
              plVar27 = plVar27 + -3;
              if (*plVar27 != 0) {
                __ZdlPv();
              }
            }
            in_stack_00000098 = plVar24;
            __ZdlPv(in_stack_00000090);
          }
          plVar27 = in_stack_000000a8;
          if (in_stack_000000a8 != (long *)0x0) {
            if (in_stack_000000b0 != in_stack_000000a8) {
              plVar24 = in_stack_000000b0;
              do {
                plVar23 = plVar24 + -3;
                if (*plVar23 != 0) {
                  plVar24[-2] = *plVar23;
                  __ZdlPv();
                }
                plVar24 = plVar23;
              } while (plVar23 != plVar27);
            }
            in_stack_000000b0 = plVar27;
            __ZdlPv(in_stack_000000a8);
          }
          if (uStack00000000000000c0 != 0) {
            func_0x0064b344(&uStack00000000000000c0);
            __ZdlPv(uStack00000000000000c0);
          }
          uVar14 = in_stack_000000d8;
          uVar19 = in_stack_000000e0;
          if (in_stack_000000d8 != 0) {
            for (; uVar19 != uVar14; uVar19 = func_0x00669d7c(uVar19 - 0x90)) {
            }
            __ZdlPv(in_stack_000000d8);
          }
          func_0x0066a1ec(&uStack00000000000000f0);
          return;
        }
        func_0x00669084(&uStack00000000000000f0);
        in_stack_00000050 = in_stack_00000050 + 1;
        unaff_x19 = 0;
        bVar4 = false;
        in_stack_00000058 = false;
      }
    } while ((*(char *)(uStack00000000000000c0 + unaff_x19 * 0x70 + 0x6f) != '\0') ||
            (in_stack_00000050 != *(int *)(uStack00000000000000c0 + unaff_x19 * 0x70 + 100)));
    if (!bVar4) {
      if (uVar19 < in_stack_000000e8) {
        func_0x00669e50(uVar19,in_stack_00000020);
        uVar19 = uVar19 + 0x90;
      }
      else {
        lVar28 = (long)(uVar19 - uVar14) >> 4;
        uVar19 = lVar28 * -0x71c71c71c71c71c7 + 1;
        if (0x1c71c71c71c71c7 < uVar19) {
          func_0x00017f90();
          goto code_r0x00668808;
        }
        lVar11 = (long)(in_stack_000000e8 - uVar14) >> 4;
        uVar14 = lVar11 * 0x1c71c71c71c71c72;
        if (uVar14 <= uVar19) {
          uVar14 = uVar19;
        }
        if (0xe38e38e38e38e2 < (ulong)(lVar11 * -0x71c71c71c71c71c7)) {
          uVar14 = 0x1c71c71c71c71c7;
        }
        if (uVar14 == 0) {
          lVar11 = 0;
        }
        else {
          if (0x1c71c71c71c71c7 < uVar14) goto code_r0x006687f4;
          lVar11 = __Znwm(uVar14 * 0x90);
        }
        lVar13 = lVar11 + lVar28 * 0x10;
        func_0x00669e50(lVar13,in_stack_00000020);
        uVar16 = in_stack_000000e0;
        uVar9 = in_stack_000000d8;
        uVar19 = lVar13 + 0x90;
        lVar28 = 0;
        while( true ) {
          uVar15 = in_stack_000000d8;
          uVar12 = uVar16 + lVar28;
          if (uVar12 == uVar9) break;
          func_0x005fe0b4(lVar13 + lVar28 + -0x90,uVar12 - 0x90);
          lVar2 = uVar16 + lVar28;
          func_0x005fe0b4(lVar13 + lVar28 + -0x60,lVar2 + -0x60);
          func_0x005fe0b4(lVar13 + lVar28 + -0x30,lVar2 + -0x30);
          lVar28 = lVar28 + -0x90;
        }
        in_stack_000000d8 = lVar13 + lVar28;
        in_stack_000000e8 = lVar11 + uVar14 * 0x90;
        uVar9 = uVar19;
        for (uVar14 = in_stack_000000e0; in_stack_000000e0 = uVar9, uVar14 != uVar15;
            uVar14 = uVar14 - 0x90) {
          *(undefined8 *)(uVar14 - 0x30) = in_stack_00000018;
          lVar28 = *(long *)(uVar14 - 0x10);
          uVar9 = *(ulong *)(uVar14 - 0x20);
          if (*(ulong *)(uVar14 - 0x18) <= *(ulong *)(uVar14 - 0x20)) {
            uVar9 = *(ulong *)(uVar14 - 0x18);
          }
          if (lVar28 != 0) {
            if (uVar9 != 0) {
              do {
                *(undefined8 *)(lVar28 + -8 + uVar9 * 8) = 0;
                uVar9 = uVar9 - 1;
              } while (uVar9 != 0);
            }
            func_0x00611644();
          }
          *(undefined **)(uVar14 - 0x60) = &UNK_009f5d60;
          lVar28 = *(long *)(uVar14 - 0x40);
          uVar9 = *(ulong *)(uVar14 - 0x50);
          if (*(ulong *)(uVar14 - 0x48) <= *(ulong *)(uVar14 - 0x50)) {
            uVar9 = *(ulong *)(uVar14 - 0x48);
          }
          if (lVar28 != 0) {
            if (uVar9 != 0) {
              do {
                *(undefined8 *)(lVar28 + -8 + uVar9 * 8) = 0;
                uVar9 = uVar9 - 1;
              } while (uVar9 != 0);
            }
            func_0x00611644();
          }
          *(undefined **)(uVar14 - 0x90) = &UNK_009f5d60;
          lVar28 = *(long *)(uVar14 - 0x70);
          uVar9 = *(ulong *)(uVar14 - 0x80);
          if (*(ulong *)(uVar14 - 0x78) <= *(ulong *)(uVar14 - 0x80)) {
            uVar9 = *(ulong *)(uVar14 - 0x78);
          }
          if (lVar28 != 0) {
            if (uVar9 != 0) {
              do {
                *(undefined8 *)(lVar28 + -8 + uVar9 * 8) = 0;
                uVar9 = uVar9 - 1;
              } while (uVar9 != 0);
            }
            func_0x00611644();
          }
          uVar9 = in_stack_000000e0;
        }
        if (uVar15 != 0) {
          __ZdlPv(uVar15);
        }
      }
      in_stack_000000e0 = uVar19;
    }
    unaff_x23 = in_stack_00000078 + unaff_x19 * 3;
    puVar1 = (undefined4 *)(uStack00000000000000c0 + unaff_x19 * 0x70 + 0x68);
    unaff_x26 = unaff_x23 + 1;
    unaff_x20 = (undefined4 *)*unaff_x26;
    unaff_x21 = unaff_x23 + 2;
    if ((undefined4 *)*unaff_x21 <= unaff_x20) break;
    unaff_x28 = unaff_x20 + 1;
    *unaff_x20 = *puVar1;
  } while( true );
  unaff_x25 = (undefined4 *)*unaff_x23;
  unaff_x24 = (long)unaff_x20 - (long)unaff_x25 >> 2;
  uVar19 = unaff_x24 + 1;
  if (uVar19 >> 0x3e != 0) {
    func_0x00017f90(unaff_x23);
    goto code_r0x00668808;
  }
  uVar14 = *unaff_x21 - (long)unaff_x25;
  in_x15 = (long)uVar14 >> 1;
  if (in_x15 <= uVar19) {
    in_x15 = uVar19;
  }
  if (0x7ffffffffffffffb < uVar14) {
    in_x15 = 0x3fffffffffffffff;
  }
  if (in_x15 == 0) {
    param_2 = 0;
    param_1 = (undefined4 *)(unaff_x24 * 4);
    *param_1 = *puVar1;
  }
  else {
    if (in_x15 >> 0x3e != 0) {
code_r0x006687f4:
      func_0x00017514();
code_r0x00668808:
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x66880c);
      (*pcVar5)();
    }
    param_2 = __Znwm(in_x15 << 2);
    param_1 = (undefined4 *)(param_2 + unaff_x24 * 4);
    *param_1 = *puVar1;
  }
  unaff_x28 = param_1 + 1;
  if (unaff_x20 != unaff_x25) goto code_r0x00667c80;
  goto LAB_00667d08;
code_r0x00667c80:
  uVar19 = (long)unaff_x20 + (-4 - (long)unaff_x25);
  if ((uVar19 < 0x3c) ||
     ((ulong)((long)unaff_x20 - (param_2 + ((long)unaff_x20 - (long)unaff_x25))) < 0x40))
  goto LAB_00667cf8;
  in_x9 = (uVar19 >> 2) + 1;
  goto code_r0x00667cac;
}

