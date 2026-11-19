/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bba8b0
 */

void ZSTD_buildFSETable(undefined4 *param_1,long param_2,int param_3,long param_4,long param_5,
                       uint param_6,long param_7)

{
  long *plVar1;
  uint uVar2;
  ushort uVar3;
  uint uVar4;
  uint uVar5;
  ulong uVar6;
  uint *puVar7;
  ulong uVar8;
  int iVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  undefined4 uVar13;
  long lVar14;
  short sVar15;
  int iVar16;
  ulong uVar17;
  ulong uVar18;
  long *plVar19;
  ulong uVar20;
  
  uVar8 = (ulong)(param_3 + 1);
  uVar4 = 1 << (ulong)(param_6 & 0x1f);
  uVar6 = (ulong)uVar4;
  uVar5 = uVar4 - 1;
  if (param_3 == -1) {
    *param_1 = 1;
    param_1[1] = param_6;
    iVar16 = (uVar4 >> 3) + (uVar4 >> 1) + 3;
  }
  else {
    uVar10 = 0;
    uVar13 = 1;
    uVar17 = (ulong)uVar5;
    do {
      sVar15 = *(short *)(param_2 + uVar10 * 2);
      if (sVar15 == -1) {
        param_1[uVar17 * 2 + 3] = (int)uVar10;
        sVar15 = 1;
        uVar17 = (ulong)((int)uVar17 - 1);
      }
      else if ((0x10000 << (ulong)(param_6 - 1 & 0x1f)) >> 0x10 <= (int)sVar15) {
        uVar13 = 0;
      }
      *(short *)(param_7 + uVar10 * 2) = sVar15;
      uVar10 = uVar10 + 1;
    } while (uVar8 != uVar10);
    *param_1 = uVar13;
    param_1[1] = param_6;
    if ((uint)uVar17 != uVar5) {
      uVar10 = 0;
      uVar12 = 0;
      do {
        sVar15 = *(short *)(param_2 + uVar10 * 2);
        if (0 < sVar15) {
          iVar16 = 0;
          do {
            param_1[uVar12 * 2 + 3] = (int)uVar10;
            do {
              uVar2 = (uVar4 >> 3) + (uVar4 >> 1) + 3 + (int)uVar12 & uVar5;
              uVar12 = (ulong)uVar2;
            } while ((uint)uVar17 < uVar2);
            iVar16 = iVar16 + 1;
          } while (iVar16 != sVar15);
        }
        uVar10 = uVar10 + 1;
      } while (uVar10 != uVar8);
      goto LAB_00bbaab8;
    }
    uVar10 = 0;
    lVar11 = 0;
    lVar14 = 0;
    do {
      uVar17 = (ulong)*(short *)(param_2 + uVar10 * 2);
      plVar1 = (long *)(param_7 + 0x6a + lVar11);
      *plVar1 = lVar14;
      if (8 < (long)uVar17) {
        uVar12 = uVar17;
        if (uVar17 < 0x11) {
          uVar12 = 0x10;
        }
        if (uVar12 - 9 < 0x18) {
          uVar18 = 8;
        }
        else {
          uVar12 = (uVar12 - 9 >> 3) + 1;
          uVar18 = (uVar12 >> 2) << 5 | 8;
          plVar19 = (long *)(param_7 + 0x82 + lVar11);
          uVar20 = uVar12 & 0x3ffffffffffffffc;
          do {
            uVar20 = uVar20 - 4;
            plVar19[-1] = lVar14;
            plVar19[-2] = lVar14;
            plVar19[1] = lVar14;
            *plVar19 = lVar14;
            plVar19 = plVar19 + 4;
          } while (uVar20 != 0);
          if (uVar12 == (uVar12 & 0x3ffffffffffffffc)) goto LAB_00bba97c;
        }
        do {
          *(long *)((long)plVar1 + uVar18) = lVar14;
          uVar18 = uVar18 + 8;
        } while (uVar18 < uVar17);
      }
LAB_00bba97c:
      uVar10 = uVar10 + 1;
      lVar11 = lVar11 + uVar17;
      lVar14 = lVar14 + 0x101010101010101;
    } while (uVar10 != uVar8);
    iVar16 = (uVar4 >> 3) + 3 + (uVar4 >> 1);
  }
  uVar8 = 0;
  uVar10 = 0;
  do {
    lVar11 = param_7 + uVar8;
    iVar9 = (int)uVar10;
    uVar8 = uVar8 + 2;
    param_1[(uVar10 & uVar5) * 2 + 3] = (uint)*(byte *)(lVar11 + 0x6a);
    uVar10 = (ulong)(iVar9 + iVar16 * 2 & uVar5);
    param_1[(ulong)(iVar9 + iVar16 & uVar5) * 2 + 3] = (uint)*(byte *)(lVar11 + 0x6b);
  } while (uVar8 < uVar6);
LAB_00bbaab8:
  puVar7 = param_1 + 3;
  do {
    uVar8 = (ulong)*puVar7;
    uVar6 = uVar6 - 1;
    uVar3 = *(ushort *)(param_7 + uVar8 * 2);
    uVar5 = (param_6 - 0x1f) + (int)LZCOUNT((uint)uVar3);
    *(ushort *)(param_7 + uVar8 * 2) = uVar3 + 1;
    *(char *)((long)puVar7 + -1) = (char)uVar5;
    *(ushort *)(puVar7 + -1) = (uVar3 << (ulong)(uVar5 & 0x1f)) - (short)uVar4;
    uVar5 = *(uint *)(param_4 + uVar8 * 4);
    *(undefined1 *)((long)puVar7 + -2) = *(undefined1 *)(param_5 + uVar8);
    *puVar7 = uVar5;
    puVar7 = puVar7 + 2;
  } while (uVar6 != 0);
  return;
}

