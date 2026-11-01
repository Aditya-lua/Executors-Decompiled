
void FUN_006b4724(ulong param_1)

{
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  undefined1 uVar5;
  int iVar6;
  code *pcVar7;
  undefined1 in_ZR;
  undefined1 in_CY;
  long lVar8;
  long lVar9;
  undefined4 *puVar10;
  undefined4 *puVar11;
  ulong uVar12;
  uint *puVar13;
  ulong in_x9;
  ulong in_x10;
  ulong uVar14;
  ulong uVar15;
  undefined8 *puVar16;
  ulong uVar17;
  undefined8 *puVar18;
  long unaff_x19;
  long lVar19;
  undefined4 *puVar20;
  undefined4 *unaff_x20;
  undefined4 *unaff_x21;
  undefined4 *unaff_x22;
  undefined4 *unaff_x23;
  long unaff_x24;
  undefined4 *unaff_x25;
  long lVar21;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  ulong in_stack_00000008;
  undefined4 *in_stack_00000010;
  long in_stack_00000018;
  undefined4 *puStack0000000000000020;
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
  
code_r0x006b4724:
  if (!(bool)in_CY || (bool)in_ZR) {
    in_x10 = param_1;
  }
  if (0x7ffffffffffffffb < in_x9) {
    in_x10 = 0x3fffffffffffffff;
  }
  puVar20 = unaff_x20;
  puStack0000000000000020 = unaff_x21;
  if (in_x10 == 0) {
    lVar8 = 0;
  }
  else {
    if (in_x10 >> 0x3e != 0) {
LAB_006b4dac:
      in_stack_00000068 = in_stack_00000038;
      in_stack_00000070 = in_stack_00000040;
      in_stack_00000050 = in_stack_00000010;
      uStack0000000000000048 = puVar20;
      in_stack_00000058 = unaff_x21;
      uStack0000000000000060 = unaff_x22;
      func_0x00017514();
code_r0x006b4ed0:
                    /* WARNING: Does not return */
      pcVar7 = (code *)SoftwareBreakpoint(1,0x6b4ed4);
      (*pcVar7)();
    }
    lVar8 = __Znwm(in_x10 << 2);
  }
  puVar11 = (undefined4 *)(lVar8 + unaff_x19 * 4);
  in_stack_00000038 = puVar11 + 1;
  *puVar11 = *(undefined4 *)(unaff_x24 + unaff_x27 * 4);
  if (unaff_x25 != unaff_x22) {
    puVar10 = unaff_x25 + -1;
    uVar12 = (long)puVar10 - (long)unaff_x22;
    if (uVar12 < 0xbc) {
    }
    else {
      uVar14 = (lVar8 + (unaff_x28 & 0xfffffffffffffffc)) - 4;
      if ((uVar14 - (uVar12 & 0xfffffffffffffffc) <= uVar14) &&
         ((undefined4 *)((long)puVar10 - (uVar12 & 0xfffffffffffffffc)) <= puVar10)) {
        if ((long)puVar10 + (-(unaff_x28 & 0xfffffffffffffffc) - lVar8) + 4 < 0x40) {
        }
        else {
          uVar12 = (uVar12 >> 2) + 1;
          uVar17 = uVar12 & 0x7ffffffffffffff0;
          puVar11 = puVar11 + -uVar17;
          puVar16 = (undefined8 *)(unaff_x25 + -8);
          puVar18 = (undefined8 *)(lVar8 + unaff_x19 * 4 + -0x20);
          uVar14 = uVar17;
          do {
            uVar24 = *puVar16;
            uVar23 = puVar16[3];
            uVar22 = puVar16[2];
            uVar28 = puVar16[-3];
            uVar27 = puVar16[-4];
            uVar26 = puVar16[-1];
            uVar25 = puVar16[-2];
            puVar18[1] = puVar16[1];
            *puVar18 = uVar24;
            puVar18[3] = uVar23;
            puVar18[2] = uVar22;
            puVar18[-3] = uVar28;
            puVar18[-4] = uVar27;
            puVar18[-1] = uVar26;
            puVar18[-2] = uVar25;
            puVar16 = puVar16 + -8;
            puVar18 = puVar18 + -8;
            uVar14 = uVar14 - 0x10;
          } while (uVar14 != 0);
          unaff_x25 = unaff_x25 + -uVar17;
          if (uVar12 == uVar17) goto LAB_006b4798;
        }
      }
    }
    do {
      unaff_x25 = unaff_x25 + -1;
      puVar11 = puVar11 + -1;
      *puVar11 = *unaff_x25;
    } while (unaff_x25 != unaff_x22);
  }
LAB_006b4798:
  in_stack_00000040 = (undefined4 *)(lVar8 + in_x10 * 4);
  if (unaff_x22 != (undefined4 *)0x0) {
    __ZdlPv(unaff_x22);
  }
  lVar8 = *(long *)(in_stack_00000028 + 0x40);
  unaff_x21 = puStack0000000000000020;
  unaff_x22 = puVar11;
  puVar11 = unaff_x23;
  if (unaff_x23 < puStack0000000000000020) goto code_r0x006b46a8;
code_r0x006b47c0:
  lVar21 = (long)unaff_x23 - (long)puVar20;
  lVar19 = lVar21 >> 2;
  uVar12 = lVar19 + 1;
  if (uVar12 >> 0x3e != 0) {
    in_stack_00000068 = in_stack_00000038;
    in_stack_00000070 = in_stack_00000040;
    in_stack_00000050 = in_stack_00000010;
    uStack0000000000000048 = puVar20;
    in_stack_00000058 = unaff_x21;
    uStack0000000000000060 = unaff_x22;
    func_0x00017f90(&uStack0000000000000048);
    goto code_r0x006b4ed0;
  }
  uVar14 = (long)unaff_x21 - (long)puVar20 >> 1;
  if (uVar14 <= uVar12) {
    uVar14 = uVar12;
  }
  if (0x7ffffffffffffffb < (ulong)((long)unaff_x21 - (long)puVar20)) {
    uVar14 = 0x3fffffffffffffff;
  }
  if (uVar14 == 0) {
    lVar9 = 0;
    unaff_x20 = (undefined4 *)(lVar19 * 4);
    puVar11 = unaff_x20 + 1;
    *unaff_x20 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
    if (unaff_x23 == puVar20) goto code_r0x006b4898;
code_r0x006b4820:
    puVar10 = unaff_x23 + -1;
    uVar12 = (long)puVar10 - (long)puVar20;
    if ((((uVar12 < 0xbc) ||
         (uVar17 = (lVar9 + lVar21) - 4, uVar17 < uVar17 - (uVar12 & 0xfffffffffffffffc))) ||
        (puVar10 < (undefined4 *)((long)puVar10 - (uVar12 & 0xfffffffffffffffc)))) ||
       ((ulong)((long)puVar10 + (4 - (lVar9 + lVar21))) < 0x40)) {
      puVar10 = unaff_x23;
code_r0x006b4838:
      do {
        puVar10 = puVar10 + -1;
        unaff_x20 = unaff_x20 + -1;
        *unaff_x20 = *puVar10;
      } while (puVar10 != puVar20);
    }
    else {
      uVar12 = (uVar12 >> 2) + 1;
      uVar15 = uVar12 & 0x7ffffffffffffff0;
      puVar10 = unaff_x23 + -uVar15;
      unaff_x20 = unaff_x20 + -uVar15;
      puVar16 = (undefined8 *)(unaff_x23 + -8);
      puVar18 = (undefined8 *)(lVar9 + lVar19 * 4 + -0x20);
      uVar17 = uVar15;
      do {
        uVar24 = *puVar16;
        uVar23 = puVar16[3];
        uVar22 = puVar16[2];
        uVar28 = puVar16[-3];
        uVar27 = puVar16[-4];
        uVar26 = puVar16[-1];
        uVar25 = puVar16[-2];
        puVar18[1] = puVar16[1];
        *puVar18 = uVar24;
        puVar18[3] = uVar23;
        puVar18[2] = uVar22;
        puVar18[-3] = uVar28;
        puVar18[-4] = uVar27;
        puVar18[-1] = uVar26;
        puVar18[-2] = uVar25;
        puVar16 = puVar16 + -8;
        puVar18 = puVar18 + -8;
        uVar17 = uVar17 - 0x10;
      } while (uVar17 != 0);
      if (uVar12 != uVar15) goto code_r0x006b4838;
    }
    unaff_x21 = (undefined4 *)(lVar9 + uVar14 * 4);
    unaff_x23 = puVar11;
  }
  else {
    if (uVar14 >> 0x3e != 0) goto LAB_006b4dac;
    lVar9 = __Znwm(uVar14 << 2);
    unaff_x20 = (undefined4 *)(lVar9 + lVar19 * 4);
    puVar11 = unaff_x20 + 1;
    *unaff_x20 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
    if (unaff_x23 != puVar20) goto code_r0x006b4820;
code_r0x006b4898:
    unaff_x21 = (undefined4 *)(lVar9 + uVar14 * 4);
    unaff_x23 = puVar11;
  }
  if (puVar20 != (undefined4 *)0x0) {
    __ZdlPv(puVar20);
  }
  unaff_x27 = unaff_x27 + 1;
  in_stack_00000010 = unaff_x23;
  unaff_x25 = in_stack_00000038;
  if (in_stack_00000030._4_4_ != (int)unaff_x27) goto code_r0x006b46c8;
  while (lVar8 = *(long *)(in_stack_00000028 + 0x28),
        unaff_x27 < (ulong)(*(long *)(in_stack_00000028 + 0x30) - lVar8 >> 2)) {
    uVar5 = *(undefined1 *)(lVar8 + unaff_x27 * 4);
    lVar8 = *(long *)(in_stack_00000028 + 0x88);
    if ((in_stack_00000008 < (ulong)(*(long *)(in_stack_00000028 + 0x90) - lVar8 >> 3)) &&
       (uVar3 = *(uint *)(lVar8 + in_stack_00000008 * 8), unaff_x27 == uVar3)) {
      uVar3 = *(int *)(lVar8 + in_stack_00000008 * 8 + 4) + ~uVar3;
      uVar1 = -uVar3;
      if (-1 < (int)uVar3) {
        uVar1 = uVar3;
      }
      if (0x2aaa < uVar1) {
        puStack0000000000000020 = unaff_x21;
        if (unaff_x25 < in_stack_00000040) {
          puVar11 = unaff_x25 + 1;
          *unaff_x25 = 0x10017;
          puVar20 = unaff_x22;
          if (puVar11 < in_stack_00000040) goto code_r0x006b4298;
code_r0x006b43b8:
          lVar8 = (long)puVar11 - (long)puVar20;
          lVar19 = lVar8 >> 2;
          uVar12 = lVar19 + 1;
          if (uVar12 >> 0x3e == 0) {
            uVar14 = (long)in_stack_00000040 - (long)puVar20 >> 1;
            if (uVar14 <= uVar12) {
              uVar14 = uVar12;
            }
            if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)puVar20)) {
              uVar14 = 0x3fffffffffffffff;
            }
            if (uVar14 == 0) {
              lVar21 = 0;
            }
            else {
              if (uVar14 >> 0x3e != 0) {
                in_stack_00000070 = in_stack_00000040;
                uStack0000000000000048 = unaff_x20;
                in_stack_00000050 = in_stack_00000010;
                in_stack_00000058 = puStack0000000000000020;
                uStack0000000000000060 = puVar20;
                in_stack_00000068 = puVar11;
                func_0x00017514();
                goto code_r0x006b4ed0;
              }
              lVar21 = __Znwm(uVar14 << 2);
            }
            unaff_x22 = (undefined4 *)(lVar21 + lVar19 * 4);
            in_stack_00000038 = unaff_x22 + 1;
            *unaff_x22 = 0x43;
            if (puVar11 != puVar20) {
              puVar10 = puVar11 + -1;
              uVar12 = (long)puVar10 - (long)puVar20;
              if ((((uVar12 < 0xbc) ||
                   (uVar17 = (lVar21 + lVar8) - 4, uVar17 < uVar17 - (uVar12 & 0xfffffffffffffffc)))
                  || (puVar10 < (undefined4 *)((long)puVar10 - (uVar12 & 0xfffffffffffffffc)))) ||
                 ((ulong)((long)puVar10 + (-lVar8 - lVar21) + 4) < 0x40)) {
                puVar10 = puVar11;
              }
              else {
                uVar12 = (uVar12 >> 2) + 1;
                uVar15 = uVar12 & 0x7ffffffffffffff0;
                puVar10 = puVar11 + -uVar15;
                unaff_x22 = unaff_x22 + -uVar15;
                puVar16 = (undefined8 *)(puVar11 + -8);
                puVar18 = (undefined8 *)(lVar21 + lVar19 * 4 + -0x20);
                uVar17 = uVar15;
                do {
                  uVar24 = *puVar16;
                  uVar23 = puVar16[3];
                  uVar22 = puVar16[2];
                  uVar28 = puVar16[-3];
                  uVar27 = puVar16[-4];
                  uVar26 = puVar16[-1];
                  uVar25 = puVar16[-2];
                  puVar18[1] = puVar16[1];
                  *puVar18 = uVar24;
                  puVar18[3] = uVar23;
                  puVar18[2] = uVar22;
                  puVar18[-3] = uVar28;
                  puVar18[-4] = uVar27;
                  puVar18[-1] = uVar26;
                  puVar18[-2] = uVar25;
                  puVar16 = puVar16 + -8;
                  puVar18 = puVar18 + -8;
                  uVar17 = uVar17 - 0x10;
                } while (uVar17 != 0);
                if (uVar12 == uVar15) goto joined_r0x006b4614;
              }
              do {
                puVar10 = puVar10 + -1;
                unaff_x22 = unaff_x22 + -1;
                *unaff_x22 = *puVar10;
              } while (puVar10 != puVar20);
            }
joined_r0x006b4614:
            in_stack_00000040 = (undefined4 *)(lVar21 + uVar14 * 4);
            if (puVar20 != (undefined4 *)0x0) {
              __ZdlPv(puVar20);
            }
            lVar8 = *(long *)(in_stack_00000028 + 0x40);
            if (puStack0000000000000020 <= unaff_x23) goto code_r0x006b448c;
code_r0x006b42b0:
            puVar11 = unaff_x23 + 1;
            *unaff_x23 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
            puVar20 = unaff_x20;
            unaff_x21 = puStack0000000000000020;
            if (puStack0000000000000020 <= puVar11) goto code_r0x006b4598;
            goto code_r0x006b42c4;
          }
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = puStack0000000000000020;
          uStack0000000000000060 = puVar20;
          in_stack_00000068 = puVar11;
          func_0x00017f90(&uStack0000000000000060);
          goto code_r0x006b4ed0;
        }
        lVar19 = (long)unaff_x25 - (long)unaff_x22;
        lVar8 = lVar19 >> 2;
        uVar12 = lVar8 + 1;
        if (uVar12 >> 0x3e != 0) {
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = unaff_x21;
          uStack0000000000000060 = unaff_x22;
          func_0x00017f90(&uStack0000000000000060);
          goto code_r0x006b4ed0;
        }
        uVar14 = (long)in_stack_00000040 - (long)unaff_x22 >> 1;
        if (uVar14 <= uVar12) {
          uVar14 = uVar12;
        }
        if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)unaff_x22)) {
          uVar14 = 0x3fffffffffffffff;
        }
        if (uVar14 == 0) {
          lVar21 = 0;
        }
        else {
          if (uVar14 >> 0x3e != 0) {
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = in_stack_00000040;
            uStack0000000000000048 = unaff_x20;
            in_stack_00000050 = in_stack_00000010;
            in_stack_00000058 = unaff_x21;
            uStack0000000000000060 = unaff_x22;
            func_0x00017514();
            goto code_r0x006b4ed0;
          }
          lVar21 = __Znwm(uVar14 << 2);
        }
        puVar20 = (undefined4 *)(lVar21 + lVar8 * 4);
        puVar11 = puVar20 + 1;
        *puVar20 = 0x10017;
        if (unaff_x25 != unaff_x22) {
          puVar10 = unaff_x25 + -1;
          uVar12 = (long)puVar10 - (long)unaff_x22;
          if (((uVar12 < 0xbc) ||
              (uVar17 = (lVar21 + lVar19) - 4, uVar17 < uVar17 - (uVar12 & 0xfffffffffffffffc))) ||
             ((puVar10 < (undefined4 *)((long)puVar10 - (uVar12 & 0xfffffffffffffffc)) ||
              ((ulong)((long)puVar10 + (4 - (lVar21 + lVar19))) < 0x40)))) {
            puVar10 = unaff_x25;
          }
          else {
            uVar12 = (uVar12 >> 2) + 1;
            uVar15 = uVar12 & 0x7ffffffffffffff0;
            puVar10 = unaff_x25 + -uVar15;
            puVar20 = puVar20 + -uVar15;
            puVar16 = (undefined8 *)(unaff_x25 + -8);
            puVar18 = (undefined8 *)(lVar21 + lVar8 * 4 + -0x20);
            uVar17 = uVar15;
            do {
              uVar24 = *puVar16;
              uVar23 = puVar16[3];
              uVar22 = puVar16[2];
              uVar28 = puVar16[-3];
              uVar27 = puVar16[-4];
              uVar26 = puVar16[-1];
              uVar25 = puVar16[-2];
              puVar18[1] = puVar16[1];
              *puVar18 = uVar24;
              puVar18[3] = uVar23;
              puVar18[2] = uVar22;
              puVar18[-3] = uVar28;
              puVar18[-4] = uVar27;
              puVar18[-1] = uVar26;
              puVar18[-2] = uVar25;
              puVar16 = puVar16 + -8;
              puVar18 = puVar18 + -8;
              uVar17 = uVar17 - 0x10;
            } while (uVar17 != 0);
            if (uVar12 == uVar15) goto joined_r0x006b4524;
          }
          do {
            puVar10 = puVar10 + -1;
            puVar20 = puVar20 + -1;
            *puVar20 = *puVar10;
          } while (puVar10 != unaff_x22);
        }
