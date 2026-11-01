
void FUN_0059a2b4(undefined1 *param_1)

{
  byte *pbVar1;
  uint uVar2;
  undefined1 uVar3;
  uint uVar4;
  long lVar5;
  int iVar6;
  ulong uVar7;
  ulong uVar8;
  uint uVar9;
  ulong uVar10;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  byte *unaff_x22;
  byte *unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined1 unaff_w26;
  long lVar11;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined *in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000038;
  undefined1 uStack0000000000000039;
  undefined1 uStack000000000000003a;
  undefined1 uStack000000000000003b;
  undefined4 uStack000000000000003c;
  long in_stack_00000040;
  undefined8 uStack0000000000000050;
  long in_stack_00000058;
  undefined8 *in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  
code_r0x0059a2b4:
  param_1[-1] = 0x75;
  *param_1 = 0x7b;
  lVar11 = 10;
  uVar10 = CONCAT17(uStack0000000000000039,
                    CONCAT16(uStack0000000000000038,
                             CONCAT15(uStack0000000000000030._7_1_,
                                      CONCAT14(uStack0000000000000030._6_1_,
                                               CONCAT13(uStack0000000000000030._5_1_,
                                                        CONCAT12(uStack0000000000000030._4_1_,
                                                                 CONCAT11(uStack0000000000000030.
                                                                          _3_1_,
                                                  uStack0000000000000030._2_1_)))))));
  uVar7 = (ulong)uStack0000000000000030._1_1_;
  uVar8 = (ulong)(byte)uStack0000000000000030;
LAB_0059a1cc:
  uStack0000000000000030._0_1_ = (byte)uVar8;
  uStack0000000000000030._1_1_ = (byte)uVar7;
  uStack0000000000000030._2_1_ = (undefined1)uVar10;
  uStack0000000000000030._3_1_ = (undefined1)(uVar10 >> 8);
  uStack0000000000000030._4_1_ = (undefined1)(uVar10 >> 0x10);
  uStack0000000000000030._5_1_ = (undefined1)(uVar10 >> 0x18);
  uStack0000000000000030._6_1_ = (undefined1)(uVar10 >> 0x20);
  uStack0000000000000030._7_1_ = (undefined1)(uVar10 >> 0x28);
  uStack0000000000000038 = (undefined1)(uVar10 >> 0x30);
  uStack0000000000000039 = (undefined1)(uVar10 >> 0x38);
  uStack000000000000003a = (undefined1)unaff_x25;
  uStack000000000000003b = (undefined1)lVar11;
  do {
    uVar3 = *(undefined1 *)(unaff_x24 + unaff_x25);
    lVar5 = unaff_x20;
    if ((undefined *)unaff_x20 == uStack0000000000000050) {
      func_0x007acb90(&uStack0000000000000050,unaff_x20,1);
      lVar5 = (long)in_stack_00000060;
    }
    unaff_x25 = unaff_x25 + 1;
    *(undefined1 *)(in_stack_00000058 + lVar5) = uVar3;
    unaff_x20 = unaff_x20 + 1;
    lVar5 = in_stack_00000058;
    in_stack_00000060 = (undefined8 *)unaff_x20;
  } while (lVar11 != unaff_x25);
  while( true ) {
    lVar11 = (long)in_stack_00000060;
    if (unaff_x22 == unaff_x23) {
      uStack0000000000000038 = (undefined1)in_stack_00000058;
      uStack0000000000000039 = (undefined1)((ulong)in_stack_00000058 >> 8);
      uStack000000000000003a = (undefined1)((ulong)in_stack_00000058 >> 0x10);
      uStack000000000000003b = (undefined1)((ulong)in_stack_00000058 >> 0x18);
      uStack000000000000003c = (undefined4)((ulong)in_stack_00000058 >> 0x20);
      uStack0000000000000030._0_1_ = (byte)uStack0000000000000050;
      uStack0000000000000030._1_1_ = (byte)((ulong)uStack0000000000000050 >> 8);
      uStack0000000000000030._2_1_ = (undefined1)((ulong)uStack0000000000000050 >> 0x10);
      uStack0000000000000030._3_1_ = (undefined1)((ulong)uStack0000000000000050 >> 0x18);
      uStack0000000000000030._4_1_ = (undefined1)((ulong)uStack0000000000000050 >> 0x20);
      uStack0000000000000030._5_1_ = (undefined1)((ulong)uStack0000000000000050 >> 0x28);
      uStack0000000000000030._6_1_ = (undefined1)((ulong)uStack0000000000000050 >> 0x30);
      uStack0000000000000030._7_1_ = (undefined1)((ulong)uStack0000000000000050 >> 0x38);
      in_stack_00000040 = (long)in_stack_00000060;
      uStack0000000000000020 = &uStack0000000000000030;
      in_stack_00000028 = &DAT_00599e88;
      uStack0000000000000050 = &UNK_009f1a58;
      in_stack_00000058 = 2;
      in_stack_00000060 = &uStack0000000000000020;
      in_stack_00000068 = 1;
      in_stack_00000070 = 0;
      func_0x00459f08(&uStack0000000000000008,&uStack0000000000000050);
      lVar11 = CONCAT17(uStack0000000000000030._7_1_,
                        CONCAT16(uStack0000000000000030._6_1_,
                                 CONCAT15(uStack0000000000000030._5_1_,
                                          CONCAT14(uStack0000000000000030._4_1_,
                                                   CONCAT13(uStack0000000000000030._3_1_,
                                                            CONCAT12(uStack0000000000000030._2_1_,
                                                                     CONCAT11(uStack0000000000000030
                                                                              ._1_1_,(byte)
                                                  uStack0000000000000030)))))));
      if (lVar11 != 0) {
        func_0x00187bd4(CONCAT44(uStack000000000000003c,
                                 CONCAT13(uStack000000000000003b,
                                          CONCAT12(uStack000000000000003a,
                                                   CONCAT11(uStack0000000000000039,
                                                            uStack0000000000000038)))),lVar11,1);
      }
      unaff_x19[1] = in_stack_00000010;
      *unaff_x19 = uStack0000000000000008;
      unaff_x19[2] = in_stack_00000018;
      return;
    }
    uVar9 = (uint)(char)*unaff_x22;
    uVar2 = (uint)*unaff_x22;
    pbVar1 = unaff_x22 + 1;
    unaff_x20 = (long)in_stack_00000060;
    if (-1 < (int)uVar9) break;
    if (uVar2 < 0xe0) {
      uVar2 = unaff_x22[1] & 0x3f | (uVar2 & 0x1f) << 6;
      pbVar1 = unaff_x22 + 2;
      break;
    }
    uVar4 = unaff_x22[2] & 0x3f | (unaff_x22[1] & 0x3f) << 6;
    if (uVar2 < 0xf0) {
      uVar2 = uVar4 | (uVar9 & 0x1f) << 0xc;
      pbVar1 = unaff_x22 + 3;
      break;
    }
    pbVar1 = unaff_x22 + 3;
    unaff_x22 = unaff_x22 + 4;
    uVar2 = *pbVar1 & 0x3f | uVar4 << 6 | (uVar9 & 7) << 0x12;
    uVar7 = (ulong)uVar2;
    if (uVar2 < 0x22) goto code_r0x0059a0c0;
code_r0x0059a148:
    iVar6 = (int)uVar7;
    if ((iVar6 == 0x22) || (iVar6 == 0x27)) goto code_r0x0059a1c8;
    if (iVar6 != 0x5c) goto code_r0x0059a160;
    if ((undefined8 *)uStack0000000000000050 == in_stack_00000060) {
      func_0x007acb90(&uStack0000000000000050,in_stack_00000060,1);
      lVar5 = in_stack_00000058;
    }
    *(undefined1 *)(lVar5 + (long)in_stack_00000060) = unaff_w26;
    in_stack_00000060 = (undefined8 *)(lVar11 + 1);
  }
  unaff_x22 = pbVar1;
  uVar7 = (ulong)uVar2;
  if (0x21 < uVar2) goto code_r0x0059a148;
code_r0x0059a0c0:
  iVar6 = (int)uVar7;
  if (iVar6 == 9) {
    uVar7 = 0x74;
  }
  else if (iVar6 == 10) {
    uVar7 = 0x6e;
  }
  else {
    if (iVar6 != 0xd) {
code_r0x0059a160:
      if ((uint)uVar7 - 0x20 < 0x5f) {
        uVar2 = (int)(char)(&UNK_008ae398)[uVar7] & 0x7f;
        unaff_x25 = 0;
        if ((char)(&UNK_008ae398)[uVar7] < 0) {
          if (uVar2 == 0) {
            uVar10 = (ulong)CONCAT11(*(undefined1 *)(unaff_x21 + (uVar7 & 0xf)),
                                     *(undefined1 *)(unaff_x21 + (uVar7 >> 4)));
            uVar8 = 0x5c;
            uVar7 = 0x78;
            lVar11 = 4;
          }
          else {
            uVar10 = 0;
            lVar11 = 2;
            uVar8 = 0x5c;
            uVar7 = (ulong)uVar2;
          }
        }
        else {
          uVar10 = 0;
          lVar11 = 1;
          uVar7 = 0;
          uVar8 = (ulong)uVar2;
        }
        goto LAB_0059a1cc;
      }
      uVar10 = (ulong)LZCOUNT((uint)uVar7 | 1) >> 2;
      unaff_x25 = uVar10 - 2;
      uStack0000000000000030._2_1_ = 0;
      uStack0000000000000030._3_1_ = *(undefined1 *)(unaff_x21 + (uVar7 >> 0x14));
      uStack0000000000000030._4_1_ = *(undefined1 *)(unaff_x21 + (uVar7 >> 0x10 & 0xf));
      uStack0000000000000030._5_1_ = *(undefined1 *)(unaff_x21 + (uVar7 >> 0xc & 0xf));
      uStack0000000000000030._0_1_ = 0;
      uStack0000000000000030._1_1_ = 0;
      uStack0000000000000030._6_1_ = *(undefined1 *)(unaff_x21 + (uVar7 >> 8 & 0xf));
      uStack0000000000000030._7_1_ = *(undefined1 *)(unaff_x21 + (uVar7 >> 4 & 0xf));
      uStack0000000000000038 = *(undefined1 *)(unaff_x21 + (uVar7 & 0xf));
      uStack0000000000000039 = 0x7d;
      *(undefined1 *)(unaff_x24 + unaff_x25) = unaff_w26;
      param_1 = (undefined1 *)(unaff_x24 + uVar10);
      goto code_r0x0059a2b4;
    }
    uVar7 = 0x72;
  }
code_r0x0059a1c8:
  unaff_x25 = 0;
  uVar10 = 0;
  lVar11 = 2;
  uVar8 = 0x5c;
  goto LAB_0059a1cc;
}

