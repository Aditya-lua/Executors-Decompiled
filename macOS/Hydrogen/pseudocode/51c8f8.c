
void FUN_0051c8f8(undefined1 param_1 [16],undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined8 *param_5)

{
  undefined8 uVar1;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long unaff_x23;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 uStack0000000000000009;
  undefined7 uStack000000000000000a;
  undefined1 uStack0000000000000011;
  undefined7 uStack0000000000000012;
  undefined8 uStack0000000000000019;
  undefined1 uStack0000000000000028;
  undefined7 uStack0000000000000029;
  undefined1 uStack0000000000000030;
  undefined7 uStack0000000000000031;
  undefined8 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  undefined7 uStack0000000000000049;
  undefined1 uStack0000000000000050;
  undefined7 uStack0000000000000051;
  undefined1 uStack0000000000000058;
  undefined7 uStack0000000000000059;
  undefined8 in_stack_00000060;
  undefined1 uStack0000000000000068;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000078;
  undefined7 uStack0000000000000079;
  undefined1 uStack0000000000000080;
  undefined7 uStack0000000000000081;
  undefined8 in_stack_00000088;
  
  uVar3 = *(undefined8 *)(unaff_x23 + 0x58);
  uVar2 = *(undefined8 *)(unaff_x23 + 0x50);
  uVar1 = *(undefined8 *)(unaff_x23 + 0x60);
  param_5[0xd] = *(undefined8 *)(unaff_x23 + 0x68);
  param_5[0xc] = uVar1;
  param_5[0xf] = param_1._8_8_;
  param_5[0xe] = param_1._0_8_;
  param_5[0x11] = param_2._8_8_;
  param_5[0x10] = param_2._0_8_;
  param_5[0x13] = param_4._8_8_;
  param_5[0x12] = param_4._0_8_;
  param_5[5] = _uStack0000000000000068;
  param_5[4] = in_stack_00000060;
  param_5[7] = _uStack0000000000000078;
  param_5[6] = _uStack0000000000000070;
  param_5[9] = in_stack_00000088;
  param_5[8] = _uStack0000000000000080;
  param_5[0xb] = uVar3;
  param_5[10] = uVar2;
  param_5[1] = _uStack0000000000000048;
  *param_5 = uStack0000000000000040;
  param_5[3] = _uStack0000000000000058;
  param_5[2] = _uStack0000000000000050;
  uVar1 = func_0x0051ab00();
  uStack0000000000000011 = (undefined1)unaff_x19[1];
  uStack0000000000000012 = (undefined7)((ulong)unaff_x19[1] >> 8);
  uStack0000000000000009 = (undefined1)*unaff_x19;
  uStack000000000000000a = (undefined7)((ulong)*unaff_x19 >> 8);
  uStack0000000000000019 = unaff_x19[2];
  uStack0000000000000030 = (undefined1)unaff_x20[1];
  uStack0000000000000031 = (undefined7)((ulong)unaff_x20[1] >> 8);
  uStack0000000000000028 = (undefined1)*unaff_x20;
  uStack0000000000000029 = (undefined7)((ulong)*unaff_x20 >> 8);
  in_stack_00000088 = unaff_x20[2];
  uStack0000000000000040._0_1_ = 0;
  uStack0000000000000048 = 2;
  uStack0000000000000051 = uStack000000000000000a;
  uStack0000000000000050 = uStack0000000000000009;
  uStack0000000000000068 = 3;
  uStack0000000000000070 = 3;
  uStack0000000000000079 = uStack0000000000000029;
  uStack0000000000000080 = uStack0000000000000030;
  uStack0000000000000078 = uStack0000000000000028;
  uStack0000000000000058 = uStack0000000000000011;
  uStack0000000000000059 = uStack0000000000000012;
  in_stack_00000060 = uStack0000000000000019;
  uStack0000000000000081 = uStack0000000000000031;
  uVar1 = func_0x0051b0b8(uVar1,&uStack0000000000000040);
  if (*unaff_x21 != -0x8000000000000000) {
    uStack0000000000000050 = (undefined1)unaff_x21[1];
    uStack0000000000000051 = (undefined7)((ulong)unaff_x21[1] >> 8);
    uStack0000000000000048 = (undefined1)*unaff_x21;
    uStack0000000000000049 = (undefined7)((ulong)*unaff_x21 >> 8);
    uStack0000000000000058 = (undefined1)unaff_x21[2];
    uStack0000000000000059 = (undefined7)((ulong)unaff_x21[2] >> 8);
    uStack0000000000000040._0_1_ = 4;
    func_0x0051b078(uVar1,0xf,&uStack0000000000000040);
  }
  return;
}

