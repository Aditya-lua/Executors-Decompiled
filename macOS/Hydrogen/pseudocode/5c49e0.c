
void FUN_005c49e0(long param_1,undefined1 param_2 [16],undefined1 param_3 [16],undefined8 param_4,
                 long param_5)

{
  uint *puVar1;
  ulong *puVar2;
  long *plVar3;
  bool bVar4;
  bool bVar5;
  long lVar6;
  uint uVar7;
  long lVar8;
  code *pcVar9;
  bool bVar10;
  int *piVar11;
  undefined8 *puVar12;
  undefined *puVar13;
  ulong uVar14;
  long extraout_x8;
  long lVar15;
  undefined8 extraout_x8_00;
  undefined8 extraout_x9;
  undefined8 extraout_x10;
  undefined8 extraout_x10_00;
  undefined8 uVar16;
  undefined8 extraout_x10_01;
  byte bVar17;
  code *extraout_x11;
  code *extraout_x11_00;
  ulong uVar18;
  ulong uVar19;
  code *extraout_x11_01;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong unaff_x20;
  byte bVar24;
  ulong unaff_x21;
  long *plVar25;
  ulong unaff_x22;
  undefined8 *puVar26;
  uint unaff_w24;
  ulong unaff_x26;
  ulong *puVar27;
  long unaff_x29;
  long lVar28;
  long lVar29;
  byte bVar30;
  byte bVar31;
  byte bVar34;
  byte bVar35;
  byte bVar36;
  byte bVar37;
  byte bVar38;
  byte bVar39;
  byte bVar40;
  byte bVar41;
  byte bVar42;
  byte bVar43;
  byte bVar44;
  byte bVar45;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar46;
  byte bVar47;
  byte bVar48;
  byte bVar49;
  byte bVar50;
  byte bVar51;
  byte bVar52;
  byte bVar53;
  byte bVar54;
  byte bVar55;
  byte bVar56;
  byte bVar57;
  byte bVar58;
  byte bVar59;
  byte bVar60;
  byte bVar61;
  byte bVar62;
  byte bVar63;
  byte bVar64;
  byte bVar65;
  byte bVar66;
  byte bVar67;
  byte bVar68;
  undefined1 auVar69 [16];
  undefined1 auVar70 [12];
  undefined8 *in_stack_00000000;
  undefined8 in_stack_00000008;
  long in_stack_00000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  code *in_stack_00000048;
  long in_stack_00000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  uint in_stack_00000088;
  undefined8 uStack0000000000000090;
  long in_stack_00000098;
  ulong in_stack_000000a0;
  undefined8 uStack00000000000000b0;
  ulong in_stack_000000b8;
  ulong in_stack_000000c0;
  long in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 uStack00000000000000e8;
  long in_stack_000000f0;
  ulong in_stack_000000f8;
  undefined8 uStack0000000000000100;
  ulong in_stack_00000108;
  long in_stack_00000110;
  long in_stack_00000118;
  undefined8 uStack0000000000000120;
  undefined8 in_stack_00000128;
  undefined4 uStack0000000000000130;
  undefined4 uStack0000000000000134;
  undefined4 uStack0000000000000138;
  undefined4 uStack000000000000013c;
  undefined4 uStack0000000000000140;
  uint uStack0000000000000144;
  undefined4 uStack0000000000000148;
  undefined4 uStack000000000000014c;
  undefined4 uStack0000000000000150;
  undefined4 uStack0000000000000154;
  long lStack0000000000000158;
  long lStack0000000000000160;
  ulong uStack0000000000000168;
  undefined8 uStack0000000000000170;
  
  uVar46 = param_3._8_8_;
  uVar33 = param_3._0_8_;
  uVar16 = param_2._8_8_;
  uVar32 = param_2._0_8_;
code_r0x005c49e0:
  uStack000000000000013c = (undefined4)uVar46;
  uStack0000000000000140 = (undefined4)((ulong)uVar46 >> 0x20);
  uStack0000000000000134 = (undefined4)uVar33;
  uStack0000000000000138 = (undefined4)((ulong)uVar33 >> 0x20);
  uStack000000000000014c = (undefined4)uVar16;
  uStack0000000000000150 = (undefined4)((ulong)uVar16 >> 0x20);
  uStack0000000000000144 = (uint)uVar32;
  uStack0000000000000148 = (undefined4)((ulong)uVar32 >> 0x20);
  uVar18 = in_stack_00000108 & unaff_x20;
  lVar28 = *(long *)((long)uStack0000000000000100 + uVar18);
  uVar20 = CONCAT17(-(lVar28 < 0),
                    CONCAT16(-((char)((ulong)lVar28 >> 0x30) < '\0'),
                             CONCAT15(-((char)((ulong)lVar28 >> 0x28) < '\0'),
                                      CONCAT14(-((char)((ulong)lVar28 >> 0x20) < '\0'),
                                               CONCAT13(-((char)((ulong)lVar28 >> 0x18) < '\0'),
                                                        CONCAT12(-((char)((ulong)lVar28 >> 0x10) <
                                                                  '\0'),CONCAT11(-((char)((ulong)
                                                  lVar28 >> 8) < '\0'),-((char)lVar28 < '\0'))))))))
  ;
  if (uVar20 == 0) {
    lVar28 = 8;
    do {
      uVar18 = uVar18 + lVar28 & in_stack_00000108;
      lVar29 = *(long *)((long)uStack0000000000000100 + uVar18);
      uVar20 = CONCAT17(-(lVar29 < 0),
                        CONCAT16(-((char)((ulong)lVar29 >> 0x30) < '\0'),
                                 CONCAT15(-((char)((ulong)lVar29 >> 0x28) < '\0'),
                                          CONCAT14(-((char)((ulong)lVar29 >> 0x20) < '\0'),
                                                   CONCAT13(-((char)((ulong)lVar29 >> 0x18) < '\0'),
                                                            CONCAT12(-((char)((ulong)lVar29 >> 0x10)
                                                                      < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar29 >> 8) < '\0'),-((char)lVar29 < '\0'))
                                                  ))))));
      lVar28 = lVar28 + 8;
    } while (uVar20 == 0);
  }
  uVar20 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
  uVar20 = (uVar20 & 0xcccccccccccccccc) >> 2 | (uVar20 & 0x3333333333333333) << 2;
  uVar20 = (uVar20 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar20 & 0xf0f0f0f0f0f0f0f) << 4;
  uVar20 = (uVar20 & 0xff00ff00ff00ff00) >> 8 | (uVar20 & 0xff00ff00ff00ff) << 8;
  uVar20 = (uVar20 & 0xffff0000ffff0000) >> 0x10 | (uVar20 & 0xffff0000ffff) << 0x10;
  uVar20 = uVar18 + ((ulong)LZCOUNT(uVar20 >> 0x20 | uVar20 << 0x20) >> 3) & in_stack_00000108;
  uVar18 = (ulong)*(char *)((long)uStack0000000000000100 + uVar20);
  if (-1 < *(char *)((long)uStack0000000000000100 + uVar20)) {
    lVar28 = *uStack0000000000000100;
    uVar18 = CONCAT17(-(lVar28 < 0),
                      CONCAT16(-((char)((ulong)lVar28 >> 0x30) < '\0'),
                               CONCAT15(-((char)((ulong)lVar28 >> 0x28) < '\0'),
                                        CONCAT14(-((char)((ulong)lVar28 >> 0x20) < '\0'),
                                                 CONCAT13(-((char)((ulong)lVar28 >> 0x18) < '\0'),
                                                          CONCAT12(-((char)((ulong)lVar28 >> 0x10) <
                                                                    '\0'),CONCAT11(-((char)((ulong)
                                                  lVar28 >> 8) < '\0'),-((char)lVar28 < '\0'))))))))
    ;
    uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
    uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
    uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
    uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
    uVar20 = (ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3;
    uVar18 = (ulong)*(byte *)((long)uStack0000000000000100 + uVar20);
  }
  *(char *)((long)uStack0000000000000100 + uVar20) = (char)unaff_x21;
  *(char *)((long)uStack0000000000000100 + (uVar20 - 8 & in_stack_00000108) + 8) = (char)unaff_x21;
  plVar25 = uStack0000000000000100 + uVar20 * -7;
  in_stack_00000110 = in_stack_00000110 - (uVar18 & 1);
  *(ulong *)((long)plVar25 + -0x2c) = CONCAT44(uStack000000000000013c,uStack0000000000000138);
  *(ulong *)((long)plVar25 + -0x34) = CONCAT44(uStack0000000000000134,uStack0000000000000130);
  *(uint *)(plVar25 + -7) = unaff_w24;
  *(ulong *)((long)plVar25 + -0x1c) = CONCAT44(uStack000000000000014c,uStack0000000000000148);
  *(ulong *)((long)plVar25 + -0x24) = CONCAT44(uStack0000000000000144,uStack0000000000000140);
  *(undefined4 *)((long)plVar25 + -0x14) = uStack0000000000000150;
  plVar25[-2] = param_1;
  plVar25[-1] = param_5;
  in_stack_00000118 = in_stack_00000118 + 1;
  do {
    lStack0000000000000158 = plVar25[-1];
    lVar28 = plVar25[-2];
    bVar24 = (byte)((ulong)lVar28 >> 8);
    bVar41 = (byte)((ulong)in_stack_00000070 >> 8);
    bVar31 = (byte)((ulong)lVar28 >> 0x10);
    bVar43 = (byte)((ulong)in_stack_00000070 >> 0x10);
    bVar38 = (byte)((ulong)lVar28 >> 0x18);
    bVar45 = (byte)((ulong)in_stack_00000070 >> 0x18);
    uStack0000000000000130 =
         CONCAT13(bVar38 ^ bVar45,
                  CONCAT12(bVar31 ^ bVar43,
                           CONCAT11(bVar24 ^ bVar41,(byte)lVar28 ^ (byte)in_stack_00000070)));
    bVar35 = (byte)((ulong)lVar28 >> 0x20);
    bVar47 = (byte)((ulong)in_stack_00000070 >> 0x20);
    bVar17 = (byte)((ulong)lVar28 >> 0x28);
    bVar48 = (byte)((ulong)in_stack_00000070 >> 0x28);
    bVar30 = (byte)((ulong)lVar28 >> 0x30);
    bVar34 = (byte)((ulong)lVar28 >> 0x38);
    bVar49 = (byte)((ulong)in_stack_00000070 >> 0x30);
    bVar50 = (byte)((ulong)in_stack_00000070 >> 0x38);
    bVar51 = (byte)((ulong)in_stack_00000078 >> 8);
    bVar52 = (byte)((ulong)in_stack_00000078 >> 0x10);
    bVar53 = (byte)((ulong)in_stack_00000078 >> 0x18);
    uStack0000000000000138 =
         CONCAT13(bVar38 ^ bVar53,
                  CONCAT12(bVar31 ^ bVar52,
                           CONCAT11(bVar24 ^ bVar51,(byte)lVar28 ^ (byte)in_stack_00000078)));
    bVar54 = (byte)((ulong)in_stack_00000078 >> 0x20);
    bVar55 = (byte)((ulong)in_stack_00000078 >> 0x28);
    bVar56 = (byte)((ulong)in_stack_00000078 >> 0x30);
    bVar57 = (byte)((ulong)in_stack_00000078 >> 0x38);
    bVar24 = (byte)((ulong)lStack0000000000000158 >> 8);
    bVar58 = (byte)(in_stack_00000060 >> 8);
    bVar31 = (byte)((ulong)lStack0000000000000158 >> 0x10);
    bVar59 = (byte)(in_stack_00000060 >> 0x10);
    bVar38 = (byte)((ulong)lStack0000000000000158 >> 0x18);
    bVar60 = (byte)(in_stack_00000060 >> 0x18);
    uStack0000000000000140 =
         CONCAT13(bVar38 ^ bVar60,
                  CONCAT12(bVar31 ^ bVar59,
                           CONCAT11(bVar24 ^ bVar58,
                                    (byte)lStack0000000000000158 ^ (byte)in_stack_00000060)));
    bVar36 = (byte)((ulong)lStack0000000000000158 >> 0x20);
    bVar61 = (byte)(in_stack_00000060 >> 0x20);
    bVar37 = (byte)((ulong)lStack0000000000000158 >> 0x28);
    bVar62 = (byte)(in_stack_00000060 >> 0x28);
    bVar39 = (byte)((ulong)lStack0000000000000158 >> 0x30);
    bVar40 = (byte)((ulong)lStack0000000000000158 >> 0x38);
    bVar63 = (byte)(in_stack_00000060 >> 0x30);
    bVar64 = (byte)(in_stack_00000060 >> 0x38);
    bVar65 = (byte)((ulong)in_stack_00000068 >> 8);
    bVar66 = (byte)((ulong)in_stack_00000068 >> 0x10);
    bVar67 = (byte)((ulong)in_stack_00000068 >> 0x18);
    uStack0000000000000148 =
         CONCAT13(bVar38 ^ bVar67,
                  CONCAT12(bVar31 ^ bVar66,
                           CONCAT11(bVar24 ^ bVar65,
                                    (byte)lStack0000000000000158 ^ (byte)in_stack_00000068)));
    bVar24 = (byte)((ulong)in_stack_00000068 >> 0x20);
    bVar31 = (byte)((ulong)in_stack_00000068 >> 0x28);
    bVar38 = (byte)((ulong)in_stack_00000068 >> 0x30);
    bVar68 = (byte)((ulong)in_stack_00000068 >> 0x38);
    uStack000000000000013c =
         (undefined4)
         (CONCAT17(bVar34 ^ bVar57,
                   CONCAT16(bVar30 ^ bVar56,
                            CONCAT15(bVar17 ^ bVar55,
                                     CONCAT14(bVar35 ^ bVar54,uStack0000000000000138)))) >> 0x20);
    uStack0000000000000134 =
         (undefined4)
         (CONCAT17(bVar34 ^ bVar50,
                   CONCAT16(bVar30 ^ bVar49,
                            CONCAT15(bVar17 ^ bVar48,
                                     CONCAT14(bVar35 ^ bVar47,uStack0000000000000130)))) >> 0x20);
    uStack000000000000014c =
         (undefined4)
         (CONCAT17(bVar40 ^ bVar68,
                   CONCAT16(bVar39 ^ bVar38,
                            CONCAT15(bVar37 ^ bVar31,
                                     CONCAT14(bVar36 ^ bVar24,uStack0000000000000148)))) >> 0x20);
    uStack0000000000000144 =
         (uint)(CONCAT17(bVar40 ^ bVar64,
                         CONCAT16(bVar39 ^ bVar63,
                                  CONCAT15(bVar37 ^ bVar62,
                                           CONCAT14(bVar36 ^ bVar61,uStack0000000000000140)))) >>
               0x20);
    uStack0000000000000150 = (undefined4)lVar28;
    uStack0000000000000154 = (undefined4)((ulong)lVar28 >> 0x20);
    uStack0000000000000168 = 0;
    uStack0000000000000170 = 0;
    lStack0000000000000160 = 0;
    uStack00000000000000e8._0_4_ = in_stack_00000088;
    func_0x00577d0c(&uStack0000000000000130,&uStack00000000000000e8,4);
    uVar20 = uStack0000000000000168;
    lVar8 = lStack0000000000000160;
    uVar7 = uStack0000000000000144;
    lVar28 = CONCAT44(uStack0000000000000134,uStack0000000000000130);
    lVar29 = CONCAT44(uStack000000000000013c,uStack0000000000000138);
    lVar6 = CONCAT44(uStack0000000000000144,uStack0000000000000140);
    uVar18 = CONCAT44(uStack000000000000014c,uStack0000000000000148);
    if (plVar25[-4] == 0) {
      func_0x007ae15c(plVar25 + -6,1,plVar25 + -2,1);
    }
    lVar15 = 0;
    bVar4 = false;
    uVar20 = uVar20 | lVar8 << 0x38;
    uVar18 = uVar20 ^ uVar18;
    uVar23 = lVar6 + lVar28;
    uVar22 = uVar23 ^ ((ulong)(uVar7 >> 0x13) | lVar6 << 0xd);
    uVar19 = uVar18 + lVar29;
    uVar21 = uVar19 + uVar22;
    uVar19 = uVar19 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
    uVar22 = uVar21 ^ (uVar22 >> 0x2f | uVar22 << 0x11);
    uVar18 = uVar19 + (uVar23 >> 0x20 | uVar23 << 0x20);
    uVar19 = uVar18 ^ (uVar19 >> 0x2b | uVar19 << 0x15);
    uVar18 = (uVar18 ^ uVar20) + uVar22;
    uVar22 = uVar18 ^ (uVar22 >> 0x33 | uVar22 << 0xd);
    uVar20 = uVar19 + ((uVar21 >> 0x20 | uVar21 << 0x20) ^ 0xff);
    uVar23 = uVar22 + uVar20;
    uVar20 = uVar20 ^ (uVar19 >> 0x30 | uVar19 << 0x10);
    uVar21 = uVar23 ^ (uVar22 >> 0x2f | uVar22 << 0x11);
    uVar18 = uVar20 + (uVar18 >> 0x20 | uVar18 << 0x20);
    uVar19 = uVar21 + uVar18;
    uVar18 = uVar18 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar21 = uVar19 ^ (uVar21 >> 0x33 | uVar21 << 0xd);
    uVar20 = uVar18 + (uVar23 >> 0x20 | uVar23 << 0x20);
    uVar23 = uVar21 + uVar20;
    uVar20 = uVar20 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
    uVar21 = uVar23 ^ (uVar21 >> 0x2f | uVar21 << 0x11);
    uVar18 = uVar20 + (uVar19 >> 0x20 | uVar19 << 0x20);
    uVar19 = uVar18 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar21 = uVar21 + uVar18 ^ (uVar21 >> 0x33 | uVar21 << 0xd);
    uVar18 = uVar19 + (uVar23 >> 0x20 | uVar23 << 0x20);
    uVar20 = uVar21 + uVar18;
    uVar18 = uVar18 ^ (uVar19 >> 0x30 | uVar19 << 0x10);
    uVar18 = (uVar18 >> 0x2b | uVar18 << 0x15) ^ (uVar21 >> 0x2f | uVar21 << 0x11) ^
             (uVar20 >> 0x20 | uVar20 << 0x20) ^ uVar20;
    plVar3 = (long *)plVar25[-6];
    uVar23 = plVar25[-5];
    bVar35 = (byte)(uVar18 >> 0x38);
    bVar17 = bVar35 >> 1;
    while( true ) {
      uVar18 = uVar18 & uVar23;
      lVar28 = *(long *)((long)plVar3 + uVar18);
      bVar30 = (byte)lVar28;
      bVar34 = (byte)((ulong)lVar28 >> 8);
      bVar36 = (byte)((ulong)lVar28 >> 0x10);
      bVar37 = (byte)((ulong)lVar28 >> 0x18);
      bVar39 = (byte)((ulong)lVar28 >> 0x20);
      bVar40 = (byte)((ulong)lVar28 >> 0x28);
      bVar42 = (byte)((ulong)lVar28 >> 0x30);
      bVar44 = (byte)((ulong)lVar28 >> 0x38);
      for (uVar19 = CONCAT17(-(bVar44 == bVar17),
                             CONCAT16(-(bVar42 == bVar17),
                                      CONCAT15(-(bVar40 == bVar17),
                                               CONCAT14(-(bVar39 == bVar17),
                                                        CONCAT13(-(bVar37 == bVar17),
                                                                 CONCAT12(-(bVar36 == bVar17),
                                                                          CONCAT11(-(bVar34 ==
                                                                                    bVar17),-(bVar30
                                                                                             == 
                                                  bVar17)))))))) & 0x8080808080808080; uVar19 != 0;
          uVar19 = uVar19 - 1 & uVar19) {
        uVar21 = (uVar19 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar19 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar21 = (uVar21 & 0xffff0000ffff0000) >> 0x10 | (uVar21 & 0xffff0000ffff) << 0x10;
        if (in_stack_00000088 ==
            *(uint *)((long)plVar3 +
                     (uVar18 + ((ulong)LZCOUNT(uVar21 >> 0x20 | uVar21 << 0x20) >> 3) & uVar23) * -4
                     + -4)) goto joined_r0x005c4780;
      }
      uVar21 = CONCAT17(-(lVar28 < 0),
                        CONCAT16(-((char)bVar42 < '\0'),
                                 CONCAT15(-((char)bVar40 < '\0'),
                                          CONCAT14(-((char)bVar39 < '\0'),
                                                   CONCAT13(-((char)bVar37 < '\0'),
                                                            CONCAT12(-((char)bVar36 < '\0'),
                                                                     CONCAT11(-((char)bVar34 < '\0')
                                                                              ,-((char)bVar30 < '\0'
                                                                                ))))))));
      uVar19 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
      uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
      uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
      uVar19 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
      if (!bVar4) {
        uVar20 = uVar18 + ((ulong)LZCOUNT(uVar19 >> 0x20 | uVar19 << 0x20) >> 3) & uVar23;
      }
      bVar4 = bVar4 || uVar21 != 0;
      bVar30 = NEON_umaxv(CONCAT17(-(bVar44 == 0xff),
                                   CONCAT16(-(bVar42 == 0xff),
                                            CONCAT15(-(bVar40 == 0xff),
                                                     CONCAT14(-(bVar39 == 0xff),
                                                              CONCAT13(-(bVar37 == 0xff),
                                                                       CONCAT12(-(bVar36 == 0xff),
                                                                                CONCAT11(-(bVar34 ==
                                                                                          0xff),-(
                                                  bVar30 == 0xff)))))))),1);
      if ((bVar30 & 1) != 0) break;
      lVar15 = lVar15 + 8;
      uVar18 = uVar18 + lVar15;
    }
    uVar18 = (ulong)*(char *)((long)plVar3 + uVar20);
    if (-1 < *(char *)((long)plVar3 + uVar20)) {
      lVar28 = *plVar3;
      uVar18 = CONCAT17(-(lVar28 < 0),
                        CONCAT16(-((char)((ulong)lVar28 >> 0x30) < '\0'),
                                 CONCAT15(-((char)((ulong)lVar28 >> 0x28) < '\0'),
                                          CONCAT14(-((char)((ulong)lVar28 >> 0x20) < '\0'),
                                                   CONCAT13(-((char)((ulong)lVar28 >> 0x18) < '\0'),
                                                            CONCAT12(-((char)((ulong)lVar28 >> 0x10)
                                                                      < '\0'),CONCAT11(-((char)((
                                                  ulong)lVar28 >> 8) < '\0'),-((char)lVar28 < '\0'))
                                                  ))))));
      uVar18 = (uVar18 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar18 & 0x5555555555555555) << 1;
      uVar18 = (uVar18 & 0xcccccccccccccccc) >> 2 | (uVar18 & 0x3333333333333333) << 2;
      uVar18 = (uVar18 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar18 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar18 = (uVar18 & 0xff00ff00ff00ff00) >> 8 | (uVar18 & 0xff00ff00ff00ff) << 8;
      uVar18 = (uVar18 & 0xffff0000ffff0000) >> 0x10 | (uVar18 & 0xffff0000ffff) << 0x10;
      uVar20 = (ulong)LZCOUNT(uVar18 >> 0x20 | uVar18 << 0x20) >> 3;
      uVar18 = (ulong)*(byte *)((long)plVar3 + uVar20);
    }
    plVar25[-4] = plVar25[-4] - (uVar18 & 1);
    *(byte *)((long)plVar3 + uVar20) = bVar35 >> 1;
    *(byte *)((long)plVar3 + (uVar20 - 8 & uVar23) + 8) = bVar35 >> 1;
    plVar25[-3] = plVar25[-3] + 1;
    *(uint *)((long)plVar3 + uVar20 * -4 + -4) = in_stack_00000088;
joined_r0x005c4780:
    if (unaff_x26 <= in_stack_00000058) {
      do {
        while( true ) {
          while (unaff_x22 < unaff_x26) {
            lVar28 = in_stack_00000050 + unaff_x22 * 0x10;
            unaff_x22 = (ulong)*(uint *)(lVar28 + 4);
            unaff_w24 = *(uint *)(lVar28 + 8);
            if (unaff_w24 != 0xffffffff) goto code_r0x005c4804;
          }
          auVar70 = func_0x005d84e8(unaff_x29 + -0xd0,*(undefined8 *)(unaff_x29 + -0x78));
          uVar18 = in_stack_000000c0;
          in_stack_00000088 = auVar70._8_4_;
          if ((auVar70._0_8_ & 1) == 0) {
            if (*(long *)(unaff_x29 + -0xd0) != 0) {
              func_0x00187bd4(*(undefined8 *)(unaff_x29 + -200),*(long *)(unaff_x29 + -0xd0) << 2,4)
              ;
            }
            if (*(long *)(unaff_x29 + -0xb8) != 0) {
              func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xb0),*(long *)(unaff_x29 + -0xb8) << 2,4
                             );
            }
            if (*(long *)(unaff_x29 + -0x98) != 0) {
              func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x90),*(long *)(unaff_x29 + -0x98) << 2,4
                             );
            }
            uVar18 = in_stack_000000c0;
            lVar29 = in_stack_000000b8;
            *(ulong *)(unaff_x29 + -200) = in_stack_000000b8;
            *(long **)(unaff_x29 + -0xd0) = uStack00000000000000b0;
            *(ulong *)(unaff_x29 + -0xb0) = in_stack_00000108;
            *(long **)(unaff_x29 + -0xb8) = uStack0000000000000100;
            *(long *)(unaff_x29 + -0xa0) = in_stack_00000118;
            *(long *)(unaff_x29 + -0xa8) = in_stack_00000110;
            *(undefined8 *)(unaff_x29 + -0x90) = in_stack_00000128;
            *(undefined8 *)(unaff_x29 + -0x98) = uStack0000000000000120;
            in_stack_00000098 = in_stack_000000b8;
            uStack0000000000000090 = (ulong)uStack00000000000000b0;
            in_stack_000000a0 = in_stack_000000c0;
            in_stack_000000b8 = in_stack_00000108;
            uStack00000000000000b0 = uStack0000000000000100;
            in_stack_000000c8 = in_stack_00000118;
            in_stack_000000c0 = in_stack_00000110;
            in_stack_000000d8 = in_stack_00000128;
            in_stack_000000d0 = uStack0000000000000120;
            lVar28 = lVar29 + uVar18 * 4;
            *(long *)(unaff_x29 + -0xd0) = lVar29;
            *(long *)(unaff_x29 + -200) = lVar28;
            *(ulong *)(unaff_x29 + -0xc0) = uVar18;
            *(undefined8 *)(unaff_x29 + -0xc0) = 0;
            puVar26 = &uStack0000000000000100;
            func_0x005d7c08(&uStack0000000000000100,unaff_x29 + -0xd0);
            *(ulong *)(unaff_x29 + -200) = in_stack_000000b8;
            *(long **)(unaff_x29 + -0xd0) = uStack00000000000000b0;
            *(long *)(unaff_x29 + -0xb8) = in_stack_000000c8;
            *(ulong *)(unaff_x29 + -0xc0) = in_stack_000000c0;
            *(undefined8 *)(unaff_x29 + -0xa8) = in_stack_000000d8;
            *(undefined8 *)(unaff_x29 + -0xb0) = in_stack_000000d0;
            *(undefined8 **)(unaff_x29 + -0x68) = puVar26;
            uStack0000000000000130 = (undefined4)lVar29;
            uStack0000000000000134 = (undefined4)((ulong)lVar29 >> 0x20);
            _uStack0000000000000148 = unaff_x29 + -0x68;
            _uStack0000000000000138 = lVar28;
            _uStack0000000000000140 = unaff_x29 + -0xd0;
            func_0x005a4f54(&uStack00000000000000e8,&uStack0000000000000130,&UNK_009f24e8);
            func_0x00490eb8(unaff_x29 + -0xd0);
            if (uVar18 >> 0x3c == 0) {
              if (uVar18 == 0) {
                uVar23 = 0;
                uVar20 = 0xffffffffffffffff;
                puVar13 = &UNK_009f2658;
                goto code_r0x005c5004;
              }
              puVar26 = (undefined8 *)(uVar18 * 8);
              uVar32 = 8;
              puVar12 = (undefined8 *)func_0x00187bd0(puVar26,8);
              if (puVar12 != (undefined8 *)0x0) {
                lVar28 = uVar18 - 1;
                if (lVar28 == 0) {
                  in_stack_00000060 = 1;
                  puVar26 = puVar12;
                }
                else {
                  _memset(puVar12,0xff,puVar26 + -1);
                  puVar26 = (undefined8 *)((long)puVar12 + (long)(puVar26 + -1));
                  in_stack_00000060 = uVar18;
                }
                uVar23 = in_stack_000000f8;
                lVar29 = in_stack_000000f0;
                *puVar26 = 0xffffffffffffffff;
                puVar12[lVar28] = lVar28;
                if (lVar28 == 0) goto code_r0x005c4ebc;
                uVar20 = uVar18 - 2;
                bVar4 = false;
                goto code_r0x005c4de0;
              }
            }
            else {
              uVar32 = 0;
            }
            func_0x007a1f00(uVar32,puVar26,&UNK_009f2640);
            goto code_r0x005c5048;
          }
          if ((long *)in_stack_000000c0 == uStack00000000000000b0) {
            func_0x005bcf2c(&uStack00000000000000b0,&UNK_009f26d0);
          }
          *(uint *)(in_stack_000000b8 + uVar18 * 4) = in_stack_00000088;
          in_stack_000000c0 = uVar18 + 1;
          if (in_stack_00000088 < in_stack_00000018) break;
          in_stack_00000058 = 0xffffffff;
          unaff_x22 = 0xffffffff;
          if (0xffffffff < unaff_x26) goto code_r0x005c4784;
        }
        in_stack_00000058 =
             (ulong)*(uint *)(in_stack_00000010 + (ulong)in_stack_00000088 * 0x18 + 0x10);
        unaff_x22 = 0xffffffff;
      } while (unaff_x26 <= in_stack_00000058);
    }
