/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bab204
 */

undefined8 mbedtls_internal_sha1_process(long param_1,uint *param_2)

{
  int iVar1;
  int iVar2;
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
  uint uVar37;
  uint uVar36;
  uint uVar38;
  uint uVar39;
  uint uVar40;
  uint uVar41;
  long lVar42;
  uint local_c8;
  uint local_c4;
  uint uStack_c0;
  uint local_bc;
  uint local_b8;
  uint local_b4;
  uint local_b0;
  uint local_ac;
  uint local_a8;
  uint local_a4;
  uint local_a0;
  uint local_9c;
  uint local_98;
  uint local_94;
  uint local_90;
  uint local_8c;
  uint local_88;
  int local_84;
  uint uStack_80;
  uint local_7c;
  uint local_78;
  uint local_74;
  long local_70;
  
  lVar42 = tpidr_el0;
  local_70 = *(long *)(lVar42 + 0x28);
  uVar4 = *param_2;
  uVar9 = param_2[1];
  uVar22 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
  uVar23 = (uVar9 & 0xff00ff00) >> 8 | (uVar9 & 0xff00ff) << 8;
  uVar16 = param_2[2];
  uVar24 = (uVar16 & 0xff00ff00) >> 8 | (uVar16 & 0xff00ff) << 8;
  uVar5 = param_2[3];
  uVar10 = param_2[4];
  uVar25 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  uVar26 = (uVar10 & 0xff00ff00) >> 8 | (uVar10 & 0xff00ff) << 8;
  uVar6 = param_2[5];
  uVar11 = param_2[6];
  uVar27 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
  uVar28 = (uVar11 & 0xff00ff00) >> 8 | (uVar11 & 0xff00ff) << 8;
  uVar7 = param_2[7];
  uVar12 = param_2[8];
  uVar29 = (uVar7 & 0xff00ff00) >> 8 | (uVar7 & 0xff00ff) << 8;
  uVar30 = (uVar12 & 0xff00ff00) >> 8 | (uVar12 & 0xff00ff) << 8;
  uVar8 = param_2[9];
  uVar13 = param_2[10];
  uVar31 = (uVar8 & 0xff00ff00) >> 8 | (uVar8 & 0xff00ff) << 8;
  uVar32 = (uVar13 & 0xff00ff00) >> 8 | (uVar13 & 0xff00ff) << 8;
  uVar17 = param_2[0xb];
  uVar18 = param_2[0xc];
  uVar33 = (uVar17 & 0xff00ff00) >> 8 | (uVar17 & 0xff00ff) << 8;
  uVar34 = (uVar18 & 0xff00ff00) >> 8 | (uVar18 & 0xff00ff) << 8;
  uVar19 = param_2[0xd];
  uVar20 = param_2[0xe];
  uVar3 = uVar6 ^ uVar5 ^ uVar17;
  uVar35 = (uVar19 & 0xff00ff00) >> 8 | (uVar19 & 0xff00ff) << 8;
  uVar5 = uVar5 ^ uVar9 ^ uVar8 ^ uVar20;
  uVar9 = uVar12 ^ uVar11 ^ uVar20;
  uVar36 = (uVar20 & 0xff00ff00) >> 8 | (uVar20 & 0xff00ff) << 8;
  uVar37 = uVar36 >> 0x10 | uVar36 << 0x10;
  uVar21 = param_2[0xf];
  uVar36 = uVar16 ^ uVar4 ^ uVar12 ^ uVar19;
  uVar6 = uVar7 ^ uVar6 ^ uVar19;
  uVar4 = (uVar21 & 0xff00ff00) >> 8 | (uVar21 & 0xff00ff) << 8;
  uVar38 = uVar4 >> 0x10 | uVar4 << 0x10;
  uVar4 = uVar11 ^ uVar10 ^ uVar18;
  uVar10 = uVar10 ^ uVar16 ^ uVar13 ^ uVar21;
  uVar7 = uVar8 ^ uVar7 ^ uVar21;
  uVar11 = *(uint *)(param_1 + 0x10);
  uVar14 = *(uint *)(param_1 + 0x14);
  uVar16 = *(uint *)(param_1 + 8);
  uVar15 = *(uint *)(param_1 + 0xc);
  uVar39 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
  uVar40 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
  uVar41 = uVar15 >> 2 | uVar15 << 0x1e;
  uVar5 = (uVar22 >> 0x10 | uVar22 << 0x10) + (uVar16 >> 0x1b | uVar16 << 5) +
          *(int *)(param_1 + 0x18) + ((uVar14 ^ uVar11) & uVar15 ^ uVar14) + 0x5a827999;
  uVar22 = uVar16 >> 2 | uVar16 << 0x1e;
  uVar4 = (uVar23 >> 0x10 | uVar23 << 0x10) + uVar14 + ((uVar41 ^ uVar11) & uVar16 ^ uVar11) +
          (uVar5 >> 0x1b | uVar5 * 0x20) + 0x5a827999;
  uVar23 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = (uVar24 >> 0x10 | uVar24 << 0x10) + uVar11 + (uVar5 & (uVar41 ^ uVar22) ^ uVar41) +
          (uVar4 >> 0x1b | uVar4 * 0x20) + 0x5a827999;
  uVar24 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = (uVar25 >> 0x10 | uVar25 << 0x10) + uVar41 + (uVar4 & (uVar23 ^ uVar22) ^ uVar22) +
          (uVar5 >> 0x1b | uVar5 * 0x20) + 0x5a827999;
  uVar25 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = (uVar26 >> 0x10 | uVar26 << 0x10) + uVar22 + (uVar5 & (uVar24 ^ uVar23) ^ uVar23) +
          (uVar4 >> 0x1b | uVar4 * 0x20) + 0x5a827999;
  uVar22 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = (uVar27 >> 0x10 | uVar27 << 0x10) + uVar23 + (uVar4 & (uVar25 ^ uVar24) ^ uVar24) +
          (uVar5 >> 0x1b | uVar5 * 0x20) + 0x5a827999;
  uVar23 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = (uVar28 >> 0x10 | uVar28 << 0x10) + uVar24 + (uVar5 & (uVar22 ^ uVar25) ^ uVar25) +
          (uVar4 >> 0x1b | uVar4 * 0x20) + 0x5a827999;
  uVar24 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = (uVar29 >> 0x10 | uVar29 << 0x10) + uVar25 + (uVar4 & (uVar23 ^ uVar22) ^ uVar22) +
          (uVar5 >> 0x1b | uVar5 * 0x20) + 0x5a827999;
  uVar25 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = (uVar30 >> 0x10 | uVar30 << 0x10) + uVar22 + (uVar5 & (uVar24 ^ uVar23) ^ uVar23) +
          (uVar4 >> 0x1b | uVar4 * 0x20) + 0x5a827999;
  uVar26 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = (uVar31 >> 0x10 | uVar31 << 0x10) + uVar23 + (uVar4 & (uVar25 ^ uVar24) ^ uVar24) +
          (uVar5 >> 0x1b | uVar5 * 0x20) + 0x5a827999;
  uVar23 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = (uVar32 >> 0x10 | uVar32 << 0x10) + uVar24 + (uVar5 & (uVar26 ^ uVar25) ^ uVar25) +
          (uVar4 >> 0x1b | uVar4 * 0x20) + 0x5a827999;
  uVar24 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar27 = (uVar39 & 0xffff) >> 0xf | (uVar39 >> 0x10 | uVar39 << 0x10) << 1;
  uVar10 = (uVar10 & 0xff00ff00) >> 8 | (uVar10 & 0xff00ff) << 8;
  uVar22 = (uVar36 & 0xff00ff00) >> 8 | (uVar36 & 0xff00ff) << 8;
  uVar36 = (uVar40 >> 0x10 | uVar40 << 0x10) ^ uVar27;
  uVar28 = (uVar10 & 0xffff) >> 0xf | (uVar10 >> 0x10 | uVar10 << 0x10) << 1;
  uVar4 = (uVar33 >> 0x10 | uVar33 << 0x10) + uVar25 + (uVar4 & (uVar23 ^ uVar26) ^ uVar26) +
          (uVar5 >> 0x1b | uVar5 * 0x20) + 0x5a827999;
  uVar22 = (uVar22 & 0xffff) >> 0xf | (uVar22 >> 0x10 | uVar22 << 0x10) << 1;
  uVar25 = uVar36 >> 0x1f | uVar36 << 1;
  uVar36 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = (uVar34 >> 0x10 | uVar34 << 0x10) + uVar26 + (uVar5 & (uVar24 ^ uVar23) ^ uVar23) +
          (uVar4 >> 0x1b | uVar4 * 0x20) + 0x5a827999;
  uVar10 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = (uVar35 >> 0x10 | uVar35 << 0x10) + uVar23 + (uVar4 & (uVar36 ^ uVar24) ^ uVar24) +
          (uVar5 >> 0x1b | uVar5 * 0x20) + 0x5a827999;
  uVar23 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar37 + uVar24 + (uVar5 & (uVar10 ^ uVar36) ^ uVar36) + (uVar4 >> 0x1b | uVar4 * 0x20) +
          0x5a827999;
  uVar24 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar38 + uVar36 + (uVar4 & (uVar23 ^ uVar10) ^ uVar10) + (uVar5 >> 0x1b | uVar5 * 0x20) +
          0x5a827999;
  uVar26 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar22 + uVar10 + (uVar5 & (uVar24 ^ uVar23) ^ uVar23) + (uVar4 >> 0x1b | uVar4 * 0x20) +
          0x5a827999;
  uVar29 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar27 + uVar23 + (uVar4 & (uVar26 ^ uVar24) ^ uVar24) + (uVar5 >> 0x1b | uVar5 * 0x20) +
          0x5a827999;
  uVar3 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
  uVar23 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar3 = (uVar3 >> 0x10 | uVar3 << 0x10) ^ uVar22;
  uVar30 = uVar3 >> 0x1f | uVar3 << 1;
  uVar5 = uVar28 + uVar24 + (uVar5 & (uVar29 ^ uVar26) ^ uVar26) + (uVar4 >> 0x1b | uVar4 * 0x20) +
          0x5a827999;
  uVar24 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar36 = ((uVar17 ^ uVar8) & 0xff00ff00) >> 8 | ((uVar17 ^ uVar8) & 0xff00ff) << 8;
  uVar10 = ((uVar19 ^ uVar17) & 0xff00ff00) >> 8 | ((uVar19 ^ uVar17) & 0xff00ff) << 8;
  uVar8 = ((uVar18 ^ uVar13) & 0xff00ff00) >> 8 | ((uVar18 ^ uVar13) & 0xff00ff) << 8;
  uVar12 = ((uVar13 ^ uVar12) & 0xff00ff00) >> 8 | ((uVar13 ^ uVar12) & 0xff00ff) << 8;
  uVar3 = (uVar9 & 0xff00ff00) >> 8 | (uVar9 & 0xff00ff) << 8;
  uVar3 = (uVar3 >> 0x10 | uVar3 << 0x10) ^ uVar30;
  uVar13 = uVar3 >> 0x1f | uVar3 << 1;
  uVar9 = ((uVar20 ^ uVar18) & 0xff00ff00) >> 8 | ((uVar20 ^ uVar18) & 0xff00ff) << 8;
  uVar3 = (uVar36 >> 0x10 | uVar36 << 0x10) ^ uVar27 ^ uVar13;
  uVar17 = uVar3 >> 0x1f | uVar3 << 1;
  uVar36 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
  uVar3 = (uVar9 >> 0x10 | uVar9 << 0x10) ^ uVar25 ^ uVar17;
  uVar9 = (uVar36 >> 0x10 | uVar36 << 0x10) ^ uVar28;
  uVar6 = uVar3 >> 0x1f | uVar3 << 1;
  uVar3 = (uVar7 & 0xff00ff00) >> 8 | (uVar7 & 0xff00ff) << 8;
  uVar3 = (uVar3 >> 0x10 | uVar3 << 0x10) ^ uVar25;
  uVar7 = uVar3 >> 0x1f | uVar3 << 1;
  uVar4 = uVar30 + uVar26 + (uVar4 & (uVar23 ^ uVar29) ^ uVar29) + (uVar5 >> 0x1b | uVar5 * 0x20) +
          0x5a827999;
  uVar36 = ((uVar21 ^ uVar19) & 0xff00ff00) >> 8 | ((uVar21 ^ uVar19) & 0xff00ff) << 8;
  uVar3 = (uVar8 >> 0x10 | uVar8 << 0x10) ^ uVar28 ^ uVar7;
  uVar8 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar18 = uVar9 >> 0x1f | uVar9 << 1;
  uVar5 = uVar25 + uVar29 + (uVar24 ^ uVar23 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar9 = (uVar12 >> 0x10 | uVar12 << 0x10) ^ uVar22 ^ uVar18;
  uVar12 = uVar3 >> 0x1f | uVar3 << 1;
  uVar3 = uVar27 ^ uVar38 ^ uVar7 ^ uVar6;
  uVar19 = uVar9 >> 0x1f | uVar9 << 1;
  uVar9 = (uVar36 >> 0x10 | uVar36 << 0x10) ^ uVar18 ^ uVar12;
  uVar36 = uVar3 >> 0x1f | uVar3 << 1;
  uVar20 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar3 = (uVar10 >> 0x10 | uVar10 << 0x10) ^ uVar30 ^ uVar19;
  uVar4 = uVar18 + uVar23 + (uVar8 ^ uVar24 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar10 = uVar9 >> 0x1f | uVar9 << 1;
  uVar9 = uVar25 ^ uVar28 ^ uVar12 ^ uVar36;
  uVar21 = uVar3 >> 0x1f | uVar3 << 1;
  uVar3 = uVar28 ^ uVar22 ^ uVar19 ^ uVar10;
  uVar23 = uVar9 >> 0x1f | uVar9 << 1;
  uVar9 = uVar22 ^ uVar37 ^ uVar13 ^ uVar21;
  uVar22 = uVar3 >> 0x1f | uVar3 << 1;
  uVar3 = uVar7 ^ uVar18 ^ uVar10 ^ uVar23;
  uVar26 = uVar9 >> 0x1f | uVar9 << 1;
  uVar9 = uVar18 ^ uVar30 ^ uVar21 ^ uVar22;
  uVar18 = uVar3 >> 0x1f | uVar3 << 1;
  uVar3 = uVar30 ^ uVar27 ^ uVar17 ^ uVar26;
  uVar27 = uVar9 >> 0x1f | uVar9 << 1;
  uVar9 = uVar12 ^ uVar19 ^ uVar22 ^ uVar18;
  uVar28 = uVar3 >> 0x1f | uVar3 << 1;
  uVar29 = uVar9 >> 0x1f | uVar9 << 1;
  uVar3 = uVar13 ^ uVar25 ^ uVar6 ^ uVar28;
  uVar25 = uVar3 >> 0x1f | uVar3 << 1;
  uVar3 = uVar19 ^ uVar13 ^ uVar26 ^ uVar27;
  uVar9 = uVar17 ^ uVar7 ^ uVar36 ^ uVar25;
  uVar3 = uVar3 >> 0x1f | uVar3 << 1;
  uVar9 = uVar9 >> 0x1f | uVar9 << 1;
  uVar30 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar13 + uVar24 + (uVar20 ^ uVar8 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar13 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar7 + uVar8 + (uVar30 ^ uVar20 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar7 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar19 + uVar20 + (uVar13 ^ uVar30 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar8 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar17 + uVar30 + (uVar7 ^ uVar13 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar19 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar12 + uVar13 + (uVar8 ^ uVar7 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar13 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar21 + uVar7 + (uVar19 ^ uVar8 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar7 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar6 + uVar8 + (uVar13 ^ uVar19 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar8 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar10 + uVar19 + (uVar7 ^ uVar13 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar19 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar26 + uVar13 + (uVar8 ^ uVar7 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar13 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar36 + uVar7 + (uVar19 ^ uVar8 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar7 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar22 + uVar8 + (uVar13 ^ uVar19 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar8 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar28 + uVar19 + (uVar7 ^ uVar13 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar19 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar23 + uVar13 + (uVar8 ^ uVar7 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar13 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar27 + uVar7 + (uVar19 ^ uVar8 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar7 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar25 + uVar8 + (uVar13 ^ uVar19 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar8 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar18 + uVar19 + (uVar7 ^ uVar13 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar19 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar5 = uVar3 + uVar13 + (uVar8 ^ uVar7 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0x6ed9eba1;
  uVar13 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = uVar9 + uVar7 + (uVar19 ^ uVar8 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0x6ed9eba1;
  uVar7 = uVar5 >> 2 | uVar5 * 0x40000000;
  iVar1 = uVar29 + uVar8 + ((uVar5 | uVar13) & uVar19 | uVar5 & uVar13) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar21 ^ uVar17 ^ uVar28 ^ uVar3;
  uVar8 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar17 = uVar4 >> 2 | uVar4 * 0x40000000;
  iVar2 = uVar8 + uVar19 + ((uVar4 | uVar7) & uVar13 | uVar4 & uVar7) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar6 ^ uVar12 ^ uVar23 ^ uVar9;
  uVar12 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar19 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar12 + uVar13 + ((uVar5 | uVar17) & uVar7 | uVar5 & uVar17) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar10 ^ uVar21 ^ uVar27 ^ uVar29;
  uVar13 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar20 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar13 + uVar7 + ((uVar4 | uVar19) & uVar17 | uVar4 & uVar19) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar26 ^ uVar6 ^ uVar25 ^ uVar8;
  uVar6 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar7 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar6 + uVar17 + ((uVar5 | uVar20) & uVar19 | uVar5 & uVar20) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar36 ^ uVar10 ^ uVar18 ^ uVar12;
  uVar10 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar17 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar10 + uVar19 + ((uVar4 | uVar7) & uVar20 | uVar4 & uVar7) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar22 ^ uVar26 ^ uVar3 ^ uVar13;
  uVar19 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar21 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar19 + uVar20 + ((uVar5 | uVar17) & uVar7 | uVar5 & uVar17) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar28 ^ uVar36 ^ uVar9 ^ uVar6;
  uVar36 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar20 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar36 + uVar7 + ((uVar4 | uVar21) & uVar17 | uVar4 & uVar21) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar23 ^ uVar22 ^ uVar29 ^ uVar10;
  uVar7 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar22 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar7 + uVar17 + ((uVar5 | uVar20) & uVar21 | uVar5 & uVar20) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar27 ^ uVar28 ^ uVar8 ^ uVar19;
  uVar17 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar24 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar17 + uVar21 + ((uVar4 | uVar22) & uVar20 | uVar4 & uVar22) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar25 ^ uVar23 ^ uVar12 ^ uVar36;
  uVar21 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar23 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar21 + uVar20 + ((uVar5 | uVar24) & uVar22 | uVar5 & uVar24) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar18 ^ uVar27 ^ uVar13 ^ uVar7;
  uVar20 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar26 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar20 + uVar22 + ((uVar4 | uVar23) & uVar24 | uVar4 & uVar23) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar3 ^ uVar25 ^ uVar6 ^ uVar17;
  uVar22 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar25 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar22 + uVar24 + ((uVar5 | uVar26) & uVar23 | uVar5 & uVar26) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar9 ^ uVar18 ^ uVar10 ^ uVar21;
  uVar18 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar24 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar18 + uVar23 + ((uVar4 | uVar25) & uVar26 | uVar4 & uVar25) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar29 ^ uVar3 ^ uVar19 ^ uVar20;
  uVar23 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar3 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar23 + uVar26 + ((uVar5 | uVar24) & uVar25 | uVar5 & uVar24) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar8 ^ uVar9 ^ uVar36 ^ uVar22;
  uVar26 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar9 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar26 + uVar25 + ((uVar4 | uVar3) & uVar24 | uVar4 & uVar3) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar12 ^ uVar29 ^ uVar7 ^ uVar18;
  uVar25 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar27 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar25 + uVar24 + ((uVar5 | uVar9) & uVar3 | uVar5 & uVar9) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar13 ^ uVar8 ^ uVar17 ^ uVar23;
  uVar8 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar24 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar8 + uVar3 + ((uVar4 | uVar27) & uVar9 | uVar4 & uVar27) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar6 ^ uVar12 ^ uVar21 ^ uVar26;
  uVar12 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar28 = uVar5 >> 2 | iVar1 * 0x40000000;
  iVar1 = uVar12 + uVar9 + ((uVar5 | uVar24) & uVar27 | uVar5 & uVar24) +
          (uVar4 >> 0x1b | uVar4 * 0x20);
  uVar5 = uVar10 ^ uVar13 ^ uVar20 ^ uVar25;
  uVar13 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = uVar19 ^ uVar6 ^ uVar22 ^ uVar8;
  uVar6 = uVar5 >> 0x1f | uVar5 << 1;
  uVar5 = iVar1 + 0x8f1bbcdc;
  uVar29 = uVar4 >> 2 | iVar2 * 0x40000000;
  iVar2 = uVar13 + uVar27 + ((uVar4 | uVar28) & uVar24 | uVar4 & uVar28) +
          (uVar5 >> 0x1b | uVar5 * 0x20);
  uVar4 = uVar7 ^ uVar19 ^ uVar23 ^ uVar13;
  uVar19 = uVar4 >> 0x1f | uVar4 << 1;
  uVar4 = iVar2 + 0x8f1bbcdc;
  uVar3 = uVar36 ^ uVar10 ^ uVar18 ^ uVar12;
  uVar10 = uVar5 >> 2 | iVar1 * 0x40000000;
  uVar27 = uVar3 >> 0x1f | uVar3 << 1;
  uVar5 = uVar6 + uVar24 + (uVar29 ^ uVar28 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0xca62c1d6;
  uVar24 = uVar4 >> 2 | iVar2 * 0x40000000;
  uVar4 = uVar27 + uVar28 + (uVar10 ^ uVar29 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0xca62c1d6;
  uVar3 = uVar21 ^ uVar7 ^ uVar25 ^ uVar27;
  local_c4 = uVar3 >> 0x1f | uVar3 << 1;
  uVar3 = uVar18 ^ uVar20 ^ uVar13 ^ local_c4;
  uVar9 = uVar17 ^ uVar36 ^ uVar26 ^ uVar6;
  uVar7 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar28 = uVar9 >> 0x1f | uVar9 << 1;
  uVar9 = uVar20 ^ uVar17 ^ uVar8 ^ uVar19;
  uVar5 = uVar19 + uVar29 + (uVar24 ^ uVar10 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0xca62c1d6;
  uStack_c0 = uVar9 >> 0x1f | uVar9 << 1;
  uVar17 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar9 = uVar23 ^ uVar22 ^ uVar6 ^ uStack_c0;
  uVar36 = uVar22 ^ uVar21 ^ uVar12 ^ uVar28;
  uVar4 = uVar28 + uVar10 + (uVar7 ^ uVar24 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0xca62c1d6;
  local_bc = uVar36 >> 0x1f | uVar36 << 1;
  uVar10 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar36 = uVar26 ^ uVar18 ^ uVar27 ^ local_bc;
  uVar5 = local_c4 + uVar24 + (uVar17 ^ uVar7 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0xca62c1d6
  ;
  local_b8 = uVar3 >> 0x1f | uVar3 << 1;
  uVar18 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar3 = uVar25 ^ uVar23 ^ uVar19 ^ local_b8;
  uVar4 = uStack_c0 + uVar7 + (uVar10 ^ uVar17 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) +
          0xca62c1d6;
  local_b4 = uVar9 >> 0x1f | uVar9 << 1;
  uVar7 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar9 = uVar8 ^ uVar26 ^ uVar28 ^ local_b4;
  uVar5 = local_bc + uVar17 + (uVar18 ^ uVar10 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) +
          0xca62c1d6;
  local_b0 = uVar36 >> 0x1f | uVar36 << 1;
  uVar17 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar36 = uVar12 ^ uVar25 ^ local_c4 ^ local_b0;
  uVar4 = local_b8 + uVar10 + (uVar7 ^ uVar18 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0xca62c1d6
  ;
  local_ac = uVar3 >> 0x1f | uVar3 << 1;
  uVar10 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar3 = uVar13 ^ uVar8 ^ uStack_c0 ^ local_ac;
  uVar5 = local_b4 + uVar18 + (uVar17 ^ uVar7 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0xca62c1d6
  ;
  local_a8 = uVar9 >> 0x1f | uVar9 << 1;
  uVar8 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar9 = uVar6 ^ uVar12 ^ local_bc ^ local_a8;
  uVar4 = local_b0 + uVar7 + (uVar10 ^ uVar17 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0xca62c1d6
  ;
  local_a4 = uVar36 >> 0x1f | uVar36 << 1;
  uVar7 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar36 = uVar27 ^ uVar13 ^ local_b8 ^ local_a4;
  uVar5 = local_ac + uVar17 + (uVar8 ^ uVar10 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0xca62c1d6
  ;
  local_a0 = uVar3 >> 0x1f | uVar3 << 1;
  uVar12 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar3 = uVar19 ^ uVar6 ^ local_b4 ^ local_a0;
  uVar4 = local_a8 + uVar10 + (uVar7 ^ uVar8 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0xca62c1d6;
  local_9c = uVar9 >> 0x1f | uVar9 << 1;
  uVar6 = uVar5 >> 2 | uVar5 * 0x40000000;
  uVar9 = uVar28 ^ uVar27 ^ local_b0 ^ local_9c;
  uVar5 = local_a4 + uVar8 + (uVar12 ^ uVar7 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0xca62c1d6;
  local_98 = uVar36 >> 0x1f | uVar36 << 1;
  uVar10 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar36 = local_c4 ^ uVar19 ^ local_ac ^ local_98;
  uVar4 = local_a0 + uVar7 + (uVar6 ^ uVar12 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0xca62c1d6;
  local_94 = uVar3 >> 0x1f | uVar3 << 1;
  uVar3 = uVar5 >> 2 | uVar5 * 0x40000000;
  local_c8 = uStack_c0 ^ uVar28 ^ local_a8 ^ local_94;
  uVar5 = local_9c + uVar12 + (uVar10 ^ uVar6 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0xca62c1d6
  ;
  local_90 = uVar9 >> 0x1f | uVar9 << 1;
  uVar9 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = local_98 + uVar6 + (uVar3 ^ uVar10 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0xca62c1d6;
  uVar6 = uVar5 >> 2 | uVar5 * 0x40000000;
  local_8c = uVar36 >> 0x1f | uVar36 << 1;
  uVar5 = local_94 + uVar10 + (uVar9 ^ uVar3 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) + 0xca62c1d6;
  local_74 = uVar4 >> 2 | uVar4 * 0x40000000;
  uVar4 = local_90 + uVar3 + (uVar6 ^ uVar9 ^ uVar4) + (uVar5 >> 0x1b | uVar5 * 0x20) + 0xca62c1d6;
  local_78 = uVar5 >> 2 | uVar5 * 0x40000000;
  local_88 = local_c8 >> 0x1f | local_c8 << 1;
  uStack_80 = local_8c + uVar9 + (local_74 ^ uVar6 ^ uVar5) + (uVar4 >> 0x1b | uVar4 * 0x20) +
              0xca62c1d6;
  local_84 = local_88 + uVar6 + (local_78 ^ local_74 ^ uVar4) +
             (uStack_80 >> 0x1b | uStack_80 * 0x20) + -0x359d3e2a;
  local_7c = uVar4 >> 2 | uVar4 * 0x40000000;
  *(uint *)(param_1 + 0x10) = local_7c + uVar11;
  *(uint *)(param_1 + 0x14) = local_78 + uVar14;
  *(uint *)(param_1 + 8) = local_84 + uVar16;
  *(uint *)(param_1 + 0xc) = uStack_80 + uVar15;
  *(uint *)(param_1 + 0x18) = local_74 + *(int *)(param_1 + 0x18);
  mbedtls_platform_zeroize(&local_c8,0x58);
  if (*(long *)(lVar42 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}

