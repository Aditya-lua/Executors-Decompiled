
void FUN_004d9298(undefined8 *param_1,long param_2,ulong param_3,ulong param_4,ulong param_5)

{
  ulong uVar1;
  bool in_ZR;
  bool in_CY;
  
  uVar1 = param_5;
  if (!in_CY || in_ZR) {
    uVar1 = param_4;
  }
  if (param_3 <= uVar1) {
    *param_1 = 2;
    return;
  }
  if (param_4 == param_5) {
    param_1[1] = param_2 + param_5 * 0x20;
    *param_1 = 1;
    return;
  }
  param_1[1] = param_2 + param_4 * 0x20;
  param_1[2] = param_2 + param_5 * 0x20;
  *param_1 = 0;
  return;
}

