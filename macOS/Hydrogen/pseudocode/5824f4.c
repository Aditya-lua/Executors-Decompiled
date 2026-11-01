
void FUN_005824f4(undefined8 *param_1,long *param_2,undefined8 *param_3)

{
  long in_x9;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined8 uStack_18;
  
  if (*param_2 == 0) {
    *param_1 = 0;
    param_1[3] = 0;
    return;
  }
  uStack_48 = param_3[1];
  uStack_50 = *param_3;
  uStack_38 = param_3[3];
  uStack_40 = param_3[2];
  uStack_28 = param_3[5];
  uStack_30 = param_3[4];
  uStack_18 = param_3[7];
  uStack_20 = param_3[6];
  func_0x0055f72c(*param_2,*(undefined8 *)(in_x9 + 8),&uStack_50);
  return;
}

