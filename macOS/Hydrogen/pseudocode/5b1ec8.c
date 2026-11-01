
void FUN_005b1ec8(undefined8 *param_1,long param_2)

{
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  
  uStack0000000000000008 = *(undefined8 *)(param_2 + 0x10);
  uStack0000000000000000 = *(undefined8 *)(param_2 + 8);
  uStack0000000000000018 = *(undefined8 *)(param_2 + 0x20);
  uStack0000000000000010 = *(undefined8 *)(param_2 + 0x18);
  *param_1 = &UNK_008b0274;
  param_1[1] = 0x2a;
  *(undefined1 *)(param_1 + 2) = 0x10;
  func_0x005ae94c();
  return;
}

