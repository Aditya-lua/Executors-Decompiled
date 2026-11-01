
void FUN_0059415c(void)

{
  ulong uVar1;
  ulong *puVar2;
  undefined1 in_ZR;
  undefined1 in_CY;
  bool bVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong in_x3;
  ulong *puVar6;
  ulong *puVar7;
  ulong in_x9;
  undefined1 uVar8;
  uint uVar9;
  undefined8 *puVar10;
  long lVar11;
  ulong uVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  ulong unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  ulong uVar15;
  ulong unaff_x24;
  ulong unaff_x25;
  ulong uVar16;
  ulong *puVar17;
  ulong uVar18;
  ulong uVar19;
  long unaff_x29;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  ulong *in_stack_00000070;
  ulong in_stack_00000088;
  undefined1 uStack0000000000000090;
  
  do {
    if (!(bool)in_CY || (bool)in_ZR) {
      uVar9 = 0;
      uVar8 = 0;
      uVar12 = 1;
    }
    else {
      puVar4 = (ulong *)(in_stack_00000058 + unaff_x25 * unaff_x19);
      if (in_x9 < in_stack_00000038) {
code_r0x00593cd0:
        if ((in_stack_00000018 & 0x100000000) == 0) {
          if (in_stack_00000038 <= in_x9) {
            in_x9 = in_stack_00000038;
          }
          uVar12 = in_x9 << 1;
        }
        else {
          if (0x1f < in_x9) {
            in_x9 = 0x20;
          }
          func_0x005941b4(puVar4,in_x9,in_stack_00000070,in_stack_00000088,0,0,in_stack_00000060);
          uVar12 = in_x9 << 1 | 1;
          in_x3 = in_stack_00000088;
        }
      }
      else {
        if (1 < in_x9) {
          if (puVar4[9] < *puVar4) {
            if (in_x9 != 2) {
              puVar6 = (ulong *)(in_stack_00000010 + unaff_x25 * unaff_x19);
              uVar12 = 2;
              do {
                if (*puVar6 <= puVar6[9]) goto code_r0x00593e84;
                uVar12 = uVar12 + 1;
                puVar6 = puVar6 + 9;
              } while (in_x9 != uVar12);
              goto code_r0x00593e80;
            }
            uVar15 = 1;
            uVar12 = 2;
code_r0x00593d4c:
            puVar10 = (undefined8 *)(in_stack_00000008 + unaff_x25 * 0x48 + uVar12 * unaff_x19);
            puVar13 = (undefined8 *)(in_stack_00000000 + unaff_x25 * 0x48);
            do {
              uVar14 = puVar13[-4];
              puVar13[-4] = puVar10[-5];
              puVar10[-5] = uVar14;
              uVar14 = puVar13[-3];
              puVar13[-3] = puVar10[-4];
              puVar10[-4] = uVar14;
              uVar14 = puVar13[-2];
              puVar13[-2] = puVar10[-3];
              puVar10[-3] = uVar14;
              uVar14 = puVar13[-1];
              puVar13[-1] = puVar10[-2];
              puVar10[-2] = uVar14;
              uVar14 = *puVar13;
              *puVar13 = puVar10[-1];
              puVar10[-1] = uVar14;
              uVar14 = puVar13[1];
              puVar13[1] = *puVar10;
              *puVar10 = uVar14;
              uVar14 = puVar13[2];
              puVar13[2] = puVar10[1];
              puVar10[1] = uVar14;
              uVar14 = puVar13[3];
              puVar13[3] = puVar10[2];
              puVar10[2] = uVar14;
              uVar14 = puVar13[4];
              puVar13[4] = puVar10[3];
              puVar10[3] = uVar14;
              puVar10 = puVar10 + -9;
              puVar13 = puVar13 + 9;
              uVar15 = uVar15 - 1;
            } while (uVar15 != 0);
code_r0x00593ea8:
            in_x9 = uVar12;
          }
          else if (in_x9 != 2) {
            puVar6 = (ulong *)(in_stack_00000010 + unaff_x25 * unaff_x19);
            uVar12 = 2;
            do {
              if (puVar6[9] < *puVar6) goto code_r0x00593e84;
              uVar12 = uVar12 + 1;
              puVar6 = puVar6 + 9;
            } while (in_x9 != uVar12);
code_r0x00593e80:
            uVar12 = in_x9;
code_r0x00593e84:
            if (uVar12 < in_stack_00000038) goto code_r0x00593cd0;
            if (*puVar4 <= puVar4[9]) goto code_r0x00593ea8;
            if (1 < uVar12) {
              uVar15 = uVar12 >> 1;
              goto code_r0x00593d4c;
            }
            in_x9 = 1;
          }
        }
        uVar12 = in_x9 << 1 | 1;
      }
      lVar11 = LZCOUNT((unaff_x25 * 2 + (uVar12 >> 1)) * in_stack_00000020 ^
                       (unaff_x25 * 2 - (unaff_x24 >> 1)) * in_stack_00000020);
      uVar9 = (uint)lVar11;
      uVar8 = (undefined1)lVar11;
    }
    if (1 < unaff_x21) {
      uVar8 = (undefined1)uVar9;
      do {
        while( true ) {
          uVar15 = unaff_x21 - 1;
          if (*(byte *)(unaff_x29 + -0x9a + uVar15) < uVar9) goto code_r0x0059412c;
          uVar16 = *(ulong *)(&uStack0000000000000090 + uVar15 * 8);
          uVar18 = uVar16 >> 1;
          uVar19 = unaff_x24 >> 1;
          uVar1 = uVar18 + uVar19;
          unaff_x21 = uVar15;
          if (uVar1 <= in_x3 && (((uint)uVar16 | (uint)unaff_x24) & 1) == 0) break;
          puVar4 = (ulong *)(in_stack_00000058 + (unaff_x25 - uVar1) * unaff_x19);
          if ((uVar16 & 1) == 0) {
            func_0x005941b4(puVar4,uVar18,in_stack_00000070,in_stack_00000088,
                            (int)LZCOUNT(uVar18 | 1) << 1 ^ 0x7e,0,in_stack_00000060);
            in_x3 = in_stack_00000088;
          }
          if ((unaff_x24 & 1) == 0) {
            func_0x005941b4((ulong *)((long)puVar4 + uVar18 * unaff_x19),uVar19,in_stack_00000070,
                            in_stack_00000088,(int)LZCOUNT(uVar19 | 1) << 1 ^ 0x7e,0,
                            in_stack_00000060);
            in_x3 = in_stack_00000088;
          }
          if ((1 < unaff_x24) && (1 < uVar16)) {
            uVar16 = uVar19;
            if (uVar18 <= uVar19) {
              uVar16 = uVar18;
            }
            if (uVar16 <= in_x3) {
              puVar17 = (ulong *)((long)puVar4 + uVar18 * unaff_x19);
              puVar6 = puVar17;
              if (uVar18 <= uVar19) {
                puVar6 = puVar4;
              }
              _memcpy(in_stack_00000070,puVar6,uVar16 * 0x48);
              puVar6 = in_stack_00000070 + uVar16 * 9;
              puVar5 = in_stack_00000070;
              if (uVar19 < uVar18) {
                puVar7 = (ulong *)(in_stack_00000028 + unaff_x25 * 0x48);
                do {
                  puVar6 = puVar6 + -9;
                  puVar17 = puVar17 + -9;
                  bVar3 = *puVar17 <= *puVar6;
                  puVar2 = puVar17;
                  if (bVar3) {
                    puVar2 = puVar6;
                  }
                  uVar16 = *puVar2;
                  puVar7[1] = puVar2[1];
                  *puVar7 = uVar16;
                  uVar20 = puVar2[5];
                  uVar19 = puVar2[4];
                  uVar18 = puVar2[7];
                  uVar16 = puVar2[6];
                  uVar22 = puVar2[3];
                  uVar21 = puVar2[2];
                  puVar7[8] = puVar2[8];
                  puVar7[5] = uVar20;
                  puVar7[4] = uVar19;
                  puVar7[7] = uVar18;
                  puVar7[6] = uVar16;
                  puVar7[3] = uVar22;
                  puVar7[2] = uVar21;
                  puVar17 = (ulong *)((long)puVar17 + (ulong)bVar3 * (unaff_x19 & 0xffffffff));
                  puVar6 = (ulong *)((long)puVar6 + (ulong)!bVar3 * (unaff_x19 & 0xffffffff));
                  puVar7 = puVar7 + -9;
                } while (puVar17 != puVar4 && puVar6 != in_stack_00000070);
                puVar4 = puVar17;
              }
              else if (uVar16 != 0) {
                do {
                  bVar3 = *puVar5 <= *puVar17;
                  puVar7 = puVar17;
                  if (bVar3) {
                    puVar7 = puVar5;
                  }
                  uVar16 = *puVar7;
                  puVar4[1] = puVar7[1];
                  *puVar4 = uVar16;
                  uVar20 = puVar7[5];
                  uVar19 = puVar7[4];
                  uVar18 = puVar7[7];
                  uVar16 = puVar7[6];
                  uVar22 = puVar7[3];
                  uVar21 = puVar7[2];
                  puVar4[8] = puVar7[8];
                  puVar4[5] = uVar20;
                  puVar4[4] = uVar19;
                  puVar4[7] = uVar18;
                  puVar4[6] = uVar16;
                  puVar4[3] = uVar22;
                  puVar4[2] = uVar21;
                  puVar5 = (ulong *)((long)puVar5 + (ulong)bVar3 * (unaff_x19 & 0xffffffff));
                  puVar17 = (ulong *)((long)puVar17 + (ulong)!bVar3 * (unaff_x19 & 0xffffffff));
                  puVar4 = puVar4 + 9;
                } while (puVar5 != puVar6 &&
                         puVar17 != (ulong *)(in_stack_00000058 + unaff_x25 * 0x48));
              }
              _memcpy(puVar4,puVar5,(long)puVar6 - (long)puVar5);
              in_x3 = in_stack_00000088;
            }
          }
          unaff_x24 = uVar1 * 2 | 1;
          if (uVar15 < 2) goto code_r0x00594128;
        }
        unaff_x24 = uVar1 * 2;
      } while (1 < uVar15);
code_r0x00594128:
      unaff_x21 = 1;
code_r0x0059412c:
      unaff_x20 = in_stack_00000030;
    }
    *(ulong *)(&uStack0000000000000090 + unaff_x21 * 8) = unaff_x24;
    *(undefined1 *)(unaff_x29 + -0x9a + unaff_x21) = uVar8;
    if (unaff_x20 <= unaff_x25) {
      if ((unaff_x24 & 1) == 0) {
        func_0x005941b4(in_stack_00000058,unaff_x20,in_stack_00000070,in_x3,
                        (int)LZCOUNT(unaff_x20 | 1) << 1 ^ 0x7e,0,in_stack_00000060);
      }
      return;
    }
    unaff_x21 = unaff_x21 + 1;
    unaff_x25 = unaff_x25 + (uVar12 >> 1);
    in_CY = unaff_x25 <= unaff_x20;
    in_x9 = unaff_x20 - unaff_x25;
    in_ZR = in_x9 == 0;
    unaff_x24 = uVar12;
  } while( true );
}

