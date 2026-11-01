
void FUN_006b42c8(void)

{
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  byte bVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  undefined4 in_w8;
  undefined4 *puVar9;
  undefined4 *puVar10;
  undefined4 *puVar11;
  ulong uVar12;
  undefined4 *puVar13;
  uint *puVar14;
  ulong in_x9;
  ulong uVar15;
  ulong uVar16;
  undefined8 *puVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined4 *puVar20;
  long lVar21;
  undefined4 *unaff_x20;
  undefined4 *puVar22;
  undefined4 *puVar23;
  undefined4 *unaff_x21;
  undefined4 *unaff_x22;
  undefined4 *unaff_x24;
  long lVar24;
  long unaff_x26;
  long lVar25;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  ulong uStack0000000000000008;
  long in_stack_00000018;
  long in_stack_00000028;
  undefined4 *in_stack_00000038;
  undefined4 *in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined4 *in_stack_00000050;
  undefined4 *in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined4 *in_stack_00000068;
  undefined4 *in_stack_00000070;
  
  uStack0000000000000008 = in_x9;
  do {
    puVar13 = unaff_x24 + 1;
    *unaff_x24 = in_w8;
    puVar22 = unaff_x20;
    puVar11 = puVar13;
    puVar10 = in_stack_00000038;
LAB_006b4680:
    uStack0000000000000008 = uStack0000000000000008 + 1;
    do {
      iVar7 = func_0x0008a21c(unaff_x28);
      if (0 < iVar7) {
        iVar7 = iVar7 + (int)unaff_x27;
        puVar23 = puVar22;
        puVar20 = puVar11;
        puVar11 = puVar13;
        do {
          while( true ) {
            lVar21 = (long)puVar10 - (long)unaff_x22 >> 2;
            *(int *)(in_stack_00000018 + unaff_x27 * 4) = (int)lVar21;
            lVar24 = *(long *)(unaff_x26 + 0x28);
            if (puVar10 < in_stack_00000040) break;
            uVar12 = lVar21 + 1;
            if (uVar12 >> 0x3e != 0) {
              in_stack_00000068 = in_stack_00000038;
              in_stack_00000070 = in_stack_00000040;
              uStack0000000000000048 = puVar23;
              in_stack_00000050 = puVar11;
              in_stack_00000058 = unaff_x21;
              uStack0000000000000060 = unaff_x22;
              func_0x00017f90(&uStack0000000000000060);
              goto code_r0x006b4ed0;
            }
            uVar15 = (long)in_stack_00000040 - (long)unaff_x22 >> 1;
            if (uVar15 <= uVar12) {
              uVar15 = uVar12;
            }
            if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)unaff_x22)) {
              uVar15 = 0x3fffffffffffffff;
            }
            if (uVar15 != 0) {
              if (uVar15 >> 0x3e == 0) {
                lVar25 = __Znwm(uVar15 << 2);
                goto code_r0x006b4758;
              }
LAB_006b4dac:
              in_stack_00000068 = in_stack_00000038;
              in_stack_00000070 = in_stack_00000040;
              uStack0000000000000048 = puVar23;
              in_stack_00000050 = puVar11;
              in_stack_00000058 = unaff_x21;
              uStack0000000000000060 = unaff_x22;
              func_0x00017514();
              goto code_r0x006b4ed0;
            }
            lVar25 = 0;
code_r0x006b4758:
            puVar13 = (undefined4 *)(lVar25 + lVar21 * 4);
            in_stack_00000038 = puVar13 + 1;
            *puVar13 = *(undefined4 *)(lVar24 + unaff_x27 * 4);
            if (puVar10 != unaff_x22) {
              puVar22 = puVar10 + -1;
              uVar12 = (long)puVar22 - (long)unaff_x22;
              if (uVar12 < 0xbc) {
              }
              else {
                uVar18 = (long)puVar10 - (long)unaff_x22 & 0xfffffffffffffffc;
                uVar16 = (lVar25 + uVar18) - 4;
                if ((uVar16 - (uVar12 & 0xfffffffffffffffc) <= uVar16) &&
                   ((undefined4 *)((long)puVar22 - (uVar12 & 0xfffffffffffffffc)) <= puVar22)) {
                  if ((long)puVar22 + (-uVar18 - lVar25) + 4 < 0x40) {
                  }
                  else {
                    uVar12 = (uVar12 >> 2) + 1;
                    uVar16 = uVar12 & 0x7ffffffffffffff0;
                    puVar13 = puVar13 + -uVar16;
                    puVar17 = (undefined8 *)(puVar10 + -8);
                    puVar19 = (undefined8 *)(lVar25 + lVar21 * 4 + -0x20);
                    uVar18 = uVar16;
                    do {
                      uVar28 = *puVar17;
                      uVar27 = puVar17[3];
                      uVar26 = puVar17[2];
                      uVar32 = puVar17[-3];
                      uVar31 = puVar17[-4];
                      uVar30 = puVar17[-1];
                      uVar29 = puVar17[-2];
                      puVar19[1] = puVar17[1];
                      *puVar19 = uVar28;
                      puVar19[3] = uVar27;
                      puVar19[2] = uVar26;
                      puVar19[-3] = uVar32;
                      puVar19[-4] = uVar31;
                      puVar19[-1] = uVar30;
                      puVar19[-2] = uVar29;
                      puVar17 = puVar17 + -8;
                      puVar19 = puVar19 + -8;
                      uVar18 = uVar18 - 0x10;
                    } while (uVar18 != 0);
                    puVar10 = puVar10 + -uVar16;
                    if (uVar12 == uVar16) goto code_r0x006b4798;
                  }
                }
              }
              do {
                puVar10 = puVar10 + -1;
                puVar13 = puVar13 + -1;
                *puVar13 = *puVar10;
              } while (puVar10 != unaff_x22);
            }
code_r0x006b4798:
            in_stack_00000040 = (undefined4 *)(lVar25 + uVar15 * 4);
            if (unaff_x22 != (undefined4 *)0x0) {
              __ZdlPv(unaff_x22);
            }
            lVar21 = *(long *)(in_stack_00000028 + 0x40);
            unaff_x22 = puVar13;
            unaff_x26 = in_stack_00000028;
            if (unaff_x21 <= puVar20) goto code_r0x006b47c0;
code_r0x006b46a8:
            puVar11 = puVar20 + 1;
            *puVar20 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
            unaff_x27 = unaff_x27 + 1;
            puVar22 = puVar23;
            unaff_x22 = puVar13;
            puVar20 = puVar11;
            puVar13 = puVar11;
            puVar10 = in_stack_00000038;
            if (iVar7 == (int)unaff_x27) goto LAB_006b420c;
          }
          in_stack_00000038 = puVar10 + 1;
          *puVar10 = *(undefined4 *)(lVar24 + unaff_x27 * 4);
          lVar21 = *(long *)(unaff_x26 + 0x40);
          puVar13 = unaff_x22;
          if (puVar20 < unaff_x21) goto code_r0x006b46a8;
code_r0x006b47c0:
          lVar25 = (long)puVar20 - (long)puVar23;
          lVar24 = lVar25 >> 2;
          uVar12 = lVar24 + 1;
          if (uVar12 >> 0x3e != 0) {
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = in_stack_00000040;
            uStack0000000000000048 = puVar23;
            in_stack_00000050 = puVar11;
            in_stack_00000058 = unaff_x21;
            uStack0000000000000060 = unaff_x22;
            func_0x00017f90(&uStack0000000000000048);
            goto code_r0x006b4ed0;
          }
          uVar15 = (long)unaff_x21 - (long)puVar23 >> 1;
          if (uVar15 <= uVar12) {
            uVar15 = uVar12;
          }
          if (0x7ffffffffffffffb < (ulong)((long)unaff_x21 - (long)puVar23)) {
            uVar15 = 0x3fffffffffffffff;
          }
          if (uVar15 == 0) {
            lVar8 = 0;
            puVar22 = (undefined4 *)(lVar24 * 4);
            puVar11 = puVar22 + 1;
            *puVar22 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
            if (puVar20 != puVar23) goto code_r0x006b4820;
LAB_006b4898:
            unaff_x21 = (undefined4 *)(lVar8 + uVar15 * 4);
          }
          else {
            if (uVar15 >> 0x3e != 0) goto LAB_006b4dac;
            lVar8 = __Znwm(uVar15 << 2);
            puVar22 = (undefined4 *)(lVar8 + lVar24 * 4);
            puVar11 = puVar22 + 1;
            *puVar22 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
            if (puVar20 == puVar23) goto LAB_006b4898;
code_r0x006b4820:
            puVar13 = puVar20 + -1;
            uVar12 = (long)puVar13 - (long)puVar23;
            if ((((uVar12 < 0xbc) ||
                 (uVar18 = (lVar8 + lVar25) - 4, uVar18 < uVar18 - (uVar12 & 0xfffffffffffffffc)))
                || (puVar13 < (undefined4 *)((long)puVar13 - (uVar12 & 0xfffffffffffffffc)))) ||
               ((ulong)((long)puVar13 + (4 - (lVar8 + lVar25))) < 0x40)) {
              puVar13 = puVar20;
LAB_006b4838:
              do {
                puVar13 = puVar13 + -1;
                puVar22 = puVar22 + -1;
                *puVar22 = *puVar13;
              } while (puVar13 != puVar23);
            }
            else {
              uVar12 = (uVar12 >> 2) + 1;
              uVar16 = uVar12 & 0x7ffffffffffffff0;
              puVar13 = puVar20 + -uVar16;
              puVar22 = puVar22 + -uVar16;
              puVar17 = (undefined8 *)(puVar20 + -8);
              puVar19 = (undefined8 *)(lVar8 + lVar24 * 4 + -0x20);
              uVar18 = uVar16;
              do {
                uVar28 = *puVar17;
                uVar27 = puVar17[3];
                uVar26 = puVar17[2];
                uVar32 = puVar17[-3];
                uVar31 = puVar17[-4];
                uVar30 = puVar17[-1];
                uVar29 = puVar17[-2];
                puVar19[1] = puVar17[1];
                *puVar19 = uVar28;
                puVar19[3] = uVar27;
                puVar19[2] = uVar26;
                puVar19[-3] = uVar32;
                puVar19[-4] = uVar31;
                puVar19[-1] = uVar30;
                puVar19[-2] = uVar29;
                puVar17 = puVar17 + -8;
                puVar19 = puVar19 + -8;
                uVar18 = uVar18 - 0x10;
              } while (uVar18 != 0);
              if (uVar12 != uVar16) goto LAB_006b4838;
            }
            unaff_x21 = (undefined4 *)(lVar8 + uVar15 * 4);
          }
          if (puVar23 != (undefined4 *)0x0) {
            __ZdlPv(puVar23);
          }
          unaff_x27 = unaff_x27 + 1;
          puVar23 = puVar22;
          puVar20 = puVar11;
          puVar13 = puVar11;
          puVar10 = in_stack_00000038;
          unaff_x26 = in_stack_00000028;
        } while (iVar7 != (int)unaff_x27);
      }
