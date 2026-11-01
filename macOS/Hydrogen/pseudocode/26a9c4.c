
void FUN_0026a9c4(void)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong uVar4;
  int iVar5;
  ulong in_x3;
  uint uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  ulong unaff_x20;
  ulong unaff_x21;
  ulong uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  ulong unaff_x25;
  long lVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined8 *puVar18;
  ulong uVar19;
  undefined8 *puVar20;
  ulong *puVar21;
  ulong uVar22;
  long unaff_x29;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  long lStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  ulong in_stack_00000018;
  ulong uStack0000000000000020;
  long lStack0000000000000028;
  ulong in_stack_00000030;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  ulong in_stack_00000080;
  undefined8 *in_stack_00000088;
  undefined1 uStack0000000000000090;
  
  lStack0000000000000010 = in_stack_00000068 + 0xb0;
  lStack0000000000000008 = in_stack_00000068 + -0x20;
  lStack0000000000000000 = in_stack_00000068 + 0x20;
  lStack0000000000000028 = in_stack_00000068 + -0x50;
  uVar12 = 1;
  uStack0000000000000020 = 0;
  if (unaff_x20 != 0) {
    uStack0000000000000020 = unaff_x21 / unaff_x20;
  }
  uVar10 = 0;
  uVar9 = unaff_x20 - unaff_x25;
  if (unaff_x20 < unaff_x25 || uVar9 == 0) goto LAB_0026aa54;
code_r0x0026aa00:
  lVar15 = in_stack_00000068 + unaff_x25 * 0x50;
  if (uVar9 < in_stack_00000030) {
code_r0x0026aa14:
    if ((in_stack_00000018 & 0x100000000) == 0) {
      if (in_stack_00000030 <= uVar9) {
        uVar9 = in_stack_00000030;
      }
      uVar9 = uVar9 << 1;
    }
    else {
      if (0x1f < uVar9) {
        uVar9 = 0x20;
      }
      func_0x0026a198(lVar15,uVar9,in_stack_00000088,in_stack_00000080,0,0,in_stack_00000058);
      uVar9 = uVar9 << 1 | 1;
      in_x3 = in_stack_00000080;
    }
    goto LAB_0026ac44;
  }
  if (1 < uVar9) {
    uVar7 = *(ulong *)(lVar15 + 0x58);
    uVar16 = *(ulong *)(lVar15 + 0x60);
    uVar19 = *(ulong *)(lVar15 + 0x10);
    uVar14 = uVar16;
    if (uVar19 <= uVar16) {
      uVar14 = uVar19;
    }
    iVar5 = _memcmp(uVar7,*(undefined8 *)(lVar15 + 8),uVar14);
    lVar3 = uVar16 - uVar19;
    if (iVar5 != 0) {
      lVar3 = (long)iVar5;
    }
    if (lVar3 < 0) {
      if (uVar9 != 2) {
        puVar21 = (ulong *)(lStack0000000000000010 + unaff_x25 * 0x50);
        uVar14 = 2;
        do {
          uVar22 = puVar21[-1];
          uVar4 = *puVar21;
          uVar19 = uVar4;
          if (uVar16 <= uVar4) {
            uVar19 = uVar16;
          }
          iVar5 = _memcmp(uVar22,uVar7,uVar19);
          lVar1 = uVar4 - uVar16;
          if (iVar5 != 0) {
            lVar1 = (long)iVar5;
          }
          if (-1 < lVar1) goto code_r0x0026ac18;
          puVar21 = puVar21 + 10;
          uVar14 = uVar14 + 1;
          uVar7 = uVar22;
          uVar16 = uVar4;
        } while (uVar9 != uVar14);
        goto code_r0x0026ac14;
      }
      uVar7 = 1;
      uVar14 = 2;
code_r0x0026aae0:
      puVar11 = (undefined8 *)(lStack0000000000000008 + unaff_x25 * 0x50 + uVar14 * 0x50);
      puVar8 = (undefined8 *)(lStack0000000000000000 + unaff_x25 * 0x50);
      do {
        uVar24 = puVar8[-3];
        uVar23 = puVar8[-4];
        uVar25 = puVar11[-6];
        puVar8[-3] = puVar11[-5];
        puVar8[-4] = uVar25;
        puVar11[-5] = uVar24;
        puVar11[-6] = uVar23;
        uVar24 = puVar8[-1];
        uVar23 = puVar8[-2];
        uVar25 = puVar11[-4];
        puVar8[-1] = puVar11[-3];
        puVar8[-2] = uVar25;
        puVar11[-3] = uVar24;
        puVar11[-4] = uVar23;
        uVar24 = puVar8[1];
        uVar23 = *puVar8;
        uVar25 = puVar11[-2];
        puVar8[1] = puVar11[-1];
        *puVar8 = uVar25;
        puVar11[-1] = uVar24;
        puVar11[-2] = uVar23;
        uVar24 = puVar8[3];
        uVar23 = puVar8[2];
        uVar25 = *puVar11;
        puVar8[3] = puVar11[1];
        puVar8[2] = uVar25;
        puVar11[1] = uVar24;
        *puVar11 = uVar23;
        uVar24 = puVar8[5];
        uVar23 = puVar8[4];
        uVar25 = puVar11[2];
        puVar8[5] = puVar11[3];
        puVar8[4] = uVar25;
        puVar11[3] = uVar24;
        puVar11[2] = uVar23;
        puVar11 = puVar11 + -10;
        puVar8 = puVar8 + 10;
        uVar7 = uVar7 - 1;
        uVar9 = uVar14;
      } while (uVar7 != 0);
code_r0x0026ac38:
      in_x3 = in_stack_00000080;
    }
    else if (uVar9 == 2) {
      in_x3 = in_stack_00000080;
    }
    else {
      puVar21 = (ulong *)(lStack0000000000000010 + unaff_x25 * 0x50);
      uVar14 = 2;
      do {
        uVar22 = puVar21[-1];
        uVar4 = *puVar21;
        uVar19 = uVar4;
        if (uVar16 <= uVar4) {
          uVar19 = uVar16;
        }
        iVar5 = _memcmp(uVar22,uVar7,uVar19);
        lVar1 = uVar4 - uVar16;
        if (iVar5 != 0) {
          lVar1 = (long)iVar5;
        }
        if (lVar1 < 0) goto code_r0x0026ac18;
        puVar21 = puVar21 + 10;
        uVar14 = uVar14 + 1;
        uVar7 = uVar22;
        uVar16 = uVar4;
      } while (uVar9 != uVar14);
code_r0x0026ac14:
      uVar14 = uVar9;
code_r0x0026ac18:
      in_x3 = in_stack_00000080;
      if (uVar14 < in_stack_00000030) goto code_r0x0026aa14;
      uVar9 = uVar14;
      if (-1 < lVar3) goto code_r0x0026ac38;
      if (1 < uVar14) {
        uVar7 = uVar14 >> 1;
        goto code_r0x0026aae0;
      }
      uVar9 = 1;
    }
  }
  uVar9 = uVar9 << 1 | 1;