code_r0x005c4784:
    puVar1 = (uint *)(in_stack_00000050 + in_stack_00000058 * 0x10);
    in_stack_00000058 = (ulong)*puVar1;
    unaff_w24 = puVar1[3];
code_r0x005c4804:
    bVar35 = (byte)((ulong)uStack0000000000000120 >> 8);
    bVar17 = (byte)((ulong)uStack0000000000000120 >> 0x10);
    bVar30 = (byte)((ulong)uStack0000000000000120 >> 0x18);
    uStack0000000000000130 =
         CONCAT13(bVar30 ^ bVar45,
                  CONCAT12(bVar17 ^ bVar43,
                           CONCAT11(bVar35 ^ bVar41,
                                    (byte)uStack0000000000000120 ^ (byte)in_stack_00000070)));
    bVar34 = (byte)((ulong)uStack0000000000000120 >> 0x20);
    bVar41 = (byte)((ulong)uStack0000000000000120 >> 0x28);
    bVar43 = (byte)((ulong)uStack0000000000000120 >> 0x30);
    bVar45 = (byte)((ulong)uStack0000000000000120 >> 0x38);
    uStack0000000000000138 =
         CONCAT13(bVar30 ^ bVar53,
                  CONCAT12(bVar17 ^ bVar52,
                           CONCAT11(bVar35 ^ bVar51,
                                    (byte)uStack0000000000000120 ^ (byte)in_stack_00000078)));
    bVar35 = (byte)((ulong)in_stack_00000128 >> 8);
    bVar17 = (byte)((ulong)in_stack_00000128 >> 0x10);
    bVar30 = (byte)((ulong)in_stack_00000128 >> 0x18);
    uStack0000000000000140 =
         CONCAT13(bVar30 ^ bVar60,
                  CONCAT12(bVar17 ^ bVar59,
                           CONCAT11(bVar35 ^ bVar58,
                                    (byte)in_stack_00000128 ^ (byte)in_stack_00000060)));
    bVar36 = (byte)((ulong)in_stack_00000128 >> 0x20);
    bVar37 = (byte)((ulong)in_stack_00000128 >> 0x28);
    bVar39 = (byte)((ulong)in_stack_00000128 >> 0x30);
    bVar40 = (byte)((ulong)in_stack_00000128 >> 0x38);
    uStack0000000000000148 =
         CONCAT13(bVar30 ^ bVar67,
                  CONCAT12(bVar17 ^ bVar66,
                           CONCAT11(bVar35 ^ bVar65,
                                    (byte)in_stack_00000128 ^ (byte)in_stack_00000068)));
    uStack000000000000013c =
         (undefined4)
         (CONCAT17(bVar45 ^ bVar57,
                   CONCAT16(bVar43 ^ bVar56,
                            CONCAT15(bVar41 ^ bVar55,
                                     CONCAT14(bVar34 ^ bVar54,uStack0000000000000138)))) >> 0x20);
    uStack0000000000000134 =
         (undefined4)
         (CONCAT17(bVar45 ^ bVar50,
                   CONCAT16(bVar43 ^ bVar49,
                            CONCAT15(bVar41 ^ bVar48,
                                     CONCAT14(bVar34 ^ bVar47,uStack0000000000000130)))) >> 0x20);
    uStack000000000000014c =
         (undefined4)
         (CONCAT17(bVar40 ^ bVar68,
                   CONCAT16(bVar39 ^ bVar38,
                            CONCAT15(bVar37 ^ bVar31,
                                     CONCAT14(bVar36 ^ bVar24,uStack0000000000000148)))) >> 0x20);
    uStack0000000000000144 =
         (uint)(CONCAT17(bVar40 ^ bVar64,
                         CONCAT16(bVar39 ^ bVar63,
                                  CONCAT15(bVar37 ^ bVar62,
                                           CONCAT14(bVar36 ^ bVar61,uStack0000000000000140)))) >>
               0x20);
    lStack0000000000000158 = in_stack_00000128;
    uStack0000000000000150 = (undefined4)uStack0000000000000120;
    uStack0000000000000154 = (undefined4)((ulong)uStack0000000000000120 >> 0x20);
    uStack0000000000000168 = 0;
    uStack0000000000000170 = 0;
    lStack0000000000000160 = 0;
    uStack00000000000000e8._0_4_ = unaff_w24;
    func_0x00577d0c(&uStack0000000000000130,&uStack00000000000000e8,4);
    lVar28 = 0;
    uVar22 = uStack0000000000000168 | lStack0000000000000160 << 0x38;
    uVar21 = uVar22 ^ CONCAT44(uStack000000000000014c,uStack0000000000000148);
    uVar18 = CONCAT44(uStack0000000000000144,uStack0000000000000140) +
             CONCAT44(uStack0000000000000134,uStack0000000000000130);
    uVar19 = uVar18 ^ ((ulong)(uStack0000000000000144 >> 0x13) |
                      CONCAT44(uStack0000000000000144,uStack0000000000000140) << 0xd);
    uVar20 = uVar21 + CONCAT44(uStack000000000000013c,uStack0000000000000138);
    uVar23 = uVar20 + uVar19;
    uVar20 = uVar20 ^ (uVar21 >> 0x30 | uVar21 << 0x10);
    uVar21 = uVar23 ^ (uVar19 >> 0x2f | uVar19 << 0x11);
    uVar18 = uVar20 + (uVar18 >> 0x20 | uVar18 << 0x20);
    uVar19 = uVar18 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar18 = (uVar18 ^ uVar22) + uVar21;
    uVar21 = uVar18 ^ (uVar21 >> 0x33 | uVar21 << 0xd);
    uVar20 = uVar19 + ((uVar23 >> 0x20 | uVar23 << 0x20) ^ 0xff);
    uVar23 = uVar21 + uVar20;
    uVar20 = uVar20 ^ (uVar19 >> 0x30 | uVar19 << 0x10);
    uVar21 = uVar23 ^ (uVar21 >> 0x2f | uVar21 << 0x11);
    uVar18 = uVar20 + (uVar18 >> 0x20 | uVar18 << 0x20);
    uVar19 = uVar21 + uVar18;
    uVar18 = uVar18 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar21 = uVar19 ^ (uVar21 >> 0x33 | uVar21 << 0xd);
    uVar20 = uVar18 + (uVar23 >> 0x20 | uVar23 << 0x20);
    uVar23 = uVar21 + uVar20;
    uVar20 = uVar20 ^ (uVar18 >> 0x30 | uVar18 << 0x10);
    uVar21 = uVar23 ^ (uVar21 >> 0x2f | uVar21 << 0x11);
    uVar18 = uVar20 + (uVar19 >> 0x20 | uVar19 << 0x20);
    uVar19 = uVar18 ^ (uVar20 >> 0x2b | uVar20 << 0x15);
    uVar21 = uVar21 + uVar18 ^ (uVar21 >> 0x33 | uVar21 << 0xd);
    uVar18 = uVar19 + (uVar23 >> 0x20 | uVar23 << 0x20);
    uVar20 = uVar21 + uVar18;
    uVar18 = uVar18 ^ (uVar19 >> 0x30 | uVar19 << 0x10);
    unaff_x20 = (uVar18 >> 0x2b | uVar18 << 0x15) ^ (uVar21 >> 0x2f | uVar21 << 0x11) ^
                (uVar20 >> 0x20 | uVar20 << 0x20) ^ uVar20;
    unaff_x21 = unaff_x20 >> 0x39;
    bVar24 = (byte)(unaff_x20 >> 0x39);
    uVar20 = unaff_x20 & in_stack_00000108;
    uVar32 = *(undefined8 *)((long)uStack0000000000000100 + uVar20);
    uVar18 = CONCAT17(-((byte)((ulong)uVar32 >> 0x38) == bVar24),
                      CONCAT16(-((byte)((ulong)uVar32 >> 0x30) == bVar24),
                               CONCAT15(-((byte)((ulong)uVar32 >> 0x28) == bVar24),
                                        CONCAT14(-((byte)((ulong)uVar32 >> 0x20) == bVar24),
                                                 CONCAT13(-((byte)((ulong)uVar32 >> 0x18) == bVar24)
                                                          ,CONCAT12(-((byte)((ulong)uVar32 >> 0x10)
                                                                     == bVar24),
                                                                    CONCAT11(-((byte)((ulong)uVar32
                                                                                     >> 8) == bVar24
                                                                              ),-((byte)uVar32 ==
                                                                                 bVar24)))))))) &
             0x8080808080808080;
    while( true ) {
      while (uVar18 == 0) {
        bVar31 = NEON_umaxv(CONCAT17(-((char)((ulong)uVar32 >> 0x38) == -1),
                                     CONCAT16(-((char)((ulong)uVar32 >> 0x30) == -1),
                                              CONCAT15(-((char)((ulong)uVar32 >> 0x28) == -1),
                                                       CONCAT14(-((char)((ulong)uVar32 >> 0x20) ==
                                                                 -1),CONCAT13(-((char)((ulong)uVar32
                                                                                      >> 0x18) == -1
                                                                               ),CONCAT12(-((char)((
                                                  ulong)uVar32 >> 0x10) == -1),
                                                  CONCAT11(-((char)((ulong)uVar32 >> 8) == -1),
                                                           -((char)uVar32 == -1)))))))),1);
        if ((bVar31 & 1) != 0) {
          if (in_stack_00000110 == 0) {
            func_0x007ad168(&uStack0000000000000100,1,&uStack0000000000000120,1);
          }
          piVar11 = (int *)(*in_stack_00000048)
                                     (&
                                      __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                                     );
          if (*piVar11 == 1) {
            lVar28 = (*extraout_x11)(extraout_x10);
            uVar32 = *(undefined8 *)(lVar28 + 0x10);
            uVar16 = extraout_x10_00;
            pcVar9 = extraout_x11_00;
          }
          else {
            uVar32 = func_0x0042b2b8();
            auVar69 = (*in_stack_00000048)
                                (uVar32,&
                                        __ZN3std4hash6random11RandomState3new4KEYS29__u7b__u7b_constant_u7d__u7d_28__u7b__u7b_closure_u7d__u7d_3VAL17h3498d7596e36c0fdE
                                );
            uVar32 = auVar69._8_8_;
            puVar26 = auVar69._0_8_;
            *puVar26 = 1;
            puVar26[1] = extraout_x8_00;
            puVar26[2] = uVar32;
            uVar16 = extraout_x10_01;
            pcVar9 = extraout_x11_01;
          }
          auVar69 = (*pcVar9)(uVar16,uVar32);
          param_5 = auVar69._8_8_;
          *(undefined8 *)(auVar69._0_8_ + 8) = extraout_x9;
          param_1 = extraout_x8;
          uVar32 = in_stack_00000020;
          uVar16 = in_stack_00000028;
          uVar33 = in_stack_00000030;
          uVar46 = in_stack_00000038;
          goto code_r0x005c49e0;
        }
        lVar28 = lVar28 + 8;
        uVar20 = uVar20 + lVar28 & in_stack_00000108;
        uVar32 = *(undefined8 *)((long)uStack0000000000000100 + uVar20);
        uVar18 = CONCAT17(-((byte)((ulong)uVar32 >> 0x38) == bVar24),
                          CONCAT16(-((byte)((ulong)uVar32 >> 0x30) == bVar24),
                                   CONCAT15(-((byte)((ulong)uVar32 >> 0x28) == bVar24),
                                            CONCAT14(-((byte)((ulong)uVar32 >> 0x20) == bVar24),
                                                     CONCAT13(-((byte)((ulong)uVar32 >> 0x18) ==
                                                               bVar24),CONCAT12(-((byte)((ulong)
                                                  uVar32 >> 0x10) == bVar24),
                                                  CONCAT11(-((byte)((ulong)uVar32 >> 8) == bVar24),
                                                           -((byte)uVar32 == bVar24)))))))) &
                 0x8080808080808080;
      }
      uVar23 = (uVar18 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar18 >> 7 & 0xff00ff00ff00ff) << 8;
      uVar23 = (uVar23 & 0xffff0000ffff0000) >> 0x10 | (uVar23 & 0xffff0000ffff) << 0x10;
      uVar23 = uVar20 + ((ulong)LZCOUNT(uVar23 >> 0x20 | uVar23 << 0x20) >> 3) & in_stack_00000108;
      if (*(uint *)(uStack0000000000000100 + uVar23 * -7 + -7) == unaff_w24) break;
      uVar18 = uVar18 - 1 & uVar18;
    }
    plVar25 = uStack0000000000000100 + uVar23 * -7;
  } while( true );
