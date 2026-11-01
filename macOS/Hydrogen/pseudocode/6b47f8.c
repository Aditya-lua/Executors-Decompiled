
void FUN_006b47f8(void)

{
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  undefined1 uVar5;
  int iVar6;
  code *pcVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  undefined4 *puVar11;
  undefined4 *puVar12;
  undefined4 *puVar13;
  ulong uVar14;
  undefined4 *puVar15;
  uint *puVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 *puVar19;
  ulong uVar20;
  undefined8 *puVar21;
  undefined4 *puVar22;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *unaff_x21;
  undefined4 *unaff_x22;
  undefined4 *unaff_x23;
  long lVar23;
  ulong unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  ulong in_stack_00000008;
  undefined4 *in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined4 *in_stack_00000038;
  undefined4 *in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined4 *in_stack_00000050;
  undefined4 *in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined4 *in_stack_00000068;
  undefined4 *in_stack_00000070;
  
code_r0x006b47f8:
  if (unaff_x25 >> 0x3e != 0) {
LAB_006b4dac:
    in_stack_00000068 = in_stack_00000038;
    in_stack_00000070 = in_stack_00000040;
    in_stack_00000050 = in_stack_00000010;
    uStack0000000000000048 = unaff_x20;
    in_stack_00000058 = unaff_x21;
    uStack0000000000000060 = unaff_x22;
    func_0x00017514();
code_r0x006b4ed0:
                    /* WARNING: Does not return */
    pcVar7 = (code *)SoftwareBreakpoint(1,0x6b4ed4);
    (*pcVar7)();
  }
  lVar10 = __Znwm(unaff_x25 << 2);
  puVar12 = (undefined4 *)(lVar10 + unaff_x19 * 4);
  in_stack_00000010 = puVar12 + 1;
  *puVar12 = *(undefined4 *)(unaff_x28 + unaff_x27 * 4);
  if (unaff_x23 == unaff_x20) goto LAB_006b4898;
code_r0x006b4820:
  puVar15 = unaff_x23 + -1;
  uVar14 = (long)puVar15 - (long)unaff_x20;
  if ((((uVar14 < 0xbc) ||
       (uVar17 = (lVar10 + unaff_x26) - 4, uVar17 < uVar17 - (uVar14 & 0xfffffffffffffffc))) ||
      (puVar15 < (undefined4 *)((long)puVar15 - (uVar14 & 0xfffffffffffffffc)))) ||
     ((ulong)((long)puVar15 + (4 - (lVar10 + unaff_x26))) < 0x40)) {
    puVar15 = unaff_x23;
  }
  else {
    uVar14 = (uVar14 >> 2) + 1;
    uVar18 = uVar14 & 0x7ffffffffffffff0;
    puVar15 = unaff_x23 + -uVar18;
    puVar12 = puVar12 + -uVar18;
    puVar19 = (undefined8 *)(unaff_x23 + -8);
    puVar21 = (undefined8 *)(lVar10 + unaff_x19 * 4 + -0x20);
    uVar17 = uVar18;
    do {
      uVar26 = *puVar19;
      uVar25 = puVar19[3];
      uVar24 = puVar19[2];
      uVar30 = puVar19[-3];
      uVar29 = puVar19[-4];
      uVar28 = puVar19[-1];
      uVar27 = puVar19[-2];
      puVar21[1] = puVar19[1];
      *puVar21 = uVar26;
      puVar21[3] = uVar25;
      puVar21[2] = uVar24;
      puVar21[-3] = uVar30;
      puVar21[-4] = uVar29;
      puVar21[-1] = uVar28;
      puVar21[-2] = uVar27;
      puVar19 = puVar19 + -8;
      puVar21 = puVar21 + -8;
      uVar17 = uVar17 - 0x10;
    } while (uVar17 != 0);
    if (uVar14 == uVar18) goto LAB_006b4848;
  }
  do {
    puVar15 = puVar15 + -1;
    puVar12 = puVar12 + -1;
    *puVar12 = *puVar15;
  } while (puVar15 != unaff_x20);
LAB_006b4848:
  unaff_x21 = (undefined4 *)(lVar10 + unaff_x25 * 4);
  puVar15 = unaff_x20;
  unaff_x20 = puVar12;
  puVar12 = in_stack_00000038;
joined_r0x006b484c:
  if (puVar15 != (undefined4 *)0x0) {
    __ZdlPv(puVar15);
  }
  unaff_x27 = unaff_x27 + 1;
  unaff_x23 = in_stack_00000010;
  puVar15 = in_stack_00000010;
  in_stack_00000038 = puVar12;
  if (in_stack_00000030._4_4_ != (int)unaff_x27) goto LAB_006b46c8;
  do {
    lVar10 = *(long *)(in_stack_00000028 + 0x28);
    if ((ulong)(*(long *)(in_stack_00000028 + 0x30) - lVar10 >> 2) <= unaff_x27) {
      in_stack_00000068 = in_stack_00000038;
      puVar16 = *(uint **)(in_stack_00000028 + 0x88);
      puVar2 = *(uint **)(in_stack_00000028 + 0x90);
      if (puVar16 != puVar2) {
        lVar23 = *(long *)(unaff_x29 + -0x68);
        do {
          uVar3 = puVar16[1] + ~*puVar16;
          uVar4 = *(uint *)(lVar23 + (ulong)*puVar16 * 4);
          iVar6 = *(int *)(lVar23 + (ulong)puVar16[1] * 4) - uVar4;
          uVar1 = -uVar3;
          if (-1 < (int)uVar3) {
            uVar1 = uVar3;
          }
          if (uVar1 < 0x2aab) {
            *(short *)((long)unaff_x22 + (ulong)uVar4 * 4 + 2) =
                 (short)((uint)(iVar6 * 0x10000 + -0x10000) >> 0x10);
          }
          else {
            unaff_x22[uVar4 - 1] = (uint)*(byte *)(unaff_x22 + (uVar4 - 1)) | iVar6 * 0x100;
            *(undefined2 *)((long)unaff_x22 + (ulong)uVar4 * 4 + 2) = 0xfffe;
          }
          puVar16 = puVar16 + 2;
        } while (puVar16 != puVar2);
      }
      *(undefined4 **)(in_stack_00000028 + 0x28) = unaff_x22;
      *(undefined4 **)(in_stack_00000028 + 0x30) = puVar12;
      lVar23 = *(long *)(in_stack_00000028 + 0x40);
      *(undefined4 **)(in_stack_00000028 + 0x38) = in_stack_00000040;
      *(undefined4 **)(in_stack_00000028 + 0x40) = unaff_x20;
      in_stack_00000058 = *(undefined4 **)(in_stack_00000028 + 0x50);
      *(undefined4 **)(in_stack_00000028 + 0x48) = in_stack_00000010;
      *(undefined4 **)(in_stack_00000028 + 0x50) = unaff_x21;
      in_stack_00000050 = puVar15;
      uStack0000000000000060 = unaff_x22;
      if (lVar23 != 0) {
        __ZdlPv();
      }
      if (lVar10 != 0) {
        __ZdlPv(lVar10);
      }
      if (*(long *)(unaff_x29 + -0x68) != 0) {
        __ZdlPv();
      }
      return;
    }
    uVar5 = *(undefined1 *)(lVar10 + unaff_x27 * 4);
    lVar10 = *(long *)(in_stack_00000028 + 0x88);
    if ((in_stack_00000008 < (ulong)(*(long *)(in_stack_00000028 + 0x90) - lVar10 >> 3)) &&
       (uVar3 = *(uint *)(lVar10 + in_stack_00000008 * 8), unaff_x27 == uVar3)) {
      uVar3 = *(int *)(lVar10 + in_stack_00000008 * 8 + 4) + ~uVar3;
      uVar1 = -uVar3;
      if (-1 < (int)uVar3) {
        uVar1 = uVar3;
      }
      if (0x2aaa < uVar1) {
        if (puVar12 < in_stack_00000040) {
          puVar22 = puVar12 + 1;
          *puVar12 = 0x10017;
          puVar13 = unaff_x22;
          if (puVar22 < in_stack_00000040) goto code_r0x006b4298;
code_r0x006b43b8:
          lVar10 = (long)puVar22 - (long)puVar13;
          lVar23 = lVar10 >> 2;
          uVar14 = lVar23 + 1;
          if (uVar14 >> 0x3e == 0) {
            uVar17 = (long)in_stack_00000040 - (long)puVar13 >> 1;
            if (uVar17 <= uVar14) {
              uVar17 = uVar14;
            }
            if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)puVar13)) {
              uVar17 = 0x3fffffffffffffff;
            }
            if (uVar17 == 0) {
              lVar9 = 0;
            }
            else {
              if (uVar17 >> 0x3e != 0) {
                in_stack_00000070 = in_stack_00000040;
                uStack0000000000000048 = unaff_x20;
                in_stack_00000050 = puVar15;
                in_stack_00000058 = unaff_x21;
                uStack0000000000000060 = puVar13;
                in_stack_00000068 = puVar22;
                func_0x00017514();
                goto code_r0x006b4ed0;
              }
              lVar9 = __Znwm(uVar17 << 2);
            }
            unaff_x22 = (undefined4 *)(lVar9 + lVar23 * 4);
            in_stack_00000038 = unaff_x22 + 1;
            *unaff_x22 = 0x43;
            if (puVar22 != puVar13) {
              puVar12 = puVar22 + -1;
              uVar14 = (long)puVar12 - (long)puVar13;
              if ((((uVar14 < 0xbc) ||
                   (uVar18 = (lVar9 + lVar10) - 4, uVar18 < uVar18 - (uVar14 & 0xfffffffffffffffc)))
                  || (puVar12 < (undefined4 *)((long)puVar12 - (uVar14 & 0xfffffffffffffffc)))) ||
                 ((ulong)((long)puVar12 + (-lVar10 - lVar9) + 4) < 0x40)) {
                puVar12 = puVar22;
              }
              else {
                uVar14 = (uVar14 >> 2) + 1;
                uVar20 = uVar14 & 0x7ffffffffffffff0;
                puVar12 = puVar22 + -uVar20;
                unaff_x22 = unaff_x22 + -uVar20;
                puVar19 = (undefined8 *)(puVar22 + -8);
                puVar21 = (undefined8 *)(lVar9 + lVar23 * 4 + -0x20);
                uVar18 = uVar20;
                do {
                  uVar26 = *puVar19;
                  uVar25 = puVar19[3];
                  uVar24 = puVar19[2];
                  uVar30 = puVar19[-3];
                  uVar29 = puVar19[-4];
                  uVar28 = puVar19[-1];
                  uVar27 = puVar19[-2];
                  puVar21[1] = puVar19[1];
                  *puVar21 = uVar26;
                  puVar21[3] = uVar25;
                  puVar21[2] = uVar24;
                  puVar21[-3] = uVar30;
                  puVar21[-4] = uVar29;
                  puVar21[-1] = uVar28;
                  puVar21[-2] = uVar27;
                  puVar19 = puVar19 + -8;
                  puVar21 = puVar21 + -8;
                  uVar18 = uVar18 - 0x10;
                } while (uVar18 != 0);
                if (uVar14 == uVar20) goto joined_r0x006b4614;
              }
              do {
                puVar12 = puVar12 + -1;
                unaff_x22 = unaff_x22 + -1;
                *unaff_x22 = *puVar12;
              } while (puVar12 != puVar13);
            }
joined_r0x006b4614:
            in_stack_00000040 = (undefined4 *)(lVar9 + uVar17 * 4);
            if (puVar13 != (undefined4 *)0x0) {
              __ZdlPv(puVar13);
            }
            lVar10 = *(long *)(in_stack_00000028 + 0x40);
            if (unaff_x21 <= in_stack_00000010) goto code_r0x006b448c;
code_r0x006b42b0:
            puVar13 = in_stack_00000010 + 1;
            *in_stack_00000010 = *(undefined4 *)(lVar10 + unaff_x27 * 4);
            puVar12 = unaff_x20;
            if (unaff_x21 <= puVar13) goto code_r0x006b4598;
            goto code_r0x006b42c4;
          }
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = puVar15;
          in_stack_00000058 = unaff_x21;
          uStack0000000000000060 = puVar13;
          in_stack_00000068 = puVar22;
          func_0x00017f90(&uStack0000000000000060);
          goto code_r0x006b4ed0;
        }
        lVar23 = (long)puVar12 - (long)unaff_x22;
        lVar10 = lVar23 >> 2;
        uVar14 = lVar10 + 1;
        if (uVar14 >> 0x3e != 0) {
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = puVar15;
          in_stack_00000058 = unaff_x21;
          uStack0000000000000060 = unaff_x22;
          func_0x00017f90(&uStack0000000000000060);
          goto code_r0x006b4ed0;
        }
        uVar17 = (long)in_stack_00000040 - (long)unaff_x22 >> 1;
        if (uVar17 <= uVar14) {
          uVar17 = uVar14;
        }
        if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)unaff_x22)) {
          uVar17 = 0x3fffffffffffffff;
        }
        if (uVar17 == 0) {
          lVar9 = 0;
        }
        else {
          if (uVar17 >> 0x3e != 0) {
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = in_stack_00000040;
            uStack0000000000000048 = unaff_x20;
            in_stack_00000050 = puVar15;
            in_stack_00000058 = unaff_x21;
            uStack0000000000000060 = unaff_x22;
            func_0x00017514();
            goto code_r0x006b4ed0;
          }
          lVar9 = __Znwm(uVar17 << 2);
        }
        puVar13 = (undefined4 *)(lVar9 + lVar10 * 4);
        puVar22 = puVar13 + 1;
        *puVar13 = 0x10017;
        if (puVar12 != unaff_x22) {
          puVar11 = puVar12 + -1;
          uVar14 = (long)puVar11 - (long)unaff_x22;
          if (((uVar14 < 0xbc) ||
              (uVar18 = (lVar9 + lVar23) - 4, uVar18 < uVar18 - (uVar14 & 0xfffffffffffffffc))) ||
             ((puVar11 < (undefined4 *)((long)puVar11 - (uVar14 & 0xfffffffffffffffc)) ||
              ((ulong)((long)puVar11 + (4 - (lVar9 + lVar23))) < 0x40)))) {
            puVar11 = puVar12;
          }
          else {
            uVar14 = (uVar14 >> 2) + 1;
            uVar20 = uVar14 & 0x7ffffffffffffff0;
            puVar11 = puVar12 + -uVar20;
            puVar13 = puVar13 + -uVar20;
            puVar19 = (undefined8 *)(puVar12 + -8);
            puVar21 = (undefined8 *)(lVar9 + lVar10 * 4 + -0x20);
            uVar18 = uVar20;
            do {
              uVar26 = *puVar19;
              uVar25 = puVar19[3];
              uVar24 = puVar19[2];
              uVar30 = puVar19[-3];
              uVar29 = puVar19[-4];
              uVar28 = puVar19[-1];
              uVar27 = puVar19[-2];
              puVar21[1] = puVar19[1];
              *puVar21 = uVar26;
              puVar21[3] = uVar25;
              puVar21[2] = uVar24;
              puVar21[-3] = uVar30;
              puVar21[-4] = uVar29;
              puVar21[-1] = uVar28;
              puVar21[-2] = uVar27;
              puVar19 = puVar19 + -8;
              puVar21 = puVar21 + -8;
              uVar18 = uVar18 - 0x10;
            } while (uVar18 != 0);
            if (uVar14 == uVar20) goto joined_r0x006b4524;
          }
          do {
            puVar11 = puVar11 + -1;
            puVar13 = puVar13 + -1;
            *puVar13 = *puVar11;
          } while (puVar11 != unaff_x22);
        }