LAB_006b420c:
      lVar21 = *(long *)(unaff_x26 + 0x28);
      if ((ulong)(*(long *)(unaff_x26 + 0x30) - lVar21 >> 2) <= unaff_x27) {
        in_stack_00000068 = in_stack_00000038;
        puVar14 = *(uint **)(unaff_x26 + 0x88);
        puVar2 = *(uint **)(unaff_x26 + 0x90);
        if (puVar14 != puVar2) {
          lVar24 = *(long *)(unaff_x29 + -0x68);
          do {
            uVar3 = puVar14[1] + ~*puVar14;
            uVar4 = *(uint *)(lVar24 + (ulong)*puVar14 * 4);
            iVar7 = *(int *)(lVar24 + (ulong)puVar14[1] * 4) - uVar4;
            uVar1 = -uVar3;
            if (-1 < (int)uVar3) {
              uVar1 = uVar3;
            }
            if (uVar1 < 0x2aab) {
              *(short *)((long)unaff_x22 + (ulong)uVar4 * 4 + 2) =
                   (short)((uint)(iVar7 * 0x10000 + -0x10000) >> 0x10);
            }
            else {
              unaff_x22[uVar4 - 1] = (uint)*(byte *)(unaff_x22 + (uVar4 - 1)) | iVar7 * 0x100;
              *(undefined2 *)((long)unaff_x22 + (ulong)uVar4 * 4 + 2) = 0xfffe;
            }
            puVar14 = puVar14 + 2;
          } while (puVar14 != puVar2);
        }
        *(undefined4 **)(unaff_x26 + 0x28) = unaff_x22;
        *(undefined4 **)(unaff_x26 + 0x30) = puVar10;
        lVar24 = *(long *)(unaff_x26 + 0x40);
        *(undefined4 **)(unaff_x26 + 0x38) = in_stack_00000040;
        *(undefined4 **)(unaff_x26 + 0x40) = puVar22;
        in_stack_00000058 = *(undefined4 **)(unaff_x26 + 0x50);
        *(undefined4 **)(unaff_x26 + 0x48) = puVar11;
        *(undefined4 **)(unaff_x26 + 0x50) = unaff_x21;
        in_stack_00000050 = puVar13;
        uStack0000000000000060 = unaff_x22;
        if (lVar24 != 0) {
          __ZdlPv();
        }
        if (lVar21 != 0) {
          __ZdlPv(lVar21);
        }
        if (*(long *)(unaff_x29 + -0x68) != 0) {
          __ZdlPv();
        }
        return;
      }
      bVar5 = *(byte *)(lVar21 + unaff_x27 * 4);
      unaff_x28 = (ulong)bVar5;
      lVar21 = *(long *)(unaff_x26 + 0x88);
    } while (((ulong)(*(long *)(unaff_x26 + 0x90) - lVar21 >> 3) <= uStack0000000000000008) ||
            (uVar3 = *(uint *)(lVar21 + uStack0000000000000008 * 8), unaff_x27 != uVar3));
    uVar3 = *(int *)(lVar21 + uStack0000000000000008 * 8 + 4) + ~uVar3;
    uVar1 = -uVar3;
    if (-1 < (int)uVar3) {
      uVar1 = uVar3;
    }
    if (uVar1 < 0x2aab) {
code_r0x006b467c:
      unaff_x28 = (ulong)bVar5;
      goto LAB_006b4680;
    }
    if (puVar10 < in_stack_00000040) {
      puVar20 = puVar10 + 1;
      *puVar10 = 0x10017;
      puVar23 = unaff_x22;
      if (in_stack_00000040 <= puVar20) goto code_r0x006b43b8;
code_r0x006b4298:
      in_stack_00000038 = puVar20 + 1;
      *puVar20 = 0x43;
      lVar21 = *(long *)(unaff_x26 + 0x40);
      if (unaff_x21 <= puVar11) goto code_r0x006b448c;
LAB_006b42b0:
      unaff_x24 = puVar11 + 1;
      *puVar11 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
      unaff_x20 = puVar22;
      if (unaff_x24 < unaff_x21) goto LAB_006b42c4;
code_r0x006b4598:
      lVar25 = (long)unaff_x24 - (long)unaff_x20;
      lVar24 = lVar25 >> 2;
      uVar12 = lVar24 + 1;
      puVar22 = unaff_x20;
      puVar13 = unaff_x24;
      if (uVar12 >> 0x3e == 0) {
        uVar15 = (long)unaff_x21 - (long)unaff_x20 >> 1;
        if (uVar15 <= uVar12) {
          uVar15 = uVar12;
        }
        if (0x7ffffffffffffffb < (ulong)((long)unaff_x21 - (long)unaff_x20)) {
          uVar15 = 0x3fffffffffffffff;
        }
        if (uVar15 == 0) {
          lVar8 = 0;
          puVar22 = (undefined4 *)(lVar24 * 4);
          *puVar22 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
        }
        else {
          if (uVar15 >> 0x3e != 0) goto LAB_006b4e3c;
          lVar8 = __Znwm(uVar15 << 2);
          puVar22 = (undefined4 *)(lVar8 + lVar24 * 4);
          *puVar22 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
        }
        puVar13 = puVar22 + 1;
        if (unaff_x24 != unaff_x20) {
          puVar11 = unaff_x24 + -1;
          uVar12 = (long)puVar11 - (long)unaff_x20;
          if (uVar12 < 0xbc) {
          }
          else {
            uVar18 = (lVar8 + lVar25) - 4;
            if ((uVar18 - (uVar12 & 0xfffffffffffffffc) <= uVar18) &&
               ((undefined4 *)((long)puVar11 - (uVar12 & 0xfffffffffffffffc)) <= puVar11)) {
              if ((ulong)((long)puVar11 + (-lVar25 - lVar8) + 4) < 0x40) {
              }
              else {
                uVar12 = (uVar12 >> 2) + 1;
                uVar16 = uVar12 & 0x7ffffffffffffff0;
                puVar22 = puVar22 + -uVar16;
                puVar17 = (undefined8 *)(unaff_x24 + -8);
                puVar19 = (undefined8 *)(lVar8 + lVar24 * 4 + -0x20);
                uVar18 = uVar16;
                do {
                  uVar28 = *puVar17;
                  uVar27 = puVar17[3];
                  uVar26 = puVar17[2];
                  uVar32 = puVar17[-3];
                  uVar31 = puVar17[-4];
                  uVar30 = puVar17[-1];
                  uVar29 = puVar17[-2];
                  puVar19[1] = puVar17[1];
                  *puVar19 = uVar28;
                  puVar19[3] = uVar27;
                  puVar19[2] = uVar26;
                  puVar19[-3] = uVar32;
                  puVar19[-4] = uVar31;
                  puVar19[-1] = uVar30;
                  puVar19[-2] = uVar29;
                  puVar17 = puVar17 + -8;
                  puVar19 = puVar19 + -8;
                  uVar18 = uVar18 - 0x10;
                } while (uVar18 != 0);
                unaff_x24 = unaff_x24 + -uVar16;
                if (uVar12 == uVar16) goto LAB_006b465c;
              }
            }
          }
          do {
            unaff_x24 = unaff_x24 + -1;
            puVar22 = puVar22 + -1;
            *puVar22 = *unaff_x24;
          } while (unaff_x24 != unaff_x20);
        }
LAB_006b465c:
        unaff_x21 = (undefined4 *)(lVar8 + uVar15 * 4);
        if (unaff_x20 != (undefined4 *)0x0) {
          __ZdlPv(unaff_x20);
        }
        puVar11 = puVar13;
        puVar10 = in_stack_00000038;
        unaff_x26 = in_stack_00000028;
        goto code_r0x006b467c;
      }
LAB_006b4e20:
      in_stack_00000068 = in_stack_00000038;
      in_stack_00000070 = in_stack_00000040;
      uStack0000000000000048 = puVar22;
      in_stack_00000050 = puVar13;
      in_stack_00000058 = unaff_x21;
      uStack0000000000000060 = unaff_x22;
      func_0x00017f90(&uStack0000000000000048);
code_r0x006b4ed0:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x6b4ed4);
      (*pcVar6)();
    }
    lVar24 = (long)puVar10 - (long)unaff_x22;
    lVar21 = lVar24 >> 2;
    uVar12 = lVar21 + 1;
    if (uVar12 >> 0x3e != 0) {
      in_stack_00000068 = in_stack_00000038;
      in_stack_00000070 = in_stack_00000040;
      uStack0000000000000048 = puVar22;
      in_stack_00000050 = puVar13;
      in_stack_00000058 = unaff_x21;
      uStack0000000000000060 = unaff_x22;
      func_0x00017f90(&uStack0000000000000060);
      goto code_r0x006b4ed0;
    }
    uVar15 = (long)in_stack_00000040 - (long)unaff_x22 >> 1;
    if (uVar15 <= uVar12) {
      uVar15 = uVar12;
    }
    if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)unaff_x22)) {
      uVar15 = 0x3fffffffffffffff;
    }
    if (uVar15 == 0) {
      lVar25 = 0;
    }
    else {
      if (uVar15 >> 0x3e != 0) {
        in_stack_00000068 = in_stack_00000038;
        in_stack_00000070 = in_stack_00000040;
        uStack0000000000000048 = puVar22;
        in_stack_00000050 = puVar13;
        in_stack_00000058 = unaff_x21;
        uStack0000000000000060 = unaff_x22;
        func_0x00017514();
        goto code_r0x006b4ed0;
      }
      lVar25 = __Znwm(uVar15 << 2);
    }
    puVar23 = (undefined4 *)(lVar25 + lVar21 * 4);
    puVar20 = puVar23 + 1;
    *puVar23 = 0x10017;
    if (puVar10 != unaff_x22) {
      puVar9 = puVar10 + -1;
      uVar12 = (long)puVar9 - (long)unaff_x22;
      if (((uVar12 < 0xbc) ||
          (uVar18 = (lVar25 + lVar24) - 4, uVar18 < uVar18 - (uVar12 & 0xfffffffffffffffc))) ||
         ((puVar9 < (undefined4 *)((long)puVar9 - (uVar12 & 0xfffffffffffffffc)) ||
          ((ulong)((long)puVar9 + (4 - (lVar25 + lVar24))) < 0x40)))) {
        puVar9 = puVar10;
      }
      else {
        uVar12 = (uVar12 >> 2) + 1;
        uVar16 = uVar12 & 0x7ffffffffffffff0;
        puVar9 = puVar10 + -uVar16;
        puVar23 = puVar23 + -uVar16;
        puVar17 = (undefined8 *)(puVar10 + -8);
        puVar19 = (undefined8 *)(lVar25 + lVar21 * 4 + -0x20);
        uVar18 = uVar16;
        do {
          uVar28 = *puVar17;
          uVar27 = puVar17[3];
          uVar26 = puVar17[2];
          uVar32 = puVar17[-3];
          uVar31 = puVar17[-4];
          uVar30 = puVar17[-1];
          uVar29 = puVar17[-2];
          puVar19[1] = puVar17[1];
          *puVar19 = uVar28;
          puVar19[3] = uVar27;
          puVar19[2] = uVar26;
          puVar19[-3] = uVar32;
          puVar19[-4] = uVar31;
          puVar19[-1] = uVar30;
          puVar19[-2] = uVar29;
          puVar17 = puVar17 + -8;
          puVar19 = puVar19 + -8;
          uVar18 = uVar18 - 0x10;
        } while (uVar18 != 0);
        if (uVar12 == uVar16) goto joined_r0x006b4524;
      }
      do {
        puVar9 = puVar9 + -1;
        puVar23 = puVar23 + -1;
        *puVar23 = *puVar9;
      } while (puVar9 != unaff_x22);
    }
