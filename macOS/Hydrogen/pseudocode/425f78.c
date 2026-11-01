
undefined1  [16] FUN_00425f78(ulong param_1)

{
  ulong uVar1;
  bool in_ZR;
  ulong in_x9;
  ulong in_x10;
  ulong uVar2;
  ulong uVar3;
  undefined1 auVar4 [16];
  
  if (in_ZR) {
    uVar3 = 2;
    in_x10 = 0;
  }
  else {
    uVar2 = in_x9;
    do {
      uVar3 = param_1 + uVar2;
      if (uVar3 == in_x10) {
        param_1 = 0;
        goto LAB_00425fdc;
      }
      uVar2 = uVar2 - 1;
    } while (*(char *)(uVar3 - 1) != '.');
    uVar3 = uVar2;
    if (uVar2 == 0) {
      uVar3 = in_x9;
    }
    uVar1 = 0;
    if (uVar2 != 0) {
      uVar1 = in_x10 + uVar2 + 1;
    }
    param_1 = in_x10;
    in_x9 = ~uVar2 + in_x9;
    in_x10 = uVar1;
  }
LAB_00425fdc:
  if (param_1 != 0) {
    in_x10 = param_1;
    in_x9 = uVar3;
  }
  auVar4._8_8_ = in_x9;
  auVar4._0_8_ = in_x10;
  return auVar4;
}

