
void FUN_002e3598(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  bool bVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong uVar8;
  long unaff_x29;
  short sVar9;
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
  short sVar22;
  short sVar23;
  undefined8 uVar21;
  short sVar24;
  undefined8 uVar25;
  short sVar27;
  short sVar28;
  undefined8 uVar26;
  short sVar29;
  undefined8 uVar30;
  short sVar31;
  short sVar32;
  short sVar33;
  short sVar34;
  short sVar35;
  short sVar36;
  undefined1 auVar37 [16];
  undefined1 uStack0000000000000189;
  undefined1 auStack_120 [192];
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  long lStack_38;
  
  func_0x00383e60();
  uStack0000000000000189 = 1;
  func_0x0036e464();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return;
  }
  auVar37 = ___stack_chk_fail();
  lStack_38 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_58 = param_3[1];
  uStack_60 = *param_3;
  uStack_48 = param_3[3];
  uStack_50 = param_3[2];
  func_0x002f23b0(&uStack_60,0x21,auStack_120,0xc0);
  func_0x002df560(auVar37._0_8_,auVar37._8_8_,auStack_120);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_38) {
    return;
  }
  auVar37 = ___stack_chk_fail();
  if (*auVar37._0_8_ != 0) {
    uVar7 = 0;
    uVar8 = 1;
    do {
      puVar2 = (undefined8 *)(auVar37._8_8_ + uVar7 * 0x200);
      func_0x002ec014(puVar2);
      uVar25 = puVar2[1];
      uVar21 = *puVar2;
      uVar30 = puVar2[3];
      uVar26 = puVar2[2];
      sVar9 = (short)((ulong)uVar25 >> 0x10);
      sVar11 = (short)((ulong)uVar25 >> 0x20);
      sVar13 = (short)((ulong)uVar25 >> 0x30);
      sVar15 = (short)((ulong)uVar21 >> 0x10);
      sVar16 = (short)((ulong)uVar21 >> 0x20);
      sVar17 = (short)((ulong)uVar21 >> 0x30);
      sVar10 = (short)((ulong)uVar30 >> 0x10);
      sVar12 = (short)((ulong)uVar30 >> 0x20);
      sVar14 = (short)((ulong)uVar30 >> 0x30);
      uVar4 = puVar2[5];
      sVar27 = (short)((ulong)uVar4 >> 0x10);
      sVar28 = (short)((ulong)uVar4 >> 0x20);
      sVar29 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar2[4];
      sVar22 = (short)((ulong)uVar3 >> 0x10);
      sVar23 = (short)((ulong)uVar3 >> 0x20);
      sVar24 = (short)((ulong)uVar3 >> 0x30);
      uVar6 = puVar2[7];
      sVar34 = (short)((ulong)uVar6 >> 0x10);
      sVar35 = (short)((ulong)uVar6 >> 0x20);
      sVar36 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar2[6];
      sVar31 = (short)((ulong)uVar5 >> 0x10);
      sVar32 = (short)((ulong)uVar5 >> 0x20);
      sVar33 = (short)((ulong)uVar5 >> 0x30);
      sVar18 = (short)((ulong)uVar26 >> 0x10);
      sVar19 = (short)((ulong)uVar26 >> 0x20);
      sVar20 = (short)((ulong)uVar26 >> 0x30);
      puVar2[1] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                             (short)uVar25 +
                                             (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      *puVar2 = CONCAT26(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                         CONCAT24(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                  CONCAT22(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                           (short)uVar21 +
                                           (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                           -0xd01)));
      puVar2[3] = CONCAT26(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                      -0xd01,
                                             (short)uVar30 +
                                             (short)((short)uVar30 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      puVar2[2] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                      -0xd01,
                                             (short)uVar26 +
                                             (short)((short)uVar26 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      puVar2[5] = CONCAT26(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000
                                                  ) >> 0x10),
                           CONCAT24(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                           0xd010000) >> 0x10),
                                    CONCAT22(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000 >>
                                                                     0x1a) * 0xd010000) >> 0x10),
                                             (short)uVar4 -
                                             (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                            0x1a) * 0xd010000) >> 0x10))));
      puVar2[4] = CONCAT26(sVar24 - (short)((uint)((sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000
                                                  ) >> 0x10),
                           CONCAT24(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                           0xd010000) >> 0x10),
                                    CONCAT22(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >>
                                                                     0x1a) * 0xd010000) >> 0x10),
                                             (short)uVar3 -
                                             (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                            0x1a) * 0xd010000) >> 0x10))));
      puVar2[7] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000
                                                  ) >> 0x10),
                           CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                           0xd010000) >> 0x10),
                                    CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000 >>
                                                                     0x1a) * 0xd010000) >> 0x10),
                                             (short)uVar6 -
                                             (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                            0x1a) * 0xd010000) >> 0x10))));
      puVar2[6] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000
                                                  ) >> 0x10),
                           CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                           0xd010000) >> 0x10),
                                    CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                     0x1a) * 0xd010000) >> 0x10),
                                             (short)uVar5 -
                                             (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                            0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar2[9];
      sVar18 = (short)((ulong)uVar4 >> 0x10);
      sVar19 = (short)((ulong)uVar4 >> 0x20);
      sVar20 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar2[8];
      sVar15 = (short)((ulong)uVar3 >> 0x10);
      sVar16 = (short)((ulong)uVar3 >> 0x20);
      sVar17 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0xb];
      uVar21 = puVar2[10];
      uVar30 = puVar2[0xd];
      uVar26 = puVar2[0xc];
      uVar6 = puVar2[0xf];
      sVar34 = (short)((ulong)uVar6 >> 0x10);
      sVar35 = (short)((ulong)uVar6 >> 0x20);
      sVar36 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar2[0xe];
      sVar31 = (short)((ulong)uVar5 >> 0x10);
      sVar32 = (short)((ulong)uVar5 >> 0x20);
      sVar33 = (short)((ulong)uVar5 >> 0x30);
      sVar9 = (short)((ulong)uVar25 >> 0x10);
      sVar11 = (short)((ulong)uVar25 >> 0x20);
      sVar13 = (short)((ulong)uVar25 >> 0x30);
      sVar22 = (short)((ulong)uVar21 >> 0x10);
      sVar23 = (short)((ulong)uVar21 >> 0x20);
      sVar24 = (short)((ulong)uVar21 >> 0x30);
      sVar10 = (short)((ulong)uVar30 >> 0x10);
      sVar12 = (short)((ulong)uVar30 >> 0x20);
      sVar14 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[9] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                      -0xd01,
                                             (short)uVar4 +
                                             (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      puVar2[8] = CONCAT26(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                      -0xd01,
                                             (short)uVar3 +
                                             (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      puVar2[0xb] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,CONCAT22(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[10] = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                            CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                     CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * -0xd01,
                                              (short)uVar21 +
                                              (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                              -0xd01)));
      puVar2[0xd] = CONCAT26(sVar14 - (short)((uint)((sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT24(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      CONCAT22(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
                                               (short)uVar30 -
                                               (short)((uint)(((short)uVar30 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      puVar2[0xc] = CONCAT26(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT24(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      CONCAT22(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
                                               (short)uVar26 -
                                               (short)((uint)(((short)uVar26 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      puVar2[0xf] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
                                               (short)uVar6 -
                                               (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      puVar2[0xe] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
                                               (short)uVar5 -
                                               (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar2[0x11];
      sVar18 = (short)((ulong)uVar4 >> 0x10);
      sVar19 = (short)((ulong)uVar4 >> 0x20);
      sVar20 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar2[0x10];
      sVar15 = (short)((ulong)uVar3 >> 0x10);
      sVar16 = (short)((ulong)uVar3 >> 0x20);
      sVar17 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x13];
      uVar21 = puVar2[0x12];
      uVar30 = puVar2[0x15];
      uVar26 = puVar2[0x14];
      uVar6 = puVar2[0x17];
      sVar34 = (short)((ulong)uVar6 >> 0x10);
      sVar35 = (short)((ulong)uVar6 >> 0x20);
      sVar36 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar2[0x16];
      sVar31 = (short)((ulong)uVar5 >> 0x10);
      sVar32 = (short)((ulong)uVar5 >> 0x20);
      sVar33 = (short)((ulong)uVar5 >> 0x30);
      sVar9 = (short)((ulong)uVar25 >> 0x10);
      sVar11 = (short)((ulong)uVar25 >> 0x20);
      sVar13 = (short)((ulong)uVar25 >> 0x30);
      sVar22 = (short)((ulong)uVar21 >> 0x10);
      sVar23 = (short)((ulong)uVar21 >> 0x20);
      sVar24 = (short)((ulong)uVar21 >> 0x30);
      sVar10 = (short)((ulong)uVar30 >> 0x10);
      sVar12 = (short)((ulong)uVar30 >> 0x20);
      sVar14 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x11] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar4 +
                                                (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x10] = CONCAT26(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x13] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x12] = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar21 +
                                                (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x15] = CONCAT26(sVar14 - (short)((uint)((sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar30 -
                                                (short)((uint)(((short)uVar30 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x14] = CONCAT26(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar26 -
                                                (short)((uint)(((short)uVar26 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x17] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar6 -
                                                (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x16] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar5 -
                                                (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar2[0x19];
      sVar18 = (short)((ulong)uVar4 >> 0x10);
      sVar19 = (short)((ulong)uVar4 >> 0x20);
      sVar20 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar2[0x18];
      sVar15 = (short)((ulong)uVar3 >> 0x10);
      sVar16 = (short)((ulong)uVar3 >> 0x20);
      sVar17 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x1b];
      uVar21 = puVar2[0x1a];
      uVar30 = puVar2[0x1d];
      uVar26 = puVar2[0x1c];
      uVar6 = puVar2[0x1f];
      sVar34 = (short)((ulong)uVar6 >> 0x10);
      sVar35 = (short)((ulong)uVar6 >> 0x20);
      sVar36 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar2[0x1e];
      sVar31 = (short)((ulong)uVar5 >> 0x10);
      sVar32 = (short)((ulong)uVar5 >> 0x20);
      sVar33 = (short)((ulong)uVar5 >> 0x30);
      sVar9 = (short)((ulong)uVar25 >> 0x10);
      sVar11 = (short)((ulong)uVar25 >> 0x20);
      sVar13 = (short)((ulong)uVar25 >> 0x30);
      sVar22 = (short)((ulong)uVar21 >> 0x10);
      sVar23 = (short)((ulong)uVar21 >> 0x20);
      sVar24 = (short)((ulong)uVar21 >> 0x30);
      sVar10 = (short)((ulong)uVar30 >> 0x10);
      sVar12 = (short)((ulong)uVar30 >> 0x20);
      sVar14 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x19] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar4 +
                                                (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x18] = CONCAT26(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x1b] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x1a] = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar21 +
                                                (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x1d] = CONCAT26(sVar14 - (short)((uint)((sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar30 -
                                                (short)((uint)(((short)uVar30 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x1c] = CONCAT26(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar26 -
                                                (short)((uint)(((short)uVar26 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x1f] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar6 -
                                                (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x1e] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar5 -
                                                (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar2[0x21];
      sVar18 = (short)((ulong)uVar4 >> 0x10);
      sVar19 = (short)((ulong)uVar4 >> 0x20);
      sVar20 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar2[0x20];
      sVar15 = (short)((ulong)uVar3 >> 0x10);
      sVar16 = (short)((ulong)uVar3 >> 0x20);
      sVar17 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x23];
      uVar21 = puVar2[0x22];
      uVar30 = puVar2[0x25];
      uVar26 = puVar2[0x24];
      uVar6 = puVar2[0x27];
      sVar34 = (short)((ulong)uVar6 >> 0x10);
      sVar35 = (short)((ulong)uVar6 >> 0x20);
      sVar36 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar2[0x26];
      sVar31 = (short)((ulong)uVar5 >> 0x10);
      sVar32 = (short)((ulong)uVar5 >> 0x20);
      sVar33 = (short)((ulong)uVar5 >> 0x30);
      sVar9 = (short)((ulong)uVar25 >> 0x10);
      sVar11 = (short)((ulong)uVar25 >> 0x20);
      sVar13 = (short)((ulong)uVar25 >> 0x30);
      sVar22 = (short)((ulong)uVar21 >> 0x10);
      sVar23 = (short)((ulong)uVar21 >> 0x20);
      sVar24 = (short)((ulong)uVar21 >> 0x30);
      sVar10 = (short)((ulong)uVar30 >> 0x10);
      sVar12 = (short)((ulong)uVar30 >> 0x20);
      sVar14 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x21] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar4 +
                                                (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x20] = CONCAT26(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x23] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x22] = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar21 +
                                                (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x25] = CONCAT26(sVar14 - (short)((uint)((sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar30 -
                                                (short)((uint)(((short)uVar30 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x24] = CONCAT26(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar26 -
                                                (short)((uint)(((short)uVar26 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x27] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar6 -
                                                (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x26] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar5 -
                                                (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar2[0x29];
      sVar18 = (short)((ulong)uVar4 >> 0x10);
      sVar19 = (short)((ulong)uVar4 >> 0x20);
      sVar20 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar2[0x28];
      sVar15 = (short)((ulong)uVar3 >> 0x10);
      sVar16 = (short)((ulong)uVar3 >> 0x20);
      sVar17 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x2b];
      uVar21 = puVar2[0x2a];
      uVar30 = puVar2[0x2d];
      uVar26 = puVar2[0x2c];
      uVar6 = puVar2[0x2f];
      sVar34 = (short)((ulong)uVar6 >> 0x10);
      sVar35 = (short)((ulong)uVar6 >> 0x20);
      sVar36 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar2[0x2e];
      sVar31 = (short)((ulong)uVar5 >> 0x10);
      sVar32 = (short)((ulong)uVar5 >> 0x20);
      sVar33 = (short)((ulong)uVar5 >> 0x30);
      sVar9 = (short)((ulong)uVar25 >> 0x10);
      sVar11 = (short)((ulong)uVar25 >> 0x20);
      sVar13 = (short)((ulong)uVar25 >> 0x30);
      sVar22 = (short)((ulong)uVar21 >> 0x10);
      sVar23 = (short)((ulong)uVar21 >> 0x20);
      sVar24 = (short)((ulong)uVar21 >> 0x30);
      sVar10 = (short)((ulong)uVar30 >> 0x10);
      sVar12 = (short)((ulong)uVar30 >> 0x20);
      sVar14 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x29] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar4 +
                                                (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x28] = CONCAT26(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x2b] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x2a] = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar21 +
                                                (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x2d] = CONCAT26(sVar14 - (short)((uint)((sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar30 -
                                                (short)((uint)(((short)uVar30 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x2c] = CONCAT26(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar26 -
                                                (short)((uint)(((short)uVar26 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x2f] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar6 -
                                                (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x2e] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar5 -
                                                (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar2[0x31];
      sVar18 = (short)((ulong)uVar4 >> 0x10);
      sVar19 = (short)((ulong)uVar4 >> 0x20);
      sVar20 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar2[0x30];
      sVar15 = (short)((ulong)uVar3 >> 0x10);
      sVar16 = (short)((ulong)uVar3 >> 0x20);
      sVar17 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x33];
      uVar21 = puVar2[0x32];
      uVar30 = puVar2[0x35];
      uVar26 = puVar2[0x34];
      uVar6 = puVar2[0x37];
      sVar34 = (short)((ulong)uVar6 >> 0x10);
      sVar35 = (short)((ulong)uVar6 >> 0x20);
      sVar36 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar2[0x36];
      sVar31 = (short)((ulong)uVar5 >> 0x10);
      sVar32 = (short)((ulong)uVar5 >> 0x20);
      sVar33 = (short)((ulong)uVar5 >> 0x30);
      sVar9 = (short)((ulong)uVar25 >> 0x10);
      sVar11 = (short)((ulong)uVar25 >> 0x20);
      sVar13 = (short)((ulong)uVar25 >> 0x30);
      sVar22 = (short)((ulong)uVar21 >> 0x10);
      sVar23 = (short)((ulong)uVar21 >> 0x20);
      sVar24 = (short)((ulong)uVar21 >> 0x30);
      sVar10 = (short)((ulong)uVar30 >> 0x10);
      sVar12 = (short)((ulong)uVar30 >> 0x20);
      sVar14 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x31] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar4 +
                                                (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x30] = CONCAT26(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x33] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x32] = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar21 +
                                                (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x35] = CONCAT26(sVar14 - (short)((uint)((sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar30 -
                                                (short)((uint)(((short)uVar30 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x34] = CONCAT26(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar26 -
                                                (short)((uint)(((short)uVar26 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x37] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar6 -
                                                (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x36] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar5 -
                                                (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar2[0x39];
      sVar18 = (short)((ulong)uVar4 >> 0x10);
      sVar19 = (short)((ulong)uVar4 >> 0x20);
      sVar20 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar2[0x38];
      sVar15 = (short)((ulong)uVar3 >> 0x10);
      sVar16 = (short)((ulong)uVar3 >> 0x20);
      sVar17 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x3b];
      uVar21 = puVar2[0x3a];
      uVar30 = puVar2[0x3d];
      uVar26 = puVar2[0x3c];
      uVar6 = puVar2[0x3f];
      sVar34 = (short)((ulong)uVar6 >> 0x10);
      sVar35 = (short)((ulong)uVar6 >> 0x20);
      sVar36 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar2[0x3e];
      sVar31 = (short)((ulong)uVar5 >> 0x10);
      sVar32 = (short)((ulong)uVar5 >> 0x20);
      sVar33 = (short)((ulong)uVar5 >> 0x30);
      sVar9 = (short)((ulong)uVar25 >> 0x10);
      sVar11 = (short)((ulong)uVar25 >> 0x20);
      sVar13 = (short)((ulong)uVar25 >> 0x30);
      sVar22 = (short)((ulong)uVar21 >> 0x10);
      sVar23 = (short)((ulong)uVar21 >> 0x20);
      sVar24 = (short)((ulong)uVar21 >> 0x30);
      sVar10 = (short)((ulong)uVar30 >> 0x10);
      sVar12 = (short)((ulong)uVar30 >> 0x20);
      sVar14 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x39] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar4 +
                                                (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x38] = CONCAT26(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x3b] = CONCAT26(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x3a] = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar21 +
                                                (short)((short)uVar21 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x3d] = CONCAT26(sVar14 - (short)((uint)((sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar30 -
                                                (short)((uint)(((short)uVar30 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x3c] = CONCAT26(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar28 - (short)((uint)((sVar28 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar27 - (short)((uint)((sVar27 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar26 -
                                                (short)((uint)(((short)uVar26 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x3f] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar6 -
                                                (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x3e] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar5 -
                                                (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      bVar1 = uVar8 < *auVar37._0_8_;
      uVar7 = uVar8;
      uVar8 = (ulong)((int)uVar8 + 1);
    } while (bVar1);
  }
  return;
}