joined_r0x006b4524:
    in_stack_00000040 = (undefined4 *)(lVar25 + uVar15 * 4);
    if (unaff_x22 != (undefined4 *)0x0) {
      __ZdlPv(unaff_x22);
    }
    unaff_x22 = puVar23;
    unaff_x26 = in_stack_00000028;
    if (puVar20 < in_stack_00000040) goto code_r0x006b4298;
code_r0x006b43b8:
    lVar21 = (long)puVar20 - (long)puVar23;
    lVar24 = lVar21 >> 2;
    uVar12 = lVar24 + 1;
    if (uVar12 >> 0x3e != 0) {
      in_stack_00000070 = in_stack_00000040;
      uStack0000000000000048 = puVar22;
      in_stack_00000050 = puVar13;
      in_stack_00000058 = unaff_x21;
      uStack0000000000000060 = puVar23;
      in_stack_00000068 = puVar20;
      func_0x00017f90(&uStack0000000000000060);
      goto code_r0x006b4ed0;
    }
    uVar15 = (long)in_stack_00000040 - (long)puVar23 >> 1;
    if (uVar15 <= uVar12) {
      uVar15 = uVar12;
    }
    if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)puVar23)) {
      uVar15 = 0x3fffffffffffffff;
    }
    if (uVar15 == 0) {
      lVar25 = 0;
    }
    else {
      if (uVar15 >> 0x3e != 0) {
        in_stack_00000070 = in_stack_00000040;
        uStack0000000000000048 = puVar22;
        in_stack_00000050 = puVar13;
        in_stack_00000058 = unaff_x21;
        uStack0000000000000060 = puVar23;
        in_stack_00000068 = puVar20;
        func_0x00017514();
        goto code_r0x006b4ed0;
      }
      lVar25 = __Znwm(uVar15 << 2);
    }
    unaff_x22 = (undefined4 *)(lVar25 + lVar24 * 4);
    in_stack_00000038 = unaff_x22 + 1;
    *unaff_x22 = 0x43;
    if (puVar20 != puVar23) {
      puVar10 = puVar20 + -1;
      uVar12 = (long)puVar10 - (long)puVar23;
      if ((((uVar12 < 0xbc) ||
           (uVar18 = (lVar25 + lVar21) - 4, uVar18 < uVar18 - (uVar12 & 0xfffffffffffffffc))) ||
          (puVar10 < (undefined4 *)((long)puVar10 - (uVar12 & 0xfffffffffffffffc)))) ||
         ((ulong)((long)puVar10 + (-lVar21 - lVar25) + 4) < 0x40)) {
        puVar10 = puVar20;
      }
      else {
        uVar12 = (uVar12 >> 2) + 1;
        uVar16 = uVar12 & 0x7ffffffffffffff0;
        puVar10 = puVar20 + -uVar16;
        unaff_x22 = unaff_x22 + -uVar16;
        puVar17 = (undefined8 *)(puVar20 + -8);
        puVar19 = (undefined8 *)(lVar25 + lVar24 * 4 + -0x20);
        uVar18 = uVar16;
        do {
          uVar28 = *puVar17;
          uVar27 = puVar17[3];
          uVar26 = puVar17[2];
          uVar32 = puVar17[-3];
          uVar31 = puVar17[-4];
          uVar30 = puVar17[-1];
          uVar29 = puVar17[-2];
          puVar19[1] = puVar17[1];
          *puVar19 = uVar28;
          puVar19[3] = uVar27;
          puVar19[2] = uVar26;
          puVar19[-3] = uVar32;
          puVar19[-4] = uVar31;
          puVar19[-1] = uVar30;
          puVar19[-2] = uVar29;
          puVar17 = puVar17 + -8;
          puVar19 = puVar19 + -8;
          uVar18 = uVar18 - 0x10;
        } while (uVar18 != 0);
        if (uVar12 == uVar16) goto joined_r0x006b4614;
      }
      do {
        puVar10 = puVar10 + -1;
        unaff_x22 = unaff_x22 + -1;
        *unaff_x22 = *puVar10;
      } while (puVar10 != puVar23);
    }
