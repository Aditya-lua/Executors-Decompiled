
undefined1  [16] FUN_00425f9c(long param_1)

{
  ulong uVar1;
  undefined1 in_ZR;
  ulong uVar2;
  ulong in_x9;
  ulong in_x10;
  ulong in_x11;
  ulong in_x12;
  undefined1 auVar3 [16];
  
  do {
    if ((bool)in_ZR) {
      uVar2 = 0;
LAB_00425fdc:
      if (uVar2 != 0) {
        in_x10 = uVar2;
        in_x9 = in_x12;
      }
      auVar3._8_8_ = in_x9;
      auVar3._0_8_ = in_x10;
      return auVar3;
    }
    in_x11 = in_x11 - 1;
    if (*(char *)(in_x12 - 1) == '.') {
      in_x12 = in_x11;
      if (in_x11 == 0) {
        in_x12 = in_x9;
      }
      uVar1 = 0;
      if (in_x11 != 0) {
        uVar1 = in_x10 + in_x11 + 1;
      }
      uVar2 = in_x10;
      in_x9 = ~in_x11 + in_x9;
      in_x10 = uVar1;
      goto LAB_00425fdc;
    }
    in_x12 = param_1 + in_x11;
    in_ZR = in_x12 == in_x10;
  } while( true );
}

