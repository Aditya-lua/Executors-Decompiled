
ulong FUN_00712cec(undefined1 param_1 [16])

{
  long *plVar1;
  int iVar2;
  undefined1 uVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long unaff_x19;
  int *unaff_x20;
  ulong uVar15;
  long unaff_x22;
  undefined8 uVar16;
  int unaff_w25;
  long lVar17;
  undefined8 unaff_x28;
  ulong uVar18;
  long unaff_x29;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined1 auVar25 [16];
  undefined8 uStack0000000000000058;
  ulong in_stack_00000060;
  undefined8 uStack0000000000000068;
  ulong in_stack_00000070;
  undefined8 uStack0000000000000078;
  undefined4 in_stack_00000080;
  undefined4 uStack0000000000000084;
  undefined8 uStack0000000000000088;
  long in_stack_00000090;
  ulong in_stack_00000098;
  long *in_stack_000000a0;
  long in_stack_000000a8;
  ulong in_stack_000000b0;
  long *in_stack_000000b8;
  long in_stack_000000c0;
  ulong in_stack_000000c8;
  undefined1 uStack00000000000000d0;
  
  *(long *)(unaff_x22 + 0x20) = param_1._8_8_;
  *(long *)(unaff_x22 + 0x18) = param_1._0_8_;
  uVar4 = *(undefined8 *)(unaff_x20 + 4);
  *(undefined8 *)(unaff_x22 + 0x30) = *(undefined8 *)(unaff_x20 + 6);
  *(undefined8 *)(unaff_x22 + 0x28) = uVar4;
  iVar2 = *unaff_x20;
  if (iVar2 == 0x125) {
    func_0x00710d48();
  }
  else {
    func_0x0072447c();
  }
  lVar9 = *(long *)(unaff_x19 + 400);
  lVar17 = *(long *)(unaff_x19 + 0x198);
  *(int *)(*(long *)(unaff_x19 + 0x150) + -4) = *(int *)(*(long *)(unaff_x19 + 0x150) + -4) + 1;
  uStack0000000000000088 = (long *)(unaff_x19 + 0x2b0);
  in_stack_00000090 = *(long *)(unaff_x19 + 0x2b8) - *(long *)(unaff_x19 + 0x2b0) >> 3;
  in_stack_00000098 = 0;
  if (*(long *)(unaff_x29 + -0xb8) == 0) {
    lVar11 = lVar17;
    lVar12 = lVar9;
  }
  else {
    uVar15 = 0;
    do {
      uVar4 = func_0x007170f8();
      uStack0000000000000078._0_4_ = (undefined4)uVar4;
      uStack0000000000000078._4_4_ = (undefined4)((ulong)uVar4 >> 0x20);
      func_0x00711dac(&uStack0000000000000088,&uStack0000000000000078);
      uVar15 = uVar15 + 1;
    } while (uVar15 < *(ulong *)(unaff_x29 + -0xb8));
    lVar11 = *(long *)(unaff_x19 + 0x198);
    lVar12 = *(long *)(unaff_x19 + 400);
  }
  lVar5 = func_0x00711360();
  plVar1 = (long *)(unaff_x19 + 400);
  lVar7 = *(long *)(unaff_x19 + 400);
  lVar10 = *(long *)(unaff_x19 + 0x198);
  uVar18 = lVar10 - lVar7 >> 3;
  uVar15 = (ulong)(lVar11 - lVar12) >> 3 & 0xffffffff;
  if (uVar15 < uVar18) {
    do {
      uVar4 = *(undefined8 *)(*(long *)(*plVar1 + uVar18 * 8 + -8) + 0x18);
      puVar6 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      uVar18 = uVar18 - 1;
      *puVar6 = uVar4;
    } while (uVar15 < uVar18);
    lVar7 = *(long *)(unaff_x19 + 400);
    lVar10 = *(long *)(unaff_x19 + 0x198);
    uVar18 = lVar10 - lVar7 >> 3;
  }
  if (uVar15 < uVar18 || uVar15 - uVar18 == 0) {
    if (uVar15 < uVar18) {
      lVar10 = lVar7 + uVar15 * 8;
      *(long *)(unaff_x19 + 0x198) = lVar10;
    }
  }
  else {
    func_0x006cfeb0(plVar1,uVar15 - uVar18);
    lVar7 = *(long *)(unaff_x19 + 400);
    lVar10 = *(long *)(unaff_x19 + 0x198);
  }
  *(int *)(*(long *)(unaff_x19 + 0x150) + -4) = *(int *)(*(long *)(unaff_x19 + 0x150) + -4) + -1;
  uVar18 = lVar10 - lVar7 >> 3;
  uVar15 = (ulong)(lVar17 - lVar9) >> 3 & 0xffffffff;
  if (uVar15 < uVar18) {
    do {
      uVar4 = *(undefined8 *)(*(long *)(*plVar1 + uVar18 * 8 + -8) + 0x18);
      puVar6 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      uVar18 = uVar18 - 1;
      *puVar6 = uVar4;
    } while (uVar15 < uVar18);
    lVar7 = *(long *)(unaff_x19 + 400);
    uVar18 = *(long *)(unaff_x19 + 0x198) - lVar7 >> 3;
  }
  if (uVar15 < uVar18 || uVar15 - uVar18 == 0) {
    if (uVar15 < uVar18) {
      *(ulong *)(unaff_x19 + 0x198) = lVar7 + uVar15 * 8;
    }
  }
  else {
    func_0x006cfeb0(plVar1,uVar15 - uVar18);
  }
  uVar16 = *(undefined8 *)(unaff_x19 + 0x8c);
  uStack0000000000000078._0_4_ = *(undefined4 *)(unaff_x29 + -0xb0);
  uStack0000000000000078._4_4_ = (undefined4)*(undefined8 *)(unaff_x29 + -0xac);
  in_stack_00000080 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0xac) >> 0x20);
  uVar3 = func_0x00716f30();
  uVar15 = in_stack_00000098;
  lVar9 = in_stack_00000090;
  *(undefined1 *)(lVar5 + 0x30) = uVar3;
  uVar4 = *(undefined8 *)(unaff_x19 + 0xd8);
  uStack0000000000000078._0_4_ = (undefined4)unaff_x28;
  uStack0000000000000078._4_4_ = (undefined4)((ulong)unaff_x28 >> 0x20);
  in_stack_00000080 = (undefined4)uVar16;
  uStack0000000000000084 = (undefined4)((ulong)uVar16 >> 0x20);
  if (in_stack_00000098 == 0) {
    uStack0000000000000068 = 0;
  }
  else {
    lVar17 = *uStack0000000000000088;
    uStack0000000000000068 = func_0x00704c24(uVar4,in_stack_00000098 << 3);
    if ((uVar15 < 8) || ((ulong)((uStack0000000000000068 + lVar9 * -8) - lVar17) < 0x40)) {
      uVar18 = 0;
    }
    else {
      uVar18 = uVar15 & 0xfffffffffffffff8;
      puVar6 = (undefined8 *)(uStack0000000000000068 + 0x20);
      puVar13 = (undefined8 *)(lVar9 * 8 + lVar17 + 0x20);
      uVar8 = uVar18;
      do {
        uVar16 = puVar13[-4];
        uVar20 = puVar13[-1];
        uVar19 = puVar13[-2];
        uVar22 = puVar13[1];
        uVar21 = *puVar13;
        uVar24 = puVar13[3];
        uVar23 = puVar13[2];
        puVar6[-3] = puVar13[-3];
        puVar6[-4] = uVar16;
        puVar6[-1] = uVar20;
        puVar6[-2] = uVar19;
        puVar6[1] = uVar22;
        *puVar6 = uVar21;
        puVar6[3] = uVar24;
        puVar6[2] = uVar23;
        uVar8 = uVar8 - 8;
        puVar6 = puVar6 + 8;
        puVar13 = puVar13 + 8;
      } while (uVar8 != 0);
      if (uVar15 == uVar18) goto code_r0x00712f88;
    }
    lVar11 = uVar15 - uVar18;
    puVar6 = (undefined8 *)(lVar17 + uVar18 * 8 + lVar9 * 8);
    puVar13 = (undefined8 *)(uStack0000000000000068 + uVar18 * 8);
    do {
      *puVar13 = *puVar6;
      lVar11 = lVar11 + -1;
      puVar6 = puVar6 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar11 != 0);
  }
