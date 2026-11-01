
int FUN_005fd5d8(undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,long param_5,
                ulong param_6)

{
  uint uVar1;
  bool bVar2;
  byte bVar3;
  ulong *puVar4;
  uint uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong *puVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  long *plVar15;
  ulong uVar16;
  long lVar17;
  long lVar18;
  uint uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong *puVar22;
  ulong unaff_x19;
  undefined8 *unaff_x21;
  int iVar23;
  ulong *unaff_x22;
  long unaff_x23;
  ulong *unaff_x24;
  ulong *unaff_x25;
  ulong *puVar24;
  ulong *unaff_x28;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  undefined8 *in_stack_00000008;
  
  puVar24 = (ulong *)(param_2 + param_6 * 0x18);
  plVar15 = (long *)(param_5 + unaff_x23 + -8);
  do {
    uVar16 = param_6;
    if ((uVar16 == 0) || (plVar15[-1] != 0)) break;
    lVar17 = *plVar15;
    plVar15 = plVar15 + -2;
    param_6 = uVar16 - 2;
  } while (lVar17 == 0);
  if (unaff_x19 != 0) {
    _bzero();
  }
  *unaff_x21 = 1;
  if (unaff_x25 != unaff_x22) {
    _memcpy();
  }
  if (puVar24 != unaff_x24) {
    _memcpy(puVar24);
  }
  iVar23 = 0;
  bVar2 = false;
  lVar17 = 2;
  uVar6 = *unaff_x25;
  do {
    if (uVar6 == 0) {
      uVar20 = (ulong)(uVar16 != 0);
      lVar18 = lVar17;
      do {
        uVar6 = uVar16;
        do {
          if (uVar6 == 0) {
            if (unaff_x19 != 0) {
              _bzero(in_stack_00000008);
            }
            return 0;
          }
        } while ((unaff_x25[uVar6 - 2] == 0) &&
                (lVar17 = uVar6 - 1, uVar6 = uVar6 - 2, unaff_x25[lVar17] == 0));
        if (uVar16 != 0) {
          if (uVar16 != 1) {
            lVar17 = 0;
            lVar14 = 1;
            puVar9 = unaff_x25;
            lVar12 = uVar16 - uVar20;
            do {
              *puVar9 = unaff_x25[lVar14];
              lVar17 = lVar17 + 1;
              lVar14 = lVar17 + uVar20;
              lVar12 = lVar12 + -1;
              puVar9 = puVar9 + 1;
            } while (lVar12 != 0);
          }
          unaff_x25[uVar16 - (uVar16 != 0)] = 0;
        }
        lVar14 = (ulong)(unaff_x28[lVar18 + -1] != 0) * 2;
        lVar17 = lVar14 + lVar18;
        uVar6 = (ulong)(lVar17 != 0);
        if (lVar17 != 0) {
          uVar10 = lVar17 - 1;
          if (uVar6 <= uVar10) {
            lVar14 = lVar14 + lVar18;
            uVar13 = lVar14 - 1;
            if (0x29 < uVar13) {
              uVar8 = lVar14 - 2;
              puVar9 = unaff_x28 + lVar17 + -1;
              if ((puVar9 + -uVar8 <= puVar9 && puVar9 + -1 + -uVar8 <= puVar9 + -1) &&
                  uVar8 >> 0x3d == 0) {
                uVar11 = uVar13 & 0xfffffffffffffff8;
                uVar10 = uVar10 - uVar11;
                puVar9 = unaff_x28 + lVar17 + -4;
                uVar8 = uVar11;
                do {
                  puVar4 = puVar9 + -uVar6;
                  uVar25 = *puVar4;
                  uVar21 = puVar4[3];
                  uVar7 = puVar4[2];
                  uVar29 = puVar4[-3];
                  uVar28 = puVar4[-4];
                  uVar27 = puVar4[-1];
                  uVar26 = puVar4[-2];
                  puVar9[1] = puVar4[1];
                  *puVar9 = uVar25;
                  puVar9[3] = uVar21;
                  puVar9[2] = uVar7;
                  puVar9[-3] = uVar29;
                  puVar9[-4] = uVar28;
                  puVar9[-1] = uVar27;
                  puVar9[-2] = uVar26;
                  puVar9 = puVar9 + -8;
                  uVar8 = uVar8 - 8;
                } while (uVar8 != 0);
                if (uVar13 == uVar11) goto code_r0x005fd9d8;
              }
            }
            do {
              unaff_x28[uVar10] = unaff_x28[uVar10 - uVar6];
              uVar10 = uVar10 - 1;
            } while (uVar6 <= uVar10);
          }
code_r0x005fd9d8:
          *unaff_x28 = 0;
        }
        iVar23 = iVar23 + 0x40;
        uVar6 = *unaff_x25;
        lVar18 = lVar17;
      } while (uVar6 == 0);
    }
    uVar5 = (uint)(uVar6 >> 0x20);
    uVar19 = (uVar5 & 0xaaaaaaaa) >> 1 | (uVar5 & 0x55555555) << 1;
    uVar19 = (uVar19 & 0xcccccccc) >> 2 | (uVar19 & 0x33333333) << 2;
    uVar19 = (uVar19 & 0xf0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f) << 4;
    uVar1 = (uVar19 & 0xff00ff00) >> 8 | (uVar19 & 0xff00ff) << 8;
    uVar19 = 0x20;
    if (uVar5 != 0) {
      uVar19 = (uint)LZCOUNT(uVar1 >> 0x10 | uVar1 << 0x10) | 0x20;
    }
    uVar5 = (uint)uVar6;
    uVar1 = (uVar5 & 0xaaaaaaaa) >> 1 | (uVar5 & 0x55555555) << 1;
    uVar1 = (uVar1 & 0xcccccccc) >> 2 | (uVar1 & 0x33333333) << 2;
    uVar1 = (uVar1 & 0xf0f0f0f0) >> 4 | (uVar1 & 0xf0f0f0f) << 4;
    uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
    if (uVar5 != 0) {
      uVar19 = (uint)LZCOUNT(uVar1 >> 0x10 | uVar1 << 0x10);
    }
    iVar23 = uVar19 + iVar23;
    if ((uVar6 >> uVar19 == 1) && (unaff_x25[1] == 0)) {
      uVar6 = uVar16;
      do {
        if (uVar6 - 2 == 0) {
          if (bVar2) {
            if (unaff_x19 != 0) {
              uVar6 = 0;
              uVar16 = 0;
              puVar24 = in_stack_00000008 + 1;
              puVar9 = unaff_x21 + 1;
              puVar4 = unaff_x24 + 1;
              do {
                uVar13 = puVar4[-1];
                uVar8 = puVar9[-1];
                uVar20 = uVar13 - uVar8;
                puVar24[-1] = uVar20 - uVar6;
                uVar10 = *puVar4 - *puVar9;
                uVar20 = (-(ulong)(uVar20 < uVar6) - (ulong)(uVar13 < uVar8)) + uVar10;
                uVar6 = (ulong)(uVar10 < uVar20);
                if (*puVar4 < *puVar9) {
                  uVar6 = uVar6 + 1;
                }
                uVar16 = uVar16 + 2;
                *puVar24 = uVar20;
                puVar24 = puVar24 + 2;
                puVar9 = puVar9 + 2;
                puVar4 = puVar4 + 2;
              } while (uVar16 < unaff_x19);
            }
          }
          else if (unaff_x21 != in_stack_00000008) {
            _memcpy(in_stack_00000008,unaff_x21);
          }
          return iVar23;
        }
      } while ((unaff_x25[uVar6 - 2] == 0) &&
              (lVar18 = uVar6 - 1, uVar6 = uVar6 - 2, unaff_x25[lVar18] == 0));
    }
    if ((uVar16 != 0) && (uVar19 != 0)) {
      uVar20 = 0;
      uVar6 = uVar16;
      do {
        uVar10 = unaff_x25[uVar6 - 1] >> uVar19 | uVar20;
        uVar20 = unaff_x25[uVar6 - 1] << ((ulong)(0x40 - uVar19) & 0x3f);
        unaff_x25[uVar6 - 1] = uVar10;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
    }
    if ((lVar17 == 0) || (uVar19 == 0)) {
code_r0x005fd73c:
      lVar18 = 0;
    }
    else {
      uVar6 = 0;
      puVar9 = unaff_x28;
      lVar18 = lVar17;
      do {
        uVar20 = *puVar9;
        *puVar9 = uVar20 << uVar19 | uVar6;
        uVar6 = uVar20 >> ((ulong)(0x40 - uVar19) & 0x3f);
        lVar18 = lVar18 + -1;
        puVar9 = puVar9 + 1;
      } while (lVar18 != 0);
      unaff_x28[lVar17] = unaff_x28[lVar17] + uVar6;
      if (uVar6 == 0) goto code_r0x005fd73c;
      lVar18 = 2;
    }
    uVar6 = lVar18 + lVar17;
    uVar20 = uVar16;
    do {
      uVar20 = uVar20 - 1;
      if (uVar20 == 0xffffffffffffffff) {
code_r0x005fd78c:
        bVar3 = 0;
        lVar17 = 0;
        puVar9 = unaff_x25;
        goto code_r0x005fd794;
      }
      if (puVar24[uVar20] < unaff_x25[uVar20]) goto code_r0x005fd78c;
    } while (puVar24[uVar20] <= unaff_x25[uVar20]);
    lVar17 = (long)unaff_x21 - (long)unaff_x28 >> 3;
    bVar3 = 1;
    puVar9 = puVar24;
    puVar24 = unaff_x25;
code_r0x005fd794:
    lVar18 = -2;
    if (puVar9[uVar16 - 1] != 0 || puVar9[uVar16 - 2] != 0) {
      lVar18 = 0;
    }
    uVar16 = lVar18 + uVar16;
    if (uVar16 != 0) {
      uVar10 = 0;
      uVar20 = 0;
      do {
        puVar4 = puVar9 + uVar20;
        uVar7 = puVar24[uVar20];
        uVar13 = *puVar4;
        uVar8 = uVar13 - uVar7;
        *puVar4 = uVar8 - uVar10;
        uVar21 = (puVar24 + uVar20)[1];
        uVar11 = puVar4[1] - uVar21;
        uVar13 = (-(ulong)(uVar8 < uVar10) - (ulong)(uVar13 < uVar7)) + uVar11;
        uVar10 = (ulong)(uVar11 < uVar13);
        if (puVar4[1] < uVar21) {
          uVar10 = uVar10 + 1;
        }
        puVar4[1] = uVar13;
        uVar20 = uVar20 + 2;
      } while (uVar20 < uVar16);
    }
    unaff_x21 = unaff_x21 + -lVar17;
    uVar20 = 0;
    if (uVar6 != 0) {
      uVar10 = 0;
      puVar4 = unaff_x21 + 1;
      puVar22 = unaff_x28 + lVar17 + 1;
      do {
        uVar8 = puVar4[-1];
        uVar11 = puVar22[-1];
        uVar7 = (ulong)CARRY8(uVar11 + uVar8,uVar20);
        puVar4[-1] = uVar11 + uVar8 + uVar20;
        uVar13 = *puVar22 + *puVar4;
        uVar20 = (ulong)(CARRY8(uVar13,uVar7) || CARRY8(uVar13 + uVar7,(ulong)CARRY8(uVar11,uVar8)))
        ;
        if (CARRY8(*puVar22,*puVar4)) {
          uVar20 = uVar20 + 1;
        }
        *puVar4 = uVar13 + uVar7 + (ulong)CARRY8(uVar11,uVar8);
        uVar10 = uVar10 + 2;
        puVar4 = puVar4 + 2;
        puVar22 = puVar22 + 2;
      } while (uVar10 < uVar6);
    }
    unaff_x28 = unaff_x28 + lVar17;
    bVar2 = (bool)(bVar2 ^ bVar3);
    unaff_x21[uVar6] = unaff_x21[uVar6] + uVar20;
    lVar17 = uVar6 + uVar20 * 2;
    uVar6 = *puVar9;
    unaff_x25 = puVar9;
  } while( true );
}

