
void FUN_0078e014(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  if ((param_1[1] != 0) && ((code *)*param_1 != (code *)0x0)) {
    (*(code *)*param_1)();
  }
  param_1[1] = param_2;
  param_1[2] = param_3;
  *param_1 = 0;
  return;
}

