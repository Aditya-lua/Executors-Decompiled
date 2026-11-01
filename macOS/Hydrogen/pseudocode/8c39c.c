
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0008c39c(byte *param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],undefined1 param_8 [16],undefined1 param_9 [16],
                 long param_10)

{
  long lVar1;
  long lVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  ulong uVar5;
  undefined *puVar6;
  char *pcVar7;
  long in_x9;
  long in_x10;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long lVar23;
  byte in_b16;
  byte in_register_00005201;
  byte in_register_00005202;
  byte in_register_00005203;
  byte in_register_00005204;
  byte in_register_00005205;
  byte in_register_00005206;
  byte in_register_00005207;
  byte in_register_00005208;
  byte in_register_00005209;
  byte in_register_0000520a;
  byte in_register_0000520b;
  byte in_register_0000520c;
  byte in_register_0000520d;
  byte in_register_0000520e;
  byte in_register_0000520f;
  undefined1 in_q17 [16];
  long lVar24;
  long lVar27;
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  long lVar28;
  long lVar31;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  long lVar32;
  long lVar35;
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  long lVar36;
  long lVar39;
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  long lVar40;
  long lVar41;
  long lVar42;
  long lVar43;
  long lVar44;
  long lVar45;
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  long in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  long in_stack_00000060;
  
  lVar23 = param_9._8_8_;
  lVar22 = param_9._0_8_;
  lVar21 = param_8._8_8_;
  lVar20 = param_8._0_8_;
  lVar19 = param_7._8_8_;
  lVar18 = param_7._0_8_;
  lVar17 = param_6._8_8_;
  lVar16 = param_6._0_8_;
  lVar15 = param_5._8_8_;
  lVar14 = param_5._0_8_;
  lVar13 = param_4._8_8_;
  lVar12 = param_4._0_8_;
  lVar11 = param_3._8_8_;
  lVar10 = param_3._0_8_;
  lVar9 = param_2._8_8_;
  lVar8 = param_2._0_8_;
  auVar4 = *(undefined1 (*) [16])(in_x10 + 0x2e0);
  auVar3 = *(undefined1 (*) [16])(in_x10 + 0x2e0);
  do {
    lVar24 = lVar14 << 3;
    lVar27 = lVar15 << 3;
    lVar28 = lVar12 << 3;
    lVar31 = lVar13 << 3;
    lVar32 = lVar10 << 3;
    lVar35 = lVar11 << 3;
    lVar36 = lVar8 << 3;
    lVar39 = lVar9 << 3;
    lVar1 = lVar20 << 3;
    lVar2 = lVar21 << 3;
    lVar40 = lVar22 << 3;
    lVar41 = lVar23 << 3;
    lVar42 = lVar18 << 3;
    lVar43 = lVar19 << 3;
    lVar44 = lVar16 << 3;
    lVar45 = lVar17 << 3;
    auVar37._0_8_ =
         CONCAT17((byte)((ulong)lVar36 >> 0x38) & in_register_00005207,
                  CONCAT16((byte)((ulong)lVar36 >> 0x30) & in_register_00005206,
                           CONCAT15((byte)((ulong)lVar36 >> 0x28) & in_register_00005205,
                                    CONCAT14((byte)((ulong)lVar36 >> 0x20) & in_register_00005204,
                                             CONCAT13((byte)((ulong)lVar36 >> 0x18) &
                                                      in_register_00005203,
                                                      CONCAT12((byte)((ulong)lVar36 >> 0x10) &
                                                               in_register_00005202,
                                                               CONCAT11((byte)((ulong)lVar36 >> 8) &
                                                                        in_register_00005201,
                                                                        (byte)lVar36 & in_b16)))))))
    ;
    auVar37[8] = (byte)lVar39 & in_register_00005208;
    auVar37[9] = (byte)((ulong)lVar39 >> 8) & in_register_00005209;
    auVar37[10] = (byte)((ulong)lVar39 >> 0x10) & in_register_0000520a;
    auVar37[0xb] = (byte)((ulong)lVar39 >> 0x18) & in_register_0000520b;
    auVar37[0xc] = (byte)((ulong)lVar39 >> 0x20) & in_register_0000520c;
    auVar37[0xd] = (byte)((ulong)lVar39 >> 0x28) & in_register_0000520d;
    auVar37[0xe] = (byte)((ulong)lVar39 >> 0x30) & in_register_0000520e;
    auVar37[0xf] = (byte)((ulong)lVar39 >> 0x38) & in_register_0000520f;
    auVar33._0_8_ =
         CONCAT17((byte)((ulong)lVar32 >> 0x38) & in_register_00005207,
                  CONCAT16((byte)((ulong)lVar32 >> 0x30) & in_register_00005206,
                           CONCAT15((byte)((ulong)lVar32 >> 0x28) & in_register_00005205,
                                    CONCAT14((byte)((ulong)lVar32 >> 0x20) & in_register_00005204,
                                             CONCAT13((byte)((ulong)lVar32 >> 0x18) &
                                                      in_register_00005203,
                                                      CONCAT12((byte)((ulong)lVar32 >> 0x10) &
                                                               in_register_00005202,
                                                               CONCAT11((byte)((ulong)lVar32 >> 8) &
                                                                        in_register_00005201,
                                                                        (byte)lVar32 & in_b16)))))))
    ;
    auVar33[8] = (byte)lVar35 & in_register_00005208;
    auVar33[9] = (byte)((ulong)lVar35 >> 8) & in_register_00005209;
    auVar33[10] = (byte)((ulong)lVar35 >> 0x10) & in_register_0000520a;
    auVar33[0xb] = (byte)((ulong)lVar35 >> 0x18) & in_register_0000520b;
    auVar33[0xc] = (byte)((ulong)lVar35 >> 0x20) & in_register_0000520c;
    auVar33[0xd] = (byte)((ulong)lVar35 >> 0x28) & in_register_0000520d;
    auVar33[0xe] = (byte)((ulong)lVar35 >> 0x30) & in_register_0000520e;
    auVar33[0xf] = (byte)((ulong)lVar35 >> 0x38) & in_register_0000520f;
    auVar29._0_8_ =
         CONCAT17((byte)((ulong)lVar28 >> 0x38) & in_register_00005207,
                  CONCAT16((byte)((ulong)lVar28 >> 0x30) & in_register_00005206,
                           CONCAT15((byte)((ulong)lVar28 >> 0x28) & in_register_00005205,
                                    CONCAT14((byte)((ulong)lVar28 >> 0x20) & in_register_00005204,
                                             CONCAT13((byte)((ulong)lVar28 >> 0x18) &
                                                      in_register_00005203,
                                                      CONCAT12((byte)((ulong)lVar28 >> 0x10) &
                                                               in_register_00005202,
                                                               CONCAT11((byte)((ulong)lVar28 >> 8) &
                                                                        in_register_00005201,
                                                                        (byte)lVar28 & in_b16)))))))
    ;
    auVar29[8] = (byte)lVar31 & in_register_00005208;
    auVar29[9] = (byte)((ulong)lVar31 >> 8) & in_register_00005209;
    auVar29[10] = (byte)((ulong)lVar31 >> 0x10) & in_register_0000520a;
    auVar29[0xb] = (byte)((ulong)lVar31 >> 0x18) & in_register_0000520b;
    auVar29[0xc] = (byte)((ulong)lVar31 >> 0x20) & in_register_0000520c;
    auVar29[0xd] = (byte)((ulong)lVar31 >> 0x28) & in_register_0000520d;
    auVar29[0xe] = (byte)((ulong)lVar31 >> 0x30) & in_register_0000520e;
    auVar29[0xf] = (byte)((ulong)lVar31 >> 0x38) & in_register_0000520f;
    auVar30._0_8_ =
         CONCAT17((byte)((ulong)lVar24 >> 0x38) & in_register_00005207,
                  CONCAT16((byte)((ulong)lVar24 >> 0x30) & in_register_00005206,
                           CONCAT15((byte)((ulong)lVar24 >> 0x28) & in_register_00005205,
                                    CONCAT14((byte)((ulong)lVar24 >> 0x20) & in_register_00005204,
                                             CONCAT13((byte)((ulong)lVar24 >> 0x18) &
                                                      in_register_00005203,
                                                      CONCAT12((byte)((ulong)lVar24 >> 0x10) &
                                                               in_register_00005202,
                                                               CONCAT11((byte)((ulong)lVar24 >> 8) &
                                                                        in_register_00005201,
                                                                        (byte)lVar24 & in_b16)))))))
    ;
    auVar30[8] = (byte)lVar27 & in_register_00005208;
    auVar30[9] = (byte)((ulong)lVar27 >> 8) & in_register_00005209;
    auVar30[10] = (byte)((ulong)lVar27 >> 0x10) & in_register_0000520a;
    auVar30[0xb] = (byte)((ulong)lVar27 >> 0x18) & in_register_0000520b;
    auVar30[0xc] = (byte)((ulong)lVar27 >> 0x20) & in_register_0000520c;
    auVar30[0xd] = (byte)((ulong)lVar27 >> 0x28) & in_register_0000520d;
    auVar30[0xe] = (byte)((ulong)lVar27 >> 0x30) & in_register_0000520e;
    auVar30[0xf] = (byte)((ulong)lVar27 >> 0x38) & in_register_0000520f;
    auVar46._0_8_ = -auVar30._0_8_;
    auVar46._8_8_ = -auVar30._8_8_;
    auVar46 = NEON_ushl(in_q17,auVar46,8);
    auVar47._0_8_ = -auVar29._0_8_;
    auVar47._8_8_ = -auVar29._8_8_;
    auVar47 = NEON_ushl(in_q17,auVar47,8);
    auVar48._0_8_ = -auVar33._0_8_;
    auVar48._8_8_ = -auVar33._8_8_;
    auVar48 = NEON_ushl(in_q17,auVar48,8);
    auVar49._0_8_ = -auVar37._0_8_;
    auVar49._8_8_ = -auVar37._8_8_;
    auVar49 = NEON_ushl(in_q17,auVar49,8);
    auVar25._0_8_ =
         -CONCAT17((byte)((ulong)lVar1 >> 0x38) & in_register_00005207,
                   CONCAT16((byte)((ulong)lVar1 >> 0x30) & in_register_00005206,
                            CONCAT15((byte)((ulong)lVar1 >> 0x28) & in_register_00005205,
                                     CONCAT14((byte)((ulong)lVar1 >> 0x20) & in_register_00005204,
                                              CONCAT13((byte)((ulong)lVar1 >> 0x18) &
                                                       in_register_00005203,
                                                       CONCAT12((byte)((ulong)lVar1 >> 0x10) &
                                                                in_register_00005202,
                                                                CONCAT11((byte)((ulong)lVar1 >> 8) &
                                                                         in_register_00005201,
                                                                         (byte)lVar1 & in_b16)))))))
    ;
    auVar25._8_8_ =
         -CONCAT17((byte)((ulong)lVar2 >> 0x38) & in_register_0000520f,
                   CONCAT16((byte)((ulong)lVar2 >> 0x30) & in_register_0000520e,
                            CONCAT15((byte)((ulong)lVar2 >> 0x28) & in_register_0000520d,
                                     CONCAT14((byte)((ulong)lVar2 >> 0x20) & in_register_0000520c,
                                              CONCAT13((byte)((ulong)lVar2 >> 0x18) &
                                                       in_register_0000520b,
                                                       CONCAT12((byte)((ulong)lVar2 >> 0x10) &
                                                                in_register_0000520a,
                                                                CONCAT11((byte)((ulong)lVar2 >> 8) &
                                                                         in_register_00005209,
                                                                         (byte)lVar2 &
                                                                         in_register_00005208)))))))
    ;
    auVar30 = NEON_ushl(in_q17,auVar25,8);
    lVar1 = -CONCAT17((byte)((ulong)lVar41 >> 0x38) & in_register_0000520f,
                      CONCAT16((byte)((ulong)lVar41 >> 0x30) & in_register_0000520e,
                               CONCAT15((byte)((ulong)lVar41 >> 0x28) & in_register_0000520d,
                                        CONCAT14((byte)((ulong)lVar41 >> 0x20) &
                                                 in_register_0000520c,
                                                 CONCAT13((byte)((ulong)lVar41 >> 0x18) &
                                                          in_register_0000520b,
                                                          CONCAT12((byte)((ulong)lVar41 >> 0x10) &
                                                                   in_register_0000520a,
                                                                   CONCAT11((byte)((ulong)lVar41 >>
                                                                                  8) &
                                                                            in_register_00005209,
                                                                            (byte)lVar41 &
                                                                            in_register_00005208))))
                                       )));
    auVar26[8] = (char)lVar1;
    auVar26._0_8_ =
         -CONCAT17((byte)((ulong)lVar40 >> 0x38) & in_register_00005207,
                   CONCAT16((byte)((ulong)lVar40 >> 0x30) & in_register_00005206,
                            CONCAT15((byte)((ulong)lVar40 >> 0x28) & in_register_00005205,
                                     CONCAT14((byte)((ulong)lVar40 >> 0x20) & in_register_00005204,
                                              CONCAT13((byte)((ulong)lVar40 >> 0x18) &
                                                       in_register_00005203,
                                                       CONCAT12((byte)((ulong)lVar40 >> 0x10) &
                                                                in_register_00005202,
                                                                CONCAT11((byte)((ulong)lVar40 >> 8)
                                                                         & in_register_00005201,
                                                                         (byte)lVar40 & in_b16))))))
                  );
    auVar26[9] = (char)((ulong)lVar1 >> 8);
    auVar26[10] = (char)((ulong)lVar1 >> 0x10);
    auVar26[0xb] = (char)((ulong)lVar1 >> 0x18);
    auVar26[0xc] = (char)((ulong)lVar1 >> 0x20);
    auVar26[0xd] = (char)((ulong)lVar1 >> 0x28);
    auVar26[0xe] = (char)((ulong)lVar1 >> 0x30);
    auVar26[0xf] = (char)((ulong)lVar1 >> 0x38);
    auVar26 = NEON_ushl(in_q17,auVar26,8);
    lVar1 = -CONCAT17((byte)((ulong)lVar43 >> 0x38) & in_register_0000520f,
                      CONCAT16((byte)((ulong)lVar43 >> 0x30) & in_register_0000520e,
                               CONCAT15((byte)((ulong)lVar43 >> 0x28) & in_register_0000520d,
                                        CONCAT14((byte)((ulong)lVar43 >> 0x20) &
                                                 in_register_0000520c,
                                                 CONCAT13((byte)((ulong)lVar43 >> 0x18) &
                                                          in_register_0000520b,
                                                          CONCAT12((byte)((ulong)lVar43 >> 0x10) &
                                                                   in_register_0000520a,
                                                                   CONCAT11((byte)((ulong)lVar43 >>
                                                                                  8) &
                                                                            in_register_00005209,
                                                                            (byte)lVar43 &
                                                                            in_register_00005208))))
                                       )));
    auVar34[8] = (char)lVar1;
    auVar34._0_8_ =
         -CONCAT17((byte)((ulong)lVar42 >> 0x38) & in_register_00005207,
                   CONCAT16((byte)((ulong)lVar42 >> 0x30) & in_register_00005206,
                            CONCAT15((byte)((ulong)lVar42 >> 0x28) & in_register_00005205,
                                     CONCAT14((byte)((ulong)lVar42 >> 0x20) & in_register_00005204,
                                              CONCAT13((byte)((ulong)lVar42 >> 0x18) &
                                                       in_register_00005203,
                                                       CONCAT12((byte)((ulong)lVar42 >> 0x10) &
                                                                in_register_00005202,
                                                                CONCAT11((byte)((ulong)lVar42 >> 8)
                                                                         & in_register_00005201,
                                                                         (byte)lVar42 & in_b16))))))
                  );
    auVar34[9] = (char)((ulong)lVar1 >> 8);
    auVar34[10] = (char)((ulong)lVar1 >> 0x10);
    auVar34[0xb] = (char)((ulong)lVar1 >> 0x18);
    auVar34[0xc] = (char)((ulong)lVar1 >> 0x20);
    auVar34[0xd] = (char)((ulong)lVar1 >> 0x28);
    auVar34[0xe] = (char)((ulong)lVar1 >> 0x30);
    auVar34[0xf] = (char)((ulong)lVar1 >> 0x38);
    auVar34 = NEON_ushl(in_q17,auVar34,8);
    lVar1 = -CONCAT17((byte)((ulong)lVar45 >> 0x38) & in_register_0000520f,
                      CONCAT16((byte)((ulong)lVar45 >> 0x30) & in_register_0000520e,
                               CONCAT15((byte)((ulong)lVar45 >> 0x28) & in_register_0000520d,
                                        CONCAT14((byte)((ulong)lVar45 >> 0x20) &
                                                 in_register_0000520c,
                                                 CONCAT13((byte)((ulong)lVar45 >> 0x18) &
                                                          in_register_0000520b,
                                                          CONCAT12((byte)((ulong)lVar45 >> 0x10) &
                                                                   in_register_0000520a,
                                                                   CONCAT11((byte)((ulong)lVar45 >>
                                                                                  8) &
                                                                            in_register_00005209,
                                                                            (byte)lVar45 &
                                                                            in_register_00005208))))
                                       )));
    auVar38[8] = (char)lVar1;
    auVar38._0_8_ =
         -CONCAT17((byte)((ulong)lVar44 >> 0x38) & in_register_00005207,
                   CONCAT16((byte)((ulong)lVar44 >> 0x30) & in_register_00005206,
                            CONCAT15((byte)((ulong)lVar44 >> 0x28) & in_register_00005205,
                                     CONCAT14((byte)((ulong)lVar44 >> 0x20) & in_register_00005204,
                                              CONCAT13((byte)((ulong)lVar44 >> 0x18) &
                                                       in_register_00005203,
                                                       CONCAT12((byte)((ulong)lVar44 >> 0x10) &
                                                                in_register_00005202,
                                                                CONCAT11((byte)((ulong)lVar44 >> 8)
                                                                         & in_register_00005201,
                                                                         (byte)lVar44 & in_b16))))))
                  );
    auVar38[9] = (char)((ulong)lVar1 >> 8);
    auVar38[10] = (char)((ulong)lVar1 >> 0x10);
    auVar38[0xb] = (char)((ulong)lVar1 >> 0x18);
    auVar38[0xc] = (char)((ulong)lVar1 >> 0x20);
    auVar38[0xd] = (char)((ulong)lVar1 >> 0x28);
    auVar38[0xe] = (char)((ulong)lVar1 >> 0x30);
    auVar38[0xf] = (char)((ulong)lVar1 >> 0x38);
    auVar38 = NEON_ushl(in_q17,auVar38,8);
    auVar26 = a64_TBL(ZEXT816(0),auVar26,auVar30,auVar34,auVar38,auVar3);
    auVar34 = a64_TBL(ZEXT816(0),auVar46,auVar47,auVar48,auVar49,auVar4);
    lVar1 = param_10 + in_x9;
    (&UNK_00006538)[lVar1] = (&UNK_00006538)[lVar1] ^ auVar34[0];
    (&UNK_00006539)[lVar1] = (&UNK_00006539)[lVar1] ^ auVar34[1];
    (&UNK_0000653a)[lVar1] = (&UNK_0000653a)[lVar1] ^ auVar34[2];
    (&UNK_0000653b)[lVar1] = (&UNK_0000653b)[lVar1] ^ auVar34[3];
    (&UNK_0000653c)[lVar1] = (&UNK_0000653c)[lVar1] ^ auVar34[4];
    (&UNK_0000653d)[lVar1] = (&UNK_0000653d)[lVar1] ^ auVar34[5];
    (&UNK_0000653e)[lVar1] = (&UNK_0000653e)[lVar1] ^ auVar34[6];
    (&UNK_0000653f)[lVar1] = (&UNK_0000653f)[lVar1] ^ auVar34[7];
    (&UNK_00006530)[lVar1] = (&UNK_00006530)[lVar1] ^ auVar26[0];
    (&UNK_00006531)[lVar1] = (&UNK_00006531)[lVar1] ^ auVar26[1];
    (&UNK_00006532)[lVar1] = (&UNK_00006532)[lVar1] ^ auVar26[2];
    (&UNK_00006533)[lVar1] = (&UNK_00006533)[lVar1] ^ auVar26[3];
    (&UNK_00006534)[lVar1] = (&UNK_00006534)[lVar1] ^ auVar26[4];
    (&UNK_00006535)[lVar1] = (&UNK_00006535)[lVar1] ^ auVar26[5];
    (&UNK_00006536)[lVar1] = (&UNK_00006536)[lVar1] ^ auVar26[6];
    (&UNK_00006537)[lVar1] = (&UNK_00006537)[lVar1] ^ auVar26[7];
    lVar18 = lVar18 + 0x10;
    lVar19 = lVar19 + 0x10;
    lVar20 = lVar20 + 0x10;
    lVar21 = lVar21 + 0x10;
    lVar22 = lVar22 + 0x10;
    lVar23 = lVar23 + 0x10;
    lVar16 = lVar16 + 0x10;
    lVar17 = lVar17 + 0x10;
    lVar14 = lVar14 + 0x10;
    lVar15 = lVar15 + 0x10;
    lVar12 = lVar12 + 0x10;
    lVar13 = lVar13 + 0x10;
    lVar10 = lVar10 + 0x10;
    lVar11 = lVar11 + 0x10;
    lVar8 = lVar8 + 0x10;
    lVar9 = lVar9 + 0x10;
    in_x9 = in_x9 + 0x10;
  } while (in_x9 != 0);
  uVar5 = (ulong)_UNK_007fc0e0 >> 0x20;
  *param_1 = *param_1 ^ (byte)_UNK_007fc0e0;
  param_1[1] = param_1[1] ^ (byte)uVar5;
  param_1[2] = param_1[2] ^ 0xab;
  param_1[3] = 0;
  uRam0000000000a33938 = 0;
  uRam0000000000a33940 = 0;
  uRam0000000000a33930 = 0;
  lRam0000000000a33910 = param_10;
  ___cxa_atexit(&DAT_00009f30,0xa33930,0);
  uRam0000000000a33950 = 0;
  uRam0000000000a33948 = 0xa33950;
  uRam0000000000a33958 = 0;
  ___cxa_atexit(&DAT_00009fb8,0xa33948,0);
  ___cxa_atexit(PTR___ZNSt3__15mutexD1Ev_009b0090,0xa288e8,0);
  lVar8 = _getenv("HOME");
  in_stack_00000040 = 0;
  in_stack_00000048 = 0;
  uStack0000000000000038 = 0;
  pcVar7 = (char *)(lVar8 + -1);
  do {
    pcVar7 = pcVar7 + 1;
  } while (*pcVar7 != '\0');
  func_0x00017184(&uStack0000000000000038,lVar8);
  uStack0000000000000020 = 0;
  in_stack_00000028 = 0;
  in_stack_00000030 = 0;
  func_0x00017184(&uStack0000000000000020,"Hydrogen","");
  if (in_stack_00000048 < 0) {
    func_0x00017634(&uStack0000000000000050,uStack0000000000000038,in_stack_00000040);
  }
  else {
    in_stack_00000058 = in_stack_00000040;
    uStack0000000000000050 = uStack0000000000000038;
    in_stack_00000060 = in_stack_00000048;
  }
  func_0x0001754c(&uStack0000000000000050,&uStack0000000000000020);
  uStack0000000000000008 = 0;
  in_stack_00000010 = 0;
  in_stack_00000018 = 0;
  func_0x00017184(&uStack0000000000000008,"autoexecute","");
  if (in_stack_00000060 < 0) {
    func_0x00017634(0xa33220,uStack0000000000000050,in_stack_00000058);
  }
  else {
    uRam0000000000a33228 = in_stack_00000058;
    uRam0000000000a33220 = uStack0000000000000050;
    lRam0000000000a33230 = in_stack_00000060;
  }
  func_0x0001754c(0xa33220,&uStack0000000000000008);
  if (in_stack_00000018 < 0) {
    __ZdlPv(uStack0000000000000008);
  }
  if (in_stack_00000060 < 0) {
    __ZdlPv(uStack0000000000000050);
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (in_stack_00000048 < 0) {
    __ZdlPv(uStack0000000000000038);
  }
  ___cxa_atexit(&DAT_00009f30,0xa33220,0);
  ___cxa_atexit(&DAT_00009fe0,0xa33238,0);
  ___cxa_atexit(&DAT_0000a010,0xa28928,0);
  ___cxa_atexit(PTR___ZNSt3__15mutexD1Ev_009b0090,0xa28980,0);
  ___cxa_atexit(&DAT_0000a088,0xa289c0,0);
  uRam0000000000a33258 = 0;
  uRam0000000000a33250 = 0;
  uRam0000000000a33268 = 0;
  uRam0000000000a33260 = 0;
  uRam0000000000a33270 = 0x3f800000;
  ___cxa_atexit(&DAT_0000aa18,0xa33250,0);
  uRam0000000000a33288 = 0;
  uRam0000000000a33280 = 0;
  uRam0000000000a33278 = 0xa33280;
  ___cxa_atexit(&DAT_0000aa60,0xa33278,0);
  uRam0000000000a332b8 = 0;
  uRam0000000000a332b0 = 0;
  uRam0000000000a332c8 = 0;
  uRam0000000000a332c0 = 0;
  uRam0000000000a332d0 = 0x3f800000;
  ___cxa_atexit(&DAT_0000aa88,0xa332b0,0);
  ___cxa_atexit(&DAT_0000aad0,0xa332d8,0);
  ___cxa_atexit(&DAT_0000ab40,0xa332f0,0);
  puVar6 = PTR___ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev_009b0078;
  ___cxa_atexit(PTR___ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEED1Ev_009b0078,
                0xa33300,0);
  ___cxa_atexit(&DAT_0000aba0,0xa33318,0);
  uRam0000000000a33338 = 0;
  uRam0000000000a33330 = 0;
  uRam0000000000a33348 = 0;
  uRam0000000000a33340 = 0;
  uRam0000000000a33350 = 0x3f800000;
  ___cxa_atexit(&DAT_0000abd0,0xa33330,0);
  uRam0000000000a33368 = 0;
  uRam0000000000a33360 = 0;
  uRam0000000000a33358 = 0xa33360;
  ___cxa_atexit(&DAT_0000ac18,0xa33358,0);
  uRam0000000000a33380 = 0;
  uRam0000000000a33378 = 0;
  uRam0000000000a33370 = 0xa33378;
  ___cxa_atexit(&DAT_0000ac40,0xa33370,0);
  uRam0000000000a33398 = 0;
  uRam0000000000a33390 = 0;
  uRam0000000000a333a8 = 0;
  uRam0000000000a333a0 = 0;
  uRam0000000000a333b0 = 0x3f800000;
  ___cxa_atexit(&DAT_0000ac68,0xa33390,0);
  uRam0000000000a333c0 = 0;
  uRam0000000000a333b8 = 0;
  uRam0000000000a333d0 = 0;
  uRam0000000000a333c8 = 0;
  uRam0000000000a333d8 = 0x3f800000;
  ___cxa_atexit(&DAT_0000acd0,0xa333b8,0);
  ___cxa_atexit(puVar6,0xa333e0,0);
  uRam0000000000a2b8e0 = uRam0000000000a27948;
  puRam0000000000a2b8e8 = &DAT_0000e3fc;
  uRam0000000000a2b8f0 = 0xa28a20;
  return;
}

