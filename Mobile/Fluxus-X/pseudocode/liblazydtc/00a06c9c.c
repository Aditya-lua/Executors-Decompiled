/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a06c9c
 */

void bn_sqr_comba8(long *param_1,ulong *param_2)

{
  ulong uVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  
  uVar4 = *param_2 & 0xffffffff;
  uVar3 = *param_2 >> 0x20;
  uVar6 = uVar4 * uVar3 << 0x21;
  *param_1 = uVar4 * uVar4 + uVar6;
  uVar3 = uVar3 * uVar3 + (uVar4 * uVar3 >> 0x1f);
  if (CARRY8(uVar4 * uVar4,uVar6)) {
    uVar3 = uVar3 + 1;
  }
  uVar7 = param_2[1] & 0xffffffff;
  uVar9 = param_2[1] >> 0x20;
  uVar10 = *param_2 & 0xffffffff;
  uVar5 = *param_2 >> 0x20;
  uVar11 = uVar5 * uVar7;
  uVar7 = uVar10 * uVar7;
  uVar10 = uVar10 * uVar9;
  uVar4 = uVar11 + uVar10;
  uVar6 = uVar4 << 0x20;
  uVar8 = uVar7 + uVar6;
  uVar4 = uVar5 * uVar9 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar11,uVar10) << 0x20);
  if (CARRY8(uVar7,uVar6)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar4;
  if (CARRY8(uVar3,uVar8)) {
    uVar6 = uVar4 + 1;
  }
  param_1[1] = uVar3 + uVar8 + uVar8;
  if (CARRY8(uVar3 + uVar8,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar10 = (ulong)CARRY8(uVar6,uVar4);
  uVar11 = param_2[1] & 0xffffffff;
  uVar3 = param_2[1] >> 0x20;
  uVar12 = param_2[2] & 0xffffffff;
  uVar9 = param_2[2] >> 0x20;
  uVar14 = *param_2 & 0xffffffff;
  uVar7 = *param_2 >> 0x20;
  uVar19 = uVar7 * uVar12;
  uVar12 = uVar14 * uVar12;
  uVar14 = uVar14 * uVar9;
  uVar8 = uVar3 * uVar3 + (uVar11 * uVar3 >> 0x1f);
  uVar3 = uVar11 * uVar3 << 0x21;
  uVar5 = uVar11 * uVar11 + uVar3;
  if (CARRY8(uVar11 * uVar11,uVar3)) {
    uVar8 = uVar8 + 1;
  }
  uVar3 = uVar6 + uVar4 + uVar5;
  if (CARRY8(uVar6 + uVar4,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar19 + uVar14;
  uVar6 = uVar4 << 0x20;
  uVar5 = uVar12 + uVar6;
  uVar4 = uVar7 * uVar9 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar19,uVar14) << 0x20);
  if (CARRY8(uVar12,uVar6)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar5;
  uVar7 = uVar4;
  if (CARRY8(uVar3,uVar5)) {
    uVar7 = uVar4 + 1;
  }
  uVar3 = 2;
  if (!CARRY8(uVar8,uVar10)) {
    uVar3 = 1;
  }
  uVar9 = uVar8 + uVar10 + uVar7;
  uVar11 = (ulong)CARRY8(uVar8,uVar10);
  if (CARRY8(uVar8 + uVar10,uVar7)) {
    uVar11 = uVar3;
  }
  if (CARRY8(uVar6,uVar5)) {
    uVar4 = uVar4 + 1;
  }
  param_1[2] = uVar6 + uVar5;
  uVar6 = uVar9 + uVar4;
  if (CARRY8(uVar9,uVar4)) {
    uVar11 = uVar11 + 1;
  }
  uVar19 = param_2[3] & 0xffffffff;
  uVar9 = param_2[3] >> 0x20;
  uVar15 = *param_2 & 0xffffffff;
  uVar10 = *param_2 >> 0x20;
  uVar17 = param_2[2] & 0xffffffff;
  uVar7 = param_2[2] >> 0x20;
  uVar20 = param_2[1] & 0xffffffff;
  uVar14 = param_2[1] >> 0x20;
  uVar5 = uVar10 * uVar19;
  uVar19 = uVar15 * uVar19;
  uVar15 = uVar15 * uVar9;
  uVar12 = uVar14 * uVar17;
  uVar17 = uVar20 * uVar17;
  uVar20 = uVar20 * uVar7;
  uVar4 = uVar5 + uVar15;
  uVar3 = uVar4 << 0x20;
  uVar8 = uVar19 + uVar3;
  uVar4 = uVar10 * uVar9 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar5,uVar15) << 0x20);
  if (CARRY8(uVar19,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar8;
  uVar5 = uVar4;
  if (CARRY8(uVar6,uVar8)) {
    uVar5 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = 2;
  if (!CARRY8(uVar11,uVar5)) {
    uVar3 = 1;
  }
  uVar8 = uVar11 + uVar5 + uVar4;
  uVar9 = (ulong)CARRY8(uVar11,uVar5);
  if (CARRY8(uVar11 + uVar5,uVar4)) {
    uVar9 = uVar3;
  }
  uVar4 = uVar12 + uVar20;
  uVar3 = uVar4 << 0x20;
  uVar5 = uVar17 + uVar3;
  uVar4 = uVar14 * uVar7 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar12,uVar20) << 0x20);
  if (CARRY8(uVar17,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar5;
  uVar7 = uVar4;
  if (CARRY8(uVar6,uVar5)) {
    uVar7 = uVar4 + 1;
  }
  uVar6 = uVar8 + uVar7;
  if (CARRY8(uVar8,uVar7)) {
    uVar9 = uVar9 + 1;
  }
  if (CARRY8(uVar3,uVar5)) {
    uVar4 = uVar4 + 1;
  }
  param_1[3] = uVar3 + uVar5;
  uVar3 = uVar6 + uVar4;
  if (CARRY8(uVar6,uVar4)) {
    uVar9 = uVar9 + 1;
  }
  uVar17 = param_2[2] & 0xffffffff;
  uVar6 = param_2[2] >> 0x20;
  uVar20 = param_2[3] & 0xffffffff;
  uVar11 = param_2[3] >> 0x20;
  uVar21 = param_2[1] & 0xffffffff;
  uVar14 = param_2[1] >> 0x20;
  uVar5 = param_2[4] & 0xffffffff;
  uVar15 = param_2[4] >> 0x20;
  uVar7 = *param_2 & 0xffffffff;
  uVar12 = *param_2 >> 0x20;
  uVar10 = uVar14 * uVar20;
  uVar20 = uVar21 * uVar20;
  uVar21 = uVar21 * uVar11;
  uVar19 = uVar12 * uVar5;
  uVar5 = uVar7 * uVar5;
  uVar7 = uVar7 * uVar15;
  uVar4 = uVar6 * uVar6 + (uVar17 * uVar6 >> 0x1f);
  uVar6 = uVar17 * uVar6 << 0x21;
  uVar8 = uVar17 * uVar17 + uVar6;
  if (CARRY8(uVar17 * uVar17,uVar6)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar8 = uVar10 + uVar21;
  uVar3 = uVar8 << 0x20;
  uVar17 = uVar20 + uVar3;
  uVar8 = uVar14 * uVar11 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar10,uVar21) << 0x20);
  if (CARRY8(uVar20,uVar3)) {
    uVar8 = uVar8 + 1;
  }
  uVar3 = uVar6 + uVar17;
  uVar10 = uVar8;
  if (CARRY8(uVar6,uVar17)) {
    uVar10 = uVar8 + 1;
  }
  uVar6 = 2;
  if (!CARRY8(uVar9,uVar4)) {
    uVar6 = 1;
  }
  uVar11 = uVar9 + uVar4 + uVar10;
  uVar14 = (ulong)CARRY8(uVar9,uVar4);
  if (CARRY8(uVar9 + uVar4,uVar10)) {
    uVar14 = uVar6;
  }
  uVar6 = uVar3 + uVar17;
  if (CARRY8(uVar3,uVar17)) {
    uVar8 = uVar8 + 1;
  }
  uVar3 = uVar11 + uVar8;
  if (CARRY8(uVar11,uVar8)) {
    uVar14 = uVar14 + 1;
  }
  uVar8 = uVar19 + uVar7;
  uVar4 = uVar8 << 0x20;
  uVar9 = uVar5 + uVar4;
  uVar8 = uVar12 * uVar15 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar19,uVar7) << 0x20);
  if (CARRY8(uVar5,uVar4)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar6 + uVar9;
  uVar5 = uVar8;
  if (CARRY8(uVar6,uVar9)) {
    uVar5 = uVar8 + 1;
  }
  uVar6 = uVar3 + uVar5;
  if (CARRY8(uVar3,uVar5)) {
    uVar14 = uVar14 + 1;
  }
  if (CARRY8(uVar4,uVar9)) {
    uVar8 = uVar8 + 1;
  }
  param_1[4] = uVar4 + uVar9;
  uVar3 = uVar6 + uVar8;
  if (CARRY8(uVar6,uVar8)) {
    uVar14 = uVar14 + 1;
  }
  uVar18 = param_2[5] & 0xffffffff;
  uVar19 = param_2[5] >> 0x20;
  uVar22 = *param_2 & 0xffffffff;
  uVar15 = *param_2 >> 0x20;
  uVar5 = param_2[4] & 0xffffffff;
  uVar12 = param_2[4] >> 0x20;
  uVar7 = param_2[1] & 0xffffffff;
  uVar20 = param_2[1] >> 0x20;
  uVar9 = param_2[3] & 0xffffffff;
  uVar16 = param_2[3] >> 0x20;
  uVar10 = param_2[2] & 0xffffffff;
  uVar13 = param_2[2] >> 0x20;
  uVar11 = uVar15 * uVar18;
  uVar18 = uVar22 * uVar18;
  uVar22 = uVar22 * uVar19;
  uVar17 = uVar20 * uVar5;
  uVar5 = uVar7 * uVar5;
  uVar7 = uVar7 * uVar12;
  uVar21 = uVar13 * uVar9;
  uVar9 = uVar10 * uVar9;
  uVar10 = uVar10 * uVar16;
  uVar4 = uVar11 + uVar22;
  uVar6 = uVar4 << 0x20;
  uVar8 = uVar18 + uVar6;
  uVar4 = uVar15 * uVar19 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar11,uVar22) << 0x20);
  if (CARRY8(uVar18,uVar6)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar8;
  uVar11 = uVar4;
  if (CARRY8(uVar3,uVar8)) {
    uVar11 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar8;
  if (CARRY8(uVar6,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = 2;
  if (!CARRY8(uVar14,uVar11)) {
    uVar6 = 1;
  }
  uVar8 = uVar14 + uVar11 + uVar4;
  uVar19 = (ulong)CARRY8(uVar14,uVar11);
  if (CARRY8(uVar14 + uVar11,uVar4)) {
    uVar19 = uVar6;
  }
  uVar4 = uVar17 + uVar7;
  uVar6 = uVar4 << 0x20;
  uVar11 = uVar5 + uVar6;
  uVar4 = uVar20 * uVar12 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar17,uVar7) << 0x20);
  if (CARRY8(uVar5,uVar6)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar11;
  uVar5 = uVar4;
  if (CARRY8(uVar3,uVar11)) {
    uVar5 = uVar4 + 1;
  }
  uVar3 = uVar8 + uVar5;
  if (CARRY8(uVar8,uVar5)) {
    uVar19 = uVar19 + 1;
  }
  uVar8 = uVar6 + uVar11;
  if (CARRY8(uVar6,uVar11)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar4;
  if (CARRY8(uVar3,uVar4)) {
    uVar19 = uVar19 + 1;
  }
  uVar4 = uVar21 + uVar10;
  uVar3 = uVar4 << 0x20;
  uVar5 = uVar9 + uVar3;
  uVar4 = uVar13 * uVar16 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar21,uVar10) << 0x20);
  if (CARRY8(uVar9,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar8 + uVar5;
  uVar7 = uVar4;
  if (CARRY8(uVar8,uVar5)) {
    uVar7 = uVar4 + 1;
  }
  uVar8 = uVar6 + uVar7;
  if (CARRY8(uVar6,uVar7)) {
    uVar19 = uVar19 + 1;
  }
  if (CARRY8(uVar3,uVar5)) {
    uVar4 = uVar4 + 1;
  }
  param_1[5] = uVar3 + uVar5;
  uVar6 = uVar8 + uVar4;
  uVar16 = param_2[3] & 0xffffffff;
  uVar14 = param_2[3] >> 0x20;
  uVar3 = param_2[4] & 0xffffffff;
  uVar15 = param_2[4] >> 0x20;
  uVar5 = param_2[2] & 0xffffffff;
  uVar12 = param_2[2] >> 0x20;
  uVar7 = param_2[5] & 0xffffffff;
  uVar17 = param_2[5] >> 0x20;
  uVar9 = param_2[1] & 0xffffffff;
  uVar21 = param_2[1] >> 0x20;
  uVar10 = param_2[6] & 0xffffffff;
  uVar13 = param_2[6] >> 0x20;
  uVar11 = *param_2 & 0xffffffff;
  uVar20 = *param_2 >> 0x20;
  if (CARRY8(uVar8,uVar4)) {
    uVar19 = uVar19 + 1;
  }
  uVar24 = uVar12 * uVar3;
  uVar3 = uVar5 * uVar3;
  uVar5 = uVar5 * uVar15;
  uVar18 = uVar21 * uVar7;
  uVar7 = uVar9 * uVar7;
  uVar9 = uVar9 * uVar17;
  uVar22 = uVar20 * uVar10;
  uVar10 = uVar11 * uVar10;
  uVar11 = uVar11 * uVar13;
  uVar8 = uVar14 * uVar14 + (uVar16 * uVar14 >> 0x1f);
  uVar4 = uVar16 * uVar14 << 0x21;
  uVar14 = uVar16 * uVar16 + uVar4;
  if (CARRY8(uVar16 * uVar16,uVar4)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar6 + uVar14;
  if (CARRY8(uVar6,uVar14)) {
    uVar8 = uVar8 + 1;
  }
  uVar14 = uVar24 + uVar5;
  uVar6 = uVar14 << 0x20;
  uVar16 = uVar3 + uVar6;
  uVar5 = uVar12 * uVar15 + (uVar14 >> 0x20) + ((ulong)CARRY8(uVar24,uVar5) << 0x20);
  if (CARRY8(uVar3,uVar6)) {
    uVar5 = uVar5 + 1;
  }
  uVar6 = uVar4 + uVar16;
  uVar3 = uVar5;
  if (CARRY8(uVar4,uVar16)) {
    uVar3 = uVar5 + 1;
  }
  uVar4 = 2;
  if (!CARRY8(uVar19,uVar8)) {
    uVar4 = 1;
  }
  uVar12 = uVar19 + uVar8 + uVar3;
  uVar14 = (ulong)CARRY8(uVar19,uVar8);
  if (CARRY8(uVar19 + uVar8,uVar3)) {
    uVar14 = uVar4;
  }
  uVar3 = uVar6 + uVar16;
  if (CARRY8(uVar6,uVar16)) {
    uVar5 = uVar5 + 1;
  }
  uVar6 = uVar12 + uVar5;
  if (CARRY8(uVar12,uVar5)) {
    uVar14 = uVar14 + 1;
  }
  uVar8 = uVar18 + uVar9;
  uVar4 = uVar8 << 0x20;
  uVar5 = uVar7 + uVar4;
  uVar8 = uVar21 * uVar17 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar18,uVar9) << 0x20);
  if (CARRY8(uVar7,uVar4)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar3 + uVar5;
  uVar7 = uVar8;
  if (CARRY8(uVar3,uVar5)) {
    uVar7 = uVar8 + 1;
  }
  uVar3 = uVar6 + uVar7;
  if (CARRY8(uVar6,uVar7)) {
    uVar14 = uVar14 + 1;
  }
  uVar6 = uVar4 + uVar5;
  if (CARRY8(uVar4,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar14 = uVar14 + 1;
  }
  uVar8 = uVar22 + uVar11;
  uVar3 = uVar8 << 0x20;
  uVar5 = uVar10 + uVar3;
  uVar8 = uVar20 * uVar13 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar22,uVar11) << 0x20);
  if (CARRY8(uVar10,uVar3)) {
    uVar8 = uVar8 + 1;
  }
  uVar3 = uVar6 + uVar5;
  uVar7 = uVar8;
  if (CARRY8(uVar6,uVar5)) {
    uVar7 = uVar8 + 1;
  }
  uVar6 = uVar4 + uVar7;
  if (CARRY8(uVar4,uVar7)) {
    uVar14 = uVar14 + 1;
  }
  if (CARRY8(uVar3,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  param_1[6] = uVar3 + uVar5;
  uVar3 = uVar6 + uVar8;
  uVar4 = param_2[7] & 0xffffffff;
  uVar19 = param_2[7] >> 0x20;
  uVar5 = *param_2 & 0xffffffff;
  uVar15 = *param_2 >> 0x20;
  uVar7 = param_2[6] & 0xffffffff;
  uVar12 = param_2[6] >> 0x20;
  uVar9 = param_2[1] & 0xffffffff;
  uVar20 = param_2[1] >> 0x20;
  uVar10 = param_2[5] & 0xffffffff;
  uVar16 = param_2[5] >> 0x20;
  uVar11 = param_2[2] & 0xffffffff;
  uVar18 = param_2[2] >> 0x20;
  uVar23 = param_2[4] & 0xffffffff;
  uVar13 = param_2[4] >> 0x20;
  uVar25 = param_2[3] & 0xffffffff;
  uVar24 = param_2[3] >> 0x20;
  uVar26 = uVar15 * uVar4;
  uVar4 = uVar5 * uVar4;
  uVar5 = uVar5 * uVar19;
  uVar17 = uVar20 * uVar7;
  uVar7 = uVar9 * uVar7;
  uVar9 = uVar9 * uVar12;
  uVar21 = uVar18 * uVar10;
  uVar10 = uVar11 * uVar10;
  uVar11 = uVar11 * uVar16;
  uVar22 = uVar24 * uVar23;
  uVar23 = uVar25 * uVar23;
  uVar25 = uVar25 * uVar13;
  if (CARRY8(uVar6,uVar8)) {
    uVar14 = uVar14 + 1;
  }
  uVar8 = uVar26 + uVar5;
  uVar6 = uVar8 << 0x20;
  uVar1 = uVar4 + uVar6;
  uVar8 = uVar15 * uVar19 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar26,uVar5) << 0x20);
  if (CARRY8(uVar4,uVar6)) {
    uVar8 = uVar8 + 1;
  }
  uVar6 = uVar3 + uVar1;
  uVar4 = uVar8;
  if (CARRY8(uVar3,uVar1)) {
    uVar4 = uVar8 + 1;
  }
  uVar3 = uVar6 + uVar1;
  if (CARRY8(uVar6,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar6 = 2;
  if (!CARRY8(uVar14,uVar4)) {
    uVar6 = 1;
  }
  uVar5 = uVar14 + uVar4 + uVar8;
  uVar19 = (ulong)CARRY8(uVar14,uVar4);
  if (CARRY8(uVar14 + uVar4,uVar8)) {
    uVar19 = uVar6;
  }
  uVar4 = uVar17 + uVar9;
  uVar6 = uVar4 << 0x20;
  uVar8 = uVar7 + uVar6;
  uVar4 = uVar20 * uVar12 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar17,uVar9) << 0x20);
  if (CARRY8(uVar7,uVar6)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar8;
  uVar7 = uVar4;
  if (CARRY8(uVar3,uVar8)) {
    uVar7 = uVar4 + 1;
  }
  uVar3 = uVar5 + uVar7;
  if (CARRY8(uVar5,uVar7)) {
    uVar19 = uVar19 + 1;
  }
  uVar5 = uVar6 + uVar8;
  if (CARRY8(uVar6,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar4;
  if (CARRY8(uVar3,uVar4)) {
    uVar19 = uVar19 + 1;
  }
  uVar4 = uVar21 + uVar11;
  uVar3 = uVar4 << 0x20;
  uVar8 = uVar10 + uVar3;
  uVar4 = uVar18 * uVar16 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar21,uVar11) << 0x20);
  if (CARRY8(uVar10,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar5 + uVar8;
  uVar7 = uVar4;
  if (CARRY8(uVar5,uVar8)) {
    uVar7 = uVar4 + 1;
  }
  uVar5 = uVar6 + uVar7;
  if (CARRY8(uVar6,uVar7)) {
    uVar19 = uVar19 + 1;
  }
  uVar6 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar5 + uVar4;
  if (CARRY8(uVar5,uVar4)) {
    uVar19 = uVar19 + 1;
  }
  uVar8 = uVar22 + uVar25;
  uVar4 = uVar8 << 0x20;
  uVar5 = uVar23 + uVar4;
  uVar8 = uVar24 * uVar13 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar22,uVar25) << 0x20);
  if (CARRY8(uVar23,uVar4)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar6 + uVar5;
  uVar7 = uVar8;
  if (CARRY8(uVar6,uVar5)) {
    uVar7 = uVar8 + 1;
  }
  uVar6 = uVar3 + uVar7;
  if (CARRY8(uVar3,uVar7)) {
    uVar19 = uVar19 + 1;
  }
  if (CARRY8(uVar4,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  param_1[7] = uVar4 + uVar5;
  uVar3 = uVar6 + uVar8;
  uVar22 = param_2[4] & 0xffffffff;
  uVar14 = param_2[4] >> 0x20;
  uVar4 = param_2[5] & 0xffffffff;
  uVar15 = param_2[5] >> 0x20;
  uVar5 = param_2[3] & 0xffffffff;
  uVar12 = param_2[3] >> 0x20;
  uVar7 = param_2[6] & 0xffffffff;
  uVar20 = param_2[6] >> 0x20;
  uVar9 = param_2[2] & 0xffffffff;
  uVar13 = param_2[2] >> 0x20;
  uVar10 = param_2[7] & 0xffffffff;
  uVar18 = param_2[7] >> 0x20;
  uVar11 = param_2[1] & 0xffffffff;
  uVar21 = param_2[1] >> 0x20;
  uVar24 = uVar12 * uVar4;
  uVar4 = uVar5 * uVar4;
  uVar5 = uVar5 * uVar15;
  uVar17 = uVar13 * uVar7;
  uVar7 = uVar9 * uVar7;
  uVar9 = uVar9 * uVar20;
  uVar16 = uVar21 * uVar10;
  uVar10 = uVar11 * uVar10;
  uVar11 = uVar11 * uVar18;
  if (CARRY8(uVar6,uVar8)) {
    uVar19 = uVar19 + 1;
  }
  uVar8 = uVar14 * uVar14 + (uVar22 * uVar14 >> 0x1f);
  uVar6 = uVar22 * uVar14 << 0x21;
  uVar14 = uVar22 * uVar22 + uVar6;
  if (CARRY8(uVar22 * uVar22,uVar6)) {
    uVar8 = uVar8 + 1;
  }
  uVar6 = uVar3 + uVar14;
  if (CARRY8(uVar3,uVar14)) {
    uVar8 = uVar8 + 1;
  }
  uVar14 = uVar24 + uVar5;
  uVar3 = uVar14 << 0x20;
  uVar22 = uVar4 + uVar3;
  uVar5 = uVar12 * uVar15 + (uVar14 >> 0x20) + ((ulong)CARRY8(uVar24,uVar5) << 0x20);
  if (CARRY8(uVar4,uVar3)) {
    uVar5 = uVar5 + 1;
  }
  uVar3 = uVar6 + uVar22;
  uVar4 = uVar5;
  if (CARRY8(uVar6,uVar22)) {
    uVar4 = uVar5 + 1;
  }
  uVar6 = 2;
  if (!CARRY8(uVar19,uVar8)) {
    uVar6 = 1;
  }
  uVar12 = uVar19 + uVar8 + uVar4;
  uVar14 = (ulong)CARRY8(uVar19,uVar8);
  if (CARRY8(uVar19 + uVar8,uVar4)) {
    uVar14 = uVar6;
  }
  uVar6 = uVar3 + uVar22;
  if (CARRY8(uVar3,uVar22)) {
    uVar5 = uVar5 + 1;
  }
  uVar3 = uVar12 + uVar5;
  if (CARRY8(uVar12,uVar5)) {
    uVar14 = uVar14 + 1;
  }
  uVar8 = uVar17 + uVar9;
  uVar4 = uVar8 << 0x20;
  uVar5 = uVar7 + uVar4;
  uVar8 = uVar13 * uVar20 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar17,uVar9) << 0x20);
  if (CARRY8(uVar7,uVar4)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar6 + uVar5;
  uVar7 = uVar8;
  if (CARRY8(uVar6,uVar5)) {
    uVar7 = uVar8 + 1;
  }
  uVar6 = uVar3 + uVar7;
  if (CARRY8(uVar3,uVar7)) {
    uVar14 = uVar14 + 1;
  }
  uVar3 = uVar4 + uVar5;
  if (CARRY8(uVar4,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar6 + uVar8;
  if (CARRY8(uVar6,uVar8)) {
    uVar14 = uVar14 + 1;
  }
  uVar8 = uVar16 + uVar11;
  uVar6 = uVar8 << 0x20;
  uVar5 = uVar10 + uVar6;
  uVar8 = uVar21 * uVar18 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar16,uVar11) << 0x20);
  if (CARRY8(uVar10,uVar6)) {
    uVar8 = uVar8 + 1;
  }
  uVar6 = uVar3 + uVar5;
  uVar7 = uVar8;
  if (CARRY8(uVar3,uVar5)) {
    uVar7 = uVar8 + 1;
  }
  uVar3 = uVar4 + uVar7;
  if (CARRY8(uVar4,uVar7)) {
    uVar14 = uVar14 + 1;
  }
  if (CARRY8(uVar6,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  param_1[8] = uVar6 + uVar5;
  uVar6 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar14 = uVar14 + 1;
  }
  uVar18 = param_2[7] & 0xffffffff;
  uVar19 = param_2[7] >> 0x20;
  uVar22 = param_2[2] & 0xffffffff;
  uVar15 = param_2[2] >> 0x20;
  uVar5 = param_2[6] & 0xffffffff;
  uVar12 = param_2[6] >> 0x20;
  uVar7 = param_2[3] & 0xffffffff;
  uVar20 = param_2[3] >> 0x20;
  uVar9 = param_2[5] & 0xffffffff;
  uVar16 = param_2[5] >> 0x20;
  uVar10 = param_2[4] & 0xffffffff;
  uVar13 = param_2[4] >> 0x20;
  uVar11 = uVar15 * uVar18;
  uVar18 = uVar22 * uVar18;
  uVar22 = uVar22 * uVar19;
  uVar17 = uVar20 * uVar5;
  uVar5 = uVar7 * uVar5;
  uVar7 = uVar7 * uVar12;
  uVar21 = uVar13 * uVar9;
  uVar9 = uVar10 * uVar9;
  uVar10 = uVar10 * uVar16;
  uVar4 = uVar11 + uVar22;
  uVar3 = uVar4 << 0x20;
  uVar8 = uVar18 + uVar3;
  uVar4 = uVar15 * uVar19 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar11,uVar22) << 0x20);
  if (CARRY8(uVar18,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar8;
  uVar11 = uVar4;
  if (CARRY8(uVar6,uVar8)) {
    uVar11 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = 2;
  if (!CARRY8(uVar14,uVar11)) {
    uVar3 = 1;
  }
  uVar8 = uVar14 + uVar11 + uVar4;
  uVar19 = (ulong)CARRY8(uVar14,uVar11);
  if (CARRY8(uVar14 + uVar11,uVar4)) {
    uVar19 = uVar3;
  }
  uVar4 = uVar17 + uVar7;
  uVar3 = uVar4 << 0x20;
  uVar11 = uVar5 + uVar3;
  uVar4 = uVar20 * uVar12 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar17,uVar7) << 0x20);
  if (CARRY8(uVar5,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar11;
  uVar5 = uVar4;
  if (CARRY8(uVar6,uVar11)) {
    uVar5 = uVar4 + 1;
  }
  uVar6 = uVar8 + uVar5;
  if (CARRY8(uVar8,uVar5)) {
    uVar19 = uVar19 + 1;
  }
  uVar8 = uVar3 + uVar11;
  if (CARRY8(uVar3,uVar11)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar4;
  if (CARRY8(uVar6,uVar4)) {
    uVar19 = uVar19 + 1;
  }
  uVar4 = uVar21 + uVar10;
  uVar6 = uVar4 << 0x20;
  uVar5 = uVar9 + uVar6;
  uVar4 = uVar13 * uVar16 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar21,uVar10) << 0x20);
  if (CARRY8(uVar9,uVar6)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar8 + uVar5;
  uVar7 = uVar4;
  if (CARRY8(uVar8,uVar5)) {
    uVar7 = uVar4 + 1;
  }
  uVar8 = uVar3 + uVar7;
  if (CARRY8(uVar3,uVar7)) {
    uVar19 = uVar19 + 1;
  }
  if (CARRY8(uVar6,uVar5)) {
    uVar4 = uVar4 + 1;
  }
  param_1[9] = uVar6 + uVar5;
  uVar6 = uVar8 + uVar4;
  if (CARRY8(uVar8,uVar4)) {
    uVar19 = uVar19 + 1;
  }
  uVar17 = param_2[5] & 0xffffffff;
  uVar3 = param_2[5] >> 0x20;
  uVar20 = param_2[6] & 0xffffffff;
  uVar10 = param_2[6] >> 0x20;
  uVar21 = param_2[4] & 0xffffffff;
  uVar12 = param_2[4] >> 0x20;
  uVar5 = param_2[7] & 0xffffffff;
  uVar15 = param_2[7] >> 0x20;
  uVar7 = param_2[3] & 0xffffffff;
  uVar11 = param_2[3] >> 0x20;
  uVar9 = uVar12 * uVar20;
  uVar20 = uVar21 * uVar20;
  uVar21 = uVar21 * uVar10;
  uVar14 = uVar11 * uVar5;
  uVar5 = uVar7 * uVar5;
  uVar7 = uVar7 * uVar15;
  uVar4 = uVar3 * uVar3 + (uVar17 * uVar3 >> 0x1f);
  uVar3 = uVar17 * uVar3 << 0x21;
  uVar8 = uVar17 * uVar17 + uVar3;
  if (CARRY8(uVar17 * uVar17,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar8;
  if (CARRY8(uVar6,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar8 = uVar9 + uVar21;
  uVar6 = uVar8 << 0x20;
  uVar17 = uVar20 + uVar6;
  uVar8 = uVar12 * uVar10 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar9,uVar21) << 0x20);
  if (CARRY8(uVar20,uVar6)) {
    uVar8 = uVar8 + 1;
  }
  uVar6 = uVar3 + uVar17;
  uVar9 = uVar8;
  if (CARRY8(uVar3,uVar17)) {
    uVar9 = uVar8 + 1;
  }
  uVar3 = 2;
  if (!CARRY8(uVar19,uVar4)) {
    uVar3 = 1;
  }
  uVar10 = uVar19 + uVar4 + uVar9;
  uVar12 = (ulong)CARRY8(uVar19,uVar4);
  if (CARRY8(uVar19 + uVar4,uVar9)) {
    uVar12 = uVar3;
  }
  uVar3 = uVar6 + uVar17;
  if (CARRY8(uVar6,uVar17)) {
    uVar8 = uVar8 + 1;
  }
  uVar6 = uVar10 + uVar8;
  if (CARRY8(uVar10,uVar8)) {
    uVar12 = uVar12 + 1;
  }
  uVar8 = uVar14 + uVar7;
  uVar4 = uVar8 << 0x20;
  uVar9 = uVar5 + uVar4;
  uVar8 = uVar11 * uVar15 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar14,uVar7) << 0x20);
  if (CARRY8(uVar5,uVar4)) {
    uVar8 = uVar8 + 1;
  }
  uVar4 = uVar3 + uVar9;
  uVar5 = uVar8;
  if (CARRY8(uVar3,uVar9)) {
    uVar5 = uVar8 + 1;
  }
  uVar3 = uVar6 + uVar5;
  if (CARRY8(uVar6,uVar5)) {
    uVar12 = uVar12 + 1;
  }
  if (CARRY8(uVar4,uVar9)) {
    uVar8 = uVar8 + 1;
  }
  param_1[10] = uVar4 + uVar9;
  uVar6 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar12 = uVar12 + 1;
  }
  uVar19 = param_2[7] & 0xffffffff;
  uVar10 = param_2[7] >> 0x20;
  uVar15 = param_2[4] & 0xffffffff;
  uVar9 = param_2[4] >> 0x20;
  uVar17 = param_2[6] & 0xffffffff;
  uVar7 = param_2[6] >> 0x20;
  uVar20 = param_2[5] & 0xffffffff;
  uVar14 = param_2[5] >> 0x20;
  uVar5 = uVar9 * uVar19;
  uVar19 = uVar15 * uVar19;
  uVar15 = uVar15 * uVar10;
  uVar11 = uVar14 * uVar17;
  uVar17 = uVar20 * uVar17;
  uVar20 = uVar20 * uVar7;
  uVar4 = uVar5 + uVar15;
  uVar3 = uVar4 << 0x20;
  uVar8 = uVar19 + uVar3;
  uVar4 = uVar9 * uVar10 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar5,uVar15) << 0x20);
  if (CARRY8(uVar19,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar8;
  uVar5 = uVar4;
  if (CARRY8(uVar6,uVar8)) {
    uVar5 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = 2;
  if (!CARRY8(uVar12,uVar5)) {
    uVar3 = 1;
  }
  uVar8 = uVar12 + uVar5 + uVar4;
  uVar9 = (ulong)CARRY8(uVar12,uVar5);
  if (CARRY8(uVar12 + uVar5,uVar4)) {
    uVar9 = uVar3;
  }
  uVar4 = uVar11 + uVar20;
  uVar3 = uVar4 << 0x20;
  uVar5 = uVar17 + uVar3;
  uVar4 = uVar14 * uVar7 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar11,uVar20) << 0x20);
  if (CARRY8(uVar17,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar5;
  uVar7 = uVar4;
  if (CARRY8(uVar6,uVar5)) {
    uVar7 = uVar4 + 1;
  }
  uVar6 = uVar8 + uVar7;
  if (CARRY8(uVar8,uVar7)) {
    uVar9 = uVar9 + 1;
  }
  if (CARRY8(uVar3,uVar5)) {
    uVar4 = uVar4 + 1;
  }
  param_1[0xb] = uVar3 + uVar5;
  uVar3 = uVar6 + uVar4;
  if (CARRY8(uVar6,uVar4)) {
    uVar9 = uVar9 + 1;
  }
  uVar10 = param_2[6] & 0xffffffff;
  uVar6 = param_2[6] >> 0x20;
  uVar11 = param_2[7] & 0xffffffff;
  uVar7 = param_2[7] >> 0x20;
  uVar12 = param_2[5] & 0xffffffff;
  uVar5 = param_2[5] >> 0x20;
  uVar14 = uVar5 * uVar11;
  uVar11 = uVar12 * uVar11;
  uVar12 = uVar12 * uVar7;
  uVar4 = uVar6 * uVar6 + (uVar10 * uVar6 >> 0x1f);
  uVar6 = uVar10 * uVar6 << 0x21;
  uVar8 = uVar10 * uVar10 + uVar6;
  if (CARRY8(uVar10 * uVar10,uVar6)) {
    uVar4 = uVar4 + 1;
  }
  uVar6 = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar8 = uVar14 + uVar12;
  uVar3 = uVar8 << 0x20;
  uVar10 = uVar11 + uVar3;
  uVar8 = uVar5 * uVar7 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar14,uVar12) << 0x20);
  if (CARRY8(uVar11,uVar3)) {
    uVar8 = uVar8 + 1;
  }
  uVar3 = uVar6 + uVar10;
  uVar5 = uVar8;
  if (CARRY8(uVar6,uVar10)) {
    uVar5 = uVar8 + 1;
  }
  uVar6 = 2;
  if (!CARRY8(uVar9,uVar4)) {
    uVar6 = 1;
  }
  uVar7 = uVar9 + uVar4 + uVar5;
  uVar11 = (ulong)CARRY8(uVar9,uVar4);
  if (CARRY8(uVar9 + uVar4,uVar5)) {
    uVar11 = uVar6;
  }
  param_1[0xc] = uVar3 + uVar10;
  if (CARRY8(uVar3,uVar10)) {
    uVar8 = uVar8 + 1;
  }
  uVar6 = uVar7 + uVar8;
  if (CARRY8(uVar7,uVar8)) {
    uVar11 = uVar11 + 1;
  }
  uVar7 = param_2[7] & 0xffffffff;
  uVar9 = param_2[7] >> 0x20;
  uVar10 = param_2[6] & 0xffffffff;
  uVar5 = param_2[6] >> 0x20;
  uVar12 = uVar5 * uVar7;
  uVar7 = uVar10 * uVar7;
  uVar10 = uVar10 * uVar9;
  uVar4 = uVar12 + uVar10;
  uVar3 = uVar4 << 0x20;
  uVar8 = uVar7 + uVar3;
  uVar4 = uVar5 * uVar9 + (uVar4 >> 0x20) + ((ulong)CARRY8(uVar12,uVar10) << 0x20);
  if (CARRY8(uVar7,uVar3)) {
    uVar4 = uVar4 + 1;
  }
  uVar3 = uVar6 + uVar8;
  uVar5 = uVar4;
  if (CARRY8(uVar6,uVar8)) {
    uVar5 = uVar4 + 1;
  }
  param_1[0xd] = uVar3 + uVar8;
  if (CARRY8(uVar3,uVar8)) {
    uVar4 = uVar4 + 1;
  }
  uVar8 = param_2[7] & 0xffffffff;
  uVar6 = param_2[7] >> 0x20;
  lVar2 = uVar6 * uVar6 + (uVar8 * uVar6 >> 0x1f);
  uVar6 = uVar8 * uVar6 << 0x21;
  uVar3 = uVar8 * uVar8 + uVar6;
  if (CARRY8(uVar8 * uVar8,uVar6)) {
    lVar2 = lVar2 + 1;
  }
  if (CARRY8(uVar11,uVar5)) {
    lVar2 = lVar2 + 1;
  }
  uVar6 = uVar11 + uVar5 + uVar4;
  if (CARRY8(uVar11 + uVar5,uVar4)) {
    lVar2 = lVar2 + 1;
  }
  if (CARRY8(uVar6,uVar3)) {
    lVar2 = lVar2 + 1;
  }
  param_1[0xe] = uVar6 + uVar3;
  param_1[0xf] = lVar2;
  return;
}