code_r0x005c4de0:
  bVar5 = bVar4;
  if (uVar23 <= uVar20) {
    puVar13 = &UNK_009f2670;
    goto code_r0x005c5004;
  }
  lVar28 = lVar29 + uVar20 * 0x18;
  puVar27 = *(ulong **)(lVar28 + 8);
  lVar28 = *(long *)(lVar28 + 0x10);
  uVar19 = lVar28 * 8;
  puVar2 = puVar27 + lVar28;
  do {
    uVar19 = uVar19 - 8;
    if (puVar27 == puVar2) {
      func_0x007a23d8(&UNK_008b5586,0x9e,&UNK_009f2688);
      goto code_r0x005c5048;
    }
    uVar21 = *puVar27;
    if (uVar18 <= uVar21) goto code_r0x005c4ff8;
    puVar27 = puVar27 + 1;
  } while (puVar12[uVar21] == -1);
  if (puVar27 != puVar2) {
    uVar22 = 0;
    do {
      uVar14 = puVar27[uVar22];
      if (uVar18 <= uVar14) {
        uVar21 = uVar14;
code_r0x005c4ff8:
        puVar13 = &UNK_009f26b8;
        uVar20 = uVar21;
        uVar23 = uVar18;
        goto code_r0x005c5004;
      }
      if (puVar12[uVar14] != -1) {
        uVar21 = func_0x005e2978(puVar12,uVar18);
      }
      uVar22 = uVar22 + 1;
    } while (uVar19 >> 3 != uVar22);
  }
  if (uVar18 <= uVar20) {
    puVar13 = &UNK_009f26a0;
    uVar23 = uVar18;
code_r0x005c5004:
    func_0x007a2570(uVar20,uVar23,puVar13);
code_r0x005c5048:
                    /* WARNING: Does not return */
    pcVar9 = (code *)SoftwareBreakpoint(1,0x5c504c);
    (*pcVar9)();
  }
  if (uVar21 != puVar12[uVar20]) {
    puVar12[uVar20] = uVar21;
    bVar5 = true;
  }
  bVar10 = uVar20 != 0;
  uVar20 = uVar20 - 1;
  if (!bVar10) {
    uVar20 = uVar18 - 2;
  }
  bVar4 = (bool)(bVar10 & bVar5);
  if ((!bVar10) && (!bVar5)) {
code_r0x005c4ebc:
    *(undefined8 **)(unaff_x29 + -0xd0) = puVar12;
    *(undefined8 **)(unaff_x29 + -200) = puVar12;
    *(ulong *)(unaff_x29 + -0xc0) = in_stack_00000060;
    *(undefined8 **)(unaff_x29 + -0xb8) = puVar12 + uVar18;
    *(undefined8 *)(unaff_x29 + -0xb0) = 0;
    *(undefined8 **)(unaff_x29 + -0xa8) = &uStack0000000000000090;
    func_0x005d7ab4(&uStack0000000000000130,unaff_x29 + -0xd0);
    lVar28 = in_stack_000000f0;
    *(undefined4 *)(in_stack_00000000 + 6) = in_stack_00000008._4_4_;
    in_stack_00000000[1] = _uStack0000000000000138;
    *in_stack_00000000 = CONCAT44(uStack0000000000000134,uStack0000000000000130);
    in_stack_00000000[3] = _uStack0000000000000148;
    in_stack_00000000[2] = _uStack0000000000000140;
    in_stack_00000000[5] = lStack0000000000000158;
    in_stack_00000000[4] = CONCAT44(uStack0000000000000154,uStack0000000000000150);
    if (in_stack_000000f8 != 0) {
      puVar26 = (undefined8 *)(in_stack_000000f0 + 8);
      uVar18 = in_stack_000000f8;
      do {
        if (puVar26[-1] != 0) {
          func_0x00187bd4(*puVar26,puVar26[-1] << 3,8);
        }
        puVar26 = puVar26 + 3;
        uVar18 = uVar18 - 1;
      } while (uVar18 != 0);
    }
    if (CONCAT44(uStack00000000000000e8._4_4_,(uint)uStack00000000000000e8) != 0) {
      func_0x00187bd4(lVar28,CONCAT44(uStack00000000000000e8._4_4_,(uint)uStack00000000000000e8) *
                             0x18,8);
    }
    if ((in_stack_00000108 != 0) && (lVar28 = in_stack_00000108 * 0x11 + 0x19, lVar28 != 0)) {
      func_0x00187bd4(uStack0000000000000100 + in_stack_00000108 * -2 + -2,lVar28,8);
    }
    if (uStack0000000000000090 != 0) {
      func_0x00187bd4(in_stack_00000098,uStack0000000000000090 << 2,4);
    }
    return;
  }
  goto code_r0x005c4de0;
}

