
/* WARNING: Removing unreachable block (ram,0x0022947c) */

void FUN_00229558(void)

{
  undefined4 uVar1;
  code *pcVar2;
  undefined8 uVar3;
  undefined1 uVar4;
  uint in_w8;
  undefined *puVar5;
  short *in_x9;
  long lVar6;
  ulong uVar7;
  long in_x10;
  ushort uVar8;
  int in_w11;
  uint uVar9;
  ulong uVar10;
  undefined4 *puVar11;
  uint in_w12;
  undefined4 *puVar12;
  byte *pbVar13;
  byte *pbVar14;
  undefined1 (*unaff_x19) [16];
  undefined8 *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  long unaff_x23;
  long lVar15;
  long *unaff_x27;
  uint7 uVar16;
  undefined1 auVar17 [16];
  undefined4 uVar18;
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined8 uVar21;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  long in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  long in_stack_00000068;
  undefined8 uStack0000000000000070;
  byte bStack0000000000000078;
  byte bStack0000000000000079;
  byte bStack000000000000007a;
  byte bStack000000000000007b;
  byte bStack000000000000007c;
  byte bStack000000000000007d;
  byte bStack000000000000007e;
  byte bStack000000000000007f;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  ulong in_stack_00000090;
  byte bStack0000000000000098;
  undefined8 uStack00000000000000a0;
  undefined8 uStack00000000000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 uStack00000000000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined1 uStack0000000000000118;
  undefined8 in_stack_00000128;
  undefined8 uStack0000000000000130;
  long in_stack_00000138;
  long in_stack_00000140;
  long in_stack_00000148;
  long in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  long in_stack_00000188;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  ulong in_stack_000001b0;
  undefined8 in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  undefined8 in_stack_000001e8;
  
  do {
    if (((in_w11 << (ulong)(*(byte *)(in_x9 + -0x10) & 0x1f) & in_w12) == 0) &&
       ((*(byte *)(in_x9 + -0x10) != 0x10 || (*in_x9 == 5)))) break;
    in_x9 = in_x9 + 0x14;
    in_x10 = in_x10 + -0x28;
  } while (in_x10 != 0);
  lVar15 = *(long *)*unaff_x19;
  if (lVar15 != -0x8000000000000000) {
    in_stack_00000080 = *(undefined8 *)unaff_x19[7];
    in_stack_00000088 = *(undefined8 *)(unaff_x19[7] + 8);
    in_stack_00000090 = *(ulong *)unaff_x19[8];
    _bStack0000000000000098 = *(undefined8 *)(unaff_x19[8] + 8);
    uVar21 = *(undefined8 *)(unaff_x19[6] + 8);
    uVar3 = *(undefined8 *)unaff_x19[6];
    in_stack_00000030 = *(long *)unaff_x19[2];
    in_stack_00000038 = *(undefined8 *)(unaff_x19[2] + 8);
    in_stack_00000040 = *(undefined8 *)unaff_x19[3];
    in_stack_00000048 = *(undefined8 *)(unaff_x19[3] + 8);
    in_stack_00000050 = *(undefined8 *)unaff_x19[4];
    in_stack_00000058 = *(undefined8 *)(unaff_x19[4] + 8);
    in_stack_00000060 = *(undefined8 *)unaff_x19[5];
    in_stack_00000068 = *(long *)(unaff_x19[5] + 8);
    _bStack0000000000000078 = uVar21;
    uStack0000000000000070 = uVar3;
    in_stack_00000018 = SUB168(*unaff_x19,8);
    uStack0000000000000010 = SUB168(*unaff_x19,0);
    in_stack_00000028 = SUB168(unaff_x19[1],8);
    in_stack_00000020 = SUB168(unaff_x19[1],0);
    if (in_stack_00000090 == *(ulong *)(unaff_x21 + 0x58)) {
      if (in_stack_00000090 == 0) goto code_r0x0022978c;
      if (in_stack_00000090 - 0x21 < 0xffffffffffffffe0) {
        func_0x007a2570(0x20,0x20,&UNK_009c2590);
        goto code_r0x00229ae0;
      }
      if (in_stack_00000090 < 4) {
        uVar9 = 0;
        uVar7 = 0;
code_r0x00229658:
        lVar6 = in_stack_00000090 - uVar7;
        pbVar13 = (byte *)(uVar7 + unaff_x21 + 0x38);
        pbVar14 = (byte *)((long)&uStack0000000000000070 + uVar7);
        do {
          uVar9 = *pbVar13 ^ *pbVar14 | uVar9;
          lVar6 = lVar6 + -1;
          pbVar13 = pbVar13 + 1;
          pbVar14 = pbVar14 + 1;
        } while (lVar6 != 0);
      }
      else if (in_stack_00000090 < 0x10) {
        uVar8 = 0;
        uVar10 = 0;
code_r0x002295f8:
        uVar7 = in_stack_00000090 & 0x3c;
        auVar20 = ZEXT216(uVar8);
        lVar6 = uVar10 - uVar7;
        puVar11 = (undefined4 *)((long)&uStack0000000000000070 + uVar10);
        puVar12 = (undefined4 *)(uVar10 + unaff_x21 + 0x38);
        do {
          uVar18 = *puVar11;
          uVar1 = *puVar12;
          uVar16 = CONCAT16((byte)((uint)uVar1 >> 0x18) ^ (byte)((uint)uVar18 >> 0x18) | auVar20[6],
                            (uint6)CONCAT14((byte)((uint)uVar1 >> 0x10) ^
                                            (byte)((uint)uVar18 >> 0x10) | auVar20[4],
                                            (uint)CONCAT12((byte)((uint)uVar1 >> 8) ^
                                                           (byte)((uint)uVar18 >> 8) | auVar20[2],
                                                           (ushort)(byte)((byte)uVar1 ^ (byte)uVar18
                                                                         | auVar20[0]))));
          auVar20 = ZEXT716(uVar16);
          lVar6 = lVar6 + 4;
          puVar11 = puVar11 + 1;
          puVar12 = puVar12 + 1;
        } while (lVar6 != 0);
        uVar16 = uVar16 | uVar16 >> 0x20;
        uVar9 = (uint)uVar16 | (uint)(uVar16 >> 0x10);
        if (in_stack_00000090 != uVar7) goto code_r0x00229658;
      }
      else {
        uVar7 = in_stack_00000090 & 0x30;
        uStack0000000000000070._0_1_ = (byte)uVar3;
        uStack0000000000000070._1_1_ = (byte)((ulong)uVar3 >> 8);
        uStack0000000000000070._2_1_ = (byte)((ulong)uVar3 >> 0x10);
        uStack0000000000000070._3_1_ = (byte)((ulong)uVar3 >> 0x18);
        uStack0000000000000070._4_1_ = (byte)((ulong)uVar3 >> 0x20);
        uStack0000000000000070._5_1_ = (byte)((ulong)uVar3 >> 0x28);
        uStack0000000000000070._6_1_ = (byte)((ulong)uVar3 >> 0x30);
        uStack0000000000000070._7_1_ = (byte)((ulong)uVar3 >> 0x38);
        bStack0000000000000078 = (byte)uVar21;
        bStack0000000000000079 = (byte)((ulong)uVar21 >> 8);
        bStack000000000000007a = (byte)((ulong)uVar21 >> 0x10);
        bStack000000000000007b = (byte)((ulong)uVar21 >> 0x18);
        bStack000000000000007c = (byte)((ulong)uVar21 >> 0x20);
        bStack000000000000007d = (byte)((ulong)uVar21 >> 0x28);
        bStack000000000000007e = (byte)((ulong)uVar21 >> 0x30);
        bStack000000000000007f = (byte)((ulong)uVar21 >> 0x38);
        auVar17[0] = *(byte *)(unaff_x21 + 0x38) ^ (byte)uStack0000000000000070;
        auVar17[1] = *(byte *)(unaff_x21 + 0x39) ^ uStack0000000000000070._1_1_;
        auVar17[2] = *(byte *)(unaff_x21 + 0x3a) ^ uStack0000000000000070._2_1_;
        auVar17[3] = *(byte *)(unaff_x21 + 0x3b) ^ uStack0000000000000070._3_1_;
        auVar17[4] = *(byte *)(unaff_x21 + 0x3c) ^ uStack0000000000000070._4_1_;
        auVar17[5] = *(byte *)(unaff_x21 + 0x3d) ^ uStack0000000000000070._5_1_;
        auVar17[6] = *(byte *)(unaff_x21 + 0x3e) ^ uStack0000000000000070._6_1_;
        auVar17[7] = *(byte *)(unaff_x21 + 0x3f) ^ uStack0000000000000070._7_1_;
        auVar17[8] = *(byte *)(unaff_x21 + 0x40) ^ bStack0000000000000078;
        auVar17[9] = *(byte *)(unaff_x21 + 0x41) ^ bStack0000000000000079;
        auVar17[10] = *(byte *)(unaff_x21 + 0x42) ^ bStack000000000000007a;
        auVar17[0xb] = *(byte *)(unaff_x21 + 0x43) ^ bStack000000000000007b;
        auVar17[0xc] = *(byte *)(unaff_x21 + 0x44) ^ bStack000000000000007c;
        auVar17[0xd] = *(byte *)(unaff_x21 + 0x45) ^ bStack000000000000007d;
        auVar17[0xe] = *(byte *)(unaff_x21 + 0x46) ^ bStack000000000000007e;
        auVar17[0xf] = *(byte *)(unaff_x21 + 0x47) ^ bStack000000000000007f;
        auVar19._0_8_ = -(ulong)(uVar7 == 0x10);
        auVar19._8_8_ = auVar19._0_8_;
        uVar21 = *(undefined8 *)(unaff_x21 + 0x50);
        uVar3 = *(undefined8 *)(unaff_x21 + 0x48);
        auVar20[1] = (byte)((ulong)uVar3 >> 8) ^ (byte)((ulong)in_stack_00000080 >> 8) | auVar17[1];
        auVar20[0] = (byte)uVar3 ^ (byte)in_stack_00000080 | auVar17[0];
        auVar20[2] = (byte)((ulong)uVar3 >> 0x10) ^ (byte)((ulong)in_stack_00000080 >> 0x10) |
                     auVar17[2];
        auVar20[3] = (byte)((ulong)uVar3 >> 0x18) ^ (byte)((ulong)in_stack_00000080 >> 0x18) |
                     auVar17[3];
        auVar20[4] = (byte)((ulong)uVar3 >> 0x20) ^ (byte)((ulong)in_stack_00000080 >> 0x20) |
                     auVar17[4];
        auVar20[5] = (byte)((ulong)uVar3 >> 0x28) ^ (byte)((ulong)in_stack_00000080 >> 0x28) |
                     auVar17[5];
        auVar20[6] = (byte)((ulong)uVar3 >> 0x30) ^ (byte)((ulong)in_stack_00000080 >> 0x30) |
                     auVar17[6];
        auVar20[7] = (byte)((ulong)uVar3 >> 0x38) ^ (byte)((ulong)in_stack_00000080 >> 0x38) |
                     auVar17[7];
        auVar20[8] = (byte)uVar21 ^ (byte)in_stack_00000088 | auVar17[8];
        auVar20[9] = (byte)((ulong)uVar21 >> 8) ^ (byte)((ulong)in_stack_00000088 >> 8) | auVar17[9]
        ;
        auVar20[10] = (byte)((ulong)uVar21 >> 0x10) ^ (byte)((ulong)in_stack_00000088 >> 0x10) |
                      auVar17[10];
        auVar20[0xb] = (byte)((ulong)uVar21 >> 0x18) ^ (byte)((ulong)in_stack_00000088 >> 0x18) |
                       auVar17[0xb];
        auVar20[0xc] = (byte)((ulong)uVar21 >> 0x20) ^ (byte)((ulong)in_stack_00000088 >> 0x20) |
                       auVar17[0xc];
        auVar20[0xd] = (byte)((ulong)uVar21 >> 0x28) ^ (byte)((ulong)in_stack_00000088 >> 0x28) |
                       auVar17[0xd];
        auVar20[0xe] = (byte)((ulong)uVar21 >> 0x30) ^ (byte)((ulong)in_stack_00000088 >> 0x30) |
                       auVar17[0xe];
        auVar20[0xf] = (byte)((ulong)uVar21 >> 0x38) ^ (byte)((ulong)in_stack_00000088 >> 0x38) |
                       auVar17[0xf];
        auVar17 = auVar17 ^ (auVar17 ^ auVar20) & ~auVar19;
        auVar20 = NEON_ext(auVar17,auVar17,8,1);
        uVar10 = CONCAT17(auVar17[7] | auVar20[7],
                          CONCAT16(auVar17[6] | auVar20[6],
                                   CONCAT15(auVar17[5] | auVar20[5],
                                            CONCAT14(auVar17[4] | auVar20[4],
                                                     CONCAT13(auVar17[3] | auVar20[3],
                                                              CONCAT12(auVar17[2] | auVar20[2],
                                                                       CONCAT11(auVar17[1] |
                                                                                auVar20[1],
                                                                                auVar17[0] |
                                                                                auVar20[0])))))));
        uVar10 = uVar10 | uVar10 >> 0x20;
        uVar10 = uVar10 | uVar10 >> 0x10;
        uVar9 = (uint)uVar10 | (uint)(uVar10 >> 8);
        uVar8 = (ushort)uVar9;
        if (in_stack_00000090 != uVar7) {
          uVar10 = uVar7;
          if ((in_stack_00000090 & 0xc) == 0) goto code_r0x00229658;
          goto code_r0x002295f8;
        }
      }
      if ((uVar9 & 0xff) == 0) {
code_r0x0022978c:
        if ((*(short *)(in_stack_00000068 + 0x48) == *(short *)(unaff_x23 + 0x48)) &&
           ((*(short *)(in_stack_00000068 + 0x48) != 0x178 ||
            (*(short *)(in_stack_00000068 + 0x4a) == *(short *)(unaff_x23 + 0x4a))))) {
          bStack0000000000000098 = (byte)*(undefined8 *)(unaff_x19[8] + 8);
          if (bStack0000000000000098 == in_w8) {
            uStack0000000000000130 = *(long *)unaff_x19[0xf];
            in_stack_00000138 = *(long *)(unaff_x19[0xf] + 8);
            in_stack_00000140 = *(long *)unaff_x19[0x10];
            in_stack_00000148 = *(long *)(unaff_x19[0x10] + 8);
            in_stack_00000158 = SUB168(unaff_x19[0x11],8);
            in_stack_00000150 = SUB168(unaff_x19[0x11],0);
            in_stack_00000168 = SUB168(unaff_x19[0x12],8);
            in_stack_00000160 = SUB168(unaff_x19[0x12],0);
            func_0x001caeec(&uStack00000000000000a0,&uStack0000000000000130);
            lVar15 = *(long *)(*unaff_x27 + 0x118);
            (**(code **)(lVar15 + 0x20))
                      (*(long *)(*unaff_x27 + 0x110) +
                       (*(long *)(lVar15 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,&UNK_00828b07,0xd
                       ,&uStack00000000000000a8,0x20,&uStack00000000000000e8,0x30);
            lVar15 = *unaff_x22;
            func_0x0024901c(lVar15,&uStack00000000000000a0,0);
            func_0x001a37dc(&uStack0000000000000130,in_stack_00000030 + 0x10,&UNK_009c8460);
            uVar3 = uStack0000000000000130;
            in_stack_00000148 = in_stack_00000138 + in_stack_00000140 * 0x18;
            uStack0000000000000130 = in_stack_00000138;
            in_stack_00000140 = uVar3;
            func_0x002189a8(&uStack0000000000000118,&uStack0000000000000130,&UNK_009c2468);
            in_stack_00000138 = uStack0000000000000118._8_8_;
            uStack0000000000000130 = (long)uStack0000000000000118;
            in_stack_00000140 = in_stack_00000128;
            func_0x0016e8dc(lVar15 + 0x2f0);
            *(long *)(lVar15 + 0x2f8) = in_stack_00000138;
            *(long *)(lVar15 + 0x2f0) = uStack0000000000000130;
            *(long *)(lVar15 + 0x300) = in_stack_00000140;
            *(undefined1 *)(lVar15 + 0x33d) = 2;
            if ((in_stack_00000008 & 0x100000000) == 0) {
              in_stack_00000198 = _bStack0000000000000078;
              in_stack_00000190 = uStack0000000000000070;
              in_stack_000001a8 = in_stack_00000088;
              in_stack_000001a0 = in_stack_00000080;
              in_stack_00000158 = in_stack_00000038;
              in_stack_00000150 = in_stack_00000030;
              in_stack_00000168 = in_stack_00000048;
              in_stack_00000160 = in_stack_00000040;
              in_stack_00000178 = in_stack_00000058;
              in_stack_00000170 = in_stack_00000050;
              in_stack_00000188 = in_stack_00000068;
              in_stack_00000180 = in_stack_00000060;
              in_stack_00000138 = in_stack_00000018;
              uStack0000000000000130 = uStack0000000000000010;
              in_stack_00000148 = in_stack_00000028;
              in_stack_00000140 = in_stack_00000020;
              in_stack_000001d8 = *(undefined8 *)(unaff_x19[10] + 8);
              in_stack_000001d0 = *(undefined8 *)unaff_x19[10];
              in_stack_000001b8 = _bStack0000000000000098;
              in_stack_000001b0 = in_stack_00000090;
              in_stack_000001c8 = SUB168(unaff_x19[9],8);
              in_stack_000001c0 = SUB168(unaff_x19[9],0);
              in_stack_000001e8 = SUB168(unaff_x19[0xb],8);
              in_stack_000001e0 = SUB168(unaff_x19[0xb],0);
              uVar3 = func_0x0020a620(0x1a8);
              _memcpy(uVar3,&uStack0000000000000130,0x1a8);
              puVar5 = &UNK_009c8478;
            }
            else {
              in_stack_00000198 = _bStack0000000000000078;
              in_stack_00000190 = uStack0000000000000070;
              in_stack_000001a8 = in_stack_00000088;
              in_stack_000001a0 = in_stack_00000080;
              in_stack_00000158 = in_stack_00000038;
              in_stack_00000150 = in_stack_00000030;
              in_stack_00000168 = in_stack_00000048;
              in_stack_00000160 = in_stack_00000040;
              in_stack_00000178 = in_stack_00000058;
              in_stack_00000170 = in_stack_00000050;
              in_stack_00000188 = in_stack_00000068;
              in_stack_00000180 = in_stack_00000060;
              in_stack_00000138 = in_stack_00000018;
              uStack0000000000000130 = uStack0000000000000010;
              in_stack_00000148 = in_stack_00000028;
              in_stack_00000140 = in_stack_00000020;
              in_stack_000001d8 = *(undefined8 *)(unaff_x19[10] + 8);
              in_stack_000001d0 = *(undefined8 *)unaff_x19[10];
              in_stack_000001b8 = _bStack0000000000000098;
              in_stack_000001b0 = in_stack_00000090;
              in_stack_000001c8 = SUB168(unaff_x19[9],8);
              in_stack_000001c0 = SUB168(unaff_x19[9],0);
              in_stack_000001e8 = SUB168(unaff_x19[0xb],8);
              in_stack_000001e0 = SUB168(unaff_x19[0xb],0);
              uVar3 = func_0x0020a620(0x198);
              _memcpy(uVar3,&uStack0000000000000130,0x198);
              puVar5 = &UNK_009c84c0;
            }
            unaff_x20[1] = uVar3;
            unaff_x20[2] = puVar5;
            *unaff_x20 = 0x8000000000000027;
            return;
          }
          uVar4 = 0x2d;
        }
        else {
          uVar4 = 0x2c;
        }
        *unaff_x20 = 0x800000000000001a;
        *(undefined1 *)(unaff_x20 + 1) = uVar4;
        func_0x00222b5c(&uStack0000000000000010);
        lVar15 = **(long **)(unaff_x19[0xe] + 8);
        **(long **)(unaff_x19[0xe] + 8) = lVar15 + -1;
        LORelease();
        if (lVar15 == 1) {
          DataMemoryBarrier(2,1);
          func_0x001f9b44();
        }
        if ((((unaff_x19[0xc][8] & 1) == 0) &&
            (lVar15 = *(long *)unaff_x19[0xd], lVar15 != -0x8000000000000000)) && (lVar15 != 0)) {
          func_0x00187bd4(*(undefined8 *)(unaff_x19[0xd] + 8),lVar15,1);
        }
        func_0x00221a70(unaff_x19 + 9);
        return;
      }
    }
    func_0x00222b5c(&uStack0000000000000010);
  }
  *(undefined1 *)(*unaff_x22 + 0x33d) = 0;
  in_stack_000001c0 = *(undefined8 *)unaff_x19[9];
  in_stack_000001c8 = *(undefined8 *)(unaff_x19[9] + 8);
  in_stack_000001d8 = SUB168(unaff_x19[10],8);
  in_stack_000001d0 = SUB168(unaff_x19[10],0);
  in_stack_000001e8 = SUB168(unaff_x19[0xb],8);
  in_stack_000001e0 = SUB168(unaff_x19[0xb],0);
  uStack0000000000000130 = 0x8000000000000000;
  lVar6 = func_0x00187bd0(0x168,8);
  if (lVar6 != 0) {
    _memcpy(lVar6,&uStack0000000000000130,0x168);
    unaff_x20[1] = lVar6;
    unaff_x20[2] = &UNK_009c8508;
    *unaff_x20 = 0x8000000000000027;
    if ((lVar15 == -0x8000000000000000) && (*(long *)*unaff_x19 != -0x8000000000000000)) {
      func_0x00222b5c();
    }
    return;
  }
  func_0x007a1f18(8,0x168);
code_r0x00229ae0:
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x229ae4);
  (*pcVar2)();
}

