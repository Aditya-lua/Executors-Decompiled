
int FUN_005fd9dc(ulong *param_1)

{
  uint uVar1;
  ulong *puVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  uint in_w8;
  uint in_w9;
  int in_w10;
  ulong *puVar11;
  long in_x11;
  ulong *puVar12;
  long in_x12;
  ulong uVar13;
  long lVar14;
  ulong in_x13;
  uint uVar15;
  ulong uVar16;
  long lVar17;
  long in_x14;
  long in_x15;
  ulong uVar18;
  ulong *in_x16;
  ulong *in_x17;
  ulong unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  int unaff_w22;
  long unaff_x24;
  ulong *unaff_x25;
  ulong *unaff_x26;
  ulong *unaff_x28;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  long in_stack_00000008;
  
  do {
    do {
      lVar17 = in_x12;
      unaff_w22 = unaff_w22 + 0x40;
      uVar6 = *unaff_x25;
      puVar2 = unaff_x25;
      if (uVar6 != 0) {
        do {
          uVar3 = (uint)(uVar6 >> 0x20);
          uVar15 = (uVar3 & 0xaaaaaaaa) >> 1 | (uVar3 & 0x55555555) << 1;
          uVar15 = (uVar15 & 0xcccccccc) >> 2 | (uVar15 & 0x33333333) << 2;
          uVar15 = (uVar15 & 0xf0f0f0f0) >> 4 | (uVar15 & 0xf0f0f0f) << 4;
          uVar1 = (uVar15 & 0xff00ff00) >> 8 | (uVar15 & 0xff00ff) << 8;
          uVar15 = in_w9;
          if (uVar3 != 0) {
            uVar15 = (uint)LZCOUNT(uVar1 >> 0x10 | uVar1 << 0x10) | 0x20;
          }
          uVar3 = (uint)uVar6;
          uVar1 = (uVar3 & 0xaaaaaaaa) >> 1 | (uVar3 & 0x55555555) << 1;
          uVar1 = (uVar1 & 0xcccccccc) >> 2 | (uVar1 & 0x33333333) << 2;
          uVar1 = (uVar1 & 0xf0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f) << 4;
          uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
          if (uVar3 != 0) {
            uVar15 = (uint)LZCOUNT(uVar1 >> 0x10 | uVar1 << 0x10);
          }
          uVar13 = (ulong)uVar15;
          unaff_w22 = uVar15 + unaff_w22;
          if ((uVar6 >> (uVar13 & 0x3f) == 1) && (puVar2[1] == 0)) {
            uVar6 = unaff_x20;
            do {
              if (uVar6 - 2 == 0) {
                if ((in_w8 & 1) == 0) {
                  if (unaff_x21 == in_stack_00000008) {
                    return unaff_w22;
                  }
                  _memcpy(in_stack_00000008,unaff_x21);
                  return unaff_w22;
                }
                if (unaff_x19 == 0) {
                  return unaff_w22;
                }
                uVar13 = 0;
                uVar6 = 0;
                puVar2 = (ulong *)(in_stack_00000008 + 8);
                puVar11 = (ulong *)(unaff_x21 + 8);
                puVar12 = (ulong *)(unaff_x24 + 8);
                do {
                  uVar5 = puVar12[-1];
                  uVar8 = puVar11[-1];
                  uVar16 = uVar5 - uVar8;
                  puVar2[-1] = uVar16 - uVar13;
                  uVar7 = *puVar12 - *puVar11;
                  uVar16 = (-(ulong)(uVar16 < uVar13) - (ulong)(uVar5 < uVar8)) + uVar7;
                  uVar13 = (ulong)(uVar7 < uVar16);
                  if (*puVar12 < *puVar11) {
                    uVar13 = uVar13 + 1;
                  }
                  uVar6 = uVar6 + 2;
                  *puVar2 = uVar16;
                  puVar2 = puVar2 + 2;
                  puVar11 = puVar11 + 2;
                  puVar12 = puVar12 + 2;
                } while (uVar6 < unaff_x19);
                return unaff_w22;
              }
            } while ((puVar2[uVar6 - 2] == 0) &&
                    (lVar14 = uVar6 - 1, uVar6 = uVar6 - 2, puVar2[lVar14] == 0));
          }
          if ((unaff_x20 != 0) && (uVar15 != 0)) {
            uVar16 = 0;
            uVar6 = unaff_x20;
            do {
              uVar7 = puVar2[uVar6 - 1] >> (uVar13 & 0x3f) | uVar16;
              uVar16 = puVar2[uVar6 - 1] << ((ulong)(in_w10 - uVar15) & 0x3f);
              puVar2[uVar6 - 1] = uVar7;
              uVar6 = uVar6 - 1;
            } while (uVar6 != 0);
          }
          if ((lVar17 == 0) || (uVar15 == 0)) {
code_r0x005fd73c:
            lVar14 = 0;
          }
          else {
            uVar6 = 0;
            puVar11 = unaff_x28;
            lVar14 = lVar17;
            do {
              uVar16 = *puVar11;
              *puVar11 = uVar16 << (uVar13 & 0x3f) | uVar6;
              uVar6 = uVar16 >> ((ulong)(in_w10 - uVar15) & 0x3f);
              lVar14 = lVar14 + -1;
              puVar11 = puVar11 + 1;
            } while (lVar14 != 0);
            unaff_x28[lVar17] = unaff_x28[lVar17] + uVar6;
            if (uVar6 == 0) goto code_r0x005fd73c;
            lVar14 = 2;
          }
          uVar6 = lVar14 + lVar17;
          uVar13 = unaff_x20;
          do {
            uVar13 = uVar13 - 1;
            if (uVar13 == 0xffffffffffffffff) {
code_r0x005fd78c:
              uVar15 = 0;
              lVar17 = 0;
              unaff_x25 = puVar2;
              goto code_r0x005fd794;
            }
            if (unaff_x26[uVar13] < puVar2[uVar13]) goto code_r0x005fd78c;
          } while (unaff_x26[uVar13] <= puVar2[uVar13]);
          lVar17 = unaff_x21 - (long)unaff_x28 >> 3;
          uVar15 = 1;
          unaff_x25 = unaff_x26;
          unaff_x26 = puVar2;
code_r0x005fd794:
          lVar14 = in_x11;
          if (unaff_x25[unaff_x20 - 1] != 0 || unaff_x25[unaff_x20 - 2] != 0) {
            lVar14 = 0;
          }
          unaff_x20 = lVar14 + unaff_x20;
          if (unaff_x20 != 0) {
            uVar16 = 0;
            uVar13 = 0;
            do {
              puVar2 = unaff_x25 + uVar13;
              uVar4 = unaff_x26[uVar13];
              uVar7 = *puVar2;
              uVar5 = uVar7 - uVar4;
              *puVar2 = uVar5 - uVar16;
              uVar18 = (unaff_x26 + uVar13)[1];
              uVar8 = puVar2[1] - uVar18;
              uVar7 = (-(ulong)(uVar5 < uVar16) - (ulong)(uVar7 < uVar4)) + uVar8;
              uVar16 = (ulong)(uVar8 < uVar7);
              if (puVar2[1] < uVar18) {
                uVar16 = uVar16 + 1;
              }
              puVar2[1] = uVar7;
              uVar13 = uVar13 + 2;
            } while (uVar13 < unaff_x20);
          }
          unaff_x21 = unaff_x21 + lVar17 * -8;
          uVar13 = 0;
          if (uVar6 != 0) {
            uVar16 = 0;
            puVar2 = (ulong *)(unaff_x21 + 8);
            puVar11 = unaff_x28 + lVar17 + 1;
            do {
              uVar5 = puVar2[-1];
              uVar8 = puVar11[-1];
              uVar4 = (ulong)CARRY8(uVar8 + uVar5,uVar13);
              puVar2[-1] = uVar8 + uVar5 + uVar13;
              uVar7 = *puVar11 + *puVar2;
              uVar13 = (ulong)(CARRY8(uVar7,uVar4) ||
                              CARRY8(uVar7 + uVar4,(ulong)CARRY8(uVar8,uVar5)));
              if (CARRY8(*puVar11,*puVar2)) {
                uVar13 = uVar13 + 1;
              }
              *puVar2 = uVar7 + uVar4 + (ulong)CARRY8(uVar8,uVar5);
              uVar16 = uVar16 + 2;
              puVar2 = puVar2 + 2;
              puVar11 = puVar11 + 2;
            } while (uVar16 < uVar6);
          }
          unaff_x28 = unaff_x28 + lVar17;
          in_w8 = in_w8 ^ uVar15;
          *(ulong *)(unaff_x21 + uVar6 * 8) = *(long *)(unaff_x21 + uVar6 * 8) + uVar13;
          lVar17 = uVar6 + uVar13 * 2;
          uVar6 = *unaff_x25;
          puVar2 = unaff_x25;
        } while (uVar6 != 0);
        in_x13 = (ulong)(unaff_x20 != 0);
        in_x14 = -(ulong)(unaff_x20 != 0);
        in_x15 = unaff_x20 - in_x13;
        in_x16 = unaff_x25 + unaff_x20;
        in_x17 = unaff_x28 + -1;
        param_1 = unaff_x28 + -4;
      }
      uVar6 = unaff_x20;
      do {
        if (uVar6 == 0) {
          if (unaff_x19 != 0) {
            _bzero(in_stack_00000008);
          }
          return 0;
        }
      } while ((unaff_x25[uVar6 - 2] == 0) &&
              (lVar14 = uVar6 - 1, uVar6 = uVar6 - 2, unaff_x25[lVar14] == 0));
      if (unaff_x20 != 0) {
        if (unaff_x20 != 1) {
          lVar14 = 0;
          lVar10 = 1;
          puVar2 = unaff_x25;
          lVar9 = in_x15;
          do {
            *puVar2 = unaff_x25[lVar10];
            lVar14 = lVar14 + 1;
            lVar10 = lVar14 + in_x13;
            lVar9 = lVar9 + -1;
            puVar2 = puVar2 + 1;
          } while (lVar9 != 0);
        }
        in_x16[in_x14] = 0;
      }
      lVar14 = (ulong)(unaff_x28[lVar17 + -1] != 0) * 2;
      in_x12 = lVar14 + lVar17;
      uVar6 = (ulong)(in_x12 != 0);
    } while (in_x12 == 0);
    uVar13 = in_x12 - 1;
    if (uVar6 <= uVar13) {
      lVar14 = lVar14 + lVar17;
      uVar16 = lVar14 - 1;
      if (0x29 < uVar16) {
        uVar7 = lVar14 - 2;
        puVar2 = in_x17 + in_x12;
        if ((puVar2 + -uVar7 <= puVar2 && puVar2 + -1 + -uVar7 <= puVar2 + -1) && uVar7 >> 0x3d == 0
           ) {
          uVar5 = uVar16 & 0xfffffffffffffff8;
          uVar13 = uVar13 - uVar5;
          puVar2 = param_1 + in_x12;
          uVar7 = uVar5;
          do {
            puVar11 = puVar2 + -uVar6;
            uVar18 = *puVar11;
            uVar4 = puVar11[3];
            uVar8 = puVar11[2];
            uVar22 = puVar11[-3];
            uVar21 = puVar11[-4];
            uVar20 = puVar11[-1];
            uVar19 = puVar11[-2];
            puVar2[1] = puVar11[1];
            *puVar2 = uVar18;
            puVar2[3] = uVar4;
            puVar2[2] = uVar8;
            puVar2[-3] = uVar22;
            puVar2[-4] = uVar21;
            puVar2[-1] = uVar20;
            puVar2[-2] = uVar19;
            puVar2 = puVar2 + -8;
            uVar7 = uVar7 - 8;
          } while (uVar7 != 0);
          if (uVar16 == uVar5) goto code_r0x005fd9d8;
        }
      }
      do {
        unaff_x28[uVar13] = unaff_x28[uVar13 - uVar6];
        uVar13 = uVar13 - 1;
      } while (uVar6 <= uVar13);
    }
code_r0x005fd9d8:
    *unaff_x28 = 0;
  } while( true );
}

