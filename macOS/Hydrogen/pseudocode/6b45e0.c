
void FUN_006b45e0(void)

{
  uint uVar1;
  uint *puVar2;
  uint uVar3;
  uint uVar4;
  byte bVar5;
  code *pcVar6;
  int iVar7;
  long lVar8;
  long lVar9;
  undefined4 *puVar10;
  undefined4 *puVar11;
  undefined4 *puVar12;
  ulong uVar13;
  undefined4 *puVar14;
  uint *puVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 *puVar19;
  undefined8 *puVar20;
  undefined4 *puVar21;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *puVar22;
  undefined4 *puVar23;
  undefined4 *puVar24;
  long unaff_x21;
  undefined4 *unaff_x22;
  ulong unaff_x23;
  undefined4 *unaff_x24;
  long lVar25;
  long unaff_x25;
  long lVar26;
  ulong unaff_x27;
  ulong unaff_x28;
  long unaff_x29;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  ulong in_stack_00000008;
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
  
code_r0x006b45e0:
  lVar8 = __Znwm(unaff_x23 << 2);
  puVar12 = (undefined4 *)(lVar8 + unaff_x21 * 4);
  puVar14 = puVar12 + 1;
  *puVar12 = *(undefined4 *)(unaff_x19 + unaff_x27 * 4);
  if (unaff_x24 != unaff_x20) goto LAB_006b4638;
LAB_006b465c:
  puVar24 = (undefined4 *)(lVar8 + unaff_x23 * 4);
  if (unaff_x20 != (undefined4 *)0x0) {
    __ZdlPv(unaff_x20);
  }
  unaff_x20 = puVar12;
  puVar12 = puVar14;
  puVar11 = in_stack_00000038;
code_r0x006b467c:
code_r0x006b4680:
  in_stack_00000008 = in_stack_00000008 + 1;
  puVar23 = unaff_x20;
  do {
    iVar7 = func_0x0008a21c(unaff_x28);
    if (0 < iVar7) {
      iVar7 = iVar7 + (int)unaff_x27;
      puVar22 = puVar23;
      puVar21 = puVar12;
      puVar12 = puVar14;
      do {
        while( true ) {
          lVar8 = (long)puVar11 - (long)unaff_x22 >> 2;
          *(int *)(in_stack_00000018 + unaff_x27 * 4) = (int)lVar8;
          lVar25 = *(long *)(in_stack_00000028 + 0x28);
          if (puVar11 < in_stack_00000040) break;
          uVar13 = lVar8 + 1;
          if (uVar13 >> 0x3e != 0) {
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = in_stack_00000040;
            uStack0000000000000048 = puVar22;
            in_stack_00000050 = puVar12;
            in_stack_00000058 = puVar24;
            uStack0000000000000060 = unaff_x22;
            func_0x00017f90(&uStack0000000000000060);
            goto code_r0x006b4ed0;
          }
          uVar16 = (long)in_stack_00000040 - (long)unaff_x22 >> 1;
          if (uVar16 <= uVar13) {
            uVar16 = uVar13;
          }
          if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)unaff_x22)) {
            uVar16 = 0x3fffffffffffffff;
          }
          if (uVar16 != 0) {
            if (uVar16 >> 0x3e == 0) {
              lVar26 = __Znwm(uVar16 << 2);
              goto code_r0x006b4758;
            }
LAB_006b4dac:
            in_stack_00000068 = in_stack_00000038;
            in_stack_00000070 = in_stack_00000040;
            uStack0000000000000048 = puVar22;
            in_stack_00000050 = puVar12;
            in_stack_00000058 = puVar24;
            uStack0000000000000060 = unaff_x22;
            func_0x00017514();
            goto code_r0x006b4ed0;
          }
          lVar26 = 0;
code_r0x006b4758:
          puVar14 = (undefined4 *)(lVar26 + lVar8 * 4);
          in_stack_00000038 = puVar14 + 1;
          *puVar14 = *(undefined4 *)(lVar25 + unaff_x27 * 4);
          if (puVar11 != unaff_x22) {
            puVar23 = puVar11 + -1;
            uVar13 = (long)puVar23 - (long)unaff_x22;
            if (uVar13 < 0xbc) {
            }
            else {
              uVar18 = (long)puVar11 - (long)unaff_x22 & 0xfffffffffffffffc;
              uVar17 = (lVar26 + uVar18) - 4;
              if ((uVar17 - (uVar13 & 0xfffffffffffffffc) <= uVar17) &&
                 ((undefined4 *)((long)puVar23 - (uVar13 & 0xfffffffffffffffc)) <= puVar23)) {
                if ((long)puVar23 + (-uVar18 - lVar26) + 4 < 0x40) {
                }
                else {
                  uVar13 = (uVar13 >> 2) + 1;
                  uVar17 = uVar13 & 0x7ffffffffffffff0;
                  puVar14 = puVar14 + -uVar17;
                  puVar19 = (undefined8 *)(puVar11 + -8);
                  puVar20 = (undefined8 *)(lVar26 + lVar8 * 4 + -0x20);
                  uVar18 = uVar17;
                  do {
                    uVar29 = *puVar19;
                    uVar28 = puVar19[3];
                    uVar27 = puVar19[2];
                    uVar33 = puVar19[-3];
                    uVar32 = puVar19[-4];
                    uVar31 = puVar19[-1];
                    uVar30 = puVar19[-2];
                    puVar20[1] = puVar19[1];
                    *puVar20 = uVar29;
                    puVar20[3] = uVar28;
                    puVar20[2] = uVar27;
                    puVar20[-3] = uVar33;
                    puVar20[-4] = uVar32;
                    puVar20[-1] = uVar31;
                    puVar20[-2] = uVar30;
                    puVar19 = puVar19 + -8;
                    puVar20 = puVar20 + -8;
                    uVar18 = uVar18 - 0x10;
                  } while (uVar18 != 0);
                  puVar11 = puVar11 + -uVar17;
                  if (uVar13 == uVar17) goto code_r0x006b4798;
                }
              }
            }
            do {
              puVar11 = puVar11 + -1;
              puVar14 = puVar14 + -1;
              *puVar14 = *puVar11;
            } while (puVar11 != unaff_x22);
          }
code_r0x006b4798:
          in_stack_00000040 = (undefined4 *)(lVar26 + uVar16 * 4);
          if (unaff_x22 != (undefined4 *)0x0) {
            __ZdlPv(unaff_x22);
          }
          lVar8 = *(long *)(in_stack_00000028 + 0x40);
          unaff_x22 = puVar14;
          if (puVar24 <= puVar21) goto code_r0x006b47c0;
code_r0x006b46a8:
          puVar12 = puVar21 + 1;
          *puVar21 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
          unaff_x27 = unaff_x27 + 1;
          puVar23 = puVar22;
          unaff_x22 = puVar14;
          puVar21 = puVar12;
          puVar14 = puVar12;
          puVar11 = in_stack_00000038;
          if (iVar7 == (int)unaff_x27) goto LAB_006b420c;
        }
        in_stack_00000038 = puVar11 + 1;
        *puVar11 = *(undefined4 *)(lVar25 + unaff_x27 * 4);
        lVar8 = *(long *)(in_stack_00000028 + 0x40);
        puVar14 = unaff_x22;
        if (puVar21 < puVar24) goto code_r0x006b46a8;
code_r0x006b47c0:
        lVar26 = (long)puVar21 - (long)puVar22;
        lVar25 = lVar26 >> 2;
        uVar13 = lVar25 + 1;
        if (uVar13 >> 0x3e != 0) {
          in_stack_00000068 = in_stack_00000038;
          in_stack_00000070 = in_stack_00000040;
          uStack0000000000000048 = puVar22;
          in_stack_00000050 = puVar12;
          in_stack_00000058 = puVar24;
          uStack0000000000000060 = unaff_x22;
          func_0x00017f90(&uStack0000000000000048);
          goto code_r0x006b4ed0;
        }
        uVar16 = (long)puVar24 - (long)puVar22 >> 1;
        if (uVar16 <= uVar13) {
          uVar16 = uVar13;
        }
        if (0x7ffffffffffffffb < (ulong)((long)puVar24 - (long)puVar22)) {
          uVar16 = 0x3fffffffffffffff;
        }
        if (uVar16 == 0) {
          lVar9 = 0;
          puVar23 = (undefined4 *)(lVar25 * 4);
          puVar12 = puVar23 + 1;
          *puVar23 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
          if (puVar21 != puVar22) goto code_r0x006b4820;
LAB_006b4898:
          puVar24 = (undefined4 *)(lVar9 + uVar16 * 4);
        }
        else {
          if (uVar16 >> 0x3e != 0) goto LAB_006b4dac;
          lVar9 = __Znwm(uVar16 << 2);
          puVar23 = (undefined4 *)(lVar9 + lVar25 * 4);
          puVar12 = puVar23 + 1;
          *puVar23 = *(undefined4 *)(lVar8 + unaff_x27 * 4);
          if (puVar21 == puVar22) goto LAB_006b4898;
code_r0x006b4820:
          puVar14 = puVar21 + -1;
          uVar13 = (long)puVar14 - (long)puVar22;
          if ((((uVar13 < 0xbc) ||
               (uVar18 = (lVar9 + lVar26) - 4, uVar18 < uVar18 - (uVar13 & 0xfffffffffffffffc))) ||
              (puVar14 < (undefined4 *)((long)puVar14 - (uVar13 & 0xfffffffffffffffc)))) ||
             ((ulong)((long)puVar14 + (4 - (lVar9 + lVar26))) < 0x40)) {
            puVar14 = puVar21;
LAB_006b4838:
            do {
              puVar14 = puVar14 + -1;
              puVar23 = puVar23 + -1;
              *puVar23 = *puVar14;
            } while (puVar14 != puVar22);
          }
          else {
            uVar13 = (uVar13 >> 2) + 1;
            uVar17 = uVar13 & 0x7ffffffffffffff0;
            puVar14 = puVar21 + -uVar17;
            puVar23 = puVar23 + -uVar17;
            puVar19 = (undefined8 *)(puVar21 + -8);
            puVar20 = (undefined8 *)(lVar9 + lVar25 * 4 + -0x20);
            uVar18 = uVar17;
            do {
              uVar29 = *puVar19;
              uVar28 = puVar19[3];
              uVar27 = puVar19[2];
              uVar33 = puVar19[-3];
              uVar32 = puVar19[-4];
              uVar31 = puVar19[-1];
              uVar30 = puVar19[-2];
              puVar20[1] = puVar19[1];
              *puVar20 = uVar29;
              puVar20[3] = uVar28;
              puVar20[2] = uVar27;
              puVar20[-3] = uVar33;
              puVar20[-4] = uVar32;
              puVar20[-1] = uVar31;
              puVar20[-2] = uVar30;
              puVar19 = puVar19 + -8;
              puVar20 = puVar20 + -8;
              uVar18 = uVar18 - 0x10;
            } while (uVar18 != 0);
            if (uVar13 != uVar17) goto LAB_006b4838;
          }
          puVar24 = (undefined4 *)(lVar9 + uVar16 * 4);
        }
        if (puVar22 != (undefined4 *)0x0) {
          __ZdlPv(puVar22);
        }
        unaff_x27 = unaff_x27 + 1;
        puVar22 = puVar23;
        puVar21 = puVar12;
        puVar14 = puVar12;
        puVar11 = in_stack_00000038;
      } while (iVar7 != (int)unaff_x27);
    }
