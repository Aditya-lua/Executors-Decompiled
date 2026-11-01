
undefined8 * FUN_0063459c(undefined8 *param_1,undefined8 param_2)

{
  *(undefined4 *)(param_1 + 1) = 0;
  *param_1 = &UNK_00a010d8;
  param_1[2] = &UNK_00a09aa0;
  param_1[3] = 0;
  param_1[4] = 0;
  func_0x00631da4(param_1 + 5);
  *param_1 = &UNK_009fb128;
  param_1[0x1e] = &UNK_009f6678;
  param_1[0x1f] = 0;
  param_1[0x20] = 0;
  param_1[0x21] = 0;
  func_0x005fdd18(param_1 + 0x22);
  func_0x005fdd18(param_1 + 0x28);
  *(undefined2 *)(param_1 + 0x2e) = 0x100;
  func_0x0063408c(param_1,param_2);
  return param_1;
}

