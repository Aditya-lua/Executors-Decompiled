/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a05390
 */

void bn_mul_comba8(long *param_1,ulong *param_2,ulong *param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
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
  ulong uVar27;
  ulong uVar28;
  ulong uVar29;
  ulong uVar30;
  ulong uVar31;
  ulong uVar32;
  ulong uVar33;
  ulong uVar34;
  ulong uVar35;
  ulong uVar36;
  ulong uVar37;
  ulong uVar38;
  ulong uVar39;
  ulong uVar40;
  ulong uVar41;
  ulong uVar42;
  ulong uVar43;
  ulong uVar44;
  ulong uVar45;
  ulong uVar46;
  
  uVar9 = *param_2 & 0xffffffff;
  uVar7 = *param_2 >> 0x20;
  uVar10 = *param_3 & 0xffffffff;
  uVar8 = *param_3 >> 0x20;
  uVar13 = uVar8 * uVar9;
  uVar9 = uVar10 * uVar9;
  uVar10 = uVar10 * uVar7;
  uVar5 = uVar13 + uVar10;
  uVar1 = uVar5 << 0x20;
  *param_1 = uVar9 + uVar1;
  uVar5 = uVar8 * uVar7 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar13,uVar10) << 0x20);
  if (CARRY8(uVar9,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  uVar17 = *param_2 & 0xffffffff;
  uVar10 = *param_2 >> 0x20;
  uVar23 = param_3[1] & 0xffffffff;
  uVar11 = param_3[1] >> 0x20;
  uVar26 = param_2[1] & 0xffffffff;
  uVar14 = param_2[1] >> 0x20;
  uVar28 = *param_3 & 0xffffffff;
  uVar13 = *param_3 >> 0x20;
  uVar32 = uVar11 * uVar17;
  uVar17 = uVar23 * uVar17;
  uVar23 = uVar23 * uVar10;
  uVar12 = uVar13 * uVar26;
  uVar26 = uVar28 * uVar26;
  uVar28 = uVar28 * uVar14;
  uVar7 = uVar32 + uVar23;
  uVar8 = uVar12 + uVar28;
  uVar1 = uVar8 << 0x20;
  uVar9 = uVar26 + uVar1;
  uVar8 = uVar13 * uVar14 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar12,uVar28) << 0x20);
  uVar10 = uVar11 * uVar10 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar32,uVar23) << 0x20);
  if (CARRY8(uVar26,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar7 << 0x20;
  uVar1 = uVar17 + uVar7;
  if (CARRY8(uVar17,uVar7)) {
    uVar10 = uVar10 + 1;
  }
  uVar7 = uVar5 + uVar1;
  if (CARRY8(uVar5,uVar1)) {
    uVar10 = uVar10 + 1;
  }
  if (CARRY8(uVar7,uVar9)) {
    uVar8 = uVar8 + 1;
  }
  param_1[1] = uVar7 + uVar9;
  uVar29 = param_2[2] & 0xffffffff;
  uVar17 = param_2[2] >> 0x20;
  uVar33 = *param_3 & 0xffffffff;
  uVar28 = *param_3 >> 0x20;
  uVar9 = param_2[1] & 0xffffffff;
  uVar26 = param_2[1] >> 0x20;
  uVar13 = param_3[1] & 0xffffffff;
  uVar18 = param_3[1] >> 0x20;
  uVar11 = *param_2 & 0xffffffff;
  uVar23 = *param_2 >> 0x20;
  uVar12 = param_3[2] & 0xffffffff;
  uVar24 = param_3[2] >> 0x20;
  uVar14 = uVar28 * uVar29;
  uVar29 = uVar33 * uVar29;
  uVar33 = uVar33 * uVar17;
  uVar27 = (ulong)CARRY8(uVar10,uVar8);
  uVar32 = uVar18 * uVar9;
  uVar9 = uVar13 * uVar9;
  uVar13 = uVar13 * uVar26;
  uVar19 = uVar24 * uVar11;
  uVar11 = uVar12 * uVar11;
  uVar12 = uVar12 * uVar23;
  uVar5 = uVar14 + uVar33;
  uVar1 = uVar5 << 0x20;
  uVar7 = uVar29 + uVar1;
  uVar5 = uVar28 * uVar17 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar14,uVar33) << 0x20);
  if (CARRY8(uVar29,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  uVar1 = uVar10 + uVar8 + uVar7;
  if (CARRY8(uVar10 + uVar8,uVar7)) {
    uVar5 = uVar5 + 1;
  }
  uVar8 = uVar32 + uVar13;
  uVar7 = uVar8 << 0x20;
  uVar10 = uVar9 + uVar7;
  uVar8 = uVar18 * uVar26 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar32,uVar13) << 0x20);
  if (CARRY8(uVar9,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar1 + uVar10;
  if (CARRY8(uVar1,uVar10)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = 2;
  if (!CARRY8(uVar5,uVar27)) {
    uVar1 = 1;
  }
  uVar9 = uVar5 + uVar27 + uVar8;
  uVar10 = (ulong)CARRY8(uVar5,uVar27);
  if (CARRY8(uVar5 + uVar27,uVar8)) {
    uVar10 = uVar1;
  }
  uVar5 = uVar19 + uVar12;
  uVar1 = uVar5 << 0x20;
  uVar8 = uVar11 + uVar1;
  uVar5 = uVar24 * uVar23 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar19,uVar12) << 0x20);
  if (CARRY8(uVar11,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  if (CARRY8(uVar7,uVar8)) {
    uVar5 = uVar5 + 1;
  }
  param_1[2] = uVar7 + uVar8;
  uVar1 = uVar9 + uVar5;
  uVar8 = param_3[3] & 0xffffffff;
  uVar7 = *param_2 & 0xffffffff;
  uVar23 = *param_2 >> 0x20;
  uVar17 = param_3[3] >> 0x20;
  uVar13 = param_2[1] & 0xffffffff;
  uVar26 = param_2[1] >> 0x20;
  uVar11 = param_3[2] & 0xffffffff;
  uVar14 = param_3[2] >> 0x20;
  uVar12 = param_2[2] & 0xffffffff;
  uVar18 = param_2[2] >> 0x20;
  uVar24 = param_3[1] & 0xffffffff;
  uVar32 = param_3[1] >> 0x20;
  uVar27 = param_2[3] & 0xffffffff;
  uVar19 = param_2[3] >> 0x20;
  uVar29 = *param_3 & 0xffffffff;
  uVar28 = *param_3 >> 0x20;
  uVar33 = uVar17 * uVar7;
  uVar7 = uVar8 * uVar7;
  uVar8 = uVar8 * uVar23;
  if (CARRY8(uVar9,uVar5)) {
    uVar10 = uVar10 + 1;
  }
  uVar15 = uVar14 * uVar13;
  uVar13 = uVar11 * uVar13;
  uVar11 = uVar11 * uVar26;
  uVar20 = uVar32 * uVar12;
  uVar12 = uVar24 * uVar12;
  uVar24 = uVar24 * uVar18;
  uVar30 = uVar28 * uVar27;
  uVar27 = uVar29 * uVar27;
  uVar29 = uVar29 * uVar19;
  uVar9 = uVar33 + uVar8;
  uVar5 = uVar9 << 0x20;
  uVar36 = uVar7 + uVar5;
  uVar8 = uVar17 * uVar23 + (uVar9 >> 0x20) + ((ulong)CARRY8(uVar33,uVar8) << 0x20);
  if (CARRY8(uVar7,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar5 = uVar1 + uVar36;
  if (CARRY8(uVar1,uVar36)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar15 + uVar11;
  uVar1 = uVar7 << 0x20;
  uVar9 = uVar13 + uVar1;
  uVar7 = uVar14 * uVar26 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar15,uVar11) << 0x20);
  if (CARRY8(uVar13,uVar1)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = uVar5 + uVar9;
  if (CARRY8(uVar5,uVar9)) {
    uVar7 = uVar7 + 1;
  }
  uVar5 = 2;
  if (!CARRY8(uVar10,uVar8)) {
    uVar5 = 1;
  }
  uVar9 = uVar10 + uVar8 + uVar7;
  uVar13 = (ulong)CARRY8(uVar10,uVar8);
  if (CARRY8(uVar10 + uVar8,uVar7)) {
    uVar13 = uVar5;
  }
  uVar7 = uVar20 + uVar24;
  uVar5 = uVar7 << 0x20;
  uVar8 = uVar12 + uVar5;
  uVar7 = uVar32 * uVar18 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar20,uVar24) << 0x20);
  if (CARRY8(uVar12,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  uVar5 = uVar1 + uVar8;
  if (CARRY8(uVar1,uVar8)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = uVar9 + uVar7;
  if (CARRY8(uVar9,uVar7)) {
    uVar13 = uVar13 + 1;
  }
  uVar8 = uVar30 + uVar29;
  uVar7 = uVar8 << 0x20;
  uVar9 = uVar27 + uVar7;
  uVar8 = uVar28 * uVar19 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar30,uVar29) << 0x20);
  if (CARRY8(uVar27,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  if (CARRY8(uVar5,uVar9)) {
    uVar8 = uVar8 + 1;
  }
  param_1[3] = uVar5 + uVar9;
  uVar5 = uVar8 + uVar1;
  uVar10 = param_2[4] & 0xffffffff;
  uVar14 = param_2[4] >> 0x20;
  uVar11 = *param_3 & 0xffffffff;
  uVar26 = *param_3 >> 0x20;
  uVar12 = param_2[3] & 0xffffffff;
  uVar23 = param_2[3] >> 0x20;
  uVar24 = param_3[1] & 0xffffffff;
  uVar28 = param_3[1] >> 0x20;
  uVar27 = param_2[2] & 0xffffffff;
  uVar17 = param_2[2] >> 0x20;
  uVar29 = param_3[2] & 0xffffffff;
  uVar19 = param_3[2] >> 0x20;
  uVar33 = param_2[1] & 0xffffffff;
  uVar18 = param_2[1] >> 0x20;
  uVar36 = param_3[3] & 0xffffffff;
  uVar7 = param_3[3] >> 0x20;
  uVar15 = *param_2 & 0xffffffff;
  uVar32 = *param_2 >> 0x20;
  uVar20 = param_3[4] & 0xffffffff;
  uVar9 = param_3[4] >> 0x20;
  uVar30 = uVar26 * uVar10;
  uVar10 = uVar11 * uVar10;
  uVar11 = uVar11 * uVar14;
  if (CARRY8(uVar8,uVar1)) {
    uVar13 = uVar13 + 1;
  }
  uVar21 = uVar28 * uVar12;
  uVar12 = uVar24 * uVar12;
  uVar24 = uVar24 * uVar23;
  uVar25 = uVar19 * uVar27;
  uVar27 = uVar29 * uVar27;
  uVar29 = uVar29 * uVar17;
  uVar34 = uVar7 * uVar33;
  uVar33 = uVar36 * uVar33;
  uVar36 = uVar36 * uVar18;
  uVar4 = uVar9 * uVar15;
  uVar15 = uVar20 * uVar15;
  uVar20 = uVar20 * uVar32;
  uVar8 = uVar30 + uVar11;
  uVar1 = uVar8 << 0x20;
  uVar37 = uVar10 + uVar1;
  uVar8 = uVar26 * uVar14 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar30,uVar11) << 0x20);
  if (CARRY8(uVar10,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar5 + uVar37;
  if (CARRY8(uVar5,uVar37)) {
    uVar8 = uVar8 + 1;
  }
  uVar10 = uVar21 + uVar24;
  uVar5 = uVar10 << 0x20;
  uVar11 = uVar12 + uVar5;
  uVar10 = uVar28 * uVar23 + (uVar10 >> 0x20) + ((ulong)CARRY8(uVar21,uVar24) << 0x20);
  if (CARRY8(uVar12,uVar5)) {
    uVar10 = uVar10 + 1;
  }
  uVar5 = uVar1 + uVar11;
  if (CARRY8(uVar1,uVar11)) {
    uVar10 = uVar10 + 1;
  }
  uVar1 = 2;
  if (!CARRY8(uVar13,uVar8)) {
    uVar1 = 1;
  }
  uVar11 = uVar13 + uVar8 + uVar10;
  uVar12 = (ulong)CARRY8(uVar13,uVar8);
  if (CARRY8(uVar13 + uVar8,uVar10)) {
    uVar12 = uVar1;
  }
  uVar8 = uVar25 + uVar29;
  uVar1 = uVar8 << 0x20;
  uVar10 = uVar27 + uVar1;
  uVar8 = uVar19 * uVar17 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar25,uVar29) << 0x20);
  if (CARRY8(uVar27,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar5 + uVar10;
  if (CARRY8(uVar5,uVar10)) {
    uVar8 = uVar8 + 1;
  }
  uVar5 = uVar11 + uVar8;
  if (CARRY8(uVar11,uVar8)) {
    uVar12 = uVar12 + 1;
  }
  uVar10 = uVar34 + uVar36;
  uVar8 = uVar10 << 0x20;
  uVar13 = uVar33 + uVar8;
  uVar7 = uVar7 * uVar18 + (uVar10 >> 0x20) + ((ulong)CARRY8(uVar34,uVar36) << 0x20);
  if (CARRY8(uVar33,uVar8)) {
    uVar7 = uVar7 + 1;
  }
  uVar8 = uVar1 + uVar13;
  if (CARRY8(uVar1,uVar13)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = uVar7 + uVar5;
  if (CARRY8(uVar7,uVar5)) {
    uVar12 = uVar12 + 1;
  }
  uVar7 = uVar4 + uVar20;
  uVar5 = uVar7 << 0x20;
  uVar10 = uVar15 + uVar5;
  uVar7 = uVar9 * uVar32 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar4,uVar20) << 0x20);
  if (CARRY8(uVar15,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  if (CARRY8(uVar10,uVar8)) {
    uVar7 = uVar7 + 1;
  }
  param_1[4] = uVar10 + uVar8;
  uVar5 = uVar7 + uVar1;
  uVar11 = *param_2 & 0xffffffff;
  uVar26 = *param_2 >> 0x20;
  uVar24 = param_3[5] & 0xffffffff;
  uVar17 = param_3[5] >> 0x20;
  uVar27 = param_2[1] & 0xffffffff;
  uVar23 = param_2[1] >> 0x20;
  uVar29 = param_3[4] & 0xffffffff;
  uVar14 = param_3[4] >> 0x20;
  uVar33 = param_2[2] & 0xffffffff;
  uVar18 = param_2[2] >> 0x20;
  uVar36 = param_3[3] & 0xffffffff;
  uVar32 = param_3[3] >> 0x20;
  uVar15 = param_2[3] & 0xffffffff;
  uVar19 = param_2[3] >> 0x20;
  uVar20 = param_3[2] & 0xffffffff;
  uVar28 = param_3[2] >> 0x20;
  uVar30 = param_2[4] & 0xffffffff;
  uVar10 = param_2[4] >> 0x20;
  uVar37 = param_3[1] & 0xffffffff;
  uVar9 = param_3[1] >> 0x20;
  uVar4 = param_2[5] & 0xffffffff;
  uVar13 = param_2[5] >> 0x20;
  uVar21 = *param_3 & 0xffffffff;
  uVar8 = *param_3 >> 0x20;
  uVar25 = uVar17 * uVar11;
  uVar11 = uVar24 * uVar11;
  uVar24 = uVar24 * uVar26;
  if (CARRY8(uVar7,uVar1)) {
    uVar12 = uVar12 + 1;
  }
  uVar22 = uVar14 * uVar27;
  uVar27 = uVar29 * uVar27;
  uVar29 = uVar29 * uVar23;
  uVar16 = uVar32 * uVar33;
  uVar33 = uVar36 * uVar33;
  uVar36 = uVar36 * uVar18;
  uVar31 = uVar28 * uVar15;
  uVar15 = uVar20 * uVar15;
  uVar20 = uVar20 * uVar19;
  uVar35 = uVar9 * uVar30;
  uVar30 = uVar37 * uVar30;
  uVar37 = uVar37 * uVar10;
  uVar6 = uVar8 * uVar4;
  uVar4 = uVar21 * uVar4;
  uVar21 = uVar21 * uVar13;
  uVar7 = uVar25 + uVar24;
  uVar1 = uVar7 << 0x20;
  uVar34 = uVar11 + uVar1;
  uVar7 = uVar17 * uVar26 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar25,uVar24) << 0x20);
  if (CARRY8(uVar11,uVar1)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = uVar5 + uVar34;
  if (CARRY8(uVar5,uVar34)) {
    uVar7 = uVar7 + 1;
  }
  uVar11 = uVar22 + uVar29;
  uVar5 = uVar11 << 0x20;
  uVar17 = uVar27 + uVar5;
  uVar11 = uVar14 * uVar23 + (uVar11 >> 0x20) + ((ulong)CARRY8(uVar22,uVar29) << 0x20);
  if (CARRY8(uVar27,uVar5)) {
    uVar11 = uVar11 + 1;
  }
  uVar5 = uVar1 + uVar17;
  if (CARRY8(uVar1,uVar17)) {
    uVar11 = uVar11 + 1;
  }
  uVar1 = 2;
  if (!CARRY8(uVar12,uVar7)) {
    uVar1 = 1;
  }
  uVar14 = uVar12 + uVar7 + uVar11;
  uVar17 = (ulong)CARRY8(uVar12,uVar7);
  if (CARRY8(uVar12 + uVar7,uVar11)) {
    uVar17 = uVar1;
  }
  uVar7 = uVar16 + uVar36;
  uVar1 = uVar7 << 0x20;
  uVar11 = uVar33 + uVar1;
  uVar7 = uVar32 * uVar18 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar16,uVar36) << 0x20);
  if (CARRY8(uVar33,uVar1)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = uVar5 + uVar11;
  if (CARRY8(uVar5,uVar11)) {
    uVar7 = uVar7 + 1;
  }
  uVar5 = uVar14 + uVar7;
  if (CARRY8(uVar14,uVar7)) {
    uVar17 = uVar17 + 1;
  }
  uVar11 = uVar31 + uVar20;
  uVar7 = uVar11 << 0x20;
  uVar12 = uVar15 + uVar7;
  uVar11 = uVar28 * uVar19 + (uVar11 >> 0x20) + ((ulong)CARRY8(uVar31,uVar20) << 0x20);
  if (CARRY8(uVar15,uVar7)) {
    uVar11 = uVar11 + 1;
  }
  uVar7 = uVar1 + uVar12;
  if (CARRY8(uVar1,uVar12)) {
    uVar11 = uVar11 + 1;
  }
  uVar1 = uVar11 + uVar5;
  if (CARRY8(uVar11,uVar5)) {
    uVar17 = uVar17 + 1;
  }
  uVar11 = uVar35 + uVar37;
  uVar5 = uVar11 << 0x20;
  uVar12 = uVar30 + uVar5;
  uVar9 = uVar9 * uVar10 + (uVar11 >> 0x20) + ((ulong)CARRY8(uVar35,uVar37) << 0x20);
  if (CARRY8(uVar30,uVar5)) {
    uVar9 = uVar9 + 1;
  }
  uVar5 = uVar12 + uVar7;
  if (CARRY8(uVar12,uVar7)) {
    uVar9 = uVar9 + 1;
  }
  uVar7 = uVar9 + uVar1;
  if (CARRY8(uVar9,uVar1)) {
    uVar17 = uVar17 + 1;
  }
  uVar9 = uVar6 + uVar21;
  uVar1 = uVar9 << 0x20;
  uVar10 = uVar4 + uVar1;
  uVar8 = uVar8 * uVar13 + (uVar9 >> 0x20) + ((ulong)CARRY8(uVar6,uVar21) << 0x20);
  if (CARRY8(uVar4,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  if (CARRY8(uVar10,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar8 + uVar7;
  param_1[5] = uVar10 + uVar5;
  uVar23 = param_2[6] & 0xffffffff;
  uVar18 = param_2[6] >> 0x20;
  uVar21 = *param_3 & 0xffffffff;
  uVar27 = *param_3 >> 0x20;
  uVar25 = param_2[5] & 0xffffffff;
  uVar24 = param_2[5] >> 0x20;
  uVar34 = param_3[1] & 0xffffffff;
  uVar33 = param_3[1] >> 0x20;
  uVar6 = param_2[4] & 0xffffffff;
  uVar19 = param_2[4] >> 0x20;
  uVar16 = param_3[2] & 0xffffffff;
  uVar37 = param_3[2] >> 0x20;
  uVar22 = param_2[3] & 0xffffffff;
  uVar30 = param_2[3] >> 0x20;
  uVar31 = param_3[3] & 0xffffffff;
  uVar5 = param_3[3] >> 0x20;
  uVar35 = param_2[2] & 0xffffffff;
  uVar15 = param_2[2] >> 0x20;
  uVar38 = param_3[4] & 0xffffffff;
  uVar13 = param_3[4] >> 0x20;
  uVar40 = param_2[1] & 0xffffffff;
  uVar10 = param_2[1] >> 0x20;
  uVar42 = param_3[5] & 0xffffffff;
  uVar12 = param_3[5] >> 0x20;
  uVar45 = uVar27 * uVar23;
  uVar23 = uVar21 * uVar23;
  uVar21 = uVar21 * uVar18;
  uVar29 = uVar33 * uVar25;
  uVar25 = uVar34 * uVar25;
  uVar34 = uVar34 * uVar24;
  uVar36 = uVar37 * uVar6;
  uVar6 = uVar16 * uVar6;
  uVar16 = uVar16 * uVar19;
  uVar4 = uVar5 * uVar22;
  uVar22 = uVar31 * uVar22;
  uVar31 = uVar31 * uVar30;
  uVar9 = uVar13 * uVar35;
  uVar11 = uVar12 * uVar40;
  uVar40 = uVar42 * uVar40;
  uVar42 = uVar42 * uVar10;
  uVar14 = *param_2 & 0xffffffff;
  uVar32 = *param_2 >> 0x20;
  uVar26 = param_3[6] & 0xffffffff;
  uVar28 = param_3[6] >> 0x20;
  uVar35 = uVar38 * uVar35;
  uVar38 = uVar38 * uVar15;
  uVar20 = uVar28 * uVar14;
  uVar14 = uVar26 * uVar14;
  uVar26 = uVar26 * uVar32;
  if (CARRY8(uVar8,uVar7)) {
    uVar17 = uVar17 + 1;
  }
  uVar8 = uVar45 + uVar21;
  uVar7 = uVar8 << 0x20;
  uVar39 = uVar23 + uVar7;
  uVar8 = uVar27 * uVar18 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar45,uVar21) << 0x20);
  if (CARRY8(uVar23,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar1 + uVar39;
  if (CARRY8(uVar1,uVar39)) {
    uVar8 = uVar8 + 1;
  }
  uVar23 = uVar29 + uVar34;
  uVar1 = uVar23 << 0x20;
  uVar18 = uVar25 + uVar1;
  uVar23 = uVar33 * uVar24 + (uVar23 >> 0x20) + ((ulong)CARRY8(uVar29,uVar34) << 0x20);
  if (CARRY8(uVar25,uVar1)) {
    uVar23 = uVar23 + 1;
  }
  uVar1 = uVar7 + uVar18;
  if (CARRY8(uVar7,uVar18)) {
    uVar23 = uVar23 + 1;
  }
  uVar7 = 2;
  if (!CARRY8(uVar17,uVar8)) {
    uVar7 = 1;
  }
  uVar18 = uVar17 + uVar8 + uVar23;
  uVar24 = (ulong)CARRY8(uVar17,uVar8);
  if (CARRY8(uVar17 + uVar8,uVar23)) {
    uVar24 = uVar7;
  }
  uVar8 = uVar36 + uVar16;
  uVar7 = uVar8 << 0x20;
  uVar17 = uVar6 + uVar7;
  uVar8 = uVar37 * uVar19 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar36,uVar16) << 0x20);
  if (CARRY8(uVar6,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar1 + uVar17;
  if (CARRY8(uVar1,uVar17)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar18 + uVar8;
  if (CARRY8(uVar18,uVar8)) {
    uVar24 = uVar24 + 1;
  }
  uVar17 = uVar4 + uVar31;
  uVar8 = uVar17 << 0x20;
  uVar23 = uVar22 + uVar8;
  uVar5 = uVar5 * uVar30 + (uVar17 >> 0x20) + ((ulong)CARRY8(uVar4,uVar31) << 0x20);
  if (CARRY8(uVar22,uVar8)) {
    uVar5 = uVar5 + 1;
  }
  uVar8 = uVar7 + uVar23;
  if (CARRY8(uVar7,uVar23)) {
    uVar5 = uVar5 + 1;
  }
  uVar7 = uVar5 + uVar1;
  if (CARRY8(uVar5,uVar1)) {
    uVar24 = uVar24 + 1;
  }
  uVar5 = uVar9 + uVar38;
  uVar1 = uVar5 << 0x20;
  uVar17 = uVar35 + uVar1;
  uVar5 = uVar13 * uVar15 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar9,uVar38) << 0x20);
  if (CARRY8(uVar35,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  uVar1 = uVar17 + uVar8;
  if (CARRY8(uVar17,uVar8)) {
    uVar5 = uVar5 + 1;
  }
  uVar8 = uVar5 + uVar7;
  if (CARRY8(uVar5,uVar7)) {
    uVar24 = uVar24 + 1;
  }
  uVar7 = uVar11 + uVar42;
  uVar5 = uVar7 << 0x20;
  uVar9 = uVar40 + uVar5;
  uVar7 = uVar12 * uVar10 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar11,uVar42) << 0x20);
  if (CARRY8(uVar40,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  uVar5 = uVar9 + uVar1;
  if (CARRY8(uVar9,uVar1)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = uVar7 + uVar8;
  if (CARRY8(uVar7,uVar8)) {
    uVar24 = uVar24 + 1;
  }
  uVar8 = uVar20 + uVar26;
  uVar7 = uVar8 << 0x20;
  uVar9 = uVar14 + uVar7;
  uVar8 = uVar28 * uVar32 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar20,uVar26) << 0x20);
  if (CARRY8(uVar14,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  if (CARRY8(uVar9,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar8 + uVar1;
  param_1[6] = uVar9 + uVar5;
  uVar17 = param_2[1] & 0xffffffff;
  uVar16 = param_3[6] & 0xffffffff;
  uVar33 = param_3[6] >> 0x20;
  uVar18 = uVar33 * uVar17;
  uVar22 = param_2[2] & 0xffffffff;
  uVar21 = param_2[2] >> 0x20;
  uVar31 = param_3[5] & 0xffffffff;
  uVar4 = param_3[5] >> 0x20;
  uVar35 = param_2[3] & 0xffffffff;
  uVar34 = param_2[3] >> 0x20;
  uVar38 = param_3[4] & 0xffffffff;
  uVar23 = param_3[4] >> 0x20;
  uVar40 = param_2[4] & 0xffffffff;
  uVar42 = param_3[3] & 0xffffffff;
  uVar5 = param_3[3] >> 0x20;
  uVar17 = uVar16 * uVar17;
  uVar19 = uVar4 * uVar22;
  uVar22 = uVar31 * uVar22;
  uVar31 = uVar31 * uVar21;
  uVar25 = uVar23 * uVar35;
  uVar35 = uVar38 * uVar35;
  uVar38 = uVar38 * uVar34;
  uVar26 = uVar5 * uVar40;
  uVar9 = param_2[4] >> 0x20;
  uVar45 = param_2[5] & 0xffffffff;
  uVar13 = param_2[5] >> 0x20;
  uVar39 = param_3[2] & 0xffffffff;
  uVar6 = param_3[2] >> 0x20;
  uVar40 = uVar42 * uVar40;
  uVar42 = uVar42 * uVar9;
  uVar10 = uVar6 * uVar45;
  uVar45 = uVar39 * uVar45;
  uVar39 = uVar39 * uVar13;
  uVar12 = *param_2 & 0xffffffff;
  uVar37 = *param_2 >> 0x20;
  uVar14 = param_3[7] & 0xffffffff;
  uVar15 = param_3[7] >> 0x20;
  uVar30 = param_2[1] >> 0x20;
  uVar27 = param_2[6] & 0xffffffff;
  uVar28 = param_3[1] & 0xffffffff;
  uVar11 = param_3[1] >> 0x20;
  uVar41 = uVar15 * uVar12;
  uVar12 = uVar14 * uVar12;
  uVar14 = uVar14 * uVar37;
  uVar16 = uVar16 * uVar30;
  uVar20 = uVar11 * uVar27;
  uVar27 = uVar28 * uVar27;
  uVar43 = param_2[6] >> 0x20;
  uVar28 = uVar28 * uVar43;
  uVar44 = param_2[7] & 0xffffffff;
  uVar46 = param_2[7] >> 0x20;
  uVar32 = *param_3 & 0xffffffff;
  uVar29 = *param_3 >> 0x20;
  uVar36 = uVar29 * uVar44;
  uVar44 = uVar32 * uVar44;
  uVar32 = uVar32 * uVar46;
  if (CARRY8(uVar8,uVar1)) {
    uVar24 = uVar24 + 1;
  }
  uVar8 = uVar41 + uVar14;
  uVar1 = uVar8 << 0x20;
  uVar2 = uVar12 + uVar1;
  uVar8 = uVar15 * uVar37 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar41,uVar14) << 0x20);
  if (CARRY8(uVar12,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar7 + uVar2;
  if (CARRY8(uVar7,uVar2)) {
    uVar8 = uVar8 + 1;
  }
  uVar12 = uVar18 + uVar16;
  uVar7 = uVar12 << 0x20;
  uVar14 = uVar17 + uVar7;
  uVar12 = uVar33 * uVar30 + (uVar12 >> 0x20) + ((ulong)CARRY8(uVar18,uVar16) << 0x20);
  if (CARRY8(uVar17,uVar7)) {
    uVar12 = uVar12 + 1;
  }
  uVar7 = uVar1 + uVar14;
  if (CARRY8(uVar1,uVar14)) {
    uVar12 = uVar12 + 1;
  }
  uVar1 = 2;
  if (!CARRY8(uVar24,uVar8)) {
    uVar1 = 1;
  }
  uVar14 = uVar24 + uVar8 + uVar12;
  uVar17 = (ulong)CARRY8(uVar24,uVar8);
  if (CARRY8(uVar24 + uVar8,uVar12)) {
    uVar17 = uVar1;
  }
  uVar8 = uVar19 + uVar31;
  uVar1 = uVar8 << 0x20;
  uVar12 = uVar22 + uVar1;
  uVar8 = uVar4 * uVar21 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar19,uVar31) << 0x20);
  if (CARRY8(uVar22,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar7 + uVar12;
  if (CARRY8(uVar7,uVar12)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar14 + uVar8;
  if (CARRY8(uVar14,uVar8)) {
    uVar17 = uVar17 + 1;
  }
  uVar12 = uVar25 + uVar38;
  uVar8 = uVar12 << 0x20;
  uVar14 = uVar35 + uVar8;
  uVar12 = uVar23 * uVar34 + (uVar12 >> 0x20) + ((ulong)CARRY8(uVar25,uVar38) << 0x20);
  if (CARRY8(uVar35,uVar8)) {
    uVar12 = uVar12 + 1;
  }
  uVar8 = uVar1 + uVar14;
  if (CARRY8(uVar1,uVar14)) {
    uVar12 = uVar12 + 1;
  }
  uVar1 = uVar12 + uVar7;
  if (CARRY8(uVar12,uVar7)) {
    uVar17 = uVar17 + 1;
  }
  uVar12 = uVar26 + uVar42;
  uVar7 = uVar12 << 0x20;
  uVar14 = uVar40 + uVar7;
  uVar5 = uVar5 * uVar9 + (uVar12 >> 0x20) + ((ulong)CARRY8(uVar26,uVar42) << 0x20);
  if (CARRY8(uVar40,uVar7)) {
    uVar5 = uVar5 + 1;
  }
  uVar7 = uVar14 + uVar8;
  if (CARRY8(uVar14,uVar8)) {
    uVar5 = uVar5 + 1;
  }
  uVar8 = uVar5 + uVar1;
  if (CARRY8(uVar5,uVar1)) {
    uVar17 = uVar17 + 1;
  }
  uVar5 = uVar10 + uVar39;
  uVar1 = uVar5 << 0x20;
  uVar9 = uVar45 + uVar1;
  uVar5 = uVar6 * uVar13 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar10,uVar39) << 0x20);
  if (CARRY8(uVar45,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  uVar1 = uVar9 + uVar7;
  if (CARRY8(uVar9,uVar7)) {
    uVar5 = uVar5 + 1;
  }
  uVar7 = uVar5 + uVar8;
  if (CARRY8(uVar5,uVar8)) {
    uVar17 = uVar17 + 1;
  }
  uVar8 = uVar20 + uVar28;
  uVar5 = uVar8 << 0x20;
  uVar9 = uVar27 + uVar5;
  uVar8 = uVar11 * uVar43 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar20,uVar28) << 0x20);
  if (CARRY8(uVar27,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar5 = uVar9 + uVar1;
  if (CARRY8(uVar9,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar8 + uVar7;
  if (CARRY8(uVar8,uVar7)) {
    uVar17 = uVar17 + 1;
  }
  uVar8 = uVar36 + uVar32;
  uVar7 = uVar8 << 0x20;
  uVar9 = uVar44 + uVar7;
  uVar8 = uVar29 * uVar46 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar36,uVar32) << 0x20);
  if (CARRY8(uVar44,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  if (CARRY8(uVar9,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar8 + uVar1;
  param_1[7] = uVar9 + uVar5;
  uVar12 = param_2[7] & 0xffffffff;
  uVar18 = param_2[7] >> 0x20;
  uVar14 = param_3[1] & 0xffffffff;
  uVar24 = param_3[1] >> 0x20;
  uVar23 = param_2[6] & 0xffffffff;
  uVar19 = param_2[6] >> 0x20;
  uVar21 = param_3[2] & 0xffffffff;
  uVar29 = param_3[2] >> 0x20;
  uVar25 = param_2[5] & 0xffffffff;
  uVar26 = param_2[5] >> 0x20;
  uVar34 = param_3[3] & 0xffffffff;
  uVar20 = param_3[3] >> 0x20;
  uVar6 = param_2[4] & 0xffffffff;
  uVar15 = param_2[4] >> 0x20;
  uVar16 = param_3[4] & 0xffffffff;
  uVar37 = param_3[4] >> 0x20;
  uVar22 = param_2[3] & 0xffffffff;
  uVar36 = param_2[3] >> 0x20;
  uVar31 = param_3[5] & 0xffffffff;
  uVar9 = param_3[5] >> 0x20;
  uVar35 = param_2[2] & 0xffffffff;
  uVar5 = param_2[2] >> 0x20;
  uVar38 = param_3[6] & 0xffffffff;
  uVar13 = param_3[6] >> 0x20;
  uVar40 = uVar24 * uVar12;
  uVar12 = uVar14 * uVar12;
  uVar14 = uVar14 * uVar18;
  uVar27 = uVar29 * uVar23;
  uVar23 = uVar21 * uVar23;
  uVar21 = uVar21 * uVar19;
  uVar33 = uVar20 * uVar25;
  uVar25 = uVar34 * uVar25;
  uVar34 = uVar34 * uVar26;
  uVar30 = uVar37 * uVar6;
  uVar6 = uVar16 * uVar6;
  uVar16 = uVar16 * uVar15;
  uVar4 = uVar9 * uVar22;
  uVar22 = uVar31 * uVar22;
  uVar31 = uVar31 * uVar36;
  uVar10 = uVar13 * uVar35;
  uVar35 = uVar38 * uVar35;
  uVar38 = uVar38 * uVar5;
  uVar11 = param_2[1] & 0xffffffff;
  uVar42 = param_2[1] >> 0x20;
  uVar28 = param_3[7] & 0xffffffff;
  uVar45 = param_3[7] >> 0x20;
  uVar32 = uVar45 * uVar11;
  uVar11 = uVar28 * uVar11;
  uVar28 = uVar28 * uVar42;
  if (CARRY8(uVar8,uVar1)) {
    uVar17 = uVar17 + 1;
  }
  uVar8 = uVar40 + uVar14;
  uVar1 = uVar8 << 0x20;
  uVar39 = uVar12 + uVar1;
  uVar8 = uVar24 * uVar18 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar40,uVar14) << 0x20);
  if (CARRY8(uVar12,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar7 + uVar39;
  if (CARRY8(uVar7,uVar39)) {
    uVar8 = uVar8 + 1;
  }
  uVar12 = uVar27 + uVar21;
  uVar7 = uVar12 << 0x20;
  uVar14 = uVar23 + uVar7;
  uVar12 = uVar29 * uVar19 + (uVar12 >> 0x20) + ((ulong)CARRY8(uVar27,uVar21) << 0x20);
  if (CARRY8(uVar23,uVar7)) {
    uVar12 = uVar12 + 1;
  }
  uVar7 = uVar1 + uVar14;
  if (CARRY8(uVar1,uVar14)) {
    uVar12 = uVar12 + 1;
  }
  uVar1 = 2;
  if (!CARRY8(uVar17,uVar8)) {
    uVar1 = 1;
  }
  uVar14 = uVar17 + uVar8 + uVar12;
  uVar23 = (ulong)CARRY8(uVar17,uVar8);
  if (CARRY8(uVar17 + uVar8,uVar12)) {
    uVar23 = uVar1;
  }
  uVar8 = uVar33 + uVar34;
  uVar1 = uVar8 << 0x20;
  uVar12 = uVar25 + uVar1;
  uVar8 = uVar20 * uVar26 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar33,uVar34) << 0x20);
  if (CARRY8(uVar25,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar7 + uVar12;
  if (CARRY8(uVar7,uVar12)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar14 + uVar8;
  if (CARRY8(uVar14,uVar8)) {
    uVar23 = uVar23 + 1;
  }
  uVar12 = uVar30 + uVar16;
  uVar8 = uVar12 << 0x20;
  uVar14 = uVar6 + uVar8;
  uVar12 = uVar37 * uVar15 + (uVar12 >> 0x20) + ((ulong)CARRY8(uVar30,uVar16) << 0x20);
  if (CARRY8(uVar6,uVar8)) {
    uVar12 = uVar12 + 1;
  }
  uVar8 = uVar1 + uVar14;
  if (CARRY8(uVar1,uVar14)) {
    uVar12 = uVar12 + 1;
  }
  uVar1 = uVar12 + uVar7;
  if (CARRY8(uVar12,uVar7)) {
    uVar23 = uVar23 + 1;
  }
  uVar12 = uVar4 + uVar31;
  uVar7 = uVar12 << 0x20;
  uVar14 = uVar22 + uVar7;
  uVar9 = uVar9 * uVar36 + (uVar12 >> 0x20) + ((ulong)CARRY8(uVar4,uVar31) << 0x20);
  if (CARRY8(uVar22,uVar7)) {
    uVar9 = uVar9 + 1;
  }
  uVar7 = uVar14 + uVar8;
  if (CARRY8(uVar14,uVar8)) {
    uVar9 = uVar9 + 1;
  }
  uVar8 = uVar9 + uVar1;
  if (CARRY8(uVar9,uVar1)) {
    uVar23 = uVar23 + 1;
  }
  uVar9 = uVar10 + uVar38;
  uVar1 = uVar9 << 0x20;
  uVar12 = uVar35 + uVar1;
  uVar5 = uVar13 * uVar5 + (uVar9 >> 0x20) + ((ulong)CARRY8(uVar10,uVar38) << 0x20);
  if (CARRY8(uVar35,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  uVar1 = uVar12 + uVar7;
  if (CARRY8(uVar12,uVar7)) {
    uVar5 = uVar5 + 1;
  }
  uVar7 = uVar5 + uVar8;
  if (CARRY8(uVar5,uVar8)) {
    uVar23 = uVar23 + 1;
  }
  uVar8 = uVar32 + uVar28;
  uVar5 = uVar8 << 0x20;
  uVar9 = uVar11 + uVar5;
  uVar8 = uVar45 * uVar42 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar32,uVar28) << 0x20);
  if (CARRY8(uVar11,uVar5)) {
    uVar8 = uVar8 + 1;
  }
  if (CARRY8(uVar9,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  param_1[8] = uVar9 + uVar1;
  uVar1 = uVar8 + uVar7;
  uVar11 = param_2[2] & 0xffffffff;
  uVar19 = param_2[2] >> 0x20;
  uVar12 = param_3[7] & 0xffffffff;
  uVar28 = param_3[7] >> 0x20;
  uVar14 = param_2[3] & 0xffffffff;
  uVar32 = param_2[3] >> 0x20;
  uVar30 = param_3[6] & 0xffffffff;
  uVar26 = param_3[6] >> 0x20;
  uVar37 = param_2[4] & 0xffffffff;
  uVar29 = param_2[4] >> 0x20;
  uVar4 = param_3[5] & 0xffffffff;
  uVar27 = param_3[5] >> 0x20;
  uVar21 = param_2[5] & 0xffffffff;
  uVar36 = param_2[5] >> 0x20;
  uVar25 = param_3[4] & 0xffffffff;
  uVar17 = param_3[4] >> 0x20;
  uVar34 = param_2[6] & 0xffffffff;
  uVar9 = param_2[6] >> 0x20;
  uVar6 = param_3[3] & 0xffffffff;
  uVar5 = param_3[3] >> 0x20;
  uVar16 = param_2[7] & 0xffffffff;
  uVar13 = param_2[7] >> 0x20;
  uVar22 = param_3[2] & 0xffffffff;
  uVar20 = param_3[2] >> 0x20;
  uVar31 = uVar28 * uVar11;
  uVar11 = uVar12 * uVar11;
  uVar12 = uVar12 * uVar19;
  uVar24 = uVar26 * uVar14;
  uVar14 = uVar30 * uVar14;
  uVar30 = uVar30 * uVar32;
  uVar18 = uVar27 * uVar37;
  uVar37 = uVar4 * uVar37;
  uVar4 = uVar4 * uVar29;
  uVar33 = uVar17 * uVar21;
  uVar21 = uVar25 * uVar21;
  uVar25 = uVar25 * uVar36;
  uVar15 = uVar5 * uVar34;
  uVar34 = uVar6 * uVar34;
  uVar6 = uVar6 * uVar9;
  uVar10 = uVar20 * uVar16;
  uVar16 = uVar22 * uVar16;
  uVar22 = uVar22 * uVar13;
  if (CARRY8(uVar8,uVar7)) {
    uVar23 = uVar23 + 1;
  }
  uVar8 = uVar31 + uVar12;
  uVar7 = uVar8 << 0x20;
  uVar35 = uVar11 + uVar7;
  uVar8 = uVar28 * uVar19 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar31,uVar12) << 0x20);
  if (CARRY8(uVar11,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar1 + uVar35;
  if (CARRY8(uVar1,uVar35)) {
    uVar8 = uVar8 + 1;
  }
  uVar11 = uVar24 + uVar30;
  uVar1 = uVar11 << 0x20;
  uVar12 = uVar14 + uVar1;
  uVar11 = uVar26 * uVar32 + (uVar11 >> 0x20) + ((ulong)CARRY8(uVar24,uVar30) << 0x20);
  if (CARRY8(uVar14,uVar1)) {
    uVar11 = uVar11 + 1;
  }
  uVar1 = uVar7 + uVar12;
  if (CARRY8(uVar7,uVar12)) {
    uVar11 = uVar11 + 1;
  }
  uVar7 = 2;
  if (!CARRY8(uVar23,uVar8)) {
    uVar7 = 1;
  }
  uVar12 = uVar23 + uVar8 + uVar11;
  uVar14 = (ulong)CARRY8(uVar23,uVar8);
  if (CARRY8(uVar23 + uVar8,uVar11)) {
    uVar14 = uVar7;
  }
  uVar8 = uVar18 + uVar4;
  uVar7 = uVar8 << 0x20;
  uVar11 = uVar37 + uVar7;
  uVar8 = uVar27 * uVar29 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar18,uVar4) << 0x20);
  if (CARRY8(uVar37,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar1 + uVar11;
  if (CARRY8(uVar1,uVar11)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar12 + uVar8;
  if (CARRY8(uVar12,uVar8)) {
    uVar14 = uVar14 + 1;
  }
  uVar11 = uVar33 + uVar25;
  uVar8 = uVar11 << 0x20;
  uVar12 = uVar21 + uVar8;
  uVar11 = uVar17 * uVar36 + (uVar11 >> 0x20) + ((ulong)CARRY8(uVar33,uVar25) << 0x20);
  if (CARRY8(uVar21,uVar8)) {
    uVar11 = uVar11 + 1;
  }
  uVar8 = uVar7 + uVar12;
  if (CARRY8(uVar7,uVar12)) {
    uVar11 = uVar11 + 1;
  }
  uVar7 = uVar11 + uVar1;
  if (CARRY8(uVar11,uVar1)) {
    uVar14 = uVar14 + 1;
  }
  uVar11 = uVar15 + uVar6;
  uVar1 = uVar11 << 0x20;
  uVar12 = uVar34 + uVar1;
  uVar5 = uVar5 * uVar9 + (uVar11 >> 0x20) + ((ulong)CARRY8(uVar15,uVar6) << 0x20);
  if (CARRY8(uVar34,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  uVar1 = uVar12 + uVar8;
  if (CARRY8(uVar12,uVar8)) {
    uVar5 = uVar5 + 1;
  }
  uVar8 = uVar5 + uVar7;
  if (CARRY8(uVar5,uVar7)) {
    uVar14 = uVar14 + 1;
  }
  uVar7 = uVar10 + uVar22;
  uVar5 = uVar7 << 0x20;
  uVar9 = uVar16 + uVar5;
  uVar7 = uVar20 * uVar13 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar10,uVar22) << 0x20);
  if (CARRY8(uVar16,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  if (CARRY8(uVar9,uVar1)) {
    uVar7 = uVar7 + 1;
  }
  param_1[9] = uVar9 + uVar1;
  uVar1 = uVar7 + uVar8;
  uVar9 = param_2[7] & 0xffffffff;
  uVar17 = param_2[7] >> 0x20;
  uVar10 = param_3[3] & 0xffffffff;
  uVar28 = param_3[3] >> 0x20;
  uVar13 = param_2[6] & 0xffffffff;
  uVar26 = param_2[6] >> 0x20;
  uVar11 = param_3[4] & 0xffffffff;
  uVar18 = param_3[4] >> 0x20;
  uVar12 = param_2[5] & 0xffffffff;
  uVar23 = param_2[5] >> 0x20;
  uVar20 = param_3[5] & 0xffffffff;
  uVar29 = param_3[5] >> 0x20;
  uVar30 = param_2[4] & 0xffffffff;
  uVar27 = param_2[4] >> 0x20;
  uVar37 = param_3[6] & 0xffffffff;
  uVar36 = param_3[6] >> 0x20;
  uVar4 = param_2[3] & 0xffffffff;
  uVar24 = param_2[3] >> 0x20;
  uVar21 = param_3[7] & 0xffffffff;
  uVar5 = param_3[7] >> 0x20;
  uVar25 = uVar28 * uVar9;
  uVar9 = uVar10 * uVar9;
  uVar10 = uVar10 * uVar17;
  uVar32 = uVar18 * uVar13;
  uVar13 = uVar11 * uVar13;
  uVar11 = uVar11 * uVar26;
  uVar19 = uVar29 * uVar12;
  uVar12 = uVar20 * uVar12;
  uVar20 = uVar20 * uVar23;
  uVar33 = uVar36 * uVar30;
  uVar30 = uVar37 * uVar30;
  uVar37 = uVar37 * uVar27;
  uVar15 = uVar5 * uVar4;
  uVar4 = uVar21 * uVar4;
  uVar21 = uVar21 * uVar24;
  if (CARRY8(uVar7,uVar8)) {
    uVar14 = uVar14 + 1;
  }
  uVar8 = uVar25 + uVar10;
  uVar7 = uVar8 << 0x20;
  uVar34 = uVar9 + uVar7;
  uVar8 = uVar28 * uVar17 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar25,uVar10) << 0x20);
  if (CARRY8(uVar9,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar1 + uVar34;
  if (CARRY8(uVar1,uVar34)) {
    uVar8 = uVar8 + 1;
  }
  uVar9 = uVar32 + uVar11;
  uVar1 = uVar9 << 0x20;
  uVar10 = uVar13 + uVar1;
  uVar9 = uVar18 * uVar26 + (uVar9 >> 0x20) + ((ulong)CARRY8(uVar32,uVar11) << 0x20);
  if (CARRY8(uVar13,uVar1)) {
    uVar9 = uVar9 + 1;
  }
  uVar1 = uVar7 + uVar10;
  if (CARRY8(uVar7,uVar10)) {
    uVar9 = uVar9 + 1;
  }
  uVar7 = 2;
  if (!CARRY8(uVar14,uVar8)) {
    uVar7 = 1;
  }
  uVar10 = uVar14 + uVar8 + uVar9;
  uVar13 = (ulong)CARRY8(uVar14,uVar8);
  if (CARRY8(uVar14 + uVar8,uVar9)) {
    uVar13 = uVar7;
  }
  uVar8 = uVar19 + uVar20;
  uVar7 = uVar8 << 0x20;
  uVar9 = uVar12 + uVar7;
  uVar8 = uVar29 * uVar23 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar19,uVar20) << 0x20);
  if (CARRY8(uVar12,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  uVar7 = uVar1 + uVar9;
  if (CARRY8(uVar1,uVar9)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar10 + uVar8;
  if (CARRY8(uVar10,uVar8)) {
    uVar13 = uVar13 + 1;
  }
  uVar9 = uVar33 + uVar37;
  uVar8 = uVar9 << 0x20;
  uVar10 = uVar30 + uVar8;
  uVar9 = uVar36 * uVar27 + (uVar9 >> 0x20) + ((ulong)CARRY8(uVar33,uVar37) << 0x20);
  if (CARRY8(uVar30,uVar8)) {
    uVar9 = uVar9 + 1;
  }
  uVar8 = uVar7 + uVar10;
  if (CARRY8(uVar7,uVar10)) {
    uVar9 = uVar9 + 1;
  }
  uVar7 = uVar9 + uVar1;
  if (CARRY8(uVar9,uVar1)) {
    uVar13 = uVar13 + 1;
  }
  uVar9 = uVar15 + uVar21;
  uVar1 = uVar9 << 0x20;
  uVar10 = uVar4 + uVar1;
  uVar5 = uVar5 * uVar24 + (uVar9 >> 0x20) + ((ulong)CARRY8(uVar15,uVar21) << 0x20);
  if (CARRY8(uVar4,uVar1)) {
    uVar5 = uVar5 + 1;
  }
  if (CARRY8(uVar10,uVar8)) {
    uVar5 = uVar5 + 1;
  }
  param_1[10] = uVar10 + uVar8;
  uVar1 = uVar5 + uVar7;
  uVar8 = param_3[7] & 0xffffffff;
  uVar36 = param_2[4] & 0xffffffff;
  uVar26 = param_2[4] >> 0x20;
  uVar23 = param_3[7] >> 0x20;
  uVar9 = param_2[5] & 0xffffffff;
  uVar32 = param_2[5] >> 0x20;
  uVar10 = param_3[6] & 0xffffffff;
  uVar17 = param_3[6] >> 0x20;
  uVar11 = param_2[6] & 0xffffffff;
  uVar27 = param_2[6] >> 0x20;
  uVar12 = param_3[5] & 0xffffffff;
  uVar24 = param_3[5] >> 0x20;
  uVar14 = param_2[7] & 0xffffffff;
  uVar33 = param_2[7] >> 0x20;
  uVar15 = param_3[4] & 0xffffffff;
  uVar19 = param_3[4] >> 0x20;
  uVar20 = uVar23 * uVar36;
  uVar36 = uVar8 * uVar36;
  uVar8 = uVar8 * uVar26;
  uVar28 = uVar17 * uVar9;
  uVar9 = uVar10 * uVar9;
  uVar10 = uVar10 * uVar32;
  uVar18 = uVar24 * uVar11;
  uVar11 = uVar12 * uVar11;
  uVar12 = uVar12 * uVar27;
  uVar29 = uVar19 * uVar14;
  uVar14 = uVar15 * uVar14;
  uVar15 = uVar15 * uVar33;
  if (CARRY8(uVar5,uVar7)) {
    uVar13 = uVar13 + 1;
  }
  uVar7 = uVar20 + uVar8;
  uVar5 = uVar7 << 0x20;
  uVar30 = uVar36 + uVar5;
  uVar7 = uVar23 * uVar26 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar20,uVar8) << 0x20);
  if (CARRY8(uVar36,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  uVar5 = uVar1 + uVar30;
  if (CARRY8(uVar1,uVar30)) {
    uVar7 = uVar7 + 1;
  }
  uVar8 = uVar28 + uVar10;
  uVar1 = uVar8 << 0x20;
  uVar23 = uVar9 + uVar1;
  uVar8 = uVar17 * uVar32 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar28,uVar10) << 0x20);
  if (CARRY8(uVar9,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar5 + uVar23;
  if (CARRY8(uVar5,uVar23)) {
    uVar8 = uVar8 + 1;
  }
  uVar5 = 2;
  if (!CARRY8(uVar13,uVar7)) {
    uVar5 = 1;
  }
  uVar9 = uVar13 + uVar7 + uVar8;
  uVar10 = (ulong)CARRY8(uVar13,uVar7);
  if (CARRY8(uVar13 + uVar7,uVar8)) {
    uVar10 = uVar5;
  }
  uVar7 = uVar18 + uVar12;
  uVar5 = uVar7 << 0x20;
  uVar8 = uVar11 + uVar5;
  uVar7 = uVar24 * uVar27 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar18,uVar12) << 0x20);
  if (CARRY8(uVar11,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  uVar5 = uVar1 + uVar8;
  if (CARRY8(uVar1,uVar8)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = uVar9 + uVar7;
  if (CARRY8(uVar9,uVar7)) {
    uVar10 = uVar10 + 1;
  }
  uVar8 = uVar29 + uVar15;
  uVar7 = uVar8 << 0x20;
  uVar9 = uVar14 + uVar7;
  uVar8 = uVar19 * uVar33 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar29,uVar15) << 0x20);
  if (CARRY8(uVar14,uVar7)) {
    uVar8 = uVar8 + 1;
  }
  if (CARRY8(uVar5,uVar9)) {
    uVar8 = uVar8 + 1;
  }
  param_1[0xb] = uVar5 + uVar9;
  uVar5 = uVar8 + uVar1;
  uVar19 = param_2[7] & 0xffffffff;
  uVar12 = param_2[7] >> 0x20;
  uVar24 = param_3[5] & 0xffffffff;
  uVar23 = param_3[5] >> 0x20;
  uVar27 = param_2[6] & 0xffffffff;
  uVar17 = param_2[6] >> 0x20;
  uVar7 = param_3[6] & 0xffffffff;
  uVar28 = param_3[6] >> 0x20;
  uVar9 = param_2[5] & 0xffffffff;
  uVar14 = param_2[5] >> 0x20;
  uVar13 = param_3[7] & 0xffffffff;
  uVar18 = param_3[7] >> 0x20;
  uVar11 = uVar23 * uVar19;
  uVar19 = uVar24 * uVar19;
  uVar24 = uVar24 * uVar12;
  uVar26 = uVar28 * uVar27;
  uVar27 = uVar7 * uVar27;
  uVar7 = uVar7 * uVar17;
  uVar32 = uVar18 * uVar9;
  uVar9 = uVar13 * uVar9;
  uVar13 = uVar13 * uVar14;
  if (CARRY8(uVar8,uVar1)) {
    uVar10 = uVar10 + 1;
  }
  uVar8 = uVar11 + uVar24;
  uVar1 = uVar8 << 0x20;
  uVar29 = uVar19 + uVar1;
  uVar8 = uVar23 * uVar12 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar11,uVar24) << 0x20);
  if (CARRY8(uVar19,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  uVar1 = uVar5 + uVar29;
  if (CARRY8(uVar5,uVar29)) {
    uVar8 = uVar8 + 1;
  }
  uVar11 = uVar26 + uVar7;
  uVar5 = uVar11 << 0x20;
  uVar12 = uVar27 + uVar5;
  uVar7 = uVar28 * uVar17 + (uVar11 >> 0x20) + ((ulong)CARRY8(uVar26,uVar7) << 0x20);
  if (CARRY8(uVar27,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  uVar5 = uVar1 + uVar12;
  if (CARRY8(uVar1,uVar12)) {
    uVar7 = uVar7 + 1;
  }
  uVar1 = 2;
  if (!CARRY8(uVar10,uVar8)) {
    uVar1 = 1;
  }
  uVar11 = uVar10 + uVar8 + uVar7;
  uVar12 = (ulong)CARRY8(uVar10,uVar8);
  if (CARRY8(uVar10 + uVar8,uVar7)) {
    uVar12 = uVar1;
  }
  uVar7 = uVar32 + uVar13;
  uVar1 = uVar7 << 0x20;
  uVar8 = uVar9 + uVar1;
  uVar7 = uVar18 * uVar14 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar32,uVar13) << 0x20);
  if (CARRY8(uVar9,uVar1)) {
    uVar7 = uVar7 + 1;
  }
  if (CARRY8(uVar5,uVar8)) {
    uVar7 = uVar7 + 1;
  }
  param_1[0xc] = uVar5 + uVar8;
  uVar1 = uVar11 + uVar7;
  if (CARRY8(uVar11,uVar7)) {
    uVar12 = uVar12 + 1;
  }
  uVar17 = param_2[6] & 0xffffffff;
  uVar9 = param_2[6] >> 0x20;
  uVar23 = param_3[7] & 0xffffffff;
  uVar13 = param_3[7] >> 0x20;
  uVar26 = param_2[7] & 0xffffffff;
  uVar14 = param_2[7] >> 0x20;
  uVar28 = param_3[6] & 0xffffffff;
  uVar10 = param_3[6] >> 0x20;
  uVar32 = uVar13 * uVar17;
  uVar17 = uVar23 * uVar17;
  uVar23 = uVar23 * uVar9;
  uVar11 = uVar10 * uVar26;
  uVar26 = uVar28 * uVar26;
  uVar28 = uVar28 * uVar14;
  uVar7 = uVar32 + uVar23;
  uVar5 = uVar7 << 0x20;
  uVar8 = uVar17 + uVar5;
  uVar7 = uVar13 * uVar9 + (uVar7 >> 0x20) + ((ulong)CARRY8(uVar32,uVar23) << 0x20);
  if (CARRY8(uVar17,uVar5)) {
    uVar7 = uVar7 + 1;
  }
  uVar5 = uVar1 + uVar8;
  if (CARRY8(uVar1,uVar8)) {
    uVar7 = uVar7 + 1;
  }
  uVar8 = uVar11 + uVar28;
  uVar1 = uVar8 << 0x20;
  uVar9 = uVar26 + uVar1;
  uVar8 = uVar10 * uVar14 + (uVar8 >> 0x20) + ((ulong)CARRY8(uVar11,uVar28) << 0x20);
  if (CARRY8(uVar26,uVar1)) {
    uVar8 = uVar8 + 1;
  }
  param_1[0xd] = uVar5 + uVar9;
  if (CARRY8(uVar5,uVar9)) {
    uVar8 = uVar8 + 1;
  }
  uVar11 = param_2[7] & 0xffffffff;
  uVar10 = param_2[7] >> 0x20;
  uVar14 = param_3[7] & 0xffffffff;
  uVar13 = param_3[7] >> 0x20;
  uVar17 = uVar13 * uVar11;
  uVar11 = uVar14 * uVar11;
  uVar14 = uVar14 * uVar10;
  uVar5 = uVar17 + uVar14;
  uVar1 = uVar5 << 0x20;
  uVar9 = uVar11 + uVar1;
  lVar3 = uVar13 * uVar10 + (uVar5 >> 0x20) + ((ulong)CARRY8(uVar17,uVar14) << 0x20);
  if (CARRY8(uVar11,uVar1)) {
    lVar3 = lVar3 + 1;
  }
  if (CARRY8(uVar12,uVar7)) {
    lVar3 = lVar3 + 1;
  }
  uVar1 = uVar12 + uVar7 + uVar8;
  if (CARRY8(uVar12 + uVar7,uVar8)) {
    lVar3 = lVar3 + 1;
  }
  if (CARRY8(uVar1,uVar9)) {
    lVar3 = lVar3 + 1;
  }
  param_1[0xe] = uVar1 + uVar9;
  param_1[0xf] = lVar3;
  return;
}

