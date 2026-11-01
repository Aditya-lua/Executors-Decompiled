
void FUN_0026aaa8(void)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  int iVar4;
  uint uVar5;
  long lVar6;
  ulong uVar7;
  ulong unaff_x19;
  ulong unaff_x20;
  undefined8 *puVar8;
  ulong unaff_x22;
  ulong unaff_x24;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined8 *puVar15;
  undefined8 *puVar16;
  ulong *puVar17;
  ulong uVar18;
  long unaff_x29;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  ulong in_stack_00000050;
  undefined8 in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  undefined8 *in_stack_00000088;
  undefined1 uStack0000000000000090;
  
LAB_0026ac3c:
  uVar7 = unaff_x22 << 1 | 1;
code_r0x0026ac44:
  lVar6 = LZCOUNT((in_stack_00000060 * 2 + (uVar7 >> 1)) * in_stack_00000020 ^
                  (in_stack_00000060 * 2 - (unaff_x24 >> 1)) * in_stack_00000020);
  uVar9 = unaff_x24;
  do {
    unaff_x24 = uVar7;
    if (1 < in_stack_00000078) {
      do {
        while( true ) {
          uVar7 = in_stack_00000078 - 1;
          if ((uint)*(byte *)(unaff_x29 + -0x9a + uVar7) < (uint)lVar6) goto LAB_0026aee8;
          uVar12 = *(ulong *)(&uStack0000000000000090 + uVar7 * 8);
          uVar14 = uVar12 >> 1;
          uVar18 = uVar9 >> 1;
          uVar11 = uVar14 + uVar18;
          in_stack_00000078 = uVar7;
          if (uVar11 <= in_stack_00000080 && (((uint)uVar12 | (uint)uVar9) & 1) == 0) break;
          puVar8 = (undefined8 *)(in_stack_00000068 + (in_stack_00000060 - uVar11) * unaff_x19);
          if ((uVar12 & 1) == 0) {
            func_0x0026a198(puVar8,uVar14,in_stack_00000088,in_stack_00000080,
                            (int)LZCOUNT(uVar14 | 1) << 1 ^ 0x7e,0,in_stack_00000058);
          }
          if ((uVar9 & 1) == 0) {
            func_0x0026a198((undefined8 *)((long)puVar8 + uVar14 * unaff_x19),uVar18,
                            in_stack_00000088,in_stack_00000080,(int)LZCOUNT(uVar18 | 1) << 1 ^ 0x7e
                            ,0,in_stack_00000058);
          }
          if ((1 < uVar9) && (1 < uVar12)) {
            uVar9 = uVar18;
            if (uVar14 <= uVar18) {
              uVar9 = uVar14;
            }
            if (uVar9 <= in_stack_00000080) {
              puVar13 = (undefined8 *)((long)puVar8 + uVar14 * unaff_x19);
              puVar10 = puVar13;
              if (uVar14 <= uVar18) {
                puVar10 = puVar8;
              }
              _memcpy(in_stack_00000088,puVar10,uVar9 * 0x50);
              puVar10 = in_stack_00000088 + uVar9 * 10;
              puVar16 = in_stack_00000088;
              if (uVar18 < uVar14) {
                puVar15 = (undefined8 *)(in_stack_00000028 + in_stack_00000060 * 0x50);
                do {
                  uVar12 = puVar10[-8];
                  uVar14 = puVar13[-8];
                  uVar9 = uVar12;
                  if (uVar14 <= uVar12) {
                    uVar9 = uVar14;
                  }
                  iVar4 = _memcmp(puVar10[-9],puVar13[-9],uVar9);
                  lVar3 = uVar12 - uVar14;
                  if (iVar4 != 0) {
                    lVar3 = (long)iVar4;
                  }
                  puVar2 = puVar10 + -10;
                  if (lVar3 < 0) {
                    puVar2 = puVar13 + -10;
                  }
                  uVar19 = *puVar2;
                  puVar15[1] = puVar2[1];
                  *puVar15 = uVar19;
                  uVar19 = puVar2[6];
                  uVar21 = puVar2[9];
                  uVar20 = puVar2[8];
                  uVar25 = puVar2[3];
                  uVar24 = puVar2[2];
                  uVar23 = puVar2[5];
                  uVar22 = puVar2[4];
                  puVar15[7] = puVar2[7];
                  puVar15[6] = uVar19;
                  puVar15[9] = uVar21;
                  puVar15[8] = uVar20;
                  puVar15[3] = uVar25;
                  puVar15[2] = uVar24;
                  puVar15[5] = uVar23;
                  puVar15[4] = uVar22;
                  uVar5 = (uint)((ulong)lVar3 >> 0x3f);
                  puVar13 = (undefined8 *)
                            ((long)(puVar13 + -10) + (ulong)(uVar5 ^ 1) * (unaff_x19 & 0xffffffff));
                  puVar10 = (undefined8 *)
                            ((long)(puVar10 + -10) + (ulong)uVar5 * (unaff_x19 & 0xffffffff));
                  puVar15 = puVar15 + -10;
                } while (puVar13 != puVar8 && puVar10 != in_stack_00000088);
                puVar8 = puVar13;
              }
              else if (uVar9 != 0) {
                do {
                  uVar12 = puVar13[2];
                  uVar14 = puVar16[2];
                  uVar9 = uVar12;
                  if (uVar14 <= uVar12) {
                    uVar9 = uVar14;
                  }
                  iVar4 = _memcmp(puVar13[1],puVar16[1],uVar9);
                  lVar3 = uVar12 - uVar14;
                  if (iVar4 != 0) {
                    lVar3 = (long)iVar4;
                  }
                  puVar15 = puVar16;
                  if (lVar3 < 0) {
                    puVar15 = puVar13;
                  }
                  uVar19 = *puVar15;
                  puVar8[1] = puVar15[1];
                  *puVar8 = uVar19;
                  uVar19 = puVar15[6];
                  uVar21 = puVar15[9];
                  uVar20 = puVar15[8];
                  uVar25 = puVar15[3];
                  uVar24 = puVar15[2];
                  uVar23 = puVar15[5];
                  uVar22 = puVar15[4];
                  puVar8[7] = puVar15[7];
                  puVar8[6] = uVar19;
                  puVar8[9] = uVar21;
                  puVar8[8] = uVar20;
                  puVar8[3] = uVar25;
                  puVar8[2] = uVar24;
                  puVar8[5] = uVar23;
                  puVar8[4] = uVar22;
                  uVar5 = (uint)((ulong)lVar3 >> 0x3f);
                  puVar16 = (undefined8 *)
                            ((long)puVar16 + (ulong)(uVar5 ^ 1) * (unaff_x19 & 0xffffffff));
                  puVar13 = (undefined8 *)((long)puVar13 + (ulong)uVar5 * (unaff_x19 & 0xffffffff));
                  puVar8 = puVar8 + 10;
                } while (puVar16 != puVar10 &&
                         puVar13 != (undefined8 *)(in_stack_00000068 + in_stack_00000060 * 0x50));
              }
              _memcpy(puVar8,puVar16,(long)puVar10 - (long)puVar16);
              unaff_x20 = in_stack_00000050;
            }
          }
          uVar9 = uVar11 * 2 | 1;
          if (uVar7 < 2) goto LAB_0026aee0;
        }
        uVar9 = uVar11 * 2;
      } while (1 < uVar7);
LAB_0026aee0:
      in_stack_00000078 = 1;
    }
LAB_0026aee8:
    *(ulong *)(&uStack0000000000000090 + in_stack_00000078 * 8) = uVar9;
    *(char *)(unaff_x29 + -0x9a + in_stack_00000078) = (char)lVar6;
    if (unaff_x20 <= in_stack_00000060) {
      if ((uVar9 & 1) == 0) {
        func_0x0026a198(in_stack_00000068,unaff_x20,in_stack_00000088,in_stack_00000080,
                        (int)LZCOUNT(unaff_x20 | 1) << 1 ^ 0x7e,0,in_stack_00000058);
      }
      return;
    }
    in_stack_00000078 = in_stack_00000078 + 1;
    in_stack_00000060 = in_stack_00000060 + (unaff_x24 >> 1);
    unaff_x22 = unaff_x20 - in_stack_00000060;
    if (in_stack_00000060 <= unaff_x20 && unaff_x22 != 0) break;
    lVar6 = 0;
    uVar7 = 1;
    uVar9 = unaff_x24;
  } while( true );
  lVar6 = in_stack_00000068 + in_stack_00000060 * unaff_x19;
  if (in_stack_00000030 <= unaff_x22) {
    if (unaff_x22 < 2) goto LAB_0026ac3c;
    uVar9 = *(ulong *)(lVar6 + 0x58);
    uVar11 = *(ulong *)(lVar6 + 0x60);
    uVar12 = *(ulong *)(lVar6 + 0x10);
    uVar7 = uVar11;
    if (uVar12 <= uVar11) {
      uVar7 = uVar12;
    }
    iVar4 = _memcmp(uVar9,*(undefined8 *)(lVar6 + 8),uVar7);
    lVar3 = uVar11 - uVar12;
    if (iVar4 != 0) {
      lVar3 = (long)iVar4;
    }
    if (lVar3 < 0) {
      if (unaff_x22 == 2) {
        uVar9 = 1;
        uVar7 = 2;
        goto code_r0x0026aae0;
      }
      puVar17 = (ulong *)(in_stack_00000010 + in_stack_00000060 * unaff_x19);
      uVar7 = 2;
      do {
        uVar14 = puVar17[-1];
        uVar18 = *puVar17;
        uVar12 = uVar18;
        if (uVar11 <= uVar18) {
          uVar12 = uVar11;
        }
        iVar4 = _memcmp(uVar14,uVar9,uVar12);
        lVar1 = uVar18 - uVar11;
        if (iVar4 != 0) {
          lVar1 = (long)iVar4;
        }
        if (-1 < lVar1) goto code_r0x0026ac18;
        puVar17 = puVar17 + 10;
        uVar7 = uVar7 + 1;
        uVar9 = uVar14;
        uVar11 = uVar18;
      } while (unaff_x22 != uVar7);
    }
    else {
      if (unaff_x22 == 2) goto LAB_0026ac3c;
      puVar17 = (ulong *)(in_stack_00000010 + in_stack_00000060 * unaff_x19);
      uVar7 = 2;
      do {
        uVar14 = puVar17[-1];
        uVar18 = *puVar17;
        uVar12 = uVar18;
        if (uVar11 <= uVar18) {
          uVar12 = uVar11;
        }
        iVar4 = _memcmp(uVar14,uVar9,uVar12);
        lVar1 = uVar18 - uVar11;
        if (iVar4 != 0) {
          lVar1 = (long)iVar4;
        }
        if (lVar1 < 0) goto code_r0x0026ac18;
        puVar17 = puVar17 + 10;
        uVar7 = uVar7 + 1;
        uVar9 = uVar14;
        uVar11 = uVar18;
      } while (unaff_x22 != uVar7);
    }
    uVar7 = unaff_x22;
code_r0x0026ac18:
    if (in_stack_00000030 <= uVar7) goto code_r0x0026ac30;
  }
  if ((in_stack_00000018 & 0x100000000) == 0) {
    if (in_stack_00000030 <= unaff_x22) {
      unaff_x22 = in_stack_00000030;
    }
    uVar7 = unaff_x22 << 1;
  }
  else {
    if (0x1f < unaff_x22) {
      unaff_x22 = 0x20;
    }
    func_0x0026a198(lVar6,unaff_x22,in_stack_00000088,in_stack_00000080,0,0,in_stack_00000058);
    uVar7 = unaff_x22 << 1 | 1;
  }
  goto code_r0x0026ac44;
