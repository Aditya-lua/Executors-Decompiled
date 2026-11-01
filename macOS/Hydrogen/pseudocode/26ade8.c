
void FUN_0026ade8(void)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  int iVar7;
  uint uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  ulong unaff_x22;
  ulong uVar11;
  ulong unaff_x23;
  ulong uVar12;
  long unaff_x24;
  undefined8 *puVar13;
  ulong uVar14;
  ulong unaff_x25;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  undefined8 *unaff_x26;
  ulong unaff_x27;
  ulong *puVar18;
  ulong unaff_x28;
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
  undefined8 *in_stack_00000038;
  undefined8 *in_stack_00000040;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  undefined8 in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  undefined8 *in_stack_00000088;
  undefined1 uStack0000000000000090;
  
code_r0x0026ade8:
  puVar13 = (undefined8 *)((long)unaff_x20 + unaff_x24);
  if (unaff_x28 < unaff_x27) {
    puVar10 = in_stack_00000040;
    do {
      uVar12 = puVar13[-8];
      uVar17 = unaff_x26[-8];
      uVar15 = uVar12;
      if (uVar17 <= uVar12) {
        uVar15 = uVar17;
      }
      iVar7 = _memcmp(puVar13[-9],unaff_x26[-9],uVar15);
      lVar16 = uVar12 - uVar17;
      if (iVar7 != 0) {
        lVar16 = (long)iVar7;
      }
      puVar3 = puVar13 + -10;
      if (lVar16 < 0) {
        puVar3 = unaff_x26 + -10;
      }
      uVar19 = *puVar3;
      puVar10[1] = puVar3[1];
      *puVar10 = uVar19;
      uVar19 = puVar3[6];
      uVar21 = puVar3[9];
      uVar20 = puVar3[8];
      uVar25 = puVar3[3];
      uVar24 = puVar3[2];
      uVar23 = puVar3[5];
      uVar22 = puVar3[4];
      puVar10[7] = puVar3[7];
      puVar10[6] = uVar19;
      puVar10[9] = uVar21;
      puVar10[8] = uVar20;
      puVar10[3] = uVar25;
      puVar10[2] = uVar24;
      puVar10[5] = uVar23;
      puVar10[4] = uVar22;
      uVar8 = (uint)((ulong)lVar16 >> 0x3f);
      unaff_x26 = (undefined8 *)
                  ((long)(unaff_x26 + -10) + (ulong)(uVar8 ^ 1) * (unaff_x19 & 0xffffffff));
      puVar13 = (undefined8 *)((long)(puVar13 + -10) + (ulong)uVar8 * (unaff_x19 & 0xffffffff));
      puVar10 = puVar10 + -10;
    } while (unaff_x26 != unaff_x21 && puVar13 != in_stack_00000088);
    unaff_x21 = unaff_x26;
    unaff_x20 = in_stack_00000088;
  }
  else if (unaff_x25 != 0) {
    do {
      uVar12 = unaff_x26[2];
      uVar17 = unaff_x20[2];
      uVar15 = uVar12;
      if (uVar17 <= uVar12) {
        uVar15 = uVar17;
      }
      iVar7 = _memcmp(unaff_x26[1],unaff_x20[1],uVar15);
      lVar16 = uVar12 - uVar17;
      if (iVar7 != 0) {
        lVar16 = (long)iVar7;
      }
      puVar10 = unaff_x20;
      if (lVar16 < 0) {
        puVar10 = unaff_x26;
      }
      uVar19 = *puVar10;
      unaff_x21[1] = puVar10[1];
      *unaff_x21 = uVar19;
      uVar19 = puVar10[6];
      uVar21 = puVar10[9];
      uVar20 = puVar10[8];
      uVar25 = puVar10[3];
      uVar24 = puVar10[2];
      uVar23 = puVar10[5];
      uVar22 = puVar10[4];
      unaff_x21[7] = puVar10[7];
      unaff_x21[6] = uVar19;
      unaff_x21[9] = uVar21;
      unaff_x21[8] = uVar20;
      unaff_x21[3] = uVar25;
      unaff_x21[2] = uVar24;
      unaff_x21[5] = uVar23;
      unaff_x21[4] = uVar22;
      uVar8 = (uint)((ulong)lVar16 >> 0x3f);
      unaff_x20 = (undefined8 *)((long)unaff_x20 + (ulong)(uVar8 ^ 1) * (unaff_x19 & 0xffffffff));
      unaff_x26 = (undefined8 *)((long)unaff_x26 + (ulong)uVar8 * (unaff_x19 & 0xffffffff));
      unaff_x21 = unaff_x21 + 10;
    } while (unaff_x20 != puVar13 && unaff_x26 != in_stack_00000038);
  }
  _memcpy(unaff_x21,unaff_x20,(long)puVar13 - (long)unaff_x20);
  lVar16 = in_stack_00000070;