joined_r0x006b4524:
        in_stack_00000040 = (undefined4 *)(lVar9 + uVar17 * 4);
        if (unaff_x22 != (undefined4 *)0x0) {
          __ZdlPv(unaff_x22);
        }
        unaff_x22 = puVar13;
        if (in_stack_00000040 <= puVar22) goto code_r0x006b43b8;
code_r0x006b4298:
        in_stack_00000038 = puVar22 + 1;
        *puVar22 = 0x43;
        lVar10 = *(long *)(in_stack_00000028 + 0x40);
        if (in_stack_00000010 < unaff_x21) goto code_r0x006b42b0;
code_r0x006b448c:
        lVar23 = (long)in_stack_00000010 - (long)unaff_x20;
        lVar9 = lVar23 >> 2;
        uVar14 = lVar9 + 1;
        if (uVar14 >> 0x3e != 0) {
code_r0x006b4e20:
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = puVar15;
          in_stack_00000058 = unaff_x21;
          uStack0000000000000060 = unaff_x22;
          func_0x00017f90(&uStack0000000000000048);
          goto code_r0x006b4ed0;
        }
        uVar17 = (long)unaff_x21 - (long)unaff_x20 >> 1;
        if (uVar17 <= uVar14) {
          uVar17 = uVar14;
        }
        if (0x7ffffffffffffffb < (ulong)((long)unaff_x21 - (long)unaff_x20)) {
          uVar17 = 0x3fffffffffffffff;
        }
        if (uVar17 != 0) {
          if (uVar17 >> 0x3e == 0) {
            lVar8 = __Znwm(uVar17 << 2);
            puVar12 = (undefined4 *)(lVar8 + lVar9 * 4);
            *puVar12 = *(undefined4 *)(lVar10 + unaff_x27 * 4);
            goto joined_r0x006b450c;
          }
code_r0x006b4e3c:
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = puVar15;
          in_stack_00000058 = unaff_x21;
          uStack0000000000000060 = unaff_x22;
          func_0x00017514();
          goto code_r0x006b4ed0;
        }
        lVar8 = 0;
        puVar12 = (undefined4 *)(lVar9 * 4);
        *puVar12 = *(undefined4 *)(lVar10 + unaff_x27 * 4);