code_r0x0026ac30:
  unaff_x22 = uVar7;
  if (lVar3 < 0) {
    if (uVar7 < 2) {
      unaff_x22 = 1;
    }
    else {
      uVar9 = uVar7 >> 1;
code_r0x0026aae0:
      puVar10 = (undefined8 *)(in_stack_00000008 + in_stack_00000060 * 0x50 + uVar7 * unaff_x19);
      puVar8 = (undefined8 *)(in_stack_00000000 + in_stack_00000060 * 0x50);
      do {
        uVar20 = puVar8[-3];
        uVar19 = puVar8[-4];
        uVar21 = puVar10[-6];
        puVar8[-3] = puVar10[-5];
        puVar8[-4] = uVar21;
        puVar10[-5] = uVar20;
        puVar10[-6] = uVar19;
        uVar20 = puVar8[-1];
        uVar19 = puVar8[-2];
        uVar21 = puVar10[-4];
        puVar8[-1] = puVar10[-3];
        puVar8[-2] = uVar21;
        puVar10[-3] = uVar20;
        puVar10[-4] = uVar19;
        uVar20 = puVar8[1];
        uVar19 = *puVar8;
        uVar21 = puVar10[-2];
        puVar8[1] = puVar10[-1];
        *puVar8 = uVar21;
        puVar10[-1] = uVar20;
        puVar10[-2] = uVar19;
        uVar20 = puVar8[3];
        uVar19 = puVar8[2];
        uVar21 = *puVar10;
        puVar8[3] = puVar10[1];
        puVar8[2] = uVar21;
        puVar10[1] = uVar20;
        *puVar10 = uVar19;
        uVar20 = puVar8[5];
        uVar19 = puVar8[4];
        uVar21 = puVar10[2];
        puVar8[5] = puVar10[3];
        puVar8[4] = uVar21;
        puVar10[3] = uVar20;
        puVar10[2] = uVar19;
        puVar10 = puVar10 + -10;
        puVar8 = puVar8 + 10;
        uVar9 = uVar9 - 1;
        unaff_x22 = uVar7;
      } while (uVar9 != 0);
    }
  }
  goto LAB_0026ac3c;
}

