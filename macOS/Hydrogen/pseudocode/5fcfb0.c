
void thunk_FUN_005fcff8(void)

{
  ulong *puVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  long lVar10;
  bool bVar11;
  ulong uVar12;
  ulong uVar13;
  long *plVar14;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  long lVar18;
  ulong uVar19;
  ulong *puVar20;
  ulong uVar21;
  ulong uVar22;
  ulong *puVar23;
  ulong *puVar24;
  long lVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  uint in_w14;
  ulong uVar30;
  ulong uVar31;
  ulong *puVar32;
  ulong unaff_x19;
  ulong unaff_x20;
  ulong *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  ulong *unaff_x24;
  long unaff_x25;
  long unaff_x26;
  ulong unaff_x28;
  long unaff_x29;
  ulong *in_stack_00000008;
  uint uStack000000000000001c;
  ulong *in_stack_00000060;
  
  *unaff_x24 = 0;
  unaff_x24[1] = 0;
  *in_stack_00000060 = 0;
  puVar1 = in_stack_00000060 + unaff_x25;
  uStack000000000000001c = in_w14;
  if (puVar1 != unaff_x21) {
    _memcpy(puVar1);
  }
  lVar16 = unaff_x20 + 2;
  if ((lVar16 != 0) && (uStack000000000000001c != 0x40)) {
    uVar21 = 0;
    puVar24 = in_stack_00000060;
    do {
      uVar26 = *puVar24;
      *puVar24 = uVar26 << (unaff_x28 & 0x3f) | uVar21;
      uVar21 = uVar26 >> ((ulong)uStack000000000000001c & 0x3f);
      lVar16 = lVar16 + -1;
      puVar24 = puVar24 + 1;
    } while (lVar16 != 0);
  }
  uVar21 = unaff_x20;
  if ((in_stack_00000060[unaff_x20 + 1] == 0) && (*unaff_x24 < 2)) {
    plVar14 = (long *)(unaff_x23 + (unaff_x20 - unaff_x19) * 8);
    *plVar14 = 0;
    plVar14[1] = 0;
    do {
      uVar21 = *unaff_x24;
      if (uVar21 == 0) {
        puVar24 = unaff_x24;
        lVar16 = -unaff_x19;
        while (lVar16 != 0) {
          puVar32 = puVar24 + -1;
          puVar20 = puVar24 + unaff_x19 + 1;
          if (*puVar20 < *puVar32) break;
          lVar16 = lVar16 + 1;
          puVar24 = puVar24 + -1;
          if (*puVar32 < *puVar20) {
            uVar21 = unaff_x20 - 2;
            goto LAB_005fd178;
          }
        }
      }
      uVar26 = 0;
      if (unaff_x19 != 0) {
        uVar21 = 0;
        puVar24 = unaff_x24;
        do {
          puVar32 = puVar24 + (1 - unaff_x19);
          uVar31 = puVar32[-1];
          uVar12 = puVar24[2];
          uVar19 = uVar31 - uVar12;
          puVar32[-1] = uVar19 - uVar26;
          uVar17 = *puVar32 - puVar24[3];
          uVar19 = (-(ulong)(uVar19 < uVar26) - (ulong)(uVar31 < uVar12)) + uVar17;
          uVar26 = (ulong)(uVar17 < uVar19);
          if (*puVar32 < puVar24[3]) {
            uVar26 = uVar26 + 1;
          }
          *puVar32 = uVar19;
          uVar21 = uVar21 + 2;
          puVar24 = puVar24 + 2;
        } while (uVar21 < unaff_x19);
        uVar21 = *unaff_x24;
      }
      *unaff_x24 = uVar21 - uVar26;
      *plVar14 = *plVar14 + 1;
    } while( true );
  }
LAB_005fd178:
  uVar17 = unaff_x24[unaff_x19];
  uVar26 = uVar17 + 1;
  uVar19 = *(ulong *)(unaff_x22 + unaff_x26 * 8);
  if (uVar17 == 0xffffffffffffffff) {
    uVar19 = uVar19 + 1;
  }
  if (uVar21 < unaff_x19) {
code_r0x005fd190:
    if (puVar1 != in_stack_00000008) {
      _memcpy(in_stack_00000008,puVar1,unaff_x19 * 8);
    }
    if (uStack000000000000001c != 0x40) {
      uVar21 = 0;
      do {
        uVar26 = in_stack_00000008[unaff_x19 - 1] >> (unaff_x28 & 0x3f) | uVar21;
        uVar21 = in_stack_00000008[unaff_x19 - 1] << ((ulong)uStack000000000000001c & 0x3f);
        in_stack_00000008[unaff_x19 - 1] = uVar26;
        unaff_x19 = unaff_x19 - 1;
      } while (unaff_x19 != 0);
    }
    return;
  }
  lVar16 = unaff_x22 + unaff_x19 * 8;
  uVar12 = uVar19 + 1;
  uVar17 = ~uVar17;
  puVar24 = in_stack_00000060 + ((uVar21 + 1) - unaff_x19);
  puVar32 = in_stack_00000060 + (uVar21 - 1);
  *(ulong *)(unaff_x29 + -0x60) = uVar17;
code_r0x005fd26c:
  puVar20 = in_stack_00000060 + uVar21;
  uVar13 = *puVar20;
  uVar15 = puVar20[1];
  *(ulong **)(unaff_x29 + -0x70) = puVar20;
  *(ulong **)(unaff_x29 + -0x68) = puVar32;
  uVar31 = uVar15;
  if (uVar26 == 0 && uVar19 == 0) goto code_r0x005fd410;
  uVar27 = puVar20[-2];
  uVar28 = puVar20[-1];
  if (uVar12 < 2) {
    if (uVar12 != 0) {
      uVar17 = uVar28;
      uVar31 = uVar13;
      uVar29 = uVar26;
      goto code_r0x005fd2bc;
    }
  }
  else {
    uVar17 = uVar13;
    uVar29 = uVar12;
code_r0x005fd2bc:
    uVar31 = func_0x00479b20(uVar17,uVar31,uVar29,0);
    uVar17 = *(ulong *)(unaff_x29 + -0x60);
  }
  auVar2._8_8_ = 0;
  auVar2._0_8_ = uVar31;
  auVar6._8_8_ = 0;
  auVar6._0_8_ = uVar26;
  uVar22 = SUB168(auVar2 * auVar6,8);
  uVar29 = uVar28 - uVar31 * uVar26;
  uVar30 = (ulong)(uVar28 < uVar31 * uVar26);
  auVar3._8_8_ = 0;
  auVar3._0_8_ = uVar31;
  auVar7._8_8_ = 0;
  auVar7._0_8_ = uVar19;
  lVar25 = SUB168(auVar3 * auVar7,8);
  uVar28 = uVar31 * uVar19 + uVar22;
  if (CARRY8(uVar31 * uVar19,uVar22)) {
    lVar25 = lVar25 + 1;
  }
  uVar22 = uVar28 + uVar30;
  if (CARRY8(uVar28,uVar30)) {
    lVar25 = lVar25 + 1;
  }
  uVar28 = uVar13 - uVar22;
  lVar25 = uVar15 - (lVar25 + (ulong)(uVar13 < uVar22));
  for (; ((lVar25 != 0 || (uVar19 < uVar28)) || ((uVar28 == uVar19 && (uVar26 <= uVar29))));
      uVar29 = uVar29 + uVar17) {
    uVar13 = uVar19 + (uVar29 < uVar26);
    bVar11 = uVar28 < uVar13;
    uVar28 = uVar28 - uVar13;
    lVar25 = lVar25 - ((ulong)CARRY8(uVar19,(ulong)(uVar29 < uVar26)) + (ulong)bVar11);
    uVar31 = uVar31 + 1;
  }
  if (uVar12 < 2) {
    if (uVar12 != 0) {
      uVar17 = uVar27;
      uVar13 = uVar29;
      uVar15 = uVar26;
      goto code_r0x005fd374;
    }
    uVar13 = uVar28;
  }
  else {
    uVar17 = uVar29;
    uVar13 = uVar28;
    uVar15 = uVar12;
code_r0x005fd374:
    uVar13 = func_0x00479b20(uVar17,uVar13,uVar15,0);
    uVar17 = *(ulong *)(unaff_x29 + -0x60);
  }
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar13;
  auVar8._8_8_ = 0;
  auVar8._0_8_ = uVar26;
  uVar22 = SUB168(auVar4 * auVar8,8);
  uVar30 = uVar27 - uVar13 * uVar26;
  uVar27 = (ulong)(uVar27 < uVar13 * uVar26);
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar13;
  auVar9._8_8_ = 0;
  auVar9._0_8_ = uVar19;
  lVar25 = SUB168(auVar5 * auVar9,8);
  uVar15 = uVar13 * uVar19 + uVar22;
  if (CARRY8(uVar13 * uVar19,uVar22)) {
    lVar25 = lVar25 + 1;
  }
  uVar22 = uVar15 + uVar27;
  if (CARRY8(uVar15,uVar27)) {
    lVar25 = lVar25 + 1;
  }
  uVar15 = uVar29 - uVar22;
  lVar25 = uVar28 - (lVar25 + (ulong)(uVar29 < uVar22));
  for (; ((lVar25 != 0 || (uVar19 < uVar15)) || ((uVar15 == uVar19 && (uVar26 <= uVar30))));
      uVar30 = uVar30 + uVar17) {
    uVar27 = uVar19 + (uVar30 < uVar26);
    bVar11 = uVar15 < uVar27;
    uVar15 = uVar15 - uVar27;
    lVar25 = lVar25 - ((ulong)CARRY8(uVar19,(ulong)(uVar30 < uVar26)) + (ulong)bVar11);
    uVar13 = uVar13 + 1;
  }
code_r0x005fd410:
  puVar32 = (ulong *)(unaff_x23 + unaff_x19 * -8 + uVar21 * 8);
  *puVar32 = uVar13;
  puVar32[1] = uVar31;
  func_0x005fc218(lVar16,lVar16 + unaff_x19 * 8 + 0x10,puVar32,2);
  if (unaff_x19 != 0xfffffffffffffffe) {
    uVar31 = 0;
    uVar17 = 0;
    puVar20 = puVar24;
    puVar23 = in_stack_00000060 + unaff_x20 + unaff_x19 + 3;
    do {
      uVar27 = puVar20[-1];
      uVar28 = puVar23[-1];
      uVar13 = uVar27 - uVar28;
      puVar20[-1] = uVar13 - uVar31;
      uVar15 = *puVar20 - *puVar23;
      uVar13 = (-(ulong)(uVar13 < uVar31) - (ulong)(uVar27 < uVar28)) + uVar15;
      uVar31 = (ulong)(uVar15 < uVar13);
      if (*puVar20 < *puVar23) {
        uVar31 = uVar31 + 1;
      }
      *puVar20 = uVar13;
      uVar17 = uVar17 + 2;
      puVar20 = puVar20 + 2;
      puVar23 = puVar23 + 2;
    } while (uVar17 < unaff_x19 + 2);
  }
  lVar25 = *(long *)(unaff_x29 + -0x68);
  uVar17 = *(ulong *)(unaff_x29 + -0x60);
  plVar14 = *(long **)(unaff_x29 + -0x70);
  lVar18 = 0;
  if (*plVar14 == 0) goto code_r0x005fd53c;
  do {
    do {
      lVar18 = 0;
      uVar13 = 0;
      uVar31 = 0;
      do {
        puVar20 = (ulong *)((long)puVar24 + lVar18);
        uVar28 = puVar20[-1];
        uVar30 = *(ulong *)(unaff_x22 + lVar18);
        uVar15 = uVar28 - uVar30;
        puVar20[-1] = uVar15 - uVar13;
        uVar29 = ((ulong *)(unaff_x22 + lVar18))[1];
        uVar27 = *puVar20 - uVar29;
        uVar15 = (-(ulong)(uVar15 < uVar13) - (ulong)(uVar28 < uVar30)) + uVar27;
        uVar13 = (ulong)(uVar27 < uVar15);
        if (*puVar20 < uVar29) {
          uVar13 = uVar13 + 1;
        }
        *puVar20 = uVar15;
        uVar31 = uVar31 + 2;
        lVar18 = lVar18 + 0x10;
      } while (uVar31 < unaff_x19);
      *plVar14 = *plVar14 - uVar13;
      uVar31 = puVar32[1];
      if (*puVar32 == 0xffffffffffffffff) {
        uVar31 = uVar31 + 1;
      }
      *puVar32 = *puVar32 + 1;
      puVar32[1] = uVar31;
      lVar18 = 0;
    } while (*plVar14 != 0);
code_r0x005fd53c:
    while (unaff_x19 + lVar18 != 0) {
      uVar31 = *(ulong *)(lVar25 + lVar18 * 8);
      lVar10 = lVar18 + 1;
      if (in_stack_00000060[unaff_x20 + unaff_x19 + lVar10] < uVar31) break;
      lVar18 = lVar18 + -1;
      if (uVar31 < in_stack_00000060[unaff_x20 + unaff_x19 + lVar10]) {
        uVar21 = uVar21 - 2;
        puVar24 = puVar24 + -2;
        puVar32 = (ulong *)(lVar25 + -0x10);
        if (unaff_x19 <= uVar21) goto code_r0x005fd26c;
        goto code_r0x005fd190;
      }
    }
  } while( true );
}

