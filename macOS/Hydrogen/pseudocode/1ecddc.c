
void FUN_001ecddc(undefined8 param_1,undefined8 *param_2)

{
  uint uVar1;
  code *pcVar2;
  undefined8 *unaff_x21;
  code *pcVar3;
  long unaff_x29;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined *in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined *in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  
  pcVar3 = (code *)param_2[5];
  uVar1 = (*pcVar3)();
  pcVar2 = (code *)param_2[4];
  *(ushort *)(unaff_x29 + -0xa8) = (ushort)(uVar1 >> 8) & 0xff | (ushort)((uVar1 & 0xff00ff) << 8);
  *(undefined1 *)(unaff_x29 + -0x59) = 0xf;
  *(undefined1 *)(unaff_x29 + -0x5c) = 0;
  uStack0000000000000010 = unaff_x29 + -0x59;
  in_stack_00000018 = 1;
  in_stack_00000020 = &UNK_008294b3;
  in_stack_00000028 = 6;
  in_stack_00000030 = &UNK_0081f6cf;
  in_stack_00000038 = 9;
  in_stack_00000040 = unaff_x29 + -0x5c;
  in_stack_00000048 = 1;
  in_stack_00000050 = 1;
  uStack0000000000000058 = 0;
  (*pcVar2)(&uStack00000000000000b0);
  uVar1 = (*pcVar3)();
  pcVar2 = (code *)param_2[4];
  *(ushort *)(unaff_x29 + -0x5c) = (ushort)(uVar1 >> 8) & 0xff | (ushort)((uVar1 & 0xff00ff) << 8);
  *(undefined1 *)(unaff_x29 + -0x5a) = 0xf;
  *(undefined1 *)(unaff_x29 + -0x59) = 0;
  uStack0000000000000010 = unaff_x29 + -0x5a;
  in_stack_00000018 = 1;
  in_stack_00000020 = &UNK_008294b3;
  in_stack_00000028 = 6;
  in_stack_00000030 = &UNK_0081f6d8;
  in_stack_00000038 = 9;
  in_stack_00000040 = unaff_x29 + -0x59;
  in_stack_00000048 = 1;
  in_stack_00000050 = 1;
  uStack0000000000000058 = 0;
  (*pcVar2)(unaff_x29 + -0xa8);
  in_stack_00000038 = in_stack_000000d8;
  in_stack_00000030 = (undefined *)in_stack_000000d0;
  in_stack_00000048 = in_stack_000000e8;
  in_stack_00000040 = in_stack_000000e0;
  in_stack_00000050 = in_stack_000000f0;
  in_stack_00000018 = in_stack_000000b8;
  uStack0000000000000010 = uStack00000000000000b0;
  in_stack_00000028 = in_stack_000000c8;
  in_stack_00000020 = (undefined *)in_stack_000000c0;
  in_stack_00000060 = in_stack_00000100;
  uStack0000000000000058 = in_stack_000000f8;
  in_stack_00000070 = *(undefined8 *)(unaff_x29 + -0x90);
  in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x98);
  in_stack_00000080 = *(undefined8 *)(unaff_x29 + -0x80);
  in_stack_00000078 = *(undefined8 *)(unaff_x29 + -0x88);
  in_stack_00000090 = *(undefined8 *)(unaff_x29 + -0x70);
  in_stack_00000088 = *(undefined8 *)(unaff_x29 + -0x78);
  in_stack_00000098 = *(undefined8 *)(unaff_x29 + -0x68);
  func_0x001ec8d8(&uStack00000000000000b0);
  func_0x001ec8d8(unaff_x29 + -0xa8);
  unaff_x21[1] = in_stack_000000b8;
  *unaff_x21 = uStack00000000000000b0;
  unaff_x21[3] = in_stack_000000c8;
  unaff_x21[2] = in_stack_000000c0;
  uVar4 = *(undefined8 *)(unaff_x29 + -0xa8);
  uVar6 = *(undefined8 *)(unaff_x29 + -0x90);
  uVar5 = *(undefined8 *)(unaff_x29 + -0x98);
  unaff_x21[5] = *(undefined8 *)(unaff_x29 + -0xa0);
  unaff_x21[4] = uVar4;
  unaff_x21[7] = uVar6;
  unaff_x21[6] = uVar5;
  func_0x00252db4(&uStack0000000000000010);
  func_0x00252db4(&uStack0000000000000058);
  if ((code *)*param_2 != (code *)0x0) {
    (*(code *)*param_2)();
  }
  if (param_2[1] != 0) {
    func_0x00187bd4();
  }
  return;
}

