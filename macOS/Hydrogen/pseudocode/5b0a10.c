
void FUN_005b0a10(undefined8 *param_1,long param_2)

{
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  uStack0000000000000008 = *(undefined8 *)(param_2 + 0x10);
  uStack0000000000000000 = *(undefined8 *)(param_2 + 8);
  uStack0000000000000018 = *(undefined8 *)(param_2 + 0x20);
  uStack0000000000000010 = *(undefined8 *)(param_2 + 0x18);
  param_1[1] = &UNK_008af842;
  param_1[2] = 0x2e;
  *param_1 = 0x8000000000000000;
  func_0x005ae94c();
  return;
}

