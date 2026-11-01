
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00529e48(undefined8 *param_1)

{
  undefined8 uVar1;
  undefined8 in_x9;
  undefined8 in_x10;
  int in_w11;
  
  *param_1 = 0;
  param_1[1] = 8;
  uVar1 = _UNK_007fc110;
  param_1[3] = _UNK_007fc118;
  param_1[2] = uVar1;
  param_1[6] = in_x10;
  param_1[7] = in_x9;
  *(bool *)(param_1 + 8) = in_w11 != 0x65757274;
  return;
}

