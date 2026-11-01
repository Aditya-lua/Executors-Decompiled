
undefined1  [16] thunk_FUN_0043ecd0(undefined8 param_1,long *param_2,ulong param_3)

{
  byte bVar1;
  ulong in_x9;
  long in_x10;
  long in_x11;
  undefined1 auVar2 [16];
  
  do {
    if (in_x11 == -1) {
      param_1 = 1;
      *param_2 = 1;
      param_2[1] = 0;
      goto LAB_0043ed04;
    }
    *param_2 = in_x10;
    param_2[1] = in_x11;
    bVar1 = *(byte *)(in_x10 + -1);
    if (((int)in_x9 == 0x3f) && (1 < bVar1)) goto LAB_0043ed04;
    param_3 = ((ulong)bVar1 & 0x7f) << (in_x9 & 0x3f) | param_3;
    in_x9 = (ulong)((int)in_x9 + 7);
    in_x10 = in_x10 + 1;
    in_x11 = in_x11 + -1;
  } while ((char)bVar1 < '\0');
  param_1 = 0;
LAB_0043ed04:
  auVar2._8_8_ = param_3;
  auVar2._0_8_ = param_1;
  return auVar2;
}

