
void FUN_0042ee34(undefined8 *param_1,long param_2)

{
  undefined8 *in_x9;
  undefined8 *in_x10;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  if (in_x9 == in_x10) {
    *param_1 = 0x8000000000000000;
    return;
  }
  *(undefined8 **)(param_2 + 8) = in_x9 + 6;
  uVar1 = *in_x9;
  uVar3 = in_x9[3];
  uVar2 = in_x9[2];
  param_1[1] = in_x9[1];
  *param_1 = uVar1;
  param_1[3] = uVar3;
  param_1[2] = uVar2;
  uVar1 = in_x9[4];
  param_1[5] = in_x9[5];
  param_1[4] = uVar1;
  return;
}

