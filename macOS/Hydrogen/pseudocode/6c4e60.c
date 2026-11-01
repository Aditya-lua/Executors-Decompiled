
void FUN_006c4e60(long param_1)

{
  uint uVar1;
  uint uVar2;
  code *pcVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  ulong *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong *puVar13;
  ulong *puVar14;
  ulong *puVar15;
  ulong uVar16;
  undefined8 *unaff_x19;
  long lVar17;
  ulong unaff_x20;
  uint *puVar18;
  ulong *puVar19;
  long unaff_x21;
  uint *puVar20;
  undefined4 uVar21;
  long unaff_x22;
  ulong unaff_x23;
  ulong *unaff_x24;
  ulong *puVar22;
  ulong *unaff_x25;
  ulong unaff_x26;
  ulong *unaff_x27;
  ulong *unaff_x28;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  long in_stack_00000010;
  undefined4 *in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined4 uStack0000000000000028;
  undefined4 uStack000000000000002c;
  long in_stack_00000030;
  undefined8 *in_stack_00000038;
  
code_r0x006c4e60:
  puVar19 = (ulong *)(param_1 + unaff_x21 * 8);
  puVar22 = puVar19 + 1;
  *puVar19 = unaff_x23 | unaff_x20 << 0x20;
  if (unaff_x24 != unaff_x27) goto LAB_006c4ea4;
LAB_006c4f34:
  unaff_x19[0xa3] = puVar19;
  param_1 = param_1 + unaff_x26 * 8;
LAB_006c4be4:
  do {
    unaff_x19[0xa4] = puVar22;
    unaff_x19[0xa5] = param_1;
    if (unaff_x24 != (ulong *)0x0) {
      __ZdlPv(unaff_x24);
    }
code_r0x006c4a04:
    unaff_x19[0xa4] = puVar22;
    unaff_x28 = unaff_x28 + 1;
    if (unaff_x28 == unaff_x25) {
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
      puVar20 = (uint *)unaff_x19[0xa4];
      for (puVar18 = (uint *)unaff_x19[0xa3]; puVar18 != puVar20; puVar18 = puVar18 + 2) {
        uVar21 = 0xff;
        if (*puVar18 != 1) {
          uVar21 = 0;
        }
        func_0x006b1ccc(*unaff_x19,0x46,*puVar18 & 0xff,(char)puVar18[1],uVar21);
      }
      *(undefined4 *)((long)unaff_x19 + 0x484) = uStack000000000000002c;
      return;
    }
    uVar7 = *unaff_x28;
    if ((unaff_x19[0x13] != 0) && (unaff_x19[0x14] != uVar7)) {
      uVar12 = 0;
      lVar6 = unaff_x19[0x11];
      uVar11 = uVar7 >> 4 ^ uVar7 >> 9;
      uVar10 = uVar11;
      do {
        uVar10 = uVar10 & unaff_x19[0x12] - 1;
        uVar16 = *(ulong *)(lVar6 + uVar10 * unaff_x22);
        if (uVar16 == uVar7) {
          if (*(char *)(lVar6 + uVar10 * unaff_x22 + 9) != '\0') {
            if ((unaff_x19[0x1d] == 0) || (uVar7 == unaff_x19[0x1e])) goto code_r0x006c4c54;
            uVar12 = 0;
            goto code_r0x006c4c28;
          }
          break;
        }
        uVar12 = uVar12 + 1;
        uVar10 = uVar12 + uVar10;
      } while (uVar16 != unaff_x19[0x14] && uVar12 <= unaff_x19[0x12] - 1);
    }
    if ((unaff_x19[0x27] == 0) || (uVar7 == unaff_x19[0x28])) {
code_r0x006c4abc:
      lVar6 = func_0x006c68c8();
      unaff_x24 = (ulong *)unaff_x19[0xa4];
      if (unaff_x24 < (ulong *)unaff_x19[0xa5]) {
        uVar7 = lVar6 << 0x20 | 2;
        goto code_r0x006c49fc;
      }
      puVar19 = (ulong *)*in_stack_00000038;
      lVar17 = (long)unaff_x24 - (long)puVar19 >> 3;
      uVar7 = lVar17 + 1;
      if (uVar7 >> 0x3d != 0) {
        func_0x00017f90(in_stack_00000038);
LAB_006c50ac:
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x6c50b0);
        (*pcVar3)();
      }
      uVar10 = (long)unaff_x19[0xa5] - (long)puVar19;
      uVar12 = (long)uVar10 >> 2;
      if (uVar12 <= uVar7) {
        uVar12 = uVar7;
      }
      if (0x7ffffffffffffff7 < uVar10) {
        uVar12 = 0x1fffffffffffffff;
      }
      if (uVar12 == 0) {
        param_1 = 0;
      }
      else {
        if (uVar12 >> 0x3d != 0) {
          func_0x00017514();
          goto LAB_006c50ac;
        }
        param_1 = __Znwm(uVar12 << 3);
      }
      puVar9 = (ulong *)(param_1 + lVar17 * 8);
      puVar22 = puVar9 + 1;
      *puVar9 = lVar6 << 0x20 | 2;
      if (unaff_x24 != puVar19) {
        uVar7 = (long)unaff_x24 + (-8 - (long)puVar19);
        puVar13 = unaff_x24;
        if ((uVar7 < 0x58) ||
           ((ulong)((long)unaff_x24 - (param_1 + ((long)unaff_x24 - (long)puVar19))) < 0x40)) {
code_r0x006c4bc4:
          do {
            puVar13 = puVar13 + -1;
            puVar9 = puVar9 + -1;
            *puVar9 = *puVar13;
          } while (puVar13 != puVar19);
        }
        else {
          uVar7 = (uVar7 >> 3) + 1;
          uVar11 = uVar7 & 0x3ffffffffffffff8;
          puVar13 = unaff_x24 + -uVar11;
          puVar9 = puVar9 + -uVar11;
          puVar15 = unaff_x24 + -4;
          puVar14 = (ulong *)(param_1 + lVar17 * 8 + -0x20);
          uVar10 = uVar11;
          do {
            uVar24 = *puVar15;
            uVar23 = puVar15[3];
            uVar16 = puVar15[2];
            uVar28 = puVar15[-3];
            uVar27 = puVar15[-4];
            uVar26 = puVar15[-1];
            uVar25 = puVar15[-2];
            puVar14[1] = puVar15[1];
            *puVar14 = uVar24;
            puVar14[3] = uVar23;
            puVar14[2] = uVar16;
            puVar14[-3] = uVar28;
            puVar14[-4] = uVar27;
            puVar14[-1] = uVar26;
            puVar14[-2] = uVar25;
            puVar15 = puVar15 + -8;
            puVar14 = puVar14 + -8;
            uVar10 = uVar10 - 8;
          } while (uVar10 != 0);
          if (uVar7 != uVar11) goto code_r0x006c4bc4;
        }
        unaff_x24 = (ulong *)*in_stack_00000038;
      }
      unaff_x19[0xa3] = puVar9;
      param_1 = param_1 + uVar12 * 8;
      goto LAB_006c4be4;
    }
    uVar12 = 0;
    uVar10 = uVar7 >> 4 ^ uVar7 >> 9;
    while( true ) {
      uVar10 = uVar10 & unaff_x19[0x26] - 1;
      uVar11 = *(ulong *)(unaff_x19[0x25] + uVar10 * 0x20);
      if (uVar11 == uVar7) break;
      uVar12 = uVar12 + 1;
      uVar10 = uVar12 + uVar10;
      if (uVar11 == unaff_x19[0x28] || unaff_x19[0x26] - 1 < uVar12) goto code_r0x006c4abc;
    }
    if (*(int *)(unaff_x19[0x25] + uVar10 * 0x20 + 8) == 0) goto code_r0x006c4abc;
    uVar2 = *(uint *)((long)unaff_x19 + 0x484);
    uVar5 = uVar2 + 1;
    if (0xff < uVar5) {
      func_0x006bc388(in_stack_00000030 + 0xc,
                      "Out of registers when trying to allocate %d registers: exceeded limit %d");
      goto LAB_006c50ac;
    }
    *(uint *)((long)unaff_x19 + 0x484) = uVar5;
    uVar1 = *(uint *)(unaff_x19 + 0x91);
    if (*(uint *)(unaff_x19 + 0x91) <= uVar5) {
      uVar1 = uVar5;
    }
    *(uint *)(unaff_x19 + 0x91) = uVar1;
    func_0x006c66e4();
    unaff_x24 = (ulong *)unaff_x19[0xa4];
    if (unaff_x24 < (ulong *)unaff_x19[0xa5]) {
      uVar7 = (ulong)(uVar2 & 0xff) << 0x20;
      goto code_r0x006c49fc;
    }
    puVar19 = (ulong *)*in_stack_00000038;
    lVar6 = (long)unaff_x24 - (long)puVar19 >> 3;
    uVar7 = lVar6 + 1;
    if (uVar7 >> 0x3d != 0) {
      func_0x00017f90(in_stack_00000038);
      goto LAB_006c50ac;
    }
    uVar10 = (long)unaff_x19[0xa5] - (long)puVar19;
    uVar12 = (long)uVar10 >> 2;
    if (uVar12 <= uVar7) {
      uVar12 = uVar7;
    }
    if (0x7ffffffffffffff7 < uVar10) {
      uVar12 = 0x1fffffffffffffff;
    }
    if (uVar12 == 0) {
      param_1 = 0;
    }
    else {
      if (uVar12 >> 0x3d != 0) {
        func_0x00017514();
        goto LAB_006c50ac;
      }
      param_1 = __Znwm(uVar12 << 3);
    }
    puVar9 = (ulong *)(param_1 + lVar6 * 8);
    puVar22 = puVar9 + 1;
    *puVar9 = (ulong)(uVar2 & 0xff) << 0x20;
    if (unaff_x24 == puVar19) goto code_r0x006c4dd8;
    uVar7 = (long)unaff_x24 + (-8 - (long)puVar19);
    puVar13 = unaff_x24;
    if ((uVar7 < 0x58) ||
       ((ulong)((long)unaff_x24 - (param_1 + ((long)unaff_x24 - (long)puVar19))) < 0x40))
    goto code_r0x006c4dc0;
    uVar7 = (uVar7 >> 3) + 1;
    uVar11 = uVar7 & 0x3ffffffffffffff8;
    puVar13 = unaff_x24 + -uVar11;
    puVar9 = puVar9 + -uVar11;
    puVar15 = unaff_x24 + -4;
    puVar14 = (ulong *)(param_1 + lVar6 * 8 + -0x20);
    uVar10 = uVar11;
    do {
      uVar24 = *puVar15;
      uVar23 = puVar15[3];
      uVar16 = puVar15[2];
      uVar28 = puVar15[-3];
      uVar27 = puVar15[-4];
      uVar26 = puVar15[-1];
      uVar25 = puVar15[-2];
      puVar14[1] = puVar15[1];
      *puVar14 = uVar24;
      puVar14[3] = uVar23;
      puVar14[2] = uVar16;
      puVar14[-3] = uVar28;
      puVar14[-4] = uVar27;
      puVar14[-1] = uVar26;
      puVar14[-2] = uVar25;
      puVar15 = puVar15 + -8;
      puVar14 = puVar14 + -8;
      uVar10 = uVar10 - 8;
    } while (uVar10 != 0);
    if (uVar7 != uVar11) {
code_r0x006c4dc0:
      do {
        puVar13 = puVar13 + -1;
        puVar9 = puVar9 + -1;
        *puVar9 = *puVar13;
      } while (puVar13 != puVar19);
    }
    unaff_x24 = (ulong *)*in_stack_00000038;
code_r0x006c4dd8:
    unaff_x19[0xa3] = puVar9;
    param_1 = param_1 + uVar12 * 8;
  } while( true );
  while( true ) {
    uVar12 = uVar12 + 1;
    uVar11 = uVar12 + uVar11;
    if (unaff_x19[0x1c] - 1 < uVar12) break;
code_r0x006c4c28:
    uVar11 = uVar11 & unaff_x19[0x1c] - 1;
    uVar16 = *(ulong *)(unaff_x19[0x1b] + uVar11 * unaff_x22);
    if (uVar16 == uVar7) {
      unaff_x23 = (ulong)*(byte *)(unaff_x19[0x1b] + uVar11 * unaff_x22 + 0x10);
      unaff_x20 = (ulong)*(byte *)(lVar6 + uVar10 * unaff_x22 + 8);
      unaff_x24 = (ulong *)unaff_x19[0xa4];
      puVar19 = (ulong *)unaff_x19[0xa5];
      if (puVar19 <= unaff_x24) goto code_r0x006c4e04;
      goto code_r0x006c4c70;
    }
    if (uVar16 == unaff_x19[0x1e]) break;
  }