joined_r0x006b450c:
        puVar13 = puVar12 + 1;
        if (in_stack_00000010 != unaff_x20) {
          puVar15 = in_stack_00000010 + -1;
          uVar14 = (long)puVar15 - (long)unaff_x20;
          if (uVar14 < 0xbc) {
          }
          else {
            uVar18 = (lVar8 + lVar23) - 4;
            if ((uVar18 - (uVar14 & 0xfffffffffffffffc) <= uVar18) &&
               ((undefined4 *)((long)puVar15 - (uVar14 & 0xfffffffffffffffc)) <= puVar15)) {
              if ((ulong)((long)puVar15 + (4 - (lVar8 + lVar23))) < 0x40) {
              }
              else {
                uVar14 = (uVar14 >> 2) + 1;
                uVar20 = uVar14 & 0x7ffffffffffffff0;
                puVar12 = puVar12 + -uVar20;
                puVar19 = (undefined8 *)(in_stack_00000010 + -8);
                puVar21 = (undefined8 *)(lVar8 + lVar9 * 4 + -0x20);
                uVar18 = uVar20;
                do {
                  uVar26 = *puVar19;
                  uVar25 = puVar19[3];
                  uVar24 = puVar19[2];
                  uVar30 = puVar19[-3];
                  uVar29 = puVar19[-4];
                  uVar28 = puVar19[-1];
                  uVar27 = puVar19[-2];
                  puVar21[1] = puVar19[1];
                  *puVar21 = uVar26;
                  puVar21[3] = uVar25;
                  puVar21[2] = uVar24;
                  puVar21[-3] = uVar30;
                  puVar21[-4] = uVar29;
                  puVar21[-1] = uVar28;
                  puVar21[-2] = uVar27;
                  puVar19 = puVar19 + -8;
                  puVar21 = puVar21 + -8;
                  uVar18 = uVar18 - 0x10;
                } while (uVar18 != 0);
                in_stack_00000010 = in_stack_00000010 + -uVar20;
                if (uVar14 == uVar20) goto code_r0x006b456c;
              }
            }
          }
          do {
            in_stack_00000010 = in_stack_00000010 + -1;
            puVar12 = puVar12 + -1;
            *puVar12 = *in_stack_00000010;
          } while (in_stack_00000010 != unaff_x20);
        }
