
ulong FUN_00712c5c(void)

{
  long *plVar1;
  int iVar2;
  int iVar3;
  undefined1 uVar4;
  undefined8 uVar5;
  long lVar6;
  undefined8 *puVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long unaff_x19;
  int *unaff_x20;
  ulong uVar16;
  undefined8 *unaff_x21;
  long unaff_x22;
  undefined8 uVar17;
  long lVar18;
  undefined8 unaff_x28;
  ulong uVar19;
  long unaff_x29;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
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
  undefined8 uStack00000000000000d0;
  undefined8 in_stack_000000d8;
  
  func_0x00717434();
  iVar2 = *unaff_x20;
  in_stack_000000d8 = unaff_x21[1];
  uStack00000000000000d0 = *unaff_x21;
  if (iVar2 == 0x12d) {
    func_0x00710d48();
  }
  else {
    func_0x0072447c();
  }
  in_stack_000000b8 = (long *)(unaff_x19 + 0x238);
  in_stack_000000c0 = *(long *)(unaff_x19 + 0x240) - *(long *)(unaff_x19 + 0x238) >> 3;
  in_stack_000000c8 = 0;
  in_stack_000000a0 = (long *)(unaff_x19 + 0x3d0);
  in_stack_000000a8 = *(long *)(unaff_x19 + 0x3d8) - *(long *)(unaff_x19 + 0x3d0) >> 3;
  in_stack_000000b0 = 0;
  func_0x00717804();
  uVar5 = *(undefined8 *)unaff_x20;
  *(undefined8 *)(unaff_x22 + 0x20) = *(undefined8 *)(unaff_x20 + 2);
  *(undefined8 *)(unaff_x22 + 0x18) = uVar5;
  uVar5 = *(undefined8 *)(unaff_x20 + 4);
  *(undefined8 *)(unaff_x22 + 0x30) = *(undefined8 *)(unaff_x20 + 6);
  *(undefined8 *)(unaff_x22 + 0x28) = uVar5;
  iVar3 = *unaff_x20;
  if (iVar3 == 0x125) {
    func_0x00710d48();
  }
  else {
    func_0x0072447c();
  }
  lVar10 = *(long *)(unaff_x19 + 400);
  lVar18 = *(long *)(unaff_x19 + 0x198);
  *(int *)(*(long *)(unaff_x19 + 0x150) + -4) = *(int *)(*(long *)(unaff_x19 + 0x150) + -4) + 1;
  uStack0000000000000088 = (long *)(unaff_x19 + 0x2b0);
  in_stack_00000090 = *(long *)(unaff_x19 + 0x2b8) - *(long *)(unaff_x19 + 0x2b0) >> 3;
  in_stack_00000098 = 0;
  if (*(long *)(unaff_x29 + -0xb8) == 0) {
    lVar12 = lVar18;
    lVar13 = lVar10;
  }
  else {
    uVar16 = 0;
    do {
      uVar5 = func_0x007170f8();
      uStack0000000000000078._0_4_ = (undefined4)uVar5;
      uStack0000000000000078._4_4_ = (undefined4)((ulong)uVar5 >> 0x20);
      func_0x00711dac(&uStack0000000000000088,&uStack0000000000000078);
      uVar16 = uVar16 + 1;
    } while (uVar16 < *(ulong *)(unaff_x29 + -0xb8));
    lVar12 = *(long *)(unaff_x19 + 0x198);
    lVar13 = *(long *)(unaff_x19 + 400);
  }
  lVar6 = func_0x00711360();
  plVar1 = (long *)(unaff_x19 + 400);
  lVar8 = *(long *)(unaff_x19 + 400);
  lVar11 = *(long *)(unaff_x19 + 0x198);
  uVar19 = lVar11 - lVar8 >> 3;
  uVar16 = (ulong)(lVar12 - lVar13) >> 3 & 0xffffffff;
  if (uVar16 < uVar19) {
    do {
      uVar5 = *(undefined8 *)(*(long *)(*plVar1 + uVar19 * 8 + -8) + 0x18);
      puVar7 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      uVar19 = uVar19 - 1;
      *puVar7 = uVar5;
    } while (uVar16 < uVar19);
    lVar8 = *(long *)(unaff_x19 + 400);
    lVar11 = *(long *)(unaff_x19 + 0x198);
    uVar19 = lVar11 - lVar8 >> 3;
  }
  if (uVar16 < uVar19 || uVar16 - uVar19 == 0) {
    if (uVar16 < uVar19) {
      lVar11 = lVar8 + uVar16 * 8;
      *(long *)(unaff_x19 + 0x198) = lVar11;
    }
  }
  else {
    func_0x006cfeb0(plVar1,uVar16 - uVar19);
    lVar8 = *(long *)(unaff_x19 + 400);
    lVar11 = *(long *)(unaff_x19 + 0x198);
  }
  *(int *)(*(long *)(unaff_x19 + 0x150) + -4) = *(int *)(*(long *)(unaff_x19 + 0x150) + -4) + -1;
  uVar19 = lVar11 - lVar8 >> 3;
  uVar16 = (ulong)(lVar18 - lVar10) >> 3 & 0xffffffff;
  if (uVar16 < uVar19) {
    do {
      uVar5 = *(undefined8 *)(*(long *)(*plVar1 + uVar19 * 8 + -8) + 0x18);
      puVar7 = (undefined8 *)func_0x006db828(unaff_x19 + 0x168);
      uVar19 = uVar19 - 1;
      *puVar7 = uVar5;
    } while (uVar16 < uVar19);
    lVar8 = *(long *)(unaff_x19 + 400);
    uVar19 = *(long *)(unaff_x19 + 0x198) - lVar8 >> 3;
  }
  if (uVar16 < uVar19 || uVar16 - uVar19 == 0) {
    if (uVar16 < uVar19) {
      *(ulong *)(unaff_x19 + 0x198) = lVar8 + uVar16 * 8;
    }
  }
  else {
    func_0x006cfeb0(plVar1,uVar16 - uVar19);
  }
  uVar17 = *(undefined8 *)(unaff_x19 + 0x8c);
  uStack0000000000000078._0_4_ = *(undefined4 *)(unaff_x29 + -0xb0);
  uStack0000000000000078._4_4_ = (undefined4)*(undefined8 *)(unaff_x29 + -0xac);
  in_stack_00000080 = (undefined4)((ulong)*(undefined8 *)(unaff_x29 + -0xac) >> 0x20);
  uVar4 = func_0x00716f30();
  uVar16 = in_stack_00000098;
  lVar10 = in_stack_00000090;
  *(undefined1 *)(lVar6 + 0x30) = uVar4;
  uVar5 = *(undefined8 *)(unaff_x19 + 0xd8);
  uStack0000000000000078._0_4_ = (undefined4)unaff_x28;
  uStack0000000000000078._4_4_ = (undefined4)((ulong)unaff_x28 >> 0x20);
  in_stack_00000080 = (undefined4)uVar17;
  uStack0000000000000084 = (undefined4)((ulong)uVar17 >> 0x20);
  if (in_stack_00000098 == 0) {
    uStack0000000000000068 = 0;
  }
  else {
    lVar18 = *uStack0000000000000088;
    uStack0000000000000068 = func_0x00704c24(uVar5,in_stack_00000098 << 3);
    if ((uVar16 < 8) || ((ulong)((uStack0000000000000068 + lVar10 * -8) - lVar18) < 0x40)) {
      uVar19 = 0;
    }
    else {
      uVar19 = uVar16 & 0xfffffffffffffff8;
      puVar7 = (undefined8 *)(uStack0000000000000068 + 0x20);
      puVar14 = (undefined8 *)(lVar10 * 8 + lVar18 + 0x20);
      uVar9 = uVar19;
      do {
        uVar17 = puVar14[-4];
        uVar21 = puVar14[-1];
        uVar20 = puVar14[-2];
        uVar23 = puVar14[1];
        uVar22 = *puVar14;
        uVar25 = puVar14[3];
        uVar24 = puVar14[2];
        puVar7[-3] = puVar14[-3];
        puVar7[-4] = uVar17;
        puVar7[-1] = uVar21;
        puVar7[-2] = uVar20;
        puVar7[1] = uVar23;
        *puVar7 = uVar22;
        puVar7[3] = uVar25;
        puVar7[2] = uVar24;
        uVar9 = uVar9 - 8;
        puVar7 = puVar7 + 8;
        puVar14 = puVar14 + 8;
      } while (uVar9 != 0);
      if (uVar16 == uVar19) goto code_r0x00712f88;
    }
    lVar12 = uVar16 - uVar19;
    puVar7 = (undefined8 *)(lVar18 + uVar19 * 8 + lVar10 * 8);
    puVar14 = (undefined8 *)(uStack0000000000000068 + uVar19 * 8);
    do {
      *puVar14 = *puVar7;
      lVar12 = lVar12 + -1;
      puVar7 = puVar7 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar12 != 0);
  }
code_r0x00712f88:
  uVar19 = in_stack_000000c8;
  lVar10 = in_stack_000000c0;
  in_stack_00000070 = uVar16;
  if (in_stack_000000c8 == 0) {
    uStack0000000000000058 = 0;
  }
  else {
    lVar18 = *in_stack_000000b8;
    uStack0000000000000058 =
         func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),in_stack_000000c8 << 3);
    if ((uVar19 < 8) ||
       (lVar12 = lVar10 * 8 + lVar18, (ulong)(uStack0000000000000058 - lVar12) < 0x40)) {
      uVar16 = 0;
    }
    else {
      uVar16 = uVar19 & 0xfffffffffffffff8;
      puVar7 = (undefined8 *)(uStack0000000000000058 + 0x20);
      puVar14 = (undefined8 *)(lVar12 + 0x20);
      uVar9 = uVar16;
      do {
        uVar17 = puVar14[-4];
        uVar21 = puVar14[-1];
        uVar20 = puVar14[-2];
        uVar23 = puVar14[1];
        uVar22 = *puVar14;
        uVar25 = puVar14[3];
        uVar24 = puVar14[2];
        puVar7[-3] = puVar14[-3];
        puVar7[-4] = uVar17;
        puVar7[-1] = uVar21;
        puVar7[-2] = uVar20;
        puVar7[1] = uVar23;
        *puVar7 = uVar22;
        puVar7[3] = uVar25;
        puVar7[2] = uVar24;
        uVar9 = uVar9 - 8;
        puVar7 = puVar7 + 8;
        puVar14 = puVar14 + 8;
      } while (uVar9 != 0);
      if (uVar19 == uVar16) goto code_r0x00712ff4;
    }
    lVar12 = uVar19 - uVar16;
    puVar7 = (undefined8 *)(lVar18 + uVar16 * 8 + lVar10 * 8);
    puVar14 = (undefined8 *)(uStack0000000000000058 + uVar16 * 8);
    do {
      *puVar14 = *puVar7;
      lVar12 = lVar12 + -1;
      puVar7 = puVar7 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar12 != 0);
  }
