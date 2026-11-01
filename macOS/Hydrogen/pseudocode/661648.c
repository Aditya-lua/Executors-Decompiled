
undefined8 * FUN_00661648(undefined8 *param_1,long *param_2)

{
  undefined8 uVar1;
  long *plVar2;
  
  *param_1 = &UNK_009b9bc8;
  func_0x005edf2c(param_1 + 1,1);
  *param_1 = &UNK_00a09fb0;
  param_1[1] = &UNK_00a0a098;
  param_1[2] = &UNK_00a0a0f0;
  plVar2 = param_1 + 3;
  *plVar2 = (long)&UNK_00a0be48;
  param_1[4] = &UNK_00a03168;
  param_1[5] = &UNK_00a03238;
  func_0x00639208(param_1 + 6);
  *plVar2 = (long)&UNK_00a02f80;
  param_1[4] = &UNK_00a03020;
  param_1[5] = &UNK_00a030f0;
  func_0x00630464(param_1 + 0x44);
  param_1[4] = &UNK_009fb7d0;
  param_1[5] = &UNK_009fb8a0;
  *param_1 = &UNK_00a0bc90;
  param_1[1] = &UNK_00a0bd78;
  param_1[2] = &UNK_00a0bdd0;
  param_1[3] = &UNK_009fb720;
  uVar1 = (**(code **)(*param_2 + 0x30))(param_2);
  (**(code **)(*plVar2 + 0x60))(plVar2,uVar1);
  return param_1;
}

