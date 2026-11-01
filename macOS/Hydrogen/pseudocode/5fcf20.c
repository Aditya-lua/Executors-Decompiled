
void FUN_005fcf20(ulong *param_1,long param_2,ulong *param_3,ulong *param_4,long param_5,
                 ulong *param_6,long param_7)

{
  ulong *puVar1;
  ulong *puVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  long lVar12;
  ulong *puVar13;
  bool bVar14;
  ulong uVar15;
  ulong uVar16;
  long *plVar17;
  ulong uVar18;
  ulong uVar19;
  long lVar20;
  uint uVar21;
  ulong *puVar22;
  ulong uVar23;
  ulong *puVar24;
  ulong uVar25;
  ulong *puVar26;
  ulong *puVar27;
  long lVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  uint uVar33;
  ulong uVar34;
  ulong uVar35;
  ulong *puVar36;
  ulong unaff_x19;
  ulong unaff_x20;
  ulong uVar37;
  ulong uVar38;
  long unaff_x29;
  ulong *puStack0000000000000008;
  uint uStack000000000000001c;
  ulong *puStack0000000000000060;
  
  puVar2 = param_3 + param_5;
  puVar1 = puVar2 + 2;
  param_7 = param_7 + -1;
  uVar37 = (ulong)(param_6[param_7] == 0);
  puVar1[param_7] = 0;
  puVar2[2] = 0;
  puStack0000000000000008 = param_1;
  puStack0000000000000060 = param_3;
  if (puVar1 + uVar37 != param_6) {
    _memcpy(puVar1 + uVar37,param_6,(unaff_x19 - uVar37) * 8);
  }
  if (puVar1[param_7] == 0) {
    uStack000000000000001c = 0;
    uVar38 = 0;
  }
  else {
    uVar21 = 0;
    uVar33 = 0x40;
    do {
      uVar3 = uVar21 + uVar33 >> 1;
      uStack000000000000001c = uVar3;
      if (puVar1[param_7] >> ((ulong)uVar3 & 0x3f) != 0) {
        uStack000000000000001c = uVar33;
        uVar21 = uVar3;
      }
      uVar33 = uStack000000000000001c;
    } while (1 < uStack000000000000001c - uVar21);
    uVar38 = (ulong)(0x40 - uStack000000000000001c);
  }
  if ((unaff_x19 != 0) && (uStack000000000000001c != 0x40)) {
    uVar23 = 0;
    puVar22 = puVar1;
    uVar29 = unaff_x19;
    do {
      uVar19 = *puVar22;
      *puVar22 = uVar19 << (uVar38 & 0x3f) | uVar23;
      uVar23 = uVar19 >> ((ulong)uStack000000000000001c & 0x3f);
      uVar29 = uVar29 - 1;
      puVar22 = puVar22 + 1;
    } while (uVar29 != 0);
  }
  *puVar2 = 0;
  puVar2[1] = 0;
  *puStack0000000000000060 = 0;
  puVar22 = puStack0000000000000060 + uVar37;
  if (puVar22 != param_4) {
    _memcpy(puVar22,param_4,unaff_x20 << 3);
  }
  puVar13 = puStack0000000000000060;
  lVar28 = unaff_x20 + 2;
  if ((lVar28 != 0) && (uStack000000000000001c != 0x40)) {
    uVar37 = 0;
    puVar27 = puStack0000000000000060;
    do {
      uVar29 = *puVar27;
      *puVar27 = uVar29 << (uVar38 & 0x3f) | uVar37;
      uVar37 = uVar29 >> ((ulong)uStack000000000000001c & 0x3f);
      lVar28 = lVar28 + -1;
      puVar27 = puVar27 + 1;
    } while (lVar28 != 0);
  }
  uVar37 = unaff_x20;
  if ((puStack0000000000000060[unaff_x20 + 1] == 0) && (*puVar2 < 2)) {
    plVar17 = (long *)(param_2 + (unaff_x20 - unaff_x19) * 8);
    *plVar17 = 0;
    plVar17[1] = 0;
    do {
      uVar37 = *puVar2;
      if (uVar37 == 0) {
        puVar27 = puVar2;
        lVar28 = -unaff_x19;
        while (lVar28 != 0) {
          puVar36 = puVar27 + -1;
          puVar24 = puVar27 + unaff_x19 + 1;
          if (*puVar24 < *puVar36) break;
          lVar28 = lVar28 + 1;
          puVar27 = puVar27 + -1;
          if (*puVar36 < *puVar24) {
            uVar37 = unaff_x20 - 2;
            goto LAB_005fd178;
          }
        }
      }
      uVar29 = 0;
      if (unaff_x19 != 0) {
        uVar37 = 0;
        puVar27 = puVar2;
        do {
          puVar36 = puVar27 + (1 - unaff_x19);
          uVar35 = puVar36[-1];
          uVar15 = puVar27[2];
          uVar23 = uVar35 - uVar15;
          puVar36[-1] = uVar23 - uVar29;
          uVar19 = *puVar36 - puVar27[3];
          uVar23 = (-(ulong)(uVar23 < uVar29) - (ulong)(uVar35 < uVar15)) + uVar19;
          uVar29 = (ulong)(uVar19 < uVar23);
          if (*puVar36 < puVar27[3]) {
            uVar29 = uVar29 + 1;
          }
          *puVar36 = uVar23;
          uVar37 = uVar37 + 2;
          puVar27 = puVar27 + 2;
        } while (uVar37 < unaff_x19);
        uVar37 = *puVar2;
      }
      *puVar2 = uVar37 - uVar29;
      *plVar17 = *plVar17 + 1;
    } while( true );
  }
LAB_005fd178:
  uVar19 = puVar2[unaff_x19];
  uVar29 = uVar19 + 1;
  uVar23 = puVar1[param_7];
  if (uVar19 == 0xffffffffffffffff) {
    uVar23 = uVar23 + 1;
  }
  if (uVar37 < unaff_x19) {
code_r0x005fd190:
    puVar1 = puStack0000000000000008;
    if (puVar22 != puStack0000000000000008) {
      _memcpy(puStack0000000000000008,puVar22,unaff_x19 * 8);
    }
    if (uStack000000000000001c != 0x40) {
      uVar37 = 0;
      do {
        uVar29 = puVar1[unaff_x19 - 1];
        uVar23 = uVar29 >> (uVar38 & 0x3f) | uVar37;
        uVar37 = uVar29 << ((ulong)uStack000000000000001c & 0x3f);
        puVar1[unaff_x19 - 1] = uVar23;
        unaff_x19 = unaff_x19 - 1;
      } while (unaff_x19 != 0);
    }
    return;
  }
  uVar15 = uVar23 + 1;
  uVar19 = ~uVar19;
  puVar2 = puStack0000000000000060 + unaff_x20 + unaff_x19 + 3;
  puVar27 = puStack0000000000000060 + ((uVar37 + 1) - unaff_x19);
  puVar36 = puStack0000000000000060 + (uVar37 - 1);
  *(ulong *)(unaff_x29 + -0x60) = uVar19;
code_r0x005fd26c:
  puVar24 = puStack0000000000000060 + uVar37;
  uVar16 = *puVar24;
  uVar18 = puVar24[1];
  *(ulong **)(unaff_x29 + -0x70) = puVar24;
  *(ulong **)(unaff_x29 + -0x68) = puVar36;
  uVar35 = uVar18;
  if (uVar29 == 0 && uVar23 == 0) goto code_r0x005fd410;
  uVar30 = puVar24[-2];
  uVar31 = puVar24[-1];
  if (uVar15 < 2) {
    if (uVar15 != 0) {
      uVar19 = uVar31;
      uVar35 = uVar16;
      uVar32 = uVar29;
      goto code_r0x005fd2bc;
    }
  }
  else {
    uVar19 = uVar16;
    uVar32 = uVar15;
code_r0x005fd2bc:
    uVar35 = func_0x00479b20(uVar19,uVar35,uVar32,0);
    uVar19 = *(ulong *)(unaff_x29 + -0x60);
  }
  auVar4._8_8_ = 0;
  auVar4._0_8_ = uVar35;
  auVar8._8_8_ = 0;
  auVar8._0_8_ = uVar29;
  uVar25 = SUB168(auVar4 * auVar8,8);
  uVar32 = uVar31 - uVar35 * uVar29;
  uVar34 = (ulong)(uVar31 < uVar35 * uVar29);
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar35;
  auVar9._8_8_ = 0;
  auVar9._0_8_ = uVar23;
  lVar28 = SUB168(auVar5 * auVar9,8);
  uVar31 = uVar35 * uVar23 + uVar25;
  if (CARRY8(uVar35 * uVar23,uVar25)) {
    lVar28 = lVar28 + 1;
  }
  uVar25 = uVar31 + uVar34;
  if (CARRY8(uVar31,uVar34)) {
    lVar28 = lVar28 + 1;
  }
  uVar31 = uVar16 - uVar25;
  lVar28 = uVar18 - (lVar28 + (ulong)(uVar16 < uVar25));
  for (; ((lVar28 != 0 || (uVar23 < uVar31)) || ((uVar31 == uVar23 && (uVar29 <= uVar32))));
      uVar32 = uVar32 + uVar19) {
    uVar16 = uVar23 + (uVar32 < uVar29);
    bVar14 = uVar31 < uVar16;
    uVar31 = uVar31 - uVar16;
    lVar28 = lVar28 - ((ulong)CARRY8(uVar23,(ulong)(uVar32 < uVar29)) + (ulong)bVar14);
    uVar35 = uVar35 + 1;
  }
  if (uVar15 < 2) {
    if (uVar15 != 0) {
      uVar19 = uVar30;
      uVar16 = uVar32;
      uVar18 = uVar29;
      goto code_r0x005fd374;
    }
    uVar16 = uVar31;
  }
  else {
    uVar19 = uVar32;
    uVar16 = uVar31;
    uVar18 = uVar15;
code_r0x005fd374:
    uVar16 = func_0x00479b20(uVar19,uVar16,uVar18,0);
    uVar19 = *(ulong *)(unaff_x29 + -0x60);
  }
  auVar6._8_8_ = 0;
  auVar6._0_8_ = uVar16;
  auVar10._8_8_ = 0;
  auVar10._0_8_ = uVar29;
  uVar25 = SUB168(auVar6 * auVar10,8);
  uVar34 = uVar30 - uVar16 * uVar29;
  uVar30 = (ulong)(uVar30 < uVar16 * uVar29);
  auVar7._8_8_ = 0;
  auVar7._0_8_ = uVar16;
  auVar11._8_8_ = 0;
  auVar11._0_8_ = uVar23;
  lVar28 = SUB168(auVar7 * auVar11,8);
  uVar18 = uVar16 * uVar23 + uVar25;
  if (CARRY8(uVar16 * uVar23,uVar25)) {
    lVar28 = lVar28 + 1;
  }
  uVar25 = uVar18 + uVar30;
  if (CARRY8(uVar18,uVar30)) {
    lVar28 = lVar28 + 1;
  }
  uVar18 = uVar32 - uVar25;
  lVar28 = uVar31 - (lVar28 + (ulong)(uVar32 < uVar25));
  for (; ((lVar28 != 0 || (uVar23 < uVar18)) || ((uVar18 == uVar23 && (uVar29 <= uVar34))));
      uVar34 = uVar34 + uVar19) {
    uVar30 = uVar23 + (uVar34 < uVar29);
    bVar14 = uVar18 < uVar30;
    uVar18 = uVar18 - uVar30;
    lVar28 = lVar28 - ((ulong)CARRY8(uVar23,(ulong)(uVar34 < uVar29)) + (ulong)bVar14);
    uVar16 = uVar16 + 1;
  }
code_r0x005fd410:
  puVar36 = (ulong *)(param_2 + unaff_x19 * -8 + uVar37 * 8);
  *puVar36 = uVar16;
  puVar36[1] = uVar35;
  func_0x005fc218(puVar1 + unaff_x19,puVar1 + unaff_x19 + unaff_x19 + 2,puVar36,2,puVar1);
  if (unaff_x19 != 0xfffffffffffffffe) {
    uVar35 = 0;
    uVar19 = 0;
    puVar24 = puVar27;
    puVar26 = puVar2;
    do {
      uVar30 = puVar24[-1];
      uVar31 = puVar26[-1];
      uVar16 = uVar30 - uVar31;
      puVar24[-1] = uVar16 - uVar35;
      uVar18 = *puVar24 - *puVar26;
      uVar16 = (-(ulong)(uVar16 < uVar35) - (ulong)(uVar30 < uVar31)) + uVar18;
      uVar35 = (ulong)(uVar18 < uVar16);
      if (*puVar24 < *puVar26) {
        uVar35 = uVar35 + 1;
      }
      *puVar24 = uVar16;
      uVar19 = uVar19 + 2;
      puVar24 = puVar24 + 2;
      puVar26 = puVar26 + 2;
    } while (uVar19 < unaff_x19 + 2);
  }
  lVar28 = *(long *)(unaff_x29 + -0x68);
  uVar19 = *(ulong *)(unaff_x29 + -0x60);
  plVar17 = *(long **)(unaff_x29 + -0x70);
  lVar20 = 0;
  if (*plVar17 == 0) goto code_r0x005fd53c;
  do {
    do {
      lVar20 = 0;
      uVar16 = 0;
      uVar35 = 0;
      do {
        puVar24 = (ulong *)((long)puVar27 + lVar20);
        uVar31 = puVar24[-1];
        uVar34 = *(ulong *)((long)puVar1 + lVar20);
        uVar18 = uVar31 - uVar34;
        puVar24[-1] = uVar18 - uVar16;
        uVar32 = ((ulong *)((long)puVar1 + lVar20))[1];
        uVar30 = *puVar24 - uVar32;
        uVar18 = (-(ulong)(uVar18 < uVar16) - (ulong)(uVar31 < uVar34)) + uVar30;
        uVar16 = (ulong)(uVar30 < uVar18);
        if (*puVar24 < uVar32) {
          uVar16 = uVar16 + 1;
        }
        *puVar24 = uVar18;
        uVar35 = uVar35 + 2;
        lVar20 = lVar20 + 0x10;
      } while (uVar35 < unaff_x19);
      *plVar17 = *plVar17 - uVar16;
      uVar35 = puVar36[1];
      if (*puVar36 == 0xffffffffffffffff) {
        uVar35 = uVar35 + 1;
      }
      *puVar36 = *puVar36 + 1;
      puVar36[1] = uVar35;
      lVar20 = 0;
    } while (*plVar17 != 0);
code_r0x005fd53c:
    while (unaff_x19 + lVar20 != 0) {
      uVar35 = *(ulong *)(lVar28 + lVar20 * 8);
      lVar12 = lVar20 + 1;
      if (puVar13[unaff_x20 + unaff_x19 + lVar12] < uVar35) break;
      lVar20 = lVar20 + -1;
      if (uVar35 < puVar13[unaff_x20 + unaff_x19 + lVar12]) {
        uVar37 = uVar37 - 2;
        puVar27 = puVar27 + -2;
        puVar36 = (ulong *)(lVar28 + -0x10);
        if (uVar37 < unaff_x19) goto code_r0x005fd190;
        goto code_r0x005fd26c;
      }
    }
  } while( true );
}

