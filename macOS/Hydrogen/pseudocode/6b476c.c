
void FUN_006b476c(long param_1)

{
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  undefined1 uVar5;
  int iVar6;
  code *pcVar7;
  long lVar8;
  undefined4 *puVar9;
  undefined4 *puVar10;
  ulong uVar11;
  uint *puVar12;
  ulong uVar13;
  ulong uVar14;
  undefined8 *puVar15;
  ulong uVar16;
  undefined8 *puVar17;
  long unaff_x19;
  long lVar18;
  undefined4 *puVar19;
  undefined4 *unaff_x20;
  undefined4 *unaff_x21;
  undefined4 *unaff_x22;
  undefined4 *unaff_x23;
  undefined4 *unaff_x25;
  ulong unaff_x26;
  long lVar20;
  ulong unaff_x27;
  ulong unaff_x28;
  long lVar21;
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
  undefined4 *in_stack_00000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined4 *in_stack_00000038;
  undefined4 *puStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined4 *in_stack_00000050;
  undefined4 *in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined4 *in_stack_00000068;
  undefined4 *in_stack_00000070;
  
code_r0x006b476c:
  if (unaff_x25 != unaff_x22) {
    puVar19 = unaff_x25 + -1;
    uVar11 = (long)puVar19 - (long)unaff_x22;
    if (uVar11 < 0xbc) {
    }
    else {
      uVar13 = (param_1 + (unaff_x28 & 0xfffffffffffffffc)) - 4;
      if ((uVar13 - (uVar11 & 0xfffffffffffffffc) <= uVar13) &&
         ((undefined4 *)((long)puVar19 - (uVar11 & 0xfffffffffffffffc)) <= puVar19)) {
        if ((long)puVar19 + (-(unaff_x28 & 0xfffffffffffffffc) - param_1) + 4 < 0x40) {
        }
        else {
          uVar11 = (uVar11 >> 2) + 1;
          uVar16 = uVar11 & 0x7ffffffffffffff0;
          unaff_x21 = unaff_x21 + -uVar16;
          puVar15 = (undefined8 *)(unaff_x25 + -8);
          puVar17 = (undefined8 *)(param_1 + unaff_x19 * 4 + -0x20);
          uVar13 = uVar16;
          do {
            uVar24 = *puVar15;
            uVar23 = puVar15[3];
            uVar22 = puVar15[2];
            uVar28 = puVar15[-3];
            uVar27 = puVar15[-4];
            uVar26 = puVar15[-1];
            uVar25 = puVar15[-2];
            puVar17[1] = puVar15[1];
            *puVar17 = uVar24;
            puVar17[3] = uVar23;
            puVar17[2] = uVar22;
            puVar17[-3] = uVar28;
            puVar17[-4] = uVar27;
            puVar17[-1] = uVar26;
            puVar17[-2] = uVar25;
            puVar15 = puVar15 + -8;
            puVar17 = puVar17 + -8;
            uVar13 = uVar13 - 0x10;
          } while (uVar13 != 0);
          unaff_x25 = unaff_x25 + -uVar16;
          if (uVar11 == uVar16) goto LAB_006b4798;
        }
      }
    }
    do {
      unaff_x25 = unaff_x25 + -1;
      unaff_x21 = unaff_x21 + -1;
      *unaff_x21 = *unaff_x25;
    } while (unaff_x25 != unaff_x22);
  }
LAB_006b4798:
  puStack0000000000000040 = (undefined4 *)(param_1 + unaff_x26 * 4);
  if (unaff_x22 != (undefined4 *)0x0) {
    __ZdlPv(unaff_x22);
  }
  lVar21 = *(long *)(in_stack_00000028 + 0x40);
  puVar19 = unaff_x20;
  unaff_x22 = unaff_x21;
  puVar10 = unaff_x23;
  if (unaff_x23 < in_stack_00000020) goto code_r0x006b46a8;
code_r0x006b47c0:
  lVar20 = (long)unaff_x23 - (long)puVar19;
  lVar18 = lVar20 >> 2;
  uVar11 = lVar18 + 1;
  if (uVar11 >> 0x3e != 0) {
    in_stack_00000068 = in_stack_00000038;
    in_stack_00000070 = puStack0000000000000040;
    in_stack_00000050 = in_stack_00000010;
    uStack0000000000000048 = puVar19;
    in_stack_00000058 = in_stack_00000020;
    uStack0000000000000060 = unaff_x22;
    func_0x00017f90(&uStack0000000000000048);
    goto code_r0x006b4ed0;
  }
  uVar13 = (long)in_stack_00000020 - (long)puVar19 >> 1;
  if (uVar13 <= uVar11) {
    uVar13 = uVar11;
  }
  if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000020 - (long)puVar19)) {
    uVar13 = 0x3fffffffffffffff;
  }
  if (uVar13 == 0) {
    lVar8 = 0;
    unaff_x20 = (undefined4 *)(lVar18 * 4);
    puVar10 = unaff_x20 + 1;
    *unaff_x20 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
    if (unaff_x23 == puVar19) goto code_r0x006b4898;
code_r0x006b4820:
    puVar9 = unaff_x23 + -1;
    uVar11 = (long)puVar9 - (long)puVar19;
    if ((((uVar11 < 0xbc) ||
         (uVar16 = (lVar8 + lVar20) - 4, uVar16 < uVar16 - (uVar11 & 0xfffffffffffffffc))) ||
        (puVar9 < (undefined4 *)((long)puVar9 - (uVar11 & 0xfffffffffffffffc)))) ||
       ((ulong)((long)puVar9 + (4 - (lVar8 + lVar20))) < 0x40)) {
      puVar9 = unaff_x23;
code_r0x006b4838:
      do {
        puVar9 = puVar9 + -1;
        unaff_x20 = unaff_x20 + -1;
        *unaff_x20 = *puVar9;
      } while (puVar9 != puVar19);
    }
    else {
      uVar11 = (uVar11 >> 2) + 1;
      uVar14 = uVar11 & 0x7ffffffffffffff0;
      puVar9 = unaff_x23 + -uVar14;
      unaff_x20 = unaff_x20 + -uVar14;
      puVar15 = (undefined8 *)(unaff_x23 + -8);
      puVar17 = (undefined8 *)(lVar8 + lVar18 * 4 + -0x20);
      uVar16 = uVar14;
      do {
        uVar24 = *puVar15;
        uVar23 = puVar15[3];
        uVar22 = puVar15[2];
        uVar28 = puVar15[-3];
        uVar27 = puVar15[-4];
        uVar26 = puVar15[-1];
        uVar25 = puVar15[-2];
        puVar17[1] = puVar15[1];
        *puVar17 = uVar24;
        puVar17[3] = uVar23;
        puVar17[2] = uVar22;
        puVar17[-3] = uVar28;
        puVar17[-4] = uVar27;
        puVar17[-1] = uVar26;
        puVar17[-2] = uVar25;
        puVar15 = puVar15 + -8;
        puVar17 = puVar17 + -8;
        uVar16 = uVar16 - 0x10;
      } while (uVar16 != 0);
      if (uVar11 != uVar14) goto code_r0x006b4838;
    }
    in_stack_00000020 = (undefined4 *)(lVar8 + uVar13 * 4);
    unaff_x23 = puVar10;
  }
  else {
    unaff_x20 = puVar19;
    if (uVar13 >> 0x3e != 0) goto code_r0x006b4dac;
    lVar8 = __Znwm(uVar13 << 2);
    unaff_x20 = (undefined4 *)(lVar8 + lVar18 * 4);
    puVar10 = unaff_x20 + 1;
    *unaff_x20 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
    if (unaff_x23 != puVar19) goto code_r0x006b4820;
code_r0x006b4898:
    in_stack_00000020 = (undefined4 *)(lVar8 + uVar13 * 4);
    unaff_x23 = puVar10;
  }
  if (puVar19 != (undefined4 *)0x0) {
    __ZdlPv(puVar19);
  }
  unaff_x27 = unaff_x27 + 1;
  in_stack_00000010 = unaff_x23;
  unaff_x25 = in_stack_00000038;
  if (in_stack_00000030._4_4_ != (int)unaff_x27) goto code_r0x006b46c8;
  while (lVar21 = *(long *)(in_stack_00000028 + 0x28),
        unaff_x27 < (ulong)(*(long *)(in_stack_00000028 + 0x30) - lVar21 >> 2)) {
    uVar5 = *(undefined1 *)(lVar21 + unaff_x27 * 4);
    lVar21 = *(long *)(in_stack_00000028 + 0x88);
    if ((in_stack_00000008 < (ulong)(*(long *)(in_stack_00000028 + 0x90) - lVar21 >> 3)) &&
       (uVar3 = *(uint *)(lVar21 + in_stack_00000008 * 8), unaff_x27 == uVar3)) {
      uVar3 = *(int *)(lVar21 + in_stack_00000008 * 8 + 4) + ~uVar3;
      uVar1 = -uVar3;
      if (-1 < (int)uVar3) {
        uVar1 = uVar3;
      }
      if (0x2aaa < uVar1) {
        if (unaff_x25 < puStack0000000000000040) {
          puVar10 = unaff_x25 + 1;
          *unaff_x25 = 0x10017;
          puVar19 = unaff_x22;
          if (puVar10 < puStack0000000000000040) goto code_r0x006b4298;
code_r0x006b43b8:
          lVar21 = (long)puVar10 - (long)puVar19;
          lVar18 = lVar21 >> 2;
          uVar11 = lVar18 + 1;
          if (uVar11 >> 0x3e == 0) {
            uVar13 = (long)puStack0000000000000040 - (long)puVar19 >> 1;
            if (uVar13 <= uVar11) {
              uVar13 = uVar11;
            }
            if (0x7ffffffffffffffb < (ulong)((long)puStack0000000000000040 - (long)puVar19)) {
              uVar13 = 0x3fffffffffffffff;
            }
            if (uVar13 == 0) {
              lVar20 = 0;
            }
            else {
              if (uVar13 >> 0x3e != 0) {
                in_stack_00000070 = puStack0000000000000040;
                uStack0000000000000048 = unaff_x20;
                in_stack_00000050 = in_stack_00000010;
                in_stack_00000058 = in_stack_00000020;
                uStack0000000000000060 = puVar19;
                in_stack_00000068 = puVar10;
                func_0x00017514();
                goto code_r0x006b4ed0;
              }
              lVar20 = __Znwm(uVar13 << 2);
            }
            unaff_x22 = (undefined4 *)(lVar20 + lVar18 * 4);
            in_stack_00000038 = unaff_x22 + 1;
            *unaff_x22 = 0x43;
            if (puVar10 != puVar19) {
              puVar9 = puVar10 + -1;
              uVar11 = (long)puVar9 - (long)puVar19;
              if ((((uVar11 < 0xbc) ||
                   (uVar16 = (lVar20 + lVar21) - 4, uVar16 < uVar16 - (uVar11 & 0xfffffffffffffffc))
                   ) || (puVar9 < (undefined4 *)((long)puVar9 - (uVar11 & 0xfffffffffffffffc)))) ||
                 ((ulong)((long)puVar9 + (-lVar21 - lVar20) + 4) < 0x40)) {
                puVar9 = puVar10;
              }
              else {
                uVar11 = (uVar11 >> 2) + 1;
                uVar14 = uVar11 & 0x7ffffffffffffff0;
                puVar9 = puVar10 + -uVar14;
                unaff_x22 = unaff_x22 + -uVar14;
                puVar15 = (undefined8 *)(puVar10 + -8);
                puVar17 = (undefined8 *)(lVar20 + lVar18 * 4 + -0x20);
                uVar16 = uVar14;
                do {
                  uVar24 = *puVar15;
                  uVar23 = puVar15[3];
                  uVar22 = puVar15[2];
                  uVar28 = puVar15[-3];
                  uVar27 = puVar15[-4];
                  uVar26 = puVar15[-1];
                  uVar25 = puVar15[-2];
                  puVar17[1] = puVar15[1];
                  *puVar17 = uVar24;
                  puVar17[3] = uVar23;
                  puVar17[2] = uVar22;
                  puVar17[-3] = uVar28;
                  puVar17[-4] = uVar27;
                  puVar17[-1] = uVar26;
                  puVar17[-2] = uVar25;
                  puVar15 = puVar15 + -8;
                  puVar17 = puVar17 + -8;
                  uVar16 = uVar16 - 0x10;
                } while (uVar16 != 0);
                if (uVar11 == uVar14) goto joined_r0x006b4614;
              }
              do {
                puVar9 = puVar9 + -1;
                unaff_x22 = unaff_x22 + -1;
                *unaff_x22 = *puVar9;
              } while (puVar9 != puVar19);
            }
joined_r0x006b4614:
            puStack0000000000000040 = (undefined4 *)(lVar20 + uVar13 * 4);
            if (puVar19 != (undefined4 *)0x0) {
              __ZdlPv(puVar19);
            }
            lVar21 = *(long *)(in_stack_00000028 + 0x40);
            if (in_stack_00000020 <= unaff_x23) goto code_r0x006b448c;
code_r0x006b42b0:
            puVar10 = unaff_x23 + 1;
            *unaff_x23 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
            puVar19 = unaff_x20;
            if (in_stack_00000020 <= puVar10) goto code_r0x006b4598;
            goto code_r0x006b42c4;
          }
          in_stack_00000070 = puStack0000000000000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = in_stack_00000020;
          uStack0000000000000060 = puVar19;
          in_stack_00000068 = puVar10;
          func_0x00017f90(&uStack0000000000000060);
          goto code_r0x006b4ed0;
        }
        lVar18 = (long)unaff_x25 - (long)unaff_x22;
        lVar21 = lVar18 >> 2;
        uVar11 = lVar21 + 1;
        if (uVar11 >> 0x3e != 0) {
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = puStack0000000000000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = in_stack_00000020;
          uStack0000000000000060 = unaff_x22;
          func_0x00017f90(&uStack0000000000000060);
          goto code_r0x006b4ed0;
        }
        uVar13 = (long)puStack0000000000000040 - (long)unaff_x22 >> 1;
        if (uVar13 <= uVar11) {
          uVar13 = uVar11;
        }
        if (0x7ffffffffffffffb < (ulong)((long)puStack0000000000000040 - (long)unaff_x22)) {
          uVar13 = 0x3fffffffffffffff;
        }
        if (uVar13 == 0) {
          lVar20 = 0;
        }
        else {
          if (uVar13 >> 0x3e != 0) {
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = puStack0000000000000040;
            uStack0000000000000048 = unaff_x20;
            in_stack_00000050 = in_stack_00000010;
            in_stack_00000058 = in_stack_00000020;
            uStack0000000000000060 = unaff_x22;
            func_0x00017514();
            goto code_r0x006b4ed0;
          }
          lVar20 = __Znwm(uVar13 << 2);
        }
        puVar19 = (undefined4 *)(lVar20 + lVar21 * 4);
        puVar10 = puVar19 + 1;
        *puVar19 = 0x10017;
        if (unaff_x25 != unaff_x22) {
          puVar9 = unaff_x25 + -1;
          uVar11 = (long)puVar9 - (long)unaff_x22;
          if (((uVar11 < 0xbc) ||
              (uVar16 = (lVar20 + lVar18) - 4, uVar16 < uVar16 - (uVar11 & 0xfffffffffffffffc))) ||
             ((puVar9 < (undefined4 *)((long)puVar9 - (uVar11 & 0xfffffffffffffffc)) ||
              ((ulong)((long)puVar9 + (4 - (lVar20 + lVar18))) < 0x40)))) {
            puVar9 = unaff_x25;
          }
          else {
            uVar11 = (uVar11 >> 2) + 1;
            uVar14 = uVar11 & 0x7ffffffffffffff0;
            puVar9 = unaff_x25 + -uVar14;
            puVar19 = puVar19 + -uVar14;
            puVar15 = (undefined8 *)(unaff_x25 + -8);
            puVar17 = (undefined8 *)(lVar20 + lVar21 * 4 + -0x20);
            uVar16 = uVar14;
            do {
              uVar24 = *puVar15;
              uVar23 = puVar15[3];
              uVar22 = puVar15[2];
              uVar28 = puVar15[-3];
              uVar27 = puVar15[-4];
              uVar26 = puVar15[-1];
              uVar25 = puVar15[-2];
              puVar17[1] = puVar15[1];
              *puVar17 = uVar24;
              puVar17[3] = uVar23;
              puVar17[2] = uVar22;
              puVar17[-3] = uVar28;
              puVar17[-4] = uVar27;
              puVar17[-1] = uVar26;
              puVar17[-2] = uVar25;
              puVar15 = puVar15 + -8;
              puVar17 = puVar17 + -8;
              uVar16 = uVar16 - 0x10;
            } while (uVar16 != 0);
            if (uVar11 == uVar14) goto joined_r0x006b4524;
          }
          do {
            puVar9 = puVar9 + -1;
            puVar19 = puVar19 + -1;
            *puVar19 = *puVar9;
          } while (puVar9 != unaff_x22);
        }
joined_r0x006b4524:
        puStack0000000000000040 = (undefined4 *)(lVar20 + uVar13 * 4);
        if (unaff_x22 != (undefined4 *)0x0) {
          __ZdlPv(unaff_x22);
        }
        unaff_x22 = puVar19;
        if (puStack0000000000000040 <= puVar10) goto code_r0x006b43b8;
code_r0x006b4298:
        in_stack_00000038 = puVar10 + 1;
        *puVar10 = 0x43;
        lVar21 = *(long *)(in_stack_00000028 + 0x40);
        if (unaff_x23 < in_stack_00000020) goto code_r0x006b42b0;
code_r0x006b448c:
        lVar18 = (long)unaff_x23 - (long)unaff_x20;
        lVar20 = lVar18 >> 2;
        uVar11 = lVar20 + 1;
        if (uVar11 >> 0x3e != 0) {
code_r0x006b4e20:
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = puStack0000000000000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = in_stack_00000020;
          uStack0000000000000060 = unaff_x22;
          func_0x00017f90(&uStack0000000000000048);
          goto code_r0x006b4ed0;
        }
        uVar13 = (long)in_stack_00000020 - (long)unaff_x20 >> 1;
        if (uVar13 <= uVar11) {
          uVar13 = uVar11;
        }
        if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000020 - (long)unaff_x20)) {
          uVar13 = 0x3fffffffffffffff;
        }
        if (uVar13 != 0) {
          if (uVar13 >> 0x3e == 0) {
            lVar8 = __Znwm(uVar13 << 2);
            puVar19 = (undefined4 *)(lVar8 + lVar20 * 4);
            *puVar19 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
            goto joined_r0x006b450c;
          }
code_r0x006b4e3c:
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = puStack0000000000000040;
          uStack0000000000000048 = unaff_x20;
          in_stack_00000050 = in_stack_00000010;
          in_stack_00000058 = in_stack_00000020;
          uStack0000000000000060 = unaff_x22;
          func_0x00017514();
          goto code_r0x006b4ed0;
        }
        lVar8 = 0;
        puVar19 = (undefined4 *)(lVar20 * 4);
        *puVar19 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
joined_r0x006b450c:
        puVar10 = puVar19 + 1;
        if (unaff_x23 != unaff_x20) {
          puVar9 = unaff_x23 + -1;
          uVar11 = (long)puVar9 - (long)unaff_x20;
          if (uVar11 < 0xbc) {
          }
          else {
            uVar16 = (lVar8 + lVar18) - 4;
            if ((uVar16 - (uVar11 & 0xfffffffffffffffc) <= uVar16) &&
               ((undefined4 *)((long)puVar9 - (uVar11 & 0xfffffffffffffffc)) <= puVar9)) {
              if ((ulong)((long)puVar9 + (4 - (lVar8 + lVar18))) < 0x40) {
              }
              else {
                uVar11 = (uVar11 >> 2) + 1;
                uVar14 = uVar11 & 0x7ffffffffffffff0;
                puVar19 = puVar19 + -uVar14;
                puVar15 = (undefined8 *)(unaff_x23 + -8);
                puVar17 = (undefined8 *)(lVar8 + lVar20 * 4 + -0x20);
                uVar16 = uVar14;
                do {
                  uVar24 = *puVar15;
                  uVar23 = puVar15[3];
                  uVar22 = puVar15[2];
                  uVar28 = puVar15[-3];
                  uVar27 = puVar15[-4];
                  uVar26 = puVar15[-1];
                  uVar25 = puVar15[-2];
                  puVar17[1] = puVar15[1];
                  *puVar17 = uVar24;
                  puVar17[3] = uVar23;
                  puVar17[2] = uVar22;
                  puVar17[-3] = uVar28;
                  puVar17[-4] = uVar27;
                  puVar17[-1] = uVar26;
                  puVar17[-2] = uVar25;
                  puVar15 = puVar15 + -8;
                  puVar17 = puVar17 + -8;
                  uVar16 = uVar16 - 0x10;
                } while (uVar16 != 0);
                unaff_x23 = unaff_x23 + -uVar14;
                if (uVar11 == uVar14) goto code_r0x006b456c;
              }
            }
          }
          do {
            unaff_x23 = unaff_x23 + -1;
            puVar19 = puVar19 + -1;
            *puVar19 = *unaff_x23;
          } while (unaff_x23 != unaff_x20);
        }
code_r0x006b456c:
        in_stack_00000020 = (undefined4 *)(lVar8 + uVar13 * 4);
        if (unaff_x20 == (undefined4 *)0x0) {
          if (in_stack_00000020 <= puVar10) goto code_r0x006b4598;
        }
        else {
          __ZdlPv(unaff_x20);
          lVar21 = *(long *)(in_stack_00000028 + 0x40);
          if (in_stack_00000020 <= puVar10) {
code_r0x006b4598:
            lVar20 = (long)puVar10 - (long)puVar19;
            lVar18 = lVar20 >> 2;
            uVar11 = lVar18 + 1;
            unaff_x20 = puVar19;
            in_stack_00000010 = puVar10;
            if (uVar11 >> 0x3e == 0) {
              uVar13 = (long)in_stack_00000020 - (long)puVar19 >> 1;
              if (uVar13 <= uVar11) {
                uVar13 = uVar11;
              }
              if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000020 - (long)puVar19)) {
                uVar13 = 0x3fffffffffffffff;
              }
              if (uVar13 == 0) {
                lVar8 = 0;
                unaff_x20 = (undefined4 *)(lVar18 * 4);
                *unaff_x20 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
              }
              else {
                if (uVar13 >> 0x3e != 0) goto code_r0x006b4e3c;
                lVar8 = __Znwm(uVar13 << 2);
                unaff_x20 = (undefined4 *)(lVar8 + lVar18 * 4);
                *unaff_x20 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
              }
              in_stack_00000010 = unaff_x20 + 1;
              if (puVar10 != puVar19) {
                puVar9 = puVar10 + -1;
                uVar11 = (long)puVar9 - (long)puVar19;
                if (uVar11 < 0xbc) {
                }
                else {
                  uVar16 = (lVar8 + lVar20) - 4;
                  if ((uVar16 - (uVar11 & 0xfffffffffffffffc) <= uVar16) &&
                     ((undefined4 *)((long)puVar9 - (uVar11 & 0xfffffffffffffffc)) <= puVar9)) {
                    if ((ulong)((long)puVar9 + (-lVar20 - lVar8) + 4) < 0x40) {
                    }
                    else {
                      uVar11 = (uVar11 >> 2) + 1;
                      uVar14 = uVar11 & 0x7ffffffffffffff0;
                      unaff_x20 = unaff_x20 + -uVar14;
                      puVar15 = (undefined8 *)(puVar10 + -8);
                      puVar17 = (undefined8 *)(lVar8 + lVar18 * 4 + -0x20);
                      uVar16 = uVar14;
                      do {
                        uVar24 = *puVar15;
                        uVar23 = puVar15[3];
                        uVar22 = puVar15[2];
                        uVar28 = puVar15[-3];
                        uVar27 = puVar15[-4];
                        uVar26 = puVar15[-1];
                        uVar25 = puVar15[-2];
                        puVar17[1] = puVar15[1];
                        *puVar17 = uVar24;
                        puVar17[3] = uVar23;
                        puVar17[2] = uVar22;
                        puVar17[-3] = uVar28;
                        puVar17[-4] = uVar27;
                        puVar17[-1] = uVar26;
                        puVar17[-2] = uVar25;
                        puVar15 = puVar15 + -8;
                        puVar17 = puVar17 + -8;
                        uVar16 = uVar16 - 0x10;
                      } while (uVar16 != 0);
                      puVar10 = puVar10 + -uVar14;
                      if (uVar11 == uVar14) goto code_r0x006b465c;
                    }
                  }
                }
                do {
                  puVar10 = puVar10 + -1;
                  unaff_x20 = unaff_x20 + -1;
                  *unaff_x20 = *puVar10;
                } while (puVar10 != puVar19);
              }
code_r0x006b465c:
              in_stack_00000020 = (undefined4 *)(lVar8 + uVar13 * 4);
              if (puVar19 != (undefined4 *)0x0) {
                __ZdlPv(puVar19);
              }
              unaff_x23 = in_stack_00000010;
              unaff_x25 = in_stack_00000038;
              goto code_r0x006b4680;
            }
            goto code_r0x006b4e20;
          }
        }
