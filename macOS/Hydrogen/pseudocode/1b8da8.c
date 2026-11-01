
undefined1  [16] FUN_001b8da8(short *param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  long in_x9;
  long in_x10;
  
  do {
    uVar1 = *(long *)(param_1 + -0xc) + in_x10;
    if (2 < uVar1) {
      uVar1 = 3;
    }
    if ((long)uVar1 < 2) {
      if (uVar1 == 0) goto LAB_001b8db4;
LAB_001b8dec:
      if (*(long *)(param_1 + -0xc) == -0x7ffffffffffffffe) {
        return *(undefined1 (*) [16])(param_1 + -4);
      }
      break;
    }
    if ((uVar1 != 2) && (*param_1 == 0x1e)) goto LAB_001b8dec;
LAB_001b8db4:
    param_1 = param_1 + 0x10;
    in_x9 = in_x9 + -0x20;
  } while (in_x9 != 0);
  auVar2._8_8_ = 0;
  auVar2._0_8_ = param_3;
  return auVar2 << 0x40;
}