joined_r0x006b4524:
        in_stack_00000040 = (undefined4 *)(lVar21 + uVar14 * 4);
        if (unaff_x22 != (undefined4 *)0x0) {
          __ZdlPv(unaff_x22);
        }
        unaff_x22 = puVar20;
        if (in_stack_00000040 <= puVar11) goto code_r0x006b43b8;
code_r0x006b4298:
        in_stack_00000038 = puVar11 + 1;
        *puVar11 = 0x43;
        lVar8 = *(long *)(in_stack_00000028 + 0x40);
        if (unaff_x23 < puStack0000000000000020) goto code_r0x006b42b0;
code_r0x006b448c:
        lVar19 = (long)unaff_x23 - (long)unaff_x20;
        lVar21 = lVar19 >> 2;
        uVar12 = lVar21 + 1;
        unaff_x21 = puStack0000000000000020;
        if (uVar12 >> 0x3e != 0) {
code_r0x006b4e20:
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = unaff_x21;
          uStack0000000000000060 = unaff_x22;
          func_0x00017f90(&uStack0000000000000048);
          goto code_r0x006b4ed0;
        }
        uVar14 = (long)puStack0000000000000020 - (long)unaff_x20 >> 1;
        if (uVar14 <= uVar12) {
          uVar14 = uVar12;
        }
        if (0x7ffffffffffffffb < (ulong)((long)puStack0000000000000020 - (long)unaff_x20)) {
          uVar14 = 0x3fffffffffffffff;
        }
        if (uVar14 != 0) {
          if (uVar14 >> 0x3e == 0) {
            lVar9 = __Znwm(uVar14 << 2);
            puVar20 = (undefined4 *)(lVar9 + lVar21 * 4);
            *puVar20 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
            goto joined_r0x006b450c;
          }
code_r0x006b4e3c:
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = unaff_x21;
          uStack0000000000000060 = unaff_x22;
          func_0x00017514();
          goto code_r0x006b4ed0;
        }
        lVar9 = 0;
        puVar20 = (undefined4 *)(lVar21 * 4);
        *puVar20 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