code_r0x00712f88:
  uVar18 = in_stack_000000c8;
  lVar9 = in_stack_000000c0;
  in_stack_00000070 = uVar15;
  if (in_stack_000000c8 == 0) {
    uStack0000000000000058 = 0;
  }
  else {
    lVar17 = *in_stack_000000b8;
    uStack0000000000000058 =
         func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),in_stack_000000c8 << 3);
    if ((uVar18 < 8) ||
       (lVar11 = lVar9 * 8 + lVar17, (ulong)(uStack0000000000000058 - lVar11) < 0x40)) {
      uVar15 = 0;
    }
    else {
      uVar15 = uVar18 & 0xfffffffffffffff8;
      puVar6 = (undefined8 *)(uStack0000000000000058 + 0x20);
      puVar13 = (undefined8 *)(lVar11 + 0x20);
      uVar8 = uVar15;
      do {
        uVar16 = puVar13[-4];
        uVar20 = puVar13[-1];
        uVar19 = puVar13[-2];
        uVar22 = puVar13[1];
        uVar21 = *puVar13;
        uVar24 = puVar13[3];
        uVar23 = puVar13[2];
        puVar6[-3] = puVar13[-3];
        puVar6[-4] = uVar16;
        puVar6[-1] = uVar20;
        puVar6[-2] = uVar19;
        puVar6[1] = uVar22;
        *puVar6 = uVar21;
        puVar6[3] = uVar24;
        puVar6[2] = uVar23;
        uVar8 = uVar8 - 8;
        puVar6 = puVar6 + 8;
        puVar13 = puVar13 + 8;
      } while (uVar8 != 0);
      if (uVar18 == uVar15) goto code_r0x00712ff4;
    }
    lVar11 = uVar18 - uVar15;
    puVar6 = (undefined8 *)(lVar17 + uVar15 * 8 + lVar9 * 8);
    puVar13 = (undefined8 *)(uStack0000000000000058 + uVar15 * 8);
    do {
      *puVar13 = *puVar6;
      lVar11 = lVar11 + -1;
      puVar6 = puVar6 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar11 != 0);
  }