joined_r0x006b4614:
    in_stack_00000040 = (undefined4 *)(lVar25 + uVar15 * 4);
    if (puVar23 != (undefined4 *)0x0) {
      __ZdlPv(puVar23);
    }
    lVar21 = *(long *)(in_stack_00000028 + 0x40);
    unaff_x26 = in_stack_00000028;
    if (puVar11 < unaff_x21) goto LAB_006b42b0;
code_r0x006b448c:
    lVar24 = (long)puVar11 - (long)puVar22;
    lVar25 = lVar24 >> 2;
    uVar12 = lVar25 + 1;
    if (uVar12 >> 0x3e != 0) goto LAB_006b4e20;
    uVar15 = (long)unaff_x21 - (long)puVar22 >> 1;
    if (uVar15 <= uVar12) {
      uVar15 = uVar12;
    }
    if (0x7ffffffffffffffb < (ulong)((long)unaff_x21 - (long)puVar22)) {
      uVar15 = 0x3fffffffffffffff;
    }
    if (uVar15 != 0) {
      if (uVar15 >> 0x3e == 0) {
        lVar8 = __Znwm(uVar15 << 2);
        unaff_x20 = (undefined4 *)(lVar8 + lVar25 * 4);
        *unaff_x20 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
        goto joined_r0x006b450c;
      }
LAB_006b4e3c:
      in_stack_00000068 = in_stack_00000038;
      in_stack_00000070 = in_stack_00000040;
      uStack0000000000000048 = puVar22;
      in_stack_00000050 = puVar13;
      in_stack_00000058 = unaff_x21;
      uStack0000000000000060 = unaff_x22;
      func_0x00017514();
      goto code_r0x006b4ed0;
    }
    lVar8 = 0;
    unaff_x20 = (undefined4 *)(lVar25 * 4);
    *unaff_x20 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