joined_r0x006b450c:
        puVar11 = puVar20 + 1;
        if (unaff_x23 != unaff_x20) {
          puVar10 = unaff_x23 + -1;
          uVar12 = (long)puVar10 - (long)unaff_x20;
          if (uVar12 < 0xbc) {
          }
          else {
            uVar17 = (lVar9 + lVar19) - 4;
            if ((uVar17 - (uVar12 & 0xfffffffffffffffc) <= uVar17) &&
               ((undefined4 *)((long)puVar10 - (uVar12 & 0xfffffffffffffffc)) <= puVar10)) {
              if ((ulong)((long)puVar10 + (4 - (lVar9 + lVar19))) < 0x40) {
              }
              else {
                uVar12 = (uVar12 >> 2) + 1;
                uVar15 = uVar12 & 0x7ffffffffffffff0;
                puVar20 = puVar20 + -uVar15;
                puVar16 = (undefined8 *)(unaff_x23 + -8);
                puVar18 = (undefined8 *)(lVar9 + lVar21 * 4 + -0x20);
                uVar17 = uVar15;
                do {
                  uVar24 = *puVar16;
                  uVar23 = puVar16[3];
                  uVar22 = puVar16[2];
                  uVar28 = puVar16[-3];
                  uVar27 = puVar16[-4];
                  uVar26 = puVar16[-1];
                  uVar25 = puVar16[-2];
                  puVar18[1] = puVar16[1];
                  *puVar18 = uVar24;
                  puVar18[3] = uVar23;
                  puVar18[2] = uVar22;
                  puVar18[-3] = uVar28;
                  puVar18[-4] = uVar27;
                  puVar18[-1] = uVar26;
                  puVar18[-2] = uVar25;
                  puVar16 = puVar16 + -8;
                  puVar18 = puVar18 + -8;
                  uVar17 = uVar17 - 0x10;
                } while (uVar17 != 0);
                unaff_x23 = unaff_x23 + -uVar15;
                if (uVar12 == uVar15) goto code_r0x006b456c;
              }
            }
          }
          do {
            unaff_x23 = unaff_x23 + -1;
            puVar20 = puVar20 + -1;
            *puVar20 = *unaff_x23;
          } while (unaff_x23 != unaff_x20);
        }