LAB_006b420c:
    lVar8 = *(long *)(in_stack_00000028 + 0x28);
    if ((ulong)(*(long *)(in_stack_00000028 + 0x30) - lVar8 >> 2) <= unaff_x27) {
      in_stack_00000068 = in_stack_00000038;
      puVar15 = *(uint **)(in_stack_00000028 + 0x88);
      puVar2 = *(uint **)(in_stack_00000028 + 0x90);
      if (puVar15 != puVar2) {
        lVar25 = *(long *)(unaff_x29 + -0x68);
        do {
          uVar3 = puVar15[1] + ~*puVar15;
          uVar4 = *(uint *)(lVar25 + (ulong)*puVar15 * 4);
          iVar7 = *(int *)(lVar25 + (ulong)puVar15[1] * 4) - uVar4;
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
          puVar15 = puVar15 + 2;
        } while (puVar15 != puVar2);
      }
      *(undefined4 **)(in_stack_00000028 + 0x28) = unaff_x22;
      *(undefined4 **)(in_stack_00000028 + 0x30) = puVar11;
      lVar25 = *(long *)(in_stack_00000028 + 0x40);
      *(undefined4 **)(in_stack_00000028 + 0x38) = in_stack_00000040;
      *(undefined4 **)(in_stack_00000028 + 0x40) = puVar23;
      in_stack_00000058 = *(undefined4 **)(in_stack_00000028 + 0x50);
      *(undefined4 **)(in_stack_00000028 + 0x48) = puVar12;
      *(undefined4 **)(in_stack_00000028 + 0x50) = puVar24;
      in_stack_00000050 = puVar14;
      uStack0000000000000060 = unaff_x22;
      if (lVar25 != 0) {
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
    bVar5 = *(byte *)(lVar8 + unaff_x27 * 4);
    unaff_x28 = (ulong)bVar5;
    lVar8 = *(long *)(in_stack_00000028 + 0x88);
  } while (((ulong)(*(long *)(in_stack_00000028 + 0x90) - lVar8 >> 3) <= in_stack_00000008) ||
          (uVar3 = *(uint *)(lVar8 + in_stack_00000008 * 8), unaff_x27 != uVar3));
  uVar3 = *(int *)(lVar8 + in_stack_00000008 * 8 + 4) + ~uVar3;
  uVar1 = -uVar3;
  if (-1 < (int)uVar3) {
    uVar1 = uVar3;
  }
  unaff_x20 = puVar23;
  if (uVar1 < 0x2aab) goto code_r0x006b467c;
  if (puVar11 < in_stack_00000040) {
    puVar21 = puVar11 + 1;
    *puVar11 = 0x10017;
    puVar22 = unaff_x22;
    if (in_stack_00000040 <= puVar21) goto code_r0x006b43b8;
code_r0x006b4298:
    in_stack_00000038 = puVar21 + 1;
    *puVar21 = 0x43;
    unaff_x19 = *(long *)(in_stack_00000028 + 0x40);
    if (puVar24 <= puVar12) goto code_r0x006b448c;
code_r0x006b42b0:
    unaff_x24 = puVar12 + 1;
    *puVar12 = *(undefined4 *)(unaff_x19 + unaff_x27 * 4);
    if (puVar24 <= unaff_x24) goto code_r0x006b4598;
    goto code_r0x006b42c4;
  }
  lVar25 = (long)puVar11 - (long)unaff_x22;
  lVar8 = lVar25 >> 2;
  uVar13 = lVar8 + 1;
  if (uVar13 >> 0x3e != 0) {
    in_stack_00000068 = in_stack_00000038;
    in_stack_00000070 = in_stack_00000040;
    uStack0000000000000048 = puVar23;
    in_stack_00000050 = puVar14;
    in_stack_00000058 = puVar24;
    uStack0000000000000060 = unaff_x22;
    func_0x00017f90(&uStack0000000000000060);
    goto code_r0x006b4ed0;
  }
  uVar16 = (long)in_stack_00000040 - (long)unaff_x22 >> 1;
  if (uVar16 <= uVar13) {
    uVar16 = uVar13;
  }
  if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)unaff_x22)) {
    uVar16 = 0x3fffffffffffffff;
  }
  if (uVar16 == 0) {
    lVar26 = 0;
  }
  else {
    if (uVar16 >> 0x3e != 0) {
      in_stack_00000068 = in_stack_00000038;
      in_stack_00000070 = in_stack_00000040;
      uStack0000000000000048 = puVar23;
      in_stack_00000050 = puVar14;
      in_stack_00000058 = puVar24;
      uStack0000000000000060 = unaff_x22;
      func_0x00017514();
      goto code_r0x006b4ed0;
    }
    lVar26 = __Znwm(uVar16 << 2);
  }
  puVar22 = (undefined4 *)(lVar26 + lVar8 * 4);
  puVar21 = puVar22 + 1;
  *puVar22 = 0x10017;
  if (puVar11 != unaff_x22) {
    puVar10 = puVar11 + -1;
    uVar13 = (long)puVar10 - (long)unaff_x22;
    if (((uVar13 < 0xbc) ||
        (uVar18 = (lVar26 + lVar25) - 4, uVar18 < uVar18 - (uVar13 & 0xfffffffffffffffc))) ||
       ((puVar10 < (undefined4 *)((long)puVar10 - (uVar13 & 0xfffffffffffffffc)) ||
        ((ulong)((long)puVar10 + (4 - (lVar26 + lVar25))) < 0x40)))) {
      puVar10 = puVar11;
    }
    else {
      uVar13 = (uVar13 >> 2) + 1;
      uVar17 = uVar13 & 0x7ffffffffffffff0;
      puVar10 = puVar11 + -uVar17;
      puVar22 = puVar22 + -uVar17;
      puVar19 = (undefined8 *)(puVar11 + -8);
      puVar20 = (undefined8 *)(lVar26 + lVar8 * 4 + -0x20);
      uVar18 = uVar17;
      do {
        uVar29 = *puVar19;
        uVar28 = puVar19[3];
        uVar27 = puVar19[2];
        uVar33 = puVar19[-3];
        uVar32 = puVar19[-4];
        uVar31 = puVar19[-1];
        uVar30 = puVar19[-2];
        puVar20[1] = puVar19[1];
        *puVar20 = uVar29;
        puVar20[3] = uVar28;
        puVar20[2] = uVar27;
        puVar20[-3] = uVar33;
        puVar20[-4] = uVar32;
        puVar20[-1] = uVar31;
        puVar20[-2] = uVar30;
        puVar19 = puVar19 + -8;
        puVar20 = puVar20 + -8;
        uVar18 = uVar18 - 0x10;
      } while (uVar18 != 0);
      if (uVar13 == uVar17) goto joined_r0x006b4524;
    }
    do {
      puVar10 = puVar10 + -1;
      puVar22 = puVar22 + -1;
      *puVar22 = *puVar10;
    } while (puVar10 != unaff_x22);
  }
