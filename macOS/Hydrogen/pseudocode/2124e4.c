
void FUN_002124e4(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  long in_x10;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x24;
  long unaff_x26;
  undefined8 uVar3;
  long in_stack_00000008;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
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
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 uStack00000000000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 uStack0000000000000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 uStack0000000000000138;
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
  undefined8 uStack00000000000001a0;
  undefined8 uStack00000000000001a8;
  undefined8 uStack00000000000001b0;
  undefined8 uStack00000000000001b8;
  
  uVar3 = *(undefined8 *)(unaff_x19 + 0x38);
  *(undefined8 *)(in_x10 + 0x40) = *(undefined8 *)(unaff_x19 + 0x40);
  *(undefined8 *)(in_x10 + 0x38) = uVar3;
  uStack0000000000000138 = *(undefined8 *)(unaff_x19 + 0x48);
  uStack00000000000001a8 = *(undefined8 *)(unaff_x19 + 0xb8);
  uStack00000000000001a0 = *(undefined8 *)(unaff_x19 + 0xb0);
  uStack00000000000001b8 = *(undefined8 *)(unaff_x19 + 200);
  uStack00000000000001b0 = *(undefined8 *)(unaff_x19 + 0xc0);
  uStack0000000000000120 = param_1;
  lVar2 = func_0x00187bd0(0x1b0,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x1b0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x212644);
    (*pcVar1)();
  }
  _memcpy(lVar2,&uStack00000000000000f0,0x1b0);
  in_stack_00000178 = in_stack_000000b8;
  in_stack_00000170 = in_stack_000000b0;
  in_stack_00000188 = in_stack_000000c8;
  in_stack_00000180 = in_stack_000000c0;
  in_stack_00000198 = in_stack_000000d8;
  in_stack_00000190 = in_stack_000000d0;
  uStack00000000000001a8 = in_stack_000000e8;
  uStack00000000000001a0 = in_stack_000000e0;
  uStack0000000000000138 = in_stack_00000078;
  in_stack_00000130 = in_stack_00000070;
  in_stack_00000148 = in_stack_00000088;
  in_stack_00000140 = in_stack_00000080;
  in_stack_00000158 = in_stack_00000098;
  in_stack_00000150 = in_stack_00000090;
  in_stack_00000168 = in_stack_000000a8;
  in_stack_00000160 = in_stack_000000a0;
  in_stack_000000f8 = in_stack_00000038;
  uStack00000000000000f0 = in_stack_00000030;
  in_stack_00000108 = in_stack_00000048;
  in_stack_00000100 = in_stack_00000040;
  in_stack_00000118 = in_stack_00000058;
  in_stack_00000110 = in_stack_00000050;
  in_stack_00000128 = in_stack_00000068;
  uStack0000000000000120 = in_stack_00000060;
  func_0x002128f0(lVar2);
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000018,in_stack_00000008,1);
  }
  if ((in_stack_00000028 | 0x8000000000000000) != 0x8000000000000000) {
    func_0x00187bd4(in_stack_00000020,in_stack_00000028,1);
  }
  lVar2 = *unaff_x20;
  if (lVar2 + 0x7fffffffffffffffU < 5) {
    func_0x002087e4();
  }
  else {
    if (*unaff_x24 != unaff_x26) {
      func_0x00208ff4();
      lVar2 = *unaff_x20;
    }
    if ((lVar2 != -0x8000000000000000) && (lVar2 != 0)) {
      func_0x00187bd4(unaff_x20[1],lVar2,1);
    }
  }
  func_0x00187bd4();
  return;
}

