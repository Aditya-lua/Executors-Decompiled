
undefined8 * FUN_00670838(undefined8 *param_1)

{
  *param_1 = &UNK_00a0d8b0;
  param_1[1] = &UNK_00a0da58;
  func_0x00675078(param_1 + 10);
  *param_1 = &UNK_00a0c238;
  param_1[1] = &UNK_00a0c3e0;
  if ((long *)param_1[3] != (long *)0x0) {
    (**(code **)(*(long *)param_1[3] + 8))();
  }
  return param_1;
}

