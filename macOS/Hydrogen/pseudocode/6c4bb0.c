
void FUN_006c4bb0(ulong *param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  ulong uVar9;
  ulong in_x9;
  ulong uVar10;
  ulong in_x10;
  ulong *in_x11;
  ulong uVar11;
  ulong *in_x12;
  ulong *in_x13;
  ulong *puVar12;
  ulong uVar13;
  ulong in_x14;
  undefined8 *unaff_x19;
  long lVar14;
  uint *puVar15;
  ulong *unaff_x21;
  ulong *puVar16;
  uint *puVar17;
  undefined4 uVar18;
  long unaff_x22;
  ulong *puVar19;
  ulong *puVar20;
  ulong *unaff_x25;
  ulong *unaff_x26;
  ulong unaff_x27;
  ulong *puVar21;
  ulong *unaff_x28;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  undefined4 *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined4 uStack0000000000000028;
  undefined4 uStack000000000000002c;
  long in_stack_00000030;
  undefined8 *in_stack_00000038;
  
  while (in_x14 = in_x14 - 8, in_x14 != 0) {
LAB_006c4b98:
    uVar9 = *in_x12;
    uVar11 = in_x12[3];
    uVar7 = in_x12[2];
    uVar23 = in_x12[-3];
    uVar22 = in_x12[-4];
    uVar13 = in_x12[-1];
    uVar10 = in_x12[-2];
    in_x13[1] = in_x12[1];
    *in_x13 = uVar9;
    in_x13[3] = uVar11;
    in_x13[2] = uVar7;
    in_x13[-3] = uVar23;
    in_x13[-4] = uVar22;
    in_x13[-1] = uVar13;
    in_x13[-2] = uVar10;
    in_x12 = in_x12 + -8;
    in_x13 = in_x13 + -8;
  }
  puVar19 = in_x11;
  if (in_x9 == in_x10) goto LAB_006c4bd4;
LAB_006c4bc4:
  do {
    puVar19 = puVar19 + -1;
    param_1 = param_1 + -1;
    *param_1 = *puVar19;
  } while (puVar19 != unaff_x21);
LAB_006c4bd4:
  puVar19 = (ulong *)*in_stack_00000038;
code_r0x006c4bdc:
  unaff_x19[0xa3] = param_1;
  param_2 = param_2 + unaff_x27 * 8;
LAB_006c4be4:
  do {
    unaff_x19[0xa4] = unaff_x25;
    unaff_x19[0xa5] = param_2;
    if (puVar19 != (ulong *)0x0) {
      __ZdlPv(puVar19);
    }
LAB_006c4a04:
    unaff_x19[0xa4] = unaff_x25;
    unaff_x28 = unaff_x28 + 1;
    if (unaff_x28 == unaff_x26) {
      if ((((*(int *)(unaff_x19 + 1) < 1) || (iVar4 = func_0x006cf914(), iVar4 == 0)) ||
          (*(char *)((long)unaff_x19 + 0x49a) != '\0')) ||
         (uVar5 = func_0x006b198c(*unaff_x19,*in_stack_00000018), 0x7fff < uVar5)) {
        func_0x006b3160(*unaff_x19,"allocation: closure with %d upvalues");
        uVar8 = 0x13;
      }
      else {
        uVar8 = 0x40;
        in_stack_00000020._4_4_ = uVar5;
      }
      func_0x006b1f78(*unaff_x19,uVar8,uStack0000000000000028,(int)(short)in_stack_00000020._4_4_);
      puVar17 = (uint *)unaff_x19[0xa4];
      for (puVar15 = (uint *)unaff_x19[0xa3]; puVar15 != puVar17; puVar15 = puVar15 + 2) {
        uVar18 = 0xff;
        if (*puVar15 != 1) {
          uVar18 = 0;
        }
        func_0x006b1ccc(*unaff_x19,0x46,*puVar15 & 0xff,(char)puVar15[1],uVar18);
      }
      *(undefined4 *)((long)unaff_x19 + 0x484) = uStack000000000000002c;
      return;
    }
    uVar7 = *unaff_x28;
    if ((unaff_x19[0x13] != 0) && (unaff_x19[0x14] != uVar7)) {
      uVar11 = 0;
      lVar6 = unaff_x19[0x11];
      uVar10 = uVar7 >> 4 ^ uVar7 >> 9;
      uVar9 = uVar10;
      do {
        uVar9 = uVar9 & unaff_x19[0x12] - 1;
        uVar13 = *(ulong *)(lVar6 + uVar9 * unaff_x22);
        if (uVar13 == uVar7) {
          if (*(char *)(lVar6 + uVar9 * unaff_x22 + 9) != '\0') {
            if ((unaff_x19[0x1d] == 0) || (uVar7 == unaff_x19[0x1e])) goto code_r0x006c4c54;
            uVar11 = 0;
            goto code_r0x006c4c28;
          }
          break;
        }
        uVar11 = uVar11 + 1;
        uVar9 = uVar11 + uVar9;
      } while (uVar13 != unaff_x19[0x14] && uVar11 <= unaff_x19[0x12] - 1);
    }
    if ((unaff_x19[0x27] == 0) || (uVar7 == unaff_x19[0x28])) {
code_r0x006c4abc:
      lVar6 = func_0x006c68c8();
      puVar19 = (ulong *)unaff_x19[0xa4];
      if (puVar19 < (ulong *)unaff_x19[0xa5]) {
        uVar7 = lVar6 << 0x20 | 2;
        goto code_r0x006c49fc;
      }
      unaff_x21 = (ulong *)*in_stack_00000038;
      lVar14 = (long)puVar19 - (long)unaff_x21 >> 3;
      uVar7 = lVar14 + 1;
      if (uVar7 >> 0x3d != 0) {
        func_0x00017f90(in_stack_00000038);
        goto code_r0x006c50ac;
      }
      uVar11 = (long)unaff_x19[0xa5] - (long)unaff_x21;
      unaff_x27 = (long)uVar11 >> 2;
      if (unaff_x27 <= uVar7) {
        unaff_x27 = uVar7;
      }
      if (0x7ffffffffffffff7 < uVar11) {
        unaff_x27 = 0x1fffffffffffffff;
      }
      if (unaff_x27 == 0) {
        param_2 = 0;
      }
      else {
        if (unaff_x27 >> 0x3d != 0) {
          func_0x00017514();
          goto code_r0x006c50ac;
        }
        param_2 = __Znwm(unaff_x27 << 3);
      }
      param_1 = (ulong *)(param_2 + lVar14 * 8);
      unaff_x25 = param_1 + 1;
      *param_1 = lVar6 << 0x20 | 2;
      if (puVar19 == unaff_x21) goto code_r0x006c4bdc;
      uVar7 = (long)puVar19 + (-8 - (long)unaff_x21);
      if ((uVar7 < 0x58) ||
         ((ulong)((long)puVar19 - (param_2 + ((long)puVar19 - (long)unaff_x21))) < 0x40))
      goto LAB_006c4bc4;
      in_x9 = (uVar7 >> 3) + 1;
      in_x10 = in_x9 & 0x3ffffffffffffff8;
      in_x11 = puVar19 + -in_x10;
      param_1 = param_1 + -in_x10;
      in_x12 = puVar19 + -4;
      in_x13 = (ulong *)(param_2 + lVar14 * 8 + -0x20);
      in_x14 = in_x10;
      goto LAB_006c4b98;
    }
    uVar11 = 0;
    uVar9 = uVar7 >> 4 ^ uVar7 >> 9;
    while( true ) {
      uVar9 = uVar9 & unaff_x19[0x26] - 1;
      uVar10 = *(ulong *)(unaff_x19[0x25] + uVar9 * 0x20);
      if (uVar10 == uVar7) break;
      uVar11 = uVar11 + 1;
      uVar9 = uVar11 + uVar9;
      if (uVar10 == unaff_x19[0x28] || unaff_x19[0x26] - 1 < uVar11) goto code_r0x006c4abc;
    }
    if (*(int *)(unaff_x19[0x25] + uVar9 * 0x20 + 8) == 0) goto code_r0x006c4abc;
    uVar2 = *(uint *)((long)unaff_x19 + 0x484);
    uVar5 = uVar2 + 1;
    if (0xff < uVar5) {
      func_0x006bc388(in_stack_00000030 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
      goto code_r0x006c50ac;
    }
    *(uint *)((long)unaff_x19 + 0x484) = uVar5;
    uVar1 = *(uint *)(unaff_x19 + 0x91);
    if (*(uint *)(unaff_x19 + 0x91) <= uVar5) {
      uVar1 = uVar5;
    }
    *(uint *)(unaff_x19 + 0x91) = uVar1;
    func_0x006c66e4();
    puVar19 = (ulong *)unaff_x19[0xa4];
    if (puVar19 < (ulong *)unaff_x19[0xa5]) {
      uVar7 = (ulong)(uVar2 & 0xff) << 0x20;
      goto code_r0x006c49fc;
    }
    puVar16 = (ulong *)*in_stack_00000038;
    lVar6 = (long)puVar19 - (long)puVar16 >> 3;
    uVar7 = lVar6 + 1;
    if (uVar7 >> 0x3d != 0) {
      func_0x00017f90(in_stack_00000038);
      goto code_r0x006c50ac;
    }
    uVar9 = (long)unaff_x19[0xa5] - (long)puVar16;
    uVar11 = (long)uVar9 >> 2;
    if (uVar11 <= uVar7) {
      uVar11 = uVar7;
    }
    if (0x7ffffffffffffff7 < uVar9) {
      uVar11 = 0x1fffffffffffffff;
    }
    if (uVar11 == 0) {
      param_2 = 0;
    }
    else {
      if (uVar11 >> 0x3d != 0) {
        func_0x00017514();
        goto code_r0x006c50ac;
      }
      param_2 = __Znwm(uVar11 << 3);
    }
    puVar21 = (ulong *)(param_2 + lVar6 * 8);
    unaff_x25 = puVar21 + 1;
    *puVar21 = (ulong)(uVar2 & 0xff) << 0x20;
    if (puVar19 == puVar16) goto LAB_006c4dd8;
    uVar7 = (long)puVar19 + (-8 - (long)puVar16);
    puVar20 = puVar19;
    if ((uVar7 < 0x58) ||
       ((ulong)((long)puVar19 - (param_2 + ((long)puVar19 - (long)puVar16))) < 0x40))
    goto LAB_006c4dc0;
    uVar7 = (uVar7 >> 3) + 1;
    uVar10 = uVar7 & 0x3ffffffffffffff8;
    puVar20 = puVar19 + -uVar10;
    puVar21 = puVar21 + -uVar10;
    puVar19 = puVar19 + -4;
    puVar12 = (ulong *)(param_2 + lVar6 * 8 + -0x20);
    uVar9 = uVar10;
    do {
      uVar23 = *puVar19;
      uVar22 = puVar19[3];
      uVar13 = puVar19[2];
      uVar27 = puVar19[-3];
      uVar26 = puVar19[-4];
      uVar25 = puVar19[-1];
      uVar24 = puVar19[-2];
      puVar12[1] = puVar19[1];
      *puVar12 = uVar23;
      puVar12[3] = uVar22;
      puVar12[2] = uVar13;
      puVar12[-3] = uVar27;
      puVar12[-4] = uVar26;
      puVar12[-1] = uVar25;
      puVar12[-2] = uVar24;
      puVar19 = puVar19 + -8;
      puVar12 = puVar12 + -8;
      uVar9 = uVar9 - 8;
    } while (uVar9 != 0);
    if (uVar7 != uVar10) {
LAB_006c4dc0:
      do {
        puVar20 = puVar20 + -1;
        puVar21 = puVar21 + -1;
        *puVar21 = *puVar20;
      } while (puVar20 != puVar16);
    }
    puVar19 = (ulong *)*in_stack_00000038;
LAB_006c4dd8:
    unaff_x19[0xa3] = puVar21;
    param_2 = param_2 + uVar11 * 8;
  } while( true );
  while( true ) {
    uVar11 = uVar11 + 1;
    uVar10 = uVar11 + uVar10;
    if (unaff_x19[0x1c] - 1 < uVar11) break;
code_r0x006c4c28:
    uVar10 = uVar10 & unaff_x19[0x1c] - 1;
    uVar13 = *(ulong *)(unaff_x19[0x1b] + uVar10 * unaff_x22);
    if (uVar13 == uVar7) {
      uVar7 = (ulong)*(byte *)(unaff_x19[0x1b] + uVar10 * unaff_x22 + 0x10);
      uVar11 = (ulong)*(byte *)(lVar6 + uVar9 * unaff_x22 + 8);
      puVar19 = (ulong *)unaff_x19[0xa4];
      puVar16 = (ulong *)unaff_x19[0xa5];
      if (puVar16 <= puVar19) goto code_r0x006c4e04;
      goto code_r0x006c4c70;
    }
    if (uVar13 == unaff_x19[0x1e]) break;
  }
code_r0x006c4c54:
  uVar7 = 0;
  uVar11 = (ulong)*(byte *)(lVar6 + uVar9 * unaff_x22 + 8);
  puVar19 = (ulong *)unaff_x19[0xa4];
  puVar16 = (ulong *)unaff_x19[0xa5];
  if (puVar19 < puVar16) {
code_r0x006c4c70:
    uVar7 = uVar7 | uVar11 << 0x20;
code_r0x006c49fc:
    unaff_x25 = puVar19 + 1;
    *puVar19 = uVar7;
    goto LAB_006c4a04;
  }
code_r0x006c4e04:
  puVar21 = (ulong *)*in_stack_00000038;
  lVar6 = (long)puVar19 - (long)puVar21 >> 3;
  uVar9 = lVar6 + 1;
  if (uVar9 >> 0x3d != 0) {
    func_0x00017f90(in_stack_00000038);
    goto code_r0x006c50ac;
  }
  uVar10 = (long)puVar16 - (long)puVar21 >> 2;
  if (uVar10 <= uVar9) {
    uVar10 = uVar9;
  }
  if (0x7ffffffffffffff7 < (ulong)((long)puVar16 - (long)puVar21)) {
    uVar10 = 0x1fffffffffffffff;
  }
  if (uVar10 == 0) {
    param_2 = 0;
    puVar16 = (ulong *)(lVar6 * 8);
    *puVar16 = uVar7 | uVar11 << 0x20;
  }
  else {
    if (uVar10 >> 0x3d != 0) {
      func_0x00017514();
code_r0x006c50ac:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x6c50b0);
      (*pcVar3)();
    }
    param_2 = __Znwm(uVar10 << 3);
    puVar16 = (ulong *)(param_2 + lVar6 * 8);
    *puVar16 = uVar7 | uVar11 << 0x20;
  }
  unaff_x25 = puVar16 + 1;
  if (puVar19 == puVar21) goto code_r0x006c4f34;
  uVar7 = (long)puVar19 + (-8 - (long)puVar21);
  puVar20 = puVar19;
  if ((uVar7 < 0x58) ||
     ((ulong)((long)puVar19 - (param_2 + ((long)puVar19 - (long)puVar21))) < 0x40))
  goto code_r0x006c4f1c;
  uVar7 = (uVar7 >> 3) + 1;
  uVar9 = uVar7 & 0x3ffffffffffffff8;
  puVar20 = puVar19 + -uVar9;
  puVar16 = puVar16 + -uVar9;
  puVar19 = puVar19 + -4;
  puVar12 = (ulong *)(param_2 + lVar6 * 8 + -0x20);
  uVar11 = uVar9;
  do {
    uVar23 = *puVar19;
    uVar22 = puVar19[3];
    uVar13 = puVar19[2];
    uVar27 = puVar19[-3];
    uVar26 = puVar19[-4];
    uVar25 = puVar19[-1];
    uVar24 = puVar19[-2];
    puVar12[1] = puVar19[1];
    *puVar12 = uVar23;
    puVar12[3] = uVar22;
    puVar12[2] = uVar13;
    puVar12[-3] = uVar27;
    puVar12[-4] = uVar26;
    puVar12[-1] = uVar25;
    puVar12[-2] = uVar24;
    puVar19 = puVar19 + -8;
    puVar12 = puVar12 + -8;
    uVar11 = uVar11 - 8;
  } while (uVar11 != 0);
  if (uVar7 != uVar9) {
code_r0x006c4f1c:
    do {
      puVar20 = puVar20 + -1;
      puVar16 = puVar16 + -1;
      *puVar16 = *puVar20;
    } while (puVar20 != puVar21);
  }
  puVar19 = (ulong *)*in_stack_00000038;
code_r0x006c4f34:
  unaff_x19[0xa3] = puVar16;
  param_2 = param_2 + uVar10 * 8;
  goto LAB_006c4be4;
}

