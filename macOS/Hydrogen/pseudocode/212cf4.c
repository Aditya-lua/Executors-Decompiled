
void FUN_00212cf4(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16])

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long unaff_x24;
  long unaff_x27;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  undefined8 uStack0000000000000080;
  undefined8 uStack0000000000000088;
  undefined8 uStack0000000000000090;
  undefined8 uStack0000000000000098;
  undefined8 uStack00000000000000a0;
  undefined8 uStack00000000000000a8;
  undefined8 uStack00000000000000b0;
  undefined8 uStack00000000000000b8;
  undefined8 uStack00000000000000c0;
  undefined8 uStack00000000000000c8;
  undefined8 uStack00000000000000d0;
  undefined8 uStack00000000000000d8;
  undefined8 uStack00000000000000e0;
  undefined8 uStack00000000000000e8;
  undefined8 uStack00000000000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000120;
  undefined8 uStack0000000000000128;
  undefined8 uStack0000000000000130;
  undefined8 uStack0000000000000138;
  undefined8 uStack0000000000000140;
  undefined8 uStack0000000000000148;
  undefined8 uStack0000000000000150;
  undefined8 uStack0000000000000158;
  undefined8 uStack0000000000000160;
  undefined8 uStack0000000000000168;
  undefined8 uStack0000000000000170;
  undefined8 uStack0000000000000178;
  undefined8 uStack0000000000000180;
  undefined8 uStack0000000000000188;
  undefined8 uStack0000000000000190;
  undefined8 uStack0000000000000198;
  undefined8 uStack00000000000001a0;
  undefined8 uStack00000000000001a8;
  undefined8 uStack00000000000001b0;
  undefined8 uStack00000000000001b8;
  undefined8 uStack00000000000001c0;
  undefined8 uStack00000000000001c8;
  undefined8 uStack00000000000001d0;
  
  uStack0000000000000050 = *(undefined8 *)(unaff_x29 + -0x60);
  *(long *)(unaff_x24 + 0x1a0) = param_1._8_8_;
  *(long *)(unaff_x24 + 0x198) = param_1._0_8_;
  *(long *)(unaff_x24 + 0x1b0) = param_2._8_8_;
  *(long *)(unaff_x24 + 0x1a8) = param_2._0_8_;
  *(long *)(unaff_x24 + 0x1c0) = param_3._8_8_;
  *(long *)(unaff_x24 + 0x1b8) = param_3._0_8_;
  *(long *)(unaff_x24 + 0x1d0) = param_4._8_8_;
  *(long *)(unaff_x24 + 0x1c8) = param_4._0_8_;
  uStack0000000000000078 = unaff_x19[1];
  uStack0000000000000070 = *unaff_x19;
  uStack0000000000000088 = unaff_x19[3];
  uStack0000000000000080 = unaff_x19[2];
  uStack0000000000000098 = unaff_x19[5];
  uStack0000000000000090 = unaff_x19[4];
  uStack00000000000000a0 = unaff_x19[6];
  uStack0000000000000148 = unaff_x19[0x1b];
  uStack0000000000000140 = unaff_x19[0x1a];
  uStack0000000000000158 = unaff_x19[0x1d];
  uStack0000000000000150 = unaff_x19[0x1c];
  uStack0000000000000168 = unaff_x19[0x1f];
  uStack0000000000000160 = unaff_x19[0x1e];
  uStack0000000000000178 = unaff_x19[0x21];
  uStack0000000000000170 = unaff_x19[0x20];
  uStack0000000000000188 = unaff_x19[0x23];
  uStack0000000000000180 = unaff_x19[0x22];
  uStack0000000000000198 = unaff_x19[0x25];
  uStack0000000000000190 = unaff_x19[0x24];
  uStack00000000000001a8 = unaff_x19[0x27];
  uStack00000000000001a0 = unaff_x19[0x26];
  uStack00000000000001b8 = unaff_x19[0x29];
  uStack00000000000001b0 = unaff_x19[0x28];
  uStack00000000000001c8 = unaff_x19[0x2b];
  uStack00000000000001c0 = unaff_x19[0x2a];
  uStack00000000000001d0 = unaff_x19[0x2c];
  uStack00000000000000c8 = unaff_x19[0xb];
  uStack00000000000000c0 = unaff_x19[10];
  uStack00000000000000d8 = unaff_x19[0xd];
  uStack00000000000000d0 = unaff_x19[0xc];
  uStack00000000000000e8 = unaff_x19[0xf];
  uStack00000000000000e0 = unaff_x19[0xe];
  uStack00000000000000f8 = unaff_x19[0x11];
  uStack00000000000000f0 = unaff_x19[0x10];
  uStack00000000000000b0 = unaff_x19[8];
  uStack00000000000000a8 = unaff_x19[7];
  uStack00000000000000b8 = unaff_x19[9];
  uStack0000000000000128 = unaff_x19[0x17];
  uStack0000000000000120 = unaff_x19[0x16];
  uStack0000000000000138 = unaff_x19[0x19];
  uStack0000000000000130 = unaff_x19[0x18];
  uStack0000000000000058 = in_stack_00000000;
  uStack0000000000000060 = in_stack_00000008;
  uStack0000000000000068 = in_stack_00000000;
  lVar2 = func_0x00187bd0(0x1d8,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x1d8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x212eb4);
    (*pcVar1)();
  }
  _memcpy(lVar2,&uStack0000000000000040,0x1d8);
  unaff_x21[1] = lVar2;
  unaff_x21[2] = (long)&UNK_009c6868;
  *unaff_x21 = unaff_x27 + 0x22;
  lVar2 = *unaff_x20;
  if (lVar2 + 0x7fffffffffffffffU < 5) {
    func_0x002087e4();
  }
  else {
    if (*unaff_x22 != unaff_x27) {
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

