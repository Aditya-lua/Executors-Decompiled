/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a92868
 */

void ChaCha20_ctr32(ulong param_1,int *param_2,ulong param_3,uint *param_4,uint *param_5)

{
  ulong uVar1;
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
  ulong uVar18;
  uint uVar19;
  int *piVar20;
  uint uVar21;
  uint uVar22;
  uint uVar23;
  ulong uVar24;
  uint uVar25;
  int *piVar26;
  uint uVar27;
  undefined8 *puVar28;
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
  undefined8 uVar40;
  undefined8 uVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  undefined8 uVar45;
  undefined8 uVar46;
  undefined8 uVar47;
  int local_a0 [4];
  int local_90;
  int local_8c;
  int local_88;
  int local_84;
  int local_80;
  int local_7c;
  int local_78;
  int local_74;
  int local_70;
  int local_6c;
  int local_68;
  int local_64;
  
  if (param_3 != 0) {
    uVar11 = *param_4;
    uVar12 = param_4[7];
    uVar2 = param_4[1];
    uVar6 = param_4[2];
    uVar3 = param_4[3];
    uVar7 = param_4[4];
    uVar4 = param_4[5];
    uVar8 = param_4[6];
    uVar29 = *param_5;
    uVar9 = param_5[1];
    uVar5 = param_5[2];
    uVar10 = param_5[3];
    do {
      uVar31 = 0x16;
      uVar19 = 0x6b206574;
      uVar21 = 0x79622d32;
      uVar30 = 0x3320646e;
      uVar17 = 0x61707865;
      uVar23 = uVar2;
      uVar22 = uVar11;
      uVar33 = uVar12;
      uVar32 = uVar10;
      uVar36 = uVar3;
      uVar34 = uVar8;
      uVar35 = uVar5;
      uVar39 = uVar6;
      uVar38 = uVar4;
      uVar37 = uVar9;
      uVar25 = uVar7;
      uVar27 = uVar29;
      do {
        uVar27 = uVar22 + uVar17 ^ uVar27;
        uVar37 = uVar23 + uVar30 ^ uVar37;
        uVar35 = uVar39 + uVar21 ^ uVar35;
        uVar32 = uVar36 + uVar19 ^ uVar32;
        uVar13 = uVar27 >> 0x10 | uVar27 << 0x10;
        uVar14 = uVar37 >> 0x10 | uVar37 << 0x10;
        uVar15 = uVar35 >> 0x10 | uVar35 << 0x10;
        uVar16 = uVar32 >> 0x10 | uVar32 << 0x10;
        uVar25 = uVar13 + uVar25;
        uVar38 = uVar14 + uVar38;
        uVar34 = uVar15 + uVar34;
        uVar33 = uVar16 + uVar33;
        uVar27 = uVar25 ^ uVar22;
        uVar37 = uVar38 ^ uVar23;
        uVar35 = uVar34 ^ uVar39;
        uVar32 = uVar33 ^ uVar36;
        uVar27 = uVar27 >> 0x14 | uVar27 << 0xc;
        uVar37 = uVar37 >> 0x14 | uVar37 << 0xc;
        uVar35 = uVar35 >> 0x14 | uVar35 << 0xc;
        uVar32 = uVar32 >> 0x14 | uVar32 << 0xc;
        uVar17 = uVar27 + uVar22 + uVar17;
        uVar30 = uVar37 + uVar23 + uVar30;
        uVar21 = uVar35 + uVar39 + uVar21;
        uVar19 = uVar32 + uVar36 + uVar19;
        uVar13 = uVar17 ^ uVar13;
        uVar14 = uVar30 ^ uVar14;
        uVar15 = uVar21 ^ uVar15;
        uVar16 = uVar19 ^ uVar16;
        uVar39 = uVar13 >> 0x18 | uVar13 << 8;
        uVar36 = uVar14 >> 0x18 | uVar14 << 8;
        uVar22 = uVar15 >> 0x18 | uVar15 << 8;
        uVar23 = uVar16 >> 0x18 | uVar16 << 8;
        uVar25 = uVar39 + uVar25;
        uVar38 = uVar36 + uVar38;
        uVar34 = uVar22 + uVar34;
        uVar33 = uVar23 + uVar33;
        uVar27 = uVar25 ^ uVar27;
        uVar37 = uVar38 ^ uVar37;
        uVar35 = uVar34 ^ uVar35;
        uVar32 = uVar33 ^ uVar32;
        uVar13 = uVar27 >> 0x19 | uVar27 << 7;
        uVar27 = uVar37 >> 0x19 | uVar37 << 7;
        uVar37 = uVar35 >> 0x19 | uVar35 << 7;
        uVar35 = uVar32 >> 0x19 | uVar32 << 7;
        uVar17 = uVar27 + uVar17;
        uVar30 = uVar37 + uVar30;
        uVar21 = uVar35 + uVar21;
        uVar19 = uVar13 + uVar19;
        uVar23 = uVar17 ^ uVar23;
        uVar39 = uVar39 ^ uVar30;
        uVar36 = uVar36 ^ uVar21;
        uVar22 = uVar19 ^ uVar22;
        uVar32 = uVar23 >> 0x10 | uVar23 << 0x10;
        uVar23 = uVar39 >> 0x10 | uVar39 << 0x10;
        uVar39 = uVar36 >> 0x10 | uVar36 << 0x10;
        uVar36 = uVar22 >> 0x10 | uVar22 << 0x10;
        uVar34 = uVar32 + uVar34;
        uVar33 = uVar23 + uVar33;
        uVar25 = uVar25 + uVar39;
        uVar38 = uVar36 + uVar38;
        uVar27 = uVar34 ^ uVar27;
        uVar37 = uVar33 ^ uVar37;
        uVar35 = uVar25 ^ uVar35;
        uVar13 = uVar38 ^ uVar13;
        uVar22 = uVar27 >> 0x14 | uVar27 << 0xc;
        uVar14 = uVar37 >> 0x14 | uVar37 << 0xc;
        uVar15 = uVar35 >> 0x14 | uVar35 << 0xc;
        uVar13 = uVar13 >> 0x14 | uVar13 << 0xc;
        uVar17 = uVar22 + uVar17;
        uVar30 = uVar14 + uVar30;
        uVar21 = uVar15 + uVar21;
        uVar19 = uVar13 + uVar19;
        uVar32 = uVar17 ^ uVar32;
        uVar23 = uVar30 ^ uVar23;
        uVar39 = uVar21 ^ uVar39;
        uVar36 = uVar19 ^ uVar36;
        uVar32 = uVar32 >> 0x18 | uVar32 << 8;
        uVar27 = uVar23 >> 0x18 | uVar23 << 8;
        uVar37 = uVar39 >> 0x18 | uVar39 << 8;
        uVar35 = uVar36 >> 0x18 | uVar36 << 8;
        uVar34 = uVar32 + uVar34;
        uVar33 = uVar27 + uVar33;
        uVar25 = uVar37 + uVar25;
        uVar38 = uVar35 + uVar38;
        uVar31 = uVar31 - 2;
        uVar22 = uVar34 ^ uVar22;
        uVar14 = uVar33 ^ uVar14;
        uVar15 = uVar25 ^ uVar15;
        uVar13 = uVar38 ^ uVar13;
        uVar23 = uVar22 >> 0x19 | uVar22 << 7;
        uVar39 = uVar14 >> 0x19 | uVar14 << 7;
        uVar36 = uVar15 >> 0x19 | uVar15 << 7;
        uVar22 = uVar13 >> 0x19 | uVar13 << 7;
      } while (2 < uVar31);
      local_a0[0] = uVar17 + 0x61707865;
      local_a0[1] = uVar30 + 0x3320646e;
      local_a0[2] = uVar21 + 0x79622d32;
      local_a0[3] = uVar19 + 0x6b206574;
      local_90 = uVar22 + uVar11;
      local_8c = uVar23 + uVar2;
      local_88 = uVar39 + uVar6;
      local_84 = uVar36 + uVar3;
      local_80 = uVar25 + uVar7;
      local_7c = uVar38 + uVar4;
      local_78 = uVar34 + uVar8;
      local_74 = uVar33 + uVar12;
      local_70 = uVar27 + uVar29;
      local_6c = uVar37 + uVar9;
      local_68 = uVar35 + uVar5;
      uVar1 = param_3;
      if (0x3f < param_3) {
        uVar1 = 0x40;
      }
      local_64 = uVar32 + uVar10;
      if (uVar1 != 0) {
        uVar24 = 0;
        if (0x1f < uVar1) {
          if (param_1 < (long)param_2 + uVar1 && param_2 < (int *)(param_1 + uVar1)) {
            uVar24 = 0;
          }
          else {
            uVar24 = 0;
            if ((long)local_a0 + uVar1 <= param_1 || (int *)(param_1 + uVar1) <= local_a0) {
              uVar24 = uVar1 & 0x60;
              piVar26 = param_2 + 4;
              puVar28 = (undefined8 *)(param_1 + 0x10);
              uVar18 = uVar24;
              piVar20 = &local_90;
              do {
                uVar41 = *(undefined8 *)(piVar26 + -2);
                uVar40 = *(undefined8 *)(piVar26 + -4);
                uVar43 = *(undefined8 *)(piVar26 + 2);
                uVar42 = *(undefined8 *)piVar26;
                uVar45 = *(undefined8 *)(piVar20 + -2);
                uVar44 = *(undefined8 *)(piVar20 + -4);
                uVar47 = *(undefined8 *)(piVar20 + 2);
                uVar46 = *(undefined8 *)piVar20;
                piVar26 = piVar26 + 8;
                piVar20 = piVar20 + 8;
                uVar18 = uVar18 - 0x20;
                puVar28[-1] = CONCAT17((byte)((ulong)uVar45 >> 0x38) ^ (byte)((ulong)uVar41 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar45 >> 0x30) ^
                                                 (byte)((ulong)uVar41 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar45 >> 0x28) ^
                                                          (byte)((ulong)uVar41 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar45 >> 0x20) ^
                                                                   (byte)((ulong)uVar41 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar45 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar41 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar45 >> 0x10) ^ (byte)((ulong)uVar41 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar45 >> 8) ^
                                                           (byte)((ulong)uVar41 >> 8),
                                                           (byte)uVar45 ^ (byte)uVar41)))))));
                puVar28[-2] = CONCAT17((byte)((ulong)uVar44 >> 0x38) ^ (byte)((ulong)uVar40 >> 0x38)
                                       ,CONCAT16((byte)((ulong)uVar44 >> 0x30) ^
                                                 (byte)((ulong)uVar40 >> 0x30),
                                                 CONCAT15((byte)((ulong)uVar44 >> 0x28) ^
                                                          (byte)((ulong)uVar40 >> 0x28),
                                                          CONCAT14((byte)((ulong)uVar44 >> 0x20) ^
                                                                   (byte)((ulong)uVar40 >> 0x20),
                                                                   CONCAT13((byte)((ulong)uVar44 >>
                                                                                  0x18) ^
                                                                            (byte)((ulong)uVar40 >>
                                                                                  0x18),
                                                                            CONCAT12((byte)((ulong)
                                                  uVar44 >> 0x10) ^ (byte)((ulong)uVar40 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar44 >> 8) ^
                                                           (byte)((ulong)uVar40 >> 8),
                                                           (byte)uVar44 ^ (byte)uVar40)))))));
                puVar28[1] = CONCAT17((byte)((ulong)uVar47 >> 0x38) ^ (byte)((ulong)uVar43 >> 0x38),
                                      CONCAT16((byte)((ulong)uVar47 >> 0x30) ^
                                               (byte)((ulong)uVar43 >> 0x30),
                                               CONCAT15((byte)((ulong)uVar47 >> 0x28) ^
                                                        (byte)((ulong)uVar43 >> 0x28),
                                                        CONCAT14((byte)((ulong)uVar47 >> 0x20) ^
                                                                 (byte)((ulong)uVar43 >> 0x20),
                                                                 CONCAT13((byte)((ulong)uVar47 >>
                                                                                0x18) ^
                                                                          (byte)((ulong)uVar43 >>
                                                                                0x18),
                                                                          CONCAT12((byte)((ulong)
                                                  uVar47 >> 0x10) ^ (byte)((ulong)uVar43 >> 0x10),
                                                  CONCAT11((byte)((ulong)uVar47 >> 8) ^
                                                           (byte)((ulong)uVar43 >> 8),
                                                           (byte)uVar47 ^ (byte)uVar43)))))));
                *puVar28 = CONCAT17((byte)((ulong)uVar46 >> 0x38) ^ (byte)((ulong)uVar42 >> 0x38),
                                    CONCAT16((byte)((ulong)uVar46 >> 0x30) ^
                                             (byte)((ulong)uVar42 >> 0x30),
                                             CONCAT15((byte)((ulong)uVar46 >> 0x28) ^
                                                      (byte)((ulong)uVar42 >> 0x28),
                                                      CONCAT14((byte)((ulong)uVar46 >> 0x20) ^
                                                               (byte)((ulong)uVar42 >> 0x20),
                                                               CONCAT13((byte)((ulong)uVar46 >> 0x18
                                                                              ) ^ (byte)((ulong)
                                                  uVar42 >> 0x18),
                                                  CONCAT12((byte)((ulong)uVar46 >> 0x10) ^
                                                           (byte)((ulong)uVar42 >> 0x10),
                                                           CONCAT11((byte)((ulong)uVar46 >> 8) ^
                                                                    (byte)((ulong)uVar42 >> 8),
                                                                    (byte)uVar46 ^ (byte)uVar42)))))
                                            ));
                puVar28 = puVar28 + 4;
              } while (uVar18 != 0);
              if (uVar1 == uVar24) goto LAB_00a92c00;
            }
          }
        }
        do {
          *(byte *)(param_1 + uVar24) =
               *(byte *)((long)local_a0 + uVar24) ^ *(byte *)((long)param_2 + uVar24);
          uVar24 = uVar24 + 1;
        } while (uVar24 < uVar1);
      }
LAB_00a92c00:
      param_1 = param_1 + uVar1;
      param_2 = (int *)((long)param_2 + uVar1);
      param_3 = param_3 - uVar1;
      uVar29 = uVar29 + 1;
    } while (param_3 != 0);
  }
  return;
}

