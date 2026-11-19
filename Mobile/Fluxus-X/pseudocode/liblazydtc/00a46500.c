/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a46500
 */

void FUN_00a46500(int *param_1,int *param_2)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  long lVar24;
  long lVar25;
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  long lVar31;
  
  lVar9 = (long)*param_2;
  lVar14 = (long)param_2[1];
  lVar10 = (long)param_2[2];
  lVar15 = (long)param_2[3];
  lVar11 = (long)param_2[4];
  lVar16 = (long)param_2[5];
  lVar12 = (long)param_2[6];
  lVar17 = (long)param_2[7];
  lVar13 = (long)param_2[8];
  lVar18 = (long)param_2[9];
  lVar28 = lVar9 * 2;
  lVar19 = lVar14 * 2;
  lVar25 = lVar10 * 2;
  lVar27 = lVar15 * 2;
  lVar29 = lVar11 * 2;
  lVar21 = lVar16 * 2;
  lVar31 = lVar12 * 0x13;
  lVar24 = lVar17 * 0x26;
  lVar30 = lVar13 * 0x13;
  lVar26 = lVar17 * 2;
  lVar23 = lVar18 * 0x26;
  lVar20 = lVar9 * lVar9 + lVar16 * lVar16 * 0x26 + lVar31 * lVar29 + lVar24 * lVar27 +
           lVar30 * lVar25 + lVar23 * lVar19;
  lVar22 = lVar10 * lVar10 + lVar27 * lVar19 + lVar11 * lVar28 + lVar24 * lVar17 +
           lVar12 * lVar30 * 2 + lVar23 * lVar21;
  uVar1 = lVar22 + 0x2000000;
  lVar9 = lVar25 * lVar15 + lVar11 * lVar19 + lVar16 * lVar28 + lVar30 * lVar26 + lVar23 * lVar12 +
          ((long)uVar1 >> 0x1a);
  uVar2 = lVar20 + 0x2000000;
  lVar3 = lVar9 + 0x1000000;
  lVar4 = lVar11 * lVar25 + lVar27 * lVar15 + lVar21 * lVar19 + lVar12 * lVar28 + lVar30 * lVar13 +
          lVar23 * lVar26 + (lVar3 >> 0x19);
  lVar5 = lVar4 + 0x2000000;
  lVar6 = lVar27 * lVar11 + lVar16 * lVar25 + lVar12 * lVar19 + lVar17 * lVar28 + lVar23 * lVar13 +
          (lVar5 >> 0x1a);
  lVar7 = lVar6 + 0x1000000;
  lVar26 = lVar11 * lVar11 + lVar12 * lVar25 + lVar21 * lVar27 + lVar26 * lVar19 + lVar13 * lVar28 +
           lVar23 * lVar18 + (lVar7 >> 0x19);
  lVar8 = lVar26 + 0x2000000;
  lVar13 = lVar29 * lVar16 + lVar12 * lVar27 + lVar17 * lVar25 + lVar13 * lVar19 + lVar18 * lVar28 +
           (lVar8 >> 0x1a);
  lVar16 = lVar13 + 0x1000000;
  lVar17 = lVar28 * lVar14 + lVar31 * lVar21 + lVar24 * lVar11 + lVar30 * lVar27 + lVar23 * lVar10 +
           ((long)uVar2 >> 0x1a);
  lVar25 = (lVar20 - (uVar2 & 0xfffffffffc000000)) + (lVar16 >> 0x19) * 0x13;
  lVar18 = lVar17 + 0x1000000;
  lVar14 = lVar19 * lVar14 + lVar10 * lVar28 + lVar31 * lVar12 + lVar24 * lVar21 + lVar30 * lVar29 +
           lVar23 * lVar27 + (lVar18 >> 0x19);
  lVar20 = lVar14 + 0x2000000;
  lVar10 = lVar19 * lVar10 + lVar15 * lVar28 + lVar24 * lVar12 + lVar30 * lVar21 + lVar23 * lVar11 +
           (lVar20 >> 0x1a);
  lVar11 = lVar10 + 0x1000000;
  lVar12 = (lVar22 - (uVar1 & 0xfffffffffc000000)) + (lVar11 >> 0x19);
  param_1[2] = (int)lVar14 - ((uint)lVar20 & 0xfc000000);
  param_1[3] = (int)lVar10 - ((uint)lVar11 & 0xfe000000);
  uVar1 = lVar12 + 0x2000000;
  param_1[6] = (int)lVar4 - ((uint)lVar5 & 0xfc000000);
  param_1[7] = (int)lVar6 - ((uint)lVar7 & 0xfe000000);
  param_1[4] = (int)lVar12 - ((uint)uVar1 & 0xfc000000);
  param_1[5] = ((int)lVar9 - ((uint)lVar3 & 0xfe000000)) + (int)(uVar1 >> 0x1a);
  uVar1 = lVar25 + 0x2000000;
  *param_1 = (int)lVar25 - ((uint)uVar1 & 0xfc000000);
  param_1[1] = ((int)lVar17 - ((uint)lVar18 & 0xfe000000)) + (int)(uVar1 >> 0x1a);
  param_1[8] = (int)lVar26 - ((uint)lVar8 & 0xfc000000);
  param_1[9] = (int)lVar13 - ((uint)lVar16 & 0xfe000000);
  return;
}

