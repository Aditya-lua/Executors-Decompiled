
void FUN_006c4d18(ulong param_1)

{
  uint uVar1;
  code *pcVar2;
  int iVar3;
  uint uVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong *puVar12;
  ulong *puVar13;
  ulong uVar14;
  ulong uVar15;
  undefined8 *unaff_x19;
  long lVar16;
  long unaff_x20;
  uint *puVar17;
  ulong *puVar18;
  ulong *unaff_x21;
  uint *puVar19;
  undefined4 uVar20;
  long unaff_x22;
  ulong unaff_x23;
  ulong *unaff_x24;
  uint unaff_w25;
  ulong *puVar21;
  ulong *unaff_x26;
  long unaff_x27;
  ulong *puVar22;
  ulong *unaff_x28;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  undefined4 *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined4 uStack0000000000000028;
  undefined4 uStack000000000000002c;
  long in_stack_00000030;
  undefined8 *in_stack_00000038;
  
code_r0x006c4d18:
  if (param_1 != 0) {
    func_0x00017514();
code_r0x006c50ac:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x6c50b0);
    (*pcVar2)();
  }
  lVar6 = __Znwm(unaff_x23 << 3);
LAB_006c4d2c:
  puVar18 = (ulong *)(lVar6 + unaff_x20 * 8);
  puVar21 = puVar18 + 1;
  *puVar18 = (ulong)(unaff_w25 & 0xff) << 0x20;
  if (unaff_x24 == unaff_x21) goto LAB_006c4dd8;
  uVar8 = (long)unaff_x24 + (-8 - (long)unaff_x21);
  puVar22 = unaff_x24;
  if ((uVar8 < 0x58) || ((ulong)((long)unaff_x24 - (lVar6 + unaff_x27)) < 0x40)) {
LAB_006c4dc0:
    do {
      puVar22 = puVar22 + -1;
      puVar18 = puVar18 + -1;
      *puVar18 = *puVar22;
    } while (puVar22 != unaff_x21);
  }
  else {
    uVar8 = (uVar8 >> 3) + 1;
    uVar10 = uVar8 & 0x3ffffffffffffff8;
    puVar22 = unaff_x24 + -uVar10;
    puVar18 = puVar18 + -uVar10;
    puVar11 = unaff_x24 + -4;
    puVar13 = (ulong *)(lVar6 + unaff_x20 * 8 + -0x20);
    uVar15 = uVar10;
    do {
      uVar23 = *puVar11;
      uVar14 = puVar11[3];
      uVar9 = puVar11[2];
      uVar27 = puVar11[-3];
      uVar26 = puVar11[-4];
      uVar25 = puVar11[-1];
      uVar24 = puVar11[-2];
      puVar13[1] = puVar11[1];
      *puVar13 = uVar23;
      puVar13[3] = uVar14;
      puVar13[2] = uVar9;
      puVar13[-3] = uVar27;
      puVar13[-4] = uVar26;
      puVar13[-1] = uVar25;
      puVar13[-2] = uVar24;
      puVar11 = puVar11 + -8;
      puVar13 = puVar13 + -8;
      uVar15 = uVar15 - 8;
    } while (uVar15 != 0);
    if (uVar8 != uVar10) goto LAB_006c4dc0;
  }
  unaff_x24 = (ulong *)*in_stack_00000038;
LAB_006c4dd8:
  unaff_x19[0xa3] = puVar18;
  lVar6 = lVar6 + unaff_x23 * 8;