code_r0x00712ff4:
  in_stack_00000060 = uVar19;
  uVar16 = func_0x00704c24(uVar5,0x70);
  func_0x0070738c(uVar16,&uStack0000000000000078,&uStack0000000000000068,&uStack0000000000000058,
                  lVar6,iVar2 == 0x12d,&uStack00000000000000d0,iVar3 == 0x125);
  if (*(char *)(unaff_x19 + 0x58) == '\0') goto code_r0x007131c4;
  uVar5 = *(undefined8 *)(unaff_x19 + 0xd8);
  auVar26 = func_0x00717910();
  uVar19 = in_stack_000000b0;
  lVar10 = in_stack_000000a8;
  if (in_stack_000000b0 == 0) {
    lVar18 = 0;
  }
  else {
    lVar12 = *in_stack_000000a0;
    lVar18 = func_0x00704c24(*(undefined8 *)(unaff_x19 + 0xd8),in_stack_000000b0 << 3);
    if ((uVar19 < 8) || (lVar13 = lVar10 * 8 + lVar12, (ulong)(lVar18 - lVar13) < 0x40)) {
      uVar9 = 0;
    }
    else {
      uVar9 = uVar19 & 0xfffffffffffffff8;
      puVar7 = (undefined8 *)(lVar18 + 0x20);
      puVar14 = (undefined8 *)(lVar13 + 0x20);
      uVar15 = uVar9;
      do {
        uVar17 = puVar14[-4];
        uVar21 = puVar14[-1];
        uVar20 = puVar14[-2];
        uVar23 = puVar14[1];
        uVar22 = *puVar14;
        uVar25 = puVar14[3];
        uVar24 = puVar14[2];
        puVar7[-3] = puVar14[-3];
        puVar7[-4] = uVar17;
        puVar7[-1] = uVar21;
        puVar7[-2] = uVar20;
        puVar7[1] = uVar23;
        *puVar7 = uVar22;
        puVar7[3] = uVar25;
        puVar7[2] = uVar24;
        uVar15 = uVar15 - 8;
        puVar7 = puVar7 + 8;
        puVar14 = puVar14 + 8;
      } while (uVar15 != 0);
      if (uVar19 == uVar9) goto code_r0x007130c8;
    }
    lVar13 = uVar19 - uVar9;
    puVar7 = (undefined8 *)(lVar12 + uVar9 * 8 + lVar10 * 8);
    puVar14 = (undefined8 *)(lVar18 + uVar9 * 8);
    do {
      *puVar14 = *puVar7;
      lVar13 = lVar13 + -1;
      puVar7 = puVar7 + 1;
      puVar14 = puVar14 + 1;
    } while (lVar13 != 0);
  }