code_r0x006b42c4:
        in_stack_00000010 = puVar10 + 1;
        *puVar10 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
        unaff_x20 = puVar19;
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
        lVar21 = *(long *)(in_stack_00000028 + 0x28);
        if (puStack0000000000000040 <= unaff_x25) {
          uVar11 = unaff_x19 + 1;
          if (uVar11 >> 0x3e != 0) {
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = puStack0000000000000040;
            uStack0000000000000048 = unaff_x20;
            in_stack_00000050 = in_stack_00000010;
            in_stack_00000058 = in_stack_00000020;
            uStack0000000000000060 = unaff_x22;
            func_0x00017f90(&uStack0000000000000060);
            goto code_r0x006b4ed0;
          }
          unaff_x26 = (long)puStack0000000000000040 - (long)unaff_x22 >> 1;
          if (unaff_x26 <= uVar11) {
            unaff_x26 = uVar11;
          }
          if (0x7ffffffffffffffb < (ulong)((long)puStack0000000000000040 - (long)unaff_x22)) {
            unaff_x26 = 0x3fffffffffffffff;
          }
          if (unaff_x26 == 0) {
            param_1 = 0;
          }
          else {
            if (unaff_x26 >> 0x3e != 0) goto code_r0x006b4dac;
            param_1 = __Znwm(unaff_x26 << 2);
          }
          unaff_x21 = (undefined4 *)(param_1 + unaff_x19 * 4);
          in_stack_00000038 = unaff_x21 + 1;
          *unaff_x21 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
          goto code_r0x006b476c;
        }
        in_stack_00000038 = unaff_x25 + 1;
        *unaff_x25 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
        lVar21 = *(long *)(in_stack_00000028 + 0x40);
        puVar19 = unaff_x20;
        puVar10 = unaff_x23;
        if (in_stack_00000020 <= unaff_x23) goto code_r0x006b47c0;