LAB_0026ac44:
  lVar15 = LZCOUNT((unaff_x25 * 2 + (uVar9 >> 1)) * uStack0000000000000020 ^
                   (unaff_x25 * 2 - (uVar12 >> 1)) * uStack0000000000000020);
  uVar14 = uVar12;
  do {
    uVar12 = uVar9;
    if (1 < uVar10) {
      puVar8 = (undefined8 *)(lStack0000000000000028 + unaff_x25 * 0x50);
      do {
        while( true ) {
          uVar9 = uVar10 - 1;
          if ((uint)*(byte *)(unaff_x29 + -0x9a + uVar9) < (uint)lVar15) goto LAB_0026aee8;
          uVar16 = *(ulong *)(&uStack0000000000000090 + uVar9 * 8);
          uVar19 = uVar16 >> 1;
          uVar22 = uVar14 >> 1;
          uVar7 = uVar19 + uVar22;
          uVar10 = uVar9;
          if (uVar7 <= in_x3 && (((uint)uVar16 | (uint)uVar14) & 1) == 0) break;
          puVar11 = (undefined8 *)(in_stack_00000068 + (unaff_x25 - uVar7) * 0x50);
          if ((uVar16 & 1) == 0) {
            func_0x0026a198(puVar11,uVar19,in_stack_00000088,in_stack_00000080,
                            (int)LZCOUNT(uVar19 | 1) << 1 ^ 0x7e,0,in_stack_00000058);
            in_x3 = in_stack_00000080;
          }
          if ((uVar14 & 1) == 0) {
            func_0x0026a198(puVar11 + uVar19 * 10,uVar22,in_stack_00000088,in_stack_00000080,
                            (int)LZCOUNT(uVar22 | 1) << 1 ^ 0x7e,0,in_stack_00000058);
            in_x3 = in_stack_00000080;
          }
          if ((1 < uVar14) && (1 < uVar16)) {
            uVar14 = uVar22;
            if (uVar19 <= uVar22) {
              uVar14 = uVar19;
            }
            if (uVar14 <= in_x3) {
              puVar17 = puVar11 + uVar19 * 10;
              puVar13 = puVar17;
              if (uVar19 <= uVar22) {
                puVar13 = puVar11;
              }
              _memcpy(in_stack_00000088,puVar13,uVar14 * 0x50);
              puVar13 = in_stack_00000088 + uVar14 * 10;
              puVar18 = in_stack_00000088;
              if (uVar22 < uVar19) {
                puVar20 = puVar8;
                do {
                  uVar16 = puVar13[-8];
                  uVar19 = puVar17[-8];
                  uVar14 = uVar16;
                  if (uVar19 <= uVar16) {
                    uVar14 = uVar19;
                  }
                  iVar5 = _memcmp(puVar13[-9],puVar17[-9],uVar14);
                  lVar3 = uVar16 - uVar19;
                  if (iVar5 != 0) {
                    lVar3 = (long)iVar5;
                  }
                  puVar2 = puVar13 + -10;
                  if (lVar3 < 0) {
                    puVar2 = puVar17 + -10;
                  }
                  uVar23 = *puVar2;
                  puVar20[1] = puVar2[1];
                  *puVar20 = uVar23;
                  uVar23 = puVar2[6];
                  uVar25 = puVar2[9];
                  uVar24 = puVar2[8];
                  uVar29 = puVar2[3];
                  uVar28 = puVar2[2];
                  uVar27 = puVar2[5];
                  uVar26 = puVar2[4];
                  puVar20[7] = puVar2[7];
                  puVar20[6] = uVar23;
                  puVar20[9] = uVar25;
                  puVar20[8] = uVar24;
                  puVar20[3] = uVar29;
                  puVar20[2] = uVar28;
                  puVar20[5] = uVar27;
                  puVar20[4] = uVar26;
                  uVar6 = (uint)((ulong)lVar3 >> 0x3f);
                  puVar17 = puVar17 + -10 + (ulong)(uVar6 ^ 1) * 10;
                  puVar13 = puVar13 + -10 + (ulong)uVar6 * 10;
                  puVar20 = puVar20 + -10;
                } while (puVar17 != puVar11 && puVar13 != in_stack_00000088);
                puVar11 = puVar17;
              }
              else if (uVar14 != 0) {
                do {
                  uVar16 = puVar17[2];
                  uVar19 = puVar18[2];
                  uVar14 = uVar16;
                  if (uVar19 <= uVar16) {
                    uVar14 = uVar19;
                  }
                  iVar5 = _memcmp(puVar17[1],puVar18[1],uVar14);
                  lVar3 = uVar16 - uVar19;
                  if (iVar5 != 0) {
                    lVar3 = (long)iVar5;
                  }
                  puVar20 = puVar18;
                  if (lVar3 < 0) {
                    puVar20 = puVar17;
                  }
                  uVar23 = *puVar20;
                  puVar11[1] = puVar20[1];
                  *puVar11 = uVar23;
                  uVar23 = puVar20[6];
                  uVar25 = puVar20[9];
                  uVar24 = puVar20[8];
                  uVar29 = puVar20[3];
                  uVar28 = puVar20[2];
                  uVar27 = puVar20[5];
                  uVar26 = puVar20[4];
                  puVar11[7] = puVar20[7];
                  puVar11[6] = uVar23;
                  puVar11[9] = uVar25;
                  puVar11[8] = uVar24;
                  puVar11[3] = uVar29;
                  puVar11[2] = uVar28;
                  puVar11[5] = uVar27;
                  puVar11[4] = uVar26;
                  uVar6 = (uint)((ulong)lVar3 >> 0x3f);
                  puVar18 = puVar18 + (ulong)(uVar6 ^ 1) * 10;
                  puVar17 = puVar17 + (ulong)uVar6 * 10;
                  puVar11 = puVar11 + 10;
                } while (puVar18 != puVar13 &&
                         puVar17 != (undefined8 *)(in_stack_00000068 + unaff_x25 * 0x50));
              }
              _memcpy(puVar11,puVar18,(long)puVar13 - (long)puVar18);
              in_x3 = in_stack_00000080;
            }
          }
          uVar14 = uVar7 * 2 | 1;
          if (uVar9 < 2) goto code_r0x0026aee0;
        }
        uVar14 = uVar7 * 2;
      } while (1 < uVar9);
code_r0x0026aee0:
      uVar10 = 1;
    }
LAB_0026aee8:
    *(ulong *)(&uStack0000000000000090 + uVar10 * 8) = uVar14;
    *(char *)(unaff_x29 + -0x9a + uVar10) = (char)lVar15;
    if (unaff_x20 <= unaff_x25) {
      if ((uVar14 & 1) == 0) {
        func_0x0026a198(in_stack_00000068,unaff_x20,in_stack_00000088,in_x3,
                        (int)LZCOUNT(unaff_x20 | 1) << 1 ^ 0x7e,0,in_stack_00000058);
      }
      return;
    }
    uVar10 = uVar10 + 1;
    unaff_x25 = unaff_x25 + (uVar12 >> 1);
    uVar9 = unaff_x20 - unaff_x25;
    if (unaff_x25 <= unaff_x20 && uVar9 != 0) goto code_r0x0026aa00;
LAB_0026aa54:
    lVar15 = 0;
    uVar9 = 1;
    uVar14 = uVar12;
  } while( true );
}

