
undefined8 FUN_006b89b4(undefined8 param_1,undefined8 *param_2)

{
  bool in_ZR;
  bool in_CY;
  undefined8 uVar1;
  
  if (in_CY && !in_ZR) {
    uVar1 = *param_2;
    *param_2 = param_1;
    param_2[1] = uVar1;
    return 1;
  }
  return 1;
}