code_r0x00712ff4:
  in_stack_00000060 = uVar18;
  uVar15 = func_0x00704c24(uVar4,0x70);
  func_0x0070738c(uVar15,&uStack0000000000000078,&uStack0000000000000068,&uStack0000000000000058,
                  lVar5,unaff_w25 == 0x12d,&uStack00000000000000d0,iVar2 == 0x125);
  if (*(char *)(unaff_x19 + 0x58) == '\0') goto code_r0x007131c4;
  uVar4 = *(undefined8 *)(unaff_x19 + 0xd8);
  auVar25 = func_0x00717910();
  uVar18 = in_stack_000000b0;
  lVar9 = in_stack_000000a8;
  if (in_stack_000000b0 == 0) {
    lVar17 = 0;
  }
  else {
    lVar11 = *in_stack_000000a0;
    lVar17 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),in_stack_000000b0 << 3);
    if ((uVar18 < 8) || (lVar12 = lVar9 * 8 + lVar11, (ulong)(lVar17 - lVar12) < 0x40)) {
      uVar8 = 0;
    }
    else {
      uVar8 = uVar18 & 0xfffffffffffffff8;
      puVar6 = (undefined8 *)(lVar17 + 0x20);
      puVar13 = (undefined8 *)(lVar12 + 0x20);
      uVar14 = uVar8;
      do {
        uVar16 = puVar13[-4];
        uVar20 = puVar13[-1];
        uVar19 = puVar13[-2];
        uVar22 = puVar13[1];
        uVar21 = *puVar13;
        uVar24 = puVar13[3];
        uVar23 = puVar13[2];
        puVar6[-3] = puVar13[-3];
        puVar6[-4] = uVar16;
        puVar6[-1] = uVar20;
        puVar6[-2] = uVar19;
        puVar6[1] = uVar22;
        *puVar6 = uVar21;
        puVar6[3] = uVar24;
        puVar6[2] = uVar23;
        uVar14 = uVar14 - 8;
        puVar6 = puVar6 + 8;
        puVar13 = puVar13 + 8;
      } while (uVar14 != 0);
      if (uVar18 == uVar8) goto code_r0x007130c8;
    }
    lVar12 = uVar18 - uVar8;
    puVar6 = (undefined8 *)(lVar11 + uVar8 * 8 + lVar9 * 8);
    puVar13 = (undefined8 *)(lVar17 + uVar8 * 8);
    do {
      *puVar13 = *puVar6;
      lVar12 = lVar12 + -1;
      puVar6 = puVar6 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar12 != 0);
  }