code_r0x006b456c:
        unaff_x21 = (undefined4 *)(lVar9 + uVar14 * 4);
        if (unaff_x20 == (undefined4 *)0x0) {
          if (unaff_x21 <= puVar11) goto code_r0x006b4598;
        }
        else {
          __ZdlPv(unaff_x20);
          lVar8 = *(long *)(in_stack_00000028 + 0x40);
          if (unaff_x21 <= puVar11) {
code_r0x006b4598:
            lVar21 = (long)puVar11 - (long)puVar20;
            lVar19 = lVar21 >> 2;
            uVar12 = lVar19 + 1;
            unaff_x20 = puVar20;
            in_stack_00000010 = puVar11;
            if (uVar12 >> 0x3e == 0) {
              uVar14 = (long)unaff_x21 - (long)puVar20 >> 1;
              if (uVar14 <= uVar12) {
                uVar14 = uVar12;
              }
              if (0x7ffffffffffffffb < (ulong)((long)unaff_x21 - (long)puVar20)) {
                uVar14 = 0x3fffffffffffffff;
              }
              if (uVar14 == 0) {
                lVar9 = 0;
                unaff_x20 = (undefined4 *)(lVar19 * 4);
                *unaff_x20 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
              }
              else {
                if (uVar14 >> 0x3e != 0) goto code_r0x006b4e3c;
                lVar9 = __Znwm(uVar14 << 2);
                unaff_x20 = (undefined4 *)(lVar9 + lVar19 * 4);
                *unaff_x20 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
              }
              in_stack_00000010 = unaff_x20 + 1;
              if (puVar11 != puVar20) {
                puVar10 = puVar11 + -1;
                uVar12 = (long)puVar10 - (long)puVar20;
                if (uVar12 < 0xbc) {
                }
                else {
                  uVar17 = (lVar9 + lVar21) - 4;
                  if ((uVar17 - (uVar12 & 0xfffffffffffffffc) <= uVar17) &&
                     ((undefined4 *)((long)puVar10 - (uVar12 & 0xfffffffffffffffc)) <= puVar10)) {
                    if ((ulong)((long)puVar10 + (-lVar21 - lVar9) + 4) < 0x40) {
                    }
                    else {
                      uVar12 = (uVar12 >> 2) + 1;
                      uVar15 = uVar12 & 0x7ffffffffffffff0;
                      unaff_x20 = unaff_x20 + -uVar15;
                      puVar16 = (undefined8 *)(puVar11 + -8);
                      puVar18 = (undefined8 *)(lVar9 + lVar19 * 4 + -0x20);
                      uVar17 = uVar15;
                      do {
                        uVar24 = *puVar16;
                        uVar23 = puVar16[3];
                        uVar22 = puVar16[2];
                        uVar28 = puVar16[-3];
                        uVar27 = puVar16[-4];
                        uVar26 = puVar16[-1];
                        uVar25 = puVar16[-2];
                        puVar18[1] = puVar16[1];
                        *puVar18 = uVar24;
                        puVar18[3] = uVar23;
                        puVar18[2] = uVar22;
                        puVar18[-3] = uVar28;
                        puVar18[-4] = uVar27;
                        puVar18[-1] = uVar26;
                        puVar18[-2] = uVar25;
                        puVar16 = puVar16 + -8;
                        puVar18 = puVar18 + -8;
                        uVar17 = uVar17 - 0x10;
                      } while (uVar17 != 0);
                      puVar11 = puVar11 + -uVar15;
                      if (uVar12 == uVar15) goto code_r0x006b465c;
                    }
                  }
                }
                do {
                  puVar11 = puVar11 + -1;
                  unaff_x20 = unaff_x20 + -1;
                  *unaff_x20 = *puVar11;
                } while (puVar11 != puVar20);
              }
code_r0x006b465c:
              unaff_x21 = (undefined4 *)(lVar9 + uVar14 * 4);
              if (puVar20 != (undefined4 *)0x0) {
                __ZdlPv(puVar20);
              }
              unaff_x23 = in_stack_00000010;
              unaff_x25 = in_stack_00000038;
              goto code_r0x006b4680;
            }
            goto code_r0x006b4e20;
          }
        }
