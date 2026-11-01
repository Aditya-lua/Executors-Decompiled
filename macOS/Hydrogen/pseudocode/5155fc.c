
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005155fc(byte *param_1)

{
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined1 uStack0000000000000048;
  
  uStack0000000000000040 = *(undefined8 *)(&UNK_008a6788 + (ulong)*param_1 * 8);
  uStack0000000000000038 = *(undefined8 *)(&UNK_009e9938 + (ulong)*param_1 * 8);
  uStack0000000000000008 = 0;
  uStack0000000000000010 = 8;
  uStack0000000000000020 = _UNK_007fc118;
  uStack0000000000000018 = _UNK_007fc110;
  uStack0000000000000048 = 0;
  func_0x0046adc0();
  return;
}