code_r0x006b46a8:
        unaff_x23 = puVar10 + 1;
        *puVar10 = *(undefined4 *)(lVar21 + unaff_x27 * 4);
        unaff_x27 = unaff_x27 + 1;
        in_stack_00000010 = unaff_x23;
        unaff_x25 = in_stack_00000038;
      } while (in_stack_00000030._4_4_ != (int)unaff_x27);
    }
  }
  in_stack_00000068 = in_stack_00000038;
  puVar12 = *(uint **)(in_stack_00000028 + 0x88);
  puVar2 = *(uint **)(in_stack_00000028 + 0x90);
  if (puVar12 == puVar2) goto code_r0x006b4d50;
  lVar18 = *(long *)(unaff_x29 + -0x68);
  do {
    while( true ) {
      uVar3 = puVar12[1] + ~*puVar12;
      uVar4 = *(uint *)(lVar18 + (ulong)*puVar12 * 4);
      iVar6 = *(int *)(lVar18 + (ulong)puVar12[1] * 4) - uVar4;
      uVar1 = -uVar3;
      if (-1 < (int)uVar3) {
        uVar1 = uVar3;
      }
      if (uVar1 < 0x2aab) break;
      unaff_x22[uVar4 - 1] = (uint)*(byte *)(unaff_x22 + (uVar4 - 1)) | iVar6 * 0x100;
      *(undefined2 *)((long)unaff_x22 + (ulong)uVar4 * 4 + 2) = 0xfffe;
      puVar12 = puVar12 + 2;
      if (puVar12 == puVar2) goto code_r0x006b4d50;
    }
    *(short *)((long)unaff_x22 + (ulong)uVar4 * 4 + 2) =
         (short)((uint)(iVar6 * 0x10000 + -0x10000) >> 0x10);
    puVar12 = puVar12 + 2;
  } while (puVar12 != puVar2);