code_r0x006b42c4:
        in_stack_00000010 = puVar11 + 1;
        *puVar11 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
        unaff_x20 = puVar20;
        unaff_x23 = in_stack_00000010;
        unaff_x25 = in_stack_00000038;
      }
code_r0x006b4680:
      in_stack_00000008 = in_stack_00000008 + 1;
    }
    in_stack_00000030._4_4_ = func_0x0008a21c(uVar5);
    if (0 < in_stack_00000030._4_4_) {
      in_stack_00000030._4_4_ = in_stack_00000030._4_4_ + (int)unaff_x27;
code_r0x006b46c8:
      do {
        unaff_x28 = (long)unaff_x25 - (long)unaff_x22;
        unaff_x19 = (long)unaff_x28 >> 2;
        *(int *)(in_stack_00000018 + unaff_x27 * 4) = (int)unaff_x19;
        unaff_x24 = *(long *)(in_stack_00000028 + 0x28);
        if (in_stack_00000040 <= unaff_x25) {
          param_1 = unaff_x19 + 1;
          if (param_1 >> 0x3e == 0) {
            in_x9 = (long)in_stack_00000040 - (long)unaff_x22;
            in_x10 = (long)in_x9 >> 1;
            in_CY = param_1 <= in_x10;
            in_ZR = in_x10 == param_1;
            goto code_r0x006b4724;
          }
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = unaff_x21;
          uStack0000000000000060 = unaff_x22;
          func_0x00017f90(&uStack0000000000000060);
          goto code_r0x006b4ed0;
        }
        in_stack_00000038 = unaff_x25 + 1;
        *unaff_x25 = *(undefined4 *)(unaff_x24 + unaff_x27 * 4);
        lVar8 = *(long *)(in_stack_00000028 + 0x40);
        puVar20 = unaff_x20;
        puVar11 = unaff_x23;
        if (unaff_x21 <= unaff_x23) goto code_r0x006b47c0;
code_r0x006b46a8:
        unaff_x23 = puVar11 + 1;
        *puVar11 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
        unaff_x27 = unaff_x27 + 1;
        in_stack_00000010 = unaff_x23;
        unaff_x25 = in_stack_00000038;
      } while (in_stack_00000030._4_4_ != (int)unaff_x27);
    }
  }
  in_stack_00000068 = in_stack_00000038;
  puVar13 = *(uint **)(in_stack_00000028 + 0x88);
  puVar2 = *(uint **)(in_stack_00000028 + 0x90);
  if (puVar13 == puVar2) goto code_r0x006b4d50;
  lVar19 = *(long *)(unaff_x29 + -0x68);
  do {
    while( true ) {
      uVar3 = puVar13[1] + ~*puVar13;
      uVar4 = *(uint *)(lVar19 + (ulong)*puVar13 * 4);
      iVar6 = *(int *)(lVar19 + (ulong)puVar13[1] * 4) - uVar4;
      uVar1 = -uVar3;
      if (-1 < (int)uVar3) {
        uVar1 = uVar3;
      }
      if (uVar1 < 0x2aab) break;
      unaff_x22[uVar4 - 1] = (uint)*(byte *)(unaff_x22 + (uVar4 - 1)) | iVar6 * 0x100;
      *(undefined2 *)((long)unaff_x22 + (ulong)uVar4 * 4 + 2) = 0xfffe;
      puVar13 = puVar13 + 2;
      if (puVar13 == puVar2) goto code_r0x006b4d50;
    }
    *(short *)((long)unaff_x22 + (ulong)uVar4 * 4 + 2) =
         (short)((uint)(iVar6 * 0x10000 + -0x10000) >> 0x10);
    puVar13 = puVar13 + 2;
  } while (puVar13 != puVar2);
code_r0x006b4d50:
  *(undefined4 **)(in_stack_00000028 + 0x28) = unaff_x22;
  *(undefined4 **)(in_stack_00000028 + 0x30) = unaff_x25;
  lVar19 = *(long *)(in_stack_00000028 + 0x40);
  *(undefined4 **)(in_stack_00000028 + 0x38) = in_stack_00000040;
  *(undefined4 **)(in_stack_00000028 + 0x40) = unaff_x20;
  in_stack_00000058 = *(undefined4 **)(in_stack_00000028 + 0x50);
  *(undefined4 **)(in_stack_00000028 + 0x48) = unaff_x23;
  *(undefined4 **)(in_stack_00000028 + 0x50) = unaff_x21;
  in_stack_00000050 = in_stack_00000010;
  uStack0000000000000060 = unaff_x22;
  if (lVar19 != 0) {
    __ZdlPv();
  }
  if (lVar8 != 0) {
    __ZdlPv(lVar8);
  }
  if (*(long *)(unaff_x29 + -0x68) != 0) {
    __ZdlPv();
  }
  return;
}

