
undefined1  [16] FUN_0044ccb8(int *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int in_w8;
  int in_w9;
  int in_w10;
  int in_w11;
  undefined1 auVar3 [16];
  
  if (in_w10 == in_w9 && in_w11 == in_w8) {
    uVar1 = 1;
    uVar2 = 0x3a;
  }
  else if (*param_1 == in_w9 + 1 && *(int *)((long)param_1 + 3) == in_w8) {
    uVar1 = 1;
    uVar2 = 0x3b;
  }
  else {
    uVar1 = 0;
    uVar2 = 0x7d;
  }
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}

