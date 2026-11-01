
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004fb068(void)

{
  undefined8 uVar1;
  ulong uVar2;
  ulong uVar3;
  code *pcVar4;
  long lVar5;
  undefined *puVar6;
  long lVar7;
  undefined2 unaff_w19;
  undefined8 *puVar8;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000008;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000028;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000058;
  long in_stack_00000070;
  long in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 uStack00000000000000b0;
  long in_stack_000000b8;
  ulong in_stack_000000c0;
  
  func_0x0046849c();
  lVar5 = unaff_x20[2];
  if ((ulong)(*unaff_x20 - lVar5) < 0x10) {
    func_0x007a5594();
    lVar5 = unaff_x20[2];
  }
  uVar1 = _UNK_008a4320;
  lVar7 = unaff_x20[1];
  ((undefined8 *)(lVar7 + lVar5))[1] = _UNK_008a4328;
  *(undefined8 *)(lVar7 + lVar5) = uVar1;
  puVar8 = (undefined8 *)(in_stack_00000008 + 0x20);
  unaff_x20[2] = lVar5 + 0x10;
  do {
    if (unaff_x21 == 0) {
      if (in_stack_00000088 != 0) {
        func_0x00187bd4(in_stack_00000090,in_stack_00000088,1);
      }
      puVar8 = (undefined8 *)(in_stack_00000008 + 0x20);
      do {
        lVar5 = puVar8[-1];
        if (lVar5 == -0x8000000000000000 || lVar5 == 0) {
          lVar5 = puVar8[-4];
        }
        else {
          func_0x00187bd4(*puVar8,lVar5,1);
          lVar5 = puVar8[-4];
        }
        if (lVar5 != 0) {
          func_0x00187bd4(puVar8[-3],lVar5 << 4,8);
        }
        puVar8 = puVar8 + 9;
        unaff_x27 = unaff_x27 + -1;
      } while (unaff_x27 != 0);
      if (in_stack_00000070 != 0) {
        func_0x00187bd4(in_stack_00000008,in_stack_00000070 * 0x48,8);
      }
      if (in_stack_00000050 != 0) {
        func_0x00187bd4(in_stack_00000058,in_stack_00000050,1);
      }
      if (in_stack_00000038 != 0) {
        func_0x00187bd4(in_stack_00000040,in_stack_00000038,1);
      }
      return;
    }
    if (*(char *)(unaff_x28 + 0x40) != '\x01') {
      uStack00000000000000a0 = puVar8[2];
      in_stack_000000a8 = puVar8[3];
      uStack00000000000000b0 = 0;
      in_stack_000000b8 = 1;
      in_stack_000000c0 = 0;
      *(undefined1 **)(unaff_x29 + -0xa8) = &uStack0000000000000028;
      *(undefined **)(unaff_x29 + -0xa0) = &DAT_00524310;
      *(undefined8 **)(unaff_x29 + -0x98) = &uStack00000000000000a0;
      *(undefined **)(unaff_x29 + -0x90) = &DAT_00519924;
      *(undefined **)(unaff_x29 + -0x88) = &UNK_008a41d8;
      *(undefined8 *)(unaff_x29 + -0x80) = 3;
      *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4050;
      *(undefined8 *)(unaff_x29 + -0x60) = 3;
      *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
      *(undefined8 *)(unaff_x29 + -0x70) = 2;
      func_0x0046849c(&uStack00000000000000b0,&UNK_009e84b0,unaff_x29 + -0x88);
      if (puVar8[-1] != -0x8000000000000000) {
        lVar5 = func_0x00513134(uStack00000000000000a0,in_stack_000000a8);
        if ((ulong)(in_stack_00000020 - lVar5) >> 0x10 != 0) {
          puVar6 = &UNK_009e8668;
          goto code_r0x004fb44c;
        }
        *(undefined **)(unaff_x29 + -0xa8) = &UNK_007fc120;
        *(undefined **)(unaff_x29 + -0xa0) = &DAT_00519924;
        *(undefined8 *)(unaff_x29 + -0x98) = 0;
        *(short *)(unaff_x29 + -0x90) = (short)(in_stack_00000020 - lVar5);
        *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8658;
        *(undefined8 *)(unaff_x29 + -0x80) = 1;
        *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4188;
        *(undefined8 *)(unaff_x29 + -0x60) = 1;
        *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
        *(undefined8 *)(unaff_x29 + -0x70) = 2;
        func_0x0046849c(&uStack00000000000000b0,&UNK_009e84b0,unaff_x29 + -0x88);
        uVar1 = *puVar8;
        uVar2 = puVar8[1];
        if (uStack00000000000000b0 - in_stack_000000c0 < uVar2) {
          func_0x007a5594(&uStack00000000000000b0,in_stack_000000c0,uVar2,1,1);
        }
        uVar3 = in_stack_000000c0;
        _memcpy(in_stack_000000b8 + in_stack_000000c0,uVar1,uVar2);
        in_stack_000000c0 = uVar3 + uVar2;
      }
      uVar1 = in_stack_00000098;
      func_0x00511674(&uStack00000000000000b0);
      func_0x00511ec8(&uStack00000000000000b0,1,0,in_stack_00000090,uVar1);
      if (in_stack_00000018 != 0) {
        puVar6 = &UNK_009e86a0;
code_r0x004fb44c:
        *(undefined8 *)(unaff_x29 + -0x88) = &UNK_009e8630;
        *(undefined8 *)(unaff_x29 + -0x80) = 1;
        *(undefined8 *)(unaff_x29 + -0x70) = 0;
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        *(undefined8 *)(unaff_x29 + -0x78) = 8;
        func_0x007a2420((undefined8 *)(unaff_x29 + -0x88),puVar6);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x4fb4dc);
        (*pcVar4)();
      }
      *(undefined **)(unaff_x29 + -0xa8) = &UNK_007fc120;
      *(undefined **)(unaff_x29 + -0xa0) = &DAT_00519924;
      *(undefined8 *)(unaff_x29 + -0x98) = 0;
      *(undefined2 *)(unaff_x29 + -0x90) = unaff_w19;
      *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8680;
      *(undefined8 *)(unaff_x29 + -0x80) = 2;
      *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4188;
      *(undefined8 *)(unaff_x29 + -0x60) = 1;
      *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
      *(undefined8 *)(unaff_x29 + -0x70) = 2;
      func_0x0046849c();
      uVar2 = in_stack_000000c0;
      lVar5 = in_stack_000000b8;
      lVar7 = unaff_x20[2];
      if ((ulong)(*unaff_x20 - lVar7) < in_stack_000000c0) {
        func_0x007a5594();
        lVar7 = unaff_x20[2];
      }
      _memcpy(unaff_x20[1] + lVar7,lVar5,uVar2);
      unaff_x20[2] = lVar7 + uVar2;
      if (uStack00000000000000b0 != 0) {
        func_0x00187bd4(in_stack_000000b8,uStack00000000000000b0,1);
      }
    }
    unaff_x28 = unaff_x28 + 0x48;
    puVar8 = puVar8 + 9;
    unaff_x21 = unaff_x21 + -0x48;
  } while( true );
}

