
undefined8 * FUN_0004a7d8(undefined8 *param_1)

{
  undefined8 uVar1;
  long unaff_x20;
  
  uVar1 = *(undefined8 *)(unaff_x20 + 8);
  *param_1 = &UNK_009b70d8;
  param_1[1] = uVar1;
  func_0x00049128(param_1 + 2,unaff_x20 + 0x10);
  *param_1 = &UNK_009b7518;
  func_0x00049128(param_1 + 0xe,unaff_x20 + 0x70);
  *param_1 = &UNK_009b73d8;
  return param_1;
}