code_r0x006b456c:
        unaff_x21 = (undefined4 *)(lVar8 + uVar17 * 4);
        if (unaff_x20 == (undefined4 *)0x0) {
          if (unaff_x21 <= puVar13) goto code_r0x006b4598;
        }
        else {
          __ZdlPv(unaff_x20);
          lVar10 = *(long *)(in_stack_00000028 + 0x40);
          if (unaff_x21 <= puVar13) {
code_r0x006b4598:
            lVar9 = (long)puVar13 - (long)puVar12;
            lVar23 = lVar9 >> 2;
            uVar14 = lVar23 + 1;
            unaff_x20 = puVar12;
            puVar15 = puVar13;
            if (uVar14 >> 0x3e == 0) {
              uVar17 = (long)unaff_x21 - (long)puVar12 >> 1;
              if (uVar17 <= uVar14) {
                uVar17 = uVar14;
              }
              if (0x7ffffffffffffffb < (ulong)((long)unaff_x21 - (long)puVar12)) {
                uVar17 = 0x3fffffffffffffff;
              }
              if (uVar17 == 0) {
                lVar8 = 0;
                unaff_x20 = (undefined4 *)(lVar23 * 4);
                *unaff_x20 = *(undefined4 *)(lVar10 + unaff_x27 * 4);
              }
              else {
                if (uVar17 >> 0x3e != 0) goto code_r0x006b4e3c;
                lVar8 = __Znwm(uVar17 << 2);
                unaff_x20 = (undefined4 *)(lVar8 + lVar23 * 4);
                *unaff_x20 = *(undefined4 *)(lVar10 + unaff_x27 * 4);
              }
              puVar15 = unaff_x20 + 1;
              if (puVar13 != puVar12) {
                puVar22 = puVar13 + -1;
                uVar14 = (long)puVar22 - (long)puVar12;
                if (uVar14 < 0xbc) {
                }
                else {
                  uVar18 = (lVar8 + lVar9) - 4;
                  if ((uVar18 - (uVar14 & 0xfffffffffffffffc) <= uVar18) &&
                     ((undefined4 *)((long)puVar22 - (uVar14 & 0xfffffffffffffffc)) <= puVar22)) {
                    if ((ulong)((long)puVar22 + (-lVar9 - lVar8) + 4) < 0x40) {
                    }
                    else {
                      uVar14 = (uVar14 >> 2) + 1;
                      uVar20 = uVar14 & 0x7ffffffffffffff0;
                      unaff_x20 = unaff_x20 + -uVar20;
                      puVar19 = (undefined8 *)(puVar13 + -8);
                      puVar21 = (undefined8 *)(lVar8 + lVar23 * 4 + -0x20);
                      uVar18 = uVar20;
                      do {
                        uVar26 = *puVar19;
                        uVar25 = puVar19[3];
                        uVar24 = puVar19[2];
                        uVar30 = puVar19[-3];
                        uVar29 = puVar19[-4];
                        uVar28 = puVar19[-1];
                        uVar27 = puVar19[-2];
                        puVar21[1] = puVar19[1];
                        *puVar21 = uVar26;
                        puVar21[3] = uVar25;
                        puVar21[2] = uVar24;
                        puVar21[-3] = uVar30;
                        puVar21[-4] = uVar29;
                        puVar21[-1] = uVar28;
                        puVar21[-2] = uVar27;
                        puVar19 = puVar19 + -8;
                        puVar21 = puVar21 + -8;
                        uVar18 = uVar18 - 0x10;
                      } while (uVar18 != 0);
                      puVar13 = puVar13 + -uVar20;
                      if (uVar14 == uVar20) goto code_r0x006b465c;
                    }
                  }
                }
                do {
                  puVar13 = puVar13 + -1;
                  unaff_x20 = unaff_x20 + -1;
                  *unaff_x20 = *puVar13;
                } while (puVar13 != puVar12);
              }
code_r0x006b465c:
              unaff_x21 = (undefined4 *)(lVar8 + uVar17 * 4);
              if (puVar12 != (undefined4 *)0x0) {
                __ZdlPv(puVar12);
              }
              in_stack_00000010 = puVar15;
              puVar12 = in_stack_00000038;
              goto code_r0x006b4680;
            }
            goto code_r0x006b4e20;
          }
        }
