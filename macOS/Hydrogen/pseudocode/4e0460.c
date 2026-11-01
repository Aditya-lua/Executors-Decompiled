
void FUN_004e0460(undefined8 *param_1,long param_2,long param_3,undefined8 param_4,
                 undefined8 param_5)

{
  *param_1 = param_4;
  param_1[1] = param_5;
  *(long *)(param_2 + 0x10) = param_3 + 1;
  return;
}

