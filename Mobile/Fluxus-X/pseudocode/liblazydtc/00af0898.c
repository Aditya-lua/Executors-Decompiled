/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af0898
 */

void whirlpool_block(ulong *param_1,ulong *param_2,long param_3)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong *puVar15;
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
  ulong local_b0;
  ulong local_a8;
  ulong local_a0;
  ulong uStack_98;
  ulong local_90;
  ulong uStack_88;
  ulong local_80;
  ulong uStack_78;
  ulong local_70;
  ulong uStack_68;
  
  lVar10 = 0;
  puVar15 = param_2;
  do {
    if (((ulong)puVar15 & 7) == 0) {
      uVar29 = param_1[1];
      uVar26 = *param_1;
      uVar28 = puVar15[1];
      uVar6 = *puVar15;
      uVar1 = puVar15[3];
      uVar32 = puVar15[2];
      local_a0 = CONCAT17((byte)(uVar6 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                          CONCAT16((byte)(uVar6 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                   CONCAT15((byte)(uVar6 >> 0x28) ^ (byte)(uVar26 >> 0x28),
                                            CONCAT14((byte)(uVar6 >> 0x20) ^ (byte)(uVar26 >> 0x20),
                                                     CONCAT13((byte)(uVar6 >> 0x18) ^
                                                              (byte)(uVar26 >> 0x18),
                                                              CONCAT12((byte)(uVar6 >> 0x10) ^
                                                                       (byte)(uVar26 >> 0x10),
                                                                       CONCAT11((byte)(uVar6 >> 8) ^
                                                                                (byte)(uVar26 >> 8),
                                                                                (byte)uVar6 ^
                                                                                (byte)uVar26)))))));
      uStack_98 = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar29 >> 0x38),
                           CONCAT16((byte)(uVar28 >> 0x30) ^ (byte)(uVar29 >> 0x30),
                                    CONCAT15((byte)(uVar28 >> 0x28) ^ (byte)(uVar29 >> 0x28),
                                             CONCAT14((byte)(uVar28 >> 0x20) ^
                                                      (byte)(uVar29 >> 0x20),
                                                      CONCAT13((byte)(uVar28 >> 0x18) ^
                                                               (byte)(uVar29 >> 0x18),
                                                               CONCAT12((byte)(uVar28 >> 0x10) ^
                                                                        (byte)(uVar29 >> 0x10),
                                                                        CONCAT11((byte)(uVar28 >> 8)
                                                                                 ^ (byte)(uVar29 >>
                                                                                         8),
                                                                                 (byte)uVar28 ^
                                                                                 (byte)uVar29)))))))
      ;
      uVar28 = param_1[3];
      uVar23 = param_1[2];
      local_90 = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                          CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar23 >> 0x30),
                                   CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar23 >> 0x28),
                                            CONCAT14((byte)(uVar32 >> 0x20) ^ (byte)(uVar23 >> 0x20)
                                                     ,CONCAT13((byte)(uVar32 >> 0x18) ^
                                                               (byte)(uVar23 >> 0x18),
                                                               CONCAT12((byte)(uVar32 >> 0x10) ^
                                                                        (byte)(uVar23 >> 0x10),
                                                                        CONCAT11((byte)(uVar32 >> 8)
                                                                                 ^ (byte)(uVar23 >>
                                                                                         8),
                                                                                 (byte)uVar32 ^
                                                                                 (byte)uVar23)))))))
      ;
      uStack_88 = CONCAT17((byte)(uVar1 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                           CONCAT16((byte)(uVar1 >> 0x30) ^ (byte)(uVar28 >> 0x30),
                                    CONCAT15((byte)(uVar1 >> 0x28) ^ (byte)(uVar28 >> 0x28),
                                             CONCAT14((byte)(uVar1 >> 0x20) ^ (byte)(uVar28 >> 0x20)
                                                      ,CONCAT13((byte)(uVar1 >> 0x18) ^
                                                                (byte)(uVar28 >> 0x18),
                                                                CONCAT12((byte)(uVar1 >> 0x10) ^
                                                                         (byte)(uVar28 >> 0x10),
                                                                         CONCAT11((byte)(uVar1 >> 8)
                                                                                  ^ (byte)(uVar28 >>
                                                                                          8),
                                                                                  (byte)uVar1 ^
                                                                                  (byte)uVar28))))))
                          );
      local_b0 = param_1[5];
      uVar6 = param_1[4];
      uVar1 = puVar15[5];
      uVar32 = puVar15[4];
      local_80 = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar6 >> 0x38),
                          CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar6 >> 0x30),
                                   CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar6 >> 0x28),
                                            CONCAT14((byte)(uVar32 >> 0x20) ^ (byte)(uVar6 >> 0x20),
                                                     CONCAT13((byte)(uVar32 >> 0x18) ^
                                                              (byte)(uVar6 >> 0x18),
                                                              CONCAT12((byte)(uVar32 >> 0x10) ^
                                                                       (byte)(uVar6 >> 0x10),
                                                                       CONCAT11((byte)(uVar32 >> 8)
                                                                                ^ (byte)(uVar6 >> 8)
                                                                                ,(byte)uVar32 ^
                                                                                 (byte)uVar6)))))));
      uStack_78 = CONCAT17((byte)(uVar1 >> 0x38) ^ (byte)(local_b0 >> 0x38),
                           CONCAT16((byte)(uVar1 >> 0x30) ^ (byte)(local_b0 >> 0x30),
                                    CONCAT15((byte)(uVar1 >> 0x28) ^ (byte)(local_b0 >> 0x28),
                                             CONCAT14((byte)(uVar1 >> 0x20) ^
                                                      (byte)(local_b0 >> 0x20),
                                                      CONCAT13((byte)(uVar1 >> 0x18) ^
                                                               (byte)(local_b0 >> 0x18),
                                                               CONCAT12((byte)(uVar1 >> 0x10) ^
                                                                        (byte)(local_b0 >> 0x10),
                                                                        CONCAT11((byte)(uVar1 >> 8)
                                                                                 ^ (byte)(local_b0 
                                                  >> 8),(byte)uVar1 ^ (byte)local_b0)))))));
      local_a8 = param_1[6];
      local_70 = puVar15[6] ^ local_a8;
      puVar7 = puVar15 + 7;
    }
    else {
      uVar1 = puVar15[5];
      uVar32 = puVar15[4];
      uVar2 = puVar15[3];
      uVar6 = puVar15[2];
      uVar23 = puVar15[1];
      uVar28 = *puVar15;
      uVar29 = param_1[1];
      uVar26 = *param_1;
      local_a0 = CONCAT17((byte)(uVar28 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                          CONCAT16((byte)(uVar28 >> 0x30) ^ (byte)(uVar26 >> 0x30),
                                   CONCAT15((byte)(uVar28 >> 0x28) ^ (byte)(uVar26 >> 0x28),
                                            CONCAT14((byte)(uVar28 >> 0x20) ^ (byte)(uVar26 >> 0x20)
                                                     ,CONCAT13((byte)(uVar28 >> 0x18) ^
                                                               (byte)(uVar26 >> 0x18),
                                                               CONCAT12((byte)(uVar28 >> 0x10) ^
                                                                        (byte)(uVar26 >> 0x10),
                                                                        CONCAT11((byte)(uVar28 >> 8)
                                                                                 ^ (byte)(uVar26 >>
                                                                                         8),
                                                                                 (byte)uVar28 ^
                                                                                 (byte)uVar26)))))))
      ;
      uStack_98 = CONCAT17((byte)(uVar23 >> 0x38) ^ (byte)(uVar29 >> 0x38),
                           CONCAT16((byte)(uVar23 >> 0x30) ^ (byte)(uVar29 >> 0x30),
                                    CONCAT15((byte)(uVar23 >> 0x28) ^ (byte)(uVar29 >> 0x28),
                                             CONCAT14((byte)(uVar23 >> 0x20) ^
                                                      (byte)(uVar29 >> 0x20),
                                                      CONCAT13((byte)(uVar23 >> 0x18) ^
                                                               (byte)(uVar29 >> 0x18),
                                                               CONCAT12((byte)(uVar23 >> 0x10) ^
                                                                        (byte)(uVar29 >> 0x10),
                                                                        CONCAT11((byte)(uVar23 >> 8)
                                                                                 ^ (byte)(uVar29 >>
                                                                                         8),
                                                                                 (byte)uVar23 ^
                                                                                 (byte)uVar29)))))))
      ;
      uVar28 = param_1[3];
      uVar23 = param_1[2];
      local_90 = CONCAT17((byte)(uVar6 >> 0x38) ^ (byte)(uVar23 >> 0x38),
                          CONCAT16((byte)(uVar6 >> 0x30) ^ (byte)(uVar23 >> 0x30),
                                   CONCAT15((byte)(uVar6 >> 0x28) ^ (byte)(uVar23 >> 0x28),
                                            CONCAT14((byte)(uVar6 >> 0x20) ^ (byte)(uVar23 >> 0x20),
                                                     CONCAT13((byte)(uVar6 >> 0x18) ^
                                                              (byte)(uVar23 >> 0x18),
                                                              CONCAT12((byte)(uVar6 >> 0x10) ^
                                                                       (byte)(uVar23 >> 0x10),
                                                                       CONCAT11((byte)(uVar6 >> 8) ^
                                                                                (byte)(uVar23 >> 8),
                                                                                (byte)uVar6 ^
                                                                                (byte)uVar23)))))));
      uStack_88 = CONCAT17((byte)(uVar2 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                           CONCAT16((byte)(uVar2 >> 0x30) ^ (byte)(uVar28 >> 0x30),
                                    CONCAT15((byte)(uVar2 >> 0x28) ^ (byte)(uVar28 >> 0x28),
                                             CONCAT14((byte)(uVar2 >> 0x20) ^ (byte)(uVar28 >> 0x20)
                                                      ,CONCAT13((byte)(uVar2 >> 0x18) ^
                                                                (byte)(uVar28 >> 0x18),
                                                                CONCAT12((byte)(uVar2 >> 0x10) ^
                                                                         (byte)(uVar28 >> 0x10),
                                                                         CONCAT11((byte)(uVar2 >> 8)
                                                                                  ^ (byte)(uVar28 >>
                                                                                          8),
                                                                                  (byte)uVar2 ^
                                                                                  (byte)uVar28))))))
                          );
      local_b0 = param_1[5];
      uVar6 = param_1[4];
      local_80 = CONCAT17((byte)(uVar32 >> 0x38) ^ (byte)(uVar6 >> 0x38),
                          CONCAT16((byte)(uVar32 >> 0x30) ^ (byte)(uVar6 >> 0x30),
                                   CONCAT15((byte)(uVar32 >> 0x28) ^ (byte)(uVar6 >> 0x28),
                                            CONCAT14((byte)(uVar32 >> 0x20) ^ (byte)(uVar6 >> 0x20),
                                                     CONCAT13((byte)(uVar32 >> 0x18) ^
                                                              (byte)(uVar6 >> 0x18),
                                                              CONCAT12((byte)(uVar32 >> 0x10) ^
                                                                       (byte)(uVar6 >> 0x10),
                                                                       CONCAT11((byte)(uVar32 >> 8)
                                                                                ^ (byte)(uVar6 >> 8)
                                                                                ,(byte)uVar32 ^
                                                                                 (byte)uVar6)))))));
      uStack_78 = CONCAT17((byte)(uVar1 >> 0x38) ^ (byte)(local_b0 >> 0x38),
                           CONCAT16((byte)(uVar1 >> 0x30) ^ (byte)(local_b0 >> 0x30),
                                    CONCAT15((byte)(uVar1 >> 0x28) ^ (byte)(local_b0 >> 0x28),
                                             CONCAT14((byte)(uVar1 >> 0x20) ^
                                                      (byte)(local_b0 >> 0x20),
                                                      CONCAT13((byte)(uVar1 >> 0x18) ^
                                                               (byte)(local_b0 >> 0x18),
                                                               CONCAT12((byte)(uVar1 >> 0x10) ^
                                                                        (byte)(local_b0 >> 0x10),
                                                                        CONCAT11((byte)(uVar1 >> 8)
                                                                                 ^ (byte)(local_b0 
                                                  >> 8),(byte)uVar1 ^ (byte)local_b0)))))));
      local_a8 = param_1[6];
      local_70 = puVar15[6] ^ local_a8;
      puVar7 = &uStack_68;
    }
    lVar3 = 0;
    uStack_68 = *puVar7 ^ param_1[7];
    uVar32 = param_1[7];
    do {
      uVar14 = uVar26 >> 2;
      uVar9 = uVar26 >> 10;
      uVar13 = uVar26 >> 0x12;
      uVar16 = uVar26 >> 0x1a;
      uVar8 = uVar26 >> 0x22;
      uVar30 = uVar29 >> 0x12;
      uVar11 = uVar29 >> 0x1a;
      uVar12 = uVar26 >> 0x2a;
      uVar17 = uVar29 >> 0x22;
      uVar18 = uVar23 >> 2;
      uVar24 = uVar23 >> 10;
      uVar27 = uVar23 >> 0x12;
      uVar31 = uVar23 >> 0x1a;
      uVar1 = uVar23 >> 0x32;
      uVar19 = uVar28 >> 2;
      uVar21 = uVar28 >> 10;
      uVar25 = uVar28 >> 0x12;
      uVar22 = uVar28 >> 0x2a;
      uVar4 = local_b0 >> 2;
      uVar2 = local_b0 >> 0x32;
      uVar5 = local_a8 >> 0x2a;
      uVar20 = *(ulong *)(&DAT_00777288 + (uVar29 >> 0x2a & 0x3fc0 | 0x30)) ^
               *(ulong *)(&DAT_00777288 + ((ulong)((uint)(uVar26 >> 0x32) | 0x38) & 0x3ff8)) ^
               *(ulong *)(&DAT_00777288 + (uVar23 >> 0x22 & 0x3fc0 | 0x28)) ^
               *(ulong *)(&DAT_00777288 + (uVar28 >> 0x1a & 0x3fc0 | 0x20)) ^
               *(ulong *)(&DAT_00777288 + (uVar6 >> 0x12 & 0x3fc0 | 0x18)) ^
               *(ulong *)(&DAT_00777288 + (local_b0 >> 10 & 0x3fc0 | 0x10)) ^
               *(ulong *)(&DAT_00777288 + (local_a8 >> 2 & 0x3fc0 | 8)) ^
               *(ulong *)(&DAT_00777288 + (uVar32 & 0xff) * 0x40);
      uVar26 = *(ulong *)((long)&DAT_0077b288 + lVar3) ^
               *(ulong *)(&DAT_00777288 + (uVar26 & 0xff) * 0x40) ^
               *(ulong *)(&DAT_00777288 + ((ulong)((uint)(uVar29 >> 0x32) | 0x38) & 0x3ff8)) ^
               *(ulong *)(&DAT_00777288 + (uVar23 >> 0x2a & 0x3fc0 | 0x30)) ^
               *(ulong *)(&DAT_00777288 + (uVar28 >> 0x22 & 0x3fc0 | 0x28)) ^
               *(ulong *)(&DAT_00777288 + (uVar6 >> 0x1a & 0x3fc0 | 0x20)) ^
               *(ulong *)(&DAT_00777288 + (local_b0 >> 0x12 & 0x3fc0 | 0x18)) ^
               *(ulong *)(&DAT_00777288 + (local_a8 >> 10 & 0x3fc0 | 0x10)) ^
               *(ulong *)(&DAT_00777288 + (uVar32 >> 2 & 0x3fc0 | 8));
      uVar23 = *(ulong *)(&DAT_00777288 + (uVar29 >> 2 & 0x3fc0 | 8)) ^
               *(ulong *)(&DAT_00777288 + (uVar9 & 0x3fc0 | 0x10)) ^
               *(ulong *)(&DAT_00777288 + (uVar23 & 0xff) * 0x40) ^
               *(ulong *)(&DAT_00777288 + ((ulong)((uint)(uVar28 >> 0x32) | 0x38) & 0x3ff8)) ^
               *(ulong *)(&DAT_00777288 + (uVar6 >> 0x2a & 0x3fc0 | 0x30)) ^
               *(ulong *)(&DAT_00777288 + (local_b0 >> 0x22 & 0x3fc0 | 0x28)) ^
               *(ulong *)(&DAT_00777288 + (local_a8 >> 0x1a & 0x3fc0 | 0x20)) ^
               *(ulong *)(&DAT_00777288 + (uVar32 >> 0x12 & 0x3fc0 | 0x18));
      uVar28 = *(ulong *)(&DAT_00777288 + (uVar29 >> 10 & 0x3fc0 | 0x10)) ^
               *(ulong *)(&DAT_00777288 + (uVar13 & 0x3fc0 | 0x18)) ^
               *(ulong *)(&DAT_00777288 + (uVar18 & 0x3fc0 | 8)) ^
               *(ulong *)(&DAT_00777288 + (uVar28 & 0xff) * 0x40) ^
               *(ulong *)(&DAT_00777288 + ((ulong)((uint)(uVar6 >> 0x32) | 0x38) & 0x3ff8)) ^
               *(ulong *)(&DAT_00777288 + (local_b0 >> 0x2a & 0x3fc0 | 0x30)) ^
               *(ulong *)(&DAT_00777288 + (local_a8 >> 0x22 & 0x3fc0 | 0x28)) ^
               *(ulong *)(&DAT_00777288 + (uVar32 >> 0x1a & 0x3fc0 | 0x20));
      uVar29 = *(ulong *)(&DAT_00777288 + (uVar29 & 0xff) * 0x40) ^
               *(ulong *)(&DAT_00777288 + (uVar14 & 0x3fc0 | 8)) ^
               *(ulong *)(&DAT_00777288 + ((ulong)((uint)uVar1 | 0x38) & 0x3ff8)) ^
               *(ulong *)(&DAT_00777288 + (uVar22 & 0x3fc0 | 0x30)) ^
               *(ulong *)(&DAT_00777288 + (uVar6 >> 0x22 & 0x3fc0 | 0x28)) ^
               *(ulong *)(&DAT_00777288 + (local_b0 >> 0x1a & 0x3fc0 | 0x20)) ^
               *(ulong *)(&DAT_00777288 + (local_a8 >> 0x12 & 0x3fc0 | 0x18)) ^
               *(ulong *)(&DAT_00777288 + (uVar32 >> 10 & 0x3fc0 | 0x10));
      local_b0 = *(ulong *)(&DAT_00777288 + (uVar11 & 0x3fc0 | 0x20)) ^
                 *(ulong *)(&DAT_00777288 + (uVar8 & 0x3fc0 | 0x28)) ^
                 *(ulong *)(&DAT_00777288 + (uVar27 & 0x3fc0 | 0x18)) ^
                 *(ulong *)(&DAT_00777288 + (uVar21 & 0x3fc0 | 0x10)) ^
                 *(ulong *)(&DAT_00777288 + (uVar6 >> 2 & 0x3fc0 | 8)) ^
                 *(ulong *)(&DAT_00777288 + (local_b0 & 0xff) * 0x40) ^
                 *(ulong *)(&DAT_00777288 + ((ulong)((uint)(local_a8 >> 0x32) | 0x38) & 0x3ff8)) ^
                 *(ulong *)(&DAT_00777288 + (uVar32 >> 0x2a & 0x3fc0 | 0x30));
      local_a8 = *(ulong *)(&DAT_00777288 + (uVar17 & 0x3fc0 | 0x28)) ^
                 *(ulong *)(&DAT_00777288 + (uVar12 & 0x3fc0 | 0x30)) ^
                 *(ulong *)(&DAT_00777288 + (uVar31 & 0x3fc0 | 0x20)) ^
                 *(ulong *)(&DAT_00777288 + (uVar25 & 0x3fc0 | 0x18)) ^
                 *(ulong *)(&DAT_00777288 + (uVar6 >> 10 & 0x3fc0 | 0x10)) ^
                 *(ulong *)(&DAT_00777288 + (uVar4 & 0x3fc0 | 8)) ^
                 *(ulong *)(&DAT_00777288 + (local_a8 & 0xff) * 0x40) ^
                 *(ulong *)(&DAT_00777288 + ((ulong)((uint)(uVar32 >> 0x32) | 0x38) & 0x3ff8));
      uVar6 = *(ulong *)(&DAT_00777288 + (uVar30 & 0x3fc0 | 0x18)) ^
              *(ulong *)(&DAT_00777288 + (uVar16 & 0x3fc0 | 0x20)) ^
              *(ulong *)(&DAT_00777288 + (uVar24 & 0x3fc0 | 0x10)) ^
              *(ulong *)(&DAT_00777288 + (uVar19 & 0x3fc0 | 8)) ^
              *(ulong *)(&DAT_00777288 + (uVar6 & 0xff) * 0x40) ^
              *(ulong *)(&DAT_00777288 + ((ulong)((uint)uVar2 | 0x38) & 0x3ff8)) ^
              *(ulong *)(&DAT_00777288 + (uVar5 & 0x3fc0 | 0x30)) ^
              *(ulong *)(&DAT_00777288 + (uVar32 >> 0x22 & 0x3fc0 | 0x28));
      uVar4 = *(ulong *)(&DAT_00777288 + ((local_a0 >> 0x38) << 6 | 0x38)) ^ uVar20 ^
              *(ulong *)(&DAT_00777288 + ((uStack_98 >> 0x30 & 0xff) << 6 | 0x30)) ^
              *(ulong *)(&DAT_00777288 + ((local_90 >> 0x28 & 0xff) << 6 | 0x28)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_88 >> 0x20 & 0xff) << 6 | 0x20)) ^
              *(ulong *)(&DAT_00777288 + ((local_80 >> 0x18 & 0xff) << 6 | 0x18)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_78 >> 0x10 & 0xff) << 6 | 0x10)) ^
              *(ulong *)(&DAT_00777288 + ((local_70 >> 8 & 0xff) << 6 | 8)) ^
              *(ulong *)(&DAT_00777288 + (uStack_68 & 0xff) * 0x40);
      uVar1 = *(ulong *)(&DAT_00777288 + (local_a0 & 0xff) * 0x40) ^ uVar26 ^
              *(ulong *)(&DAT_00777288 + ((uStack_98 >> 0x38) << 6 | 0x38)) ^
              *(ulong *)(&DAT_00777288 + ((local_90 >> 0x30 & 0xff) << 6 | 0x30)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_88 >> 0x28 & 0xff) << 6 | 0x28)) ^
              *(ulong *)(&DAT_00777288 + ((local_80 >> 0x20 & 0xff) << 6 | 0x20)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_78 >> 0x18 & 0xff) << 6 | 0x18)) ^
              *(ulong *)(&DAT_00777288 + ((local_70 >> 0x10 & 0xff) << 6 | 0x10)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_68 >> 8 & 0xff) << 6 | 8));
      uVar2 = *(ulong *)(&DAT_00777288 + ((local_a0 >> 8 & 0xff) << 6 | 8)) ^ uVar29 ^
              *(ulong *)(&DAT_00777288 + (uStack_98 & 0xff) * 0x40) ^
              *(ulong *)(&DAT_00777288 + ((local_90 >> 0x38) << 6 | 0x38)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_88 >> 0x30 & 0xff) << 6 | 0x30)) ^
              *(ulong *)(&DAT_00777288 + ((local_80 >> 0x28 & 0xff) << 6 | 0x28)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_78 >> 0x20 & 0xff) << 6 | 0x20)) ^
              *(ulong *)(&DAT_00777288 + ((local_70 >> 0x18 & 0xff) << 6 | 0x18)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_68 >> 0x10 & 0xff) << 6 | 0x10));
      uVar11 = *(ulong *)(&DAT_00777288 + ((local_a0 >> 0x10 & 0xff) << 6 | 0x10)) ^ uVar23 ^
               *(ulong *)(&DAT_00777288 + ((uStack_98 >> 8 & 0xff) << 6 | 8)) ^
               *(ulong *)(&DAT_00777288 + (local_90 & 0xff) * 0x40) ^
               *(ulong *)(&DAT_00777288 + ((uStack_88 >> 0x38) << 6 | 0x38)) ^
               *(ulong *)(&DAT_00777288 + ((local_80 >> 0x30 & 0xff) << 6 | 0x30)) ^
               *(ulong *)(&DAT_00777288 + ((uStack_78 >> 0x28 & 0xff) << 6 | 0x28)) ^
               *(ulong *)(&DAT_00777288 + ((local_70 >> 0x20 & 0xff) << 6 | 0x20)) ^
               *(ulong *)(&DAT_00777288 + ((uStack_68 >> 0x18 & 0xff) << 6 | 0x18));
      uVar8 = *(ulong *)(&DAT_00777288 + ((local_a0 >> 0x18 & 0xff) << 6 | 0x18)) ^ uVar28 ^
              *(ulong *)(&DAT_00777288 + ((uStack_98 >> 0x10 & 0xff) << 6 | 0x10)) ^
              *(ulong *)(&DAT_00777288 + ((local_90 >> 8 & 0xff) << 6 | 8)) ^
              *(ulong *)(&DAT_00777288 + (uStack_88 & 0xff) * 0x40) ^
              *(ulong *)(&DAT_00777288 + ((local_80 >> 0x38) << 6 | 0x38)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_78 >> 0x30 & 0xff) << 6 | 0x30)) ^
              *(ulong *)(&DAT_00777288 + ((local_70 >> 0x28 & 0xff) << 6 | 0x28)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_68 >> 0x20 & 0xff) << 6 | 0x20));
      uVar5 = *(ulong *)(&DAT_00777288 + ((local_a0 >> 0x20 & 0xff) << 6 | 0x20)) ^ uVar6 ^
              *(ulong *)(&DAT_00777288 + ((uStack_98 >> 0x18 & 0xff) << 6 | 0x18)) ^
              *(ulong *)(&DAT_00777288 + ((local_90 >> 0x10 & 0xff) << 6 | 0x10)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_88 >> 8 & 0xff) << 6 | 8)) ^
              *(ulong *)(&DAT_00777288 + (local_80 & 0xff) * 0x40) ^
              *(ulong *)(&DAT_00777288 + ((uStack_78 >> 0x38) << 6 | 0x38)) ^
              *(ulong *)(&DAT_00777288 + ((local_70 >> 0x30 & 0xff) << 6 | 0x30)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_68 >> 0x28 & 0xff) << 6 | 0x28));
      lVar3 = lVar3 + 8;
      uVar9 = *(ulong *)(&DAT_00777288 + ((local_a0 >> 0x28 & 0xff) << 6 | 0x28)) ^ local_b0 ^
              *(ulong *)(&DAT_00777288 + ((uStack_98 >> 0x20 & 0xff) << 6 | 0x20)) ^
              *(ulong *)(&DAT_00777288 + ((local_90 >> 0x18 & 0xff) << 6 | 0x18)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_88 >> 0x10 & 0xff) << 6 | 0x10)) ^
              *(ulong *)(&DAT_00777288 + ((local_80 >> 8 & 0xff) << 6 | 8)) ^
              *(ulong *)(&DAT_00777288 + (uStack_78 & 0xff) * 0x40) ^
              *(ulong *)(&DAT_00777288 + ((local_70 >> 0x38) << 6 | 0x38)) ^
              *(ulong *)(&DAT_00777288 + ((uStack_68 >> 0x30 & 0xff) << 6 | 0x30));
      local_70 = *(ulong *)(&DAT_00777288 + ((local_a0 >> 0x30 & 0xff) << 6 | 0x30)) ^ local_a8 ^
                 *(ulong *)(&DAT_00777288 + ((uStack_98 >> 0x28 & 0xff) << 6 | 0x28)) ^
                 *(ulong *)(&DAT_00777288 + ((local_90 >> 0x20 & 0xff) << 6 | 0x20)) ^
                 *(ulong *)(&DAT_00777288 + ((uStack_88 >> 0x18 & 0xff) << 6 | 0x18)) ^
                 *(ulong *)(&DAT_00777288 + ((local_80 >> 0x10 & 0xff) << 6 | 0x10)) ^
                 *(ulong *)(&DAT_00777288 + ((uStack_78 >> 8 & 0xff) << 6 | 8)) ^
                 *(ulong *)(&DAT_00777288 + (local_70 & 0xff) * 0x40) ^
                 *(ulong *)(&DAT_00777288 + ((uStack_68 >> 0x38) << 6 | 0x38));
      local_a0 = uVar1;
      uStack_98 = uVar2;
      local_90 = uVar11;
      uStack_88 = uVar8;
      local_80 = uVar5;
      uStack_78 = uVar9;
      uStack_68 = uVar4;
      uVar32 = uVar20;
    } while (lVar3 != 0x50);
    if (((ulong)puVar15 & 7) == 0) {
      *param_1 = *puVar15 ^ uVar1 ^ *param_1;
      param_1[1] = puVar15[1] ^ uVar2 ^ param_1[1];
      param_1[2] = puVar15[2] ^ uVar11 ^ param_1[2];
      param_1[3] = puVar15[3] ^ uVar8 ^ param_1[3];
      param_1[4] = puVar15[4] ^ uVar5 ^ param_1[4];
      param_1[5] = puVar15[5] ^ uVar9 ^ param_1[5];
      param_1[6] = puVar15[6] ^ local_70 ^ param_1[6];
      param_1[7] = puVar15[7] ^ uVar4 ^ param_1[7];
    }
    else if (param_1 < (ulong *)((long)register0x00000008 + -0x60) && &local_a0 < param_1 + 8 ||
             param_1 < param_2 + lVar10 * 8 + 8 && param_2 + lVar10 * 8 < param_1 + 8) {
      lVar3 = 0;
      do {
        *(byte *)((long)param_1 + lVar3) =
             *(byte *)((long)puVar15 + lVar3) ^ *(byte *)((long)&local_a0 + lVar3) ^
             *(byte *)((long)param_1 + lVar3);
        lVar3 = lVar3 + 1;
      } while (lVar3 != 0x40);
    }
    else {
      uVar23 = puVar15[1];
      uVar6 = *puVar15;
      uVar32 = param_1[1];
      uVar29 = *param_1;
      uVar26 = param_1[3];
      uVar28 = param_1[2];
      param_1[1] = CONCAT17((byte)(uVar23 >> 0x38) ^ (byte)(uVar2 >> 0x38) ^ (byte)(uVar32 >> 0x38),
                            CONCAT16((byte)(uVar23 >> 0x30) ^ (byte)(uVar2 >> 0x30) ^
                                     (byte)(uVar32 >> 0x30),
                                     CONCAT15((byte)(uVar23 >> 0x28) ^ (byte)(uVar2 >> 0x28) ^
                                              (byte)(uVar32 >> 0x28),
                                              CONCAT14((byte)(uVar23 >> 0x20) ^
                                                       (byte)(uVar2 >> 0x20) ^
                                                       (byte)(uVar32 >> 0x20),
                                                       CONCAT13((byte)(uVar23 >> 0x18) ^
                                                                (byte)(uVar2 >> 0x18) ^
                                                                (byte)(uVar32 >> 0x18),
                                                                CONCAT12((byte)(uVar23 >> 0x10) ^
                                                                         (byte)(uVar2 >> 0x10) ^
                                                                         (byte)(uVar32 >> 0x10),
                                                                         CONCAT11((byte)(uVar23 >> 8
                                                                                        ) ^ (byte)(
                                                  uVar2 >> 8) ^ (byte)(uVar32 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar2 ^ (byte)uVar32)))))));
      *param_1 = CONCAT17((byte)(uVar6 >> 0x38) ^ (byte)(uVar1 >> 0x38) ^ (byte)(uVar29 >> 0x38),
                          CONCAT16((byte)(uVar6 >> 0x30) ^ (byte)(uVar1 >> 0x30) ^
                                   (byte)(uVar29 >> 0x30),
                                   CONCAT15((byte)(uVar6 >> 0x28) ^ (byte)(uVar1 >> 0x28) ^
                                            (byte)(uVar29 >> 0x28),
                                            CONCAT14((byte)(uVar6 >> 0x20) ^ (byte)(uVar1 >> 0x20) ^
                                                     (byte)(uVar29 >> 0x20),
                                                     CONCAT13((byte)(uVar6 >> 0x18) ^
                                                              (byte)(uVar1 >> 0x18) ^
                                                              (byte)(uVar29 >> 0x18),
                                                              CONCAT12((byte)(uVar6 >> 0x10) ^
                                                                       (byte)(uVar1 >> 0x10) ^
                                                                       (byte)(uVar29 >> 0x10),
                                                                       CONCAT11((byte)(uVar6 >> 8) ^
                                                                                (byte)(uVar1 >> 8) ^
                                                                                (byte)(uVar29 >> 8),
                                                                                (byte)uVar6 ^
                                                                                (byte)uVar1 ^
                                                                                (byte)uVar29)))))));
      uVar23 = puVar15[3];
      uVar6 = puVar15[2];
      param_1[3] = CONCAT17((byte)(uVar23 >> 0x38) ^ (byte)(uVar8 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                            CONCAT16((byte)(uVar23 >> 0x30) ^ (byte)(uVar8 >> 0x30) ^
                                     (byte)(uVar26 >> 0x30),
                                     CONCAT15((byte)(uVar23 >> 0x28) ^ (byte)(uVar8 >> 0x28) ^
                                              (byte)(uVar26 >> 0x28),
                                              CONCAT14((byte)(uVar23 >> 0x20) ^
                                                       (byte)(uVar8 >> 0x20) ^
                                                       (byte)(uVar26 >> 0x20),
                                                       CONCAT13((byte)(uVar23 >> 0x18) ^
                                                                (byte)(uVar8 >> 0x18) ^
                                                                (byte)(uVar26 >> 0x18),
                                                                CONCAT12((byte)(uVar23 >> 0x10) ^
                                                                         (byte)(uVar8 >> 0x10) ^
                                                                         (byte)(uVar26 >> 0x10),
                                                                         CONCAT11((byte)(uVar23 >> 8
                                                                                        ) ^ (byte)(
                                                  uVar8 >> 8) ^ (byte)(uVar26 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar8 ^ (byte)uVar26)))))));
      param_1[2] = CONCAT17((byte)(uVar6 >> 0x38) ^ (byte)(uVar11 >> 0x38) ^ (byte)(uVar28 >> 0x38),
                            CONCAT16((byte)(uVar6 >> 0x30) ^ (byte)(uVar11 >> 0x30) ^
                                     (byte)(uVar28 >> 0x30),
                                     CONCAT15((byte)(uVar6 >> 0x28) ^ (byte)(uVar11 >> 0x28) ^
                                              (byte)(uVar28 >> 0x28),
                                              CONCAT14((byte)(uVar6 >> 0x20) ^
                                                       (byte)(uVar11 >> 0x20) ^
                                                       (byte)(uVar28 >> 0x20),
                                                       CONCAT13((byte)(uVar6 >> 0x18) ^
                                                                (byte)(uVar11 >> 0x18) ^
                                                                (byte)(uVar28 >> 0x18),
                                                                CONCAT12((byte)(uVar6 >> 0x10) ^
                                                                         (byte)(uVar11 >> 0x10) ^
                                                                         (byte)(uVar28 >> 0x10),
                                                                         CONCAT11((byte)(uVar6 >> 8)
                                                                                  ^ (byte)(uVar11 >>
                                                                                          8) ^
                                                                                  (byte)(uVar28 >> 8
                                                                                        ),(byte)
                                                  uVar6 ^ (byte)uVar11 ^ (byte)uVar28)))))));
      uVar23 = puVar15[5];
      uVar6 = puVar15[4];
      uVar32 = param_1[5];
      uVar29 = param_1[4];
      uVar26 = param_1[7];
      uVar28 = param_1[6];
      param_1[5] = CONCAT17((byte)(uVar23 >> 0x38) ^ (byte)(uVar9 >> 0x38) ^ (byte)(uVar32 >> 0x38),
                            CONCAT16((byte)(uVar23 >> 0x30) ^ (byte)(uVar9 >> 0x30) ^
                                     (byte)(uVar32 >> 0x30),
                                     CONCAT15((byte)(uVar23 >> 0x28) ^ (byte)(uVar9 >> 0x28) ^
                                              (byte)(uVar32 >> 0x28),
                                              CONCAT14((byte)(uVar23 >> 0x20) ^
                                                       (byte)(uVar9 >> 0x20) ^
                                                       (byte)(uVar32 >> 0x20),
                                                       CONCAT13((byte)(uVar23 >> 0x18) ^
                                                                (byte)(uVar9 >> 0x18) ^
                                                                (byte)(uVar32 >> 0x18),
                                                                CONCAT12((byte)(uVar23 >> 0x10) ^
                                                                         (byte)(uVar9 >> 0x10) ^
                                                                         (byte)(uVar32 >> 0x10),
                                                                         CONCAT11((byte)(uVar23 >> 8
                                                                                        ) ^ (byte)(
                                                  uVar9 >> 8) ^ (byte)(uVar32 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar9 ^ (byte)uVar32)))))));
      param_1[4] = CONCAT17((byte)(uVar6 >> 0x38) ^ (byte)(uVar5 >> 0x38) ^ (byte)(uVar29 >> 0x38),
                            CONCAT16((byte)(uVar6 >> 0x30) ^ (byte)(uVar5 >> 0x30) ^
                                     (byte)(uVar29 >> 0x30),
                                     CONCAT15((byte)(uVar6 >> 0x28) ^ (byte)(uVar5 >> 0x28) ^
                                              (byte)(uVar29 >> 0x28),
                                              CONCAT14((byte)(uVar6 >> 0x20) ^ (byte)(uVar5 >> 0x20)
                                                       ^ (byte)(uVar29 >> 0x20),
                                                       CONCAT13((byte)(uVar6 >> 0x18) ^
                                                                (byte)(uVar5 >> 0x18) ^
                                                                (byte)(uVar29 >> 0x18),
                                                                CONCAT12((byte)(uVar6 >> 0x10) ^
                                                                         (byte)(uVar5 >> 0x10) ^
                                                                         (byte)(uVar29 >> 0x10),
                                                                         CONCAT11((byte)(uVar6 >> 8)
                                                                                  ^ (byte)(uVar5 >> 
                                                  8) ^ (byte)(uVar29 >> 8),
                                                  (byte)uVar6 ^ (byte)uVar5 ^ (byte)uVar29)))))));
      uVar23 = puVar15[7];
      uVar6 = puVar15[6];
      param_1[7] = CONCAT17((byte)(uVar23 >> 0x38) ^ (byte)(uVar4 >> 0x38) ^ (byte)(uVar26 >> 0x38),
                            CONCAT16((byte)(uVar23 >> 0x30) ^ (byte)(uVar4 >> 0x30) ^
                                     (byte)(uVar26 >> 0x30),
                                     CONCAT15((byte)(uVar23 >> 0x28) ^ (byte)(uVar4 >> 0x28) ^
                                              (byte)(uVar26 >> 0x28),
                                              CONCAT14((byte)(uVar23 >> 0x20) ^
                                                       (byte)(uVar4 >> 0x20) ^
                                                       (byte)(uVar26 >> 0x20),
                                                       CONCAT13((byte)(uVar23 >> 0x18) ^
                                                                (byte)(uVar4 >> 0x18) ^
                                                                (byte)(uVar26 >> 0x18),
                                                                CONCAT12((byte)(uVar23 >> 0x10) ^
                                                                         (byte)(uVar4 >> 0x10) ^
                                                                         (byte)(uVar26 >> 0x10),
                                                                         CONCAT11((byte)(uVar23 >> 8
                                                                                        ) ^ (byte)(
                                                  uVar4 >> 8) ^ (byte)(uVar26 >> 8),
                                                  (byte)uVar23 ^ (byte)uVar4 ^ (byte)uVar26)))))));
      param_1[6] = CONCAT17((byte)(uVar6 >> 0x38) ^ (byte)(local_70 >> 0x38) ^
                            (byte)(uVar28 >> 0x38),
                            CONCAT16((byte)(uVar6 >> 0x30) ^ (byte)(local_70 >> 0x30) ^
                                     (byte)(uVar28 >> 0x30),
                                     CONCAT15((byte)(uVar6 >> 0x28) ^ (byte)(local_70 >> 0x28) ^
                                              (byte)(uVar28 >> 0x28),
                                              CONCAT14((byte)(uVar6 >> 0x20) ^
                                                       (byte)(local_70 >> 0x20) ^
                                                       (byte)(uVar28 >> 0x20),
                                                       CONCAT13((byte)(uVar6 >> 0x18) ^
                                                                (byte)(local_70 >> 0x18) ^
                                                                (byte)(uVar28 >> 0x18),
                                                                CONCAT12((byte)(uVar6 >> 0x10) ^
                                                                         (byte)(local_70 >> 0x10) ^
                                                                         (byte)(uVar28 >> 0x10),
                                                                         CONCAT11((byte)(uVar6 >> 8)
                                                                                  ^ (byte)(local_70 
                                                  >> 8) ^ (byte)(uVar28 >> 8),
                                                  (byte)uVar6 ^ (byte)local_70 ^ (byte)uVar28)))))))
      ;
    }
    puVar15 = puVar15 + 8;
    param_3 = param_3 + -1;
    lVar10 = lVar10 + 1;
  } while (param_3 != 0);
  return;
}

