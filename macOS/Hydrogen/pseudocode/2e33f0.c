
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong * FUN_002e33f0(undefined8 param_1,undefined8 param_2,ulong *param_3,undefined1 param_4)

{
  bool bVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  int iVar7;
  ulong *puVar8;
  long lVar9;
  ulong *puVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong uVar14;
  ulong uVar15;
  long unaff_x29;
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
  short sVar29;
  short sVar30;
  undefined8 uVar28;
  short sVar31;
  undefined8 uVar32;
  short sVar34;
  short sVar35;
  undefined8 uVar33;
  short sVar36;
  undefined8 uVar37;
  short sVar38;
  short sVar39;
  short sVar40;
  short sVar41;
  short sVar42;
  short sVar43;
  undefined1 auVar44 [16];
  undefined1 auStack_7ffffffe [2147482878];
  undefined1 auStack_300 [192];
  undefined8 uStack_240;
  undefined8 uStack_238;
  undefined8 uStack_230;
  undefined8 uStack_228;
  undefined1 uStack_220;
  long lStack_218;
  undefined8 uStack_1e0;
  undefined8 uStack_1d8;
  undefined8 uStack_1d0;
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  undefined8 uStack_1b0;
  undefined8 uStack_1a8;
  undefined8 uStack_1a0;
  undefined8 uStack_198;
  undefined8 uStack_190;
  undefined8 uStack_188;
  undefined8 uStack_180;
  undefined8 uStack_178;
  undefined8 uStack_170;
  undefined8 uStack_168;
  undefined8 uStack_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_128;
  undefined8 uStack_120;
  undefined8 *puStack_118;
  undefined8 *puStack_110;
  undefined8 uStack_108;
  undefined1 auStack_100 [168];
  undefined2 uStack_58;
  long lStack_48;
  
  uStack_220 = param_4;
  func_0x0036e464();
  func_0x0036e464(auStack_7ffffffe + 0x80000a2e,0x800);
  puVar8 = (ulong *)func_0x0036e464(auStack_7ffffffe + 0x800001fe,0x800);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0xa0)) {
    return puVar8;
  }
  auVar44 = ___stack_chk_fail();
  puVar11 = auVar44._8_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_120 = 0;
  uStack_138 = 0;
  uStack_140 = 0;
  uStack_128 = 0;
  uStack_130 = 0;
  uStack_158 = 0;
  uStack_160 = 0;
  uStack_148 = 0;
  uStack_150 = 0;
  uStack_178 = 0;
  uStack_180 = 0;
  uStack_168 = 0;
  uStack_170 = 0;
  uStack_198 = 0;
  uStack_1a0 = 0;
  uStack_188 = 0;
  uStack_190 = 0;
  uStack_1b8 = 0;
  uStack_1c0 = 0;
  uStack_1a8 = 0;
  uStack_1b0 = 0;
  uStack_1d8 = 0;
  uStack_1e0 = 0;
  uStack_1c8 = 0;
  uStack_1d0 = 0;
  uStack_108 = 0;
  puStack_110 = _UNK_0082fc98;
  puStack_118 = _UNK_0082fc90;
  uStack_58 = 6;
  iVar7 = func_0x002f21c0(&uStack_1e0,auVar44._0_8_);
  puVar12 = puStack_118;
  if (iVar7 == 0) {
LAB_002e3550:
    param_3 = (ulong *)0x0;
  }
  else {
    puVar11 = puStack_110;
    if (puStack_110 == (undefined8 *)0x0) goto LAB_002e3554;
    if (uStack_58._1_1_ == '\0') {
      puVar2 = auStack_100 + uStack_108;
      _bzero(puVar2,(long)puStack_118 - uStack_108);
      *puVar2 = (undefined1)uStack_58;
      *(byte *)((long)&uStack_108 + 7 + (long)puVar12) =
           *(byte *)((long)&uStack_108 + 7 + (long)puVar12) | 0x80;
      puVar11 = puVar12;
      puVar13 = puVar12;
      lVar9 = func_0x00383c00(&uStack_1e0,auStack_100);
      uStack_220 = SUB81(puVar13,0);
      if (lVar9 != 0) goto LAB_002e3550;
    }
    puVar11 = puStack_110;
    func_0x00383e60(&uStack_1e0,param_3,puStack_110,puVar12,uStack_58._1_1_);
    uStack_220 = SUB81(puVar12,0);
    uStack_58 = CONCAT11(1,(undefined1)uStack_58);
  }
