/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ade188
 */

void FUN_00ade188(uint *param_1,uint *param_2,long param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  uint uVar18;
  uint uVar19;
  uint uVar20;
  uint uVar21;
  uint uVar22;
  uint uVar23;
  uint uVar24;
  uint uVar25;
  uint uVar26;
  uint uVar27;
  uint uVar28;
  uint uVar29;
  uint uVar30;
  uint uVar31;
  uint uVar32;
  uint uVar33;
  uint uVar34;
  uint uVar35;
  uint uVar36;
  uint uVar37;
  uint uVar38;
  uint uVar39;
  uint uVar40;
  uint uVar41;
  uint uVar42;
  uint uVar43;
  uint uVar44;
  uint uVar45;
  uint uVar46;
  uint uVar47;
  uint uVar48;
  uint uVar49;
  uint uVar50;
  uint uVar51;
  uint uVar52;
  uint uVar53;
  uint uVar54;
  uint uVar55;
  uint uVar56;
  uint uVar57;
  uint uVar58;
  uint uVar59;
  uint uVar60;
  
  uVar58 = *param_1;
  uVar56 = param_1[1];
  uVar59 = param_1[2];
  uVar60 = param_1[3];
  uVar57 = param_1[4];
  do {
    uVar1 = *param_2;
    uVar9 = param_2[1];
    uVar2 = param_2[0xe];
    uVar10 = param_2[0xf];
    uVar3 = param_2[2];
    uVar11 = param_2[3];
    uVar4 = param_2[4];
    uVar12 = param_2[5];
    uVar5 = param_2[6];
    uVar13 = param_2[7];
    uVar6 = param_2[8];
    uVar14 = param_2[9];
    uVar7 = param_2[10];
    uVar15 = param_2[0xb];
    uVar8 = param_2[0xc];
    uVar16 = param_2[0xd];
    uVar21 = uVar56 >> 2 | uVar56 << 0x1e;
    uVar22 = uVar58 >> 2 | uVar58 << 0x1e;
    uVar17 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
    uVar57 = uVar57 + 0x5a827999 + ((uVar59 ^ uVar60) & uVar56 ^ uVar60) +
             (uVar58 >> 0x1b | uVar58 << 5) + (uVar17 >> 0x10 | uVar17 << 0x10);
    uVar56 = (uVar9 & 0xff00ff00) >> 8 | (uVar9 & 0xff00ff) << 8;
    uVar17 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
    uVar23 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar60 = uVar60 + 0x5a827999 + ((uVar21 ^ uVar59) & uVar58 ^ uVar59) +
             (uVar56 >> 0x10 | uVar56 << 0x10) + (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar56 = (uVar11 & 0xff00ff00) >> 8 | (uVar11 & 0xff00ff) << 8;
    uVar57 = uVar59 + 0x5a827999 + (uVar57 & (uVar22 ^ uVar21) ^ uVar21) +
             (uVar17 >> 0x10 | uVar17 << 0x10) + (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar24 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar21 + 0x5a827999 + (uVar60 & (uVar23 ^ uVar22) ^ uVar22) +
             (uVar56 >> 0x10 | uVar56 << 0x10) + (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar59 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
    uVar25 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar22 + 0x5a827999 + (uVar57 & (uVar24 ^ uVar23) ^ uVar23) +
             (uVar59 >> 0x10 | uVar59 << 0x10) + (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar59 = (uVar12 & 0xff00ff00) >> 8 | (uVar12 & 0xff00ff) << 8;
    uVar26 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar23 + 0x5a827999 + (uVar60 & (uVar25 ^ uVar24) ^ uVar24) +
             (uVar59 >> 0x10 | uVar59 << 0x10) + (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar17 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
    uVar21 = (uVar13 & 0xff00ff00) >> 8 | (uVar13 & 0xff00ff) << 8;
    uVar22 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
    uVar23 = (uVar14 & 0xff00ff00) >> 8 | (uVar14 & 0xff00ff) << 8;
    uVar18 = (uVar7 & 0xff00ff00) >> 8 | (uVar7 & 0xff00ff) << 8;
    uVar19 = (uVar15 & 0xff00ff00) >> 8 | (uVar15 & 0xff00ff) << 8;
    uVar59 = uVar12 ^ uVar11 ^ uVar15;
    uVar20 = (uVar16 & 0xff00ff00) >> 8 | (uVar16 & 0xff00ff) << 8;
    uVar56 = uVar11 ^ uVar9 ^ uVar14 ^ uVar2;
    uVar58 = uVar13 ^ uVar12 ^ uVar16;
    uVar1 = uVar3 ^ uVar1 ^ uVar6 ^ uVar16;
    uVar9 = uVar14 ^ uVar13 ^ uVar10;
    uVar3 = uVar4 ^ uVar3 ^ uVar7 ^ uVar10;
    uVar11 = (uVar10 & 0xff00ff00) >> 8 | (uVar10 & 0xff00ff) << 8;
    uVar11 = uVar11 >> 0x10 | uVar11 << 0x10;
    uVar12 = (uVar8 & 0xff00ff00) >> 8 | (uVar8 & 0xff00ff) << 8;
    uVar4 = uVar5 ^ uVar4 ^ uVar8;
    uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
    uVar56 = (uVar56 & 0xff00ff00) >> 8 | (uVar56 & 0xff00ff) << 8;
    uVar3 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
    uVar13 = ((uVar7 ^ uVar6) & 0xff00ff00) >> 8 | ((uVar7 ^ uVar6) & 0xff00ff) << 8;
    uVar14 = ((uVar15 ^ uVar14) & 0xff00ff00) >> 8 | ((uVar15 ^ uVar14) & 0xff00ff) << 8;
    uVar7 = ((uVar8 ^ uVar7) & 0xff00ff00) >> 8 | ((uVar8 ^ uVar7) & 0xff00ff) << 8;
    uVar27 = (uVar1 & 0xffff) >> 0xf | (uVar1 >> 0x10 | uVar1 << 0x10) << 1;
    uVar28 = (uVar3 & 0xffff) >> 0xf | (uVar3 >> 0x10 | uVar3 << 0x10) << 1;
    uVar1 = ((uVar16 ^ uVar15) & 0xff00ff00) >> 8 | ((uVar16 ^ uVar15) & 0xff00ff) << 8;
    uVar3 = ((uVar10 ^ uVar16) & 0xff00ff00) >> 8 | ((uVar10 ^ uVar16) & 0xff00ff) << 8;
    uVar10 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar24 + 0x5a827999 + (uVar57 & (uVar26 ^ uVar25) ^ uVar25) +
             (uVar17 >> 0x10 | uVar17 << 0x10) + (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar15 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar25 + 0x5a827999 + (uVar60 & (uVar10 ^ uVar26) ^ uVar26) +
             (uVar21 >> 0x10 | uVar21 << 0x10) + (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar16 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar26 + 0x5a827999 + (uVar57 & (uVar15 ^ uVar10) ^ uVar10) +
             (uVar22 >> 0x10 | uVar22 << 0x10) + (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar17 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar10 + 0x5a827999 + (uVar60 & (uVar16 ^ uVar15) ^ uVar15) +
             (uVar23 >> 0x10 | uVar23 << 0x10) + (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar10 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar15 + 0x5a827999 + (uVar57 & (uVar17 ^ uVar16) ^ uVar16) +
             (uVar18 >> 0x10 | uVar18 << 0x10) + (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar15 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar16 + 0x5a827999 + (uVar60 & (uVar10 ^ uVar17) ^ uVar17) +
             (uVar19 >> 0x10 | uVar19 << 0x10) + (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar59 = (uVar59 & 0xff00ff00) >> 8 | (uVar59 & 0xff00ff) << 8;
    uVar4 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
    uVar16 = (uVar56 & 0xffff) >> 0xf | (uVar56 >> 0x10 | uVar56 << 0x10) << 1;
    uVar59 = (uVar59 >> 0x10 | uVar59 << 0x10) ^ uVar27;
    uVar56 = (uVar4 >> 0x10 | uVar4 << 0x10) ^ uVar16;
    uVar4 = ((uVar2 ^ uVar8) & 0xff00ff00) >> 8 | ((uVar2 ^ uVar8) & 0xff00ff) << 8;
    uVar58 = (uVar58 & 0xff00ff00) >> 8 | (uVar58 & 0xff00ff) << 8;
    uVar8 = uVar59 >> 0x1f | uVar59 << 1;
    uVar21 = uVar56 >> 0x1f | uVar56 << 1;
    uVar22 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar59 = (uVar58 >> 0x10 | uVar58 << 0x10) ^ uVar28;
    uVar57 = uVar17 + 0x5a827999 + (uVar57 & (uVar15 ^ uVar10) ^ uVar10) +
             (uVar12 >> 0x10 | uVar12 << 0x10) + (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar12 = uVar59 >> 0x1f | uVar59 << 1;
    uVar17 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar59 = uVar6 ^ uVar5 ^ uVar2;
    uVar60 = uVar10 + 0x5a827999 + (uVar60 & (uVar22 ^ uVar15) ^ uVar15) +
             (uVar20 >> 0x10 | uVar20 << 0x10) + (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar59 = (uVar59 & 0xff00ff00) >> 8 | (uVar59 & 0xff00ff) << 8;
    uVar56 = (uVar9 & 0xff00ff00) >> 8 | (uVar9 & 0xff00ff) << 8;
    uVar59 = (uVar59 >> 0x10 | uVar59 << 0x10) ^ uVar8;
    uVar56 = (uVar56 >> 0x10 | uVar56 << 0x10) ^ uVar21;
    uVar5 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar58 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
    uVar9 = uVar58 >> 0x10 | uVar58 << 0x10;
    uVar58 = (uVar13 >> 0x10 | uVar13 << 0x10) ^ uVar27 ^ uVar12;
    uVar2 = uVar56 >> 0x1f | uVar56 << 1;
    uVar6 = uVar59 >> 0x1f | uVar59 << 1;
    uVar10 = uVar58 >> 0x1f | uVar58 << 1;
    uVar59 = (uVar7 >> 0x10 | uVar7 << 0x10) ^ uVar28 ^ uVar2;
    uVar56 = (uVar14 >> 0x10 | uVar14 << 0x10) ^ uVar16 ^ uVar6;
    uVar58 = (uVar1 >> 0x10 | uVar1 << 0x10) ^ uVar8 ^ uVar10;
    uVar7 = uVar59 >> 0x1f | uVar59 << 1;
    uVar13 = uVar56 >> 0x1f | uVar56 << 1;
    uVar59 = (uVar3 >> 0x10 | uVar3 << 0x10) ^ uVar12 ^ uVar7;
    uVar3 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar57 = uVar15 + 0x5a827999 + (uVar57 & (uVar17 ^ uVar22) ^ uVar22) + uVar9 +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar60 = uVar22 + 0x5a827999 + (uVar60 & (uVar5 ^ uVar17) ^ uVar17) + uVar11 +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar14 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar17 + 0x5a827999 + uVar27 + (uVar57 & (uVar3 ^ uVar5) ^ uVar5) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar56 = (uVar4 >> 0x10 | uVar4 << 0x10) ^ uVar21 ^ uVar13;
    uVar4 = uVar56 >> 0x1f | uVar56 << 1;
    uVar15 = uVar59 >> 0x1f | uVar59 << 1;
    uVar56 = uVar11 ^ uVar16 ^ uVar2 ^ uVar4;
    uVar1 = uVar28 ^ uVar27 ^ uVar10 ^ uVar15;
    uVar11 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar5 + 0x5a827999 + uVar16 + (uVar60 & (uVar14 ^ uVar3) ^ uVar3) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar5 = uVar58 >> 0x1f | uVar58 << 1;
    uVar59 = uVar9 ^ uVar27 ^ uVar6 ^ uVar5;
    uVar17 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar3 + 0x5a827999 + uVar28 + (uVar57 & (uVar11 ^ uVar14) ^ uVar14) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar3 = uVar59 >> 0x1f | uVar59 << 1;
    uVar58 = uVar16 ^ uVar8 ^ uVar13 ^ uVar3;
    uVar59 = uVar8 + 0x5a827999 + uVar14 + (uVar60 & (uVar17 ^ uVar11) ^ uVar11) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar14 = uVar56 >> 0x1f | uVar56 << 1;
    uVar16 = uVar58 >> 0x1f | uVar58 << 1;
    uVar56 = uVar28 ^ uVar21 ^ uVar7 ^ uVar14;
    uVar58 = uVar21 ^ uVar6 ^ uVar4 ^ uVar16;
    uVar22 = uVar1 >> 0x1f | uVar1 << 1;
    uVar1 = uVar12 ^ uVar8 ^ uVar5 ^ uVar22;
    uVar8 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar23 = uVar56 >> 0x1f | uVar56 << 1;
    uVar1 = uVar1 >> 0x1f | uVar1 << 1;
    uVar18 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar12 ^ uVar2 ^ uVar15 ^ uVar23;
    uVar56 = uVar10 ^ uVar6 ^ uVar3 ^ uVar1;
    uVar58 = uVar2 ^ uVar13 ^ uVar14 ^ uVar18;
    uVar19 = uVar60 >> 0x1f | uVar60 << 1;
    uVar20 = uVar56 >> 0x1f | uVar56 << 1;
    uVar24 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar10 ^ uVar7 ^ uVar22 ^ uVar19;
    uVar56 = uVar5 ^ uVar13 ^ uVar16 ^ uVar20;
    uVar58 = uVar7 ^ uVar4 ^ uVar23 ^ uVar24;
    uVar25 = uVar60 >> 0x1f | uVar60 << 1;
    uVar26 = uVar56 >> 0x1f | uVar56 << 1;
    uVar27 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar5 ^ uVar15 ^ uVar1 ^ uVar25;
    uVar56 = uVar3 ^ uVar4 ^ uVar18 ^ uVar26;
    uVar58 = uVar15 ^ uVar14 ^ uVar19 ^ uVar27;
    uVar28 = uVar60 >> 0x1f | uVar60 << 1;
    uVar29 = uVar56 >> 0x1f | uVar56 << 1;
    uVar30 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar3 ^ uVar22 ^ uVar20 ^ uVar28;
    uVar56 = uVar16 ^ uVar14 ^ uVar24 ^ uVar29;
    uVar58 = uVar22 ^ uVar23 ^ uVar25 ^ uVar30;
    uVar31 = uVar60 >> 0x1f | uVar60 << 1;
    uVar32 = uVar56 >> 0x1f | uVar56 << 1;
    uVar33 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar16 ^ uVar1 ^ uVar26 ^ uVar31;
    uVar56 = uVar18 ^ uVar23 ^ uVar27 ^ uVar32;
    uVar58 = uVar1 ^ uVar19 ^ uVar28 ^ uVar33;
    uVar34 = uVar60 >> 0x1f | uVar60 << 1;
    uVar35 = uVar56 >> 0x1f | uVar56 << 1;
    uVar36 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar18 ^ uVar20 ^ uVar29 ^ uVar34;
    uVar56 = uVar24 ^ uVar19 ^ uVar30 ^ uVar35;
    uVar58 = uVar20 ^ uVar25 ^ uVar31 ^ uVar36;
    uVar37 = uVar60 >> 0x1f | uVar60 << 1;
    uVar38 = uVar56 >> 0x1f | uVar56 << 1;
    uVar39 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar24 ^ uVar26 ^ uVar32 ^ uVar37;
    uVar56 = uVar27 ^ uVar25 ^ uVar33 ^ uVar38;
    uVar58 = uVar26 ^ uVar28 ^ uVar34 ^ uVar39;
    uVar40 = uVar60 >> 0x1f | uVar60 << 1;
    uVar41 = uVar56 >> 0x1f | uVar56 << 1;
    uVar42 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar27 ^ uVar29 ^ uVar35 ^ uVar40;
    uVar56 = uVar30 ^ uVar28 ^ uVar36 ^ uVar41;
    uVar58 = uVar29 ^ uVar31 ^ uVar37 ^ uVar42;
    uVar43 = uVar60 >> 0x1f | uVar60 << 1;
    uVar44 = uVar56 >> 0x1f | uVar56 << 1;
    uVar45 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar30 ^ uVar32 ^ uVar38 ^ uVar43;
    uVar56 = uVar33 ^ uVar31 ^ uVar39 ^ uVar44;
    uVar58 = uVar32 ^ uVar34 ^ uVar40 ^ uVar45;
    uVar46 = uVar60 >> 0x1f | uVar60 << 1;
    uVar47 = uVar56 >> 0x1f | uVar56 << 1;
    uVar48 = uVar58 >> 0x1f | uVar58 << 1;
    uVar60 = uVar33 ^ uVar35 ^ uVar41 ^ uVar46;
    uVar56 = uVar36 ^ uVar34 ^ uVar42 ^ uVar47;
    uVar49 = uVar60 >> 0x1f | uVar60 << 1;
    uVar58 = uVar56 >> 0x1f | uVar56 << 1;
    uVar60 = uVar36 ^ uVar38 ^ uVar44 ^ uVar49;
    uVar56 = uVar39 ^ uVar37 ^ uVar45 ^ uVar58;
    uVar50 = uVar60 >> 0x1f | uVar60 << 1;
    uVar51 = uVar56 >> 0x1f | uVar56 << 1;
    uVar60 = uVar39 ^ uVar41 ^ uVar47 ^ uVar50;
    uVar56 = uVar42 ^ uVar40 ^ uVar48 ^ uVar51;
    uVar52 = uVar60 >> 0x1f | uVar60 << 1;
    uVar60 = uVar42 ^ uVar44 ^ uVar58 ^ uVar52;
    uVar53 = uVar56 >> 0x1f | uVar56 << 1;
    uVar54 = uVar60 >> 0x1f | uVar60 << 1;
    uVar60 = uVar45 ^ uVar47 ^ uVar51 ^ uVar54;
    uVar55 = uVar60 >> 0x1f | uVar60 << 1;
    uVar9 = uVar48 ^ uVar58 ^ uVar53 ^ uVar55;
    uVar60 = uVar21 + 0x6ed9eba1 + uVar11 + (uVar8 ^ uVar17 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar56 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar11 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar57 = uVar12 + 0x6ed9eba1 + uVar17 + (uVar56 ^ uVar8 ^ uVar59) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar59 = uVar6 + 0x6ed9eba1 + uVar8 + (uVar11 ^ uVar56 ^ uVar60) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar6 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar2 + 0x6ed9eba1 + uVar56 + (uVar6 ^ uVar11 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar56 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar10 + 0x6ed9eba1 + uVar11 + (uVar56 ^ uVar6 ^ uVar59) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar2 = uVar59 >> 2 | uVar59 * 0x40000000;
    param_3 = param_3 + -1;
    uVar59 = uVar13 + 0x6ed9eba1 + uVar6 + (uVar2 ^ uVar56 ^ uVar60) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar6 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar7 + 0x6ed9eba1 + uVar56 + (uVar6 ^ uVar2 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar56 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar5 + 0x6ed9eba1 + uVar2 + (uVar56 ^ uVar6 ^ uVar59) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar2 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar59 = uVar4 + 0x6ed9eba1 + uVar6 + (uVar2 ^ uVar56 ^ uVar60) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar4 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar5 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar15 + 0x6ed9eba1 + uVar56 + (uVar4 ^ uVar2 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar60 = uVar3 + 0x6ed9eba1 + uVar2 + (uVar5 ^ uVar4 ^ uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar56 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar59 = uVar14 + 0x6ed9eba1 + uVar4 + (uVar56 ^ uVar5 ^ uVar57) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar3 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar22 + 0x6ed9eba1 + uVar5 + (uVar3 ^ uVar56 ^ uVar60) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar4 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar16 + 0x6ed9eba1 + uVar56 + (uVar4 ^ uVar3 ^ uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar56 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar59 = uVar23 + 0x6ed9eba1 + uVar3 + (uVar56 ^ uVar4 ^ uVar57) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar3 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar1 + 0x6ed9eba1 + uVar4 + (uVar3 ^ uVar56 ^ uVar60) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar1 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar18 + 0x6ed9eba1 + uVar56 + (uVar1 ^ uVar3 ^ uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar56 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar59 = uVar19 + 0x6ed9eba1 + uVar3 + (uVar56 ^ uVar1 ^ uVar57) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar3 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar20 + 0x6ed9eba1 + uVar1 + (uVar3 ^ uVar56 ^ uVar60) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar1 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar4 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar60 = uVar24 + 0x6ed9eba1 + uVar56 + (uVar1 ^ uVar3 ^ uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar59 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar25 + 0x8f1bbcdc + uVar3 + ((uVar57 | uVar4) & uVar1 | uVar57 & uVar4) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar56 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar26 + 0x8f1bbcdc + uVar1 + ((uVar60 | uVar59) & uVar4 | uVar60 & uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar1 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar27 + 0x8f1bbcdc + uVar4 + ((uVar57 | uVar56) & uVar59 | uVar57 & uVar56) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar3 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar28 + 0x8f1bbcdc + uVar59 + ((uVar60 | uVar1) & uVar56 | uVar60 & uVar1) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar4 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar29 + 0x8f1bbcdc + uVar56 + ((uVar57 | uVar3) & uVar1 | uVar57 & uVar3) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar59 = uVar30 + 0x8f1bbcdc + uVar1 + ((uVar60 | uVar4) & uVar3 | uVar60 & uVar4) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar56 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar1 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar31 + 0x8f1bbcdc + uVar3 + ((uVar57 | uVar56) & uVar4 | uVar57 & uVar56) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar3 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar60 = uVar32 + 0x8f1bbcdc + uVar4 + ((uVar59 | uVar1) & uVar56 | uVar59 & uVar1) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar59 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar33 + 0x8f1bbcdc + uVar56 + ((uVar57 | uVar3) & uVar1 | uVar57 & uVar3) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar56 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar34 + 0x8f1bbcdc + uVar1 + ((uVar60 | uVar59) & uVar3 | uVar60 & uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar1 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar35 + 0x8f1bbcdc + uVar3 + ((uVar57 | uVar56) & uVar59 | uVar57 & uVar56) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar3 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar36 + 0x8f1bbcdc + uVar59 + ((uVar60 | uVar1) & uVar56 | uVar60 & uVar1) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar59 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar37 + 0x8f1bbcdc + uVar56 + ((uVar57 | uVar3) & uVar1 | uVar57 & uVar3) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar56 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar38 + 0x8f1bbcdc + uVar1 + ((uVar60 | uVar59) & uVar3 | uVar60 & uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar1 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar39 + 0x8f1bbcdc + uVar3 + ((uVar57 | uVar56) & uVar59 | uVar57 & uVar56) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar3 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar40 + 0x8f1bbcdc + uVar59 + ((uVar60 | uVar1) & uVar56 | uVar60 & uVar1) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar59 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar41 + 0x8f1bbcdc + uVar56 + ((uVar57 | uVar3) & uVar1 | uVar57 & uVar3) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar56 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar42 + 0x8f1bbcdc + uVar1 + ((uVar60 | uVar59) & uVar3 | uVar60 & uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar1 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar43 + 0x8f1bbcdc + uVar3 + ((uVar57 | uVar56) & uVar59 | uVar57 & uVar56) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar59 = uVar44 + 0x8f1bbcdc + uVar59 + ((uVar60 | uVar1) & uVar56 | uVar60 & uVar1) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar3 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar45 + 0xca62c1d6 + uVar56 + (uVar3 ^ uVar1 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar4 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar46 + 0xca62c1d6 + uVar1 + (uVar4 ^ uVar3 ^ uVar59) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar56 = uVar35 ^ uVar37 ^ uVar43 ^ uVar48;
    uVar1 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar59 = uVar47 + 0xca62c1d6 + uVar3 + (uVar1 ^ uVar4 ^ uVar60) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar3 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar48 + 0xca62c1d6 + uVar4 + (uVar3 ^ uVar1 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar4 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar2 = uVar56 >> 0x1f | uVar56 << 1;
    uVar56 = uVar38 ^ uVar40 ^ uVar46 ^ uVar2;
    uVar5 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar57 = uVar49 + 0xca62c1d6 + uVar1 + (uVar4 ^ uVar3 ^ uVar59) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar59 = uVar58 + 0xca62c1d6 + uVar3 + (uVar5 ^ uVar4 ^ uVar60) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar58 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar2 + 0xca62c1d6 + uVar4 + (uVar58 ^ uVar5 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar1 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar3 = uVar56 >> 0x1f | uVar56 << 1;
    uVar56 = uVar41 ^ uVar43 ^ uVar49 ^ uVar3;
    uVar4 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar57 = uVar50 + 0xca62c1d6 + uVar5 + (uVar1 ^ uVar58 ^ uVar59) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar59 = uVar51 + 0xca62c1d6 + uVar58 + (uVar4 ^ uVar1 ^ uVar60) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar5 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar60 = uVar3 + 0xca62c1d6 + uVar1 + (uVar5 ^ uVar4 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar58 = uVar45 ^ uVar43 ^ uVar2 ^ uVar53;
    uVar1 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar2 = uVar56 >> 0x1f | uVar56 << 1;
    uVar56 = uVar44 ^ uVar46 ^ uVar50 ^ uVar2;
    uVar6 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar57 = uVar52 + 0xca62c1d6 + uVar4 + (uVar1 ^ uVar5 ^ uVar59) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar59 = uVar53 + 0xca62c1d6 + uVar5 + (uVar6 ^ uVar1 ^ uVar60) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar4 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar5 = uVar58 >> 0x1f | uVar58 << 1;
    uVar56 = uVar56 >> 0x1f | uVar56 << 1;
    uVar60 = uVar2 + 0xca62c1d6 + uVar1 + (uVar4 ^ uVar6 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar58 = uVar48 ^ uVar46 ^ uVar3 ^ uVar5;
    uVar3 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar1 = uVar47 ^ uVar49 ^ uVar52 ^ uVar56;
    uVar2 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar57 = uVar54 + 0xca62c1d6 + uVar6 + (uVar3 ^ uVar4 ^ uVar59) +
             (uVar60 >> 0x1b | uVar60 * 0x20);
    uVar59 = uVar5 + 0xca62c1d6 + uVar4 + (uVar2 ^ uVar3 ^ uVar60) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar60 = uVar60 >> 2 | uVar60 * 0x40000000;
    uVar4 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar56 + 0xca62c1d6 + uVar3 + (uVar60 ^ uVar2 ^ uVar57) +
             (uVar59 >> 0x1b | uVar59 * 0x20);
    uVar56 = uVar55 + 0xca62c1d6 + uVar2 + (uVar4 ^ uVar60 ^ uVar59) +
             (uVar57 >> 0x1b | uVar57 * 0x20);
    uVar3 = uVar59 >> 2 | uVar59 * 0x40000000;
    uVar58 = (uVar58 >> 0x1f | uVar58 << 1) + 0xca62c1d6 + uVar60 + (uVar3 ^ uVar4 ^ uVar57) +
             (uVar56 >> 0x1b | uVar56 * 0x20);
    uVar2 = uVar57 >> 2 | uVar57 * 0x40000000;
    uVar57 = uVar2 + param_1[4];
    uVar5 = uVar56 >> 2 | uVar56 * 0x40000000;
    uVar60 = uVar5 + param_1[3];
    uVar1 = (uVar1 >> 0x1f | uVar1 << 1) + 0xca62c1d6 + uVar4 + (uVar2 ^ uVar3 ^ uVar56) +
            (uVar58 >> 0x1b | uVar58 * 0x20);
    uVar59 = (uVar58 >> 2 | uVar58 * 0x40000000) + param_1[2];
    param_2 = param_2 + 0x10;
    param_1[3] = uVar60;
    param_1[4] = uVar57;
    uVar56 = uVar1 + param_1[1];
    uVar58 = *param_1 + 0xca62c1d6 + (uVar9 >> 0x1f | uVar9 << 1) + uVar3 + (uVar5 ^ uVar2 ^ uVar58)
             + (uVar1 >> 0x1b | uVar1 * 0x20);
    param_1[1] = uVar56;
    param_1[2] = uVar59;
    *param_1 = uVar58;
  } while (param_3 != 0);
  return;
}

