
ulong FUN_00472cd0(ulong param_1)

{
  ulong in_x9;
  long in_x10;
  uint in_w11;
  int in_w12;
  ulong uVar1;
  byte *in_x13;
  uint in_w14;
  
  do {
    if (9 < in_w14) {
      uVar1 = 0;
LAB_00472e00:
      return param_1 | uVar1 | in_x9;
    }
    in_x13 = in_x13 + 1;
    in_w11 = in_w11 * in_w12 - in_w14;
    in_x10 = in_x10 + -1;
    if (in_x10 == 0) {
      uVar1 = (ulong)in_w11 << 0x20;
      in_x9 = (ulong)(in_w11 == 0);
      param_1 = 0x400;
      goto LAB_00472e00;
    }
    in_w14 = *in_x13 - 0x30;
  } while( true );
}

