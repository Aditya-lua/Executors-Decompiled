
undefined1  [16] FUN_0051fc3c(long param_1,long param_2,undefined8 param_3,undefined8 *param_4)

{
  long in_x9;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  
  for (; in_x9 != param_1; in_x9 = in_x9 + 0x20) {
    uVar2 = *(undefined8 *)(in_x9 + 0x10);
    uVar1 = *(undefined8 *)(in_x9 + 8);
    param_4[2] = *(undefined8 *)(in_x9 + 0x18);
    param_4[1] = uVar2;
    *param_4 = uVar1;
    param_4 = param_4 + 3;
  }
  *(long *)(param_2 + 8) = in_x9;
  auVar3._8_8_ = param_4;
  auVar3._0_8_ = param_3;
  return auVar3;
}

