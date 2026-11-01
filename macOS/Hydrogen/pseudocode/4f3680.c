
void FUN_004f3680(undefined8 *param_1)

{
  long in_x9;
  long in_x10;
  undefined8 *in_x11;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  uVar1 = *in_x11;
  uVar3 = in_x11[3];
  uVar2 = in_x11[2];
  param_1[1] = in_x11[1];
  *param_1 = uVar1;
  param_1[3] = uVar3;
  param_1[2] = uVar2;
  param_1[4] = *(undefined8 *)(in_x9 + in_x10 * 8 + 0x168);
  return;
}

