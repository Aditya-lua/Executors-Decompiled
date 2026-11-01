
void FUN_00322e44(undefined8 param_1,undefined8 param_2,undefined1 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  long unaff_x19;
  long unaff_x29;
  short sVar10;
  short sVar11;
  short sVar12;
  short sVar13;
  short sVar14;
  short sVar15;
  short sVar16;
  short sVar17;
  short sVar18;
  short sVar19;
  short sVar20;
  short sVar21;
  short sVar22;
  short sVar23;
  short sVar24;
  short sVar25;
  short sVar26;
  short sVar27;
  short sVar28;
  short sVar29;
  short sVar30;
  short sVar31;
  short sVar32;
  short sVar33;
  undefined1 auVar34 [16];
  undefined1 auStack_d0 [128];
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined1 uStack_30;
  long lStack_28;
  
  uStack_30 = param_3;
  func_0x00331f20();
  func_0x00331f20();
  uVar1 = *(undefined8 *)(unaff_x29 + -0xf0);
  uVar3 = *(undefined8 *)(unaff_x29 + -0xd8);
  uVar2 = *(undefined8 *)(unaff_x29 + -0xe0);
  *(undefined8 *)(unaff_x19 + 0x608) = *(undefined8 *)(unaff_x29 + -0xe8);
  *(undefined8 *)(unaff_x19 + 0x600) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x618) = uVar3;
  *(undefined8 *)(unaff_x19 + 0x610) = uVar2;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x88)) {
    return;
  }
  auVar34 = ___stack_chk_fail();
  puVar9 = auVar34._8_8_;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_48 = puVar9[1];
  uStack_50 = *puVar9;
  uStack_38 = puVar9[3];
  uStack_40 = puVar9[2];
  func_0x0036d148(auStack_d0,0x80,&uStack_50,0x21);
  func_0x002dff1c(auVar34._0_8_,auStack_d0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return;
  }
  puVar9 = (undefined8 *)___stack_chk_fail();
  func_0x0032d070();
  uVar2 = puVar9[1];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = *puVar9;
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[3];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[2];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[5];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[4];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[7];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[6];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[1] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar2 +
                                         (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  *puVar9 = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                     CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       (short)uVar1 +
                                       (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                    );
  puVar9[3] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar4 +
                                         (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  puVar9[2] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar3 +
                                         (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  puVar9[5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                       0x10),
                       CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       0xd010000) >> 0x10),
                                CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                 0x1a) * 0xd010000) >> 0x10),
                                         (short)uVar6 -
                                         (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * 0xd010000) >> 0x10))));
  puVar9[4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                       0x10),
                       CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       0xd010000) >> 0x10),
                                CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                 0x1a) * 0xd010000) >> 0x10),
                                         (short)uVar5 -
                                         (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * 0xd010000) >> 0x10))));
  puVar9[7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                       0x10),
                       CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       0xd010000) >> 0x10),
                                CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                 0x1a) * 0xd010000) >> 0x10),
                                         (short)uVar8 -
                                         (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * 0xd010000) >> 0x10))));
  puVar9[6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                       0x10),
                       CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       0xd010000) >> 0x10),
                                CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                 0x1a) * 0xd010000) >> 0x10),
                                         (short)uVar7 -
                                         (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * 0xd010000) >> 0x10))));
  uVar2 = puVar9[9];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[8];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xb];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[10];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xd];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xc];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xf];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xe];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[9] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar2 +
                                         (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  puVar9[8] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar1 +
                                         (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  puVar9[0xb] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                         CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                  CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                           (short)uVar4 +
                                           (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                           -0xd01)));
  puVar9[10] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                        CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                 CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                   -0xd01,
                                          (short)uVar3 +
                                          (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                          -0xd01)));
  puVar9[0xd] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar6 -
                                           (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar9[0xc] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar5 -
                                           (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar9[0xf] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar8 -
                                           (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar9[0xe] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar7 -
                                           (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x11];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x10];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x13];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x12];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x15];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x14];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x17];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x16];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x11] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x10] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x13] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x12] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x15] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x14] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x17] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x16] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x19];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x18];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x1b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x1a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x1d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x1c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x1f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x1e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x19] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x18] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x1b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x1a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x1d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x1c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x1f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x1e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x21];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x20];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x23];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x22];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x25];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x24];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x27];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x26];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x21] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x20] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x23] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x22] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x25] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x24] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x27] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x26] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x29];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x28];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x2b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x2a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x2d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x2c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x2f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x2e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x29] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x28] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x2b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x2a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x2d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x2c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x2f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x2e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x31];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x30];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x33];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x32];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x35];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x34];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x37];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x36];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x31] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x30] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x33] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x32] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x35] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x34] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x37] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x36] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x39];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x38];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x3b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x3a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x3d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x3c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x3f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x3e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x39] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x38] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x3b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x3a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x3d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x3c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x3f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x3e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  func_0x0032d070(puVar9 + 0x40);
  uVar2 = puVar9[0x41];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x40];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x43];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x42];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x45];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x44];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x47];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x46];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x41] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x40] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x43] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x42] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x45] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x44] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x47] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x46] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x49];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x48];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x4b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x4a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x4d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x4c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x4f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x4e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x49] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x48] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x4b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x4a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x4d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x4c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x4f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x4e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x51];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x50];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x53];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x52];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x55];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x54];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x57];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x56];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x51] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x50] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x53] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x52] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x55] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x54] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x57] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x56] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x59];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x58];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x5b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x5a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x5d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x5c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x5f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x5e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x59] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x58] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x5b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x5a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x5d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x5c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x5f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x5e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x61];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x60];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[99];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x62];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x65];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[100];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x67];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x66];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x61] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x60] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[99] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                        CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                 CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                   -0xd01,
                                          (short)uVar4 +
                                          (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                          -0xd01)));
  puVar9[0x62] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x65] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[100] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar5 -
                                           (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar9[0x67] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x66] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x69];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x68];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x6b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x6a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x6d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x6c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x6f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x6e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x69] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x68] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x6b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x6a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x6d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x6c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x6f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x6e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x71];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x70];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x73];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x72];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x75];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x74];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x77];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x76];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x71] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x70] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x73] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x72] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x75] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x74] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x77] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x76] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x79];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x78];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x7b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x7a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x7d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x7c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x7f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x7e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x79] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x78] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x7b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x7a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x7d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x7c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x7f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x7e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  func_0x0032d070(puVar9 + 0x80);
  uVar2 = puVar9[0x81];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x80];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x83];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x82];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x85];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x84];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x87];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x86];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x81] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x80] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x83] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x82] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x85] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x84] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x87] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x86] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x89];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x88];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x8b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x8a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x8d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x8c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x8f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x8e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x89] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x88] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x8b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x8a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x8d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x8c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x8f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x8e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x91];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x90];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x93];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x92];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x95];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x94];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x97];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x96];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x91] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x90] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x93] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x92] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x95] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x94] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x97] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x96] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0x99];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0x98];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0x9b];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0x9a];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0x9d];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0x9c];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0x9f];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0x9e];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0x99] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x98] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x9b] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x9a] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0x9d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x9c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x9f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0x9e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xa1];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xa0];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xa3];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xa2];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xa5];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xa4];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xa7];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xa6];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xa1] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xa0] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xa3] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xa2] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xa5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xa4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xa7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xa6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xa9];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xa8];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xab];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xaa];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xad];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xac];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xaf];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xae];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xa9] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xa8] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xab] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xaa] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xad] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xac] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xaf] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xae] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xb1];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xb0];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xb3];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xb2];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xb5];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xb4];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xb7];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xb6];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xb1] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xb0] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xb3] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xb2] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xb5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xb4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xb7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xb6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xb9];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xb8];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xbb];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xba];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xbd];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xbc];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xbf];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xbe];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xb9] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xb8] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xbb] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xba] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xbd] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xbc] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xbf] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xbe] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  func_0x0032d070(puVar9 + 0xc0);
  uVar2 = puVar9[0xc1];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xc0];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xc3];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xc2];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xc5];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xc4];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[199];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xc6];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xc1] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xc0] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xc3] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xc2] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xc5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xc4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[199] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar8 -
                                           (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar9[0xc6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xc9];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[200];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xcb];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xca];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xcd];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xcc];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xcf];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xce];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xc9] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[200] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                         CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                  CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                           (short)uVar1 +
                                           (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                           -0xd01)));
  puVar9[0xcb] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xca] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xcd] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xcc] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xcf] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xce] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xd1];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xd0];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xd3];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xd2];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xd5];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xd4];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xd7];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xd6];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xd1] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xd0] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xd3] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xd2] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xd5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xd4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xd7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xd6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xd9];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xd8];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xdb];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xda];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xdd];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xdc];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xdf];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xde];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xd9] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xd8] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xdb] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xda] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xdd] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xdc] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xdf] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xde] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xe1];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xe0];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xe3];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xe2];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xe5];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xe4];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xe7];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xe6];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xe1] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xe0] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xe3] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xe2] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xe5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xe4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xe7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xe6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xe9];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xe8];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xeb];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xea];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xed];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xec];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xef];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xee];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xe9] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xe8] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xeb] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xea] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xed] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xec] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xef] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xee] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xf1];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xf0];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xf3];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xf2];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xf5];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xf4];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xf7];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xf6];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xf1] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xf0] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xf3] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xf2] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xf5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xf4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xf7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xf6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar9[0xf9];
  sVar13 = (short)((ulong)uVar2 >> 0x10);
  sVar14 = (short)((ulong)uVar2 >> 0x20);
  sVar15 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar9[0xf8];
  sVar10 = (short)((ulong)uVar1 >> 0x10);
  sVar11 = (short)((ulong)uVar1 >> 0x20);
  sVar12 = (short)((ulong)uVar1 >> 0x30);
  uVar4 = puVar9[0xfb];
  sVar19 = (short)((ulong)uVar4 >> 0x10);
  sVar20 = (short)((ulong)uVar4 >> 0x20);
  sVar21 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar9[0xfa];
  sVar16 = (short)((ulong)uVar3 >> 0x10);
  sVar17 = (short)((ulong)uVar3 >> 0x20);
  sVar18 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar9[0xfd];
  sVar25 = (short)((ulong)uVar6 >> 0x10);
  sVar26 = (short)((ulong)uVar6 >> 0x20);
  sVar27 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar9[0xfc];
  sVar22 = (short)((ulong)uVar5 >> 0x10);
  sVar23 = (short)((ulong)uVar5 >> 0x20);
  sVar24 = (short)((ulong)uVar5 >> 0x30);
  uVar8 = puVar9[0xff];
  sVar31 = (short)((ulong)uVar8 >> 0x10);
  sVar32 = (short)((ulong)uVar8 >> 0x20);
  sVar33 = (short)((ulong)uVar8 >> 0x30);
  uVar7 = puVar9[0xfe];
  sVar28 = (short)((ulong)uVar7 >> 0x10);
  sVar29 = (short)((ulong)uVar7 >> 0x20);
  sVar30 = (short)((ulong)uVar7 >> 0x30);
  puVar9[0xf9] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xf8] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xfb] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar4 +
                                            (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xfa] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar3 +
                                            (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar9[0xfd] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xfc] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xff] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar8 -
                                            (short)((uint)(((short)uVar8 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar9[0xfe] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar7 -
                                            (short)((uint)(((short)uVar7 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  return;
}

