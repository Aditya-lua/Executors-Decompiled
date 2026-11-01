
ulong FUN_005a897c(long param_1,undefined1 param_2 [16])

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  long unaff_x19;
  undefined8 uVar4;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  long lStack0000000000000058;
  undefined8 uStack0000000000000060;
  ulong uStack0000000000000068;
  undefined8 uStack0000000000000070;
  long lStack0000000000000078;
  
  uVar4 = param_2._8_8_;
  uStack0000000000000060 = param_2._0_8_;
  lStack0000000000000058 = *(long *)(unaff_x19 + 8);
  if (lStack0000000000000058 != 0) {
    uVar4 = *(undefined8 *)(unaff_x19 + 0x18);
    uStack0000000000000060 = *(undefined8 *)(unaff_x19 + 0x10);
  }
  _uStack0000000000000048 = (ulong)(lStack0000000000000058 != 0);
  uStack0000000000000008 = 0;
  uStack0000000000000018 = 0;
  uStack0000000000000028 = 0;
  uStack0000000000000040 = 0;
  uStack0000000000000038 = 0;
  uStack0000000000000050 = 0;
  uStack0000000000000070 = 0;
  *(undefined8 *)(param_1 + 0x40) = uVar4;
  *(undefined8 *)(param_1 + 0x38) = uStack0000000000000060;
  uStack0000000000000068 = _uStack0000000000000048;
  lStack0000000000000078 = lStack0000000000000058;
  while( true ) {
    lVar1 = func_0x005c5a44();
    if (lVar1 == 0) {
      lVar1 = func_0x005c5a44(&uStack0000000000000048);
      return (ulong)-(uint)(lVar1 != 0);
    }
    lVar2 = func_0x005c5a44(&uStack0000000000000048);
    if (lVar2 == 0) break;
    uVar3 = func_0x005c8a14(lVar1,lVar2);
    if ((uVar3 & 0xff) != 0) {
      return uVar3;
    }
  }
  return 1;
}

