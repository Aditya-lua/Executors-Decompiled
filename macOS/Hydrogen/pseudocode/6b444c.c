
void FUN_006b444c(undefined4 *param_1,long param_2)

{
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  byte bVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  undefined4 *puVar9;
  undefined4 *puVar10;
  ulong uVar11;
  uint *puVar12;
  undefined4 *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  ulong in_x14;
  long lVar19;
  long lVar20;
  undefined4 *unaff_x20;
  undefined4 *unaff_x21;
  undefined4 *puVar21;
  undefined4 *unaff_x22;
  undefined4 *puVar22;
  undefined4 *unaff_x23;
  undefined4 *puVar23;
  undefined4 *unaff_x24;
  long lVar24;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  ulong in_stack_00000008;
  long in_stack_00000018;
  undefined4 *in_stack_00000020;
  long in_stack_00000028;
  undefined4 *in_stack_00000038;
  undefined4 *puStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined4 *in_stack_00000050;
  undefined4 *in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined4 *in_stack_00000068;
  undefined4 *in_stack_00000070;
  
LAB_006b4450:
  do {
    param_1 = param_1 + -1;
    unaff_x21 = unaff_x21 + -1;
    *unaff_x21 = *param_1;
  } while (param_1 != unaff_x22);
code_r0x006b4460:
  puStack0000000000000040 = (undefined4 *)(param_2 + in_x14 * 4);
  puVar10 = unaff_x22;
joined_r0x006b4468:
  unaff_x22 = unaff_x21;
  if (puVar10 != (undefined4 *)0x0) {
    __ZdlPv(puVar10);
  }
  lVar19 = *(long *)(in_stack_00000028 + 0x40);
  puVar10 = unaff_x20;
  if (unaff_x23 < in_stack_00000020) goto LAB_006b42b0;
code_r0x006b448c:
  lVar20 = (long)unaff_x23 - (long)unaff_x20;
  lVar24 = lVar20 >> 2;
  uVar11 = lVar24 + 1;
  puVar10 = unaff_x20;
  puVar22 = unaff_x22;
  puVar9 = unaff_x24;
  if (uVar11 >> 0x3e != 0) goto LAB_006b4e20;
  uVar14 = (long)in_stack_00000020 - (long)unaff_x20 >> 1;
  if (uVar14 <= uVar11) {
    uVar14 = uVar11;
  }
  if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000020 - (long)unaff_x20)) {
    uVar14 = 0x3fffffffffffffff;
  }
  if (uVar14 == 0) {
    lVar8 = 0;
    puVar10 = (undefined4 *)(lVar24 * 4);
    *puVar10 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
  }
  else {
    if (uVar14 >> 0x3e != 0) {
LAB_006b4e3c:
      in_stack_00000068 = in_stack_00000038;
      in_stack_00000070 = puStack0000000000000040;
      uStack0000000000000048 = puVar10;
      in_stack_00000050 = puVar9;
      in_stack_00000058 = in_stack_00000020;
      uStack0000000000000060 = puVar22;
      func_0x00017514();
code_r0x006b4ed0:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x6b4ed4);
      (*pcVar6)();
    }
    lVar8 = __Znwm(uVar14 << 2);
    unaff_x28 = unaff_x28 & 0xffffffff;
    puVar10 = (undefined4 *)(lVar8 + lVar24 * 4);
    *puVar10 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
  }
  puVar9 = puVar10 + 1;
  if (unaff_x23 != unaff_x20) {
    puVar23 = unaff_x23 + -1;
    uVar11 = (long)puVar23 - (long)unaff_x20;
    if (uVar11 < 0xbc) {
    }
    else {
      uVar16 = (lVar8 + lVar20) - 4;
      if ((uVar16 - (uVar11 & 0xfffffffffffffffc) <= uVar16) &&
         ((undefined4 *)((long)puVar23 - (uVar11 & 0xfffffffffffffffc)) <= puVar23)) {
        if ((ulong)((long)puVar23 + (4 - (lVar8 + lVar20))) < 0x40) {
        }
        else {
          uVar11 = (uVar11 >> 2) + 1;
          uVar15 = uVar11 & 0x7ffffffffffffff0;
          puVar10 = puVar10 + -uVar15;
          puVar17 = (undefined8 *)(unaff_x23 + -8);
          puVar18 = (undefined8 *)(lVar8 + lVar24 * 4 + -0x20);
          uVar16 = uVar15;
          do {
            uVar27 = *puVar17;
            uVar26 = puVar17[3];
            uVar25 = puVar17[2];
            uVar31 = puVar17[-3];
            uVar30 = puVar17[-4];
            uVar29 = puVar17[-1];
            uVar28 = puVar17[-2];
            puVar18[1] = puVar17[1];
            *puVar18 = uVar27;
            puVar18[3] = uVar26;
            puVar18[2] = uVar25;
            puVar18[-3] = uVar31;
            puVar18[-4] = uVar30;
            puVar18[-1] = uVar29;
            puVar18[-2] = uVar28;
            puVar17 = puVar17 + -8;
            puVar18 = puVar18 + -8;
            uVar16 = uVar16 - 0x10;
          } while (uVar16 != 0);
          unaff_x23 = unaff_x23 + -uVar15;
          if (uVar11 == uVar15) goto LAB_006b456c;
        }
      }
    }
    do {
      unaff_x23 = unaff_x23 + -1;
      puVar10 = puVar10 + -1;
      *puVar10 = *unaff_x23;
    } while (unaff_x23 != unaff_x20);
  }
