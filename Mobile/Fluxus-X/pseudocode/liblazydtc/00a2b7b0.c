/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2b7b0
 */

undefined8 BN_GF2m_mod_arr(ulong *param_1,ulong *param_2,int *param_3)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  uint uVar7;
  int *piVar8;
  int iVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong uVar12;
  ulong uVar13;
  int iVar14;
  ulong uVar15;
  undefined8 *puVar16;
  int iVar17;
  undefined8 *puVar18;
  ulong uVar19;
  uint *puVar20;
  uint uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  
  iVar14 = *param_3;
  if (iVar14 == 0) {
    BN_zero_ex(param_1);
    return 1;
  }
  uVar7 = (uint)param_2[1];
  if (param_2 == param_1) goto LAB_00a2b880;
  lVar5 = bn_wexpand(param_1);
  if (lVar5 == 0) {
    return 0;
  }
  uVar7 = (uint)param_2[1];
  if (0 < (int)uVar7) {
    uVar10 = *param_2;
    uVar12 = *param_1;
    uVar15 = 0;
    uVar13 = (ulong)(int)uVar7;
    if ((3 < uVar7) &&
       ((uVar10 + uVar13 * 8 <= uVar12 || (uVar15 = 0, uVar12 + uVar13 * 8 <= uVar10)))) {
      uVar15 = uVar13 & 0xfffffffffffffffc;
      puVar16 = (undefined8 *)(uVar10 + 0x10);
      puVar18 = (undefined8 *)(uVar12 + 0x10);
      uVar19 = uVar15;
      do {
        puVar4 = puVar16 + -1;
        uVar22 = puVar16[-2];
        uVar24 = puVar16[1];
        uVar23 = *puVar16;
        puVar16 = puVar16 + 4;
        uVar19 = uVar19 - 4;
        puVar18[-1] = *puVar4;
        puVar18[-2] = uVar22;
        puVar18[1] = uVar24;
        *puVar18 = uVar23;
        puVar18 = puVar18 + 4;
      } while (uVar19 != 0);
      if (uVar15 == uVar13) goto LAB_00a2b878;
    }
    do {
      lVar5 = uVar15 * 8;
      uVar15 = uVar15 + 1;
      *(undefined8 *)(uVar12 + lVar5) = *(undefined8 *)(uVar10 + lVar5);
    } while ((long)uVar15 < (long)uVar13);
  }
LAB_00a2b878:
  *(uint *)(param_1 + 1) = uVar7;
  iVar14 = *param_3;
LAB_00a2b880:
  puVar11 = (ulong *)*param_1;
  iVar1 = iVar14 + 0x3f;
  if (-1 < iVar14) {
    iVar1 = iVar14;
  }
  iVar1 = iVar1 >> 6;
  iVar17 = uVar7 - 1;
  if (iVar1 < iVar17) {
    uVar7 = iVar14 + iVar1 * -0x40;
    uVar15 = (ulong)uVar7;
    lVar5 = (long)iVar17;
    do {
      uVar10 = puVar11[lVar5];
      if (uVar10 != 0) {
        iVar17 = param_3[1];
        lVar6 = lVar5 - iVar1;
        do {
          puVar11[lVar5] = 0;
          if (iVar17 != 0) {
            piVar8 = param_3 + 2;
            iVar9 = iVar17;
            do {
              iVar9 = iVar14 - iVar9;
              iVar2 = iVar9 + 0x3f;
              if (-1 < iVar9) {
                iVar2 = iVar9;
              }
              uVar21 = (int)lVar5 - (iVar2 >> 6);
              uVar12 = -(ulong)(uVar21 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar21 << 3;
              uVar3 = iVar9 % 0x40;
              *(ulong *)((long)puVar11 + uVar12) =
                   *(ulong *)((long)puVar11 + uVar12) ^ uVar10 >> ((ulong)uVar3 & 0x3f);
              if (uVar3 != 0) {
                puVar11[(long)(int)uVar21 + -1] =
                     puVar11[(long)(int)uVar21 + -1] ^ uVar10 << ((ulong)(0x40 - uVar3) & 0x3f);
              }
              iVar9 = *piVar8;
              piVar8 = piVar8 + 1;
            } while (iVar9 != 0);
          }
          puVar11[lVar6] = puVar11[lVar6] ^ uVar10 >> (uVar15 & 0x3f);
          if (uVar7 != 0) {
            puVar11[lVar6 + -1] = puVar11[lVar6 + -1] ^ uVar10 << ((ulong)(0x40 - uVar7) & 0x3f);
          }
          uVar10 = puVar11[lVar5];
        } while (uVar10 != 0);
      }
      lVar5 = lVar5 + -1;
    } while (iVar1 < lVar5);
    iVar17 = (int)lVar5;
  }
  else {
    uVar15 = (ulong)(uint)(iVar14 % 0x40);
  }
  if (iVar17 == iVar1) {
    uVar12 = puVar11[iVar1];
    uVar10 = uVar12 >> (uVar15 & 0x3f);
    if (uVar10 != 0) {
      uVar7 = param_3[1];
      uVar13 = (ulong)(0x40 - (int)uVar15);
      do {
        uVar19 = 0;
        if ((int)uVar15 != 0) {
          uVar19 = (uVar12 << (uVar13 & 0x3f)) >> (uVar13 & 0x3f);
        }
        puVar11[iVar1] = uVar19;
        *puVar11 = *puVar11 ^ uVar10;
        if (uVar7 != 0) {
          puVar20 = (uint *)(param_3 + 2);
          uVar21 = uVar7;
          do {
            uVar3 = uVar21 + 0x3f;
            if (-1 < (int)uVar21) {
              uVar3 = uVar21;
            }
            uVar12 = -(ulong)((uint)((int)uVar3 >> 6) >> 0x1f) & 0xfffffff800000000 |
                     (ulong)(uint)((int)uVar3 >> 6) << 3;
            uVar21 = (int)uVar21 % 0x40;
            *(ulong *)((long)puVar11 + uVar12) =
                 *(ulong *)((long)puVar11 + uVar12) ^ uVar10 << ((ulong)uVar21 & 0x3f);
            if ((uVar21 != 0) && (uVar12 = uVar10 >> ((ulong)(0x40 - uVar21) & 0x3f), uVar12 != 0))
            {
              lVar5 = (long)((ulong)uVar3 << 0x20) >> 0x26;
              puVar11[lVar5 + 1] = puVar11[lVar5 + 1] ^ uVar12;
            }
            uVar21 = *puVar20;
            puVar20 = puVar20 + 1;
          } while (uVar21 != 0);
        }
        uVar12 = puVar11[iVar1];
        uVar10 = uVar12 >> (uVar15 & 0x3f);
      } while (uVar10 != 0);
    }
  }
  bn_correct_top(param_1);
  return 1;
}

