/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae1ac4
 */

void FUN_00ae1ac4(ulong *param_1,ulong *param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
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
  long *plVar27;
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
  ulong local_78;
  ulong local_70;
  ulong local_68;
  
  if (param_3 != 0) {
    uVar19 = *param_1;
    uVar20 = param_1[1];
    uVar22 = param_1[2];
    uVar28 = param_1[3];
    uVar34 = param_1[4];
    uVar40 = param_1[5];
    uVar23 = param_1[6];
    uVar36 = param_1[7];
    do {
      uVar41 = (param_2[4] & 0xff00ff00ff00ff00) >> 8 | (param_2[4] & 0xff00ff00ff00ff) << 8;
      uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10;
      uVar39 = uVar41 >> 0x20 | uVar41 << 0x20;
      uVar41 = (*param_2 & 0xff00ff00ff00ff00) >> 8 | (*param_2 & 0xff00ff00ff00ff) << 8;
      uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10;
      local_70 = uVar41 >> 0x20 | uVar41 << 0x20;
      uVar41 = (param_2[3] & 0xff00ff00ff00ff00) >> 8 | (param_2[3] & 0xff00ff00ff00ff) << 8;
      uVar41 = (uVar41 & 0xffff0000ffff0000) >> 0x10 | (uVar41 & 0xffff0000ffff) << 0x10;
      uVar37 = uVar41 >> 0x20 | uVar41 << 0x20;
      lVar7 = uVar36 + ((uVar34 >> 0xe | uVar34 << 0x32) ^ (uVar34 >> 0x12 | uVar34 << 0x2e) ^
                       (uVar34 >> 0x29 | uVar34 << 0x17)) +
              (uVar23 & (uVar34 ^ 0xffffffffffffffff) ^ uVar40 & uVar34) + local_70 +
              0x428a2f98d728ae22;
      uVar41 = lVar7 + uVar28;
      uVar18 = ((uVar22 ^ uVar20) & uVar19 ^ uVar22 & uVar20) +
               ((uVar19 >> 0x1c | uVar19 << 0x24) ^ (uVar19 >> 0x22 | uVar19 << 0x1e) ^
               (uVar19 >> 0x27 | uVar19 << 0x19)) + lVar7;
      uVar38 = (param_2[1] & 0xff00ff00ff00ff00) >> 8 | (param_2[1] & 0xff00ff00ff00ff) << 8;
      uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 | (uVar38 & 0xffff0000ffff) << 0x10;
      local_68 = uVar38 >> 0x20 | uVar38 << 0x20;
      uVar38 = (param_2[5] & 0xff00ff00ff00ff00) >> 8 | (param_2[5] & 0xff00ff00ff00ff) << 8;
      uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 | (uVar38 & 0xffff0000ffff) << 0x10;
      uVar32 = uVar38 >> 0x20 | uVar38 << 0x20;
      uVar38 = (param_2[6] & 0xff00ff00ff00ff00) >> 8 | (param_2[6] & 0xff00ff00ff00ff) << 8;
      uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 | (uVar38 & 0xffff0000ffff) << 0x10;
      uVar31 = uVar38 >> 0x20 | uVar38 << 0x20;
      uVar38 = (param_2[0xb] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xb] & 0xff00ff00ff00ff) << 8;
      uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 | (uVar38 & 0xffff0000ffff) << 0x10;
      uVar14 = uVar38 >> 0x20 | uVar38 << 0x20;
      uVar38 = (param_2[0xe] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xe] & 0xff00ff00ff00ff) << 8;
      uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 | (uVar38 & 0xffff0000ffff) << 0x10;
      uVar17 = uVar38 >> 0x20 | uVar38 << 0x20;
      uVar38 = (param_2[8] & 0xff00ff00ff00ff00) >> 8 | (param_2[8] & 0xff00ff00ff00ff) << 8;
      uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 | (uVar38 & 0xffff0000ffff) << 0x10;
      uVar29 = uVar38 >> 0x20 | uVar38 << 0x20;
      uVar38 = (param_2[9] & 0xff00ff00ff00ff00) >> 8 | (param_2[9] & 0xff00ff00ff00ff) << 8;
      uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 | (uVar38 & 0xffff0000ffff) << 0x10;
      uVar16 = uVar38 >> 0x20 | uVar38 << 0x20;
      lVar7 = uVar23 + (uVar41 & uVar34 ^ uVar40 & (uVar41 ^ 0xffffffffffffffff)) +
              ((uVar41 >> 0xe | uVar41 << 0x32) ^ (uVar41 >> 0x12 | uVar41 << 0x2e) ^
              (uVar41 >> 0x29 | uVar41 * 0x800000)) + local_68 + 0x7137449123ef65cd;
      uVar38 = lVar7 + uVar22;
      uVar24 = ((uVar18 >> 0x1c | uVar18 << 0x24) ^ (uVar18 >> 0x22 | uVar18 * 0x40000000) ^
               (uVar18 >> 0x27 | uVar18 * 0x2000000)) +
               (uVar18 & uVar20 ^ uVar20 & uVar19 ^ uVar18 & uVar19) + lVar7;
      uVar35 = (param_2[2] & 0xff00ff00ff00ff00) >> 8 | (param_2[2] & 0xff00ff00ff00ff) << 8;
      uVar35 = (uVar35 & 0xffff0000ffff0000) >> 0x10 | (uVar35 & 0xffff0000ffff) << 0x10;
      uVar33 = uVar35 >> 0x20 | uVar35 << 0x20;
      lVar7 = uVar40 + (uVar38 & uVar41 ^ uVar34 & (uVar38 ^ 0xffffffffffffffff)) +
              ((uVar38 >> 0xe | uVar38 << 0x32) ^ (uVar38 >> 0x12 | uVar38 << 0x2e) ^
              (uVar38 >> 0x29 | uVar38 * 0x800000)) + uVar33 + -0x4a3f043013b2c4d1;
      uVar35 = lVar7 + uVar20;
      uVar25 = ((uVar24 >> 0x1c | uVar24 << 0x24) ^ (uVar24 >> 0x22 | uVar24 * 0x40000000) ^
               (uVar24 >> 0x27 | uVar24 * 0x2000000)) +
               ((uVar24 ^ uVar18) & uVar19 ^ uVar24 & uVar18) + lVar7;
      lVar7 = uVar34 + (uVar35 & uVar38 ^ uVar41 & (uVar35 ^ 0xffffffffffffffff)) +
              ((uVar35 >> 0xe | uVar35 << 0x32) ^ (uVar35 >> 0x12 | uVar35 << 0x2e) ^
              (uVar35 >> 0x29 | uVar35 * 0x800000)) + uVar37 + -0x164a245a7e762444;
      uVar21 = lVar7 + uVar19;
      uVar12 = ((uVar25 >> 0x1c | uVar25 << 0x24) ^ (uVar25 >> 0x22 | uVar25 * 0x40000000) ^
               (uVar25 >> 0x27 | uVar25 * 0x2000000)) +
               ((uVar25 ^ uVar24) & uVar18 ^ uVar25 & uVar24) + lVar7;
      lVar7 = uVar41 + (uVar21 & uVar35 ^ uVar38 & (uVar21 ^ 0xffffffffffffffff)) + uVar39 +
              ((uVar21 >> 0xe | uVar21 << 0x32) ^ (uVar21 >> 0x12 | uVar21 << 0x2e) ^
              (uVar21 >> 0x29 | uVar21 * 0x800000)) + 0x3956c25bf348b538;
      uVar18 = lVar7 + uVar18;
      uVar41 = ((uVar12 >> 0x1c | uVar12 << 0x24) ^ (uVar12 >> 0x22 | uVar12 * 0x40000000) ^
               (uVar12 >> 0x27 | uVar12 * 0x2000000)) +
               ((uVar12 ^ uVar25) & uVar24 ^ uVar12 & uVar25) + lVar7;
      lVar7 = uVar38 + (uVar18 & uVar21 ^ uVar35 & (uVar18 ^ 0xffffffffffffffff)) + uVar32 +
              ((uVar18 >> 0xe | uVar18 << 0x32) ^ (uVar18 >> 0x12 | uVar18 << 0x2e) ^
              (uVar18 >> 0x29 | uVar18 * 0x800000)) + 0x59f111f1b605d019;
      uVar38 = (param_2[7] & 0xff00ff00ff00ff00) >> 8 | (param_2[7] & 0xff00ff00ff00ff) << 8;
      uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 | (uVar38 & 0xffff0000ffff) << 0x10;
      uVar30 = uVar38 >> 0x20 | uVar38 << 0x20;
      uVar24 = lVar7 + uVar24;
      uVar38 = ((uVar41 >> 0x1c | uVar41 << 0x24) ^ (uVar41 >> 0x22 | uVar41 * 0x40000000) ^
               (uVar41 >> 0x27 | uVar41 * 0x2000000)) +
               ((uVar41 ^ uVar12) & uVar25 ^ uVar41 & uVar12) + lVar7;
      lVar7 = uVar35 + uVar31 + (uVar24 & uVar18 ^ uVar21 & (uVar24 ^ 0xffffffffffffffff)) +
              ((uVar24 >> 0xe | uVar24 << 0x32) ^ (uVar24 >> 0x12 | uVar24 << 0x2e) ^
              (uVar24 >> 0x29 | uVar24 * 0x800000)) + -0x6dc07d5b50e6b065;
      uVar25 = lVar7 + uVar25;
      uVar35 = ((uVar38 >> 0x1c | uVar38 << 0x24) ^ (uVar38 >> 0x22 | uVar38 * 0x40000000) ^
               (uVar38 >> 0x27 | uVar38 * 0x2000000)) +
               ((uVar38 ^ uVar41) & uVar12 ^ uVar38 & uVar41) + lVar7;
      lVar7 = uVar21 + uVar30 + (uVar25 & uVar24 ^ uVar18 & (uVar25 ^ 0xffffffffffffffff)) +
              ((uVar25 >> 0xe | uVar25 << 0x32) ^ (uVar25 >> 0x12 | uVar25 << 0x2e) ^
              (uVar25 >> 0x29 | uVar25 * 0x800000)) + -0x54e3a12a25927ee8;
      uVar12 = lVar7 + uVar12;
      uVar21 = ((uVar35 >> 0x1c | uVar35 << 0x24) ^ (uVar35 >> 0x22 | uVar35 * 0x40000000) ^
               (uVar35 >> 0x27 | uVar35 * 0x2000000)) +
               ((uVar35 ^ uVar38) & uVar41 ^ uVar35 & uVar38) + lVar7;
      lVar7 = uVar18 + uVar29 + (uVar12 & uVar25 ^ uVar24 & (uVar12 ^ 0xffffffffffffffff)) +
              ((uVar12 >> 0xe | uVar12 << 0x32) ^ (uVar12 >> 0x12 | uVar12 << 0x2e) ^
              (uVar12 >> 0x29 | uVar12 * 0x800000)) + -0x27f855675cfcfdbe;
      uVar18 = (param_2[10] & 0xff00ff00ff00ff00) >> 8 | (param_2[10] & 0xff00ff00ff00ff) << 8;
      uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
      uVar15 = uVar18 >> 0x20 | uVar18 << 0x20;
      uVar41 = lVar7 + uVar41;
      uVar18 = ((uVar21 >> 0x1c | uVar21 << 0x24) ^ (uVar21 >> 0x22 | uVar21 * 0x40000000) ^
               (uVar21 >> 0x27 | uVar21 * 0x2000000)) +
               ((uVar21 ^ uVar35) & uVar38 ^ uVar21 & uVar35) + lVar7;
      lVar7 = uVar24 + uVar16 + (uVar41 & uVar12 ^ uVar25 & (uVar41 ^ 0xffffffffffffffff)) +
              ((uVar41 >> 0xe | uVar41 << 0x32) ^ (uVar41 >> 0x12 | uVar41 << 0x2e) ^
              (uVar41 >> 0x29 | uVar41 * 0x800000)) + 0x12835b0145706fbe;
      uVar38 = lVar7 + uVar38;
      uVar24 = ((uVar18 >> 0x1c | uVar18 << 0x24) ^ (uVar18 >> 0x22 | uVar18 * 0x40000000) ^
               (uVar18 >> 0x27 | uVar18 * 0x2000000)) +
               ((uVar18 ^ uVar21) & uVar35 ^ uVar18 & uVar21) + lVar7;
      lVar7 = uVar25 + uVar15 + (uVar38 & uVar41 ^ uVar12 & (uVar38 ^ 0xffffffffffffffff)) +
              ((uVar38 >> 0xe | uVar38 << 0x32) ^ (uVar38 >> 0x12 | uVar38 << 0x2e) ^
              (uVar38 >> 0x29 | uVar38 * 0x800000)) + 0x243185be4ee4b28c;
      uVar25 = (param_2[0xc] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xc] & 0xff00ff00ff00ff) << 8;
      uVar25 = (uVar25 & 0xffff0000ffff0000) >> 0x10 | (uVar25 & 0xffff0000ffff) << 0x10;
      uVar13 = uVar25 >> 0x20 | uVar25 << 0x20;
      uVar35 = lVar7 + uVar35;
      uVar25 = ((uVar24 >> 0x1c | uVar24 << 0x24) ^ (uVar24 >> 0x22 | uVar24 * 0x40000000) ^
               (uVar24 >> 0x27 | uVar24 * 0x2000000)) +
               ((uVar24 ^ uVar18) & uVar21 ^ uVar24 & uVar18) + lVar7;
      lVar7 = uVar12 + uVar14 + (uVar35 & uVar38 ^ uVar41 & (uVar35 ^ 0xffffffffffffffff)) +
              ((uVar35 >> 0xe | uVar35 << 0x32) ^ (uVar35 >> 0x12 | uVar35 << 0x2e) ^
              (uVar35 >> 0x29 | uVar35 * 0x800000)) + 0x550c7dc3d5ffb4e2;
      uVar12 = (param_2[0xd] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xd] & 0xff00ff00ff00ff) << 8;
      uVar12 = (uVar12 & 0xffff0000ffff0000) >> 0x10 | (uVar12 & 0xffff0000ffff) << 0x10;
      uVar26 = uVar12 >> 0x20 | uVar12 << 0x20;
      uVar21 = lVar7 + uVar21;
      uVar12 = ((uVar25 >> 0x1c | uVar25 << 0x24) ^ (uVar25 >> 0x22 | uVar25 * 0x40000000) ^
               (uVar25 >> 0x27 | uVar25 * 0x2000000)) +
               ((uVar25 ^ uVar24) & uVar18 ^ uVar25 & uVar24) + lVar7;
      lVar7 = uVar41 + uVar13 + (uVar21 & uVar35 ^ uVar38 & (uVar21 ^ 0xffffffffffffffff)) +
              ((uVar21 >> 0xe | uVar21 << 0x32) ^ (uVar21 >> 0x12 | uVar21 << 0x2e) ^
              (uVar21 >> 0x29 | uVar21 * 0x800000)) + 0x72be5d74f27b896f;
      uVar18 = lVar7 + uVar18;
      uVar41 = ((uVar12 >> 0x1c | uVar12 << 0x24) ^ (uVar12 >> 0x22 | uVar12 * 0x40000000) ^
               (uVar12 >> 0x27 | uVar12 * 0x2000000)) +
               ((uVar12 ^ uVar25) & uVar24 ^ uVar12 & uVar25) + lVar7;
      lVar7 = uVar38 + uVar26 + (uVar18 & uVar21 ^ uVar35 & (uVar18 ^ 0xffffffffffffffff)) +
              ((uVar18 >> 0xe | uVar18 << 0x32) ^ (uVar18 >> 0x12 | uVar18 << 0x2e) ^
              (uVar18 >> 0x29 | uVar18 * 0x800000)) + -0x7f214e01c4e9694f;
      uVar24 = lVar7 + uVar24;
      uVar38 = ((uVar41 >> 0x1c | uVar41 << 0x24) ^ (uVar41 >> 0x22 | uVar41 * 0x40000000) ^
               (uVar41 >> 0x27 | uVar41 * 0x2000000)) +
               ((uVar41 ^ uVar12) & uVar25 ^ uVar41 & uVar12) + lVar7;
      lVar7 = uVar35 + uVar17 + (uVar24 & uVar18 ^ uVar21 & (uVar24 ^ 0xffffffffffffffff)) +
              ((uVar24 >> 0xe | uVar24 << 0x32) ^ (uVar24 >> 0x12 | uVar24 << 0x2e) ^
              (uVar24 >> 0x29 | uVar24 * 0x800000)) + -0x6423f958da38edcb;
      uVar25 = lVar7 + uVar25;
      uVar35 = ((uVar38 >> 0x1c | uVar38 << 0x24) ^ (uVar38 >> 0x22 | uVar38 * 0x40000000) ^
               (uVar38 >> 0x27 | uVar38 * 0x2000000)) +
               ((uVar38 ^ uVar41) & uVar12 ^ uVar38 & uVar41) + lVar7;
      uVar42 = (param_2[0xf] & 0xff00ff00ff00ff00) >> 8 | (param_2[0xf] & 0xff00ff00ff00ff) << 8;
      uVar42 = (uVar42 & 0xffff0000ffff0000) >> 0x10 | (uVar42 & 0xffff0000ffff) << 0x10;
      uVar42 = uVar42 >> 0x20 | uVar42 << 0x20;
      plVar27 = &DAT_00775dc8;
      lVar7 = uVar21 + uVar42 + (uVar25 & uVar24 ^ uVar18 & (uVar25 ^ 0xffffffffffffffff)) +
              ((uVar25 >> 0xe | uVar25 << 0x32) ^ (uVar25 >> 0x12 | uVar25 << 0x2e) ^
              (uVar25 >> 0x29 | uVar25 * 0x800000)) + -0x3e640e8b3096d96c;
      uVar12 = lVar7 + uVar12;
      uVar21 = ((uVar35 >> 0x1c | uVar35 << 0x24) ^ (uVar35 >> 0x22 | uVar35 * 0x40000000) ^
               (uVar35 >> 0x27 | uVar35 * 0x2000000)) +
               (uVar35 & (uVar38 ^ uVar41) ^ uVar38 & uVar41) + lVar7;
      local_78 = 0x10;
      do {
        uVar8 = uVar14 >> 8;
        uVar10 = uVar14 << 0x38;
        uVar1 = uVar14 >> 7;
        uVar3 = uVar14 >> 1;
        uVar5 = uVar14 << 0x3f;
        uVar9 = uVar42 >> 8;
        uVar11 = uVar42 << 0x38;
        uVar2 = uVar42 >> 7;
        uVar4 = uVar42 >> 1;
        uVar6 = uVar42 << 0x3f;
        local_70 = uVar16 + ((uVar17 >> 0x3d | uVar17 << 3) ^ uVar17 >> 6 ^
                            (uVar17 >> 0x13 | uVar17 << 0x2d)) + local_70 +
                   ((local_68 >> 8 | local_68 << 0x38) ^ local_68 >> 7 ^
                   (local_68 >> 1 | local_68 << 0x3f));
        local_68 = uVar15 + ((uVar42 >> 0x3d | uVar42 << 3) ^ uVar42 >> 6 ^
                            (uVar42 >> 0x13 | uVar42 << 0x2d)) + local_68 +
                   ((uVar33 >> 8 | uVar33 << 0x38) ^ uVar33 >> 7 ^ (uVar33 >> 1 | uVar33 << 0x3f));
        lVar7 = ((uVar12 >> 0xe | uVar12 << 0x32) ^ (uVar12 >> 0x12 | uVar12 << 0x2e) ^
                (uVar12 >> 0x29 | uVar12 << 0x17)) + uVar18 +
                (uVar24 & (uVar12 ^ 0xffffffffffffffff) ^ uVar25 & uVar12) + local_70 +
                plVar27[-0xf];
        uVar41 = lVar7 + uVar41;
        uVar18 = ((uVar38 ^ uVar35) & uVar21 ^ uVar38 & uVar35) +
                 ((uVar21 >> 0x1c | uVar21 << 0x24) ^ (uVar21 >> 0x22 | uVar21 << 0x1e) ^
                 (uVar21 >> 0x27 | uVar21 << 0x19)) + lVar7;
        uVar33 = uVar33 + uVar14 +
                 ((uVar37 >> 8 | uVar37 << 0x38) ^ uVar37 >> 7 ^ (uVar37 >> 1 | uVar37 << 0x3f)) +
                 ((local_70 >> 0x3d | local_70 * 8) ^ local_70 >> 6 ^
                 (local_70 >> 0x13 | local_70 << 0x2d));
        uVar37 = uVar37 + uVar13 +
                 ((uVar39 >> 8 | uVar39 << 0x38) ^ uVar39 >> 7 ^ (uVar39 >> 1 | uVar39 << 0x3f)) +
                 ((local_68 >> 0x3d | local_68 * 8) ^ local_68 >> 6 ^
                 (local_68 >> 0x13 | local_68 << 0x2d));
        lVar7 = local_68 + uVar24 + plVar27[-0xe] +
                (uVar41 & uVar12 ^ uVar25 & (uVar41 ^ 0xffffffffffffffff)) +
                ((uVar41 >> 0xe | uVar41 << 0x32) ^ (uVar41 >> 0x12 | uVar41 << 0x2e) ^
                (uVar41 >> 0x29 | uVar41 * 0x800000));
        uVar38 = lVar7 + uVar38;
        uVar24 = ((uVar18 >> 0x1c | uVar18 << 0x24) ^ (uVar18 >> 0x22 | uVar18 * 0x40000000) ^
                 (uVar18 >> 0x27 | uVar18 * 0x2000000)) +
                 (uVar18 & uVar35 ^ uVar35 & uVar21 ^ uVar18 & uVar21) + lVar7;
        uVar39 = uVar39 + uVar26 +
                 ((uVar32 >> 8 | uVar32 << 0x38) ^ uVar32 >> 7 ^ (uVar32 >> 1 | uVar32 << 0x3f)) +
                 ((uVar33 >> 0x3d | uVar33 * 8) ^ uVar33 >> 6 ^ (uVar33 >> 0x13 | uVar33 << 0x2d));
        uVar32 = uVar32 + uVar17 +
                 ((uVar31 >> 8 | uVar31 << 0x38) ^ uVar31 >> 7 ^ (uVar31 >> 1 | uVar31 << 0x3f)) +
                 ((uVar37 >> 0x3d | uVar37 * 8) ^ uVar37 >> 6 ^ (uVar37 >> 0x13 | uVar37 << 0x2d));
        lVar7 = uVar33 + uVar25 + plVar27[-0xd] +
                (uVar38 & uVar41 ^ uVar12 & (uVar38 ^ 0xffffffffffffffff)) +
                ((uVar38 >> 0xe | uVar38 << 0x32) ^ (uVar38 >> 0x12 | uVar38 << 0x2e) ^
                (uVar38 >> 0x29 | uVar38 * 0x800000));
        uVar35 = lVar7 + uVar35;
        uVar25 = ((uVar24 >> 0x1c | uVar24 << 0x24) ^ (uVar24 >> 0x22 | uVar24 * 0x40000000) ^
                 (uVar24 >> 0x27 | uVar24 * 0x2000000)) +
                 ((uVar24 ^ uVar18) & uVar21 ^ uVar24 & uVar18) + lVar7;
        uVar31 = uVar31 + uVar42 +
                 ((uVar30 >> 8 | uVar30 << 0x38) ^ uVar30 >> 7 ^ (uVar30 >> 1 | uVar30 << 0x3f)) +
                 ((uVar39 >> 0x3d | uVar39 * 8) ^ uVar39 >> 6 ^ (uVar39 >> 0x13 | uVar39 << 0x2d));
        uVar30 = ((uVar29 >> 8 | uVar29 << 0x38) ^ uVar29 >> 7 ^ (uVar29 >> 1 | uVar29 << 0x3f)) +
                 uVar30 + local_70 +
                 ((uVar32 >> 0x3d | uVar32 * 8) ^ uVar32 >> 6 ^ (uVar32 >> 0x13 | uVar32 << 0x2d));
        uVar29 = ((uVar16 >> 8 | uVar16 << 0x38) ^ uVar16 >> 7 ^ (uVar16 >> 1 | uVar16 << 0x3f)) +
                 uVar29 + local_68 +
                 ((uVar31 >> 0x3d | uVar31 * 8) ^ uVar31 >> 6 ^ (uVar31 >> 0x13 | uVar31 << 0x2d));
        uVar16 = ((uVar15 >> 8 | uVar15 << 0x38) ^ uVar15 >> 7 ^ (uVar15 >> 1 | uVar15 << 0x3f)) +
                 uVar16 + uVar33 +
                 ((uVar30 >> 0x3d | uVar30 * 8) ^ uVar30 >> 6 ^ (uVar30 >> 0x13 | uVar30 << 0x2d));
        lVar7 = uVar37 + uVar12 + plVar27[-0xc] +
                (uVar35 & uVar38 ^ uVar41 & (uVar35 ^ 0xffffffffffffffff)) +
                ((uVar35 >> 0xe | uVar35 << 0x32) ^ (uVar35 >> 0x12 | uVar35 << 0x2e) ^
                (uVar35 >> 0x29 | uVar35 * 0x800000));
        uVar21 = lVar7 + uVar21;
        uVar12 = ((uVar25 >> 0x1c | uVar25 << 0x24) ^ (uVar25 >> 0x22 | uVar25 * 0x40000000) ^
                 (uVar25 >> 0x27 | uVar25 * 0x2000000)) +
                 ((uVar25 ^ uVar24) & uVar18 ^ uVar25 & uVar24) + lVar7;
        uVar14 = ((uVar13 >> 8 | uVar13 << 0x38) ^ uVar13 >> 7 ^ (uVar13 >> 1 | uVar13 << 0x3f)) +
                 uVar14 + uVar39 +
                 ((uVar16 >> 0x3d | uVar16 * 8) ^ uVar16 >> 6 ^ (uVar16 >> 0x13 | uVar16 << 0x2d));
        uVar15 = ((uVar8 | uVar10) ^ uVar1 ^ (uVar3 | uVar5)) + uVar15 + uVar37 +
                 ((uVar29 >> 0x3d | uVar29 * 8) ^ uVar29 >> 6 ^ (uVar29 >> 0x13 | uVar29 << 0x2d));
        lVar7 = uVar41 + uVar39 + plVar27[-0xb] +
                (uVar21 & uVar35 ^ uVar38 & (uVar21 ^ 0xffffffffffffffff)) +
                ((uVar21 >> 0xe | uVar21 << 0x32) ^ (uVar21 >> 0x12 | uVar21 << 0x2e) ^
                (uVar21 >> 0x29 | uVar21 * 0x800000));
        uVar18 = lVar7 + uVar18;
        uVar41 = ((uVar12 >> 0x1c | uVar12 << 0x24) ^ (uVar12 >> 0x22 | uVar12 * 0x40000000) ^
                 (uVar12 >> 0x27 | uVar12 * 0x2000000)) +
                 ((uVar12 ^ uVar25) & uVar24 ^ uVar12 & uVar25) + lVar7;
        uVar13 = ((uVar26 >> 8 | uVar26 << 0x38) ^ uVar26 >> 7 ^ (uVar26 >> 1 | uVar26 << 0x3f)) +
                 uVar13 + uVar32 +
                 ((uVar15 >> 0x3d | uVar15 * 8) ^ uVar15 >> 6 ^ (uVar15 >> 0x13 | uVar15 << 0x2d));
        uVar26 = ((uVar17 >> 8 | uVar17 << 0x38) ^ uVar17 >> 7 ^ (uVar17 >> 1 | uVar17 << 0x3f)) +
                 uVar26 + uVar31 +
                 ((uVar14 >> 0x3d | uVar14 * 8) ^ uVar14 >> 6 ^ (uVar14 >> 0x13 | uVar14 << 0x2d));
        lVar7 = plVar27[-10] + uVar32 + uVar38 +
                (uVar18 & uVar21 ^ uVar35 & (uVar18 ^ 0xffffffffffffffff)) +
                ((uVar18 >> 0xe | uVar18 << 0x32) ^ (uVar18 >> 0x12 | uVar18 << 0x2e) ^
                (uVar18 >> 0x29 | uVar18 * 0x800000));
        uVar24 = lVar7 + uVar24;
        uVar38 = ((uVar41 >> 0x1c | uVar41 << 0x24) ^ (uVar41 >> 0x22 | uVar41 * 0x40000000) ^
                 (uVar41 >> 0x27 | uVar41 * 0x2000000)) +
                 ((uVar41 ^ uVar12) & uVar25 ^ uVar41 & uVar12) + lVar7;
        uVar42 = ((local_70 >> 8 | local_70 << 0x38) ^ local_70 >> 7 ^
                 (local_70 >> 1 | local_70 << 0x3f)) + uVar42 + uVar29 +
                 ((uVar26 >> 0x3d | uVar26 * 8) ^ uVar26 >> 6 ^ (uVar26 >> 0x13 | uVar26 << 0x2d));
        lVar7 = plVar27[-9] + uVar31 + uVar35 +
                (uVar24 & uVar18 ^ uVar21 & (uVar24 ^ 0xffffffffffffffff)) +
                ((uVar24 >> 0xe | uVar24 << 0x32) ^ (uVar24 >> 0x12 | uVar24 << 0x2e) ^
                (uVar24 >> 0x29 | uVar24 * 0x800000));
        uVar25 = lVar7 + uVar25;
        uVar35 = ((uVar38 >> 0x1c | uVar38 << 0x24) ^ (uVar38 >> 0x22 | uVar38 * 0x40000000) ^
                 (uVar38 >> 0x27 | uVar38 * 0x2000000)) +
                 ((uVar38 ^ uVar41) & uVar12 ^ uVar38 & uVar41) + lVar7;
        lVar7 = plVar27[-8] + uVar30 + uVar21 +
                (uVar25 & uVar24 ^ uVar18 & (uVar25 ^ 0xffffffffffffffff)) +
                ((uVar25 >> 0xe | uVar25 << 0x32) ^ (uVar25 >> 0x12 | uVar25 << 0x2e) ^
                (uVar25 >> 0x29 | uVar25 * 0x800000));
        uVar12 = lVar7 + uVar12;
        uVar21 = ((uVar35 >> 0x1c | uVar35 << 0x24) ^ (uVar35 >> 0x22 | uVar35 * 0x40000000) ^
                 (uVar35 >> 0x27 | uVar35 * 0x2000000)) +
                 ((uVar35 ^ uVar38) & uVar41 ^ uVar35 & uVar38) + lVar7;
        lVar7 = plVar27[-7] + uVar29 + uVar18 +
                (uVar12 & uVar25 ^ uVar24 & (uVar12 ^ 0xffffffffffffffff)) +
                ((uVar12 >> 0xe | uVar12 << 0x32) ^ (uVar12 >> 0x12 | uVar12 << 0x2e) ^
                (uVar12 >> 0x29 | uVar12 * 0x800000));
        uVar41 = lVar7 + uVar41;
        uVar18 = ((uVar21 >> 0x1c | uVar21 << 0x24) ^ (uVar21 >> 0x22 | uVar21 * 0x40000000) ^
                 (uVar21 >> 0x27 | uVar21 * 0x2000000)) +
                 ((uVar21 ^ uVar35) & uVar38 ^ uVar21 & uVar35) + lVar7;
        lVar7 = plVar27[-6] + uVar16 + uVar24 +
                (uVar41 & uVar12 ^ uVar25 & (uVar41 ^ 0xffffffffffffffff)) +
                ((uVar41 >> 0xe | uVar41 << 0x32) ^ (uVar41 >> 0x12 | uVar41 << 0x2e) ^
                (uVar41 >> 0x29 | uVar41 * 0x800000));
        uVar38 = lVar7 + uVar38;
        uVar24 = ((uVar18 >> 0x1c | uVar18 << 0x24) ^ (uVar18 >> 0x22 | uVar18 * 0x40000000) ^
                 (uVar18 >> 0x27 | uVar18 * 0x2000000)) +
                 ((uVar18 ^ uVar21) & uVar35 ^ uVar18 & uVar21) + lVar7;
        uVar17 = ((uVar9 | uVar11) ^ uVar2 ^ (uVar4 | uVar6)) + uVar17 + uVar30 +
                 ((uVar13 >> 0x3d | uVar13 * 8) ^ uVar13 >> 6 ^ (uVar13 >> 0x13 | uVar13 << 0x2d));
        lVar7 = plVar27[-5] + uVar15 + uVar25 +
                (uVar38 & uVar41 ^ uVar12 & (uVar38 ^ 0xffffffffffffffff)) +
                ((uVar38 >> 0xe | uVar38 << 0x32) ^ (uVar38 >> 0x12 | uVar38 << 0x2e) ^
                (uVar38 >> 0x29 | uVar38 * 0x800000));
        local_78 = local_78 + 0x10;
        uVar35 = lVar7 + uVar35;
        uVar25 = ((uVar24 >> 0x1c | uVar24 << 0x24) ^ (uVar24 >> 0x22 | uVar24 * 0x40000000) ^
                 (uVar24 >> 0x27 | uVar24 * 0x2000000)) +
                 ((uVar24 ^ uVar18) & uVar21 ^ uVar24 & uVar18) + lVar7;
        lVar7 = plVar27[-4] + uVar14 + uVar12 +
                (uVar35 & uVar38 ^ uVar41 & (uVar35 ^ 0xffffffffffffffff)) +
                ((uVar35 >> 0xe | uVar35 << 0x32) ^ (uVar35 >> 0x12 | uVar35 << 0x2e) ^
                (uVar35 >> 0x29 | uVar35 * 0x800000));
        uVar21 = lVar7 + uVar21;
        uVar12 = ((uVar25 >> 0x1c | uVar25 << 0x24) ^ (uVar25 >> 0x22 | uVar25 * 0x40000000) ^
                 (uVar25 >> 0x27 | uVar25 * 0x2000000)) +
                 ((uVar25 ^ uVar24) & uVar18 ^ uVar25 & uVar24) + lVar7;
        lVar7 = plVar27[-3] + uVar13 + uVar41 +
                (uVar21 & uVar35 ^ uVar38 & (uVar21 ^ 0xffffffffffffffff)) +
                ((uVar21 >> 0xe | uVar21 << 0x32) ^ (uVar21 >> 0x12 | uVar21 << 0x2e) ^
                (uVar21 >> 0x29 | uVar21 * 0x800000));
        uVar18 = lVar7 + uVar18;
        uVar41 = ((uVar12 >> 0x1c | uVar12 << 0x24) ^ (uVar12 >> 0x22 | uVar12 * 0x40000000) ^
                 (uVar12 >> 0x27 | uVar12 * 0x2000000)) +
                 ((uVar12 ^ uVar25) & uVar24 ^ uVar12 & uVar25) + lVar7;
        lVar7 = plVar27[-2] + uVar26 + uVar38 +
                (uVar18 & uVar21 ^ uVar35 & (uVar18 ^ 0xffffffffffffffff)) +
                ((uVar18 >> 0xe | uVar18 << 0x32) ^ (uVar18 >> 0x12 | uVar18 << 0x2e) ^
                (uVar18 >> 0x29 | uVar18 * 0x800000));
        uVar24 = lVar7 + uVar24;
        uVar38 = ((uVar41 >> 0x1c | uVar41 << 0x24) ^ (uVar41 >> 0x22 | uVar41 * 0x40000000) ^
                 (uVar41 >> 0x27 | uVar41 * 0x2000000)) +
                 ((uVar41 ^ uVar12) & uVar25 ^ uVar41 & uVar12) + lVar7;
        lVar7 = plVar27[-1] + uVar17 + uVar35 +
                (uVar24 & uVar18 ^ uVar21 & (uVar24 ^ 0xffffffffffffffff)) +
                ((uVar24 >> 0xe | uVar24 << 0x32) ^ (uVar24 >> 0x12 | uVar24 << 0x2e) ^
                (uVar24 >> 0x29 | uVar24 * 0x800000));
        uVar25 = lVar7 + uVar25;
        uVar35 = ((uVar38 >> 0x1c | uVar38 << 0x24) ^ (uVar38 >> 0x22 | uVar38 * 0x40000000) ^
                 (uVar38 >> 0x27 | uVar38 * 0x2000000)) +
                 ((uVar38 ^ uVar41) & uVar12 ^ uVar38 & uVar41) + lVar7;
        lVar7 = *plVar27 + uVar42 + uVar21 +
                (uVar25 & uVar24 ^ uVar18 & (uVar25 ^ 0xffffffffffffffff)) +
                ((uVar25 >> 0xe | uVar25 << 0x32) ^ (uVar25 >> 0x12 | uVar25 << 0x2e) ^
                (uVar25 >> 0x29 | uVar25 * 0x800000));
        uVar12 = lVar7 + uVar12;
        uVar21 = ((uVar35 >> 0x1c | uVar35 << 0x24) ^ (uVar35 >> 0x22 | uVar35 * 0x40000000) ^
                 (uVar35 >> 0x27 | uVar35 * 0x2000000)) +
                 (uVar35 & (uVar38 ^ uVar41) ^ uVar38 & uVar41) + lVar7;
        plVar27 = plVar27 + 0x10;
      } while (local_78 < 0x50);
      uVar19 = uVar21 + uVar19;
      uVar40 = uVar25 + uVar40;
      uVar23 = uVar24 + uVar23;
      uVar36 = uVar18 + uVar36;
      uVar20 = uVar35 + uVar20;
      uVar22 = uVar38 + uVar22;
      *param_1 = uVar19;
      param_1[1] = uVar20;
      param_1[6] = uVar23;
      param_1[7] = uVar36;
      uVar28 = uVar41 + uVar28;
      uVar34 = uVar12 + uVar34;
      param_1[2] = uVar22;
      param_1[3] = uVar28;
      param_1[4] = uVar34;
      param_1[5] = uVar40;
      param_3 = param_3 + -1;
      param_2 = param_2 + 0x10;
    } while (param_3 != 0);
  }
  return;
}

