
void FUN_004fb2d8(void)

{
  char *pcVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  code *pcVar5;
  undefined *puVar6;
  undefined8 unaff_x19;
  undefined8 *puVar7;
  long *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  long lVar8;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  long in_stack_00000008;
  undefined2 in_stack_00000010;
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
  
  do {
    func_0x007a5594();
    lVar8 = unaff_x20[2];
    do {
      _memcpy(unaff_x20[1] + lVar8,unaff_x25,unaff_x24);
      unaff_x20[2] = lVar8 + unaff_x24;
      lVar8 = unaff_x28;
      if (uStack00000000000000b0 != 0) {
        func_0x00187bd4(in_stack_000000b8,uStack00000000000000b0,1);
      }
      do {
        puVar7 = unaff_x22;
        unaff_x28 = lVar8 + 0x48;
        unaff_x22 = puVar7 + 9;
        unaff_x21 = unaff_x21 + -0x48;
        if (unaff_x21 == 0) {
          if (in_stack_00000088 != 0) {
            func_0x00187bd4(in_stack_00000090,in_stack_00000088,1);
          }
          puVar7 = (undefined8 *)(in_stack_00000008 + 0x20);
          do {
            lVar8 = puVar7[-1];
            if (lVar8 == -0x8000000000000000 || lVar8 == 0) {
              lVar8 = puVar7[-4];
            }
            else {
              func_0x00187bd4(*puVar7,lVar8,1);
              lVar8 = puVar7[-4];
            }
            if (lVar8 != 0) {
              func_0x00187bd4(puVar7[-3],lVar8 << 4,8);
            }
            puVar7 = puVar7 + 9;
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
        pcVar1 = (char *)(lVar8 + 0x88);
        lVar8 = unaff_x28;
      } while (*pcVar1 == '\x01');
      uStack00000000000000a0 = puVar7[0xb];
      in_stack_000000a8 = puVar7[0xc];
      uStack00000000000000b0 = 0;
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
      *(undefined8 *)(unaff_x29 + -0x70) = unaff_x19;
      in_stack_000000b8 = unaff_x23;
      func_0x0046849c(&uStack00000000000000b0,&UNK_009e84b0,unaff_x29 + -0x88);
      if (puVar7[8] != -0x8000000000000000) {
        lVar8 = func_0x00513134(uStack00000000000000a0,in_stack_000000a8);
        if ((ulong)(in_stack_00000020 - lVar8) >> 0x10 != 0) {
          puVar6 = &UNK_009e8668;
          goto code_r0x004fb44c;
        }
        *(undefined **)(unaff_x29 + -0xa8) = &UNK_007fc120;
        *(undefined **)(unaff_x29 + -0xa0) = &DAT_00519924;
        *(undefined8 *)(unaff_x29 + -0x98) = 0;
        *(short *)(unaff_x29 + -0x90) = (short)(in_stack_00000020 - lVar8);
        *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8658;
        *(undefined8 *)(unaff_x29 + -0x80) = 1;
        *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4188;
        *(undefined8 *)(unaff_x29 + -0x60) = 1;
        unaff_x23 = 1;
        *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
        *(undefined8 *)(unaff_x29 + -0x70) = unaff_x19;
        func_0x0046849c(&uStack00000000000000b0,&UNK_009e84b0,unaff_x29 + -0x88);
        uVar2 = *unaff_x22;
        uVar3 = puVar7[10];
        if (uStack00000000000000b0 - in_stack_000000c0 < uVar3) {
          func_0x007a5594(&uStack00000000000000b0,in_stack_000000c0,uVar3,1,1);
        }
        uVar4 = in_stack_000000c0;
        _memcpy(in_stack_000000b8 + in_stack_000000c0,uVar2,uVar3);
        in_stack_000000c0 = uVar4 + uVar3;
      }
      uVar2 = in_stack_00000098;
      func_0x00511674(&uStack00000000000000b0);
      func_0x00511ec8(&uStack00000000000000b0,1,0,in_stack_00000090,uVar2);
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
        pcVar5 = (code *)SoftwareBreakpoint(1,0x4fb4dc);
        (*pcVar5)();
      }
      *(undefined **)(unaff_x29 + -0xa8) = &UNK_007fc120;
      *(undefined **)(unaff_x29 + -0xa0) = &DAT_00519924;
      *(undefined8 *)(unaff_x29 + -0x98) = 0;
      *(undefined2 *)(unaff_x29 + -0x90) = in_stack_00000010;
      *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8680;
      *(undefined8 *)(unaff_x29 + -0x80) = 2;
      *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4188;
      *(long *)(unaff_x29 + -0x60) = unaff_x23;
      *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
      *(undefined8 *)(unaff_x29 + -0x70) = 2;
      unaff_x19 = 2;
      func_0x0046849c();
      lVar8 = unaff_x20[2];
      unaff_x24 = in_stack_000000c0;
      unaff_x25 = in_stack_000000b8;
    } while (in_stack_000000c0 <= (ulong)(*unaff_x20 - lVar8));
  } while( true );
}

