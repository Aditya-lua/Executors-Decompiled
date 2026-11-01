
undefined8 * FUN_006552a4(undefined8 *param_1,long *param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  *param_1 = &UNK_00a0bf68;
  param_1[1] = &UNK_00a0c028;
  uVar1 = (**(code **)(*param_2 + 0xc0))(param_2);
  param_1[2] = uVar1;
  func_0x00675bac(param_1 + 3,param_3);
  func_0x00675bac(param_1 + 7);
  param_1[0xb] = &UNK_00a09a70;
  func_0x00675af8(param_1 + 0xc);
  func_0x00675af8(param_1 + 0x10);
  *(undefined1 *)(param_1 + 0x14) = 1;
  return param_1;
}