code_r0x0026acb4:
  uVar12 = unaff_x23 << 1 | 1;
  uVar15 = in_stack_00000060;
  do {
    if (unaff_x22 < 2) {
      in_stack_00000078 = 1;
      goto code_r0x0026aee4;
    }
    while (unaff_x22 = in_stack_00000078 - 1,
          (uint)*(byte *)(unaff_x29 + -0x9a + unaff_x22) < (uint)lVar16) {
code_r0x0026aee4:
      uVar17 = uVar12;
      do {
        while( true ) {
          uVar12 = in_stack_00000048;
          *(ulong *)(&uStack0000000000000090 + in_stack_00000078 * 8) = uVar17;
          *(char *)(unaff_x29 + -0x9a + in_stack_00000078) = (char)lVar16;
          if (in_stack_00000050 <= uVar15) {
            if ((uVar17 & 1) == 0) {
              func_0x0026a198(in_stack_00000068,in_stack_00000050,in_stack_00000088,
                              in_stack_00000080,(int)LZCOUNT(in_stack_00000050 | 1) << 1 ^ 0x7e,0,
                              in_stack_00000058);
            }
            return;
          }
          in_stack_00000078 = in_stack_00000078 + 1;
          uVar15 = uVar15 + (uVar12 >> 1);
          in_stack_00000048 = in_stack_00000050 - uVar15;
          uVar17 = uVar12;
          if (uVar15 <= in_stack_00000050 && in_stack_00000048 != 0) break;
          lVar16 = 0;
          in_stack_00000048 = 1;
          if (1 < in_stack_00000078) goto code_r0x0026ac6c;
        }
        lVar16 = in_stack_00000068 + uVar15 * unaff_x19;
        if (in_stack_00000048 < in_stack_00000030) {
code_r0x0026aa14:
          if ((in_stack_00000018 & 0x100000000) == 0) {
            if (in_stack_00000030 <= in_stack_00000048) {
              in_stack_00000048 = in_stack_00000030;
            }
            in_stack_00000048 = in_stack_00000048 << 1;
          }
          else {
            if (0x1f < in_stack_00000048) {
              in_stack_00000048 = 0x20;
            }
            func_0x0026a198(lVar16,in_stack_00000048,in_stack_00000088,in_stack_00000080,0,0,
                            in_stack_00000058);
            in_stack_00000048 = in_stack_00000048 << 1 | 1;
          }
        }
        else {
          if (1 < in_stack_00000048) {
            uVar9 = *(ulong *)(lVar16 + 0x58);
            uVar14 = *(ulong *)(lVar16 + 0x60);
            uVar5 = *(ulong *)(lVar16 + 0x10);
            uVar11 = uVar14;
            if (uVar5 <= uVar14) {
              uVar11 = uVar5;
            }
            iVar7 = _memcmp(uVar9,*(undefined8 *)(lVar16 + 8),uVar11);
            lVar1 = uVar14 - uVar5;
            if (iVar7 != 0) {
              lVar1 = (long)iVar7;
            }
            if (lVar1 < 0) {
              if (in_stack_00000048 != 2) {
                puVar18 = (ulong *)(in_stack_00000010 + uVar15 * unaff_x19);
                uVar11 = 2;
                do {
                  uVar4 = puVar18[-1];
                  uVar6 = *puVar18;
                  uVar5 = uVar6;
                  if (uVar14 <= uVar6) {
                    uVar5 = uVar14;
                  }
                  iVar7 = _memcmp(uVar4,uVar9,uVar5);
                  lVar2 = uVar6 - uVar14;
                  if (iVar7 != 0) {
                    lVar2 = (long)iVar7;
                  }
                  if (-1 < lVar2) goto code_r0x0026ac18;
                  puVar18 = puVar18 + 10;
                  uVar11 = uVar11 + 1;
                  uVar9 = uVar4;
                  uVar14 = uVar6;
                } while (in_stack_00000048 != uVar11);
                goto code_r0x0026ac14;
              }
              uVar9 = 1;
              uVar11 = 2;
code_r0x0026aae0:
              puVar10 = (undefined8 *)(in_stack_00000008 + uVar15 * 0x50 + uVar11 * unaff_x19);
              puVar13 = (undefined8 *)(in_stack_00000000 + uVar15 * 0x50);
              do {
                uVar20 = puVar13[-3];
                uVar19 = puVar13[-4];
                uVar21 = puVar10[-6];
                puVar13[-3] = puVar10[-5];
                puVar13[-4] = uVar21;
                puVar10[-5] = uVar20;
                puVar10[-6] = uVar19;
                uVar20 = puVar13[-1];
                uVar19 = puVar13[-2];
                uVar21 = puVar10[-4];
                puVar13[-1] = puVar10[-3];
                puVar13[-2] = uVar21;
                puVar10[-3] = uVar20;
                puVar10[-4] = uVar19;
                uVar20 = puVar13[1];
                uVar19 = *puVar13;
                uVar21 = puVar10[-2];
                puVar13[1] = puVar10[-1];
                *puVar13 = uVar21;
                puVar10[-1] = uVar20;
                puVar10[-2] = uVar19;
                uVar20 = puVar13[3];
                uVar19 = puVar13[2];
                uVar21 = *puVar10;
                puVar13[3] = puVar10[1];
                puVar13[2] = uVar21;
                puVar10[1] = uVar20;
                *puVar10 = uVar19;
                uVar20 = puVar13[5];
                uVar19 = puVar13[4];
                uVar21 = puVar10[2];
                puVar13[5] = puVar10[3];
                puVar13[4] = uVar21;
                puVar10[3] = uVar20;
                puVar10[2] = uVar19;
                puVar10 = puVar10 + -10;
                puVar13 = puVar13 + 10;
                uVar9 = uVar9 - 1;
                in_stack_00000048 = uVar11;
              } while (uVar9 != 0);
            }
            else if (in_stack_00000048 != 2) {
              puVar18 = (ulong *)(in_stack_00000010 + uVar15 * unaff_x19);
              uVar11 = 2;
              do {
                uVar4 = puVar18[-1];
                uVar6 = *puVar18;
                uVar5 = uVar6;
                if (uVar14 <= uVar6) {
                  uVar5 = uVar14;
                }
                iVar7 = _memcmp(uVar4,uVar9,uVar5);
                lVar2 = uVar6 - uVar14;
                if (iVar7 != 0) {
                  lVar2 = (long)iVar7;
                }
                if (lVar2 < 0) goto code_r0x0026ac18;
                puVar18 = puVar18 + 10;
                uVar11 = uVar11 + 1;
                uVar9 = uVar4;
                uVar14 = uVar6;
              } while (in_stack_00000048 != uVar11);
code_r0x0026ac14:
              uVar11 = in_stack_00000048;
code_r0x0026ac18:
              if (uVar11 < in_stack_00000030) goto code_r0x0026aa14;
              in_stack_00000048 = uVar11;
              if (lVar1 < 0) {
                if (1 < uVar11) {
                  uVar9 = uVar11 >> 1;
                  goto code_r0x0026aae0;
                }
                in_stack_00000048 = 1;
              }
            }
          }
          in_stack_00000048 = in_stack_00000048 << 1 | 1;
        }
        lVar16 = LZCOUNT((uVar15 * 2 + (in_stack_00000048 >> 1)) * in_stack_00000020 ^
                         (uVar15 * 2 - (uVar12 >> 1)) * in_stack_00000020);
      } while (in_stack_00000078 < 2);
code_r0x0026ac6c:
      in_stack_00000038 = (undefined8 *)(in_stack_00000068 + uVar15 * 0x50);
      in_stack_00000040 = (undefined8 *)(in_stack_00000028 + uVar15 * 0x50);
      in_stack_00000060 = uVar15;
      in_stack_00000070 = lVar16;
    }
    uVar17 = *(ulong *)(&uStack0000000000000090 + unaff_x22 * 8);
    unaff_x27 = uVar17 >> 1;
    unaff_x28 = uVar12 >> 1;
    unaff_x23 = unaff_x27 + unaff_x28;
    in_stack_00000078 = unaff_x22;
    if (in_stack_00000080 < unaff_x23 || (((uint)uVar17 | (uint)uVar12) & 1) != 0) break;
    uVar12 = unaff_x23 * 2;
  } while( true );
  unaff_x21 = (undefined8 *)(in_stack_00000068 + (uVar15 - unaff_x23) * unaff_x19);
  if ((uVar17 & 1) == 0) {
    func_0x0026a198(unaff_x21,unaff_x27,in_stack_00000088,in_stack_00000080,
                    (int)LZCOUNT(unaff_x27 | 1) << 1 ^ 0x7e,0,in_stack_00000058);
    lVar16 = in_stack_00000070;
  }
  if ((uVar12 & 1) == 0) {
    func_0x0026a198((undefined8 *)((long)unaff_x21 + unaff_x27 * unaff_x19),unaff_x28,
                    in_stack_00000088,in_stack_00000080,(int)LZCOUNT(unaff_x28 | 1) << 1 ^ 0x7e,0,
                    in_stack_00000058);
    lVar16 = in_stack_00000070;
  }
  if ((uVar12 < 2) || (uVar17 < 2)) goto code_r0x0026acb4;
  unaff_x25 = unaff_x28;
  if (unaff_x27 <= unaff_x28) {
    unaff_x25 = unaff_x27;
  }
  if (in_stack_00000080 < unaff_x25) goto code_r0x0026acb4;
  unaff_x26 = (undefined8 *)((long)unaff_x21 + unaff_x27 * unaff_x19);
  puVar13 = unaff_x26;
  if (unaff_x27 <= unaff_x28) {
    puVar13 = unaff_x21;
  }
  unaff_x24 = unaff_x25 * 0x50;
  _memcpy(in_stack_00000088,puVar13,unaff_x24);
  unaff_x20 = in_stack_00000088;
  goto code_r0x0026ade8;
}