code_r0x006b42c4:
        puVar15 = puVar13 + 1;
        *puVar13 = *(undefined4 *)(lVar10 + unaff_x27 * 4);
        unaff_x20 = puVar12;
        in_stack_00000010 = puVar15;
        puVar12 = in_stack_00000038;
      }
code_r0x006b4680:
      in_stack_00000008 = in_stack_00000008 + 1;
    }
    in_stack_00000030._4_4_ = func_0x0008a21c(uVar5);
    if (0 < in_stack_00000030._4_4_) {
      in_stack_00000030._4_4_ = in_stack_00000030._4_4_ + (int)unaff_x27;
      unaff_x23 = in_stack_00000010;
      in_stack_00000010 = puVar15;
LAB_006b46c8:
      do {
        lVar10 = (long)puVar12 - (long)unaff_x22 >> 2;
        *(int *)(in_stack_00000018 + unaff_x27 * 4) = (int)lVar10;
        lVar23 = *(long *)(in_stack_00000028 + 0x28);
        if (puVar12 < in_stack_00000040) {
          *puVar12 = *(undefined4 *)(lVar23 + unaff_x27 * 4);
          unaff_x28 = *(long *)(in_stack_00000028 + 0x40);
        }
        else {
          uVar14 = lVar10 + 1;
          if (uVar14 >> 0x3e != 0) {
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = in_stack_00000040;
            uStack0000000000000048 = unaff_x20;
            in_stack_00000050 = in_stack_00000010;
            in_stack_00000058 = unaff_x21;
            uStack0000000000000060 = unaff_x22;
            func_0x00017f90(&uStack0000000000000060);
            goto code_r0x006b4ed0;
          }
          uVar17 = (long)in_stack_00000040 - (long)unaff_x22 >> 1;
          if (uVar17 <= uVar14) {
            uVar17 = uVar14;
          }
          if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)unaff_x22)) {
            uVar17 = 0x3fffffffffffffff;
          }
          if (uVar17 == 0) {
            lVar9 = 0;
          }
          else {
            if (uVar17 >> 0x3e != 0) goto LAB_006b4dac;
            lVar9 = __Znwm(uVar17 << 2);
          }
          puVar15 = (undefined4 *)(lVar9 + lVar10 * 4);
          *puVar15 = *(undefined4 *)(lVar23 + unaff_x27 * 4);
          puVar13 = puVar15;
          if (puVar12 != unaff_x22) {
            puVar22 = puVar12 + -1;
            uVar14 = (long)puVar22 - (long)unaff_x22;
            if (uVar14 < 0xbc) {
            }
            else {
              uVar18 = (long)puVar12 - (long)unaff_x22 & 0xfffffffffffffffc;
              uVar20 = (lVar9 + uVar18) - 4;
              if ((uVar20 - (uVar14 & 0xfffffffffffffffc) <= uVar20) &&
                 ((undefined4 *)((long)puVar22 - (uVar14 & 0xfffffffffffffffc)) <= puVar22)) {
                if ((long)puVar22 + (-uVar18 - lVar9) + 4 < 0x40) {
                }
                else {
                  uVar14 = (uVar14 >> 2) + 1;
                  uVar20 = uVar14 & 0x7ffffffffffffff0;
                  puVar13 = puVar15 + -uVar20;
                  puVar19 = (undefined8 *)(puVar12 + -8);
                  puVar21 = (undefined8 *)(lVar9 + lVar10 * 4 + -0x20);
                  uVar18 = uVar20;
                  do {
                    uVar26 = *puVar19;
                    uVar25 = puVar19[3];
                    uVar24 = puVar19[2];
                    uVar30 = puVar19[-3];
                    uVar29 = puVar19[-4];
                    uVar28 = puVar19[-1];
                    uVar27 = puVar19[-2];
                    puVar21[1] = puVar19[1];
                    *puVar21 = uVar26;
                    puVar21[3] = uVar25;
                    puVar21[2] = uVar24;
                    puVar21[-3] = uVar30;
                    puVar21[-4] = uVar29;
                    puVar21[-1] = uVar28;
                    puVar21[-2] = uVar27;
                    puVar19 = puVar19 + -8;
                    puVar21 = puVar21 + -8;
                    uVar18 = uVar18 - 0x10;
                  } while (uVar18 != 0);
                  puVar12 = puVar12 + -uVar20;
                  if (uVar14 == uVar20) goto code_r0x006b4798;
                }
              }
            }
            do {
              puVar12 = puVar12 + -1;
              puVar13 = puVar13 + -1;
              *puVar13 = *puVar12;
            } while (puVar12 != unaff_x22);
          }
