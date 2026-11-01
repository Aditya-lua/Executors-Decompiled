
void FUN_00037270(undefined8 param_1,undefined1 param_2 [16],long param_3)

{
  long lStack0000000000000000;
  long lStack0000000000000008;
  long lStack0000000000000010;
  undefined1 uStack0000000000000018;
  undefined7 uStack0000000000000019;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined1 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  undefined1 uStack0000000000000058;
  undefined1 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  
  lStack0000000000000000 = param_2._0_8_;
  *(undefined1 *)(param_3 + 0x80) = 0;
  *(undefined8 *)(param_3 + 0x88) = 0;
  *(long *)(param_3 + 0x38) = param_2._8_8_;
  *(long *)(param_3 + 0x30) = lStack0000000000000000;
  *(long *)(param_3 + 0x41) = param_2._8_8_;
  *(long *)(param_3 + 0x39) = lStack0000000000000000;
  uStack0000000000000030 = 0;
  uStack0000000000000038 = 0;
  uStack0000000000000040 = 0;
  uStack0000000000000048 = 0;
  uStack0000000000000050 = 0;
  uStack0000000000000058 = 0;
  uStack0000000000000060 = 0;
  uStack0000000000000068 = 0;
  uStack0000000000000018 = param_2[8];
  uStack0000000000000019 = param_2._0_7_;
  uStack0000000000000020 = param_2[7];
  lStack0000000000000010 = lStack0000000000000000;
  func_0x00034500(param_1);
  func_0x0003732c();
  if (lStack0000000000000000 != 0) {
    lStack0000000000000008 = lStack0000000000000000;
    __ZdlPv();
  }
  return;
}

