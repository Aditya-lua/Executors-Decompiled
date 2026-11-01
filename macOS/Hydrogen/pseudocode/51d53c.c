
void FUN_0051d53c(undefined8 param_1)

{
  undefined8 uVar1;
  long *unaff_x20;
  undefined1 in_stack_00000000 [16];
  undefined1 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined1 uStack0000000000000020;
  undefined1 in_stack_00000028;
  undefined7 uStack0000000000000029;
  undefined1 uStack0000000000000030;
  undefined7 uStack0000000000000031;
  undefined1 uStack0000000000000038;
  undefined7 uStack0000000000000039;
  undefined8 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  undefined1 uStack0000000000000050;
  undefined1 uStack0000000000000070;
  undefined1 uStack0000000000000078;
  
  uStack0000000000000029 = in_stack_00000000._1_7_;
  uStack0000000000000030 = in_stack_00000000[8];
  uStack0000000000000040 = in_stack_00000018;
  uStack0000000000000038 = in_stack_00000010;
  uStack0000000000000048 = 7;
  uStack0000000000000050 = 6;
  uStack0000000000000070 = 6;
  uStack0000000000000078 = 6;
  uVar1 = func_0x0051b138(param_1,&uStack0000000000000020);
  if (*unaff_x20 != -0x8000000000000000) {
    uStack0000000000000030 = (undefined1)unaff_x20[1];
    uStack0000000000000031 = (undefined7)((ulong)unaff_x20[1] >> 8);
    in_stack_00000028 = (undefined1)*unaff_x20;
    uStack0000000000000029 = (undefined7)((ulong)*unaff_x20 >> 8);
    uStack0000000000000038 = (undefined1)unaff_x20[2];
    uStack0000000000000039 = (undefined7)((ulong)unaff_x20[2] >> 8);
    uStack0000000000000020 = 4;
    func_0x0051b078(uVar1,0xf,&uStack0000000000000020);
  }
  return;
}