LAB_006c4be4:
  do {
    unaff_x19[0xa4] = puVar21;
    unaff_x19[0xa5] = lVar6;
    if (unaff_x24 != (ulong *)0x0) {
      __ZdlPv(unaff_x24);
    }
code_r0x006c4a04:
    unaff_x19[0xa4] = puVar21;
    unaff_x28 = unaff_x28 + 1;
    if (unaff_x28 == unaff_x26) {
      if ((((*(int *)(unaff_x19 + 1) < 1) || (iVar3 = func_0x006cf914(), iVar3 == 0)) ||
          (*(char *)((long)unaff_x19 + 0x49a) != '\0')) ||
         (uVar4 = func_0x006b198c(*unaff_x19,*in_stack_00000018), 0x7fff < uVar4)) {
        func_0x006b3160(*unaff_x19,"allocation: closure with %d upvalues");
        uVar7 = 0x13;
      }
      else {
        uVar7 = 0x40;
        in_stack_00000020._4_4_ = uVar4;
      }
      func_0x006b1f78(*unaff_x19,uVar7,uStack0000000000000028,(int)(short)in_stack_00000020._4_4_);
      puVar19 = (uint *)unaff_x19[0xa4];
      for (puVar17 = (uint *)unaff_x19[0xa3]; puVar17 != puVar19; puVar17 = puVar17 + 2) {
        uVar20 = 0xff;
        if (*puVar17 != 1) {
          uVar20 = 0;
        }
        func_0x006b1ccc(*unaff_x19,0x46,*puVar17 & 0xff,(char)puVar17[1],uVar20);
      }
      *(undefined4 *)((long)unaff_x19 + 0x484) = uStack000000000000002c;
      return;
    }
    uVar8 = *unaff_x28;
    if ((unaff_x19[0x13] != 0) && (unaff_x19[0x14] != uVar8)) {
      uVar15 = 0;
      lVar6 = unaff_x19[0x11];
      uVar9 = uVar8 >> 4 ^ uVar8 >> 9;
      uVar10 = uVar9;
      do {
        uVar10 = uVar10 & unaff_x19[0x12] - 1;
        uVar14 = *(ulong *)(lVar6 + uVar10 * unaff_x22);
        if (uVar14 == uVar8) {
          if (*(char *)(lVar6 + uVar10 * unaff_x22 + 9) != '\0') {
            if ((unaff_x19[0x1d] == 0) || (uVar8 == unaff_x19[0x1e])) goto code_r0x006c4c54;
            uVar15 = 0;
            goto code_r0x006c4c28;
          }
          break;
        }
        uVar15 = uVar15 + 1;
        uVar10 = uVar15 + uVar10;
      } while (uVar14 != unaff_x19[0x14] && uVar15 <= unaff_x19[0x12] - 1);
    }
    if ((unaff_x19[0x27] != 0) && (uVar8 != unaff_x19[0x28])) {
      uVar15 = 0;
      uVar10 = uVar8 >> 4 ^ uVar8 >> 9;
      do {
        uVar10 = uVar10 & unaff_x19[0x26] - 1;
        uVar9 = *(ulong *)(unaff_x19[0x25] + uVar10 * 0x20);
        if (uVar9 == uVar8) {
          if (*(int *)(unaff_x19[0x25] + uVar10 * 0x20 + 8) != 0) {
            unaff_w25 = *(uint *)((long)unaff_x19 + 0x484);
            uVar4 = unaff_w25 + 1;
            if (0xff < uVar4) {
              func_0x006bc388(in_stack_00000030 + 0xc,
                              "Out of registers when trying to allocate %d registers: exceeded limit %d"
                             );
              goto code_r0x006c50ac;
            }
            *(uint *)((long)unaff_x19 + 0x484) = uVar4;
            uVar1 = *(uint *)(unaff_x19 + 0x91);
            if (*(uint *)(unaff_x19 + 0x91) <= uVar4) {
              uVar1 = uVar4;
            }
            *(uint *)(unaff_x19 + 0x91) = uVar1;
            func_0x006c66e4();
            unaff_x24 = (ulong *)unaff_x19[0xa4];
            if (unaff_x24 < (ulong *)unaff_x19[0xa5]) {
              uVar8 = (ulong)(unaff_w25 & 0xff) << 0x20;
              goto code_r0x006c49fc;
            }
            unaff_x21 = (ulong *)*in_stack_00000038;
            unaff_x27 = (long)unaff_x24 - (long)unaff_x21;
            unaff_x20 = unaff_x27 >> 3;
            uVar8 = unaff_x20 + 1;
            if (uVar8 >> 0x3d != 0) {
              func_0x00017f90(in_stack_00000038);
              goto code_r0x006c50ac;
            }
            uVar15 = (long)unaff_x19[0xa5] - (long)unaff_x21;
            unaff_x23 = (long)uVar15 >> 2;
            if (unaff_x23 <= uVar8) {
              unaff_x23 = uVar8;
            }
            if (0x7ffffffffffffff7 < uVar15) {
              unaff_x23 = 0x1fffffffffffffff;
            }
            if (unaff_x23 != 0) {
              param_1 = unaff_x23 >> 0x3d;
              goto code_r0x006c4d18;
            }
            lVar6 = 0;
            goto LAB_006c4d2c;
          }
          break;
        }
        uVar15 = uVar15 + 1;
        uVar10 = uVar15 + uVar10;
      } while (uVar9 != unaff_x19[0x28] && uVar15 <= unaff_x19[0x26] - 1);
    }
    lVar5 = func_0x006c68c8();
    unaff_x24 = (ulong *)unaff_x19[0xa4];
    if (unaff_x24 < (ulong *)unaff_x19[0xa5]) {
      uVar8 = lVar5 << 0x20 | 2;
      goto code_r0x006c49fc;
    }
    puVar18 = (ulong *)*in_stack_00000038;
    lVar16 = (long)unaff_x24 - (long)puVar18 >> 3;
    uVar8 = lVar16 + 1;
    if (uVar8 >> 0x3d != 0) {
      func_0x00017f90(in_stack_00000038);
      goto code_r0x006c50ac;
    }
    uVar10 = (long)unaff_x19[0xa5] - (long)puVar18;
    uVar15 = (long)uVar10 >> 2;
    if (uVar15 <= uVar8) {
      uVar15 = uVar8;
    }
    if (0x7ffffffffffffff7 < uVar10) {
      uVar15 = 0x1fffffffffffffff;
    }
    if (uVar15 == 0) {
      lVar6 = 0;
    }
    else {
      if (uVar15 >> 0x3d != 0) {
        func_0x00017514();
        goto code_r0x006c50ac;
      }
      lVar6 = __Znwm(uVar15 << 3);
    }
    puVar22 = (ulong *)(lVar6 + lVar16 * 8);
    puVar21 = puVar22 + 1;
    *puVar22 = lVar5 << 0x20 | 2;
    if (unaff_x24 != puVar18) {
      uVar8 = (long)unaff_x24 + (-8 - (long)puVar18);
      puVar11 = unaff_x24;
      if ((uVar8 < 0x58) ||
         ((ulong)((long)unaff_x24 - (lVar6 + ((long)unaff_x24 - (long)puVar18))) < 0x40)) {
code_r0x006c4bc4:
        do {
          puVar11 = puVar11 + -1;
          puVar22 = puVar22 + -1;
          *puVar22 = *puVar11;
        } while (puVar11 != puVar18);
      }
      else {
        uVar8 = (uVar8 >> 3) + 1;
        uVar9 = uVar8 & 0x3ffffffffffffff8;
        puVar11 = unaff_x24 + -uVar9;
        puVar22 = puVar22 + -uVar9;
        puVar13 = unaff_x24 + -4;
        puVar12 = (ulong *)(lVar6 + lVar16 * 8 + -0x20);
        uVar10 = uVar9;
        do {
          uVar24 = *puVar13;
          uVar23 = puVar13[3];
          uVar14 = puVar13[2];
          uVar28 = puVar13[-3];
          uVar27 = puVar13[-4];
          uVar26 = puVar13[-1];
          uVar25 = puVar13[-2];
          puVar12[1] = puVar13[1];
          *puVar12 = uVar24;
          puVar12[3] = uVar23;
          puVar12[2] = uVar14;
          puVar12[-3] = uVar28;
          puVar12[-4] = uVar27;
          puVar12[-1] = uVar26;
          puVar12[-2] = uVar25;
          puVar13 = puVar13 + -8;
          puVar12 = puVar12 + -8;
          uVar10 = uVar10 - 8;
        } while (uVar10 != 0);
        if (uVar8 != uVar9) goto code_r0x006c4bc4;
      }
      unaff_x24 = (ulong *)*in_stack_00000038;
    }
    unaff_x19[0xa3] = puVar22;
    lVar6 = lVar6 + uVar15 * 8;
  } while( true );
  while( true ) {
    uVar15 = uVar15 + 1;
    uVar9 = uVar15 + uVar9;
    if (unaff_x19[0x1c] - 1 < uVar15) break;
code_r0x006c4c28:
    uVar9 = uVar9 & unaff_x19[0x1c] - 1;
    uVar14 = *(ulong *)(unaff_x19[0x1b] + uVar9 * unaff_x22);
    if (uVar14 == uVar8) {
      uVar8 = (ulong)*(byte *)(unaff_x19[0x1b] + uVar9 * unaff_x22 + 0x10);
      uVar15 = (ulong)*(byte *)(lVar6 + uVar10 * unaff_x22 + 8);
      unaff_x24 = (ulong *)unaff_x19[0xa4];
      puVar18 = (ulong *)unaff_x19[0xa5];
      if (puVar18 <= unaff_x24) goto code_r0x006c4e04;
      goto code_r0x006c4c70;
    }
    if (uVar14 == unaff_x19[0x1e]) break;
  }