LAB_006b456c:
  in_stack_00000020 = (undefined4 *)(lVar8 + uVar14 * 4);
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv(unaff_x20);
    lVar19 = *(long *)(in_stack_00000028 + 0x40);
  }
  if (puVar9 < in_stack_00000020) goto LAB_006b42c4;
code_r0x006b4598:
  lVar24 = (long)puVar9 - (long)puVar10;
  lVar20 = lVar24 >> 2;
  uVar11 = lVar20 + 1;
  if (uVar11 >> 0x3e == 0) {
    uVar14 = (long)in_stack_00000020 - (long)puVar10 >> 1;
    if (uVar14 <= uVar11) {
      uVar14 = uVar11;
    }
    if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000020 - (long)puVar10)) {
      uVar14 = 0x3fffffffffffffff;
    }
    if (uVar14 == 0) {
      lVar8 = 0;
      unaff_x20 = (undefined4 *)(lVar20 * 4);
      *unaff_x20 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
    }
    else {
      if (uVar14 >> 0x3e != 0) goto LAB_006b4e3c;
      lVar8 = __Znwm(uVar14 << 2);
      unaff_x20 = (undefined4 *)(lVar8 + lVar20 * 4);
      *unaff_x20 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
    }
    unaff_x24 = unaff_x20 + 1;
    if (puVar9 != puVar10) {
      puVar23 = puVar9 + -1;
      uVar11 = (long)puVar23 - (long)puVar10;
      if (uVar11 < 0xbc) {
      }
      else {
        uVar16 = (lVar8 + lVar24) - 4;
        if ((uVar16 - (uVar11 & 0xfffffffffffffffc) <= uVar16) &&
           ((undefined4 *)((long)puVar23 - (uVar11 & 0xfffffffffffffffc)) <= puVar23)) {
          if ((ulong)((long)puVar23 + (-lVar24 - lVar8) + 4) < 0x40) {
          }
          else {
            uVar11 = (uVar11 >> 2) + 1;
            uVar15 = uVar11 & 0x7ffffffffffffff0;
            unaff_x20 = unaff_x20 + -uVar15;
            puVar17 = (undefined8 *)(puVar9 + -8);
            puVar18 = (undefined8 *)(lVar8 + lVar20 * 4 + -0x20);
            uVar16 = uVar15;
            do {
              uVar27 = *puVar17;
              uVar26 = puVar17[3];
              uVar25 = puVar17[2];
              uVar31 = puVar17[-3];
              uVar30 = puVar17[-4];
              uVar29 = puVar17[-1];
              uVar28 = puVar17[-2];
              puVar18[1] = puVar17[1];
              *puVar18 = uVar27;
              puVar18[3] = uVar26;
              puVar18[2] = uVar25;
              puVar18[-3] = uVar31;
              puVar18[-4] = uVar30;
              puVar18[-1] = uVar29;
              puVar18[-2] = uVar28;
              puVar17 = puVar17 + -8;
              puVar18 = puVar18 + -8;
              uVar16 = uVar16 - 0x10;
            } while (uVar16 != 0);
            puVar9 = puVar9 + -uVar15;
            if (uVar11 == uVar15) goto LAB_006b465c;
          }
        }
      }
      do {
        puVar9 = puVar9 + -1;
        unaff_x20 = unaff_x20 + -1;
        *unaff_x20 = *puVar9;
      } while (puVar9 != puVar10);
    }
