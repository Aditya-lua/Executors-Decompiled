/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a44e38
 */

void FUN_00a44e38(int *param_1,int *param_2,int *param_3)

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
  long lVar32;
  long lVar33;
  long lVar34;
  long lVar35;
  long lVar36;
  long lVar37;
  long lVar38;
  long lVar39;
  long lVar40;
  long lVar41;
  long lVar42;
  long lVar43;
  
  lVar11 = (long)*param_2;
  lVar21 = (long)param_2[1];
  lVar12 = (long)param_2[2];
  lVar22 = (long)param_2[3];
  lVar13 = (long)param_2[4];
  lVar23 = (long)param_2[5];
  lVar14 = (long)param_2[6];
  lVar24 = (long)param_2[7];
  lVar15 = (long)param_2[8];
  lVar25 = (long)param_2[9];
  lVar16 = (long)*param_3;
  lVar26 = (long)param_3[1];
  lVar35 = lVar21 * 2;
  lVar30 = lVar22 * 2;
  lVar36 = lVar25 * 2;
  lVar32 = lVar23 * 2;
  lVar31 = lVar24 * 2;
  lVar17 = (long)param_3[2];
  lVar27 = (long)param_3[3];
  lVar42 = lVar27 * 0x13;
  lVar18 = (long)param_3[4];
  lVar28 = (long)param_3[5];
  lVar37 = lVar18 * 0x13;
  lVar38 = lVar28 * 0x13;
  lVar19 = (long)param_3[6];
  lVar29 = (long)param_3[7];
  lVar43 = lVar19 * 0x13;
  lVar20 = (long)param_3[8];
  lVar39 = lVar29 * 0x13;
  lVar40 = lVar20 * 0x13;
  lVar41 = (long)param_3[9] * 0x13;
  lVar33 = lVar16 * lVar13 + lVar26 * lVar30 + lVar17 * lVar12 + lVar27 * lVar35 + lVar18 * lVar11 +
           lVar38 * lVar36 + lVar43 * lVar15 + lVar39 * lVar31 + lVar40 * lVar14 + lVar41 * lVar32;
  lVar34 = lVar16 * lVar11 + lVar26 * lVar36 * 0x13 + lVar17 * 0x13 * lVar15 + lVar42 * lVar31 +
           lVar37 * lVar14 + lVar38 * lVar32 + lVar43 * lVar13 + lVar39 * lVar30 + lVar40 * lVar12 +
           lVar41 * lVar35;
  uVar1 = lVar33 + 0x2000000;
  uVar2 = lVar34 + 0x2000000;
  lVar3 = lVar16 * lVar23 + lVar26 * lVar13 + lVar17 * lVar22 + lVar27 * lVar12 + lVar18 * lVar21 +
          lVar28 * lVar11 + lVar43 * lVar25 + lVar39 * lVar15 + lVar40 * lVar24 + lVar41 * lVar14 +
          ((long)uVar1 >> 0x1a);
  lVar4 = lVar3 + 0x1000000;
  lVar5 = lVar16 * lVar14 + lVar26 * lVar32 + lVar17 * lVar13 + lVar27 * lVar30 + lVar18 * lVar12 +
          lVar28 * lVar35 + lVar19 * lVar11 + lVar39 * lVar36 + lVar40 * lVar15 + lVar41 * lVar31 +
          (lVar4 >> 0x19);
  lVar6 = lVar5 + 0x2000000;
  lVar7 = lVar16 * lVar24 + lVar26 * lVar14 + lVar17 * lVar23 + lVar27 * lVar13 + lVar18 * lVar22 +
          lVar28 * lVar12 + lVar19 * lVar21 + lVar29 * lVar11 + lVar40 * lVar25 + lVar41 * lVar15 +
          (lVar6 >> 0x1a);
  lVar8 = lVar7 + 0x1000000;
  lVar9 = lVar16 * lVar15 + lVar26 * lVar31 + lVar17 * lVar14 + lVar27 * lVar32 + lVar18 * lVar13 +
          lVar28 * lVar30 + lVar19 * lVar12 + lVar29 * lVar35 + lVar20 * lVar11 + lVar41 * lVar36 +
          (lVar8 >> 0x19);
  lVar10 = lVar9 + 0x2000000;
  lVar18 = lVar16 * lVar25 + lVar26 * lVar15 + lVar17 * lVar24 + lVar27 * lVar14 + lVar18 * lVar23 +
           lVar28 * lVar13 + lVar19 * lVar22 + lVar29 * lVar12 + lVar20 * lVar21 +
           param_3[9] * lVar11 + (lVar10 >> 0x1a);
  lVar19 = lVar18 + 0x1000000;
  lVar34 = (lVar34 - (uVar2 & 0xfffffffffc000000)) + (lVar19 >> 0x19) * 0x13;
  lVar20 = lVar16 * lVar21 + lVar26 * lVar11 + lVar17 * 0x13 * lVar25 + lVar42 * lVar15 +
           lVar37 * lVar24 + lVar38 * lVar14 + lVar43 * lVar23 + lVar39 * lVar13 + lVar40 * lVar22 +
           lVar41 * lVar12 + ((long)uVar2 >> 0x1a);
  lVar28 = lVar20 + 0x1000000;
  lVar29 = lVar16 * lVar12 + lVar26 * lVar35 + lVar17 * lVar11 + lVar42 * lVar36 + lVar37 * lVar15 +
           lVar38 * lVar31 + lVar43 * lVar14 + lVar39 * lVar32 + lVar40 * lVar13 + lVar41 * lVar30 +
           (lVar28 >> 0x19);
  lVar30 = lVar29 + 0x2000000;
  lVar11 = lVar16 * lVar22 + lVar26 * lVar12 + lVar17 * lVar21 + lVar27 * lVar11 + lVar37 * lVar25 +
           lVar38 * lVar15 + lVar43 * lVar24 + lVar39 * lVar14 + lVar40 * lVar23 + lVar41 * lVar13 +
           (lVar30 >> 0x1a);
  lVar12 = lVar11 + 0x1000000;
  lVar13 = (lVar33 - (uVar1 & 0xfffffffffc000000)) + (lVar12 >> 0x19);
  param_1[6] = (int)lVar5 - ((uint)lVar6 & 0xfc000000);
  param_1[7] = (int)lVar7 - ((uint)lVar8 & 0xfe000000);
  uVar1 = lVar13 + 0x2000000;
  param_1[2] = (int)lVar29 - ((uint)lVar30 & 0xfc000000);
  param_1[3] = (int)lVar11 - ((uint)lVar12 & 0xfe000000);
  param_1[4] = (int)lVar13 - ((uint)uVar1 & 0xfc000000);
  param_1[5] = ((int)lVar3 - ((uint)lVar4 & 0xfe000000)) + (int)(uVar1 >> 0x1a);
  uVar1 = lVar34 + 0x2000000;
  *param_1 = (int)lVar34 - ((uint)uVar1 & 0xfc000000);
  param_1[1] = ((int)lVar20 - ((uint)lVar28 & 0xfe000000)) + (int)(uVar1 >> 0x1a);
  param_1[8] = (int)lVar9 - ((uint)lVar10 & 0xfc000000);
  param_1[9] = (int)lVar18 - ((uint)lVar19 & 0xfe000000);
  return;
}

