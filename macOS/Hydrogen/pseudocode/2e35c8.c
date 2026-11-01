
void FUN_002e35c8(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
                 undefined1 param_5)

{
  bool bVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x29;
  short sVar7;
  short sVar8;
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
  short sVar21;
  short sVar22;
  undefined8 uVar19;
  undefined8 uVar20;
  short sVar23;
  undefined8 uVar24;
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
  
  *(undefined8 *)(unaff_x29 + -0x28) = *param_1;
  uVar3 = *param_4;
  uVar24 = param_4[3];
  uVar19 = param_4[2];
  *(undefined8 *)(unaff_x29 + -0x48) = param_4[1];
  *(undefined8 *)(unaff_x29 + -0x50) = uVar3;
  *(undefined8 *)(unaff_x29 + -0x38) = uVar24;
  *(undefined8 *)(unaff_x29 + -0x40) = uVar19;
  *(undefined1 *)(unaff_x29 + -0x30) = param_5;
  func_0x002f23b0(unaff_x29 + -0x50,0x21);
  func_0x002df560();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  auVar37 = ___stack_chk_fail();
  if (*auVar37._0_8_ != 0) {
    uVar5 = 0;
    uVar6 = 1;
    do {
      puVar2 = (undefined8 *)(auVar37._8_8_ + uVar5 * 0x200);
      func_0x002ec014(puVar2);
      uVar25 = puVar2[1];
      uVar20 = *puVar2;
      uVar30 = puVar2[3];
      uVar26 = puVar2[2];
      sVar7 = (short)((ulong)uVar25 >> 0x10);
      sVar9 = (short)((ulong)uVar25 >> 0x20);
      sVar11 = (short)((ulong)uVar25 >> 0x30);
      sVar13 = (short)((ulong)uVar20 >> 0x10);
      sVar14 = (short)((ulong)uVar20 >> 0x20);
      sVar15 = (short)((ulong)uVar20 >> 0x30);
      sVar8 = (short)((ulong)uVar30 >> 0x10);
      sVar10 = (short)((ulong)uVar30 >> 0x20);
      sVar12 = (short)((ulong)uVar30 >> 0x30);
      uVar19 = puVar2[5];
      sVar27 = (short)((ulong)uVar19 >> 0x10);
      sVar28 = (short)((ulong)uVar19 >> 0x20);
      sVar29 = (short)((ulong)uVar19 >> 0x30);
      uVar3 = puVar2[4];
      sVar21 = (short)((ulong)uVar3 >> 0x10);
      sVar22 = (short)((ulong)uVar3 >> 0x20);
      sVar23 = (short)((ulong)uVar3 >> 0x30);
      uVar4 = puVar2[7];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar24 = puVar2[6];
      sVar31 = (short)((ulong)uVar24 >> 0x10);
      sVar32 = (short)((ulong)uVar24 >> 0x20);
      sVar33 = (short)((ulong)uVar24 >> 0x30);
      sVar16 = (short)((ulong)uVar26 >> 0x10);
      sVar17 = (short)((ulong)uVar26 >> 0x20);
      sVar18 = (short)((ulong)uVar26 >> 0x30);
      puVar2[1] = CONCAT26(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar7 + (short)(sVar7 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                             (short)uVar25 +
                                             (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      *puVar2 = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                         CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                  CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    -0xd01,
                                           (short)uVar20 +
                                           (short)((short)uVar20 * 0x4ebf + 0x2000000 >> 0x1a) *
                                           -0xd01)));
      puVar2[3] = CONCAT26(sVar12 + (short)(sVar12 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar10 + (short)(sVar10 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar8 + (short)(sVar8 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                             (short)uVar30 +
                                             (short)((short)uVar30 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      puVar2[2] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
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
                                             (short)uVar19 -
                                             (short)((uint)(((short)uVar19 * 0x4ebf + 0x2000000 >>
                                                            0x1a) * 0xd010000) >> 0x10))));
      puVar2[4] = CONCAT26(sVar23 - (short)((uint)((sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000
                                                  ) >> 0x10),
                           CONCAT24(sVar22 - (short)((uint)((sVar22 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                           0xd010000) >> 0x10),
                                    CONCAT22(sVar21 - (short)((uint)((sVar21 * 0x4ebf + 0x2000000 >>
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
                                             (short)uVar4 -
                                             (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                            0x1a) * 0xd010000) >> 0x10))));
      puVar2[6] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000
                                                  ) >> 0x10),
                           CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                           0xd010000) >> 0x10),
                                    CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >>
                                                                     0x1a) * 0xd010000) >> 0x10),
                                             (short)uVar24 -
                                             (short)((uint)(((short)uVar24 * 0x4ebf + 0x2000000 >>
                                                            0x1a) * 0xd010000) >> 0x10))));
      uVar19 = puVar2[9];
      sVar16 = (short)((ulong)uVar19 >> 0x10);
      sVar17 = (short)((ulong)uVar19 >> 0x20);
      sVar18 = (short)((ulong)uVar19 >> 0x30);
      uVar3 = puVar2[8];
      sVar13 = (short)((ulong)uVar3 >> 0x10);
      sVar14 = (short)((ulong)uVar3 >> 0x20);
      sVar15 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0xb];
      uVar20 = puVar2[10];
      uVar30 = puVar2[0xd];
      uVar26 = puVar2[0xc];
      uVar4 = puVar2[0xf];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar24 = puVar2[0xe];
      sVar31 = (short)((ulong)uVar24 >> 0x10);
      sVar32 = (short)((ulong)uVar24 >> 0x20);
      sVar33 = (short)((ulong)uVar24 >> 0x30);
      sVar7 = (short)((ulong)uVar25 >> 0x10);
      sVar9 = (short)((ulong)uVar25 >> 0x20);
      sVar11 = (short)((ulong)uVar25 >> 0x30);
      sVar21 = (short)((ulong)uVar20 >> 0x10);
      sVar22 = (short)((ulong)uVar20 >> 0x20);
      sVar23 = (short)((ulong)uVar20 >> 0x30);
      sVar8 = (short)((ulong)uVar30 >> 0x10);
      sVar10 = (short)((ulong)uVar30 >> 0x20);
      sVar12 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[9] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                      -0xd01,
                                             (short)uVar19 +
                                             (short)((short)uVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      puVar2[8] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                           CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                    CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                      -0xd01,
                                             (short)uVar3 +
                                             (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                             -0xd01)));
      puVar2[0xb] = CONCAT26(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                      CONCAT22(sVar7 + (short)(sVar7 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                       -0xd01,
                                               (short)uVar25 +
                                               (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a) *
                                               -0xd01)));
      puVar2[10] = CONCAT26(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                            CONCAT24(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                     CONCAT22(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * -0xd01,
                                              (short)uVar20 +
                                              (short)((short)uVar20 * 0x4ebf + 0x2000000 >> 0x1a) *
                                              -0xd01)));
      puVar2[0xd] = CONCAT26(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT24(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      CONCAT22(sVar8 - (short)((uint)((sVar8 * 0x4ebf + 0x2000000 >>
                                                                      0x1a) * 0xd010000) >> 0x10),
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
                                               (short)uVar4 -
                                               (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      puVar2[0xe] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
                                               (short)uVar24 -
                                               (short)((uint)(((short)uVar24 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      uVar19 = puVar2[0x11];
      sVar16 = (short)((ulong)uVar19 >> 0x10);
      sVar17 = (short)((ulong)uVar19 >> 0x20);
      sVar18 = (short)((ulong)uVar19 >> 0x30);
      uVar3 = puVar2[0x10];
      sVar13 = (short)((ulong)uVar3 >> 0x10);
      sVar14 = (short)((ulong)uVar3 >> 0x20);
      sVar15 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x13];
      uVar20 = puVar2[0x12];
      uVar30 = puVar2[0x15];
      uVar26 = puVar2[0x14];
      uVar4 = puVar2[0x17];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar24 = puVar2[0x16];
      sVar31 = (short)((ulong)uVar24 >> 0x10);
      sVar32 = (short)((ulong)uVar24 >> 0x20);
      sVar33 = (short)((ulong)uVar24 >> 0x30);
      sVar7 = (short)((ulong)uVar25 >> 0x10);
      sVar9 = (short)((ulong)uVar25 >> 0x20);
      sVar11 = (short)((ulong)uVar25 >> 0x30);
      sVar21 = (short)((ulong)uVar20 >> 0x10);
      sVar22 = (short)((ulong)uVar20 >> 0x20);
      sVar23 = (short)((ulong)uVar20 >> 0x30);
      sVar8 = (short)((ulong)uVar30 >> 0x10);
      sVar10 = (short)((ulong)uVar30 >> 0x20);
      sVar12 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x11] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar19 +
                                                (short)((short)uVar19 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x10] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x13] = CONCAT26(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                       CONCAT22(sVar7 + (short)(sVar7 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x12] = CONCAT26(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar20 +
                                                (short)((short)uVar20 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x15] = CONCAT26(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar8 - (short)((uint)((sVar8 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
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
                                                (short)uVar4 -
                                                (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x16] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar24 -
                                                (short)((uint)(((short)uVar24 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      uVar19 = puVar2[0x19];
      sVar16 = (short)((ulong)uVar19 >> 0x10);
      sVar17 = (short)((ulong)uVar19 >> 0x20);
      sVar18 = (short)((ulong)uVar19 >> 0x30);
      uVar3 = puVar2[0x18];
      sVar13 = (short)((ulong)uVar3 >> 0x10);
      sVar14 = (short)((ulong)uVar3 >> 0x20);
      sVar15 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x1b];
      uVar20 = puVar2[0x1a];
      uVar30 = puVar2[0x1d];
      uVar26 = puVar2[0x1c];
      uVar4 = puVar2[0x1f];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar24 = puVar2[0x1e];
      sVar31 = (short)((ulong)uVar24 >> 0x10);
      sVar32 = (short)((ulong)uVar24 >> 0x20);
      sVar33 = (short)((ulong)uVar24 >> 0x30);
      sVar7 = (short)((ulong)uVar25 >> 0x10);
      sVar9 = (short)((ulong)uVar25 >> 0x20);
      sVar11 = (short)((ulong)uVar25 >> 0x30);
      sVar21 = (short)((ulong)uVar20 >> 0x10);
      sVar22 = (short)((ulong)uVar20 >> 0x20);
      sVar23 = (short)((ulong)uVar20 >> 0x30);
      sVar8 = (short)((ulong)uVar30 >> 0x10);
      sVar10 = (short)((ulong)uVar30 >> 0x20);
      sVar12 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x19] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar19 +
                                                (short)((short)uVar19 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x18] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x1b] = CONCAT26(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                       CONCAT22(sVar7 + (short)(sVar7 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x1a] = CONCAT26(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar20 +
                                                (short)((short)uVar20 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x1d] = CONCAT26(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar8 - (short)((uint)((sVar8 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
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
                                                (short)uVar4 -
                                                (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x1e] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar24 -
                                                (short)((uint)(((short)uVar24 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      uVar19 = puVar2[0x21];
      sVar16 = (short)((ulong)uVar19 >> 0x10);
      sVar17 = (short)((ulong)uVar19 >> 0x20);
      sVar18 = (short)((ulong)uVar19 >> 0x30);
      uVar3 = puVar2[0x20];
      sVar13 = (short)((ulong)uVar3 >> 0x10);
      sVar14 = (short)((ulong)uVar3 >> 0x20);
      sVar15 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x23];
      uVar20 = puVar2[0x22];
      uVar30 = puVar2[0x25];
      uVar26 = puVar2[0x24];
      uVar4 = puVar2[0x27];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar24 = puVar2[0x26];
      sVar31 = (short)((ulong)uVar24 >> 0x10);
      sVar32 = (short)((ulong)uVar24 >> 0x20);
      sVar33 = (short)((ulong)uVar24 >> 0x30);
      sVar7 = (short)((ulong)uVar25 >> 0x10);
      sVar9 = (short)((ulong)uVar25 >> 0x20);
      sVar11 = (short)((ulong)uVar25 >> 0x30);
      sVar21 = (short)((ulong)uVar20 >> 0x10);
      sVar22 = (short)((ulong)uVar20 >> 0x20);
      sVar23 = (short)((ulong)uVar20 >> 0x30);
      sVar8 = (short)((ulong)uVar30 >> 0x10);
      sVar10 = (short)((ulong)uVar30 >> 0x20);
      sVar12 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x21] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar19 +
                                                (short)((short)uVar19 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x20] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x23] = CONCAT26(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                       CONCAT22(sVar7 + (short)(sVar7 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x22] = CONCAT26(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar20 +
                                                (short)((short)uVar20 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x25] = CONCAT26(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar8 - (short)((uint)((sVar8 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
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
                                                (short)uVar4 -
                                                (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x26] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar24 -
                                                (short)((uint)(((short)uVar24 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      uVar19 = puVar2[0x29];
      sVar16 = (short)((ulong)uVar19 >> 0x10);
      sVar17 = (short)((ulong)uVar19 >> 0x20);
      sVar18 = (short)((ulong)uVar19 >> 0x30);
      uVar3 = puVar2[0x28];
      sVar13 = (short)((ulong)uVar3 >> 0x10);
      sVar14 = (short)((ulong)uVar3 >> 0x20);
      sVar15 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x2b];
      uVar20 = puVar2[0x2a];
      uVar30 = puVar2[0x2d];
      uVar26 = puVar2[0x2c];
      uVar4 = puVar2[0x2f];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar24 = puVar2[0x2e];
      sVar31 = (short)((ulong)uVar24 >> 0x10);
      sVar32 = (short)((ulong)uVar24 >> 0x20);
      sVar33 = (short)((ulong)uVar24 >> 0x30);
      sVar7 = (short)((ulong)uVar25 >> 0x10);
      sVar9 = (short)((ulong)uVar25 >> 0x20);
      sVar11 = (short)((ulong)uVar25 >> 0x30);
      sVar21 = (short)((ulong)uVar20 >> 0x10);
      sVar22 = (short)((ulong)uVar20 >> 0x20);
      sVar23 = (short)((ulong)uVar20 >> 0x30);
      sVar8 = (short)((ulong)uVar30 >> 0x10);
      sVar10 = (short)((ulong)uVar30 >> 0x20);
      sVar12 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x29] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar19 +
                                                (short)((short)uVar19 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x28] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x2b] = CONCAT26(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                       CONCAT22(sVar7 + (short)(sVar7 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x2a] = CONCAT26(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar20 +
                                                (short)((short)uVar20 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x2d] = CONCAT26(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar8 - (short)((uint)((sVar8 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
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
                                                (short)uVar4 -
                                                (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x2e] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar24 -
                                                (short)((uint)(((short)uVar24 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      uVar19 = puVar2[0x31];
      sVar16 = (short)((ulong)uVar19 >> 0x10);
      sVar17 = (short)((ulong)uVar19 >> 0x20);
      sVar18 = (short)((ulong)uVar19 >> 0x30);
      uVar3 = puVar2[0x30];
      sVar13 = (short)((ulong)uVar3 >> 0x10);
      sVar14 = (short)((ulong)uVar3 >> 0x20);
      sVar15 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x33];
      uVar20 = puVar2[0x32];
      uVar30 = puVar2[0x35];
      uVar26 = puVar2[0x34];
      uVar4 = puVar2[0x37];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar24 = puVar2[0x36];
      sVar31 = (short)((ulong)uVar24 >> 0x10);
      sVar32 = (short)((ulong)uVar24 >> 0x20);
      sVar33 = (short)((ulong)uVar24 >> 0x30);
      sVar7 = (short)((ulong)uVar25 >> 0x10);
      sVar9 = (short)((ulong)uVar25 >> 0x20);
      sVar11 = (short)((ulong)uVar25 >> 0x30);
      sVar21 = (short)((ulong)uVar20 >> 0x10);
      sVar22 = (short)((ulong)uVar20 >> 0x20);
      sVar23 = (short)((ulong)uVar20 >> 0x30);
      sVar8 = (short)((ulong)uVar30 >> 0x10);
      sVar10 = (short)((ulong)uVar30 >> 0x20);
      sVar12 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x31] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar19 +
                                                (short)((short)uVar19 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x30] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x33] = CONCAT26(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                       CONCAT22(sVar7 + (short)(sVar7 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x32] = CONCAT26(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar20 +
                                                (short)((short)uVar20 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x35] = CONCAT26(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar8 - (short)((uint)((sVar8 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
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
                                                (short)uVar4 -
                                                (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x36] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar24 -
                                                (short)((uint)(((short)uVar24 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      uVar19 = puVar2[0x39];
      sVar16 = (short)((ulong)uVar19 >> 0x10);
      sVar17 = (short)((ulong)uVar19 >> 0x20);
      sVar18 = (short)((ulong)uVar19 >> 0x30);
      uVar3 = puVar2[0x38];
      sVar13 = (short)((ulong)uVar3 >> 0x10);
      sVar14 = (short)((ulong)uVar3 >> 0x20);
      sVar15 = (short)((ulong)uVar3 >> 0x30);
      uVar25 = puVar2[0x3b];
      uVar20 = puVar2[0x3a];
      uVar30 = puVar2[0x3d];
      uVar26 = puVar2[0x3c];
      uVar4 = puVar2[0x3f];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar24 = puVar2[0x3e];
      sVar31 = (short)((ulong)uVar24 >> 0x10);
      sVar32 = (short)((ulong)uVar24 >> 0x20);
      sVar33 = (short)((ulong)uVar24 >> 0x30);
      sVar7 = (short)((ulong)uVar25 >> 0x10);
      sVar9 = (short)((ulong)uVar25 >> 0x20);
      sVar11 = (short)((ulong)uVar25 >> 0x30);
      sVar21 = (short)((ulong)uVar20 >> 0x10);
      sVar22 = (short)((ulong)uVar20 >> 0x20);
      sVar23 = (short)((ulong)uVar20 >> 0x30);
      sVar8 = (short)((ulong)uVar30 >> 0x10);
      sVar10 = (short)((ulong)uVar30 >> 0x20);
      sVar12 = (short)((ulong)uVar30 >> 0x30);
      sVar27 = (short)((ulong)uVar26 >> 0x10);
      sVar28 = (short)((ulong)uVar26 >> 0x20);
      sVar29 = (short)((ulong)uVar26 >> 0x30);
      puVar2[0x39] = CONCAT26(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar19 +
                                                (short)((short)uVar19 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x38] = CONCAT26(sVar15 + (short)(sVar15 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar14 + (short)(sVar14 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar13 + (short)(sVar13 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar3 +
                                                (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01)));
      puVar2[0x3b] = CONCAT26(sVar11 + (short)(sVar11 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar9 + (short)(sVar9 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                       CONCAT22(sVar7 + (short)(sVar7 * 0x4ebf + 0x2000000 >> 0x1a)
                                                        * -0xd01,
                                                (short)uVar25 +
                                                (short)((short)uVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x3a] = CONCAT26(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar20 +
                                                (short)((short)uVar20 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar2[0x3d] = CONCAT26(sVar12 - (short)((uint)((sVar12 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar10 - (short)((uint)((sVar10 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar8 - (short)((uint)((sVar8 * 0x4ebf + 0x2000000
                                                                       >> 0x1a) * 0xd010000) >> 0x10
                                                               ),
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
                                                (short)uVar4 -
                                                (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar2[0x3e] = CONCAT26(sVar33 - (short)((uint)((sVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar32 - (short)((uint)((sVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar24 -
                                                (short)((uint)(((short)uVar24 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      bVar1 = uVar6 < *auVar37._0_8_;
      uVar5 = uVar6;
      uVar6 = (ulong)((int)uVar6 + 1);
    } while (bVar1);
  }
  return;
}