LAB_006b465c:
    in_stack_00000020 = (undefined4 *)(lVar8 + uVar14 * 4);
    if (puVar10 != (undefined4 *)0x0) {
      __ZdlPv(puVar10);
    }
    unaff_x23 = unaff_x24;
    puVar10 = in_stack_00000038;
code_r0x006b467c:
code_r0x006b4680:
    in_stack_00000008 = in_stack_00000008 + 1;
    do {
      iVar7 = func_0x0008a21c(unaff_x28);
      if (0 < iVar7) {
        iVar7 = iVar7 + (int)unaff_x27;
        puVar9 = unaff_x20;
        puVar23 = unaff_x23;
        unaff_x23 = unaff_x24;
        do {
          while( true ) {
            lVar19 = (long)puVar10 - (long)puVar22 >> 2;
            *(int *)(in_stack_00000018 + unaff_x27 * 4) = (int)lVar19;
            lVar20 = *(long *)(in_stack_00000028 + 0x28);
            if (puVar10 < puStack0000000000000040) break;
            uVar11 = lVar19 + 1;
            if (uVar11 >> 0x3e != 0) {
              in_stack_00000068 = in_stack_00000038;
              in_stack_00000070 = puStack0000000000000040;
              uStack0000000000000048 = puVar9;
              in_stack_00000050 = unaff_x23;
              in_stack_00000058 = in_stack_00000020;
              uStack0000000000000060 = puVar22;
              func_0x00017f90(&uStack0000000000000060);
              goto code_r0x006b4ed0;
            }
            uVar14 = (long)puStack0000000000000040 - (long)puVar22 >> 1;
            if (uVar14 <= uVar11) {
              uVar14 = uVar11;
            }
            if (0x7ffffffffffffffb < (ulong)((long)puStack0000000000000040 - (long)puVar22)) {
              uVar14 = 0x3fffffffffffffff;
            }
            if (uVar14 != 0) {
              if (uVar14 >> 0x3e == 0) {
                lVar24 = __Znwm(uVar14 << 2);
                goto code_r0x006b4758;
              }
LAB_006b4dac:
              in_stack_00000068 = in_stack_00000038;
              in_stack_00000070 = puStack0000000000000040;
              uStack0000000000000048 = puVar9;
              in_stack_00000050 = unaff_x23;
              in_stack_00000058 = in_stack_00000020;
              uStack0000000000000060 = puVar22;
              func_0x00017514();
              goto code_r0x006b4ed0;
            }
            lVar24 = 0;
code_r0x006b4758:
            puVar21 = (undefined4 *)(lVar24 + lVar19 * 4);
            in_stack_00000038 = puVar21 + 1;
            *puVar21 = *(undefined4 *)(lVar20 + unaff_x27 * 4);
            if (puVar10 != puVar22) {
              puVar13 = puVar10 + -1;
              uVar11 = (long)puVar13 - (long)puVar22;
              if (uVar11 < 0xbc) {
              }
              else {
                uVar16 = (long)puVar10 - (long)puVar22 & 0xfffffffffffffffc;
                uVar15 = (lVar24 + uVar16) - 4;
                if ((uVar15 - (uVar11 & 0xfffffffffffffffc) <= uVar15) &&
                   ((undefined4 *)((long)puVar13 - (uVar11 & 0xfffffffffffffffc)) <= puVar13)) {
                  if ((long)puVar13 + (-uVar16 - lVar24) + 4 < 0x40) {
                  }
                  else {
                    uVar11 = (uVar11 >> 2) + 1;
                    uVar15 = uVar11 & 0x7ffffffffffffff0;
                    puVar21 = puVar21 + -uVar15;
                    puVar17 = (undefined8 *)(puVar10 + -8);
                    puVar18 = (undefined8 *)(lVar24 + lVar19 * 4 + -0x20);
                    uVar16 = uVar15;
                    do {
                      uVar27 = *puVar17;
                      uVar26 = puVar17[3];
                      uVar25 = puVar17[2];
                      uVar31 = puVar17[-3];
                      uVar30 = puVar17[-4];
                      uVar29 = puVar17[-1];
                      uVar28 = puVar17[-2];
                      puVar18[1] = puVar17[1];
                      *puVar18 = uVar27;
                      puVar18[3] = uVar26;
                      puVar18[2] = uVar25;
                      puVar18[-3] = uVar31;
                      puVar18[-4] = uVar30;
                      puVar18[-1] = uVar29;
                      puVar18[-2] = uVar28;
                      puVar17 = puVar17 + -8;
                      puVar18 = puVar18 + -8;
                      uVar16 = uVar16 - 0x10;
                    } while (uVar16 != 0);
                    puVar10 = puVar10 + -uVar15;
                    if (uVar11 == uVar15) goto code_r0x006b4798;
                  }
                }
              }
              do {
                puVar10 = puVar10 + -1;
                puVar21 = puVar21 + -1;
                *puVar21 = *puVar10;
              } while (puVar10 != puVar22);
            }
code_r0x006b4798:
            puStack0000000000000040 = (undefined4 *)(lVar24 + uVar14 * 4);
            if (puVar22 != (undefined4 *)0x0) {
              __ZdlPv(puVar22);
            }
            lVar19 = *(long *)(in_stack_00000028 + 0x40);
            puVar22 = puVar21;
            if (in_stack_00000020 <= puVar23) goto code_r0x006b47c0;
code_r0x006b46a8:
            unaff_x23 = puVar23 + 1;
            *puVar23 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
            unaff_x27 = unaff_x27 + 1;
            unaff_x20 = puVar9;
            puVar22 = puVar21;
            puVar23 = unaff_x23;
            unaff_x24 = unaff_x23;
            puVar10 = in_stack_00000038;
            if (iVar7 == (int)unaff_x27) goto LAB_006b420c;
          }
          in_stack_00000038 = puVar10 + 1;
          *puVar10 = *(undefined4 *)(lVar20 + unaff_x27 * 4);
          lVar19 = *(long *)(in_stack_00000028 + 0x40);
          puVar21 = puVar22;
          if (puVar23 < in_stack_00000020) goto code_r0x006b46a8;
code_r0x006b47c0:
          lVar24 = (long)puVar23 - (long)puVar9;
          lVar20 = lVar24 >> 2;
          uVar11 = lVar20 + 1;
          if (uVar11 >> 0x3e != 0) {
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = puStack0000000000000040;
            uStack0000000000000048 = puVar9;
            in_stack_00000050 = unaff_x23;
            in_stack_00000058 = in_stack_00000020;
            uStack0000000000000060 = puVar22;
            func_0x00017f90(&uStack0000000000000048);
            goto code_r0x006b4ed0;
          }
          uVar14 = (long)in_stack_00000020 - (long)puVar9 >> 1;
          if (uVar14 <= uVar11) {
            uVar14 = uVar11;
          }
          if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000020 - (long)puVar9)) {
            uVar14 = 0x3fffffffffffffff;
          }
          if (uVar14 == 0) {
            lVar8 = 0;
            unaff_x20 = (undefined4 *)(lVar20 * 4);
            unaff_x23 = unaff_x20 + 1;
            *unaff_x20 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
            if (puVar23 != puVar9) goto code_r0x006b4820;
LAB_006b4898:
            in_stack_00000020 = (undefined4 *)(lVar8 + uVar14 * 4);
          }
          else {
            if (uVar14 >> 0x3e != 0) goto LAB_006b4dac;
            lVar8 = __Znwm(uVar14 << 2);
            unaff_x20 = (undefined4 *)(lVar8 + lVar20 * 4);
            unaff_x23 = unaff_x20 + 1;
            *unaff_x20 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
            if (puVar23 == puVar9) goto LAB_006b4898;
code_r0x006b4820:
            puVar10 = puVar23 + -1;
            uVar11 = (long)puVar10 - (long)puVar9;
            if ((((uVar11 < 0xbc) ||
                 (uVar16 = (lVar8 + lVar24) - 4, uVar16 < uVar16 - (uVar11 & 0xfffffffffffffffc)))
                || (puVar10 < (undefined4 *)((long)puVar10 - (uVar11 & 0xfffffffffffffffc)))) ||
               ((ulong)((long)puVar10 + (4 - (lVar8 + lVar24))) < 0x40)) {
              puVar10 = puVar23;
LAB_006b4838:
              do {
                puVar10 = puVar10 + -1;
                unaff_x20 = unaff_x20 + -1;
                *unaff_x20 = *puVar10;
              } while (puVar10 != puVar9);
            }
            else {
              uVar11 = (uVar11 >> 2) + 1;
              uVar15 = uVar11 & 0x7ffffffffffffff0;
              puVar10 = puVar23 + -uVar15;
              unaff_x20 = unaff_x20 + -uVar15;
              puVar17 = (undefined8 *)(puVar23 + -8);
              puVar18 = (undefined8 *)(lVar8 + lVar20 * 4 + -0x20);
              uVar16 = uVar15;
              do {
                uVar27 = *puVar17;
                uVar26 = puVar17[3];
                uVar25 = puVar17[2];
                uVar31 = puVar17[-3];
                uVar30 = puVar17[-4];
                uVar29 = puVar17[-1];
                uVar28 = puVar17[-2];
                puVar18[1] = puVar17[1];
                *puVar18 = uVar27;
                puVar18[3] = uVar26;
                puVar18[2] = uVar25;
                puVar18[-3] = uVar31;
                puVar18[-4] = uVar30;
                puVar18[-1] = uVar29;
                puVar18[-2] = uVar28;
                puVar17 = puVar17 + -8;
                puVar18 = puVar18 + -8;
                uVar16 = uVar16 - 0x10;
              } while (uVar16 != 0);
              if (uVar11 != uVar15) goto LAB_006b4838;
            }
            in_stack_00000020 = (undefined4 *)(lVar8 + uVar14 * 4);
          }
          if (puVar9 != (undefined4 *)0x0) {
            __ZdlPv(puVar9);
          }
          unaff_x27 = unaff_x27 + 1;
          puVar9 = unaff_x20;
          puVar23 = unaff_x23;
          unaff_x24 = unaff_x23;
          puVar10 = in_stack_00000038;
        } while (iVar7 != (int)unaff_x27);
      }