joined_r0x006b4524:
  in_stack_00000040 = (undefined4 *)(lVar26 + uVar16 * 4);
  if (unaff_x22 != (undefined4 *)0x0) {
    __ZdlPv(unaff_x22);
  }
  unaff_x22 = puVar22;
  if (puVar21 < in_stack_00000040) goto code_r0x006b4298;
code_r0x006b43b8:
  lVar8 = (long)puVar21 - (long)puVar22;
  lVar25 = lVar8 >> 2;
  uVar13 = lVar25 + 1;
  if (uVar13 >> 0x3e != 0) {
    in_stack_00000070 = in_stack_00000040;
    uStack0000000000000048 = puVar23;
    in_stack_00000050 = puVar14;
    in_stack_00000058 = puVar24;
    uStack0000000000000060 = puVar22;
    in_stack_00000068 = puVar21;
    func_0x00017f90(&uStack0000000000000060);
    goto code_r0x006b4ed0;
  }
  uVar16 = (long)in_stack_00000040 - (long)puVar22 >> 1;
  if (uVar16 <= uVar13) {
    uVar16 = uVar13;
  }
  if (0x7ffffffffffffffb < (ulong)((long)in_stack_00000040 - (long)puVar22)) {
    uVar16 = 0x3fffffffffffffff;
  }
  if (uVar16 == 0) {
    lVar26 = 0;
  }
  else {
    if (uVar16 >> 0x3e != 0) {
      in_stack_00000070 = in_stack_00000040;
      uStack0000000000000048 = puVar23;
      in_stack_00000050 = puVar14;
      in_stack_00000058 = puVar24;
      uStack0000000000000060 = puVar22;
      in_stack_00000068 = puVar21;
      func_0x00017514();
      goto code_r0x006b4ed0;
    }
    lVar26 = __Znwm(uVar16 << 2);
  }
  unaff_x22 = (undefined4 *)(lVar26 + lVar25 * 4);
  in_stack_00000038 = unaff_x22 + 1;
  *unaff_x22 = 0x43;
  if (puVar21 != puVar22) {
    puVar11 = puVar21 + -1;
    uVar13 = (long)puVar11 - (long)puVar22;
    if ((((uVar13 < 0xbc) ||
         (uVar18 = (lVar26 + lVar8) - 4, uVar18 < uVar18 - (uVar13 & 0xfffffffffffffffc))) ||
        (puVar11 < (undefined4 *)((long)puVar11 - (uVar13 & 0xfffffffffffffffc)))) ||
       ((ulong)((long)puVar11 + (-lVar8 - lVar26) + 4) < 0x40)) {
      puVar11 = puVar21;
    }
    else {
      uVar13 = (uVar13 >> 2) + 1;
      uVar17 = uVar13 & 0x7ffffffffffffff0;
      puVar11 = puVar21 + -uVar17;
      unaff_x22 = unaff_x22 + -uVar17;
      puVar19 = (undefined8 *)(puVar21 + -8);
      puVar20 = (undefined8 *)(lVar26 + lVar25 * 4 + -0x20);
      uVar18 = uVar17;
      do {
        uVar29 = *puVar19;
        uVar28 = puVar19[3];
        uVar27 = puVar19[2];
        uVar33 = puVar19[-3];
        uVar32 = puVar19[-4];
        uVar31 = puVar19[-1];
        uVar30 = puVar19[-2];
        puVar20[1] = puVar19[1];
        *puVar20 = uVar29;
        puVar20[3] = uVar28;
        puVar20[2] = uVar27;
        puVar20[-3] = uVar33;
        puVar20[-4] = uVar32;
        puVar20[-1] = uVar31;
        puVar20[-2] = uVar30;
        puVar19 = puVar19 + -8;
        puVar20 = puVar20 + -8;
        uVar18 = uVar18 - 0x10;
      } while (uVar18 != 0);
      if (uVar13 == uVar17) goto joined_r0x006b4614;
    }
    do {
      puVar11 = puVar11 + -1;
      unaff_x22 = unaff_x22 + -1;
      *unaff_x22 = *puVar11;
    } while (puVar11 != puVar22);
  }