code_r0x006b4798:
          in_stack_00000040 = (undefined4 *)(lVar9 + uVar17 * 4);
          if (unaff_x22 != (undefined4 *)0x0) {
            __ZdlPv(unaff_x22);
          }
          unaff_x28 = *(long *)(in_stack_00000028 + 0x40);
          unaff_x22 = puVar13;
          puVar12 = puVar15;
        }
        puVar12 = puVar12 + 1;
        in_stack_00000038 = puVar12;
        if (unaff_x21 <= unaff_x23) {
          unaff_x26 = (long)unaff_x23 - (long)unaff_x20;
          unaff_x19 = unaff_x26 >> 2;
          uVar14 = unaff_x19 + 1;
          if (uVar14 >> 0x3e != 0) {
            uStack0000000000000048 = unaff_x20;
            in_stack_00000050 = in_stack_00000010;
            in_stack_00000058 = unaff_x21;
            uStack0000000000000060 = unaff_x22;
            in_stack_00000068 = puVar12;
            in_stack_00000070 = in_stack_00000040;
            func_0x00017f90(&uStack0000000000000048);
            goto code_r0x006b4ed0;
          }
          unaff_x25 = (long)unaff_x21 - (long)unaff_x20 >> 1;
          if (unaff_x25 <= uVar14) {
            unaff_x25 = uVar14;
          }
          if (0x7ffffffffffffffb < (ulong)((long)unaff_x21 - (long)unaff_x20)) {
            unaff_x25 = 0x3fffffffffffffff;
          }
          if (unaff_x25 != 0) goto code_r0x006b47f8;
          lVar10 = 0;
          puVar12 = (undefined4 *)(unaff_x19 * 4);
          in_stack_00000010 = puVar12 + 1;
          *puVar12 = *(undefined4 *)(unaff_x28 + unaff_x27 * 4);
          if (unaff_x23 == unaff_x20) goto LAB_006b4898;
          goto code_r0x006b4820;
        }
        in_stack_00000010 = unaff_x23 + 1;
        *unaff_x23 = *(undefined4 *)(unaff_x28 + unaff_x27 * 4);
        unaff_x27 = unaff_x27 + 1;
        unaff_x23 = in_stack_00000010;
        puVar15 = in_stack_00000010;
      } while (in_stack_00000030._4_4_ != (int)unaff_x27);
    }
  } while( true );
LAB_006b4898:
  unaff_x21 = (undefined4 *)(lVar10 + unaff_x25 * 4);
  puVar15 = unaff_x20;
  unaff_x20 = puVar12;
  puVar12 = in_stack_00000038;
  goto joined_r0x006b484c;
}