code_r0x007130c8:
  uVar4 = func_0x00704c24(uVar4,0x38);
  func_0x007095d8(uVar4,auVar25._0_8_,auVar25._8_8_,*(undefined8 *)(unaff_x29 + -0xd8),
                  *(undefined8 *)(unaff_x29 + -0xd0),lVar17,uVar18);
  lVar9 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar9 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar15 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar18 = 0;
      uVar8 = uVar15 >> 4 ^ uVar15 >> 9;
      do {
        uVar8 = uVar8 & lVar9 - 1U;
        uVar14 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar8 * 0x10);
        if (uVar14 == uVar15) goto code_r0x0071315c;
        uVar18 = uVar18 + 1;
        uVar8 = uVar18 + uVar8;
      } while (uVar14 != *(ulong *)(unaff_x19 + 0x430) && uVar18 <= lVar9 - 1U);
    }
    func_0x006db93c();
    lVar9 = *(long *)(unaff_x19 + 0x420);
  }
code_r0x0071315c:
  lVar17 = *(long *)(unaff_x19 + 0x418);
  uVar18 = (uVar15 >> 4 ^ uVar15 >> 9) & lVar9 - 1U;
  uVar8 = *(ulong *)(lVar17 + uVar18 * 0x10);
  if (uVar8 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar11 = 1;
    do {
      if (uVar8 == uVar15) goto code_r0x007131bc;
      uVar18 = uVar18 + lVar11 & lVar9 - 1U;
      uVar8 = *(ulong *)(lVar17 + uVar18 * 0x10);
      lVar11 = lVar11 + 1;
    } while (uVar8 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar17 + uVar18 * 0x10) = uVar15;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x007131bc:
  *(undefined8 *)(lVar17 + uVar18 * 0x10 + 8) = uVar4;
code_r0x007131c4:
  lVar9 = *uStack0000000000000088 + in_stack_00000090 * 8;
  if (lVar9 != uStack0000000000000088[1]) {
    uStack0000000000000088[1] = lVar9;
  }
  lVar9 = *in_stack_000000a0 + in_stack_000000a8 * 8;
  if (lVar9 != in_stack_000000a0[1]) {
    in_stack_000000a0[1] = lVar9;
  }
  lVar9 = *in_stack_000000b8 + in_stack_000000c0 * 8;
  if (lVar9 != in_stack_000000b8[1]) {
    in_stack_000000b8[1] = lVar9;
  }
  plVar1 = *(long **)(unaff_x29 + -200);
  lVar9 = *plVar1 + *(long *)(unaff_x29 + -0xc0) * 0x28;
  if (lVar9 != plVar1[1]) {
    plVar1[1] = lVar9;
  }
  return uVar15;
}

