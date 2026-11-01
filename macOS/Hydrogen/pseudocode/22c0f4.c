
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0022c0f4(ulong param_1)

{
  code *pcVar1;
  undefined8 *unaff_x22;
  long unaff_x29;
  undefined8 uStack0000000000000050;
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
  undefined2 in_stack_00000108;
  undefined8 uStack0000000000000110;
  undefined8 in_stack_00000118;
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
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  
  if (0x40 < param_1) {
    func_0x007a28b0(param_1,0x40,&UNK_009c9ca0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x22c244);
    (*pcVar1)();
  }
  (**(code **)(((undefined8 *)*unaff_x22)[1] + 0x20))(*(undefined8 *)*unaff_x22);
  in_stack_000001a8 = CONCAT71(in_stack_000001a8._1_7_,0xe);
  in_stack_00000118 = _UNK_0081e858;
  uStack0000000000000110 = _UNK_0081e850;
  *(undefined8 *)(unaff_x29 + -0x48) = 0;
  *(undefined8 *)(unaff_x29 + -0x40) = 1;
  *(undefined8 *)(unaff_x29 + -0x38) = 0;
  uStack0000000000000050 = 0x8000000000000000;
  func_0x001bb074(&uStack0000000000000110,unaff_x29 + -0x48,&uStack0000000000000050);
  in_stack_00000058 = *(undefined8 *)(unaff_x29 + -0x40);
  uStack0000000000000050 = *(undefined8 *)(unaff_x29 + -0x48);
  in_stack_000000d0 = in_stack_00000178;
  in_stack_000000c8 = in_stack_00000170;
  in_stack_000000e0 = in_stack_00000188;
  in_stack_000000d8 = in_stack_00000180;
  in_stack_000000f0 = in_stack_00000198;
  in_stack_000000e8 = in_stack_00000190;
  in_stack_00000100 = in_stack_000001a8;
  in_stack_000000f8 = in_stack_000001a0;
  in_stack_00000090 = in_stack_00000138;
  in_stack_00000088 = in_stack_00000130;
  in_stack_000000a0 = in_stack_00000148;
  in_stack_00000098 = in_stack_00000140;
  in_stack_000000b0 = in_stack_00000158;
  in_stack_000000a8 = in_stack_00000150;
  in_stack_000000c0 = in_stack_00000168;
  in_stack_000000b8 = in_stack_00000160;
  in_stack_00000070 = in_stack_00000118;
  in_stack_00000068 = uStack0000000000000110;
  in_stack_00000060 = *(undefined8 *)(unaff_x29 + -0x38);
  in_stack_00000080 = 0xc;
  in_stack_00000108 = 4;
  func_0x001d9854();
  in_stack_00000118 = in_stack_00000058;
  uStack0000000000000110 = uStack0000000000000050;
  func_0x00248ae4();
  return;
}