code_r0x006c4c54:
  unaff_x23 = 0;
  unaff_x20 = (ulong)*(byte *)(lVar6 + uVar10 * unaff_x22 + 8);
  unaff_x24 = (ulong *)unaff_x19[0xa4];
  puVar19 = (ulong *)unaff_x19[0xa5];
  if (puVar19 <= unaff_x24) {
code_r0x006c4e04:
    unaff_x27 = (ulong *)*in_stack_00000038;
    in_stack_00000010 = (long)unaff_x24 - (long)unaff_x27;
    unaff_x21 = in_stack_00000010 >> 3;
    uVar7 = unaff_x21 + 1;
    if (uVar7 >> 0x3d != 0) {
      func_0x00017f90(in_stack_00000038);
      goto LAB_006c50ac;
    }
    unaff_x26 = (long)puVar19 - (long)unaff_x27 >> 2;
    if (unaff_x26 <= uVar7) {
      unaff_x26 = uVar7;
    }
    if (0x7ffffffffffffff7 < (ulong)((long)puVar19 - (long)unaff_x27)) {
      unaff_x26 = 0x1fffffffffffffff;
    }
    if (unaff_x26 == 0) {
      param_1 = 0;
      puVar19 = (ulong *)(unaff_x21 * 8);
      puVar22 = puVar19 + 1;
      *puVar19 = unaff_x23 | unaff_x20 << 0x20;
      if (unaff_x24 != unaff_x27) goto LAB_006c4ea4;
      goto LAB_006c4f34;
    }
    if (unaff_x26 >> 0x3d == 0) {
      param_1 = __Znwm(unaff_x26 << 3);
      goto code_r0x006c4e60;
    }
    func_0x00017514();
    goto LAB_006c50ac;
  }
