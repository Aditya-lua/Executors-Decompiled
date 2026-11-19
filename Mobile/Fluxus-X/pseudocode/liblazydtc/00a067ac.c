/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a067ac
 */

void bn_mul_comba4(long *param_1,ulong *param_2,ulong *param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  long lVar4;
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
  
  uVar7 = *param_2 & 0xffffffff;
  uVar5 = *param_2 >> 0x20;
  uVar8 = *param_3 & 0xffffffff;
  uVar6 = *param_3 >> 0x20;
  uVar11 = uVar6 * uVar7;
  uVar7 = uVar8 * uVar7;
  uVar8 = uVar8 * uVar5;
  uVar2 = uVar11 + uVar8;
  uVar1 = uVar2 << 0x20;
  *param_1 = uVar7 + uVar1;
  uVar2 = uVar6 * uVar5 + (uVar2 >> 0x20) + ((ulong)CARRY8(uVar11,uVar8) << 0x20);
  if (CARRY8(uVar7,uVar1)) {
    uVar2 = uVar2 + 1;
  }
  uVar13 = *param_2 & 0xffffffff;
  uVar8 = *param_2 >> 0x20;
  uVar16 = param_3[1] & 0xffffffff;
  uVar9 = param_3[1] >> 0x20;
  uVar18 = param_2[1] & 0xffffffff;
  uVar12 = param_2[1] >> 0x20;
  uVar20 = *param_3 & 0xffffffff;
  uVar11 = *param_3 >> 0x20;
  uVar22 = uVar9 * uVar13;
  uVar13 = uVar16 * uVar13;
  uVar16 = uVar16 * uVar8;
  uVar10 = uVar11 * uVar18;
  uVar18 = uVar20 * uVar18;
  uVar20 = uVar20 * uVar12;
  uVar5 = uVar22 + uVar16;
  uVar6 = uVar10 + uVar20;
  uVar1 = uVar6 << 0x20;
  uVar7 = uVar18 + uVar1;
  uVar6 = uVar11 * uVar12 + (uVar6 >> 0x20) + ((ulong)CARRY8(uVar10,uVar20) << 0x20);
  uVar8 = uVar9 * uVar8 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar22,uVar16) << 0x20);
  if (CARRY8(uVar18,uVar1)) {
    uVar6 = uVar6 + 1;
  }
  uVar5 = uVar5 << 0x20;
  uVar1 = uVar13 + uVar5;
  if (CARRY8(uVar13,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar5 = uVar2 + uVar1;
  if (CARRY8(uVar2,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  if (CARRY8(uVar5,uVar7)) {
    uVar6 = uVar6 + 1;
  }
  param_1[1] = uVar5 + uVar7;
  uVar21 = param_2[2] & 0xffffffff;
  uVar13 = param_2[2] >> 0x20;
  uVar23 = *param_3 & 0xffffffff;
  uVar20 = *param_3 >> 0x20;
  uVar7 = param_2[1] & 0xffffffff;
  uVar18 = param_2[1] >> 0x20;
  uVar11 = param_3[1] & 0xffffffff;
  uVar14 = param_3[1] >> 0x20;
  uVar9 = *param_2 & 0xffffffff;
  uVar16 = *param_2 >> 0x20;
  uVar10 = param_3[2] & 0xffffffff;
  uVar17 = param_3[2] >> 0x20;
  uVar12 = uVar20 * uVar21;
  uVar21 = uVar23 * uVar21;
  uVar23 = uVar23 * uVar13;
  uVar19 = (ulong)CARRY8(uVar8,uVar6);
  uVar22 = uVar14 * uVar7;
  uVar7 = uVar11 * uVar7;
  uVar11 = uVar11 * uVar18;
  uVar15 = uVar17 * uVar9;
  uVar9 = uVar10 * uVar9;
  uVar10 = uVar10 * uVar16;
  uVar2 = uVar12 + uVar23;
  uVar1 = uVar2 << 0x20;
  uVar5 = uVar21 + uVar1;
  uVar2 = uVar20 * uVar13 + (uVar2 >> 0x20) + ((ulong)CARRY8(uVar12,uVar23) << 0x20);
  if (CARRY8(uVar21,uVar1)) {
    uVar2 = uVar2 + 1;
  }
  uVar1 = uVar8 + uVar6 + uVar5;
  if (CARRY8(uVar8 + uVar6,uVar5)) {
    uVar2 = uVar2 + 1;
  }
  uVar6 = uVar22 + uVar11;
  uVar5 = uVar6 << 0x20;
  uVar8 = uVar7 + uVar5;
  uVar6 = uVar14 * uVar18 + (uVar6 >> 0x20) + ((ulong)CARRY8(uVar22,uVar11) << 0x20);
  if (CARRY8(uVar7,uVar5)) {
    uVar6 = uVar6 + 1;
  }
  uVar5 = uVar1 + uVar8;
  if (CARRY8(uVar1,uVar8)) {
    uVar6 = uVar6 + 1;
  }
  uVar1 = 2;
  if (!CARRY8(uVar2,uVar19)) {
    uVar1 = 1;
  }
  uVar7 = uVar2 + uVar19 + uVar6;
  uVar8 = (ulong)CARRY8(uVar2,uVar19);
  if (CARRY8(uVar2 + uVar19,uVar6)) {
    uVar8 = uVar1;
  }
  uVar2 = uVar15 + uVar10;
  uVar1 = uVar2 << 0x20;
  uVar6 = uVar9 + uVar1;
  uVar2 = uVar17 * uVar16 + (uVar2 >> 0x20) + ((ulong)CARRY8(uVar15,uVar10) << 0x20);
  if (CARRY8(uVar9,uVar1)) {
    uVar2 = uVar2 + 1;
  }
  if (CARRY8(uVar5,uVar6)) {
    uVar2 = uVar2 + 1;
  }
  param_1[2] = uVar5 + uVar6;
  uVar1 = uVar7 + uVar2;
  uVar6 = param_3[3] & 0xffffffff;
  uVar5 = *param_2 & 0xffffffff;
  uVar16 = *param_2 >> 0x20;
  uVar13 = param_3[3] >> 0x20;
  uVar11 = param_2[1] & 0xffffffff;
  uVar20 = param_2[1] >> 0x20;
  uVar9 = param_3[2] & 0xffffffff;
  uVar12 = param_3[2] >> 0x20;
  uVar10 = param_2[2] & 0xffffffff;
  uVar17 = param_2[2] >> 0x20;
  uVar23 = param_3[1] & 0xffffffff;
  uVar15 = param_3[1] >> 0x20;
  uVar24 = param_2[3] & 0xffffffff;
  uVar21 = param_2[3] >> 0x20;
  uVar25 = *param_3 & 0xffffffff;
  uVar14 = *param_3 >> 0x20;
  uVar26 = uVar13 * uVar5;
  uVar5 = uVar6 * uVar5;
  uVar6 = uVar6 * uVar16;
  uVar18 = uVar12 * uVar11;
  uVar11 = uVar9 * uVar11;
  uVar9 = uVar9 * uVar20;
  uVar22 = uVar15 * uVar10;
  uVar10 = uVar23 * uVar10;
  uVar23 = uVar23 * uVar17;
  uVar19 = uVar14 * uVar24;
  uVar24 = uVar25 * uVar24;
  uVar25 = uVar25 * uVar21;
  if (CARRY8(uVar7,uVar2)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar26 + uVar6;
  uVar2 = uVar7 << 0x20;
  uVar3 = uVar5 + uVar2;
  uVar6 = uVar13 * uVar16 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar26,uVar6) << 0x20);
  if (CARRY8(uVar5,uVar2)) {
    uVar6 = uVar6 + 1;
  }
  uVar2 = uVar1 + uVar3;
  if (CARRY8(uVar1,uVar3)) {
    uVar6 = uVar6 + 1;
  }
  uVar5 = uVar18 + uVar9;
  uVar1 = uVar5 << 0x20;
  uVar7 = uVar11 + uVar1;
  uVar5 = uVar12 * uVar20 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar18,uVar9) << 0x20);
  if (CARRY8(uVar11,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  uVar1 = uVar2 + uVar7;
  if (CARRY8(uVar2,uVar7)) {
    uVar5 = uVar5 + 1;
  }
  uVar2 = 2;
  if (!CARRY8(uVar8,uVar6)) {
    uVar2 = 1;
  }
  uVar7 = uVar8 + uVar6 + uVar5;
  uVar11 = (ulong)CARRY8(uVar8,uVar6);
  if (CARRY8(uVar8 + uVar6,uVar5)) {
    uVar11 = uVar2;
  }
  uVar5 = uVar22 + uVar23;
  uVar2 = uVar5 << 0x20;
  uVar6 = uVar10 + uVar2;
  uVar5 = uVar15 * uVar17 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar22,uVar23) << 0x20);
  if (CARRY8(uVar10,uVar2)) {
    uVar5 = uVar5 + 1;
  }
  uVar2 = uVar1 + uVar6;
  if (CARRY8(uVar1,uVar6)) {
    uVar5 = uVar5 + 1;
  }
  uVar1 = uVar7 + uVar5;
  if (CARRY8(uVar7,uVar5)) {
    uVar11 = uVar11 + 1;
  }
  uVar6 = uVar19 + uVar25;
  uVar5 = uVar6 << 0x20;
  uVar7 = uVar24 + uVar5;
  uVar6 = uVar14 * uVar21 + (uVar6 >> 0x20) + ((ulong)CARRY8(uVar19,uVar25) << 0x20);
  if (CARRY8(uVar24,uVar5)) {
    uVar6 = uVar6 + 1;
  }
  if (CARRY8(uVar2,uVar7)) {
    uVar6 = uVar6 + 1;
  }
  param_1[3] = uVar2 + uVar7;
  uVar2 = uVar6 + uVar1;
  uVar17 = param_2[3] & 0xffffffff;
  uVar12 = param_2[3] >> 0x20;
  uVar19 = param_3[1] & 0xffffffff;
  uVar18 = param_3[1] >> 0x20;
  uVar5 = param_2[2] & 0xffffffff;
  uVar16 = param_2[2] >> 0x20;
  uVar7 = param_3[2] & 0xffffffff;
  uVar22 = param_3[2] >> 0x20;
  uVar8 = param_2[1] & 0xffffffff;
  uVar13 = param_2[1] >> 0x20;
  uVar9 = param_3[3] & 0xffffffff;
  uVar15 = param_3[3] >> 0x20;
  uVar10 = uVar18 * uVar17;
  uVar17 = uVar19 * uVar17;
  uVar19 = uVar19 * uVar12;
  uVar20 = uVar22 * uVar5;
  uVar5 = uVar7 * uVar5;
  uVar7 = uVar7 * uVar16;
  uVar14 = uVar15 * uVar8;
  uVar8 = uVar9 * uVar8;
  uVar9 = uVar9 * uVar13;
  if (CARRY8(uVar6,uVar1)) {
    uVar11 = uVar11 + 1;
  }
  uVar6 = uVar10 + uVar19;
  uVar1 = uVar6 << 0x20;
  uVar21 = uVar17 + uVar1;
  uVar6 = uVar18 * uVar12 + (uVar6 >> 0x20) + ((ulong)CARRY8(uVar10,uVar19) << 0x20);
  if (CARRY8(uVar17,uVar1)) {
    uVar6 = uVar6 + 1;
  }
  uVar1 = uVar2 + uVar21;
  if (CARRY8(uVar2,uVar21)) {
    uVar6 = uVar6 + 1;
  }
  uVar10 = uVar20 + uVar7;
  uVar2 = uVar10 << 0x20;
  uVar12 = uVar5 + uVar2;
  uVar7 = uVar22 * uVar16 + (uVar10 >> 0x20) + ((ulong)CARRY8(uVar20,uVar7) << 0x20);
  if (CARRY8(uVar5,uVar2)) {
    uVar7 = uVar7 + 1;
  }
  uVar2 = uVar1 + uVar12;
  if (CARRY8(uVar1,uVar12)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = 2;
  if (!CARRY8(uVar11,uVar6)) {
    uVar1 = 1;
  }
  uVar5 = uVar11 + uVar6 + uVar7;
  uVar10 = (ulong)CARRY8(uVar11,uVar6);
  if (CARRY8(uVar11 + uVar6,uVar7)) {
    uVar10 = uVar1;
  }
  uVar6 = uVar14 + uVar9;
  uVar1 = uVar6 << 0x20;
  uVar7 = uVar8 + uVar1;
  uVar6 = uVar15 * uVar13 + (uVar6 >> 0x20) + ((ulong)CARRY8(uVar14,uVar9) << 0x20);
  if (CARRY8(uVar8,uVar1)) {
    uVar6 = uVar6 + 1;
  }
  if (CARRY8(uVar2,uVar7)) {
    uVar6 = uVar6 + 1;
  }
  param_1[4] = uVar2 + uVar7;
  uVar1 = uVar5 + uVar6;
  if (CARRY8(uVar5,uVar6)) {
    uVar10 = uVar10 + 1;
  }
  uVar13 = param_2[2] & 0xffffffff;
  uVar7 = param_2[2] >> 0x20;
  uVar16 = param_3[3] & 0xffffffff;
  uVar11 = param_3[3] >> 0x20;
  uVar18 = param_2[3] & 0xffffffff;
  uVar12 = param_2[3] >> 0x20;
  uVar20 = param_3[2] & 0xffffffff;
  uVar8 = param_3[2] >> 0x20;
  uVar22 = uVar11 * uVar13;
  uVar13 = uVar16 * uVar13;
  uVar16 = uVar16 * uVar7;
  uVar9 = uVar8 * uVar18;
  uVar18 = uVar20 * uVar18;
  uVar20 = uVar20 * uVar12;
  uVar5 = uVar22 + uVar16;
  uVar2 = uVar5 << 0x20;
  uVar6 = uVar13 + uVar2;
  uVar5 = uVar11 * uVar7 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar22,uVar16) << 0x20);
  if (CARRY8(uVar13,uVar2)) {
    uVar5 = uVar5 + 1;
  }
  uVar2 = uVar1 + uVar6;
  if (CARRY8(uVar1,uVar6)) {
    uVar5 = uVar5 + 1;
  }
  uVar6 = uVar9 + uVar20;
  uVar1 = uVar6 << 0x20;
  uVar7 = uVar18 + uVar1;
  uVar6 = uVar8 * uVar12 + (uVar6 >> 0x20) + ((ulong)CARRY8(uVar9,uVar20) << 0x20);
  if (CARRY8(uVar18,uVar1)) {
    uVar6 = uVar6 + 1;
  }
  param_1[5] = uVar2 + uVar7;
  if (CARRY8(uVar2,uVar7)) {
    uVar6 = uVar6 + 1;
  }
  uVar9 = param_2[3] & 0xffffffff;
  uVar8 = param_2[3] >> 0x20;
  uVar12 = param_3[3] & 0xffffffff;
  uVar11 = param_3[3] >> 0x20;
  uVar13 = uVar11 * uVar9;
  uVar9 = uVar12 * uVar9;
  uVar12 = uVar12 * uVar8;
  uVar2 = uVar13 + uVar12;
  uVar1 = uVar2 << 0x20;
  uVar7 = uVar9 + uVar1;
  lVar4 = uVar11 * uVar8 + (uVar2 >> 0x20) + ((ulong)CARRY8(uVar13,uVar12) << 0x20);
  if (CARRY8(uVar9,uVar1)) {
    lVar4 = lVar4 + 1;
  }
  if (CARRY8(uVar10,uVar5)) {
    lVar4 = lVar4 + 1;
  }
  uVar1 = uVar10 + uVar5 + uVar6;
  if (CARRY8(uVar10 + uVar5,uVar6)) {
    lVar4 = lVar4 + 1;
  }
  if (CARRY8(uVar1,uVar7)) {
    lVar4 = lVar4 + 1;
  }
  param_1[6] = uVar1 + uVar7;
  param_1[7] = lVar4;
  return;
}