joined_r0x006b4614:
  in_stack_00000040 = (undefined4 *)(lVar26 + uVar16 * 4);
  if (puVar22 != (undefined4 *)0x0) {
    __ZdlPv(puVar22);
  }
  unaff_x19 = *(long *)(in_stack_00000028 + 0x40);
  if (puVar12 < puVar24) goto code_r0x006b42b0;
code_r0x006b448c:
  lVar8 = (long)puVar12 - (long)puVar23;
  lVar25 = lVar8 >> 2;
  uVar13 = lVar25 + 1;
  if (uVar13 >> 0x3e != 0) {
code_r0x006b4e20:
    in_stack_00000068 = in_stack_00000038;
    in_stack_00000070 = in_stack_00000040;
    uStack0000000000000048 = puVar23;
    in_stack_00000050 = puVar14;
    in_stack_00000058 = puVar24;
    uStack0000000000000060 = unaff_x22;
    func_0x00017f90(&uStack0000000000000048);
    goto code_r0x006b4ed0;
  }
  uVar16 = (long)puVar24 - (long)puVar23 >> 1;
  if (uVar16 <= uVar13) {
    uVar16 = uVar13;
  }
  if (0x7ffffffffffffffb < (ulong)((long)puVar24 - (long)puVar23)) {
    uVar16 = 0x3fffffffffffffff;
  }
  if (uVar16 != 0) {
    if (uVar16 >> 0x3e == 0) {
      lVar26 = __Znwm(uVar16 << 2);
      unaff_x20 = (undefined4 *)(lVar26 + lVar25 * 4);
      *unaff_x20 = *(undefined4 *)(unaff_x19 + unaff_x27 * 4);
      goto joined_r0x006b450c;
    }
code_r0x006b4e3c:
    in_stack_00000068 = in_stack_00000038;
    in_stack_00000070 = in_stack_00000040;
    uStack0000000000000048 = puVar23;
    in_stack_00000050 = puVar14;
    in_stack_00000058 = puVar24;
    uStack0000000000000060 = unaff_x22;
    func_0x00017514();
code_r0x006b4ed0:
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x6b4ed4);
    (*pcVar6)();
  }
  lVar26 = 0;
  unaff_x20 = (undefined4 *)(lVar25 * 4);
  *unaff_x20 = *(undefined4 *)(unaff_x19 + unaff_x27 * 4);