code_r0x006c4c70:
  uVar7 = unaff_x23 | unaff_x20 << 0x20;
code_r0x006c49fc:
  puVar22 = unaff_x24 + 1;
  *unaff_x24 = uVar7;
  goto code_r0x006c4a04;
LAB_006c4ea4:
  uVar7 = (long)unaff_x24 + (-8 - (long)unaff_x27);
  puVar9 = unaff_x24;
  if ((0x57 < uVar7) && (0x3f < (ulong)((long)unaff_x24 - (param_1 + in_stack_00000010)))) {
    uVar7 = (uVar7 >> 3) + 1;
    uVar10 = uVar7 & 0x3ffffffffffffff8;
    puVar9 = unaff_x24 + -uVar10;
    puVar19 = puVar19 + -uVar10;
    puVar13 = unaff_x24 + -4;
    puVar15 = (ulong *)(param_1 + unaff_x21 * 8 + -0x20);
    uVar12 = uVar10;
    do {
      uVar23 = *puVar13;
      uVar16 = puVar13[3];
      uVar11 = puVar13[2];
      uVar27 = puVar13[-3];
      uVar26 = puVar13[-4];
      uVar25 = puVar13[-1];
      uVar24 = puVar13[-2];
      puVar15[1] = puVar13[1];
      *puVar15 = uVar23;
      puVar15[3] = uVar16;
      puVar15[2] = uVar11;
      puVar15[-3] = uVar27;
      puVar15[-4] = uVar26;
      puVar15[-1] = uVar25;
      puVar15[-2] = uVar24;
      puVar13 = puVar13 + -8;
      puVar15 = puVar15 + -8;
      uVar12 = uVar12 - 8;
    } while (uVar12 != 0);
    if (uVar7 == uVar10) goto LAB_006c4f2c;
  }
  do {
    puVar9 = puVar9 + -1;
    puVar19 = puVar19 + -1;
    *puVar19 = *puVar9;
  } while (puVar9 != unaff_x27);
LAB_006c4f2c:
  unaff_x24 = (ulong *)*in_stack_00000038;
  goto LAB_006c4f34;
}

