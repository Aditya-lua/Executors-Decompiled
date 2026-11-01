
void FUN_005b2de8(undefined8 *param_1,long param_2)

{
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000008 = *(undefined8 *)(param_2 + 0x10);
  uStack0000000000000000 = *(undefined8 *)(param_2 + 8);
  param_1[1] = &UNK_008af4e1;
  param_1[2] = 0x28;
  *param_1 = 0x8000000000000000;
  func_0x005ae2b8();
  return;
}

