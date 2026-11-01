
undefined8 * FUN_00653a78(undefined8 *param_1,undefined8 param_2,long param_3,undefined8 param_4)

{
  undefined8 uVar1;
  
  *param_1 = &UNK_00a0c0d0;
  param_1[1] = &UNK_00a0c190;
  uVar1 = __Znwm(0xa8);
  func_0x00653bcc(uVar1,param_2);
  param_1[2] = uVar1;
  if (*(int *)(param_3 + 0x28) == 1) {
    func_0x006072ac(param_1 + 3,param_2,param_3);
  }
  else {
    func_0x005fe0b4(param_1 + 3,param_3);
  }
  func_0x005fe0b4(param_1 + 9,param_4);
  param_1[0xf] = &UNK_00a09a40;
  func_0x005fdd18(param_1 + 0x10);
  func_0x005fdd18(param_1 + 0x16);
  *(undefined1 *)(param_1 + 0x1c) = 1;
  return param_1;
}

