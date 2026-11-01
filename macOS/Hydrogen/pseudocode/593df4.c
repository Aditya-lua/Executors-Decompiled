
void FUN_00593df4(ulong param_1)

{
  ulong uVar1;
  ulong *puVar2;
  bool bVar3;
  ulong *puVar4;
  ulong in_x3;
  ulong in_x9;
  ulong *puVar5;
  undefined8 *in_x10;
  long lVar6;
  undefined8 *in_x11;
  ulong uVar7;
  undefined8 uVar8;
  ulong *puVar9;
  ulong unaff_x19;
  ulong unaff_x20;
  ulong unaff_x21;
  ulong *puVar10;
  ulong unaff_x24;
  ulong uVar11;
  ulong unaff_x25;
  ulong uVar12;
  ulong *puVar13;
  ulong uVar14;
  ulong uVar15;
  long unaff_x29;
  ulong uVar16;
  ulong uVar17;
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
  
  while( true ) {
    in_x10 = in_x10 + -9;
    in_x11 = in_x11 + 9;
    in_x9 = in_x9 - 1;
    if (in_x9 == 0) break;
LAB_00593d64:
    uVar8 = in_x11[-4];
    in_x11[-4] = in_x10[-5];
    in_x10[-5] = uVar8;
    uVar8 = in_x11[-3];
    in_x11[-3] = in_x10[-4];
    in_x10[-4] = uVar8;
    uVar8 = in_x11[-2];
    in_x11[-2] = in_x10[-3];
    in_x10[-3] = uVar8;
    uVar8 = in_x11[-1];
    in_x11[-1] = in_x10[-2];
    in_x10[-2] = uVar8;
    uVar8 = *in_x11;
    *in_x11 = in_x10[-1];
    in_x10[-1] = uVar8;
    uVar8 = in_x11[1];
    in_x11[1] = *in_x10;
    *in_x10 = uVar8;
    uVar8 = in_x11[2];
    in_x11[2] = in_x10[1];
    in_x10[1] = uVar8;
    uVar8 = in_x11[3];
    in_x11[3] = in_x10[2];
    in_x10[2] = uVar8;
    uVar8 = in_x11[4];
    in_x11[4] = in_x10[3];
    in_x10[3] = uVar8;
  }
LAB_00593ea8:
  uVar7 = param_1;
code_r0x00593eac:
  uVar7 = uVar7 << 1 | 1;
code_r0x00593eb4:
  lVar6 = LZCOUNT((unaff_x25 * 2 + (uVar7 >> 1)) * in_stack_00000020 ^
                  (unaff_x25 * 2 - (unaff_x24 >> 1)) * in_stack_00000020);
  uVar11 = unaff_x24;
  do {
    unaff_x24 = uVar7;
    if (1 < unaff_x21) {
      do {
        while( true ) {
          uVar7 = unaff_x21 - 1;
          if ((uint)*(byte *)(unaff_x29 + -0x9a + uVar7) < (uint)lVar6) goto LAB_0059412c;
          uVar12 = *(ulong *)(&uStack0000000000000090 + uVar7 * 8);
          uVar14 = uVar12 >> 1;
          uVar15 = uVar11 >> 1;
          uVar1 = uVar14 + uVar15;
          unaff_x21 = uVar7;
          if (uVar1 <= in_x3 && (((uint)uVar12 | (uint)uVar11) & 1) == 0) break;
          puVar10 = (ulong *)(in_stack_00000058 + (unaff_x25 - uVar1) * unaff_x19);
          if ((uVar12 & 1) == 0) {
            func_0x005941b4(puVar10,uVar14,in_stack_00000070,in_stack_00000088,
                            (int)LZCOUNT(uVar14 | 1) << 1 ^ 0x7e,0,in_stack_00000060);
            in_x3 = in_stack_00000088;
          }
          if ((uVar11 & 1) == 0) {
            func_0x005941b4((ulong *)((long)puVar10 + uVar14 * unaff_x19),uVar15,in_stack_00000070,
                            in_stack_00000088,(int)LZCOUNT(uVar15 | 1) << 1 ^ 0x7e,0,
                            in_stack_00000060);
            in_x3 = in_stack_00000088;
          }
          if ((1 < uVar11) && (1 < uVar12)) {
            uVar11 = uVar15;
            if (uVar14 <= uVar15) {
              uVar11 = uVar14;
            }
            if (uVar11 <= in_x3) {
              puVar13 = (ulong *)((long)puVar10 + uVar14 * unaff_x19);
              puVar9 = puVar13;
              if (uVar14 <= uVar15) {
                puVar9 = puVar10;
              }
              _memcpy(in_stack_00000070,puVar9,uVar11 * 0x48);
              puVar9 = in_stack_00000070 + uVar11 * 9;
              puVar4 = in_stack_00000070;
              if (uVar15 < uVar14) {
                puVar5 = (ulong *)(in_stack_00000028 + unaff_x25 * 0x48);
                do {
                  puVar9 = puVar9 + -9;
                  puVar13 = puVar13 + -9;
                  bVar3 = *puVar13 <= *puVar9;
                  puVar2 = puVar13;
                  if (bVar3) {
                    puVar2 = puVar9;
                  }
                  uVar11 = *puVar2;
                  puVar5[1] = puVar2[1];
                  *puVar5 = uVar11;
                  uVar15 = puVar2[5];
                  uVar14 = puVar2[4];
                  uVar12 = puVar2[7];
                  uVar11 = puVar2[6];
                  uVar17 = puVar2[3];
                  uVar16 = puVar2[2];
                  puVar5[8] = puVar2[8];
                  puVar5[5] = uVar15;
                  puVar5[4] = uVar14;
                  puVar5[7] = uVar12;
                  puVar5[6] = uVar11;
                  puVar5[3] = uVar17;
                  puVar5[2] = uVar16;
                  puVar13 = (ulong *)((long)puVar13 + (ulong)bVar3 * (unaff_x19 & 0xffffffff));
                  puVar9 = (ulong *)((long)puVar9 + (ulong)!bVar3 * (unaff_x19 & 0xffffffff));
                  puVar5 = puVar5 + -9;
                } while (puVar13 != puVar10 && puVar9 != in_stack_00000070);
                puVar10 = puVar13;
              }
              else if (uVar11 != 0) {
                do {
                  bVar3 = *puVar4 <= *puVar13;
                  puVar5 = puVar13;
                  if (bVar3) {
                    puVar5 = puVar4;
                  }
                  uVar11 = *puVar5;
                  puVar10[1] = puVar5[1];
                  *puVar10 = uVar11;
                  uVar15 = puVar5[5];
                  uVar14 = puVar5[4];
                  uVar12 = puVar5[7];
                  uVar11 = puVar5[6];
                  uVar17 = puVar5[3];
                  uVar16 = puVar5[2];
                  puVar10[8] = puVar5[8];
                  puVar10[5] = uVar15;
                  puVar10[4] = uVar14;
                  puVar10[7] = uVar12;
                  puVar10[6] = uVar11;
                  puVar10[3] = uVar17;
                  puVar10[2] = uVar16;
                  puVar4 = (ulong *)((long)puVar4 + (ulong)bVar3 * (unaff_x19 & 0xffffffff));
                  puVar13 = (ulong *)((long)puVar13 + (ulong)!bVar3 * (unaff_x19 & 0xffffffff));
                  puVar10 = puVar10 + 9;
                } while (puVar4 != puVar9 &&
                         puVar13 != (ulong *)(in_stack_00000058 + unaff_x25 * 0x48));
              }
              _memcpy(puVar10,puVar4,(long)puVar9 - (long)puVar4);
              in_x3 = in_stack_00000088;
            }
          }
          uVar11 = uVar1 * 2 | 1;
          if (uVar7 < 2) goto LAB_00594128;
        }
        uVar11 = uVar1 * 2;
      } while (1 < uVar7);
LAB_00594128:
      unaff_x21 = 1;
LAB_0059412c:
      unaff_x20 = in_stack_00000030;
    }
    *(ulong *)(&uStack0000000000000090 + unaff_x21 * 8) = uVar11;
    *(char *)(unaff_x29 + -0x9a + unaff_x21) = (char)lVar6;
    if (unaff_x20 <= unaff_x25) {
      if ((uVar11 & 1) == 0) {
        func_0x005941b4(in_stack_00000058,unaff_x20,in_stack_00000070,in_x3,
                        (int)LZCOUNT(unaff_x20 | 1) << 1 ^ 0x7e,0,in_stack_00000060);
      }
      return;
    }
    unaff_x21 = unaff_x21 + 1;
    unaff_x25 = unaff_x25 + (unaff_x24 >> 1);
    uVar7 = unaff_x20 - unaff_x25;
    if (unaff_x25 <= unaff_x20 && uVar7 != 0) break;
    lVar6 = 0;
    uVar7 = 1;
    uVar11 = unaff_x24;
  } while( true );
  puVar10 = (ulong *)(in_stack_00000058 + unaff_x25 * unaff_x19);
  if (in_stack_00000038 <= uVar7) {
    if (uVar7 < 2) goto code_r0x00593eac;
    if (puVar10[9] < *puVar10) {
      if (uVar7 == 2) {
        in_x9 = 1;
        param_1 = 2;
        goto code_r0x00593d4c;
      }
      puVar9 = (ulong *)(in_stack_00000010 + unaff_x25 * unaff_x19);
      param_1 = 2;
      do {
        if (*puVar9 <= puVar9[9]) goto code_r0x00593e84;
        param_1 = param_1 + 1;
        puVar9 = puVar9 + 9;
      } while (uVar7 != param_1);
    }
    else {
      if (uVar7 == 2) goto code_r0x00593eac;
      puVar9 = (ulong *)(in_stack_00000010 + unaff_x25 * unaff_x19);
      param_1 = 2;
      do {
        if (puVar9[9] < *puVar9) goto code_r0x00593e84;
        param_1 = param_1 + 1;
        puVar9 = puVar9 + 9;
      } while (uVar7 != param_1);
    }
    param_1 = uVar7;
code_r0x00593e84:
    if (in_stack_00000038 <= param_1) goto code_r0x00593e90;
  }
  if ((in_stack_00000018 & 0x100000000) == 0) {
    if (in_stack_00000038 <= uVar7) {
      uVar7 = in_stack_00000038;
    }
    uVar7 = uVar7 << 1;
  }
  else {
    if (0x1f < uVar7) {
      uVar7 = 0x20;
    }
    func_0x005941b4(puVar10,uVar7,in_stack_00000070,in_stack_00000088,0,0,in_stack_00000060);
    uVar7 = uVar7 << 1 | 1;
    in_x3 = in_stack_00000088;
  }
  goto code_r0x00593eb4;
code_r0x00593e90:
  if (puVar10[9] < *puVar10) {
    if (1 < param_1) {
      in_x9 = param_1 >> 1;
code_r0x00593d4c:
      in_x10 = (undefined8 *)(in_stack_00000008 + unaff_x25 * 0x48 + param_1 * unaff_x19);
      in_x11 = (undefined8 *)(in_stack_00000000 + unaff_x25 * 0x48);
      goto LAB_00593d64;
    }
    uVar7 = 1;
    goto code_r0x00593eac;
  }
  goto LAB_00593ea8;
}

