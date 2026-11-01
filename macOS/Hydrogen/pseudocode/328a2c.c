
void FUN_00328a2c(undefined1 param_1 [16],undefined1 param_2 [16])

{
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  long lVar6;
  ushort *puVar7;
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
  short sVar34;
  short sVar35;
  short sVar36;
  short sVar37;
  short sVar38;
  short sVar39;
  short sVar40;
  short sVar41;
  short sVar42;
  short sVar43;
  undefined1 auVar44 [16];
  undefined8 uStack00000000000000e0;
  undefined8 uStack00000000000000e8;
  undefined8 uStack0000000000000110;
  undefined8 uStack0000000000000118;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 uStack00000000000001a0;
  undefined8 uStack00000000000001a8;
  undefined8 in_stack_00000250;
  undefined8 in_stack_00000258;
  undefined1 auStack_7ffffffe [2147483646];
  
  sVar29 = param_1._14_2_;
  sVar26 = param_1._12_2_;
  sVar23 = param_1._10_2_;
  sVar20 = param_1._8_2_;
  sVar43 = param_1._6_2_;
  sVar41 = param_1._4_2_;
  sVar39 = param_1._2_2_;
  sVar37 = param_1._0_2_;
  sVar15 = (short)((ulong)in_stack_00000138 >> 0x10);
  sVar16 = (short)((ulong)in_stack_00000138 >> 0x20);
  sVar17 = (short)((ulong)in_stack_00000138 >> 0x30);
  sVar12 = (short)((ulong)in_stack_00000130 >> 0x10);
  sVar13 = (short)((ulong)in_stack_00000130 >> 0x20);
  sVar14 = (short)((ulong)in_stack_00000130 >> 0x30);
  sVar8 = (short)((uint)((int)(short)in_stack_00000138 * (int)sVar20 + 0x2000000) >> 0x10);
  sVar9 = (short)((uint)((int)sVar15 * (int)sVar23 + 0x2000000) >> 0x10);
  sVar10 = (short)((uint)((int)sVar16 * (int)sVar26 + 0x2000000) >> 0x10);
  sVar11 = (short)((uint)((int)sVar17 * (int)sVar29 + 0x2000000) >> 0x10);
  sVar18 = (short)((uint)((int)(short)in_stack_00000130 * (int)sVar37 + 0x2000000) >> 0x10);
  sVar21 = (short)((uint)((int)sVar12 * (int)sVar39 + 0x2000000) >> 0x10);
  sVar24 = (short)((uint)((int)sVar13 * (int)sVar41 + 0x2000000) >> 0x10);
  sVar27 = (short)((uint)((int)sVar14 * (int)sVar43 + 0x2000000) >> 0x10);
  iVar1 = param_2._0_4_;
  iVar2 = param_2._4_4_;
  iVar3 = param_2._8_4_;
  iVar4 = param_2._12_4_;
  sVar33 = (short)((ulong)in_stack_00000148 >> 0x10);
  sVar34 = (short)((ulong)in_stack_00000148 >> 0x20);
  sVar35 = (short)((ulong)in_stack_00000148 >> 0x30);
  sVar30 = (short)((ulong)in_stack_00000140 >> 0x10);
  sVar31 = (short)((ulong)in_stack_00000140 >> 0x20);
  sVar32 = (short)((ulong)in_stack_00000140 >> 0x30);
  sVar19 = (short)((uint)((int)(short)in_stack_00000148 * (int)sVar20 + 0x2000000) >> 0x10);
  sVar22 = (short)((uint)((int)sVar33 * (int)sVar23 + 0x2000000) >> 0x10);
  sVar25 = (short)((uint)((int)sVar34 * (int)sVar26 + 0x2000000) >> 0x10);
  sVar28 = (short)((uint)((int)sVar35 * (int)sVar29 + 0x2000000) >> 0x10);
  sVar36 = (short)((uint)((int)(short)in_stack_00000140 * (int)sVar37 + 0x2000000) >> 0x10);
  sVar38 = (short)((uint)((int)sVar30 * (int)sVar39 + 0x2000000) >> 0x10);
  sVar40 = (short)((uint)((int)sVar31 * (int)sVar41 + 0x2000000) >> 0x10);
  sVar42 = (short)((uint)((int)sVar32 * (int)sVar43 + 0x2000000) >> 0x10);
  uStack0000000000000118 =
       CONCAT26(sVar17 - (short)((uint)(CONCAT22(sVar11 >> 0xf,sVar11 >> 10) * iVar4) >> 0x10),
                CONCAT24(sVar16 - (short)((uint)(CONCAT22(sVar10 >> 0xf,sVar10 >> 10) * iVar3) >>
                                         0x10),
                         CONCAT22(sVar15 - (short)((uint)(CONCAT22(sVar9 >> 0xf,sVar9 >> 10) * iVar2
                                                         ) >> 0x10),
                                  (short)in_stack_00000138 -
                                  (short)((uint)(CONCAT22(sVar8 >> 0xf,sVar8 >> 10) * iVar1) >> 0x10
                                         ))));
  uStack0000000000000110 =
       CONCAT26(sVar14 - (short)((uint)(CONCAT22(sVar27 >> 0xf,sVar27 >> 10) * iVar4) >> 0x10),
                CONCAT24(sVar13 - (short)((uint)(CONCAT22(sVar24 >> 0xf,sVar24 >> 10) * iVar3) >>
                                         0x10),
                         CONCAT22(sVar12 - (short)((uint)(CONCAT22(sVar21 >> 0xf,sVar21 >> 10) *
                                                         iVar2) >> 0x10),
                                  (short)in_stack_00000130 -
                                  (short)((uint)(CONCAT22(sVar18 >> 0xf,sVar18 >> 10) * iVar1) >>
                                         0x10))));
  uStack00000000000000e8 =
       CONCAT26(sVar35 - (short)((uint)(CONCAT22(sVar28 >> 0xf,sVar28 >> 10) * iVar4) >> 0x10),
                CONCAT24(sVar34 - (short)((uint)(CONCAT22(sVar25 >> 0xf,sVar25 >> 10) * iVar3) >>
                                         0x10),
                         CONCAT22(sVar33 - (short)((uint)(CONCAT22(sVar22 >> 0xf,sVar22 >> 10) *
                                                         iVar2) >> 0x10),
                                  (short)in_stack_00000148 -
                                  (short)((uint)(CONCAT22(sVar19 >> 0xf,sVar19 >> 10) * iVar1) >>
                                         0x10))));
  uStack00000000000000e0 =
       CONCAT26(sVar32 - (short)((uint)(CONCAT22(sVar42 >> 0xf,sVar42 >> 10) * iVar4) >> 0x10),
                CONCAT24(sVar31 - (short)((uint)(CONCAT22(sVar40 >> 0xf,sVar40 >> 10) * iVar3) >>
                                         0x10),
                         CONCAT22(sVar30 - (short)((uint)(CONCAT22(sVar38 >> 0xf,sVar38 >> 10) *
                                                         iVar2) >> 0x10),
                                  (short)in_stack_00000140 -
                                  (short)((uint)(CONCAT22(sVar36 >> 0xf,sVar36 >> 10) * iVar1) >>
                                         0x10))));
  sVar11 = (short)((ulong)in_stack_00000258 >> 0x10);
  sVar12 = (short)((ulong)in_stack_00000258 >> 0x20);
  sVar13 = (short)((ulong)in_stack_00000258 >> 0x30);
  sVar8 = (short)((ulong)in_stack_00000250 >> 0x10);
  sVar9 = (short)((ulong)in_stack_00000250 >> 0x20);
  sVar10 = (short)((ulong)in_stack_00000250 >> 0x30);
  sVar20 = (short)((uint)((int)(short)in_stack_00000258 * (int)sVar20 + 0x2000000) >> 0x10);
  sVar23 = (short)((uint)((int)sVar11 * (int)sVar23 + 0x2000000) >> 0x10);
  sVar26 = (short)((uint)((int)sVar12 * (int)sVar26 + 0x2000000) >> 0x10);
  sVar29 = (short)((uint)((int)sVar13 * (int)sVar29 + 0x2000000) >> 0x10);
  sVar37 = (short)((uint)((int)(short)in_stack_00000250 * (int)sVar37 + 0x2000000) >> 0x10);
  sVar39 = (short)((uint)((int)sVar8 * (int)sVar39 + 0x2000000) >> 0x10);
  sVar41 = (short)((uint)((int)sVar9 * (int)sVar41 + 0x2000000) >> 0x10);
  sVar43 = (short)((uint)((int)sVar10 * (int)sVar43 + 0x2000000) >> 0x10);
  uStack00000000000001a8 =
       CONCAT26(sVar13 - (short)((uint)(CONCAT22(sVar29 >> 0xf,sVar29 >> 10) * iVar4) >> 0x10),
                CONCAT24(sVar12 - (short)((uint)(CONCAT22(sVar26 >> 0xf,sVar26 >> 10) * iVar3) >>
                                         0x10),
                         CONCAT22(sVar11 - (short)((uint)(CONCAT22(sVar23 >> 0xf,sVar23 >> 10) *
                                                         iVar2) >> 0x10),
                                  (short)in_stack_00000258 -
                                  (short)((uint)(CONCAT22(sVar20 >> 0xf,sVar20 >> 10) * iVar1) >>
                                         0x10))));
  uStack00000000000001a0 =
       CONCAT26(sVar10 - (short)((uint)(CONCAT22(sVar43 >> 0xf,sVar43 >> 10) * iVar4) >> 0x10),
                CONCAT24(sVar9 - (short)((uint)(CONCAT22(sVar41 >> 0xf,sVar41 >> 10) * iVar3) >>
                                        0x10),
                         CONCAT22(sVar8 - (short)((uint)(CONCAT22(sVar39 >> 0xf,sVar39 >> 10) *
                                                        iVar2) >> 0x10),
                                  (short)in_stack_00000250 -
                                  (short)((uint)(CONCAT22(sVar37 >> 0xf,sVar37 >> 10) * iVar1) >>
                                         0x10))));
  func_0x00331c60();
  func_0x0032f8e8(unaff_x19 + 0x580,auStack_7ffffffe + 0x80001d3e);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x98)) {
    return;
  }
  auVar44 = ___stack_chk_fail();
  lVar5 = auVar44._8_8_;
  lVar6 = 0;
  puVar7 = (ushort *)(auVar44._0_8_ + 8);
  do {
    puVar7[-4] = -(*(byte *)(lVar5 + lVar6) & 1) & 0x681;
    puVar7[-3] = -(*(byte *)(lVar5 + lVar6) >> 1 & 1) & 0x681;
    puVar7[-2] = -(*(byte *)(lVar5 + lVar6) >> 2 & 1) & 0x681;
    puVar7[-1] = -(*(byte *)(lVar5 + lVar6) >> 3 & 1) & 0x681;
    *puVar7 = -(*(byte *)(lVar5 + lVar6) >> 4 & 1) & 0x681;
    puVar7[1] = -(*(byte *)(lVar5 + lVar6) >> 5 & 1) & 0x681;
    puVar7[2] = -(*(byte *)(lVar5 + lVar6) >> 6 & 1) & 0x681;
    puVar7[3] = -(ushort)(*(byte *)(lVar5 + lVar6) >> 7) & 0x681;
    lVar6 = lVar6 + 1;
    puVar7 = puVar7 + 8;
  } while (lVar6 != 0x20);
  return;
}

