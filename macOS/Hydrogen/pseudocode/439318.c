
void FUN_00439318(undefined1 *param_1,long param_2,undefined8 param_3,long param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  undefined1 *puVar4;
  undefined8 extraout_x10;
  undefined8 extraout_x10_00;
  undefined8 extraout_x10_01;
  undefined8 extraout_x10_02;
  undefined8 extraout_x10_03;
  undefined8 extraout_x11;
  undefined8 extraout_x11_00;
  undefined8 extraout_x11_01;
  undefined8 extraout_x11_02;
  undefined8 extraout_x11_03;
  undefined8 extraout_x12;
  undefined8 extraout_x12_00;
  undefined8 extraout_x12_01;
  undefined8 extraout_x12_02;
  undefined8 extraout_x12_03;
  undefined8 extraout_x13;
  undefined8 extraout_x13_00;
  undefined8 extraout_x13_01;
  undefined8 extraout_x13_02;
  undefined8 extraout_x13_03;
  undefined8 extraout_x14;
  undefined8 extraout_x14_00;
  undefined8 extraout_x14_01;
  undefined8 extraout_x14_02;
  undefined8 extraout_x14_03;
  undefined8 extraout_x15;
  undefined8 extraout_x15_00;
  undefined8 extraout_x15_01;
  undefined8 extraout_x15_02;
  undefined8 extraout_x15_03;
  undefined8 extraout_x16;
  undefined8 extraout_x16_00;
  undefined8 extraout_x16_01;
  undefined8 extraout_x16_02;
  undefined8 extraout_x16_03;
  undefined8 extraout_x17;
  undefined8 extraout_x17_00;
  undefined8 uVar5;
  undefined8 extraout_x17_01;
  undefined8 extraout_x17_02;
  undefined8 extraout_x17_03;
  long unaff_x19;
  long *plVar6;
  ulong unaff_x20;
  long unaff_x21;
  long *unaff_x23;
  long unaff_x24;
  long unaff_x26;
  long unaff_x29;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined8 *in_stack_000000a8;
  undefined8 *in_stack_000000b0;
  long in_stack_00000138;
  long *in_stack_00000140;
  long *in_stack_00000148;
  undefined8 in_stack_00000280;
  undefined8 in_stack_00000288;
  undefined8 in_stack_00000290;
  undefined8 in_stack_00000298;
  undefined8 in_stack_000002a0;
  undefined8 in_stack_000002a8;
  undefined8 in_stack_000002b0;
  undefined8 in_stack_000002b8;
  undefined8 in_stack_000002c0;
  undefined8 in_stack_000002c8;
  undefined8 in_stack_000002d0;
  undefined8 in_stack_000002d8;
  undefined8 in_stack_000002e0;
  undefined8 in_stack_000002e8;
  undefined8 in_stack_000002f0;
  undefined8 in_stack_000002f8;
  undefined8 in_stack_00000300;
  undefined7 in_stack_00000308;
  undefined1 in_stack_0000030f;
  undefined7 in_stack_00000310;
  undefined7 in_stack_00000320;
  undefined1 in_stack_00000327;
  undefined7 in_stack_00000328;
  undefined1 in_stack_0000032f;
  undefined7 in_stack_00000330;
  undefined1 in_stack_00000337;
  undefined8 in_stack_00000338;
  undefined8 in_stack_00000370;
  undefined7 in_stack_00000378;
  undefined1 in_stack_0000037f;
  undefined7 in_stack_00000380;
  ulong in_stack_000003e0;
  undefined7 in_stack_000003e8;
  undefined1 in_stack_000003ef;
  byte in_stack_00000410;
  undefined7 in_stack_00000411;
  undefined1 in_stack_00000418;
  undefined7 in_stack_00000419;
  undefined1 in_stack_00000420;
  undefined7 in_stack_00000421;
  undefined8 in_stack_00000428;
  undefined8 in_stack_00000430;
  undefined8 in_stack_00000438;
  undefined8 in_stack_00000440;
  undefined8 in_stack_00000448;
  undefined8 in_stack_00000450;
  undefined8 in_stack_00000458;
  undefined8 in_stack_00000460;
  long in_stack_00000640;
  undefined1 auStack_7ffffffe [2147483646];
  
  do {
    puVar4 = auStack_7ffffffe + 0x8000040e;
    func_0x00407a20(param_1,param_2);
    if (in_stack_00000640 != 2) {
      _memcpy(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000063e,0x1c0);
      if (unaff_x20 == in_stack_000003e0) {
        func_0x0040443c(auStack_7ffffffe + 0x800003de);
        unaff_x24 = CONCAT17(in_stack_000003ef,in_stack_000003e8);
      }
      puVar4 = (undefined1 *)0x1c8;
      _memcpy(unaff_x24 + unaff_x20 * unaff_x19,auStack_7ffffffe + 0x8000040e);
      unaff_x20 = unaff_x20 + 1;
    }
    do {
      auVar24 = func_0x004074fc(auStack_7ffffffe + 0x8000040e,auStack_7ffffffe + 0x8000027e);
      if (CONCAT71(in_stack_00000411,in_stack_00000410) == 3) {
        func_0x003f5c50(auStack_7ffffffe + 0x800003de);
        *(ulong *)(unaff_x29 + -0x98) = CONCAT71(in_stack_00000419,in_stack_00000418);
        *(ulong *)(unaff_x29 + -0x90) = CONCAT71(in_stack_00000421,in_stack_00000420);
        *(undefined8 *)(unaff_x29 + -0xa0) = 0;
        auVar24 = func_0x003f55f4(auStack_7ffffffe + 0x8000031e);
        lVar3 = *unaff_x23;
        *unaff_x23 = lVar3 + -1;
        LORelease();
        uVar7 = extraout_x10;
        uVar8 = extraout_x11;
        uVar9 = extraout_x12;
        uVar10 = extraout_x13;
        uVar11 = extraout_x14;
        uVar12 = extraout_x15;
        uVar13 = extraout_x16;
        uVar5 = extraout_x17;
        if (lVar3 == 1) {
          DataMemoryBarrier(2,1);
          unaff_x19 = 0;
          auVar24 = func_0x00403ad4(auStack_7ffffffe + 0x80000316);
          uVar7 = extraout_x10_00;
          uVar8 = extraout_x11_00;
          uVar9 = extraout_x12_00;
          uVar10 = extraout_x13_00;
          uVar11 = extraout_x14_00;
          uVar12 = extraout_x15_00;
          uVar13 = extraout_x16_00;
          uVar5 = extraout_x17_00;
        }
        plVar1 = *(long **)(unaff_x29 + -0xa0);
joined_r0x00438e54:
        if (plVar1 == (long *)0x0) {
          func_0x003f5fec(unaff_x29 + -0xa0);
          *in_stack_000000a8 = 0x8000000000000000;
          if (*in_stack_00000140 != -0x8000000000000000) {
            func_0x003f73ec(in_stack_00000140);
          }
        }
        else {
          auVar22._8_8_ = param_5;
          auVar22._0_8_ = param_6;
          auVar21._8_8_ = unaff_x19;
          auVar21._0_8_ = CONCAT71(in_stack_00000419,in_stack_00000418);
          auVar20._8_8_ = uVar13;
          auVar20._0_8_ = uVar5;
          auVar19._8_8_ = uVar11;
          auVar19._0_8_ = uVar12;
          auVar18._8_8_ = uVar9;
          auVar18._0_8_ = uVar10;
          auVar17._8_8_ = uVar7;
          auVar17._0_8_ = uVar8;
          auVar16._8_8_ = puVar4;
          auVar16._0_8_ = param_4;
          uVar10 = *(undefined8 *)(unaff_x29 + -0x90);
          uVar7 = *(undefined8 *)(unaff_x29 + -0x98);
          uVar11 = *(undefined8 *)(unaff_x29 + -0x80);
          uVar8 = *(undefined8 *)(unaff_x29 + -0x88);
          uVar12 = *(undefined8 *)(unaff_x29 + -0x70);
          uVar9 = *(undefined8 *)(unaff_x29 + -0x78);
          if (*in_stack_00000140 == -0x8000000000000000) {
            in_stack_00000410 = 10;
            plVar6 = in_stack_00000140;
            in_stack_00000428 = in_stack_00000280;
            in_stack_00000430 = in_stack_00000288;
            in_stack_00000438 = in_stack_00000290;
            in_stack_00000440 = in_stack_00000298;
            in_stack_00000448 = in_stack_000002a0;
            in_stack_00000450 = in_stack_000002a8;
            in_stack_00000458 = in_stack_000002b0;
            in_stack_00000460 = in_stack_000002b8;
            in_stack_00000419 = in_stack_00000378;
            in_stack_00000420 = in_stack_0000037f;
            in_stack_00000421 = in_stack_00000380;
LAB_00438e94:
            in_stack_000000a8[0x3b] = uVar7;
            in_stack_000000a8[0x3a] = plVar1;
            in_stack_000000a8[0x3d] = uVar8;
            in_stack_000000a8[0x3c] = uVar10;
            in_stack_000000a8[0x3f] = uVar9;
            in_stack_000000a8[0x3e] = uVar11;
            in_stack_000000a8[0x40] = uVar12;
            *(undefined8 *)((long)in_stack_000000a8 + 0xa9) = in_stack_000002e8;
            *(undefined8 *)((long)in_stack_000000a8 + 0xa1) = in_stack_000002e0;
            *(undefined8 *)((long)in_stack_000000a8 + 0xb9) = in_stack_000002f8;
            *(undefined8 *)((long)in_stack_000000a8 + 0xb1) = in_stack_000002f0;
            *(ulong *)((long)in_stack_000000a8 + 0xc9) =
                 CONCAT17(in_stack_0000030f,in_stack_00000308);
            *(undefined8 *)((long)in_stack_000000a8 + 0xc1) = in_stack_00000300;
            in_stack_000000a8[0x1a] = CONCAT71(in_stack_00000310,in_stack_0000030f);
            *(undefined8 *)((long)in_stack_000000a8 + 0x89) = in_stack_000002c8;
            *(undefined8 *)((long)in_stack_000000a8 + 0x81) = in_stack_000002c0;
            *(undefined8 *)((long)in_stack_000000a8 + 0x99) = in_stack_000002d8;
            *(undefined8 *)((long)in_stack_000000a8 + 0x91) = in_stack_000002d0;
            in_stack_000000a8[0x1d] = CONCAT71(in_stack_00000421,in_stack_00000420);
            *(ulong *)((long)in_stack_000000a8 + 0xe1) =
                 CONCAT17(in_stack_00000420,in_stack_00000419);
            *(undefined8 *)((long)in_stack_000000a8 + 0xd9) = in_stack_00000370;
            in_stack_000000a8[0x23] = in_stack_00000450;
            in_stack_000000a8[0x22] = in_stack_00000448;
            in_stack_000000a8[0x25] = in_stack_00000460;
            in_stack_000000a8[0x24] = in_stack_00000458;
            in_stack_000000a8[0x1f] = in_stack_00000430;
            in_stack_000000a8[0x1e] = in_stack_00000428;
            in_stack_000000a8[0x21] = in_stack_00000440;
            in_stack_000000a8[0x20] = in_stack_00000438;
            uVar8 = in_stack_000000b0[1];
            uVar7 = *in_stack_000000b0;
            uVar10 = in_stack_000000b0[3];
            uVar9 = in_stack_000000b0[2];
            uVar11 = in_stack_000000b0[4];
            uVar13 = in_stack_000000b0[7];
            uVar12 = in_stack_000000b0[6];
            in_stack_000000a8[5] = in_stack_000000b0[5];
            in_stack_000000a8[4] = uVar11;
            in_stack_000000a8[7] = uVar13;
            in_stack_000000a8[6] = uVar12;
            in_stack_000000a8[1] = uVar8;
            *in_stack_000000a8 = uVar7;
            in_stack_000000a8[3] = uVar10;
            in_stack_000000a8[2] = uVar9;
            uVar8 = in_stack_000000b0[9];
            uVar7 = in_stack_000000b0[8];
            uVar10 = in_stack_000000b0[0xb];
            uVar9 = in_stack_000000b0[10];
            uVar11 = in_stack_000000b0[0xc];
            uVar13 = in_stack_000000b0[0xf];
            uVar12 = in_stack_000000b0[0xe];
            in_stack_000000a8[0xd] = in_stack_000000b0[0xd];
            in_stack_000000a8[0xc] = uVar11;
            in_stack_000000a8[0xf] = uVar13;
            in_stack_000000a8[0xe] = uVar12;
            in_stack_000000a8[9] = uVar8;
            in_stack_000000a8[8] = uVar7;
            in_stack_000000a8[0xb] = uVar10;
            in_stack_000000a8[10] = uVar9;
            *(byte *)(in_stack_000000a8 + 0x10) = in_stack_00000410;
            *(char *)(in_stack_000000a8 + 0x1b) = (char)unaff_x23;
            *(undefined1 (*) [16])(in_stack_000000a8 + 0x26) = auVar16;
            *(undefined1 (*) [16])(in_stack_000000a8 + 0x28) = auVar17;
            *(undefined1 (*) [16])(in_stack_000000a8 + 0x2a) = auVar18;
            *(undefined1 (*) [16])(in_stack_000000a8 + 0x2c) = auVar19;
            *(undefined1 (*) [16])(in_stack_000000a8 + 0x2e) = auVar20;
            in_stack_000000a8[0x30] = auVar24._8_8_;
            in_stack_000000a8[0x31] = auVar24._0_8_;
            *(undefined1 (*) [16])(in_stack_000000a8 + 0x32) = auVar21;
            *(undefined1 (*) [16])(in_stack_000000a8 + 0x34) = auVar22;
            in_stack_000000a8[0x36] = plVar6;
            in_stack_000000a8[0x37] = param_7;
            in_stack_000000a8[0x38] = 1;
            in_stack_000000a8[0x39] = 0;
            return;
          }
          auVar14 = func_0x0043e3ac(in_stack_00000140,&UNK_008856c9,0xf);
          if (auVar14._0_8_ == 0) {
            auVar14 = ZEXT816(1);
          }
          auVar15 = func_0x0043e3ac(in_stack_00000140,&UNK_0088574e,0xf);
          auVar16 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d27,0x11);
          if (auVar16._0_8_ == 0) {
            auVar16 = ZEXT816(1);
          }
          auVar17 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d38,0xf);
          if (auVar17._0_8_ == 0) {
            auVar17 = ZEXT816(1);
          }
          auVar18 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d47,0xf);
          if (auVar18._0_8_ == 0) {
            auVar18 = ZEXT816(1);
          }
          auVar19 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d8a,0xe);
          if (auVar19._0_8_ == 0) {
            auVar19 = ZEXT816(1);
          }
          auVar20 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d98,0x16);
          if (auVar20._0_8_ == 0) {
            auVar20 = ZEXT816(1);
          }
          auVar21 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d56,0xe);
          if (auVar21._0_8_ == 0) {
            auVar21 = ZEXT816(1);
          }
          auVar24._8_8_ = auVar21._0_8_;
          auVar24._0_8_ = auVar21._8_8_;
          auVar21 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d64,0x13);
          if (auVar21._0_8_ == 0) {
            auVar21 = ZEXT816(1);
          }
          auVar22 = func_0x0043e3ac(in_stack_00000140,&UNK_00887d77,0x13);
          if (auVar22._0_8_ == 0) {
            auVar22 = ZEXT816(1);
          }
          auVar23 = func_0x0043e3ac(in_stack_00000140,&UNK_008849d0,0x10);
          if (auVar23._0_8_ == 0) {
            auVar23._8_8_ = 0;
            auVar23._0_8_ = (undefined1 *)((long)&MACH_HEADER.magic + 1);
          }
          param_7 = auVar23._8_8_;
          plVar6 = auVar23._0_8_;
          func_0x004098a0(auStack_7ffffffe + 0x8000040e,auVar14._0_8_,auVar14._8_8_);
          if (in_stack_00000410 != 10) {
            if (auVar15._0_8_ == 0) {
              auVar15 = ZEXT816(1);
            }
            *(undefined8 *)(unaff_x29 + -0x98) = in_stack_00000430;
            *(undefined8 *)(unaff_x29 + -0xa0) = in_stack_00000428;
            *(undefined8 *)(unaff_x29 + -0x88) = in_stack_00000440;
            *(undefined8 *)(unaff_x29 + -0x90) = in_stack_00000438;
            *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000450;
            *(undefined8 *)(unaff_x29 + -0x80) = in_stack_00000448;
            *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000460;
            *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000458;
            func_0x004098a0(auStack_7ffffffe + 0x8000040e,auVar15._0_8_,auVar15._8_8_);
            unaff_x23 = (long *)(ulong)in_stack_00000410;
            if (in_stack_00000410 != 10) {
              in_stack_00000370 = CONCAT17(in_stack_00000418,in_stack_00000411);
              in_stack_0000030f = (undefined1)*(undefined8 *)(unaff_x29 + -0x68);
              in_stack_00000310 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x68) >> 8);
              in_stack_00000308 = (undefined7)((ulong)*(undefined8 *)(unaff_x29 + -0x70) >> 8);
              in_stack_000002c0 = CONCAT17(in_stack_00000418,in_stack_00000411);
              in_stack_000002c8 = CONCAT17(in_stack_00000420,in_stack_00000419);
              in_stack_000002d8 =
                   CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x98),
                            (int7)((ulong)*(undefined8 *)(unaff_x29 + -0xa0) >> 8));
              in_stack_000002d0 =
                   CONCAT17((char)*(undefined8 *)(unaff_x29 + -0xa0),in_stack_00000421);
              in_stack_000002e8 =
                   CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x88),
                            (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x90) >> 8));
              in_stack_000002e0 =
                   CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x90),
                            (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x98) >> 8));
              in_stack_000002f8 =
                   CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x78),
                            (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x80) >> 8));
              in_stack_000002f0 =
                   CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x80),
                            (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x88) >> 8));
              in_stack_00000300 =
                   CONCAT17((char)*(undefined8 *)(unaff_x29 + -0x70),
                            (int7)((ulong)*(undefined8 *)(unaff_x29 + -0x78) >> 8));
              func_0x003f73ec(in_stack_00000140);
              goto LAB_00438e94;
            }
          }
          *in_stack_000000a8 = 0x8000000000000000;
          func_0x003f73ec(in_stack_00000140);
          lVar3 = *plVar1;
          *plVar1 = lVar3 + -1;
          LORelease();
          if (lVar3 == 1) {
            DataMemoryBarrier(2,1);
            func_0x00403ad4(auStack_7ffffffe + 0x80000246);
          }
          func_0x003f55f4(auStack_7ffffffe + 0x8000024e);
          func_0x003f56c4(uVar9,uVar12);
        }
        if ((in_stack_00000138 == -0x8000000000000000) &&
           (*in_stack_00000148 != -0x8000000000000000)) {
          func_0x003f73ec(in_stack_00000148);
        }
        func_0x003f73ec(in_stack_000000b0);
        return;
      }
      in_stack_000002c8 = *(undefined8 *)(unaff_x26 + 0x20);
      in_stack_000002c0 = *(undefined8 *)(unaff_x26 + 0x18);
      in_stack_000002d8 = *(undefined8 *)(unaff_x26 + 0x30);
      in_stack_000002d0 = *(undefined8 *)(unaff_x26 + 0x28);
      in_stack_000002e8 = *(undefined8 *)(unaff_x26 + 0x40);
      in_stack_000002e0 = *(undefined8 *)(unaff_x26 + 0x38);
      in_stack_000002f0 = *(undefined8 *)(unaff_x26 + 0x48);
      if (CONCAT71(in_stack_00000411,in_stack_00000410) == 2) {
        if (unaff_x20 < in_stack_000003e0) {
          if (unaff_x20 == 0) {
            puVar4 = (undefined1 *)0x8;
            auVar24 = func_0x00187bd4(unaff_x24,in_stack_000003e0 * 0x1c8);
            unaff_x24 = 8;
            uVar7 = extraout_x10_03;
            uVar8 = extraout_x11_03;
            uVar9 = extraout_x12_03;
            uVar10 = extraout_x13_03;
            uVar11 = extraout_x14_03;
            uVar12 = extraout_x15_03;
            uVar13 = extraout_x16_03;
            uVar5 = extraout_x17_03;
          }
          else {
            puVar4 = (undefined1 *)0x8;
            param_4 = unaff_x20 * 0x1c8;
            auVar24 = func_0x00187bd8(unaff_x24);
            unaff_x24 = auVar24._0_8_;
            uVar7 = extraout_x10_02;
            uVar8 = extraout_x11_02;
            uVar9 = extraout_x12_02;
            uVar10 = extraout_x13_02;
            uVar11 = extraout_x14_02;
            uVar12 = extraout_x15_02;
            uVar13 = extraout_x16_02;
            uVar5 = extraout_x17_02;
            if (unaff_x24 == 0) {
              func_0x007a1f00(8,unaff_x20 * 0x1c8,&UNK_009d9dc8);
                    /* WARNING: Does not return */
              pcVar2 = (code *)SoftwareBreakpoint(1,0x43a74c);
              (*pcVar2)();
            }
          }
        }
        else {
          uVar7 = extraout_x10_01;
          uVar8 = extraout_x11_01;
          uVar9 = extraout_x12_01;
          uVar10 = extraout_x13_01;
          uVar11 = extraout_x14_01;
          uVar12 = extraout_x15_01;
          uVar13 = extraout_x16_01;
          uVar5 = extraout_x17_01;
        }
        *(ulong *)(unaff_x29 + -0x90) = CONCAT17(in_stack_0000032f,in_stack_00000328);
        *(ulong *)(unaff_x29 + -0x98) = CONCAT17(in_stack_00000327,in_stack_00000320);
        *(undefined8 *)(unaff_x29 + -0x80) = in_stack_00000338;
        *(ulong *)(unaff_x29 + -0x88) = CONCAT17(in_stack_00000337,in_stack_00000330);
        *(long **)(unaff_x29 + -0xa0) = unaff_x23;
        *(long *)(unaff_x29 + -0x78) = unaff_x24;
        *(ulong *)(unaff_x29 + -0x70) = unaff_x20;
        plVar1 = unaff_x23;
        goto joined_r0x00438e54;
      }
    } while ((in_stack_00000410 & 1) != 0);
    *(undefined8 *)(unaff_x26 + 0x20) = in_stack_000002c8;
    *(undefined8 *)(unaff_x26 + 0x18) = in_stack_000002c0;
    *(undefined8 *)(unaff_x26 + 0x30) = in_stack_000002d8;
    *(undefined8 *)(unaff_x26 + 0x28) = in_stack_000002d0;
    *(undefined8 *)(unaff_x26 + 0x40) = in_stack_000002e8;
    *(undefined8 *)(unaff_x26 + 0x38) = in_stack_000002e0;
    *(undefined8 *)(unaff_x26 + 0x48) = in_stack_000002f0;
    param_1 = auStack_7ffffffe + 0x8000063e;
    param_2 = unaff_x21 + 0x10;
  } while( true );
}

