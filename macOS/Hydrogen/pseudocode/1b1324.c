
void FUN_001b1324(undefined8 *param_1)

{
  undefined4 *puVar1;
  undefined1 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 uVar6;
  undefined2 uVar7;
  undefined2 uVar8;
  undefined6 uVar9;
  undefined2 uVar10;
  undefined6 uVar11;
  undefined2 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  ulong uVar15;
  ulong extraout_x1;
  ulong uVar16;
  undefined1 uVar17;
  ulong extraout_x8;
  ulong extraout_x8_00;
  ulong uVar18;
  undefined8 *extraout_x8_01;
  undefined *puVar19;
  ulong extraout_x9;
  ulong uVar20;
  ulong extraout_x9_00;
  ulong extraout_x9_01;
  long lVar21;
  long *unaff_x20;
  ulong unaff_x22;
  undefined8 uVar22;
  undefined8 uVar23;
  long unaff_x29;
  undefined1 auVar24 [16];
  uint uStack000000000000003c;
  undefined8 uStack0000000000000040;
  undefined6 uStack0000000000000048;
  undefined2 uStack000000000000004e;
  undefined6 uStack0000000000000050;
  undefined2 uStack0000000000000056;
  long in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 uStack0000000000000070;
  undefined8 in_stack_00000078;
  long in_stack_00000080;
  undefined3 uStack0000000000000088;
  undefined1 uStack000000000000008b;
  undefined4 uStack000000000000008c;
  undefined3 uStack0000000000000090;
  undefined1 uStack0000000000000093;
  undefined4 uStack0000000000000094;
  undefined7 in_stack_00000098;
  undefined1 uStack000000000000009f;
  undefined7 in_stack_000000a0;
  undefined1 uStack00000000000000a7;
  undefined1 in_stack_000000a8;
  undefined1 uStack00000000000000a9;
  undefined4 uStack00000000000000aa;
  undefined2 uStack00000000000000ae;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  ulong in_stack_000000c8;
  undefined2 uStack00000000000000d0;
  undefined2 uStack00000000000000d2;
  undefined4 uStack00000000000000d4;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  
  func_0x001f49f8(&uStack0000000000000040);
  uVar8 = uStack0000000000000040._4_2_;
  uVar7 = uStack0000000000000040._2_2_;
  if ((byte)uStack0000000000000040 != '\x15') {
    *(ulong *)((long)param_1 + 0x16) = CONCAT62(uStack0000000000000050,uStack000000000000004e);
    *(ulong *)((long)param_1 + 0xe) = CONCAT62(uStack0000000000000048,uStack0000000000000040._6_2_);
    *(undefined2 *)((long)param_1 + 0x1e) = uStack0000000000000056;
    *(byte *)(param_1 + 1) = (byte)uStack0000000000000040;
    *(undefined1 *)((long)param_1 + 9) = uStack0000000000000040._1_1_;
    *(uint *)((long)param_1 + 10) =
         CONCAT22(uStack0000000000000040._4_2_,uStack0000000000000040._2_2_);
    goto LAB_001b1458;
  }
  uVar16 = unaff_x20[1];
  uVar15 = unaff_x20[2];
  if (uVar16 - uVar15 < 0x20) {
    *(undefined1 *)(param_1 + 1) = 0xc;
    param_1[2] = &UNK_0081de26;
    param_1[3] = 6;
    goto LAB_001b1458;
  }
  uVar18 = uVar15 + 0x20;
  unaff_x20[2] = uVar18;
  if (uVar15 < 0xffffffffffffffe0) {
    if (uVar16 < uVar18) {
LAB_001b1710:
      uVar15 = func_0x007a28b0(uVar18,uVar16,&UNK_009c9a78);
      uVar18 = extraout_x8;
      goto LAB_001b1720;
    }
    lVar21 = *unaff_x20;
    puVar1 = (undefined4 *)(lVar21 + uVar15);
    *(undefined4 *)(unaff_x29 + -0xb0) = *puVar1;
    *(undefined4 *)(unaff_x29 + -0xad) = *(undefined4 *)((long)puVar1 + 3);
    uVar17 = *(undefined1 *)((long)puVar1 + 7);
    uVar22 = *(undefined8 *)((long)puVar1 + 0xf);
    uVar23 = *(undefined8 *)((long)puVar1 + 0x17);
    uVar2 = *(undefined1 *)((long)puVar1 + 0x1f);
    *(undefined4 *)(unaff_x29 + -0xb8) = puVar1[2];
    *(undefined4 *)(unaff_x29 + -0xb5) = *(undefined4 *)((long)puVar1 + 0xb);
    if (uVar16 == uVar18) {
      uVar17 = 0xc;
      puVar19 = &UNK_008298d8;
      uVar22 = 2;
LAB_001b144c:
      *(undefined1 *)(param_1 + 1) = uVar17;
      *(char *)((long)param_1 + 9) = (char)unaff_x22;
      param_1[2] = puVar19;
      param_1[3] = uVar22;
LAB_001b1458:
      *param_1 = 0x8000000000000000;
      return;
    }
    uVar20 = uVar15 + 0x21;
    unaff_x20[2] = uVar20;
    if (uVar15 == 0xffffffffffffffdf) goto LAB_001b1730;
    if (uVar20 <= uVar16) {
      unaff_x22 = (ulong)*(byte *)(lVar21 + uVar18);
      if (unaff_x22 < 0x21) {
        if (unaff_x22 <= uVar16 - uVar20) {
          uVar18 = uVar20 + unaff_x22;
          unaff_x20[2] = uVar18;
          if (CARRY8(uVar20,unaff_x22)) goto code_r0x001b1754;
          if (uVar18 <= uVar16) {
            uStack0000000000000048 = 0;
            uStack000000000000004e = 0;
            uStack0000000000000040._0_1_ = 0;
            uStack0000000000000040._1_1_ = 0;
            uStack0000000000000040._2_2_ = 0;
            uStack0000000000000040._4_2_ = 0;
            uStack0000000000000040._6_2_ = 0;
            in_stack_00000058 = 0;
            uStack0000000000000050 = 0;
            uStack0000000000000056 = 0;
            _memcpy(&uStack0000000000000040,lVar21 + uVar20,unaff_x22);
            uVar13 = in_stack_00000058;
            uVar6 = uStack0000000000000040._1_1_;
            uStack000000000000003c = (uint)(byte)uStack0000000000000040;
            *(uint *)(unaff_x29 + -0xa8) =
                 CONCAT22(uStack0000000000000040._4_2_,uStack0000000000000040._2_2_);
            *(undefined2 *)(unaff_x29 + -0xa4) = uStack0000000000000040._6_2_;
            uVar3 = CONCAT26(uStack000000000000004e,uStack0000000000000048);
            uVar4 = CONCAT26(uStack0000000000000056,uStack0000000000000050);
            func_0x001aacd0(&uStack0000000000000040);
            uVar14 = in_stack_00000058;
            uVar12 = uStack0000000000000056;
            uVar11 = uStack0000000000000050;
            uVar10 = uStack000000000000004e;
            uVar9 = uStack0000000000000048;
            lVar21 = CONCAT26(uStack000000000000004e,uStack0000000000000048);
            uVar5 = CONCAT26(uStack0000000000000056,uStack0000000000000050);
            if (CONCAT22(uStack0000000000000040._2_2_,
                         CONCAT11(uStack0000000000000040._1_1_,(byte)uStack0000000000000040)) == 1)
            {
              param_1[2] = uVar5;
              param_1[3] = in_stack_00000058;
              *param_1 = 0x8000000000000000;
              param_1[1] = lVar21;
              return;
            }
            func_0x001ab580(&uStack0000000000000040);
            *(ulong *)(unaff_x29 + -0x78) = CONCAT26(uStack0000000000000056,uStack0000000000000050);
            *(ulong *)(unaff_x29 + -0x80) = CONCAT26(uStack000000000000004e,uStack0000000000000048);
            *(long *)(unaff_x29 + -0x70) = in_stack_00000058;
            if (CONCAT22(uStack0000000000000040._2_2_,
                         CONCAT11(uStack0000000000000040._1_1_,(byte)uStack0000000000000040)) == 1)
            {
              uVar22 = *(undefined8 *)(unaff_x29 + -0x80);
              param_1[2] = *(undefined8 *)(unaff_x29 + -0x78);
              param_1[1] = uVar22;
              param_1[3] = *(undefined8 *)(unaff_x29 + -0x70);
              *param_1 = 0x8000000000000000;
              if (lVar21 == 0) {
                return;
              }
              func_0x00187bd4(uVar5,lVar21 << 2,2);
              return;
            }
            in_stack_00000060 = *(undefined8 *)(unaff_x29 + -0x78);
            in_stack_00000058 = *(long *)(unaff_x29 + -0x80);
            in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x70);
            uStack00000000000000d0 = uVar7;
            uStack00000000000000d2 = uVar8;
            uStack0000000000000088 = (undefined3)*(undefined4 *)(unaff_x29 + -0xb0);
            uStack000000000000008b = (undefined1)*(undefined4 *)(unaff_x29 + -0xad);
            uStack000000000000008c =
                 CONCAT13(uVar17,(int3)((uint)*(undefined4 *)(unaff_x29 + -0xad) >> 8));
            uStack0000000000000090 = (undefined3)*(undefined4 *)(unaff_x29 + -0xb8);
            uStack0000000000000093 = (undefined1)*(undefined4 *)(unaff_x29 + -0xb5);
            uStack0000000000000094._3_1_ = (undefined1)uVar22;
            uStack0000000000000094 =
                 CONCAT13(uStack0000000000000094._3_1_,
                          (int3)((uint)*(undefined4 *)(unaff_x29 + -0xb5) >> 8));
            in_stack_00000098 = (undefined7)((ulong)uVar22 >> 8);
            uStack000000000000009f = (undefined1)uVar23;
            in_stack_000000a0 = (undefined7)((ulong)uVar23 >> 8);
            in_stack_000000a8 = (undefined1)uStack000000000000003c;
            uStack00000000000000a9 = uVar6;
            uStack00000000000000ae = *(undefined2 *)(unaff_x29 + -0xa4);
            uStack00000000000000aa = *(undefined4 *)(unaff_x29 + -0xa8);
            in_stack_000000c0 = uVar13;
            uStack0000000000000040._0_1_ = (byte)uVar9;
            uStack0000000000000040._1_1_ = (undefined1)((uint6)uVar9 >> 8);
            uStack0000000000000040._2_2_ = (undefined2)((uint6)uVar9 >> 0x10);
            uStack0000000000000040._4_2_ = (undefined2)((uint6)uVar9 >> 0x20);
            uStack0000000000000040._6_2_ = uVar10;
            uStack0000000000000048 = uVar11;
            uStack000000000000004e = uVar12;
            uStack0000000000000050 = (undefined6)uVar14;
            uStack0000000000000056 = (undefined2)((ulong)uVar14 >> 0x30);
            uStack0000000000000070 = 0;
            in_stack_00000078 = 8;
            in_stack_00000080 = 0;
            uStack00000000000000a7 = uVar2;
            in_stack_000000b0 = uVar3;
            in_stack_000000b8 = uVar4;
            in_stack_000000c8 = unaff_x22;
            if ((ulong)unaff_x20[2] < (ulong)unaff_x20[1]) {
              func_0x001a7fa8(unaff_x29 + -0x80);
              *(undefined8 *)(unaff_x29 + -0x98) = *(undefined8 *)(unaff_x29 + -0x70);
              *(undefined8 *)(unaff_x29 + -0xa0) = *(undefined8 *)(unaff_x29 + -0x78);
              *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0x68);
              if (*(int *)(unaff_x29 + -0x80) == 1) {
                uVar22 = *(undefined8 *)(unaff_x29 + -0xa0);
                param_1[2] = *(undefined8 *)(unaff_x29 + -0x98);
                param_1[1] = uVar22;
                param_1[3] = *(undefined8 *)(unaff_x29 + -0x90);
                *param_1 = 0x8000000000000000;
                func_0x001ad1a4(&uStack0000000000000040);
                return;
              }
              func_0x001ad314(&uStack0000000000000070);
              in_stack_00000080 = *(long *)(unaff_x29 + -0x90);
              in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0x98);
              uStack0000000000000070 = *(undefined8 *)(unaff_x29 + -0xa0);
              if ((ulong)unaff_x20[2] < (ulong)unaff_x20[1]) {
                uVar17 = 0xf;
                goto code_r0x001b16bc;
              }
              if (in_stack_00000080 != 0) {
                param_1[0xd] = CONCAT26(uStack00000000000000ae,
                                        CONCAT42(uStack00000000000000aa,
                                                 CONCAT11(uStack00000000000000a9,in_stack_000000a8))
                                       );
                param_1[0xc] = CONCAT17(uStack00000000000000a7,in_stack_000000a0);
                param_1[0xf] = in_stack_000000b8;
                param_1[0xe] = in_stack_000000b0;
                param_1[0x11] = in_stack_000000c8;
                param_1[0x10] = in_stack_000000c0;
                param_1[0x12] =
                     CONCAT44(uStack00000000000000d4,
                              CONCAT22(uStack00000000000000d2,uStack00000000000000d0));
                param_1[5] = in_stack_00000068;
                param_1[4] = in_stack_00000060;
                param_1[7] = in_stack_00000078;
                param_1[6] = uStack0000000000000070;
                param_1[9] = CONCAT44(uStack000000000000008c,_uStack0000000000000088);
                param_1[8] = in_stack_00000080;
                param_1[0xb] = CONCAT17(uStack000000000000009f,in_stack_00000098);
                param_1[10] = CONCAT44(uStack0000000000000094,_uStack0000000000000090);
                param_1[1] = CONCAT26(uStack000000000000004e,uStack0000000000000048);
                *param_1 = CONCAT26(uStack0000000000000040._6_2_,
                                    CONCAT24(uStack0000000000000040._4_2_,
                                             CONCAT22(uStack0000000000000040._2_2_,
                                                      CONCAT11(uStack0000000000000040._1_1_,
                                                               (byte)uStack0000000000000040))));
                param_1[3] = in_stack_00000058;
                param_1[2] = CONCAT26(uStack0000000000000056,uStack0000000000000050);
                return;
              }
            }
            uVar17 = 0xc;
code_r0x001b16bc:
            *(undefined1 *)(param_1 + 1) = uVar17;
            param_1[2] = &UNK_0081de5a;
            param_1[3] = 0x12;
            *param_1 = 0x8000000000000000;
            if (lVar21 != 0) {
              func_0x00187bd4(uVar5,lVar21 << 2,2);
            }
            if (in_stack_00000058 != 0) {
              func_0x00187bd4(in_stack_00000060,in_stack_00000058 << 1,1);
            }
            func_0x001ad314(&uStack0000000000000070);
            return;
          }
          goto LAB_001b1710;
        }
        uVar17 = 0xc;
      }
      else {
        uVar17 = 0xf;
      }
      puVar19 = &UNK_0081de2c;
      uVar22 = 9;
      goto LAB_001b144c;
    }
  }
  else {
LAB_001b1720:
    func_0x007a28bc(uVar15,uVar18,&UNK_009c9a78);
    uVar20 = extraout_x9;
LAB_001b1730:
    func_0x007a28bc(0xffffffffffffffff,uVar20,&UNK_009c9a78);
    uVar16 = extraout_x1;
    uVar20 = extraout_x9_00;
  }
  func_0x007a28b0(uVar20,uVar16,&UNK_009c9a78);
  uVar18 = extraout_x8_00;
  uVar20 = extraout_x9_01;
code_r0x001b1754:
  uVar22 = func_0x007a28bc(uVar20,uVar18,&UNK_009c9a78);
  uVar23 = *(undefined8 *)(unaff_x29 + -0xa0);
  *(undefined8 *)(unaff_x22 + 0x38) = *(undefined8 *)(unaff_x29 + -0x98);
  *(undefined8 *)(unaff_x22 + 0x30) = uVar23;
  *(undefined8 *)(unaff_x22 + 0x40) = *(undefined8 *)(unaff_x29 + -0x90);
  func_0x001ad1a4(&uStack0000000000000040);
  auVar24 = __Unwind_Resume(uVar22);
  uStack_38 = 0;
  uStack_30 = 1;
  uStack_28 = 0;
  func_0x001b1824(auVar24._0_8_,&uStack_38,auVar24._8_8_);
  extraout_x8_01[1] = uStack_30;
  *extraout_x8_01 = uStack_38;
  extraout_x8_01[2] = uStack_28;
  return;
}