code_r0x006b4d50:
  *(undefined4 **)(in_stack_00000028 + 0x28) = unaff_x22;
  *(undefined4 **)(in_stack_00000028 + 0x30) = unaff_x25;
  lVar18 = *(long *)(in_stack_00000028 + 0x40);
  *(undefined4 **)(in_stack_00000028 + 0x38) = puStack0000000000000040;
  *(undefined4 **)(in_stack_00000028 + 0x40) = unaff_x20;
  in_stack_00000058 = *(undefined4 **)(in_stack_00000028 + 0x50);
  *(undefined4 **)(in_stack_00000028 + 0x48) = unaff_x23;
  *(undefined4 **)(in_stack_00000028 + 0x50) = in_stack_00000020;
  in_stack_00000050 = in_stack_00000010;
  uStack0000000000000060 = unaff_x22;
  if (lVar18 != 0) {
    __ZdlPv();
  }
  if (lVar21 != 0) {
    __ZdlPv(lVar21);
  }
  if (*(long *)(unaff_x29 + -0x68) != 0) {
    __ZdlPv();
  }
  return;
code_r0x006b4dac:
  in_stack_00000068 = in_stack_00000038;
  in_stack_00000070 = puStack0000000000000040;
  in_stack_00000050 = in_stack_00000010;
  uStack0000000000000048 = unaff_x20;
  in_stack_00000058 = in_stack_00000020;
  uStack0000000000000060 = unaff_x22;
  func_0x00017514();
code_r0x006b4ed0:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x6b4ed4);
  (*pcVar7)();
}

