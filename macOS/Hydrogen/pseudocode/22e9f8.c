
void FUN_0022e9f8(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  long in_x9;
  undefined8 *unaff_x19;
  undefined8 *unaff_x21;
  undefined8 uVar3;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
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
  undefined8 uStack00000000000000e8;
  undefined8 uStack00000000000000f0;
  undefined8 uStack00000000000000f8;
  undefined8 uStack0000000000000100;
  undefined8 uStack0000000000000108;
  undefined8 uStack0000000000000110;
  undefined8 uStack0000000000000118;
  undefined8 uStack0000000000000120;
  undefined8 uStack0000000000000128;
  undefined8 uStack0000000000000150;
  undefined8 uStack0000000000000158;
  undefined8 uStack0000000000000160;
  undefined8 uStack0000000000000168;
  undefined8 uStack0000000000000170;
  undefined8 uStack0000000000000178;
  undefined8 uStack0000000000000180;
  undefined8 uStack0000000000000188;
  undefined8 uStack0000000000000190;
  undefined4 uStack0000000000000198;
  undefined1 uStack00000000000001a0;
  undefined1 uStack00000000000001a1;
  
  uStack0000000000000158 = unaff_x19[0x2b];
  uStack0000000000000150 = unaff_x19[0x2a];
  uStack0000000000000160 = unaff_x19[0x2c];
  uStack00000000000000f8 = unaff_x19[0x1f];
  uStack00000000000000f0 = unaff_x19[0x1e];
  uStack0000000000000108 = unaff_x19[0x21];
  uStack0000000000000100 = unaff_x19[0x20];
  uStack0000000000000118 = unaff_x19[0x23];
  uStack0000000000000110 = unaff_x19[0x22];
  uStack0000000000000128 = unaff_x19[0x25];
  uStack0000000000000120 = unaff_x19[0x24];
  uStack0000000000000068 = unaff_x19[0xd];
  uStack0000000000000060 = unaff_x19[0xc];
  uStack0000000000000078 = unaff_x19[0xf];
  uStack0000000000000070 = unaff_x19[0xe];
  uStack0000000000000028 = unaff_x19[5];
  uStack0000000000000020 = unaff_x19[4];
  uStack0000000000000038 = unaff_x19[7];
  uStack0000000000000030 = unaff_x19[6];
  uStack0000000000000048 = unaff_x19[9];
  uStack0000000000000040 = unaff_x19[8];
  uStack0000000000000058 = unaff_x19[0xb];
  uStack0000000000000050 = unaff_x19[10];
  uStack0000000000000008 = unaff_x19[1];
  uStack0000000000000000 = *unaff_x19;
  uStack0000000000000018 = unaff_x19[3];
  uStack0000000000000010 = unaff_x19[2];
  uStack0000000000000170 = unaff_x19[0x2e];
  uStack0000000000000168 = unaff_x19[0x2d];
  uStack0000000000000180 = unaff_x19[0x30];
  uStack0000000000000178 = unaff_x19[0x2f];
  uStack0000000000000188 = unaff_x19[0x31];
  uStack0000000000000190 = unaff_x19[0x32];
  uVar3 = unaff_x19[0x19];
  *(undefined8 *)(in_x9 + 0xd0) = unaff_x19[0x1a];
  *(undefined8 *)(in_x9 + 200) = uVar3;
  uVar3 = unaff_x19[0x1b];
  *(undefined8 *)(in_x9 + 0xe0) = unaff_x19[0x1c];
  *(undefined8 *)(in_x9 + 0xd8) = uVar3;
  uStack00000000000001a0 = *(undefined1 *)(unaff_x19 + 0x34);
  uStack0000000000000088 = unaff_x19[0x11];
  uStack0000000000000080 = unaff_x19[0x10];
  uStack0000000000000098 = unaff_x19[0x13];
  uStack0000000000000090 = unaff_x19[0x12];
  uStack00000000000000a8 = unaff_x19[0x15];
  uStack00000000000000a0 = unaff_x19[0x14];
  uStack00000000000000b8 = unaff_x19[0x17];
  uStack00000000000000b0 = unaff_x19[0x16];
  uStack00000000000000c0 = unaff_x19[0x18];
  uStack0000000000000198 = *(undefined4 *)(unaff_x19 + 0x33);
  uStack00000000000001a1 = *(undefined1 *)((long)unaff_x19 + 0x1a1);
  uStack00000000000000e8 = param_1;
  lVar2 = func_0x00187bd0(0x1a8,8);
  if (lVar2 == 0) {
    func_0x007a1f18(8,0x1a8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x22ec5c);
    (*pcVar1)();
  }
  _memcpy();
  unaff_x21[1] = lVar2;
  unaff_x21[2] = &UNK_009c8718;
  *unaff_x21 = 0x8000000000000027;
  func_0x0022200c();
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

