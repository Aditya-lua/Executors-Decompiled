
void FUN_0052f1c8(long *param_1)

{
  long lVar1;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000028;
  undefined1 uStack0000000000000030;
  undefined8 uStack0000000000000038;
  undefined1 *puStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined *puStack0000000000000050;
  undefined8 uStack0000000000000058;
  undefined1 uStack0000000000000060;
  undefined *puStack0000000000000068;
  
  lVar1 = *param_1;
  _uStack0000000000000008 = 0;
  uStack0000000000000010 = 1;
  _uStack0000000000000028 = lVar1 + 0x86;
  _uStack0000000000000020 = &uStack0000000000000028;
  uStack0000000000000018 = 0;
  _uStack0000000000000060 = &uStack0000000000000020;
  puStack0000000000000068 = &DAT_00524310;
  _uStack0000000000000030 = &UNK_009eb118;
  uStack0000000000000038 = 3;
  puStack0000000000000050 = &UNK_008a8500;
  uStack0000000000000058 = 2;
  puStack0000000000000040 = &uStack0000000000000060;
  uStack0000000000000048 = 1;
  func_0x0046849c(&uStack0000000000000008,&UNK_009eb098,&uStack0000000000000030);
                    /* WARNING: Could not recover jumptable at 0x0052f260. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_0052f264 + (ulong)(byte)(&UNK_008a8348)[*(byte *)(lVar1 + 0xdd)] * 4))();
  return;
}

