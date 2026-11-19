/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b48550
 */

void FUN_00b48550(long param_1,undefined8 *param_2,long param_3)

{
  uint uVar1;
  undefined8 *puVar2;
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
  ulong uVar20;
  uint uVar21;
  uint uVar22;
  uint uVar23;
  uint uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  uint uVar29;
  uint uVar30;
  uint uVar31;
  uint uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 local_c0;
  undefined8 uStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  uint local_80;
  uint uStack_7c;
  uint uStack_78;
  uint uStack_74;
  uint local_70;
  uint uStack_6c;
  uint local_68;
  uint uStack_64;
  uint local_60;
  uint uStack_5c;
  uint uStack_58;
  uint uStack_54;
  uint local_50;
  uint uStack_4c;
  uint local_48;
  uint uStack_44;
  
  uStack_88 = param_2[param_3 * 0x10 + -1];
  local_90 = param_2[param_3 * 0x10 + -2];
  uStack_98 = param_2[param_3 * 0x10 + -3];
  local_a0 = param_2[param_3 * 0x10 + -4];
  uStack_a8 = param_2[param_3 * 0x10 + -5];
  local_b0 = param_2[param_3 * 0x10 + -6];
  uStack_b8 = param_2[param_3 * 0x10 + -7];
  local_c0 = param_2[param_3 * 0x10 + -8];
  if (param_3 * 2 != 0) {
    uVar20 = 0;
    do {
      uVar33 = param_2[1];
      uVar25 = *param_2;
      uVar11 = 10;
      uVar21 = CONCAT13((byte)((ulong)local_c0 >> 0x18) ^ (byte)((ulong)uVar25 >> 0x18),
                        CONCAT12((byte)((ulong)local_c0 >> 0x10) ^ (byte)((ulong)uVar25 >> 0x10),
                                 CONCAT11((byte)((ulong)local_c0 >> 8) ^ (byte)((ulong)uVar25 >> 8),
                                          (byte)local_c0 ^ (byte)uVar25)));
      uVar29 = CONCAT13((byte)((ulong)uStack_b8 >> 0x18) ^ (byte)((ulong)uVar33 >> 0x18),
                        CONCAT12((byte)((ulong)uStack_b8 >> 0x10) ^ (byte)((ulong)uVar33 >> 0x10),
                                 CONCAT11((byte)((ulong)uStack_b8 >> 8) ^ (byte)((ulong)uVar33 >> 8)
                                          ,(byte)uStack_b8 ^ (byte)uVar33)));
      uVar34 = param_2[3];
      uVar26 = param_2[2];
      uVar22 = CONCAT13((byte)((ulong)local_b0 >> 0x18) ^ (byte)((ulong)uVar26 >> 0x18),
                        CONCAT12((byte)((ulong)local_b0 >> 0x10) ^ (byte)((ulong)uVar26 >> 0x10),
                                 CONCAT11((byte)((ulong)local_b0 >> 8) ^ (byte)((ulong)uVar26 >> 8),
                                          (byte)local_b0 ^ (byte)uVar26)));
      uVar30 = CONCAT13((byte)((ulong)uStack_a8 >> 0x18) ^ (byte)((ulong)uVar34 >> 0x18),
                        CONCAT12((byte)((ulong)uStack_a8 >> 0x10) ^ (byte)((ulong)uVar34 >> 0x10),
                                 CONCAT11((byte)((ulong)uStack_a8 >> 8) ^ (byte)((ulong)uVar34 >> 8)
                                          ,(byte)uStack_a8 ^ (byte)uVar34)));
      uVar35 = param_2[5];
      uVar27 = param_2[4];
      uVar23 = CONCAT13((byte)((ulong)local_a0 >> 0x18) ^ (byte)((ulong)uVar27 >> 0x18),
                        CONCAT12((byte)((ulong)local_a0 >> 0x10) ^ (byte)((ulong)uVar27 >> 0x10),
                                 CONCAT11((byte)((ulong)local_a0 >> 8) ^ (byte)((ulong)uVar27 >> 8),
                                          (byte)local_a0 ^ (byte)uVar27)));
      uVar31 = CONCAT13((byte)((ulong)uStack_98 >> 0x18) ^ (byte)((ulong)uVar35 >> 0x18),
                        CONCAT12((byte)((ulong)uStack_98 >> 0x10) ^ (byte)((ulong)uVar35 >> 0x10),
                                 CONCAT11((byte)((ulong)uStack_98 >> 8) ^ (byte)((ulong)uVar35 >> 8)
                                          ,(byte)uStack_98 ^ (byte)uVar35)));
      uVar36 = param_2[7];
      uVar28 = param_2[6];
      uVar24 = CONCAT13((byte)((ulong)local_90 >> 0x18) ^ (byte)((ulong)uVar28 >> 0x18),
                        CONCAT12((byte)((ulong)local_90 >> 0x10) ^ (byte)((ulong)uVar28 >> 0x10),
                                 CONCAT11((byte)((ulong)local_90 >> 8) ^ (byte)((ulong)uVar28 >> 8),
                                          (byte)local_90 ^ (byte)uVar28)));
      uVar32 = CONCAT13((byte)((ulong)uStack_88 >> 0x18) ^ (byte)((ulong)uVar36 >> 0x18),
                        CONCAT12((byte)((ulong)uStack_88 >> 0x10) ^ (byte)((ulong)uVar36 >> 0x10),
                                 CONCAT11((byte)((ulong)uStack_88 >> 8) ^ (byte)((ulong)uVar36 >> 8)
                                          ,(byte)uStack_88 ^ (byte)uVar36)));
      uStack_7c = (uint)(CONCAT17((byte)((ulong)local_c0 >> 0x38) ^ (byte)((ulong)uVar25 >> 0x38),
                                  CONCAT16((byte)((ulong)local_c0 >> 0x30) ^
                                           (byte)((ulong)uVar25 >> 0x30),
                                           CONCAT15((byte)((ulong)local_c0 >> 0x28) ^
                                                    (byte)((ulong)uVar25 >> 0x28),
                                                    CONCAT14((byte)((ulong)local_c0 >> 0x20) ^
                                                             (byte)((ulong)uVar25 >> 0x20),uVar21)))
                                 ) >> 0x20);
      uVar3 = uStack_7c;
      uStack_4c = (uint)(CONCAT17((byte)((ulong)local_90 >> 0x38) ^ (byte)((ulong)uVar28 >> 0x38),
                                  CONCAT16((byte)((ulong)local_90 >> 0x30) ^
                                           (byte)((ulong)uVar28 >> 0x30),
                                           CONCAT15((byte)((ulong)local_90 >> 0x28) ^
                                                    (byte)((ulong)uVar28 >> 0x28),
                                                    CONCAT14((byte)((ulong)local_90 >> 0x20) ^
                                                             (byte)((ulong)uVar28 >> 0x20),uVar24)))
                                 ) >> 0x20);
      uVar9 = uStack_4c;
      uStack_6c = (uint)(CONCAT17((byte)((ulong)local_b0 >> 0x38) ^ (byte)((ulong)uVar26 >> 0x38),
                                  CONCAT16((byte)((ulong)local_b0 >> 0x30) ^
                                           (byte)((ulong)uVar26 >> 0x30),
                                           CONCAT15((byte)((ulong)local_b0 >> 0x28) ^
                                                    (byte)((ulong)uVar26 >> 0x28),
                                                    CONCAT14((byte)((ulong)local_b0 >> 0x20) ^
                                                             (byte)((ulong)uVar26 >> 0x20),uVar22)))
                                 ) >> 0x20);
      uVar5 = uStack_6c;
      uStack_5c = (uint)(CONCAT17((byte)((ulong)local_a0 >> 0x38) ^ (byte)((ulong)uVar27 >> 0x38),
                                  CONCAT16((byte)((ulong)local_a0 >> 0x30) ^
                                           (byte)((ulong)uVar27 >> 0x30),
                                           CONCAT15((byte)((ulong)local_a0 >> 0x28) ^
                                                    (byte)((ulong)uVar27 >> 0x28),
                                                    CONCAT14((byte)((ulong)local_a0 >> 0x20) ^
                                                             (byte)((ulong)uVar27 >> 0x20),uVar23)))
                                 ) >> 0x20);
      uVar7 = uStack_5c;
      uStack_54 = (uint)(CONCAT17((byte)((ulong)uStack_98 >> 0x38) ^ (byte)((ulong)uVar35 >> 0x38),
                                  CONCAT16((byte)((ulong)uStack_98 >> 0x30) ^
                                           (byte)((ulong)uVar35 >> 0x30),
                                           CONCAT15((byte)((ulong)uStack_98 >> 0x28) ^
                                                    (byte)((ulong)uVar35 >> 0x28),
                                                    CONCAT14((byte)((ulong)uStack_98 >> 0x20) ^
                                                             (byte)((ulong)uVar35 >> 0x20),uVar31)))
                                 ) >> 0x20);
      uVar8 = uStack_54;
      uStack_64 = (uint)(CONCAT17((byte)((ulong)uStack_a8 >> 0x38) ^ (byte)((ulong)uVar34 >> 0x38),
                                  CONCAT16((byte)((ulong)uStack_a8 >> 0x30) ^
                                           (byte)((ulong)uVar34 >> 0x30),
                                           CONCAT15((byte)((ulong)uStack_a8 >> 0x28) ^
                                                    (byte)((ulong)uVar34 >> 0x28),
                                                    CONCAT14((byte)((ulong)uStack_a8 >> 0x20) ^
                                                             (byte)((ulong)uVar34 >> 0x20),uVar30)))
                                 ) >> 0x20);
      uVar6 = uStack_64;
      uStack_44 = (uint)(CONCAT17((byte)((ulong)uStack_88 >> 0x38) ^ (byte)((ulong)uVar36 >> 0x38),
                                  CONCAT16((byte)((ulong)uStack_88 >> 0x30) ^
                                           (byte)((ulong)uVar36 >> 0x30),
                                           CONCAT15((byte)((ulong)uStack_88 >> 0x28) ^
                                                    (byte)((ulong)uVar36 >> 0x28),
                                                    CONCAT14((byte)((ulong)uStack_88 >> 0x20) ^
                                                             (byte)((ulong)uVar36 >> 0x20),uVar32)))
                                 ) >> 0x20);
      uVar10 = uStack_44;
      uStack_74 = (uint)(CONCAT17((byte)((ulong)uStack_b8 >> 0x38) ^ (byte)((ulong)uVar33 >> 0x38),
                                  CONCAT16((byte)((ulong)uStack_b8 >> 0x30) ^
                                           (byte)((ulong)uVar33 >> 0x30),
                                           CONCAT15((byte)((ulong)uStack_b8 >> 0x28) ^
                                                    (byte)((ulong)uVar33 >> 0x28),
                                                    CONCAT14((byte)((ulong)uStack_b8 >> 0x20) ^
                                                             (byte)((ulong)uVar33 >> 0x20),uVar29)))
                                 ) >> 0x20);
      uVar4 = uStack_74;
      uVar16 = uVar21;
      uVar14 = uVar24;
      uVar13 = uVar22;
      uVar17 = uVar23;
      uVar18 = uVar31;
      uVar15 = uVar30;
      uVar12 = uVar32;
      uVar19 = uVar29;
      do {
        uVar13 = uVar13 ^ (uVar16 + uVar14 >> 0x19 | (uVar16 + uVar14) * 0x80);
        uStack_5c = uStack_5c ^ (uStack_6c + uStack_7c >> 0x19 | (uStack_6c + uStack_7c) * 0x80);
        uVar12 = uVar12 ^ (uVar18 + uVar15 >> 0x19 | (uVar18 + uVar15) * 0x80);
        uStack_74 = uStack_74 ^ (uStack_44 + uStack_54 >> 0x19 | (uStack_44 + uStack_54) * 0x80);
        uVar17 = uVar17 ^ (uVar13 + uVar16 >> 0x17 | (uVar13 + uVar16) * 0x200);
        uStack_4c = uStack_4c ^ (uStack_5c + uStack_6c >> 0x17 | (uStack_5c + uStack_6c) * 0x200);
        uVar19 = uVar19 ^ (uVar12 + uVar18 >> 0x17 | (uVar12 + uVar18) * 0x200);
        uStack_64 = uStack_64 ^ (uStack_74 + uStack_44 >> 0x17 | (uStack_74 + uStack_44) * 0x200);
        uVar14 = uVar14 ^ (uVar17 + uVar13 >> 0x13 | (uVar17 + uVar13) * 0x2000);
        uStack_7c = uStack_7c ^ (uStack_4c + uStack_5c >> 0x13 | (uStack_4c + uStack_5c) * 0x2000);
        uVar15 = uVar15 ^ (uVar19 + uVar12 >> 0x13 | (uVar19 + uVar12) * 0x2000);
        uStack_54 = uStack_54 ^ (uStack_64 + uStack_74 >> 0x13 | (uStack_64 + uStack_74) * 0x2000);
        uVar1 = uVar14 + uVar17;
        uVar16 = uVar16 ^ (uVar1 >> 0xe | uVar1 * 0x40000);
        uVar1 = uStack_7c + uStack_4c;
        uStack_6c = uStack_6c ^ (uVar1 >> 0xe | uVar1 * 0x40000);
        uVar1 = uVar15 + uVar19;
        uVar18 = uVar18 ^ (uVar1 >> 0xe | uVar1 * 0x40000);
        uVar1 = uStack_54 + uStack_64;
        uStack_44 = uStack_44 ^ (uVar1 >> 0xe | uVar1 * 0x40000);
        uStack_7c = uStack_7c ^ (uVar16 + uStack_74 >> 0x19 | (uVar16 + uStack_74) * 0x80);
        uVar15 = uVar15 ^ (uStack_6c + uVar13 >> 0x19 | (uStack_6c + uVar13) * 0x80);
        uStack_54 = uStack_54 ^ (uVar18 + uStack_5c >> 0x19 | (uVar18 + uStack_5c) * 0x80);
        uVar14 = uVar14 ^ (uStack_44 + uVar12 >> 0x19 | (uStack_44 + uVar12) * 0x80);
        uVar19 = uVar19 ^ (uStack_7c + uVar16 >> 0x17 | (uStack_7c + uVar16) * 0x200);
        uStack_64 = uStack_64 ^ (uVar15 + uStack_6c >> 0x17 | (uVar15 + uStack_6c) * 0x200);
        uVar17 = uVar17 ^ (uStack_54 + uVar18 >> 0x17 | (uStack_54 + uVar18) * 0x200);
        uStack_4c = uStack_4c ^ (uVar14 + uStack_44 >> 0x17 | (uVar14 + uStack_44) * 0x200);
        uStack_74 = uStack_74 ^ (uVar19 + uStack_7c >> 0x13 | (uVar19 + uStack_7c) * 0x2000);
        uVar13 = uVar13 ^ (uStack_64 + uVar15 >> 0x13 | (uStack_64 + uVar15) * 0x2000);
        uStack_5c = uStack_5c ^ (uVar17 + uStack_54 >> 0x13 | (uVar17 + uStack_54) * 0x2000);
        uVar12 = uVar12 ^ (uStack_4c + uVar14 >> 0x13 | (uStack_4c + uVar14) * 0x2000);
        uVar16 = uVar16 ^ (uStack_74 + uVar19 >> 0xe | (uStack_74 + uVar19) * 0x40000);
        uStack_6c = uStack_6c ^ (uVar13 + uStack_64 >> 0xe | (uVar13 + uStack_64) * 0x40000);
        uVar11 = uVar11 - 2;
        uVar18 = uVar18 ^ (uStack_5c + uVar17 >> 0xe | (uStack_5c + uVar17) * 0x40000);
        uStack_44 = uStack_44 ^ (uVar12 + uStack_4c >> 0xe | (uVar12 + uStack_4c) * 0x40000);
      } while (2 < uVar11);
      _local_80 = CONCAT44(uStack_7c,uVar16);
      _local_50 = CONCAT44(uStack_4c,uVar14);
      _local_68 = CONCAT44(uStack_64,uVar15);
      _uStack_78 = CONCAT44(uStack_74,uVar19);
      param_2 = param_2 + 8;
      _local_70 = CONCAT44(uStack_6c,uVar13);
      local_c0 = CONCAT44(uVar3 + uStack_7c,uVar21 + uVar16);
      _local_60 = CONCAT44(uStack_5c,uVar17);
      _uStack_58 = CONCAT44(uStack_54,uVar18);
      _local_48 = CONCAT44(uStack_44,uVar12);
      uStack_b8 = CONCAT44(uVar4 + uStack_74,uVar29 + uVar19);
      local_b0 = CONCAT44(uVar5 + uStack_6c,uVar22 + uVar13);
      uStack_a8 = CONCAT44(uVar6 + uStack_64,uVar30 + uVar15);
      local_a0 = CONCAT44(uVar7 + uStack_5c,uVar23 + uVar17);
      uStack_98 = CONCAT44(uVar8 + uStack_54,uVar31 + uVar18);
      local_90 = CONCAT44(uVar9 + uStack_4c,uVar24 + uVar14);
      uStack_88 = CONCAT44(uVar10 + uStack_44,uVar32 + uVar12);
      OPENSSL_cleanse(&local_80,0x40);
      puVar2 = (undefined8 *)(param_1 + ((uVar20 & 1) * param_3 + (uVar20 >> 1)) * 0x40);
      puVar2[7] = uStack_88;
      puVar2[6] = local_90;
      uVar20 = uVar20 + 1;
      puVar2[5] = uStack_98;
      puVar2[4] = local_a0;
      puVar2[3] = uStack_a8;
      puVar2[2] = local_b0;
      puVar2[1] = uStack_b8;
      *puVar2 = local_c0;
    } while (uVar20 != param_3 * 2);
  }
  OPENSSL_cleanse(&local_c0,0x40);
  return;
}

