/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b70134
 */

void mbedtls_aria_setkey_enc(char *param_1,uint *param_2,uint param_3)

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
  long lVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  uint uVar18;
  uint uVar19;
  undefined2 uVar20;
  undefined6 uVar21;
  undefined8 uVar22;
  uint uVar23;
  uint uVar24;
  ulong uVar25;
  uint *puVar26;
  uint *puVar27;
  ulong uVar28;
  uint uVar29;
  uint uVar30;
  uint local_a8 [4];
  undefined8 local_98;
  undefined8 local_90;
  uint local_88;
  uint uStack_84;
  uint local_80;
  uint uStack_7c;
  uint local_78;
  uint uStack_74;
  uint local_70;
  uint uStack_6c;
  long local_68;
  
  lVar13 = tpidr_el0;
  uVar12 = param_3 - 0x80;
  local_68 = *(long *)(lVar13 + 0x28);
  if (((uVar12 == 0) || (param_3 == 0x100)) || (param_3 == 0xc0)) {
    local_a8[0] = *param_2;
    local_a8[1] = param_2[1];
    local_a8[2] = param_2[2];
    local_a8[3] = param_2[3];
    local_98 = 0;
    local_90 = 0;
    if ((0xbf < param_3) && (local_98 = *(undefined8 *)(param_2 + 4), param_3 == 0x100)) {
      local_90 = *(undefined8 *)(param_2 + 6);
    }
    uVar5 = uVar12 >> 6;
    uVar28 = (ulong)uVar5;
    uVar1 = 0;
    if (uVar12 < 0x80) {
      uVar1 = uVar5 + 1;
    }
    uVar12 = (&DAT_0077d6ec)[uVar28 * 4];
    uVar29 = (&DAT_0077d6f0)[uVar28 * 4];
    uVar3 = (&DAT_0077d6f4)[uVar28 * 4];
    uVar4 = (&DAT_0077d6f8)[uVar28 * 4];
    uVar25 = (ulong)(uVar1 + 1);
    uVar28 = (ulong)uVar1;
    puVar26 = (uint *)(param_1 + 0x84);
    *param_1 = (char)uVar5 * '\x02' + '\f';
    if (1 < uVar1) {
      uVar25 = 0;
    }
    uVar12 = uVar12 ^ local_a8[0];
    uVar4 = uVar4 ^ local_a8[3];
    uVar29 = uVar29 ^ local_a8[1];
    uVar3 = uVar3 ^ local_a8[2];
    uVar20 = CONCAT11((&DAT_0077d81c)[uVar4 >> 8 & 0xff],(&DAT_0077d71c)[uVar4 & 0xff]);
    uVar6 = (uint)(byte)(&DAT_0077d81c)[uVar3 >> 8 & 0xff] |
            (uint)(byte)(&DAT_0077da1c)[uVar3 >> 0x18] << 0x10 |
            ((uint)(byte)(&DAT_0077d71c)[uVar3 & 0xff] |
            (uint)(byte)(&DAT_0077d91c)[uVar3 >> 0x10 & 0xff] << 0x10) << 8;
    uVar1 = CONCAT13((&DAT_0077da1c)[uVar29 >> 0x18],
                     CONCAT12((&DAT_0077d91c)[uVar29 >> 0x10 & 0xff],
                              CONCAT11((&DAT_0077d81c)[uVar29 >> 8 & 0xff],
                                       (&DAT_0077d71c)[uVar29 & 0xff])));
    uVar5 = CONCAT13((&DAT_0077da1c)[uVar4 >> 0x18],
                     CONCAT12((&DAT_0077d91c)[uVar4 >> 0x10 & 0xff],uVar20));
    uVar3 = uVar6 ^ uVar1;
    uVar21 = CONCAT24(CONCAT11((&DAT_0077d81c)[uVar29 >> 8 & 0xff],(&DAT_0077d71c)[uVar29 & 0xff]),
                      uVar1);
    uVar1 = CONCAT13((&DAT_0077da1c)[uVar12 >> 0x18],
                     CONCAT12((&DAT_0077d91c)[uVar12 >> 0x10 & 0xff],
                              CONCAT11((&DAT_0077d81c)[uVar12 >> 8 & 0xff],
                                       (&DAT_0077d71c)[uVar12 & 0xff])));
    uVar4 = ((uint)(byte)(&DAT_0077d81c)[uVar4 >> 8 & 0xff] << 8 |
            (uint)(byte)(&DAT_0077da1c)[uVar4 >> 0x18] << 0x18) >> 8 |
            ((uint)(byte)(&DAT_0077d71c)[uVar4 & 0xff] |
            (uint)(byte)(&DAT_0077d91c)[uVar4 >> 0x10 & 0xff] << 0x10) << 8;
    uVar23 = (uint)((uint6)uVar21 >> 0x10);
    uVar29 = (uint)(CONCAT24(CONCAT11((&DAT_0077d81c)[uVar12 >> 8 & 0xff],
                                      (&DAT_0077d71c)[uVar12 & 0xff]),uVar1) >> 0x10);
    uVar12 = (uint)(CONCAT24(uVar20,uVar5) >> 0x10) ^ (uVar6 >> 0x10 | uVar6 << 0x10);
    uVar4 = (uVar4 >> 0x10 | uVar4 << 0x10) ^ uVar29 ^
            (uVar3 >> 8 & 0xff00ff | (uVar3 & 0xff00ff) << 8);
    uVar29 = ((uint3)((uint6)uVar21 >> 0x18) & 0xff00ff | (uVar23 & 0xff00ff) << 8) ^ uVar29;
    uVar3 = uVar4 ^ (uVar12 >> 0x10 | uVar12 << 0x10);
    uVar7 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
    uVar5 = uVar5 ^ uVar29;
    uVar8 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
    uVar3 = (uint)local_98 ^ uVar23 ^ (uVar3 >> 8 & 0xff00ff | (uVar3 & 0xff00ff) << 8);
    uVar23 = uVar3 ^ (&DAT_0077d6ec)[uVar28 * 4];
    uVar2 = local_98._4_4_ ^ uVar1 ^ uVar12 ^ uVar4;
    uVar5 = (&DAT_0077d6f0)[uVar28 * 4] ^ uVar2;
    uVar12 = CONCAT13((&DAT_0077d81c)[uVar23 >> 0x18],
                      CONCAT12((&DAT_0077d71c)[uVar23 >> 0x10 & 0xff],
                               CONCAT11((&DAT_0077da1c)[uVar23 >> 8 & 0xff],
                                        (&DAT_0077d91c)[uVar23 & 0xff])));
    uVar4 = (uVar8 >> 0x10 | uVar8 << 0x10) ^ (uint)local_90 ^ (uVar4 >> 0x10 | uVar4 << 0x10);
    uVar8 = (&DAT_0077d6f4)[uVar28 * 4] ^ uVar4;
    uVar1 = CONCAT13((&DAT_0077d81c)[uVar5 >> 0x18],
                     CONCAT12((&DAT_0077d71c)[uVar5 >> 0x10 & 0xff],
                              CONCAT11((&DAT_0077da1c)[uVar5 >> 8 & 0xff],
                                       (&DAT_0077d91c)[uVar5 & 0xff])));
    uVar21 = CONCAT24(CONCAT11((&DAT_0077da1c)[uVar5 >> 8 & 0xff],(&DAT_0077d91c)[uVar5 & 0xff]),
                      uVar1);
    local_90._4_4_ = uVar29 ^ uVar6 ^ (uVar7 >> 0x10 | uVar7 << 0x10) ^ local_90._4_4_;
    uVar24 = (uint)((uint6)uVar21 >> 0x10);
    uVar29 = (&DAT_0077d6f8)[uVar28 * 4] ^ local_90._4_4_;
    uVar8 = (uint)(byte)(&DAT_0077da1c)[uVar8 >> 8 & 0xff] |
            (uint)(byte)(&DAT_0077d81c)[uVar8 >> 0x18] << 0x10 |
            ((uint)(byte)(&DAT_0077d91c)[uVar8 & 0xff] |
            (uint)(byte)(&DAT_0077d71c)[uVar8 >> 0x10 & 0xff] << 0x10) << 8;
    uVar1 = uVar8 ^ uVar1;
    uVar20 = CONCAT11((&DAT_0077da1c)[uVar29 >> 8 & 0xff],(&DAT_0077d91c)[uVar29 & 0xff]);
    uVar5 = CONCAT13((&DAT_0077d81c)[uVar29 >> 0x18],
                     CONCAT12((&DAT_0077d71c)[uVar29 >> 0x10 & 0xff],uVar20));
    uVar30 = (uint)(CONCAT24(CONCAT11((&DAT_0077da1c)[uVar23 >> 8 & 0xff],
                                      (&DAT_0077d91c)[uVar23 & 0xff]),uVar12) >> 0x10);
    uVar23 = ((uint3)((uint6)uVar21 >> 0x18) & 0xff00ff | (uVar24 & 0xff00ff) << 8) ^ uVar30;
    uVar6 = ((uint)(byte)(&DAT_0077da1c)[uVar29 >> 8 & 0xff] << 8 |
            (uint)(byte)(&DAT_0077d81c)[uVar29 >> 0x18] << 0x18) >> 8 |
            ((uint)(byte)(&DAT_0077d91c)[uVar29 & 0xff] |
            (uint)(byte)(&DAT_0077d71c)[uVar29 >> 0x10 & 0xff] << 0x10) << 8;
    uVar29 = uVar5 ^ uVar23;
    uVar5 = (uint)(CONCAT24(uVar20,uVar5) >> 0x10) ^ (uVar8 >> 0x10 | uVar8 << 0x10);
    uVar7 = (uVar29 & 0xff00ff00) >> 8 | (uVar29 & 0xff00ff) << 8;
    uVar1 = (uVar6 >> 0x10 | uVar6 << 0x10) ^ uVar30 ^
            (uVar1 >> 8 & 0xff00ff | (uVar1 & 0xff00ff) << 8);
    uVar29 = uVar1 ^ (uVar5 >> 0x10 | uVar5 << 0x10);
    uVar6 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
    uStack_84 = uVar12 ^ local_a8[1] ^ uVar5 ^ uVar1;
    local_80 = (uVar7 >> 0x10 | uVar7 << 0x10) ^ local_a8[2] ^ (uVar1 >> 0x10 | uVar1 << 0x10);
    uStack_7c = uVar8 ^ local_a8[3] ^ uVar23 ^ (uVar6 >> 0x10 | uVar6 << 0x10);
    local_88 = uVar24 ^ local_a8[0] ^ (uVar29 >> 8 & 0xff00ff | (uVar29 & 0xff00ff) << 8);
    uVar1 = uStack_84 ^ (&DAT_0077d6f0)[uVar25 * 4];
    uVar12 = local_80 ^ (&DAT_0077d6f4)[uVar25 * 4];
    uVar5 = uStack_7c ^ (&DAT_0077d6f8)[uVar25 * 4];
    uVar29 = local_88 ^ (&DAT_0077d6ec)[uVar25 * 4];
    uVar20 = CONCAT11((&DAT_0077d81c)[uVar5 >> 8 & 0xff],(&DAT_0077d71c)[uVar5 & 0xff]);
    uVar8 = (uint)(byte)(&DAT_0077d81c)[uVar12 >> 8 & 0xff] |
            (uint)(byte)(&DAT_0077da1c)[uVar12 >> 0x18] << 0x10 |
            ((uint)(byte)(&DAT_0077d71c)[uVar12 & 0xff] |
            (uint)(byte)(&DAT_0077d91c)[uVar12 >> 0x10 & 0xff] << 0x10) << 8;
    uVar12 = CONCAT13((&DAT_0077da1c)[uVar1 >> 0x18],
                      CONCAT12((&DAT_0077d91c)[uVar1 >> 0x10 & 0xff],
                               CONCAT11((&DAT_0077d81c)[uVar1 >> 8 & 0xff],
                                        (&DAT_0077d71c)[uVar1 & 0xff])));
    uVar21 = CONCAT24(CONCAT11((&DAT_0077d81c)[uVar1 >> 8 & 0xff],(&DAT_0077d71c)[uVar1 & 0xff]),
                      uVar12);
    uVar12 = uVar8 ^ uVar12;
    uVar24 = (uint)((uint6)uVar21 >> 0x10);
    uVar1 = CONCAT13((&DAT_0077da1c)[uVar29 >> 0x18],
                     CONCAT12((&DAT_0077d91c)[uVar29 >> 0x10 & 0xff],
                              CONCAT11((&DAT_0077d81c)[uVar29 >> 8 & 0xff],
                                       (&DAT_0077d71c)[uVar29 & 0xff])));
    uVar23 = ((uint)(byte)(&DAT_0077d81c)[uVar5 >> 8 & 0xff] << 8 |
             (uint)(byte)(&DAT_0077da1c)[uVar5 >> 0x18] << 0x18) >> 8 |
             ((uint)(byte)(&DAT_0077d71c)[uVar5 & 0xff] |
             (uint)(byte)(&DAT_0077d91c)[uVar5 >> 0x10 & 0xff] << 0x10) << 8;
    uVar6 = uVar23 >> 0x10 | uVar23 << 0x10;
    uVar5 = (uint)(CONCAT24(uVar20,CONCAT13((&DAT_0077da1c)[uVar5 >> 0x18],
                                            CONCAT12((&DAT_0077d91c)[uVar5 >> 0x10 & 0xff],uVar20)))
                  >> 0x10) ^ (uVar8 >> 0x10 | uVar8 << 0x10);
    uVar23 = (uint)(CONCAT24(CONCAT11((&DAT_0077d81c)[uVar29 >> 8 & 0xff],
                                      (&DAT_0077d71c)[uVar29 & 0xff]),uVar1) >> 0x10);
    uVar29 = ((uint3)((uint6)uVar21 >> 0x18) & 0xff00ff | (uVar24 & 0xff00ff) << 8) ^ uVar23;
    uVar12 = uVar6 ^ uVar23 ^ (uVar12 >> 8 & 0xff00ff | (uVar12 & 0xff00ff) << 8);
    uVar7 = (uVar29 & 0xff00ff00) >> 8 | (uVar29 & 0xff00ff) << 8;
    uVar23 = uVar12 ^ (uVar5 >> 0x10 | uVar5 << 0x10);
    uVar30 = (uVar12 & 0xff00ff00) >> 8 | (uVar12 & 0xff00ff) << 8;
    puVar27 = local_a8 + 2;
    local_70 = (uVar7 >> 0x10 | uVar7 << 0x10) ^ uVar4 ^ uVar6 ^ (uVar12 >> 0x10 | uVar12 << 0x10);
    uStack_6c = uVar8 ^ local_90._4_4_ ^ uVar29 ^ (uVar30 >> 0x10 | uVar30 << 0x10);
    uVar28 = 1;
    local_98 = CONCAT44(uVar2,uVar3);
    local_90 = CONCAT44(local_90._4_4_,uVar4);
    local_78 = uVar24 ^ uVar3 ^ (uVar23 >> 8 & 0xff00ff | (uVar23 & 0xff00ff) << 8);
    uStack_74 = uVar1 ^ uVar2 ^ uVar5 ^ uVar12;
    do {
      uVar25 = uVar28 & 3;
      uVar12 = puVar27[-2];
      uVar1 = puVar27[-1];
      uVar28 = uVar28 + 1;
      uVar5 = (local_a8[uVar25 * 4 + 3] & 0xff00ff00) >> 8 |
              (local_a8[uVar25 * 4 + 3] & 0xff00ff) << 8;
      uVar5 = uVar5 >> 0x10 | uVar5 << 0x10;
      uVar29 = (local_a8[uVar25 * 4] & 0xff00ff00) >> 8 | (local_a8[uVar25 * 4] & 0xff00ff) << 8;
      uVar29 = uVar29 >> 0x10 | uVar29 << 0x10;
      uVar23 = (uint)(CONCAT44(uVar5,uVar29) >> 0x13);
      uVar23 = (uVar23 & 0xff00ff00) >> 8 | (uVar23 & 0xff00ff) << 8;
      puVar26[-0x20] = (uVar23 >> 0x10 | uVar23 << 0x10) ^ uVar12;
      uVar6 = (uint)(CONCAT44(uVar5,uVar29) >> 0x1f);
      uVar11 = (uint)(CONCAT44(uVar5,uVar29) >> 3);
      uVar16 = (uint)(CONCAT44(uVar5,uVar29) >> 1);
      uVar23 = (local_a8[uVar25 * 4 + 1] & 0xff00ff00) >> 8 |
               (local_a8[uVar25 * 4 + 1] & 0xff00ff) << 8;
      uVar23 = uVar23 >> 0x10 | uVar23 << 0x10;
      uVar8 = (uint)(CONCAT44(uVar29,uVar23) >> 0x13);
      uVar8 = (uVar8 & 0xff00ff00) >> 8 | (uVar8 & 0xff00ff) << 8;
      puVar26[-0x1f] = (uVar8 >> 0x10 | uVar8 << 0x10) ^ uVar1;
      uVar8 = (uint)(CONCAT44(uVar29,uVar23) >> 0x1f);
      uVar17 = (uint)(CONCAT44(uVar29,uVar23) >> 3);
      uVar7 = (uint)(CONCAT44(uVar29,uVar23) >> 1);
      uVar29 = (local_a8[uVar25 * 4 + 2] & 0xff00ff00) >> 8 |
               (local_a8[uVar25 * 4 + 2] & 0xff00ff) << 8;
      uVar29 = uVar29 >> 0x10 | uVar29 << 0x10;
      uVar30 = (uint)(CONCAT44(uVar23,uVar29) >> 3);
      uVar10 = (uint)(CONCAT44(uVar23,uVar29) >> 0x13);
      uVar18 = (uint)(CONCAT44(uVar29,uVar5) >> 0x13);
      uVar14 = (uint)(CONCAT44(uVar23,uVar29) >> 0x1f);
      uVar19 = (uint)(CONCAT44(uVar29,uVar5) >> 0x1f);
      uVar24 = (uint)(CONCAT44(uVar29,uVar5) >> 3);
      uVar9 = (uint)(CONCAT44(uVar23,uVar29) >> 1);
      uVar15 = (uint)(CONCAT44(uVar29,uVar5) >> 1);
      uVar23 = (uVar6 & 0xff00ff00) >> 8 | (uVar6 & 0xff00ff) << 8;
      uVar8 = (uVar8 & 0xff00ff00) >> 8 | (uVar8 & 0xff00ff) << 8;
      uVar6 = (uVar7 & 0xff00ff00) >> 8 | (uVar7 & 0xff00ff) << 8;
      uVar7 = (uVar30 & 0xff00ff00) >> 8 | (uVar30 & 0xff00ff) << 8;
      uVar5 = *puVar27;
      uVar30 = (uVar24 & 0xff00ff00) >> 8 | (uVar24 & 0xff00ff) << 8;
      uVar24 = (uVar9 & 0xff00ff00) >> 8 | (uVar9 & 0xff00ff) << 8;
      uVar29 = (uVar10 & 0xff00ff00) >> 8 | (uVar10 & 0xff00ff) << 8;
      puVar26[-0x1e] = (uVar29 >> 0x10 | uVar29 << 0x10) ^ uVar5;
      uVar29 = puVar27[1];
      uVar9 = (uVar11 & 0xff00ff00) >> 8 | (uVar11 & 0xff00ff) << 8;
      uVar10 = (uVar14 & 0xff00ff00) >> 8 | (uVar14 & 0xff00ff) << 8;
      uVar11 = (uVar15 & 0xff00ff00) >> 8 | (uVar15 & 0xff00ff) << 8;
      puVar26[-0x10] = (uVar23 >> 0x10 | uVar23 << 0x10) ^ uVar12;
      puVar26[-0xf] = (uVar8 >> 0x10 | uVar8 << 0x10) ^ uVar1;
      *puVar26 = (uVar7 >> 0x10 | uVar7 << 0x10) ^ uVar12;
      puVar26[1] = (uVar30 >> 0x10 | uVar30 << 0x10) ^ uVar1;
      uVar23 = (uVar16 & 0xff00ff00) >> 8 | (uVar16 & 0xff00ff) << 8;
      uVar8 = (uVar17 & 0xff00ff00) >> 8 | (uVar17 & 0xff00ff) << 8;
      uVar7 = (uVar18 & 0xff00ff00) >> 8 | (uVar18 & 0xff00ff) << 8;
      uVar30 = (uVar19 & 0xff00ff00) >> 8 | (uVar19 & 0xff00ff) << 8;
      puVar26[0x10] = (uVar6 >> 0x10 | uVar6 << 0x10) ^ uVar12;
      puVar26[0x11] = (uVar24 >> 0x10 | uVar24 << 0x10) ^ uVar1;
      puVar27 = puVar27 + 4;
      puVar26[-0x1d] = (uVar7 >> 0x10 | uVar7 << 0x10) ^ uVar29;
      puVar26[-0xe] = (uVar10 >> 0x10 | uVar10 << 0x10) ^ uVar5;
      puVar26[-0xd] = (uVar30 >> 0x10 | uVar30 << 0x10) ^ uVar29;
      puVar26[2] = uVar5 ^ (uVar9 >> 0x10 | uVar9 << 0x10);
      puVar26[3] = uVar29 ^ (uVar8 >> 0x10 | uVar8 << 0x10);
      puVar26[0x12] = (uVar11 >> 0x10 | uVar11 << 0x10) ^ uVar5;
      puVar26[0x13] = uVar29 ^ (uVar23 >> 0x10 | uVar23 << 0x10);
      puVar26 = puVar26 + 4;
    } while (uVar28 != 5);
    uVar12 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
    uVar12 = uVar12 >> 0x10 | uVar12 << 0x10;
    uVar1 = (uVar2 & 0xff00ff00) >> 8 | (uVar2 & 0xff00ff) << 8;
    uVar1 = uVar1 >> 0x10 | uVar1 << 0x10;
    uVar5 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
    uVar5 = uVar5 >> 0x10 | uVar5 << 0x10;
    uVar4 = (local_90._4_4_ & 0xff00ff00) >> 8 | (local_90._4_4_ & 0xff00ff) << 8;
    uVar4 = uVar4 >> 0x10 | uVar4 << 0x10;
    uVar29 = (uint)(CONCAT44(uVar12,uVar1) >> 0xd);
    uVar1 = (uint)(CONCAT44(uVar1,uVar5) >> 0xd);
    uVar5 = (uint)(CONCAT44(uVar5,uVar4) >> 0xd);
    uVar4 = (uint)(CONCAT44(uVar4,uVar12) >> 0xd);
    uVar12 = (uVar29 & 0xff00ff00) >> 8 | (uVar29 & 0xff00ff) << 8;
    uVar1 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
    uVar5 = (uVar5 & 0xff00ff00) >> 8 | (uVar5 & 0xff00ff) << 8;
    uVar4 = (uVar4 & 0xff00ff00) >> 8 | (uVar4 & 0xff00ff) << 8;
    *(uint *)(param_1 + 0x104) = (uVar12 >> 0x10 | uVar12 << 0x10) ^ local_a8[0];
    *(uint *)(param_1 + 0x108) = (uVar1 >> 0x10 | uVar1 << 0x10) ^ local_a8[1];
    *(uint *)(param_1 + 0x10c) = (uVar5 >> 0x10 | uVar5 << 0x10) ^ local_a8[2];
    *(uint *)(param_1 + 0x110) = (uVar4 >> 0x10 | uVar4 << 0x10) ^ local_a8[3];
    mbedtls_platform_zeroize(local_a8,0x40);
    uVar22 = 0;
  }
  else {
    uVar22 = 0xffffffa4;
  }
  if (*(long *)(lVar13 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar22);
  }
  return;
}