LAB_002e3554:
  func_0x0036e464(&uStack_1e0,400);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return param_3;
  }
  auVar44 = ___stack_chk_fail();
  lStack_218 = *(long *)PTR____stack_chk_guard_009b01e8;
  uStack_238 = puVar11[1];
  uStack_240 = *puVar11;
  uStack_228 = puVar11[3];
  uStack_230 = puVar11[2];
  func_0x002f23b0(&uStack_240,0x21,auStack_300,0xc0);
  puVar8 = (ulong *)func_0x002df560(auVar44._0_8_,auVar44._8_8_,auStack_300);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_218) {
    return puVar8;
  }
  auVar44 = ___stack_chk_fail();
  puVar10 = auVar44._0_8_;
  puVar8 = puVar10;
  if (*puVar10 != 0) {
    uVar14 = 0;
    uVar15 = 1;
    do {
      puVar12 = (undefined8 *)(auVar44._8_8_ + uVar14 * 0x200);
      puVar8 = (ulong *)func_0x002ec014(puVar12);
      uVar32 = puVar12[1];
      uVar28 = *puVar12;
      uVar37 = puVar12[3];
      uVar33 = puVar12[2];
      sVar16 = (short)((ulong)uVar32 >> 0x10);
      sVar18 = (short)((ulong)uVar32 >> 0x20);
      sVar20 = (short)((ulong)uVar32 >> 0x30);
      sVar22 = (short)((ulong)uVar28 >> 0x10);
      sVar23 = (short)((ulong)uVar28 >> 0x20);
      sVar24 = (short)((ulong)uVar28 >> 0x30);
      sVar17 = (short)((ulong)uVar37 >> 0x10);
      sVar19 = (short)((ulong)uVar37 >> 0x20);
      sVar21 = (short)((ulong)uVar37 >> 0x30);
      uVar4 = puVar12[5];
      sVar34 = (short)((ulong)uVar4 >> 0x10);
      sVar35 = (short)((ulong)uVar4 >> 0x20);
      sVar36 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar12[4];
      sVar29 = (short)((ulong)uVar3 >> 0x10);
      sVar30 = (short)((ulong)uVar3 >> 0x20);
      sVar31 = (short)((ulong)uVar3 >> 0x30);
      uVar6 = puVar12[7];
      sVar41 = (short)((ulong)uVar6 >> 0x10);
      sVar42 = (short)((ulong)uVar6 >> 0x20);
      sVar43 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar12[6];
      sVar38 = (short)((ulong)uVar5 >> 0x10);
      sVar39 = (short)((ulong)uVar5 >> 0x20);
      sVar40 = (short)((ulong)uVar5 >> 0x30);
      sVar25 = (short)((ulong)uVar33 >> 0x10);
      sVar26 = (short)((ulong)uVar33 >> 0x20);
      sVar27 = (short)((ulong)uVar33 >> 0x30);
      puVar12[1] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                            CONCAT24(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                     CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * -0xd01,
                                              (short)uVar32 +
                                              (short)((short)uVar32 * 0x4ebf + 0x2000000 >> 0x1a) *
                                              -0xd01)));
      *puVar12 = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                          CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                   CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     -0xd01,
                                            (short)uVar28 +
                                            (short)((short)uVar28 * 0x4ebf + 0x2000000 >> 0x1a) *
                                            -0xd01)));
      puVar12[3] = CONCAT26(sVar21 + (short)(sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                            CONCAT24(sVar19 + (short)(sVar19 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                     CONCAT22(sVar17 + (short)(sVar17 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * -0xd01,
                                              (short)uVar37 +
                                              (short)((short)uVar37 * 0x4ebf + 0x2000000 >> 0x1a) *
                                              -0xd01)));
      puVar12[2] = CONCAT26(sVar27 + (short)(sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                            CONCAT24(sVar26 + (short)(sVar26 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                     CONCAT22(sVar25 + (short)(sVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * -0xd01,
                                              (short)uVar33 +
                                              (short)((short)uVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                              -0xd01)));
      puVar12[5] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                   0xd010000) >> 0x10),
                            CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                            0xd010000) >> 0x10),
                                     CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                      >> 0x1a) * 0xd010000) >> 0x10)
                                              ,(short)uVar4 -
                                               (short)((uint)(((short)uVar4 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      puVar12[4] = CONCAT26(sVar31 - (short)((uint)((sVar31 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                   0xd010000) >> 0x10),
                            CONCAT24(sVar30 - (short)((uint)((sVar30 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                            0xd010000) >> 0x10),
                                     CONCAT22(sVar29 - (short)((uint)((sVar29 * 0x4ebf + 0x2000000
                                                                      >> 0x1a) * 0xd010000) >> 0x10)
                                              ,(short)uVar3 -
                                               (short)((uint)(((short)uVar3 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      puVar12[7] = CONCAT26(sVar43 - (short)((uint)((sVar43 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                   0xd010000) >> 0x10),
                            CONCAT24(sVar42 - (short)((uint)((sVar42 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                            0xd010000) >> 0x10),
                                     CONCAT22(sVar41 - (short)((uint)((sVar41 * 0x4ebf + 0x2000000
                                                                      >> 0x1a) * 0xd010000) >> 0x10)
                                              ,(short)uVar6 -
                                               (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      puVar12[6] = CONCAT26(sVar40 - (short)((uint)((sVar40 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                   0xd010000) >> 0x10),
                            CONCAT24(sVar39 - (short)((uint)((sVar39 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                            0xd010000) >> 0x10),
                                     CONCAT22(sVar38 - (short)((uint)((sVar38 * 0x4ebf + 0x2000000
                                                                      >> 0x1a) * 0xd010000) >> 0x10)
                                              ,(short)uVar5 -
                                               (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                              0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar12[9];
      sVar25 = (short)((ulong)uVar4 >> 0x10);
      sVar26 = (short)((ulong)uVar4 >> 0x20);
      sVar27 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar12[8];
      sVar22 = (short)((ulong)uVar3 >> 0x10);
      sVar23 = (short)((ulong)uVar3 >> 0x20);
      sVar24 = (short)((ulong)uVar3 >> 0x30);
      uVar32 = puVar12[0xb];
      uVar28 = puVar12[10];
      uVar37 = puVar12[0xd];
      uVar33 = puVar12[0xc];
      uVar6 = puVar12[0xf];
      sVar41 = (short)((ulong)uVar6 >> 0x10);
      sVar42 = (short)((ulong)uVar6 >> 0x20);
      sVar43 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar12[0xe];
      sVar38 = (short)((ulong)uVar5 >> 0x10);
      sVar39 = (short)((ulong)uVar5 >> 0x20);
      sVar40 = (short)((ulong)uVar5 >> 0x30);
      sVar16 = (short)((ulong)uVar32 >> 0x10);
      sVar18 = (short)((ulong)uVar32 >> 0x20);
      sVar20 = (short)((ulong)uVar32 >> 0x30);
      sVar29 = (short)((ulong)uVar28 >> 0x10);
      sVar30 = (short)((ulong)uVar28 >> 0x20);
      sVar31 = (short)((ulong)uVar28 >> 0x30);
      sVar17 = (short)((ulong)uVar37 >> 0x10);
      sVar19 = (short)((ulong)uVar37 >> 0x20);
      sVar21 = (short)((ulong)uVar37 >> 0x30);
      sVar34 = (short)((ulong)uVar33 >> 0x10);
      sVar35 = (short)((ulong)uVar33 >> 0x20);
      sVar36 = (short)((ulong)uVar33 >> 0x30);
      puVar12[9] = CONCAT26(sVar27 + (short)(sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                            CONCAT24(sVar26 + (short)(sVar26 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                     CONCAT22(sVar25 + (short)(sVar25 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * -0xd01,
                                              (short)uVar4 +
                                              (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) *
                                              -0xd01)));
      puVar12[8] = CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                            CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                                     CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a)
                                                       * -0xd01,
                                              (short)uVar3 +
                                              (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) *
                                              -0xd01)));
      puVar12[0xb] = CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                              CONCAT24(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                -0xd01,
                                       CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar32 +
                                                (short)((short)uVar32 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar12[10] = CONCAT26(sVar31 + (short)(sVar31 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT24(sVar30 + (short)(sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,CONCAT22(sVar29 + (short)(sVar29 * 0x4ebf + 0x2000000 >> 0x1a
                                                                ) * -0xd01,
                                                (short)uVar28 +
                                                (short)((short)uVar28 * 0x4ebf + 0x2000000 >> 0x1a)
                                                * -0xd01)));
      puVar12[0xd] = CONCAT26(sVar21 - (short)((uint)((sVar21 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar19 - (short)((uint)((sVar19 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar17 - (short)((uint)((sVar17 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar37 -
                                                (short)((uint)(((short)uVar37 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar12[0xc] = CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar33 -
                                                (short)((uint)(((short)uVar33 * 0x4ebf + 0x2000000
                                                               >> 0x1a) * 0xd010000) >> 0x10))));
      puVar12[0xf] = CONCAT26(sVar43 - (short)((uint)((sVar43 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar42 - (short)((uint)((sVar42 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar41 - (short)((uint)((sVar41 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar6 -
                                                (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      puVar12[0xe] = CONCAT26(sVar40 - (short)((uint)((sVar40 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                     0xd010000) >> 0x10),
                              CONCAT24(sVar39 - (short)((uint)((sVar39 * 0x4ebf + 0x2000000 >> 0x1a)
                                                              * 0xd010000) >> 0x10),
                                       CONCAT22(sVar38 - (short)((uint)((sVar38 * 0x4ebf + 0x2000000
                                                                        >> 0x1a) * 0xd010000) >>
                                                                0x10),
                                                (short)uVar5 -
                                                (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >>
                                                               0x1a) * 0xd010000) >> 0x10))));
      uVar4 = puVar12[0x11];
      sVar25 = (short)((ulong)uVar4 >> 0x10);
      sVar26 = (short)((ulong)uVar4 >> 0x20);
      sVar27 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar12[0x10];
      sVar22 = (short)((ulong)uVar3 >> 0x10);
      sVar23 = (short)((ulong)uVar3 >> 0x20);
      sVar24 = (short)((ulong)uVar3 >> 0x30);
      uVar32 = puVar12[0x13];
      uVar28 = puVar12[0x12];
      uVar37 = puVar12[0x15];
      uVar33 = puVar12[0x14];
      uVar6 = puVar12[0x17];
      sVar41 = (short)((ulong)uVar6 >> 0x10);
      sVar42 = (short)((ulong)uVar6 >> 0x20);
      sVar43 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar12[0x16];
      sVar38 = (short)((ulong)uVar5 >> 0x10);
      sVar39 = (short)((ulong)uVar5 >> 0x20);
      sVar40 = (short)((ulong)uVar5 >> 0x30);
      sVar16 = (short)((ulong)uVar32 >> 0x10);
      sVar18 = (short)((ulong)uVar32 >> 0x20);
      sVar20 = (short)((ulong)uVar32 >> 0x30);
      sVar29 = (short)((ulong)uVar28 >> 0x10);
      sVar30 = (short)((ulong)uVar28 >> 0x20);
      sVar31 = (short)((ulong)uVar28 >> 0x30);
      sVar17 = (short)((ulong)uVar37 >> 0x10);
      sVar19 = (short)((ulong)uVar37 >> 0x20);
      sVar21 = (short)((ulong)uVar37 >> 0x30);
      sVar34 = (short)((ulong)uVar33 >> 0x10);
      sVar35 = (short)((ulong)uVar33 >> 0x20);
      sVar36 = (short)((ulong)uVar33 >> 0x30);
      puVar12[0x11] =
           CONCAT26(sVar27 + (short)(sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar26 + (short)(sVar26 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar25 + (short)(sVar25 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar4 +
                                       (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x10] =
           CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar3 +
                                       (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x13] =
           CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar32 +
                                       (short)((short)uVar32 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x12] =
           CONCAT26(sVar31 + (short)(sVar31 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar30 + (short)(sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar29 + (short)(sVar29 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar28 +
                                       (short)((short)uVar28 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x15] =
           CONCAT26(sVar21 - (short)((uint)((sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar19 - (short)((uint)((sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar17 - (short)((uint)((sVar17 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar37 -
                                      (short)((uint)(((short)uVar37 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x14] =
           CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar33 -
                                      (short)((uint)(((short)uVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x17] =
           CONCAT26(sVar43 - (short)((uint)((sVar43 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar42 - (short)((uint)((sVar42 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar41 - (short)((uint)((sVar41 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar6 -
                                      (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x16] =
           CONCAT26(sVar40 - (short)((uint)((sVar40 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar39 - (short)((uint)((sVar39 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar38 - (short)((uint)((sVar38 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar5 -
                                      (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      uVar4 = puVar12[0x19];
      sVar25 = (short)((ulong)uVar4 >> 0x10);
      sVar26 = (short)((ulong)uVar4 >> 0x20);
      sVar27 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar12[0x18];
      sVar22 = (short)((ulong)uVar3 >> 0x10);
      sVar23 = (short)((ulong)uVar3 >> 0x20);
      sVar24 = (short)((ulong)uVar3 >> 0x30);
      uVar32 = puVar12[0x1b];
      uVar28 = puVar12[0x1a];
      uVar37 = puVar12[0x1d];
      uVar33 = puVar12[0x1c];
      uVar6 = puVar12[0x1f];
      sVar41 = (short)((ulong)uVar6 >> 0x10);
      sVar42 = (short)((ulong)uVar6 >> 0x20);
      sVar43 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar12[0x1e];
      sVar38 = (short)((ulong)uVar5 >> 0x10);
      sVar39 = (short)((ulong)uVar5 >> 0x20);
      sVar40 = (short)((ulong)uVar5 >> 0x30);
      sVar16 = (short)((ulong)uVar32 >> 0x10);
      sVar18 = (short)((ulong)uVar32 >> 0x20);
      sVar20 = (short)((ulong)uVar32 >> 0x30);
      sVar29 = (short)((ulong)uVar28 >> 0x10);
      sVar30 = (short)((ulong)uVar28 >> 0x20);
      sVar31 = (short)((ulong)uVar28 >> 0x30);
      sVar17 = (short)((ulong)uVar37 >> 0x10);
      sVar19 = (short)((ulong)uVar37 >> 0x20);
      sVar21 = (short)((ulong)uVar37 >> 0x30);
      sVar34 = (short)((ulong)uVar33 >> 0x10);
      sVar35 = (short)((ulong)uVar33 >> 0x20);
      sVar36 = (short)((ulong)uVar33 >> 0x30);
      puVar12[0x19] =
           CONCAT26(sVar27 + (short)(sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar26 + (short)(sVar26 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar25 + (short)(sVar25 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar4 +
                                       (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x18] =
           CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar3 +
                                       (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x1b] =
           CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar32 +
                                       (short)((short)uVar32 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x1a] =
           CONCAT26(sVar31 + (short)(sVar31 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar30 + (short)(sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar29 + (short)(sVar29 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar28 +
                                       (short)((short)uVar28 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x1d] =
           CONCAT26(sVar21 - (short)((uint)((sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar19 - (short)((uint)((sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar17 - (short)((uint)((sVar17 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar37 -
                                      (short)((uint)(((short)uVar37 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x1c] =
           CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar33 -
                                      (short)((uint)(((short)uVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x1f] =
           CONCAT26(sVar43 - (short)((uint)((sVar43 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar42 - (short)((uint)((sVar42 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar41 - (short)((uint)((sVar41 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar6 -
                                      (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x1e] =
           CONCAT26(sVar40 - (short)((uint)((sVar40 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar39 - (short)((uint)((sVar39 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar38 - (short)((uint)((sVar38 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar5 -
                                      (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      uVar4 = puVar12[0x21];
      sVar25 = (short)((ulong)uVar4 >> 0x10);
      sVar26 = (short)((ulong)uVar4 >> 0x20);
      sVar27 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar12[0x20];
      sVar22 = (short)((ulong)uVar3 >> 0x10);
      sVar23 = (short)((ulong)uVar3 >> 0x20);
      sVar24 = (short)((ulong)uVar3 >> 0x30);
      uVar32 = puVar12[0x23];
      uVar28 = puVar12[0x22];
      uVar37 = puVar12[0x25];
      uVar33 = puVar12[0x24];
      uVar6 = puVar12[0x27];
      sVar41 = (short)((ulong)uVar6 >> 0x10);
      sVar42 = (short)((ulong)uVar6 >> 0x20);
      sVar43 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar12[0x26];
      sVar38 = (short)((ulong)uVar5 >> 0x10);
      sVar39 = (short)((ulong)uVar5 >> 0x20);
      sVar40 = (short)((ulong)uVar5 >> 0x30);
      sVar16 = (short)((ulong)uVar32 >> 0x10);
      sVar18 = (short)((ulong)uVar32 >> 0x20);
      sVar20 = (short)((ulong)uVar32 >> 0x30);
      sVar29 = (short)((ulong)uVar28 >> 0x10);
      sVar30 = (short)((ulong)uVar28 >> 0x20);
      sVar31 = (short)((ulong)uVar28 >> 0x30);
      sVar17 = (short)((ulong)uVar37 >> 0x10);
      sVar19 = (short)((ulong)uVar37 >> 0x20);
      sVar21 = (short)((ulong)uVar37 >> 0x30);
      sVar34 = (short)((ulong)uVar33 >> 0x10);
      sVar35 = (short)((ulong)uVar33 >> 0x20);
      sVar36 = (short)((ulong)uVar33 >> 0x30);
      puVar12[0x21] =
           CONCAT26(sVar27 + (short)(sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar26 + (short)(sVar26 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar25 + (short)(sVar25 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar4 +
                                       (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x20] =
           CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar3 +
                                       (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x23] =
           CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar32 +
                                       (short)((short)uVar32 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x22] =
           CONCAT26(sVar31 + (short)(sVar31 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar30 + (short)(sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar29 + (short)(sVar29 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar28 +
                                       (short)((short)uVar28 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x25] =
           CONCAT26(sVar21 - (short)((uint)((sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar19 - (short)((uint)((sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar17 - (short)((uint)((sVar17 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar37 -
                                      (short)((uint)(((short)uVar37 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x24] =
           CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar33 -
                                      (short)((uint)(((short)uVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x27] =
           CONCAT26(sVar43 - (short)((uint)((sVar43 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar42 - (short)((uint)((sVar42 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar41 - (short)((uint)((sVar41 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar6 -
                                      (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x26] =
           CONCAT26(sVar40 - (short)((uint)((sVar40 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar39 - (short)((uint)((sVar39 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar38 - (short)((uint)((sVar38 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar5 -
                                      (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      uVar4 = puVar12[0x29];
      sVar25 = (short)((ulong)uVar4 >> 0x10);
      sVar26 = (short)((ulong)uVar4 >> 0x20);
      sVar27 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar12[0x28];
      sVar22 = (short)((ulong)uVar3 >> 0x10);
      sVar23 = (short)((ulong)uVar3 >> 0x20);
      sVar24 = (short)((ulong)uVar3 >> 0x30);
      uVar32 = puVar12[0x2b];
      uVar28 = puVar12[0x2a];
      uVar37 = puVar12[0x2d];
      uVar33 = puVar12[0x2c];
      uVar6 = puVar12[0x2f];
      sVar41 = (short)((ulong)uVar6 >> 0x10);
      sVar42 = (short)((ulong)uVar6 >> 0x20);
      sVar43 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar12[0x2e];
      sVar38 = (short)((ulong)uVar5 >> 0x10);
      sVar39 = (short)((ulong)uVar5 >> 0x20);
      sVar40 = (short)((ulong)uVar5 >> 0x30);
      sVar16 = (short)((ulong)uVar32 >> 0x10);
      sVar18 = (short)((ulong)uVar32 >> 0x20);
      sVar20 = (short)((ulong)uVar32 >> 0x30);
      sVar29 = (short)((ulong)uVar28 >> 0x10);
      sVar30 = (short)((ulong)uVar28 >> 0x20);
      sVar31 = (short)((ulong)uVar28 >> 0x30);
      sVar17 = (short)((ulong)uVar37 >> 0x10);
      sVar19 = (short)((ulong)uVar37 >> 0x20);
      sVar21 = (short)((ulong)uVar37 >> 0x30);
      sVar34 = (short)((ulong)uVar33 >> 0x10);
      sVar35 = (short)((ulong)uVar33 >> 0x20);
      sVar36 = (short)((ulong)uVar33 >> 0x30);
      puVar12[0x29] =
           CONCAT26(sVar27 + (short)(sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar26 + (short)(sVar26 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar25 + (short)(sVar25 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar4 +
                                       (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x28] =
           CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar3 +
                                       (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x2b] =
           CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar32 +
                                       (short)((short)uVar32 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x2a] =
           CONCAT26(sVar31 + (short)(sVar31 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar30 + (short)(sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar29 + (short)(sVar29 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar28 +
                                       (short)((short)uVar28 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x2d] =
           CONCAT26(sVar21 - (short)((uint)((sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar19 - (short)((uint)((sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar17 - (short)((uint)((sVar17 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar37 -
                                      (short)((uint)(((short)uVar37 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x2c] =
           CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar33 -
                                      (short)((uint)(((short)uVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x2f] =
           CONCAT26(sVar43 - (short)((uint)((sVar43 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar42 - (short)((uint)((sVar42 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar41 - (short)((uint)((sVar41 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar6 -
                                      (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x2e] =
           CONCAT26(sVar40 - (short)((uint)((sVar40 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar39 - (short)((uint)((sVar39 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar38 - (short)((uint)((sVar38 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar5 -
                                      (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      uVar4 = puVar12[0x31];
      sVar25 = (short)((ulong)uVar4 >> 0x10);
      sVar26 = (short)((ulong)uVar4 >> 0x20);
      sVar27 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar12[0x30];
      sVar22 = (short)((ulong)uVar3 >> 0x10);
      sVar23 = (short)((ulong)uVar3 >> 0x20);
      sVar24 = (short)((ulong)uVar3 >> 0x30);
      uVar32 = puVar12[0x33];
      uVar28 = puVar12[0x32];
      uVar37 = puVar12[0x35];
      uVar33 = puVar12[0x34];
      uVar6 = puVar12[0x37];
      sVar41 = (short)((ulong)uVar6 >> 0x10);
      sVar42 = (short)((ulong)uVar6 >> 0x20);
      sVar43 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar12[0x36];
      sVar38 = (short)((ulong)uVar5 >> 0x10);
      sVar39 = (short)((ulong)uVar5 >> 0x20);
      sVar40 = (short)((ulong)uVar5 >> 0x30);
      sVar16 = (short)((ulong)uVar32 >> 0x10);
      sVar18 = (short)((ulong)uVar32 >> 0x20);
      sVar20 = (short)((ulong)uVar32 >> 0x30);
      sVar29 = (short)((ulong)uVar28 >> 0x10);
      sVar30 = (short)((ulong)uVar28 >> 0x20);
      sVar31 = (short)((ulong)uVar28 >> 0x30);
      sVar17 = (short)((ulong)uVar37 >> 0x10);
      sVar19 = (short)((ulong)uVar37 >> 0x20);
      sVar21 = (short)((ulong)uVar37 >> 0x30);
      sVar34 = (short)((ulong)uVar33 >> 0x10);
      sVar35 = (short)((ulong)uVar33 >> 0x20);
      sVar36 = (short)((ulong)uVar33 >> 0x30);
      puVar12[0x31] =
           CONCAT26(sVar27 + (short)(sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar26 + (short)(sVar26 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar25 + (short)(sVar25 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar4 +
                                       (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x30] =
           CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar3 +
                                       (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x33] =
           CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar32 +
                                       (short)((short)uVar32 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x32] =
           CONCAT26(sVar31 + (short)(sVar31 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar30 + (short)(sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar29 + (short)(sVar29 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar28 +
                                       (short)((short)uVar28 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x35] =
           CONCAT26(sVar21 - (short)((uint)((sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar19 - (short)((uint)((sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar17 - (short)((uint)((sVar17 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar37 -
                                      (short)((uint)(((short)uVar37 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x34] =
           CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar33 -
                                      (short)((uint)(((short)uVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x37] =
           CONCAT26(sVar43 - (short)((uint)((sVar43 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar42 - (short)((uint)((sVar42 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar41 - (short)((uint)((sVar41 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar6 -
                                      (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x36] =
           CONCAT26(sVar40 - (short)((uint)((sVar40 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar39 - (short)((uint)((sVar39 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar38 - (short)((uint)((sVar38 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar5 -
                                      (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      uVar4 = puVar12[0x39];
      sVar25 = (short)((ulong)uVar4 >> 0x10);
      sVar26 = (short)((ulong)uVar4 >> 0x20);
      sVar27 = (short)((ulong)uVar4 >> 0x30);
      uVar3 = puVar12[0x38];
      sVar22 = (short)((ulong)uVar3 >> 0x10);
      sVar23 = (short)((ulong)uVar3 >> 0x20);
      sVar24 = (short)((ulong)uVar3 >> 0x30);
      uVar32 = puVar12[0x3b];
      uVar28 = puVar12[0x3a];
      uVar37 = puVar12[0x3d];
      uVar33 = puVar12[0x3c];
      uVar6 = puVar12[0x3f];
      sVar41 = (short)((ulong)uVar6 >> 0x10);
      sVar42 = (short)((ulong)uVar6 >> 0x20);
      sVar43 = (short)((ulong)uVar6 >> 0x30);
      uVar5 = puVar12[0x3e];
      sVar38 = (short)((ulong)uVar5 >> 0x10);
      sVar39 = (short)((ulong)uVar5 >> 0x20);
      sVar40 = (short)((ulong)uVar5 >> 0x30);
      sVar16 = (short)((ulong)uVar32 >> 0x10);
      sVar18 = (short)((ulong)uVar32 >> 0x20);
      sVar20 = (short)((ulong)uVar32 >> 0x30);
      sVar29 = (short)((ulong)uVar28 >> 0x10);
      sVar30 = (short)((ulong)uVar28 >> 0x20);
      sVar31 = (short)((ulong)uVar28 >> 0x30);
      sVar17 = (short)((ulong)uVar37 >> 0x10);
      sVar19 = (short)((ulong)uVar37 >> 0x20);
      sVar21 = (short)((ulong)uVar37 >> 0x30);
      sVar34 = (short)((ulong)uVar33 >> 0x10);
      sVar35 = (short)((ulong)uVar33 >> 0x20);
      sVar36 = (short)((ulong)uVar33 >> 0x30);
      puVar12[0x39] =
           CONCAT26(sVar27 + (short)(sVar27 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar26 + (short)(sVar26 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar25 + (short)(sVar25 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar4 +
                                       (short)((short)uVar4 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x38] =
           CONCAT26(sVar24 + (short)(sVar24 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar23 + (short)(sVar23 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar22 + (short)(sVar22 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar3 +
                                       (short)((short)uVar3 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01))
                   );
      puVar12[0x3b] =
           CONCAT26(sVar20 + (short)(sVar20 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar18 + (short)(sVar18 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar16 + (short)(sVar16 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar32 +
                                       (short)((short)uVar32 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x3a] =
           CONCAT26(sVar31 + (short)(sVar31 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                    CONCAT24(sVar30 + (short)(sVar30 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01,
                             CONCAT22(sVar29 + (short)(sVar29 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01
                                      ,(short)uVar28 +
                                       (short)((short)uVar28 * 0x4ebf + 0x2000000 >> 0x1a) * -0xd01)
                            ));
      puVar12[0x3d] =
           CONCAT26(sVar21 - (short)((uint)((sVar21 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar19 - (short)((uint)((sVar19 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar17 - (short)((uint)((sVar17 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar37 -
                                      (short)((uint)(((short)uVar37 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x3c] =
           CONCAT26(sVar36 - (short)((uint)((sVar36 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar35 - (short)((uint)((sVar35 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar34 - (short)((uint)((sVar34 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar33 -
                                      (short)((uint)(((short)uVar33 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x3f] =
           CONCAT26(sVar43 - (short)((uint)((sVar43 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar42 - (short)((uint)((sVar42 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar41 - (short)((uint)((sVar41 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar6 -
                                      (short)((uint)(((short)uVar6 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      puVar12[0x3e] =
           CONCAT26(sVar40 - (short)((uint)((sVar40 * 0x4ebf + 0x2000000 >> 0x1a) * 0xd010000) >>
                                    0x10),
                    CONCAT24(sVar39 - (short)((uint)((sVar39 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10),
                             CONCAT22(sVar38 - (short)((uint)((sVar38 * 0x4ebf + 0x2000000 >> 0x1a)
                                                             * 0xd010000) >> 0x10),
                                      (short)uVar5 -
                                      (short)((uint)(((short)uVar5 * 0x4ebf + 0x2000000 >> 0x1a) *
                                                    0xd010000) >> 0x10))));
      bVar1 = uVar15 < *puVar10;
      uVar14 = uVar15;
      uVar15 = (ulong)((int)uVar15 + 1);
    } while (bVar1);
  }
  return puVar8;
}

