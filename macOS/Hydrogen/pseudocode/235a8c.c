
void FUN_00235a8c(undefined8 param_1)

{
  code *pcVar1;
  code *in_x9;
  undefined8 in_x10;
  undefined1 (*unaff_x19) [16];
  undefined8 *unaff_x20;
  undefined8 *unaff_x22;
  long unaff_x25;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined1 uStack0000000000000070;
  ulong in_stack_000000b0;
  undefined8 uStack00000000000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  
  *(undefined8 *)(unaff_x29 + -0xa8) = param_1;
  *(undefined8 *)(unaff_x29 + -0xa0) = in_x10;
  *(undefined **)(unaff_x29 + -0x98) = &UNK_008294b3;
  *(undefined8 *)(unaff_x29 + -0x90) = 6;
  *(undefined **)(unaff_x29 + -0x88) = &UNK_008293d4;
  *(undefined8 *)(unaff_x29 + -0x80) = 7;
  *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xb9;
  *(undefined8 *)(unaff_x29 + -0x70) = in_x10;
  *(undefined8 **)(unaff_x29 + -0x68) = &uStack00000000000000b8;
  *(undefined8 *)(unaff_x29 + -0x60) = unaff_x28;
  (*in_x9)(&uStack0000000000000070);
  if (in_stack_000000b0 < 0x41) {
    auVar10 = (**(code **)(*(long *)(*(long *)unaff_x19[1] + 0x18) + 0x18))
                        (*(undefined8 *)(*(long *)unaff_x19[1] + 0x10),&uStack0000000000000070);
    if ((code *)*unaff_x22 != (code *)0x0) {
      (*(code *)*unaff_x22)();
    }
    if (unaff_x22[1] != 0) {
      func_0x00187bd4();
    }
    *unaff_x19 = auVar10;
    func_0x00252db4(&uStack0000000000000070);
    if (*(ulong *)(unaff_x25 + 0x40) < 0x41) {
      func_0x002373dc(&uStack00000000000000b8,auVar10._0_8_,auVar10._8_8_,4);
      uVar2 = *(undefined8 *)*unaff_x19;
      uVar3 = *(undefined8 *)(*unaff_x19 + 8);
      func_0x002373dc(unaff_x29 + -0xb8,uVar2,uVar3,5);
      func_0x002373dc(&uStack0000000000000028,uVar2,uVar3,6);
      uVar2 = *(undefined8 *)*unaff_x19;
      unaff_x20[1] = *(undefined8 *)(*unaff_x19 + 8);
      *unaff_x20 = uVar2;
      unaff_x20[2] = *(undefined8 *)unaff_x19[1];
      unaff_x20[6] = in_stack_000000d0;
      unaff_x20[5] = in_stack_000000c8;
      unaff_x20[8] = in_stack_000000e0;
      unaff_x20[7] = in_stack_000000d8;
      unaff_x20[10] = in_stack_000000f0;
      unaff_x20[9] = in_stack_000000e8;
      unaff_x20[0xb] = in_stack_000000f8;
      unaff_x20[4] = in_stack_000000c0;
      unaff_x20[3] = uStack00000000000000b8;
      uVar3 = *(undefined8 *)(unaff_x29 + -0xb0);
      uVar2 = *(undefined8 *)(unaff_x29 + -0xb8);
      uVar5 = *(undefined8 *)(unaff_x29 + -0xa0);
      uVar4 = *(undefined8 *)(unaff_x29 + -0xa8);
      uVar7 = *(undefined8 *)(unaff_x29 + -0x90);
      uVar6 = *(undefined8 *)(unaff_x29 + -0x98);
      uVar9 = *(undefined8 *)(unaff_x29 + -0x80);
      uVar8 = *(undefined8 *)(unaff_x29 + -0x88);
      unaff_x20[0x14] = *(undefined8 *)(unaff_x29 + -0x78);
      unaff_x20[0x11] = uVar7;
      unaff_x20[0x10] = uVar6;
      unaff_x20[0x13] = uVar9;
      unaff_x20[0x12] = uVar8;
      unaff_x20[0xd] = uVar3;
      unaff_x20[0xc] = uVar2;
      unaff_x20[0xf] = uVar5;
      unaff_x20[0xe] = uVar4;
      unaff_x20[0x16] = in_stack_00000030;
      unaff_x20[0x15] = uStack0000000000000028;
      unaff_x20[0x1d] = in_stack_00000068;
      unaff_x20[0x1c] = in_stack_00000060;
      unaff_x20[0x1b] = in_stack_00000058;
      unaff_x20[0x1a] = in_stack_00000050;
      unaff_x20[0x19] = in_stack_00000048;
      unaff_x20[0x18] = in_stack_00000040;
      unaff_x20[0x17] = in_stack_00000038;
      return;
    }
    func_0x007a28b0(*(ulong *)(unaff_x25 + 0x40),0x40,&UNK_009c9ca0);
  }
  else {
    func_0x007a28b0(in_stack_000000b0,0x40,&UNK_009ca5f0);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x235c88);
  (*pcVar1)();
}

