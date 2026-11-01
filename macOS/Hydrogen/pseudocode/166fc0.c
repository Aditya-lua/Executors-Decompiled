
void FUN_00166fc0(void)

{
  undefined1 uVar1;
  undefined1 uVar2;
  undefined1 uVar3;
  code *pcVar4;
  long lVar5;
  long lVar6;
  undefined1 in_w8;
  undefined1 *unaff_x19;
  undefined1 unaff_w21;
  undefined1 unaff_w24;
  undefined1 unaff_w25;
  undefined8 uVar7;
  long unaff_x29;
  undefined1 auVar8 [16];
  uint uStack000000000000000c;
  uint uStack0000000000000010;
  uint uStack0000000000000014;
  undefined1 uStack0000000000000018;
  undefined1 uStack000000000000001c;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000024;
  undefined1 uStack0000000000000028;
  undefined1 uStack000000000000002c;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000034;
  undefined1 uStack0000000000000038;
  undefined1 uStack000000000000003c;
  undefined1 uStack0000000000000040;
  undefined1 uStack0000000000000044;
  undefined1 uStack0000000000000048;
  undefined1 uStack000000000000004c;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000054;
  undefined1 uStack0000000000000058;
  undefined1 uStack000000000000005c;
  undefined1 uStack0000000000000060;
  undefined1 uStack0000000000000064;
  undefined1 uStack0000000000000068;
  undefined1 uStack000000000000006c;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000074;
  undefined1 uStack0000000000000078;
  undefined1 uStack000000000000007c;
  undefined1 uStack0000000000000080;
  undefined1 uStack0000000000000084;
  undefined1 uStack0000000000000088;
  undefined1 uStack000000000000008c;
  undefined1 uStack0000000000000090;
  undefined1 uStack0000000000000094;
  undefined1 uStack0000000000000098;
  undefined1 uStack000000000000009c;
  undefined1 uStack00000000000000a0;
  undefined1 uStack00000000000000a4;
  undefined1 uStack00000000000000a8;
  undefined1 uStack00000000000000ac;
  undefined8 in_stack_000000b8;
  undefined1 uStack00000000000000c0;
  undefined8 in_stack_000000c8;
  long in_stack_00000160;
  undefined8 in_stack_00000168;
  
  *(undefined1 *)(unaff_x29 + -0x8e) = in_w8;
  uStack0000000000000014 = (uint)*(byte *)(unaff_x29 + -0xc6);
  *(byte *)(unaff_x29 + -0x8f) = *(byte *)(unaff_x29 + -0xc6);
  uStack0000000000000010 = (uint)*(byte *)(unaff_x29 + -0xc5);
  *(byte *)(unaff_x29 + -0x90) = *(byte *)(unaff_x29 + -0xc5);
  uStack000000000000000c = (uint)*(byte *)(unaff_x29 + -0xc4);
  *(byte *)(unaff_x29 + -0x91) = *(byte *)(unaff_x29 + -0xc4);
  uVar1 = *(undefined1 *)(unaff_x29 + -0xc3);
  *(undefined1 *)(unaff_x29 + -0x92) = uVar1;
  uVar2 = *(undefined1 *)(unaff_x29 + -0xc2);
  *(undefined1 *)(unaff_x29 + -0x93) = uVar2;
  uVar3 = *(undefined1 *)(unaff_x29 + -0xc1);
  *(undefined1 *)(unaff_x29 + -0x94) = uVar3;
  auVar8 = func_0x00270ff8(&uStack00000000000000c0);
  lVar6 = auVar8._8_8_;
  if (lVar6 < 0) {
    uVar7 = 0;
LAB_001672d4:
    func_0x007a1f00(uVar7,lVar6,&UNK_009bda78);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x1672ec);
    (*pcVar4)();
  }
  if (lVar6 == 0) {
    lVar5 = 1;
  }
  else {
    uVar7 = 1;
    lVar5 = func_0x00187bd0(lVar6,1);
    if (lVar5 == 0) goto LAB_001672d4;
  }
  _memcpy(lVar5,auVar8._0_8_,lVar6);
  *unaff_x19 = unaff_w24;
  unaff_x19[1] = unaff_w25;
  unaff_x19[2] = uStack000000000000009c;
  unaff_x19[3] = uStack0000000000000098;
  unaff_x19[4] = uStack0000000000000094;
  unaff_x19[5] = uStack0000000000000090;
  unaff_x19[6] = uStack000000000000008c;
  unaff_x19[7] = uStack0000000000000088;
  unaff_x19[8] = uStack0000000000000084;
  unaff_x19[9] = uStack0000000000000080;
  unaff_x19[10] = uStack000000000000007c;
  unaff_x19[0xb] = uStack0000000000000078;
  unaff_x19[0xc] = uStack0000000000000074;
  unaff_x19[0xd] = uStack0000000000000070;
  unaff_x19[0xe] = uStack000000000000006c;
  unaff_x19[0xf] = uStack0000000000000068;
  unaff_x19[0x10] = uStack0000000000000064;
  unaff_x19[0x11] = uStack0000000000000060;
  unaff_x19[0x12] = uStack000000000000005c;
  unaff_x19[0x13] = uStack0000000000000058;
  unaff_x19[0x14] = uStack0000000000000054;
  unaff_x19[0x15] = uStack00000000000000ac;
  unaff_x19[0x16] = uStack00000000000000a8;
  unaff_x19[0x17] = uStack0000000000000050;
  unaff_x19[0x18] = uStack000000000000004c;
  unaff_x19[0x19] = uStack0000000000000048;
  unaff_x19[0x1a] = uStack0000000000000044;
  unaff_x19[0x1b] = uStack0000000000000040;
  unaff_x19[0x1c] = uStack00000000000000a4;
  unaff_x19[0x1d] = uStack00000000000000a0;
  unaff_x19[0x1e] = uStack000000000000003c;
  unaff_x19[0x1f] = unaff_w21;
  unaff_x19[0x20] = uStack0000000000000038;
  unaff_x19[0x21] = uStack0000000000000034;
  unaff_x19[0x22] = uStack0000000000000030;
  unaff_x19[0x23] = uStack000000000000002c;
  unaff_x19[0x24] = uStack0000000000000028;
  unaff_x19[0x25] = uStack0000000000000024;
  unaff_x19[0x26] = uStack0000000000000020;
  unaff_x19[0x27] = uStack000000000000001c;
  unaff_x19[0x28] = uStack0000000000000018;
  unaff_x19[0x29] = (char)uStack0000000000000014;
  unaff_x19[0x2a] = (char)uStack0000000000000010;
  unaff_x19[0x2b] = (char)uStack000000000000000c;
  unaff_x19[0x2c] = uVar1;
  unaff_x19[0x2d] = uVar2;
  unaff_x19[0x2e] = uVar3;
  unaff_x19[0x2f] = *(undefined1 *)(unaff_x29 + -0x95);
  unaff_x19[0x30] = *(undefined1 *)(unaff_x29 + -0x96);
  unaff_x19[0x31] = *(undefined1 *)(unaff_x29 + -0x97);
  unaff_x19[0x32] = *(undefined1 *)(unaff_x29 + -0x98);
  unaff_x19[0x33] = *(undefined1 *)(unaff_x29 + -0x99);
  unaff_x19[0x34] = *(undefined1 *)(unaff_x29 + -0x9a);
  unaff_x19[0x35] = *(undefined1 *)(unaff_x29 + -0x9b);
  unaff_x19[0x36] = *(undefined1 *)(unaff_x29 + -0x9c);
  unaff_x19[0x37] = *(undefined1 *)(unaff_x29 + -0x9d);
  unaff_x19[0x38] = *(undefined1 *)(unaff_x29 + -0x9e);
  unaff_x19[0x39] = *(undefined1 *)(unaff_x29 + -0x9f);
  unaff_x19[0x3a] = *(undefined1 *)(unaff_x29 + -0xa0);
  unaff_x19[0x3b] = *(undefined1 *)(unaff_x29 + -0xa1);
  unaff_x19[0x3c] = *(undefined1 *)(unaff_x29 + -0xa2);
  unaff_x19[0x3d] = *(undefined1 *)(unaff_x29 + -0xa3);
  unaff_x19[0x3e] = *(undefined1 *)(unaff_x29 + -0xa4);
  unaff_x19[0x3f] = *(undefined1 *)(unaff_x29 + -0xa5);
  *(long *)(unaff_x19 + 0x40) = lVar6;
  *(long *)(unaff_x19 + 0x48) = lVar5;
  *(long *)(unaff_x19 + 0x50) = lVar6;
  if (in_stack_00000160 != 0) {
    func_0x00187bd4(in_stack_00000168,in_stack_00000160,1);
  }
  func_0x002d8de8(in_stack_000000c8);
  func_0x002d8de8(in_stack_000000b8);
  return;
}

