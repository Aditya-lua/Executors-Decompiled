
void FUN_0036454c(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],undefined1 param_8 [16],byte *param_9,long param_10)

{
  unkbyte10 *pVar1;
  unkbyte10 *pVar2;
  undefined1 (*pauVar3) [16];
  int iVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined4 uVar14;
  undefined6 uVar15;
  short sVar16;
  undefined4 uVar17;
  undefined6 uVar18;
  uint3 uVar19;
  short sVar20;
  uint5 uVar21;
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  byte bVar33;
  short sVar34;
  short sVar35;
  short sVar36;
  short sVar37;
  short sVar38;
  short sVar39;
  short sVar40;
  uint7 uVar41;
  ulong uVar42;
  undefined8 uVar43;
  undefined8 uVar44;
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  uint7 uVar48;
  int iVar50;
  int iVar51;
  undefined1 auVar49 [16];
  undefined1 auVar52 [16];
  undefined8 uVar53;
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  short sVar59;
  short sVar60;
  undefined2 uVar61;
  undefined2 uVar62;
  undefined1 auVar63 [16];
  undefined1 auVar64 [16];
  undefined2 uVar65;
  undefined2 uVar66;
  undefined2 uVar67;
  undefined1 auVar68 [16];
  ulong uVar69;
  undefined1 in_q16 [16];
  undefined1 auVar70 [16];
  undefined1 auVar71 [16];
  undefined1 in_q20 [16];
  undefined1 auVar72 [16];
  uint7 uVar73;
  undefined1 in_q21 [16];
  undefined1 auVar74 [16];
  undefined1 auVar75 [16];
  undefined1 in_q22 [16];
  undefined1 in_q23 [16];
  undefined1 auVar76 [16];
  undefined8 in_d24;
  undefined8 in_register_00005308;
  undefined1 auVar77 [16];
  undefined1 auVar78 [16];
  undefined1 auVar79 [16];
  undefined1 auVar80 [16];
  undefined1 auVar81 [16];
  undefined1 auVar82 [16];
  undefined8 uVar83;
  undefined1 in_stack_000000f0 [16];
  undefined1 in_stack_00000100 [16];
  undefined1 in_stack_00000110 [16];
  
  iVar6 = param_2._0_4_;
  iVar7 = param_2._4_4_;
  iVar8 = param_2._8_4_;
  iVar9 = param_2._12_4_;
  iVar5 = param_1._8_4_;
  iVar4 = param_1._0_4_;
  iVar50 = param_1._4_4_;
  iVar51 = param_1._12_4_;
  bVar33 = (byte)((uint)(param_3._0_4_ + param_4._0_4_ * iVar6) >> 0x15);
  uVar42 = CONCAT17((char)((uint)(iVar51 + param_8._12_4_ * iVar9) >> 0x15),
                    CONCAT16((char)((uint)(iVar5 + param_8._8_4_ * iVar8) >> 0x15),
                             CONCAT15((char)((uint)(iVar50 + param_8._4_4_ * iVar7) >> 0x15),
                                      CONCAT14((char)((uint)(iVar4 + param_8._0_4_ * iVar6) >> 0x15)
                                               ,CONCAT13((char)((uint)(param_3._12_4_ +
                                                                      param_4._12_4_ * iVar9) >>
                                                               0x15),
                                                         CONCAT12((char)((uint)(param_3._8_4_ +
                                                                               param_4._8_4_ * iVar8
                                                                               ) >> 0x15),
                                                                  CONCAT11((char)((uint)(param_3.
                                                  _4_4_ + param_4._4_4_ * iVar7) >> 0x15),bVar33))))
                                     ))) & 0x8080808080808080;
  param_9[8] = param_6[8] | (byte)(in_q16._2_2_ >> 5) & 0x80 | param_5[8];
  param_9[9] = param_6[9] | (byte)(in_q16._6_2_ >> 5) & 0x80 | param_5[9];
  param_9[10] = param_6[10] | (byte)(in_q16._10_2_ >> 5) & 0x80 | param_5[10];
  param_9[0xb] = param_6[0xb] | (byte)(in_q16._14_2_ >> 5) & 0x80 | param_5[0xb];
  param_9[0xc] = param_6[0xc] | (byte)(param_7._2_2_ >> 5) & 0x80 | param_5[0xc];
  param_9[0xd] = param_6[0xd] | (byte)(param_7._6_2_ >> 5) & 0x80 | param_5[0xd];
  param_9[0xe] = param_6[0xe] | (byte)(param_7._10_2_ >> 5) & 0x80 | param_5[0xe];
  param_9[0xf] = param_6[0xf] | (byte)(param_7._14_2_ >> 5) & 0x80 | param_5[0xf];
  *param_9 = param_6[0] | bVar33 & 0x80 | param_5[0];
  param_9[1] = param_6[1] | (byte)(uVar42 >> 8) | param_5[1];
  param_9[2] = param_6[2] | (byte)(uVar42 >> 0x10) | param_5[2];
  param_9[3] = param_6[3] | (byte)(uVar42 >> 0x18) | param_5[3];
  param_9[4] = param_6[4] | (byte)(uVar42 >> 0x20) | param_5[4];
  param_9[5] = param_6[5] | (byte)(uVar42 >> 0x28) | param_5[5];
  param_9[6] = param_6[6] | (byte)(uVar42 >> 0x30) | param_5[6];
  param_9[7] = param_6[7] | (byte)(uVar42 >> 0x38) | param_5[7];
  *(undefined8 *)(param_9 + 0x18) = in_register_00005308;
  *(undefined8 *)(param_9 + 0x10) = in_d24;
  auVar22 = *(undefined1 (*) [16])(param_10 + 0x180);
  auVar23 = *(undefined1 (*) [16])(param_10 + 400);
  auVar24 = *(undefined1 (*) [16])(param_10 + 0x1a0);
  auVar25 = *(undefined1 (*) [16])(param_10 + 0x1b0);
  auVar26 = *(undefined1 (*) [16])(param_10 + 0x1c0);
  auVar27 = *(undefined1 (*) [16])(param_10 + 0x1d0);
  auVar28 = *(undefined1 (*) [16])(param_10 + 0x1e0);
  auVar29 = *(undefined1 (*) [16])(param_10 + 0x1f0);
  auVar70._6_10_ = in_q16._6_10_;
  auVar70._4_2_ = auVar24._2_2_;
  auVar70._2_2_ = auVar25._0_2_;
  auVar70._0_2_ = auVar24._0_2_;
  uVar43 = NEON_ext(auVar24._0_8_,CONCAT26(auVar25._2_2_,auVar70._0_6_),4,1);
  uVar44 = NEON_ext(auVar28._0_8_,
                    CONCAT17(auVar29[3],
                             CONCAT16(auVar29[2],
                                      CONCAT15(auVar28[3],
                                               CONCAT14(auVar28[2],
                                                        CONCAT13(auVar29[1],
                                                                 CONCAT12(auVar29[0],auVar28._0_2_))
                                                       )))),4,1);
  auVar70 = *(undefined1 (*) [16])(param_10 + 0x100);
  auVar30 = *(undefined1 (*) [16])(param_10 + 0x110);
  auVar31 = *(undefined1 (*) [16])(param_10 + 0x120);
  auVar32 = *(undefined1 (*) [16])(param_10 + 0x130);
  auVar74._6_10_ = in_q21._6_10_;
  auVar74._4_2_ = auVar31._2_2_;
  auVar74._2_2_ = auVar32._0_2_;
  auVar74._0_2_ = auVar31._0_2_;
  uVar53 = NEON_ext(auVar31._0_8_,CONCAT26(auVar32._2_2_,auVar74._0_6_),4,1);
  pVar1 = (unkbyte10 *)(param_10 + 0x140);
  uVar13 = *(undefined8 *)(param_10 + 0x148);
  uVar65 = (undefined2)((ulong)uVar13 >> 0x10);
  uVar66 = (undefined2)((ulong)uVar13 >> 0x20);
  uVar67 = (undefined2)((ulong)uVar13 >> 0x30);
  uVar12 = *(undefined8 *)pVar1;
  auVar74 = *(undefined1 (*) [16])(param_10 + 0x150);
  pVar2 = (unkbyte10 *)(param_10 + 0x160);
  uVar10 = *(undefined8 *)(param_10 + 0x168);
  sVar60 = (short)((ulong)uVar10 >> 0x10);
  uVar61 = (undefined2)((ulong)uVar10 >> 0x20);
  uVar62 = (undefined2)((ulong)uVar10 >> 0x30);
  uVar10 = *(undefined8 *)pVar2;
  sVar59 = (short)((ulong)uVar10 >> 0x10);
  pauVar3 = (undefined1 (*) [16])(param_10 + 0x170);
  uVar11 = *(undefined8 *)*pauVar3;
  sVar40 = (short)((ulong)uVar11 >> 0x10);
  uVar83 = NEON_ext(uVar10,CONCAT26(sVar40,CONCAT24(sVar59,CONCAT22((short)uVar11,(short)uVar10))),4
                    ,1);
  uVar14 = CONCAT13(auVar30[3],CONCAT12(auVar30[2],auVar70._2_2_));
  uVar15 = CONCAT15(auVar31[3],CONCAT14(auVar31[2],uVar14));
  auVar45 = a64_TBL(ZEXT816(0),auVar24,auVar25,in_stack_00000100);
  auVar46 = a64_TBL(ZEXT816(0),auVar28,auVar29,in_stack_00000100);
  auVar47 = a64_TBL(ZEXT816(0),auVar31,auVar32,in_stack_00000100);
  auVar54 = a64_TBL(ZEXT816(0),auVar22,auVar23,in_stack_000000f0);
  auVar52 = a64_TBL(ZEXT816(0),auVar22,auVar23,in_q20);
  auVar57 = a64_TBL(ZEXT816(0),auVar22,auVar23,in_q23);
  auVar58 = a64_TBL(ZEXT816(0),auVar26,auVar27,in_stack_000000f0);
  auVar49 = a64_TBL(ZEXT816(0),auVar26,auVar27,in_q20);
  auVar81 = a64_TBL(ZEXT816(0),auVar26,auVar27,in_q23);
  auVar82 = a64_TBL(ZEXT816(0),auVar70,auVar30,in_stack_000000f0);
  auVar55 = a64_TBL(ZEXT816(0),auVar70,auVar30,in_q20);
  auVar63 = a64_TBL(ZEXT816(0),auVar70,auVar30,in_q23);
  auVar64._10_2_ = uVar65;
  auVar64._0_10_ = *pVar1;
  auVar64._12_2_ = uVar66;
  auVar64._14_2_ = uVar67;
  auVar64 = a64_TBL(ZEXT816(0),auVar64,auVar74,in_stack_000000f0);
  auVar68._10_2_ = uVar65;
  auVar68._0_10_ = *pVar1;
  auVar68._12_2_ = uVar66;
  auVar68._14_2_ = uVar67;
  auVar72 = a64_TBL(ZEXT816(0),auVar68,auVar74,in_q20);
  auVar71._10_2_ = uVar65;
  auVar71._0_10_ = *pVar1;
  auVar71._12_2_ = uVar66;
  auVar71._14_2_ = uVar67;
  auVar76 = a64_TBL(ZEXT816(0),auVar71,auVar74,in_q23);
  auVar56._10_2_ = sVar60;
  auVar56._0_10_ = *pVar2;
  auVar56._12_2_ = uVar61;
  auVar56._14_2_ = uVar62;
  auVar68 = a64_TBL(ZEXT816(0),auVar56,*pauVar3,in_stack_00000100);
  sVar20 = auVar22._8_2_;
  uVar17 = CONCAT13(auVar23[9],CONCAT12(auVar23[8],sVar20));
  uVar18 = CONCAT15(auVar45[5],CONCAT14(auVar45[4],uVar17));
  sVar34 = (short)((uint)uVar17 >> 0x10);
  sVar36 = (short)((uint6)uVar18 >> 0x20);
  sVar38 = (short)(CONCAT17(auVar45[7],CONCAT16(auVar45[6],uVar18)) >> 0x30);
  sVar16 = auVar26._8_2_;
  uVar17 = CONCAT13(auVar27[9],CONCAT12(auVar27[8],sVar16));
  uVar18 = CONCAT15(auVar46[5],CONCAT14(auVar46[4],uVar17));
  sVar35 = (short)((uint)uVar17 >> 0x10);
  sVar37 = (short)((uint6)uVar18 >> 0x20);
  sVar39 = (short)(CONCAT17(auVar46[7],CONCAT16(auVar46[6],uVar18)) >> 0x30);
  auVar71 = a64_TBL(ZEXT816(0),auVar24,auVar25,in_stack_00000110);
  auVar77 = a64_TBL(ZEXT816(0),auVar24,auVar25,in_q22);
  auVar78 = a64_TBL(ZEXT816(0),auVar28,auVar29,in_stack_00000110);
  auVar79 = a64_TBL(ZEXT816(0),auVar28,auVar29,in_q22);
  auVar80 = a64_TBL(ZEXT816(0),auVar31,auVar32,in_stack_00000110);
  auVar75 = a64_TBL(ZEXT816(0),auVar31,auVar32,in_q22);
  auVar45._10_2_ = sVar60;
  auVar45._0_10_ = *pVar2;
  auVar45._12_2_ = uVar61;
  auVar45._14_2_ = uVar62;
  auVar56 = a64_TBL(ZEXT816(0),auVar45,*pauVar3,in_stack_00000110);
  auVar46._10_2_ = sVar60;
  auVar46._0_10_ = *pVar2;
  auVar46._12_2_ = uVar61;
  auVar46._14_2_ = uVar62;
  auVar45 = a64_TBL(ZEXT816(0),auVar46,*pauVar3,in_q22);
  uVar41 = CONCAT16((byte)((uint)(iVar5 + sVar59 * iVar8) >> 0x1b),
                    CONCAT15((byte)((uint)(iVar50 + auVar74._2_2_ * iVar7) >> 0x1b),
                             CONCAT14((byte)((uint)(iVar4 + (short)((ulong)uVar12 >> 0x10) * iVar6)
                                            >> 0x1b),
                                      CONCAT13((byte)((uint)(iVar51 + (short)(CONCAT17(auVar32[3],
                                                                                       CONCAT16(
                                                  auVar32[2],uVar15)) >> 0x30) * iVar9) >> 0x1b),
                                               CONCAT12((byte)((uint)(iVar5 + (short)((uint6)uVar15
                                                                                     >> 0x20) *
                                                                              iVar8) >> 0x1b),
                                                        CONCAT11((byte)((uint)(iVar50 + (short)((
                                                  uint)uVar14 >> 0x10) * iVar7) >> 0x1b),
                                                  (byte)((uint)(iVar4 + auVar70._2_2_ * iVar6) >>
                                                        0x1b))))))) & 0x2020202020202;
  bVar33 = (byte)((uint)(iVar4 + auVar70._4_2_ * iVar6) >> 0x1a);
  uVar42 = CONCAT17((byte)((uint)(iVar51 + (short)((ulong)uVar11 >> 0x20) * iVar9) >> 0x1a),
                    CONCAT16((byte)((uint)(iVar5 + (short)((ulong)uVar10 >> 0x20) * iVar8) >> 0x1a),
                             CONCAT15((byte)((uint)(iVar50 + auVar74._4_2_ * iVar7) >> 0x1a),
                                      CONCAT14((byte)((uint)(iVar4 + (short)((ulong)uVar12 >> 0x20)
                                                                     * iVar6) >> 0x1a),
                                               CONCAT13((byte)((uint)(iVar51 + auVar32._4_2_ * iVar9
                                                                     ) >> 0x1a),
                                                        CONCAT12((byte)((uint)(iVar5 + auVar31._4_2_
                                                                                       * iVar8) >>
                                                                       0x1a),
                                                                 CONCAT11((byte)((uint)(iVar50 + 
                                                  auVar30._4_2_ * iVar7) >> 0x1a),bVar33))))))) &
           0x404040404040404;
  uVar73 = CONCAT16((byte)((uint)(iVar5 + (short)((ulong)uVar10 >> 0x30) * iVar8) >> 0x19),
                    CONCAT15((byte)((uint)(iVar50 + auVar74._6_2_ * iVar7) >> 0x19),
                             CONCAT14((byte)((uint)(iVar4 + (short)((ulong)uVar12 >> 0x30) * iVar6)
                                            >> 0x19),
                                      CONCAT13((byte)((uint)(iVar51 + auVar32._6_2_ * iVar9) >> 0x19
                                                     ),CONCAT12((byte)((uint)(iVar5 + auVar31._6_2_
                                                                                      * iVar8) >>
                                                                      0x19),
                                                                CONCAT11((byte)((uint)(iVar50 + 
                                                  auVar30._6_2_ * iVar7) >> 0x19),
                                                  (byte)((uint)(iVar4 + auVar70._6_2_ * iVar6) >>
                                                        0x19))))))) & 0x8080808080808;
  uVar21 = CONCAT14((char)((uint)(iVar50 + auVar82._2_2_ * iVar7) >> 0x17),
                    (uint)(iVar4 + auVar82._0_2_ * iVar6) >> 0x17) & 0xff000000ff;
  uVar19 = CONCAT12((char)((uint)(iVar50 + auVar54._2_2_ * iVar7) >> 0x17),
                    (ushort)((uint)(iVar4 + auVar54._0_2_ * iVar6) >> 0x17)) & 0xff00ff;
  uVar69 = CONCAT17((char)((uint)(iVar51 + (short)((ulong)*(undefined8 *)(param_10 + 0x178) >> 0x10)
                                           * iVar9) >> 0x17),
                    CONCAT16((char)((uint)(iVar5 + sVar60 * iVar8) >> 0x17),
                             CONCAT15((char)((uint)(iVar50 + auVar64._2_2_ * iVar7) >> 0x17),
                                      CONCAT14((char)((uint)(iVar4 + auVar64._0_2_ * iVar6) >> 0x17)
                                               ,CONCAT13((char)((uint)(iVar51 + auVar32._10_2_ *
                                                                                iVar9) >> 0x17),
                                                         CONCAT12((char)((uint)(iVar5 + auVar31.
                                                  _10_2_ * iVar8) >> 0x17),
                                                  CONCAT11((char)(uVar21 >> 0x20),(char)uVar21))))))
                   ) & 0x2020202020202020;
  uVar48 = CONCAT16((char)((uint)(iVar5 + auVar56._4_2_ * iVar8) >> 0x16),
                    CONCAT15((char)((uint)(iVar50 + auVar72._2_2_ * iVar7) >> 0x16),
                             CONCAT14((char)((uint)(iVar4 + auVar72._0_2_ * iVar6) >> 0x16),
                                      CONCAT13((char)((uint)(iVar51 + auVar80._6_2_ * iVar9) >> 0x16
                                                     ),CONCAT12((char)((uint)(iVar5 + auVar80._4_2_
                                                                                      * iVar8) >>
                                                                      0x16),
                                                                CONCAT11((char)((uint)(iVar50 + 
                                                  auVar55._2_2_ * iVar7) >> 0x16),
                                                  (char)((uint)(iVar4 + auVar55._0_2_ * iVar6) >>
                                                        0x16))))))) & 0x40404040404040;
  *(ulong *)(param_9 + 0x18) =
       CONCAT17((byte)((uint)(iVar51 + (short)((ulong)uVar44 >> 0x30) * iVar9) >> 0x1c) & 1 |
                (byte)((uint)(iVar51 + (short)(CONCAT13(auVar29[3],
                                                        CONCAT12(auVar29[2],auVar28._2_2_)) >> 0x10)
                                       * iVar9) >> 0x1b) & 2 |
                (byte)((uint)(iVar51 + auVar29._6_2_ * iVar9) >> 0x19) & 8 |
                (byte)((uint)(iVar51 + auVar29._10_2_ * iVar9) >> 0x17) & 0x20 |
                (byte)((uint)(iVar51 + auVar79._6_2_ * iVar9) >> 0x15) & 0x80 |
                (byte)((uint)(iVar51 + auVar29._4_2_ * iVar9) >> 0x1a) & 4 |
                (byte)((uint)(iVar51 + CONCAT13((char)((uint)(int)sVar39 >> 0x18),
                                                CONCAT12((char)((uint)(int)sVar39 >> 0x10),sVar39))
                                       * iVar9) >> 0x18) & 0x10 |
                (byte)((uint)(iVar51 + auVar78._6_2_ * iVar9) >> 0x16) & 0x40,
                CONCAT16((byte)((uint)(iVar5 + (short)((ulong)uVar44 >> 0x20) * iVar8) >> 0x1c) & 1
                         | (byte)((uint)(iVar5 + auVar28._2_2_ * iVar8) >> 0x1b) & 2 |
                         (byte)((uint)(iVar5 + auVar28._6_2_ * iVar8) >> 0x19) & 8 |
                         (byte)((uint)(iVar5 + auVar28._10_2_ * iVar8) >> 0x17) & 0x20 |
                         (byte)((uint)(iVar5 + auVar79._4_2_ * iVar8) >> 0x15) & 0x80 |
                         (byte)((uint)(iVar5 + auVar28._4_2_ * iVar8) >> 0x1a) & 4 |
                         (byte)((uint)(iVar5 + CONCAT13((char)((uint)(int)sVar37 >> 0x18),
                                                        CONCAT12((char)((uint)(int)sVar37 >> 0x10),
                                                                 sVar37)) * iVar8) >> 0x18) & 0x10 |
                         (byte)((uint)(iVar5 + auVar78._4_2_ * iVar8) >> 0x16) & 0x40,
                         CONCAT15((byte)((uint)(iVar50 + auVar27._0_2_ * iVar7) >> 0x1c) & 1 |
                                  (byte)((uint)(iVar50 + auVar27._2_2_ * iVar7) >> 0x1b) & 2 |
                                  (byte)((uint)(iVar50 + auVar27._6_2_ * iVar7) >> 0x19) & 8 |
                                  (byte)((uint)(iVar50 + auVar58._2_2_ * iVar7) >> 0x17) & 0x20 |
                                  (byte)((uint)(iVar50 + auVar81._2_2_ * iVar7) >> 0x15) & 0x80 |
                                  (byte)((uint)(iVar50 + auVar27._4_2_ * iVar7) >> 0x1a) & 4 |
                                  (byte)((uint)(iVar50 + CONCAT13((char)((uint)(int)sVar35 >> 0x18),
                                                                  CONCAT12((char)((uint)(int)sVar35
                                                                                 >> 0x10),sVar35)) *
                                                         iVar7) >> 0x18) & 0x10 |
                                  (byte)((uint)(iVar50 + auVar49._2_2_ * iVar7) >> 0x16) & 0x40,
                                  CONCAT14((byte)((uint)(iVar4 + auVar26._0_2_ * iVar6) >> 0x1c) & 1
                                           | (byte)((uint)(iVar4 + auVar26._2_2_ * iVar6) >> 0x1b) &
                                             2 | (byte)((uint)(iVar4 + auVar26._6_2_ * iVar6) >>
                                                       0x19) & 8 |
                                           (byte)((uint)(iVar4 + auVar58._0_2_ * iVar6) >> 0x17) &
                                           0x20 | (byte)((uint)(iVar4 + auVar81._0_2_ * iVar6) >>
                                                        0x15) & 0x80 |
                                           (byte)((uint)(iVar4 + auVar26._4_2_ * iVar6) >> 0x1a) & 4
                                           | (byte)((uint)(iVar4 + CONCAT13((char)((uint)(int)sVar16
                                                                                  >> 0x18),
                                                                            CONCAT12((char)((uint)(
                                                  int)sVar16 >> 0x10),sVar16)) * iVar6) >> 0x18) &
                                             0x10 | (byte)((uint)(iVar4 + auVar49._0_2_ * iVar6) >>
                                                          0x16) & 0x40,
                                           CONCAT13((byte)((uint)(iVar51 + (short)((ulong)uVar43 >>
                                                                                  0x30) * iVar9) >>
                                                          0x1c) & 1 |
                                                    (byte)((uint)(iVar51 + auVar25._2_2_ * iVar9) >>
                                                          0x1b) & 2 |
                                                    (byte)((uint)(iVar51 + auVar25._6_2_ * iVar9) >>
                                                          0x19) & 8 |
                                                    (byte)((uint)(iVar51 + (short)(CONCAT13(auVar25[
                                                  0xb],CONCAT12(auVar25[10],auVar24._10_2_)) >> 0x10
                                                  ) * iVar9) >> 0x17) & 0x20 |
                                                  (byte)((uint)(iVar51 + auVar77._6_2_ * iVar9) >>
                                                        0x15) & 0x80 |
                                                  (byte)((uint)(iVar51 + auVar25._4_2_ * iVar9) >>
                                                        0x1a) & 4 |
                                                  (byte)((uint)(iVar51 + CONCAT13((char)((uint)(int)
                                                  sVar38 >> 0x18),
                                                  CONCAT12((char)((uint)(int)sVar38 >> 0x10),sVar38)
                                                  ) * iVar9) >> 0x18) & 0x10 |
                                                  (byte)((uint)(iVar51 + auVar71._6_2_ * iVar9) >>
                                                        0x16) & 0x40,
                                                  CONCAT12((byte)((uint)(iVar5 + (short)((ulong)
                                                  uVar43 >> 0x20) * iVar8) >> 0x1c) & 1 |
                                                  (byte)((uint)(iVar5 + auVar24._2_2_ * iVar8) >>
                                                        0x1b) & 2 |
                                                  (byte)((uint)(iVar5 + auVar24._6_2_ * iVar8) >>
                                                        0x19) & 8 |
                                                  (byte)((uint)(iVar5 + auVar24._10_2_ * iVar8) >>
                                                        0x17) & 0x20 |
                                                  (byte)((uint)(iVar5 + auVar77._4_2_ * iVar8) >>
                                                        0x15) & 0x80 |
                                                  (byte)((uint)(iVar5 + auVar24._4_2_ * iVar8) >>
                                                        0x1a) & 4 |
                                                  (byte)((uint)(iVar5 + CONCAT13((char)((uint)(int)
                                                  sVar36 >> 0x18),
                                                  CONCAT12((char)((uint)(int)sVar36 >> 0x10),sVar36)
                                                  ) * iVar8) >> 0x18) & 0x10 |
                                                  (byte)((uint)(iVar5 + auVar71._4_2_ * iVar8) >>
                                                        0x16) & 0x40,
                                                  CONCAT11((byte)((uint)(iVar50 + auVar23._0_2_ *
                                                                                  iVar7) >> 0x1c) &
                                                           1 | (byte)((uint)(iVar50 + auVar23._2_2_
                                                                                      * iVar7) >>
                                                                     0x1b) & 2 |
                                                           (byte)((uint)(iVar50 + auVar23._6_2_ *
                                                                                  iVar7) >> 0x19) &
                                                           8 | (byte)(uVar19 >> 0x10) & 0x20 |
                                                           (byte)((uint)(iVar50 + auVar57._2_2_ *
                                                                                  iVar7) >> 0x15) &
                                                           0x80 | (byte)((uint)(iVar50 + auVar23.
                                                  _4_2_ * iVar7) >> 0x1a) & 4 |
                                                  (byte)((uint)(iVar50 + CONCAT13((char)((uint)(int)
                                                  sVar34 >> 0x18),
                                                  CONCAT12((char)((uint)(int)sVar34 >> 0x10),sVar34)
                                                  ) * iVar7) >> 0x18) & 0x10 |
                                                  (byte)((uint)(iVar50 + auVar52._2_2_ * iVar7) >>
                                                        0x16) & 0x40,
                                                  (byte)((uint)(iVar4 + auVar22._0_2_ * iVar6) >>
                                                        0x1c) & 1 |
                                                  (byte)((uint)(iVar4 + auVar22._2_2_ * iVar6) >>
                                                        0x1b) & 2 |
                                                  (byte)((uint)(iVar4 + auVar22._6_2_ * iVar6) >>
                                                        0x19) & 8 | (byte)uVar19 & 0x20 |
                                                  (byte)((uint)(iVar4 + auVar57._0_2_ * iVar6) >>
                                                        0x15) & 0x80 |
                                                  (byte)((uint)(iVar4 + auVar22._4_2_ * iVar6) >>
                                                        0x1a) & 4 |
                                                  (byte)((uint)(iVar4 + CONCAT13((char)((uint)(int)
                                                  sVar20 >> 0x18),
                                                  CONCAT12((char)((uint)(int)sVar20 >> 0x10),sVar20)
                                                  ) * iVar6) >> 0x18) & 0x10 |
                                                  (byte)((uint)(iVar4 + auVar52._0_2_ * iVar6) >>
                                                        0x16) & 0x40)))))));
  *(ulong *)(param_9 + 0x10) =
       CONCAT17((byte)((uint)(iVar51 + (short)((ulong)uVar83 >> 0x30) * iVar9) >> 0x1c) & 1 |
                (byte)((uint)(iVar51 + sVar40 * iVar9) >> 0x1b) & 2 |
                (byte)((uint)(iVar51 + (short)((ulong)uVar11 >> 0x30) * iVar9) >> 0x19) & 8 |
                (byte)(uVar69 >> 0x38) |
                (byte)((uint)(iVar51 + auVar45._6_2_ * iVar9) >> 0x15) & 0x80 |
                (byte)(uVar42 >> 0x38) |
                (byte)((uint)(iVar51 + auVar68._6_2_ * iVar9) >> 0x18) & 0x10 |
                (byte)((uint)(iVar51 + auVar56._6_2_ * iVar9) >> 0x16) & 0x40,
                CONCAT16((byte)((uint)(iVar5 + (short)((ulong)uVar83 >> 0x20) * iVar8) >> 0x1c) & 1
                         | (byte)(uVar41 >> 0x30) | (byte)(uVar73 >> 0x30) | (byte)(uVar69 >> 0x30)
                         | (byte)((uint)(iVar5 + auVar45._4_2_ * iVar8) >> 0x15) & 0x80 |
                         (byte)(uVar42 >> 0x30) |
                         (byte)((uint)(iVar5 + auVar68._4_2_ * iVar8) >> 0x18) & 0x10 |
                         (byte)(uVar48 >> 0x30),
                         CONCAT15((byte)((uint)(iVar50 + auVar74._0_2_ * iVar7) >> 0x1c) & 1 |
                                  (byte)(uVar41 >> 0x28) | (byte)(uVar73 >> 0x28) |
                                  (byte)(uVar69 >> 0x28) |
                                  (byte)((uint)(iVar50 + auVar76._2_2_ * iVar7) >> 0x15) & 0x80 |
                                  (byte)(uVar42 >> 0x28) |
                                  (byte)((uint)(iVar50 + auVar74._8_2_ * iVar7) >> 0x18) & 0x10 |
                                  (byte)(uVar48 >> 0x28),
                                  CONCAT14((byte)((uint)(iVar4 + (short)uVar12 * iVar6) >> 0x1c) & 1
                                           | (byte)(uVar41 >> 0x20) | (byte)(uVar73 >> 0x20) |
                                           (byte)(uVar69 >> 0x20) |
                                           (byte)((uint)(iVar4 + auVar76._0_2_ * iVar6) >> 0x15) &
                                           0x80 | (byte)(uVar42 >> 0x20) |
                                                  (byte)((uint)(iVar4 + (short)uVar13 * iVar6) >>
                                                        0x18) & 0x10 | (byte)(uVar48 >> 0x20),
                                           CONCAT13((byte)((uint)(iVar51 + (short)((ulong)uVar53 >>
                                                                                  0x30) * iVar9) >>
                                                          0x1c) & 1 | (byte)(uVar41 >> 0x18) |
                                                    (byte)(uVar73 >> 0x18) | (byte)(uVar69 >> 0x18)
                                                    | (byte)((uint)(iVar51 + auVar75._6_2_ * iVar9)
                                                            >> 0x15) & 0x80 |
                                                    (byte)(uVar42 >> 0x18) |
                                                    (byte)((uint)(iVar51 + auVar47._6_2_ * iVar9) >>
                                                          0x18) & 0x10 | (byte)(uVar48 >> 0x18),
                                                    CONCAT12((byte)((uint)(iVar5 + (short)((ulong)
                                                  uVar53 >> 0x20) * iVar8) >> 0x1c) & 1 |
                                                  (byte)(uVar41 >> 0x10) | (byte)(uVar73 >> 0x10) |
                                                  (byte)(uVar69 >> 0x10) |
                                                  (byte)((uint)(iVar5 + auVar75._4_2_ * iVar8) >>
                                                        0x15) & 0x80 |
                                                  (byte)(uVar42 >> 0x10) |
                                                  (byte)((uint)(iVar5 + auVar47._4_2_ * iVar8) >>
                                                        0x18) & 0x10 | (byte)(uVar48 >> 0x10),
                                                  CONCAT11((byte)((uint)(iVar50 + auVar30._0_2_ *
                                                                                  iVar7) >> 0x1c) &
                                                           1 | (byte)(uVar41 >> 8) |
                                                           (byte)(uVar73 >> 8) | (byte)(uVar69 >> 8)
                                                           | (byte)((uint)(iVar50 + auVar63._2_2_ *
                                                                                    iVar7) >> 0x15)
                                                             & 0x80 |
                                                           (byte)(uVar42 >> 8) |
                                                           (byte)((uint)(iVar50 + auVar30._8_2_ *
                                                                                  iVar7) >> 0x18) &
                                                           0x10 | (byte)(uVar48 >> 8),
                                                           (byte)((uint)(iVar4 + auVar70._0_2_ *
                                                                                 iVar6) >> 0x1c) & 1
                                                           | (byte)uVar41 | (byte)uVar73 |
                                                           (byte)uVar69 |
                                                           (byte)((uint)(iVar4 + auVar63._0_2_ *
                                                                                 iVar6) >> 0x15) &
                                                           0x80 | bVar33 & 4 |
                                                                  (byte)((uint)(iVar4 + auVar70.
                                                  _8_2_ * iVar6) >> 0x18) & 0x10 | (byte)uVar48)))))
                        ));
  return;
}

