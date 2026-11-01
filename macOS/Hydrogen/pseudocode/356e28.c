
void FUN_00356e28(undefined8 param_1,undefined8 param_2,undefined1 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 *puVar7;
  long unaff_x19;
  long unaff_x29;
  short sVar8;
  short sVar9;
  short sVar10;
  short sVar11;
  short sVar12;
  short sVar13;
  short sVar14;
  short sVar15;
  short sVar16;
  short sVar18;
  short sVar19;
  undefined8 uVar17;
  short sVar20;
  undefined8 uVar21;
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
  undefined8 in_stack_000024c0;
  undefined8 in_stack_000024c8;
  undefined8 in_stack_000024d0;
  undefined8 in_stack_000024d8;
  undefined1 auStack_d0 [128];
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined1 uStack_30;
  long lStack_28;
  
  uStack_30 = param_3;
  func_0x0036b288();
  func_0x0036b288();
  *(undefined8 *)(unaff_x19 + 0x488) = in_stack_000024c8;
  *(undefined8 *)(unaff_x19 + 0x480) = in_stack_000024c0;
  *(undefined8 *)(unaff_x19 + 0x498) = in_stack_000024d8;
  *(undefined8 *)(unaff_x19 + 0x490) = in_stack_000024d0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x98)) {
    return;
  }
  auVar34 = ___stack_chk_fail();
  puVar7 = auVar34._8_8_;
  lStack_28 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_48 = puVar7[1];
  uStack_50 = *puVar7;
  uStack_38 = puVar7[3];
  uStack_40 = puVar7[2];
  func_0x0036d148(auStack_d0,0x80,&uStack_50,0x21);
  func_0x002dff1c(auVar34._0_8_,auStack_d0);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_28) {
    return;
  }
  puVar7 = (undefined8 *)___stack_chk_fail();
  func_0x003656d0();
  uVar21 = puVar7[1];
  uVar17 = *puVar7;
  uVar2 = puVar7[3];
  sVar18 = (short)((ulong)uVar2 >> 0x10);
  sVar19 = (short)((ulong)uVar2 >> 0x20);
  sVar20 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[2];
  sVar14 = (short)((ulong)uVar1 >> 0x10);
  sVar15 = (short)((ulong)uVar1 >> 0x20);
  sVar16 = (short)((ulong)uVar1 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar11 = (short)((ulong)uVar17 >> 0x10);
  sVar12 = (short)((ulong)uVar17 >> 0x20);
  sVar13 = (short)((ulong)uVar17 >> 0x30);
  uVar4 = puVar7[5];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[4];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[7];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[6];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  puVar7[1] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                 -0xd01,
                                         (short)uVar21 +
                                         (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                         -0xd01)));
  *puVar7 = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                     CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       (short)uVar17 +
                                       (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                             ));
  puVar7[3] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar2 +
                                         (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  puVar7[2] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar1 +
                                         (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  puVar7[5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                       0x10),
                       CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       0xd010000) >> 0x10),
                                CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                 0x1a) * 0xd010000) >> 0x10),
                                         (short)uVar4 -
                                         (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * 0xd010000) >> 0x10))));
  puVar7[4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                       0x10),
                       CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       0xd010000) >> 0x10),
                                CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                 0x1a) * 0xd010000) >> 0x10),
                                         (short)uVar3 -
                                         (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * 0xd010000) >> 0x10))));
  puVar7[7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                       0x10),
                       CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       0xd010000) >> 0x10),
                                CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                 0x1a) * 0xd010000) >> 0x10),
                                         (short)uVar6 -
                                         (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * 0xd010000) >> 0x10))));
  puVar7[6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                       0x10),
                       CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       0xd010000) >> 0x10),
                                CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                 0x1a) * 0xd010000) >> 0x10),
                                         (short)uVar5 -
                                         (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * 0xd010000) >> 0x10))));
  uVar2 = puVar7[9];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[8];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0xb];
  uVar17 = puVar7[10];
  uVar4 = puVar7[0xd];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0xc];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0xf];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0xe];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[9] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar2 +
                                         (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  puVar7[8] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                       CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                         (short)uVar1 +
                                         (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                        )));
  puVar7[0xb] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                         CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                  CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                   -0xd01,
                                           (short)uVar21 +
                                           (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                           -0xd01)));
  puVar7[10] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                        CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                 CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                   -0xd01,
                                          (short)uVar17 +
                                          (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                          -0xd01)));
  puVar7[0xd] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar4 -
                                           (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar7[0xc] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar3 -
                                           (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar7[0xf] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar6 -
                                           (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar7[0xe] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar5 -
                                           (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x11];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x10];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x13];
  uVar17 = puVar7[0x12];
  uVar4 = puVar7[0x15];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x14];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x17];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x16];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x11] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x10] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x13] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x12] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x15] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x14] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x17] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x16] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x19];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x18];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x1b];
  uVar17 = puVar7[0x1a];
  uVar4 = puVar7[0x1d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x1c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x1f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x1e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x19] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x18] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x1b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x1a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x1d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x1c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x1f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x1e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x21];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x20];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x23];
  uVar17 = puVar7[0x22];
  uVar4 = puVar7[0x25];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x24];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x27];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x26];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x21] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x20] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x23] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x22] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x25] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x24] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x27] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x26] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x29];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x28];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x2b];
  uVar17 = puVar7[0x2a];
  uVar4 = puVar7[0x2d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x2c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x2f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x2e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x29] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x28] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x2b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x2a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x2d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x2c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x2f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x2e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x31];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x30];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x33];
  uVar17 = puVar7[0x32];
  uVar4 = puVar7[0x35];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x34];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x37];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x36];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x31] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x30] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x33] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x32] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x35] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x34] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x37] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x36] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x39];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x38];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x3b];
  uVar17 = puVar7[0x3a];
  uVar4 = puVar7[0x3d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x3c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x3f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x3e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x39] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x38] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x3b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x3a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x3d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x3c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x3f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x3e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  func_0x003656d0(puVar7 + 0x40);
  uVar21 = puVar7[0x41];
  uVar17 = puVar7[0x40];
  uVar2 = puVar7[0x43];
  sVar18 = (short)((ulong)uVar2 >> 0x10);
  sVar19 = (short)((ulong)uVar2 >> 0x20);
  sVar20 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x42];
  sVar14 = (short)((ulong)uVar1 >> 0x10);
  sVar15 = (short)((ulong)uVar1 >> 0x20);
  sVar16 = (short)((ulong)uVar1 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar11 = (short)((ulong)uVar17 >> 0x10);
  sVar12 = (short)((ulong)uVar17 >> 0x20);
  sVar13 = (short)((ulong)uVar17 >> 0x30);
  uVar4 = puVar7[0x45];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x44];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x47];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x46];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  puVar7[0x41] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x40] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x43] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x42] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x45] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x44] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x47] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x46] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x49];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x48];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x4b];
  uVar17 = puVar7[0x4a];
  uVar4 = puVar7[0x4d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x4c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x4f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x4e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x49] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x48] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x4b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x4a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x4d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x4c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x4f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x4e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x51];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x50];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x53];
  uVar17 = puVar7[0x52];
  uVar4 = puVar7[0x55];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x54];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x57];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x56];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x51] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x50] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x53] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x52] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x55] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x54] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x57] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x56] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x59];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x58];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x5b];
  uVar17 = puVar7[0x5a];
  uVar4 = puVar7[0x5d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x5c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x5f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x5e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x59] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x58] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x5b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x5a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x5d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x5c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x5f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x5e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x61];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x60];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[99];
  uVar17 = puVar7[0x62];
  uVar4 = puVar7[0x65];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[100];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x67];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x66];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x61] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x60] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[99] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                        CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                 CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                  -0xd01,
                                          (short)uVar21 +
                                          (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                          -0xd01)));
  puVar7[0x62] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x65] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[100] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                         >> 0x10),
                         CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                         0xd010000) >> 0x10),
                                  CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                   0x1a) * 0xd010000) >> 0x10),
                                           (short)uVar3 -
                                           (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a
                                                          ) * 0xd010000) >> 0x10))));
  puVar7[0x67] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x66] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x69];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x68];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x6b];
  uVar17 = puVar7[0x6a];
  uVar4 = puVar7[0x6d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x6c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x6f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x6e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x69] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x68] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x6b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x6a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x6d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x6c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x6f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x6e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x71];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x70];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x73];
  uVar17 = puVar7[0x72];
  uVar4 = puVar7[0x75];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x74];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x77];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x76];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x71] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x70] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x73] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x72] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x75] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x74] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x77] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x76] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x79];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x78];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x7b];
  uVar17 = puVar7[0x7a];
  uVar4 = puVar7[0x7d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x7c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x7f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x7e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x79] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x78] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x7b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x7a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x7d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x7c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x7f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x7e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  func_0x003656d0(puVar7 + 0x80);
  uVar21 = puVar7[0x81];
  uVar17 = puVar7[0x80];
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  uVar2 = puVar7[0x83];
  sVar18 = (short)((ulong)uVar2 >> 0x10);
  sVar19 = (short)((ulong)uVar2 >> 0x20);
  sVar20 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x82];
  sVar14 = (short)((ulong)uVar1 >> 0x10);
  sVar15 = (short)((ulong)uVar1 >> 0x20);
  sVar16 = (short)((ulong)uVar1 >> 0x30);
  sVar11 = (short)((ulong)uVar17 >> 0x10);
  sVar12 = (short)((ulong)uVar17 >> 0x20);
  sVar13 = (short)((ulong)uVar17 >> 0x30);
  uVar4 = puVar7[0x85];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x84];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x87];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x86];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  puVar7[0x81] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x80] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x83] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x82] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x85] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x84] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x87] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x86] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x89];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x88];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x8b];
  uVar17 = puVar7[0x8a];
  uVar4 = puVar7[0x8d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x8c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x8f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x8e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x89] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x88] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x8b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x8a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x8d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x8c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x8f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x8e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x91];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x90];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x93];
  uVar17 = puVar7[0x92];
  uVar4 = puVar7[0x95];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x94];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x97];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x96];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x91] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x90] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x93] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x92] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x95] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x94] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x97] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x96] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0x99];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0x98];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0x9b];
  uVar17 = puVar7[0x9a];
  uVar4 = puVar7[0x9d];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0x9c];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0x9f];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0x9e];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0x99] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x98] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x9b] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x9a] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0x9d] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x9c] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x9f] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0x9e] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0xa1];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0xa0];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0xa3];
  uVar17 = puVar7[0xa2];
  uVar4 = puVar7[0xa5];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0xa4];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0xa7];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0xa6];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0xa1] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xa0] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xa3] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xa2] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xa5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xa4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xa7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xa6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0xa9];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0xa8];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0xab];
  uVar17 = puVar7[0xaa];
  uVar4 = puVar7[0xad];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0xac];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0xaf];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0xae];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0xa9] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xa8] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xab] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xaa] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xad] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xac] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xaf] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xae] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0xb1];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0xb0];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0xb3];
  uVar17 = puVar7[0xb2];
  uVar4 = puVar7[0xb5];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0xb4];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0xb7];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0xb6];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0xb1] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xb0] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xb3] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xb2] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xb5] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xb4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xb7] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xb6] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  uVar2 = puVar7[0xb9];
  sVar14 = (short)((ulong)uVar2 >> 0x10);
  sVar15 = (short)((ulong)uVar2 >> 0x20);
  sVar16 = (short)((ulong)uVar2 >> 0x30);
  uVar1 = puVar7[0xb8];
  sVar11 = (short)((ulong)uVar1 >> 0x10);
  sVar12 = (short)((ulong)uVar1 >> 0x20);
  sVar13 = (short)((ulong)uVar1 >> 0x30);
  uVar21 = puVar7[0xbb];
  uVar17 = puVar7[0xba];
  uVar4 = puVar7[0xbd];
  sVar25 = (short)((ulong)uVar4 >> 0x10);
  sVar26 = (short)((ulong)uVar4 >> 0x20);
  sVar27 = (short)((ulong)uVar4 >> 0x30);
  uVar3 = puVar7[0xbc];
  sVar22 = (short)((ulong)uVar3 >> 0x10);
  sVar23 = (short)((ulong)uVar3 >> 0x20);
  sVar24 = (short)((ulong)uVar3 >> 0x30);
  uVar6 = puVar7[0xbf];
  sVar31 = (short)((ulong)uVar6 >> 0x10);
  sVar32 = (short)((ulong)uVar6 >> 0x20);
  sVar33 = (short)((ulong)uVar6 >> 0x30);
  uVar5 = puVar7[0xbe];
  sVar28 = (short)((ulong)uVar5 >> 0x10);
  sVar29 = (short)((ulong)uVar5 >> 0x20);
  sVar30 = (short)((ulong)uVar5 >> 0x30);
  sVar8 = (short)((ulong)uVar21 >> 0x10);
  sVar9 = (short)((ulong)uVar21 >> 0x20);
  sVar10 = (short)((ulong)uVar21 >> 0x30);
  sVar18 = (short)((ulong)uVar17 >> 0x10);
  sVar19 = (short)((ulong)uVar17 >> 0x20);
  sVar20 = (short)((ulong)uVar17 >> 0x30);
  puVar7[0xb9] = CONCAT26(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar2 +
                                            (short)((short)uVar2 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xb8] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar1 +
                                            (short)((short)uVar1 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xbb] = CONCAT26(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                            (short)uVar21 +
                                            (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xba] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar17 +
                                            (short)((short)uVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
  puVar7[0xbd] = CONCAT26(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar26 - (short)((uint)((sVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar25 - (short)((uint)((sVar25 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar4 -
                                            (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xbc] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar3 -
                                            (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xbf] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar6 -
                                            (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  puVar7[0xbe] = CONCAT26(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000)
                                          >> 0x10),
                          CONCAT24(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                          0xd010000) >> 0x10),
                                   CONCAT22(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >>
                                                                    0x1a) * 0xd010000) >> 0x10),
                                            (short)uVar5 -
                                            (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                           0x1a) * 0xd010000) >> 0x10))));
  return;
}