joined_r0x006b450c:
  unaff_x24 = unaff_x20 + 1;
  if (puVar12 != puVar23) {
    puVar14 = puVar12 + -1;
    uVar13 = (long)puVar14 - (long)puVar23;
    if (uVar13 < 0xbc) {
    }
    else {
      uVar18 = (lVar26 + lVar8) - 4;
      if ((uVar18 - (uVar13 & 0xfffffffffffffffc) <= uVar18) &&
         ((undefined4 *)((long)puVar14 - (uVar13 & 0xfffffffffffffffc)) <= puVar14)) {
        if ((ulong)((long)puVar14 + (4 - (lVar26 + lVar8))) < 0x40) {
        }
        else {
          uVar13 = (uVar13 >> 2) + 1;
          uVar17 = uVar13 & 0x7ffffffffffffff0;
          unaff_x20 = unaff_x20 + -uVar17;
          puVar19 = (undefined8 *)(puVar12 + -8);
          puVar20 = (undefined8 *)(lVar26 + lVar25 * 4 + -0x20);
          uVar18 = uVar17;
          do {
            uVar29 = *puVar19;
            uVar28 = puVar19[3];
            uVar27 = puVar19[2];
            uVar33 = puVar19[-3];
            uVar32 = puVar19[-4];
            uVar31 = puVar19[-1];
            uVar30 = puVar19[-2];
            puVar20[1] = puVar19[1];
            *puVar20 = uVar29;
            puVar20[3] = uVar28;
            puVar20[2] = uVar27;
            puVar20[-3] = uVar33;
            puVar20[-4] = uVar32;
            puVar20[-1] = uVar31;
            puVar20[-2] = uVar30;
            puVar19 = puVar19 + -8;
            puVar20 = puVar20 + -8;
            uVar18 = uVar18 - 0x10;
          } while (uVar18 != 0);
          puVar12 = puVar12 + -uVar17;
          if (uVar13 == uVar17) goto code_r0x006b456c;
        }
      }
    }
    do {
      puVar12 = puVar12 + -1;
      unaff_x20 = unaff_x20 + -1;
      *unaff_x20 = *puVar12;
    } while (puVar12 != puVar23);
  }