joined_r0x006b450c:
    unaff_x24 = unaff_x20 + 1;
    if (puVar11 != puVar22) {
      puVar13 = puVar11 + -1;
      uVar12 = (long)puVar13 - (long)puVar22;
      if (uVar12 < 0xbc) {
      }
      else {
        uVar18 = (lVar8 + lVar24) - 4;
        if ((uVar18 - (uVar12 & 0xfffffffffffffffc) <= uVar18) &&
           ((undefined4 *)((long)puVar13 - (uVar12 & 0xfffffffffffffffc)) <= puVar13)) {
          if ((ulong)((long)puVar13 + (4 - (lVar8 + lVar24))) < 0x40) {
          }
          else {
            uVar12 = (uVar12 >> 2) + 1;
            uVar16 = uVar12 & 0x7ffffffffffffff0;
            unaff_x20 = unaff_x20 + -uVar16;
            puVar17 = (undefined8 *)(puVar11 + -8);
            puVar19 = (undefined8 *)(lVar8 + lVar25 * 4 + -0x20);
            uVar18 = uVar16;
            do {
              uVar28 = *puVar17;
              uVar27 = puVar17[3];
              uVar26 = puVar17[2];
              uVar32 = puVar17[-3];
              uVar31 = puVar17[-4];
              uVar30 = puVar17[-1];
              uVar29 = puVar17[-2];
              puVar19[1] = puVar17[1];
              *puVar19 = uVar28;
              puVar19[3] = uVar27;
              puVar19[2] = uVar26;
              puVar19[-3] = uVar32;
              puVar19[-4] = uVar31;
              puVar19[-1] = uVar30;
              puVar19[-2] = uVar29;
              puVar17 = puVar17 + -8;
              puVar19 = puVar19 + -8;
              uVar18 = uVar18 - 0x10;
            } while (uVar18 != 0);
            puVar11 = puVar11 + -uVar16;
            if (uVar12 == uVar16) goto LAB_006b456c;
          }
        }
      }
      do {
        puVar11 = puVar11 + -1;
        unaff_x20 = unaff_x20 + -1;
        *unaff_x20 = *puVar11;
      } while (puVar11 != puVar22);
    }
LAB_006b456c:
    unaff_x21 = (undefined4 *)(lVar8 + uVar15 * 4);
    if (puVar22 != (undefined4 *)0x0) {
      __ZdlPv(puVar22);
      lVar21 = *(long *)(in_stack_00000028 + 0x40);
      unaff_x26 = in_stack_00000028;
      if (unaff_x24 < unaff_x21) goto LAB_006b42c4;
      goto code_r0x006b4598;
    }
    unaff_x26 = in_stack_00000028;
    if (unaff_x21 <= unaff_x24) goto code_r0x006b4598;
LAB_006b42c4:
    unaff_x28 = (ulong)bVar5;
    in_w8 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
  } while( true );
}