LAB_006b420c:
      lVar19 = *(long *)(in_stack_00000028 + 0x28);
      if ((ulong)(*(long *)(in_stack_00000028 + 0x30) - lVar19 >> 2) <= unaff_x27) {
        in_stack_00000068 = in_stack_00000038;
        puVar12 = *(uint **)(in_stack_00000028 + 0x88);
        puVar2 = *(uint **)(in_stack_00000028 + 0x90);
        if (puVar12 != puVar2) {
          lVar20 = *(long *)(unaff_x29 + -0x68);
          do {
            uVar3 = puVar12[1] + ~*puVar12;
            uVar4 = *(uint *)(lVar20 + (ulong)*puVar12 * 4);
            iVar7 = *(int *)(lVar20 + (ulong)puVar12[1] * 4) - uVar4;
            uVar1 = -uVar3;
            if (-1 < (int)uVar3) {
              uVar1 = uVar3;
            }
            if (uVar1 < 0x2aab) {
              *(short *)((long)puVar22 + (ulong)uVar4 * 4 + 2) =
                   (short)((uint)(iVar7 * 0x10000 + -0x10000) >> 0x10);
            }
            else {
              puVar22[uVar4 - 1] = (uint)*(byte *)(puVar22 + (uVar4 - 1)) | iVar7 * 0x100;
              *(undefined2 *)((long)puVar22 + (ulong)uVar4 * 4 + 2) = 0xfffe;
            }
            puVar12 = puVar12 + 2;
          } while (puVar12 != puVar2);
        }
        *(undefined4 **)(in_stack_00000028 + 0x28) = puVar22;
        *(undefined4 **)(in_stack_00000028 + 0x30) = puVar10;
        lVar20 = *(long *)(in_stack_00000028 + 0x40);
        *(undefined4 **)(in_stack_00000028 + 0x38) = puStack0000000000000040;
        *(undefined4 **)(in_stack_00000028 + 0x40) = unaff_x20;
        in_stack_00000058 = *(undefined4 **)(in_stack_00000028 + 0x50);
        *(undefined4 **)(in_stack_00000028 + 0x48) = unaff_x23;
        *(undefined4 **)(in_stack_00000028 + 0x50) = in_stack_00000020;
        in_stack_00000050 = unaff_x24;
        uStack0000000000000060 = puVar22;
        if (lVar20 != 0) {
          __ZdlPv();
        }
        if (lVar19 != 0) {
          __ZdlPv(lVar19);
        }
        if (*(long *)(unaff_x29 + -0x68) != 0) {
          __ZdlPv();
        }
        return;
      }
      bVar5 = *(byte *)(lVar19 + unaff_x27 * 4);
      unaff_x28 = (ulong)bVar5;
      lVar19 = *(long *)(in_stack_00000028 + 0x88);
    } while (((ulong)(*(long *)(in_stack_00000028 + 0x90) - lVar19 >> 3) <= in_stack_00000008) ||
            (uVar3 = *(uint *)(lVar19 + in_stack_00000008 * 8), unaff_x27 != uVar3));
    uVar3 = *(int *)(lVar19 + in_stack_00000008 * 8 + 4) + ~uVar3;
    uVar1 = -uVar3;
    if (-1 < (int)uVar3) {
      uVar1 = uVar3;
    }
    if (uVar1 < 0x2aab) goto code_r0x006b467c;
    if (puVar10 < puStack0000000000000040) {
      param_1 = puVar10 + 1;
      *puVar10 = 0x10017;
      unaff_x22 = puVar22;
      if (puStack0000000000000040 <= param_1) goto code_r0x006b43b8;
    }
    else {
      lVar20 = (long)puVar10 - (long)puVar22;
      lVar19 = lVar20 >> 2;
      uVar11 = lVar19 + 1;
      if (uVar11 >> 0x3e != 0) {
        in_stack_00000068 = in_stack_00000038;
        in_stack_00000070 = puStack0000000000000040;
        uStack0000000000000048 = unaff_x20;
        in_stack_00000050 = unaff_x24;
        in_stack_00000058 = in_stack_00000020;
        uStack0000000000000060 = puVar22;
        func_0x00017f90(&uStack0000000000000060);
        goto code_r0x006b4ed0;
      }
      uVar14 = (long)puStack0000000000000040 - (long)puVar22 >> 1;
      if (uVar14 <= uVar11) {
        uVar14 = uVar11;
      }
      if (0x7ffffffffffffffb < (ulong)((long)puStack0000000000000040 - (long)puVar22)) {
        uVar14 = 0x3fffffffffffffff;
      }
      if (uVar14 == 0) {
        lVar24 = 0;
      }
      else {
        if (uVar14 >> 0x3e != 0) {
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = puStack0000000000000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = unaff_x24;
          in_stack_00000058 = in_stack_00000020;
          uStack0000000000000060 = puVar22;
          func_0x00017514();
          goto code_r0x006b4ed0;
        }
        lVar24 = __Znwm(uVar14 << 2);
      }
      unaff_x22 = (undefined4 *)(lVar24 + lVar19 * 4);
      param_1 = unaff_x22 + 1;
      *unaff_x22 = 0x10017;
      if (puVar10 != puVar22) {
        puVar9 = puVar10 + -1;
        uVar11 = (long)puVar9 - (long)puVar22;
        if (((uVar11 < 0xbc) ||
            (uVar16 = (lVar24 + lVar20) - 4, uVar16 < uVar16 - (uVar11 & 0xfffffffffffffffc))) ||
           ((puVar9 < (undefined4 *)((long)puVar9 - (uVar11 & 0xfffffffffffffffc)) ||
            ((ulong)((long)puVar9 + (4 - (lVar24 + lVar20))) < 0x40)))) {
          puVar9 = puVar10;
        }
        else {
          uVar11 = (uVar11 >> 2) + 1;
          uVar15 = uVar11 & 0x7ffffffffffffff0;
          puVar9 = puVar10 + -uVar15;
          unaff_x22 = unaff_x22 + -uVar15;
          puVar17 = (undefined8 *)(puVar10 + -8);
          puVar18 = (undefined8 *)(lVar24 + lVar19 * 4 + -0x20);
          uVar16 = uVar15;
          do {
            uVar27 = *puVar17;
            uVar26 = puVar17[3];
            uVar25 = puVar17[2];
            uVar31 = puVar17[-3];
            uVar30 = puVar17[-4];
            uVar29 = puVar17[-1];
            uVar28 = puVar17[-2];
            puVar18[1] = puVar17[1];
            *puVar18 = uVar27;
            puVar18[3] = uVar26;
            puVar18[2] = uVar25;
            puVar18[-3] = uVar31;
            puVar18[-4] = uVar30;
            puVar18[-1] = uVar29;
            puVar18[-2] = uVar28;
            puVar17 = puVar17 + -8;
            puVar18 = puVar18 + -8;
            uVar16 = uVar16 - 0x10;
          } while (uVar16 != 0);
          if (uVar11 == uVar15) goto joined_r0x006b4524;
        }
        do {
          puVar9 = puVar9 + -1;
          unaff_x22 = unaff_x22 + -1;
          *unaff_x22 = *puVar9;
        } while (puVar9 != puVar22);
      }
joined_r0x006b4524:
      puStack0000000000000040 = (undefined4 *)(lVar24 + uVar14 * 4);
      if (puVar22 != (undefined4 *)0x0) {
        __ZdlPv(puVar22);
      }
      if (puStack0000000000000040 <= param_1) {
code_r0x006b43b8:
        unaff_x28 = (ulong)bVar5;
        lVar19 = (long)param_1 - (long)unaff_x22;
        lVar20 = lVar19 >> 2;
        uVar11 = lVar20 + 1;
        if (uVar11 >> 0x3e != 0) {
          in_stack_00000070 = puStack0000000000000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = unaff_x24;
          in_stack_00000058 = in_stack_00000020;
          uStack0000000000000060 = unaff_x22;
          in_stack_00000068 = param_1;
          func_0x00017f90(&uStack0000000000000060);
          goto code_r0x006b4ed0;
        }
        in_x14 = (long)puStack0000000000000040 - (long)unaff_x22 >> 1;
        if (in_x14 <= uVar11) {
          in_x14 = uVar11;
        }
        if (0x7ffffffffffffffb < (ulong)((long)puStack0000000000000040 - (long)unaff_x22)) {
          in_x14 = 0x3fffffffffffffff;
        }
        if (in_x14 == 0) {
          param_2 = 0;
        }
        else {
          if (in_x14 >> 0x3e != 0) {
            in_stack_00000070 = puStack0000000000000040;
            uStack0000000000000048 = unaff_x20;
            in_stack_00000050 = unaff_x24;
            in_stack_00000058 = in_stack_00000020;
            uStack0000000000000060 = unaff_x22;
            in_stack_00000068 = param_1;
            func_0x00017514();
            goto code_r0x006b4ed0;
          }
          param_2 = __Znwm(in_x14 << 2);
        }
        unaff_x21 = (undefined4 *)(param_2 + lVar20 * 4);
        in_stack_00000038 = unaff_x21 + 1;
        *unaff_x21 = 0x43;
        if (param_1 == unaff_x22) {
          puStack0000000000000040 = (undefined4 *)(param_2 + in_x14 * 4);
          puVar10 = unaff_x22;
          goto joined_r0x006b4468;
        }
        puVar10 = param_1 + -1;
        uVar11 = (long)puVar10 - (long)unaff_x22;
        if ((((uVar11 < 0xbc) ||
             (uVar14 = (param_2 + lVar19) - 4, uVar14 < uVar14 - (uVar11 & 0xfffffffffffffffc))) ||
            (puVar10 < (undefined4 *)((long)puVar10 - (uVar11 & 0xfffffffffffffffc)))) ||
           ((ulong)((long)puVar10 + (-lVar19 - param_2) + 4) < 0x40)) goto LAB_006b4450;
        uVar11 = (uVar11 >> 2) + 1;
        uVar16 = uVar11 & 0x7ffffffffffffff0;
        unaff_x21 = unaff_x21 + -uVar16;
        puVar17 = (undefined8 *)(param_1 + -8);
        puVar18 = (undefined8 *)(param_2 + lVar20 * 4 + -0x20);
        uVar14 = uVar16;
        do {
          uVar27 = *puVar17;
          uVar26 = puVar17[3];
          uVar25 = puVar17[2];
          uVar31 = puVar17[-3];
          uVar30 = puVar17[-4];
          uVar29 = puVar17[-1];
          uVar28 = puVar17[-2];
          puVar18[1] = puVar17[1];
          *puVar18 = uVar27;
          puVar18[3] = uVar26;
          puVar18[2] = uVar25;
          puVar18[-3] = uVar31;
          puVar18[-4] = uVar30;
          puVar18[-1] = uVar29;
          puVar18[-2] = uVar28;
          puVar17 = puVar17 + -8;
          puVar18 = puVar18 + -8;
          uVar14 = uVar14 - 0x10;
        } while (uVar14 != 0);
        param_1 = param_1 + -uVar16;
        if (uVar11 != uVar16) goto LAB_006b4450;
        goto code_r0x006b4460;
      }
    }
    unaff_x28 = (ulong)bVar5;
    in_stack_00000038 = param_1 + 1;
    *param_1 = 0x43;
    lVar19 = *(long *)(in_stack_00000028 + 0x40);
    puVar10 = unaff_x20;
    if (in_stack_00000020 <= unaff_x23) goto code_r0x006b448c;
LAB_006b42b0:
    puVar9 = unaff_x23 + 1;
    *unaff_x23 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
    puVar22 = unaff_x22;
    if (in_stack_00000020 <= puVar9) goto code_r0x006b4598;
LAB_006b42c4:
    unaff_x24 = puVar9 + 1;
    *puVar9 = *(undefined4 *)(lVar19 + unaff_x27 * 4);
    unaff_x20 = puVar10;
    unaff_x23 = unaff_x24;
    puVar10 = in_stack_00000038;
    goto code_r0x006b4680;
  }
LAB_006b4e20:
  in_stack_00000068 = in_stack_00000038;
  in_stack_00000070 = puStack0000000000000040;
  uStack0000000000000048 = puVar10;
  in_stack_00000050 = puVar9;
  in_stack_00000058 = in_stack_00000020;
  uStack0000000000000060 = puVar22;
  func_0x00017f90(&uStack0000000000000048);
  goto code_r0x006b4ed0;
}