code_r0x006b456c:
  puVar24 = (undefined4 *)(lVar26 + uVar16 * 4);
  if (puVar23 != (undefined4 *)0x0) {
    __ZdlPv(puVar23);
    unaff_x19 = *(long *)(in_stack_00000028 + 0x40);
    if (puVar24 <= unaff_x24) goto code_r0x006b4598;
code_r0x006b42c4:
    unaff_x28 = (ulong)bVar5;
    puVar14 = unaff_x24 + 1;
    *unaff_x24 = *(undefined4 *)(unaff_x19 + unaff_x27 * 4);
    puVar12 = puVar14;
    puVar11 = in_stack_00000038;
    goto code_r0x006b4680;
  }
  if (unaff_x24 < puVar24) goto code_r0x006b42c4;
code_r0x006b4598:
  unaff_x28 = (ulong)bVar5;
  unaff_x25 = (long)unaff_x24 - (long)unaff_x20;
  unaff_x21 = unaff_x25 >> 2;
  uVar13 = unaff_x21 + 1;
  puVar23 = unaff_x20;
  puVar14 = unaff_x24;
  if (uVar13 >> 0x3e != 0) goto code_r0x006b4e20;
  unaff_x23 = (long)puVar24 - (long)unaff_x20 >> 1;
  if (unaff_x23 <= uVar13) {
    unaff_x23 = uVar13;
  }
  if (0x7ffffffffffffffb < (ulong)((long)puVar24 - (long)unaff_x20)) {
    unaff_x23 = 0x3fffffffffffffff;
  }
  if (unaff_x23 != 0) {
    if (unaff_x23 >> 0x3e != 0) goto code_r0x006b4e3c;
    goto code_r0x006b45e0;
  }
  lVar8 = 0;
  puVar12 = (undefined4 *)(unaff_x21 * 4);
  puVar14 = puVar12 + 1;
  *puVar12 = *(undefined4 *)(unaff_x19 + unaff_x27 * 4);
  if (unaff_x24 == unaff_x20) goto LAB_006b465c;