code_r0x007130c8:
  uVar5 = func_0x00704c24(uVar5,0x38);
  func_0x007095d8(uVar5,auVar26._0_8_,auVar26._8_8_,*(undefined8 *)(unaff_x29 + -0xd8),
                  *(undefined8 *)(unaff_x29 + -0xd0),lVar18,uVar19);
  lVar10 = *(long *)(unaff_x19 + 0x420);
  if ((ulong)(lVar10 * 3) >> 2 <= *(ulong *)(unaff_x19 + 0x428)) {
    if ((*(ulong *)(unaff_x19 + 0x428) != 0) && (uVar16 != *(ulong *)(unaff_x19 + 0x430))) {
      uVar19 = 0;
      uVar9 = uVar16 >> 4 ^ uVar16 >> 9;
      do {
        uVar9 = uVar9 & lVar10 - 1U;
        uVar15 = *(ulong *)(*(long *)(unaff_x19 + 0x418) + uVar9 * 0x10);
        if (uVar15 == uVar16) goto code_r0x0071315c;
        uVar19 = uVar19 + 1;
        uVar9 = uVar19 + uVar9;
      } while (uVar15 != *(ulong *)(unaff_x19 + 0x430) && uVar19 <= lVar10 - 1U);
    }
    func_0x006db93c();
    lVar10 = *(long *)(unaff_x19 + 0x420);
  }