code_r0x006c4c54:
  uVar8 = 0;
  uVar15 = (ulong)*(byte *)(lVar6 + uVar10 * unaff_x22 + 8);
  unaff_x24 = (ulong *)unaff_x19[0xa4];
  puVar18 = (ulong *)unaff_x19[0xa5];
  if (unaff_x24 < puVar18) {
code_r0x006c4c70:
    uVar8 = uVar8 | uVar15 << 0x20;
code_r0x006c49fc:
    puVar21 = unaff_x24 + 1;
    *unaff_x24 = uVar8;
    goto code_r0x006c4a04;
  }
code_r0x006c4e04:
  puVar22 = (ulong *)*in_stack_00000038;
  lVar5 = (long)unaff_x24 - (long)puVar22 >> 3;
  uVar10 = lVar5 + 1;
  if (uVar10 >> 0x3d != 0) {
    func_0x00017f90(in_stack_00000038);
    goto code_r0x006c50ac;
  }
  uVar9 = (long)puVar18 - (long)puVar22 >> 2;
  if (uVar9 <= uVar10) {
    uVar9 = uVar10;
  }
  if (0x7ffffffffffffff7 < (ulong)((long)puVar18 - (long)puVar22)) {
    uVar9 = 0x1fffffffffffffff;
  }
  if (uVar9 == 0) {
    lVar6 = 0;
    puVar18 = (ulong *)(lVar5 * 8);
    *puVar18 = uVar8 | uVar15 << 0x20;
  }
  else {
    if (uVar9 >> 0x3d != 0) {
      func_0x00017514();
      goto code_r0x006c50ac;
    }
    lVar6 = __Znwm(uVar9 << 3);
    puVar18 = (ulong *)(lVar6 + lVar5 * 8);
    *puVar18 = uVar8 | uVar15 << 0x20;
  }
  puVar21 = puVar18 + 1;
  if (unaff_x24 == puVar22) goto code_r0x006c4f34;
  uVar8 = (long)unaff_x24 + (-8 - (long)puVar22);
  puVar11 = unaff_x24;
  if ((uVar8 < 0x58) ||
     ((ulong)((long)unaff_x24 - (lVar6 + ((long)unaff_x24 - (long)puVar22))) < 0x40))
  goto code_r0x006c4f1c;
  uVar8 = (uVar8 >> 3) + 1;
  uVar10 = uVar8 & 0x3ffffffffffffff8;
  puVar11 = unaff_x24 + -uVar10;
  puVar18 = puVar18 + -uVar10;
  puVar13 = unaff_x24 + -4;
  puVar12 = (ulong *)(lVar6 + lVar5 * 8 + -0x20);
  uVar15 = uVar10;
  do {
    uVar24 = *puVar13;
    uVar23 = puVar13[3];
    uVar14 = puVar13[2];
    uVar28 = puVar13[-3];
    uVar27 = puVar13[-4];
    uVar26 = puVar13[-1];
    uVar25 = puVar13[-2];
    puVar12[1] = puVar13[1];
    *puVar12 = uVar24;
    puVar12[3] = uVar23;
    puVar12[2] = uVar14;
    puVar12[-3] = uVar28;
    puVar12[-4] = uVar27;
    puVar12[-1] = uVar26;
    puVar12[-2] = uVar25;
    puVar13 = puVar13 + -8;
    puVar12 = puVar12 + -8;
    uVar15 = uVar15 - 8;
  } while (uVar15 != 0);
  if (uVar8 != uVar10) {
code_r0x006c4f1c:
    do {
      puVar11 = puVar11 + -1;
      puVar18 = puVar18 + -1;
      *puVar18 = *puVar11;
    } while (puVar11 != puVar22);
  }
  unaff_x24 = (ulong *)*in_stack_00000038;
code_r0x006c4f34:
  unaff_x19[0xa3] = puVar18;
  lVar6 = lVar6 + uVar9 * 8;
  goto LAB_006c4be4;
}