LAB_006b4638:
  puVar24 = unaff_x24 + -1;
  uVar13 = (long)puVar24 - (long)unaff_x20;
  if (uVar13 < 0xbc) {
  }
  else {
    uVar16 = (lVar8 + unaff_x25) - 4;
    if ((uVar16 - (uVar13 & 0xfffffffffffffffc) <= uVar16) &&
       ((undefined4 *)((long)puVar24 - (uVar13 & 0xfffffffffffffffc)) <= puVar24)) {
      if ((ulong)((long)puVar24 + (-unaff_x25 - lVar8) + 4) < 0x40) {
      }
      else {
        uVar13 = (uVar13 >> 2) + 1;
        uVar18 = uVar13 & 0x7ffffffffffffff0;
        puVar12 = puVar12 + -uVar18;
        puVar19 = (undefined8 *)(unaff_x24 + -8);
        puVar20 = (undefined8 *)(lVar8 + unaff_x21 * 4 + -0x20);
        uVar16 = uVar18;
        do {
          uVar29 = *puVar19;
          uVar28 = puVar19[3];
          uVar27 = puVar19[2];
          uVar33 = puVar19[-3];
          uVar32 = puVar19[-4];
          uVar31 = puVar19[-1];
          uVar30 = puVar19[-2];
          puVar20[1] = puVar19[1];
          *puVar20 = uVar29;
          puVar20[3] = uVar28;
          puVar20[2] = uVar27;
          puVar20[-3] = uVar33;
          puVar20[-4] = uVar32;
          puVar20[-1] = uVar31;
          puVar20[-2] = uVar30;
          puVar19 = puVar19 + -8;
          puVar20 = puVar20 + -8;
          uVar16 = uVar16 - 0x10;
        } while (uVar16 != 0);
        unaff_x24 = unaff_x24 + -uVar18;
        if (uVar13 == uVar18) goto LAB_006b465c;
      }
    }
  }
  do {
    unaff_x24 = unaff_x24 + -1;
    puVar12 = puVar12 + -1;
    *puVar12 = *unaff_x24;
  } while (unaff_x24 != unaff_x20);
  goto LAB_006b465c;
}