code_r0x0071315c:
  lVar18 = *(long *)(unaff_x19 + 0x418);
  uVar19 = (uVar16 >> 4 ^ uVar16 >> 9) & lVar10 - 1U;
  uVar9 = *(ulong *)(lVar18 + uVar19 * 0x10);
  if (uVar9 != *(ulong *)(unaff_x19 + 0x430)) {
    lVar12 = 1;
    do {
      if (uVar9 == uVar16) goto code_r0x007131bc;
      uVar19 = uVar19 + lVar12 & lVar10 - 1U;
      uVar9 = *(ulong *)(lVar18 + uVar19 * 0x10);
      lVar12 = lVar12 + 1;
    } while (uVar9 != *(ulong *)(unaff_x19 + 0x430));
  }
  *(ulong *)(lVar18 + uVar19 * 0x10) = uVar16;
  *(long *)(unaff_x19 + 0x428) = *(long *)(unaff_x19 + 0x428) + 1;
code_r0x007131bc:
  *(undefined8 *)(lVar18 + uVar19 * 0x10 + 8) = uVar5;
code_r0x007131c4:
  lVar10 = *uStack0000000000000088 + in_stack_00000090 * 8;
  if (lVar10 != uStack0000000000000088[1]) {
    uStack0000000000000088[1] = lVar10;
  }
  lVar10 = *in_stack_000000a0 + in_stack_000000a8 * 8;
  if (lVar10 != in_stack_000000a0[1]) {
    in_stack_000000a0[1] = lVar10;
  }
  lVar10 = *in_stack_000000b8 + in_stack_000000c0 * 8;
  if (lVar10 != in_stack_000000b8[1]) {
    in_stack_000000b8[1] = lVar10;
  }
  plVar1 = *(long **)(unaff_x29 + -200);
  lVar10 = *plVar1 + *(long *)(unaff_x29 + -0xc0) * 0x28;
  if (lVar10 != plVar1[1]) {
    plVar1[1] = lVar10;
  }
  return uVar16;
}

