/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc0bd8
 */

undefined8
FSE_buildDTable_wksp
          (undefined2 *param_1,long param_2,uint param_3,uint param_4,long param_5,ulong param_6)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  ushort uVar4;
  uint uVar5;
  uint uVar6;
  short sVar7;
  undefined8 uVar8;
  ulong uVar9;
  undefined1 *puVar10;
  ulong uVar11;
  long lVar12;
  undefined2 uVar13;
  int iVar14;
  long lVar15;
  ulong uVar16;
  int iVar17;
  ulong uVar18;
  ulong uVar19;
  long *plVar20;
  ulong uVar21;
  
  uVar8 = 0xffffffffffffffd2;
  if (param_3 < 0x100) {
    uVar1 = param_3 + 1;
    if ((1L << ((ulong)param_4 & 0x3f)) + (ulong)uVar1 * 2 + 8 <= param_6) {
      if (param_4 < 0xd) {
        uVar5 = 1 << (ulong)(param_4 & 0x1f);
        uVar9 = (ulong)uVar5;
        uVar11 = 0;
        uVar6 = uVar5 - 1;
        uVar13 = 1;
        uVar18 = (ulong)uVar6;
        do {
          sVar7 = *(short *)(param_2 + uVar11 * 2);
          if (sVar7 == -1) {
            *(char *)(param_1 + uVar18 * 2 + 3) = (char)uVar11;
            sVar7 = 1;
            uVar18 = (ulong)((int)uVar18 - 1);
          }
          else if ((int)((uint)(0x8000 << (ulong)(param_4 & 0x1f)) >> 0x10) <= (int)sVar7) {
            uVar13 = 0;
          }
          *(short *)(param_5 + uVar11 * 2) = sVar7;
          uVar11 = uVar11 + 1;
        } while (uVar1 != uVar11);
        *param_1 = (short)param_4;
        param_1[1] = uVar13;
        if ((uint)uVar18 == uVar6) {
          lVar2 = param_5 + (ulong)param_3 * 2;
          uVar11 = 0;
          lVar12 = 0;
          lVar15 = 0;
          if (uVar1 < 2) {
            uVar1 = 1;
          }
          iVar17 = (uVar5 >> 1) + (uVar5 >> 3) + 3;
          do {
            uVar18 = (ulong)*(short *)(param_2 + uVar11 * 2);
            *(long *)(param_5 + (ulong)param_3 * 2 + 2 + lVar12) = lVar15;
            if (8 < (long)uVar18) {
              uVar16 = uVar18;
              if (uVar18 < 0x11) {
                uVar16 = 0x10;
              }
              if (uVar16 - 9 < 0x18) {
                uVar19 = 8;
              }
              else {
                uVar16 = (uVar16 - 9 >> 3) + 1;
                uVar19 = (uVar16 >> 2) << 5 | 8;
                plVar20 = (long *)(lVar2 + 0x1a + lVar12);
                uVar21 = uVar16 & 0x3ffffffffffffffc;
                do {
                  uVar21 = uVar21 - 4;
                  plVar20[-1] = lVar15;
                  plVar20[-2] = lVar15;
                  plVar20[1] = lVar15;
                  *plVar20 = lVar15;
                  plVar20 = plVar20 + 4;
                } while (uVar21 != 0);
                if (uVar16 == (uVar16 & 0x3ffffffffffffffc)) goto LAB_00bc0cd8;
              }
              plVar20 = (long *)(lVar2 + 2 + uVar19 + lVar12);
              do {
                uVar19 = uVar19 + 8;
                *plVar20 = lVar15;
                plVar20 = plVar20 + 1;
              } while (uVar19 < uVar18);
            }
LAB_00bc0cd8:
            uVar11 = uVar11 + 1;
            lVar12 = lVar12 + uVar18;
            lVar15 = lVar15 + 0x101010101010101;
          } while (uVar11 != uVar1);
          uVar11 = 0;
          uVar18 = 0;
          puVar10 = (undefined1 *)(lVar2 + 3);
          do {
            uVar16 = uVar18 & uVar6;
            iVar14 = (int)uVar18;
            uVar11 = uVar11 + 2;
            uVar18 = (ulong)(iVar14 + iVar17 * 2 & uVar6);
            *(undefined1 *)(param_1 + uVar16 * 2 + 3) = puVar10[-1];
            *(undefined1 *)(param_1 + (ulong)(iVar14 + iVar17 & uVar6) * 2 + 3) = *puVar10;
            puVar10 = puVar10 + 2;
          } while (uVar11 < uVar9);
        }
        else {
          uVar11 = 0;
          uVar16 = 0;
          if (uVar1 < 2) {
            uVar1 = 1;
          }
          do {
            sVar7 = *(short *)(param_2 + uVar11 * 2);
            if (0 < sVar7) {
              iVar17 = 0;
              do {
                *(char *)(param_1 + uVar16 * 2 + 3) = (char)uVar11;
                do {
                  uVar3 = (uVar5 >> 1) + (uVar5 >> 3) + 3 + (int)uVar16 & uVar6;
                  uVar16 = (ulong)uVar3;
                } while ((uint)uVar18 < uVar3);
                iVar17 = iVar17 + 1;
              } while (iVar17 != sVar7);
            }
            uVar11 = uVar11 + 1;
          } while (uVar11 != uVar1);
          if ((int)uVar16 != 0) {
            return 0xffffffffffffffff;
          }
        }
        puVar10 = (undefined1 *)((long)param_1 + 7);
        do {
          uVar9 = uVar9 - 1;
          uVar4 = *(ushort *)(param_5 + (ulong)(byte)puVar10[-1] * 2);
          uVar1 = (param_4 - 0x1f) + (int)LZCOUNT((uint)uVar4);
          *(ushort *)(param_5 + (ulong)(byte)puVar10[-1] * 2) = uVar4 + 1;
          *puVar10 = (char)uVar1;
          *(ushort *)(puVar10 + -3) = (uVar4 << (ulong)(uVar1 & 0x1f)) - (short)uVar5;
          puVar10 = puVar10 + 4;
        } while (uVar9 != 0);
        uVar8 = 0;
      }
      else {
        uVar8 = 0xffffffffffffffd4;
      }
    }
  }
  return uVar8;
}

