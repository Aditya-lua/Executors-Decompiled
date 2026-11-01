
void FUN_002e8950(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16],long param_8)

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  short sVar5;
  short sVar6;
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
  undefined8 uVar33;
  short sVar34;
  short sVar35;
  short sVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  short sVar39;
  short sVar40;
  short sVar41;
  undefined8 uVar42;
  undefined8 uVar43;
  short sVar44;
  short sVar45;
  short sVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  short sVar49;
  short sVar50;
  short sVar51;
  undefined8 uVar52;
  
  sVar32 = param_2._14_2_;
  sVar31 = param_2._12_2_;
  sVar30 = param_2._10_2_;
  sVar29 = param_2._8_2_;
  sVar28 = param_2._6_2_;
  sVar27 = param_2._4_2_;
  sVar26 = param_2._2_2_;
  sVar25 = param_2._0_2_;
  *(long *)(param_8 + 0x188) = param_4._8_8_;
  *(long *)(param_8 + 0x180) = param_4._0_8_;
  *(long *)(param_8 + 0x198) = param_5._8_8_;
  *(long *)(param_8 + 400) = param_5._0_8_;
  *(long *)(param_8 + 0x1a8) = param_6._8_8_;
  *(long *)(param_8 + 0x1a0) = param_6._0_8_;
  *(long *)(param_8 + 0x1b8) = param_7._8_8_;
  *(long *)(param_8 + 0x1b0) = param_7._0_8_;
  uVar37 = *(undefined8 *)(param_8 + 0x1c8);
  uVar33 = *(undefined8 *)(param_8 + 0x1c0);
  uVar42 = *(undefined8 *)(param_8 + 0x1d8);
  uVar38 = *(undefined8 *)(param_8 + 0x1d0);
  uVar47 = *(undefined8 *)(param_8 + 0x1e8);
  uVar43 = *(undefined8 *)(param_8 + 0x1e0);
  uVar52 = *(undefined8 *)(param_8 + 0x1f8);
  uVar48 = *(undefined8 *)(param_8 + 0x1f0);
  sVar9 = (short)((ulong)uVar37 >> 0x10);
  sVar13 = (short)((ulong)uVar37 >> 0x20);
  sVar17 = (short)((ulong)uVar37 >> 0x30);
  sVar34 = (short)((ulong)uVar33 >> 0x10);
  sVar35 = (short)((ulong)uVar33 >> 0x20);
  sVar36 = (short)((ulong)uVar33 >> 0x30);
  sVar10 = (short)((ulong)uVar42 >> 0x10);
  sVar14 = (short)((ulong)uVar42 >> 0x20);
  sVar18 = (short)((ulong)uVar42 >> 0x30);
  sVar39 = (short)((ulong)uVar38 >> 0x10);
  sVar40 = (short)((ulong)uVar38 >> 0x20);
  sVar41 = (short)((ulong)uVar38 >> 0x30);
  sVar11 = (short)((ulong)uVar47 >> 0x10);
  sVar15 = (short)((ulong)uVar47 >> 0x20);
  sVar19 = (short)((ulong)uVar47 >> 0x30);
  sVar44 = (short)((ulong)uVar43 >> 0x10);
  sVar45 = (short)((ulong)uVar43 >> 0x20);
  sVar46 = (short)((ulong)uVar43 >> 0x30);
  sVar12 = (short)((ulong)uVar52 >> 0x10);
  sVar16 = (short)((ulong)uVar52 >> 0x20);
  sVar20 = (short)((ulong)uVar52 >> 0x30);
  sVar49 = (short)((ulong)uVar48 >> 0x10);
  sVar50 = (short)((ulong)uVar48 >> 0x20);
  sVar51 = (short)((ulong)uVar48 >> 0x30);
  sVar21 = (short)((uint)(param_1._0_4_ + (int)(short)uVar48 * (int)sVar25) >> 0x10);
  sVar22 = (short)((uint)(param_1._4_4_ + (int)sVar49 * (int)sVar26) >> 0x10);
  sVar23 = (short)((uint)(param_1._8_4_ + (int)sVar50 * (int)sVar27) >> 0x10);
  sVar24 = (short)((uint)(param_1._12_4_ + (int)sVar51 * (int)sVar28) >> 0x10);
  sVar5 = (short)((uint)((int)(short)uVar33 * (int)sVar25 + 0x2000000) >> 0x10);
  sVar6 = (short)((uint)((int)sVar34 * (int)sVar26 + 0x2000000) >> 0x10);
  sVar7 = (short)((uint)((int)sVar35 * (int)sVar27 + 0x2000000) >> 0x10);
  sVar8 = (short)((uint)((int)sVar36 * (int)sVar28 + 0x2000000) >> 0x10);
  iVar1 = param_3._0_4_;
  iVar2 = param_3._4_4_;
  iVar3 = param_3._8_4_;
  iVar4 = param_3._12_4_;
  *(ulong *)(param_8 + 0x1c8) =
       CONCAT26(sVar17 - (short)((uint)(((int)sVar17 * (int)sVar32 + 0x2000000 >> 0x1a) * iVar4) >>
                                0x10),
                CONCAT24(sVar13 - (short)((uint)(((int)sVar13 * (int)sVar31 + 0x2000000 >> 0x1a) *
                                                iVar3) >> 0x10),
                         CONCAT22(sVar9 - (short)((uint)(((int)sVar9 * (int)sVar30 + 0x2000000 >>
                                                         0x1a) * iVar2) >> 0x10),
                                  (short)uVar37 -
                                  (short)((uint)(((int)(short)uVar37 * (int)sVar29 + 0x2000000 >>
                                                 0x1a) * iVar1) >> 0x10))));
  *(ulong *)(param_8 + 0x1c0) =
       CONCAT26(sVar36 - (short)((uint)(CONCAT22(sVar8 >> 0xf,sVar8 >> 10) * iVar4) >> 0x10),
                CONCAT24(sVar35 - (short)((uint)(CONCAT22(sVar7 >> 0xf,sVar7 >> 10) * iVar3) >> 0x10
                                         ),
                         CONCAT22(sVar34 - (short)((uint)(CONCAT22(sVar6 >> 0xf,sVar6 >> 10) * iVar2
                                                         ) >> 0x10),
                                  (short)uVar33 -
                                  (short)((uint)(CONCAT22(sVar5 >> 0xf,sVar5 >> 10) * iVar1) >> 0x10
                                         ))));
  *(ulong *)(param_8 + 0x1d8) =
       CONCAT26(sVar18 - (short)((uint)(((int)sVar18 * (int)sVar32 + 0x2000000 >> 0x1a) * iVar4) >>
                                0x10),
                CONCAT24(sVar14 - (short)((uint)(((int)sVar14 * (int)sVar31 + 0x2000000 >> 0x1a) *
                                                iVar3) >> 0x10),
                         CONCAT22(sVar10 - (short)((uint)(((int)sVar10 * (int)sVar30 + 0x2000000 >>
                                                          0x1a) * iVar2) >> 0x10),
                                  (short)uVar42 -
                                  (short)((uint)(((int)(short)uVar42 * (int)sVar29 + 0x2000000 >>
                                                 0x1a) * iVar1) >> 0x10))));
  *(ulong *)(param_8 + 0x1d0) =
       CONCAT26(sVar41 - (short)((uint)(((int)sVar41 * (int)sVar28 + 0x2000000 >> 0x1a) * iVar4) >>
                                0x10),
                CONCAT24(sVar40 - (short)((uint)(((int)sVar40 * (int)sVar27 + 0x2000000 >> 0x1a) *
                                                iVar3) >> 0x10),
                         CONCAT22(sVar39 - (short)((uint)(((int)sVar39 * (int)sVar26 + 0x2000000 >>
                                                          0x1a) * iVar2) >> 0x10),
                                  (short)uVar38 -
                                  (short)((uint)(((int)(short)uVar38 * (int)sVar25 + 0x2000000 >>
                                                 0x1a) * iVar1) >> 0x10))));
  *(ulong *)(param_8 + 0x1e8) =
       CONCAT26(sVar19 - (short)((uint)(((int)sVar19 * (int)sVar32 + 0x2000000 >> 0x1a) * iVar4) >>
                                0x10),
                CONCAT24(sVar15 - (short)((uint)(((int)sVar15 * (int)sVar31 + 0x2000000 >> 0x1a) *
                                                iVar3) >> 0x10),
                         CONCAT22(sVar11 - (short)((uint)(((int)sVar11 * (int)sVar30 + 0x2000000 >>
                                                          0x1a) * iVar2) >> 0x10),
                                  (short)uVar47 -
                                  (short)((uint)(((int)(short)uVar47 * (int)sVar29 + 0x2000000 >>
                                                 0x1a) * iVar1) >> 0x10))));
  *(ulong *)(param_8 + 0x1e0) =
       CONCAT26(sVar46 - (short)((uint)(((int)sVar46 * (int)sVar28 + 0x2000000 >> 0x1a) * iVar4) >>
                                0x10),
                CONCAT24(sVar45 - (short)((uint)(((int)sVar45 * (int)sVar27 + 0x2000000 >> 0x1a) *
                                                iVar3) >> 0x10),
                         CONCAT22(sVar44 - (short)((uint)(((int)sVar44 * (int)sVar26 + 0x2000000 >>
                                                          0x1a) * iVar2) >> 0x10),
                                  (short)uVar43 -
                                  (short)((uint)(((int)(short)uVar43 * (int)sVar25 + 0x2000000 >>
                                                 0x1a) * iVar1) >> 0x10))));
  *(ulong *)(param_8 + 0x1f8) =
       CONCAT26(sVar20 - (short)((uint)(((int)sVar20 * (int)sVar32 + 0x2000000 >> 0x1a) * iVar4) >>
                                0x10),
                CONCAT24(sVar16 - (short)((uint)(((int)sVar16 * (int)sVar31 + 0x2000000 >> 0x1a) *
                                                iVar3) >> 0x10),
                         CONCAT22(sVar12 - (short)((uint)(((int)sVar12 * (int)sVar30 + 0x2000000 >>
                                                          0x1a) * iVar2) >> 0x10),
                                  (short)uVar52 -
                                  (short)((uint)(((int)(short)uVar52 * (int)sVar29 + 0x2000000 >>
                                                 0x1a) * iVar1) >> 0x10))));
  *(ulong *)(param_8 + 0x1f0) =
       CONCAT26(sVar51 - (short)((uint)(CONCAT22(sVar24 >> 0xf,sVar24 >> 10) * iVar4) >> 0x10),
                CONCAT24(sVar50 - (short)((uint)(CONCAT22(sVar23 >> 0xf,sVar23 >> 10) * iVar3) >>
                                         0x10),
                         CONCAT22(sVar49 - (short)((uint)(CONCAT22(sVar22 >> 0xf,sVar22 >> 10) *
                                                         iVar2) >> 0x10),
                                  (short)uVar48 -
                                  (short)((uint)(CONCAT22(sVar21 >> 0xf,sVar21 >> 10) * iVar1) >>
                                         0x10))));
  return;
}

