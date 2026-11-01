
undefined1  [16] FUN_0044cc9c(int *param_1)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined1 auVar3 [16];
  
  if (in_ZR) {
    if (*param_1 == 0x622e7366 && *(int *)((long)param_1 + 3) == 0x65736162) {
      uVar1 = 1;
      uVar2 = 0x3a;
      goto FUN_0044d44c;
    }
    if (*param_1 == 0x622e7367 && *(int *)((long)param_1 + 3) == 0x65736162) {
      uVar1 = 1;
      uVar2 = 0x3b;
      goto FUN_0044d44c;
    }
  }
  uVar1 = 0;
  uVar2 = 0x7d;
FUN_0044d44c:
  auVar3._8_8_ = uVar2;
  auVar3._0_8_ = uVar1;
  return auVar3;
}

