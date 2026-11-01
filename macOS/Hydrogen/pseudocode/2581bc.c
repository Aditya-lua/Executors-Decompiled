
ulong FUN_002581bc(undefined1 param_1 [16])

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  code *pcVar5;
  long lVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined *puVar9;
  undefined8 *unaff_x19;
  long unaff_x20;
  ulong unaff_x24;
  long lVar10;
  long unaff_x28;
  undefined1 uStack0000000000000010;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  long in_stack_000000c8;
  undefined8 in_stack_000000d0;
  ulong in_stack_000000d8;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  ulong in_stack_000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  undefined8 in_stack_00000188;
  
  uVar7 = in_stack_000000f8;
  uVar8 = in_stack_000000d0;
  *(long *)(unaff_x28 + 0x10) = param_1._8_8_;
  *(long *)(unaff_x28 + 8) = param_1._0_8_;
  lVar6 = unaff_x24 - in_stack_000000d8;
  if (unaff_x24 < in_stack_000000d8) {
    puVar9 = &UNK_009ca7d8;
  }
  else {
    unaff_x24 = unaff_x24 * 2;
    lVar10 = unaff_x24 - in_stack_000000f8;
    _memcpy((long)&uStack0000000000000108 + lVar6);
    uVar1 = in_stack_000000f0;
    if (uVar7 <= unaff_x24) {
      _memcpy((long)&uStack0000000000000108 + lVar10,in_stack_000000f0,uVar7);
      uVar4 = in_stack_00000118;
      uVar3 = in_stack_00000110;
      uVar2 = uStack0000000000000108;
      in_stack_000000b0 = in_stack_00000130;
      in_stack_00000068 = *(undefined8 *)(unaff_x28 + 0x60);
      in_stack_00000060 = *(undefined8 *)(unaff_x28 + 0x58);
      in_stack_00000078 = *(undefined8 *)(unaff_x28 + 0x70);
      in_stack_00000070 = *(undefined8 *)(unaff_x28 + 0x68);
      in_stack_00000088 = *(undefined8 *)(unaff_x28 + 0x80);
      in_stack_00000080 = *(undefined8 *)(unaff_x28 + 0x78);
      in_stack_00000098 = *(undefined8 *)(unaff_x28 + 0x90);
      in_stack_00000090 = *(undefined8 *)(unaff_x28 + 0x88);
      in_stack_000000a8 = in_stack_00000128;
      in_stack_000000a0 = in_stack_00000120;
      in_stack_00000048 = *(undefined8 *)(unaff_x28 + 0x40);
      in_stack_00000040 = *(undefined8 *)(unaff_x28 + 0x38);
      in_stack_00000058 = *(undefined8 *)(unaff_x28 + 0x50);
      in_stack_00000050 = *(undefined8 *)(unaff_x28 + 0x48);
      if (in_stack_000000e8 != 0) {
        func_0x00187bd4(uVar1,in_stack_000000e8,1);
      }
      if (in_stack_000000c8 != 0) {
        func_0x00187bd4(uVar8,in_stack_000000c8,1);
      }
      func_0x002c398c();
      if (unaff_x20 != 0) {
        func_0x00187bd4();
      }
      func_0x00276f14(&uStack0000000000000010);
      in_stack_00000158 = in_stack_00000068;
      in_stack_00000150 = in_stack_00000060;
      in_stack_00000168 = in_stack_00000078;
      in_stack_00000160 = in_stack_00000070;
      in_stack_00000178 = in_stack_00000088;
      in_stack_00000170 = in_stack_00000080;
      in_stack_00000188 = in_stack_00000098;
      in_stack_00000180 = in_stack_00000090;
      in_stack_00000138 = in_stack_00000048;
      in_stack_00000130 = in_stack_00000040;
      in_stack_00000148 = in_stack_00000058;
      in_stack_00000140 = in_stack_00000050;
      *(undefined8 *)(unaff_x28 + 0x20) = in_stack_000000a8;
      *(undefined8 *)(unaff_x28 + 0x18) = in_stack_000000a0;
      uStack0000000000000100 = uVar2;
      uStack0000000000000108 = uVar3;
      in_stack_00000128 = in_stack_000000b0;
      in_stack_00000110 = uVar4;
      if (unaff_x24 == 0) {
        lVar6 = 1;
      }
      else {
        lVar6 = func_0x00187bd0(unaff_x24,1);
        if (lVar6 == 0) {
          uVar8 = func_0x007a1f00(1,unaff_x24,&UNK_009ca7c0);
          if (in_stack_000000c8 != 0) {
            func_0x00187bd4(in_stack_000000d0,in_stack_000000c8,1);
          }
          func_0x002c398c();
          if (unaff_x20 != 0) {
            func_0x00187bd4();
          }
          func_0x00276f14(&uStack0000000000000010);
          __Unwind_Resume(uVar8);
          lVar6 = func_0x007a2668();
          return (ulong)*(ushort *)(lVar6 + 8);
        }
      }
      uVar7 = _memcpy(lVar6,&uStack0000000000000100,unaff_x24);
      unaff_x19[2] = lVar6;
      unaff_x19[3] = unaff_x24;
      *unaff_x19 = 0x8000000000000027;
      unaff_x19[1] = unaff_x24;
      return uVar7;
    }
    puVar9 = &UNK_009ca7f0;
    lVar6 = lVar10;
  }
  func_0x007a28bc(lVar6,unaff_x24,puVar9);
                    /* WARNING: Does not return */
  pcVar5 = (code *)SoftwareBreakpoint(1,0x258488);
  (*pcVar5)();
}

